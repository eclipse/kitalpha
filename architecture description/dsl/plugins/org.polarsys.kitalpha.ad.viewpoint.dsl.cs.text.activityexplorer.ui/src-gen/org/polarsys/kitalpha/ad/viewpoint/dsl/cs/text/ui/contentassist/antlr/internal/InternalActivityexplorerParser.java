package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ActivityexplorerGrammarAccess;
@SuppressWarnings("all")
public class InternalActivityexplorerParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'activity'", "'explorer'", "'{'", "'}'", "'pages'", "'page'", "'index'", "'description'", "'file'", "'extension'", "'id'", "'label'", "'header'", "'image'", "'on'", "':'", "'off'", "'tab'", "'name'", "'predicated'", "'show'", "'viewer'", "'sections'", "'section'", "'filtering'", "'expanded'", "'activities'", "'icon'", "'extensions'", "'extended'", "'Overview'", "'.'"
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

                if ( (LA4_0==36) ) {
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1013:1: rule__Page__Group__7__Impl : ( ( rule__Page__Group_7__0 )? ) ;
    public final void rule__Page__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1017:1: ( ( ( rule__Page__Group_7__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1018:1: ( ( rule__Page__Group_7__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1018:1: ( ( rule__Page__Group_7__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1019:1: ( rule__Page__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_7()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1020:1: ( rule__Page__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1020:2: rule__Page__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_7__0_in_rule__Page__Group__7__Impl2011);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1030:1: rule__Page__Group__8 : rule__Page__Group__8__Impl rule__Page__Group__9 ;
    public final void rule__Page__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1034:1: ( rule__Page__Group__8__Impl rule__Page__Group__9 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1035:2: rule__Page__Group__8__Impl rule__Page__Group__9
            {
            pushFollow(FOLLOW_rule__Page__Group__8__Impl_in_rule__Page__Group__82042);
            rule__Page__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__9_in_rule__Page__Group__82045);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1042:1: rule__Page__Group__8__Impl : ( 'index' ) ;
    public final void rule__Page__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1046:1: ( ( 'index' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1047:1: ( 'index' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1047:1: ( 'index' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1048:1: 'index'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getIndexKeyword_8()); 
            }
            match(input,19,FOLLOW_19_in_rule__Page__Group__8__Impl2073); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1061:1: rule__Page__Group__9 : rule__Page__Group__9__Impl rule__Page__Group__10 ;
    public final void rule__Page__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1065:1: ( rule__Page__Group__9__Impl rule__Page__Group__10 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1066:2: rule__Page__Group__9__Impl rule__Page__Group__10
            {
            pushFollow(FOLLOW_rule__Page__Group__9__Impl_in_rule__Page__Group__92104);
            rule__Page__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__10_in_rule__Page__Group__92107);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1073:1: rule__Page__Group__9__Impl : ( ( rule__Page__IndexAssignment_9 ) ) ;
    public final void rule__Page__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1077:1: ( ( ( rule__Page__IndexAssignment_9 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1078:1: ( ( rule__Page__IndexAssignment_9 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1078:1: ( ( rule__Page__IndexAssignment_9 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1079:1: ( rule__Page__IndexAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getIndexAssignment_9()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1080:1: ( rule__Page__IndexAssignment_9 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1080:2: rule__Page__IndexAssignment_9
            {
            pushFollow(FOLLOW_rule__Page__IndexAssignment_9_in_rule__Page__Group__9__Impl2134);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1102:1: rule__Page__Group__10__Impl : ( ( rule__Page__OwnedOverviewAssignment_10 )? ) ;
    public final void rule__Page__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1106:1: ( ( ( rule__Page__OwnedOverviewAssignment_10 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1107:1: ( ( rule__Page__OwnedOverviewAssignment_10 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1107:1: ( ( rule__Page__OwnedOverviewAssignment_10 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1108:1: ( rule__Page__OwnedOverviewAssignment_10 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOwnedOverviewAssignment_10()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1109:1: ( rule__Page__OwnedOverviewAssignment_10 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==43) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1109:2: rule__Page__OwnedOverviewAssignment_10
                    {
                    pushFollow(FOLLOW_rule__Page__OwnedOverviewAssignment_10_in_rule__Page__Group__10__Impl2194);
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

            if ( (LA11_0==25) ) {
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

            if ( (LA12_0==30) ) {
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

            if ( (LA14_0==33) ) {
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1235:1: rule__Page__Group__15 : rule__Page__Group__15__Impl rule__Page__Group__16 ;
    public final void rule__Page__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1239:1: ( rule__Page__Group__15__Impl rule__Page__Group__16 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1240:2: rule__Page__Group__15__Impl rule__Page__Group__16
            {
            pushFollow(FOLLOW_rule__Page__Group__15__Impl_in_rule__Page__Group__152469);
            rule__Page__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__16_in_rule__Page__Group__152472);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1247:1: rule__Page__Group__15__Impl : ( ( rule__Page__Group_15__0 )? ) ;
    public final void rule__Page__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1251:1: ( ( ( rule__Page__Group_15__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1252:1: ( ( rule__Page__Group_15__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1252:1: ( ( rule__Page__Group_15__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1253:1: ( rule__Page__Group_15__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_15()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1254:1: ( rule__Page__Group_15__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1254:2: rule__Page__Group_15__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_15__0_in_rule__Page__Group__15__Impl2499);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1264:1: rule__Page__Group__16 : rule__Page__Group__16__Impl ;
    public final void rule__Page__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1268:1: ( rule__Page__Group__16__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1269:2: rule__Page__Group__16__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group__16__Impl_in_rule__Page__Group__162530);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1275:1: rule__Page__Group__16__Impl : ( '}' ) ;
    public final void rule__Page__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1279:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1280:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1280:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1281:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_16()); 
            }
            match(input,16,FOLLOW_16_in_rule__Page__Group__16__Impl2558); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1328:1: rule__Page__Group_4__0 : rule__Page__Group_4__0__Impl rule__Page__Group_4__1 ;
    public final void rule__Page__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1332:1: ( rule__Page__Group_4__0__Impl rule__Page__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1333:2: rule__Page__Group_4__0__Impl rule__Page__Group_4__1
            {
            pushFollow(FOLLOW_rule__Page__Group_4__0__Impl_in_rule__Page__Group_4__02623);
            rule__Page__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_4__1_in_rule__Page__Group_4__02626);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1340:1: rule__Page__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Page__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1344:1: ( ( 'description' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1345:1: ( 'description' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1345:1: ( 'description' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1346:1: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getDescriptionKeyword_4_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Page__Group_4__0__Impl2654); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1359:1: rule__Page__Group_4__1 : rule__Page__Group_4__1__Impl ;
    public final void rule__Page__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1363:1: ( rule__Page__Group_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1364:2: rule__Page__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_4__1__Impl_in_rule__Page__Group_4__12685);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1370:1: rule__Page__Group_4__1__Impl : ( ( rule__Page__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Page__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1374:1: ( ( ( rule__Page__DescriptionAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1375:1: ( ( rule__Page__DescriptionAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1375:1: ( ( rule__Page__DescriptionAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1376:1: ( rule__Page__DescriptionAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getDescriptionAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1377:1: ( rule__Page__DescriptionAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1377:2: rule__Page__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Page__DescriptionAssignment_4_1_in_rule__Page__Group_4__1__Impl2712);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1391:1: rule__Page__Group_5__0 : rule__Page__Group_5__0__Impl rule__Page__Group_5__1 ;
    public final void rule__Page__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1395:1: ( rule__Page__Group_5__0__Impl rule__Page__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1396:2: rule__Page__Group_5__0__Impl rule__Page__Group_5__1
            {
            pushFollow(FOLLOW_rule__Page__Group_5__0__Impl_in_rule__Page__Group_5__02746);
            rule__Page__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_5__1_in_rule__Page__Group_5__02749);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1403:1: rule__Page__Group_5__0__Impl : ( 'file' ) ;
    public final void rule__Page__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1407:1: ( ( 'file' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1408:1: ( 'file' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1408:1: ( 'file' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1409:1: 'file'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getFileKeyword_5_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Page__Group_5__0__Impl2777); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1422:1: rule__Page__Group_5__1 : rule__Page__Group_5__1__Impl rule__Page__Group_5__2 ;
    public final void rule__Page__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1426:1: ( rule__Page__Group_5__1__Impl rule__Page__Group_5__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1427:2: rule__Page__Group_5__1__Impl rule__Page__Group_5__2
            {
            pushFollow(FOLLOW_rule__Page__Group_5__1__Impl_in_rule__Page__Group_5__12808);
            rule__Page__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_5__2_in_rule__Page__Group_5__12811);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1434:1: rule__Page__Group_5__1__Impl : ( 'extension' ) ;
    public final void rule__Page__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1438:1: ( ( 'extension' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1439:1: ( 'extension' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1439:1: ( 'extension' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1440:1: 'extension'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getExtensionKeyword_5_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__Page__Group_5__1__Impl2839); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1453:1: rule__Page__Group_5__2 : rule__Page__Group_5__2__Impl ;
    public final void rule__Page__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1457:1: ( rule__Page__Group_5__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1458:2: rule__Page__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_5__2__Impl_in_rule__Page__Group_5__22870);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1464:1: rule__Page__Group_5__2__Impl : ( ( rule__Page__FileExtensionsAssignment_5_2 ) ) ;
    public final void rule__Page__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1468:1: ( ( ( rule__Page__FileExtensionsAssignment_5_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1469:1: ( ( rule__Page__FileExtensionsAssignment_5_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1469:1: ( ( rule__Page__FileExtensionsAssignment_5_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1470:1: ( rule__Page__FileExtensionsAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getFileExtensionsAssignment_5_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1471:1: ( rule__Page__FileExtensionsAssignment_5_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1471:2: rule__Page__FileExtensionsAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Page__FileExtensionsAssignment_5_2_in_rule__Page__Group_5__2__Impl2897);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1487:1: rule__Page__Group_6__0 : rule__Page__Group_6__0__Impl rule__Page__Group_6__1 ;
    public final void rule__Page__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1491:1: ( rule__Page__Group_6__0__Impl rule__Page__Group_6__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1492:2: rule__Page__Group_6__0__Impl rule__Page__Group_6__1
            {
            pushFollow(FOLLOW_rule__Page__Group_6__0__Impl_in_rule__Page__Group_6__02933);
            rule__Page__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_6__1_in_rule__Page__Group_6__02936);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1499:1: rule__Page__Group_6__0__Impl : ( 'id' ) ;
    public final void rule__Page__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1503:1: ( ( 'id' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1504:1: ( 'id' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1504:1: ( 'id' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1505:1: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getIdKeyword_6_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Page__Group_6__0__Impl2964); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1518:1: rule__Page__Group_6__1 : rule__Page__Group_6__1__Impl ;
    public final void rule__Page__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1522:1: ( rule__Page__Group_6__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1523:2: rule__Page__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_6__1__Impl_in_rule__Page__Group_6__12995);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1529:1: rule__Page__Group_6__1__Impl : ( ( rule__Page__ActivityExplorerItemIDAssignment_6_1 ) ) ;
    public final void rule__Page__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1533:1: ( ( ( rule__Page__ActivityExplorerItemIDAssignment_6_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1534:1: ( ( rule__Page__ActivityExplorerItemIDAssignment_6_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1534:1: ( ( rule__Page__ActivityExplorerItemIDAssignment_6_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1535:1: ( rule__Page__ActivityExplorerItemIDAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getActivityExplorerItemIDAssignment_6_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1536:1: ( rule__Page__ActivityExplorerItemIDAssignment_6_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1536:2: rule__Page__ActivityExplorerItemIDAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Page__ActivityExplorerItemIDAssignment_6_1_in_rule__Page__Group_6__1__Impl3022);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1550:1: rule__Page__Group_7__0 : rule__Page__Group_7__0__Impl rule__Page__Group_7__1 ;
    public final void rule__Page__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1554:1: ( rule__Page__Group_7__0__Impl rule__Page__Group_7__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1555:2: rule__Page__Group_7__0__Impl rule__Page__Group_7__1
            {
            pushFollow(FOLLOW_rule__Page__Group_7__0__Impl_in_rule__Page__Group_7__03056);
            rule__Page__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_7__1_in_rule__Page__Group_7__03059);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1562:1: rule__Page__Group_7__0__Impl : ( 'label' ) ;
    public final void rule__Page__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1566:1: ( ( 'label' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1567:1: ( 'label' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1567:1: ( 'label' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1568:1: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLabelKeyword_7_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Page__Group_7__0__Impl3087); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1581:1: rule__Page__Group_7__1 : rule__Page__Group_7__1__Impl ;
    public final void rule__Page__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1585:1: ( rule__Page__Group_7__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1586:2: rule__Page__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_7__1__Impl_in_rule__Page__Group_7__13118);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1592:1: rule__Page__Group_7__1__Impl : ( ( rule__Page__LabelAssignment_7_1 ) ) ;
    public final void rule__Page__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1596:1: ( ( ( rule__Page__LabelAssignment_7_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1597:1: ( ( rule__Page__LabelAssignment_7_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1597:1: ( ( rule__Page__LabelAssignment_7_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1598:1: ( rule__Page__LabelAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLabelAssignment_7_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1599:1: ( rule__Page__LabelAssignment_7_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1599:2: rule__Page__LabelAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Page__LabelAssignment_7_1_in_rule__Page__Group_7__1__Impl3145);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1613:1: rule__Page__Group_11__0 : rule__Page__Group_11__0__Impl rule__Page__Group_11__1 ;
    public final void rule__Page__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1617:1: ( rule__Page__Group_11__0__Impl rule__Page__Group_11__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1618:2: rule__Page__Group_11__0__Impl rule__Page__Group_11__1
            {
            pushFollow(FOLLOW_rule__Page__Group_11__0__Impl_in_rule__Page__Group_11__03179);
            rule__Page__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_11__1_in_rule__Page__Group_11__03182);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1625:1: rule__Page__Group_11__0__Impl : ( 'header' ) ;
    public final void rule__Page__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1629:1: ( ( 'header' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1630:1: ( 'header' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1630:1: ( 'header' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1631:1: 'header'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getHeaderKeyword_11_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Page__Group_11__0__Impl3210); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1644:1: rule__Page__Group_11__1 : rule__Page__Group_11__1__Impl rule__Page__Group_11__2 ;
    public final void rule__Page__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1648:1: ( rule__Page__Group_11__1__Impl rule__Page__Group_11__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1649:2: rule__Page__Group_11__1__Impl rule__Page__Group_11__2
            {
            pushFollow(FOLLOW_rule__Page__Group_11__1__Impl_in_rule__Page__Group_11__13241);
            rule__Page__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_11__2_in_rule__Page__Group_11__13244);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1656:1: rule__Page__Group_11__1__Impl : ( '{' ) ;
    public final void rule__Page__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1660:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1661:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1661:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1662:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_11_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__Page__Group_11__1__Impl3272); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1675:1: rule__Page__Group_11__2 : rule__Page__Group_11__2__Impl rule__Page__Group_11__3 ;
    public final void rule__Page__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1679:1: ( rule__Page__Group_11__2__Impl rule__Page__Group_11__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1680:2: rule__Page__Group_11__2__Impl rule__Page__Group_11__3
            {
            pushFollow(FOLLOW_rule__Page__Group_11__2__Impl_in_rule__Page__Group_11__23303);
            rule__Page__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_11__3_in_rule__Page__Group_11__23306);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1687:1: rule__Page__Group_11__2__Impl : ( ( rule__Page__Group_11_2__0 )? ) ;
    public final void rule__Page__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1691:1: ( ( ( rule__Page__Group_11_2__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1692:1: ( ( rule__Page__Group_11_2__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1692:1: ( ( rule__Page__Group_11_2__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1693:1: ( rule__Page__Group_11_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_11_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1694:1: ( rule__Page__Group_11_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==27) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1694:2: rule__Page__Group_11_2__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_11_2__0_in_rule__Page__Group_11__2__Impl3333);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1704:1: rule__Page__Group_11__3 : rule__Page__Group_11__3__Impl rule__Page__Group_11__4 ;
    public final void rule__Page__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1708:1: ( rule__Page__Group_11__3__Impl rule__Page__Group_11__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1709:2: rule__Page__Group_11__3__Impl rule__Page__Group_11__4
            {
            pushFollow(FOLLOW_rule__Page__Group_11__3__Impl_in_rule__Page__Group_11__33364);
            rule__Page__Group_11__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_11__4_in_rule__Page__Group_11__33367);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1716:1: rule__Page__Group_11__3__Impl : ( ( rule__Page__Group_11_3__0 )? ) ;
    public final void rule__Page__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1720:1: ( ( ( rule__Page__Group_11_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1721:1: ( ( rule__Page__Group_11_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1721:1: ( ( rule__Page__Group_11_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1722:1: ( rule__Page__Group_11_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_11_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1723:1: ( rule__Page__Group_11_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1723:2: rule__Page__Group_11_3__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_11_3__0_in_rule__Page__Group_11__3__Impl3394);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1733:1: rule__Page__Group_11__4 : rule__Page__Group_11__4__Impl ;
    public final void rule__Page__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1737:1: ( rule__Page__Group_11__4__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1738:2: rule__Page__Group_11__4__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_11__4__Impl_in_rule__Page__Group_11__43425);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1744:1: rule__Page__Group_11__4__Impl : ( '}' ) ;
    public final void rule__Page__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1748:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1749:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1749:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1750:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_11_4()); 
            }
            match(input,16,FOLLOW_16_in_rule__Page__Group_11__4__Impl3453); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1773:1: rule__Page__Group_11_2__0 : rule__Page__Group_11_2__0__Impl rule__Page__Group_11_2__1 ;
    public final void rule__Page__Group_11_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1777:1: ( rule__Page__Group_11_2__0__Impl rule__Page__Group_11_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1778:2: rule__Page__Group_11_2__0__Impl rule__Page__Group_11_2__1
            {
            pushFollow(FOLLOW_rule__Page__Group_11_2__0__Impl_in_rule__Page__Group_11_2__03494);
            rule__Page__Group_11_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_11_2__1_in_rule__Page__Group_11_2__03497);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1785:1: rule__Page__Group_11_2__0__Impl : ( 'image' ) ;
    public final void rule__Page__Group_11_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1789:1: ( ( 'image' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1790:1: ( 'image' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1790:1: ( 'image' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1791:1: 'image'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImageKeyword_11_2_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Page__Group_11_2__0__Impl3525); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImageKeyword_11_2_0()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1804:1: rule__Page__Group_11_2__1 : rule__Page__Group_11_2__1__Impl rule__Page__Group_11_2__2 ;
    public final void rule__Page__Group_11_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1808:1: ( rule__Page__Group_11_2__1__Impl rule__Page__Group_11_2__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1809:2: rule__Page__Group_11_2__1__Impl rule__Page__Group_11_2__2
            {
            pushFollow(FOLLOW_rule__Page__Group_11_2__1__Impl_in_rule__Page__Group_11_2__13556);
            rule__Page__Group_11_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_11_2__2_in_rule__Page__Group_11_2__13559);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1816:1: rule__Page__Group_11_2__1__Impl : ( 'on' ) ;
    public final void rule__Page__Group_11_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1820:1: ( ( 'on' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1821:1: ( 'on' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1821:1: ( 'on' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1822:1: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOnKeyword_11_2_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__Page__Group_11_2__1__Impl3587); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getOnKeyword_11_2_1()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1835:1: rule__Page__Group_11_2__2 : rule__Page__Group_11_2__2__Impl rule__Page__Group_11_2__3 ;
    public final void rule__Page__Group_11_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1839:1: ( rule__Page__Group_11_2__2__Impl rule__Page__Group_11_2__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1840:2: rule__Page__Group_11_2__2__Impl rule__Page__Group_11_2__3
            {
            pushFollow(FOLLOW_rule__Page__Group_11_2__2__Impl_in_rule__Page__Group_11_2__23618);
            rule__Page__Group_11_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_11_2__3_in_rule__Page__Group_11_2__23621);
            rule__Page__Group_11_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1847:1: rule__Page__Group_11_2__2__Impl : ( ':' ) ;
    public final void rule__Page__Group_11_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1851:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1852:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1852:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1853:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getColonKeyword_11_2_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Page__Group_11_2__2__Impl3649); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getColonKeyword_11_2_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Page__Group_11_2__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1866:1: rule__Page__Group_11_2__3 : rule__Page__Group_11_2__3__Impl ;
    public final void rule__Page__Group_11_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1870:1: ( rule__Page__Group_11_2__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1871:2: rule__Page__Group_11_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_11_2__3__Impl_in_rule__Page__Group_11_2__33680);
            rule__Page__Group_11_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11_2__3"


    // $ANTLR start "rule__Page__Group_11_2__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1877:1: rule__Page__Group_11_2__3__Impl : ( ( rule__Page__ImagePathOnAssignment_11_2_3 ) ) ;
    public final void rule__Page__Group_11_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1881:1: ( ( ( rule__Page__ImagePathOnAssignment_11_2_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1882:1: ( ( rule__Page__ImagePathOnAssignment_11_2_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1882:1: ( ( rule__Page__ImagePathOnAssignment_11_2_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1883:1: ( rule__Page__ImagePathOnAssignment_11_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImagePathOnAssignment_11_2_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1884:1: ( rule__Page__ImagePathOnAssignment_11_2_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1884:2: rule__Page__ImagePathOnAssignment_11_2_3
            {
            pushFollow(FOLLOW_rule__Page__ImagePathOnAssignment_11_2_3_in_rule__Page__Group_11_2__3__Impl3707);
            rule__Page__ImagePathOnAssignment_11_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImagePathOnAssignment_11_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11_2__3__Impl"


    // $ANTLR start "rule__Page__Group_11_3__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1902:1: rule__Page__Group_11_3__0 : rule__Page__Group_11_3__0__Impl rule__Page__Group_11_3__1 ;
    public final void rule__Page__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1906:1: ( rule__Page__Group_11_3__0__Impl rule__Page__Group_11_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1907:2: rule__Page__Group_11_3__0__Impl rule__Page__Group_11_3__1
            {
            pushFollow(FOLLOW_rule__Page__Group_11_3__0__Impl_in_rule__Page__Group_11_3__03745);
            rule__Page__Group_11_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_11_3__1_in_rule__Page__Group_11_3__03748);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1914:1: rule__Page__Group_11_3__0__Impl : ( 'image' ) ;
    public final void rule__Page__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1918:1: ( ( 'image' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1919:1: ( 'image' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1919:1: ( 'image' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1920:1: 'image'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImageKeyword_11_3_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Page__Group_11_3__0__Impl3776); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImageKeyword_11_3_0()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1933:1: rule__Page__Group_11_3__1 : rule__Page__Group_11_3__1__Impl rule__Page__Group_11_3__2 ;
    public final void rule__Page__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1937:1: ( rule__Page__Group_11_3__1__Impl rule__Page__Group_11_3__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1938:2: rule__Page__Group_11_3__1__Impl rule__Page__Group_11_3__2
            {
            pushFollow(FOLLOW_rule__Page__Group_11_3__1__Impl_in_rule__Page__Group_11_3__13807);
            rule__Page__Group_11_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_11_3__2_in_rule__Page__Group_11_3__13810);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1945:1: rule__Page__Group_11_3__1__Impl : ( 'off' ) ;
    public final void rule__Page__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1949:1: ( ( 'off' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1950:1: ( 'off' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1950:1: ( 'off' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1951:1: 'off'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOffKeyword_11_3_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__Page__Group_11_3__1__Impl3838); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getOffKeyword_11_3_1()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1964:1: rule__Page__Group_11_3__2 : rule__Page__Group_11_3__2__Impl rule__Page__Group_11_3__3 ;
    public final void rule__Page__Group_11_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1968:1: ( rule__Page__Group_11_3__2__Impl rule__Page__Group_11_3__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1969:2: rule__Page__Group_11_3__2__Impl rule__Page__Group_11_3__3
            {
            pushFollow(FOLLOW_rule__Page__Group_11_3__2__Impl_in_rule__Page__Group_11_3__23869);
            rule__Page__Group_11_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_11_3__3_in_rule__Page__Group_11_3__23872);
            rule__Page__Group_11_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1976:1: rule__Page__Group_11_3__2__Impl : ( ':' ) ;
    public final void rule__Page__Group_11_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1980:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1981:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1981:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1982:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getColonKeyword_11_3_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Page__Group_11_3__2__Impl3900); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getColonKeyword_11_3_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Page__Group_11_3__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1995:1: rule__Page__Group_11_3__3 : rule__Page__Group_11_3__3__Impl ;
    public final void rule__Page__Group_11_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1999:1: ( rule__Page__Group_11_3__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2000:2: rule__Page__Group_11_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_11_3__3__Impl_in_rule__Page__Group_11_3__33931);
            rule__Page__Group_11_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11_3__3"


    // $ANTLR start "rule__Page__Group_11_3__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2006:1: rule__Page__Group_11_3__3__Impl : ( ( rule__Page__ImagePathOffAssignment_11_3_3 ) ) ;
    public final void rule__Page__Group_11_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2010:1: ( ( ( rule__Page__ImagePathOffAssignment_11_3_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2011:1: ( ( rule__Page__ImagePathOffAssignment_11_3_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2011:1: ( ( rule__Page__ImagePathOffAssignment_11_3_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2012:1: ( rule__Page__ImagePathOffAssignment_11_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImagePathOffAssignment_11_3_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2013:1: ( rule__Page__ImagePathOffAssignment_11_3_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2013:2: rule__Page__ImagePathOffAssignment_11_3_3
            {
            pushFollow(FOLLOW_rule__Page__ImagePathOffAssignment_11_3_3_in_rule__Page__Group_11_3__3__Impl3958);
            rule__Page__ImagePathOffAssignment_11_3_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImagePathOffAssignment_11_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11_3__3__Impl"


    // $ANTLR start "rule__Page__Group_12__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2031:1: rule__Page__Group_12__0 : rule__Page__Group_12__0__Impl rule__Page__Group_12__1 ;
    public final void rule__Page__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2035:1: ( rule__Page__Group_12__0__Impl rule__Page__Group_12__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2036:2: rule__Page__Group_12__0__Impl rule__Page__Group_12__1
            {
            pushFollow(FOLLOW_rule__Page__Group_12__0__Impl_in_rule__Page__Group_12__03996);
            rule__Page__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_12__1_in_rule__Page__Group_12__03999);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2043:1: rule__Page__Group_12__0__Impl : ( 'tab' ) ;
    public final void rule__Page__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2047:1: ( ( 'tab' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2048:1: ( 'tab' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2048:1: ( 'tab' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2049:1: 'tab'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTabKeyword_12_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Page__Group_12__0__Impl4027); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getTabKeyword_12_0()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2062:1: rule__Page__Group_12__1 : rule__Page__Group_12__1__Impl rule__Page__Group_12__2 ;
    public final void rule__Page__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2066:1: ( rule__Page__Group_12__1__Impl rule__Page__Group_12__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2067:2: rule__Page__Group_12__1__Impl rule__Page__Group_12__2
            {
            pushFollow(FOLLOW_rule__Page__Group_12__1__Impl_in_rule__Page__Group_12__14058);
            rule__Page__Group_12__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_12__2_in_rule__Page__Group_12__14061);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2074:1: rule__Page__Group_12__1__Impl : ( 'name' ) ;
    public final void rule__Page__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2078:1: ( ( 'name' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2079:1: ( 'name' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2079:1: ( 'name' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2080:1: 'name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getNameKeyword_12_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__Page__Group_12__1__Impl4089); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getNameKeyword_12_1()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2093:1: rule__Page__Group_12__2 : rule__Page__Group_12__2__Impl ;
    public final void rule__Page__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2097:1: ( rule__Page__Group_12__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2098:2: rule__Page__Group_12__2__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_12__2__Impl_in_rule__Page__Group_12__24120);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2104:1: rule__Page__Group_12__2__Impl : ( ( rule__Page__TabNameAssignment_12_2 ) ) ;
    public final void rule__Page__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2108:1: ( ( ( rule__Page__TabNameAssignment_12_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2109:1: ( ( rule__Page__TabNameAssignment_12_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2109:1: ( ( rule__Page__TabNameAssignment_12_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2110:1: ( rule__Page__TabNameAssignment_12_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTabNameAssignment_12_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2111:1: ( rule__Page__TabNameAssignment_12_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2111:2: rule__Page__TabNameAssignment_12_2
            {
            pushFollow(FOLLOW_rule__Page__TabNameAssignment_12_2_in_rule__Page__Group_12__2__Impl4147);
            rule__Page__TabNameAssignment_12_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getTabNameAssignment_12_2()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2127:1: rule__Page__Group_13__0 : rule__Page__Group_13__0__Impl rule__Page__Group_13__1 ;
    public final void rule__Page__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2131:1: ( rule__Page__Group_13__0__Impl rule__Page__Group_13__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2132:2: rule__Page__Group_13__0__Impl rule__Page__Group_13__1
            {
            pushFollow(FOLLOW_rule__Page__Group_13__0__Impl_in_rule__Page__Group_13__04183);
            rule__Page__Group_13__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_13__1_in_rule__Page__Group_13__04186);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2139:1: rule__Page__Group_13__0__Impl : ( 'predicated' ) ;
    public final void rule__Page__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2143:1: ( ( 'predicated' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2144:1: ( 'predicated' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2144:1: ( 'predicated' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2145:1: 'predicated'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPredicatedKeyword_13_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Page__Group_13__0__Impl4214); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2158:1: rule__Page__Group_13__1 : rule__Page__Group_13__1__Impl rule__Page__Group_13__2 ;
    public final void rule__Page__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2162:1: ( rule__Page__Group_13__1__Impl rule__Page__Group_13__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2163:2: rule__Page__Group_13__1__Impl rule__Page__Group_13__2
            {
            pushFollow(FOLLOW_rule__Page__Group_13__1__Impl_in_rule__Page__Group_13__14245);
            rule__Page__Group_13__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_13__2_in_rule__Page__Group_13__14248);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2170:1: rule__Page__Group_13__1__Impl : ( ':' ) ;
    public final void rule__Page__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2174:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2175:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2175:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2176:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getColonKeyword_13_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Page__Group_13__1__Impl4276); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2189:1: rule__Page__Group_13__2 : rule__Page__Group_13__2__Impl ;
    public final void rule__Page__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2193:1: ( rule__Page__Group_13__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2194:2: rule__Page__Group_13__2__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_13__2__Impl_in_rule__Page__Group_13__24307);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2200:1: rule__Page__Group_13__2__Impl : ( ( rule__Page__HasPredicateAssignment_13_2 ) ) ;
    public final void rule__Page__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2204:1: ( ( ( rule__Page__HasPredicateAssignment_13_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2205:1: ( ( rule__Page__HasPredicateAssignment_13_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2205:1: ( ( rule__Page__HasPredicateAssignment_13_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2206:1: ( rule__Page__HasPredicateAssignment_13_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getHasPredicateAssignment_13_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2207:1: ( rule__Page__HasPredicateAssignment_13_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2207:2: rule__Page__HasPredicateAssignment_13_2
            {
            pushFollow(FOLLOW_rule__Page__HasPredicateAssignment_13_2_in_rule__Page__Group_13__2__Impl4334);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2223:1: rule__Page__Group_14__0 : rule__Page__Group_14__0__Impl rule__Page__Group_14__1 ;
    public final void rule__Page__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2227:1: ( rule__Page__Group_14__0__Impl rule__Page__Group_14__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2228:2: rule__Page__Group_14__0__Impl rule__Page__Group_14__1
            {
            pushFollow(FOLLOW_rule__Page__Group_14__0__Impl_in_rule__Page__Group_14__04370);
            rule__Page__Group_14__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_14__1_in_rule__Page__Group_14__04373);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2235:1: rule__Page__Group_14__0__Impl : ( 'show' ) ;
    public final void rule__Page__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2239:1: ( ( 'show' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2240:1: ( 'show' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2240:1: ( 'show' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2241:1: 'show'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getShowKeyword_14_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Page__Group_14__0__Impl4401); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getShowKeyword_14_0()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2254:1: rule__Page__Group_14__1 : rule__Page__Group_14__1__Impl rule__Page__Group_14__2 ;
    public final void rule__Page__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2258:1: ( rule__Page__Group_14__1__Impl rule__Page__Group_14__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2259:2: rule__Page__Group_14__1__Impl rule__Page__Group_14__2
            {
            pushFollow(FOLLOW_rule__Page__Group_14__1__Impl_in_rule__Page__Group_14__14432);
            rule__Page__Group_14__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_14__2_in_rule__Page__Group_14__14435);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2266:1: rule__Page__Group_14__1__Impl : ( 'viewer' ) ;
    public final void rule__Page__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2270:1: ( ( 'viewer' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2271:1: ( 'viewer' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2271:1: ( 'viewer' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2272:1: 'viewer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getViewerKeyword_14_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__Page__Group_14__1__Impl4463); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getViewerKeyword_14_1()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2285:1: rule__Page__Group_14__2 : rule__Page__Group_14__2__Impl rule__Page__Group_14__3 ;
    public final void rule__Page__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2289:1: ( rule__Page__Group_14__2__Impl rule__Page__Group_14__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2290:2: rule__Page__Group_14__2__Impl rule__Page__Group_14__3
            {
            pushFollow(FOLLOW_rule__Page__Group_14__2__Impl_in_rule__Page__Group_14__24494);
            rule__Page__Group_14__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_14__3_in_rule__Page__Group_14__24497);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2297:1: rule__Page__Group_14__2__Impl : ( ':' ) ;
    public final void rule__Page__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2301:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2302:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2302:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2303:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getColonKeyword_14_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Page__Group_14__2__Impl4525); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getColonKeyword_14_2()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2316:1: rule__Page__Group_14__3 : rule__Page__Group_14__3__Impl ;
    public final void rule__Page__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2320:1: ( rule__Page__Group_14__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2321:2: rule__Page__Group_14__3__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_14__3__Impl_in_rule__Page__Group_14__34556);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2327:1: rule__Page__Group_14__3__Impl : ( ( rule__Page__ShowViewerAssignment_14_3 ) ) ;
    public final void rule__Page__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2331:1: ( ( ( rule__Page__ShowViewerAssignment_14_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2332:1: ( ( rule__Page__ShowViewerAssignment_14_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2332:1: ( ( rule__Page__ShowViewerAssignment_14_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2333:1: ( rule__Page__ShowViewerAssignment_14_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getShowViewerAssignment_14_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2334:1: ( rule__Page__ShowViewerAssignment_14_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2334:2: rule__Page__ShowViewerAssignment_14_3
            {
            pushFollow(FOLLOW_rule__Page__ShowViewerAssignment_14_3_in_rule__Page__Group_14__3__Impl4583);
            rule__Page__ShowViewerAssignment_14_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getShowViewerAssignment_14_3()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Page__Group_15__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2352:1: rule__Page__Group_15__0 : rule__Page__Group_15__0__Impl rule__Page__Group_15__1 ;
    public final void rule__Page__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2356:1: ( rule__Page__Group_15__0__Impl rule__Page__Group_15__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2357:2: rule__Page__Group_15__0__Impl rule__Page__Group_15__1
            {
            pushFollow(FOLLOW_rule__Page__Group_15__0__Impl_in_rule__Page__Group_15__04621);
            rule__Page__Group_15__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_15__1_in_rule__Page__Group_15__04624);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2364:1: rule__Page__Group_15__0__Impl : ( 'sections' ) ;
    public final void rule__Page__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2368:1: ( ( 'sections' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2369:1: ( 'sections' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2369:1: ( 'sections' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2370:1: 'sections'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getSectionsKeyword_15_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__Page__Group_15__0__Impl4652); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2383:1: rule__Page__Group_15__1 : rule__Page__Group_15__1__Impl rule__Page__Group_15__2 ;
    public final void rule__Page__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2387:1: ( rule__Page__Group_15__1__Impl rule__Page__Group_15__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2388:2: rule__Page__Group_15__1__Impl rule__Page__Group_15__2
            {
            pushFollow(FOLLOW_rule__Page__Group_15__1__Impl_in_rule__Page__Group_15__14683);
            rule__Page__Group_15__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_15__2_in_rule__Page__Group_15__14686);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2395:1: rule__Page__Group_15__1__Impl : ( '{' ) ;
    public final void rule__Page__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2399:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2400:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2400:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2401:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_15_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__Page__Group_15__1__Impl4714); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2414:1: rule__Page__Group_15__2 : rule__Page__Group_15__2__Impl rule__Page__Group_15__3 ;
    public final void rule__Page__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2418:1: ( rule__Page__Group_15__2__Impl rule__Page__Group_15__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2419:2: rule__Page__Group_15__2__Impl rule__Page__Group_15__3
            {
            pushFollow(FOLLOW_rule__Page__Group_15__2__Impl_in_rule__Page__Group_15__24745);
            rule__Page__Group_15__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_15__3_in_rule__Page__Group_15__24748);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2426:1: rule__Page__Group_15__2__Impl : ( ( rule__Page__OwnedSectionsAssignment_15_2 )* ) ;
    public final void rule__Page__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2430:1: ( ( ( rule__Page__OwnedSectionsAssignment_15_2 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2431:1: ( ( rule__Page__OwnedSectionsAssignment_15_2 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2431:1: ( ( rule__Page__OwnedSectionsAssignment_15_2 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2432:1: ( rule__Page__OwnedSectionsAssignment_15_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOwnedSectionsAssignment_15_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2433:1: ( rule__Page__OwnedSectionsAssignment_15_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==36) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2433:2: rule__Page__OwnedSectionsAssignment_15_2
            	    {
            	    pushFollow(FOLLOW_rule__Page__OwnedSectionsAssignment_15_2_in_rule__Page__Group_15__2__Impl4775);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2443:1: rule__Page__Group_15__3 : rule__Page__Group_15__3__Impl ;
    public final void rule__Page__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2447:1: ( rule__Page__Group_15__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2448:2: rule__Page__Group_15__3__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_15__3__Impl_in_rule__Page__Group_15__34806);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2454:1: rule__Page__Group_15__3__Impl : ( '}' ) ;
    public final void rule__Page__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2458:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2459:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2459:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2460:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_15_3()); 
            }
            match(input,16,FOLLOW_16_in_rule__Page__Group_15__3__Impl4834); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2481:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2485:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2486:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_rule__Section__Group__0__Impl_in_rule__Section__Group__04873);
            rule__Section__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__1_in_rule__Section__Group__04876);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2493:1: rule__Section__Group__0__Impl : ( () ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2497:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2498:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2498:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2499:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getSectionAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2500:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2502:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2512:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2516:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2517:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_rule__Section__Group__1__Impl_in_rule__Section__Group__14934);
            rule__Section__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__2_in_rule__Section__Group__14937);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2524:1: rule__Section__Group__1__Impl : ( 'section' ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2528:1: ( ( 'section' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2529:1: ( 'section' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2529:1: ( 'section' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2530:1: 'section'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getSectionKeyword_1()); 
            }
            match(input,36,FOLLOW_36_in_rule__Section__Group__1__Impl4965); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2543:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2547:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2548:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_rule__Section__Group__2__Impl_in_rule__Section__Group__24996);
            rule__Section__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__3_in_rule__Section__Group__24999);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2555:1: rule__Section__Group__2__Impl : ( ( rule__Section__NameAssignment_2 ) ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2559:1: ( ( ( rule__Section__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2560:1: ( ( rule__Section__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2560:1: ( ( rule__Section__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2561:1: ( rule__Section__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2562:1: ( rule__Section__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2562:2: rule__Section__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Section__NameAssignment_2_in_rule__Section__Group__2__Impl5026);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2572:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2576:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2577:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_rule__Section__Group__3__Impl_in_rule__Section__Group__35056);
            rule__Section__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__4_in_rule__Section__Group__35059);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2584:1: rule__Section__Group__3__Impl : ( '{' ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2588:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2589:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2589:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2590:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__Section__Group__3__Impl5087); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2603:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2607:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2608:2: rule__Section__Group__4__Impl rule__Section__Group__5
            {
            pushFollow(FOLLOW_rule__Section__Group__4__Impl_in_rule__Section__Group__45118);
            rule__Section__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__5_in_rule__Section__Group__45121);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2615:1: rule__Section__Group__4__Impl : ( ( rule__Section__Group_4__0 )? ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2619:1: ( ( ( rule__Section__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2620:1: ( ( rule__Section__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2620:1: ( ( rule__Section__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2621:1: ( rule__Section__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2622:1: ( rule__Section__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2622:2: rule__Section__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Section__Group_4__0_in_rule__Section__Group__4__Impl5148);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2632:1: rule__Section__Group__5 : rule__Section__Group__5__Impl rule__Section__Group__6 ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2636:1: ( rule__Section__Group__5__Impl rule__Section__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2637:2: rule__Section__Group__5__Impl rule__Section__Group__6
            {
            pushFollow(FOLLOW_rule__Section__Group__5__Impl_in_rule__Section__Group__55179);
            rule__Section__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__6_in_rule__Section__Group__55182);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2644:1: rule__Section__Group__5__Impl : ( ( rule__Section__Group_5__0 )? ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2648:1: ( ( ( rule__Section__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2649:1: ( ( rule__Section__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2649:1: ( ( rule__Section__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2650:1: ( rule__Section__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2651:1: ( rule__Section__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2651:2: rule__Section__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Section__Group_5__0_in_rule__Section__Group__5__Impl5209);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2661:1: rule__Section__Group__6 : rule__Section__Group__6__Impl rule__Section__Group__7 ;
    public final void rule__Section__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2665:1: ( rule__Section__Group__6__Impl rule__Section__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2666:2: rule__Section__Group__6__Impl rule__Section__Group__7
            {
            pushFollow(FOLLOW_rule__Section__Group__6__Impl_in_rule__Section__Group__65240);
            rule__Section__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__7_in_rule__Section__Group__65243);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2673:1: rule__Section__Group__6__Impl : ( ( rule__Section__Group_6__0 )? ) ;
    public final void rule__Section__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2677:1: ( ( ( rule__Section__Group_6__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2678:1: ( ( rule__Section__Group_6__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2678:1: ( ( rule__Section__Group_6__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2679:1: ( rule__Section__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup_6()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2680:1: ( rule__Section__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2680:2: rule__Section__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Section__Group_6__0_in_rule__Section__Group__6__Impl5270);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2690:1: rule__Section__Group__7 : rule__Section__Group__7__Impl rule__Section__Group__8 ;
    public final void rule__Section__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2694:1: ( rule__Section__Group__7__Impl rule__Section__Group__8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2695:2: rule__Section__Group__7__Impl rule__Section__Group__8
            {
            pushFollow(FOLLOW_rule__Section__Group__7__Impl_in_rule__Section__Group__75301);
            rule__Section__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__8_in_rule__Section__Group__75304);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2702:1: rule__Section__Group__7__Impl : ( 'index' ) ;
    public final void rule__Section__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2706:1: ( ( 'index' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2707:1: ( 'index' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2707:1: ( 'index' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2708:1: 'index'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getIndexKeyword_7()); 
            }
            match(input,19,FOLLOW_19_in_rule__Section__Group__7__Impl5332); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2721:1: rule__Section__Group__8 : rule__Section__Group__8__Impl rule__Section__Group__9 ;
    public final void rule__Section__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2725:1: ( rule__Section__Group__8__Impl rule__Section__Group__9 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2726:2: rule__Section__Group__8__Impl rule__Section__Group__9
            {
            pushFollow(FOLLOW_rule__Section__Group__8__Impl_in_rule__Section__Group__85363);
            rule__Section__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__9_in_rule__Section__Group__85366);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2733:1: rule__Section__Group__8__Impl : ( ( rule__Section__IndexAssignment_8 ) ) ;
    public final void rule__Section__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2737:1: ( ( ( rule__Section__IndexAssignment_8 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2738:1: ( ( rule__Section__IndexAssignment_8 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2738:1: ( ( rule__Section__IndexAssignment_8 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2739:1: ( rule__Section__IndexAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getIndexAssignment_8()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2740:1: ( rule__Section__IndexAssignment_8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2740:2: rule__Section__IndexAssignment_8
            {
            pushFollow(FOLLOW_rule__Section__IndexAssignment_8_in_rule__Section__Group__8__Impl5393);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2750:1: rule__Section__Group__9 : rule__Section__Group__9__Impl rule__Section__Group__10 ;
    public final void rule__Section__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2754:1: ( rule__Section__Group__9__Impl rule__Section__Group__10 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2755:2: rule__Section__Group__9__Impl rule__Section__Group__10
            {
            pushFollow(FOLLOW_rule__Section__Group__9__Impl_in_rule__Section__Group__95423);
            rule__Section__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__10_in_rule__Section__Group__95426);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2762:1: rule__Section__Group__9__Impl : ( ( rule__Section__Group_9__0 )? ) ;
    public final void rule__Section__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2766:1: ( ( ( rule__Section__Group_9__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2767:1: ( ( rule__Section__Group_9__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2767:1: ( ( rule__Section__Group_9__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2768:1: ( rule__Section__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup_9()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2769:1: ( rule__Section__Group_9__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2769:2: rule__Section__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Section__Group_9__0_in_rule__Section__Group__9__Impl5453);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2779:1: rule__Section__Group__10 : rule__Section__Group__10__Impl rule__Section__Group__11 ;
    public final void rule__Section__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2783:1: ( rule__Section__Group__10__Impl rule__Section__Group__11 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2784:2: rule__Section__Group__10__Impl rule__Section__Group__11
            {
            pushFollow(FOLLOW_rule__Section__Group__10__Impl_in_rule__Section__Group__105484);
            rule__Section__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__11_in_rule__Section__Group__105487);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2791:1: rule__Section__Group__10__Impl : ( ( rule__Section__Group_10__0 )? ) ;
    public final void rule__Section__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2795:1: ( ( ( rule__Section__Group_10__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2796:1: ( ( rule__Section__Group_10__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2796:1: ( ( rule__Section__Group_10__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2797:1: ( rule__Section__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup_10()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2798:1: ( rule__Section__Group_10__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2798:2: rule__Section__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Section__Group_10__0_in_rule__Section__Group__10__Impl5514);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2808:1: rule__Section__Group__11 : rule__Section__Group__11__Impl rule__Section__Group__12 ;
    public final void rule__Section__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2812:1: ( rule__Section__Group__11__Impl rule__Section__Group__12 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2813:2: rule__Section__Group__11__Impl rule__Section__Group__12
            {
            pushFollow(FOLLOW_rule__Section__Group__11__Impl_in_rule__Section__Group__115545);
            rule__Section__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__12_in_rule__Section__Group__115548);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2820:1: rule__Section__Group__11__Impl : ( ( rule__Section__Group_11__0 )? ) ;
    public final void rule__Section__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2824:1: ( ( ( rule__Section__Group_11__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2825:1: ( ( rule__Section__Group_11__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2825:1: ( ( rule__Section__Group_11__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2826:1: ( rule__Section__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup_11()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2827:1: ( rule__Section__Group_11__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2827:2: rule__Section__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__Section__Group_11__0_in_rule__Section__Group__11__Impl5575);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2837:1: rule__Section__Group__12 : rule__Section__Group__12__Impl ;
    public final void rule__Section__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2841:1: ( rule__Section__Group__12__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2842:2: rule__Section__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group__12__Impl_in_rule__Section__Group__125606);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2848:1: rule__Section__Group__12__Impl : ( '}' ) ;
    public final void rule__Section__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2852:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2853:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2853:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2854:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_12()); 
            }
            match(input,16,FOLLOW_16_in_rule__Section__Group__12__Impl5634); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2893:1: rule__Section__Group_4__0 : rule__Section__Group_4__0__Impl rule__Section__Group_4__1 ;
    public final void rule__Section__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2897:1: ( rule__Section__Group_4__0__Impl rule__Section__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2898:2: rule__Section__Group_4__0__Impl rule__Section__Group_4__1
            {
            pushFollow(FOLLOW_rule__Section__Group_4__0__Impl_in_rule__Section__Group_4__05691);
            rule__Section__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_4__1_in_rule__Section__Group_4__05694);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2905:1: rule__Section__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Section__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2909:1: ( ( 'description' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2910:1: ( 'description' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2910:1: ( 'description' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2911:1: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getDescriptionKeyword_4_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Section__Group_4__0__Impl5722); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2924:1: rule__Section__Group_4__1 : rule__Section__Group_4__1__Impl ;
    public final void rule__Section__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2928:1: ( rule__Section__Group_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2929:2: rule__Section__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_4__1__Impl_in_rule__Section__Group_4__15753);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2935:1: rule__Section__Group_4__1__Impl : ( ( rule__Section__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Section__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2939:1: ( ( ( rule__Section__DescriptionAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2940:1: ( ( rule__Section__DescriptionAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2940:1: ( ( rule__Section__DescriptionAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2941:1: ( rule__Section__DescriptionAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getDescriptionAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2942:1: ( rule__Section__DescriptionAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2942:2: rule__Section__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Section__DescriptionAssignment_4_1_in_rule__Section__Group_4__1__Impl5780);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2956:1: rule__Section__Group_5__0 : rule__Section__Group_5__0__Impl rule__Section__Group_5__1 ;
    public final void rule__Section__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2960:1: ( rule__Section__Group_5__0__Impl rule__Section__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2961:2: rule__Section__Group_5__0__Impl rule__Section__Group_5__1
            {
            pushFollow(FOLLOW_rule__Section__Group_5__0__Impl_in_rule__Section__Group_5__05814);
            rule__Section__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_5__1_in_rule__Section__Group_5__05817);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2968:1: rule__Section__Group_5__0__Impl : ( 'id' ) ;
    public final void rule__Section__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2972:1: ( ( 'id' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2973:1: ( 'id' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2973:1: ( 'id' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2974:1: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getIdKeyword_5_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Section__Group_5__0__Impl5845); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2987:1: rule__Section__Group_5__1 : rule__Section__Group_5__1__Impl ;
    public final void rule__Section__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2991:1: ( rule__Section__Group_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2992:2: rule__Section__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_5__1__Impl_in_rule__Section__Group_5__15876);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2998:1: rule__Section__Group_5__1__Impl : ( ( rule__Section__ActivityExplorerItemIDAssignment_5_1 ) ) ;
    public final void rule__Section__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3002:1: ( ( ( rule__Section__ActivityExplorerItemIDAssignment_5_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3003:1: ( ( rule__Section__ActivityExplorerItemIDAssignment_5_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3003:1: ( ( rule__Section__ActivityExplorerItemIDAssignment_5_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3004:1: ( rule__Section__ActivityExplorerItemIDAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getActivityExplorerItemIDAssignment_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3005:1: ( rule__Section__ActivityExplorerItemIDAssignment_5_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3005:2: rule__Section__ActivityExplorerItemIDAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Section__ActivityExplorerItemIDAssignment_5_1_in_rule__Section__Group_5__1__Impl5903);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3019:1: rule__Section__Group_6__0 : rule__Section__Group_6__0__Impl rule__Section__Group_6__1 ;
    public final void rule__Section__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3023:1: ( rule__Section__Group_6__0__Impl rule__Section__Group_6__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3024:2: rule__Section__Group_6__0__Impl rule__Section__Group_6__1
            {
            pushFollow(FOLLOW_rule__Section__Group_6__0__Impl_in_rule__Section__Group_6__05937);
            rule__Section__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_6__1_in_rule__Section__Group_6__05940);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3031:1: rule__Section__Group_6__0__Impl : ( 'label' ) ;
    public final void rule__Section__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3035:1: ( ( 'label' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3036:1: ( 'label' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3036:1: ( 'label' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3037:1: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getLabelKeyword_6_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Section__Group_6__0__Impl5968); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3050:1: rule__Section__Group_6__1 : rule__Section__Group_6__1__Impl ;
    public final void rule__Section__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3054:1: ( rule__Section__Group_6__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3055:2: rule__Section__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_6__1__Impl_in_rule__Section__Group_6__15999);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3061:1: rule__Section__Group_6__1__Impl : ( ( rule__Section__LabelAssignment_6_1 ) ) ;
    public final void rule__Section__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3065:1: ( ( ( rule__Section__LabelAssignment_6_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3066:1: ( ( rule__Section__LabelAssignment_6_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3066:1: ( ( rule__Section__LabelAssignment_6_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3067:1: ( rule__Section__LabelAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getLabelAssignment_6_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3068:1: ( rule__Section__LabelAssignment_6_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3068:2: rule__Section__LabelAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Section__LabelAssignment_6_1_in_rule__Section__Group_6__1__Impl6026);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3082:1: rule__Section__Group_9__0 : rule__Section__Group_9__0__Impl rule__Section__Group_9__1 ;
    public final void rule__Section__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3086:1: ( rule__Section__Group_9__0__Impl rule__Section__Group_9__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3087:2: rule__Section__Group_9__0__Impl rule__Section__Group_9__1
            {
            pushFollow(FOLLOW_rule__Section__Group_9__0__Impl_in_rule__Section__Group_9__06060);
            rule__Section__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_9__1_in_rule__Section__Group_9__06063);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3094:1: rule__Section__Group_9__0__Impl : ( 'filtering' ) ;
    public final void rule__Section__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3098:1: ( ( 'filtering' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3099:1: ( 'filtering' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3099:1: ( 'filtering' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3100:1: 'filtering'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getFilteringKeyword_9_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__Section__Group_9__0__Impl6091); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3113:1: rule__Section__Group_9__1 : rule__Section__Group_9__1__Impl rule__Section__Group_9__2 ;
    public final void rule__Section__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3117:1: ( rule__Section__Group_9__1__Impl rule__Section__Group_9__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3118:2: rule__Section__Group_9__1__Impl rule__Section__Group_9__2
            {
            pushFollow(FOLLOW_rule__Section__Group_9__1__Impl_in_rule__Section__Group_9__16122);
            rule__Section__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_9__2_in_rule__Section__Group_9__16125);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3125:1: rule__Section__Group_9__1__Impl : ( ':' ) ;
    public final void rule__Section__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3129:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3130:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3130:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3131:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getColonKeyword_9_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Section__Group_9__1__Impl6153); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3144:1: rule__Section__Group_9__2 : rule__Section__Group_9__2__Impl ;
    public final void rule__Section__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3148:1: ( rule__Section__Group_9__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3149:2: rule__Section__Group_9__2__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_9__2__Impl_in_rule__Section__Group_9__26184);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3155:1: rule__Section__Group_9__2__Impl : ( ( rule__Section__FilteringAssignment_9_2 ) ) ;
    public final void rule__Section__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3159:1: ( ( ( rule__Section__FilteringAssignment_9_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3160:1: ( ( rule__Section__FilteringAssignment_9_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3160:1: ( ( rule__Section__FilteringAssignment_9_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3161:1: ( rule__Section__FilteringAssignment_9_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getFilteringAssignment_9_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3162:1: ( rule__Section__FilteringAssignment_9_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3162:2: rule__Section__FilteringAssignment_9_2
            {
            pushFollow(FOLLOW_rule__Section__FilteringAssignment_9_2_in_rule__Section__Group_9__2__Impl6211);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3178:1: rule__Section__Group_10__0 : rule__Section__Group_10__0__Impl rule__Section__Group_10__1 ;
    public final void rule__Section__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3182:1: ( rule__Section__Group_10__0__Impl rule__Section__Group_10__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3183:2: rule__Section__Group_10__0__Impl rule__Section__Group_10__1
            {
            pushFollow(FOLLOW_rule__Section__Group_10__0__Impl_in_rule__Section__Group_10__06247);
            rule__Section__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_10__1_in_rule__Section__Group_10__06250);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3190:1: rule__Section__Group_10__0__Impl : ( 'expanded' ) ;
    public final void rule__Section__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3194:1: ( ( 'expanded' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3195:1: ( 'expanded' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3195:1: ( 'expanded' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3196:1: 'expanded'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getExpandedKeyword_10_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Section__Group_10__0__Impl6278); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3209:1: rule__Section__Group_10__1 : rule__Section__Group_10__1__Impl rule__Section__Group_10__2 ;
    public final void rule__Section__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3213:1: ( rule__Section__Group_10__1__Impl rule__Section__Group_10__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3214:2: rule__Section__Group_10__1__Impl rule__Section__Group_10__2
            {
            pushFollow(FOLLOW_rule__Section__Group_10__1__Impl_in_rule__Section__Group_10__16309);
            rule__Section__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_10__2_in_rule__Section__Group_10__16312);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3221:1: rule__Section__Group_10__1__Impl : ( ':' ) ;
    public final void rule__Section__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3225:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3226:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3226:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3227:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getColonKeyword_10_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Section__Group_10__1__Impl6340); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3240:1: rule__Section__Group_10__2 : rule__Section__Group_10__2__Impl ;
    public final void rule__Section__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3244:1: ( rule__Section__Group_10__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3245:2: rule__Section__Group_10__2__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_10__2__Impl_in_rule__Section__Group_10__26371);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3251:1: rule__Section__Group_10__2__Impl : ( ( rule__Section__ExpandedAssignment_10_2 ) ) ;
    public final void rule__Section__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3255:1: ( ( ( rule__Section__ExpandedAssignment_10_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3256:1: ( ( rule__Section__ExpandedAssignment_10_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3256:1: ( ( rule__Section__ExpandedAssignment_10_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3257:1: ( rule__Section__ExpandedAssignment_10_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getExpandedAssignment_10_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3258:1: ( rule__Section__ExpandedAssignment_10_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3258:2: rule__Section__ExpandedAssignment_10_2
            {
            pushFollow(FOLLOW_rule__Section__ExpandedAssignment_10_2_in_rule__Section__Group_10__2__Impl6398);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3274:1: rule__Section__Group_11__0 : rule__Section__Group_11__0__Impl rule__Section__Group_11__1 ;
    public final void rule__Section__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3278:1: ( rule__Section__Group_11__0__Impl rule__Section__Group_11__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3279:2: rule__Section__Group_11__0__Impl rule__Section__Group_11__1
            {
            pushFollow(FOLLOW_rule__Section__Group_11__0__Impl_in_rule__Section__Group_11__06434);
            rule__Section__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_11__1_in_rule__Section__Group_11__06437);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3286:1: rule__Section__Group_11__0__Impl : ( 'activities' ) ;
    public final void rule__Section__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3290:1: ( ( 'activities' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3291:1: ( 'activities' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3291:1: ( 'activities' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3292:1: 'activities'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getActivitiesKeyword_11_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__Section__Group_11__0__Impl6465); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3305:1: rule__Section__Group_11__1 : rule__Section__Group_11__1__Impl rule__Section__Group_11__2 ;
    public final void rule__Section__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3309:1: ( rule__Section__Group_11__1__Impl rule__Section__Group_11__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3310:2: rule__Section__Group_11__1__Impl rule__Section__Group_11__2
            {
            pushFollow(FOLLOW_rule__Section__Group_11__1__Impl_in_rule__Section__Group_11__16496);
            rule__Section__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_11__2_in_rule__Section__Group_11__16499);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3317:1: rule__Section__Group_11__1__Impl : ( '{' ) ;
    public final void rule__Section__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3321:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3322:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3322:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3323:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_11_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__Section__Group_11__1__Impl6527); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3336:1: rule__Section__Group_11__2 : rule__Section__Group_11__2__Impl rule__Section__Group_11__3 ;
    public final void rule__Section__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3340:1: ( rule__Section__Group_11__2__Impl rule__Section__Group_11__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3341:2: rule__Section__Group_11__2__Impl rule__Section__Group_11__3
            {
            pushFollow(FOLLOW_rule__Section__Group_11__2__Impl_in_rule__Section__Group_11__26558);
            rule__Section__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_11__3_in_rule__Section__Group_11__26561);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3348:1: rule__Section__Group_11__2__Impl : ( ( rule__Section__OwnedActivitiesAssignment_11_2 )* ) ;
    public final void rule__Section__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3352:1: ( ( ( rule__Section__OwnedActivitiesAssignment_11_2 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3353:1: ( ( rule__Section__OwnedActivitiesAssignment_11_2 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3353:1: ( ( rule__Section__OwnedActivitiesAssignment_11_2 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3354:1: ( rule__Section__OwnedActivitiesAssignment_11_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getOwnedActivitiesAssignment_11_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3355:1: ( rule__Section__OwnedActivitiesAssignment_11_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==13) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3355:2: rule__Section__OwnedActivitiesAssignment_11_2
            	    {
            	    pushFollow(FOLLOW_rule__Section__OwnedActivitiesAssignment_11_2_in_rule__Section__Group_11__2__Impl6588);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3365:1: rule__Section__Group_11__3 : rule__Section__Group_11__3__Impl ;
    public final void rule__Section__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3369:1: ( rule__Section__Group_11__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3370:2: rule__Section__Group_11__3__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_11__3__Impl_in_rule__Section__Group_11__36619);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3376:1: rule__Section__Group_11__3__Impl : ( '}' ) ;
    public final void rule__Section__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3380:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3381:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3381:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3382:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_11_3()); 
            }
            match(input,16,FOLLOW_16_in_rule__Section__Group_11__3__Impl6647); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3403:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3407:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3408:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__06686);
            rule__Activity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__06689);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3415:1: rule__Activity__Group__0__Impl : ( () ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3419:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3420:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3420:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3421:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getActivityAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3422:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3424:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3434:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3438:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3439:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__16747);
            rule__Activity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__16750);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3446:1: rule__Activity__Group__1__Impl : ( 'activity' ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3450:1: ( ( 'activity' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3451:1: ( 'activity' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3451:1: ( 'activity' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3452:1: 'activity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getActivityKeyword_1()); 
            }
            match(input,13,FOLLOW_13_in_rule__Activity__Group__1__Impl6778); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3465:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3469:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3470:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__26809);
            rule__Activity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__26812);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3477:1: rule__Activity__Group__2__Impl : ( ( rule__Activity__NameAssignment_2 ) ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3481:1: ( ( ( rule__Activity__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3482:1: ( ( rule__Activity__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3482:1: ( ( rule__Activity__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3483:1: ( rule__Activity__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3484:1: ( rule__Activity__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3484:2: rule__Activity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Activity__NameAssignment_2_in_rule__Activity__Group__2__Impl6839);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3494:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3498:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3499:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__36869);
            rule__Activity__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__36872);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3506:1: rule__Activity__Group__3__Impl : ( '{' ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3510:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3511:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3511:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3512:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__Activity__Group__3__Impl6900); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3525:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3529:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3530:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__46931);
            rule__Activity__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__46934);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3537:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__Group_4__0 )? ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3541:1: ( ( ( rule__Activity__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3542:1: ( ( rule__Activity__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3542:1: ( ( rule__Activity__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3543:1: ( rule__Activity__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3544:1: ( rule__Activity__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3544:2: rule__Activity__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl6961);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3554:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3558:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3559:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__56992);
            rule__Activity__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__56995);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3566:1: rule__Activity__Group__5__Impl : ( ( rule__Activity__Group_5__0 )? ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3570:1: ( ( ( rule__Activity__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3571:1: ( ( rule__Activity__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3571:1: ( ( rule__Activity__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3572:1: ( rule__Activity__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3573:1: ( rule__Activity__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3573:2: rule__Activity__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl7022);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3583:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl rule__Activity__Group__7 ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3587:1: ( rule__Activity__Group__6__Impl rule__Activity__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3588:2: rule__Activity__Group__6__Impl rule__Activity__Group__7
            {
            pushFollow(FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__67053);
            rule__Activity__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__67056);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3595:1: rule__Activity__Group__6__Impl : ( ( rule__Activity__Group_6__0 )? ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3599:1: ( ( ( rule__Activity__Group_6__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3600:1: ( ( rule__Activity__Group_6__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3600:1: ( ( rule__Activity__Group_6__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3601:1: ( rule__Activity__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup_6()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3602:1: ( rule__Activity__Group_6__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==24) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3602:2: rule__Activity__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_6__0_in_rule__Activity__Group__6__Impl7083);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3612:1: rule__Activity__Group__7 : rule__Activity__Group__7__Impl rule__Activity__Group__8 ;
    public final void rule__Activity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3616:1: ( rule__Activity__Group__7__Impl rule__Activity__Group__8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3617:2: rule__Activity__Group__7__Impl rule__Activity__Group__8
            {
            pushFollow(FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__77114);
            rule__Activity__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__77117);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3624:1: rule__Activity__Group__7__Impl : ( 'index' ) ;
    public final void rule__Activity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3628:1: ( ( 'index' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3629:1: ( 'index' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3629:1: ( 'index' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3630:1: 'index'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getIndexKeyword_7()); 
            }
            match(input,19,FOLLOW_19_in_rule__Activity__Group__7__Impl7145); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3643:1: rule__Activity__Group__8 : rule__Activity__Group__8__Impl rule__Activity__Group__9 ;
    public final void rule__Activity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3647:1: ( rule__Activity__Group__8__Impl rule__Activity__Group__9 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3648:2: rule__Activity__Group__8__Impl rule__Activity__Group__9
            {
            pushFollow(FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__87176);
            rule__Activity__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__87179);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3655:1: rule__Activity__Group__8__Impl : ( ( rule__Activity__IndexAssignment_8 ) ) ;
    public final void rule__Activity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3659:1: ( ( ( rule__Activity__IndexAssignment_8 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3660:1: ( ( rule__Activity__IndexAssignment_8 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3660:1: ( ( rule__Activity__IndexAssignment_8 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3661:1: ( rule__Activity__IndexAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getIndexAssignment_8()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3662:1: ( rule__Activity__IndexAssignment_8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3662:2: rule__Activity__IndexAssignment_8
            {
            pushFollow(FOLLOW_rule__Activity__IndexAssignment_8_in_rule__Activity__Group__8__Impl7206);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3672:1: rule__Activity__Group__9 : rule__Activity__Group__9__Impl rule__Activity__Group__10 ;
    public final void rule__Activity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3676:1: ( rule__Activity__Group__9__Impl rule__Activity__Group__10 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3677:2: rule__Activity__Group__9__Impl rule__Activity__Group__10
            {
            pushFollow(FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__97236);
            rule__Activity__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__97239);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3684:1: rule__Activity__Group__9__Impl : ( ( rule__Activity__Group_9__0 )? ) ;
    public final void rule__Activity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3688:1: ( ( ( rule__Activity__Group_9__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3689:1: ( ( rule__Activity__Group_9__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3689:1: ( ( rule__Activity__Group_9__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3690:1: ( rule__Activity__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup_9()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3691:1: ( rule__Activity__Group_9__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3691:2: rule__Activity__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_9__0_in_rule__Activity__Group__9__Impl7266);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3701:1: rule__Activity__Group__10 : rule__Activity__Group__10__Impl rule__Activity__Group__11 ;
    public final void rule__Activity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3705:1: ( rule__Activity__Group__10__Impl rule__Activity__Group__11 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3706:2: rule__Activity__Group__10__Impl rule__Activity__Group__11
            {
            pushFollow(FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__107297);
            rule__Activity__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__11_in_rule__Activity__Group__107300);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3713:1: rule__Activity__Group__10__Impl : ( ( rule__Activity__Group_10__0 )? ) ;
    public final void rule__Activity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3717:1: ( ( ( rule__Activity__Group_10__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3718:1: ( ( rule__Activity__Group_10__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3718:1: ( ( rule__Activity__Group_10__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3719:1: ( rule__Activity__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup_10()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3720:1: ( rule__Activity__Group_10__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3720:2: rule__Activity__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_10__0_in_rule__Activity__Group__10__Impl7327);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3730:1: rule__Activity__Group__11 : rule__Activity__Group__11__Impl ;
    public final void rule__Activity__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3734:1: ( rule__Activity__Group__11__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3735:2: rule__Activity__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group__11__Impl_in_rule__Activity__Group__117358);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3741:1: rule__Activity__Group__11__Impl : ( '}' ) ;
    public final void rule__Activity__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3745:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3746:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3746:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3747:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_11()); 
            }
            match(input,16,FOLLOW_16_in_rule__Activity__Group__11__Impl7386); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3784:1: rule__Activity__Group_4__0 : rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 ;
    public final void rule__Activity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3788:1: ( rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3789:2: rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__07441);
            rule__Activity__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__07444);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3796:1: rule__Activity__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Activity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3800:1: ( ( 'description' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3801:1: ( 'description' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3801:1: ( 'description' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3802:1: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getDescriptionKeyword_4_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Activity__Group_4__0__Impl7472); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3815:1: rule__Activity__Group_4__1 : rule__Activity__Group_4__1__Impl ;
    public final void rule__Activity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3819:1: ( rule__Activity__Group_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3820:2: rule__Activity__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__17503);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3826:1: rule__Activity__Group_4__1__Impl : ( ( rule__Activity__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Activity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3830:1: ( ( ( rule__Activity__DescriptionAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3831:1: ( ( rule__Activity__DescriptionAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3831:1: ( ( rule__Activity__DescriptionAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3832:1: ( rule__Activity__DescriptionAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getDescriptionAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3833:1: ( rule__Activity__DescriptionAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3833:2: rule__Activity__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Activity__DescriptionAssignment_4_1_in_rule__Activity__Group_4__1__Impl7530);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3847:1: rule__Activity__Group_5__0 : rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 ;
    public final void rule__Activity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3851:1: ( rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3852:2: rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__07564);
            rule__Activity__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__07567);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3859:1: rule__Activity__Group_5__0__Impl : ( 'id' ) ;
    public final void rule__Activity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3863:1: ( ( 'id' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3864:1: ( 'id' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3864:1: ( 'id' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3865:1: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getIdKeyword_5_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Activity__Group_5__0__Impl7595); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3878:1: rule__Activity__Group_5__1 : rule__Activity__Group_5__1__Impl ;
    public final void rule__Activity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3882:1: ( rule__Activity__Group_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3883:2: rule__Activity__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__17626);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3889:1: rule__Activity__Group_5__1__Impl : ( ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 ) ) ;
    public final void rule__Activity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3893:1: ( ( ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3894:1: ( ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3894:1: ( ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3895:1: ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getActivityExplorerItemIDAssignment_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3896:1: ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3896:2: rule__Activity__ActivityExplorerItemIDAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Activity__ActivityExplorerItemIDAssignment_5_1_in_rule__Activity__Group_5__1__Impl7653);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3910:1: rule__Activity__Group_6__0 : rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1 ;
    public final void rule__Activity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3914:1: ( rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3915:2: rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6__0__Impl_in_rule__Activity__Group_6__07687);
            rule__Activity__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_6__1_in_rule__Activity__Group_6__07690);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3922:1: rule__Activity__Group_6__0__Impl : ( 'label' ) ;
    public final void rule__Activity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3926:1: ( ( 'label' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3927:1: ( 'label' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3927:1: ( 'label' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3928:1: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getLabelKeyword_6_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Activity__Group_6__0__Impl7718); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3941:1: rule__Activity__Group_6__1 : rule__Activity__Group_6__1__Impl ;
    public final void rule__Activity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3945:1: ( rule__Activity__Group_6__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3946:2: rule__Activity__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6__1__Impl_in_rule__Activity__Group_6__17749);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3952:1: rule__Activity__Group_6__1__Impl : ( ( rule__Activity__LabelAssignment_6_1 ) ) ;
    public final void rule__Activity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3956:1: ( ( ( rule__Activity__LabelAssignment_6_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3957:1: ( ( rule__Activity__LabelAssignment_6_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3957:1: ( ( rule__Activity__LabelAssignment_6_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3958:1: ( rule__Activity__LabelAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getLabelAssignment_6_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3959:1: ( rule__Activity__LabelAssignment_6_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3959:2: rule__Activity__LabelAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Activity__LabelAssignment_6_1_in_rule__Activity__Group_6__1__Impl7776);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3973:1: rule__Activity__Group_9__0 : rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1 ;
    public final void rule__Activity__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3977:1: ( rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3978:2: rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__0__Impl_in_rule__Activity__Group_9__07810);
            rule__Activity__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_9__1_in_rule__Activity__Group_9__07813);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3985:1: rule__Activity__Group_9__0__Impl : ( 'predicated' ) ;
    public final void rule__Activity__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3989:1: ( ( 'predicated' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3990:1: ( 'predicated' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3990:1: ( 'predicated' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3991:1: 'predicated'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getPredicatedKeyword_9_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Activity__Group_9__0__Impl7841); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4004:1: rule__Activity__Group_9__1 : rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2 ;
    public final void rule__Activity__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4008:1: ( rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4009:2: rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__1__Impl_in_rule__Activity__Group_9__17872);
            rule__Activity__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_9__2_in_rule__Activity__Group_9__17875);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4016:1: rule__Activity__Group_9__1__Impl : ( ':' ) ;
    public final void rule__Activity__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4020:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4021:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4021:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4022:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getColonKeyword_9_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Activity__Group_9__1__Impl7903); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4035:1: rule__Activity__Group_9__2 : rule__Activity__Group_9__2__Impl ;
    public final void rule__Activity__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4039:1: ( rule__Activity__Group_9__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4040:2: rule__Activity__Group_9__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__2__Impl_in_rule__Activity__Group_9__27934);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4046:1: rule__Activity__Group_9__2__Impl : ( ( rule__Activity__HasPredicateAssignment_9_2 ) ) ;
    public final void rule__Activity__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4050:1: ( ( ( rule__Activity__HasPredicateAssignment_9_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4051:1: ( ( rule__Activity__HasPredicateAssignment_9_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4051:1: ( ( rule__Activity__HasPredicateAssignment_9_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4052:1: ( rule__Activity__HasPredicateAssignment_9_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getHasPredicateAssignment_9_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4053:1: ( rule__Activity__HasPredicateAssignment_9_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4053:2: rule__Activity__HasPredicateAssignment_9_2
            {
            pushFollow(FOLLOW_rule__Activity__HasPredicateAssignment_9_2_in_rule__Activity__Group_9__2__Impl7961);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4069:1: rule__Activity__Group_10__0 : rule__Activity__Group_10__0__Impl rule__Activity__Group_10__1 ;
    public final void rule__Activity__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4073:1: ( rule__Activity__Group_10__0__Impl rule__Activity__Group_10__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4074:2: rule__Activity__Group_10__0__Impl rule__Activity__Group_10__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_10__0__Impl_in_rule__Activity__Group_10__07997);
            rule__Activity__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_10__1_in_rule__Activity__Group_10__08000);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4081:1: rule__Activity__Group_10__0__Impl : ( 'icon' ) ;
    public final void rule__Activity__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4085:1: ( ( 'icon' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4086:1: ( 'icon' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4086:1: ( 'icon' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4087:1: 'icon'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getIconKeyword_10_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__Activity__Group_10__0__Impl8028); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4100:1: rule__Activity__Group_10__1 : rule__Activity__Group_10__1__Impl rule__Activity__Group_10__2 ;
    public final void rule__Activity__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4104:1: ( rule__Activity__Group_10__1__Impl rule__Activity__Group_10__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4105:2: rule__Activity__Group_10__1__Impl rule__Activity__Group_10__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_10__1__Impl_in_rule__Activity__Group_10__18059);
            rule__Activity__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_10__2_in_rule__Activity__Group_10__18062);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4112:1: rule__Activity__Group_10__1__Impl : ( ':' ) ;
    public final void rule__Activity__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4116:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4117:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4117:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4118:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getColonKeyword_10_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Activity__Group_10__1__Impl8090); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4131:1: rule__Activity__Group_10__2 : rule__Activity__Group_10__2__Impl ;
    public final void rule__Activity__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4135:1: ( rule__Activity__Group_10__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4136:2: rule__Activity__Group_10__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_10__2__Impl_in_rule__Activity__Group_10__28121);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4142:1: rule__Activity__Group_10__2__Impl : ( ( rule__Activity__ImagePathOffAssignment_10_2 ) ) ;
    public final void rule__Activity__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4146:1: ( ( ( rule__Activity__ImagePathOffAssignment_10_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4147:1: ( ( rule__Activity__ImagePathOffAssignment_10_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4147:1: ( ( rule__Activity__ImagePathOffAssignment_10_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4148:1: ( rule__Activity__ImagePathOffAssignment_10_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getImagePathOffAssignment_10_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4149:1: ( rule__Activity__ImagePathOffAssignment_10_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4149:2: rule__Activity__ImagePathOffAssignment_10_2
            {
            pushFollow(FOLLOW_rule__Activity__ImagePathOffAssignment_10_2_in_rule__Activity__Group_10__2__Impl8148);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4165:1: rule__PageExtension__Group__0 : rule__PageExtension__Group__0__Impl rule__PageExtension__Group__1 ;
    public final void rule__PageExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4169:1: ( rule__PageExtension__Group__0__Impl rule__PageExtension__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4170:2: rule__PageExtension__Group__0__Impl rule__PageExtension__Group__1
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__0__Impl_in_rule__PageExtension__Group__08184);
            rule__PageExtension__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__1_in_rule__PageExtension__Group__08187);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4177:1: rule__PageExtension__Group__0__Impl : ( () ) ;
    public final void rule__PageExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4181:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4182:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4182:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4183:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getPageExtensionAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4184:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4186:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4196:1: rule__PageExtension__Group__1 : rule__PageExtension__Group__1__Impl rule__PageExtension__Group__2 ;
    public final void rule__PageExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4200:1: ( rule__PageExtension__Group__1__Impl rule__PageExtension__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4201:2: rule__PageExtension__Group__1__Impl rule__PageExtension__Group__2
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__1__Impl_in_rule__PageExtension__Group__18245);
            rule__PageExtension__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__2_in_rule__PageExtension__Group__18248);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4208:1: rule__PageExtension__Group__1__Impl : ( 'page' ) ;
    public final void rule__PageExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4212:1: ( ( 'page' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4213:1: ( 'page' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4213:1: ( 'page' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4214:1: 'page'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getPageKeyword_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__PageExtension__Group__1__Impl8276); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4227:1: rule__PageExtension__Group__2 : rule__PageExtension__Group__2__Impl rule__PageExtension__Group__3 ;
    public final void rule__PageExtension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4231:1: ( rule__PageExtension__Group__2__Impl rule__PageExtension__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4232:2: rule__PageExtension__Group__2__Impl rule__PageExtension__Group__3
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__2__Impl_in_rule__PageExtension__Group__28307);
            rule__PageExtension__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__3_in_rule__PageExtension__Group__28310);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4239:1: rule__PageExtension__Group__2__Impl : ( 'extensions' ) ;
    public final void rule__PageExtension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4243:1: ( ( 'extensions' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4244:1: ( 'extensions' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4244:1: ( 'extensions' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4245:1: 'extensions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getExtensionsKeyword_2()); 
            }
            match(input,41,FOLLOW_41_in_rule__PageExtension__Group__2__Impl8338); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4258:1: rule__PageExtension__Group__3 : rule__PageExtension__Group__3__Impl rule__PageExtension__Group__4 ;
    public final void rule__PageExtension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4262:1: ( rule__PageExtension__Group__3__Impl rule__PageExtension__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4263:2: rule__PageExtension__Group__3__Impl rule__PageExtension__Group__4
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__3__Impl_in_rule__PageExtension__Group__38369);
            rule__PageExtension__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__4_in_rule__PageExtension__Group__38372);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4270:1: rule__PageExtension__Group__3__Impl : ( '{' ) ;
    public final void rule__PageExtension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4274:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4275:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4275:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4276:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__PageExtension__Group__3__Impl8400); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4289:1: rule__PageExtension__Group__4 : rule__PageExtension__Group__4__Impl rule__PageExtension__Group__5 ;
    public final void rule__PageExtension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4293:1: ( rule__PageExtension__Group__4__Impl rule__PageExtension__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4294:2: rule__PageExtension__Group__4__Impl rule__PageExtension__Group__5
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__4__Impl_in_rule__PageExtension__Group__48431);
            rule__PageExtension__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__5_in_rule__PageExtension__Group__48434);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4301:1: rule__PageExtension__Group__4__Impl : ( 'extended' ) ;
    public final void rule__PageExtension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4305:1: ( ( 'extended' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4306:1: ( 'extended' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4306:1: ( 'extended' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4307:1: 'extended'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getExtendedKeyword_4()); 
            }
            match(input,42,FOLLOW_42_in_rule__PageExtension__Group__4__Impl8462); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4320:1: rule__PageExtension__Group__5 : rule__PageExtension__Group__5__Impl rule__PageExtension__Group__6 ;
    public final void rule__PageExtension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4324:1: ( rule__PageExtension__Group__5__Impl rule__PageExtension__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4325:2: rule__PageExtension__Group__5__Impl rule__PageExtension__Group__6
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__5__Impl_in_rule__PageExtension__Group__58493);
            rule__PageExtension__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__6_in_rule__PageExtension__Group__58496);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4332:1: rule__PageExtension__Group__5__Impl : ( 'page' ) ;
    public final void rule__PageExtension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4336:1: ( ( 'page' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4337:1: ( 'page' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4337:1: ( 'page' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4338:1: 'page'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getPageKeyword_5()); 
            }
            match(input,18,FOLLOW_18_in_rule__PageExtension__Group__5__Impl8524); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4351:1: rule__PageExtension__Group__6 : rule__PageExtension__Group__6__Impl rule__PageExtension__Group__7 ;
    public final void rule__PageExtension__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4355:1: ( rule__PageExtension__Group__6__Impl rule__PageExtension__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4356:2: rule__PageExtension__Group__6__Impl rule__PageExtension__Group__7
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__6__Impl_in_rule__PageExtension__Group__68555);
            rule__PageExtension__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__7_in_rule__PageExtension__Group__68558);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4363:1: rule__PageExtension__Group__6__Impl : ( ( rule__PageExtension__ExtendedPageIDAssignment_6 ) ) ;
    public final void rule__PageExtension__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4367:1: ( ( ( rule__PageExtension__ExtendedPageIDAssignment_6 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4368:1: ( ( rule__PageExtension__ExtendedPageIDAssignment_6 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4368:1: ( ( rule__PageExtension__ExtendedPageIDAssignment_6 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4369:1: ( rule__PageExtension__ExtendedPageIDAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getExtendedPageIDAssignment_6()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4370:1: ( rule__PageExtension__ExtendedPageIDAssignment_6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4370:2: rule__PageExtension__ExtendedPageIDAssignment_6
            {
            pushFollow(FOLLOW_rule__PageExtension__ExtendedPageIDAssignment_6_in_rule__PageExtension__Group__6__Impl8585);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4380:1: rule__PageExtension__Group__7 : rule__PageExtension__Group__7__Impl rule__PageExtension__Group__8 ;
    public final void rule__PageExtension__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4384:1: ( rule__PageExtension__Group__7__Impl rule__PageExtension__Group__8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4385:2: rule__PageExtension__Group__7__Impl rule__PageExtension__Group__8
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__7__Impl_in_rule__PageExtension__Group__78615);
            rule__PageExtension__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__8_in_rule__PageExtension__Group__78618);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4392:1: rule__PageExtension__Group__7__Impl : ( ( rule__PageExtension__OwnedSectionsAssignment_7 )* ) ;
    public final void rule__PageExtension__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4396:1: ( ( ( rule__PageExtension__OwnedSectionsAssignment_7 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4397:1: ( ( rule__PageExtension__OwnedSectionsAssignment_7 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4397:1: ( ( rule__PageExtension__OwnedSectionsAssignment_7 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4398:1: ( rule__PageExtension__OwnedSectionsAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getOwnedSectionsAssignment_7()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4399:1: ( rule__PageExtension__OwnedSectionsAssignment_7 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==36) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4399:2: rule__PageExtension__OwnedSectionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__PageExtension__OwnedSectionsAssignment_7_in_rule__PageExtension__Group__7__Impl8645);
            	    rule__PageExtension__OwnedSectionsAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4409:1: rule__PageExtension__Group__8 : rule__PageExtension__Group__8__Impl ;
    public final void rule__PageExtension__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4413:1: ( rule__PageExtension__Group__8__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4414:2: rule__PageExtension__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__8__Impl_in_rule__PageExtension__Group__88676);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4420:1: rule__PageExtension__Group__8__Impl : ( '}' ) ;
    public final void rule__PageExtension__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4424:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4425:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4425:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4426:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,16,FOLLOW_16_in_rule__PageExtension__Group__8__Impl8704); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4457:1: rule__SectionExtension__Group__0 : rule__SectionExtension__Group__0__Impl rule__SectionExtension__Group__1 ;
    public final void rule__SectionExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4461:1: ( rule__SectionExtension__Group__0__Impl rule__SectionExtension__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4462:2: rule__SectionExtension__Group__0__Impl rule__SectionExtension__Group__1
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__0__Impl_in_rule__SectionExtension__Group__08753);
            rule__SectionExtension__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__1_in_rule__SectionExtension__Group__08756);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4469:1: rule__SectionExtension__Group__0__Impl : ( () ) ;
    public final void rule__SectionExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4473:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4474:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4474:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4475:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getSectionExtensionAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4476:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4478:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4488:1: rule__SectionExtension__Group__1 : rule__SectionExtension__Group__1__Impl rule__SectionExtension__Group__2 ;
    public final void rule__SectionExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4492:1: ( rule__SectionExtension__Group__1__Impl rule__SectionExtension__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4493:2: rule__SectionExtension__Group__1__Impl rule__SectionExtension__Group__2
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__1__Impl_in_rule__SectionExtension__Group__18814);
            rule__SectionExtension__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__2_in_rule__SectionExtension__Group__18817);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4500:1: rule__SectionExtension__Group__1__Impl : ( 'section' ) ;
    public final void rule__SectionExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4504:1: ( ( 'section' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4505:1: ( 'section' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4505:1: ( 'section' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4506:1: 'section'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getSectionKeyword_1()); 
            }
            match(input,36,FOLLOW_36_in_rule__SectionExtension__Group__1__Impl8845); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4519:1: rule__SectionExtension__Group__2 : rule__SectionExtension__Group__2__Impl rule__SectionExtension__Group__3 ;
    public final void rule__SectionExtension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4523:1: ( rule__SectionExtension__Group__2__Impl rule__SectionExtension__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4524:2: rule__SectionExtension__Group__2__Impl rule__SectionExtension__Group__3
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__2__Impl_in_rule__SectionExtension__Group__28876);
            rule__SectionExtension__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__3_in_rule__SectionExtension__Group__28879);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4531:1: rule__SectionExtension__Group__2__Impl : ( 'extensions' ) ;
    public final void rule__SectionExtension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4535:1: ( ( 'extensions' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4536:1: ( 'extensions' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4536:1: ( 'extensions' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4537:1: 'extensions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getExtensionsKeyword_2()); 
            }
            match(input,41,FOLLOW_41_in_rule__SectionExtension__Group__2__Impl8907); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4550:1: rule__SectionExtension__Group__3 : rule__SectionExtension__Group__3__Impl rule__SectionExtension__Group__4 ;
    public final void rule__SectionExtension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4554:1: ( rule__SectionExtension__Group__3__Impl rule__SectionExtension__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4555:2: rule__SectionExtension__Group__3__Impl rule__SectionExtension__Group__4
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__3__Impl_in_rule__SectionExtension__Group__38938);
            rule__SectionExtension__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__4_in_rule__SectionExtension__Group__38941);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4562:1: rule__SectionExtension__Group__3__Impl : ( '{' ) ;
    public final void rule__SectionExtension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4566:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4567:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4567:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4568:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__SectionExtension__Group__3__Impl8969); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4581:1: rule__SectionExtension__Group__4 : rule__SectionExtension__Group__4__Impl rule__SectionExtension__Group__5 ;
    public final void rule__SectionExtension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4585:1: ( rule__SectionExtension__Group__4__Impl rule__SectionExtension__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4586:2: rule__SectionExtension__Group__4__Impl rule__SectionExtension__Group__5
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__4__Impl_in_rule__SectionExtension__Group__49000);
            rule__SectionExtension__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__5_in_rule__SectionExtension__Group__49003);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4593:1: rule__SectionExtension__Group__4__Impl : ( 'extended' ) ;
    public final void rule__SectionExtension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4597:1: ( ( 'extended' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4598:1: ( 'extended' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4598:1: ( 'extended' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4599:1: 'extended'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getExtendedKeyword_4()); 
            }
            match(input,42,FOLLOW_42_in_rule__SectionExtension__Group__4__Impl9031); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4612:1: rule__SectionExtension__Group__5 : rule__SectionExtension__Group__5__Impl rule__SectionExtension__Group__6 ;
    public final void rule__SectionExtension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4616:1: ( rule__SectionExtension__Group__5__Impl rule__SectionExtension__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4617:2: rule__SectionExtension__Group__5__Impl rule__SectionExtension__Group__6
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__5__Impl_in_rule__SectionExtension__Group__59062);
            rule__SectionExtension__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__6_in_rule__SectionExtension__Group__59065);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4624:1: rule__SectionExtension__Group__5__Impl : ( 'section' ) ;
    public final void rule__SectionExtension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4628:1: ( ( 'section' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4629:1: ( 'section' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4629:1: ( 'section' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4630:1: 'section'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getSectionKeyword_5()); 
            }
            match(input,36,FOLLOW_36_in_rule__SectionExtension__Group__5__Impl9093); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4643:1: rule__SectionExtension__Group__6 : rule__SectionExtension__Group__6__Impl rule__SectionExtension__Group__7 ;
    public final void rule__SectionExtension__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4647:1: ( rule__SectionExtension__Group__6__Impl rule__SectionExtension__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4648:2: rule__SectionExtension__Group__6__Impl rule__SectionExtension__Group__7
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__6__Impl_in_rule__SectionExtension__Group__69124);
            rule__SectionExtension__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__7_in_rule__SectionExtension__Group__69127);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4655:1: rule__SectionExtension__Group__6__Impl : ( ( rule__SectionExtension__ExtendedSectionIDAssignment_6 ) ) ;
    public final void rule__SectionExtension__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4659:1: ( ( ( rule__SectionExtension__ExtendedSectionIDAssignment_6 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4660:1: ( ( rule__SectionExtension__ExtendedSectionIDAssignment_6 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4660:1: ( ( rule__SectionExtension__ExtendedSectionIDAssignment_6 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4661:1: ( rule__SectionExtension__ExtendedSectionIDAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getExtendedSectionIDAssignment_6()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4662:1: ( rule__SectionExtension__ExtendedSectionIDAssignment_6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4662:2: rule__SectionExtension__ExtendedSectionIDAssignment_6
            {
            pushFollow(FOLLOW_rule__SectionExtension__ExtendedSectionIDAssignment_6_in_rule__SectionExtension__Group__6__Impl9154);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4672:1: rule__SectionExtension__Group__7 : rule__SectionExtension__Group__7__Impl rule__SectionExtension__Group__8 ;
    public final void rule__SectionExtension__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4676:1: ( rule__SectionExtension__Group__7__Impl rule__SectionExtension__Group__8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4677:2: rule__SectionExtension__Group__7__Impl rule__SectionExtension__Group__8
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__7__Impl_in_rule__SectionExtension__Group__79184);
            rule__SectionExtension__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__8_in_rule__SectionExtension__Group__79187);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4684:1: rule__SectionExtension__Group__7__Impl : ( ( rule__SectionExtension__OwnedActivitiesAssignment_7 )* ) ;
    public final void rule__SectionExtension__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4688:1: ( ( ( rule__SectionExtension__OwnedActivitiesAssignment_7 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4689:1: ( ( rule__SectionExtension__OwnedActivitiesAssignment_7 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4689:1: ( ( rule__SectionExtension__OwnedActivitiesAssignment_7 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4690:1: ( rule__SectionExtension__OwnedActivitiesAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getOwnedActivitiesAssignment_7()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4691:1: ( rule__SectionExtension__OwnedActivitiesAssignment_7 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==13) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4691:2: rule__SectionExtension__OwnedActivitiesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__SectionExtension__OwnedActivitiesAssignment_7_in_rule__SectionExtension__Group__7__Impl9214);
            	    rule__SectionExtension__OwnedActivitiesAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4701:1: rule__SectionExtension__Group__8 : rule__SectionExtension__Group__8__Impl ;
    public final void rule__SectionExtension__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4705:1: ( rule__SectionExtension__Group__8__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4706:2: rule__SectionExtension__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__8__Impl_in_rule__SectionExtension__Group__89245);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4712:1: rule__SectionExtension__Group__8__Impl : ( '}' ) ;
    public final void rule__SectionExtension__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4716:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4717:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4717:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4718:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,16,FOLLOW_16_in_rule__SectionExtension__Group__8__Impl9273); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4749:1: rule__Overview__Group__0 : rule__Overview__Group__0__Impl rule__Overview__Group__1 ;
    public final void rule__Overview__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4753:1: ( rule__Overview__Group__0__Impl rule__Overview__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4754:2: rule__Overview__Group__0__Impl rule__Overview__Group__1
            {
            pushFollow(FOLLOW_rule__Overview__Group__0__Impl_in_rule__Overview__Group__09322);
            rule__Overview__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__1_in_rule__Overview__Group__09325);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4761:1: rule__Overview__Group__0__Impl : ( () ) ;
    public final void rule__Overview__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4765:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4766:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4766:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4767:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getOverviewAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4768:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4770:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4780:1: rule__Overview__Group__1 : rule__Overview__Group__1__Impl rule__Overview__Group__2 ;
    public final void rule__Overview__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4784:1: ( rule__Overview__Group__1__Impl rule__Overview__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4785:2: rule__Overview__Group__1__Impl rule__Overview__Group__2
            {
            pushFollow(FOLLOW_rule__Overview__Group__1__Impl_in_rule__Overview__Group__19383);
            rule__Overview__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__2_in_rule__Overview__Group__19386);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4792:1: rule__Overview__Group__1__Impl : ( 'Overview' ) ;
    public final void rule__Overview__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4796:1: ( ( 'Overview' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4797:1: ( 'Overview' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4797:1: ( 'Overview' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4798:1: 'Overview'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getOverviewKeyword_1()); 
            }
            match(input,43,FOLLOW_43_in_rule__Overview__Group__1__Impl9414); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4811:1: rule__Overview__Group__2 : rule__Overview__Group__2__Impl rule__Overview__Group__3 ;
    public final void rule__Overview__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4815:1: ( rule__Overview__Group__2__Impl rule__Overview__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4816:2: rule__Overview__Group__2__Impl rule__Overview__Group__3
            {
            pushFollow(FOLLOW_rule__Overview__Group__2__Impl_in_rule__Overview__Group__29445);
            rule__Overview__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__3_in_rule__Overview__Group__29448);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4823:1: rule__Overview__Group__2__Impl : ( '{' ) ;
    public final void rule__Overview__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4827:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4828:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4828:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4829:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,15,FOLLOW_15_in_rule__Overview__Group__2__Impl9476); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4842:1: rule__Overview__Group__3 : rule__Overview__Group__3__Impl rule__Overview__Group__4 ;
    public final void rule__Overview__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4846:1: ( rule__Overview__Group__3__Impl rule__Overview__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4847:2: rule__Overview__Group__3__Impl rule__Overview__Group__4
            {
            pushFollow(FOLLOW_rule__Overview__Group__3__Impl_in_rule__Overview__Group__39507);
            rule__Overview__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__4_in_rule__Overview__Group__39510);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4854:1: rule__Overview__Group__3__Impl : ( ( rule__Overview__Group_3__0 )? ) ;
    public final void rule__Overview__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4858:1: ( ( ( rule__Overview__Group_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4859:1: ( ( rule__Overview__Group_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4859:1: ( ( rule__Overview__Group_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4860:1: ( rule__Overview__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4861:1: ( rule__Overview__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==20) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4861:2: rule__Overview__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Overview__Group_3__0_in_rule__Overview__Group__3__Impl9537);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4871:1: rule__Overview__Group__4 : rule__Overview__Group__4__Impl rule__Overview__Group__5 ;
    public final void rule__Overview__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4875:1: ( rule__Overview__Group__4__Impl rule__Overview__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4876:2: rule__Overview__Group__4__Impl rule__Overview__Group__5
            {
            pushFollow(FOLLOW_rule__Overview__Group__4__Impl_in_rule__Overview__Group__49568);
            rule__Overview__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__5_in_rule__Overview__Group__49571);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4883:1: rule__Overview__Group__4__Impl : ( ( rule__Overview__Group_4__0 )? ) ;
    public final void rule__Overview__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4887:1: ( ( ( rule__Overview__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4888:1: ( ( rule__Overview__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4888:1: ( ( rule__Overview__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4889:1: ( rule__Overview__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4890:1: ( rule__Overview__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==26) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==27) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4890:2: rule__Overview__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Overview__Group_4__0_in_rule__Overview__Group__4__Impl9598);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4900:1: rule__Overview__Group__5 : rule__Overview__Group__5__Impl rule__Overview__Group__6 ;
    public final void rule__Overview__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4904:1: ( rule__Overview__Group__5__Impl rule__Overview__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4905:2: rule__Overview__Group__5__Impl rule__Overview__Group__6
            {
            pushFollow(FOLLOW_rule__Overview__Group__5__Impl_in_rule__Overview__Group__59629);
            rule__Overview__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__6_in_rule__Overview__Group__59632);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4912:1: rule__Overview__Group__5__Impl : ( ( rule__Overview__Group_5__0 )? ) ;
    public final void rule__Overview__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4916:1: ( ( ( rule__Overview__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4917:1: ( ( rule__Overview__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4917:1: ( ( rule__Overview__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4918:1: ( rule__Overview__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4919:1: ( rule__Overview__Group_5__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==26) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4919:2: rule__Overview__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Overview__Group_5__0_in_rule__Overview__Group__5__Impl9659);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4929:1: rule__Overview__Group__6 : rule__Overview__Group__6__Impl ;
    public final void rule__Overview__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4933:1: ( rule__Overview__Group__6__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4934:2: rule__Overview__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Overview__Group__6__Impl_in_rule__Overview__Group__69690);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4940:1: rule__Overview__Group__6__Impl : ( '}' ) ;
    public final void rule__Overview__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4944:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4945:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4945:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4946:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,16,FOLLOW_16_in_rule__Overview__Group__6__Impl9718); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4973:1: rule__Overview__Group_3__0 : rule__Overview__Group_3__0__Impl rule__Overview__Group_3__1 ;
    public final void rule__Overview__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4977:1: ( rule__Overview__Group_3__0__Impl rule__Overview__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4978:2: rule__Overview__Group_3__0__Impl rule__Overview__Group_3__1
            {
            pushFollow(FOLLOW_rule__Overview__Group_3__0__Impl_in_rule__Overview__Group_3__09763);
            rule__Overview__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_3__1_in_rule__Overview__Group_3__09766);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4985:1: rule__Overview__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Overview__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4989:1: ( ( 'description' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4990:1: ( 'description' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4990:1: ( 'description' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4991:1: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getDescriptionKeyword_3_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Overview__Group_3__0__Impl9794); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5004:1: rule__Overview__Group_3__1 : rule__Overview__Group_3__1__Impl ;
    public final void rule__Overview__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5008:1: ( rule__Overview__Group_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5009:2: rule__Overview__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Overview__Group_3__1__Impl_in_rule__Overview__Group_3__19825);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5015:1: rule__Overview__Group_3__1__Impl : ( ( rule__Overview__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Overview__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5019:1: ( ( ( rule__Overview__DescriptionAssignment_3_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5020:1: ( ( rule__Overview__DescriptionAssignment_3_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5020:1: ( ( rule__Overview__DescriptionAssignment_3_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5021:1: ( rule__Overview__DescriptionAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getDescriptionAssignment_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5022:1: ( rule__Overview__DescriptionAssignment_3_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5022:2: rule__Overview__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Overview__DescriptionAssignment_3_1_in_rule__Overview__Group_3__1__Impl9852);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5036:1: rule__Overview__Group_4__0 : rule__Overview__Group_4__0__Impl rule__Overview__Group_4__1 ;
    public final void rule__Overview__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5040:1: ( rule__Overview__Group_4__0__Impl rule__Overview__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5041:2: rule__Overview__Group_4__0__Impl rule__Overview__Group_4__1
            {
            pushFollow(FOLLOW_rule__Overview__Group_4__0__Impl_in_rule__Overview__Group_4__09886);
            rule__Overview__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_4__1_in_rule__Overview__Group_4__09889);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5048:1: rule__Overview__Group_4__0__Impl : ( 'image' ) ;
    public final void rule__Overview__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5052:1: ( ( 'image' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5053:1: ( 'image' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5053:1: ( 'image' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5054:1: 'image'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImageKeyword_4_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Overview__Group_4__0__Impl9917); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5067:1: rule__Overview__Group_4__1 : rule__Overview__Group_4__1__Impl rule__Overview__Group_4__2 ;
    public final void rule__Overview__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5071:1: ( rule__Overview__Group_4__1__Impl rule__Overview__Group_4__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5072:2: rule__Overview__Group_4__1__Impl rule__Overview__Group_4__2
            {
            pushFollow(FOLLOW_rule__Overview__Group_4__1__Impl_in_rule__Overview__Group_4__19948);
            rule__Overview__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_4__2_in_rule__Overview__Group_4__19951);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5079:1: rule__Overview__Group_4__1__Impl : ( 'on' ) ;
    public final void rule__Overview__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5083:1: ( ( 'on' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5084:1: ( 'on' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5084:1: ( 'on' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5085:1: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getOnKeyword_4_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__Overview__Group_4__1__Impl9979); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5098:1: rule__Overview__Group_4__2 : rule__Overview__Group_4__2__Impl rule__Overview__Group_4__3 ;
    public final void rule__Overview__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5102:1: ( rule__Overview__Group_4__2__Impl rule__Overview__Group_4__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5103:2: rule__Overview__Group_4__2__Impl rule__Overview__Group_4__3
            {
            pushFollow(FOLLOW_rule__Overview__Group_4__2__Impl_in_rule__Overview__Group_4__210010);
            rule__Overview__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_4__3_in_rule__Overview__Group_4__210013);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5110:1: rule__Overview__Group_4__2__Impl : ( ':' ) ;
    public final void rule__Overview__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5114:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5115:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5115:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5116:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getColonKeyword_4_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Overview__Group_4__2__Impl10041); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5129:1: rule__Overview__Group_4__3 : rule__Overview__Group_4__3__Impl ;
    public final void rule__Overview__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5133:1: ( rule__Overview__Group_4__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5134:2: rule__Overview__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Overview__Group_4__3__Impl_in_rule__Overview__Group_4__310072);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5140:1: rule__Overview__Group_4__3__Impl : ( ( rule__Overview__ImagePathOnAssignment_4_3 ) ) ;
    public final void rule__Overview__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5144:1: ( ( ( rule__Overview__ImagePathOnAssignment_4_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5145:1: ( ( rule__Overview__ImagePathOnAssignment_4_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5145:1: ( ( rule__Overview__ImagePathOnAssignment_4_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5146:1: ( rule__Overview__ImagePathOnAssignment_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImagePathOnAssignment_4_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5147:1: ( rule__Overview__ImagePathOnAssignment_4_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5147:2: rule__Overview__ImagePathOnAssignment_4_3
            {
            pushFollow(FOLLOW_rule__Overview__ImagePathOnAssignment_4_3_in_rule__Overview__Group_4__3__Impl10099);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5165:1: rule__Overview__Group_5__0 : rule__Overview__Group_5__0__Impl rule__Overview__Group_5__1 ;
    public final void rule__Overview__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5169:1: ( rule__Overview__Group_5__0__Impl rule__Overview__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5170:2: rule__Overview__Group_5__0__Impl rule__Overview__Group_5__1
            {
            pushFollow(FOLLOW_rule__Overview__Group_5__0__Impl_in_rule__Overview__Group_5__010137);
            rule__Overview__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_5__1_in_rule__Overview__Group_5__010140);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5177:1: rule__Overview__Group_5__0__Impl : ( 'image' ) ;
    public final void rule__Overview__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5181:1: ( ( 'image' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5182:1: ( 'image' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5182:1: ( 'image' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5183:1: 'image'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImageKeyword_5_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Overview__Group_5__0__Impl10168); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5196:1: rule__Overview__Group_5__1 : rule__Overview__Group_5__1__Impl rule__Overview__Group_5__2 ;
    public final void rule__Overview__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5200:1: ( rule__Overview__Group_5__1__Impl rule__Overview__Group_5__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5201:2: rule__Overview__Group_5__1__Impl rule__Overview__Group_5__2
            {
            pushFollow(FOLLOW_rule__Overview__Group_5__1__Impl_in_rule__Overview__Group_5__110199);
            rule__Overview__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_5__2_in_rule__Overview__Group_5__110202);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5208:1: rule__Overview__Group_5__1__Impl : ( 'off' ) ;
    public final void rule__Overview__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5212:1: ( ( 'off' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5213:1: ( 'off' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5213:1: ( 'off' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5214:1: 'off'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getOffKeyword_5_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__Overview__Group_5__1__Impl10230); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5227:1: rule__Overview__Group_5__2 : rule__Overview__Group_5__2__Impl rule__Overview__Group_5__3 ;
    public final void rule__Overview__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5231:1: ( rule__Overview__Group_5__2__Impl rule__Overview__Group_5__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5232:2: rule__Overview__Group_5__2__Impl rule__Overview__Group_5__3
            {
            pushFollow(FOLLOW_rule__Overview__Group_5__2__Impl_in_rule__Overview__Group_5__210261);
            rule__Overview__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_5__3_in_rule__Overview__Group_5__210264);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5239:1: rule__Overview__Group_5__2__Impl : ( ':' ) ;
    public final void rule__Overview__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5243:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5244:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5244:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5245:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getColonKeyword_5_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Overview__Group_5__2__Impl10292); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5258:1: rule__Overview__Group_5__3 : rule__Overview__Group_5__3__Impl ;
    public final void rule__Overview__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5262:1: ( rule__Overview__Group_5__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5263:2: rule__Overview__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Overview__Group_5__3__Impl_in_rule__Overview__Group_5__310323);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5269:1: rule__Overview__Group_5__3__Impl : ( ( rule__Overview__ImagePathOffAssignment_5_3 ) ) ;
    public final void rule__Overview__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5273:1: ( ( ( rule__Overview__ImagePathOffAssignment_5_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5274:1: ( ( rule__Overview__ImagePathOffAssignment_5_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5274:1: ( ( rule__Overview__ImagePathOffAssignment_5_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5275:1: ( rule__Overview__ImagePathOffAssignment_5_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImagePathOffAssignment_5_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5276:1: ( rule__Overview__ImagePathOffAssignment_5_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5276:2: rule__Overview__ImagePathOffAssignment_5_3
            {
            pushFollow(FOLLOW_rule__Overview__ImagePathOffAssignment_5_3_in_rule__Overview__Group_5__3__Impl10350);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5294:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5298:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5299:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__010388);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__010391);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5306:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5310:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5311:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5311:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5312:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl10418); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5323:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5327:1: ( rule__FQN__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5328:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__110447);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5334:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5338:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5339:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5339:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5340:1: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5341:1: ( rule__FQN__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==44) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5341:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl10474);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5355:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5359:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5360:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__010509);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__010512);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5367:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5371:1: ( ( '.' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5372:1: ( '.' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5372:1: ( '.' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5373:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__FQN__Group_1__0__Impl10540); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5386:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5390:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5391:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__110571);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5397:1: rule__FQN__Group_1__1__Impl : ( ( RULE_ID ) ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5401:1: ( ( ( RULE_ID ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5402:1: ( ( RULE_ID ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5402:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5403:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5404:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5404:3: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl10599); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5419:1: rule__ViewpointActivityExplorer__NameAssignment_3 : ( ruleFQN ) ;
    public final void rule__ViewpointActivityExplorer__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5423:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5424:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5424:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5425:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getNameFQNParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__ViewpointActivityExplorer__NameAssignment_310638);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5434:1: rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_2 : ( rulePage ) ;
    public final void rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5438:1: ( ( rulePage ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5439:1: ( rulePage )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5439:1: ( rulePage )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5440:1: rulePage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesPageParserRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_rulePage_in_rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_210669);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5449:1: rule__ViewpointActivityExplorer__OwnedPagesAssignment_6 : ( rulePageExtension ) ;
    public final void rule__ViewpointActivityExplorer__OwnedPagesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5453:1: ( ( rulePageExtension ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5454:1: ( rulePageExtension )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5454:1: ( rulePageExtension )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5455:1: rulePageExtension
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesPageExtensionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_rulePageExtension_in_rule__ViewpointActivityExplorer__OwnedPagesAssignment_610700);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5464:1: rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_7 : ( ruleSectionExtension ) ;
    public final void rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5468:1: ( ( ruleSectionExtension ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5469:1: ( ruleSectionExtension )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5469:1: ( ruleSectionExtension )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5470:1: ruleSectionExtension
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedSectionExtensionsSectionExtensionParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleSectionExtension_in_rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_710731);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5479:1: rule__Page__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5483:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5484:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5484:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5485:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Page__NameAssignment_210762); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5494:1: rule__Page__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Page__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5498:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5499:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5499:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5500:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__DescriptionAssignment_4_110793); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5509:1: rule__Page__FileExtensionsAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Page__FileExtensionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5513:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5514:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5514:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5515:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getFileExtensionsSTRINGTerminalRuleCall_5_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__FileExtensionsAssignment_5_210824); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5524:1: rule__Page__ActivityExplorerItemIDAssignment_6_1 : ( ruleFQN ) ;
    public final void rule__Page__ActivityExplorerItemIDAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5528:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5529:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5529:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5530:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getActivityExplorerItemIDFQNParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Page__ActivityExplorerItemIDAssignment_6_110855);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5539:1: rule__Page__LabelAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Page__LabelAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5543:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5544:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5544:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5545:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLabelSTRINGTerminalRuleCall_7_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__LabelAssignment_7_110886); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5554:1: rule__Page__IndexAssignment_9 : ( ruleEInt ) ;
    public final void rule__Page__IndexAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5558:1: ( ( ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5559:1: ( ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5559:1: ( ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5560:1: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getIndexEIntParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_ruleEInt_in_rule__Page__IndexAssignment_910917);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5569:1: rule__Page__OwnedOverviewAssignment_10 : ( ruleOverview ) ;
    public final void rule__Page__OwnedOverviewAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5573:1: ( ( ruleOverview ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5574:1: ( ruleOverview )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5574:1: ( ruleOverview )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5575:1: ruleOverview
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOwnedOverviewOverviewParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_ruleOverview_in_rule__Page__OwnedOverviewAssignment_1010948);
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


    // $ANTLR start "rule__Page__ImagePathOnAssignment_11_2_3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5584:1: rule__Page__ImagePathOnAssignment_11_2_3 : ( RULE_STRING ) ;
    public final void rule__Page__ImagePathOnAssignment_11_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5588:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5589:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5589:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5590:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImagePathOnSTRINGTerminalRuleCall_11_2_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__ImagePathOnAssignment_11_2_310979); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImagePathOnSTRINGTerminalRuleCall_11_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__ImagePathOnAssignment_11_2_3"


    // $ANTLR start "rule__Page__ImagePathOffAssignment_11_3_3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5599:1: rule__Page__ImagePathOffAssignment_11_3_3 : ( RULE_STRING ) ;
    public final void rule__Page__ImagePathOffAssignment_11_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5603:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5604:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5604:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5605:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImagePathOffSTRINGTerminalRuleCall_11_3_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__ImagePathOffAssignment_11_3_311010); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImagePathOffSTRINGTerminalRuleCall_11_3_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__ImagePathOffAssignment_11_3_3"


    // $ANTLR start "rule__Page__TabNameAssignment_12_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5614:1: rule__Page__TabNameAssignment_12_2 : ( RULE_STRING ) ;
    public final void rule__Page__TabNameAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5618:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5619:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5619:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5620:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTabNameSTRINGTerminalRuleCall_12_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__TabNameAssignment_12_211041); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getTabNameSTRINGTerminalRuleCall_12_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__TabNameAssignment_12_2"


    // $ANTLR start "rule__Page__HasPredicateAssignment_13_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5629:1: rule__Page__HasPredicateAssignment_13_2 : ( ruleEBoolean ) ;
    public final void rule__Page__HasPredicateAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5633:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5634:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5634:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5635:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getHasPredicateEBooleanParserRuleCall_13_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__Page__HasPredicateAssignment_13_211072);
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


    // $ANTLR start "rule__Page__ShowViewerAssignment_14_3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5644:1: rule__Page__ShowViewerAssignment_14_3 : ( ruleEBoolean ) ;
    public final void rule__Page__ShowViewerAssignment_14_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5648:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5649:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5649:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5650:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getShowViewerEBooleanParserRuleCall_14_3_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__Page__ShowViewerAssignment_14_311103);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getShowViewerEBooleanParserRuleCall_14_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__ShowViewerAssignment_14_3"


    // $ANTLR start "rule__Page__OwnedSectionsAssignment_15_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5659:1: rule__Page__OwnedSectionsAssignment_15_2 : ( ruleSection ) ;
    public final void rule__Page__OwnedSectionsAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5663:1: ( ( ruleSection ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5664:1: ( ruleSection )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5664:1: ( ruleSection )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5665:1: ruleSection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOwnedSectionsSectionParserRuleCall_15_2_0()); 
            }
            pushFollow(FOLLOW_ruleSection_in_rule__Page__OwnedSectionsAssignment_15_211134);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5674:1: rule__Section__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Section__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5678:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5679:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5679:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5680:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Section__NameAssignment_211165); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5689:1: rule__Section__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Section__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5693:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5694:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5694:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5695:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Section__DescriptionAssignment_4_111196); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5704:1: rule__Section__ActivityExplorerItemIDAssignment_5_1 : ( ruleFQN ) ;
    public final void rule__Section__ActivityExplorerItemIDAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5708:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5709:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5709:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5710:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getActivityExplorerItemIDFQNParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Section__ActivityExplorerItemIDAssignment_5_111227);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5719:1: rule__Section__LabelAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Section__LabelAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5723:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5724:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5724:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5725:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getLabelSTRINGTerminalRuleCall_6_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Section__LabelAssignment_6_111258); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5734:1: rule__Section__IndexAssignment_8 : ( ruleEInt ) ;
    public final void rule__Section__IndexAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5738:1: ( ( ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5739:1: ( ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5739:1: ( ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5740:1: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getIndexEIntParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_ruleEInt_in_rule__Section__IndexAssignment_811289);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5749:1: rule__Section__FilteringAssignment_9_2 : ( ruleEBoolean ) ;
    public final void rule__Section__FilteringAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5753:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5754:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5754:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5755:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getFilteringEBooleanParserRuleCall_9_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__Section__FilteringAssignment_9_211320);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5764:1: rule__Section__ExpandedAssignment_10_2 : ( ruleEBoolean ) ;
    public final void rule__Section__ExpandedAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5768:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5769:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5769:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5770:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getExpandedEBooleanParserRuleCall_10_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__Section__ExpandedAssignment_10_211351);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5779:1: rule__Section__OwnedActivitiesAssignment_11_2 : ( ruleActivity ) ;
    public final void rule__Section__OwnedActivitiesAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5783:1: ( ( ruleActivity ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5784:1: ( ruleActivity )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5784:1: ( ruleActivity )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5785:1: ruleActivity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getOwnedActivitiesActivityParserRuleCall_11_2_0()); 
            }
            pushFollow(FOLLOW_ruleActivity_in_rule__Section__OwnedActivitiesAssignment_11_211382);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5794:1: rule__Activity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5798:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5799:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5799:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5800:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_211413); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5809:1: rule__Activity__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Activity__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5813:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5814:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5814:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5815:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Activity__DescriptionAssignment_4_111444); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5824:1: rule__Activity__ActivityExplorerItemIDAssignment_5_1 : ( ruleFQN ) ;
    public final void rule__Activity__ActivityExplorerItemIDAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5828:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5829:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5829:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5830:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getActivityExplorerItemIDFQNParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Activity__ActivityExplorerItemIDAssignment_5_111475);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5839:1: rule__Activity__LabelAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Activity__LabelAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5843:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5844:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5844:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5845:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getLabelSTRINGTerminalRuleCall_6_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Activity__LabelAssignment_6_111506); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5854:1: rule__Activity__IndexAssignment_8 : ( ruleEInt ) ;
    public final void rule__Activity__IndexAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5858:1: ( ( ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5859:1: ( ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5859:1: ( ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5860:1: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getIndexEIntParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_ruleEInt_in_rule__Activity__IndexAssignment_811537);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5869:1: rule__Activity__HasPredicateAssignment_9_2 : ( ruleEBoolean ) ;
    public final void rule__Activity__HasPredicateAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5873:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5874:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5874:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5875:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getHasPredicateEBooleanParserRuleCall_9_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__Activity__HasPredicateAssignment_9_211568);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5884:1: rule__Activity__ImagePathOffAssignment_10_2 : ( RULE_STRING ) ;
    public final void rule__Activity__ImagePathOffAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5888:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5889:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5889:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5890:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getImagePathOffSTRINGTerminalRuleCall_10_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Activity__ImagePathOffAssignment_10_211599); if (state.failed) return ;
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


    // $ANTLR start "rule__PageExtension__ExtendedPageIDAssignment_6"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5899:1: rule__PageExtension__ExtendedPageIDAssignment_6 : ( ruleFQN ) ;
    public final void rule__PageExtension__ExtendedPageIDAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5903:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5904:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5904:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5905:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getExtendedPageIDFQNParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__PageExtension__ExtendedPageIDAssignment_611630);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5914:1: rule__PageExtension__OwnedSectionsAssignment_7 : ( ruleSection ) ;
    public final void rule__PageExtension__OwnedSectionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5918:1: ( ( ruleSection ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5919:1: ( ruleSection )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5919:1: ( ruleSection )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5920:1: ruleSection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getOwnedSectionsSectionParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleSection_in_rule__PageExtension__OwnedSectionsAssignment_711661);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5929:1: rule__SectionExtension__ExtendedSectionIDAssignment_6 : ( ruleFQN ) ;
    public final void rule__SectionExtension__ExtendedSectionIDAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5933:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5934:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5934:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5935:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getExtendedSectionIDFQNParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__SectionExtension__ExtendedSectionIDAssignment_611692);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5944:1: rule__SectionExtension__OwnedActivitiesAssignment_7 : ( ruleActivity ) ;
    public final void rule__SectionExtension__OwnedActivitiesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5948:1: ( ( ruleActivity ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5949:1: ( ruleActivity )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5949:1: ( ruleActivity )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5950:1: ruleActivity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getOwnedActivitiesActivityParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleActivity_in_rule__SectionExtension__OwnedActivitiesAssignment_711723);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5959:1: rule__Overview__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Overview__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5963:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5964:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5964:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5965:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Overview__DescriptionAssignment_3_111754); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5974:1: rule__Overview__ImagePathOnAssignment_4_3 : ( RULE_STRING ) ;
    public final void rule__Overview__ImagePathOnAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5978:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5979:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5979:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5980:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImagePathOnSTRINGTerminalRuleCall_4_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Overview__ImagePathOnAssignment_4_311785); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5989:1: rule__Overview__ImagePathOffAssignment_5_3 : ( RULE_STRING ) ;
    public final void rule__Overview__ImagePathOffAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5993:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5994:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5994:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5995:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImagePathOffSTRINGTerminalRuleCall_5_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Overview__ImagePathOffAssignment_5_311816); if (state.failed) return ;
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
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__4__Impl_in_rule__ViewpointActivityExplorer__Group__4979 = new BitSet(new long[]{0x0000001000070000L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__5_in_rule__ViewpointActivityExplorer__Group__4982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ViewpointActivityExplorer__Group__4__Impl1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__5__Impl_in_rule__ViewpointActivityExplorer__Group__51041 = new BitSet(new long[]{0x0000001000070000L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__6_in_rule__ViewpointActivityExplorer__Group__51044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_5__0_in_rule__ViewpointActivityExplorer__Group__5__Impl1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__6__Impl_in_rule__ViewpointActivityExplorer__Group__61102 = new BitSet(new long[]{0x0000001000070000L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__7_in_rule__ViewpointActivityExplorer__Group__61105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__OwnedPagesAssignment_6_in_rule__ViewpointActivityExplorer__Group__6__Impl1132 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__7__Impl_in_rule__ViewpointActivityExplorer__Group__71163 = new BitSet(new long[]{0x0000001000070000L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__8_in_rule__ViewpointActivityExplorer__Group__71166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_7_in_rule__ViewpointActivityExplorer__Group__7__Impl1193 = new BitSet(new long[]{0x0000001000000002L});
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
    public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__11614 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__11617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Page__Group__1__Impl1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__21676 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__21679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__NameAssignment_2_in_rule__Page__Group__2__Impl1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__31736 = new BitSet(new long[]{0x0000000001B80000L});
    public static final BitSet FOLLOW_rule__Page__Group__4_in_rule__Page__Group__31739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Page__Group__3__Impl1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__41798 = new BitSet(new long[]{0x0000000001B80000L});
    public static final BitSet FOLLOW_rule__Page__Group__5_in_rule__Page__Group__41801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_4__0_in_rule__Page__Group__4__Impl1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__51859 = new BitSet(new long[]{0x0000000001B80000L});
    public static final BitSet FOLLOW_rule__Page__Group__6_in_rule__Page__Group__51862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__0_in_rule__Page__Group__5__Impl1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__6__Impl_in_rule__Page__Group__61920 = new BitSet(new long[]{0x0000000001B80000L});
    public static final BitSet FOLLOW_rule__Page__Group__7_in_rule__Page__Group__61923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_6__0_in_rule__Page__Group__6__Impl1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__7__Impl_in_rule__Page__Group__71981 = new BitSet(new long[]{0x0000000001B80000L});
    public static final BitSet FOLLOW_rule__Page__Group__8_in_rule__Page__Group__71984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_7__0_in_rule__Page__Group__7__Impl2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__8__Impl_in_rule__Page__Group__82042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Page__Group__9_in_rule__Page__Group__82045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Page__Group__8__Impl2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__9__Impl_in_rule__Page__Group__92104 = new BitSet(new long[]{0x0000080B42010000L});
    public static final BitSet FOLLOW_rule__Page__Group__10_in_rule__Page__Group__92107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__IndexAssignment_9_in_rule__Page__Group__9__Impl2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__10__Impl_in_rule__Page__Group__102164 = new BitSet(new long[]{0x0000080B42010000L});
    public static final BitSet FOLLOW_rule__Page__Group__11_in_rule__Page__Group__102167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__OwnedOverviewAssignment_10_in_rule__Page__Group__10__Impl2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__11__Impl_in_rule__Page__Group__112225 = new BitSet(new long[]{0x0000080B42010000L});
    public static final BitSet FOLLOW_rule__Page__Group__12_in_rule__Page__Group__112228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11__0_in_rule__Page__Group__11__Impl2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__12__Impl_in_rule__Page__Group__122286 = new BitSet(new long[]{0x0000080B42010000L});
    public static final BitSet FOLLOW_rule__Page__Group__13_in_rule__Page__Group__122289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_12__0_in_rule__Page__Group__12__Impl2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__13__Impl_in_rule__Page__Group__132347 = new BitSet(new long[]{0x0000080B42010000L});
    public static final BitSet FOLLOW_rule__Page__Group__14_in_rule__Page__Group__132350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_13__0_in_rule__Page__Group__13__Impl2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__14__Impl_in_rule__Page__Group__142408 = new BitSet(new long[]{0x0000080B42010000L});
    public static final BitSet FOLLOW_rule__Page__Group__15_in_rule__Page__Group__142411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_14__0_in_rule__Page__Group__14__Impl2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__15__Impl_in_rule__Page__Group__152469 = new BitSet(new long[]{0x0000080B42010000L});
    public static final BitSet FOLLOW_rule__Page__Group__16_in_rule__Page__Group__152472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_15__0_in_rule__Page__Group__15__Impl2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__16__Impl_in_rule__Page__Group__162530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Page__Group__16__Impl2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_4__0__Impl_in_rule__Page__Group_4__02623 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Page__Group_4__1_in_rule__Page__Group_4__02626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Page__Group_4__0__Impl2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_4__1__Impl_in_rule__Page__Group_4__12685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__DescriptionAssignment_4_1_in_rule__Page__Group_4__1__Impl2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__0__Impl_in_rule__Page__Group_5__02746 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Page__Group_5__1_in_rule__Page__Group_5__02749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Page__Group_5__0__Impl2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__1__Impl_in_rule__Page__Group_5__12808 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Page__Group_5__2_in_rule__Page__Group_5__12811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Page__Group_5__1__Impl2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__2__Impl_in_rule__Page__Group_5__22870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__FileExtensionsAssignment_5_2_in_rule__Page__Group_5__2__Impl2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_6__0__Impl_in_rule__Page__Group_6__02933 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Page__Group_6__1_in_rule__Page__Group_6__02936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Page__Group_6__0__Impl2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_6__1__Impl_in_rule__Page__Group_6__12995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__ActivityExplorerItemIDAssignment_6_1_in_rule__Page__Group_6__1__Impl3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_7__0__Impl_in_rule__Page__Group_7__03056 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Page__Group_7__1_in_rule__Page__Group_7__03059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Page__Group_7__0__Impl3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_7__1__Impl_in_rule__Page__Group_7__13118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__LabelAssignment_7_1_in_rule__Page__Group_7__1__Impl3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11__0__Impl_in_rule__Page__Group_11__03179 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Page__Group_11__1_in_rule__Page__Group_11__03182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Page__Group_11__0__Impl3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11__1__Impl_in_rule__Page__Group_11__13241 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_rule__Page__Group_11__2_in_rule__Page__Group_11__13244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Page__Group_11__1__Impl3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11__2__Impl_in_rule__Page__Group_11__23303 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_rule__Page__Group_11__3_in_rule__Page__Group_11__23306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11_2__0_in_rule__Page__Group_11__2__Impl3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11__3__Impl_in_rule__Page__Group_11__33364 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_rule__Page__Group_11__4_in_rule__Page__Group_11__33367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11_3__0_in_rule__Page__Group_11__3__Impl3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11__4__Impl_in_rule__Page__Group_11__43425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Page__Group_11__4__Impl3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11_2__0__Impl_in_rule__Page__Group_11_2__03494 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Page__Group_11_2__1_in_rule__Page__Group_11_2__03497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Page__Group_11_2__0__Impl3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11_2__1__Impl_in_rule__Page__Group_11_2__13556 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Page__Group_11_2__2_in_rule__Page__Group_11_2__13559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Page__Group_11_2__1__Impl3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11_2__2__Impl_in_rule__Page__Group_11_2__23618 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Page__Group_11_2__3_in_rule__Page__Group_11_2__23621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Page__Group_11_2__2__Impl3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11_2__3__Impl_in_rule__Page__Group_11_2__33680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__ImagePathOnAssignment_11_2_3_in_rule__Page__Group_11_2__3__Impl3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11_3__0__Impl_in_rule__Page__Group_11_3__03745 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Page__Group_11_3__1_in_rule__Page__Group_11_3__03748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Page__Group_11_3__0__Impl3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11_3__1__Impl_in_rule__Page__Group_11_3__13807 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Page__Group_11_3__2_in_rule__Page__Group_11_3__13810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Page__Group_11_3__1__Impl3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11_3__2__Impl_in_rule__Page__Group_11_3__23869 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Page__Group_11_3__3_in_rule__Page__Group_11_3__23872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Page__Group_11_3__2__Impl3900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11_3__3__Impl_in_rule__Page__Group_11_3__33931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__ImagePathOffAssignment_11_3_3_in_rule__Page__Group_11_3__3__Impl3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_12__0__Impl_in_rule__Page__Group_12__03996 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Page__Group_12__1_in_rule__Page__Group_12__03999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Page__Group_12__0__Impl4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_12__1__Impl_in_rule__Page__Group_12__14058 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Page__Group_12__2_in_rule__Page__Group_12__14061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Page__Group_12__1__Impl4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_12__2__Impl_in_rule__Page__Group_12__24120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__TabNameAssignment_12_2_in_rule__Page__Group_12__2__Impl4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_13__0__Impl_in_rule__Page__Group_13__04183 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Page__Group_13__1_in_rule__Page__Group_13__04186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Page__Group_13__0__Impl4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_13__1__Impl_in_rule__Page__Group_13__14245 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Page__Group_13__2_in_rule__Page__Group_13__14248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Page__Group_13__1__Impl4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_13__2__Impl_in_rule__Page__Group_13__24307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__HasPredicateAssignment_13_2_in_rule__Page__Group_13__2__Impl4334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_14__0__Impl_in_rule__Page__Group_14__04370 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Page__Group_14__1_in_rule__Page__Group_14__04373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Page__Group_14__0__Impl4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_14__1__Impl_in_rule__Page__Group_14__14432 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Page__Group_14__2_in_rule__Page__Group_14__14435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Page__Group_14__1__Impl4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_14__2__Impl_in_rule__Page__Group_14__24494 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Page__Group_14__3_in_rule__Page__Group_14__24497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Page__Group_14__2__Impl4525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_14__3__Impl_in_rule__Page__Group_14__34556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__ShowViewerAssignment_14_3_in_rule__Page__Group_14__3__Impl4583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_15__0__Impl_in_rule__Page__Group_15__04621 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Page__Group_15__1_in_rule__Page__Group_15__04624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Page__Group_15__0__Impl4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_15__1__Impl_in_rule__Page__Group_15__14683 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_rule__Page__Group_15__2_in_rule__Page__Group_15__14686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Page__Group_15__1__Impl4714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_15__2__Impl_in_rule__Page__Group_15__24745 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_rule__Page__Group_15__3_in_rule__Page__Group_15__24748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__OwnedSectionsAssignment_15_2_in_rule__Page__Group_15__2__Impl4775 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_15__3__Impl_in_rule__Page__Group_15__34806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Page__Group_15__3__Impl4834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__0__Impl_in_rule__Section__Group__04873 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Section__Group__1_in_rule__Section__Group__04876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__1__Impl_in_rule__Section__Group__14934 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Section__Group__2_in_rule__Section__Group__14937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Section__Group__1__Impl4965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__2__Impl_in_rule__Section__Group__24996 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Section__Group__3_in_rule__Section__Group__24999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__NameAssignment_2_in_rule__Section__Group__2__Impl5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__3__Impl_in_rule__Section__Group__35056 = new BitSet(new long[]{0x0000000001980000L});
    public static final BitSet FOLLOW_rule__Section__Group__4_in_rule__Section__Group__35059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Section__Group__3__Impl5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__4__Impl_in_rule__Section__Group__45118 = new BitSet(new long[]{0x0000000001980000L});
    public static final BitSet FOLLOW_rule__Section__Group__5_in_rule__Section__Group__45121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_4__0_in_rule__Section__Group__4__Impl5148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__5__Impl_in_rule__Section__Group__55179 = new BitSet(new long[]{0x0000000001980000L});
    public static final BitSet FOLLOW_rule__Section__Group__6_in_rule__Section__Group__55182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_5__0_in_rule__Section__Group__5__Impl5209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__6__Impl_in_rule__Section__Group__65240 = new BitSet(new long[]{0x0000000001980000L});
    public static final BitSet FOLLOW_rule__Section__Group__7_in_rule__Section__Group__65243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_6__0_in_rule__Section__Group__6__Impl5270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__7__Impl_in_rule__Section__Group__75301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Section__Group__8_in_rule__Section__Group__75304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Section__Group__7__Impl5332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__8__Impl_in_rule__Section__Group__85363 = new BitSet(new long[]{0x000000E000010000L});
    public static final BitSet FOLLOW_rule__Section__Group__9_in_rule__Section__Group__85366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__IndexAssignment_8_in_rule__Section__Group__8__Impl5393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__9__Impl_in_rule__Section__Group__95423 = new BitSet(new long[]{0x000000E000010000L});
    public static final BitSet FOLLOW_rule__Section__Group__10_in_rule__Section__Group__95426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_9__0_in_rule__Section__Group__9__Impl5453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__10__Impl_in_rule__Section__Group__105484 = new BitSet(new long[]{0x000000E000010000L});
    public static final BitSet FOLLOW_rule__Section__Group__11_in_rule__Section__Group__105487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_10__0_in_rule__Section__Group__10__Impl5514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__11__Impl_in_rule__Section__Group__115545 = new BitSet(new long[]{0x000000E000010000L});
    public static final BitSet FOLLOW_rule__Section__Group__12_in_rule__Section__Group__115548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_11__0_in_rule__Section__Group__11__Impl5575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__12__Impl_in_rule__Section__Group__125606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Section__Group__12__Impl5634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_4__0__Impl_in_rule__Section__Group_4__05691 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Section__Group_4__1_in_rule__Section__Group_4__05694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Section__Group_4__0__Impl5722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_4__1__Impl_in_rule__Section__Group_4__15753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__DescriptionAssignment_4_1_in_rule__Section__Group_4__1__Impl5780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_5__0__Impl_in_rule__Section__Group_5__05814 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Section__Group_5__1_in_rule__Section__Group_5__05817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Section__Group_5__0__Impl5845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_5__1__Impl_in_rule__Section__Group_5__15876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__ActivityExplorerItemIDAssignment_5_1_in_rule__Section__Group_5__1__Impl5903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_6__0__Impl_in_rule__Section__Group_6__05937 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Section__Group_6__1_in_rule__Section__Group_6__05940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Section__Group_6__0__Impl5968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_6__1__Impl_in_rule__Section__Group_6__15999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__LabelAssignment_6_1_in_rule__Section__Group_6__1__Impl6026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_9__0__Impl_in_rule__Section__Group_9__06060 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Section__Group_9__1_in_rule__Section__Group_9__06063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Section__Group_9__0__Impl6091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_9__1__Impl_in_rule__Section__Group_9__16122 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Section__Group_9__2_in_rule__Section__Group_9__16125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Section__Group_9__1__Impl6153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_9__2__Impl_in_rule__Section__Group_9__26184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__FilteringAssignment_9_2_in_rule__Section__Group_9__2__Impl6211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_10__0__Impl_in_rule__Section__Group_10__06247 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Section__Group_10__1_in_rule__Section__Group_10__06250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Section__Group_10__0__Impl6278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_10__1__Impl_in_rule__Section__Group_10__16309 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Section__Group_10__2_in_rule__Section__Group_10__16312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Section__Group_10__1__Impl6340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_10__2__Impl_in_rule__Section__Group_10__26371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__ExpandedAssignment_10_2_in_rule__Section__Group_10__2__Impl6398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_11__0__Impl_in_rule__Section__Group_11__06434 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Section__Group_11__1_in_rule__Section__Group_11__06437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Section__Group_11__0__Impl6465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_11__1__Impl_in_rule__Section__Group_11__16496 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Section__Group_11__2_in_rule__Section__Group_11__16499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Section__Group_11__1__Impl6527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_11__2__Impl_in_rule__Section__Group_11__26558 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Section__Group_11__3_in_rule__Section__Group_11__26561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__OwnedActivitiesAssignment_11_2_in_rule__Section__Group_11__2__Impl6588 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Section__Group_11__3__Impl_in_rule__Section__Group_11__36619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Section__Group_11__3__Impl6647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__06686 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__06689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__16747 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__16750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Activity__Group__1__Impl6778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__26809 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__26812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__NameAssignment_2_in_rule__Activity__Group__2__Impl6839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__36869 = new BitSet(new long[]{0x0000000001980000L});
    public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__36872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Activity__Group__3__Impl6900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__46931 = new BitSet(new long[]{0x0000000001980000L});
    public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__46934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl6961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__56992 = new BitSet(new long[]{0x0000000001980000L});
    public static final BitSet FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__56995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl7022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__67053 = new BitSet(new long[]{0x0000000001980000L});
    public static final BitSet FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__67056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__0_in_rule__Activity__Group__6__Impl7083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__77114 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__77117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Activity__Group__7__Impl7145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__87176 = new BitSet(new long[]{0x0000010100010000L});
    public static final BitSet FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__87179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__IndexAssignment_8_in_rule__Activity__Group__8__Impl7206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__97236 = new BitSet(new long[]{0x0000010100010000L});
    public static final BitSet FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__97239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__0_in_rule__Activity__Group__9__Impl7266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__107297 = new BitSet(new long[]{0x0000010100010000L});
    public static final BitSet FOLLOW_rule__Activity__Group__11_in_rule__Activity__Group__107300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_10__0_in_rule__Activity__Group__10__Impl7327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__11__Impl_in_rule__Activity__Group__117358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Activity__Group__11__Impl7386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__07441 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__07444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Activity__Group_4__0__Impl7472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__17503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__DescriptionAssignment_4_1_in_rule__Activity__Group_4__1__Impl7530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__07564 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__07567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Activity__Group_5__0__Impl7595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__17626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__ActivityExplorerItemIDAssignment_5_1_in_rule__Activity__Group_5__1__Impl7653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__0__Impl_in_rule__Activity__Group_6__07687 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__1_in_rule__Activity__Group_6__07690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Activity__Group_6__0__Impl7718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__1__Impl_in_rule__Activity__Group_6__17749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__LabelAssignment_6_1_in_rule__Activity__Group_6__1__Impl7776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__0__Impl_in_rule__Activity__Group_9__07810 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__1_in_rule__Activity__Group_9__07813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Activity__Group_9__0__Impl7841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__1__Impl_in_rule__Activity__Group_9__17872 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__2_in_rule__Activity__Group_9__17875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Activity__Group_9__1__Impl7903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__2__Impl_in_rule__Activity__Group_9__27934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__HasPredicateAssignment_9_2_in_rule__Activity__Group_9__2__Impl7961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_10__0__Impl_in_rule__Activity__Group_10__07997 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_10__1_in_rule__Activity__Group_10__08000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Activity__Group_10__0__Impl8028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_10__1__Impl_in_rule__Activity__Group_10__18059 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Activity__Group_10__2_in_rule__Activity__Group_10__18062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Activity__Group_10__1__Impl8090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_10__2__Impl_in_rule__Activity__Group_10__28121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__ImagePathOffAssignment_10_2_in_rule__Activity__Group_10__2__Impl8148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__0__Impl_in_rule__PageExtension__Group__08184 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__1_in_rule__PageExtension__Group__08187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__1__Impl_in_rule__PageExtension__Group__18245 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__2_in_rule__PageExtension__Group__18248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PageExtension__Group__1__Impl8276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__2__Impl_in_rule__PageExtension__Group__28307 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__3_in_rule__PageExtension__Group__28310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__PageExtension__Group__2__Impl8338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__3__Impl_in_rule__PageExtension__Group__38369 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__4_in_rule__PageExtension__Group__38372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PageExtension__Group__3__Impl8400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__4__Impl_in_rule__PageExtension__Group__48431 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__5_in_rule__PageExtension__Group__48434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__PageExtension__Group__4__Impl8462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__5__Impl_in_rule__PageExtension__Group__58493 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__6_in_rule__PageExtension__Group__58496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PageExtension__Group__5__Impl8524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__6__Impl_in_rule__PageExtension__Group__68555 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__7_in_rule__PageExtension__Group__68558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__ExtendedPageIDAssignment_6_in_rule__PageExtension__Group__6__Impl8585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__7__Impl_in_rule__PageExtension__Group__78615 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__8_in_rule__PageExtension__Group__78618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__OwnedSectionsAssignment_7_in_rule__PageExtension__Group__7__Impl8645 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__8__Impl_in_rule__PageExtension__Group__88676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PageExtension__Group__8__Impl8704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__0__Impl_in_rule__SectionExtension__Group__08753 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__1_in_rule__SectionExtension__Group__08756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__1__Impl_in_rule__SectionExtension__Group__18814 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__2_in_rule__SectionExtension__Group__18817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__SectionExtension__Group__1__Impl8845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__2__Impl_in_rule__SectionExtension__Group__28876 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__3_in_rule__SectionExtension__Group__28879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__SectionExtension__Group__2__Impl8907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__3__Impl_in_rule__SectionExtension__Group__38938 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__4_in_rule__SectionExtension__Group__38941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SectionExtension__Group__3__Impl8969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__4__Impl_in_rule__SectionExtension__Group__49000 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__5_in_rule__SectionExtension__Group__49003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__SectionExtension__Group__4__Impl9031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__5__Impl_in_rule__SectionExtension__Group__59062 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__6_in_rule__SectionExtension__Group__59065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__SectionExtension__Group__5__Impl9093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__6__Impl_in_rule__SectionExtension__Group__69124 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__7_in_rule__SectionExtension__Group__69127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__ExtendedSectionIDAssignment_6_in_rule__SectionExtension__Group__6__Impl9154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__7__Impl_in_rule__SectionExtension__Group__79184 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__8_in_rule__SectionExtension__Group__79187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__OwnedActivitiesAssignment_7_in_rule__SectionExtension__Group__7__Impl9214 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__8__Impl_in_rule__SectionExtension__Group__89245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SectionExtension__Group__8__Impl9273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__0__Impl_in_rule__Overview__Group__09322 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Overview__Group__1_in_rule__Overview__Group__09325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__1__Impl_in_rule__Overview__Group__19383 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Overview__Group__2_in_rule__Overview__Group__19386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Overview__Group__1__Impl9414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__2__Impl_in_rule__Overview__Group__29445 = new BitSet(new long[]{0x0000000004110000L});
    public static final BitSet FOLLOW_rule__Overview__Group__3_in_rule__Overview__Group__29448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Overview__Group__2__Impl9476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__3__Impl_in_rule__Overview__Group__39507 = new BitSet(new long[]{0x0000000004110000L});
    public static final BitSet FOLLOW_rule__Overview__Group__4_in_rule__Overview__Group__39510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_3__0_in_rule__Overview__Group__3__Impl9537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__4__Impl_in_rule__Overview__Group__49568 = new BitSet(new long[]{0x0000000004110000L});
    public static final BitSet FOLLOW_rule__Overview__Group__5_in_rule__Overview__Group__49571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__0_in_rule__Overview__Group__4__Impl9598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__5__Impl_in_rule__Overview__Group__59629 = new BitSet(new long[]{0x0000000004110000L});
    public static final BitSet FOLLOW_rule__Overview__Group__6_in_rule__Overview__Group__59632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__0_in_rule__Overview__Group__5__Impl9659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__6__Impl_in_rule__Overview__Group__69690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Overview__Group__6__Impl9718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_3__0__Impl_in_rule__Overview__Group_3__09763 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Overview__Group_3__1_in_rule__Overview__Group_3__09766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Overview__Group_3__0__Impl9794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_3__1__Impl_in_rule__Overview__Group_3__19825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__DescriptionAssignment_3_1_in_rule__Overview__Group_3__1__Impl9852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__0__Impl_in_rule__Overview__Group_4__09886 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__1_in_rule__Overview__Group_4__09889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Overview__Group_4__0__Impl9917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__1__Impl_in_rule__Overview__Group_4__19948 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__2_in_rule__Overview__Group_4__19951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Overview__Group_4__1__Impl9979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__2__Impl_in_rule__Overview__Group_4__210010 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__3_in_rule__Overview__Group_4__210013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Overview__Group_4__2__Impl10041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__3__Impl_in_rule__Overview__Group_4__310072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__ImagePathOnAssignment_4_3_in_rule__Overview__Group_4__3__Impl10099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__0__Impl_in_rule__Overview__Group_5__010137 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__1_in_rule__Overview__Group_5__010140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Overview__Group_5__0__Impl10168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__1__Impl_in_rule__Overview__Group_5__110199 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__2_in_rule__Overview__Group_5__110202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Overview__Group_5__1__Impl10230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__2__Impl_in_rule__Overview__Group_5__210261 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__3_in_rule__Overview__Group_5__210264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Overview__Group_5__2__Impl10292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__3__Impl_in_rule__Overview__Group_5__310323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__ImagePathOffAssignment_5_3_in_rule__Overview__Group_5__3__Impl10350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__010388 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__010391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl10418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__110447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl10474 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__010509 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__010512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__FQN__Group_1__0__Impl10540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__110571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl10599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__ViewpointActivityExplorer__NameAssignment_310638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_210669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageExtension_in_rule__ViewpointActivityExplorer__OwnedPagesAssignment_610700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionExtension_in_rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_710731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Page__NameAssignment_210762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__DescriptionAssignment_4_110793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__FileExtensionsAssignment_5_210824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Page__ActivityExplorerItemIDAssignment_6_110855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__LabelAssignment_7_110886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_rule__Page__IndexAssignment_910917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverview_in_rule__Page__OwnedOverviewAssignment_1010948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__ImagePathOnAssignment_11_2_310979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__ImagePathOffAssignment_11_3_311010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__TabNameAssignment_12_211041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__Page__HasPredicateAssignment_13_211072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__Page__ShowViewerAssignment_14_311103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__Page__OwnedSectionsAssignment_15_211134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Section__NameAssignment_211165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Section__DescriptionAssignment_4_111196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Section__ActivityExplorerItemIDAssignment_5_111227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Section__LabelAssignment_6_111258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_rule__Section__IndexAssignment_811289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__Section__FilteringAssignment_9_211320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__Section__ExpandedAssignment_10_211351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__Section__OwnedActivitiesAssignment_11_211382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_211413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Activity__DescriptionAssignment_4_111444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Activity__ActivityExplorerItemIDAssignment_5_111475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Activity__LabelAssignment_6_111506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_rule__Activity__IndexAssignment_811537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__Activity__HasPredicateAssignment_9_211568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Activity__ImagePathOffAssignment_10_211599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__PageExtension__ExtendedPageIDAssignment_611630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__PageExtension__OwnedSectionsAssignment_711661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__SectionExtension__ExtendedSectionIDAssignment_611692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__SectionExtension__OwnedActivitiesAssignment_711723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Overview__DescriptionAssignment_3_111754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Overview__ImagePathOnAssignment_4_311785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Overview__ImagePathOffAssignment_5_311816 = new BitSet(new long[]{0x0000000000000002L});

}
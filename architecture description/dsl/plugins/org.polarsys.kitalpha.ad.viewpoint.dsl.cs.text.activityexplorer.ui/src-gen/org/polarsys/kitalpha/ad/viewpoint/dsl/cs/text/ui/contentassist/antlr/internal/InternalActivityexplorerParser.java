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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'Activity'", "'Explorer'", "'{'", "'}'", "'Pages'", "'Sections'", "'Activities'", "'Page'", "'index'", "'model'", "'type'", "'id'", "'header'", "'image'", "'on'", "':'", "'off'", "'tab'", "'name'", "'predicated'", "'show'", "'viewer'", "'Overview'", "'description'", "'section'", "'extended'", "'page'", "'filtering'", "'expanded'", "'activity'", "'icon'", "'.'"
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:70:1: ruleViewpointActivityExplorer : ( ( rule__ViewpointActivityExplorer__UnorderedGroup ) ) ;
    public final void ruleViewpointActivityExplorer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:74:2: ( ( ( rule__ViewpointActivityExplorer__UnorderedGroup ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:75:1: ( ( rule__ViewpointActivityExplorer__UnorderedGroup ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:75:1: ( ( rule__ViewpointActivityExplorer__UnorderedGroup ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:76:1: ( rule__ViewpointActivityExplorer__UnorderedGroup )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:77:1: ( rule__ViewpointActivityExplorer__UnorderedGroup )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:77:2: rule__ViewpointActivityExplorer__UnorderedGroup
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__UnorderedGroup_in_ruleViewpointActivityExplorer100);
            rule__ViewpointActivityExplorer__UnorderedGroup();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRulePages"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:89:1: entryRulePages : rulePages EOF ;
    public final void entryRulePages() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:90:1: ( rulePages EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:91:1: rulePages EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPagesRule()); 
            }
            pushFollow(FOLLOW_rulePages_in_entryRulePages127);
            rulePages();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPagesRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePages134); if (state.failed) return ;

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
    // $ANTLR end "entryRulePages"


    // $ANTLR start "rulePages"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:98:1: rulePages : ( ( rule__Pages__Group__0 ) ) ;
    public final void rulePages() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:102:2: ( ( ( rule__Pages__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:103:1: ( ( rule__Pages__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:103:1: ( ( rule__Pages__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:104:1: ( rule__Pages__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPagesAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:105:1: ( rule__Pages__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:105:2: rule__Pages__Group__0
            {
            pushFollow(FOLLOW_rule__Pages__Group__0_in_rulePages160);
            rule__Pages__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPagesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePages"


    // $ANTLR start "entryRuleSections"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:117:1: entryRuleSections : ruleSections EOF ;
    public final void entryRuleSections() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:118:1: ( ruleSections EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:119:1: ruleSections EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionsRule()); 
            }
            pushFollow(FOLLOW_ruleSections_in_entryRuleSections187);
            ruleSections();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSections194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSections"


    // $ANTLR start "ruleSections"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:126:1: ruleSections : ( ( rule__Sections__Group__0 ) ) ;
    public final void ruleSections() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:130:2: ( ( ( rule__Sections__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:131:1: ( ( rule__Sections__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:131:1: ( ( rule__Sections__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:132:1: ( rule__Sections__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionsAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:133:1: ( rule__Sections__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:133:2: rule__Sections__Group__0
            {
            pushFollow(FOLLOW_rule__Sections__Group__0_in_ruleSections220);
            rule__Sections__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSections"


    // $ANTLR start "entryRuleActivities"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:145:1: entryRuleActivities : ruleActivities EOF ;
    public final void entryRuleActivities() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:146:1: ( ruleActivities EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:147:1: ruleActivities EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivitiesRule()); 
            }
            pushFollow(FOLLOW_ruleActivities_in_entryRuleActivities247);
            ruleActivities();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivitiesRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivities254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleActivities"


    // $ANTLR start "ruleActivities"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:154:1: ruleActivities : ( ( rule__Activities__Group__0 ) ) ;
    public final void ruleActivities() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:158:2: ( ( ( rule__Activities__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:159:1: ( ( rule__Activities__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:159:1: ( ( rule__Activities__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:160:1: ( rule__Activities__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivitiesAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:161:1: ( rule__Activities__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:161:2: rule__Activities__Group__0
            {
            pushFollow(FOLLOW_rule__Activities__Group__0_in_ruleActivities280);
            rule__Activities__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivitiesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivities"


    // $ANTLR start "entryRulePage"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:173:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:174:1: ( rulePage EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:175:1: rulePage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageRule()); 
            }
            pushFollow(FOLLOW_rulePage_in_entryRulePage307);
            rulePage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePage314); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:182:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:186:2: ( ( ( rule__Page__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:187:1: ( ( rule__Page__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:187:1: ( ( rule__Page__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:188:1: ( rule__Page__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:189:1: ( rule__Page__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:189:2: rule__Page__Group__0
            {
            pushFollow(FOLLOW_rule__Page__Group__0_in_rulePage340);
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


    // $ANTLR start "entryRuleOverview"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:201:1: entryRuleOverview : ruleOverview EOF ;
    public final void entryRuleOverview() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:202:1: ( ruleOverview EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:203:1: ruleOverview EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewRule()); 
            }
            pushFollow(FOLLOW_ruleOverview_in_entryRuleOverview367);
            ruleOverview();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverview374); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:210:1: ruleOverview : ( ( rule__Overview__Group__0 ) ) ;
    public final void ruleOverview() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:214:2: ( ( ( rule__Overview__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:215:1: ( ( rule__Overview__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:215:1: ( ( rule__Overview__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:216:1: ( rule__Overview__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:217:1: ( rule__Overview__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:217:2: rule__Overview__Group__0
            {
            pushFollow(FOLLOW_rule__Overview__Group__0_in_ruleOverview400);
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


    // $ANTLR start "entryRuleSectionExtension"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:229:1: entryRuleSectionExtension : ruleSectionExtension EOF ;
    public final void entryRuleSectionExtension() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:230:1: ( ruleSectionExtension EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:231:1: ruleSectionExtension EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionRule()); 
            }
            pushFollow(FOLLOW_ruleSectionExtension_in_entryRuleSectionExtension427);
            ruleSectionExtension();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionExtension434); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:238:1: ruleSectionExtension : ( ( rule__SectionExtension__Group__0 ) ) ;
    public final void ruleSectionExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:242:2: ( ( ( rule__SectionExtension__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:243:1: ( ( rule__SectionExtension__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:243:1: ( ( rule__SectionExtension__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:244:1: ( rule__SectionExtension__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:245:1: ( rule__SectionExtension__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:245:2: rule__SectionExtension__Group__0
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__0_in_ruleSectionExtension460);
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


    // $ANTLR start "entryRuleActivityExtension"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:257:1: entryRuleActivityExtension : ruleActivityExtension EOF ;
    public final void entryRuleActivityExtension() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:258:1: ( ruleActivityExtension EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:259:1: ruleActivityExtension EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionRule()); 
            }
            pushFollow(FOLLOW_ruleActivityExtension_in_entryRuleActivityExtension487);
            ruleActivityExtension();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityExtension494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleActivityExtension"


    // $ANTLR start "ruleActivityExtension"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:266:1: ruleActivityExtension : ( ( rule__ActivityExtension__Group__0 ) ) ;
    public final void ruleActivityExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:270:2: ( ( ( rule__ActivityExtension__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:271:1: ( ( rule__ActivityExtension__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:271:1: ( ( rule__ActivityExtension__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:272:1: ( rule__ActivityExtension__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:273:1: ( rule__ActivityExtension__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:273:2: rule__ActivityExtension__Group__0
            {
            pushFollow(FOLLOW_rule__ActivityExtension__Group__0_in_ruleActivityExtension520);
            rule__ActivityExtension__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivityExtension"


    // $ANTLR start "entryRuleFQN"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:287:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:288:1: ( ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:289:1: ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN549);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN556); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:296:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:300:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:301:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:301:1: ( ( rule__FQN__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:302:1: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:303:1: ( rule__FQN__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:303:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN582);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:315:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:316:1: ( ruleEBoolean EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:317:1: ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_entryRuleEBoolean609);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEBooleanRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBoolean616); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:324:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:328:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:329:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:329:1: ( ( rule__EBoolean__Alternatives ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:330:1: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:331:1: ( rule__EBoolean__Alternatives )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:331:2: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean642);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:343:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:344:1: ( ruleEInt EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:345:1: ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_ruleEInt_in_entryRuleEInt669);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEInt676); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:352:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:356:2: ( ( RULE_INT ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:357:1: ( RULE_INT )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:357:1: ( RULE_INT )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:358:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEInt702); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:372:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:376:1: ( ( 'true' ) | ( 'false' ) )
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:377:1: ( 'true' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:377:1: ( 'true' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:378:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__EBoolean__Alternatives739); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:385:6: ( 'false' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:385:6: ( 'false' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:386:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__EBoolean__Alternatives759); if (state.failed) return ;
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


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_0__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:400:1: rule__ViewpointActivityExplorer__Group_0__0 : rule__ViewpointActivityExplorer__Group_0__0__Impl rule__ViewpointActivityExplorer__Group_0__1 ;
    public final void rule__ViewpointActivityExplorer__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:404:1: ( rule__ViewpointActivityExplorer__Group_0__0__Impl rule__ViewpointActivityExplorer__Group_0__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:405:2: rule__ViewpointActivityExplorer__Group_0__0__Impl rule__ViewpointActivityExplorer__Group_0__1
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group_0__0__Impl_in_rule__ViewpointActivityExplorer__Group_0__0791);
            rule__ViewpointActivityExplorer__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group_0__1_in_rule__ViewpointActivityExplorer__Group_0__0794);
            rule__ViewpointActivityExplorer__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_0__0"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_0__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:412:1: rule__ViewpointActivityExplorer__Group_0__0__Impl : ( 'Activity' ) ;
    public final void rule__ViewpointActivityExplorer__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:416:1: ( ( 'Activity' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:417:1: ( 'Activity' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:417:1: ( 'Activity' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:418:1: 'Activity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getActivityKeyword_0_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__ViewpointActivityExplorer__Group_0__0__Impl822); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getActivityKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_0__0__Impl"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_0__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:431:1: rule__ViewpointActivityExplorer__Group_0__1 : rule__ViewpointActivityExplorer__Group_0__1__Impl rule__ViewpointActivityExplorer__Group_0__2 ;
    public final void rule__ViewpointActivityExplorer__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:435:1: ( rule__ViewpointActivityExplorer__Group_0__1__Impl rule__ViewpointActivityExplorer__Group_0__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:436:2: rule__ViewpointActivityExplorer__Group_0__1__Impl rule__ViewpointActivityExplorer__Group_0__2
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group_0__1__Impl_in_rule__ViewpointActivityExplorer__Group_0__1853);
            rule__ViewpointActivityExplorer__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group_0__2_in_rule__ViewpointActivityExplorer__Group_0__1856);
            rule__ViewpointActivityExplorer__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_0__1"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_0__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:443:1: rule__ViewpointActivityExplorer__Group_0__1__Impl : ( 'Explorer' ) ;
    public final void rule__ViewpointActivityExplorer__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:447:1: ( ( 'Explorer' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:448:1: ( 'Explorer' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:448:1: ( 'Explorer' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:449:1: 'Explorer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getExplorerKeyword_0_1()); 
            }
            match(input,14,FOLLOW_14_in_rule__ViewpointActivityExplorer__Group_0__1__Impl884); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getExplorerKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_0__1__Impl"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_0__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:462:1: rule__ViewpointActivityExplorer__Group_0__2 : rule__ViewpointActivityExplorer__Group_0__2__Impl rule__ViewpointActivityExplorer__Group_0__3 ;
    public final void rule__ViewpointActivityExplorer__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:466:1: ( rule__ViewpointActivityExplorer__Group_0__2__Impl rule__ViewpointActivityExplorer__Group_0__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:467:2: rule__ViewpointActivityExplorer__Group_0__2__Impl rule__ViewpointActivityExplorer__Group_0__3
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group_0__2__Impl_in_rule__ViewpointActivityExplorer__Group_0__2915);
            rule__ViewpointActivityExplorer__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group_0__3_in_rule__ViewpointActivityExplorer__Group_0__2918);
            rule__ViewpointActivityExplorer__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_0__2"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_0__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:474:1: rule__ViewpointActivityExplorer__Group_0__2__Impl : ( ( rule__ViewpointActivityExplorer__NameAssignment_0_2 ) ) ;
    public final void rule__ViewpointActivityExplorer__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:478:1: ( ( ( rule__ViewpointActivityExplorer__NameAssignment_0_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:479:1: ( ( rule__ViewpointActivityExplorer__NameAssignment_0_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:479:1: ( ( rule__ViewpointActivityExplorer__NameAssignment_0_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:480:1: ( rule__ViewpointActivityExplorer__NameAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getNameAssignment_0_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:481:1: ( rule__ViewpointActivityExplorer__NameAssignment_0_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:481:2: rule__ViewpointActivityExplorer__NameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__NameAssignment_0_2_in_rule__ViewpointActivityExplorer__Group_0__2__Impl945);
            rule__ViewpointActivityExplorer__NameAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getNameAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_0__2__Impl"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_0__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:491:1: rule__ViewpointActivityExplorer__Group_0__3 : rule__ViewpointActivityExplorer__Group_0__3__Impl rule__ViewpointActivityExplorer__Group_0__4 ;
    public final void rule__ViewpointActivityExplorer__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:495:1: ( rule__ViewpointActivityExplorer__Group_0__3__Impl rule__ViewpointActivityExplorer__Group_0__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:496:2: rule__ViewpointActivityExplorer__Group_0__3__Impl rule__ViewpointActivityExplorer__Group_0__4
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group_0__3__Impl_in_rule__ViewpointActivityExplorer__Group_0__3975);
            rule__ViewpointActivityExplorer__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group_0__4_in_rule__ViewpointActivityExplorer__Group_0__3978);
            rule__ViewpointActivityExplorer__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_0__3"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_0__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:503:1: rule__ViewpointActivityExplorer__Group_0__3__Impl : ( '{' ) ;
    public final void rule__ViewpointActivityExplorer__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:507:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:508:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:508:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:509:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getLeftCurlyBracketKeyword_0_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__ViewpointActivityExplorer__Group_0__3__Impl1006); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getLeftCurlyBracketKeyword_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_0__3__Impl"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_0__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:522:1: rule__ViewpointActivityExplorer__Group_0__4 : rule__ViewpointActivityExplorer__Group_0__4__Impl ;
    public final void rule__ViewpointActivityExplorer__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:526:1: ( rule__ViewpointActivityExplorer__Group_0__4__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:527:2: rule__ViewpointActivityExplorer__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group_0__4__Impl_in_rule__ViewpointActivityExplorer__Group_0__41037);
            rule__ViewpointActivityExplorer__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_0__4"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_0__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:533:1: rule__ViewpointActivityExplorer__Group_0__4__Impl : ( ( rule__ViewpointActivityExplorer__OwnedNewPagesAssignment_0_4 )? ) ;
    public final void rule__ViewpointActivityExplorer__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:537:1: ( ( ( rule__ViewpointActivityExplorer__OwnedNewPagesAssignment_0_4 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:538:1: ( ( rule__ViewpointActivityExplorer__OwnedNewPagesAssignment_0_4 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:538:1: ( ( rule__ViewpointActivityExplorer__OwnedNewPagesAssignment_0_4 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:539:1: ( rule__ViewpointActivityExplorer__OwnedNewPagesAssignment_0_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedNewPagesAssignment_0_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:540:1: ( rule__ViewpointActivityExplorer__OwnedNewPagesAssignment_0_4 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:540:2: rule__ViewpointActivityExplorer__OwnedNewPagesAssignment_0_4
                    {
                    pushFollow(FOLLOW_rule__ViewpointActivityExplorer__OwnedNewPagesAssignment_0_4_in_rule__ViewpointActivityExplorer__Group_0__4__Impl1064);
                    rule__ViewpointActivityExplorer__OwnedNewPagesAssignment_0_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getOwnedNewPagesAssignment_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_0__4__Impl"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_2__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:560:1: rule__ViewpointActivityExplorer__Group_2__0 : rule__ViewpointActivityExplorer__Group_2__0__Impl rule__ViewpointActivityExplorer__Group_2__1 ;
    public final void rule__ViewpointActivityExplorer__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:564:1: ( rule__ViewpointActivityExplorer__Group_2__0__Impl rule__ViewpointActivityExplorer__Group_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:565:2: rule__ViewpointActivityExplorer__Group_2__0__Impl rule__ViewpointActivityExplorer__Group_2__1
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group_2__0__Impl_in_rule__ViewpointActivityExplorer__Group_2__01105);
            rule__ViewpointActivityExplorer__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group_2__1_in_rule__ViewpointActivityExplorer__Group_2__01108);
            rule__ViewpointActivityExplorer__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_2__0"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_2__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:572:1: rule__ViewpointActivityExplorer__Group_2__0__Impl : ( ( rule__ViewpointActivityExplorer__OwnedActivitiesExtensionAssignment_2_0 )? ) ;
    public final void rule__ViewpointActivityExplorer__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:576:1: ( ( ( rule__ViewpointActivityExplorer__OwnedActivitiesExtensionAssignment_2_0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:577:1: ( ( rule__ViewpointActivityExplorer__OwnedActivitiesExtensionAssignment_2_0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:577:1: ( ( rule__ViewpointActivityExplorer__OwnedActivitiesExtensionAssignment_2_0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:578:1: ( rule__ViewpointActivityExplorer__OwnedActivitiesExtensionAssignment_2_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedActivitiesExtensionAssignment_2_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:579:1: ( rule__ViewpointActivityExplorer__OwnedActivitiesExtensionAssignment_2_0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:579:2: rule__ViewpointActivityExplorer__OwnedActivitiesExtensionAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__ViewpointActivityExplorer__OwnedActivitiesExtensionAssignment_2_0_in_rule__ViewpointActivityExplorer__Group_2__0__Impl1135);
                    rule__ViewpointActivityExplorer__OwnedActivitiesExtensionAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getOwnedActivitiesExtensionAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_2__0__Impl"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_2__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:589:1: rule__ViewpointActivityExplorer__Group_2__1 : rule__ViewpointActivityExplorer__Group_2__1__Impl ;
    public final void rule__ViewpointActivityExplorer__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:593:1: ( rule__ViewpointActivityExplorer__Group_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:594:2: rule__ViewpointActivityExplorer__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group_2__1__Impl_in_rule__ViewpointActivityExplorer__Group_2__11166);
            rule__ViewpointActivityExplorer__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_2__1"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_2__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:600:1: rule__ViewpointActivityExplorer__Group_2__1__Impl : ( '}' ) ;
    public final void rule__ViewpointActivityExplorer__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:604:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:605:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:605:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:606:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getRightCurlyBracketKeyword_2_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__ViewpointActivityExplorer__Group_2__1__Impl1194); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getRightCurlyBracketKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_2__1__Impl"


    // $ANTLR start "rule__Pages__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:623:1: rule__Pages__Group__0 : rule__Pages__Group__0__Impl rule__Pages__Group__1 ;
    public final void rule__Pages__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:627:1: ( rule__Pages__Group__0__Impl rule__Pages__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:628:2: rule__Pages__Group__0__Impl rule__Pages__Group__1
            {
            pushFollow(FOLLOW_rule__Pages__Group__0__Impl_in_rule__Pages__Group__01229);
            rule__Pages__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pages__Group__1_in_rule__Pages__Group__01232);
            rule__Pages__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pages__Group__0"


    // $ANTLR start "rule__Pages__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:635:1: rule__Pages__Group__0__Impl : ( () ) ;
    public final void rule__Pages__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:639:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:640:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:640:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:641:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPagesAccess().getPagesAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:642:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:644:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPagesAccess().getPagesAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pages__Group__0__Impl"


    // $ANTLR start "rule__Pages__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:654:1: rule__Pages__Group__1 : rule__Pages__Group__1__Impl rule__Pages__Group__2 ;
    public final void rule__Pages__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:658:1: ( rule__Pages__Group__1__Impl rule__Pages__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:659:2: rule__Pages__Group__1__Impl rule__Pages__Group__2
            {
            pushFollow(FOLLOW_rule__Pages__Group__1__Impl_in_rule__Pages__Group__11290);
            rule__Pages__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pages__Group__2_in_rule__Pages__Group__11293);
            rule__Pages__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pages__Group__1"


    // $ANTLR start "rule__Pages__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:666:1: rule__Pages__Group__1__Impl : ( 'Pages' ) ;
    public final void rule__Pages__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:670:1: ( ( 'Pages' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:671:1: ( 'Pages' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:671:1: ( 'Pages' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:672:1: 'Pages'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPagesAccess().getPagesKeyword_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__Pages__Group__1__Impl1321); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPagesAccess().getPagesKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pages__Group__1__Impl"


    // $ANTLR start "rule__Pages__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:685:1: rule__Pages__Group__2 : rule__Pages__Group__2__Impl rule__Pages__Group__3 ;
    public final void rule__Pages__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:689:1: ( rule__Pages__Group__2__Impl rule__Pages__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:690:2: rule__Pages__Group__2__Impl rule__Pages__Group__3
            {
            pushFollow(FOLLOW_rule__Pages__Group__2__Impl_in_rule__Pages__Group__21352);
            rule__Pages__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pages__Group__3_in_rule__Pages__Group__21355);
            rule__Pages__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pages__Group__2"


    // $ANTLR start "rule__Pages__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:697:1: rule__Pages__Group__2__Impl : ( '{' ) ;
    public final void rule__Pages__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:701:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:702:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:702:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:703:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPagesAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,15,FOLLOW_15_in_rule__Pages__Group__2__Impl1383); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPagesAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pages__Group__2__Impl"


    // $ANTLR start "rule__Pages__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:716:1: rule__Pages__Group__3 : rule__Pages__Group__3__Impl rule__Pages__Group__4 ;
    public final void rule__Pages__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:720:1: ( rule__Pages__Group__3__Impl rule__Pages__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:721:2: rule__Pages__Group__3__Impl rule__Pages__Group__4
            {
            pushFollow(FOLLOW_rule__Pages__Group__3__Impl_in_rule__Pages__Group__31414);
            rule__Pages__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pages__Group__4_in_rule__Pages__Group__31417);
            rule__Pages__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pages__Group__3"


    // $ANTLR start "rule__Pages__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:728:1: rule__Pages__Group__3__Impl : ( ( rule__Pages__OwnedActivityExplorerPagesAssignment_3 ) ) ;
    public final void rule__Pages__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:732:1: ( ( ( rule__Pages__OwnedActivityExplorerPagesAssignment_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:733:1: ( ( rule__Pages__OwnedActivityExplorerPagesAssignment_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:733:1: ( ( rule__Pages__OwnedActivityExplorerPagesAssignment_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:734:1: ( rule__Pages__OwnedActivityExplorerPagesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPagesAccess().getOwnedActivityExplorerPagesAssignment_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:735:1: ( rule__Pages__OwnedActivityExplorerPagesAssignment_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:735:2: rule__Pages__OwnedActivityExplorerPagesAssignment_3
            {
            pushFollow(FOLLOW_rule__Pages__OwnedActivityExplorerPagesAssignment_3_in_rule__Pages__Group__3__Impl1444);
            rule__Pages__OwnedActivityExplorerPagesAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPagesAccess().getOwnedActivityExplorerPagesAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pages__Group__3__Impl"


    // $ANTLR start "rule__Pages__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:745:1: rule__Pages__Group__4 : rule__Pages__Group__4__Impl rule__Pages__Group__5 ;
    public final void rule__Pages__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:749:1: ( rule__Pages__Group__4__Impl rule__Pages__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:750:2: rule__Pages__Group__4__Impl rule__Pages__Group__5
            {
            pushFollow(FOLLOW_rule__Pages__Group__4__Impl_in_rule__Pages__Group__41474);
            rule__Pages__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pages__Group__5_in_rule__Pages__Group__41477);
            rule__Pages__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pages__Group__4"


    // $ANTLR start "rule__Pages__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:757:1: rule__Pages__Group__4__Impl : ( ( rule__Pages__OwnedActivityExplorerPagesAssignment_4 )* ) ;
    public final void rule__Pages__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:761:1: ( ( ( rule__Pages__OwnedActivityExplorerPagesAssignment_4 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:762:1: ( ( rule__Pages__OwnedActivityExplorerPagesAssignment_4 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:762:1: ( ( rule__Pages__OwnedActivityExplorerPagesAssignment_4 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:763:1: ( rule__Pages__OwnedActivityExplorerPagesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPagesAccess().getOwnedActivityExplorerPagesAssignment_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:764:1: ( rule__Pages__OwnedActivityExplorerPagesAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:764:2: rule__Pages__OwnedActivityExplorerPagesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Pages__OwnedActivityExplorerPagesAssignment_4_in_rule__Pages__Group__4__Impl1504);
            	    rule__Pages__OwnedActivityExplorerPagesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPagesAccess().getOwnedActivityExplorerPagesAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pages__Group__4__Impl"


    // $ANTLR start "rule__Pages__Group__5"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:774:1: rule__Pages__Group__5 : rule__Pages__Group__5__Impl ;
    public final void rule__Pages__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:778:1: ( rule__Pages__Group__5__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:779:2: rule__Pages__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Pages__Group__5__Impl_in_rule__Pages__Group__51535);
            rule__Pages__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pages__Group__5"


    // $ANTLR start "rule__Pages__Group__5__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:785:1: rule__Pages__Group__5__Impl : ( '}' ) ;
    public final void rule__Pages__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:789:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:790:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:790:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:791:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPagesAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,16,FOLLOW_16_in_rule__Pages__Group__5__Impl1563); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPagesAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pages__Group__5__Impl"


    // $ANTLR start "rule__Sections__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:816:1: rule__Sections__Group__0 : rule__Sections__Group__0__Impl rule__Sections__Group__1 ;
    public final void rule__Sections__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:820:1: ( rule__Sections__Group__0__Impl rule__Sections__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:821:2: rule__Sections__Group__0__Impl rule__Sections__Group__1
            {
            pushFollow(FOLLOW_rule__Sections__Group__0__Impl_in_rule__Sections__Group__01606);
            rule__Sections__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sections__Group__1_in_rule__Sections__Group__01609);
            rule__Sections__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__Group__0"


    // $ANTLR start "rule__Sections__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:828:1: rule__Sections__Group__0__Impl : ( () ) ;
    public final void rule__Sections__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:832:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:833:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:833:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:834:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionsAccess().getSectionsAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:835:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:837:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionsAccess().getSectionsAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__Group__0__Impl"


    // $ANTLR start "rule__Sections__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:847:1: rule__Sections__Group__1 : rule__Sections__Group__1__Impl rule__Sections__Group__2 ;
    public final void rule__Sections__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:851:1: ( rule__Sections__Group__1__Impl rule__Sections__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:852:2: rule__Sections__Group__1__Impl rule__Sections__Group__2
            {
            pushFollow(FOLLOW_rule__Sections__Group__1__Impl_in_rule__Sections__Group__11667);
            rule__Sections__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sections__Group__2_in_rule__Sections__Group__11670);
            rule__Sections__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__Group__1"


    // $ANTLR start "rule__Sections__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:859:1: rule__Sections__Group__1__Impl : ( 'Sections' ) ;
    public final void rule__Sections__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:863:1: ( ( 'Sections' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:864:1: ( 'Sections' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:864:1: ( 'Sections' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:865:1: 'Sections'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionsAccess().getSectionsKeyword_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__Sections__Group__1__Impl1698); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionsAccess().getSectionsKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__Group__1__Impl"


    // $ANTLR start "rule__Sections__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:878:1: rule__Sections__Group__2 : rule__Sections__Group__2__Impl rule__Sections__Group__3 ;
    public final void rule__Sections__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:882:1: ( rule__Sections__Group__2__Impl rule__Sections__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:883:2: rule__Sections__Group__2__Impl rule__Sections__Group__3
            {
            pushFollow(FOLLOW_rule__Sections__Group__2__Impl_in_rule__Sections__Group__21729);
            rule__Sections__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sections__Group__3_in_rule__Sections__Group__21732);
            rule__Sections__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__Group__2"


    // $ANTLR start "rule__Sections__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:890:1: rule__Sections__Group__2__Impl : ( '{' ) ;
    public final void rule__Sections__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:894:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:895:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:895:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:896:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionsAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,15,FOLLOW_15_in_rule__Sections__Group__2__Impl1760); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionsAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__Group__2__Impl"


    // $ANTLR start "rule__Sections__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:909:1: rule__Sections__Group__3 : rule__Sections__Group__3__Impl rule__Sections__Group__4 ;
    public final void rule__Sections__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:913:1: ( rule__Sections__Group__3__Impl rule__Sections__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:914:2: rule__Sections__Group__3__Impl rule__Sections__Group__4
            {
            pushFollow(FOLLOW_rule__Sections__Group__3__Impl_in_rule__Sections__Group__31791);
            rule__Sections__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sections__Group__4_in_rule__Sections__Group__31794);
            rule__Sections__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__Group__3"


    // $ANTLR start "rule__Sections__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:921:1: rule__Sections__Group__3__Impl : ( ( rule__Sections__OwnedSectionsExtensionsAssignment_3 ) ) ;
    public final void rule__Sections__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:925:1: ( ( ( rule__Sections__OwnedSectionsExtensionsAssignment_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:926:1: ( ( rule__Sections__OwnedSectionsExtensionsAssignment_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:926:1: ( ( rule__Sections__OwnedSectionsExtensionsAssignment_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:927:1: ( rule__Sections__OwnedSectionsExtensionsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionsAccess().getOwnedSectionsExtensionsAssignment_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:928:1: ( rule__Sections__OwnedSectionsExtensionsAssignment_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:928:2: rule__Sections__OwnedSectionsExtensionsAssignment_3
            {
            pushFollow(FOLLOW_rule__Sections__OwnedSectionsExtensionsAssignment_3_in_rule__Sections__Group__3__Impl1821);
            rule__Sections__OwnedSectionsExtensionsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionsAccess().getOwnedSectionsExtensionsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__Group__3__Impl"


    // $ANTLR start "rule__Sections__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:938:1: rule__Sections__Group__4 : rule__Sections__Group__4__Impl rule__Sections__Group__5 ;
    public final void rule__Sections__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:942:1: ( rule__Sections__Group__4__Impl rule__Sections__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:943:2: rule__Sections__Group__4__Impl rule__Sections__Group__5
            {
            pushFollow(FOLLOW_rule__Sections__Group__4__Impl_in_rule__Sections__Group__41851);
            rule__Sections__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sections__Group__5_in_rule__Sections__Group__41854);
            rule__Sections__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__Group__4"


    // $ANTLR start "rule__Sections__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:950:1: rule__Sections__Group__4__Impl : ( ( rule__Sections__OwnedSectionsExtensionsAssignment_4 )* ) ;
    public final void rule__Sections__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:954:1: ( ( ( rule__Sections__OwnedSectionsExtensionsAssignment_4 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:955:1: ( ( rule__Sections__OwnedSectionsExtensionsAssignment_4 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:955:1: ( ( rule__Sections__OwnedSectionsExtensionsAssignment_4 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:956:1: ( rule__Sections__OwnedSectionsExtensionsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionsAccess().getOwnedSectionsExtensionsAssignment_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:957:1: ( rule__Sections__OwnedSectionsExtensionsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==37) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:957:2: rule__Sections__OwnedSectionsExtensionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Sections__OwnedSectionsExtensionsAssignment_4_in_rule__Sections__Group__4__Impl1881);
            	    rule__Sections__OwnedSectionsExtensionsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionsAccess().getOwnedSectionsExtensionsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__Group__4__Impl"


    // $ANTLR start "rule__Sections__Group__5"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:967:1: rule__Sections__Group__5 : rule__Sections__Group__5__Impl ;
    public final void rule__Sections__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:971:1: ( rule__Sections__Group__5__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:972:2: rule__Sections__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Sections__Group__5__Impl_in_rule__Sections__Group__51912);
            rule__Sections__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__Group__5"


    // $ANTLR start "rule__Sections__Group__5__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:978:1: rule__Sections__Group__5__Impl : ( '}' ) ;
    public final void rule__Sections__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:982:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:983:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:983:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:984:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionsAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,16,FOLLOW_16_in_rule__Sections__Group__5__Impl1940); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionsAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__Group__5__Impl"


    // $ANTLR start "rule__Activities__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1009:1: rule__Activities__Group__0 : rule__Activities__Group__0__Impl rule__Activities__Group__1 ;
    public final void rule__Activities__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1013:1: ( rule__Activities__Group__0__Impl rule__Activities__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1014:2: rule__Activities__Group__0__Impl rule__Activities__Group__1
            {
            pushFollow(FOLLOW_rule__Activities__Group__0__Impl_in_rule__Activities__Group__01983);
            rule__Activities__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activities__Group__1_in_rule__Activities__Group__01986);
            rule__Activities__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activities__Group__0"


    // $ANTLR start "rule__Activities__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1021:1: rule__Activities__Group__0__Impl : ( () ) ;
    public final void rule__Activities__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1025:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1026:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1026:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1027:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivitiesAccess().getActivitiesAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1028:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1030:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivitiesAccess().getActivitiesAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activities__Group__0__Impl"


    // $ANTLR start "rule__Activities__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1040:1: rule__Activities__Group__1 : rule__Activities__Group__1__Impl rule__Activities__Group__2 ;
    public final void rule__Activities__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1044:1: ( rule__Activities__Group__1__Impl rule__Activities__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1045:2: rule__Activities__Group__1__Impl rule__Activities__Group__2
            {
            pushFollow(FOLLOW_rule__Activities__Group__1__Impl_in_rule__Activities__Group__12044);
            rule__Activities__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activities__Group__2_in_rule__Activities__Group__12047);
            rule__Activities__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activities__Group__1"


    // $ANTLR start "rule__Activities__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1052:1: rule__Activities__Group__1__Impl : ( 'Activities' ) ;
    public final void rule__Activities__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1056:1: ( ( 'Activities' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1057:1: ( 'Activities' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1057:1: ( 'Activities' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1058:1: 'Activities'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivitiesAccess().getActivitiesKeyword_1()); 
            }
            match(input,19,FOLLOW_19_in_rule__Activities__Group__1__Impl2075); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivitiesAccess().getActivitiesKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activities__Group__1__Impl"


    // $ANTLR start "rule__Activities__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1071:1: rule__Activities__Group__2 : rule__Activities__Group__2__Impl rule__Activities__Group__3 ;
    public final void rule__Activities__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1075:1: ( rule__Activities__Group__2__Impl rule__Activities__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1076:2: rule__Activities__Group__2__Impl rule__Activities__Group__3
            {
            pushFollow(FOLLOW_rule__Activities__Group__2__Impl_in_rule__Activities__Group__22106);
            rule__Activities__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activities__Group__3_in_rule__Activities__Group__22109);
            rule__Activities__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activities__Group__2"


    // $ANTLR start "rule__Activities__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1083:1: rule__Activities__Group__2__Impl : ( '{' ) ;
    public final void rule__Activities__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1087:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1088:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1088:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1089:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivitiesAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,15,FOLLOW_15_in_rule__Activities__Group__2__Impl2137); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivitiesAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activities__Group__2__Impl"


    // $ANTLR start "rule__Activities__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1102:1: rule__Activities__Group__3 : rule__Activities__Group__3__Impl rule__Activities__Group__4 ;
    public final void rule__Activities__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1106:1: ( rule__Activities__Group__3__Impl rule__Activities__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1107:2: rule__Activities__Group__3__Impl rule__Activities__Group__4
            {
            pushFollow(FOLLOW_rule__Activities__Group__3__Impl_in_rule__Activities__Group__32168);
            rule__Activities__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activities__Group__4_in_rule__Activities__Group__32171);
            rule__Activities__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activities__Group__3"


    // $ANTLR start "rule__Activities__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1114:1: rule__Activities__Group__3__Impl : ( ( rule__Activities__OwnedActivitiesExtensionsAssignment_3 ) ) ;
    public final void rule__Activities__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1118:1: ( ( ( rule__Activities__OwnedActivitiesExtensionsAssignment_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1119:1: ( ( rule__Activities__OwnedActivitiesExtensionsAssignment_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1119:1: ( ( rule__Activities__OwnedActivitiesExtensionsAssignment_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1120:1: ( rule__Activities__OwnedActivitiesExtensionsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivitiesAccess().getOwnedActivitiesExtensionsAssignment_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1121:1: ( rule__Activities__OwnedActivitiesExtensionsAssignment_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1121:2: rule__Activities__OwnedActivitiesExtensionsAssignment_3
            {
            pushFollow(FOLLOW_rule__Activities__OwnedActivitiesExtensionsAssignment_3_in_rule__Activities__Group__3__Impl2198);
            rule__Activities__OwnedActivitiesExtensionsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivitiesAccess().getOwnedActivitiesExtensionsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activities__Group__3__Impl"


    // $ANTLR start "rule__Activities__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1131:1: rule__Activities__Group__4 : rule__Activities__Group__4__Impl rule__Activities__Group__5 ;
    public final void rule__Activities__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1135:1: ( rule__Activities__Group__4__Impl rule__Activities__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1136:2: rule__Activities__Group__4__Impl rule__Activities__Group__5
            {
            pushFollow(FOLLOW_rule__Activities__Group__4__Impl_in_rule__Activities__Group__42228);
            rule__Activities__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activities__Group__5_in_rule__Activities__Group__42231);
            rule__Activities__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activities__Group__4"


    // $ANTLR start "rule__Activities__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1143:1: rule__Activities__Group__4__Impl : ( ( rule__Activities__OwnedActivitiesExtensionsAssignment_4 )* ) ;
    public final void rule__Activities__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1147:1: ( ( ( rule__Activities__OwnedActivitiesExtensionsAssignment_4 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1148:1: ( ( rule__Activities__OwnedActivitiesExtensionsAssignment_4 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1148:1: ( ( rule__Activities__OwnedActivitiesExtensionsAssignment_4 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1149:1: ( rule__Activities__OwnedActivitiesExtensionsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivitiesAccess().getOwnedActivitiesExtensionsAssignment_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1150:1: ( rule__Activities__OwnedActivitiesExtensionsAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==42) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1150:2: rule__Activities__OwnedActivitiesExtensionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Activities__OwnedActivitiesExtensionsAssignment_4_in_rule__Activities__Group__4__Impl2258);
            	    rule__Activities__OwnedActivitiesExtensionsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivitiesAccess().getOwnedActivitiesExtensionsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activities__Group__4__Impl"


    // $ANTLR start "rule__Activities__Group__5"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1160:1: rule__Activities__Group__5 : rule__Activities__Group__5__Impl ;
    public final void rule__Activities__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1164:1: ( rule__Activities__Group__5__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1165:2: rule__Activities__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Activities__Group__5__Impl_in_rule__Activities__Group__52289);
            rule__Activities__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activities__Group__5"


    // $ANTLR start "rule__Activities__Group__5__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1171:1: rule__Activities__Group__5__Impl : ( '}' ) ;
    public final void rule__Activities__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1175:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1176:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1176:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1177:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivitiesAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,16,FOLLOW_16_in_rule__Activities__Group__5__Impl2317); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivitiesAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activities__Group__5__Impl"


    // $ANTLR start "rule__Page__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1202:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1206:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1207:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__02360);
            rule__Page__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__1_in_rule__Page__Group__02363);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1214:1: rule__Page__Group__0__Impl : ( () ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1218:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1219:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1219:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1220:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1221:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1223:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1233:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1237:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1238:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__12421);
            rule__Page__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__2_in_rule__Page__Group__12424);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1245:1: rule__Page__Group__1__Impl : ( 'Page' ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1249:1: ( ( 'Page' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1250:1: ( 'Page' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1250:1: ( 'Page' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1251:1: 'Page'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageKeyword_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Page__Group__1__Impl2452); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1264:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1268:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1269:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__22483);
            rule__Page__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__3_in_rule__Page__Group__22486);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1276:1: rule__Page__Group__2__Impl : ( ( rule__Page__NameAssignment_2 ) ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1280:1: ( ( ( rule__Page__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1281:1: ( ( rule__Page__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1281:1: ( ( rule__Page__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1282:1: ( rule__Page__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1283:1: ( rule__Page__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1283:2: rule__Page__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Page__NameAssignment_2_in_rule__Page__Group__2__Impl2513);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1293:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1297:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1298:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__32543);
            rule__Page__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__4_in_rule__Page__Group__32546);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1305:1: rule__Page__Group__3__Impl : ( '{' ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1309:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1310:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1310:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1311:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__Page__Group__3__Impl2574); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1324:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1328:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1329:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__42605);
            rule__Page__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__5_in_rule__Page__Group__42608);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1336:1: rule__Page__Group__4__Impl : ( ( rule__Page__Group_4__0 )? ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1340:1: ( ( ( rule__Page__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1341:1: ( ( rule__Page__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1341:1: ( ( rule__Page__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1342:1: ( rule__Page__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1343:1: ( rule__Page__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1343:2: rule__Page__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_4__0_in_rule__Page__Group__4__Impl2635);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1353:1: rule__Page__Group__5 : rule__Page__Group__5__Impl rule__Page__Group__6 ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1357:1: ( rule__Page__Group__5__Impl rule__Page__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1358:2: rule__Page__Group__5__Impl rule__Page__Group__6
            {
            pushFollow(FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__52666);
            rule__Page__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__6_in_rule__Page__Group__52669);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1365:1: rule__Page__Group__5__Impl : ( ( rule__Page__Group_5__0 )? ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1369:1: ( ( ( rule__Page__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1370:1: ( ( rule__Page__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1370:1: ( ( rule__Page__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1371:1: ( rule__Page__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1372:1: ( rule__Page__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1372:2: rule__Page__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_5__0_in_rule__Page__Group__5__Impl2696);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1382:1: rule__Page__Group__6 : rule__Page__Group__6__Impl rule__Page__Group__7 ;
    public final void rule__Page__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1386:1: ( rule__Page__Group__6__Impl rule__Page__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1387:2: rule__Page__Group__6__Impl rule__Page__Group__7
            {
            pushFollow(FOLLOW_rule__Page__Group__6__Impl_in_rule__Page__Group__62727);
            rule__Page__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__7_in_rule__Page__Group__62730);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1394:1: rule__Page__Group__6__Impl : ( 'index' ) ;
    public final void rule__Page__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1398:1: ( ( 'index' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1399:1: ( 'index' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1399:1: ( 'index' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1400:1: 'index'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getIndexKeyword_6()); 
            }
            match(input,21,FOLLOW_21_in_rule__Page__Group__6__Impl2758); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getIndexKeyword_6()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1413:1: rule__Page__Group__7 : rule__Page__Group__7__Impl rule__Page__Group__8 ;
    public final void rule__Page__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1417:1: ( rule__Page__Group__7__Impl rule__Page__Group__8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1418:2: rule__Page__Group__7__Impl rule__Page__Group__8
            {
            pushFollow(FOLLOW_rule__Page__Group__7__Impl_in_rule__Page__Group__72789);
            rule__Page__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__8_in_rule__Page__Group__72792);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1425:1: rule__Page__Group__7__Impl : ( ( rule__Page__IndexAssignment_7 ) ) ;
    public final void rule__Page__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1429:1: ( ( ( rule__Page__IndexAssignment_7 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1430:1: ( ( rule__Page__IndexAssignment_7 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1430:1: ( ( rule__Page__IndexAssignment_7 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1431:1: ( rule__Page__IndexAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getIndexAssignment_7()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1432:1: ( rule__Page__IndexAssignment_7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1432:2: rule__Page__IndexAssignment_7
            {
            pushFollow(FOLLOW_rule__Page__IndexAssignment_7_in_rule__Page__Group__7__Impl2819);
            rule__Page__IndexAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getIndexAssignment_7()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1442:1: rule__Page__Group__8 : rule__Page__Group__8__Impl rule__Page__Group__9 ;
    public final void rule__Page__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1446:1: ( rule__Page__Group__8__Impl rule__Page__Group__9 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1447:2: rule__Page__Group__8__Impl rule__Page__Group__9
            {
            pushFollow(FOLLOW_rule__Page__Group__8__Impl_in_rule__Page__Group__82849);
            rule__Page__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__9_in_rule__Page__Group__82852);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1454:1: rule__Page__Group__8__Impl : ( ( rule__Page__OwnedOverviewAssignment_8 )? ) ;
    public final void rule__Page__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1458:1: ( ( ( rule__Page__OwnedOverviewAssignment_8 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1459:1: ( ( rule__Page__OwnedOverviewAssignment_8 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1459:1: ( ( rule__Page__OwnedOverviewAssignment_8 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1460:1: ( rule__Page__OwnedOverviewAssignment_8 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOwnedOverviewAssignment_8()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1461:1: ( rule__Page__OwnedOverviewAssignment_8 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==35) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1461:2: rule__Page__OwnedOverviewAssignment_8
                    {
                    pushFollow(FOLLOW_rule__Page__OwnedOverviewAssignment_8_in_rule__Page__Group__8__Impl2879);
                    rule__Page__OwnedOverviewAssignment_8();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getOwnedOverviewAssignment_8()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1471:1: rule__Page__Group__9 : rule__Page__Group__9__Impl rule__Page__Group__10 ;
    public final void rule__Page__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1475:1: ( rule__Page__Group__9__Impl rule__Page__Group__10 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1476:2: rule__Page__Group__9__Impl rule__Page__Group__10
            {
            pushFollow(FOLLOW_rule__Page__Group__9__Impl_in_rule__Page__Group__92910);
            rule__Page__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__10_in_rule__Page__Group__92913);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1483:1: rule__Page__Group__9__Impl : ( ( rule__Page__Group_9__0 )? ) ;
    public final void rule__Page__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1487:1: ( ( ( rule__Page__Group_9__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1488:1: ( ( rule__Page__Group_9__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1488:1: ( ( rule__Page__Group_9__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1489:1: ( rule__Page__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_9()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1490:1: ( rule__Page__Group_9__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1490:2: rule__Page__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_9__0_in_rule__Page__Group__9__Impl2940);
                    rule__Page__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup_9()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1500:1: rule__Page__Group__10 : rule__Page__Group__10__Impl rule__Page__Group__11 ;
    public final void rule__Page__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1504:1: ( rule__Page__Group__10__Impl rule__Page__Group__11 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1505:2: rule__Page__Group__10__Impl rule__Page__Group__11
            {
            pushFollow(FOLLOW_rule__Page__Group__10__Impl_in_rule__Page__Group__102971);
            rule__Page__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__11_in_rule__Page__Group__102974);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1512:1: rule__Page__Group__10__Impl : ( ( rule__Page__Group_10__0 )? ) ;
    public final void rule__Page__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1516:1: ( ( ( rule__Page__Group_10__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1517:1: ( ( rule__Page__Group_10__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1517:1: ( ( rule__Page__Group_10__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1518:1: ( rule__Page__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_10()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1519:1: ( rule__Page__Group_10__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1519:2: rule__Page__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_10__0_in_rule__Page__Group__10__Impl3001);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1529:1: rule__Page__Group__11 : rule__Page__Group__11__Impl rule__Page__Group__12 ;
    public final void rule__Page__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1533:1: ( rule__Page__Group__11__Impl rule__Page__Group__12 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1534:2: rule__Page__Group__11__Impl rule__Page__Group__12
            {
            pushFollow(FOLLOW_rule__Page__Group__11__Impl_in_rule__Page__Group__113032);
            rule__Page__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__12_in_rule__Page__Group__113035);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1541:1: rule__Page__Group__11__Impl : ( ( rule__Page__Group_11__0 )? ) ;
    public final void rule__Page__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1545:1: ( ( ( rule__Page__Group_11__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1546:1: ( ( rule__Page__Group_11__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1546:1: ( ( rule__Page__Group_11__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1547:1: ( rule__Page__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_11()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1548:1: ( rule__Page__Group_11__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1548:2: rule__Page__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_11__0_in_rule__Page__Group__11__Impl3062);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1558:1: rule__Page__Group__12 : rule__Page__Group__12__Impl rule__Page__Group__13 ;
    public final void rule__Page__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1562:1: ( rule__Page__Group__12__Impl rule__Page__Group__13 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1563:2: rule__Page__Group__12__Impl rule__Page__Group__13
            {
            pushFollow(FOLLOW_rule__Page__Group__12__Impl_in_rule__Page__Group__123093);
            rule__Page__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__13_in_rule__Page__Group__123096);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1570:1: rule__Page__Group__12__Impl : ( ( rule__Page__Group_12__0 )? ) ;
    public final void rule__Page__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1574:1: ( ( ( rule__Page__Group_12__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1575:1: ( ( rule__Page__Group_12__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1575:1: ( ( rule__Page__Group_12__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1576:1: ( rule__Page__Group_12__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_12()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1577:1: ( rule__Page__Group_12__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1577:2: rule__Page__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_12__0_in_rule__Page__Group__12__Impl3123);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1587:1: rule__Page__Group__13 : rule__Page__Group__13__Impl ;
    public final void rule__Page__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1591:1: ( rule__Page__Group__13__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1592:2: rule__Page__Group__13__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group__13__Impl_in_rule__Page__Group__133154);
            rule__Page__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1598:1: rule__Page__Group__13__Impl : ( '}' ) ;
    public final void rule__Page__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1602:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1603:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1603:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1604:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_13()); 
            }
            match(input,16,FOLLOW_16_in_rule__Page__Group__13__Impl3182); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_13()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Page__Group_4__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1645:1: rule__Page__Group_4__0 : rule__Page__Group_4__0__Impl rule__Page__Group_4__1 ;
    public final void rule__Page__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1649:1: ( rule__Page__Group_4__0__Impl rule__Page__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1650:2: rule__Page__Group_4__0__Impl rule__Page__Group_4__1
            {
            pushFollow(FOLLOW_rule__Page__Group_4__0__Impl_in_rule__Page__Group_4__03241);
            rule__Page__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_4__1_in_rule__Page__Group_4__03244);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1657:1: rule__Page__Group_4__0__Impl : ( 'model' ) ;
    public final void rule__Page__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1661:1: ( ( 'model' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1662:1: ( 'model' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1662:1: ( 'model' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1663:1: 'model'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getModelKeyword_4_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__Page__Group_4__0__Impl3272); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getModelKeyword_4_0()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1676:1: rule__Page__Group_4__1 : rule__Page__Group_4__1__Impl rule__Page__Group_4__2 ;
    public final void rule__Page__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1680:1: ( rule__Page__Group_4__1__Impl rule__Page__Group_4__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1681:2: rule__Page__Group_4__1__Impl rule__Page__Group_4__2
            {
            pushFollow(FOLLOW_rule__Page__Group_4__1__Impl_in_rule__Page__Group_4__13303);
            rule__Page__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_4__2_in_rule__Page__Group_4__13306);
            rule__Page__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1688:1: rule__Page__Group_4__1__Impl : ( 'type' ) ;
    public final void rule__Page__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1692:1: ( ( 'type' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1693:1: ( 'type' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1693:1: ( 'type' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1694:1: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTypeKeyword_4_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__Page__Group_4__1__Impl3334); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getTypeKeyword_4_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Page__Group_4__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1707:1: rule__Page__Group_4__2 : rule__Page__Group_4__2__Impl ;
    public final void rule__Page__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1711:1: ( rule__Page__Group_4__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1712:2: rule__Page__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_4__2__Impl_in_rule__Page__Group_4__23365);
            rule__Page__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_4__2"


    // $ANTLR start "rule__Page__Group_4__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1718:1: rule__Page__Group_4__2__Impl : ( ( rule__Page__ModelTypeAssignment_4_2 ) ) ;
    public final void rule__Page__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1722:1: ( ( ( rule__Page__ModelTypeAssignment_4_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1723:1: ( ( rule__Page__ModelTypeAssignment_4_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1723:1: ( ( rule__Page__ModelTypeAssignment_4_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1724:1: ( rule__Page__ModelTypeAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getModelTypeAssignment_4_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1725:1: ( rule__Page__ModelTypeAssignment_4_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1725:2: rule__Page__ModelTypeAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Page__ModelTypeAssignment_4_2_in_rule__Page__Group_4__2__Impl3392);
            rule__Page__ModelTypeAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getModelTypeAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_4__2__Impl"


    // $ANTLR start "rule__Page__Group_5__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1741:1: rule__Page__Group_5__0 : rule__Page__Group_5__0__Impl rule__Page__Group_5__1 ;
    public final void rule__Page__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1745:1: ( rule__Page__Group_5__0__Impl rule__Page__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1746:2: rule__Page__Group_5__0__Impl rule__Page__Group_5__1
            {
            pushFollow(FOLLOW_rule__Page__Group_5__0__Impl_in_rule__Page__Group_5__03428);
            rule__Page__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_5__1_in_rule__Page__Group_5__03431);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1753:1: rule__Page__Group_5__0__Impl : ( 'id' ) ;
    public final void rule__Page__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1757:1: ( ( 'id' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1758:1: ( 'id' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1758:1: ( 'id' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1759:1: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getIdKeyword_5_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Page__Group_5__0__Impl3459); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getIdKeyword_5_0()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1772:1: rule__Page__Group_5__1 : rule__Page__Group_5__1__Impl ;
    public final void rule__Page__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1776:1: ( rule__Page__Group_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1777:2: rule__Page__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_5__1__Impl_in_rule__Page__Group_5__13490);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1783:1: rule__Page__Group_5__1__Impl : ( ( rule__Page__ActivityExplorerItemIDAssignment_5_1 ) ) ;
    public final void rule__Page__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1787:1: ( ( ( rule__Page__ActivityExplorerItemIDAssignment_5_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1788:1: ( ( rule__Page__ActivityExplorerItemIDAssignment_5_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1788:1: ( ( rule__Page__ActivityExplorerItemIDAssignment_5_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1789:1: ( rule__Page__ActivityExplorerItemIDAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getActivityExplorerItemIDAssignment_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1790:1: ( rule__Page__ActivityExplorerItemIDAssignment_5_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1790:2: rule__Page__ActivityExplorerItemIDAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Page__ActivityExplorerItemIDAssignment_5_1_in_rule__Page__Group_5__1__Impl3517);
            rule__Page__ActivityExplorerItemIDAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getActivityExplorerItemIDAssignment_5_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Page__Group_9__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1804:1: rule__Page__Group_9__0 : rule__Page__Group_9__0__Impl rule__Page__Group_9__1 ;
    public final void rule__Page__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1808:1: ( rule__Page__Group_9__0__Impl rule__Page__Group_9__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1809:2: rule__Page__Group_9__0__Impl rule__Page__Group_9__1
            {
            pushFollow(FOLLOW_rule__Page__Group_9__0__Impl_in_rule__Page__Group_9__03551);
            rule__Page__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_9__1_in_rule__Page__Group_9__03554);
            rule__Page__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9__0"


    // $ANTLR start "rule__Page__Group_9__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1816:1: rule__Page__Group_9__0__Impl : ( 'header' ) ;
    public final void rule__Page__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1820:1: ( ( 'header' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1821:1: ( 'header' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1821:1: ( 'header' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1822:1: 'header'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getHeaderKeyword_9_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Page__Group_9__0__Impl3582); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getHeaderKeyword_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9__0__Impl"


    // $ANTLR start "rule__Page__Group_9__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1835:1: rule__Page__Group_9__1 : rule__Page__Group_9__1__Impl rule__Page__Group_9__2 ;
    public final void rule__Page__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1839:1: ( rule__Page__Group_9__1__Impl rule__Page__Group_9__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1840:2: rule__Page__Group_9__1__Impl rule__Page__Group_9__2
            {
            pushFollow(FOLLOW_rule__Page__Group_9__1__Impl_in_rule__Page__Group_9__13613);
            rule__Page__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_9__2_in_rule__Page__Group_9__13616);
            rule__Page__Group_9__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9__1"


    // $ANTLR start "rule__Page__Group_9__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1847:1: rule__Page__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Page__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1851:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1852:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1852:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1853:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_9_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__Page__Group_9__1__Impl3644); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_9_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9__1__Impl"


    // $ANTLR start "rule__Page__Group_9__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1866:1: rule__Page__Group_9__2 : rule__Page__Group_9__2__Impl rule__Page__Group_9__3 ;
    public final void rule__Page__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1870:1: ( rule__Page__Group_9__2__Impl rule__Page__Group_9__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1871:2: rule__Page__Group_9__2__Impl rule__Page__Group_9__3
            {
            pushFollow(FOLLOW_rule__Page__Group_9__2__Impl_in_rule__Page__Group_9__23675);
            rule__Page__Group_9__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_9__3_in_rule__Page__Group_9__23678);
            rule__Page__Group_9__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9__2"


    // $ANTLR start "rule__Page__Group_9__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1878:1: rule__Page__Group_9__2__Impl : ( ( rule__Page__Group_9_2__0 )? ) ;
    public final void rule__Page__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1882:1: ( ( ( rule__Page__Group_9_2__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1883:1: ( ( rule__Page__Group_9_2__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1883:1: ( ( rule__Page__Group_9_2__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1884:1: ( rule__Page__Group_9_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_9_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1885:1: ( rule__Page__Group_9_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==27) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1885:2: rule__Page__Group_9_2__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_9_2__0_in_rule__Page__Group_9__2__Impl3705);
                    rule__Page__Group_9_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup_9_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9__2__Impl"


    // $ANTLR start "rule__Page__Group_9__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1895:1: rule__Page__Group_9__3 : rule__Page__Group_9__3__Impl rule__Page__Group_9__4 ;
    public final void rule__Page__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1899:1: ( rule__Page__Group_9__3__Impl rule__Page__Group_9__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1900:2: rule__Page__Group_9__3__Impl rule__Page__Group_9__4
            {
            pushFollow(FOLLOW_rule__Page__Group_9__3__Impl_in_rule__Page__Group_9__33736);
            rule__Page__Group_9__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_9__4_in_rule__Page__Group_9__33739);
            rule__Page__Group_9__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9__3"


    // $ANTLR start "rule__Page__Group_9__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1907:1: rule__Page__Group_9__3__Impl : ( ( rule__Page__Group_9_3__0 )? ) ;
    public final void rule__Page__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1911:1: ( ( ( rule__Page__Group_9_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1912:1: ( ( rule__Page__Group_9_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1912:1: ( ( rule__Page__Group_9_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1913:1: ( rule__Page__Group_9_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_9_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1914:1: ( rule__Page__Group_9_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1914:2: rule__Page__Group_9_3__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_9_3__0_in_rule__Page__Group_9__3__Impl3766);
                    rule__Page__Group_9_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup_9_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9__3__Impl"


    // $ANTLR start "rule__Page__Group_9__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1924:1: rule__Page__Group_9__4 : rule__Page__Group_9__4__Impl ;
    public final void rule__Page__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1928:1: ( rule__Page__Group_9__4__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1929:2: rule__Page__Group_9__4__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_9__4__Impl_in_rule__Page__Group_9__43797);
            rule__Page__Group_9__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9__4"


    // $ANTLR start "rule__Page__Group_9__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1935:1: rule__Page__Group_9__4__Impl : ( '}' ) ;
    public final void rule__Page__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1939:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1940:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1940:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1941:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_9_4()); 
            }
            match(input,16,FOLLOW_16_in_rule__Page__Group_9__4__Impl3825); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_9_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9__4__Impl"


    // $ANTLR start "rule__Page__Group_9_2__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1964:1: rule__Page__Group_9_2__0 : rule__Page__Group_9_2__0__Impl rule__Page__Group_9_2__1 ;
    public final void rule__Page__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1968:1: ( rule__Page__Group_9_2__0__Impl rule__Page__Group_9_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1969:2: rule__Page__Group_9_2__0__Impl rule__Page__Group_9_2__1
            {
            pushFollow(FOLLOW_rule__Page__Group_9_2__0__Impl_in_rule__Page__Group_9_2__03866);
            rule__Page__Group_9_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_9_2__1_in_rule__Page__Group_9_2__03869);
            rule__Page__Group_9_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9_2__0"


    // $ANTLR start "rule__Page__Group_9_2__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1976:1: rule__Page__Group_9_2__0__Impl : ( 'image' ) ;
    public final void rule__Page__Group_9_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1980:1: ( ( 'image' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1981:1: ( 'image' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1981:1: ( 'image' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1982:1: 'image'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImageKeyword_9_2_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Page__Group_9_2__0__Impl3897); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImageKeyword_9_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9_2__0__Impl"


    // $ANTLR start "rule__Page__Group_9_2__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1995:1: rule__Page__Group_9_2__1 : rule__Page__Group_9_2__1__Impl rule__Page__Group_9_2__2 ;
    public final void rule__Page__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1999:1: ( rule__Page__Group_9_2__1__Impl rule__Page__Group_9_2__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2000:2: rule__Page__Group_9_2__1__Impl rule__Page__Group_9_2__2
            {
            pushFollow(FOLLOW_rule__Page__Group_9_2__1__Impl_in_rule__Page__Group_9_2__13928);
            rule__Page__Group_9_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_9_2__2_in_rule__Page__Group_9_2__13931);
            rule__Page__Group_9_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9_2__1"


    // $ANTLR start "rule__Page__Group_9_2__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2007:1: rule__Page__Group_9_2__1__Impl : ( 'on' ) ;
    public final void rule__Page__Group_9_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2011:1: ( ( 'on' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2012:1: ( 'on' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2012:1: ( 'on' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2013:1: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOnKeyword_9_2_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__Page__Group_9_2__1__Impl3959); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getOnKeyword_9_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9_2__1__Impl"


    // $ANTLR start "rule__Page__Group_9_2__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2026:1: rule__Page__Group_9_2__2 : rule__Page__Group_9_2__2__Impl rule__Page__Group_9_2__3 ;
    public final void rule__Page__Group_9_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2030:1: ( rule__Page__Group_9_2__2__Impl rule__Page__Group_9_2__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2031:2: rule__Page__Group_9_2__2__Impl rule__Page__Group_9_2__3
            {
            pushFollow(FOLLOW_rule__Page__Group_9_2__2__Impl_in_rule__Page__Group_9_2__23990);
            rule__Page__Group_9_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_9_2__3_in_rule__Page__Group_9_2__23993);
            rule__Page__Group_9_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9_2__2"


    // $ANTLR start "rule__Page__Group_9_2__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2038:1: rule__Page__Group_9_2__2__Impl : ( ':' ) ;
    public final void rule__Page__Group_9_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2042:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2043:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2043:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2044:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getColonKeyword_9_2_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Page__Group_9_2__2__Impl4021); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getColonKeyword_9_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9_2__2__Impl"


    // $ANTLR start "rule__Page__Group_9_2__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2057:1: rule__Page__Group_9_2__3 : rule__Page__Group_9_2__3__Impl ;
    public final void rule__Page__Group_9_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2061:1: ( rule__Page__Group_9_2__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2062:2: rule__Page__Group_9_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_9_2__3__Impl_in_rule__Page__Group_9_2__34052);
            rule__Page__Group_9_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9_2__3"


    // $ANTLR start "rule__Page__Group_9_2__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2068:1: rule__Page__Group_9_2__3__Impl : ( ( rule__Page__ImagePathOnAssignment_9_2_3 ) ) ;
    public final void rule__Page__Group_9_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2072:1: ( ( ( rule__Page__ImagePathOnAssignment_9_2_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2073:1: ( ( rule__Page__ImagePathOnAssignment_9_2_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2073:1: ( ( rule__Page__ImagePathOnAssignment_9_2_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2074:1: ( rule__Page__ImagePathOnAssignment_9_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImagePathOnAssignment_9_2_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2075:1: ( rule__Page__ImagePathOnAssignment_9_2_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2075:2: rule__Page__ImagePathOnAssignment_9_2_3
            {
            pushFollow(FOLLOW_rule__Page__ImagePathOnAssignment_9_2_3_in_rule__Page__Group_9_2__3__Impl4079);
            rule__Page__ImagePathOnAssignment_9_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImagePathOnAssignment_9_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9_2__3__Impl"


    // $ANTLR start "rule__Page__Group_9_3__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2093:1: rule__Page__Group_9_3__0 : rule__Page__Group_9_3__0__Impl rule__Page__Group_9_3__1 ;
    public final void rule__Page__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2097:1: ( rule__Page__Group_9_3__0__Impl rule__Page__Group_9_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2098:2: rule__Page__Group_9_3__0__Impl rule__Page__Group_9_3__1
            {
            pushFollow(FOLLOW_rule__Page__Group_9_3__0__Impl_in_rule__Page__Group_9_3__04117);
            rule__Page__Group_9_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_9_3__1_in_rule__Page__Group_9_3__04120);
            rule__Page__Group_9_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9_3__0"


    // $ANTLR start "rule__Page__Group_9_3__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2105:1: rule__Page__Group_9_3__0__Impl : ( 'image' ) ;
    public final void rule__Page__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2109:1: ( ( 'image' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2110:1: ( 'image' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2110:1: ( 'image' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2111:1: 'image'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImageKeyword_9_3_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Page__Group_9_3__0__Impl4148); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImageKeyword_9_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9_3__0__Impl"


    // $ANTLR start "rule__Page__Group_9_3__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2124:1: rule__Page__Group_9_3__1 : rule__Page__Group_9_3__1__Impl rule__Page__Group_9_3__2 ;
    public final void rule__Page__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2128:1: ( rule__Page__Group_9_3__1__Impl rule__Page__Group_9_3__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2129:2: rule__Page__Group_9_3__1__Impl rule__Page__Group_9_3__2
            {
            pushFollow(FOLLOW_rule__Page__Group_9_3__1__Impl_in_rule__Page__Group_9_3__14179);
            rule__Page__Group_9_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_9_3__2_in_rule__Page__Group_9_3__14182);
            rule__Page__Group_9_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9_3__1"


    // $ANTLR start "rule__Page__Group_9_3__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2136:1: rule__Page__Group_9_3__1__Impl : ( 'off' ) ;
    public final void rule__Page__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2140:1: ( ( 'off' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2141:1: ( 'off' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2141:1: ( 'off' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2142:1: 'off'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOffKeyword_9_3_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__Page__Group_9_3__1__Impl4210); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getOffKeyword_9_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9_3__1__Impl"


    // $ANTLR start "rule__Page__Group_9_3__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2155:1: rule__Page__Group_9_3__2 : rule__Page__Group_9_3__2__Impl rule__Page__Group_9_3__3 ;
    public final void rule__Page__Group_9_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2159:1: ( rule__Page__Group_9_3__2__Impl rule__Page__Group_9_3__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2160:2: rule__Page__Group_9_3__2__Impl rule__Page__Group_9_3__3
            {
            pushFollow(FOLLOW_rule__Page__Group_9_3__2__Impl_in_rule__Page__Group_9_3__24241);
            rule__Page__Group_9_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_9_3__3_in_rule__Page__Group_9_3__24244);
            rule__Page__Group_9_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9_3__2"


    // $ANTLR start "rule__Page__Group_9_3__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2167:1: rule__Page__Group_9_3__2__Impl : ( ':' ) ;
    public final void rule__Page__Group_9_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2171:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2172:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2172:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2173:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getColonKeyword_9_3_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Page__Group_9_3__2__Impl4272); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getColonKeyword_9_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9_3__2__Impl"


    // $ANTLR start "rule__Page__Group_9_3__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2186:1: rule__Page__Group_9_3__3 : rule__Page__Group_9_3__3__Impl ;
    public final void rule__Page__Group_9_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2190:1: ( rule__Page__Group_9_3__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2191:2: rule__Page__Group_9_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_9_3__3__Impl_in_rule__Page__Group_9_3__34303);
            rule__Page__Group_9_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9_3__3"


    // $ANTLR start "rule__Page__Group_9_3__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2197:1: rule__Page__Group_9_3__3__Impl : ( ( rule__Page__ImagePathOffAssignment_9_3_3 ) ) ;
    public final void rule__Page__Group_9_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2201:1: ( ( ( rule__Page__ImagePathOffAssignment_9_3_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2202:1: ( ( rule__Page__ImagePathOffAssignment_9_3_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2202:1: ( ( rule__Page__ImagePathOffAssignment_9_3_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2203:1: ( rule__Page__ImagePathOffAssignment_9_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImagePathOffAssignment_9_3_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2204:1: ( rule__Page__ImagePathOffAssignment_9_3_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2204:2: rule__Page__ImagePathOffAssignment_9_3_3
            {
            pushFollow(FOLLOW_rule__Page__ImagePathOffAssignment_9_3_3_in_rule__Page__Group_9_3__3__Impl4330);
            rule__Page__ImagePathOffAssignment_9_3_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImagePathOffAssignment_9_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9_3__3__Impl"


    // $ANTLR start "rule__Page__Group_10__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2222:1: rule__Page__Group_10__0 : rule__Page__Group_10__0__Impl rule__Page__Group_10__1 ;
    public final void rule__Page__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2226:1: ( rule__Page__Group_10__0__Impl rule__Page__Group_10__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2227:2: rule__Page__Group_10__0__Impl rule__Page__Group_10__1
            {
            pushFollow(FOLLOW_rule__Page__Group_10__0__Impl_in_rule__Page__Group_10__04368);
            rule__Page__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_10__1_in_rule__Page__Group_10__04371);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2234:1: rule__Page__Group_10__0__Impl : ( 'tab' ) ;
    public final void rule__Page__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2238:1: ( ( 'tab' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2239:1: ( 'tab' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2239:1: ( 'tab' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2240:1: 'tab'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTabKeyword_10_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Page__Group_10__0__Impl4399); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getTabKeyword_10_0()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2253:1: rule__Page__Group_10__1 : rule__Page__Group_10__1__Impl rule__Page__Group_10__2 ;
    public final void rule__Page__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2257:1: ( rule__Page__Group_10__1__Impl rule__Page__Group_10__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2258:2: rule__Page__Group_10__1__Impl rule__Page__Group_10__2
            {
            pushFollow(FOLLOW_rule__Page__Group_10__1__Impl_in_rule__Page__Group_10__14430);
            rule__Page__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_10__2_in_rule__Page__Group_10__14433);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2265:1: rule__Page__Group_10__1__Impl : ( 'name' ) ;
    public final void rule__Page__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2269:1: ( ( 'name' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2270:1: ( 'name' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2270:1: ( 'name' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2271:1: 'name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getNameKeyword_10_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__Page__Group_10__1__Impl4461); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getNameKeyword_10_1()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2284:1: rule__Page__Group_10__2 : rule__Page__Group_10__2__Impl ;
    public final void rule__Page__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2288:1: ( rule__Page__Group_10__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2289:2: rule__Page__Group_10__2__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_10__2__Impl_in_rule__Page__Group_10__24492);
            rule__Page__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2295:1: rule__Page__Group_10__2__Impl : ( ( rule__Page__TabNameAssignment_10_2 ) ) ;
    public final void rule__Page__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2299:1: ( ( ( rule__Page__TabNameAssignment_10_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2300:1: ( ( rule__Page__TabNameAssignment_10_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2300:1: ( ( rule__Page__TabNameAssignment_10_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2301:1: ( rule__Page__TabNameAssignment_10_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTabNameAssignment_10_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2302:1: ( rule__Page__TabNameAssignment_10_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2302:2: rule__Page__TabNameAssignment_10_2
            {
            pushFollow(FOLLOW_rule__Page__TabNameAssignment_10_2_in_rule__Page__Group_10__2__Impl4519);
            rule__Page__TabNameAssignment_10_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getTabNameAssignment_10_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Page__Group_11__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2318:1: rule__Page__Group_11__0 : rule__Page__Group_11__0__Impl rule__Page__Group_11__1 ;
    public final void rule__Page__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2322:1: ( rule__Page__Group_11__0__Impl rule__Page__Group_11__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2323:2: rule__Page__Group_11__0__Impl rule__Page__Group_11__1
            {
            pushFollow(FOLLOW_rule__Page__Group_11__0__Impl_in_rule__Page__Group_11__04555);
            rule__Page__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_11__1_in_rule__Page__Group_11__04558);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2330:1: rule__Page__Group_11__0__Impl : ( 'predicated' ) ;
    public final void rule__Page__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2334:1: ( ( 'predicated' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2335:1: ( 'predicated' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2335:1: ( 'predicated' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2336:1: 'predicated'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPredicatedKeyword_11_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Page__Group_11__0__Impl4586); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getPredicatedKeyword_11_0()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2349:1: rule__Page__Group_11__1 : rule__Page__Group_11__1__Impl rule__Page__Group_11__2 ;
    public final void rule__Page__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2353:1: ( rule__Page__Group_11__1__Impl rule__Page__Group_11__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2354:2: rule__Page__Group_11__1__Impl rule__Page__Group_11__2
            {
            pushFollow(FOLLOW_rule__Page__Group_11__1__Impl_in_rule__Page__Group_11__14617);
            rule__Page__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_11__2_in_rule__Page__Group_11__14620);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2361:1: rule__Page__Group_11__1__Impl : ( ':' ) ;
    public final void rule__Page__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2365:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2366:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2366:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2367:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getColonKeyword_11_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Page__Group_11__1__Impl4648); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getColonKeyword_11_1()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2380:1: rule__Page__Group_11__2 : rule__Page__Group_11__2__Impl ;
    public final void rule__Page__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2384:1: ( rule__Page__Group_11__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2385:2: rule__Page__Group_11__2__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_11__2__Impl_in_rule__Page__Group_11__24679);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2391:1: rule__Page__Group_11__2__Impl : ( ( rule__Page__HasPredicateAssignment_11_2 ) ) ;
    public final void rule__Page__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2395:1: ( ( ( rule__Page__HasPredicateAssignment_11_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2396:1: ( ( rule__Page__HasPredicateAssignment_11_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2396:1: ( ( rule__Page__HasPredicateAssignment_11_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2397:1: ( rule__Page__HasPredicateAssignment_11_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getHasPredicateAssignment_11_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2398:1: ( rule__Page__HasPredicateAssignment_11_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2398:2: rule__Page__HasPredicateAssignment_11_2
            {
            pushFollow(FOLLOW_rule__Page__HasPredicateAssignment_11_2_in_rule__Page__Group_11__2__Impl4706);
            rule__Page__HasPredicateAssignment_11_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getHasPredicateAssignment_11_2()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2414:1: rule__Page__Group_12__0 : rule__Page__Group_12__0__Impl rule__Page__Group_12__1 ;
    public final void rule__Page__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2418:1: ( rule__Page__Group_12__0__Impl rule__Page__Group_12__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2419:2: rule__Page__Group_12__0__Impl rule__Page__Group_12__1
            {
            pushFollow(FOLLOW_rule__Page__Group_12__0__Impl_in_rule__Page__Group_12__04742);
            rule__Page__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_12__1_in_rule__Page__Group_12__04745);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2426:1: rule__Page__Group_12__0__Impl : ( 'show' ) ;
    public final void rule__Page__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2430:1: ( ( 'show' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2431:1: ( 'show' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2431:1: ( 'show' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2432:1: 'show'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getShowKeyword_12_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Page__Group_12__0__Impl4773); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getShowKeyword_12_0()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2445:1: rule__Page__Group_12__1 : rule__Page__Group_12__1__Impl rule__Page__Group_12__2 ;
    public final void rule__Page__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2449:1: ( rule__Page__Group_12__1__Impl rule__Page__Group_12__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2450:2: rule__Page__Group_12__1__Impl rule__Page__Group_12__2
            {
            pushFollow(FOLLOW_rule__Page__Group_12__1__Impl_in_rule__Page__Group_12__14804);
            rule__Page__Group_12__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_12__2_in_rule__Page__Group_12__14807);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2457:1: rule__Page__Group_12__1__Impl : ( 'viewer' ) ;
    public final void rule__Page__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2461:1: ( ( 'viewer' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2462:1: ( 'viewer' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2462:1: ( 'viewer' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2463:1: 'viewer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getViewerKeyword_12_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__Page__Group_12__1__Impl4835); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getViewerKeyword_12_1()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2476:1: rule__Page__Group_12__2 : rule__Page__Group_12__2__Impl rule__Page__Group_12__3 ;
    public final void rule__Page__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2480:1: ( rule__Page__Group_12__2__Impl rule__Page__Group_12__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2481:2: rule__Page__Group_12__2__Impl rule__Page__Group_12__3
            {
            pushFollow(FOLLOW_rule__Page__Group_12__2__Impl_in_rule__Page__Group_12__24866);
            rule__Page__Group_12__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_12__3_in_rule__Page__Group_12__24869);
            rule__Page__Group_12__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2488:1: rule__Page__Group_12__2__Impl : ( ':' ) ;
    public final void rule__Page__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2492:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2493:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2493:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2494:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getColonKeyword_12_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Page__Group_12__2__Impl4897); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getColonKeyword_12_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Page__Group_12__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2507:1: rule__Page__Group_12__3 : rule__Page__Group_12__3__Impl ;
    public final void rule__Page__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2511:1: ( rule__Page__Group_12__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2512:2: rule__Page__Group_12__3__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_12__3__Impl_in_rule__Page__Group_12__34928);
            rule__Page__Group_12__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_12__3"


    // $ANTLR start "rule__Page__Group_12__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2518:1: rule__Page__Group_12__3__Impl : ( ( rule__Page__ShowViewerAssignment_12_3 ) ) ;
    public final void rule__Page__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2522:1: ( ( ( rule__Page__ShowViewerAssignment_12_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2523:1: ( ( rule__Page__ShowViewerAssignment_12_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2523:1: ( ( rule__Page__ShowViewerAssignment_12_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2524:1: ( rule__Page__ShowViewerAssignment_12_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getShowViewerAssignment_12_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2525:1: ( rule__Page__ShowViewerAssignment_12_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2525:2: rule__Page__ShowViewerAssignment_12_3
            {
            pushFollow(FOLLOW_rule__Page__ShowViewerAssignment_12_3_in_rule__Page__Group_12__3__Impl4955);
            rule__Page__ShowViewerAssignment_12_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getShowViewerAssignment_12_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_12__3__Impl"


    // $ANTLR start "rule__Overview__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2543:1: rule__Overview__Group__0 : rule__Overview__Group__0__Impl rule__Overview__Group__1 ;
    public final void rule__Overview__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2547:1: ( rule__Overview__Group__0__Impl rule__Overview__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2548:2: rule__Overview__Group__0__Impl rule__Overview__Group__1
            {
            pushFollow(FOLLOW_rule__Overview__Group__0__Impl_in_rule__Overview__Group__04993);
            rule__Overview__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__1_in_rule__Overview__Group__04996);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2555:1: rule__Overview__Group__0__Impl : ( () ) ;
    public final void rule__Overview__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2559:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2560:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2560:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2561:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getOverviewAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2562:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2564:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2574:1: rule__Overview__Group__1 : rule__Overview__Group__1__Impl rule__Overview__Group__2 ;
    public final void rule__Overview__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2578:1: ( rule__Overview__Group__1__Impl rule__Overview__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2579:2: rule__Overview__Group__1__Impl rule__Overview__Group__2
            {
            pushFollow(FOLLOW_rule__Overview__Group__1__Impl_in_rule__Overview__Group__15054);
            rule__Overview__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__2_in_rule__Overview__Group__15057);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2586:1: rule__Overview__Group__1__Impl : ( 'Overview' ) ;
    public final void rule__Overview__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2590:1: ( ( 'Overview' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2591:1: ( 'Overview' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2591:1: ( 'Overview' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2592:1: 'Overview'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getOverviewKeyword_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__Overview__Group__1__Impl5085); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2605:1: rule__Overview__Group__2 : rule__Overview__Group__2__Impl rule__Overview__Group__3 ;
    public final void rule__Overview__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2609:1: ( rule__Overview__Group__2__Impl rule__Overview__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2610:2: rule__Overview__Group__2__Impl rule__Overview__Group__3
            {
            pushFollow(FOLLOW_rule__Overview__Group__2__Impl_in_rule__Overview__Group__25116);
            rule__Overview__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__3_in_rule__Overview__Group__25119);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2617:1: rule__Overview__Group__2__Impl : ( '{' ) ;
    public final void rule__Overview__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2621:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2622:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2622:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2623:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,15,FOLLOW_15_in_rule__Overview__Group__2__Impl5147); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2636:1: rule__Overview__Group__3 : rule__Overview__Group__3__Impl rule__Overview__Group__4 ;
    public final void rule__Overview__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2640:1: ( rule__Overview__Group__3__Impl rule__Overview__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2641:2: rule__Overview__Group__3__Impl rule__Overview__Group__4
            {
            pushFollow(FOLLOW_rule__Overview__Group__3__Impl_in_rule__Overview__Group__35178);
            rule__Overview__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__4_in_rule__Overview__Group__35181);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2648:1: rule__Overview__Group__3__Impl : ( ( rule__Overview__Group_3__0 )? ) ;
    public final void rule__Overview__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2652:1: ( ( ( rule__Overview__Group_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2653:1: ( ( rule__Overview__Group_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2653:1: ( ( rule__Overview__Group_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2654:1: ( rule__Overview__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2655:1: ( rule__Overview__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2655:2: rule__Overview__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Overview__Group_3__0_in_rule__Overview__Group__3__Impl5208);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2665:1: rule__Overview__Group__4 : rule__Overview__Group__4__Impl rule__Overview__Group__5 ;
    public final void rule__Overview__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2669:1: ( rule__Overview__Group__4__Impl rule__Overview__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2670:2: rule__Overview__Group__4__Impl rule__Overview__Group__5
            {
            pushFollow(FOLLOW_rule__Overview__Group__4__Impl_in_rule__Overview__Group__45239);
            rule__Overview__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__5_in_rule__Overview__Group__45242);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2677:1: rule__Overview__Group__4__Impl : ( ( rule__Overview__Group_4__0 )? ) ;
    public final void rule__Overview__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2681:1: ( ( ( rule__Overview__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2682:1: ( ( rule__Overview__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2682:1: ( ( rule__Overview__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2683:1: ( rule__Overview__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2684:1: ( rule__Overview__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==27) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2684:2: rule__Overview__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Overview__Group_4__0_in_rule__Overview__Group__4__Impl5269);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2694:1: rule__Overview__Group__5 : rule__Overview__Group__5__Impl rule__Overview__Group__6 ;
    public final void rule__Overview__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2698:1: ( rule__Overview__Group__5__Impl rule__Overview__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2699:2: rule__Overview__Group__5__Impl rule__Overview__Group__6
            {
            pushFollow(FOLLOW_rule__Overview__Group__5__Impl_in_rule__Overview__Group__55300);
            rule__Overview__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__6_in_rule__Overview__Group__55303);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2706:1: rule__Overview__Group__5__Impl : ( ( rule__Overview__Group_5__0 )? ) ;
    public final void rule__Overview__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2710:1: ( ( ( rule__Overview__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2711:1: ( ( rule__Overview__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2711:1: ( ( rule__Overview__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2712:1: ( rule__Overview__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2713:1: ( rule__Overview__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2713:2: rule__Overview__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Overview__Group_5__0_in_rule__Overview__Group__5__Impl5330);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2723:1: rule__Overview__Group__6 : rule__Overview__Group__6__Impl ;
    public final void rule__Overview__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2727:1: ( rule__Overview__Group__6__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2728:2: rule__Overview__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Overview__Group__6__Impl_in_rule__Overview__Group__65361);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2734:1: rule__Overview__Group__6__Impl : ( '}' ) ;
    public final void rule__Overview__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2738:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2739:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2739:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2740:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,16,FOLLOW_16_in_rule__Overview__Group__6__Impl5389); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2767:1: rule__Overview__Group_3__0 : rule__Overview__Group_3__0__Impl rule__Overview__Group_3__1 ;
    public final void rule__Overview__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2771:1: ( rule__Overview__Group_3__0__Impl rule__Overview__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2772:2: rule__Overview__Group_3__0__Impl rule__Overview__Group_3__1
            {
            pushFollow(FOLLOW_rule__Overview__Group_3__0__Impl_in_rule__Overview__Group_3__05434);
            rule__Overview__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_3__1_in_rule__Overview__Group_3__05437);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2779:1: rule__Overview__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Overview__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2783:1: ( ( 'description' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2784:1: ( 'description' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2784:1: ( 'description' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2785:1: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getDescriptionKeyword_3_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Overview__Group_3__0__Impl5465); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2798:1: rule__Overview__Group_3__1 : rule__Overview__Group_3__1__Impl ;
    public final void rule__Overview__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2802:1: ( rule__Overview__Group_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2803:2: rule__Overview__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Overview__Group_3__1__Impl_in_rule__Overview__Group_3__15496);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2809:1: rule__Overview__Group_3__1__Impl : ( ( rule__Overview__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Overview__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2813:1: ( ( ( rule__Overview__DescriptionAssignment_3_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2814:1: ( ( rule__Overview__DescriptionAssignment_3_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2814:1: ( ( rule__Overview__DescriptionAssignment_3_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2815:1: ( rule__Overview__DescriptionAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getDescriptionAssignment_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2816:1: ( rule__Overview__DescriptionAssignment_3_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2816:2: rule__Overview__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Overview__DescriptionAssignment_3_1_in_rule__Overview__Group_3__1__Impl5523);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2830:1: rule__Overview__Group_4__0 : rule__Overview__Group_4__0__Impl rule__Overview__Group_4__1 ;
    public final void rule__Overview__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2834:1: ( rule__Overview__Group_4__0__Impl rule__Overview__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2835:2: rule__Overview__Group_4__0__Impl rule__Overview__Group_4__1
            {
            pushFollow(FOLLOW_rule__Overview__Group_4__0__Impl_in_rule__Overview__Group_4__05557);
            rule__Overview__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_4__1_in_rule__Overview__Group_4__05560);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2842:1: rule__Overview__Group_4__0__Impl : ( 'image' ) ;
    public final void rule__Overview__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2846:1: ( ( 'image' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2847:1: ( 'image' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2847:1: ( 'image' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2848:1: 'image'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImageKeyword_4_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Overview__Group_4__0__Impl5588); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2861:1: rule__Overview__Group_4__1 : rule__Overview__Group_4__1__Impl rule__Overview__Group_4__2 ;
    public final void rule__Overview__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2865:1: ( rule__Overview__Group_4__1__Impl rule__Overview__Group_4__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2866:2: rule__Overview__Group_4__1__Impl rule__Overview__Group_4__2
            {
            pushFollow(FOLLOW_rule__Overview__Group_4__1__Impl_in_rule__Overview__Group_4__15619);
            rule__Overview__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_4__2_in_rule__Overview__Group_4__15622);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2873:1: rule__Overview__Group_4__1__Impl : ( 'on' ) ;
    public final void rule__Overview__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2877:1: ( ( 'on' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2878:1: ( 'on' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2878:1: ( 'on' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2879:1: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getOnKeyword_4_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__Overview__Group_4__1__Impl5650); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2892:1: rule__Overview__Group_4__2 : rule__Overview__Group_4__2__Impl rule__Overview__Group_4__3 ;
    public final void rule__Overview__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2896:1: ( rule__Overview__Group_4__2__Impl rule__Overview__Group_4__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2897:2: rule__Overview__Group_4__2__Impl rule__Overview__Group_4__3
            {
            pushFollow(FOLLOW_rule__Overview__Group_4__2__Impl_in_rule__Overview__Group_4__25681);
            rule__Overview__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_4__3_in_rule__Overview__Group_4__25684);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2904:1: rule__Overview__Group_4__2__Impl : ( ':' ) ;
    public final void rule__Overview__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2908:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2909:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2909:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2910:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getColonKeyword_4_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Overview__Group_4__2__Impl5712); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2923:1: rule__Overview__Group_4__3 : rule__Overview__Group_4__3__Impl ;
    public final void rule__Overview__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2927:1: ( rule__Overview__Group_4__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2928:2: rule__Overview__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Overview__Group_4__3__Impl_in_rule__Overview__Group_4__35743);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2934:1: rule__Overview__Group_4__3__Impl : ( ( rule__Overview__ImagePathOnAssignment_4_3 ) ) ;
    public final void rule__Overview__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2938:1: ( ( ( rule__Overview__ImagePathOnAssignment_4_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2939:1: ( ( rule__Overview__ImagePathOnAssignment_4_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2939:1: ( ( rule__Overview__ImagePathOnAssignment_4_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2940:1: ( rule__Overview__ImagePathOnAssignment_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImagePathOnAssignment_4_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2941:1: ( rule__Overview__ImagePathOnAssignment_4_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2941:2: rule__Overview__ImagePathOnAssignment_4_3
            {
            pushFollow(FOLLOW_rule__Overview__ImagePathOnAssignment_4_3_in_rule__Overview__Group_4__3__Impl5770);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2959:1: rule__Overview__Group_5__0 : rule__Overview__Group_5__0__Impl rule__Overview__Group_5__1 ;
    public final void rule__Overview__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2963:1: ( rule__Overview__Group_5__0__Impl rule__Overview__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2964:2: rule__Overview__Group_5__0__Impl rule__Overview__Group_5__1
            {
            pushFollow(FOLLOW_rule__Overview__Group_5__0__Impl_in_rule__Overview__Group_5__05808);
            rule__Overview__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_5__1_in_rule__Overview__Group_5__05811);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2971:1: rule__Overview__Group_5__0__Impl : ( 'image' ) ;
    public final void rule__Overview__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2975:1: ( ( 'image' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2976:1: ( 'image' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2976:1: ( 'image' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2977:1: 'image'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImageKeyword_5_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Overview__Group_5__0__Impl5839); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2990:1: rule__Overview__Group_5__1 : rule__Overview__Group_5__1__Impl rule__Overview__Group_5__2 ;
    public final void rule__Overview__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2994:1: ( rule__Overview__Group_5__1__Impl rule__Overview__Group_5__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2995:2: rule__Overview__Group_5__1__Impl rule__Overview__Group_5__2
            {
            pushFollow(FOLLOW_rule__Overview__Group_5__1__Impl_in_rule__Overview__Group_5__15870);
            rule__Overview__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_5__2_in_rule__Overview__Group_5__15873);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3002:1: rule__Overview__Group_5__1__Impl : ( 'off' ) ;
    public final void rule__Overview__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3006:1: ( ( 'off' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3007:1: ( 'off' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3007:1: ( 'off' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3008:1: 'off'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getOffKeyword_5_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__Overview__Group_5__1__Impl5901); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3021:1: rule__Overview__Group_5__2 : rule__Overview__Group_5__2__Impl rule__Overview__Group_5__3 ;
    public final void rule__Overview__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3025:1: ( rule__Overview__Group_5__2__Impl rule__Overview__Group_5__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3026:2: rule__Overview__Group_5__2__Impl rule__Overview__Group_5__3
            {
            pushFollow(FOLLOW_rule__Overview__Group_5__2__Impl_in_rule__Overview__Group_5__25932);
            rule__Overview__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_5__3_in_rule__Overview__Group_5__25935);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3033:1: rule__Overview__Group_5__2__Impl : ( ':' ) ;
    public final void rule__Overview__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3037:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3038:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3038:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3039:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getColonKeyword_5_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Overview__Group_5__2__Impl5963); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3052:1: rule__Overview__Group_5__3 : rule__Overview__Group_5__3__Impl ;
    public final void rule__Overview__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3056:1: ( rule__Overview__Group_5__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3057:2: rule__Overview__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Overview__Group_5__3__Impl_in_rule__Overview__Group_5__35994);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3063:1: rule__Overview__Group_5__3__Impl : ( ( rule__Overview__ImagePathOffAssignment_5_3 ) ) ;
    public final void rule__Overview__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3067:1: ( ( ( rule__Overview__ImagePathOffAssignment_5_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3068:1: ( ( rule__Overview__ImagePathOffAssignment_5_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3068:1: ( ( rule__Overview__ImagePathOffAssignment_5_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3069:1: ( rule__Overview__ImagePathOffAssignment_5_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImagePathOffAssignment_5_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3070:1: ( rule__Overview__ImagePathOffAssignment_5_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3070:2: rule__Overview__ImagePathOffAssignment_5_3
            {
            pushFollow(FOLLOW_rule__Overview__ImagePathOffAssignment_5_3_in_rule__Overview__Group_5__3__Impl6021);
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


    // $ANTLR start "rule__SectionExtension__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3088:1: rule__SectionExtension__Group__0 : rule__SectionExtension__Group__0__Impl rule__SectionExtension__Group__1 ;
    public final void rule__SectionExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3092:1: ( rule__SectionExtension__Group__0__Impl rule__SectionExtension__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3093:2: rule__SectionExtension__Group__0__Impl rule__SectionExtension__Group__1
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__0__Impl_in_rule__SectionExtension__Group__06059);
            rule__SectionExtension__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__1_in_rule__SectionExtension__Group__06062);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3100:1: rule__SectionExtension__Group__0__Impl : ( () ) ;
    public final void rule__SectionExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3104:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3105:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3105:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3106:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getSectionExtensionAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3107:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3109:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3119:1: rule__SectionExtension__Group__1 : rule__SectionExtension__Group__1__Impl rule__SectionExtension__Group__2 ;
    public final void rule__SectionExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3123:1: ( rule__SectionExtension__Group__1__Impl rule__SectionExtension__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3124:2: rule__SectionExtension__Group__1__Impl rule__SectionExtension__Group__2
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__1__Impl_in_rule__SectionExtension__Group__16120);
            rule__SectionExtension__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__2_in_rule__SectionExtension__Group__16123);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3131:1: rule__SectionExtension__Group__1__Impl : ( 'section' ) ;
    public final void rule__SectionExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3135:1: ( ( 'section' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3136:1: ( 'section' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3136:1: ( 'section' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3137:1: 'section'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getSectionKeyword_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__SectionExtension__Group__1__Impl6151); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3150:1: rule__SectionExtension__Group__2 : rule__SectionExtension__Group__2__Impl rule__SectionExtension__Group__3 ;
    public final void rule__SectionExtension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3154:1: ( rule__SectionExtension__Group__2__Impl rule__SectionExtension__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3155:2: rule__SectionExtension__Group__2__Impl rule__SectionExtension__Group__3
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__2__Impl_in_rule__SectionExtension__Group__26182);
            rule__SectionExtension__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__3_in_rule__SectionExtension__Group__26185);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3162:1: rule__SectionExtension__Group__2__Impl : ( ( rule__SectionExtension__NameAssignment_2 ) ) ;
    public final void rule__SectionExtension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3166:1: ( ( ( rule__SectionExtension__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3167:1: ( ( rule__SectionExtension__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3167:1: ( ( rule__SectionExtension__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3168:1: ( rule__SectionExtension__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3169:1: ( rule__SectionExtension__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3169:2: rule__SectionExtension__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__SectionExtension__NameAssignment_2_in_rule__SectionExtension__Group__2__Impl6212);
            rule__SectionExtension__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getNameAssignment_2()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3179:1: rule__SectionExtension__Group__3 : rule__SectionExtension__Group__3__Impl rule__SectionExtension__Group__4 ;
    public final void rule__SectionExtension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3183:1: ( rule__SectionExtension__Group__3__Impl rule__SectionExtension__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3184:2: rule__SectionExtension__Group__3__Impl rule__SectionExtension__Group__4
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__3__Impl_in_rule__SectionExtension__Group__36242);
            rule__SectionExtension__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__4_in_rule__SectionExtension__Group__36245);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3191:1: rule__SectionExtension__Group__3__Impl : ( '{' ) ;
    public final void rule__SectionExtension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3195:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3196:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3196:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3197:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__SectionExtension__Group__3__Impl6273); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3210:1: rule__SectionExtension__Group__4 : rule__SectionExtension__Group__4__Impl rule__SectionExtension__Group__5 ;
    public final void rule__SectionExtension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3214:1: ( rule__SectionExtension__Group__4__Impl rule__SectionExtension__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3215:2: rule__SectionExtension__Group__4__Impl rule__SectionExtension__Group__5
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__4__Impl_in_rule__SectionExtension__Group__46304);
            rule__SectionExtension__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__5_in_rule__SectionExtension__Group__46307);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3222:1: rule__SectionExtension__Group__4__Impl : ( ( rule__SectionExtension__Group_4__0 )? ) ;
    public final void rule__SectionExtension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3226:1: ( ( ( rule__SectionExtension__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3227:1: ( ( rule__SectionExtension__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3227:1: ( ( rule__SectionExtension__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3228:1: ( rule__SectionExtension__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3229:1: ( rule__SectionExtension__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3229:2: rule__SectionExtension__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SectionExtension__Group_4__0_in_rule__SectionExtension__Group__4__Impl6334);
                    rule__SectionExtension__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getGroup_4()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3239:1: rule__SectionExtension__Group__5 : rule__SectionExtension__Group__5__Impl rule__SectionExtension__Group__6 ;
    public final void rule__SectionExtension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3243:1: ( rule__SectionExtension__Group__5__Impl rule__SectionExtension__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3244:2: rule__SectionExtension__Group__5__Impl rule__SectionExtension__Group__6
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__5__Impl_in_rule__SectionExtension__Group__56365);
            rule__SectionExtension__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__6_in_rule__SectionExtension__Group__56368);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3251:1: rule__SectionExtension__Group__5__Impl : ( 'extended' ) ;
    public final void rule__SectionExtension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3255:1: ( ( 'extended' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3256:1: ( 'extended' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3256:1: ( 'extended' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3257:1: 'extended'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getExtendedKeyword_5()); 
            }
            match(input,38,FOLLOW_38_in_rule__SectionExtension__Group__5__Impl6396); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getExtendedKeyword_5()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3270:1: rule__SectionExtension__Group__6 : rule__SectionExtension__Group__6__Impl rule__SectionExtension__Group__7 ;
    public final void rule__SectionExtension__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3274:1: ( rule__SectionExtension__Group__6__Impl rule__SectionExtension__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3275:2: rule__SectionExtension__Group__6__Impl rule__SectionExtension__Group__7
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__6__Impl_in_rule__SectionExtension__Group__66427);
            rule__SectionExtension__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__7_in_rule__SectionExtension__Group__66430);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3282:1: rule__SectionExtension__Group__6__Impl : ( 'page' ) ;
    public final void rule__SectionExtension__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3286:1: ( ( 'page' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3287:1: ( 'page' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3287:1: ( 'page' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3288:1: 'page'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getPageKeyword_6()); 
            }
            match(input,39,FOLLOW_39_in_rule__SectionExtension__Group__6__Impl6458); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getPageKeyword_6()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3301:1: rule__SectionExtension__Group__7 : rule__SectionExtension__Group__7__Impl rule__SectionExtension__Group__8 ;
    public final void rule__SectionExtension__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3305:1: ( rule__SectionExtension__Group__7__Impl rule__SectionExtension__Group__8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3306:2: rule__SectionExtension__Group__7__Impl rule__SectionExtension__Group__8
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__7__Impl_in_rule__SectionExtension__Group__76489);
            rule__SectionExtension__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__8_in_rule__SectionExtension__Group__76492);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3313:1: rule__SectionExtension__Group__7__Impl : ( ( rule__SectionExtension__ExtendedPageIDAssignment_7 ) ) ;
    public final void rule__SectionExtension__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3317:1: ( ( ( rule__SectionExtension__ExtendedPageIDAssignment_7 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3318:1: ( ( rule__SectionExtension__ExtendedPageIDAssignment_7 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3318:1: ( ( rule__SectionExtension__ExtendedPageIDAssignment_7 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3319:1: ( rule__SectionExtension__ExtendedPageIDAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getExtendedPageIDAssignment_7()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3320:1: ( rule__SectionExtension__ExtendedPageIDAssignment_7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3320:2: rule__SectionExtension__ExtendedPageIDAssignment_7
            {
            pushFollow(FOLLOW_rule__SectionExtension__ExtendedPageIDAssignment_7_in_rule__SectionExtension__Group__7__Impl6519);
            rule__SectionExtension__ExtendedPageIDAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getExtendedPageIDAssignment_7()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3330:1: rule__SectionExtension__Group__8 : rule__SectionExtension__Group__8__Impl rule__SectionExtension__Group__9 ;
    public final void rule__SectionExtension__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3334:1: ( rule__SectionExtension__Group__8__Impl rule__SectionExtension__Group__9 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3335:2: rule__SectionExtension__Group__8__Impl rule__SectionExtension__Group__9
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__8__Impl_in_rule__SectionExtension__Group__86549);
            rule__SectionExtension__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__9_in_rule__SectionExtension__Group__86552);
            rule__SectionExtension__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3342:1: rule__SectionExtension__Group__8__Impl : ( 'index' ) ;
    public final void rule__SectionExtension__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3346:1: ( ( 'index' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3347:1: ( 'index' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3347:1: ( 'index' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3348:1: 'index'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getIndexKeyword_8()); 
            }
            match(input,21,FOLLOW_21_in_rule__SectionExtension__Group__8__Impl6580); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getIndexKeyword_8()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__SectionExtension__Group__9"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3361:1: rule__SectionExtension__Group__9 : rule__SectionExtension__Group__9__Impl rule__SectionExtension__Group__10 ;
    public final void rule__SectionExtension__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3365:1: ( rule__SectionExtension__Group__9__Impl rule__SectionExtension__Group__10 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3366:2: rule__SectionExtension__Group__9__Impl rule__SectionExtension__Group__10
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__9__Impl_in_rule__SectionExtension__Group__96611);
            rule__SectionExtension__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__10_in_rule__SectionExtension__Group__96614);
            rule__SectionExtension__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__9"


    // $ANTLR start "rule__SectionExtension__Group__9__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3373:1: rule__SectionExtension__Group__9__Impl : ( ( rule__SectionExtension__IndexAssignment_9 ) ) ;
    public final void rule__SectionExtension__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3377:1: ( ( ( rule__SectionExtension__IndexAssignment_9 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3378:1: ( ( rule__SectionExtension__IndexAssignment_9 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3378:1: ( ( rule__SectionExtension__IndexAssignment_9 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3379:1: ( rule__SectionExtension__IndexAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getIndexAssignment_9()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3380:1: ( rule__SectionExtension__IndexAssignment_9 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3380:2: rule__SectionExtension__IndexAssignment_9
            {
            pushFollow(FOLLOW_rule__SectionExtension__IndexAssignment_9_in_rule__SectionExtension__Group__9__Impl6641);
            rule__SectionExtension__IndexAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getIndexAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__9__Impl"


    // $ANTLR start "rule__SectionExtension__Group__10"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3390:1: rule__SectionExtension__Group__10 : rule__SectionExtension__Group__10__Impl rule__SectionExtension__Group__11 ;
    public final void rule__SectionExtension__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3394:1: ( rule__SectionExtension__Group__10__Impl rule__SectionExtension__Group__11 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3395:2: rule__SectionExtension__Group__10__Impl rule__SectionExtension__Group__11
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__10__Impl_in_rule__SectionExtension__Group__106671);
            rule__SectionExtension__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__11_in_rule__SectionExtension__Group__106674);
            rule__SectionExtension__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__10"


    // $ANTLR start "rule__SectionExtension__Group__10__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3402:1: rule__SectionExtension__Group__10__Impl : ( ( rule__SectionExtension__Group_10__0 )? ) ;
    public final void rule__SectionExtension__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3406:1: ( ( ( rule__SectionExtension__Group_10__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3407:1: ( ( rule__SectionExtension__Group_10__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3407:1: ( ( rule__SectionExtension__Group_10__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3408:1: ( rule__SectionExtension__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getGroup_10()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3409:1: ( rule__SectionExtension__Group_10__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3409:2: rule__SectionExtension__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__SectionExtension__Group_10__0_in_rule__SectionExtension__Group__10__Impl6701);
                    rule__SectionExtension__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getGroup_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__10__Impl"


    // $ANTLR start "rule__SectionExtension__Group__11"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3419:1: rule__SectionExtension__Group__11 : rule__SectionExtension__Group__11__Impl rule__SectionExtension__Group__12 ;
    public final void rule__SectionExtension__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3423:1: ( rule__SectionExtension__Group__11__Impl rule__SectionExtension__Group__12 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3424:2: rule__SectionExtension__Group__11__Impl rule__SectionExtension__Group__12
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__11__Impl_in_rule__SectionExtension__Group__116732);
            rule__SectionExtension__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__12_in_rule__SectionExtension__Group__116735);
            rule__SectionExtension__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__11"


    // $ANTLR start "rule__SectionExtension__Group__11__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3431:1: rule__SectionExtension__Group__11__Impl : ( ( rule__SectionExtension__Group_11__0 )? ) ;
    public final void rule__SectionExtension__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3435:1: ( ( ( rule__SectionExtension__Group_11__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3436:1: ( ( rule__SectionExtension__Group_11__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3436:1: ( ( rule__SectionExtension__Group_11__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3437:1: ( rule__SectionExtension__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getGroup_11()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3438:1: ( rule__SectionExtension__Group_11__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==41) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3438:2: rule__SectionExtension__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__SectionExtension__Group_11__0_in_rule__SectionExtension__Group__11__Impl6762);
                    rule__SectionExtension__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getGroup_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__11__Impl"


    // $ANTLR start "rule__SectionExtension__Group__12"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3448:1: rule__SectionExtension__Group__12 : rule__SectionExtension__Group__12__Impl ;
    public final void rule__SectionExtension__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3452:1: ( rule__SectionExtension__Group__12__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3453:2: rule__SectionExtension__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__12__Impl_in_rule__SectionExtension__Group__126793);
            rule__SectionExtension__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__12"


    // $ANTLR start "rule__SectionExtension__Group__12__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3459:1: rule__SectionExtension__Group__12__Impl : ( '}' ) ;
    public final void rule__SectionExtension__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3463:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3464:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3464:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3465:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getRightCurlyBracketKeyword_12()); 
            }
            match(input,16,FOLLOW_16_in_rule__SectionExtension__Group__12__Impl6821); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getRightCurlyBracketKeyword_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__12__Impl"


    // $ANTLR start "rule__SectionExtension__Group_4__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3504:1: rule__SectionExtension__Group_4__0 : rule__SectionExtension__Group_4__0__Impl rule__SectionExtension__Group_4__1 ;
    public final void rule__SectionExtension__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3508:1: ( rule__SectionExtension__Group_4__0__Impl rule__SectionExtension__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3509:2: rule__SectionExtension__Group_4__0__Impl rule__SectionExtension__Group_4__1
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group_4__0__Impl_in_rule__SectionExtension__Group_4__06878);
            rule__SectionExtension__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group_4__1_in_rule__SectionExtension__Group_4__06881);
            rule__SectionExtension__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group_4__0"


    // $ANTLR start "rule__SectionExtension__Group_4__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3516:1: rule__SectionExtension__Group_4__0__Impl : ( 'id' ) ;
    public final void rule__SectionExtension__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3520:1: ( ( 'id' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3521:1: ( 'id' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3521:1: ( 'id' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3522:1: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getIdKeyword_4_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__SectionExtension__Group_4__0__Impl6909); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getIdKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group_4__0__Impl"


    // $ANTLR start "rule__SectionExtension__Group_4__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3535:1: rule__SectionExtension__Group_4__1 : rule__SectionExtension__Group_4__1__Impl ;
    public final void rule__SectionExtension__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3539:1: ( rule__SectionExtension__Group_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3540:2: rule__SectionExtension__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group_4__1__Impl_in_rule__SectionExtension__Group_4__16940);
            rule__SectionExtension__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group_4__1"


    // $ANTLR start "rule__SectionExtension__Group_4__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3546:1: rule__SectionExtension__Group_4__1__Impl : ( ( rule__SectionExtension__ActivityExplorerItemIDAssignment_4_1 ) ) ;
    public final void rule__SectionExtension__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3550:1: ( ( ( rule__SectionExtension__ActivityExplorerItemIDAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3551:1: ( ( rule__SectionExtension__ActivityExplorerItemIDAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3551:1: ( ( rule__SectionExtension__ActivityExplorerItemIDAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3552:1: ( rule__SectionExtension__ActivityExplorerItemIDAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getActivityExplorerItemIDAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3553:1: ( rule__SectionExtension__ActivityExplorerItemIDAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3553:2: rule__SectionExtension__ActivityExplorerItemIDAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SectionExtension__ActivityExplorerItemIDAssignment_4_1_in_rule__SectionExtension__Group_4__1__Impl6967);
            rule__SectionExtension__ActivityExplorerItemIDAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getActivityExplorerItemIDAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group_4__1__Impl"


    // $ANTLR start "rule__SectionExtension__Group_10__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3567:1: rule__SectionExtension__Group_10__0 : rule__SectionExtension__Group_10__0__Impl rule__SectionExtension__Group_10__1 ;
    public final void rule__SectionExtension__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3571:1: ( rule__SectionExtension__Group_10__0__Impl rule__SectionExtension__Group_10__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3572:2: rule__SectionExtension__Group_10__0__Impl rule__SectionExtension__Group_10__1
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group_10__0__Impl_in_rule__SectionExtension__Group_10__07001);
            rule__SectionExtension__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group_10__1_in_rule__SectionExtension__Group_10__07004);
            rule__SectionExtension__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group_10__0"


    // $ANTLR start "rule__SectionExtension__Group_10__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3579:1: rule__SectionExtension__Group_10__0__Impl : ( 'filtering' ) ;
    public final void rule__SectionExtension__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3583:1: ( ( 'filtering' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3584:1: ( 'filtering' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3584:1: ( 'filtering' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3585:1: 'filtering'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getFilteringKeyword_10_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__SectionExtension__Group_10__0__Impl7032); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getFilteringKeyword_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group_10__0__Impl"


    // $ANTLR start "rule__SectionExtension__Group_10__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3598:1: rule__SectionExtension__Group_10__1 : rule__SectionExtension__Group_10__1__Impl rule__SectionExtension__Group_10__2 ;
    public final void rule__SectionExtension__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3602:1: ( rule__SectionExtension__Group_10__1__Impl rule__SectionExtension__Group_10__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3603:2: rule__SectionExtension__Group_10__1__Impl rule__SectionExtension__Group_10__2
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group_10__1__Impl_in_rule__SectionExtension__Group_10__17063);
            rule__SectionExtension__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group_10__2_in_rule__SectionExtension__Group_10__17066);
            rule__SectionExtension__Group_10__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group_10__1"


    // $ANTLR start "rule__SectionExtension__Group_10__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3610:1: rule__SectionExtension__Group_10__1__Impl : ( ':' ) ;
    public final void rule__SectionExtension__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3614:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3615:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3615:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3616:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getColonKeyword_10_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__SectionExtension__Group_10__1__Impl7094); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getColonKeyword_10_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group_10__1__Impl"


    // $ANTLR start "rule__SectionExtension__Group_10__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3629:1: rule__SectionExtension__Group_10__2 : rule__SectionExtension__Group_10__2__Impl ;
    public final void rule__SectionExtension__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3633:1: ( rule__SectionExtension__Group_10__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3634:2: rule__SectionExtension__Group_10__2__Impl
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group_10__2__Impl_in_rule__SectionExtension__Group_10__27125);
            rule__SectionExtension__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group_10__2"


    // $ANTLR start "rule__SectionExtension__Group_10__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3640:1: rule__SectionExtension__Group_10__2__Impl : ( ( rule__SectionExtension__FilteringAssignment_10_2 ) ) ;
    public final void rule__SectionExtension__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3644:1: ( ( ( rule__SectionExtension__FilteringAssignment_10_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3645:1: ( ( rule__SectionExtension__FilteringAssignment_10_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3645:1: ( ( rule__SectionExtension__FilteringAssignment_10_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3646:1: ( rule__SectionExtension__FilteringAssignment_10_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getFilteringAssignment_10_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3647:1: ( rule__SectionExtension__FilteringAssignment_10_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3647:2: rule__SectionExtension__FilteringAssignment_10_2
            {
            pushFollow(FOLLOW_rule__SectionExtension__FilteringAssignment_10_2_in_rule__SectionExtension__Group_10__2__Impl7152);
            rule__SectionExtension__FilteringAssignment_10_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getFilteringAssignment_10_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group_10__2__Impl"


    // $ANTLR start "rule__SectionExtension__Group_11__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3663:1: rule__SectionExtension__Group_11__0 : rule__SectionExtension__Group_11__0__Impl rule__SectionExtension__Group_11__1 ;
    public final void rule__SectionExtension__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3667:1: ( rule__SectionExtension__Group_11__0__Impl rule__SectionExtension__Group_11__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3668:2: rule__SectionExtension__Group_11__0__Impl rule__SectionExtension__Group_11__1
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group_11__0__Impl_in_rule__SectionExtension__Group_11__07188);
            rule__SectionExtension__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group_11__1_in_rule__SectionExtension__Group_11__07191);
            rule__SectionExtension__Group_11__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group_11__0"


    // $ANTLR start "rule__SectionExtension__Group_11__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3675:1: rule__SectionExtension__Group_11__0__Impl : ( 'expanded' ) ;
    public final void rule__SectionExtension__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3679:1: ( ( 'expanded' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3680:1: ( 'expanded' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3680:1: ( 'expanded' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3681:1: 'expanded'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getExpandedKeyword_11_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__SectionExtension__Group_11__0__Impl7219); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getExpandedKeyword_11_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group_11__0__Impl"


    // $ANTLR start "rule__SectionExtension__Group_11__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3694:1: rule__SectionExtension__Group_11__1 : rule__SectionExtension__Group_11__1__Impl rule__SectionExtension__Group_11__2 ;
    public final void rule__SectionExtension__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3698:1: ( rule__SectionExtension__Group_11__1__Impl rule__SectionExtension__Group_11__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3699:2: rule__SectionExtension__Group_11__1__Impl rule__SectionExtension__Group_11__2
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group_11__1__Impl_in_rule__SectionExtension__Group_11__17250);
            rule__SectionExtension__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group_11__2_in_rule__SectionExtension__Group_11__17253);
            rule__SectionExtension__Group_11__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group_11__1"


    // $ANTLR start "rule__SectionExtension__Group_11__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3706:1: rule__SectionExtension__Group_11__1__Impl : ( ':' ) ;
    public final void rule__SectionExtension__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3710:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3711:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3711:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3712:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getColonKeyword_11_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__SectionExtension__Group_11__1__Impl7281); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getColonKeyword_11_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group_11__1__Impl"


    // $ANTLR start "rule__SectionExtension__Group_11__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3725:1: rule__SectionExtension__Group_11__2 : rule__SectionExtension__Group_11__2__Impl ;
    public final void rule__SectionExtension__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3729:1: ( rule__SectionExtension__Group_11__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3730:2: rule__SectionExtension__Group_11__2__Impl
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group_11__2__Impl_in_rule__SectionExtension__Group_11__27312);
            rule__SectionExtension__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group_11__2"


    // $ANTLR start "rule__SectionExtension__Group_11__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3736:1: rule__SectionExtension__Group_11__2__Impl : ( ( rule__SectionExtension__ExpandedAssignment_11_2 ) ) ;
    public final void rule__SectionExtension__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3740:1: ( ( ( rule__SectionExtension__ExpandedAssignment_11_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3741:1: ( ( rule__SectionExtension__ExpandedAssignment_11_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3741:1: ( ( rule__SectionExtension__ExpandedAssignment_11_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3742:1: ( rule__SectionExtension__ExpandedAssignment_11_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getExpandedAssignment_11_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3743:1: ( rule__SectionExtension__ExpandedAssignment_11_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3743:2: rule__SectionExtension__ExpandedAssignment_11_2
            {
            pushFollow(FOLLOW_rule__SectionExtension__ExpandedAssignment_11_2_in_rule__SectionExtension__Group_11__2__Impl7339);
            rule__SectionExtension__ExpandedAssignment_11_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getExpandedAssignment_11_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group_11__2__Impl"


    // $ANTLR start "rule__ActivityExtension__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3759:1: rule__ActivityExtension__Group__0 : rule__ActivityExtension__Group__0__Impl rule__ActivityExtension__Group__1 ;
    public final void rule__ActivityExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3763:1: ( rule__ActivityExtension__Group__0__Impl rule__ActivityExtension__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3764:2: rule__ActivityExtension__Group__0__Impl rule__ActivityExtension__Group__1
            {
            pushFollow(FOLLOW_rule__ActivityExtension__Group__0__Impl_in_rule__ActivityExtension__Group__07375);
            rule__ActivityExtension__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ActivityExtension__Group__1_in_rule__ActivityExtension__Group__07378);
            rule__ActivityExtension__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__0"


    // $ANTLR start "rule__ActivityExtension__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3771:1: rule__ActivityExtension__Group__0__Impl : ( () ) ;
    public final void rule__ActivityExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3775:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3776:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3776:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3777:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getActivityExtensionAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3778:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3780:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getActivityExtensionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__0__Impl"


    // $ANTLR start "rule__ActivityExtension__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3790:1: rule__ActivityExtension__Group__1 : rule__ActivityExtension__Group__1__Impl rule__ActivityExtension__Group__2 ;
    public final void rule__ActivityExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3794:1: ( rule__ActivityExtension__Group__1__Impl rule__ActivityExtension__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3795:2: rule__ActivityExtension__Group__1__Impl rule__ActivityExtension__Group__2
            {
            pushFollow(FOLLOW_rule__ActivityExtension__Group__1__Impl_in_rule__ActivityExtension__Group__17436);
            rule__ActivityExtension__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ActivityExtension__Group__2_in_rule__ActivityExtension__Group__17439);
            rule__ActivityExtension__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__1"


    // $ANTLR start "rule__ActivityExtension__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3802:1: rule__ActivityExtension__Group__1__Impl : ( 'activity' ) ;
    public final void rule__ActivityExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3806:1: ( ( 'activity' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3807:1: ( 'activity' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3807:1: ( 'activity' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3808:1: 'activity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getActivityKeyword_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__ActivityExtension__Group__1__Impl7467); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getActivityKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__1__Impl"


    // $ANTLR start "rule__ActivityExtension__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3821:1: rule__ActivityExtension__Group__2 : rule__ActivityExtension__Group__2__Impl rule__ActivityExtension__Group__3 ;
    public final void rule__ActivityExtension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3825:1: ( rule__ActivityExtension__Group__2__Impl rule__ActivityExtension__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3826:2: rule__ActivityExtension__Group__2__Impl rule__ActivityExtension__Group__3
            {
            pushFollow(FOLLOW_rule__ActivityExtension__Group__2__Impl_in_rule__ActivityExtension__Group__27498);
            rule__ActivityExtension__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ActivityExtension__Group__3_in_rule__ActivityExtension__Group__27501);
            rule__ActivityExtension__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__2"


    // $ANTLR start "rule__ActivityExtension__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3833:1: rule__ActivityExtension__Group__2__Impl : ( ( rule__ActivityExtension__NameAssignment_2 ) ) ;
    public final void rule__ActivityExtension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3837:1: ( ( ( rule__ActivityExtension__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3838:1: ( ( rule__ActivityExtension__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3838:1: ( ( rule__ActivityExtension__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3839:1: ( rule__ActivityExtension__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3840:1: ( rule__ActivityExtension__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3840:2: rule__ActivityExtension__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ActivityExtension__NameAssignment_2_in_rule__ActivityExtension__Group__2__Impl7528);
            rule__ActivityExtension__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__2__Impl"


    // $ANTLR start "rule__ActivityExtension__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3850:1: rule__ActivityExtension__Group__3 : rule__ActivityExtension__Group__3__Impl rule__ActivityExtension__Group__4 ;
    public final void rule__ActivityExtension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3854:1: ( rule__ActivityExtension__Group__3__Impl rule__ActivityExtension__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3855:2: rule__ActivityExtension__Group__3__Impl rule__ActivityExtension__Group__4
            {
            pushFollow(FOLLOW_rule__ActivityExtension__Group__3__Impl_in_rule__ActivityExtension__Group__37558);
            rule__ActivityExtension__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ActivityExtension__Group__4_in_rule__ActivityExtension__Group__37561);
            rule__ActivityExtension__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__3"


    // $ANTLR start "rule__ActivityExtension__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3862:1: rule__ActivityExtension__Group__3__Impl : ( '{' ) ;
    public final void rule__ActivityExtension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3866:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3867:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3867:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3868:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__ActivityExtension__Group__3__Impl7589); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__3__Impl"


    // $ANTLR start "rule__ActivityExtension__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3881:1: rule__ActivityExtension__Group__4 : rule__ActivityExtension__Group__4__Impl rule__ActivityExtension__Group__5 ;
    public final void rule__ActivityExtension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3885:1: ( rule__ActivityExtension__Group__4__Impl rule__ActivityExtension__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3886:2: rule__ActivityExtension__Group__4__Impl rule__ActivityExtension__Group__5
            {
            pushFollow(FOLLOW_rule__ActivityExtension__Group__4__Impl_in_rule__ActivityExtension__Group__47620);
            rule__ActivityExtension__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ActivityExtension__Group__5_in_rule__ActivityExtension__Group__47623);
            rule__ActivityExtension__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__4"


    // $ANTLR start "rule__ActivityExtension__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3893:1: rule__ActivityExtension__Group__4__Impl : ( ( rule__ActivityExtension__Group_4__0 )? ) ;
    public final void rule__ActivityExtension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3897:1: ( ( ( rule__ActivityExtension__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3898:1: ( ( rule__ActivityExtension__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3898:1: ( ( rule__ActivityExtension__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3899:1: ( rule__ActivityExtension__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3900:1: ( rule__ActivityExtension__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3900:2: rule__ActivityExtension__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ActivityExtension__Group_4__0_in_rule__ActivityExtension__Group__4__Impl7650);
                    rule__ActivityExtension__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__4__Impl"


    // $ANTLR start "rule__ActivityExtension__Group__5"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3910:1: rule__ActivityExtension__Group__5 : rule__ActivityExtension__Group__5__Impl rule__ActivityExtension__Group__6 ;
    public final void rule__ActivityExtension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3914:1: ( rule__ActivityExtension__Group__5__Impl rule__ActivityExtension__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3915:2: rule__ActivityExtension__Group__5__Impl rule__ActivityExtension__Group__6
            {
            pushFollow(FOLLOW_rule__ActivityExtension__Group__5__Impl_in_rule__ActivityExtension__Group__57681);
            rule__ActivityExtension__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ActivityExtension__Group__6_in_rule__ActivityExtension__Group__57684);
            rule__ActivityExtension__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__5"


    // $ANTLR start "rule__ActivityExtension__Group__5__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3922:1: rule__ActivityExtension__Group__5__Impl : ( 'extended' ) ;
    public final void rule__ActivityExtension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3926:1: ( ( 'extended' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3927:1: ( 'extended' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3927:1: ( 'extended' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3928:1: 'extended'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getExtendedKeyword_5()); 
            }
            match(input,38,FOLLOW_38_in_rule__ActivityExtension__Group__5__Impl7712); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getExtendedKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__5__Impl"


    // $ANTLR start "rule__ActivityExtension__Group__6"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3941:1: rule__ActivityExtension__Group__6 : rule__ActivityExtension__Group__6__Impl rule__ActivityExtension__Group__7 ;
    public final void rule__ActivityExtension__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3945:1: ( rule__ActivityExtension__Group__6__Impl rule__ActivityExtension__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3946:2: rule__ActivityExtension__Group__6__Impl rule__ActivityExtension__Group__7
            {
            pushFollow(FOLLOW_rule__ActivityExtension__Group__6__Impl_in_rule__ActivityExtension__Group__67743);
            rule__ActivityExtension__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ActivityExtension__Group__7_in_rule__ActivityExtension__Group__67746);
            rule__ActivityExtension__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__6"


    // $ANTLR start "rule__ActivityExtension__Group__6__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3953:1: rule__ActivityExtension__Group__6__Impl : ( 'section' ) ;
    public final void rule__ActivityExtension__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3957:1: ( ( 'section' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3958:1: ( 'section' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3958:1: ( 'section' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3959:1: 'section'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getSectionKeyword_6()); 
            }
            match(input,37,FOLLOW_37_in_rule__ActivityExtension__Group__6__Impl7774); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getSectionKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__6__Impl"


    // $ANTLR start "rule__ActivityExtension__Group__7"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3972:1: rule__ActivityExtension__Group__7 : rule__ActivityExtension__Group__7__Impl rule__ActivityExtension__Group__8 ;
    public final void rule__ActivityExtension__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3976:1: ( rule__ActivityExtension__Group__7__Impl rule__ActivityExtension__Group__8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3977:2: rule__ActivityExtension__Group__7__Impl rule__ActivityExtension__Group__8
            {
            pushFollow(FOLLOW_rule__ActivityExtension__Group__7__Impl_in_rule__ActivityExtension__Group__77805);
            rule__ActivityExtension__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ActivityExtension__Group__8_in_rule__ActivityExtension__Group__77808);
            rule__ActivityExtension__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__7"


    // $ANTLR start "rule__ActivityExtension__Group__7__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3984:1: rule__ActivityExtension__Group__7__Impl : ( ( rule__ActivityExtension__ExtendedSectionIDAssignment_7 ) ) ;
    public final void rule__ActivityExtension__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3988:1: ( ( ( rule__ActivityExtension__ExtendedSectionIDAssignment_7 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3989:1: ( ( rule__ActivityExtension__ExtendedSectionIDAssignment_7 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3989:1: ( ( rule__ActivityExtension__ExtendedSectionIDAssignment_7 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3990:1: ( rule__ActivityExtension__ExtendedSectionIDAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getExtendedSectionIDAssignment_7()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3991:1: ( rule__ActivityExtension__ExtendedSectionIDAssignment_7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3991:2: rule__ActivityExtension__ExtendedSectionIDAssignment_7
            {
            pushFollow(FOLLOW_rule__ActivityExtension__ExtendedSectionIDAssignment_7_in_rule__ActivityExtension__Group__7__Impl7835);
            rule__ActivityExtension__ExtendedSectionIDAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getExtendedSectionIDAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__7__Impl"


    // $ANTLR start "rule__ActivityExtension__Group__8"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4001:1: rule__ActivityExtension__Group__8 : rule__ActivityExtension__Group__8__Impl rule__ActivityExtension__Group__9 ;
    public final void rule__ActivityExtension__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4005:1: ( rule__ActivityExtension__Group__8__Impl rule__ActivityExtension__Group__9 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4006:2: rule__ActivityExtension__Group__8__Impl rule__ActivityExtension__Group__9
            {
            pushFollow(FOLLOW_rule__ActivityExtension__Group__8__Impl_in_rule__ActivityExtension__Group__87865);
            rule__ActivityExtension__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ActivityExtension__Group__9_in_rule__ActivityExtension__Group__87868);
            rule__ActivityExtension__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__8"


    // $ANTLR start "rule__ActivityExtension__Group__8__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4013:1: rule__ActivityExtension__Group__8__Impl : ( 'index' ) ;
    public final void rule__ActivityExtension__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4017:1: ( ( 'index' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4018:1: ( 'index' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4018:1: ( 'index' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4019:1: 'index'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getIndexKeyword_8()); 
            }
            match(input,21,FOLLOW_21_in_rule__ActivityExtension__Group__8__Impl7896); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getIndexKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__8__Impl"


    // $ANTLR start "rule__ActivityExtension__Group__9"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4032:1: rule__ActivityExtension__Group__9 : rule__ActivityExtension__Group__9__Impl rule__ActivityExtension__Group__10 ;
    public final void rule__ActivityExtension__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4036:1: ( rule__ActivityExtension__Group__9__Impl rule__ActivityExtension__Group__10 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4037:2: rule__ActivityExtension__Group__9__Impl rule__ActivityExtension__Group__10
            {
            pushFollow(FOLLOW_rule__ActivityExtension__Group__9__Impl_in_rule__ActivityExtension__Group__97927);
            rule__ActivityExtension__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ActivityExtension__Group__10_in_rule__ActivityExtension__Group__97930);
            rule__ActivityExtension__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__9"


    // $ANTLR start "rule__ActivityExtension__Group__9__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4044:1: rule__ActivityExtension__Group__9__Impl : ( ( rule__ActivityExtension__IndexAssignment_9 ) ) ;
    public final void rule__ActivityExtension__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4048:1: ( ( ( rule__ActivityExtension__IndexAssignment_9 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4049:1: ( ( rule__ActivityExtension__IndexAssignment_9 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4049:1: ( ( rule__ActivityExtension__IndexAssignment_9 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4050:1: ( rule__ActivityExtension__IndexAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getIndexAssignment_9()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4051:1: ( rule__ActivityExtension__IndexAssignment_9 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4051:2: rule__ActivityExtension__IndexAssignment_9
            {
            pushFollow(FOLLOW_rule__ActivityExtension__IndexAssignment_9_in_rule__ActivityExtension__Group__9__Impl7957);
            rule__ActivityExtension__IndexAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getIndexAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__9__Impl"


    // $ANTLR start "rule__ActivityExtension__Group__10"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4061:1: rule__ActivityExtension__Group__10 : rule__ActivityExtension__Group__10__Impl rule__ActivityExtension__Group__11 ;
    public final void rule__ActivityExtension__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4065:1: ( rule__ActivityExtension__Group__10__Impl rule__ActivityExtension__Group__11 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4066:2: rule__ActivityExtension__Group__10__Impl rule__ActivityExtension__Group__11
            {
            pushFollow(FOLLOW_rule__ActivityExtension__Group__10__Impl_in_rule__ActivityExtension__Group__107987);
            rule__ActivityExtension__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ActivityExtension__Group__11_in_rule__ActivityExtension__Group__107990);
            rule__ActivityExtension__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__10"


    // $ANTLR start "rule__ActivityExtension__Group__10__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4073:1: rule__ActivityExtension__Group__10__Impl : ( ( rule__ActivityExtension__Group_10__0 )? ) ;
    public final void rule__ActivityExtension__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4077:1: ( ( ( rule__ActivityExtension__Group_10__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4078:1: ( ( rule__ActivityExtension__Group_10__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4078:1: ( ( rule__ActivityExtension__Group_10__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4079:1: ( rule__ActivityExtension__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getGroup_10()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4080:1: ( rule__ActivityExtension__Group_10__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4080:2: rule__ActivityExtension__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__ActivityExtension__Group_10__0_in_rule__ActivityExtension__Group__10__Impl8017);
                    rule__ActivityExtension__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getGroup_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__10__Impl"


    // $ANTLR start "rule__ActivityExtension__Group__11"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4090:1: rule__ActivityExtension__Group__11 : rule__ActivityExtension__Group__11__Impl rule__ActivityExtension__Group__12 ;
    public final void rule__ActivityExtension__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4094:1: ( rule__ActivityExtension__Group__11__Impl rule__ActivityExtension__Group__12 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4095:2: rule__ActivityExtension__Group__11__Impl rule__ActivityExtension__Group__12
            {
            pushFollow(FOLLOW_rule__ActivityExtension__Group__11__Impl_in_rule__ActivityExtension__Group__118048);
            rule__ActivityExtension__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ActivityExtension__Group__12_in_rule__ActivityExtension__Group__118051);
            rule__ActivityExtension__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__11"


    // $ANTLR start "rule__ActivityExtension__Group__11__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4102:1: rule__ActivityExtension__Group__11__Impl : ( ( rule__ActivityExtension__Group_11__0 )? ) ;
    public final void rule__ActivityExtension__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4106:1: ( ( ( rule__ActivityExtension__Group_11__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4107:1: ( ( rule__ActivityExtension__Group_11__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4107:1: ( ( rule__ActivityExtension__Group_11__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4108:1: ( rule__ActivityExtension__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getGroup_11()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4109:1: ( rule__ActivityExtension__Group_11__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4109:2: rule__ActivityExtension__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__ActivityExtension__Group_11__0_in_rule__ActivityExtension__Group__11__Impl8078);
                    rule__ActivityExtension__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getGroup_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__11__Impl"


    // $ANTLR start "rule__ActivityExtension__Group__12"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4119:1: rule__ActivityExtension__Group__12 : rule__ActivityExtension__Group__12__Impl ;
    public final void rule__ActivityExtension__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4123:1: ( rule__ActivityExtension__Group__12__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4124:2: rule__ActivityExtension__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__ActivityExtension__Group__12__Impl_in_rule__ActivityExtension__Group__128109);
            rule__ActivityExtension__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__12"


    // $ANTLR start "rule__ActivityExtension__Group__12__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4130:1: rule__ActivityExtension__Group__12__Impl : ( '}' ) ;
    public final void rule__ActivityExtension__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4134:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4135:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4135:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4136:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getRightCurlyBracketKeyword_12()); 
            }
            match(input,16,FOLLOW_16_in_rule__ActivityExtension__Group__12__Impl8137); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getRightCurlyBracketKeyword_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group__12__Impl"


    // $ANTLR start "rule__ActivityExtension__Group_4__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4175:1: rule__ActivityExtension__Group_4__0 : rule__ActivityExtension__Group_4__0__Impl rule__ActivityExtension__Group_4__1 ;
    public final void rule__ActivityExtension__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4179:1: ( rule__ActivityExtension__Group_4__0__Impl rule__ActivityExtension__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4180:2: rule__ActivityExtension__Group_4__0__Impl rule__ActivityExtension__Group_4__1
            {
            pushFollow(FOLLOW_rule__ActivityExtension__Group_4__0__Impl_in_rule__ActivityExtension__Group_4__08194);
            rule__ActivityExtension__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ActivityExtension__Group_4__1_in_rule__ActivityExtension__Group_4__08197);
            rule__ActivityExtension__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group_4__0"


    // $ANTLR start "rule__ActivityExtension__Group_4__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4187:1: rule__ActivityExtension__Group_4__0__Impl : ( 'id' ) ;
    public final void rule__ActivityExtension__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4191:1: ( ( 'id' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4192:1: ( 'id' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4192:1: ( 'id' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4193:1: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getIdKeyword_4_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__ActivityExtension__Group_4__0__Impl8225); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getIdKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group_4__0__Impl"


    // $ANTLR start "rule__ActivityExtension__Group_4__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4206:1: rule__ActivityExtension__Group_4__1 : rule__ActivityExtension__Group_4__1__Impl ;
    public final void rule__ActivityExtension__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4210:1: ( rule__ActivityExtension__Group_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4211:2: rule__ActivityExtension__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ActivityExtension__Group_4__1__Impl_in_rule__ActivityExtension__Group_4__18256);
            rule__ActivityExtension__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group_4__1"


    // $ANTLR start "rule__ActivityExtension__Group_4__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4217:1: rule__ActivityExtension__Group_4__1__Impl : ( ( rule__ActivityExtension__ActivityExplorerItemIDAssignment_4_1 ) ) ;
    public final void rule__ActivityExtension__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4221:1: ( ( ( rule__ActivityExtension__ActivityExplorerItemIDAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4222:1: ( ( rule__ActivityExtension__ActivityExplorerItemIDAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4222:1: ( ( rule__ActivityExtension__ActivityExplorerItemIDAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4223:1: ( rule__ActivityExtension__ActivityExplorerItemIDAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getActivityExplorerItemIDAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4224:1: ( rule__ActivityExtension__ActivityExplorerItemIDAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4224:2: rule__ActivityExtension__ActivityExplorerItemIDAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ActivityExtension__ActivityExplorerItemIDAssignment_4_1_in_rule__ActivityExtension__Group_4__1__Impl8283);
            rule__ActivityExtension__ActivityExplorerItemIDAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getActivityExplorerItemIDAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group_4__1__Impl"


    // $ANTLR start "rule__ActivityExtension__Group_10__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4238:1: rule__ActivityExtension__Group_10__0 : rule__ActivityExtension__Group_10__0__Impl rule__ActivityExtension__Group_10__1 ;
    public final void rule__ActivityExtension__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4242:1: ( rule__ActivityExtension__Group_10__0__Impl rule__ActivityExtension__Group_10__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4243:2: rule__ActivityExtension__Group_10__0__Impl rule__ActivityExtension__Group_10__1
            {
            pushFollow(FOLLOW_rule__ActivityExtension__Group_10__0__Impl_in_rule__ActivityExtension__Group_10__08317);
            rule__ActivityExtension__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ActivityExtension__Group_10__1_in_rule__ActivityExtension__Group_10__08320);
            rule__ActivityExtension__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group_10__0"


    // $ANTLR start "rule__ActivityExtension__Group_10__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4250:1: rule__ActivityExtension__Group_10__0__Impl : ( 'predicated' ) ;
    public final void rule__ActivityExtension__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4254:1: ( ( 'predicated' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4255:1: ( 'predicated' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4255:1: ( 'predicated' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4256:1: 'predicated'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getPredicatedKeyword_10_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__ActivityExtension__Group_10__0__Impl8348); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getPredicatedKeyword_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group_10__0__Impl"


    // $ANTLR start "rule__ActivityExtension__Group_10__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4269:1: rule__ActivityExtension__Group_10__1 : rule__ActivityExtension__Group_10__1__Impl rule__ActivityExtension__Group_10__2 ;
    public final void rule__ActivityExtension__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4273:1: ( rule__ActivityExtension__Group_10__1__Impl rule__ActivityExtension__Group_10__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4274:2: rule__ActivityExtension__Group_10__1__Impl rule__ActivityExtension__Group_10__2
            {
            pushFollow(FOLLOW_rule__ActivityExtension__Group_10__1__Impl_in_rule__ActivityExtension__Group_10__18379);
            rule__ActivityExtension__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ActivityExtension__Group_10__2_in_rule__ActivityExtension__Group_10__18382);
            rule__ActivityExtension__Group_10__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group_10__1"


    // $ANTLR start "rule__ActivityExtension__Group_10__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4281:1: rule__ActivityExtension__Group_10__1__Impl : ( ':' ) ;
    public final void rule__ActivityExtension__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4285:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4286:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4286:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4287:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getColonKeyword_10_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__ActivityExtension__Group_10__1__Impl8410); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getColonKeyword_10_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group_10__1__Impl"


    // $ANTLR start "rule__ActivityExtension__Group_10__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4300:1: rule__ActivityExtension__Group_10__2 : rule__ActivityExtension__Group_10__2__Impl ;
    public final void rule__ActivityExtension__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4304:1: ( rule__ActivityExtension__Group_10__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4305:2: rule__ActivityExtension__Group_10__2__Impl
            {
            pushFollow(FOLLOW_rule__ActivityExtension__Group_10__2__Impl_in_rule__ActivityExtension__Group_10__28441);
            rule__ActivityExtension__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group_10__2"


    // $ANTLR start "rule__ActivityExtension__Group_10__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4311:1: rule__ActivityExtension__Group_10__2__Impl : ( ( rule__ActivityExtension__HasPredicateAssignment_10_2 ) ) ;
    public final void rule__ActivityExtension__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4315:1: ( ( ( rule__ActivityExtension__HasPredicateAssignment_10_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4316:1: ( ( rule__ActivityExtension__HasPredicateAssignment_10_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4316:1: ( ( rule__ActivityExtension__HasPredicateAssignment_10_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4317:1: ( rule__ActivityExtension__HasPredicateAssignment_10_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getHasPredicateAssignment_10_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4318:1: ( rule__ActivityExtension__HasPredicateAssignment_10_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4318:2: rule__ActivityExtension__HasPredicateAssignment_10_2
            {
            pushFollow(FOLLOW_rule__ActivityExtension__HasPredicateAssignment_10_2_in_rule__ActivityExtension__Group_10__2__Impl8468);
            rule__ActivityExtension__HasPredicateAssignment_10_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getHasPredicateAssignment_10_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group_10__2__Impl"


    // $ANTLR start "rule__ActivityExtension__Group_11__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4334:1: rule__ActivityExtension__Group_11__0 : rule__ActivityExtension__Group_11__0__Impl rule__ActivityExtension__Group_11__1 ;
    public final void rule__ActivityExtension__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4338:1: ( rule__ActivityExtension__Group_11__0__Impl rule__ActivityExtension__Group_11__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4339:2: rule__ActivityExtension__Group_11__0__Impl rule__ActivityExtension__Group_11__1
            {
            pushFollow(FOLLOW_rule__ActivityExtension__Group_11__0__Impl_in_rule__ActivityExtension__Group_11__08504);
            rule__ActivityExtension__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ActivityExtension__Group_11__1_in_rule__ActivityExtension__Group_11__08507);
            rule__ActivityExtension__Group_11__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group_11__0"


    // $ANTLR start "rule__ActivityExtension__Group_11__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4346:1: rule__ActivityExtension__Group_11__0__Impl : ( 'icon' ) ;
    public final void rule__ActivityExtension__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4350:1: ( ( 'icon' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4351:1: ( 'icon' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4351:1: ( 'icon' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4352:1: 'icon'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getIconKeyword_11_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__ActivityExtension__Group_11__0__Impl8535); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getIconKeyword_11_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group_11__0__Impl"


    // $ANTLR start "rule__ActivityExtension__Group_11__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4365:1: rule__ActivityExtension__Group_11__1 : rule__ActivityExtension__Group_11__1__Impl rule__ActivityExtension__Group_11__2 ;
    public final void rule__ActivityExtension__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4369:1: ( rule__ActivityExtension__Group_11__1__Impl rule__ActivityExtension__Group_11__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4370:2: rule__ActivityExtension__Group_11__1__Impl rule__ActivityExtension__Group_11__2
            {
            pushFollow(FOLLOW_rule__ActivityExtension__Group_11__1__Impl_in_rule__ActivityExtension__Group_11__18566);
            rule__ActivityExtension__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ActivityExtension__Group_11__2_in_rule__ActivityExtension__Group_11__18569);
            rule__ActivityExtension__Group_11__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group_11__1"


    // $ANTLR start "rule__ActivityExtension__Group_11__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4377:1: rule__ActivityExtension__Group_11__1__Impl : ( ':' ) ;
    public final void rule__ActivityExtension__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4381:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4382:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4382:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4383:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getColonKeyword_11_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__ActivityExtension__Group_11__1__Impl8597); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getColonKeyword_11_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group_11__1__Impl"


    // $ANTLR start "rule__ActivityExtension__Group_11__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4396:1: rule__ActivityExtension__Group_11__2 : rule__ActivityExtension__Group_11__2__Impl ;
    public final void rule__ActivityExtension__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4400:1: ( rule__ActivityExtension__Group_11__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4401:2: rule__ActivityExtension__Group_11__2__Impl
            {
            pushFollow(FOLLOW_rule__ActivityExtension__Group_11__2__Impl_in_rule__ActivityExtension__Group_11__28628);
            rule__ActivityExtension__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group_11__2"


    // $ANTLR start "rule__ActivityExtension__Group_11__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4407:1: rule__ActivityExtension__Group_11__2__Impl : ( ( rule__ActivityExtension__ImagePathOffAssignment_11_2 ) ) ;
    public final void rule__ActivityExtension__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4411:1: ( ( ( rule__ActivityExtension__ImagePathOffAssignment_11_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4412:1: ( ( rule__ActivityExtension__ImagePathOffAssignment_11_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4412:1: ( ( rule__ActivityExtension__ImagePathOffAssignment_11_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4413:1: ( rule__ActivityExtension__ImagePathOffAssignment_11_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getImagePathOffAssignment_11_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4414:1: ( rule__ActivityExtension__ImagePathOffAssignment_11_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4414:2: rule__ActivityExtension__ImagePathOffAssignment_11_2
            {
            pushFollow(FOLLOW_rule__ActivityExtension__ImagePathOffAssignment_11_2_in_rule__ActivityExtension__Group_11__2__Impl8655);
            rule__ActivityExtension__ImagePathOffAssignment_11_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getImagePathOffAssignment_11_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__Group_11__2__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4430:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4434:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4435:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__08691);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__08694);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4442:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4446:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4447:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4447:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4448:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl8721); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4459:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4463:1: ( rule__FQN__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4464:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__18750);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4470:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4474:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4475:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4475:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4476:1: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4477:1: ( rule__FQN__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==44) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4477:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl8777);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4491:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4495:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4496:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__08812);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__08815);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4503:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4507:1: ( ( '.' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4508:1: ( '.' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4508:1: ( '.' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4509:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__FQN__Group_1__0__Impl8843); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4522:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4526:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4527:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__18874);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4533:1: rule__FQN__Group_1__1__Impl : ( ( RULE_ID ) ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4537:1: ( ( ( RULE_ID ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4538:1: ( ( RULE_ID ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4538:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4539:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4540:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4540:3: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl8902); if (state.failed) return ;

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


    // $ANTLR start "rule__ViewpointActivityExplorer__UnorderedGroup"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4555:1: rule__ViewpointActivityExplorer__UnorderedGroup : rule__ViewpointActivityExplorer__UnorderedGroup__0 {...}?;
    public final void rule__ViewpointActivityExplorer__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup());
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4560:1: ( rule__ViewpointActivityExplorer__UnorderedGroup__0 {...}?)
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4561:2: rule__ViewpointActivityExplorer__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__UnorderedGroup__0_in_rule__ViewpointActivityExplorer__UnorderedGroup8937);
            rule__ViewpointActivityExplorer__UnorderedGroup__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__ViewpointActivityExplorer__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__UnorderedGroup"


    // $ANTLR start "rule__ViewpointActivityExplorer__UnorderedGroup__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4572:1: rule__ViewpointActivityExplorer__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__ViewpointActivityExplorer__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__ViewpointActivityExplorer__Group_2__0 ) ) ) ) ) ;
    public final void rule__ViewpointActivityExplorer__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4577:1: ( ( ({...}? => ( ( ( rule__ViewpointActivityExplorer__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__ViewpointActivityExplorer__Group_2__0 ) ) ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4578:3: ( ({...}? => ( ( ( rule__ViewpointActivityExplorer__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__ViewpointActivityExplorer__Group_2__0 ) ) ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4578:3: ( ({...}? => ( ( ( rule__ViewpointActivityExplorer__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__ViewpointActivityExplorer__Group_2__0 ) ) ) ) )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( LA26_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 0) ) {
                alt26=1;
            }
            else if ( LA26_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 1) ) {
                alt26=2;
            }
            else if ( (LA26_0==16||LA26_0==19) && getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 2) ) {
                alt26=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4580:4: ({...}? => ( ( ( rule__ViewpointActivityExplorer__Group_0__0 ) ) ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4580:4: ({...}? => ( ( ( rule__ViewpointActivityExplorer__Group_0__0 ) ) ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4581:5: {...}? => ( ( ( rule__ViewpointActivityExplorer__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ViewpointActivityExplorer__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 0)");
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4581:120: ( ( ( rule__ViewpointActivityExplorer__Group_0__0 ) ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4582:6: ( ( rule__ViewpointActivityExplorer__Group_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 0);
                    selected = true;
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4588:6: ( ( rule__ViewpointActivityExplorer__Group_0__0 ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4590:7: ( rule__ViewpointActivityExplorer__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getViewpointActivityExplorerAccess().getGroup_0()); 
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4591:7: ( rule__ViewpointActivityExplorer__Group_0__0 )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4591:8: rule__ViewpointActivityExplorer__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group_0__0_in_rule__ViewpointActivityExplorer__UnorderedGroup__Impl9026);
                    rule__ViewpointActivityExplorer__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getViewpointActivityExplorerAccess().getGroup_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4597:4: ({...}? => ( ( ( rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1 ) ) ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4597:4: ({...}? => ( ( ( rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1 ) ) ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4598:5: {...}? => ( ( ( rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ViewpointActivityExplorer__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 1)");
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4598:120: ( ( ( rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1 ) ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4599:6: ( ( rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 1);
                    selected = true;
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4605:6: ( ( rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1 ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4607:7: ( rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedSectionsExtensionAssignment_1()); 
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4608:7: ( rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1 )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4608:8: rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1_in_rule__ViewpointActivityExplorer__UnorderedGroup__Impl9117);
                    rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getViewpointActivityExplorerAccess().getOwnedSectionsExtensionAssignment_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4614:4: ({...}? => ( ( ( rule__ViewpointActivityExplorer__Group_2__0 ) ) ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4614:4: ({...}? => ( ( ( rule__ViewpointActivityExplorer__Group_2__0 ) ) ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4615:5: {...}? => ( ( ( rule__ViewpointActivityExplorer__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ViewpointActivityExplorer__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 2)");
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4615:120: ( ( ( rule__ViewpointActivityExplorer__Group_2__0 ) ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4616:6: ( ( rule__ViewpointActivityExplorer__Group_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 2);
                    selected = true;
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4622:6: ( ( rule__ViewpointActivityExplorer__Group_2__0 ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4624:7: ( rule__ViewpointActivityExplorer__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getViewpointActivityExplorerAccess().getGroup_2()); 
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4625:7: ( rule__ViewpointActivityExplorer__Group_2__0 )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4625:8: rule__ViewpointActivityExplorer__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group_2__0_in_rule__ViewpointActivityExplorer__UnorderedGroup__Impl9208);
                    rule__ViewpointActivityExplorer__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getViewpointActivityExplorerAccess().getGroup_2()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__UnorderedGroup__Impl"


    // $ANTLR start "rule__ViewpointActivityExplorer__UnorderedGroup__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4640:1: rule__ViewpointActivityExplorer__UnorderedGroup__0 : rule__ViewpointActivityExplorer__UnorderedGroup__Impl ( rule__ViewpointActivityExplorer__UnorderedGroup__1 )? ;
    public final void rule__ViewpointActivityExplorer__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4644:1: ( rule__ViewpointActivityExplorer__UnorderedGroup__Impl ( rule__ViewpointActivityExplorer__UnorderedGroup__1 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4645:2: rule__ViewpointActivityExplorer__UnorderedGroup__Impl ( rule__ViewpointActivityExplorer__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__UnorderedGroup__Impl_in_rule__ViewpointActivityExplorer__UnorderedGroup__09267);
            rule__ViewpointActivityExplorer__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4646:2: ( rule__ViewpointActivityExplorer__UnorderedGroup__1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( LA27_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 0) ) {
                alt27=1;
            }
            else if ( LA27_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 1) ) {
                alt27=1;
            }
            else if ( LA27_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 2) ) {
                alt27=1;
            }
            else if ( LA27_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 2) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:0:0: rule__ViewpointActivityExplorer__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_rule__ViewpointActivityExplorer__UnorderedGroup__1_in_rule__ViewpointActivityExplorer__UnorderedGroup__09270);
                    rule__ViewpointActivityExplorer__UnorderedGroup__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__UnorderedGroup__0"


    // $ANTLR start "rule__ViewpointActivityExplorer__UnorderedGroup__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4653:1: rule__ViewpointActivityExplorer__UnorderedGroup__1 : rule__ViewpointActivityExplorer__UnorderedGroup__Impl ( rule__ViewpointActivityExplorer__UnorderedGroup__2 )? ;
    public final void rule__ViewpointActivityExplorer__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4657:1: ( rule__ViewpointActivityExplorer__UnorderedGroup__Impl ( rule__ViewpointActivityExplorer__UnorderedGroup__2 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4658:2: rule__ViewpointActivityExplorer__UnorderedGroup__Impl ( rule__ViewpointActivityExplorer__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__UnorderedGroup__Impl_in_rule__ViewpointActivityExplorer__UnorderedGroup__19295);
            rule__ViewpointActivityExplorer__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4659:2: ( rule__ViewpointActivityExplorer__UnorderedGroup__2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( LA28_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 1) ) {
                alt28=1;
            }
            else if ( LA28_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 2) ) {
                alt28=1;
            }
            else if ( LA28_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 2) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:0:0: rule__ViewpointActivityExplorer__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_rule__ViewpointActivityExplorer__UnorderedGroup__2_in_rule__ViewpointActivityExplorer__UnorderedGroup__19298);
                    rule__ViewpointActivityExplorer__UnorderedGroup__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__UnorderedGroup__1"


    // $ANTLR start "rule__ViewpointActivityExplorer__UnorderedGroup__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4666:1: rule__ViewpointActivityExplorer__UnorderedGroup__2 : rule__ViewpointActivityExplorer__UnorderedGroup__Impl ;
    public final void rule__ViewpointActivityExplorer__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4670:1: ( rule__ViewpointActivityExplorer__UnorderedGroup__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4671:2: rule__ViewpointActivityExplorer__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__UnorderedGroup__Impl_in_rule__ViewpointActivityExplorer__UnorderedGroup__29323);
            rule__ViewpointActivityExplorer__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__UnorderedGroup__2"


    // $ANTLR start "rule__ViewpointActivityExplorer__NameAssignment_0_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4684:1: rule__ViewpointActivityExplorer__NameAssignment_0_2 : ( ruleFQN ) ;
    public final void rule__ViewpointActivityExplorer__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4688:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4689:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4689:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4690:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getNameFQNParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__ViewpointActivityExplorer__NameAssignment_0_29357);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getNameFQNParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__NameAssignment_0_2"


    // $ANTLR start "rule__ViewpointActivityExplorer__OwnedNewPagesAssignment_0_4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4699:1: rule__ViewpointActivityExplorer__OwnedNewPagesAssignment_0_4 : ( rulePages ) ;
    public final void rule__ViewpointActivityExplorer__OwnedNewPagesAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4703:1: ( ( rulePages ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4704:1: ( rulePages )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4704:1: ( rulePages )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4705:1: rulePages
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedNewPagesPagesParserRuleCall_0_4_0()); 
            }
            pushFollow(FOLLOW_rulePages_in_rule__ViewpointActivityExplorer__OwnedNewPagesAssignment_0_49388);
            rulePages();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getOwnedNewPagesPagesParserRuleCall_0_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__OwnedNewPagesAssignment_0_4"


    // $ANTLR start "rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4714:1: rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1 : ( ruleSections ) ;
    public final void rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4718:1: ( ( ruleSections ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4719:1: ( ruleSections )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4719:1: ( ruleSections )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4720:1: ruleSections
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedSectionsExtensionSectionsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSections_in_rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_19419);
            ruleSections();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getOwnedSectionsExtensionSectionsParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1"


    // $ANTLR start "rule__ViewpointActivityExplorer__OwnedActivitiesExtensionAssignment_2_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4729:1: rule__ViewpointActivityExplorer__OwnedActivitiesExtensionAssignment_2_0 : ( ruleActivities ) ;
    public final void rule__ViewpointActivityExplorer__OwnedActivitiesExtensionAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4733:1: ( ( ruleActivities ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4734:1: ( ruleActivities )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4734:1: ( ruleActivities )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4735:1: ruleActivities
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedActivitiesExtensionActivitiesParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleActivities_in_rule__ViewpointActivityExplorer__OwnedActivitiesExtensionAssignment_2_09450);
            ruleActivities();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getOwnedActivitiesExtensionActivitiesParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__OwnedActivitiesExtensionAssignment_2_0"


    // $ANTLR start "rule__Pages__OwnedActivityExplorerPagesAssignment_3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4744:1: rule__Pages__OwnedActivityExplorerPagesAssignment_3 : ( rulePage ) ;
    public final void rule__Pages__OwnedActivityExplorerPagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4748:1: ( ( rulePage ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4749:1: ( rulePage )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4749:1: ( rulePage )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4750:1: rulePage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPagesAccess().getOwnedActivityExplorerPagesPageParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_rulePage_in_rule__Pages__OwnedActivityExplorerPagesAssignment_39481);
            rulePage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPagesAccess().getOwnedActivityExplorerPagesPageParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pages__OwnedActivityExplorerPagesAssignment_3"


    // $ANTLR start "rule__Pages__OwnedActivityExplorerPagesAssignment_4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4759:1: rule__Pages__OwnedActivityExplorerPagesAssignment_4 : ( rulePage ) ;
    public final void rule__Pages__OwnedActivityExplorerPagesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4763:1: ( ( rulePage ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4764:1: ( rulePage )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4764:1: ( rulePage )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4765:1: rulePage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPagesAccess().getOwnedActivityExplorerPagesPageParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_rulePage_in_rule__Pages__OwnedActivityExplorerPagesAssignment_49512);
            rulePage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPagesAccess().getOwnedActivityExplorerPagesPageParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pages__OwnedActivityExplorerPagesAssignment_4"


    // $ANTLR start "rule__Sections__OwnedSectionsExtensionsAssignment_3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4774:1: rule__Sections__OwnedSectionsExtensionsAssignment_3 : ( ruleSectionExtension ) ;
    public final void rule__Sections__OwnedSectionsExtensionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4778:1: ( ( ruleSectionExtension ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4779:1: ( ruleSectionExtension )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4779:1: ( ruleSectionExtension )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4780:1: ruleSectionExtension
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionsAccess().getOwnedSectionsExtensionsSectionExtensionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleSectionExtension_in_rule__Sections__OwnedSectionsExtensionsAssignment_39543);
            ruleSectionExtension();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionsAccess().getOwnedSectionsExtensionsSectionExtensionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__OwnedSectionsExtensionsAssignment_3"


    // $ANTLR start "rule__Sections__OwnedSectionsExtensionsAssignment_4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4789:1: rule__Sections__OwnedSectionsExtensionsAssignment_4 : ( ruleSectionExtension ) ;
    public final void rule__Sections__OwnedSectionsExtensionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4793:1: ( ( ruleSectionExtension ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4794:1: ( ruleSectionExtension )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4794:1: ( ruleSectionExtension )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4795:1: ruleSectionExtension
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionsAccess().getOwnedSectionsExtensionsSectionExtensionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleSectionExtension_in_rule__Sections__OwnedSectionsExtensionsAssignment_49574);
            ruleSectionExtension();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionsAccess().getOwnedSectionsExtensionsSectionExtensionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__OwnedSectionsExtensionsAssignment_4"


    // $ANTLR start "rule__Activities__OwnedActivitiesExtensionsAssignment_3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4804:1: rule__Activities__OwnedActivitiesExtensionsAssignment_3 : ( ruleActivityExtension ) ;
    public final void rule__Activities__OwnedActivitiesExtensionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4808:1: ( ( ruleActivityExtension ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4809:1: ( ruleActivityExtension )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4809:1: ( ruleActivityExtension )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4810:1: ruleActivityExtension
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivitiesAccess().getOwnedActivitiesExtensionsActivityExtensionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleActivityExtension_in_rule__Activities__OwnedActivitiesExtensionsAssignment_39605);
            ruleActivityExtension();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivitiesAccess().getOwnedActivitiesExtensionsActivityExtensionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activities__OwnedActivitiesExtensionsAssignment_3"


    // $ANTLR start "rule__Activities__OwnedActivitiesExtensionsAssignment_4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4819:1: rule__Activities__OwnedActivitiesExtensionsAssignment_4 : ( ruleActivityExtension ) ;
    public final void rule__Activities__OwnedActivitiesExtensionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4823:1: ( ( ruleActivityExtension ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4824:1: ( ruleActivityExtension )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4824:1: ( ruleActivityExtension )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4825:1: ruleActivityExtension
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivitiesAccess().getOwnedActivitiesExtensionsActivityExtensionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleActivityExtension_in_rule__Activities__OwnedActivitiesExtensionsAssignment_49636);
            ruleActivityExtension();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivitiesAccess().getOwnedActivitiesExtensionsActivityExtensionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activities__OwnedActivitiesExtensionsAssignment_4"


    // $ANTLR start "rule__Page__NameAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4834:1: rule__Page__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Page__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4838:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4839:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4839:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4840:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__NameAssignment_29667); if (state.failed) return ;
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


    // $ANTLR start "rule__Page__ModelTypeAssignment_4_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4849:1: rule__Page__ModelTypeAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Page__ModelTypeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4853:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4854:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4854:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4855:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getModelTypeSTRINGTerminalRuleCall_4_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__ModelTypeAssignment_4_29698); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getModelTypeSTRINGTerminalRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__ModelTypeAssignment_4_2"


    // $ANTLR start "rule__Page__ActivityExplorerItemIDAssignment_5_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4864:1: rule__Page__ActivityExplorerItemIDAssignment_5_1 : ( ruleFQN ) ;
    public final void rule__Page__ActivityExplorerItemIDAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4868:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4869:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4869:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4870:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getActivityExplorerItemIDFQNParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Page__ActivityExplorerItemIDAssignment_5_19729);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getActivityExplorerItemIDFQNParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__ActivityExplorerItemIDAssignment_5_1"


    // $ANTLR start "rule__Page__IndexAssignment_7"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4879:1: rule__Page__IndexAssignment_7 : ( ruleEInt ) ;
    public final void rule__Page__IndexAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4883:1: ( ( ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4884:1: ( ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4884:1: ( ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4885:1: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getIndexEIntParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleEInt_in_rule__Page__IndexAssignment_79760);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getIndexEIntParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__IndexAssignment_7"


    // $ANTLR start "rule__Page__OwnedOverviewAssignment_8"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4894:1: rule__Page__OwnedOverviewAssignment_8 : ( ruleOverview ) ;
    public final void rule__Page__OwnedOverviewAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4898:1: ( ( ruleOverview ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4899:1: ( ruleOverview )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4899:1: ( ruleOverview )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4900:1: ruleOverview
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOwnedOverviewOverviewParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_ruleOverview_in_rule__Page__OwnedOverviewAssignment_89791);
            ruleOverview();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getOwnedOverviewOverviewParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__OwnedOverviewAssignment_8"


    // $ANTLR start "rule__Page__ImagePathOnAssignment_9_2_3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4909:1: rule__Page__ImagePathOnAssignment_9_2_3 : ( RULE_STRING ) ;
    public final void rule__Page__ImagePathOnAssignment_9_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4913:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4914:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4914:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4915:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImagePathOnSTRINGTerminalRuleCall_9_2_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__ImagePathOnAssignment_9_2_39822); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImagePathOnSTRINGTerminalRuleCall_9_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__ImagePathOnAssignment_9_2_3"


    // $ANTLR start "rule__Page__ImagePathOffAssignment_9_3_3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4924:1: rule__Page__ImagePathOffAssignment_9_3_3 : ( RULE_STRING ) ;
    public final void rule__Page__ImagePathOffAssignment_9_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4928:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4929:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4929:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4930:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImagePathOffSTRINGTerminalRuleCall_9_3_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__ImagePathOffAssignment_9_3_39853); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImagePathOffSTRINGTerminalRuleCall_9_3_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__ImagePathOffAssignment_9_3_3"


    // $ANTLR start "rule__Page__TabNameAssignment_10_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4939:1: rule__Page__TabNameAssignment_10_2 : ( RULE_STRING ) ;
    public final void rule__Page__TabNameAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4943:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4944:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4944:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4945:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTabNameSTRINGTerminalRuleCall_10_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__TabNameAssignment_10_29884); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getTabNameSTRINGTerminalRuleCall_10_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__TabNameAssignment_10_2"


    // $ANTLR start "rule__Page__HasPredicateAssignment_11_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4954:1: rule__Page__HasPredicateAssignment_11_2 : ( ruleEBoolean ) ;
    public final void rule__Page__HasPredicateAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4958:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4959:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4959:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4960:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getHasPredicateEBooleanParserRuleCall_11_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__Page__HasPredicateAssignment_11_29915);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getHasPredicateEBooleanParserRuleCall_11_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__HasPredicateAssignment_11_2"


    // $ANTLR start "rule__Page__ShowViewerAssignment_12_3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4969:1: rule__Page__ShowViewerAssignment_12_3 : ( ruleEBoolean ) ;
    public final void rule__Page__ShowViewerAssignment_12_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4973:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4974:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4974:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4975:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getShowViewerEBooleanParserRuleCall_12_3_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__Page__ShowViewerAssignment_12_39946);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getShowViewerEBooleanParserRuleCall_12_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__ShowViewerAssignment_12_3"


    // $ANTLR start "rule__Overview__DescriptionAssignment_3_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4984:1: rule__Overview__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Overview__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4988:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4989:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4989:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4990:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Overview__DescriptionAssignment_3_19977); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4999:1: rule__Overview__ImagePathOnAssignment_4_3 : ( RULE_STRING ) ;
    public final void rule__Overview__ImagePathOnAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5003:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5004:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5004:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5005:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImagePathOnSTRINGTerminalRuleCall_4_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Overview__ImagePathOnAssignment_4_310008); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5014:1: rule__Overview__ImagePathOffAssignment_5_3 : ( RULE_STRING ) ;
    public final void rule__Overview__ImagePathOffAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5018:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5019:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5019:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5020:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImagePathOffSTRINGTerminalRuleCall_5_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Overview__ImagePathOffAssignment_5_310039); if (state.failed) return ;
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


    // $ANTLR start "rule__SectionExtension__NameAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5029:1: rule__SectionExtension__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SectionExtension__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5033:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5034:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5034:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5035:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SectionExtension__NameAssignment_210070); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__NameAssignment_2"


    // $ANTLR start "rule__SectionExtension__ActivityExplorerItemIDAssignment_4_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5044:1: rule__SectionExtension__ActivityExplorerItemIDAssignment_4_1 : ( ruleFQN ) ;
    public final void rule__SectionExtension__ActivityExplorerItemIDAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5048:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5049:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5049:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5050:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getActivityExplorerItemIDFQNParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__SectionExtension__ActivityExplorerItemIDAssignment_4_110101);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getActivityExplorerItemIDFQNParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__ActivityExplorerItemIDAssignment_4_1"


    // $ANTLR start "rule__SectionExtension__ExtendedPageIDAssignment_7"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5059:1: rule__SectionExtension__ExtendedPageIDAssignment_7 : ( ruleFQN ) ;
    public final void rule__SectionExtension__ExtendedPageIDAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5063:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5064:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5064:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5065:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getExtendedPageIDFQNParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__SectionExtension__ExtendedPageIDAssignment_710132);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getExtendedPageIDFQNParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__ExtendedPageIDAssignment_7"


    // $ANTLR start "rule__SectionExtension__IndexAssignment_9"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5074:1: rule__SectionExtension__IndexAssignment_9 : ( ruleEInt ) ;
    public final void rule__SectionExtension__IndexAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5078:1: ( ( ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5079:1: ( ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5079:1: ( ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5080:1: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getIndexEIntParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_ruleEInt_in_rule__SectionExtension__IndexAssignment_910163);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getIndexEIntParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__IndexAssignment_9"


    // $ANTLR start "rule__SectionExtension__FilteringAssignment_10_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5089:1: rule__SectionExtension__FilteringAssignment_10_2 : ( ruleEBoolean ) ;
    public final void rule__SectionExtension__FilteringAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5093:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5094:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5094:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5095:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getFilteringEBooleanParserRuleCall_10_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__SectionExtension__FilteringAssignment_10_210194);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getFilteringEBooleanParserRuleCall_10_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__FilteringAssignment_10_2"


    // $ANTLR start "rule__SectionExtension__ExpandedAssignment_11_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5104:1: rule__SectionExtension__ExpandedAssignment_11_2 : ( ruleEBoolean ) ;
    public final void rule__SectionExtension__ExpandedAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5108:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5109:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5109:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5110:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getExpandedEBooleanParserRuleCall_11_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__SectionExtension__ExpandedAssignment_11_210225);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getExpandedEBooleanParserRuleCall_11_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__ExpandedAssignment_11_2"


    // $ANTLR start "rule__ActivityExtension__NameAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5119:1: rule__ActivityExtension__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ActivityExtension__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5123:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5124:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5124:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5125:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ActivityExtension__NameAssignment_210256); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__NameAssignment_2"


    // $ANTLR start "rule__ActivityExtension__ActivityExplorerItemIDAssignment_4_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5134:1: rule__ActivityExtension__ActivityExplorerItemIDAssignment_4_1 : ( ruleFQN ) ;
    public final void rule__ActivityExtension__ActivityExplorerItemIDAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5138:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5139:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5139:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5140:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getActivityExplorerItemIDFQNParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__ActivityExtension__ActivityExplorerItemIDAssignment_4_110287);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getActivityExplorerItemIDFQNParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__ActivityExplorerItemIDAssignment_4_1"


    // $ANTLR start "rule__ActivityExtension__ExtendedSectionIDAssignment_7"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5149:1: rule__ActivityExtension__ExtendedSectionIDAssignment_7 : ( ruleFQN ) ;
    public final void rule__ActivityExtension__ExtendedSectionIDAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5153:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5154:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5154:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5155:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getExtendedSectionIDFQNParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__ActivityExtension__ExtendedSectionIDAssignment_710318);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getExtendedSectionIDFQNParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__ExtendedSectionIDAssignment_7"


    // $ANTLR start "rule__ActivityExtension__IndexAssignment_9"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5164:1: rule__ActivityExtension__IndexAssignment_9 : ( ruleEInt ) ;
    public final void rule__ActivityExtension__IndexAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5168:1: ( ( ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5169:1: ( ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5169:1: ( ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5170:1: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getIndexEIntParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_ruleEInt_in_rule__ActivityExtension__IndexAssignment_910349);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getIndexEIntParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__IndexAssignment_9"


    // $ANTLR start "rule__ActivityExtension__HasPredicateAssignment_10_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5179:1: rule__ActivityExtension__HasPredicateAssignment_10_2 : ( ruleEBoolean ) ;
    public final void rule__ActivityExtension__HasPredicateAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5183:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5184:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5184:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5185:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getHasPredicateEBooleanParserRuleCall_10_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__ActivityExtension__HasPredicateAssignment_10_210380);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getHasPredicateEBooleanParserRuleCall_10_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__HasPredicateAssignment_10_2"


    // $ANTLR start "rule__ActivityExtension__ImagePathOffAssignment_11_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5194:1: rule__ActivityExtension__ImagePathOffAssignment_11_2 : ( RULE_STRING ) ;
    public final void rule__ActivityExtension__ImagePathOffAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5198:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5199:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5199:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5200:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityExtensionAccess().getImagePathOffSTRINGTerminalRuleCall_11_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ActivityExtension__ImagePathOffAssignment_11_210411); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityExtensionAccess().getImagePathOffSTRINGTerminalRuleCall_11_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityExtension__ImagePathOffAssignment_11_2"

    // $ANTLR start synpred26_InternalActivityexplorer
    public final void synpred26_InternalActivityexplorer_fragment() throws RecognitionException {   
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4580:4: ( ({...}? => ( ( ( rule__ViewpointActivityExplorer__Group_0__0 ) ) ) ) )
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4580:4: ({...}? => ( ( ( rule__ViewpointActivityExplorer__Group_0__0 ) ) ) )
        {
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4580:4: ({...}? => ( ( ( rule__ViewpointActivityExplorer__Group_0__0 ) ) ) )
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4581:5: {...}? => ( ( ( rule__ViewpointActivityExplorer__Group_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred26_InternalActivityexplorer", "getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 0)");
        }
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4581:120: ( ( ( rule__ViewpointActivityExplorer__Group_0__0 ) ) )
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4582:6: ( ( rule__ViewpointActivityExplorer__Group_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 0);
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4588:6: ( ( rule__ViewpointActivityExplorer__Group_0__0 ) )
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4590:7: ( rule__ViewpointActivityExplorer__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getViewpointActivityExplorerAccess().getGroup_0()); 
        }
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4591:7: ( rule__ViewpointActivityExplorer__Group_0__0 )
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4591:8: rule__ViewpointActivityExplorer__Group_0__0
        {
        pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group_0__0_in_synpred26_InternalActivityexplorer9026);
        rule__ViewpointActivityExplorer__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred26_InternalActivityexplorer

    // $ANTLR start synpred27_InternalActivityexplorer
    public final void synpred27_InternalActivityexplorer_fragment() throws RecognitionException {   
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4597:4: ( ({...}? => ( ( ( rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1 ) ) ) ) )
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4597:4: ({...}? => ( ( ( rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1 ) ) ) )
        {
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4597:4: ({...}? => ( ( ( rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1 ) ) ) )
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4598:5: {...}? => ( ( ( rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred27_InternalActivityexplorer", "getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 1)");
        }
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4598:120: ( ( ( rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1 ) ) )
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4599:6: ( ( rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 1);
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4605:6: ( ( rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1 ) )
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4607:7: ( rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedSectionsExtensionAssignment_1()); 
        }
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4608:7: ( rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1 )
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4608:8: rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1
        {
        pushFollow(FOLLOW_rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1_in_synpred27_InternalActivityexplorer9117);
        rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalActivityexplorer

    // $ANTLR start synpred28_InternalActivityexplorer
    public final void synpred28_InternalActivityexplorer_fragment() throws RecognitionException {   
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4646:2: ( rule__ViewpointActivityExplorer__UnorderedGroup__1 )
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4646:2: rule__ViewpointActivityExplorer__UnorderedGroup__1
        {
        pushFollow(FOLLOW_rule__ViewpointActivityExplorer__UnorderedGroup__1_in_synpred28_InternalActivityexplorer9270);
        rule__ViewpointActivityExplorer__UnorderedGroup__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalActivityexplorer

    // $ANTLR start synpred29_InternalActivityexplorer
    public final void synpred29_InternalActivityexplorer_fragment() throws RecognitionException {   
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4659:2: ( rule__ViewpointActivityExplorer__UnorderedGroup__2 )
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4659:2: rule__ViewpointActivityExplorer__UnorderedGroup__2
        {
        pushFollow(FOLLOW_rule__ViewpointActivityExplorer__UnorderedGroup__2_in_synpred29_InternalActivityexplorer9298);
        rule__ViewpointActivityExplorer__UnorderedGroup__2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalActivityexplorer

    // Delegated rules

    public final boolean synpred29_InternalActivityexplorer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalActivityexplorer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalActivityexplorer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalActivityexplorer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalActivityexplorer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalActivityexplorer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalActivityexplorer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalActivityexplorer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleViewpointActivityExplorer_in_entryRuleViewpointActivityExplorer67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewpointActivityExplorer74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__UnorderedGroup_in_ruleViewpointActivityExplorer100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePages_in_entryRulePages127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePages134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pages__Group__0_in_rulePages160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSections_in_entryRuleSections187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSections194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sections__Group__0_in_ruleSections220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivities_in_entryRuleActivities247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivities254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activities__Group__0_in_ruleActivities280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__0_in_rulePage340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverview_in_entryRuleOverview367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverview374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__0_in_ruleOverview400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionExtension_in_entryRuleSectionExtension427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionExtension434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__0_in_ruleSectionExtension460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityExtension_in_entryRuleActivityExtension487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityExtension494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__0_in_ruleActivityExtension520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEInt676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEInt702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__EBoolean__Alternatives739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EBoolean__Alternatives759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_0__0__Impl_in_rule__ViewpointActivityExplorer__Group_0__0791 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_0__1_in_rule__ViewpointActivityExplorer__Group_0__0794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ViewpointActivityExplorer__Group_0__0__Impl822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_0__1__Impl_in_rule__ViewpointActivityExplorer__Group_0__1853 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_0__2_in_rule__ViewpointActivityExplorer__Group_0__1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ViewpointActivityExplorer__Group_0__1__Impl884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_0__2__Impl_in_rule__ViewpointActivityExplorer__Group_0__2915 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_0__3_in_rule__ViewpointActivityExplorer__Group_0__2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__NameAssignment_0_2_in_rule__ViewpointActivityExplorer__Group_0__2__Impl945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_0__3__Impl_in_rule__ViewpointActivityExplorer__Group_0__3975 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_0__4_in_rule__ViewpointActivityExplorer__Group_0__3978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ViewpointActivityExplorer__Group_0__3__Impl1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_0__4__Impl_in_rule__ViewpointActivityExplorer__Group_0__41037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__OwnedNewPagesAssignment_0_4_in_rule__ViewpointActivityExplorer__Group_0__4__Impl1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_2__0__Impl_in_rule__ViewpointActivityExplorer__Group_2__01105 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_2__1_in_rule__ViewpointActivityExplorer__Group_2__01108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__OwnedActivitiesExtensionAssignment_2_0_in_rule__ViewpointActivityExplorer__Group_2__0__Impl1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_2__1__Impl_in_rule__ViewpointActivityExplorer__Group_2__11166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ViewpointActivityExplorer__Group_2__1__Impl1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pages__Group__0__Impl_in_rule__Pages__Group__01229 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Pages__Group__1_in_rule__Pages__Group__01232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pages__Group__1__Impl_in_rule__Pages__Group__11290 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Pages__Group__2_in_rule__Pages__Group__11293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Pages__Group__1__Impl1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pages__Group__2__Impl_in_rule__Pages__Group__21352 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Pages__Group__3_in_rule__Pages__Group__21355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Pages__Group__2__Impl1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pages__Group__3__Impl_in_rule__Pages__Group__31414 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_rule__Pages__Group__4_in_rule__Pages__Group__31417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pages__OwnedActivityExplorerPagesAssignment_3_in_rule__Pages__Group__3__Impl1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pages__Group__4__Impl_in_rule__Pages__Group__41474 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_rule__Pages__Group__5_in_rule__Pages__Group__41477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pages__OwnedActivityExplorerPagesAssignment_4_in_rule__Pages__Group__4__Impl1504 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Pages__Group__5__Impl_in_rule__Pages__Group__51535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Pages__Group__5__Impl1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sections__Group__0__Impl_in_rule__Sections__Group__01606 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Sections__Group__1_in_rule__Sections__Group__01609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sections__Group__1__Impl_in_rule__Sections__Group__11667 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Sections__Group__2_in_rule__Sections__Group__11670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Sections__Group__1__Impl1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sections__Group__2__Impl_in_rule__Sections__Group__21729 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Sections__Group__3_in_rule__Sections__Group__21732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Sections__Group__2__Impl1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sections__Group__3__Impl_in_rule__Sections__Group__31791 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_rule__Sections__Group__4_in_rule__Sections__Group__31794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sections__OwnedSectionsExtensionsAssignment_3_in_rule__Sections__Group__3__Impl1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sections__Group__4__Impl_in_rule__Sections__Group__41851 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_rule__Sections__Group__5_in_rule__Sections__Group__41854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sections__OwnedSectionsExtensionsAssignment_4_in_rule__Sections__Group__4__Impl1881 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Sections__Group__5__Impl_in_rule__Sections__Group__51912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Sections__Group__5__Impl1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activities__Group__0__Impl_in_rule__Activities__Group__01983 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Activities__Group__1_in_rule__Activities__Group__01986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activities__Group__1__Impl_in_rule__Activities__Group__12044 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Activities__Group__2_in_rule__Activities__Group__12047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Activities__Group__1__Impl2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activities__Group__2__Impl_in_rule__Activities__Group__22106 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Activities__Group__3_in_rule__Activities__Group__22109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Activities__Group__2__Impl2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activities__Group__3__Impl_in_rule__Activities__Group__32168 = new BitSet(new long[]{0x0000040000010000L});
    public static final BitSet FOLLOW_rule__Activities__Group__4_in_rule__Activities__Group__32171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activities__OwnedActivitiesExtensionsAssignment_3_in_rule__Activities__Group__3__Impl2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activities__Group__4__Impl_in_rule__Activities__Group__42228 = new BitSet(new long[]{0x0000040000010000L});
    public static final BitSet FOLLOW_rule__Activities__Group__5_in_rule__Activities__Group__42231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activities__OwnedActivitiesExtensionsAssignment_4_in_rule__Activities__Group__4__Impl2258 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__Activities__Group__5__Impl_in_rule__Activities__Group__52289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Activities__Group__5__Impl2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__02360 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__02363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__12421 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__12424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Page__Group__1__Impl2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__22483 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__22486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__NameAssignment_2_in_rule__Page__Group__2__Impl2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__32543 = new BitSet(new long[]{0x0000000001600000L});
    public static final BitSet FOLLOW_rule__Page__Group__4_in_rule__Page__Group__32546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Page__Group__3__Impl2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__42605 = new BitSet(new long[]{0x0000000001600000L});
    public static final BitSet FOLLOW_rule__Page__Group__5_in_rule__Page__Group__42608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_4__0_in_rule__Page__Group__4__Impl2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__52666 = new BitSet(new long[]{0x0000000001600000L});
    public static final BitSet FOLLOW_rule__Page__Group__6_in_rule__Page__Group__52669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__0_in_rule__Page__Group__5__Impl2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__6__Impl_in_rule__Page__Group__62727 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Page__Group__7_in_rule__Page__Group__62730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Page__Group__6__Impl2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__7__Impl_in_rule__Page__Group__72789 = new BitSet(new long[]{0x0000000B42010000L});
    public static final BitSet FOLLOW_rule__Page__Group__8_in_rule__Page__Group__72792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__IndexAssignment_7_in_rule__Page__Group__7__Impl2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__8__Impl_in_rule__Page__Group__82849 = new BitSet(new long[]{0x0000000B42010000L});
    public static final BitSet FOLLOW_rule__Page__Group__9_in_rule__Page__Group__82852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__OwnedOverviewAssignment_8_in_rule__Page__Group__8__Impl2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__9__Impl_in_rule__Page__Group__92910 = new BitSet(new long[]{0x0000000B42010000L});
    public static final BitSet FOLLOW_rule__Page__Group__10_in_rule__Page__Group__92913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_9__0_in_rule__Page__Group__9__Impl2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__10__Impl_in_rule__Page__Group__102971 = new BitSet(new long[]{0x0000000B42010000L});
    public static final BitSet FOLLOW_rule__Page__Group__11_in_rule__Page__Group__102974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10__0_in_rule__Page__Group__10__Impl3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__11__Impl_in_rule__Page__Group__113032 = new BitSet(new long[]{0x0000000B42010000L});
    public static final BitSet FOLLOW_rule__Page__Group__12_in_rule__Page__Group__113035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11__0_in_rule__Page__Group__11__Impl3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__12__Impl_in_rule__Page__Group__123093 = new BitSet(new long[]{0x0000000B42010000L});
    public static final BitSet FOLLOW_rule__Page__Group__13_in_rule__Page__Group__123096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_12__0_in_rule__Page__Group__12__Impl3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__13__Impl_in_rule__Page__Group__133154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Page__Group__13__Impl3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_4__0__Impl_in_rule__Page__Group_4__03241 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Page__Group_4__1_in_rule__Page__Group_4__03244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Page__Group_4__0__Impl3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_4__1__Impl_in_rule__Page__Group_4__13303 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Page__Group_4__2_in_rule__Page__Group_4__13306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Page__Group_4__1__Impl3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_4__2__Impl_in_rule__Page__Group_4__23365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__ModelTypeAssignment_4_2_in_rule__Page__Group_4__2__Impl3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__0__Impl_in_rule__Page__Group_5__03428 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Page__Group_5__1_in_rule__Page__Group_5__03431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Page__Group_5__0__Impl3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__1__Impl_in_rule__Page__Group_5__13490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__ActivityExplorerItemIDAssignment_5_1_in_rule__Page__Group_5__1__Impl3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_9__0__Impl_in_rule__Page__Group_9__03551 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Page__Group_9__1_in_rule__Page__Group_9__03554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Page__Group_9__0__Impl3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_9__1__Impl_in_rule__Page__Group_9__13613 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_rule__Page__Group_9__2_in_rule__Page__Group_9__13616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Page__Group_9__1__Impl3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_9__2__Impl_in_rule__Page__Group_9__23675 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_rule__Page__Group_9__3_in_rule__Page__Group_9__23678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_9_2__0_in_rule__Page__Group_9__2__Impl3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_9__3__Impl_in_rule__Page__Group_9__33736 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_rule__Page__Group_9__4_in_rule__Page__Group_9__33739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_9_3__0_in_rule__Page__Group_9__3__Impl3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_9__4__Impl_in_rule__Page__Group_9__43797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Page__Group_9__4__Impl3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_9_2__0__Impl_in_rule__Page__Group_9_2__03866 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Page__Group_9_2__1_in_rule__Page__Group_9_2__03869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Page__Group_9_2__0__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_9_2__1__Impl_in_rule__Page__Group_9_2__13928 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Page__Group_9_2__2_in_rule__Page__Group_9_2__13931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Page__Group_9_2__1__Impl3959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_9_2__2__Impl_in_rule__Page__Group_9_2__23990 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Page__Group_9_2__3_in_rule__Page__Group_9_2__23993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Page__Group_9_2__2__Impl4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_9_2__3__Impl_in_rule__Page__Group_9_2__34052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__ImagePathOnAssignment_9_2_3_in_rule__Page__Group_9_2__3__Impl4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_9_3__0__Impl_in_rule__Page__Group_9_3__04117 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Page__Group_9_3__1_in_rule__Page__Group_9_3__04120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Page__Group_9_3__0__Impl4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_9_3__1__Impl_in_rule__Page__Group_9_3__14179 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Page__Group_9_3__2_in_rule__Page__Group_9_3__14182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Page__Group_9_3__1__Impl4210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_9_3__2__Impl_in_rule__Page__Group_9_3__24241 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Page__Group_9_3__3_in_rule__Page__Group_9_3__24244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Page__Group_9_3__2__Impl4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_9_3__3__Impl_in_rule__Page__Group_9_3__34303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__ImagePathOffAssignment_9_3_3_in_rule__Page__Group_9_3__3__Impl4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10__0__Impl_in_rule__Page__Group_10__04368 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Page__Group_10__1_in_rule__Page__Group_10__04371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Page__Group_10__0__Impl4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10__1__Impl_in_rule__Page__Group_10__14430 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Page__Group_10__2_in_rule__Page__Group_10__14433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Page__Group_10__1__Impl4461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10__2__Impl_in_rule__Page__Group_10__24492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__TabNameAssignment_10_2_in_rule__Page__Group_10__2__Impl4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11__0__Impl_in_rule__Page__Group_11__04555 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Page__Group_11__1_in_rule__Page__Group_11__04558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Page__Group_11__0__Impl4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11__1__Impl_in_rule__Page__Group_11__14617 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Page__Group_11__2_in_rule__Page__Group_11__14620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Page__Group_11__1__Impl4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11__2__Impl_in_rule__Page__Group_11__24679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__HasPredicateAssignment_11_2_in_rule__Page__Group_11__2__Impl4706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_12__0__Impl_in_rule__Page__Group_12__04742 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Page__Group_12__1_in_rule__Page__Group_12__04745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Page__Group_12__0__Impl4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_12__1__Impl_in_rule__Page__Group_12__14804 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Page__Group_12__2_in_rule__Page__Group_12__14807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Page__Group_12__1__Impl4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_12__2__Impl_in_rule__Page__Group_12__24866 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Page__Group_12__3_in_rule__Page__Group_12__24869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Page__Group_12__2__Impl4897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_12__3__Impl_in_rule__Page__Group_12__34928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__ShowViewerAssignment_12_3_in_rule__Page__Group_12__3__Impl4955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__0__Impl_in_rule__Overview__Group__04993 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Overview__Group__1_in_rule__Overview__Group__04996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__1__Impl_in_rule__Overview__Group__15054 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Overview__Group__2_in_rule__Overview__Group__15057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Overview__Group__1__Impl5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__2__Impl_in_rule__Overview__Group__25116 = new BitSet(new long[]{0x0000001004010000L});
    public static final BitSet FOLLOW_rule__Overview__Group__3_in_rule__Overview__Group__25119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Overview__Group__2__Impl5147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__3__Impl_in_rule__Overview__Group__35178 = new BitSet(new long[]{0x0000001004010000L});
    public static final BitSet FOLLOW_rule__Overview__Group__4_in_rule__Overview__Group__35181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_3__0_in_rule__Overview__Group__3__Impl5208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__4__Impl_in_rule__Overview__Group__45239 = new BitSet(new long[]{0x0000001004010000L});
    public static final BitSet FOLLOW_rule__Overview__Group__5_in_rule__Overview__Group__45242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__0_in_rule__Overview__Group__4__Impl5269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__5__Impl_in_rule__Overview__Group__55300 = new BitSet(new long[]{0x0000001004010000L});
    public static final BitSet FOLLOW_rule__Overview__Group__6_in_rule__Overview__Group__55303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__0_in_rule__Overview__Group__5__Impl5330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__6__Impl_in_rule__Overview__Group__65361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Overview__Group__6__Impl5389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_3__0__Impl_in_rule__Overview__Group_3__05434 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Overview__Group_3__1_in_rule__Overview__Group_3__05437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Overview__Group_3__0__Impl5465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_3__1__Impl_in_rule__Overview__Group_3__15496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__DescriptionAssignment_3_1_in_rule__Overview__Group_3__1__Impl5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__0__Impl_in_rule__Overview__Group_4__05557 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__1_in_rule__Overview__Group_4__05560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Overview__Group_4__0__Impl5588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__1__Impl_in_rule__Overview__Group_4__15619 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__2_in_rule__Overview__Group_4__15622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Overview__Group_4__1__Impl5650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__2__Impl_in_rule__Overview__Group_4__25681 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__3_in_rule__Overview__Group_4__25684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Overview__Group_4__2__Impl5712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__3__Impl_in_rule__Overview__Group_4__35743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__ImagePathOnAssignment_4_3_in_rule__Overview__Group_4__3__Impl5770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__0__Impl_in_rule__Overview__Group_5__05808 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__1_in_rule__Overview__Group_5__05811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Overview__Group_5__0__Impl5839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__1__Impl_in_rule__Overview__Group_5__15870 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__2_in_rule__Overview__Group_5__15873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Overview__Group_5__1__Impl5901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__2__Impl_in_rule__Overview__Group_5__25932 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__3_in_rule__Overview__Group_5__25935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Overview__Group_5__2__Impl5963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__3__Impl_in_rule__Overview__Group_5__35994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__ImagePathOffAssignment_5_3_in_rule__Overview__Group_5__3__Impl6021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__0__Impl_in_rule__SectionExtension__Group__06059 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__1_in_rule__SectionExtension__Group__06062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__1__Impl_in_rule__SectionExtension__Group__16120 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__2_in_rule__SectionExtension__Group__16123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__SectionExtension__Group__1__Impl6151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__2__Impl_in_rule__SectionExtension__Group__26182 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__3_in_rule__SectionExtension__Group__26185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__NameAssignment_2_in_rule__SectionExtension__Group__2__Impl6212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__3__Impl_in_rule__SectionExtension__Group__36242 = new BitSet(new long[]{0x0000004001000000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__4_in_rule__SectionExtension__Group__36245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SectionExtension__Group__3__Impl6273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__4__Impl_in_rule__SectionExtension__Group__46304 = new BitSet(new long[]{0x0000004001000000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__5_in_rule__SectionExtension__Group__46307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group_4__0_in_rule__SectionExtension__Group__4__Impl6334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__5__Impl_in_rule__SectionExtension__Group__56365 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__6_in_rule__SectionExtension__Group__56368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__SectionExtension__Group__5__Impl6396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__6__Impl_in_rule__SectionExtension__Group__66427 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__7_in_rule__SectionExtension__Group__66430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__SectionExtension__Group__6__Impl6458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__7__Impl_in_rule__SectionExtension__Group__76489 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__8_in_rule__SectionExtension__Group__76492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__ExtendedPageIDAssignment_7_in_rule__SectionExtension__Group__7__Impl6519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__8__Impl_in_rule__SectionExtension__Group__86549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__9_in_rule__SectionExtension__Group__86552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SectionExtension__Group__8__Impl6580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__9__Impl_in_rule__SectionExtension__Group__96611 = new BitSet(new long[]{0x0000030000010000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__10_in_rule__SectionExtension__Group__96614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__IndexAssignment_9_in_rule__SectionExtension__Group__9__Impl6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__10__Impl_in_rule__SectionExtension__Group__106671 = new BitSet(new long[]{0x0000030000010000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__11_in_rule__SectionExtension__Group__106674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group_10__0_in_rule__SectionExtension__Group__10__Impl6701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__11__Impl_in_rule__SectionExtension__Group__116732 = new BitSet(new long[]{0x0000030000010000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__12_in_rule__SectionExtension__Group__116735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group_11__0_in_rule__SectionExtension__Group__11__Impl6762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__12__Impl_in_rule__SectionExtension__Group__126793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SectionExtension__Group__12__Impl6821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group_4__0__Impl_in_rule__SectionExtension__Group_4__06878 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group_4__1_in_rule__SectionExtension__Group_4__06881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SectionExtension__Group_4__0__Impl6909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group_4__1__Impl_in_rule__SectionExtension__Group_4__16940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__ActivityExplorerItemIDAssignment_4_1_in_rule__SectionExtension__Group_4__1__Impl6967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group_10__0__Impl_in_rule__SectionExtension__Group_10__07001 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group_10__1_in_rule__SectionExtension__Group_10__07004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SectionExtension__Group_10__0__Impl7032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group_10__1__Impl_in_rule__SectionExtension__Group_10__17063 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group_10__2_in_rule__SectionExtension__Group_10__17066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SectionExtension__Group_10__1__Impl7094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group_10__2__Impl_in_rule__SectionExtension__Group_10__27125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__FilteringAssignment_10_2_in_rule__SectionExtension__Group_10__2__Impl7152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group_11__0__Impl_in_rule__SectionExtension__Group_11__07188 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group_11__1_in_rule__SectionExtension__Group_11__07191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__SectionExtension__Group_11__0__Impl7219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group_11__1__Impl_in_rule__SectionExtension__Group_11__17250 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group_11__2_in_rule__SectionExtension__Group_11__17253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SectionExtension__Group_11__1__Impl7281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group_11__2__Impl_in_rule__SectionExtension__Group_11__27312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__ExpandedAssignment_11_2_in_rule__SectionExtension__Group_11__2__Impl7339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__0__Impl_in_rule__ActivityExtension__Group__07375 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__1_in_rule__ActivityExtension__Group__07378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__1__Impl_in_rule__ActivityExtension__Group__17436 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__2_in_rule__ActivityExtension__Group__17439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ActivityExtension__Group__1__Impl7467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__2__Impl_in_rule__ActivityExtension__Group__27498 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__3_in_rule__ActivityExtension__Group__27501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__NameAssignment_2_in_rule__ActivityExtension__Group__2__Impl7528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__3__Impl_in_rule__ActivityExtension__Group__37558 = new BitSet(new long[]{0x0000004001000000L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__4_in_rule__ActivityExtension__Group__37561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ActivityExtension__Group__3__Impl7589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__4__Impl_in_rule__ActivityExtension__Group__47620 = new BitSet(new long[]{0x0000004001000000L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__5_in_rule__ActivityExtension__Group__47623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group_4__0_in_rule__ActivityExtension__Group__4__Impl7650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__5__Impl_in_rule__ActivityExtension__Group__57681 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__6_in_rule__ActivityExtension__Group__57684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ActivityExtension__Group__5__Impl7712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__6__Impl_in_rule__ActivityExtension__Group__67743 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__7_in_rule__ActivityExtension__Group__67746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ActivityExtension__Group__6__Impl7774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__7__Impl_in_rule__ActivityExtension__Group__77805 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__8_in_rule__ActivityExtension__Group__77808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__ExtendedSectionIDAssignment_7_in_rule__ActivityExtension__Group__7__Impl7835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__8__Impl_in_rule__ActivityExtension__Group__87865 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__9_in_rule__ActivityExtension__Group__87868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ActivityExtension__Group__8__Impl7896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__9__Impl_in_rule__ActivityExtension__Group__97927 = new BitSet(new long[]{0x0000080100010000L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__10_in_rule__ActivityExtension__Group__97930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__IndexAssignment_9_in_rule__ActivityExtension__Group__9__Impl7957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__10__Impl_in_rule__ActivityExtension__Group__107987 = new BitSet(new long[]{0x0000080100010000L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__11_in_rule__ActivityExtension__Group__107990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group_10__0_in_rule__ActivityExtension__Group__10__Impl8017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__11__Impl_in_rule__ActivityExtension__Group__118048 = new BitSet(new long[]{0x0000080100010000L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__12_in_rule__ActivityExtension__Group__118051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group_11__0_in_rule__ActivityExtension__Group__11__Impl8078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group__12__Impl_in_rule__ActivityExtension__Group__128109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ActivityExtension__Group__12__Impl8137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group_4__0__Impl_in_rule__ActivityExtension__Group_4__08194 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group_4__1_in_rule__ActivityExtension__Group_4__08197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ActivityExtension__Group_4__0__Impl8225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group_4__1__Impl_in_rule__ActivityExtension__Group_4__18256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__ActivityExplorerItemIDAssignment_4_1_in_rule__ActivityExtension__Group_4__1__Impl8283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group_10__0__Impl_in_rule__ActivityExtension__Group_10__08317 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group_10__1_in_rule__ActivityExtension__Group_10__08320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ActivityExtension__Group_10__0__Impl8348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group_10__1__Impl_in_rule__ActivityExtension__Group_10__18379 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group_10__2_in_rule__ActivityExtension__Group_10__18382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ActivityExtension__Group_10__1__Impl8410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group_10__2__Impl_in_rule__ActivityExtension__Group_10__28441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__HasPredicateAssignment_10_2_in_rule__ActivityExtension__Group_10__2__Impl8468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group_11__0__Impl_in_rule__ActivityExtension__Group_11__08504 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group_11__1_in_rule__ActivityExtension__Group_11__08507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ActivityExtension__Group_11__0__Impl8535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group_11__1__Impl_in_rule__ActivityExtension__Group_11__18566 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group_11__2_in_rule__ActivityExtension__Group_11__18569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ActivityExtension__Group_11__1__Impl8597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__Group_11__2__Impl_in_rule__ActivityExtension__Group_11__28628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityExtension__ImagePathOffAssignment_11_2_in_rule__ActivityExtension__Group_11__2__Impl8655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__08691 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__08694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl8721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__18750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl8777 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__08812 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__08815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__FQN__Group_1__0__Impl8843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__18874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl8902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__UnorderedGroup__0_in_rule__ViewpointActivityExplorer__UnorderedGroup8937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_0__0_in_rule__ViewpointActivityExplorer__UnorderedGroup__Impl9026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1_in_rule__ViewpointActivityExplorer__UnorderedGroup__Impl9117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_2__0_in_rule__ViewpointActivityExplorer__UnorderedGroup__Impl9208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__UnorderedGroup__Impl_in_rule__ViewpointActivityExplorer__UnorderedGroup__09267 = new BitSet(new long[]{0x00000000000D2002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__UnorderedGroup__1_in_rule__ViewpointActivityExplorer__UnorderedGroup__09270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__UnorderedGroup__Impl_in_rule__ViewpointActivityExplorer__UnorderedGroup__19295 = new BitSet(new long[]{0x00000000000D2002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__UnorderedGroup__2_in_rule__ViewpointActivityExplorer__UnorderedGroup__19298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__UnorderedGroup__Impl_in_rule__ViewpointActivityExplorer__UnorderedGroup__29323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__ViewpointActivityExplorer__NameAssignment_0_29357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePages_in_rule__ViewpointActivityExplorer__OwnedNewPagesAssignment_0_49388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSections_in_rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_19419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivities_in_rule__ViewpointActivityExplorer__OwnedActivitiesExtensionAssignment_2_09450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_rule__Pages__OwnedActivityExplorerPagesAssignment_39481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_rule__Pages__OwnedActivityExplorerPagesAssignment_49512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionExtension_in_rule__Sections__OwnedSectionsExtensionsAssignment_39543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionExtension_in_rule__Sections__OwnedSectionsExtensionsAssignment_49574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityExtension_in_rule__Activities__OwnedActivitiesExtensionsAssignment_39605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityExtension_in_rule__Activities__OwnedActivitiesExtensionsAssignment_49636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__NameAssignment_29667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__ModelTypeAssignment_4_29698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Page__ActivityExplorerItemIDAssignment_5_19729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_rule__Page__IndexAssignment_79760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverview_in_rule__Page__OwnedOverviewAssignment_89791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__ImagePathOnAssignment_9_2_39822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__ImagePathOffAssignment_9_3_39853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__TabNameAssignment_10_29884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__Page__HasPredicateAssignment_11_29915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__Page__ShowViewerAssignment_12_39946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Overview__DescriptionAssignment_3_19977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Overview__ImagePathOnAssignment_4_310008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Overview__ImagePathOffAssignment_5_310039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SectionExtension__NameAssignment_210070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__SectionExtension__ActivityExplorerItemIDAssignment_4_110101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__SectionExtension__ExtendedPageIDAssignment_710132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_rule__SectionExtension__IndexAssignment_910163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__SectionExtension__FilteringAssignment_10_210194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__SectionExtension__ExpandedAssignment_11_210225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ActivityExtension__NameAssignment_210256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__ActivityExtension__ActivityExplorerItemIDAssignment_4_110287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__ActivityExtension__ExtendedSectionIDAssignment_710318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_rule__ActivityExtension__IndexAssignment_910349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__ActivityExtension__HasPredicateAssignment_10_210380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ActivityExtension__ImagePathOffAssignment_11_210411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_0__0_in_synpred26_InternalActivityexplorer9026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1_in_synpred27_InternalActivityexplorer9117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__UnorderedGroup__1_in_synpred28_InternalActivityexplorer9270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__UnorderedGroup__2_in_synpred29_InternalActivityexplorer9298 = new BitSet(new long[]{0x0000000000000002L});

}

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ActivityexplorerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalActivityexplorerParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Activity'", "'Explorer'", "'{'", "'}'", "'Pages'", "'Sections'", "'Activities'", "'Page'", "'model'", "'type'", "'id'", "'index'", "'header'", "'image'", "'on'", "':'", "'off'", "'tab'", "'name'", "'predicated'", "'show'", "'viewer'", "'Overview'", "'description'", "'section'", "'extended'", "'page'", "'filtering'", "'expanded'", "'activity'", "'icon'", "'.'", "'true'", "'false'"
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
    public static final int RULE_INT=6;
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
    public static final int RULE_STRING=4;
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
    public String getGrammarFileName() { return "../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g"; }



     	private ActivityexplorerGrammarAccess grammarAccess;
     	
        public InternalActivityexplorerParser(TokenStream input, ActivityexplorerGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ViewpointActivityExplorer";	
       	}
       	
       	@Override
       	protected ActivityexplorerGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleViewpointActivityExplorer"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:67:1: entryRuleViewpointActivityExplorer returns [EObject current=null] : iv_ruleViewpointActivityExplorer= ruleViewpointActivityExplorer EOF ;
    public final EObject entryRuleViewpointActivityExplorer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewpointActivityExplorer = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:68:2: (iv_ruleViewpointActivityExplorer= ruleViewpointActivityExplorer EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:69:2: iv_ruleViewpointActivityExplorer= ruleViewpointActivityExplorer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getViewpointActivityExplorerRule()); 
            }
            pushFollow(FOLLOW_ruleViewpointActivityExplorer_in_entryRuleViewpointActivityExplorer75);
            iv_ruleViewpointActivityExplorer=ruleViewpointActivityExplorer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleViewpointActivityExplorer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewpointActivityExplorer85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewpointActivityExplorer"


    // $ANTLR start "ruleViewpointActivityExplorer"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:76:1: ruleViewpointActivityExplorer returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Activity' otherlv_2= 'Explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' ( (lv_ownedNewPages_5_0= rulePages ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ownedSectionsExtension_6_0= ruleSections ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedActivitiesExtension_7_0= ruleActivities ) )? otherlv_8= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleViewpointActivityExplorer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_ownedNewPages_5_0 = null;

        EObject lv_ownedSectionsExtension_6_0 = null;

        EObject lv_ownedActivitiesExtension_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:79:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Activity' otherlv_2= 'Explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' ( (lv_ownedNewPages_5_0= rulePages ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ownedSectionsExtension_6_0= ruleSections ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedActivitiesExtension_7_0= ruleActivities ) )? otherlv_8= '}' ) ) ) ) )+ {...}?) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:80:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Activity' otherlv_2= 'Explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' ( (lv_ownedNewPages_5_0= rulePages ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ownedSectionsExtension_6_0= ruleSections ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedActivitiesExtension_7_0= ruleActivities ) )? otherlv_8= '}' ) ) ) ) )+ {...}?) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:80:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Activity' otherlv_2= 'Explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' ( (lv_ownedNewPages_5_0= rulePages ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ownedSectionsExtension_6_0= ruleSections ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedActivitiesExtension_7_0= ruleActivities ) )? otherlv_8= '}' ) ) ) ) )+ {...}?) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:82:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Activity' otherlv_2= 'Explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' ( (lv_ownedNewPages_5_0= rulePages ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ownedSectionsExtension_6_0= ruleSections ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedActivitiesExtension_7_0= ruleActivities ) )? otherlv_8= '}' ) ) ) ) )+ {...}?) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:82:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Activity' otherlv_2= 'Explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' ( (lv_ownedNewPages_5_0= rulePages ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ownedSectionsExtension_6_0= ruleSections ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedActivitiesExtension_7_0= ruleActivities ) )? otherlv_8= '}' ) ) ) ) )+ {...}?) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:83:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Activity' otherlv_2= 'Explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' ( (lv_ownedNewPages_5_0= rulePages ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ownedSectionsExtension_6_0= ruleSections ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedActivitiesExtension_7_0= ruleActivities ) )? otherlv_8= '}' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup());
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:86:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Activity' otherlv_2= 'Explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' ( (lv_ownedNewPages_5_0= rulePages ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ownedSectionsExtension_6_0= ruleSections ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedActivitiesExtension_7_0= ruleActivities ) )? otherlv_8= '}' ) ) ) ) )+ {...}?)
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:87:3: ( ({...}? => ( ({...}? => (otherlv_1= 'Activity' otherlv_2= 'Explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' ( (lv_ownedNewPages_5_0= rulePages ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ownedSectionsExtension_6_0= ruleSections ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedActivitiesExtension_7_0= ruleActivities ) )? otherlv_8= '}' ) ) ) ) )+ {...}?
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:87:3: ( ({...}? => ( ({...}? => (otherlv_1= 'Activity' otherlv_2= 'Explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' ( (lv_ownedNewPages_5_0= rulePages ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ownedSectionsExtension_6_0= ruleSections ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedActivitiesExtension_7_0= ruleActivities ) )? otherlv_8= '}' ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=4;
                int LA3_0 = input.LA(1);

                if ( LA3_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 1) ) {
                    alt3=2;
                }
                else if ( (LA3_0==14||LA3_0==17) && getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 2) ) {
                    alt3=3;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:89:4: ({...}? => ( ({...}? => (otherlv_1= 'Activity' otherlv_2= 'Explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' ( (lv_ownedNewPages_5_0= rulePages ) )? ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:89:4: ({...}? => ( ({...}? => (otherlv_1= 'Activity' otherlv_2= 'Explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' ( (lv_ownedNewPages_5_0= rulePages ) )? ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:90:5: {...}? => ( ({...}? => (otherlv_1= 'Activity' otherlv_2= 'Explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' ( (lv_ownedNewPages_5_0= rulePages ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleViewpointActivityExplorer", "getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:90:120: ( ({...}? => (otherlv_1= 'Activity' otherlv_2= 'Explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' ( (lv_ownedNewPages_5_0= rulePages ) )? ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:91:6: ({...}? => (otherlv_1= 'Activity' otherlv_2= 'Explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' ( (lv_ownedNewPages_5_0= rulePages ) )? ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 0);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:94:6: ({...}? => (otherlv_1= 'Activity' otherlv_2= 'Explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' ( (lv_ownedNewPages_5_0= rulePages ) )? ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:94:7: {...}? => (otherlv_1= 'Activity' otherlv_2= 'Explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' ( (lv_ownedNewPages_5_0= rulePages ) )? )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleViewpointActivityExplorer", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:94:16: (otherlv_1= 'Activity' otherlv_2= 'Explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' ( (lv_ownedNewPages_5_0= rulePages ) )? )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:94:18: otherlv_1= 'Activity' otherlv_2= 'Explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' ( (lv_ownedNewPages_5_0= rulePages ) )?
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleViewpointActivityExplorer167); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getViewpointActivityExplorerAccess().getActivityKeyword_0_0());
            	          
            	    }
            	    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleViewpointActivityExplorer179); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getViewpointActivityExplorerAccess().getExplorerKeyword_0_1());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:102:1: ( (lv_name_3_0= ruleFQN ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:103:1: (lv_name_3_0= ruleFQN )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:103:1: (lv_name_3_0= ruleFQN )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:104:3: lv_name_3_0= ruleFQN
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getViewpointActivityExplorerAccess().getNameFQNParserRuleCall_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFQN_in_ruleViewpointActivityExplorer200);
            	    lv_name_3_0=ruleFQN();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getViewpointActivityExplorerRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"name",
            	              		lv_name_3_0, 
            	              		"FQN");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleViewpointActivityExplorer212); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getViewpointActivityExplorerAccess().getLeftCurlyBracketKeyword_0_3());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:124:1: ( (lv_ownedNewPages_5_0= rulePages ) )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==15) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:125:1: (lv_ownedNewPages_5_0= rulePages )
            	            {
            	            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:125:1: (lv_ownedNewPages_5_0= rulePages )
            	            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:126:3: lv_ownedNewPages_5_0= rulePages
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getViewpointActivityExplorerAccess().getOwnedNewPagesPagesParserRuleCall_0_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_rulePages_in_ruleViewpointActivityExplorer233);
            	            lv_ownedNewPages_5_0=rulePages();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getViewpointActivityExplorerRule());
            	              	        }
            	                     		set(
            	                     			current, 
            	                     			"ownedNewPages",
            	                      		lv_ownedNewPages_5_0, 
            	                      		"Pages");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:149:4: ({...}? => ( ({...}? => ( (lv_ownedSectionsExtension_6_0= ruleSections ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:149:4: ({...}? => ( ({...}? => ( (lv_ownedSectionsExtension_6_0= ruleSections ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:150:5: {...}? => ( ({...}? => ( (lv_ownedSectionsExtension_6_0= ruleSections ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleViewpointActivityExplorer", "getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:150:120: ( ({...}? => ( (lv_ownedSectionsExtension_6_0= ruleSections ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:151:6: ({...}? => ( (lv_ownedSectionsExtension_6_0= ruleSections ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 1);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:154:6: ({...}? => ( (lv_ownedSectionsExtension_6_0= ruleSections ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:154:7: {...}? => ( (lv_ownedSectionsExtension_6_0= ruleSections ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleViewpointActivityExplorer", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:154:16: ( (lv_ownedSectionsExtension_6_0= ruleSections ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:155:1: (lv_ownedSectionsExtension_6_0= ruleSections )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:155:1: (lv_ownedSectionsExtension_6_0= ruleSections )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:156:3: lv_ownedSectionsExtension_6_0= ruleSections
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getViewpointActivityExplorerAccess().getOwnedSectionsExtensionSectionsParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSections_in_ruleViewpointActivityExplorer310);
            	    lv_ownedSectionsExtension_6_0=ruleSections();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getViewpointActivityExplorerRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"ownedSectionsExtension",
            	              		lv_ownedSectionsExtension_6_0, 
            	              		"Sections");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:179:4: ({...}? => ( ({...}? => ( ( (lv_ownedActivitiesExtension_7_0= ruleActivities ) )? otherlv_8= '}' ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:179:4: ({...}? => ( ({...}? => ( ( (lv_ownedActivitiesExtension_7_0= ruleActivities ) )? otherlv_8= '}' ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:180:5: {...}? => ( ({...}? => ( ( (lv_ownedActivitiesExtension_7_0= ruleActivities ) )? otherlv_8= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleViewpointActivityExplorer", "getUnorderedGroupHelper().canSelect(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:180:120: ( ({...}? => ( ( (lv_ownedActivitiesExtension_7_0= ruleActivities ) )? otherlv_8= '}' ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:181:6: ({...}? => ( ( (lv_ownedActivitiesExtension_7_0= ruleActivities ) )? otherlv_8= '}' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), 2);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:184:6: ({...}? => ( ( (lv_ownedActivitiesExtension_7_0= ruleActivities ) )? otherlv_8= '}' ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:184:7: {...}? => ( ( (lv_ownedActivitiesExtension_7_0= ruleActivities ) )? otherlv_8= '}' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleViewpointActivityExplorer", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:184:16: ( ( (lv_ownedActivitiesExtension_7_0= ruleActivities ) )? otherlv_8= '}' )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:184:17: ( (lv_ownedActivitiesExtension_7_0= ruleActivities ) )? otherlv_8= '}'
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:184:17: ( (lv_ownedActivitiesExtension_7_0= ruleActivities ) )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==17) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:185:1: (lv_ownedActivitiesExtension_7_0= ruleActivities )
            	            {
            	            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:185:1: (lv_ownedActivitiesExtension_7_0= ruleActivities )
            	            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:186:3: lv_ownedActivitiesExtension_7_0= ruleActivities
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getViewpointActivityExplorerAccess().getOwnedActivitiesExtensionActivitiesParserRuleCall_2_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleActivities_in_ruleViewpointActivityExplorer386);
            	            lv_ownedActivitiesExtension_7_0=ruleActivities();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getViewpointActivityExplorerRule());
            	              	        }
            	                     		set(
            	                     			current, 
            	                     			"ownedActivitiesExtension",
            	                      		lv_ownedActivitiesExtension_7_0, 
            	                      		"Activities");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleViewpointActivityExplorer399); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getViewpointActivityExplorerAccess().getRightCurlyBracketKeyword_2_1());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleViewpointActivityExplorer", "getUnorderedGroupHelper().canLeave(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup());

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewpointActivityExplorer"


    // $ANTLR start "entryRulePages"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:229:1: entryRulePages returns [EObject current=null] : iv_rulePages= rulePages EOF ;
    public final EObject entryRulePages() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePages = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:230:2: (iv_rulePages= rulePages EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:231:2: iv_rulePages= rulePages EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPagesRule()); 
            }
            pushFollow(FOLLOW_rulePages_in_entryRulePages481);
            iv_rulePages=rulePages();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePages; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePages491); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePages"


    // $ANTLR start "rulePages"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:238:1: rulePages returns [EObject current=null] : ( () otherlv_1= 'Pages' otherlv_2= '{' ( (lv_ownedActivityExplorerPages_3_0= rulePage ) ) ( (lv_ownedActivityExplorerPages_4_0= rulePage ) )* otherlv_5= '}' ) ;
    public final EObject rulePages() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_ownedActivityExplorerPages_3_0 = null;

        EObject lv_ownedActivityExplorerPages_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:241:28: ( ( () otherlv_1= 'Pages' otherlv_2= '{' ( (lv_ownedActivityExplorerPages_3_0= rulePage ) ) ( (lv_ownedActivityExplorerPages_4_0= rulePage ) )* otherlv_5= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:242:1: ( () otherlv_1= 'Pages' otherlv_2= '{' ( (lv_ownedActivityExplorerPages_3_0= rulePage ) ) ( (lv_ownedActivityExplorerPages_4_0= rulePage ) )* otherlv_5= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:242:1: ( () otherlv_1= 'Pages' otherlv_2= '{' ( (lv_ownedActivityExplorerPages_3_0= rulePage ) ) ( (lv_ownedActivityExplorerPages_4_0= rulePage ) )* otherlv_5= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:242:2: () otherlv_1= 'Pages' otherlv_2= '{' ( (lv_ownedActivityExplorerPages_3_0= rulePage ) ) ( (lv_ownedActivityExplorerPages_4_0= rulePage ) )* otherlv_5= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:242:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:243:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPagesAccess().getPagesAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_rulePages537); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPagesAccess().getPagesKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulePages549); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPagesAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:256:1: ( (lv_ownedActivityExplorerPages_3_0= rulePage ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:257:1: (lv_ownedActivityExplorerPages_3_0= rulePage )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:257:1: (lv_ownedActivityExplorerPages_3_0= rulePage )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:258:3: lv_ownedActivityExplorerPages_3_0= rulePage
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPagesAccess().getOwnedActivityExplorerPagesPageParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePage_in_rulePages570);
            lv_ownedActivityExplorerPages_3_0=rulePage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPagesRule());
              	        }
                     		add(
                     			current, 
                     			"ownedActivityExplorerPages",
                      		lv_ownedActivityExplorerPages_3_0, 
                      		"Page");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:274:2: ( (lv_ownedActivityExplorerPages_4_0= rulePage ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:275:1: (lv_ownedActivityExplorerPages_4_0= rulePage )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:275:1: (lv_ownedActivityExplorerPages_4_0= rulePage )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:276:3: lv_ownedActivityExplorerPages_4_0= rulePage
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPagesAccess().getOwnedActivityExplorerPagesPageParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePage_in_rulePages591);
            	    lv_ownedActivityExplorerPages_4_0=rulePage();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPagesRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedActivityExplorerPages",
            	              		lv_ownedActivityExplorerPages_4_0, 
            	              		"Page");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_rulePages604); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPagesAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePages"


    // $ANTLR start "entryRuleSections"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:304:1: entryRuleSections returns [EObject current=null] : iv_ruleSections= ruleSections EOF ;
    public final EObject entryRuleSections() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSections = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:305:2: (iv_ruleSections= ruleSections EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:306:2: iv_ruleSections= ruleSections EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSectionsRule()); 
            }
            pushFollow(FOLLOW_ruleSections_in_entryRuleSections640);
            iv_ruleSections=ruleSections();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSections; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSections650); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSections"


    // $ANTLR start "ruleSections"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:313:1: ruleSections returns [EObject current=null] : ( () otherlv_1= 'Sections' otherlv_2= '{' ( (lv_ownedSectionsExtensions_3_0= ruleSectionExtension ) ) ( (lv_ownedSectionsExtensions_4_0= ruleSectionExtension ) )* otherlv_5= '}' ) ;
    public final EObject ruleSections() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_ownedSectionsExtensions_3_0 = null;

        EObject lv_ownedSectionsExtensions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:316:28: ( ( () otherlv_1= 'Sections' otherlv_2= '{' ( (lv_ownedSectionsExtensions_3_0= ruleSectionExtension ) ) ( (lv_ownedSectionsExtensions_4_0= ruleSectionExtension ) )* otherlv_5= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:317:1: ( () otherlv_1= 'Sections' otherlv_2= '{' ( (lv_ownedSectionsExtensions_3_0= ruleSectionExtension ) ) ( (lv_ownedSectionsExtensions_4_0= ruleSectionExtension ) )* otherlv_5= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:317:1: ( () otherlv_1= 'Sections' otherlv_2= '{' ( (lv_ownedSectionsExtensions_3_0= ruleSectionExtension ) ) ( (lv_ownedSectionsExtensions_4_0= ruleSectionExtension ) )* otherlv_5= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:317:2: () otherlv_1= 'Sections' otherlv_2= '{' ( (lv_ownedSectionsExtensions_3_0= ruleSectionExtension ) ) ( (lv_ownedSectionsExtensions_4_0= ruleSectionExtension ) )* otherlv_5= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:317:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:318:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSectionsAccess().getSectionsAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleSections696); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSectionsAccess().getSectionsKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSections708); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSectionsAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:331:1: ( (lv_ownedSectionsExtensions_3_0= ruleSectionExtension ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:332:1: (lv_ownedSectionsExtensions_3_0= ruleSectionExtension )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:332:1: (lv_ownedSectionsExtensions_3_0= ruleSectionExtension )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:333:3: lv_ownedSectionsExtensions_3_0= ruleSectionExtension
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSectionsAccess().getOwnedSectionsExtensionsSectionExtensionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSectionExtension_in_ruleSections729);
            lv_ownedSectionsExtensions_3_0=ruleSectionExtension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSectionsRule());
              	        }
                     		add(
                     			current, 
                     			"ownedSectionsExtensions",
                      		lv_ownedSectionsExtensions_3_0, 
                      		"SectionExtension");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:349:2: ( (lv_ownedSectionsExtensions_4_0= ruleSectionExtension ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==35) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:350:1: (lv_ownedSectionsExtensions_4_0= ruleSectionExtension )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:350:1: (lv_ownedSectionsExtensions_4_0= ruleSectionExtension )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:351:3: lv_ownedSectionsExtensions_4_0= ruleSectionExtension
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSectionsAccess().getOwnedSectionsExtensionsSectionExtensionParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSectionExtension_in_ruleSections750);
            	    lv_ownedSectionsExtensions_4_0=ruleSectionExtension();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSectionsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedSectionsExtensions",
            	              		lv_ownedSectionsExtensions_4_0, 
            	              		"SectionExtension");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleSections763); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSectionsAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSections"


    // $ANTLR start "entryRuleActivities"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:379:1: entryRuleActivities returns [EObject current=null] : iv_ruleActivities= ruleActivities EOF ;
    public final EObject entryRuleActivities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivities = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:380:2: (iv_ruleActivities= ruleActivities EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:381:2: iv_ruleActivities= ruleActivities EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActivitiesRule()); 
            }
            pushFollow(FOLLOW_ruleActivities_in_entryRuleActivities799);
            iv_ruleActivities=ruleActivities();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActivities; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivities809); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivities"


    // $ANTLR start "ruleActivities"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:388:1: ruleActivities returns [EObject current=null] : ( () otherlv_1= 'Activities' otherlv_2= '{' ( (lv_ownedActivitiesExtensions_3_0= ruleActivityExtension ) ) ( (lv_ownedActivitiesExtensions_4_0= ruleActivityExtension ) )* otherlv_5= '}' ) ;
    public final EObject ruleActivities() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_ownedActivitiesExtensions_3_0 = null;

        EObject lv_ownedActivitiesExtensions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:391:28: ( ( () otherlv_1= 'Activities' otherlv_2= '{' ( (lv_ownedActivitiesExtensions_3_0= ruleActivityExtension ) ) ( (lv_ownedActivitiesExtensions_4_0= ruleActivityExtension ) )* otherlv_5= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:392:1: ( () otherlv_1= 'Activities' otherlv_2= '{' ( (lv_ownedActivitiesExtensions_3_0= ruleActivityExtension ) ) ( (lv_ownedActivitiesExtensions_4_0= ruleActivityExtension ) )* otherlv_5= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:392:1: ( () otherlv_1= 'Activities' otherlv_2= '{' ( (lv_ownedActivitiesExtensions_3_0= ruleActivityExtension ) ) ( (lv_ownedActivitiesExtensions_4_0= ruleActivityExtension ) )* otherlv_5= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:392:2: () otherlv_1= 'Activities' otherlv_2= '{' ( (lv_ownedActivitiesExtensions_3_0= ruleActivityExtension ) ) ( (lv_ownedActivitiesExtensions_4_0= ruleActivityExtension ) )* otherlv_5= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:392:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:393:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActivitiesAccess().getActivitiesAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleActivities855); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActivitiesAccess().getActivitiesKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleActivities867); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActivitiesAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:406:1: ( (lv_ownedActivitiesExtensions_3_0= ruleActivityExtension ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:407:1: (lv_ownedActivitiesExtensions_3_0= ruleActivityExtension )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:407:1: (lv_ownedActivitiesExtensions_3_0= ruleActivityExtension )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:408:3: lv_ownedActivitiesExtensions_3_0= ruleActivityExtension
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActivitiesAccess().getOwnedActivitiesExtensionsActivityExtensionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleActivityExtension_in_ruleActivities888);
            lv_ownedActivitiesExtensions_3_0=ruleActivityExtension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getActivitiesRule());
              	        }
                     		add(
                     			current, 
                     			"ownedActivitiesExtensions",
                      		lv_ownedActivitiesExtensions_3_0, 
                      		"ActivityExtension");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:424:2: ( (lv_ownedActivitiesExtensions_4_0= ruleActivityExtension ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==40) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:425:1: (lv_ownedActivitiesExtensions_4_0= ruleActivityExtension )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:425:1: (lv_ownedActivitiesExtensions_4_0= ruleActivityExtension )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:426:3: lv_ownedActivitiesExtensions_4_0= ruleActivityExtension
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getActivitiesAccess().getOwnedActivitiesExtensionsActivityExtensionParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleActivityExtension_in_ruleActivities909);
            	    lv_ownedActivitiesExtensions_4_0=ruleActivityExtension();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getActivitiesRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedActivitiesExtensions",
            	              		lv_ownedActivitiesExtensions_4_0, 
            	              		"ActivityExtension");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleActivities922); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getActivitiesAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivities"


    // $ANTLR start "entryRulePage"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:454:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:455:2: (iv_rulePage= rulePage EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:456:2: iv_rulePage= rulePage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPageRule()); 
            }
            pushFollow(FOLLOW_rulePage_in_entryRulePage958);
            iv_rulePage=rulePage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePage968); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:463:1: rulePage returns [EObject current=null] : ( () otherlv_1= 'Page' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'model' otherlv_5= 'type' ( (lv_modelType_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' ( (lv_activityExplorerItemID_8_0= ruleFQN ) ) )? otherlv_9= 'index' ( (lv_index_10_0= ruleEInt ) ) ( (lv_ownedOverview_11_0= ruleOverview ) )? (otherlv_12= 'header' otherlv_13= '{' (otherlv_14= 'image' otherlv_15= 'on' otherlv_16= ':' ( (lv_imagePathOn_17_0= RULE_STRING ) ) )? (otherlv_18= 'image' otherlv_19= 'off' otherlv_20= ':' ( (lv_imagePathOff_21_0= RULE_STRING ) ) )? otherlv_22= '}' )? (otherlv_23= 'tab' otherlv_24= 'name' ( (lv_tabName_25_0= RULE_STRING ) ) )? (otherlv_26= 'predicated' otherlv_27= ':' ( (lv_hasPredicate_28_0= ruleEBoolean ) ) )? (otherlv_29= 'show' otherlv_30= 'viewer' otherlv_31= ':' ( (lv_showViewer_32_0= ruleEBoolean ) ) )? otherlv_33= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_modelType_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_imagePathOn_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_imagePathOff_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_tabName_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        AntlrDatatypeRuleToken lv_activityExplorerItemID_8_0 = null;

        AntlrDatatypeRuleToken lv_index_10_0 = null;

        EObject lv_ownedOverview_11_0 = null;

        AntlrDatatypeRuleToken lv_hasPredicate_28_0 = null;

        AntlrDatatypeRuleToken lv_showViewer_32_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:466:28: ( ( () otherlv_1= 'Page' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'model' otherlv_5= 'type' ( (lv_modelType_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' ( (lv_activityExplorerItemID_8_0= ruleFQN ) ) )? otherlv_9= 'index' ( (lv_index_10_0= ruleEInt ) ) ( (lv_ownedOverview_11_0= ruleOverview ) )? (otherlv_12= 'header' otherlv_13= '{' (otherlv_14= 'image' otherlv_15= 'on' otherlv_16= ':' ( (lv_imagePathOn_17_0= RULE_STRING ) ) )? (otherlv_18= 'image' otherlv_19= 'off' otherlv_20= ':' ( (lv_imagePathOff_21_0= RULE_STRING ) ) )? otherlv_22= '}' )? (otherlv_23= 'tab' otherlv_24= 'name' ( (lv_tabName_25_0= RULE_STRING ) ) )? (otherlv_26= 'predicated' otherlv_27= ':' ( (lv_hasPredicate_28_0= ruleEBoolean ) ) )? (otherlv_29= 'show' otherlv_30= 'viewer' otherlv_31= ':' ( (lv_showViewer_32_0= ruleEBoolean ) ) )? otherlv_33= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:467:1: ( () otherlv_1= 'Page' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'model' otherlv_5= 'type' ( (lv_modelType_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' ( (lv_activityExplorerItemID_8_0= ruleFQN ) ) )? otherlv_9= 'index' ( (lv_index_10_0= ruleEInt ) ) ( (lv_ownedOverview_11_0= ruleOverview ) )? (otherlv_12= 'header' otherlv_13= '{' (otherlv_14= 'image' otherlv_15= 'on' otherlv_16= ':' ( (lv_imagePathOn_17_0= RULE_STRING ) ) )? (otherlv_18= 'image' otherlv_19= 'off' otherlv_20= ':' ( (lv_imagePathOff_21_0= RULE_STRING ) ) )? otherlv_22= '}' )? (otherlv_23= 'tab' otherlv_24= 'name' ( (lv_tabName_25_0= RULE_STRING ) ) )? (otherlv_26= 'predicated' otherlv_27= ':' ( (lv_hasPredicate_28_0= ruleEBoolean ) ) )? (otherlv_29= 'show' otherlv_30= 'viewer' otherlv_31= ':' ( (lv_showViewer_32_0= ruleEBoolean ) ) )? otherlv_33= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:467:1: ( () otherlv_1= 'Page' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'model' otherlv_5= 'type' ( (lv_modelType_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' ( (lv_activityExplorerItemID_8_0= ruleFQN ) ) )? otherlv_9= 'index' ( (lv_index_10_0= ruleEInt ) ) ( (lv_ownedOverview_11_0= ruleOverview ) )? (otherlv_12= 'header' otherlv_13= '{' (otherlv_14= 'image' otherlv_15= 'on' otherlv_16= ':' ( (lv_imagePathOn_17_0= RULE_STRING ) ) )? (otherlv_18= 'image' otherlv_19= 'off' otherlv_20= ':' ( (lv_imagePathOff_21_0= RULE_STRING ) ) )? otherlv_22= '}' )? (otherlv_23= 'tab' otherlv_24= 'name' ( (lv_tabName_25_0= RULE_STRING ) ) )? (otherlv_26= 'predicated' otherlv_27= ':' ( (lv_hasPredicate_28_0= ruleEBoolean ) ) )? (otherlv_29= 'show' otherlv_30= 'viewer' otherlv_31= ':' ( (lv_showViewer_32_0= ruleEBoolean ) ) )? otherlv_33= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:467:2: () otherlv_1= 'Page' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'model' otherlv_5= 'type' ( (lv_modelType_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' ( (lv_activityExplorerItemID_8_0= ruleFQN ) ) )? otherlv_9= 'index' ( (lv_index_10_0= ruleEInt ) ) ( (lv_ownedOverview_11_0= ruleOverview ) )? (otherlv_12= 'header' otherlv_13= '{' (otherlv_14= 'image' otherlv_15= 'on' otherlv_16= ':' ( (lv_imagePathOn_17_0= RULE_STRING ) ) )? (otherlv_18= 'image' otherlv_19= 'off' otherlv_20= ':' ( (lv_imagePathOff_21_0= RULE_STRING ) ) )? otherlv_22= '}' )? (otherlv_23= 'tab' otherlv_24= 'name' ( (lv_tabName_25_0= RULE_STRING ) ) )? (otherlv_26= 'predicated' otherlv_27= ':' ( (lv_hasPredicate_28_0= ruleEBoolean ) ) )? (otherlv_29= 'show' otherlv_30= 'viewer' otherlv_31= ':' ( (lv_showViewer_32_0= ruleEBoolean ) ) )? otherlv_33= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:467:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:468:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPageAccess().getPageAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulePage1014); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPageAccess().getPageKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:477:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:478:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:478:1: (lv_name_2_0= RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:479:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage1031); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getPageAccess().getNameSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_rulePage1048); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:499:1: (otherlv_4= 'model' otherlv_5= 'type' ( (lv_modelType_6_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:499:3: otherlv_4= 'model' otherlv_5= 'type' ( (lv_modelType_6_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_rulePage1061); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPageAccess().getModelKeyword_4_0());
                          
                    }
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_rulePage1073); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPageAccess().getTypeKeyword_4_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:507:1: ( (lv_modelType_6_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:508:1: (lv_modelType_6_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:508:1: (lv_modelType_6_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:509:3: lv_modelType_6_0= RULE_STRING
                    {
                    lv_modelType_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage1090); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_modelType_6_0, grammarAccess.getPageAccess().getModelTypeSTRINGTerminalRuleCall_4_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPageRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"modelType",
                              		lv_modelType_6_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:525:4: (otherlv_7= 'id' ( (lv_activityExplorerItemID_8_0= ruleFQN ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:525:6: otherlv_7= 'id' ( (lv_activityExplorerItemID_8_0= ruleFQN ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_rulePage1110); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getPageAccess().getIdKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:529:1: ( (lv_activityExplorerItemID_8_0= ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:530:1: (lv_activityExplorerItemID_8_0= ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:530:1: (lv_activityExplorerItemID_8_0= ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:531:3: lv_activityExplorerItemID_8_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPageAccess().getActivityExplorerItemIDFQNParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_rulePage1131);
                    lv_activityExplorerItemID_8_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPageRule());
                      	        }
                             		set(
                             			current, 
                             			"activityExplorerItemID",
                              		lv_activityExplorerItemID_8_0, 
                              		"FQN");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_rulePage1145); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getPageAccess().getIndexKeyword_6());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:551:1: ( (lv_index_10_0= ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:552:1: (lv_index_10_0= ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:552:1: (lv_index_10_0= ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:553:3: lv_index_10_0= ruleEInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPageAccess().getIndexEIntParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEInt_in_rulePage1166);
            lv_index_10_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPageRule());
              	        }
                     		set(
                     			current, 
                     			"index",
                      		lv_index_10_0, 
                      		"EInt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:569:2: ( (lv_ownedOverview_11_0= ruleOverview ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:570:1: (lv_ownedOverview_11_0= ruleOverview )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:570:1: (lv_ownedOverview_11_0= ruleOverview )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:571:3: lv_ownedOverview_11_0= ruleOverview
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPageAccess().getOwnedOverviewOverviewParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOverview_in_rulePage1187);
                    lv_ownedOverview_11_0=ruleOverview();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPageRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedOverview",
                              		lv_ownedOverview_11_0, 
                              		"Overview");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:587:3: (otherlv_12= 'header' otherlv_13= '{' (otherlv_14= 'image' otherlv_15= 'on' otherlv_16= ':' ( (lv_imagePathOn_17_0= RULE_STRING ) ) )? (otherlv_18= 'image' otherlv_19= 'off' otherlv_20= ':' ( (lv_imagePathOff_21_0= RULE_STRING ) ) )? otherlv_22= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:587:5: otherlv_12= 'header' otherlv_13= '{' (otherlv_14= 'image' otherlv_15= 'on' otherlv_16= ':' ( (lv_imagePathOn_17_0= RULE_STRING ) ) )? (otherlv_18= 'image' otherlv_19= 'off' otherlv_20= ':' ( (lv_imagePathOff_21_0= RULE_STRING ) ) )? otherlv_22= '}'
                    {
                    otherlv_12=(Token)match(input,23,FOLLOW_23_in_rulePage1201); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getPageAccess().getHeaderKeyword_9_0());
                          
                    }
                    otherlv_13=(Token)match(input,13,FOLLOW_13_in_rulePage1213); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_9_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:595:1: (otherlv_14= 'image' otherlv_15= 'on' otherlv_16= ':' ( (lv_imagePathOn_17_0= RULE_STRING ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==24) ) {
                        int LA10_1 = input.LA(2);

                        if ( (LA10_1==25) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:595:3: otherlv_14= 'image' otherlv_15= 'on' otherlv_16= ':' ( (lv_imagePathOn_17_0= RULE_STRING ) )
                            {
                            otherlv_14=(Token)match(input,24,FOLLOW_24_in_rulePage1226); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_14, grammarAccess.getPageAccess().getImageKeyword_9_2_0());
                                  
                            }
                            otherlv_15=(Token)match(input,25,FOLLOW_25_in_rulePage1238); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_15, grammarAccess.getPageAccess().getOnKeyword_9_2_1());
                                  
                            }
                            otherlv_16=(Token)match(input,26,FOLLOW_26_in_rulePage1250); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_16, grammarAccess.getPageAccess().getColonKeyword_9_2_2());
                                  
                            }
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:607:1: ( (lv_imagePathOn_17_0= RULE_STRING ) )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:608:1: (lv_imagePathOn_17_0= RULE_STRING )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:608:1: (lv_imagePathOn_17_0= RULE_STRING )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:609:3: lv_imagePathOn_17_0= RULE_STRING
                            {
                            lv_imagePathOn_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage1267); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_imagePathOn_17_0, grammarAccess.getPageAccess().getImagePathOnSTRINGTerminalRuleCall_9_2_3_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPageRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"imagePathOn",
                                      		lv_imagePathOn_17_0, 
                                      		"STRING");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:625:4: (otherlv_18= 'image' otherlv_19= 'off' otherlv_20= ':' ( (lv_imagePathOff_21_0= RULE_STRING ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==24) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:625:6: otherlv_18= 'image' otherlv_19= 'off' otherlv_20= ':' ( (lv_imagePathOff_21_0= RULE_STRING ) )
                            {
                            otherlv_18=(Token)match(input,24,FOLLOW_24_in_rulePage1287); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_18, grammarAccess.getPageAccess().getImageKeyword_9_3_0());
                                  
                            }
                            otherlv_19=(Token)match(input,27,FOLLOW_27_in_rulePage1299); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_19, grammarAccess.getPageAccess().getOffKeyword_9_3_1());
                                  
                            }
                            otherlv_20=(Token)match(input,26,FOLLOW_26_in_rulePage1311); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_20, grammarAccess.getPageAccess().getColonKeyword_9_3_2());
                                  
                            }
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:637:1: ( (lv_imagePathOff_21_0= RULE_STRING ) )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:638:1: (lv_imagePathOff_21_0= RULE_STRING )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:638:1: (lv_imagePathOff_21_0= RULE_STRING )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:639:3: lv_imagePathOff_21_0= RULE_STRING
                            {
                            lv_imagePathOff_21_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage1328); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_imagePathOff_21_0, grammarAccess.getPageAccess().getImagePathOffSTRINGTerminalRuleCall_9_3_3_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPageRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"imagePathOff",
                                      		lv_imagePathOff_21_0, 
                                      		"STRING");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,14,FOLLOW_14_in_rulePage1347); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_9_4());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:659:3: (otherlv_23= 'tab' otherlv_24= 'name' ( (lv_tabName_25_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:659:5: otherlv_23= 'tab' otherlv_24= 'name' ( (lv_tabName_25_0= RULE_STRING ) )
                    {
                    otherlv_23=(Token)match(input,28,FOLLOW_28_in_rulePage1362); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getPageAccess().getTabKeyword_10_0());
                          
                    }
                    otherlv_24=(Token)match(input,29,FOLLOW_29_in_rulePage1374); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getPageAccess().getNameKeyword_10_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:667:1: ( (lv_tabName_25_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:668:1: (lv_tabName_25_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:668:1: (lv_tabName_25_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:669:3: lv_tabName_25_0= RULE_STRING
                    {
                    lv_tabName_25_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage1391); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_tabName_25_0, grammarAccess.getPageAccess().getTabNameSTRINGTerminalRuleCall_10_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPageRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"tabName",
                              		lv_tabName_25_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:685:4: (otherlv_26= 'predicated' otherlv_27= ':' ( (lv_hasPredicate_28_0= ruleEBoolean ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:685:6: otherlv_26= 'predicated' otherlv_27= ':' ( (lv_hasPredicate_28_0= ruleEBoolean ) )
                    {
                    otherlv_26=(Token)match(input,30,FOLLOW_30_in_rulePage1411); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getPageAccess().getPredicatedKeyword_11_0());
                          
                    }
                    otherlv_27=(Token)match(input,26,FOLLOW_26_in_rulePage1423); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getPageAccess().getColonKeyword_11_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:693:1: ( (lv_hasPredicate_28_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:694:1: (lv_hasPredicate_28_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:694:1: (lv_hasPredicate_28_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:695:3: lv_hasPredicate_28_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPageAccess().getHasPredicateEBooleanParserRuleCall_11_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_rulePage1444);
                    lv_hasPredicate_28_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPageRule());
                      	        }
                             		set(
                             			current, 
                             			"hasPredicate",
                              		lv_hasPredicate_28_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:711:4: (otherlv_29= 'show' otherlv_30= 'viewer' otherlv_31= ':' ( (lv_showViewer_32_0= ruleEBoolean ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:711:6: otherlv_29= 'show' otherlv_30= 'viewer' otherlv_31= ':' ( (lv_showViewer_32_0= ruleEBoolean ) )
                    {
                    otherlv_29=(Token)match(input,31,FOLLOW_31_in_rulePage1459); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getPageAccess().getShowKeyword_12_0());
                          
                    }
                    otherlv_30=(Token)match(input,32,FOLLOW_32_in_rulePage1471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getPageAccess().getViewerKeyword_12_1());
                          
                    }
                    otherlv_31=(Token)match(input,26,FOLLOW_26_in_rulePage1483); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_31, grammarAccess.getPageAccess().getColonKeyword_12_2());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:723:1: ( (lv_showViewer_32_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:724:1: (lv_showViewer_32_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:724:1: (lv_showViewer_32_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:725:3: lv_showViewer_32_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPageAccess().getShowViewerEBooleanParserRuleCall_12_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_rulePage1504);
                    lv_showViewer_32_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPageRule());
                      	        }
                             		set(
                             			current, 
                             			"showViewer",
                              		lv_showViewer_32_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_33=(Token)match(input,14,FOLLOW_14_in_rulePage1518); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_33, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_13());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleOverview"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:753:1: entryRuleOverview returns [EObject current=null] : iv_ruleOverview= ruleOverview EOF ;
    public final EObject entryRuleOverview() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverview = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:754:2: (iv_ruleOverview= ruleOverview EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:755:2: iv_ruleOverview= ruleOverview EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOverviewRule()); 
            }
            pushFollow(FOLLOW_ruleOverview_in_entryRuleOverview1554);
            iv_ruleOverview=ruleOverview();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOverview; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverview1564); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOverview"


    // $ANTLR start "ruleOverview"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:762:1: ruleOverview returns [EObject current=null] : ( () otherlv_1= 'Overview' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'image' otherlv_6= 'on' otherlv_7= ':' ( (lv_imagePathOn_8_0= RULE_STRING ) ) )? (otherlv_9= 'image' otherlv_10= 'off' otherlv_11= ':' ( (lv_imagePathOff_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleOverview() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_imagePathOn_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_imagePathOff_12_0=null;
        Token otherlv_13=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:765:28: ( ( () otherlv_1= 'Overview' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'image' otherlv_6= 'on' otherlv_7= ':' ( (lv_imagePathOn_8_0= RULE_STRING ) ) )? (otherlv_9= 'image' otherlv_10= 'off' otherlv_11= ':' ( (lv_imagePathOff_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:766:1: ( () otherlv_1= 'Overview' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'image' otherlv_6= 'on' otherlv_7= ':' ( (lv_imagePathOn_8_0= RULE_STRING ) ) )? (otherlv_9= 'image' otherlv_10= 'off' otherlv_11= ':' ( (lv_imagePathOff_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:766:1: ( () otherlv_1= 'Overview' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'image' otherlv_6= 'on' otherlv_7= ':' ( (lv_imagePathOn_8_0= RULE_STRING ) ) )? (otherlv_9= 'image' otherlv_10= 'off' otherlv_11= ':' ( (lv_imagePathOff_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:766:2: () otherlv_1= 'Overview' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'image' otherlv_6= 'on' otherlv_7= ':' ( (lv_imagePathOn_8_0= RULE_STRING ) ) )? (otherlv_9= 'image' otherlv_10= 'off' otherlv_11= ':' ( (lv_imagePathOff_12_0= RULE_STRING ) ) )? otherlv_13= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:766:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:767:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOverviewAccess().getOverviewAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleOverview1610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOverviewAccess().getOverviewKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleOverview1622); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOverviewAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:780:1: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:780:3: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleOverview1635); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getOverviewAccess().getDescriptionKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:784:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:785:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:785:1: (lv_description_4_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:786:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOverview1652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_description_4_0, grammarAccess.getOverviewAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOverviewRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"description",
                              		lv_description_4_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:802:4: (otherlv_5= 'image' otherlv_6= 'on' otherlv_7= ':' ( (lv_imagePathOn_8_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==25) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:802:6: otherlv_5= 'image' otherlv_6= 'on' otherlv_7= ':' ( (lv_imagePathOn_8_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleOverview1672); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getOverviewAccess().getImageKeyword_4_0());
                          
                    }
                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleOverview1684); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getOverviewAccess().getOnKeyword_4_1());
                          
                    }
                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleOverview1696); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getOverviewAccess().getColonKeyword_4_2());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:814:1: ( (lv_imagePathOn_8_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:815:1: (lv_imagePathOn_8_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:815:1: (lv_imagePathOn_8_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:816:3: lv_imagePathOn_8_0= RULE_STRING
                    {
                    lv_imagePathOn_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOverview1713); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_imagePathOn_8_0, grammarAccess.getOverviewAccess().getImagePathOnSTRINGTerminalRuleCall_4_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOverviewRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"imagePathOn",
                              		lv_imagePathOn_8_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:832:4: (otherlv_9= 'image' otherlv_10= 'off' otherlv_11= ':' ( (lv_imagePathOff_12_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:832:6: otherlv_9= 'image' otherlv_10= 'off' otherlv_11= ':' ( (lv_imagePathOff_12_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleOverview1733); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getOverviewAccess().getImageKeyword_5_0());
                          
                    }
                    otherlv_10=(Token)match(input,27,FOLLOW_27_in_ruleOverview1745); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getOverviewAccess().getOffKeyword_5_1());
                          
                    }
                    otherlv_11=(Token)match(input,26,FOLLOW_26_in_ruleOverview1757); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getOverviewAccess().getColonKeyword_5_2());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:844:1: ( (lv_imagePathOff_12_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:845:1: (lv_imagePathOff_12_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:845:1: (lv_imagePathOff_12_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:846:3: lv_imagePathOff_12_0= RULE_STRING
                    {
                    lv_imagePathOff_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOverview1774); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_imagePathOff_12_0, grammarAccess.getOverviewAccess().getImagePathOffSTRINGTerminalRuleCall_5_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOverviewRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"imagePathOff",
                              		lv_imagePathOff_12_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleOverview1793); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getOverviewAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOverview"


    // $ANTLR start "entryRuleSectionExtension"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:874:1: entryRuleSectionExtension returns [EObject current=null] : iv_ruleSectionExtension= ruleSectionExtension EOF ;
    public final EObject entryRuleSectionExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionExtension = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:875:2: (iv_ruleSectionExtension= ruleSectionExtension EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:876:2: iv_ruleSectionExtension= ruleSectionExtension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSectionExtensionRule()); 
            }
            pushFollow(FOLLOW_ruleSectionExtension_in_entryRuleSectionExtension1829);
            iv_ruleSectionExtension=ruleSectionExtension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSectionExtension; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionExtension1839); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSectionExtension"


    // $ANTLR start "ruleSectionExtension"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:883:1: ruleSectionExtension returns [EObject current=null] : ( () otherlv_1= 'section' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_activityExplorerItemID_5_0= ruleFQN ) ) )? otherlv_6= 'extended' otherlv_7= 'page' ( (lv_extendedPageID_8_0= ruleFQN ) ) otherlv_9= 'index' ( (lv_index_10_0= ruleEInt ) ) (otherlv_11= 'filtering' otherlv_12= ':' ( (lv_filtering_13_0= ruleEBoolean ) ) )? (otherlv_14= 'expanded' otherlv_15= ':' ( (lv_expanded_16_0= ruleEBoolean ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleSectionExtension() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_activityExplorerItemID_5_0 = null;

        AntlrDatatypeRuleToken lv_extendedPageID_8_0 = null;

        AntlrDatatypeRuleToken lv_index_10_0 = null;

        AntlrDatatypeRuleToken lv_filtering_13_0 = null;

        AntlrDatatypeRuleToken lv_expanded_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:886:28: ( ( () otherlv_1= 'section' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_activityExplorerItemID_5_0= ruleFQN ) ) )? otherlv_6= 'extended' otherlv_7= 'page' ( (lv_extendedPageID_8_0= ruleFQN ) ) otherlv_9= 'index' ( (lv_index_10_0= ruleEInt ) ) (otherlv_11= 'filtering' otherlv_12= ':' ( (lv_filtering_13_0= ruleEBoolean ) ) )? (otherlv_14= 'expanded' otherlv_15= ':' ( (lv_expanded_16_0= ruleEBoolean ) ) )? otherlv_17= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:887:1: ( () otherlv_1= 'section' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_activityExplorerItemID_5_0= ruleFQN ) ) )? otherlv_6= 'extended' otherlv_7= 'page' ( (lv_extendedPageID_8_0= ruleFQN ) ) otherlv_9= 'index' ( (lv_index_10_0= ruleEInt ) ) (otherlv_11= 'filtering' otherlv_12= ':' ( (lv_filtering_13_0= ruleEBoolean ) ) )? (otherlv_14= 'expanded' otherlv_15= ':' ( (lv_expanded_16_0= ruleEBoolean ) ) )? otherlv_17= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:887:1: ( () otherlv_1= 'section' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_activityExplorerItemID_5_0= ruleFQN ) ) )? otherlv_6= 'extended' otherlv_7= 'page' ( (lv_extendedPageID_8_0= ruleFQN ) ) otherlv_9= 'index' ( (lv_index_10_0= ruleEInt ) ) (otherlv_11= 'filtering' otherlv_12= ':' ( (lv_filtering_13_0= ruleEBoolean ) ) )? (otherlv_14= 'expanded' otherlv_15= ':' ( (lv_expanded_16_0= ruleEBoolean ) ) )? otherlv_17= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:887:2: () otherlv_1= 'section' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_activityExplorerItemID_5_0= ruleFQN ) ) )? otherlv_6= 'extended' otherlv_7= 'page' ( (lv_extendedPageID_8_0= ruleFQN ) ) otherlv_9= 'index' ( (lv_index_10_0= ruleEInt ) ) (otherlv_11= 'filtering' otherlv_12= ':' ( (lv_filtering_13_0= ruleEBoolean ) ) )? (otherlv_14= 'expanded' otherlv_15= ':' ( (lv_expanded_16_0= ruleEBoolean ) ) )? otherlv_17= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:887:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:888:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSectionExtensionAccess().getSectionExtensionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleSectionExtension1885); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSectionExtensionAccess().getSectionKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:897:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:898:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:898:1: (lv_name_2_0= RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:899:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSectionExtension1902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getSectionExtensionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSectionExtensionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSectionExtension1919); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSectionExtensionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:919:1: (otherlv_4= 'id' ( (lv_activityExplorerItemID_5_0= ruleFQN ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:919:3: otherlv_4= 'id' ( (lv_activityExplorerItemID_5_0= ruleFQN ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleSectionExtension1932); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSectionExtensionAccess().getIdKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:923:1: ( (lv_activityExplorerItemID_5_0= ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:924:1: (lv_activityExplorerItemID_5_0= ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:924:1: (lv_activityExplorerItemID_5_0= ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:925:3: lv_activityExplorerItemID_5_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSectionExtensionAccess().getActivityExplorerItemIDFQNParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleSectionExtension1953);
                    lv_activityExplorerItemID_5_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSectionExtensionRule());
                      	        }
                             		set(
                             			current, 
                             			"activityExplorerItemID",
                              		lv_activityExplorerItemID_5_0, 
                              		"FQN");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleSectionExtension1967); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSectionExtensionAccess().getExtendedKeyword_5());
                  
            }
            otherlv_7=(Token)match(input,37,FOLLOW_37_in_ruleSectionExtension1979); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getSectionExtensionAccess().getPageKeyword_6());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:949:1: ( (lv_extendedPageID_8_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:950:1: (lv_extendedPageID_8_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:950:1: (lv_extendedPageID_8_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:951:3: lv_extendedPageID_8_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSectionExtensionAccess().getExtendedPageIDFQNParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleSectionExtension2000);
            lv_extendedPageID_8_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSectionExtensionRule());
              	        }
                     		set(
                     			current, 
                     			"extendedPageID",
                      		lv_extendedPageID_8_0, 
                      		"FQN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleSectionExtension2012); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getSectionExtensionAccess().getIndexKeyword_8());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:971:1: ( (lv_index_10_0= ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:972:1: (lv_index_10_0= ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:972:1: (lv_index_10_0= ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:973:3: lv_index_10_0= ruleEInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSectionExtensionAccess().getIndexEIntParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEInt_in_ruleSectionExtension2033);
            lv_index_10_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSectionExtensionRule());
              	        }
                     		set(
                     			current, 
                     			"index",
                      		lv_index_10_0, 
                      		"EInt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:989:2: (otherlv_11= 'filtering' otherlv_12= ':' ( (lv_filtering_13_0= ruleEBoolean ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:989:4: otherlv_11= 'filtering' otherlv_12= ':' ( (lv_filtering_13_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,38,FOLLOW_38_in_ruleSectionExtension2046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getSectionExtensionAccess().getFilteringKeyword_10_0());
                          
                    }
                    otherlv_12=(Token)match(input,26,FOLLOW_26_in_ruleSectionExtension2058); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSectionExtensionAccess().getColonKeyword_10_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:997:1: ( (lv_filtering_13_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:998:1: (lv_filtering_13_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:998:1: (lv_filtering_13_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:999:3: lv_filtering_13_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSectionExtensionAccess().getFilteringEBooleanParserRuleCall_10_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleSectionExtension2079);
                    lv_filtering_13_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSectionExtensionRule());
                      	        }
                             		set(
                             			current, 
                             			"filtering",
                              		lv_filtering_13_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1015:4: (otherlv_14= 'expanded' otherlv_15= ':' ( (lv_expanded_16_0= ruleEBoolean ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1015:6: otherlv_14= 'expanded' otherlv_15= ':' ( (lv_expanded_16_0= ruleEBoolean ) )
                    {
                    otherlv_14=(Token)match(input,39,FOLLOW_39_in_ruleSectionExtension2094); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getSectionExtensionAccess().getExpandedKeyword_11_0());
                          
                    }
                    otherlv_15=(Token)match(input,26,FOLLOW_26_in_ruleSectionExtension2106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getSectionExtensionAccess().getColonKeyword_11_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1023:1: ( (lv_expanded_16_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1024:1: (lv_expanded_16_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1024:1: (lv_expanded_16_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1025:3: lv_expanded_16_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSectionExtensionAccess().getExpandedEBooleanParserRuleCall_11_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleSectionExtension2127);
                    lv_expanded_16_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSectionExtensionRule());
                      	        }
                             		set(
                             			current, 
                             			"expanded",
                              		lv_expanded_16_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleSectionExtension2141); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getSectionExtensionAccess().getRightCurlyBracketKeyword_12());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSectionExtension"


    // $ANTLR start "entryRuleActivityExtension"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1053:1: entryRuleActivityExtension returns [EObject current=null] : iv_ruleActivityExtension= ruleActivityExtension EOF ;
    public final EObject entryRuleActivityExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityExtension = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1054:2: (iv_ruleActivityExtension= ruleActivityExtension EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1055:2: iv_ruleActivityExtension= ruleActivityExtension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActivityExtensionRule()); 
            }
            pushFollow(FOLLOW_ruleActivityExtension_in_entryRuleActivityExtension2177);
            iv_ruleActivityExtension=ruleActivityExtension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActivityExtension; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityExtension2187); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityExtension"


    // $ANTLR start "ruleActivityExtension"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1062:1: ruleActivityExtension returns [EObject current=null] : ( () otherlv_1= 'activity' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_activityExplorerItemID_5_0= ruleFQN ) ) )? otherlv_6= 'extended' otherlv_7= 'section' ( (lv_extendedSectionID_8_0= ruleFQN ) ) otherlv_9= 'index' ( (lv_index_10_0= ruleEInt ) ) (otherlv_11= 'predicated' otherlv_12= ':' ( (lv_hasPredicate_13_0= ruleEBoolean ) ) )? (otherlv_14= 'icon' otherlv_15= ':' ( (lv_imagePathOff_16_0= RULE_STRING ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleActivityExtension() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_imagePathOff_16_0=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_activityExplorerItemID_5_0 = null;

        AntlrDatatypeRuleToken lv_extendedSectionID_8_0 = null;

        AntlrDatatypeRuleToken lv_index_10_0 = null;

        AntlrDatatypeRuleToken lv_hasPredicate_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1065:28: ( ( () otherlv_1= 'activity' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_activityExplorerItemID_5_0= ruleFQN ) ) )? otherlv_6= 'extended' otherlv_7= 'section' ( (lv_extendedSectionID_8_0= ruleFQN ) ) otherlv_9= 'index' ( (lv_index_10_0= ruleEInt ) ) (otherlv_11= 'predicated' otherlv_12= ':' ( (lv_hasPredicate_13_0= ruleEBoolean ) ) )? (otherlv_14= 'icon' otherlv_15= ':' ( (lv_imagePathOff_16_0= RULE_STRING ) ) )? otherlv_17= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1066:1: ( () otherlv_1= 'activity' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_activityExplorerItemID_5_0= ruleFQN ) ) )? otherlv_6= 'extended' otherlv_7= 'section' ( (lv_extendedSectionID_8_0= ruleFQN ) ) otherlv_9= 'index' ( (lv_index_10_0= ruleEInt ) ) (otherlv_11= 'predicated' otherlv_12= ':' ( (lv_hasPredicate_13_0= ruleEBoolean ) ) )? (otherlv_14= 'icon' otherlv_15= ':' ( (lv_imagePathOff_16_0= RULE_STRING ) ) )? otherlv_17= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1066:1: ( () otherlv_1= 'activity' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_activityExplorerItemID_5_0= ruleFQN ) ) )? otherlv_6= 'extended' otherlv_7= 'section' ( (lv_extendedSectionID_8_0= ruleFQN ) ) otherlv_9= 'index' ( (lv_index_10_0= ruleEInt ) ) (otherlv_11= 'predicated' otherlv_12= ':' ( (lv_hasPredicate_13_0= ruleEBoolean ) ) )? (otherlv_14= 'icon' otherlv_15= ':' ( (lv_imagePathOff_16_0= RULE_STRING ) ) )? otherlv_17= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1066:2: () otherlv_1= 'activity' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_activityExplorerItemID_5_0= ruleFQN ) ) )? otherlv_6= 'extended' otherlv_7= 'section' ( (lv_extendedSectionID_8_0= ruleFQN ) ) otherlv_9= 'index' ( (lv_index_10_0= ruleEInt ) ) (otherlv_11= 'predicated' otherlv_12= ':' ( (lv_hasPredicate_13_0= ruleEBoolean ) ) )? (otherlv_14= 'icon' otherlv_15= ':' ( (lv_imagePathOff_16_0= RULE_STRING ) ) )? otherlv_17= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1066:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1067:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActivityExtensionAccess().getActivityExtensionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleActivityExtension2233); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActivityExtensionAccess().getActivityKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1076:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1077:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1077:1: (lv_name_2_0= RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1078:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivityExtension2250); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getActivityExtensionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getActivityExtensionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleActivityExtension2267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getActivityExtensionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1098:1: (otherlv_4= 'id' ( (lv_activityExplorerItemID_5_0= ruleFQN ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1098:3: otherlv_4= 'id' ( (lv_activityExplorerItemID_5_0= ruleFQN ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleActivityExtension2280); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getActivityExtensionAccess().getIdKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1102:1: ( (lv_activityExplorerItemID_5_0= ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1103:1: (lv_activityExplorerItemID_5_0= ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1103:1: (lv_activityExplorerItemID_5_0= ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1104:3: lv_activityExplorerItemID_5_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getActivityExtensionAccess().getActivityExplorerItemIDFQNParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleActivityExtension2301);
                    lv_activityExplorerItemID_5_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getActivityExtensionRule());
                      	        }
                             		set(
                             			current, 
                             			"activityExplorerItemID",
                              		lv_activityExplorerItemID_5_0, 
                              		"FQN");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleActivityExtension2315); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getActivityExtensionAccess().getExtendedKeyword_5());
                  
            }
            otherlv_7=(Token)match(input,35,FOLLOW_35_in_ruleActivityExtension2327); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getActivityExtensionAccess().getSectionKeyword_6());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1128:1: ( (lv_extendedSectionID_8_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1129:1: (lv_extendedSectionID_8_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1129:1: (lv_extendedSectionID_8_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1130:3: lv_extendedSectionID_8_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActivityExtensionAccess().getExtendedSectionIDFQNParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleActivityExtension2348);
            lv_extendedSectionID_8_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getActivityExtensionRule());
              	        }
                     		set(
                     			current, 
                     			"extendedSectionID",
                      		lv_extendedSectionID_8_0, 
                      		"FQN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleActivityExtension2360); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getActivityExtensionAccess().getIndexKeyword_8());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1150:1: ( (lv_index_10_0= ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1151:1: (lv_index_10_0= ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1151:1: (lv_index_10_0= ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1152:3: lv_index_10_0= ruleEInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActivityExtensionAccess().getIndexEIntParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEInt_in_ruleActivityExtension2381);
            lv_index_10_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getActivityExtensionRule());
              	        }
                     		set(
                     			current, 
                     			"index",
                      		lv_index_10_0, 
                      		"EInt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1168:2: (otherlv_11= 'predicated' otherlv_12= ':' ( (lv_hasPredicate_13_0= ruleEBoolean ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1168:4: otherlv_11= 'predicated' otherlv_12= ':' ( (lv_hasPredicate_13_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,30,FOLLOW_30_in_ruleActivityExtension2394); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getActivityExtensionAccess().getPredicatedKeyword_10_0());
                          
                    }
                    otherlv_12=(Token)match(input,26,FOLLOW_26_in_ruleActivityExtension2406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getActivityExtensionAccess().getColonKeyword_10_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1176:1: ( (lv_hasPredicate_13_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1177:1: (lv_hasPredicate_13_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1177:1: (lv_hasPredicate_13_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1178:3: lv_hasPredicate_13_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getActivityExtensionAccess().getHasPredicateEBooleanParserRuleCall_10_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleActivityExtension2427);
                    lv_hasPredicate_13_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getActivityExtensionRule());
                      	        }
                             		set(
                             			current, 
                             			"hasPredicate",
                              		lv_hasPredicate_13_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1194:4: (otherlv_14= 'icon' otherlv_15= ':' ( (lv_imagePathOff_16_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1194:6: otherlv_14= 'icon' otherlv_15= ':' ( (lv_imagePathOff_16_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,41,FOLLOW_41_in_ruleActivityExtension2442); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getActivityExtensionAccess().getIconKeyword_11_0());
                          
                    }
                    otherlv_15=(Token)match(input,26,FOLLOW_26_in_ruleActivityExtension2454); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getActivityExtensionAccess().getColonKeyword_11_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1202:1: ( (lv_imagePathOff_16_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1203:1: (lv_imagePathOff_16_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1203:1: (lv_imagePathOff_16_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1204:3: lv_imagePathOff_16_0= RULE_STRING
                    {
                    lv_imagePathOff_16_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivityExtension2471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_imagePathOff_16_0, grammarAccess.getActivityExtensionAccess().getImagePathOffSTRINGTerminalRuleCall_11_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getActivityExtensionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"imagePathOff",
                              		lv_imagePathOff_16_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleActivityExtension2490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getActivityExtensionAccess().getRightCurlyBracketKeyword_12());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityExtension"


    // $ANTLR start "entryRuleFQN"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1234:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1235:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1236:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN2529);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN2540); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1243:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1246:28: ( (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1247:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1247:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1247:6: this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN2580); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1254:1: (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==42) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1255:2: kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    {
            	    kw=(Token)match(input,42,FOLLOW_42_in_ruleFQN2599); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1260:1: ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1260:2: ( RULE_ID )=>this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN2620); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleEBoolean"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1275:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1276:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1277:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_entryRuleEBoolean2669);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBoolean2680); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1284:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1287:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1288:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1288:1: (kw= 'true' | kw= 'false' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            else if ( (LA26_0==44) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1289:2: kw= 'true'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleEBoolean2718); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1296:2: kw= 'false'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleEBoolean2737); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEInt"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1309:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1310:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1311:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_ruleEInt_in_entryRuleEInt2778);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEInt2789); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1318:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1321:28: (this_INT_0= RULE_INT )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1322:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEInt2828); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleViewpointActivityExplorer_in_entryRuleViewpointActivityExplorer75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewpointActivityExplorer85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleViewpointActivityExplorer167 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleViewpointActivityExplorer179 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpointActivityExplorer200 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleViewpointActivityExplorer212 = new BitSet(new long[]{0x000000000003C802L});
    public static final BitSet FOLLOW_rulePages_in_ruleViewpointActivityExplorer233 = new BitSet(new long[]{0x0000000000034802L});
    public static final BitSet FOLLOW_ruleSections_in_ruleViewpointActivityExplorer310 = new BitSet(new long[]{0x0000000000034802L});
    public static final BitSet FOLLOW_ruleActivities_in_ruleViewpointActivityExplorer386 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleViewpointActivityExplorer399 = new BitSet(new long[]{0x0000000000034802L});
    public static final BitSet FOLLOW_rulePages_in_entryRulePages481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePages491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePages537 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePages549 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rulePage_in_rulePages570 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_rulePage_in_rulePages591 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_14_in_rulePages604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSections_in_entryRuleSections640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSections650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSections696 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSections708 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ruleSectionExtension_in_ruleSections729 = new BitSet(new long[]{0x0000000800004000L});
    public static final BitSet FOLLOW_ruleSectionExtension_in_ruleSections750 = new BitSet(new long[]{0x0000000800004000L});
    public static final BitSet FOLLOW_14_in_ruleSections763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivities_in_entryRuleActivities799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivities809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleActivities855 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActivities867 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ruleActivityExtension_in_ruleActivities888 = new BitSet(new long[]{0x0000010000004000L});
    public static final BitSet FOLLOW_ruleActivityExtension_in_ruleActivities909 = new BitSet(new long[]{0x0000010000004000L});
    public static final BitSet FOLLOW_14_in_ruleActivities922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePage1014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage1031 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePage1048 = new BitSet(new long[]{0x0000000000680000L});
    public static final BitSet FOLLOW_19_in_rulePage1061 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePage1073 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage1090 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_rulePage1110 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePage1131 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePage1145 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleEInt_in_rulePage1166 = new BitSet(new long[]{0x00000002D0804000L});
    public static final BitSet FOLLOW_ruleOverview_in_rulePage1187 = new BitSet(new long[]{0x00000000D0804000L});
    public static final BitSet FOLLOW_23_in_rulePage1201 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePage1213 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_24_in_rulePage1226 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePage1238 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePage1250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage1267 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_24_in_rulePage1287 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePage1299 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePage1311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage1328 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePage1347 = new BitSet(new long[]{0x00000000D0004000L});
    public static final BitSet FOLLOW_28_in_rulePage1362 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePage1374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage1391 = new BitSet(new long[]{0x00000000C0004000L});
    public static final BitSet FOLLOW_30_in_rulePage1411 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePage1423 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rulePage1444 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_31_in_rulePage1459 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePage1471 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePage1483 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rulePage1504 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePage1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverview_in_entryRuleOverview1554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverview1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOverview1610 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOverview1622 = new BitSet(new long[]{0x0000000401004000L});
    public static final BitSet FOLLOW_34_in_ruleOverview1635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOverview1652 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_24_in_ruleOverview1672 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOverview1684 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOverview1696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOverview1713 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_24_in_ruleOverview1733 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOverview1745 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOverview1757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOverview1774 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleOverview1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionExtension_in_entryRuleSectionExtension1829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionExtension1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSectionExtension1885 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSectionExtension1902 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSectionExtension1919 = new BitSet(new long[]{0x0000001000200000L});
    public static final BitSet FOLLOW_21_in_ruleSectionExtension1932 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleSectionExtension1953 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSectionExtension1967 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleSectionExtension1979 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleSectionExtension2000 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSectionExtension2012 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleEInt_in_ruleSectionExtension2033 = new BitSet(new long[]{0x000000C000004000L});
    public static final BitSet FOLLOW_38_in_ruleSectionExtension2046 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSectionExtension2058 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleSectionExtension2079 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_39_in_ruleSectionExtension2094 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSectionExtension2106 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleSectionExtension2127 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSectionExtension2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityExtension_in_entryRuleActivityExtension2177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityExtension2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleActivityExtension2233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivityExtension2250 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActivityExtension2267 = new BitSet(new long[]{0x0000001000200000L});
    public static final BitSet FOLLOW_21_in_ruleActivityExtension2280 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActivityExtension2301 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleActivityExtension2315 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleActivityExtension2327 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActivityExtension2348 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActivityExtension2360 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleEInt_in_ruleActivityExtension2381 = new BitSet(new long[]{0x0000020040004000L});
    public static final BitSet FOLLOW_30_in_ruleActivityExtension2394 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleActivityExtension2406 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleActivityExtension2427 = new BitSet(new long[]{0x0000020000004000L});
    public static final BitSet FOLLOW_41_in_ruleActivityExtension2442 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleActivityExtension2454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivityExtension2471 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleActivityExtension2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN2529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN2580 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleFQN2599 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN2620 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean2669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEBoolean2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleEBoolean2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEInt2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2828 = new BitSet(new long[]{0x0000000000000002L});

}

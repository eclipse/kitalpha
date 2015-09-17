package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.parser.antlr.internal; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ActivityexplorerGrammarAccess;
@SuppressWarnings("all")
public class InternalActivityexplorerParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'activity'", "'explorer'", "'{'", "'pages'", "'}'", "'page'", "'description'", "'file'", "'extension'", "'id'", "'label'", "'index'", "'header'", "'image'", "'on'", "':'", "'off'", "'tab'", "'name'", "'predicated'", "'show'", "'viewer'", "'sections'", "'section'", "'filtering'", "'expanded'", "'activities'", "'icon'", "'extensions'", "'extended'", "'Overview'", "'.'", "'true'", "'false'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:76:1: ruleViewpointActivityExplorer returns [EObject current=null] : ( () otherlv_1= 'activity' otherlv_2= 'explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' (otherlv_5= 'pages' otherlv_6= '{' ( (lv_ownedPages_7_0= rulePage ) )* otherlv_8= '}' )? ( (lv_ownedPages_9_0= rulePageExtension ) )* ( (lv_ownedSectionExtensions_10_0= ruleSectionExtension ) )* otherlv_11= '}' ) ;
    public final EObject ruleViewpointActivityExplorer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_ownedPages_7_0 = null;

        EObject lv_ownedPages_9_0 = null;

        EObject lv_ownedSectionExtensions_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:79:28: ( ( () otherlv_1= 'activity' otherlv_2= 'explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' (otherlv_5= 'pages' otherlv_6= '{' ( (lv_ownedPages_7_0= rulePage ) )* otherlv_8= '}' )? ( (lv_ownedPages_9_0= rulePageExtension ) )* ( (lv_ownedSectionExtensions_10_0= ruleSectionExtension ) )* otherlv_11= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:80:1: ( () otherlv_1= 'activity' otherlv_2= 'explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' (otherlv_5= 'pages' otherlv_6= '{' ( (lv_ownedPages_7_0= rulePage ) )* otherlv_8= '}' )? ( (lv_ownedPages_9_0= rulePageExtension ) )* ( (lv_ownedSectionExtensions_10_0= ruleSectionExtension ) )* otherlv_11= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:80:1: ( () otherlv_1= 'activity' otherlv_2= 'explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' (otherlv_5= 'pages' otherlv_6= '{' ( (lv_ownedPages_7_0= rulePage ) )* otherlv_8= '}' )? ( (lv_ownedPages_9_0= rulePageExtension ) )* ( (lv_ownedSectionExtensions_10_0= ruleSectionExtension ) )* otherlv_11= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:80:2: () otherlv_1= 'activity' otherlv_2= 'explorer' ( (lv_name_3_0= ruleFQN ) ) otherlv_4= '{' (otherlv_5= 'pages' otherlv_6= '{' ( (lv_ownedPages_7_0= rulePage ) )* otherlv_8= '}' )? ( (lv_ownedPages_9_0= rulePageExtension ) )* ( (lv_ownedSectionExtensions_10_0= ruleSectionExtension ) )* otherlv_11= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:80:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:81:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getViewpointActivityExplorerAccess().getViewpointActivityExplorerAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleViewpointActivityExplorer131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getViewpointActivityExplorerAccess().getActivityKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleViewpointActivityExplorer143); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getViewpointActivityExplorerAccess().getExplorerKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:94:1: ( (lv_name_3_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:95:1: (lv_name_3_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:95:1: (lv_name_3_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:96:3: lv_name_3_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getViewpointActivityExplorerAccess().getNameFQNParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleViewpointActivityExplorer164);
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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleViewpointActivityExplorer176); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getViewpointActivityExplorerAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:116:1: (otherlv_5= 'pages' otherlv_6= '{' ( (lv_ownedPages_7_0= rulePage ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:116:3: otherlv_5= 'pages' otherlv_6= '{' ( (lv_ownedPages_7_0= rulePage ) )* otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleViewpointActivityExplorer189); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getViewpointActivityExplorerAccess().getPagesKeyword_5_0());
                          
                    }
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleViewpointActivityExplorer201); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getViewpointActivityExplorerAccess().getLeftCurlyBracketKeyword_5_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:124:1: ( (lv_ownedPages_7_0= rulePage ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:125:1: (lv_ownedPages_7_0= rulePage )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:125:1: (lv_ownedPages_7_0= rulePage )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:126:3: lv_ownedPages_7_0= rulePage
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesPageParserRuleCall_5_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePage_in_ruleViewpointActivityExplorer222);
                    	    lv_ownedPages_7_0=rulePage();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getViewpointActivityExplorerRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedPages",
                    	              		lv_ownedPages_7_0, 
                    	              		"Page");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleViewpointActivityExplorer235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getViewpointActivityExplorerAccess().getRightCurlyBracketKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:146:3: ( (lv_ownedPages_9_0= rulePageExtension ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:147:1: (lv_ownedPages_9_0= rulePageExtension )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:147:1: (lv_ownedPages_9_0= rulePageExtension )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:148:3: lv_ownedPages_9_0= rulePageExtension
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesPageExtensionParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePageExtension_in_ruleViewpointActivityExplorer258);
            	    lv_ownedPages_9_0=rulePageExtension();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getViewpointActivityExplorerRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedPages",
            	              		lv_ownedPages_9_0, 
            	              		"PageExtension");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:164:3: ( (lv_ownedSectionExtensions_10_0= ruleSectionExtension ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==34) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:165:1: (lv_ownedSectionExtensions_10_0= ruleSectionExtension )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:165:1: (lv_ownedSectionExtensions_10_0= ruleSectionExtension )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:166:3: lv_ownedSectionExtensions_10_0= ruleSectionExtension
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getViewpointActivityExplorerAccess().getOwnedSectionExtensionsSectionExtensionParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSectionExtension_in_ruleViewpointActivityExplorer280);
            	    lv_ownedSectionExtensions_10_0=ruleSectionExtension();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getViewpointActivityExplorerRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedSectionExtensions",
            	              		lv_ownedSectionExtensions_10_0, 
            	              		"SectionExtension");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleViewpointActivityExplorer293); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getViewpointActivityExplorerAccess().getRightCurlyBracketKeyword_8());
                  
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
    // $ANTLR end "ruleViewpointActivityExplorer"


    // $ANTLR start "entryRulePage"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:196:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:197:2: (iv_rulePage= rulePage EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:198:2: iv_rulePage= rulePage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPageRule()); 
            }
            pushFollow(FOLLOW_rulePage_in_entryRulePage331);
            iv_rulePage=rulePage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePage341); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:205:1: rulePage returns [EObject current=null] : ( () otherlv_1= 'page' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'file' otherlv_7= 'extension' ( (lv_fileExtensions_8_0= RULE_STRING ) ) )? (otherlv_9= 'id' ( (lv_activityExplorerItemID_10_0= ruleFQN ) ) )? (otherlv_11= 'label' ( (lv_label_12_0= RULE_STRING ) ) )? otherlv_13= 'index' ( (lv_index_14_0= ruleEInt ) ) ( (lv_ownedOverview_15_0= ruleOverview ) )? (otherlv_16= 'header' otherlv_17= '{' (otherlv_18= 'image' otherlv_19= 'on' otherlv_20= ':' ( (lv_imagePathOn_21_0= RULE_STRING ) ) )? (otherlv_22= 'image' otherlv_23= 'off' otherlv_24= ':' ( (lv_imagePathOff_25_0= RULE_STRING ) ) )? otherlv_26= '}' )? (otherlv_27= 'tab' otherlv_28= 'name' ( (lv_tabName_29_0= RULE_STRING ) ) )? (otherlv_30= 'predicated' otherlv_31= ':' ( (lv_hasPredicate_32_0= ruleEBoolean ) ) )? (otherlv_33= 'show' otherlv_34= 'viewer' otherlv_35= ':' ( (lv_showViewer_36_0= ruleEBoolean ) ) )? (otherlv_37= 'sections' otherlv_38= '{' ( (lv_ownedSections_39_0= ruleSection ) )* otherlv_40= '}' )? otherlv_41= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_fileExtensions_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_label_12_0=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_imagePathOn_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_imagePathOff_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_tabName_29_0=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        AntlrDatatypeRuleToken lv_activityExplorerItemID_10_0 = null;

        AntlrDatatypeRuleToken lv_index_14_0 = null;

        EObject lv_ownedOverview_15_0 = null;

        AntlrDatatypeRuleToken lv_hasPredicate_32_0 = null;

        AntlrDatatypeRuleToken lv_showViewer_36_0 = null;

        EObject lv_ownedSections_39_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:208:28: ( ( () otherlv_1= 'page' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'file' otherlv_7= 'extension' ( (lv_fileExtensions_8_0= RULE_STRING ) ) )? (otherlv_9= 'id' ( (lv_activityExplorerItemID_10_0= ruleFQN ) ) )? (otherlv_11= 'label' ( (lv_label_12_0= RULE_STRING ) ) )? otherlv_13= 'index' ( (lv_index_14_0= ruleEInt ) ) ( (lv_ownedOverview_15_0= ruleOverview ) )? (otherlv_16= 'header' otherlv_17= '{' (otherlv_18= 'image' otherlv_19= 'on' otherlv_20= ':' ( (lv_imagePathOn_21_0= RULE_STRING ) ) )? (otherlv_22= 'image' otherlv_23= 'off' otherlv_24= ':' ( (lv_imagePathOff_25_0= RULE_STRING ) ) )? otherlv_26= '}' )? (otherlv_27= 'tab' otherlv_28= 'name' ( (lv_tabName_29_0= RULE_STRING ) ) )? (otherlv_30= 'predicated' otherlv_31= ':' ( (lv_hasPredicate_32_0= ruleEBoolean ) ) )? (otherlv_33= 'show' otherlv_34= 'viewer' otherlv_35= ':' ( (lv_showViewer_36_0= ruleEBoolean ) ) )? (otherlv_37= 'sections' otherlv_38= '{' ( (lv_ownedSections_39_0= ruleSection ) )* otherlv_40= '}' )? otherlv_41= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:209:1: ( () otherlv_1= 'page' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'file' otherlv_7= 'extension' ( (lv_fileExtensions_8_0= RULE_STRING ) ) )? (otherlv_9= 'id' ( (lv_activityExplorerItemID_10_0= ruleFQN ) ) )? (otherlv_11= 'label' ( (lv_label_12_0= RULE_STRING ) ) )? otherlv_13= 'index' ( (lv_index_14_0= ruleEInt ) ) ( (lv_ownedOverview_15_0= ruleOverview ) )? (otherlv_16= 'header' otherlv_17= '{' (otherlv_18= 'image' otherlv_19= 'on' otherlv_20= ':' ( (lv_imagePathOn_21_0= RULE_STRING ) ) )? (otherlv_22= 'image' otherlv_23= 'off' otherlv_24= ':' ( (lv_imagePathOff_25_0= RULE_STRING ) ) )? otherlv_26= '}' )? (otherlv_27= 'tab' otherlv_28= 'name' ( (lv_tabName_29_0= RULE_STRING ) ) )? (otherlv_30= 'predicated' otherlv_31= ':' ( (lv_hasPredicate_32_0= ruleEBoolean ) ) )? (otherlv_33= 'show' otherlv_34= 'viewer' otherlv_35= ':' ( (lv_showViewer_36_0= ruleEBoolean ) ) )? (otherlv_37= 'sections' otherlv_38= '{' ( (lv_ownedSections_39_0= ruleSection ) )* otherlv_40= '}' )? otherlv_41= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:209:1: ( () otherlv_1= 'page' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'file' otherlv_7= 'extension' ( (lv_fileExtensions_8_0= RULE_STRING ) ) )? (otherlv_9= 'id' ( (lv_activityExplorerItemID_10_0= ruleFQN ) ) )? (otherlv_11= 'label' ( (lv_label_12_0= RULE_STRING ) ) )? otherlv_13= 'index' ( (lv_index_14_0= ruleEInt ) ) ( (lv_ownedOverview_15_0= ruleOverview ) )? (otherlv_16= 'header' otherlv_17= '{' (otherlv_18= 'image' otherlv_19= 'on' otherlv_20= ':' ( (lv_imagePathOn_21_0= RULE_STRING ) ) )? (otherlv_22= 'image' otherlv_23= 'off' otherlv_24= ':' ( (lv_imagePathOff_25_0= RULE_STRING ) ) )? otherlv_26= '}' )? (otherlv_27= 'tab' otherlv_28= 'name' ( (lv_tabName_29_0= RULE_STRING ) ) )? (otherlv_30= 'predicated' otherlv_31= ':' ( (lv_hasPredicate_32_0= ruleEBoolean ) ) )? (otherlv_33= 'show' otherlv_34= 'viewer' otherlv_35= ':' ( (lv_showViewer_36_0= ruleEBoolean ) ) )? (otherlv_37= 'sections' otherlv_38= '{' ( (lv_ownedSections_39_0= ruleSection ) )* otherlv_40= '}' )? otherlv_41= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:209:2: () otherlv_1= 'page' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'file' otherlv_7= 'extension' ( (lv_fileExtensions_8_0= RULE_STRING ) ) )? (otherlv_9= 'id' ( (lv_activityExplorerItemID_10_0= ruleFQN ) ) )? (otherlv_11= 'label' ( (lv_label_12_0= RULE_STRING ) ) )? otherlv_13= 'index' ( (lv_index_14_0= ruleEInt ) ) ( (lv_ownedOverview_15_0= ruleOverview ) )? (otherlv_16= 'header' otherlv_17= '{' (otherlv_18= 'image' otherlv_19= 'on' otherlv_20= ':' ( (lv_imagePathOn_21_0= RULE_STRING ) ) )? (otherlv_22= 'image' otherlv_23= 'off' otherlv_24= ':' ( (lv_imagePathOff_25_0= RULE_STRING ) ) )? otherlv_26= '}' )? (otherlv_27= 'tab' otherlv_28= 'name' ( (lv_tabName_29_0= RULE_STRING ) ) )? (otherlv_30= 'predicated' otherlv_31= ':' ( (lv_hasPredicate_32_0= ruleEBoolean ) ) )? (otherlv_33= 'show' otherlv_34= 'viewer' otherlv_35= ':' ( (lv_showViewer_36_0= ruleEBoolean ) ) )? (otherlv_37= 'sections' otherlv_38= '{' ( (lv_ownedSections_39_0= ruleSection ) )* otherlv_40= '}' )? otherlv_41= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:209:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:210:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPageAccess().getPageAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_rulePage387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPageAccess().getPageKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:219:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:220:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:220:1: (lv_name_2_0= RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:221:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage404); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getPageAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_rulePage421); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:241:1: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:241:3: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_rulePage434); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPageAccess().getDescriptionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:245:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:246:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:246:1: (lv_description_5_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:247:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_description_5_0, grammarAccess.getPageAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPageRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"description",
                              		lv_description_5_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:263:4: (otherlv_6= 'file' otherlv_7= 'extension' ( (lv_fileExtensions_8_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:263:6: otherlv_6= 'file' otherlv_7= 'extension' ( (lv_fileExtensions_8_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_rulePage471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getPageAccess().getFileKeyword_5_0());
                          
                    }
                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_rulePage483); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getPageAccess().getExtensionKeyword_5_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:271:1: ( (lv_fileExtensions_8_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:272:1: (lv_fileExtensions_8_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:272:1: (lv_fileExtensions_8_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:273:3: lv_fileExtensions_8_0= RULE_STRING
                    {
                    lv_fileExtensions_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage500); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_fileExtensions_8_0, grammarAccess.getPageAccess().getFileExtensionsSTRINGTerminalRuleCall_5_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPageRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"fileExtensions",
                              		lv_fileExtensions_8_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:289:4: (otherlv_9= 'id' ( (lv_activityExplorerItemID_10_0= ruleFQN ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:289:6: otherlv_9= 'id' ( (lv_activityExplorerItemID_10_0= ruleFQN ) )
                    {
                    otherlv_9=(Token)match(input,20,FOLLOW_20_in_rulePage520); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getPageAccess().getIdKeyword_6_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:293:1: ( (lv_activityExplorerItemID_10_0= ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:294:1: (lv_activityExplorerItemID_10_0= ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:294:1: (lv_activityExplorerItemID_10_0= ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:295:3: lv_activityExplorerItemID_10_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPageAccess().getActivityExplorerItemIDFQNParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_rulePage541);
                    lv_activityExplorerItemID_10_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPageRule());
                      	        }
                             		set(
                             			current, 
                             			"activityExplorerItemID",
                              		lv_activityExplorerItemID_10_0, 
                              		"FQN");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:311:4: (otherlv_11= 'label' ( (lv_label_12_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:311:6: otherlv_11= 'label' ( (lv_label_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,21,FOLLOW_21_in_rulePage556); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getPageAccess().getLabelKeyword_7_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:315:1: ( (lv_label_12_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:316:1: (lv_label_12_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:316:1: (lv_label_12_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:317:3: lv_label_12_0= RULE_STRING
                    {
                    lv_label_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_12_0, grammarAccess.getPageAccess().getLabelSTRINGTerminalRuleCall_7_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPageRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"label",
                              		lv_label_12_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,22,FOLLOW_22_in_rulePage592); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getPageAccess().getIndexKeyword_8());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:337:1: ( (lv_index_14_0= ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:338:1: (lv_index_14_0= ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:338:1: (lv_index_14_0= ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:339:3: lv_index_14_0= ruleEInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPageAccess().getIndexEIntParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEInt_in_rulePage613);
            lv_index_14_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPageRule());
              	        }
                     		set(
                     			current, 
                     			"index",
                      		lv_index_14_0, 
                      		"EInt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:355:2: ( (lv_ownedOverview_15_0= ruleOverview ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==41) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:356:1: (lv_ownedOverview_15_0= ruleOverview )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:356:1: (lv_ownedOverview_15_0= ruleOverview )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:357:3: lv_ownedOverview_15_0= ruleOverview
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPageAccess().getOwnedOverviewOverviewParserRuleCall_10_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOverview_in_rulePage634);
                    lv_ownedOverview_15_0=ruleOverview();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPageRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedOverview",
                              		lv_ownedOverview_15_0, 
                              		"Overview");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:373:3: (otherlv_16= 'header' otherlv_17= '{' (otherlv_18= 'image' otherlv_19= 'on' otherlv_20= ':' ( (lv_imagePathOn_21_0= RULE_STRING ) ) )? (otherlv_22= 'image' otherlv_23= 'off' otherlv_24= ':' ( (lv_imagePathOff_25_0= RULE_STRING ) ) )? otherlv_26= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:373:5: otherlv_16= 'header' otherlv_17= '{' (otherlv_18= 'image' otherlv_19= 'on' otherlv_20= ':' ( (lv_imagePathOn_21_0= RULE_STRING ) ) )? (otherlv_22= 'image' otherlv_23= 'off' otherlv_24= ':' ( (lv_imagePathOff_25_0= RULE_STRING ) ) )? otherlv_26= '}'
                    {
                    otherlv_16=(Token)match(input,23,FOLLOW_23_in_rulePage648); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getPageAccess().getHeaderKeyword_11_0());
                          
                    }
                    otherlv_17=(Token)match(input,13,FOLLOW_13_in_rulePage660); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_11_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:381:1: (otherlv_18= 'image' otherlv_19= 'on' otherlv_20= ':' ( (lv_imagePathOn_21_0= RULE_STRING ) ) )?
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
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:381:3: otherlv_18= 'image' otherlv_19= 'on' otherlv_20= ':' ( (lv_imagePathOn_21_0= RULE_STRING ) )
                            {
                            otherlv_18=(Token)match(input,24,FOLLOW_24_in_rulePage673); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_18, grammarAccess.getPageAccess().getImageKeyword_11_2_0());
                                  
                            }
                            otherlv_19=(Token)match(input,25,FOLLOW_25_in_rulePage685); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_19, grammarAccess.getPageAccess().getOnKeyword_11_2_1());
                                  
                            }
                            otherlv_20=(Token)match(input,26,FOLLOW_26_in_rulePage697); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_20, grammarAccess.getPageAccess().getColonKeyword_11_2_2());
                                  
                            }
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:393:1: ( (lv_imagePathOn_21_0= RULE_STRING ) )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:394:1: (lv_imagePathOn_21_0= RULE_STRING )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:394:1: (lv_imagePathOn_21_0= RULE_STRING )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:395:3: lv_imagePathOn_21_0= RULE_STRING
                            {
                            lv_imagePathOn_21_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage714); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_imagePathOn_21_0, grammarAccess.getPageAccess().getImagePathOnSTRINGTerminalRuleCall_11_2_3_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPageRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"imagePathOn",
                                      		lv_imagePathOn_21_0, 
                                      		"STRING");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:411:4: (otherlv_22= 'image' otherlv_23= 'off' otherlv_24= ':' ( (lv_imagePathOff_25_0= RULE_STRING ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==24) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:411:6: otherlv_22= 'image' otherlv_23= 'off' otherlv_24= ':' ( (lv_imagePathOff_25_0= RULE_STRING ) )
                            {
                            otherlv_22=(Token)match(input,24,FOLLOW_24_in_rulePage734); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_22, grammarAccess.getPageAccess().getImageKeyword_11_3_0());
                                  
                            }
                            otherlv_23=(Token)match(input,27,FOLLOW_27_in_rulePage746); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_23, grammarAccess.getPageAccess().getOffKeyword_11_3_1());
                                  
                            }
                            otherlv_24=(Token)match(input,26,FOLLOW_26_in_rulePage758); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_24, grammarAccess.getPageAccess().getColonKeyword_11_3_2());
                                  
                            }
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:423:1: ( (lv_imagePathOff_25_0= RULE_STRING ) )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:424:1: (lv_imagePathOff_25_0= RULE_STRING )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:424:1: (lv_imagePathOff_25_0= RULE_STRING )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:425:3: lv_imagePathOff_25_0= RULE_STRING
                            {
                            lv_imagePathOff_25_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage775); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_imagePathOff_25_0, grammarAccess.getPageAccess().getImagePathOffSTRINGTerminalRuleCall_11_3_3_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPageRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"imagePathOff",
                                      		lv_imagePathOff_25_0, 
                                      		"STRING");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_26=(Token)match(input,15,FOLLOW_15_in_rulePage794); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_11_4());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:445:3: (otherlv_27= 'tab' otherlv_28= 'name' ( (lv_tabName_29_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:445:5: otherlv_27= 'tab' otherlv_28= 'name' ( (lv_tabName_29_0= RULE_STRING ) )
                    {
                    otherlv_27=(Token)match(input,28,FOLLOW_28_in_rulePage809); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getPageAccess().getTabKeyword_12_0());
                          
                    }
                    otherlv_28=(Token)match(input,29,FOLLOW_29_in_rulePage821); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_28, grammarAccess.getPageAccess().getNameKeyword_12_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:453:1: ( (lv_tabName_29_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:454:1: (lv_tabName_29_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:454:1: (lv_tabName_29_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:455:3: lv_tabName_29_0= RULE_STRING
                    {
                    lv_tabName_29_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage838); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_tabName_29_0, grammarAccess.getPageAccess().getTabNameSTRINGTerminalRuleCall_12_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPageRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"tabName",
                              		lv_tabName_29_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:471:4: (otherlv_30= 'predicated' otherlv_31= ':' ( (lv_hasPredicate_32_0= ruleEBoolean ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:471:6: otherlv_30= 'predicated' otherlv_31= ':' ( (lv_hasPredicate_32_0= ruleEBoolean ) )
                    {
                    otherlv_30=(Token)match(input,30,FOLLOW_30_in_rulePage858); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getPageAccess().getPredicatedKeyword_13_0());
                          
                    }
                    otherlv_31=(Token)match(input,26,FOLLOW_26_in_rulePage870); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_31, grammarAccess.getPageAccess().getColonKeyword_13_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:479:1: ( (lv_hasPredicate_32_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:480:1: (lv_hasPredicate_32_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:480:1: (lv_hasPredicate_32_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:481:3: lv_hasPredicate_32_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPageAccess().getHasPredicateEBooleanParserRuleCall_13_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_rulePage891);
                    lv_hasPredicate_32_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPageRule());
                      	        }
                             		set(
                             			current, 
                             			"hasPredicate",
                              		lv_hasPredicate_32_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:497:4: (otherlv_33= 'show' otherlv_34= 'viewer' otherlv_35= ':' ( (lv_showViewer_36_0= ruleEBoolean ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:497:6: otherlv_33= 'show' otherlv_34= 'viewer' otherlv_35= ':' ( (lv_showViewer_36_0= ruleEBoolean ) )
                    {
                    otherlv_33=(Token)match(input,31,FOLLOW_31_in_rulePage906); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_33, grammarAccess.getPageAccess().getShowKeyword_14_0());
                          
                    }
                    otherlv_34=(Token)match(input,32,FOLLOW_32_in_rulePage918); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_34, grammarAccess.getPageAccess().getViewerKeyword_14_1());
                          
                    }
                    otherlv_35=(Token)match(input,26,FOLLOW_26_in_rulePage930); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getPageAccess().getColonKeyword_14_2());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:509:1: ( (lv_showViewer_36_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:510:1: (lv_showViewer_36_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:510:1: (lv_showViewer_36_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:511:3: lv_showViewer_36_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPageAccess().getShowViewerEBooleanParserRuleCall_14_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_rulePage951);
                    lv_showViewer_36_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPageRule());
                      	        }
                             		set(
                             			current, 
                             			"showViewer",
                              		lv_showViewer_36_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:527:4: (otherlv_37= 'sections' otherlv_38= '{' ( (lv_ownedSections_39_0= ruleSection ) )* otherlv_40= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:527:6: otherlv_37= 'sections' otherlv_38= '{' ( (lv_ownedSections_39_0= ruleSection ) )* otherlv_40= '}'
                    {
                    otherlv_37=(Token)match(input,33,FOLLOW_33_in_rulePage966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_37, grammarAccess.getPageAccess().getSectionsKeyword_15_0());
                          
                    }
                    otherlv_38=(Token)match(input,13,FOLLOW_13_in_rulePage978); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_38, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_15_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:535:1: ( (lv_ownedSections_39_0= ruleSection ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==34) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:536:1: (lv_ownedSections_39_0= ruleSection )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:536:1: (lv_ownedSections_39_0= ruleSection )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:537:3: lv_ownedSections_39_0= ruleSection
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPageAccess().getOwnedSectionsSectionParserRuleCall_15_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSection_in_rulePage999);
                    	    lv_ownedSections_39_0=ruleSection();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPageRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedSections",
                    	              		lv_ownedSections_39_0, 
                    	              		"Section");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_40=(Token)match(input,15,FOLLOW_15_in_rulePage1012); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_40, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_15_3());
                          
                    }

                    }
                    break;

            }

            otherlv_41=(Token)match(input,15,FOLLOW_15_in_rulePage1026); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_41, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_16());
                  
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


    // $ANTLR start "entryRuleSection"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:569:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:570:2: (iv_ruleSection= ruleSection EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:571:2: iv_ruleSection= ruleSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSectionRule()); 
            }
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection1062);
            iv_ruleSection=ruleSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection1072); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:578:1: ruleSection returns [EObject current=null] : ( () otherlv_1= 'section' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )? otherlv_10= 'index' ( (lv_index_11_0= ruleEInt ) ) (otherlv_12= 'filtering' otherlv_13= ':' ( (lv_filtering_14_0= ruleEBoolean ) ) )? (otherlv_15= 'expanded' otherlv_16= ':' ( (lv_expanded_17_0= ruleEBoolean ) ) )? (otherlv_18= 'activities' otherlv_19= '{' ( (lv_ownedActivities_20_0= ruleActivity ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_label_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_activityExplorerItemID_7_0 = null;

        AntlrDatatypeRuleToken lv_index_11_0 = null;

        AntlrDatatypeRuleToken lv_filtering_14_0 = null;

        AntlrDatatypeRuleToken lv_expanded_17_0 = null;

        EObject lv_ownedActivities_20_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:581:28: ( ( () otherlv_1= 'section' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )? otherlv_10= 'index' ( (lv_index_11_0= ruleEInt ) ) (otherlv_12= 'filtering' otherlv_13= ':' ( (lv_filtering_14_0= ruleEBoolean ) ) )? (otherlv_15= 'expanded' otherlv_16= ':' ( (lv_expanded_17_0= ruleEBoolean ) ) )? (otherlv_18= 'activities' otherlv_19= '{' ( (lv_ownedActivities_20_0= ruleActivity ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:582:1: ( () otherlv_1= 'section' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )? otherlv_10= 'index' ( (lv_index_11_0= ruleEInt ) ) (otherlv_12= 'filtering' otherlv_13= ':' ( (lv_filtering_14_0= ruleEBoolean ) ) )? (otherlv_15= 'expanded' otherlv_16= ':' ( (lv_expanded_17_0= ruleEBoolean ) ) )? (otherlv_18= 'activities' otherlv_19= '{' ( (lv_ownedActivities_20_0= ruleActivity ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:582:1: ( () otherlv_1= 'section' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )? otherlv_10= 'index' ( (lv_index_11_0= ruleEInt ) ) (otherlv_12= 'filtering' otherlv_13= ':' ( (lv_filtering_14_0= ruleEBoolean ) ) )? (otherlv_15= 'expanded' otherlv_16= ':' ( (lv_expanded_17_0= ruleEBoolean ) ) )? (otherlv_18= 'activities' otherlv_19= '{' ( (lv_ownedActivities_20_0= ruleActivity ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:582:2: () otherlv_1= 'section' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )? otherlv_10= 'index' ( (lv_index_11_0= ruleEInt ) ) (otherlv_12= 'filtering' otherlv_13= ':' ( (lv_filtering_14_0= ruleEBoolean ) ) )? (otherlv_15= 'expanded' otherlv_16= ':' ( (lv_expanded_17_0= ruleEBoolean ) ) )? (otherlv_18= 'activities' otherlv_19= '{' ( (lv_ownedActivities_20_0= ruleActivity ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:582:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:583:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSectionAccess().getSectionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleSection1118); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getSectionKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:592:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:593:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:593:1: (lv_name_2_0= RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:594:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection1135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSectionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSection1152); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:614:1: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:614:3: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSection1165); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getDescriptionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:618:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:619:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:619:1: (lv_description_5_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:620:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSection1182); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_description_5_0, grammarAccess.getSectionAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSectionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"description",
                              		lv_description_5_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:636:4: (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:636:6: otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleSection1202); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSectionAccess().getIdKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:640:1: ( (lv_activityExplorerItemID_7_0= ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:641:1: (lv_activityExplorerItemID_7_0= ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:641:1: (lv_activityExplorerItemID_7_0= ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:642:3: lv_activityExplorerItemID_7_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSectionAccess().getActivityExplorerItemIDFQNParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleSection1223);
                    lv_activityExplorerItemID_7_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSectionRule());
                      	        }
                             		set(
                             			current, 
                             			"activityExplorerItemID",
                              		lv_activityExplorerItemID_7_0, 
                              		"FQN");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:658:4: (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==21) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:658:6: otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleSection1238); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSectionAccess().getLabelKeyword_6_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:662:1: ( (lv_label_9_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:663:1: (lv_label_9_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:663:1: (lv_label_9_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:664:3: lv_label_9_0= RULE_STRING
                    {
                    lv_label_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSection1255); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_9_0, grammarAccess.getSectionAccess().getLabelSTRINGTerminalRuleCall_6_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSectionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"label",
                              		lv_label_9_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleSection1274); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getSectionAccess().getIndexKeyword_7());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:684:1: ( (lv_index_11_0= ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:685:1: (lv_index_11_0= ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:685:1: (lv_index_11_0= ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:686:3: lv_index_11_0= ruleEInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSectionAccess().getIndexEIntParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEInt_in_ruleSection1295);
            lv_index_11_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSectionRule());
              	        }
                     		set(
                     			current, 
                     			"index",
                      		lv_index_11_0, 
                      		"EInt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:702:2: (otherlv_12= 'filtering' otherlv_13= ':' ( (lv_filtering_14_0= ruleEBoolean ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:702:4: otherlv_12= 'filtering' otherlv_13= ':' ( (lv_filtering_14_0= ruleEBoolean ) )
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_35_in_ruleSection1308); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSectionAccess().getFilteringKeyword_9_0());
                          
                    }
                    otherlv_13=(Token)match(input,26,FOLLOW_26_in_ruleSection1320); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getSectionAccess().getColonKeyword_9_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:710:1: ( (lv_filtering_14_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:711:1: (lv_filtering_14_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:711:1: (lv_filtering_14_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:712:3: lv_filtering_14_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSectionAccess().getFilteringEBooleanParserRuleCall_9_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleSection1341);
                    lv_filtering_14_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSectionRule());
                      	        }
                             		set(
                             			current, 
                             			"filtering",
                              		lv_filtering_14_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:728:4: (otherlv_15= 'expanded' otherlv_16= ':' ( (lv_expanded_17_0= ruleEBoolean ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:728:6: otherlv_15= 'expanded' otherlv_16= ':' ( (lv_expanded_17_0= ruleEBoolean ) )
                    {
                    otherlv_15=(Token)match(input,36,FOLLOW_36_in_ruleSection1356); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getSectionAccess().getExpandedKeyword_10_0());
                          
                    }
                    otherlv_16=(Token)match(input,26,FOLLOW_26_in_ruleSection1368); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getSectionAccess().getColonKeyword_10_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:736:1: ( (lv_expanded_17_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:737:1: (lv_expanded_17_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:737:1: (lv_expanded_17_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:738:3: lv_expanded_17_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSectionAccess().getExpandedEBooleanParserRuleCall_10_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleSection1389);
                    lv_expanded_17_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSectionRule());
                      	        }
                             		set(
                             			current, 
                             			"expanded",
                              		lv_expanded_17_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:754:4: (otherlv_18= 'activities' otherlv_19= '{' ( (lv_ownedActivities_20_0= ruleActivity ) )* otherlv_21= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:754:6: otherlv_18= 'activities' otherlv_19= '{' ( (lv_ownedActivities_20_0= ruleActivity ) )* otherlv_21= '}'
                    {
                    otherlv_18=(Token)match(input,37,FOLLOW_37_in_ruleSection1404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getSectionAccess().getActivitiesKeyword_11_0());
                          
                    }
                    otherlv_19=(Token)match(input,13,FOLLOW_13_in_ruleSection1416); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_11_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:762:1: ( (lv_ownedActivities_20_0= ruleActivity ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==11) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:763:1: (lv_ownedActivities_20_0= ruleActivity )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:763:1: (lv_ownedActivities_20_0= ruleActivity )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:764:3: lv_ownedActivities_20_0= ruleActivity
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSectionAccess().getOwnedActivitiesActivityParserRuleCall_11_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleActivity_in_ruleSection1437);
                    	    lv_ownedActivities_20_0=ruleActivity();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSectionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedActivities",
                    	              		lv_ownedActivities_20_0, 
                    	              		"Activity");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_15_in_ruleSection1450); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_11_3());
                          
                    }

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FOLLOW_15_in_ruleSection1464); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_22, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_12());
                  
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
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleActivity"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:796:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:797:2: (iv_ruleActivity= ruleActivity EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:798:2: iv_ruleActivity= ruleActivity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActivityRule()); 
            }
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity1500);
            iv_ruleActivity=ruleActivity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActivity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity1510); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:805:1: ruleActivity returns [EObject current=null] : ( () otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )? otherlv_10= 'index' ( (lv_index_11_0= ruleEInt ) ) (otherlv_12= 'predicated' otherlv_13= ':' ( (lv_hasPredicate_14_0= ruleEBoolean ) ) )? (otherlv_15= 'icon' otherlv_16= ':' ( (lv_imagePathOff_17_0= RULE_STRING ) ) )? otherlv_18= '}' ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_label_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_imagePathOff_17_0=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_activityExplorerItemID_7_0 = null;

        AntlrDatatypeRuleToken lv_index_11_0 = null;

        AntlrDatatypeRuleToken lv_hasPredicate_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:808:28: ( ( () otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )? otherlv_10= 'index' ( (lv_index_11_0= ruleEInt ) ) (otherlv_12= 'predicated' otherlv_13= ':' ( (lv_hasPredicate_14_0= ruleEBoolean ) ) )? (otherlv_15= 'icon' otherlv_16= ':' ( (lv_imagePathOff_17_0= RULE_STRING ) ) )? otherlv_18= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:809:1: ( () otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )? otherlv_10= 'index' ( (lv_index_11_0= ruleEInt ) ) (otherlv_12= 'predicated' otherlv_13= ':' ( (lv_hasPredicate_14_0= ruleEBoolean ) ) )? (otherlv_15= 'icon' otherlv_16= ':' ( (lv_imagePathOff_17_0= RULE_STRING ) ) )? otherlv_18= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:809:1: ( () otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )? otherlv_10= 'index' ( (lv_index_11_0= ruleEInt ) ) (otherlv_12= 'predicated' otherlv_13= ':' ( (lv_hasPredicate_14_0= ruleEBoolean ) ) )? (otherlv_15= 'icon' otherlv_16= ':' ( (lv_imagePathOff_17_0= RULE_STRING ) ) )? otherlv_18= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:809:2: () otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )? otherlv_10= 'index' ( (lv_index_11_0= ruleEInt ) ) (otherlv_12= 'predicated' otherlv_13= ':' ( (lv_hasPredicate_14_0= ruleEBoolean ) ) )? (otherlv_15= 'icon' otherlv_16= ':' ( (lv_imagePathOff_17_0= RULE_STRING ) ) )? otherlv_18= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:809:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:810:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActivityAccess().getActivityAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleActivity1556); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getActivityKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:819:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:820:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:820:1: (lv_name_2_0= RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:821:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity1573); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getActivityRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleActivity1590); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:841:1: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==17) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:841:3: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleActivity1603); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getDescriptionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:845:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:846:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:846:1: (lv_description_5_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:847:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity1620); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_description_5_0, grammarAccess.getActivityAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getActivityRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"description",
                              		lv_description_5_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:863:4: (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:863:6: otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleActivity1640); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getActivityAccess().getIdKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:867:1: ( (lv_activityExplorerItemID_7_0= ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:868:1: (lv_activityExplorerItemID_7_0= ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:868:1: (lv_activityExplorerItemID_7_0= ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:869:3: lv_activityExplorerItemID_7_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getActivityAccess().getActivityExplorerItemIDFQNParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleActivity1661);
                    lv_activityExplorerItemID_7_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getActivityRule());
                      	        }
                             		set(
                             			current, 
                             			"activityExplorerItemID",
                              		lv_activityExplorerItemID_7_0, 
                              		"FQN");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:885:4: (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==21) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:885:6: otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleActivity1676); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getActivityAccess().getLabelKeyword_6_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:889:1: ( (lv_label_9_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:890:1: (lv_label_9_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:890:1: (lv_label_9_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:891:3: lv_label_9_0= RULE_STRING
                    {
                    lv_label_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity1693); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_9_0, grammarAccess.getActivityAccess().getLabelSTRINGTerminalRuleCall_6_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getActivityRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"label",
                              		lv_label_9_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleActivity1712); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getActivityAccess().getIndexKeyword_7());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:911:1: ( (lv_index_11_0= ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:912:1: (lv_index_11_0= ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:912:1: (lv_index_11_0= ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:913:3: lv_index_11_0= ruleEInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActivityAccess().getIndexEIntParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEInt_in_ruleActivity1733);
            lv_index_11_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getActivityRule());
              	        }
                     		set(
                     			current, 
                     			"index",
                      		lv_index_11_0, 
                      		"EInt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:929:2: (otherlv_12= 'predicated' otherlv_13= ':' ( (lv_hasPredicate_14_0= ruleEBoolean ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:929:4: otherlv_12= 'predicated' otherlv_13= ':' ( (lv_hasPredicate_14_0= ruleEBoolean ) )
                    {
                    otherlv_12=(Token)match(input,30,FOLLOW_30_in_ruleActivity1746); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getActivityAccess().getPredicatedKeyword_9_0());
                          
                    }
                    otherlv_13=(Token)match(input,26,FOLLOW_26_in_ruleActivity1758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getActivityAccess().getColonKeyword_9_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:937:1: ( (lv_hasPredicate_14_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:938:1: (lv_hasPredicate_14_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:938:1: (lv_hasPredicate_14_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:939:3: lv_hasPredicate_14_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getActivityAccess().getHasPredicateEBooleanParserRuleCall_9_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleActivity1779);
                    lv_hasPredicate_14_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getActivityRule());
                      	        }
                             		set(
                             			current, 
                             			"hasPredicate",
                              		lv_hasPredicate_14_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:955:4: (otherlv_15= 'icon' otherlv_16= ':' ( (lv_imagePathOff_17_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:955:6: otherlv_15= 'icon' otherlv_16= ':' ( (lv_imagePathOff_17_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,38,FOLLOW_38_in_ruleActivity1794); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getActivityAccess().getIconKeyword_10_0());
                          
                    }
                    otherlv_16=(Token)match(input,26,FOLLOW_26_in_ruleActivity1806); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getActivityAccess().getColonKeyword_10_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:963:1: ( (lv_imagePathOff_17_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:964:1: (lv_imagePathOff_17_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:964:1: (lv_imagePathOff_17_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:965:3: lv_imagePathOff_17_0= RULE_STRING
                    {
                    lv_imagePathOff_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity1823); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_imagePathOff_17_0, grammarAccess.getActivityAccess().getImagePathOffSTRINGTerminalRuleCall_10_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getActivityRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"imagePathOff",
                              		lv_imagePathOff_17_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,15,FOLLOW_15_in_ruleActivity1842); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_11());
                  
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
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRulePageExtension"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:993:1: entryRulePageExtension returns [EObject current=null] : iv_rulePageExtension= rulePageExtension EOF ;
    public final EObject entryRulePageExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageExtension = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:994:2: (iv_rulePageExtension= rulePageExtension EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:995:2: iv_rulePageExtension= rulePageExtension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPageExtensionRule()); 
            }
            pushFollow(FOLLOW_rulePageExtension_in_entryRulePageExtension1878);
            iv_rulePageExtension=rulePageExtension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePageExtension; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePageExtension1888); if (state.failed) return current;

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
    // $ANTLR end "entryRulePageExtension"


    // $ANTLR start "rulePageExtension"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1002:1: rulePageExtension returns [EObject current=null] : ( () otherlv_1= 'page' otherlv_2= 'extensions' otherlv_3= '{' otherlv_4= 'extended' otherlv_5= 'page' ( (lv_extendedPageID_6_0= ruleFQN ) ) ( (lv_ownedSections_7_0= ruleSection ) )* otherlv_8= '}' ) ;
    public final EObject rulePageExtension() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_extendedPageID_6_0 = null;

        EObject lv_ownedSections_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1005:28: ( ( () otherlv_1= 'page' otherlv_2= 'extensions' otherlv_3= '{' otherlv_4= 'extended' otherlv_5= 'page' ( (lv_extendedPageID_6_0= ruleFQN ) ) ( (lv_ownedSections_7_0= ruleSection ) )* otherlv_8= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1006:1: ( () otherlv_1= 'page' otherlv_2= 'extensions' otherlv_3= '{' otherlv_4= 'extended' otherlv_5= 'page' ( (lv_extendedPageID_6_0= ruleFQN ) ) ( (lv_ownedSections_7_0= ruleSection ) )* otherlv_8= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1006:1: ( () otherlv_1= 'page' otherlv_2= 'extensions' otherlv_3= '{' otherlv_4= 'extended' otherlv_5= 'page' ( (lv_extendedPageID_6_0= ruleFQN ) ) ( (lv_ownedSections_7_0= ruleSection ) )* otherlv_8= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1006:2: () otherlv_1= 'page' otherlv_2= 'extensions' otherlv_3= '{' otherlv_4= 'extended' otherlv_5= 'page' ( (lv_extendedPageID_6_0= ruleFQN ) ) ( (lv_ownedSections_7_0= ruleSection ) )* otherlv_8= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1006:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1007:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPageExtensionAccess().getPageExtensionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_rulePageExtension1934); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPageExtensionAccess().getPageKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,39,FOLLOW_39_in_rulePageExtension1946); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPageExtensionAccess().getExtensionsKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_rulePageExtension1958); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPageExtensionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,40,FOLLOW_40_in_rulePageExtension1970); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPageExtensionAccess().getExtendedKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,16,FOLLOW_16_in_rulePageExtension1982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPageExtensionAccess().getPageKeyword_5());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1032:1: ( (lv_extendedPageID_6_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1033:1: (lv_extendedPageID_6_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1033:1: (lv_extendedPageID_6_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1034:3: lv_extendedPageID_6_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPageExtensionAccess().getExtendedPageIDFQNParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_rulePageExtension2003);
            lv_extendedPageID_6_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPageExtensionRule());
              	        }
                     		set(
                     			current, 
                     			"extendedPageID",
                      		lv_extendedPageID_6_0, 
                      		"FQN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1050:2: ( (lv_ownedSections_7_0= ruleSection ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==34) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1051:1: (lv_ownedSections_7_0= ruleSection )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1051:1: (lv_ownedSections_7_0= ruleSection )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1052:3: lv_ownedSections_7_0= ruleSection
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPageExtensionAccess().getOwnedSectionsSectionParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSection_in_rulePageExtension2024);
            	    lv_ownedSections_7_0=ruleSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPageExtensionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedSections",
            	              		lv_ownedSections_7_0, 
            	              		"Section");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_rulePageExtension2037); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getPageExtensionAccess().getRightCurlyBracketKeyword_8());
                  
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
    // $ANTLR end "rulePageExtension"


    // $ANTLR start "entryRuleSectionExtension"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1080:1: entryRuleSectionExtension returns [EObject current=null] : iv_ruleSectionExtension= ruleSectionExtension EOF ;
    public final EObject entryRuleSectionExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionExtension = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1081:2: (iv_ruleSectionExtension= ruleSectionExtension EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1082:2: iv_ruleSectionExtension= ruleSectionExtension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSectionExtensionRule()); 
            }
            pushFollow(FOLLOW_ruleSectionExtension_in_entryRuleSectionExtension2073);
            iv_ruleSectionExtension=ruleSectionExtension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSectionExtension; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionExtension2083); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1089:1: ruleSectionExtension returns [EObject current=null] : ( () otherlv_1= 'section' otherlv_2= 'extensions' otherlv_3= '{' otherlv_4= 'extended' otherlv_5= 'section' ( (lv_extendedSectionID_6_0= ruleFQN ) ) ( (lv_ownedActivities_7_0= ruleActivity ) )* otherlv_8= '}' ) ;
    public final EObject ruleSectionExtension() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_extendedSectionID_6_0 = null;

        EObject lv_ownedActivities_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1092:28: ( ( () otherlv_1= 'section' otherlv_2= 'extensions' otherlv_3= '{' otherlv_4= 'extended' otherlv_5= 'section' ( (lv_extendedSectionID_6_0= ruleFQN ) ) ( (lv_ownedActivities_7_0= ruleActivity ) )* otherlv_8= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1093:1: ( () otherlv_1= 'section' otherlv_2= 'extensions' otherlv_3= '{' otherlv_4= 'extended' otherlv_5= 'section' ( (lv_extendedSectionID_6_0= ruleFQN ) ) ( (lv_ownedActivities_7_0= ruleActivity ) )* otherlv_8= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1093:1: ( () otherlv_1= 'section' otherlv_2= 'extensions' otherlv_3= '{' otherlv_4= 'extended' otherlv_5= 'section' ( (lv_extendedSectionID_6_0= ruleFQN ) ) ( (lv_ownedActivities_7_0= ruleActivity ) )* otherlv_8= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1093:2: () otherlv_1= 'section' otherlv_2= 'extensions' otherlv_3= '{' otherlv_4= 'extended' otherlv_5= 'section' ( (lv_extendedSectionID_6_0= ruleFQN ) ) ( (lv_ownedActivities_7_0= ruleActivity ) )* otherlv_8= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1093:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1094:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSectionExtensionAccess().getSectionExtensionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleSectionExtension2129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSectionExtensionAccess().getSectionKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleSectionExtension2141); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSectionExtensionAccess().getExtensionsKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSectionExtension2153); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSectionExtensionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleSectionExtension2165); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSectionExtensionAccess().getExtendedKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleSectionExtension2177); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSectionExtensionAccess().getSectionKeyword_5());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1119:1: ( (lv_extendedSectionID_6_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1120:1: (lv_extendedSectionID_6_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1120:1: (lv_extendedSectionID_6_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1121:3: lv_extendedSectionID_6_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSectionExtensionAccess().getExtendedSectionIDFQNParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleSectionExtension2198);
            lv_extendedSectionID_6_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSectionExtensionRule());
              	        }
                     		set(
                     			current, 
                     			"extendedSectionID",
                      		lv_extendedSectionID_6_0, 
                      		"FQN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1137:2: ( (lv_ownedActivities_7_0= ruleActivity ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==11) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1138:1: (lv_ownedActivities_7_0= ruleActivity )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1138:1: (lv_ownedActivities_7_0= ruleActivity )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1139:3: lv_ownedActivities_7_0= ruleActivity
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSectionExtensionAccess().getOwnedActivitiesActivityParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleActivity_in_ruleSectionExtension2219);
            	    lv_ownedActivities_7_0=ruleActivity();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSectionExtensionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedActivities",
            	              		lv_ownedActivities_7_0, 
            	              		"Activity");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleSectionExtension2232); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getSectionExtensionAccess().getRightCurlyBracketKeyword_8());
                  
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


    // $ANTLR start "entryRuleOverview"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1167:1: entryRuleOverview returns [EObject current=null] : iv_ruleOverview= ruleOverview EOF ;
    public final EObject entryRuleOverview() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverview = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1168:2: (iv_ruleOverview= ruleOverview EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1169:2: iv_ruleOverview= ruleOverview EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOverviewRule()); 
            }
            pushFollow(FOLLOW_ruleOverview_in_entryRuleOverview2268);
            iv_ruleOverview=ruleOverview();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOverview; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverview2278); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1176:1: ruleOverview returns [EObject current=null] : ( () otherlv_1= 'Overview' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'image' otherlv_6= 'on' otherlv_7= ':' ( (lv_imagePathOn_8_0= RULE_STRING ) ) )? (otherlv_9= 'image' otherlv_10= 'off' otherlv_11= ':' ( (lv_imagePathOff_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1179:28: ( ( () otherlv_1= 'Overview' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'image' otherlv_6= 'on' otherlv_7= ':' ( (lv_imagePathOn_8_0= RULE_STRING ) ) )? (otherlv_9= 'image' otherlv_10= 'off' otherlv_11= ':' ( (lv_imagePathOff_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1180:1: ( () otherlv_1= 'Overview' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'image' otherlv_6= 'on' otherlv_7= ':' ( (lv_imagePathOn_8_0= RULE_STRING ) ) )? (otherlv_9= 'image' otherlv_10= 'off' otherlv_11= ':' ( (lv_imagePathOff_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1180:1: ( () otherlv_1= 'Overview' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'image' otherlv_6= 'on' otherlv_7= ':' ( (lv_imagePathOn_8_0= RULE_STRING ) ) )? (otherlv_9= 'image' otherlv_10= 'off' otherlv_11= ':' ( (lv_imagePathOff_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1180:2: () otherlv_1= 'Overview' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'image' otherlv_6= 'on' otherlv_7= ':' ( (lv_imagePathOn_8_0= RULE_STRING ) ) )? (otherlv_9= 'image' otherlv_10= 'off' otherlv_11= ':' ( (lv_imagePathOff_12_0= RULE_STRING ) ) )? otherlv_13= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1180:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1181:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOverviewAccess().getOverviewAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleOverview2324); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOverviewAccess().getOverviewKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleOverview2336); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOverviewAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1194:1: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==17) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1194:3: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleOverview2349); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getOverviewAccess().getDescriptionKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1198:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1199:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1199:1: (lv_description_4_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1200:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOverview2366); if (state.failed) return current;
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1216:4: (otherlv_5= 'image' otherlv_6= 'on' otherlv_7= ':' ( (lv_imagePathOn_8_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==24) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==25) ) {
                    alt33=1;
                }
            }
            switch (alt33) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1216:6: otherlv_5= 'image' otherlv_6= 'on' otherlv_7= ':' ( (lv_imagePathOn_8_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleOverview2386); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getOverviewAccess().getImageKeyword_4_0());
                          
                    }
                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleOverview2398); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getOverviewAccess().getOnKeyword_4_1());
                          
                    }
                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleOverview2410); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getOverviewAccess().getColonKeyword_4_2());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1228:1: ( (lv_imagePathOn_8_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1229:1: (lv_imagePathOn_8_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1229:1: (lv_imagePathOn_8_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1230:3: lv_imagePathOn_8_0= RULE_STRING
                    {
                    lv_imagePathOn_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOverview2427); if (state.failed) return current;
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1246:4: (otherlv_9= 'image' otherlv_10= 'off' otherlv_11= ':' ( (lv_imagePathOff_12_0= RULE_STRING ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==24) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1246:6: otherlv_9= 'image' otherlv_10= 'off' otherlv_11= ':' ( (lv_imagePathOff_12_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleOverview2447); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getOverviewAccess().getImageKeyword_5_0());
                          
                    }
                    otherlv_10=(Token)match(input,27,FOLLOW_27_in_ruleOverview2459); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getOverviewAccess().getOffKeyword_5_1());
                          
                    }
                    otherlv_11=(Token)match(input,26,FOLLOW_26_in_ruleOverview2471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getOverviewAccess().getColonKeyword_5_2());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1258:1: ( (lv_imagePathOff_12_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1259:1: (lv_imagePathOff_12_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1259:1: (lv_imagePathOff_12_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1260:3: lv_imagePathOff_12_0= RULE_STRING
                    {
                    lv_imagePathOff_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOverview2488); if (state.failed) return current;
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

            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleOverview2507); if (state.failed) return current;
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


    // $ANTLR start "entryRuleFQN"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1290:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1291:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1292:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN2546);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN2557); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1299:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1302:28: ( (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1303:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1303:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1303:6: this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN2597); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1310:1: (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==42) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1311:2: kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    {
            	    kw=(Token)match(input,42,FOLLOW_42_in_ruleFQN2616); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1316:1: ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1316:2: ( RULE_ID )=>this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN2637); if (state.failed) return current;
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
            	    break loop35;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1331:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1332:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1333:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_entryRuleEBoolean2686);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBoolean2697); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1340:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1343:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1344:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1344:1: (kw= 'true' | kw= 'false' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==43) ) {
                alt36=1;
            }
            else if ( (LA36_0==44) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1345:2: kw= 'true'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleEBoolean2735); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1352:2: kw= 'false'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleEBoolean2754); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1365:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1366:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1367:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_ruleEInt_in_entryRuleEInt2795);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEInt2806); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1374:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1377:28: (this_INT_0= RULE_INT )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1378:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEInt2845); if (state.failed) return current;
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
    public static final BitSet FOLLOW_11_in_ruleViewpointActivityExplorer131 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleViewpointActivityExplorer143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpointActivityExplorer164 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleViewpointActivityExplorer176 = new BitSet(new long[]{0x000000040001C000L});
    public static final BitSet FOLLOW_14_in_ruleViewpointActivityExplorer189 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleViewpointActivityExplorer201 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rulePage_in_ruleViewpointActivityExplorer222 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleViewpointActivityExplorer235 = new BitSet(new long[]{0x0000000400018000L});
    public static final BitSet FOLLOW_rulePageExtension_in_ruleViewpointActivityExplorer258 = new BitSet(new long[]{0x0000000400018000L});
    public static final BitSet FOLLOW_ruleSectionExtension_in_ruleViewpointActivityExplorer280 = new BitSet(new long[]{0x0000000400008000L});
    public static final BitSet FOLLOW_15_in_ruleViewpointActivityExplorer293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePage387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage404 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePage421 = new BitSet(new long[]{0x0000000000760000L});
    public static final BitSet FOLLOW_17_in_rulePage434 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage451 = new BitSet(new long[]{0x0000000000740000L});
    public static final BitSet FOLLOW_18_in_rulePage471 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePage483 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage500 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_20_in_rulePage520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePage541 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_rulePage556 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage573 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePage592 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleEInt_in_rulePage613 = new BitSet(new long[]{0x00000202D0808000L});
    public static final BitSet FOLLOW_ruleOverview_in_rulePage634 = new BitSet(new long[]{0x00000002D0808000L});
    public static final BitSet FOLLOW_23_in_rulePage648 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePage660 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_24_in_rulePage673 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePage685 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePage697 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage714 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_24_in_rulePage734 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePage746 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePage758 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage775 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePage794 = new BitSet(new long[]{0x00000002D0008000L});
    public static final BitSet FOLLOW_28_in_rulePage809 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePage821 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage838 = new BitSet(new long[]{0x00000002C0008000L});
    public static final BitSet FOLLOW_30_in_rulePage858 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePage870 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rulePage891 = new BitSet(new long[]{0x0000000280008000L});
    public static final BitSet FOLLOW_31_in_rulePage906 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePage918 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePage930 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rulePage951 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_33_in_rulePage966 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePage978 = new BitSet(new long[]{0x0000000400008000L});
    public static final BitSet FOLLOW_ruleSection_in_rulePage999 = new BitSet(new long[]{0x0000000400008000L});
    public static final BitSet FOLLOW_15_in_rulePage1012 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePage1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection1062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSection1118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection1135 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSection1152 = new BitSet(new long[]{0x0000000000720000L});
    public static final BitSet FOLLOW_17_in_ruleSection1165 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSection1182 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_20_in_ruleSection1202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleSection1223 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleSection1238 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSection1255 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSection1274 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleEInt_in_ruleSection1295 = new BitSet(new long[]{0x0000003800008000L});
    public static final BitSet FOLLOW_35_in_ruleSection1308 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSection1320 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleSection1341 = new BitSet(new long[]{0x0000003000008000L});
    public static final BitSet FOLLOW_36_in_ruleSection1356 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSection1368 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleSection1389 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_37_in_ruleSection1404 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSection1416 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleSection1437 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_15_in_ruleSection1450 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSection1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity1500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleActivity1556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity1573 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActivity1590 = new BitSet(new long[]{0x0000000000720000L});
    public static final BitSet FOLLOW_17_in_ruleActivity1603 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity1620 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_20_in_ruleActivity1640 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActivity1661 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleActivity1676 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity1693 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActivity1712 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleEInt_in_ruleActivity1733 = new BitSet(new long[]{0x0000004040008000L});
    public static final BitSet FOLLOW_30_in_ruleActivity1746 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleActivity1758 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleActivity1779 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_38_in_ruleActivity1794 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleActivity1806 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity1823 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleActivity1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageExtension_in_entryRulePageExtension1878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageExtension1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePageExtension1934 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulePageExtension1946 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePageExtension1958 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_rulePageExtension1970 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePageExtension1982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePageExtension2003 = new BitSet(new long[]{0x0000000400008000L});
    public static final BitSet FOLLOW_ruleSection_in_rulePageExtension2024 = new BitSet(new long[]{0x0000000400008000L});
    public static final BitSet FOLLOW_15_in_rulePageExtension2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionExtension_in_entryRuleSectionExtension2073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionExtension2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSectionExtension2129 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleSectionExtension2141 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSectionExtension2153 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleSectionExtension2165 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleSectionExtension2177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleSectionExtension2198 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleSectionExtension2219 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_15_in_ruleSectionExtension2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverview_in_entryRuleOverview2268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverview2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOverview2324 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOverview2336 = new BitSet(new long[]{0x0000000001028000L});
    public static final BitSet FOLLOW_17_in_ruleOverview2349 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOverview2366 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_24_in_ruleOverview2386 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOverview2398 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOverview2410 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOverview2427 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_24_in_ruleOverview2447 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOverview2459 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOverview2471 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOverview2488 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleOverview2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN2546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN2597 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleFQN2616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN2637 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean2686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEBoolean2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleEBoolean2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEInt2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2845 = new BitSet(new long[]{0x0000000000000002L});

}
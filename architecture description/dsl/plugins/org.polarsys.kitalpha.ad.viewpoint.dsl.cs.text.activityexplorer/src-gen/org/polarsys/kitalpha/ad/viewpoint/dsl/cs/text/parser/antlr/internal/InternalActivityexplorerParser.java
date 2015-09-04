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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'activity'", "'explorer'", "'{'", "'pages'", "'}'", "'page'", "'description'", "'file'", "'extension'", "'id'", "'index'", "'header'", "'image'", "'on'", "':'", "'off'", "'tab'", "'name'", "'predicated'", "'show'", "'viewer'", "'sections'", "'section'", "'filtering'", "'expanded'", "'activities'", "'icon'", "'extensions'", "'extended'", "'Overview'", "'.'", "'true'", "'false'"
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

                if ( (LA4_0==33) ) {
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:205:1: rulePage returns [EObject current=null] : ( () otherlv_1= 'page' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'file' otherlv_7= 'extension' ( (lv_fileExtensions_8_0= RULE_STRING ) ) )? (otherlv_9= 'id' ( (lv_activityExplorerItemID_10_0= ruleFQN ) ) )? otherlv_11= 'index' ( (lv_index_12_0= ruleEInt ) ) ( (lv_ownedOverview_13_0= ruleOverview ) )? (otherlv_14= 'header' otherlv_15= '{' (otherlv_16= 'image' otherlv_17= 'on' otherlv_18= ':' ( (lv_imagePathOn_19_0= RULE_STRING ) ) )? (otherlv_20= 'image' otherlv_21= 'off' otherlv_22= ':' ( (lv_imagePathOff_23_0= RULE_STRING ) ) )? otherlv_24= '}' )? (otherlv_25= 'tab' otherlv_26= 'name' ( (lv_tabName_27_0= RULE_STRING ) ) )? (otherlv_28= 'predicated' otherlv_29= ':' ( (lv_hasPredicate_30_0= ruleEBoolean ) ) )? (otherlv_31= 'show' otherlv_32= 'viewer' otherlv_33= ':' ( (lv_showViewer_34_0= ruleEBoolean ) ) )? (otherlv_35= 'sections' otherlv_36= '{' ( (lv_ownedSections_37_0= ruleSection ) )* otherlv_38= '}' )? otherlv_39= '}' ) ;
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
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_imagePathOn_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_imagePathOff_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token lv_tabName_27_0=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        AntlrDatatypeRuleToken lv_activityExplorerItemID_10_0 = null;

        AntlrDatatypeRuleToken lv_index_12_0 = null;

        EObject lv_ownedOverview_13_0 = null;

        AntlrDatatypeRuleToken lv_hasPredicate_30_0 = null;

        AntlrDatatypeRuleToken lv_showViewer_34_0 = null;

        EObject lv_ownedSections_37_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:208:28: ( ( () otherlv_1= 'page' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'file' otherlv_7= 'extension' ( (lv_fileExtensions_8_0= RULE_STRING ) ) )? (otherlv_9= 'id' ( (lv_activityExplorerItemID_10_0= ruleFQN ) ) )? otherlv_11= 'index' ( (lv_index_12_0= ruleEInt ) ) ( (lv_ownedOverview_13_0= ruleOverview ) )? (otherlv_14= 'header' otherlv_15= '{' (otherlv_16= 'image' otherlv_17= 'on' otherlv_18= ':' ( (lv_imagePathOn_19_0= RULE_STRING ) ) )? (otherlv_20= 'image' otherlv_21= 'off' otherlv_22= ':' ( (lv_imagePathOff_23_0= RULE_STRING ) ) )? otherlv_24= '}' )? (otherlv_25= 'tab' otherlv_26= 'name' ( (lv_tabName_27_0= RULE_STRING ) ) )? (otherlv_28= 'predicated' otherlv_29= ':' ( (lv_hasPredicate_30_0= ruleEBoolean ) ) )? (otherlv_31= 'show' otherlv_32= 'viewer' otherlv_33= ':' ( (lv_showViewer_34_0= ruleEBoolean ) ) )? (otherlv_35= 'sections' otherlv_36= '{' ( (lv_ownedSections_37_0= ruleSection ) )* otherlv_38= '}' )? otherlv_39= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:209:1: ( () otherlv_1= 'page' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'file' otherlv_7= 'extension' ( (lv_fileExtensions_8_0= RULE_STRING ) ) )? (otherlv_9= 'id' ( (lv_activityExplorerItemID_10_0= ruleFQN ) ) )? otherlv_11= 'index' ( (lv_index_12_0= ruleEInt ) ) ( (lv_ownedOverview_13_0= ruleOverview ) )? (otherlv_14= 'header' otherlv_15= '{' (otherlv_16= 'image' otherlv_17= 'on' otherlv_18= ':' ( (lv_imagePathOn_19_0= RULE_STRING ) ) )? (otherlv_20= 'image' otherlv_21= 'off' otherlv_22= ':' ( (lv_imagePathOff_23_0= RULE_STRING ) ) )? otherlv_24= '}' )? (otherlv_25= 'tab' otherlv_26= 'name' ( (lv_tabName_27_0= RULE_STRING ) ) )? (otherlv_28= 'predicated' otherlv_29= ':' ( (lv_hasPredicate_30_0= ruleEBoolean ) ) )? (otherlv_31= 'show' otherlv_32= 'viewer' otherlv_33= ':' ( (lv_showViewer_34_0= ruleEBoolean ) ) )? (otherlv_35= 'sections' otherlv_36= '{' ( (lv_ownedSections_37_0= ruleSection ) )* otherlv_38= '}' )? otherlv_39= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:209:1: ( () otherlv_1= 'page' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'file' otherlv_7= 'extension' ( (lv_fileExtensions_8_0= RULE_STRING ) ) )? (otherlv_9= 'id' ( (lv_activityExplorerItemID_10_0= ruleFQN ) ) )? otherlv_11= 'index' ( (lv_index_12_0= ruleEInt ) ) ( (lv_ownedOverview_13_0= ruleOverview ) )? (otherlv_14= 'header' otherlv_15= '{' (otherlv_16= 'image' otherlv_17= 'on' otherlv_18= ':' ( (lv_imagePathOn_19_0= RULE_STRING ) ) )? (otherlv_20= 'image' otherlv_21= 'off' otherlv_22= ':' ( (lv_imagePathOff_23_0= RULE_STRING ) ) )? otherlv_24= '}' )? (otherlv_25= 'tab' otherlv_26= 'name' ( (lv_tabName_27_0= RULE_STRING ) ) )? (otherlv_28= 'predicated' otherlv_29= ':' ( (lv_hasPredicate_30_0= ruleEBoolean ) ) )? (otherlv_31= 'show' otherlv_32= 'viewer' otherlv_33= ':' ( (lv_showViewer_34_0= ruleEBoolean ) ) )? (otherlv_35= 'sections' otherlv_36= '{' ( (lv_ownedSections_37_0= ruleSection ) )* otherlv_38= '}' )? otherlv_39= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:209:2: () otherlv_1= 'page' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'file' otherlv_7= 'extension' ( (lv_fileExtensions_8_0= RULE_STRING ) ) )? (otherlv_9= 'id' ( (lv_activityExplorerItemID_10_0= ruleFQN ) ) )? otherlv_11= 'index' ( (lv_index_12_0= ruleEInt ) ) ( (lv_ownedOverview_13_0= ruleOverview ) )? (otherlv_14= 'header' otherlv_15= '{' (otherlv_16= 'image' otherlv_17= 'on' otherlv_18= ':' ( (lv_imagePathOn_19_0= RULE_STRING ) ) )? (otherlv_20= 'image' otherlv_21= 'off' otherlv_22= ':' ( (lv_imagePathOff_23_0= RULE_STRING ) ) )? otherlv_24= '}' )? (otherlv_25= 'tab' otherlv_26= 'name' ( (lv_tabName_27_0= RULE_STRING ) ) )? (otherlv_28= 'predicated' otherlv_29= ':' ( (lv_hasPredicate_30_0= ruleEBoolean ) ) )? (otherlv_31= 'show' otherlv_32= 'viewer' otherlv_33= ':' ( (lv_showViewer_34_0= ruleEBoolean ) ) )? (otherlv_35= 'sections' otherlv_36= '{' ( (lv_ownedSections_37_0= ruleSection ) )* otherlv_38= '}' )? otherlv_39= '}'
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:219:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:220:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:220:1: (lv_name_2_0= RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:221:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage404); if (state.failed) return current;
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

            otherlv_11=(Token)match(input,21,FOLLOW_21_in_rulePage555); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getPageAccess().getIndexKeyword_7());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:315:1: ( (lv_index_12_0= ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:316:1: (lv_index_12_0= ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:316:1: (lv_index_12_0= ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:317:3: lv_index_12_0= ruleEInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPageAccess().getIndexEIntParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEInt_in_rulePage576);
            lv_index_12_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPageRule());
              	        }
                     		set(
                     			current, 
                     			"index",
                      		lv_index_12_0, 
                      		"EInt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:333:2: ( (lv_ownedOverview_13_0= ruleOverview ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==40) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:334:1: (lv_ownedOverview_13_0= ruleOverview )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:334:1: (lv_ownedOverview_13_0= ruleOverview )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:335:3: lv_ownedOverview_13_0= ruleOverview
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPageAccess().getOwnedOverviewOverviewParserRuleCall_9_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOverview_in_rulePage597);
                    lv_ownedOverview_13_0=ruleOverview();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPageRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedOverview",
                              		lv_ownedOverview_13_0, 
                              		"Overview");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:351:3: (otherlv_14= 'header' otherlv_15= '{' (otherlv_16= 'image' otherlv_17= 'on' otherlv_18= ':' ( (lv_imagePathOn_19_0= RULE_STRING ) ) )? (otherlv_20= 'image' otherlv_21= 'off' otherlv_22= ':' ( (lv_imagePathOff_23_0= RULE_STRING ) ) )? otherlv_24= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:351:5: otherlv_14= 'header' otherlv_15= '{' (otherlv_16= 'image' otherlv_17= 'on' otherlv_18= ':' ( (lv_imagePathOn_19_0= RULE_STRING ) ) )? (otherlv_20= 'image' otherlv_21= 'off' otherlv_22= ':' ( (lv_imagePathOff_23_0= RULE_STRING ) ) )? otherlv_24= '}'
                    {
                    otherlv_14=(Token)match(input,22,FOLLOW_22_in_rulePage611); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getPageAccess().getHeaderKeyword_10_0());
                          
                    }
                    otherlv_15=(Token)match(input,13,FOLLOW_13_in_rulePage623); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_10_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:359:1: (otherlv_16= 'image' otherlv_17= 'on' otherlv_18= ':' ( (lv_imagePathOn_19_0= RULE_STRING ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==23) ) {
                        int LA9_1 = input.LA(2);

                        if ( (LA9_1==24) ) {
                            alt9=1;
                        }
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:359:3: otherlv_16= 'image' otherlv_17= 'on' otherlv_18= ':' ( (lv_imagePathOn_19_0= RULE_STRING ) )
                            {
                            otherlv_16=(Token)match(input,23,FOLLOW_23_in_rulePage636); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_16, grammarAccess.getPageAccess().getImageKeyword_10_2_0());
                                  
                            }
                            otherlv_17=(Token)match(input,24,FOLLOW_24_in_rulePage648); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_17, grammarAccess.getPageAccess().getOnKeyword_10_2_1());
                                  
                            }
                            otherlv_18=(Token)match(input,25,FOLLOW_25_in_rulePage660); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_18, grammarAccess.getPageAccess().getColonKeyword_10_2_2());
                                  
                            }
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:371:1: ( (lv_imagePathOn_19_0= RULE_STRING ) )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:372:1: (lv_imagePathOn_19_0= RULE_STRING )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:372:1: (lv_imagePathOn_19_0= RULE_STRING )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:373:3: lv_imagePathOn_19_0= RULE_STRING
                            {
                            lv_imagePathOn_19_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage677); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_imagePathOn_19_0, grammarAccess.getPageAccess().getImagePathOnSTRINGTerminalRuleCall_10_2_3_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPageRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"imagePathOn",
                                      		lv_imagePathOn_19_0, 
                                      		"STRING");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:389:4: (otherlv_20= 'image' otherlv_21= 'off' otherlv_22= ':' ( (lv_imagePathOff_23_0= RULE_STRING ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==23) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:389:6: otherlv_20= 'image' otherlv_21= 'off' otherlv_22= ':' ( (lv_imagePathOff_23_0= RULE_STRING ) )
                            {
                            otherlv_20=(Token)match(input,23,FOLLOW_23_in_rulePage697); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_20, grammarAccess.getPageAccess().getImageKeyword_10_3_0());
                                  
                            }
                            otherlv_21=(Token)match(input,26,FOLLOW_26_in_rulePage709); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_21, grammarAccess.getPageAccess().getOffKeyword_10_3_1());
                                  
                            }
                            otherlv_22=(Token)match(input,25,FOLLOW_25_in_rulePage721); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_22, grammarAccess.getPageAccess().getColonKeyword_10_3_2());
                                  
                            }
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:401:1: ( (lv_imagePathOff_23_0= RULE_STRING ) )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:402:1: (lv_imagePathOff_23_0= RULE_STRING )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:402:1: (lv_imagePathOff_23_0= RULE_STRING )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:403:3: lv_imagePathOff_23_0= RULE_STRING
                            {
                            lv_imagePathOff_23_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage738); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_imagePathOff_23_0, grammarAccess.getPageAccess().getImagePathOffSTRINGTerminalRuleCall_10_3_3_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPageRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"imagePathOff",
                                      		lv_imagePathOff_23_0, 
                                      		"STRING");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_24=(Token)match(input,15,FOLLOW_15_in_rulePage757); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_10_4());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:423:3: (otherlv_25= 'tab' otherlv_26= 'name' ( (lv_tabName_27_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:423:5: otherlv_25= 'tab' otherlv_26= 'name' ( (lv_tabName_27_0= RULE_STRING ) )
                    {
                    otherlv_25=(Token)match(input,27,FOLLOW_27_in_rulePage772); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getPageAccess().getTabKeyword_11_0());
                          
                    }
                    otherlv_26=(Token)match(input,28,FOLLOW_28_in_rulePage784); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getPageAccess().getNameKeyword_11_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:431:1: ( (lv_tabName_27_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:432:1: (lv_tabName_27_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:432:1: (lv_tabName_27_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:433:3: lv_tabName_27_0= RULE_STRING
                    {
                    lv_tabName_27_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage801); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_tabName_27_0, grammarAccess.getPageAccess().getTabNameSTRINGTerminalRuleCall_11_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPageRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"tabName",
                              		lv_tabName_27_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:449:4: (otherlv_28= 'predicated' otherlv_29= ':' ( (lv_hasPredicate_30_0= ruleEBoolean ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:449:6: otherlv_28= 'predicated' otherlv_29= ':' ( (lv_hasPredicate_30_0= ruleEBoolean ) )
                    {
                    otherlv_28=(Token)match(input,29,FOLLOW_29_in_rulePage821); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_28, grammarAccess.getPageAccess().getPredicatedKeyword_12_0());
                          
                    }
                    otherlv_29=(Token)match(input,25,FOLLOW_25_in_rulePage833); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getPageAccess().getColonKeyword_12_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:457:1: ( (lv_hasPredicate_30_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:458:1: (lv_hasPredicate_30_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:458:1: (lv_hasPredicate_30_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:459:3: lv_hasPredicate_30_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPageAccess().getHasPredicateEBooleanParserRuleCall_12_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_rulePage854);
                    lv_hasPredicate_30_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPageRule());
                      	        }
                             		set(
                             			current, 
                             			"hasPredicate",
                              		lv_hasPredicate_30_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:475:4: (otherlv_31= 'show' otherlv_32= 'viewer' otherlv_33= ':' ( (lv_showViewer_34_0= ruleEBoolean ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:475:6: otherlv_31= 'show' otherlv_32= 'viewer' otherlv_33= ':' ( (lv_showViewer_34_0= ruleEBoolean ) )
                    {
                    otherlv_31=(Token)match(input,30,FOLLOW_30_in_rulePage869); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_31, grammarAccess.getPageAccess().getShowKeyword_13_0());
                          
                    }
                    otherlv_32=(Token)match(input,31,FOLLOW_31_in_rulePage881); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getPageAccess().getViewerKeyword_13_1());
                          
                    }
                    otherlv_33=(Token)match(input,25,FOLLOW_25_in_rulePage893); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_33, grammarAccess.getPageAccess().getColonKeyword_13_2());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:487:1: ( (lv_showViewer_34_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:488:1: (lv_showViewer_34_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:488:1: (lv_showViewer_34_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:489:3: lv_showViewer_34_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPageAccess().getShowViewerEBooleanParserRuleCall_13_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_rulePage914);
                    lv_showViewer_34_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPageRule());
                      	        }
                             		set(
                             			current, 
                             			"showViewer",
                              		lv_showViewer_34_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:505:4: (otherlv_35= 'sections' otherlv_36= '{' ( (lv_ownedSections_37_0= ruleSection ) )* otherlv_38= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:505:6: otherlv_35= 'sections' otherlv_36= '{' ( (lv_ownedSections_37_0= ruleSection ) )* otherlv_38= '}'
                    {
                    otherlv_35=(Token)match(input,32,FOLLOW_32_in_rulePage929); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getPageAccess().getSectionsKeyword_14_0());
                          
                    }
                    otherlv_36=(Token)match(input,13,FOLLOW_13_in_rulePage941); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_36, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_14_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:513:1: ( (lv_ownedSections_37_0= ruleSection ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==33) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:514:1: (lv_ownedSections_37_0= ruleSection )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:514:1: (lv_ownedSections_37_0= ruleSection )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:515:3: lv_ownedSections_37_0= ruleSection
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPageAccess().getOwnedSectionsSectionParserRuleCall_14_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSection_in_rulePage962);
                    	    lv_ownedSections_37_0=ruleSection();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPageRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedSections",
                    	              		lv_ownedSections_37_0, 
                    	              		"Section");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,15,FOLLOW_15_in_rulePage975); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_38, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_14_3());
                          
                    }

                    }
                    break;

            }

            otherlv_39=(Token)match(input,15,FOLLOW_15_in_rulePage989); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_39, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_15());
                  
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:547:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:548:2: (iv_ruleSection= ruleSection EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:549:2: iv_ruleSection= ruleSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSectionRule()); 
            }
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection1025);
            iv_ruleSection=ruleSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection1035); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:556:1: ruleSection returns [EObject current=null] : ( () otherlv_1= 'section' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? otherlv_8= 'index' ( (lv_index_9_0= ruleEInt ) ) (otherlv_10= 'filtering' otherlv_11= ':' ( (lv_filtering_12_0= ruleEBoolean ) ) )? (otherlv_13= 'expanded' otherlv_14= ':' ( (lv_expanded_15_0= ruleEBoolean ) ) )? (otherlv_16= 'activities' otherlv_17= '{' ( (lv_ownedActivities_18_0= ruleActivity ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_activityExplorerItemID_7_0 = null;

        AntlrDatatypeRuleToken lv_index_9_0 = null;

        AntlrDatatypeRuleToken lv_filtering_12_0 = null;

        AntlrDatatypeRuleToken lv_expanded_15_0 = null;

        EObject lv_ownedActivities_18_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:559:28: ( ( () otherlv_1= 'section' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? otherlv_8= 'index' ( (lv_index_9_0= ruleEInt ) ) (otherlv_10= 'filtering' otherlv_11= ':' ( (lv_filtering_12_0= ruleEBoolean ) ) )? (otherlv_13= 'expanded' otherlv_14= ':' ( (lv_expanded_15_0= ruleEBoolean ) ) )? (otherlv_16= 'activities' otherlv_17= '{' ( (lv_ownedActivities_18_0= ruleActivity ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:560:1: ( () otherlv_1= 'section' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? otherlv_8= 'index' ( (lv_index_9_0= ruleEInt ) ) (otherlv_10= 'filtering' otherlv_11= ':' ( (lv_filtering_12_0= ruleEBoolean ) ) )? (otherlv_13= 'expanded' otherlv_14= ':' ( (lv_expanded_15_0= ruleEBoolean ) ) )? (otherlv_16= 'activities' otherlv_17= '{' ( (lv_ownedActivities_18_0= ruleActivity ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:560:1: ( () otherlv_1= 'section' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? otherlv_8= 'index' ( (lv_index_9_0= ruleEInt ) ) (otherlv_10= 'filtering' otherlv_11= ':' ( (lv_filtering_12_0= ruleEBoolean ) ) )? (otherlv_13= 'expanded' otherlv_14= ':' ( (lv_expanded_15_0= ruleEBoolean ) ) )? (otherlv_16= 'activities' otherlv_17= '{' ( (lv_ownedActivities_18_0= ruleActivity ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:560:2: () otherlv_1= 'section' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? otherlv_8= 'index' ( (lv_index_9_0= ruleEInt ) ) (otherlv_10= 'filtering' otherlv_11= ':' ( (lv_filtering_12_0= ruleEBoolean ) ) )? (otherlv_13= 'expanded' otherlv_14= ':' ( (lv_expanded_15_0= ruleEBoolean ) ) )? (otherlv_16= 'activities' otherlv_17= '{' ( (lv_ownedActivities_18_0= ruleActivity ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:560:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:561:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSectionAccess().getSectionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleSection1081); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getSectionKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:570:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:571:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:571:1: (lv_name_2_0= RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:572:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSection1098); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSectionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSection1115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:592:1: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:592:3: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSection1128); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getDescriptionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:596:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:597:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:597:1: (lv_description_5_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:598:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSection1145); if (state.failed) return current;
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:614:4: (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:614:6: otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleSection1165); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSectionAccess().getIdKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:618:1: ( (lv_activityExplorerItemID_7_0= ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:619:1: (lv_activityExplorerItemID_7_0= ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:619:1: (lv_activityExplorerItemID_7_0= ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:620:3: lv_activityExplorerItemID_7_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSectionAccess().getActivityExplorerItemIDFQNParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleSection1186);
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

            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleSection1200); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getSectionAccess().getIndexKeyword_6());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:640:1: ( (lv_index_9_0= ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:641:1: (lv_index_9_0= ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:641:1: (lv_index_9_0= ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:642:3: lv_index_9_0= ruleEInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSectionAccess().getIndexEIntParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEInt_in_ruleSection1221);
            lv_index_9_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSectionRule());
              	        }
                     		set(
                     			current, 
                     			"index",
                      		lv_index_9_0, 
                      		"EInt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:658:2: (otherlv_10= 'filtering' otherlv_11= ':' ( (lv_filtering_12_0= ruleEBoolean ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:658:4: otherlv_10= 'filtering' otherlv_11= ':' ( (lv_filtering_12_0= ruleEBoolean ) )
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_34_in_ruleSection1234); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getSectionAccess().getFilteringKeyword_8_0());
                          
                    }
                    otherlv_11=(Token)match(input,25,FOLLOW_25_in_ruleSection1246); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getSectionAccess().getColonKeyword_8_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:666:1: ( (lv_filtering_12_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:667:1: (lv_filtering_12_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:667:1: (lv_filtering_12_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:668:3: lv_filtering_12_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSectionAccess().getFilteringEBooleanParserRuleCall_8_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleSection1267);
                    lv_filtering_12_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSectionRule());
                      	        }
                             		set(
                             			current, 
                             			"filtering",
                              		lv_filtering_12_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:684:4: (otherlv_13= 'expanded' otherlv_14= ':' ( (lv_expanded_15_0= ruleEBoolean ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:684:6: otherlv_13= 'expanded' otherlv_14= ':' ( (lv_expanded_15_0= ruleEBoolean ) )
                    {
                    otherlv_13=(Token)match(input,35,FOLLOW_35_in_ruleSection1282); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getSectionAccess().getExpandedKeyword_9_0());
                          
                    }
                    otherlv_14=(Token)match(input,25,FOLLOW_25_in_ruleSection1294); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getSectionAccess().getColonKeyword_9_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:692:1: ( (lv_expanded_15_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:693:1: (lv_expanded_15_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:693:1: (lv_expanded_15_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:694:3: lv_expanded_15_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSectionAccess().getExpandedEBooleanParserRuleCall_9_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleSection1315);
                    lv_expanded_15_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSectionRule());
                      	        }
                             		set(
                             			current, 
                             			"expanded",
                              		lv_expanded_15_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:710:4: (otherlv_16= 'activities' otherlv_17= '{' ( (lv_ownedActivities_18_0= ruleActivity ) )* otherlv_19= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:710:6: otherlv_16= 'activities' otherlv_17= '{' ( (lv_ownedActivities_18_0= ruleActivity ) )* otherlv_19= '}'
                    {
                    otherlv_16=(Token)match(input,36,FOLLOW_36_in_ruleSection1330); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getSectionAccess().getActivitiesKeyword_10_0());
                          
                    }
                    otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleSection1342); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_10_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:718:1: ( (lv_ownedActivities_18_0= ruleActivity ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==11) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:719:1: (lv_ownedActivities_18_0= ruleActivity )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:719:1: (lv_ownedActivities_18_0= ruleActivity )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:720:3: lv_ownedActivities_18_0= ruleActivity
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSectionAccess().getOwnedActivitiesActivityParserRuleCall_10_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleActivity_in_ruleSection1363);
                    	    lv_ownedActivities_18_0=ruleActivity();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSectionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedActivities",
                    	              		lv_ownedActivities_18_0, 
                    	              		"Activity");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleSection1376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_10_3());
                          
                    }

                    }
                    break;

            }

            otherlv_20=(Token)match(input,15,FOLLOW_15_in_ruleSection1390); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_20, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_11());
                  
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:752:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:753:2: (iv_ruleActivity= ruleActivity EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:754:2: iv_ruleActivity= ruleActivity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActivityRule()); 
            }
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity1426);
            iv_ruleActivity=ruleActivity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActivity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity1436); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:761:1: ruleActivity returns [EObject current=null] : ( () otherlv_1= 'activity' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? otherlv_8= 'index' ( (lv_index_9_0= ruleEInt ) ) (otherlv_10= 'predicated' otherlv_11= ':' ( (lv_hasPredicate_12_0= ruleEBoolean ) ) )? (otherlv_13= 'icon' otherlv_14= ':' ( (lv_imagePathOff_15_0= RULE_STRING ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_imagePathOff_15_0=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_activityExplorerItemID_7_0 = null;

        AntlrDatatypeRuleToken lv_index_9_0 = null;

        AntlrDatatypeRuleToken lv_hasPredicate_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:764:28: ( ( () otherlv_1= 'activity' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? otherlv_8= 'index' ( (lv_index_9_0= ruleEInt ) ) (otherlv_10= 'predicated' otherlv_11= ':' ( (lv_hasPredicate_12_0= ruleEBoolean ) ) )? (otherlv_13= 'icon' otherlv_14= ':' ( (lv_imagePathOff_15_0= RULE_STRING ) ) )? otherlv_16= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:765:1: ( () otherlv_1= 'activity' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? otherlv_8= 'index' ( (lv_index_9_0= ruleEInt ) ) (otherlv_10= 'predicated' otherlv_11= ':' ( (lv_hasPredicate_12_0= ruleEBoolean ) ) )? (otherlv_13= 'icon' otherlv_14= ':' ( (lv_imagePathOff_15_0= RULE_STRING ) ) )? otherlv_16= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:765:1: ( () otherlv_1= 'activity' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? otherlv_8= 'index' ( (lv_index_9_0= ruleEInt ) ) (otherlv_10= 'predicated' otherlv_11= ':' ( (lv_hasPredicate_12_0= ruleEBoolean ) ) )? (otherlv_13= 'icon' otherlv_14= ':' ( (lv_imagePathOff_15_0= RULE_STRING ) ) )? otherlv_16= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:765:2: () otherlv_1= 'activity' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? otherlv_8= 'index' ( (lv_index_9_0= ruleEInt ) ) (otherlv_10= 'predicated' otherlv_11= ':' ( (lv_hasPredicate_12_0= ruleEBoolean ) ) )? (otherlv_13= 'icon' otherlv_14= ':' ( (lv_imagePathOff_15_0= RULE_STRING ) ) )? otherlv_16= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:765:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:766:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActivityAccess().getActivityAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleActivity1482); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getActivityKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:775:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:776:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:776:1: (lv_name_2_0= RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:777:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity1499); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getActivityAccess().getNameSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getActivityRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleActivity1516); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:797:1: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:797:3: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleActivity1529); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getDescriptionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:801:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:802:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:802:1: (lv_description_5_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:803:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity1546); if (state.failed) return current;
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:819:4: (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:819:6: otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleActivity1566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getActivityAccess().getIdKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:823:1: ( (lv_activityExplorerItemID_7_0= ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:824:1: (lv_activityExplorerItemID_7_0= ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:824:1: (lv_activityExplorerItemID_7_0= ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:825:3: lv_activityExplorerItemID_7_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getActivityAccess().getActivityExplorerItemIDFQNParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleActivity1587);
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

            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleActivity1601); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getActivityAccess().getIndexKeyword_6());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:845:1: ( (lv_index_9_0= ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:846:1: (lv_index_9_0= ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:846:1: (lv_index_9_0= ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:847:3: lv_index_9_0= ruleEInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActivityAccess().getIndexEIntParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEInt_in_ruleActivity1622);
            lv_index_9_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getActivityRule());
              	        }
                     		set(
                     			current, 
                     			"index",
                      		lv_index_9_0, 
                      		"EInt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:863:2: (otherlv_10= 'predicated' otherlv_11= ':' ( (lv_hasPredicate_12_0= ruleEBoolean ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:863:4: otherlv_10= 'predicated' otherlv_11= ':' ( (lv_hasPredicate_12_0= ruleEBoolean ) )
                    {
                    otherlv_10=(Token)match(input,29,FOLLOW_29_in_ruleActivity1635); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getActivityAccess().getPredicatedKeyword_8_0());
                          
                    }
                    otherlv_11=(Token)match(input,25,FOLLOW_25_in_ruleActivity1647); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getActivityAccess().getColonKeyword_8_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:871:1: ( (lv_hasPredicate_12_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:872:1: (lv_hasPredicate_12_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:872:1: (lv_hasPredicate_12_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:873:3: lv_hasPredicate_12_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getActivityAccess().getHasPredicateEBooleanParserRuleCall_8_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleActivity1668);
                    lv_hasPredicate_12_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getActivityRule());
                      	        }
                             		set(
                             			current, 
                             			"hasPredicate",
                              		lv_hasPredicate_12_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:889:4: (otherlv_13= 'icon' otherlv_14= ':' ( (lv_imagePathOff_15_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:889:6: otherlv_13= 'icon' otherlv_14= ':' ( (lv_imagePathOff_15_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,37,FOLLOW_37_in_ruleActivity1683); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getActivityAccess().getIconKeyword_9_0());
                          
                    }
                    otherlv_14=(Token)match(input,25,FOLLOW_25_in_ruleActivity1695); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getActivityAccess().getColonKeyword_9_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:897:1: ( (lv_imagePathOff_15_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:898:1: (lv_imagePathOff_15_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:898:1: (lv_imagePathOff_15_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:899:3: lv_imagePathOff_15_0= RULE_STRING
                    {
                    lv_imagePathOff_15_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity1712); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_imagePathOff_15_0, grammarAccess.getActivityAccess().getImagePathOffSTRINGTerminalRuleCall_9_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getActivityRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"imagePathOff",
                              		lv_imagePathOff_15_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_15_in_ruleActivity1731); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_10());
                  
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:927:1: entryRulePageExtension returns [EObject current=null] : iv_rulePageExtension= rulePageExtension EOF ;
    public final EObject entryRulePageExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageExtension = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:928:2: (iv_rulePageExtension= rulePageExtension EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:929:2: iv_rulePageExtension= rulePageExtension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPageExtensionRule()); 
            }
            pushFollow(FOLLOW_rulePageExtension_in_entryRulePageExtension1767);
            iv_rulePageExtension=rulePageExtension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePageExtension; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePageExtension1777); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:936:1: rulePageExtension returns [EObject current=null] : ( () otherlv_1= 'page' otherlv_2= 'extensions' otherlv_3= '{' otherlv_4= 'extended' otherlv_5= 'page' ( (lv_extendedPageID_6_0= ruleFQN ) ) ( (lv_ownedSections_7_0= ruleSection ) )* otherlv_8= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:939:28: ( ( () otherlv_1= 'page' otherlv_2= 'extensions' otherlv_3= '{' otherlv_4= 'extended' otherlv_5= 'page' ( (lv_extendedPageID_6_0= ruleFQN ) ) ( (lv_ownedSections_7_0= ruleSection ) )* otherlv_8= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:940:1: ( () otherlv_1= 'page' otherlv_2= 'extensions' otherlv_3= '{' otherlv_4= 'extended' otherlv_5= 'page' ( (lv_extendedPageID_6_0= ruleFQN ) ) ( (lv_ownedSections_7_0= ruleSection ) )* otherlv_8= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:940:1: ( () otherlv_1= 'page' otherlv_2= 'extensions' otherlv_3= '{' otherlv_4= 'extended' otherlv_5= 'page' ( (lv_extendedPageID_6_0= ruleFQN ) ) ( (lv_ownedSections_7_0= ruleSection ) )* otherlv_8= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:940:2: () otherlv_1= 'page' otherlv_2= 'extensions' otherlv_3= '{' otherlv_4= 'extended' otherlv_5= 'page' ( (lv_extendedPageID_6_0= ruleFQN ) ) ( (lv_ownedSections_7_0= ruleSection ) )* otherlv_8= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:940:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:941:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPageExtensionAccess().getPageExtensionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_rulePageExtension1823); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPageExtensionAccess().getPageKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,38,FOLLOW_38_in_rulePageExtension1835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPageExtensionAccess().getExtensionsKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_rulePageExtension1847); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPageExtensionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,39,FOLLOW_39_in_rulePageExtension1859); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPageExtensionAccess().getExtendedKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,16,FOLLOW_16_in_rulePageExtension1871); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPageExtensionAccess().getPageKeyword_5());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:966:1: ( (lv_extendedPageID_6_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:967:1: (lv_extendedPageID_6_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:967:1: (lv_extendedPageID_6_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:968:3: lv_extendedPageID_6_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPageExtensionAccess().getExtendedPageIDFQNParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_rulePageExtension1892);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:984:2: ( (lv_ownedSections_7_0= ruleSection ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==33) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:985:1: (lv_ownedSections_7_0= ruleSection )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:985:1: (lv_ownedSections_7_0= ruleSection )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:986:3: lv_ownedSections_7_0= ruleSection
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPageExtensionAccess().getOwnedSectionsSectionParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSection_in_rulePageExtension1913);
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
            	    break loop27;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_rulePageExtension1926); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1014:1: entryRuleSectionExtension returns [EObject current=null] : iv_ruleSectionExtension= ruleSectionExtension EOF ;
    public final EObject entryRuleSectionExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionExtension = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1015:2: (iv_ruleSectionExtension= ruleSectionExtension EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1016:2: iv_ruleSectionExtension= ruleSectionExtension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSectionExtensionRule()); 
            }
            pushFollow(FOLLOW_ruleSectionExtension_in_entryRuleSectionExtension1962);
            iv_ruleSectionExtension=ruleSectionExtension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSectionExtension; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionExtension1972); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1023:1: ruleSectionExtension returns [EObject current=null] : ( () otherlv_1= 'section' otherlv_2= 'extensions' otherlv_3= '{' otherlv_4= 'extended' otherlv_5= 'section' ( (lv_extendedSectionID_6_0= ruleFQN ) ) ( (lv_ownedActivities_7_0= ruleActivity ) )* otherlv_8= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1026:28: ( ( () otherlv_1= 'section' otherlv_2= 'extensions' otherlv_3= '{' otherlv_4= 'extended' otherlv_5= 'section' ( (lv_extendedSectionID_6_0= ruleFQN ) ) ( (lv_ownedActivities_7_0= ruleActivity ) )* otherlv_8= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1027:1: ( () otherlv_1= 'section' otherlv_2= 'extensions' otherlv_3= '{' otherlv_4= 'extended' otherlv_5= 'section' ( (lv_extendedSectionID_6_0= ruleFQN ) ) ( (lv_ownedActivities_7_0= ruleActivity ) )* otherlv_8= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1027:1: ( () otherlv_1= 'section' otherlv_2= 'extensions' otherlv_3= '{' otherlv_4= 'extended' otherlv_5= 'section' ( (lv_extendedSectionID_6_0= ruleFQN ) ) ( (lv_ownedActivities_7_0= ruleActivity ) )* otherlv_8= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1027:2: () otherlv_1= 'section' otherlv_2= 'extensions' otherlv_3= '{' otherlv_4= 'extended' otherlv_5= 'section' ( (lv_extendedSectionID_6_0= ruleFQN ) ) ( (lv_ownedActivities_7_0= ruleActivity ) )* otherlv_8= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1027:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1028:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSectionExtensionAccess().getSectionExtensionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleSectionExtension2018); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSectionExtensionAccess().getSectionKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleSectionExtension2030); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSectionExtensionAccess().getExtensionsKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSectionExtension2042); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSectionExtensionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleSectionExtension2054); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSectionExtensionAccess().getExtendedKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleSectionExtension2066); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSectionExtensionAccess().getSectionKeyword_5());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1053:1: ( (lv_extendedSectionID_6_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1054:1: (lv_extendedSectionID_6_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1054:1: (lv_extendedSectionID_6_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1055:3: lv_extendedSectionID_6_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSectionExtensionAccess().getExtendedSectionIDFQNParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleSectionExtension2087);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1071:2: ( (lv_ownedActivities_7_0= ruleActivity ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==11) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1072:1: (lv_ownedActivities_7_0= ruleActivity )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1072:1: (lv_ownedActivities_7_0= ruleActivity )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1073:3: lv_ownedActivities_7_0= ruleActivity
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSectionExtensionAccess().getOwnedActivitiesActivityParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleActivity_in_ruleSectionExtension2108);
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
            	    break loop28;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleSectionExtension2121); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1101:1: entryRuleOverview returns [EObject current=null] : iv_ruleOverview= ruleOverview EOF ;
    public final EObject entryRuleOverview() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverview = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1102:2: (iv_ruleOverview= ruleOverview EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1103:2: iv_ruleOverview= ruleOverview EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOverviewRule()); 
            }
            pushFollow(FOLLOW_ruleOverview_in_entryRuleOverview2157);
            iv_ruleOverview=ruleOverview();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOverview; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverview2167); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1110:1: ruleOverview returns [EObject current=null] : ( () otherlv_1= 'Overview' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'image' otherlv_6= 'on' otherlv_7= ':' ( (lv_imagePathOn_8_0= RULE_STRING ) ) )? (otherlv_9= 'image' otherlv_10= 'off' otherlv_11= ':' ( (lv_imagePathOff_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1113:28: ( ( () otherlv_1= 'Overview' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'image' otherlv_6= 'on' otherlv_7= ':' ( (lv_imagePathOn_8_0= RULE_STRING ) ) )? (otherlv_9= 'image' otherlv_10= 'off' otherlv_11= ':' ( (lv_imagePathOff_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1114:1: ( () otherlv_1= 'Overview' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'image' otherlv_6= 'on' otherlv_7= ':' ( (lv_imagePathOn_8_0= RULE_STRING ) ) )? (otherlv_9= 'image' otherlv_10= 'off' otherlv_11= ':' ( (lv_imagePathOff_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1114:1: ( () otherlv_1= 'Overview' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'image' otherlv_6= 'on' otherlv_7= ':' ( (lv_imagePathOn_8_0= RULE_STRING ) ) )? (otherlv_9= 'image' otherlv_10= 'off' otherlv_11= ':' ( (lv_imagePathOff_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1114:2: () otherlv_1= 'Overview' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'image' otherlv_6= 'on' otherlv_7= ':' ( (lv_imagePathOn_8_0= RULE_STRING ) ) )? (otherlv_9= 'image' otherlv_10= 'off' otherlv_11= ':' ( (lv_imagePathOff_12_0= RULE_STRING ) ) )? otherlv_13= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1114:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1115:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOverviewAccess().getOverviewAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleOverview2213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOverviewAccess().getOverviewKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleOverview2225); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOverviewAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1128:1: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==17) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1128:3: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleOverview2238); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getOverviewAccess().getDescriptionKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1132:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1133:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1133:1: (lv_description_4_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1134:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOverview2255); if (state.failed) return current;
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1150:4: (otherlv_5= 'image' otherlv_6= 'on' otherlv_7= ':' ( (lv_imagePathOn_8_0= RULE_STRING ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==24) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1150:6: otherlv_5= 'image' otherlv_6= 'on' otherlv_7= ':' ( (lv_imagePathOn_8_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleOverview2275); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getOverviewAccess().getImageKeyword_4_0());
                          
                    }
                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleOverview2287); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getOverviewAccess().getOnKeyword_4_1());
                          
                    }
                    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleOverview2299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getOverviewAccess().getColonKeyword_4_2());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1162:1: ( (lv_imagePathOn_8_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1163:1: (lv_imagePathOn_8_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1163:1: (lv_imagePathOn_8_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1164:3: lv_imagePathOn_8_0= RULE_STRING
                    {
                    lv_imagePathOn_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOverview2316); if (state.failed) return current;
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1180:4: (otherlv_9= 'image' otherlv_10= 'off' otherlv_11= ':' ( (lv_imagePathOff_12_0= RULE_STRING ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==23) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1180:6: otherlv_9= 'image' otherlv_10= 'off' otherlv_11= ':' ( (lv_imagePathOff_12_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleOverview2336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getOverviewAccess().getImageKeyword_5_0());
                          
                    }
                    otherlv_10=(Token)match(input,26,FOLLOW_26_in_ruleOverview2348); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getOverviewAccess().getOffKeyword_5_1());
                          
                    }
                    otherlv_11=(Token)match(input,25,FOLLOW_25_in_ruleOverview2360); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getOverviewAccess().getColonKeyword_5_2());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1192:1: ( (lv_imagePathOff_12_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1193:1: (lv_imagePathOff_12_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1193:1: (lv_imagePathOff_12_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1194:3: lv_imagePathOff_12_0= RULE_STRING
                    {
                    lv_imagePathOff_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOverview2377); if (state.failed) return current;
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

            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleOverview2396); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1224:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1225:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1226:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN2435);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN2446); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1233:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1236:28: ( (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1237:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1237:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1237:6: this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN2486); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1244:1: (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==41) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1245:2: kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    {
            	    kw=(Token)match(input,41,FOLLOW_41_in_ruleFQN2505); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1250:1: ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1250:2: ( RULE_ID )=>this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN2526); if (state.failed) return current;
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
            	    break loop32;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1265:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1266:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1267:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_entryRuleEBoolean2575);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBoolean2586); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1274:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1277:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1278:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1278:1: (kw= 'true' | kw= 'false' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==42) ) {
                alt33=1;
            }
            else if ( (LA33_0==43) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1279:2: kw= 'true'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleEBoolean2624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1286:2: kw= 'false'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleEBoolean2643); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1299:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1300:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1301:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_ruleEInt_in_entryRuleEInt2684);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEInt2695); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1308:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1311:28: (this_INT_0= RULE_INT )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1312:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEInt2734); if (state.failed) return current;
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
    public static final BitSet FOLLOW_12_in_ruleViewpointActivityExplorer143 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpointActivityExplorer164 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleViewpointActivityExplorer176 = new BitSet(new long[]{0x000000020001C000L});
    public static final BitSet FOLLOW_14_in_ruleViewpointActivityExplorer189 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleViewpointActivityExplorer201 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rulePage_in_ruleViewpointActivityExplorer222 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleViewpointActivityExplorer235 = new BitSet(new long[]{0x0000000200018000L});
    public static final BitSet FOLLOW_rulePageExtension_in_ruleViewpointActivityExplorer258 = new BitSet(new long[]{0x0000000200018000L});
    public static final BitSet FOLLOW_ruleSectionExtension_in_ruleViewpointActivityExplorer280 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_15_in_ruleViewpointActivityExplorer293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePage387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage404 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePage421 = new BitSet(new long[]{0x0000000000360000L});
    public static final BitSet FOLLOW_17_in_rulePage434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage451 = new BitSet(new long[]{0x0000000000340000L});
    public static final BitSet FOLLOW_18_in_rulePage471 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePage483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage500 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_rulePage520 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePage541 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePage555 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleEInt_in_rulePage576 = new BitSet(new long[]{0x0000010168408000L});
    public static final BitSet FOLLOW_ruleOverview_in_rulePage597 = new BitSet(new long[]{0x0000000168408000L});
    public static final BitSet FOLLOW_22_in_rulePage611 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePage623 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_rulePage636 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePage648 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePage660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage677 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_rulePage697 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePage709 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePage721 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage738 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePage757 = new BitSet(new long[]{0x0000000168008000L});
    public static final BitSet FOLLOW_27_in_rulePage772 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePage784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage801 = new BitSet(new long[]{0x0000000160008000L});
    public static final BitSet FOLLOW_29_in_rulePage821 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePage833 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rulePage854 = new BitSet(new long[]{0x0000000140008000L});
    public static final BitSet FOLLOW_30_in_rulePage869 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePage881 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePage893 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rulePage914 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_32_in_rulePage929 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePage941 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_ruleSection_in_rulePage962 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_15_in_rulePage975 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePage989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection1025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSection1081 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSection1098 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSection1115 = new BitSet(new long[]{0x0000000000320000L});
    public static final BitSet FOLLOW_17_in_ruleSection1128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSection1145 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleSection1165 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleSection1186 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSection1200 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleEInt_in_ruleSection1221 = new BitSet(new long[]{0x0000001C00008000L});
    public static final BitSet FOLLOW_34_in_ruleSection1234 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSection1246 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleSection1267 = new BitSet(new long[]{0x0000001800008000L});
    public static final BitSet FOLLOW_35_in_ruleSection1282 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSection1294 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleSection1315 = new BitSet(new long[]{0x0000001000008000L});
    public static final BitSet FOLLOW_36_in_ruleSection1330 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSection1342 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleSection1363 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_15_in_ruleSection1376 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSection1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity1426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleActivity1482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity1499 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActivity1516 = new BitSet(new long[]{0x0000000000320000L});
    public static final BitSet FOLLOW_17_in_ruleActivity1529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity1546 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleActivity1566 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActivity1587 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleActivity1601 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleEInt_in_ruleActivity1622 = new BitSet(new long[]{0x0000002020008000L});
    public static final BitSet FOLLOW_29_in_ruleActivity1635 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleActivity1647 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleActivity1668 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_37_in_ruleActivity1683 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleActivity1695 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity1712 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleActivity1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageExtension_in_entryRulePageExtension1767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageExtension1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePageExtension1823 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_rulePageExtension1835 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePageExtension1847 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulePageExtension1859 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePageExtension1871 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePageExtension1892 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_ruleSection_in_rulePageExtension1913 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_15_in_rulePageExtension1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionExtension_in_entryRuleSectionExtension1962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionExtension1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSectionExtension2018 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleSectionExtension2030 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSectionExtension2042 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleSectionExtension2054 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleSectionExtension2066 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleSectionExtension2087 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleSectionExtension2108 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_15_in_ruleSectionExtension2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverview_in_entryRuleOverview2157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverview2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOverview2213 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOverview2225 = new BitSet(new long[]{0x0000000000828000L});
    public static final BitSet FOLLOW_17_in_ruleOverview2238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOverview2255 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_ruleOverview2275 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOverview2287 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOverview2299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOverview2316 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_ruleOverview2336 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOverview2348 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOverview2360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOverview2377 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleOverview2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN2435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN2486 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleFQN2505 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN2526 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean2575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEBoolean2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEBoolean2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEInt2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2734 = new BitSet(new long[]{0x0000000000000002L});

}
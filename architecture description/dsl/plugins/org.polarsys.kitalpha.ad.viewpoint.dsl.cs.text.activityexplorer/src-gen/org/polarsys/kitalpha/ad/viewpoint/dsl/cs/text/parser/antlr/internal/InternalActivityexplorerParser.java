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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'activity-explorer'", "'{'", "'pages'", "'}'", "'page'", "'description'", "'file-extension'", "'id'", "'label'", "'index'", "'header'", "'image-on'", "':'", "'image-off'", "'tab-name'", "'predicated'", "'show-viewer'", "'sections'", "'section'", "'filtering'", "'expanded'", "'activities'", "'activity'", "'icon'", "'page-extensions'", "'extended-page'", "'section-extensions'", "'extended-section'", "'Overview'", "'.'", "'true'", "'false'"
    };
    public static final int T__42=42;
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__41=41;
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
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:76:1: ruleViewpointActivityExplorer returns [EObject current=null] : ( () otherlv_1= 'activity-explorer' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'pages' otherlv_5= '{' ( (lv_ownedPages_6_0= rulePage ) )* otherlv_7= '}' )? ( (lv_ownedPages_8_0= rulePageExtension ) )* ( (lv_ownedSectionExtensions_9_0= ruleSectionExtension ) )* otherlv_10= '}' ) ;
    public final EObject ruleViewpointActivityExplorer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedPages_6_0 = null;

        EObject lv_ownedPages_8_0 = null;

        EObject lv_ownedSectionExtensions_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:79:28: ( ( () otherlv_1= 'activity-explorer' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'pages' otherlv_5= '{' ( (lv_ownedPages_6_0= rulePage ) )* otherlv_7= '}' )? ( (lv_ownedPages_8_0= rulePageExtension ) )* ( (lv_ownedSectionExtensions_9_0= ruleSectionExtension ) )* otherlv_10= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:80:1: ( () otherlv_1= 'activity-explorer' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'pages' otherlv_5= '{' ( (lv_ownedPages_6_0= rulePage ) )* otherlv_7= '}' )? ( (lv_ownedPages_8_0= rulePageExtension ) )* ( (lv_ownedSectionExtensions_9_0= ruleSectionExtension ) )* otherlv_10= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:80:1: ( () otherlv_1= 'activity-explorer' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'pages' otherlv_5= '{' ( (lv_ownedPages_6_0= rulePage ) )* otherlv_7= '}' )? ( (lv_ownedPages_8_0= rulePageExtension ) )* ( (lv_ownedSectionExtensions_9_0= ruleSectionExtension ) )* otherlv_10= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:80:2: () otherlv_1= 'activity-explorer' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'pages' otherlv_5= '{' ( (lv_ownedPages_6_0= rulePage ) )* otherlv_7= '}' )? ( (lv_ownedPages_8_0= rulePageExtension ) )* ( (lv_ownedSectionExtensions_9_0= ruleSectionExtension ) )* otherlv_10= '}'
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

                  	newLeafNode(otherlv_1, grammarAccess.getViewpointActivityExplorerAccess().getActivityExplorerKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:90:1: ( (lv_name_2_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:91:1: (lv_name_2_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:91:1: (lv_name_2_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:92:3: lv_name_2_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getViewpointActivityExplorerAccess().getNameFQNParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleViewpointActivityExplorer152);
            lv_name_2_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getViewpointActivityExplorerRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"FQN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleViewpointActivityExplorer164); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getViewpointActivityExplorerAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:112:1: (otherlv_4= 'pages' otherlv_5= '{' ( (lv_ownedPages_6_0= rulePage ) )* otherlv_7= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:112:3: otherlv_4= 'pages' otherlv_5= '{' ( (lv_ownedPages_6_0= rulePage ) )* otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleViewpointActivityExplorer177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getViewpointActivityExplorerAccess().getPagesKeyword_4_0());
                          
                    }
                    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleViewpointActivityExplorer189); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getViewpointActivityExplorerAccess().getLeftCurlyBracketKeyword_4_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:120:1: ( (lv_ownedPages_6_0= rulePage ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:121:1: (lv_ownedPages_6_0= rulePage )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:121:1: (lv_ownedPages_6_0= rulePage )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:122:3: lv_ownedPages_6_0= rulePage
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesPageParserRuleCall_4_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePage_in_ruleViewpointActivityExplorer210);
                    	    lv_ownedPages_6_0=rulePage();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getViewpointActivityExplorerRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedPages",
                    	              		lv_ownedPages_6_0, 
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

                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleViewpointActivityExplorer223); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getViewpointActivityExplorerAccess().getRightCurlyBracketKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:142:3: ( (lv_ownedPages_8_0= rulePageExtension ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==35) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:143:1: (lv_ownedPages_8_0= rulePageExtension )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:143:1: (lv_ownedPages_8_0= rulePageExtension )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:144:3: lv_ownedPages_8_0= rulePageExtension
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesPageExtensionParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePageExtension_in_ruleViewpointActivityExplorer246);
            	    lv_ownedPages_8_0=rulePageExtension();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getViewpointActivityExplorerRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedPages",
            	              		lv_ownedPages_8_0, 
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:160:3: ( (lv_ownedSectionExtensions_9_0= ruleSectionExtension ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==37) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:161:1: (lv_ownedSectionExtensions_9_0= ruleSectionExtension )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:161:1: (lv_ownedSectionExtensions_9_0= ruleSectionExtension )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:162:3: lv_ownedSectionExtensions_9_0= ruleSectionExtension
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getViewpointActivityExplorerAccess().getOwnedSectionExtensionsSectionExtensionParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSectionExtension_in_ruleViewpointActivityExplorer268);
            	    lv_ownedSectionExtensions_9_0=ruleSectionExtension();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getViewpointActivityExplorerRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedSectionExtensions",
            	              		lv_ownedSectionExtensions_9_0, 
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

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleViewpointActivityExplorer281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getViewpointActivityExplorerAccess().getRightCurlyBracketKeyword_7());
                  
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:192:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:193:2: (iv_rulePage= rulePage EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:194:2: iv_rulePage= rulePage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPageRule()); 
            }
            pushFollow(FOLLOW_rulePage_in_entryRulePage319);
            iv_rulePage=rulePage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePage329); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:201:1: rulePage returns [EObject current=null] : ( () otherlv_1= 'page' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'file-extension' ( (lv_fileExtensions_7_0= RULE_STRING ) ) )? (otherlv_8= 'id' ( (lv_activityExplorerItemID_9_0= ruleFQN ) ) )? (otherlv_10= 'label' ( (lv_label_11_0= RULE_STRING ) ) )? otherlv_12= 'index' ( (lv_index_13_0= ruleEInt ) ) ( (lv_ownedOverview_14_0= ruleOverview ) )? (otherlv_15= 'header' otherlv_16= '{' (otherlv_17= 'image-on' otherlv_18= ':' ( (lv_imagePathOn_19_0= RULE_STRING ) ) )? (otherlv_20= 'image-off' otherlv_21= ':' ( (lv_imagePathOff_22_0= RULE_STRING ) ) )? otherlv_23= '}' )? (otherlv_24= 'tab-name' ( (lv_tabName_25_0= RULE_STRING ) ) )? (otherlv_26= 'predicated' otherlv_27= ':' ( (lv_hasPredicate_28_0= ruleEBoolean ) ) )? (otherlv_29= 'show-viewer' otherlv_30= ':' ( (lv_showViewer_31_0= ruleEBoolean ) ) )? (otherlv_32= 'sections' otherlv_33= '{' ( (lv_ownedSections_34_0= ruleSection ) )* otherlv_35= '}' )? otherlv_36= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token lv_fileExtensions_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_label_11_0=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_imagePathOn_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_imagePathOff_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_tabName_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        AntlrDatatypeRuleToken lv_activityExplorerItemID_9_0 = null;

        AntlrDatatypeRuleToken lv_index_13_0 = null;

        EObject lv_ownedOverview_14_0 = null;

        AntlrDatatypeRuleToken lv_hasPredicate_28_0 = null;

        AntlrDatatypeRuleToken lv_showViewer_31_0 = null;

        EObject lv_ownedSections_34_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:204:28: ( ( () otherlv_1= 'page' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'file-extension' ( (lv_fileExtensions_7_0= RULE_STRING ) ) )? (otherlv_8= 'id' ( (lv_activityExplorerItemID_9_0= ruleFQN ) ) )? (otherlv_10= 'label' ( (lv_label_11_0= RULE_STRING ) ) )? otherlv_12= 'index' ( (lv_index_13_0= ruleEInt ) ) ( (lv_ownedOverview_14_0= ruleOverview ) )? (otherlv_15= 'header' otherlv_16= '{' (otherlv_17= 'image-on' otherlv_18= ':' ( (lv_imagePathOn_19_0= RULE_STRING ) ) )? (otherlv_20= 'image-off' otherlv_21= ':' ( (lv_imagePathOff_22_0= RULE_STRING ) ) )? otherlv_23= '}' )? (otherlv_24= 'tab-name' ( (lv_tabName_25_0= RULE_STRING ) ) )? (otherlv_26= 'predicated' otherlv_27= ':' ( (lv_hasPredicate_28_0= ruleEBoolean ) ) )? (otherlv_29= 'show-viewer' otherlv_30= ':' ( (lv_showViewer_31_0= ruleEBoolean ) ) )? (otherlv_32= 'sections' otherlv_33= '{' ( (lv_ownedSections_34_0= ruleSection ) )* otherlv_35= '}' )? otherlv_36= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:205:1: ( () otherlv_1= 'page' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'file-extension' ( (lv_fileExtensions_7_0= RULE_STRING ) ) )? (otherlv_8= 'id' ( (lv_activityExplorerItemID_9_0= ruleFQN ) ) )? (otherlv_10= 'label' ( (lv_label_11_0= RULE_STRING ) ) )? otherlv_12= 'index' ( (lv_index_13_0= ruleEInt ) ) ( (lv_ownedOverview_14_0= ruleOverview ) )? (otherlv_15= 'header' otherlv_16= '{' (otherlv_17= 'image-on' otherlv_18= ':' ( (lv_imagePathOn_19_0= RULE_STRING ) ) )? (otherlv_20= 'image-off' otherlv_21= ':' ( (lv_imagePathOff_22_0= RULE_STRING ) ) )? otherlv_23= '}' )? (otherlv_24= 'tab-name' ( (lv_tabName_25_0= RULE_STRING ) ) )? (otherlv_26= 'predicated' otherlv_27= ':' ( (lv_hasPredicate_28_0= ruleEBoolean ) ) )? (otherlv_29= 'show-viewer' otherlv_30= ':' ( (lv_showViewer_31_0= ruleEBoolean ) ) )? (otherlv_32= 'sections' otherlv_33= '{' ( (lv_ownedSections_34_0= ruleSection ) )* otherlv_35= '}' )? otherlv_36= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:205:1: ( () otherlv_1= 'page' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'file-extension' ( (lv_fileExtensions_7_0= RULE_STRING ) ) )? (otherlv_8= 'id' ( (lv_activityExplorerItemID_9_0= ruleFQN ) ) )? (otherlv_10= 'label' ( (lv_label_11_0= RULE_STRING ) ) )? otherlv_12= 'index' ( (lv_index_13_0= ruleEInt ) ) ( (lv_ownedOverview_14_0= ruleOverview ) )? (otherlv_15= 'header' otherlv_16= '{' (otherlv_17= 'image-on' otherlv_18= ':' ( (lv_imagePathOn_19_0= RULE_STRING ) ) )? (otherlv_20= 'image-off' otherlv_21= ':' ( (lv_imagePathOff_22_0= RULE_STRING ) ) )? otherlv_23= '}' )? (otherlv_24= 'tab-name' ( (lv_tabName_25_0= RULE_STRING ) ) )? (otherlv_26= 'predicated' otherlv_27= ':' ( (lv_hasPredicate_28_0= ruleEBoolean ) ) )? (otherlv_29= 'show-viewer' otherlv_30= ':' ( (lv_showViewer_31_0= ruleEBoolean ) ) )? (otherlv_32= 'sections' otherlv_33= '{' ( (lv_ownedSections_34_0= ruleSection ) )* otherlv_35= '}' )? otherlv_36= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:205:2: () otherlv_1= 'page' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'file-extension' ( (lv_fileExtensions_7_0= RULE_STRING ) ) )? (otherlv_8= 'id' ( (lv_activityExplorerItemID_9_0= ruleFQN ) ) )? (otherlv_10= 'label' ( (lv_label_11_0= RULE_STRING ) ) )? otherlv_12= 'index' ( (lv_index_13_0= ruleEInt ) ) ( (lv_ownedOverview_14_0= ruleOverview ) )? (otherlv_15= 'header' otherlv_16= '{' (otherlv_17= 'image-on' otherlv_18= ':' ( (lv_imagePathOn_19_0= RULE_STRING ) ) )? (otherlv_20= 'image-off' otherlv_21= ':' ( (lv_imagePathOff_22_0= RULE_STRING ) ) )? otherlv_23= '}' )? (otherlv_24= 'tab-name' ( (lv_tabName_25_0= RULE_STRING ) ) )? (otherlv_26= 'predicated' otherlv_27= ':' ( (lv_hasPredicate_28_0= ruleEBoolean ) ) )? (otherlv_29= 'show-viewer' otherlv_30= ':' ( (lv_showViewer_31_0= ruleEBoolean ) ) )? (otherlv_32= 'sections' otherlv_33= '{' ( (lv_ownedSections_34_0= ruleSection ) )* otherlv_35= '}' )? otherlv_36= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:205:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:206:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPageAccess().getPageAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_rulePage375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPageAccess().getPageKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:215:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:216:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:216:1: (lv_name_2_0= RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:217:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage392); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_rulePage409); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:237:1: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:237:3: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_rulePage422); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPageAccess().getDescriptionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:241:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:242:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:242:1: (lv_description_5_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:243:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage439); if (state.failed) return current;
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:259:4: (otherlv_6= 'file-extension' ( (lv_fileExtensions_7_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:259:6: otherlv_6= 'file-extension' ( (lv_fileExtensions_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_rulePage459); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getPageAccess().getFileExtensionKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:263:1: ( (lv_fileExtensions_7_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:264:1: (lv_fileExtensions_7_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:264:1: (lv_fileExtensions_7_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:265:3: lv_fileExtensions_7_0= RULE_STRING
                    {
                    lv_fileExtensions_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage476); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_fileExtensions_7_0, grammarAccess.getPageAccess().getFileExtensionsSTRINGTerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPageRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"fileExtensions",
                              		lv_fileExtensions_7_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:281:4: (otherlv_8= 'id' ( (lv_activityExplorerItemID_9_0= ruleFQN ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:281:6: otherlv_8= 'id' ( (lv_activityExplorerItemID_9_0= ruleFQN ) )
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_18_in_rulePage496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getPageAccess().getIdKeyword_6_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:285:1: ( (lv_activityExplorerItemID_9_0= ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:286:1: (lv_activityExplorerItemID_9_0= ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:286:1: (lv_activityExplorerItemID_9_0= ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:287:3: lv_activityExplorerItemID_9_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPageAccess().getActivityExplorerItemIDFQNParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_rulePage517);
                    lv_activityExplorerItemID_9_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPageRule());
                      	        }
                             		set(
                             			current, 
                             			"activityExplorerItemID",
                              		lv_activityExplorerItemID_9_0, 
                              		"FQN");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:303:4: (otherlv_10= 'label' ( (lv_label_11_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:303:6: otherlv_10= 'label' ( (lv_label_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_19_in_rulePage532); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getPageAccess().getLabelKeyword_7_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:307:1: ( (lv_label_11_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:308:1: (lv_label_11_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:308:1: (lv_label_11_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:309:3: lv_label_11_0= RULE_STRING
                    {
                    lv_label_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage549); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_11_0, grammarAccess.getPageAccess().getLabelSTRINGTerminalRuleCall_7_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPageRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"label",
                              		lv_label_11_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,20,FOLLOW_20_in_rulePage568); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getPageAccess().getIndexKeyword_8());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:329:1: ( (lv_index_13_0= ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:330:1: (lv_index_13_0= ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:330:1: (lv_index_13_0= ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:331:3: lv_index_13_0= ruleEInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPageAccess().getIndexEIntParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEInt_in_rulePage589);
            lv_index_13_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPageRule());
              	        }
                     		set(
                     			current, 
                     			"index",
                      		lv_index_13_0, 
                      		"EInt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:347:2: ( (lv_ownedOverview_14_0= ruleOverview ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==39) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:348:1: (lv_ownedOverview_14_0= ruleOverview )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:348:1: (lv_ownedOverview_14_0= ruleOverview )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:349:3: lv_ownedOverview_14_0= ruleOverview
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPageAccess().getOwnedOverviewOverviewParserRuleCall_10_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOverview_in_rulePage610);
                    lv_ownedOverview_14_0=ruleOverview();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPageRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedOverview",
                              		lv_ownedOverview_14_0, 
                              		"Overview");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:365:3: (otherlv_15= 'header' otherlv_16= '{' (otherlv_17= 'image-on' otherlv_18= ':' ( (lv_imagePathOn_19_0= RULE_STRING ) ) )? (otherlv_20= 'image-off' otherlv_21= ':' ( (lv_imagePathOff_22_0= RULE_STRING ) ) )? otherlv_23= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:365:5: otherlv_15= 'header' otherlv_16= '{' (otherlv_17= 'image-on' otherlv_18= ':' ( (lv_imagePathOn_19_0= RULE_STRING ) ) )? (otherlv_20= 'image-off' otherlv_21= ':' ( (lv_imagePathOff_22_0= RULE_STRING ) ) )? otherlv_23= '}'
                    {
                    otherlv_15=(Token)match(input,21,FOLLOW_21_in_rulePage624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getPageAccess().getHeaderKeyword_11_0());
                          
                    }
                    otherlv_16=(Token)match(input,12,FOLLOW_12_in_rulePage636); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_11_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:373:1: (otherlv_17= 'image-on' otherlv_18= ':' ( (lv_imagePathOn_19_0= RULE_STRING ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==22) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:373:3: otherlv_17= 'image-on' otherlv_18= ':' ( (lv_imagePathOn_19_0= RULE_STRING ) )
                            {
                            otherlv_17=(Token)match(input,22,FOLLOW_22_in_rulePage649); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_17, grammarAccess.getPageAccess().getImageOnKeyword_11_2_0());
                                  
                            }
                            otherlv_18=(Token)match(input,23,FOLLOW_23_in_rulePage661); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_18, grammarAccess.getPageAccess().getColonKeyword_11_2_1());
                                  
                            }
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:381:1: ( (lv_imagePathOn_19_0= RULE_STRING ) )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:382:1: (lv_imagePathOn_19_0= RULE_STRING )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:382:1: (lv_imagePathOn_19_0= RULE_STRING )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:383:3: lv_imagePathOn_19_0= RULE_STRING
                            {
                            lv_imagePathOn_19_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage678); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_imagePathOn_19_0, grammarAccess.getPageAccess().getImagePathOnSTRINGTerminalRuleCall_11_2_2_0()); 
                              		
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

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:399:4: (otherlv_20= 'image-off' otherlv_21= ':' ( (lv_imagePathOff_22_0= RULE_STRING ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==24) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:399:6: otherlv_20= 'image-off' otherlv_21= ':' ( (lv_imagePathOff_22_0= RULE_STRING ) )
                            {
                            otherlv_20=(Token)match(input,24,FOLLOW_24_in_rulePage698); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_20, grammarAccess.getPageAccess().getImageOffKeyword_11_3_0());
                                  
                            }
                            otherlv_21=(Token)match(input,23,FOLLOW_23_in_rulePage710); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_21, grammarAccess.getPageAccess().getColonKeyword_11_3_1());
                                  
                            }
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:407:1: ( (lv_imagePathOff_22_0= RULE_STRING ) )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:408:1: (lv_imagePathOff_22_0= RULE_STRING )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:408:1: (lv_imagePathOff_22_0= RULE_STRING )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:409:3: lv_imagePathOff_22_0= RULE_STRING
                            {
                            lv_imagePathOff_22_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage727); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_imagePathOff_22_0, grammarAccess.getPageAccess().getImagePathOffSTRINGTerminalRuleCall_11_3_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPageRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"imagePathOff",
                                      		lv_imagePathOff_22_0, 
                                      		"STRING");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_23=(Token)match(input,14,FOLLOW_14_in_rulePage746); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_11_4());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:429:3: (otherlv_24= 'tab-name' ( (lv_tabName_25_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:429:5: otherlv_24= 'tab-name' ( (lv_tabName_25_0= RULE_STRING ) )
                    {
                    otherlv_24=(Token)match(input,25,FOLLOW_25_in_rulePage761); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getPageAccess().getTabNameKeyword_12_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:433:1: ( (lv_tabName_25_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:434:1: (lv_tabName_25_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:434:1: (lv_tabName_25_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:435:3: lv_tabName_25_0= RULE_STRING
                    {
                    lv_tabName_25_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage778); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_tabName_25_0, grammarAccess.getPageAccess().getTabNameSTRINGTerminalRuleCall_12_1_0()); 
                      		
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:451:4: (otherlv_26= 'predicated' otherlv_27= ':' ( (lv_hasPredicate_28_0= ruleEBoolean ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:451:6: otherlv_26= 'predicated' otherlv_27= ':' ( (lv_hasPredicate_28_0= ruleEBoolean ) )
                    {
                    otherlv_26=(Token)match(input,26,FOLLOW_26_in_rulePage798); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getPageAccess().getPredicatedKeyword_13_0());
                          
                    }
                    otherlv_27=(Token)match(input,23,FOLLOW_23_in_rulePage810); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getPageAccess().getColonKeyword_13_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:459:1: ( (lv_hasPredicate_28_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:460:1: (lv_hasPredicate_28_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:460:1: (lv_hasPredicate_28_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:461:3: lv_hasPredicate_28_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPageAccess().getHasPredicateEBooleanParserRuleCall_13_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_rulePage831);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:477:4: (otherlv_29= 'show-viewer' otherlv_30= ':' ( (lv_showViewer_31_0= ruleEBoolean ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:477:6: otherlv_29= 'show-viewer' otherlv_30= ':' ( (lv_showViewer_31_0= ruleEBoolean ) )
                    {
                    otherlv_29=(Token)match(input,27,FOLLOW_27_in_rulePage846); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getPageAccess().getShowViewerKeyword_14_0());
                          
                    }
                    otherlv_30=(Token)match(input,23,FOLLOW_23_in_rulePage858); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getPageAccess().getColonKeyword_14_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:485:1: ( (lv_showViewer_31_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:486:1: (lv_showViewer_31_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:486:1: (lv_showViewer_31_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:487:3: lv_showViewer_31_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPageAccess().getShowViewerEBooleanParserRuleCall_14_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_rulePage879);
                    lv_showViewer_31_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPageRule());
                      	        }
                             		set(
                             			current, 
                             			"showViewer",
                              		lv_showViewer_31_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:503:4: (otherlv_32= 'sections' otherlv_33= '{' ( (lv_ownedSections_34_0= ruleSection ) )* otherlv_35= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:503:6: otherlv_32= 'sections' otherlv_33= '{' ( (lv_ownedSections_34_0= ruleSection ) )* otherlv_35= '}'
                    {
                    otherlv_32=(Token)match(input,28,FOLLOW_28_in_rulePage894); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getPageAccess().getSectionsKeyword_15_0());
                          
                    }
                    otherlv_33=(Token)match(input,12,FOLLOW_12_in_rulePage906); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_33, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_15_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:511:1: ( (lv_ownedSections_34_0= ruleSection ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==29) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:512:1: (lv_ownedSections_34_0= ruleSection )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:512:1: (lv_ownedSections_34_0= ruleSection )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:513:3: lv_ownedSections_34_0= ruleSection
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPageAccess().getOwnedSectionsSectionParserRuleCall_15_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSection_in_rulePage927);
                    	    lv_ownedSections_34_0=ruleSection();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPageRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedSections",
                    	              		lv_ownedSections_34_0, 
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

                    otherlv_35=(Token)match(input,14,FOLLOW_14_in_rulePage940); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_15_3());
                          
                    }

                    }
                    break;

            }

            otherlv_36=(Token)match(input,14,FOLLOW_14_in_rulePage954); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_36, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_16());
                  
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:545:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:546:2: (iv_ruleSection= ruleSection EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:547:2: iv_ruleSection= ruleSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSectionRule()); 
            }
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection990);
            iv_ruleSection=ruleSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection1000); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:554:1: ruleSection returns [EObject current=null] : ( () otherlv_1= 'section' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )? otherlv_10= 'index' ( (lv_index_11_0= ruleEInt ) ) (otherlv_12= 'filtering' otherlv_13= ':' ( (lv_filtering_14_0= ruleEBoolean ) ) )? (otherlv_15= 'expanded' otherlv_16= ':' ( (lv_expanded_17_0= ruleEBoolean ) ) )? (otherlv_18= 'activities' otherlv_19= '{' ( (lv_ownedActivities_20_0= ruleActivity ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:557:28: ( ( () otherlv_1= 'section' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )? otherlv_10= 'index' ( (lv_index_11_0= ruleEInt ) ) (otherlv_12= 'filtering' otherlv_13= ':' ( (lv_filtering_14_0= ruleEBoolean ) ) )? (otherlv_15= 'expanded' otherlv_16= ':' ( (lv_expanded_17_0= ruleEBoolean ) ) )? (otherlv_18= 'activities' otherlv_19= '{' ( (lv_ownedActivities_20_0= ruleActivity ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:558:1: ( () otherlv_1= 'section' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )? otherlv_10= 'index' ( (lv_index_11_0= ruleEInt ) ) (otherlv_12= 'filtering' otherlv_13= ':' ( (lv_filtering_14_0= ruleEBoolean ) ) )? (otherlv_15= 'expanded' otherlv_16= ':' ( (lv_expanded_17_0= ruleEBoolean ) ) )? (otherlv_18= 'activities' otherlv_19= '{' ( (lv_ownedActivities_20_0= ruleActivity ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:558:1: ( () otherlv_1= 'section' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )? otherlv_10= 'index' ( (lv_index_11_0= ruleEInt ) ) (otherlv_12= 'filtering' otherlv_13= ':' ( (lv_filtering_14_0= ruleEBoolean ) ) )? (otherlv_15= 'expanded' otherlv_16= ':' ( (lv_expanded_17_0= ruleEBoolean ) ) )? (otherlv_18= 'activities' otherlv_19= '{' ( (lv_ownedActivities_20_0= ruleActivity ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:558:2: () otherlv_1= 'section' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )? otherlv_10= 'index' ( (lv_index_11_0= ruleEInt ) ) (otherlv_12= 'filtering' otherlv_13= ':' ( (lv_filtering_14_0= ruleEBoolean ) ) )? (otherlv_15= 'expanded' otherlv_16= ':' ( (lv_expanded_17_0= ruleEBoolean ) ) )? (otherlv_18= 'activities' otherlv_19= '{' ( (lv_ownedActivities_20_0= ruleActivity ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:558:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:559:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSectionAccess().getSectionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleSection1046); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getSectionKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:568:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:569:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:569:1: (lv_name_2_0= RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:570:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection1063); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleSection1080); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:590:1: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:590:3: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleSection1093); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getDescriptionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:594:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:595:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:595:1: (lv_description_5_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:596:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSection1110); if (state.failed) return current;
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:612:4: (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==18) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:612:6: otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleSection1130); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSectionAccess().getIdKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:616:1: ( (lv_activityExplorerItemID_7_0= ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:617:1: (lv_activityExplorerItemID_7_0= ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:617:1: (lv_activityExplorerItemID_7_0= ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:618:3: lv_activityExplorerItemID_7_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSectionAccess().getActivityExplorerItemIDFQNParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleSection1151);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:634:4: (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:634:6: otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleSection1166); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSectionAccess().getLabelKeyword_6_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:638:1: ( (lv_label_9_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:639:1: (lv_label_9_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:639:1: (lv_label_9_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:640:3: lv_label_9_0= RULE_STRING
                    {
                    lv_label_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSection1183); if (state.failed) return current;
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

            otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleSection1202); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getSectionAccess().getIndexKeyword_7());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:660:1: ( (lv_index_11_0= ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:661:1: (lv_index_11_0= ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:661:1: (lv_index_11_0= ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:662:3: lv_index_11_0= ruleEInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSectionAccess().getIndexEIntParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEInt_in_ruleSection1223);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:678:2: (otherlv_12= 'filtering' otherlv_13= ':' ( (lv_filtering_14_0= ruleEBoolean ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:678:4: otherlv_12= 'filtering' otherlv_13= ':' ( (lv_filtering_14_0= ruleEBoolean ) )
                    {
                    otherlv_12=(Token)match(input,30,FOLLOW_30_in_ruleSection1236); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSectionAccess().getFilteringKeyword_9_0());
                          
                    }
                    otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleSection1248); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getSectionAccess().getColonKeyword_9_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:686:1: ( (lv_filtering_14_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:687:1: (lv_filtering_14_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:687:1: (lv_filtering_14_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:688:3: lv_filtering_14_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSectionAccess().getFilteringEBooleanParserRuleCall_9_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleSection1269);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:704:4: (otherlv_15= 'expanded' otherlv_16= ':' ( (lv_expanded_17_0= ruleEBoolean ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:704:6: otherlv_15= 'expanded' otherlv_16= ':' ( (lv_expanded_17_0= ruleEBoolean ) )
                    {
                    otherlv_15=(Token)match(input,31,FOLLOW_31_in_ruleSection1284); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getSectionAccess().getExpandedKeyword_10_0());
                          
                    }
                    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleSection1296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getSectionAccess().getColonKeyword_10_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:712:1: ( (lv_expanded_17_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:713:1: (lv_expanded_17_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:713:1: (lv_expanded_17_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:714:3: lv_expanded_17_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSectionAccess().getExpandedEBooleanParserRuleCall_10_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleSection1317);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:730:4: (otherlv_18= 'activities' otherlv_19= '{' ( (lv_ownedActivities_20_0= ruleActivity ) )* otherlv_21= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:730:6: otherlv_18= 'activities' otherlv_19= '{' ( (lv_ownedActivities_20_0= ruleActivity ) )* otherlv_21= '}'
                    {
                    otherlv_18=(Token)match(input,32,FOLLOW_32_in_ruleSection1332); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getSectionAccess().getActivitiesKeyword_11_0());
                          
                    }
                    otherlv_19=(Token)match(input,12,FOLLOW_12_in_ruleSection1344); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_11_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:738:1: ( (lv_ownedActivities_20_0= ruleActivity ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==33) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:739:1: (lv_ownedActivities_20_0= ruleActivity )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:739:1: (lv_ownedActivities_20_0= ruleActivity )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:740:3: lv_ownedActivities_20_0= ruleActivity
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSectionAccess().getOwnedActivitiesActivityParserRuleCall_11_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleActivity_in_ruleSection1365);
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

                    otherlv_21=(Token)match(input,14,FOLLOW_14_in_ruleSection1378); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_11_3());
                          
                    }

                    }
                    break;

            }

            otherlv_22=(Token)match(input,14,FOLLOW_14_in_ruleSection1392); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:772:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:773:2: (iv_ruleActivity= ruleActivity EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:774:2: iv_ruleActivity= ruleActivity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActivityRule()); 
            }
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity1428);
            iv_ruleActivity=ruleActivity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActivity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity1438); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:781:1: ruleActivity returns [EObject current=null] : ( () otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )? otherlv_10= 'index' ( (lv_index_11_0= ruleEInt ) ) (otherlv_12= 'predicated' otherlv_13= ':' ( (lv_hasPredicate_14_0= ruleEBoolean ) ) )? (otherlv_15= 'icon' otherlv_16= ':' ( (lv_imagePathOff_17_0= RULE_STRING ) ) )? otherlv_18= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:784:28: ( ( () otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )? otherlv_10= 'index' ( (lv_index_11_0= ruleEInt ) ) (otherlv_12= 'predicated' otherlv_13= ':' ( (lv_hasPredicate_14_0= ruleEBoolean ) ) )? (otherlv_15= 'icon' otherlv_16= ':' ( (lv_imagePathOff_17_0= RULE_STRING ) ) )? otherlv_18= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:785:1: ( () otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )? otherlv_10= 'index' ( (lv_index_11_0= ruleEInt ) ) (otherlv_12= 'predicated' otherlv_13= ':' ( (lv_hasPredicate_14_0= ruleEBoolean ) ) )? (otherlv_15= 'icon' otherlv_16= ':' ( (lv_imagePathOff_17_0= RULE_STRING ) ) )? otherlv_18= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:785:1: ( () otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )? otherlv_10= 'index' ( (lv_index_11_0= ruleEInt ) ) (otherlv_12= 'predicated' otherlv_13= ':' ( (lv_hasPredicate_14_0= ruleEBoolean ) ) )? (otherlv_15= 'icon' otherlv_16= ':' ( (lv_imagePathOff_17_0= RULE_STRING ) ) )? otherlv_18= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:785:2: () otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )? otherlv_10= 'index' ( (lv_index_11_0= ruleEInt ) ) (otherlv_12= 'predicated' otherlv_13= ':' ( (lv_hasPredicate_14_0= ruleEBoolean ) ) )? (otherlv_15= 'icon' otherlv_16= ':' ( (lv_imagePathOff_17_0= RULE_STRING ) ) )? otherlv_18= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:785:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:786:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActivityAccess().getActivityAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleActivity1484); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getActivityKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:795:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:796:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:796:1: (lv_name_2_0= RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:797:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity1501); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleActivity1518); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:817:1: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==16) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:817:3: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleActivity1531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getDescriptionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:821:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:822:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:822:1: (lv_description_5_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:823:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity1548); if (state.failed) return current;
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:839:4: (otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==18) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:839:6: otherlv_6= 'id' ( (lv_activityExplorerItemID_7_0= ruleFQN ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleActivity1568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getActivityAccess().getIdKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:843:1: ( (lv_activityExplorerItemID_7_0= ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:844:1: (lv_activityExplorerItemID_7_0= ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:844:1: (lv_activityExplorerItemID_7_0= ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:845:3: lv_activityExplorerItemID_7_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getActivityAccess().getActivityExplorerItemIDFQNParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleActivity1589);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:861:4: (otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==19) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:861:6: otherlv_8= 'label' ( (lv_label_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleActivity1604); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getActivityAccess().getLabelKeyword_6_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:865:1: ( (lv_label_9_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:866:1: (lv_label_9_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:866:1: (lv_label_9_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:867:3: lv_label_9_0= RULE_STRING
                    {
                    lv_label_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity1621); if (state.failed) return current;
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

            otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleActivity1640); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getActivityAccess().getIndexKeyword_7());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:887:1: ( (lv_index_11_0= ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:888:1: (lv_index_11_0= ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:888:1: (lv_index_11_0= ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:889:3: lv_index_11_0= ruleEInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActivityAccess().getIndexEIntParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEInt_in_ruleActivity1661);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:905:2: (otherlv_12= 'predicated' otherlv_13= ':' ( (lv_hasPredicate_14_0= ruleEBoolean ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==26) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:905:4: otherlv_12= 'predicated' otherlv_13= ':' ( (lv_hasPredicate_14_0= ruleEBoolean ) )
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_26_in_ruleActivity1674); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getActivityAccess().getPredicatedKeyword_9_0());
                          
                    }
                    otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleActivity1686); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getActivityAccess().getColonKeyword_9_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:913:1: ( (lv_hasPredicate_14_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:914:1: (lv_hasPredicate_14_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:914:1: (lv_hasPredicate_14_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:915:3: lv_hasPredicate_14_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getActivityAccess().getHasPredicateEBooleanParserRuleCall_9_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleActivity1707);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:931:4: (otherlv_15= 'icon' otherlv_16= ':' ( (lv_imagePathOff_17_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:931:6: otherlv_15= 'icon' otherlv_16= ':' ( (lv_imagePathOff_17_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,34,FOLLOW_34_in_ruleActivity1722); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getActivityAccess().getIconKeyword_10_0());
                          
                    }
                    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleActivity1734); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getActivityAccess().getColonKeyword_10_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:939:1: ( (lv_imagePathOff_17_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:940:1: (lv_imagePathOff_17_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:940:1: (lv_imagePathOff_17_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:941:3: lv_imagePathOff_17_0= RULE_STRING
                    {
                    lv_imagePathOff_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity1751); if (state.failed) return current;
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

            otherlv_18=(Token)match(input,14,FOLLOW_14_in_ruleActivity1770); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:969:1: entryRulePageExtension returns [EObject current=null] : iv_rulePageExtension= rulePageExtension EOF ;
    public final EObject entryRulePageExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageExtension = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:970:2: (iv_rulePageExtension= rulePageExtension EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:971:2: iv_rulePageExtension= rulePageExtension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPageExtensionRule()); 
            }
            pushFollow(FOLLOW_rulePageExtension_in_entryRulePageExtension1806);
            iv_rulePageExtension=rulePageExtension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePageExtension; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePageExtension1816); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:978:1: rulePageExtension returns [EObject current=null] : ( () otherlv_1= 'page-extensions' otherlv_2= '{' otherlv_3= 'extended-page' ( (lv_extendedPageID_4_0= ruleFQN ) ) ( (lv_ownedSections_5_0= ruleSection ) )* otherlv_6= '}' ) ;
    public final EObject rulePageExtension() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_extendedPageID_4_0 = null;

        EObject lv_ownedSections_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:981:28: ( ( () otherlv_1= 'page-extensions' otherlv_2= '{' otherlv_3= 'extended-page' ( (lv_extendedPageID_4_0= ruleFQN ) ) ( (lv_ownedSections_5_0= ruleSection ) )* otherlv_6= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:982:1: ( () otherlv_1= 'page-extensions' otherlv_2= '{' otherlv_3= 'extended-page' ( (lv_extendedPageID_4_0= ruleFQN ) ) ( (lv_ownedSections_5_0= ruleSection ) )* otherlv_6= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:982:1: ( () otherlv_1= 'page-extensions' otherlv_2= '{' otherlv_3= 'extended-page' ( (lv_extendedPageID_4_0= ruleFQN ) ) ( (lv_ownedSections_5_0= ruleSection ) )* otherlv_6= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:982:2: () otherlv_1= 'page-extensions' otherlv_2= '{' otherlv_3= 'extended-page' ( (lv_extendedPageID_4_0= ruleFQN ) ) ( (lv_ownedSections_5_0= ruleSection ) )* otherlv_6= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:982:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:983:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPageExtensionAccess().getPageExtensionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_rulePageExtension1862); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPageExtensionAccess().getPageExtensionsKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePageExtension1874); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPageExtensionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,36,FOLLOW_36_in_rulePageExtension1886); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPageExtensionAccess().getExtendedPageKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1000:1: ( (lv_extendedPageID_4_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1001:1: (lv_extendedPageID_4_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1001:1: (lv_extendedPageID_4_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1002:3: lv_extendedPageID_4_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPageExtensionAccess().getExtendedPageIDFQNParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_rulePageExtension1907);
            lv_extendedPageID_4_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPageExtensionRule());
              	        }
                     		set(
                     			current, 
                     			"extendedPageID",
                      		lv_extendedPageID_4_0, 
                      		"FQN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1018:2: ( (lv_ownedSections_5_0= ruleSection ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==29) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1019:1: (lv_ownedSections_5_0= ruleSection )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1019:1: (lv_ownedSections_5_0= ruleSection )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1020:3: lv_ownedSections_5_0= ruleSection
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPageExtensionAccess().getOwnedSectionsSectionParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSection_in_rulePageExtension1928);
            	    lv_ownedSections_5_0=ruleSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPageExtensionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedSections",
            	              		lv_ownedSections_5_0, 
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

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_rulePageExtension1941); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getPageExtensionAccess().getRightCurlyBracketKeyword_6());
                  
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1048:1: entryRuleSectionExtension returns [EObject current=null] : iv_ruleSectionExtension= ruleSectionExtension EOF ;
    public final EObject entryRuleSectionExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionExtension = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1049:2: (iv_ruleSectionExtension= ruleSectionExtension EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1050:2: iv_ruleSectionExtension= ruleSectionExtension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSectionExtensionRule()); 
            }
            pushFollow(FOLLOW_ruleSectionExtension_in_entryRuleSectionExtension1977);
            iv_ruleSectionExtension=ruleSectionExtension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSectionExtension; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionExtension1987); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1057:1: ruleSectionExtension returns [EObject current=null] : ( () otherlv_1= 'section-extensions' otherlv_2= '{' otherlv_3= 'extended-section' ( (lv_extendedSectionID_4_0= ruleFQN ) ) ( (lv_ownedActivities_5_0= ruleActivity ) )* otherlv_6= '}' ) ;
    public final EObject ruleSectionExtension() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_extendedSectionID_4_0 = null;

        EObject lv_ownedActivities_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1060:28: ( ( () otherlv_1= 'section-extensions' otherlv_2= '{' otherlv_3= 'extended-section' ( (lv_extendedSectionID_4_0= ruleFQN ) ) ( (lv_ownedActivities_5_0= ruleActivity ) )* otherlv_6= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1061:1: ( () otherlv_1= 'section-extensions' otherlv_2= '{' otherlv_3= 'extended-section' ( (lv_extendedSectionID_4_0= ruleFQN ) ) ( (lv_ownedActivities_5_0= ruleActivity ) )* otherlv_6= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1061:1: ( () otherlv_1= 'section-extensions' otherlv_2= '{' otherlv_3= 'extended-section' ( (lv_extendedSectionID_4_0= ruleFQN ) ) ( (lv_ownedActivities_5_0= ruleActivity ) )* otherlv_6= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1061:2: () otherlv_1= 'section-extensions' otherlv_2= '{' otherlv_3= 'extended-section' ( (lv_extendedSectionID_4_0= ruleFQN ) ) ( (lv_ownedActivities_5_0= ruleActivity ) )* otherlv_6= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1061:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1062:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSectionExtensionAccess().getSectionExtensionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleSectionExtension2033); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSectionExtensionAccess().getSectionExtensionsKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSectionExtension2045); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSectionExtensionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleSectionExtension2057); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSectionExtensionAccess().getExtendedSectionKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1079:1: ( (lv_extendedSectionID_4_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1080:1: (lv_extendedSectionID_4_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1080:1: (lv_extendedSectionID_4_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1081:3: lv_extendedSectionID_4_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSectionExtensionAccess().getExtendedSectionIDFQNParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleSectionExtension2078);
            lv_extendedSectionID_4_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSectionExtensionRule());
              	        }
                     		set(
                     			current, 
                     			"extendedSectionID",
                      		lv_extendedSectionID_4_0, 
                      		"FQN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1097:2: ( (lv_ownedActivities_5_0= ruleActivity ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==33) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1098:1: (lv_ownedActivities_5_0= ruleActivity )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1098:1: (lv_ownedActivities_5_0= ruleActivity )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1099:3: lv_ownedActivities_5_0= ruleActivity
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSectionExtensionAccess().getOwnedActivitiesActivityParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleActivity_in_ruleSectionExtension2099);
            	    lv_ownedActivities_5_0=ruleActivity();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSectionExtensionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedActivities",
            	              		lv_ownedActivities_5_0, 
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

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleSectionExtension2112); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSectionExtensionAccess().getRightCurlyBracketKeyword_6());
                  
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1127:1: entryRuleOverview returns [EObject current=null] : iv_ruleOverview= ruleOverview EOF ;
    public final EObject entryRuleOverview() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverview = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1128:2: (iv_ruleOverview= ruleOverview EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1129:2: iv_ruleOverview= ruleOverview EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOverviewRule()); 
            }
            pushFollow(FOLLOW_ruleOverview_in_entryRuleOverview2148);
            iv_ruleOverview=ruleOverview();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOverview; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverview2158); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1136:1: ruleOverview returns [EObject current=null] : ( () otherlv_1= 'Overview' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'image-on' otherlv_6= ':' ( (lv_imagePathOn_7_0= RULE_STRING ) ) )? (otherlv_8= 'image-off' otherlv_9= ':' ( (lv_imagePathOff_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleOverview() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_imagePathOn_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_imagePathOff_10_0=null;
        Token otherlv_11=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1139:28: ( ( () otherlv_1= 'Overview' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'image-on' otherlv_6= ':' ( (lv_imagePathOn_7_0= RULE_STRING ) ) )? (otherlv_8= 'image-off' otherlv_9= ':' ( (lv_imagePathOff_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1140:1: ( () otherlv_1= 'Overview' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'image-on' otherlv_6= ':' ( (lv_imagePathOn_7_0= RULE_STRING ) ) )? (otherlv_8= 'image-off' otherlv_9= ':' ( (lv_imagePathOff_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1140:1: ( () otherlv_1= 'Overview' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'image-on' otherlv_6= ':' ( (lv_imagePathOn_7_0= RULE_STRING ) ) )? (otherlv_8= 'image-off' otherlv_9= ':' ( (lv_imagePathOff_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1140:2: () otherlv_1= 'Overview' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'image-on' otherlv_6= ':' ( (lv_imagePathOn_7_0= RULE_STRING ) ) )? (otherlv_8= 'image-off' otherlv_9= ':' ( (lv_imagePathOff_10_0= RULE_STRING ) ) )? otherlv_11= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1140:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1141:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOverviewAccess().getOverviewAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleOverview2204); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOverviewAccess().getOverviewKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleOverview2216); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOverviewAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1154:1: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==16) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1154:3: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleOverview2229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getOverviewAccess().getDescriptionKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1158:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1159:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1159:1: (lv_description_4_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1160:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOverview2246); if (state.failed) return current;
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1176:4: (otherlv_5= 'image-on' otherlv_6= ':' ( (lv_imagePathOn_7_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==22) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1176:6: otherlv_5= 'image-on' otherlv_6= ':' ( (lv_imagePathOn_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleOverview2266); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getOverviewAccess().getImageOnKeyword_4_0());
                          
                    }
                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleOverview2278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getOverviewAccess().getColonKeyword_4_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1184:1: ( (lv_imagePathOn_7_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1185:1: (lv_imagePathOn_7_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1185:1: (lv_imagePathOn_7_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1186:3: lv_imagePathOn_7_0= RULE_STRING
                    {
                    lv_imagePathOn_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOverview2295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_imagePathOn_7_0, grammarAccess.getOverviewAccess().getImagePathOnSTRINGTerminalRuleCall_4_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOverviewRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"imagePathOn",
                              		lv_imagePathOn_7_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1202:4: (otherlv_8= 'image-off' otherlv_9= ':' ( (lv_imagePathOff_10_0= RULE_STRING ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==24) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1202:6: otherlv_8= 'image-off' otherlv_9= ':' ( (lv_imagePathOff_10_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleOverview2315); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getOverviewAccess().getImageOffKeyword_5_0());
                          
                    }
                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleOverview2327); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getOverviewAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1210:1: ( (lv_imagePathOff_10_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1211:1: (lv_imagePathOff_10_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1211:1: (lv_imagePathOff_10_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1212:3: lv_imagePathOff_10_0= RULE_STRING
                    {
                    lv_imagePathOff_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOverview2344); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_imagePathOff_10_0, grammarAccess.getOverviewAccess().getImagePathOffSTRINGTerminalRuleCall_5_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOverviewRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"imagePathOff",
                              		lv_imagePathOff_10_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleOverview2363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getOverviewAccess().getRightCurlyBracketKeyword_6());
                  
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1242:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1243:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1244:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN2402);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN2413); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1251:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1254:28: ( (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1255:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1255:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1255:6: this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN2453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1262:1: (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==40) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1263:2: kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    {
            	    kw=(Token)match(input,40,FOLLOW_40_in_ruleFQN2472); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1268:1: ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1268:2: ( RULE_ID )=>this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN2493); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1283:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1284:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1285:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_entryRuleEBoolean2542);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBoolean2553); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1292:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1295:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1296:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1296:1: (kw= 'true' | kw= 'false' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==41) ) {
                alt36=1;
            }
            else if ( (LA36_0==42) ) {
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1297:2: kw= 'true'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleEBoolean2591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1304:2: kw= 'false'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleEBoolean2610); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1317:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1318:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1319:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_ruleEInt_in_entryRuleEInt2651);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEInt2662); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1326:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1329:28: (this_INT_0= RULE_INT )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalActivityexplorer.g:1330:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEInt2701); if (state.failed) return current;
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
    public static final BitSet FOLLOW_11_in_ruleViewpointActivityExplorer131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpointActivityExplorer152 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleViewpointActivityExplorer164 = new BitSet(new long[]{0x0000002800006000L});
    public static final BitSet FOLLOW_13_in_ruleViewpointActivityExplorer177 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleViewpointActivityExplorer189 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rulePage_in_ruleViewpointActivityExplorer210 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleViewpointActivityExplorer223 = new BitSet(new long[]{0x0000002800004000L});
    public static final BitSet FOLLOW_rulePageExtension_in_ruleViewpointActivityExplorer246 = new BitSet(new long[]{0x0000002800004000L});
    public static final BitSet FOLLOW_ruleSectionExtension_in_ruleViewpointActivityExplorer268 = new BitSet(new long[]{0x0000002000004000L});
    public static final BitSet FOLLOW_14_in_ruleViewpointActivityExplorer281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePage375 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage392 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePage409 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_16_in_rulePage422 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage439 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_17_in_rulePage459 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage476 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_18_in_rulePage496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePage517 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_rulePage532 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage549 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePage568 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleEInt_in_rulePage589 = new BitSet(new long[]{0x000000801E204000L});
    public static final BitSet FOLLOW_ruleOverview_in_rulePage610 = new BitSet(new long[]{0x000000001E204000L});
    public static final BitSet FOLLOW_21_in_rulePage624 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePage636 = new BitSet(new long[]{0x0000000001404000L});
    public static final BitSet FOLLOW_22_in_rulePage649 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePage661 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage678 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_24_in_rulePage698 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePage710 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage727 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePage746 = new BitSet(new long[]{0x000000001E004000L});
    public static final BitSet FOLLOW_25_in_rulePage761 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage778 = new BitSet(new long[]{0x000000001C004000L});
    public static final BitSet FOLLOW_26_in_rulePage798 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePage810 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rulePage831 = new BitSet(new long[]{0x0000000018004000L});
    public static final BitSet FOLLOW_27_in_rulePage846 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePage858 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rulePage879 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_28_in_rulePage894 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePage906 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_ruleSection_in_rulePage927 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_14_in_rulePage940 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePage954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSection1046 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection1063 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSection1080 = new BitSet(new long[]{0x00000000001D0000L});
    public static final BitSet FOLLOW_16_in_ruleSection1093 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSection1110 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_18_in_ruleSection1130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleSection1151 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleSection1166 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSection1183 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSection1202 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleEInt_in_ruleSection1223 = new BitSet(new long[]{0x00000001C0004000L});
    public static final BitSet FOLLOW_30_in_ruleSection1236 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSection1248 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleSection1269 = new BitSet(new long[]{0x0000000180004000L});
    public static final BitSet FOLLOW_31_in_ruleSection1284 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSection1296 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleSection1317 = new BitSet(new long[]{0x0000000100004000L});
    public static final BitSet FOLLOW_32_in_ruleSection1332 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSection1344 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleSection1365 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_14_in_ruleSection1378 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSection1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity1428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleActivity1484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity1501 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActivity1518 = new BitSet(new long[]{0x00000000001D0000L});
    public static final BitSet FOLLOW_16_in_ruleActivity1531 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity1548 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_18_in_ruleActivity1568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActivity1589 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleActivity1604 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity1621 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleActivity1640 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleEInt_in_ruleActivity1661 = new BitSet(new long[]{0x0000000404004000L});
    public static final BitSet FOLLOW_26_in_ruleActivity1674 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleActivity1686 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleActivity1707 = new BitSet(new long[]{0x0000000400004000L});
    public static final BitSet FOLLOW_34_in_ruleActivity1722 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleActivity1734 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity1751 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleActivity1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageExtension_in_entryRulePageExtension1806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageExtension1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePageExtension1862 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePageExtension1874 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulePageExtension1886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePageExtension1907 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_ruleSection_in_rulePageExtension1928 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_14_in_rulePageExtension1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionExtension_in_entryRuleSectionExtension1977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionExtension1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSectionExtension2033 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSectionExtension2045 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleSectionExtension2057 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleSectionExtension2078 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleSectionExtension2099 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_14_in_ruleSectionExtension2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverview_in_entryRuleOverview2148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverview2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOverview2204 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleOverview2216 = new BitSet(new long[]{0x0000000001414000L});
    public static final BitSet FOLLOW_16_in_ruleOverview2229 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOverview2246 = new BitSet(new long[]{0x0000000001404000L});
    public static final BitSet FOLLOW_22_in_ruleOverview2266 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOverview2278 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOverview2295 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_24_in_ruleOverview2315 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOverview2327 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOverview2344 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleOverview2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN2402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN2453 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleFQN2472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN2493 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean2542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleEBoolean2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEBoolean2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEInt2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2701 = new BitSet(new long[]{0x0000000000000002L});

}
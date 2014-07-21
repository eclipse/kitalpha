/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.af.dsl.cs.text.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.polarsys.kitalpha.ad.af.dsl.cs.text.services.AfdescGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAfdescParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ArchitectureFramework'", "'{'", "'description:'", "'shortName:'", "'}'", "'Configuration'", "','", "'rootProjectName:'", "'Viewpoints'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalAfdescParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAfdescParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAfdescParser.tokenNames; }
    public String getGrammarFileName() { return "../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g"; }



     	private AfdescGrammarAccess grammarAccess;
     	
        public InternalAfdescParser(TokenStream input, AfdescGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "NamedElement";	
       	}
       	
       	@Override
       	protected AfdescGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleNamedElement"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:67:1: entryRuleNamedElement returns [EObject current=null] : iv_ruleNamedElement= ruleNamedElement EOF ;
    public final EObject entryRuleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedElement = null;


        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:68:2: (iv_ruleNamedElement= ruleNamedElement EOF )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:69:2: iv_ruleNamedElement= ruleNamedElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamedElementRule()); 
            }
            pushFollow(FOLLOW_ruleNamedElement_in_entryRuleNamedElement75);
            iv_ruleNamedElement=ruleNamedElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamedElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedElement85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNamedElement"


    // $ANTLR start "ruleNamedElement"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:76:1: ruleNamedElement returns [EObject current=null] : this_ArchitectureFramework_0= ruleArchitectureFramework ;
    public final EObject ruleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject this_ArchitectureFramework_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:79:28: (this_ArchitectureFramework_0= ruleArchitectureFramework )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:81:5: this_ArchitectureFramework_0= ruleArchitectureFramework
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNamedElementAccess().getArchitectureFrameworkParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleArchitectureFramework_in_ruleNamedElement131);
            this_ArchitectureFramework_0=ruleArchitectureFramework();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ArchitectureFramework_0; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleNamedElement"


    // $ANTLR start "entryRuleArchitectureFramework"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:97:1: entryRuleArchitectureFramework returns [EObject current=null] : iv_ruleArchitectureFramework= ruleArchitectureFramework EOF ;
    public final EObject entryRuleArchitectureFramework() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureFramework = null;


        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:98:2: (iv_ruleArchitectureFramework= ruleArchitectureFramework EOF )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:99:2: iv_ruleArchitectureFramework= ruleArchitectureFramework EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArchitectureFrameworkRule()); 
            }
            pushFollow(FOLLOW_ruleArchitectureFramework_in_entryRuleArchitectureFramework165);
            iv_ruleArchitectureFramework=ruleArchitectureFramework();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArchitectureFramework; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchitectureFramework175); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArchitectureFramework"


    // $ANTLR start "ruleArchitectureFramework"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:106:1: ruleArchitectureFramework returns [EObject current=null] : ( () otherlv_1= 'ArchitectureFramework' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'shortName:' ( (lv_shortName_7_0= RULE_STRING ) ) )? ( (lv_af_viewpoints_8_0= ruleViewpoints ) )? ( (lv_owned_configuration_9_0= ruleConfiguration ) ) otherlv_10= '}' ) ;
    public final EObject ruleArchitectureFramework() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token lv_shortName_7_0=null;
        Token otherlv_10=null;
        EObject lv_af_viewpoints_8_0 = null;

        EObject lv_owned_configuration_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:109:28: ( ( () otherlv_1= 'ArchitectureFramework' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'shortName:' ( (lv_shortName_7_0= RULE_STRING ) ) )? ( (lv_af_viewpoints_8_0= ruleViewpoints ) )? ( (lv_owned_configuration_9_0= ruleConfiguration ) ) otherlv_10= '}' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:110:1: ( () otherlv_1= 'ArchitectureFramework' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'shortName:' ( (lv_shortName_7_0= RULE_STRING ) ) )? ( (lv_af_viewpoints_8_0= ruleViewpoints ) )? ( (lv_owned_configuration_9_0= ruleConfiguration ) ) otherlv_10= '}' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:110:1: ( () otherlv_1= 'ArchitectureFramework' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'shortName:' ( (lv_shortName_7_0= RULE_STRING ) ) )? ( (lv_af_viewpoints_8_0= ruleViewpoints ) )? ( (lv_owned_configuration_9_0= ruleConfiguration ) ) otherlv_10= '}' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:110:2: () otherlv_1= 'ArchitectureFramework' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'shortName:' ( (lv_shortName_7_0= RULE_STRING ) ) )? ( (lv_af_viewpoints_8_0= ruleViewpoints ) )? ( (lv_owned_configuration_9_0= ruleConfiguration ) ) otherlv_10= '}'
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:110:2: ()
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:111:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArchitectureFrameworkAccess().getArchitectureFrameworkAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleArchitectureFramework221); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArchitectureFrameworkAccess().getArchitectureFrameworkKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:120:1: ( (lv_name_2_0= RULE_ID ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:121:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:121:1: (lv_name_2_0= RULE_ID )
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:122:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArchitectureFramework238); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_0, grammarAccess.getArchitectureFrameworkAccess().getNameIDTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArchitectureFrameworkRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleArchitectureFramework256); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getArchitectureFrameworkAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:142:1: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:142:3: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleArchitectureFramework269); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getArchitectureFrameworkAccess().getDescriptionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:146:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:147:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:147:1: (lv_description_5_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:148:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArchitectureFramework286); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_description_5_0, grammarAccess.getArchitectureFrameworkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArchitectureFrameworkRule());
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

            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:164:4: (otherlv_6= 'shortName:' ( (lv_shortName_7_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:164:6: otherlv_6= 'shortName:' ( (lv_shortName_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleArchitectureFramework306); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getArchitectureFrameworkAccess().getShortNameKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:168:1: ( (lv_shortName_7_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:169:1: (lv_shortName_7_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:169:1: (lv_shortName_7_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:170:3: lv_shortName_7_0= RULE_STRING
                    {
                    lv_shortName_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArchitectureFramework323); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_shortName_7_0, grammarAccess.getArchitectureFrameworkAccess().getShortNameSTRINGTerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArchitectureFrameworkRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"shortName",
                              		lv_shortName_7_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:186:4: ( (lv_af_viewpoints_8_0= ruleViewpoints ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:187:1: (lv_af_viewpoints_8_0= ruleViewpoints )
                    {
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:187:1: (lv_af_viewpoints_8_0= ruleViewpoints )
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:188:3: lv_af_viewpoints_8_0= ruleViewpoints
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArchitectureFrameworkAccess().getAf_viewpointsViewpointsParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleViewpoints_in_ruleArchitectureFramework351);
                    lv_af_viewpoints_8_0=ruleViewpoints();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArchitectureFrameworkRule());
                      	        }
                             		set(
                             			current, 
                             			"af_viewpoints",
                              		lv_af_viewpoints_8_0, 
                              		"Viewpoints");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:204:3: ( (lv_owned_configuration_9_0= ruleConfiguration ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:205:1: (lv_owned_configuration_9_0= ruleConfiguration )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:205:1: (lv_owned_configuration_9_0= ruleConfiguration )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:206:3: lv_owned_configuration_9_0= ruleConfiguration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArchitectureFrameworkAccess().getOwned_configurationConfigurationParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConfiguration_in_ruleArchitectureFramework373);
            lv_owned_configuration_9_0=ruleConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArchitectureFrameworkRule());
              	        }
                     		set(
                     			current, 
                     			"owned_configuration",
                      		lv_owned_configuration_9_0, 
                      		"Configuration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleArchitectureFramework385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getArchitectureFrameworkAccess().getRightCurlyBracketKeyword_8());
                  
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
    // $ANTLR end "ruleArchitectureFramework"


    // $ANTLR start "entryRuleConfiguration"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:234:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:235:2: (iv_ruleConfiguration= ruleConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:236:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleConfiguration_in_entryRuleConfiguration421);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfiguration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfiguration431); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:243:1: ruleConfiguration returns [EObject current=null] : ( () otherlv_1= 'Configuration' otherlv_2= '{' ( ( (lv_owned_element_3_0= ruleConfigurationElement ) ) (otherlv_4= ',' ( (lv_owned_element_5_0= ruleConfigurationElement ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_owned_element_3_0 = null;

        EObject lv_owned_element_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:246:28: ( ( () otherlv_1= 'Configuration' otherlv_2= '{' ( ( (lv_owned_element_3_0= ruleConfigurationElement ) ) (otherlv_4= ',' ( (lv_owned_element_5_0= ruleConfigurationElement ) ) )* )? otherlv_6= '}' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:247:1: ( () otherlv_1= 'Configuration' otherlv_2= '{' ( ( (lv_owned_element_3_0= ruleConfigurationElement ) ) (otherlv_4= ',' ( (lv_owned_element_5_0= ruleConfigurationElement ) ) )* )? otherlv_6= '}' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:247:1: ( () otherlv_1= 'Configuration' otherlv_2= '{' ( ( (lv_owned_element_3_0= ruleConfigurationElement ) ) (otherlv_4= ',' ( (lv_owned_element_5_0= ruleConfigurationElement ) ) )* )? otherlv_6= '}' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:247:2: () otherlv_1= 'Configuration' otherlv_2= '{' ( ( (lv_owned_element_3_0= ruleConfigurationElement ) ) (otherlv_4= ',' ( (lv_owned_element_5_0= ruleConfigurationElement ) ) )* )? otherlv_6= '}'
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:247:2: ()
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:248:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConfigurationAccess().getConfigurationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleConfiguration477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConfigurationAccess().getConfigurationKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleConfiguration489); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:261:1: ( ( (lv_owned_element_3_0= ruleConfigurationElement ) ) (otherlv_4= ',' ( (lv_owned_element_5_0= ruleConfigurationElement ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:261:2: ( (lv_owned_element_3_0= ruleConfigurationElement ) ) (otherlv_4= ',' ( (lv_owned_element_5_0= ruleConfigurationElement ) ) )*
                    {
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:261:2: ( (lv_owned_element_3_0= ruleConfigurationElement ) )
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:262:1: (lv_owned_element_3_0= ruleConfigurationElement )
                    {
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:262:1: (lv_owned_element_3_0= ruleConfigurationElement )
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:263:3: lv_owned_element_3_0= ruleConfigurationElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConfigurationAccess().getOwned_elementConfigurationElementParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConfigurationElement_in_ruleConfiguration511);
                    lv_owned_element_3_0=ruleConfigurationElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConfigurationRule());
                      	        }
                             		add(
                             			current, 
                             			"owned_element",
                              		lv_owned_element_3_0, 
                              		"ConfigurationElement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:279:2: (otherlv_4= ',' ( (lv_owned_element_5_0= ruleConfigurationElement ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:279:4: otherlv_4= ',' ( (lv_owned_element_5_0= ruleConfigurationElement ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleConfiguration524); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getConfigurationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:283:1: ( (lv_owned_element_5_0= ruleConfigurationElement ) )
                    	    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:284:1: (lv_owned_element_5_0= ruleConfigurationElement )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:284:1: (lv_owned_element_5_0= ruleConfigurationElement )
                    	    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:285:3: lv_owned_element_5_0= ruleConfigurationElement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConfigurationAccess().getOwned_elementConfigurationElementParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleConfigurationElement_in_ruleConfiguration545);
                    	    lv_owned_element_5_0=ruleConfigurationElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"owned_element",
                    	              		lv_owned_element_5_0, 
                    	              		"ConfigurationElement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleConfiguration561); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleConfigurationElement"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:313:1: entryRuleConfigurationElement returns [EObject current=null] : iv_ruleConfigurationElement= ruleConfigurationElement EOF ;
    public final EObject entryRuleConfigurationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationElement = null;


        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:314:2: (iv_ruleConfigurationElement= ruleConfigurationElement EOF )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:315:2: iv_ruleConfigurationElement= ruleConfigurationElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationElementRule()); 
            }
            pushFollow(FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement597);
            iv_ruleConfigurationElement=ruleConfigurationElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationElement607); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConfigurationElement"


    // $ANTLR start "ruleConfigurationElement"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:322:1: ruleConfigurationElement returns [EObject current=null] : this_GenerationConfiguration_0= ruleGenerationConfiguration ;
    public final EObject ruleConfigurationElement() throws RecognitionException {
        EObject current = null;

        EObject this_GenerationConfiguration_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:325:28: (this_GenerationConfiguration_0= ruleGenerationConfiguration )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:327:5: this_GenerationConfiguration_0= ruleGenerationConfiguration
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConfigurationElementAccess().getGenerationConfigurationParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleGenerationConfiguration_in_ruleConfigurationElement653);
            this_GenerationConfiguration_0=ruleGenerationConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GenerationConfiguration_0; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleConfigurationElement"


    // $ANTLR start "entryRuleGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:343:1: entryRuleGenerationConfiguration returns [EObject current=null] : iv_ruleGenerationConfiguration= ruleGenerationConfiguration EOF ;
    public final EObject entryRuleGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerationConfiguration = null;


        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:344:2: (iv_ruleGenerationConfiguration= ruleGenerationConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:345:2: iv_ruleGenerationConfiguration= ruleGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleGenerationConfiguration_in_entryRuleGenerationConfiguration687);
            iv_ruleGenerationConfiguration=ruleGenerationConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenerationConfiguration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerationConfiguration697); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGenerationConfiguration"


    // $ANTLR start "ruleGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:352:1: ruleGenerationConfiguration returns [EObject current=null] : ( () (otherlv_1= 'rootProjectName:' ( (lv_rootProjectName_2_0= ruleFQN ) ) ) ) ;
    public final EObject ruleGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_rootProjectName_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:355:28: ( ( () (otherlv_1= 'rootProjectName:' ( (lv_rootProjectName_2_0= ruleFQN ) ) ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:356:1: ( () (otherlv_1= 'rootProjectName:' ( (lv_rootProjectName_2_0= ruleFQN ) ) ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:356:1: ( () (otherlv_1= 'rootProjectName:' ( (lv_rootProjectName_2_0= ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:356:2: () (otherlv_1= 'rootProjectName:' ( (lv_rootProjectName_2_0= ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:356:2: ()
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:357:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGenerationConfigurationAccess().getGenerationConfigurationAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:362:2: (otherlv_1= 'rootProjectName:' ( (lv_rootProjectName_2_0= ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:362:4: otherlv_1= 'rootProjectName:' ( (lv_rootProjectName_2_0= ruleFQN ) )
            {
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleGenerationConfiguration744); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGenerationConfigurationAccess().getRootProjectNameKeyword_1_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:366:1: ( (lv_rootProjectName_2_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:367:1: (lv_rootProjectName_2_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:367:1: (lv_rootProjectName_2_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:368:3: lv_rootProjectName_2_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGenerationConfigurationAccess().getRootProjectNameFQNParserRuleCall_1_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleGenerationConfiguration765);
            lv_rootProjectName_2_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGenerationConfigurationRule());
              	        }
                     		set(
                     			current, 
                     			"rootProjectName",
                      		lv_rootProjectName_2_0, 
                      		"FQN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


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
    // $ANTLR end "ruleGenerationConfiguration"


    // $ANTLR start "entryRuleViewpoints"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:392:1: entryRuleViewpoints returns [EObject current=null] : iv_ruleViewpoints= ruleViewpoints EOF ;
    public final EObject entryRuleViewpoints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewpoints = null;


        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:393:2: (iv_ruleViewpoints= ruleViewpoints EOF )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:394:2: iv_ruleViewpoints= ruleViewpoints EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getViewpointsRule()); 
            }
            pushFollow(FOLLOW_ruleViewpoints_in_entryRuleViewpoints802);
            iv_ruleViewpoints=ruleViewpoints();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleViewpoints; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewpoints812); if (state.failed) return current;

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
    // $ANTLR end "entryRuleViewpoints"


    // $ANTLR start "ruleViewpoints"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:401:1: ruleViewpoints returns [EObject current=null] : ( () otherlv_1= 'Viewpoints' otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleViewpoints() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:404:28: ( ( () otherlv_1= 'Viewpoints' otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '}' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:405:1: ( () otherlv_1= 'Viewpoints' otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '}' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:405:1: ( () otherlv_1= 'Viewpoints' otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '}' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:405:2: () otherlv_1= 'Viewpoints' otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '}'
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:405:2: ()
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:406:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getViewpointsAccess().getViewpointsAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleViewpoints858); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getViewpointsAccess().getViewpointsKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleViewpoints870); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getViewpointsAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:419:1: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:419:2: ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:419:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:420:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:420:1: (otherlv_3= RULE_ID )
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:421:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointsRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleViewpoints891); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getViewpointsAccess().getOwned_viewpointsViewpointCrossReference_3_0_0()); 
                      	
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:432:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==17) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:432:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleViewpoints904); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getViewpointsAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:436:1: ( (otherlv_5= RULE_ID ) )
                    	    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:437:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:437:1: (otherlv_5= RULE_ID )
                    	    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:438:3: otherlv_5= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getViewpointsRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleViewpoints924); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_5, grammarAccess.getViewpointsAccess().getOwned_viewpointsViewpointCrossReference_3_1_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleViewpoints940); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getViewpointsAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleViewpoints"


    // $ANTLR start "entryRuleFQN"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:461:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:462:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:463:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN977);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN988); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:470:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:473:28: ( (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:474:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:474:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:474:6: this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1028); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:481:1: (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:482:2: kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_ruleFQN1047); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:487:1: ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/parser/antlr/internal/InternalAfdesc.g:487:2: ( RULE_ID )=>this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1068); if (state.failed) return current;
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
            	    break loop9;
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleNamedElement_in_entryRuleNamedElement75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedElement85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitectureFramework_in_ruleNamedElement131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitectureFramework_in_entryRuleArchitectureFramework165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchitectureFramework175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleArchitectureFramework221 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArchitectureFramework238 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleArchitectureFramework256 = new BitSet(new long[]{0x0000000000096000L});
    public static final BitSet FOLLOW_13_in_ruleArchitectureFramework269 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArchitectureFramework286 = new BitSet(new long[]{0x0000000000096000L});
    public static final BitSet FOLLOW_14_in_ruleArchitectureFramework306 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArchitectureFramework323 = new BitSet(new long[]{0x0000000000096000L});
    public static final BitSet FOLLOW_ruleViewpoints_in_ruleArchitectureFramework351 = new BitSet(new long[]{0x0000000000096000L});
    public static final BitSet FOLLOW_ruleConfiguration_in_ruleArchitectureFramework373 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleArchitectureFramework385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfiguration_in_entryRuleConfiguration421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfiguration431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleConfiguration477 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConfiguration489 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_ruleConfiguration511 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleConfiguration524 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_ruleConfiguration545 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleConfiguration561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationElement607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationConfiguration_in_ruleConfigurationElement653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationConfiguration_in_entryRuleGenerationConfiguration687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerationConfiguration697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleGenerationConfiguration744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleGenerationConfiguration765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewpoints_in_entryRuleViewpoints802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewpoints812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleViewpoints858 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleViewpoints870 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleViewpoints891 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleViewpoints904 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleViewpoints924 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleViewpoints940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1028 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleFQN1047 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1068 = new BitSet(new long[]{0x0000000000100002L});

}

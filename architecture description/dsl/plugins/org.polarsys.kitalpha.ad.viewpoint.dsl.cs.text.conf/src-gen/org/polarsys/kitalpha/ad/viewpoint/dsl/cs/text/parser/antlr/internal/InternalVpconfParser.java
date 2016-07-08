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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpconfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
@SuppressWarnings("all")
public class InternalVpconfParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Configuration'", "'{'", "'}'", "'target'", "'project'", "'nsuri'", "'generation'", "'data'", "'('", "'Model'", "':'", "'Edit'", "'Editor'", "'Test'", "'Javadoc'", "'OverwriteEcore'", "')'", "'diagram'", "'OverwriteOdesign'", "'documentation'", "'EcoreToHtml:'", "'ecore'", "'aird'", "'release'", "'version'", "'description'", "'execution'", "'environments'", "','", "'.'", "'_'", "'-'", "'true'", "'false'"
    };
    public static final int RULE_ID=6;
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
    public static final int RULE_INT=5;
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


        public InternalVpconfParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVpconfParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVpconfParser.tokenNames; }
    public String getGrammarFileName() { return "../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g"; }



     	private VpconfGrammarAccess grammarAccess;
     	
        public InternalVpconfParser(TokenStream input, VpconfGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Configuration";	
       	}
       	
       	@Override
       	protected VpconfGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:74:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:75:2: (iv_ruleConfiguration= ruleConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:76:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleConfiguration_in_entryRuleConfiguration75);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfiguration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfiguration85); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:83:1: ruleConfiguration returns [EObject current=null] : ( () otherlv_1= 'Configuration' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_vpConfigurationElements_4_0= ruleConfigurationElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_vpConfigurationElements_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:86:28: ( ( () otherlv_1= 'Configuration' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_vpConfigurationElements_4_0= ruleConfigurationElement ) )* otherlv_5= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:87:1: ( () otherlv_1= 'Configuration' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_vpConfigurationElements_4_0= ruleConfigurationElement ) )* otherlv_5= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:87:1: ( () otherlv_1= 'Configuration' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_vpConfigurationElements_4_0= ruleConfigurationElement ) )* otherlv_5= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:87:2: () otherlv_1= 'Configuration' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_vpConfigurationElements_4_0= ruleConfigurationElement ) )* otherlv_5= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:87:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:88:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConfigurationAccess().getConfigurationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleConfiguration131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConfigurationAccess().getConfigurationKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:97:1: ( (lv_name_2_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:98:1: (lv_name_2_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:98:1: (lv_name_2_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:99:3: lv_name_2_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConfigurationAccess().getNameFQNParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleConfiguration152);
            lv_name_2_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConfigurationRule());
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleConfiguration164); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:119:1: ( (lv_vpConfigurationElements_4_0= ruleConfigurationElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)||LA1_0==17||LA1_0==34) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:120:1: (lv_vpConfigurationElements_4_0= ruleConfigurationElement )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:120:1: (lv_vpConfigurationElements_4_0= ruleConfigurationElement )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:121:3: lv_vpConfigurationElements_4_0= ruleConfigurationElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConfigurationAccess().getVpConfigurationElementsConfigurationElementParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConfigurationElement_in_ruleConfiguration185);
            	    lv_vpConfigurationElements_4_0=ruleConfigurationElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"vpConfigurationElements",
            	              		lv_vpConfigurationElements_4_0, 
            	              		"ConfigurationElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleConfiguration198); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_5());
                  
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:149:1: entryRuleConfigurationElement returns [EObject current=null] : iv_ruleConfigurationElement= ruleConfigurationElement EOF ;
    public final EObject entryRuleConfigurationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationElement = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:150:2: (iv_ruleConfigurationElement= ruleConfigurationElement EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:151:2: iv_ruleConfigurationElement= ruleConfigurationElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationElementRule()); 
            }
            pushFollow(FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement234);
            iv_ruleConfigurationElement=ruleConfigurationElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationElement244); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:158:1: ruleConfigurationElement returns [EObject current=null] : (this_TargetApplication_0= ruleTargetApplication | this_GenerationConfiguration_1= ruleGenerationConfiguration | this_Generation_2= ruleGeneration | this_Release_3= ruleRelease ) ;
    public final EObject ruleConfigurationElement() throws RecognitionException {
        EObject current = null;

        EObject this_TargetApplication_0 = null;

        EObject this_GenerationConfiguration_1 = null;

        EObject this_Generation_2 = null;

        EObject this_Release_3 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:161:28: ( (this_TargetApplication_0= ruleTargetApplication | this_GenerationConfiguration_1= ruleGenerationConfiguration | this_Generation_2= ruleGeneration | this_Release_3= ruleRelease ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:162:1: (this_TargetApplication_0= ruleTargetApplication | this_GenerationConfiguration_1= ruleGenerationConfiguration | this_Generation_2= ruleGeneration | this_Release_3= ruleRelease )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:162:1: (this_TargetApplication_0= ruleTargetApplication | this_GenerationConfiguration_1= ruleGenerationConfiguration | this_Generation_2= ruleGeneration | this_Release_3= ruleRelease )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 34:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:163:5: this_TargetApplication_0= ruleTargetApplication
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConfigurationElementAccess().getTargetApplicationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTargetApplication_in_ruleConfigurationElement291);
                    this_TargetApplication_0=ruleTargetApplication();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TargetApplication_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:173:5: this_GenerationConfiguration_1= ruleGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConfigurationElementAccess().getGenerationConfigurationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGenerationConfiguration_in_ruleConfigurationElement318);
                    this_GenerationConfiguration_1=ruleGenerationConfiguration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GenerationConfiguration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:183:5: this_Generation_2= ruleGeneration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConfigurationElementAccess().getGenerationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGeneration_in_ruleConfigurationElement345);
                    this_Generation_2=ruleGeneration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Generation_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:193:5: this_Release_3= ruleRelease
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConfigurationElementAccess().getReleaseParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelease_in_ruleConfigurationElement372);
                    this_Release_3=ruleRelease();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Release_3; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleConfigurationElement"


    // $ANTLR start "entryRuleTargetApplication"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:209:1: entryRuleTargetApplication returns [EObject current=null] : iv_ruleTargetApplication= ruleTargetApplication EOF ;
    public final EObject entryRuleTargetApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetApplication = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:210:2: (iv_ruleTargetApplication= ruleTargetApplication EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:211:2: iv_ruleTargetApplication= ruleTargetApplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTargetApplicationRule()); 
            }
            pushFollow(FOLLOW_ruleTargetApplication_in_entryRuleTargetApplication407);
            iv_ruleTargetApplication=ruleTargetApplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTargetApplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetApplication417); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTargetApplication"


    // $ANTLR start "ruleTargetApplication"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:218:1: ruleTargetApplication returns [EObject current=null] : ( () otherlv_1= 'target' ( (lv_type_2_0= ruleEString ) ) ) ;
    public final EObject ruleTargetApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:221:28: ( ( () otherlv_1= 'target' ( (lv_type_2_0= ruleEString ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:222:1: ( () otherlv_1= 'target' ( (lv_type_2_0= ruleEString ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:222:1: ( () otherlv_1= 'target' ( (lv_type_2_0= ruleEString ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:222:2: () otherlv_1= 'target' ( (lv_type_2_0= ruleEString ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:222:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:223:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTargetApplicationAccess().getTargetApplicationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleTargetApplication463); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTargetApplicationAccess().getTargetKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:232:1: ( (lv_type_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:233:1: (lv_type_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:233:1: (lv_type_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:234:3: lv_type_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTargetApplicationAccess().getTypeEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleTargetApplication484);
            lv_type_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTargetApplicationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleTargetApplication"


    // $ANTLR start "entryRuleGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:258:1: entryRuleGenerationConfiguration returns [EObject current=null] : iv_ruleGenerationConfiguration= ruleGenerationConfiguration EOF ;
    public final EObject entryRuleGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerationConfiguration = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:259:2: (iv_ruleGenerationConfiguration= ruleGenerationConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:260:2: iv_ruleGenerationConfiguration= ruleGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleGenerationConfiguration_in_entryRuleGenerationConfiguration520);
            iv_ruleGenerationConfiguration=ruleGenerationConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenerationConfiguration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerationConfiguration530); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:267:1: ruleGenerationConfiguration returns [EObject current=null] : ( () otherlv_1= 'project' ( (lv_projectName_2_0= ruleFQN ) ) (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_nsuri_4_0=null;
        AntlrDatatypeRuleToken lv_projectName_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:270:28: ( ( () otherlv_1= 'project' ( (lv_projectName_2_0= ruleFQN ) ) (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:271:1: ( () otherlv_1= 'project' ( (lv_projectName_2_0= ruleFQN ) ) (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:271:1: ( () otherlv_1= 'project' ( (lv_projectName_2_0= ruleFQN ) ) (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:271:2: () otherlv_1= 'project' ( (lv_projectName_2_0= ruleFQN ) ) (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )?
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:271:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:272:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGenerationConfigurationAccess().getGenerationConfigurationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleGenerationConfiguration576); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGenerationConfigurationAccess().getProjectKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:281:1: ( (lv_projectName_2_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:282:1: (lv_projectName_2_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:282:1: (lv_projectName_2_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:283:3: lv_projectName_2_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGenerationConfigurationAccess().getProjectNameFQNParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleGenerationConfiguration597);
            lv_projectName_2_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGenerationConfigurationRule());
              	        }
                     		set(
                     			current, 
                     			"projectName",
                      		lv_projectName_2_0, 
                      		"FQN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:299:2: (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:299:4: otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleGenerationConfiguration610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getGenerationConfigurationAccess().getNsuriKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:303:1: ( (lv_nsuri_4_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:304:1: (lv_nsuri_4_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:304:1: (lv_nsuri_4_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:305:3: lv_nsuri_4_0= RULE_STRING
                    {
                    lv_nsuri_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGenerationConfiguration627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_nsuri_4_0, grammarAccess.getGenerationConfigurationAccess().getNsuriSTRINGTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getGenerationConfigurationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"nsuri",
                              		lv_nsuri_4_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

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


    // $ANTLR start "entryRuleGeneration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:329:1: entryRuleGeneration returns [EObject current=null] : iv_ruleGeneration= ruleGeneration EOF ;
    public final EObject entryRuleGeneration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneration = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:330:2: (iv_ruleGeneration= ruleGeneration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:331:2: iv_ruleGeneration= ruleGeneration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenerationRule()); 
            }
            pushFollow(FOLLOW_ruleGeneration_in_entryRuleGeneration670);
            iv_ruleGeneration=ruleGeneration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGeneration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneration680); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGeneration"


    // $ANTLR start "ruleGeneration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:338:1: ruleGeneration returns [EObject current=null] : ( () otherlv_1= 'generation' otherlv_2= '{' ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )? ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )* otherlv_5= '}' ) ;
    public final EObject ruleGeneration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_ownedDataGenerationConf_3_0 = null;

        EObject lv_ownedExtensionGenConf_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:341:28: ( ( () otherlv_1= 'generation' otherlv_2= '{' ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )? ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )* otherlv_5= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:342:1: ( () otherlv_1= 'generation' otherlv_2= '{' ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )? ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )* otherlv_5= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:342:1: ( () otherlv_1= 'generation' otherlv_2= '{' ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )? ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )* otherlv_5= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:342:2: () otherlv_1= 'generation' otherlv_2= '{' ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )? ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )* otherlv_5= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:342:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:343:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGenerationAccess().getGenerationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleGeneration726); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGenerationAccess().getGenerationKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGeneration738); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGenerationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:356:1: ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:357:1: (lv_ownedDataGenerationConf_3_0= ruleGData )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:357:1: (lv_ownedDataGenerationConf_3_0= ruleGData )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:358:3: lv_ownedDataGenerationConf_3_0= ruleGData
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGenerationAccess().getOwnedDataGenerationConfGDataParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGData_in_ruleGeneration759);
                    lv_ownedDataGenerationConf_3_0=ruleGData();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGenerationRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedDataGenerationConf",
                              		lv_ownedDataGenerationConf_3_0, 
                              		"GData");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:374:3: ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28||LA5_0==30||LA5_0==32) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:375:1: (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:375:1: (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:376:3: lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGenerationAccess().getOwnedExtensionGenConfExtensionGeneratrionConfigurationParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExtensionGeneratrionConfiguration_in_ruleGeneration781);
            	    lv_ownedExtensionGenConf_4_0=ruleExtensionGeneratrionConfiguration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGenerationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedExtensionGenConf",
            	              		lv_ownedExtensionGenConf_4_0, 
            	              		"ExtensionGeneratrionConfiguration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleGeneration794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getGenerationAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleGeneration"


    // $ANTLR start "entryRuleGData"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:404:1: entryRuleGData returns [EObject current=null] : iv_ruleGData= ruleGData EOF ;
    public final EObject entryRuleGData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGData = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:405:2: (iv_ruleGData= ruleGData EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:406:2: iv_ruleGData= ruleGData EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGDataRule()); 
            }
            pushFollow(FOLLOW_ruleGData_in_entryRuleGData830);
            iv_ruleGData=ruleGData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGData; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGData840); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGData"


    // $ANTLR start "ruleGData"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:413:1: ruleGData returns [EObject current=null] : ( () otherlv_1= 'data' otherlv_2= '(' ( (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )? (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )? (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )? (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )? (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )? ) otherlv_21= ')' ) ;
    public final EObject ruleGData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_model_5_0 = null;

        AntlrDatatypeRuleToken lv_edit_8_0 = null;

        AntlrDatatypeRuleToken lv_editor_11_0 = null;

        AntlrDatatypeRuleToken lv_test_14_0 = null;

        AntlrDatatypeRuleToken lv_javaDoc_17_0 = null;

        AntlrDatatypeRuleToken lv_overwriteEcore_20_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:416:28: ( ( () otherlv_1= 'data' otherlv_2= '(' ( (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )? (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )? (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )? (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )? (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )? ) otherlv_21= ')' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:417:1: ( () otherlv_1= 'data' otherlv_2= '(' ( (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )? (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )? (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )? (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )? (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )? ) otherlv_21= ')' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:417:1: ( () otherlv_1= 'data' otherlv_2= '(' ( (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )? (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )? (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )? (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )? (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )? ) otherlv_21= ')' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:417:2: () otherlv_1= 'data' otherlv_2= '(' ( (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )? (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )? (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )? (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )? (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )? ) otherlv_21= ')'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:417:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:418:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGDataAccess().getGDataAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleGData886); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGDataAccess().getDataKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleGData898); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGDataAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:431:1: ( (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )? (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )? (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )? (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )? (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:431:2: (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )? (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )? (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )? (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )? (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )?
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:431:2: (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:431:4: otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleGData912); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getGDataAccess().getModelKeyword_3_0_0());
                          
                    }
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleGData924); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getGDataAccess().getColonKeyword_3_0_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:439:1: ( (lv_model_5_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:440:1: (lv_model_5_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:440:1: (lv_model_5_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:441:3: lv_model_5_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getModelEBooleanParserRuleCall_3_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleGData945);
                    lv_model_5_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGDataRule());
                      	        }
                             		set(
                             			current, 
                             			"model",
                              		lv_model_5_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:457:4: (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:457:6: otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleGData960); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getGDataAccess().getEditKeyword_3_1_0());
                          
                    }
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleGData972); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getGDataAccess().getColonKeyword_3_1_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:465:1: ( (lv_edit_8_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:466:1: (lv_edit_8_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:466:1: (lv_edit_8_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:467:3: lv_edit_8_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getEditEBooleanParserRuleCall_3_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleGData993);
                    lv_edit_8_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGDataRule());
                      	        }
                             		set(
                             			current, 
                             			"edit",
                              		lv_edit_8_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:483:4: (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:483:6: otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleGData1008); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getGDataAccess().getEditorKeyword_3_2_0());
                          
                    }
                    otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleGData1020); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getGDataAccess().getColonKeyword_3_2_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:491:1: ( (lv_editor_11_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:492:1: (lv_editor_11_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:492:1: (lv_editor_11_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:493:3: lv_editor_11_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getEditorEBooleanParserRuleCall_3_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleGData1041);
                    lv_editor_11_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGDataRule());
                      	        }
                             		set(
                             			current, 
                             			"editor",
                              		lv_editor_11_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:509:4: (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:509:6: otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) )
                    {
                    otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleGData1056); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getGDataAccess().getTestKeyword_3_3_0());
                          
                    }
                    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleGData1068); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getGDataAccess().getColonKeyword_3_3_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:517:1: ( (lv_test_14_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:518:1: (lv_test_14_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:518:1: (lv_test_14_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:519:3: lv_test_14_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getTestEBooleanParserRuleCall_3_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleGData1089);
                    lv_test_14_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGDataRule());
                      	        }
                             		set(
                             			current, 
                             			"test",
                              		lv_test_14_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:535:4: (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:535:6: otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) )
                    {
                    otherlv_15=(Token)match(input,25,FOLLOW_25_in_ruleGData1104); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getGDataAccess().getJavadocKeyword_3_4_0());
                          
                    }
                    otherlv_16=(Token)match(input,21,FOLLOW_21_in_ruleGData1116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getGDataAccess().getColonKeyword_3_4_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:543:1: ( (lv_javaDoc_17_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:544:1: (lv_javaDoc_17_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:544:1: (lv_javaDoc_17_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:545:3: lv_javaDoc_17_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getJavaDocEBooleanParserRuleCall_3_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleGData1137);
                    lv_javaDoc_17_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGDataRule());
                      	        }
                             		set(
                             			current, 
                             			"javaDoc",
                              		lv_javaDoc_17_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:561:4: (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:561:6: otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) )
                    {
                    otherlv_18=(Token)match(input,26,FOLLOW_26_in_ruleGData1152); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getGDataAccess().getOverwriteEcoreKeyword_3_5_0());
                          
                    }
                    otherlv_19=(Token)match(input,21,FOLLOW_21_in_ruleGData1164); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getGDataAccess().getColonKeyword_3_5_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:569:1: ( (lv_overwriteEcore_20_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:570:1: (lv_overwriteEcore_20_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:570:1: (lv_overwriteEcore_20_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:571:3: lv_overwriteEcore_20_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getOverwriteEcoreEBooleanParserRuleCall_3_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleGData1185);
                    lv_overwriteEcore_20_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGDataRule());
                      	        }
                             		set(
                             			current, 
                             			"overwriteEcore",
                              		lv_overwriteEcore_20_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            otherlv_21=(Token)match(input,27,FOLLOW_27_in_ruleGData1200); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_21, grammarAccess.getGDataAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleGData"


    // $ANTLR start "entryRuleExtensionGeneratrionConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:599:1: entryRuleExtensionGeneratrionConfiguration returns [EObject current=null] : iv_ruleExtensionGeneratrionConfiguration= ruleExtensionGeneratrionConfiguration EOF ;
    public final EObject entryRuleExtensionGeneratrionConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionGeneratrionConfiguration = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:600:2: (iv_ruleExtensionGeneratrionConfiguration= ruleExtensionGeneratrionConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:601:2: iv_ruleExtensionGeneratrionConfiguration= ruleExtensionGeneratrionConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtensionGeneratrionConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleExtensionGeneratrionConfiguration_in_entryRuleExtensionGeneratrionConfiguration1236);
            iv_ruleExtensionGeneratrionConfiguration=ruleExtensionGeneratrionConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtensionGeneratrionConfiguration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensionGeneratrionConfiguration1246); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExtensionGeneratrionConfiguration"


    // $ANTLR start "ruleExtensionGeneratrionConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:608:1: ruleExtensionGeneratrionConfiguration returns [EObject current=null] : (this_DiagramGenerationConfiguration_0= ruleDiagramGenerationConfiguration | this_DocumentationGenerationConfiguration_1= ruleDocumentationGenerationConfiguration | this_ModelsAirdGenerationConfiguration_2= ruleModelsAirdGenerationConfiguration ) ;
    public final EObject ruleExtensionGeneratrionConfiguration() throws RecognitionException {
        EObject current = null;

        EObject this_DiagramGenerationConfiguration_0 = null;

        EObject this_DocumentationGenerationConfiguration_1 = null;

        EObject this_ModelsAirdGenerationConfiguration_2 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:611:28: ( (this_DiagramGenerationConfiguration_0= ruleDiagramGenerationConfiguration | this_DocumentationGenerationConfiguration_1= ruleDocumentationGenerationConfiguration | this_ModelsAirdGenerationConfiguration_2= ruleModelsAirdGenerationConfiguration ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:612:1: (this_DiagramGenerationConfiguration_0= ruleDiagramGenerationConfiguration | this_DocumentationGenerationConfiguration_1= ruleDocumentationGenerationConfiguration | this_ModelsAirdGenerationConfiguration_2= ruleModelsAirdGenerationConfiguration )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:612:1: (this_DiagramGenerationConfiguration_0= ruleDiagramGenerationConfiguration | this_DocumentationGenerationConfiguration_1= ruleDocumentationGenerationConfiguration | this_ModelsAirdGenerationConfiguration_2= ruleModelsAirdGenerationConfiguration )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt12=1;
                }
                break;
            case 30:
                {
                alt12=2;
                }
                break;
            case 32:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:613:5: this_DiagramGenerationConfiguration_0= ruleDiagramGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExtensionGeneratrionConfigurationAccess().getDiagramGenerationConfigurationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDiagramGenerationConfiguration_in_ruleExtensionGeneratrionConfiguration1293);
                    this_DiagramGenerationConfiguration_0=ruleDiagramGenerationConfiguration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DiagramGenerationConfiguration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:623:5: this_DocumentationGenerationConfiguration_1= ruleDocumentationGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExtensionGeneratrionConfigurationAccess().getDocumentationGenerationConfigurationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDocumentationGenerationConfiguration_in_ruleExtensionGeneratrionConfiguration1320);
                    this_DocumentationGenerationConfiguration_1=ruleDocumentationGenerationConfiguration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DocumentationGenerationConfiguration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:633:5: this_ModelsAirdGenerationConfiguration_2= ruleModelsAirdGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExtensionGeneratrionConfigurationAccess().getModelsAirdGenerationConfigurationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleModelsAirdGenerationConfiguration_in_ruleExtensionGeneratrionConfiguration1347);
                    this_ModelsAirdGenerationConfiguration_2=ruleModelsAirdGenerationConfiguration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ModelsAirdGenerationConfiguration_2; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleExtensionGeneratrionConfiguration"


    // $ANTLR start "entryRuleDiagramGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:649:1: entryRuleDiagramGenerationConfiguration returns [EObject current=null] : iv_ruleDiagramGenerationConfiguration= ruleDiagramGenerationConfiguration EOF ;
    public final EObject entryRuleDiagramGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramGenerationConfiguration = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:650:2: (iv_ruleDiagramGenerationConfiguration= ruleDiagramGenerationConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:651:2: iv_ruleDiagramGenerationConfiguration= ruleDiagramGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDiagramGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleDiagramGenerationConfiguration_in_entryRuleDiagramGenerationConfiguration1382);
            iv_ruleDiagramGenerationConfiguration=ruleDiagramGenerationConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDiagramGenerationConfiguration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagramGenerationConfiguration1392); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDiagramGenerationConfiguration"


    // $ANTLR start "ruleDiagramGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:658:1: ruleDiagramGenerationConfiguration returns [EObject current=null] : ( () otherlv_1= 'diagram' otherlv_2= '(' (otherlv_3= 'OverwriteOdesign' otherlv_4= ':' ( (lv_overwriteVSM_5_0= ruleEBoolean ) ) )? otherlv_6= ')' ) ;
    public final EObject ruleDiagramGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_overwriteVSM_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:661:28: ( ( () otherlv_1= 'diagram' otherlv_2= '(' (otherlv_3= 'OverwriteOdesign' otherlv_4= ':' ( (lv_overwriteVSM_5_0= ruleEBoolean ) ) )? otherlv_6= ')' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:662:1: ( () otherlv_1= 'diagram' otherlv_2= '(' (otherlv_3= 'OverwriteOdesign' otherlv_4= ':' ( (lv_overwriteVSM_5_0= ruleEBoolean ) ) )? otherlv_6= ')' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:662:1: ( () otherlv_1= 'diagram' otherlv_2= '(' (otherlv_3= 'OverwriteOdesign' otherlv_4= ':' ( (lv_overwriteVSM_5_0= ruleEBoolean ) ) )? otherlv_6= ')' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:662:2: () otherlv_1= 'diagram' otherlv_2= '(' (otherlv_3= 'OverwriteOdesign' otherlv_4= ':' ( (lv_overwriteVSM_5_0= ruleEBoolean ) ) )? otherlv_6= ')'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:662:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:663:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDiagramGenerationConfigurationAccess().getDiagramGenerationConfigurationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleDiagramGenerationConfiguration1438); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDiagramGenerationConfigurationAccess().getDiagramKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleDiagramGenerationConfiguration1450); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDiagramGenerationConfigurationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:676:1: (otherlv_3= 'OverwriteOdesign' otherlv_4= ':' ( (lv_overwriteVSM_5_0= ruleEBoolean ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:676:3: otherlv_3= 'OverwriteOdesign' otherlv_4= ':' ( (lv_overwriteVSM_5_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleDiagramGenerationConfiguration1463); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteOdesignKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleDiagramGenerationConfiguration1475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDiagramGenerationConfigurationAccess().getColonKeyword_3_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:684:1: ( (lv_overwriteVSM_5_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:685:1: (lv_overwriteVSM_5_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:685:1: (lv_overwriteVSM_5_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:686:3: lv_overwriteVSM_5_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteVSMEBooleanParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleDiagramGenerationConfiguration1496);
                    lv_overwriteVSM_5_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDiagramGenerationConfigurationRule());
                      	        }
                             		set(
                             			current, 
                             			"overwriteVSM",
                              		lv_overwriteVSM_5_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleDiagramGenerationConfiguration1510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getDiagramGenerationConfigurationAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleDiagramGenerationConfiguration"


    // $ANTLR start "entryRuleDocumentationGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:714:1: entryRuleDocumentationGenerationConfiguration returns [EObject current=null] : iv_ruleDocumentationGenerationConfiguration= ruleDocumentationGenerationConfiguration EOF ;
    public final EObject entryRuleDocumentationGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentationGenerationConfiguration = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:715:2: (iv_ruleDocumentationGenerationConfiguration= ruleDocumentationGenerationConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:716:2: iv_ruleDocumentationGenerationConfiguration= ruleDocumentationGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDocumentationGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleDocumentationGenerationConfiguration_in_entryRuleDocumentationGenerationConfiguration1546);
            iv_ruleDocumentationGenerationConfiguration=ruleDocumentationGenerationConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDocumentationGenerationConfiguration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentationGenerationConfiguration1556); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDocumentationGenerationConfiguration"


    // $ANTLR start "ruleDocumentationGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:723:1: ruleDocumentationGenerationConfiguration returns [EObject current=null] : ( () otherlv_1= 'documentation' otherlv_2= '(' (otherlv_3= 'EcoreToHtml:' ( (lv_ecoreToHtml_4_0= ruleEBoolean ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleDocumentationGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_ecoreToHtml_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:726:28: ( ( () otherlv_1= 'documentation' otherlv_2= '(' (otherlv_3= 'EcoreToHtml:' ( (lv_ecoreToHtml_4_0= ruleEBoolean ) ) )? otherlv_5= ')' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:727:1: ( () otherlv_1= 'documentation' otherlv_2= '(' (otherlv_3= 'EcoreToHtml:' ( (lv_ecoreToHtml_4_0= ruleEBoolean ) ) )? otherlv_5= ')' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:727:1: ( () otherlv_1= 'documentation' otherlv_2= '(' (otherlv_3= 'EcoreToHtml:' ( (lv_ecoreToHtml_4_0= ruleEBoolean ) ) )? otherlv_5= ')' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:727:2: () otherlv_1= 'documentation' otherlv_2= '(' (otherlv_3= 'EcoreToHtml:' ( (lv_ecoreToHtml_4_0= ruleEBoolean ) ) )? otherlv_5= ')'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:727:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:728:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDocumentationGenerationConfigurationAccess().getDocumentationGenerationConfigurationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleDocumentationGenerationConfiguration1602); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDocumentationGenerationConfigurationAccess().getDocumentationKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleDocumentationGenerationConfiguration1614); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDocumentationGenerationConfigurationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:741:1: (otherlv_3= 'EcoreToHtml:' ( (lv_ecoreToHtml_4_0= ruleEBoolean ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:741:3: otherlv_3= 'EcoreToHtml:' ( (lv_ecoreToHtml_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleDocumentationGenerationConfiguration1627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDocumentationGenerationConfigurationAccess().getEcoreToHtmlKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:745:1: ( (lv_ecoreToHtml_4_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:746:1: (lv_ecoreToHtml_4_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:746:1: (lv_ecoreToHtml_4_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:747:3: lv_ecoreToHtml_4_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDocumentationGenerationConfigurationAccess().getEcoreToHtmlEBooleanParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleDocumentationGenerationConfiguration1648);
                    lv_ecoreToHtml_4_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDocumentationGenerationConfigurationRule());
                      	        }
                             		set(
                             			current, 
                             			"ecoreToHtml",
                              		lv_ecoreToHtml_4_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleDocumentationGenerationConfiguration1662); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDocumentationGenerationConfigurationAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleDocumentationGenerationConfiguration"


    // $ANTLR start "entryRuleModelsAirdGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:775:1: entryRuleModelsAirdGenerationConfiguration returns [EObject current=null] : iv_ruleModelsAirdGenerationConfiguration= ruleModelsAirdGenerationConfiguration EOF ;
    public final EObject entryRuleModelsAirdGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelsAirdGenerationConfiguration = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:776:2: (iv_ruleModelsAirdGenerationConfiguration= ruleModelsAirdGenerationConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:777:2: iv_ruleModelsAirdGenerationConfiguration= ruleModelsAirdGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelsAirdGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleModelsAirdGenerationConfiguration_in_entryRuleModelsAirdGenerationConfiguration1698);
            iv_ruleModelsAirdGenerationConfiguration=ruleModelsAirdGenerationConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelsAirdGenerationConfiguration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelsAirdGenerationConfiguration1708); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModelsAirdGenerationConfiguration"


    // $ANTLR start "ruleModelsAirdGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:784:1: ruleModelsAirdGenerationConfiguration returns [EObject current=null] : ( () otherlv_1= 'ecore' otherlv_2= '(' (otherlv_3= 'aird' otherlv_4= ':' ( (lv_genRepresentations_5_0= ruleEBoolean ) ) )? otherlv_6= ')' ) ;
    public final EObject ruleModelsAirdGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_genRepresentations_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:787:28: ( ( () otherlv_1= 'ecore' otherlv_2= '(' (otherlv_3= 'aird' otherlv_4= ':' ( (lv_genRepresentations_5_0= ruleEBoolean ) ) )? otherlv_6= ')' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:788:1: ( () otherlv_1= 'ecore' otherlv_2= '(' (otherlv_3= 'aird' otherlv_4= ':' ( (lv_genRepresentations_5_0= ruleEBoolean ) ) )? otherlv_6= ')' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:788:1: ( () otherlv_1= 'ecore' otherlv_2= '(' (otherlv_3= 'aird' otherlv_4= ':' ( (lv_genRepresentations_5_0= ruleEBoolean ) ) )? otherlv_6= ')' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:788:2: () otherlv_1= 'ecore' otherlv_2= '(' (otherlv_3= 'aird' otherlv_4= ':' ( (lv_genRepresentations_5_0= ruleEBoolean ) ) )? otherlv_6= ')'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:788:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:789:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getModelsAirdGenerationConfigurationAccess().getAirdGenerationConfigurationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleModelsAirdGenerationConfiguration1754); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getModelsAirdGenerationConfigurationAccess().getEcoreKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleModelsAirdGenerationConfiguration1766); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getModelsAirdGenerationConfigurationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:802:1: (otherlv_3= 'aird' otherlv_4= ':' ( (lv_genRepresentations_5_0= ruleEBoolean ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:802:3: otherlv_3= 'aird' otherlv_4= ':' ( (lv_genRepresentations_5_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleModelsAirdGenerationConfiguration1779); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getModelsAirdGenerationConfigurationAccess().getAirdKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleModelsAirdGenerationConfiguration1791); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getModelsAirdGenerationConfigurationAccess().getColonKeyword_3_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:810:1: ( (lv_genRepresentations_5_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:811:1: (lv_genRepresentations_5_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:811:1: (lv_genRepresentations_5_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:812:3: lv_genRepresentations_5_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelsAirdGenerationConfigurationAccess().getGenRepresentationsEBooleanParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleModelsAirdGenerationConfiguration1812);
                    lv_genRepresentations_5_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModelsAirdGenerationConfigurationRule());
                      	        }
                             		set(
                             			current, 
                             			"genRepresentations",
                              		lv_genRepresentations_5_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleModelsAirdGenerationConfiguration1826); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getModelsAirdGenerationConfigurationAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleModelsAirdGenerationConfiguration"


    // $ANTLR start "entryRuleRelease"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:840:1: entryRuleRelease returns [EObject current=null] : iv_ruleRelease= ruleRelease EOF ;
    public final EObject entryRuleRelease() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelease = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:841:2: (iv_ruleRelease= ruleRelease EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:842:2: iv_ruleRelease= ruleRelease EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReleaseRule()); 
            }
            pushFollow(FOLLOW_ruleRelease_in_entryRuleRelease1862);
            iv_ruleRelease=ruleRelease();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelease; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelease1872); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelease"


    // $ANTLR start "ruleRelease"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:849:1: ruleRelease returns [EObject current=null] : ( () otherlv_1= 'release' otherlv_2= '{' (otherlv_3= 'version' otherlv_4= ':' ( (lv_viewpointVersion_5_0= ruleVersion ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_viewpointDescription_8_0= ruleEString ) ) )? (otherlv_9= 'execution' otherlv_10= 'environments' otherlv_11= ':' ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* ) )? otherlv_15= '}' ) ;
    public final EObject ruleRelease() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_requiredExecutionEnvironment_12_0=null;
        Token otherlv_13=null;
        Token lv_requiredExecutionEnvironment_14_0=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_viewpointVersion_5_0 = null;

        AntlrDatatypeRuleToken lv_viewpointDescription_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:852:28: ( ( () otherlv_1= 'release' otherlv_2= '{' (otherlv_3= 'version' otherlv_4= ':' ( (lv_viewpointVersion_5_0= ruleVersion ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_viewpointDescription_8_0= ruleEString ) ) )? (otherlv_9= 'execution' otherlv_10= 'environments' otherlv_11= ':' ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* ) )? otherlv_15= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:853:1: ( () otherlv_1= 'release' otherlv_2= '{' (otherlv_3= 'version' otherlv_4= ':' ( (lv_viewpointVersion_5_0= ruleVersion ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_viewpointDescription_8_0= ruleEString ) ) )? (otherlv_9= 'execution' otherlv_10= 'environments' otherlv_11= ':' ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* ) )? otherlv_15= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:853:1: ( () otherlv_1= 'release' otherlv_2= '{' (otherlv_3= 'version' otherlv_4= ':' ( (lv_viewpointVersion_5_0= ruleVersion ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_viewpointDescription_8_0= ruleEString ) ) )? (otherlv_9= 'execution' otherlv_10= 'environments' otherlv_11= ':' ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* ) )? otherlv_15= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:853:2: () otherlv_1= 'release' otherlv_2= '{' (otherlv_3= 'version' otherlv_4= ':' ( (lv_viewpointVersion_5_0= ruleVersion ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_viewpointDescription_8_0= ruleEString ) ) )? (otherlv_9= 'execution' otherlv_10= 'environments' otherlv_11= ':' ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* ) )? otherlv_15= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:853:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:854:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReleaseAccess().getReleaseAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleRelease1918); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReleaseAccess().getReleaseKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRelease1930); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getReleaseAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:867:1: (otherlv_3= 'version' otherlv_4= ':' ( (lv_viewpointVersion_5_0= ruleVersion ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:867:3: otherlv_3= 'version' otherlv_4= ':' ( (lv_viewpointVersion_5_0= ruleVersion ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleRelease1943); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getReleaseAccess().getVersionKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleRelease1955); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getReleaseAccess().getColonKeyword_3_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:875:1: ( (lv_viewpointVersion_5_0= ruleVersion ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:876:1: (lv_viewpointVersion_5_0= ruleVersion )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:876:1: (lv_viewpointVersion_5_0= ruleVersion )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:877:3: lv_viewpointVersion_5_0= ruleVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReleaseAccess().getViewpointVersionVersionParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVersion_in_ruleRelease1976);
                    lv_viewpointVersion_5_0=ruleVersion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReleaseRule());
                      	        }
                             		set(
                             			current, 
                             			"viewpointVersion",
                              		lv_viewpointVersion_5_0, 
                              		"Version");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:893:4: (otherlv_6= 'description' otherlv_7= ':' ( (lv_viewpointDescription_8_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:893:6: otherlv_6= 'description' otherlv_7= ':' ( (lv_viewpointDescription_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleRelease1991); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getReleaseAccess().getDescriptionKeyword_4_0());
                          
                    }
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleRelease2003); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getReleaseAccess().getColonKeyword_4_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:901:1: ( (lv_viewpointDescription_8_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:902:1: (lv_viewpointDescription_8_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:902:1: (lv_viewpointDescription_8_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:903:3: lv_viewpointDescription_8_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReleaseAccess().getViewpointDescriptionEStringParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleRelease2024);
                    lv_viewpointDescription_8_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReleaseRule());
                      	        }
                             		set(
                             			current, 
                             			"viewpointDescription",
                              		lv_viewpointDescription_8_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:919:4: (otherlv_9= 'execution' otherlv_10= 'environments' otherlv_11= ':' ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:919:6: otherlv_9= 'execution' otherlv_10= 'environments' otherlv_11= ':' ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* )
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleRelease2039); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getReleaseAccess().getExecutionKeyword_5_0());
                          
                    }
                    otherlv_10=(Token)match(input,38,FOLLOW_38_in_ruleRelease2051); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getReleaseAccess().getEnvironmentsKeyword_5_1());
                          
                    }
                    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleRelease2063); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getReleaseAccess().getColonKeyword_5_2());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:931:1: ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:931:2: ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )*
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:931:2: ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:932:1: (lv_requiredExecutionEnvironment_12_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:932:1: (lv_requiredExecutionEnvironment_12_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:933:3: lv_requiredExecutionEnvironment_12_0= RULE_STRING
                    {
                    lv_requiredExecutionEnvironment_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRelease2081); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_requiredExecutionEnvironment_12_0, grammarAccess.getReleaseAccess().getRequiredExecutionEnvironmentSTRINGTerminalRuleCall_5_3_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReleaseRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"requiredExecutionEnvironment",
                              		lv_requiredExecutionEnvironment_12_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:949:2: (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==39) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:949:4: otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) )
                    	    {
                    	    otherlv_13=(Token)match(input,39,FOLLOW_39_in_ruleRelease2099); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_13, grammarAccess.getReleaseAccess().getCommaKeyword_5_3_1_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:953:1: ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:954:1: (lv_requiredExecutionEnvironment_14_0= RULE_STRING )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:954:1: (lv_requiredExecutionEnvironment_14_0= RULE_STRING )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:955:3: lv_requiredExecutionEnvironment_14_0= RULE_STRING
                    	    {
                    	    lv_requiredExecutionEnvironment_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRelease2116); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_requiredExecutionEnvironment_14_0, grammarAccess.getReleaseAccess().getRequiredExecutionEnvironmentSTRINGTerminalRuleCall_5_3_1_1_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getReleaseRule());
                    	      	        }
                    	             		addWithLastConsumed(
                    	             			current, 
                    	             			"requiredExecutionEnvironment",
                    	              		lv_requiredExecutionEnvironment_14_0, 
                    	              		"STRING");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleRelease2138); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getReleaseAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleRelease"


    // $ANTLR start "entryRuleVersion"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:983:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:984:2: (iv_ruleVersion= ruleVersion EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:985:2: iv_ruleVersion= ruleVersion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionRule()); 
            }
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion2175);
            iv_ruleVersion=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersion.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion2186); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:992:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? ) )? ) ;
    public final AntlrDatatypeRuleToken ruleVersion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        AntlrDatatypeRuleToken this_Qualifier_6 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:995:28: ( (this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? ) )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:996:1: (this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? ) )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:996:1: (this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? ) )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:996:6: this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? ) )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVersion2226); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0()); 
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1003:1: (kw= '.' (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1004:2: kw= '.' (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? )
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleVersion2245); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1009:1: (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1009:6: this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )?
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVersion2261); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_2, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1016:1: (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==40) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1017:2: kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )?
                            {
                            kw=(Token)match(input,40,FOLLOW_40_in_ruleVersion2280); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_1_1_0()); 
                                  
                            }
                            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVersion2295); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_4);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_1()); 
                                  
                            }
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1029:1: (kw= '.' this_Qualifier_6= ruleQualifier )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( (LA20_0==40) ) {
                                alt20=1;
                            }
                            switch (alt20) {
                                case 1 :
                                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1030:2: kw= '.' this_Qualifier_6= ruleQualifier
                                    {
                                    kw=(Token)match(input,40,FOLLOW_40_in_ruleVersion2314); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              current.merge(kw);
                                              newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_1_1_2_0()); 
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getVersionAccess().getQualifierParserRuleCall_1_1_1_2_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleQualifier_in_ruleVersion2336);
                                    this_Qualifier_6=ruleQualifier();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_Qualifier_6);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              afterParserOrEnumRuleCall();
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleQualifier"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1054:1: entryRuleQualifier returns [String current=null] : iv_ruleQualifier= ruleQualifier EOF ;
    public final String entryRuleQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifier = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1055:2: (iv_ruleQualifier= ruleQualifier EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1056:2: iv_ruleQualifier= ruleQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleQualifier_in_entryRuleQualifier2389);
            iv_ruleQualifier=ruleQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifier2400); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifier"


    // $ANTLR start "ruleQualifier"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1063:1: ruleQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= '_' ) (this_INT_3= RULE_INT | this_ID_4= RULE_ID | kw= '_' | kw= '-' )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;
        Token kw=null;
        Token this_INT_3=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1066:28: ( ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= '_' ) (this_INT_3= RULE_INT | this_ID_4= RULE_ID | kw= '_' | kw= '-' )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1067:1: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= '_' ) (this_INT_3= RULE_INT | this_ID_4= RULE_ID | kw= '_' | kw= '-' )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1067:1: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= '_' ) (this_INT_3= RULE_INT | this_ID_4= RULE_ID | kw= '_' | kw= '-' )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1067:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= '_' ) (this_INT_3= RULE_INT | this_ID_4= RULE_ID | kw= '_' | kw= '-' )*
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1067:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= '_' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt23=1;
                }
                break;
            case RULE_ID:
                {
                alt23=2;
                }
                break;
            case 41:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1067:7: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQualifier2441); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getQualifierAccess().getINTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1075:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifier2467); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getQualifierAccess().getIDTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1084:2: kw= '_'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleQualifier2491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifierAccess().get_Keyword_0_2()); 
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1089:2: (this_INT_3= RULE_INT | this_ID_4= RULE_ID | kw= '_' | kw= '-' )*
            loop24:
            do {
                int alt24=5;
                switch ( input.LA(1) ) {
                case RULE_INT:
                    {
                    alt24=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt24=2;
                    }
                    break;
                case 41:
                    {
                    alt24=3;
                    }
                    break;
                case 42:
                    {
                    alt24=4;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1089:7: this_INT_3= RULE_INT
            	    {
            	    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQualifier2508); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_INT_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_INT_3, grammarAccess.getQualifierAccess().getINTTerminalRuleCall_1_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1097:10: this_ID_4= RULE_ID
            	    {
            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifier2534); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_4, grammarAccess.getQualifierAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1106:2: kw= '_'
            	    {
            	    kw=(Token)match(input,41,FOLLOW_41_in_ruleQualifier2558); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifierAccess().get_Keyword_1_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1113:2: kw= '-'
            	    {
            	    kw=(Token)match(input,42,FOLLOW_42_in_ruleQualifier2577); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifierAccess().getHyphenMinusKeyword_1_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "ruleQualifier"


    // $ANTLR start "entryRuleEString"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1126:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1127:2: (iv_ruleEString= ruleEString EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1128:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString2620);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString2631); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1135:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1138:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1139:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1139:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1139:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString2671); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1147:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString2697); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                          
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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFQN"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1162:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1163:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1164:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN2743);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN2754); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1171:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1174:28: ( (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1175:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1175:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1175:6: this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN2794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1182:1: (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==40) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1183:2: kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    {
            	    kw=(Token)match(input,40,FOLLOW_40_in_ruleFQN2813); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1188:1: ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1188:2: ( RULE_ID )=>this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN2834); if (state.failed) return current;
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
            	    break loop26;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1203:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1204:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1205:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_entryRuleEBoolean2883);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBoolean2894); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1212:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1215:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1216:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1216:1: (kw= 'true' | kw= 'false' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==43) ) {
                alt27=1;
            }
            else if ( (LA27_0==44) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1217:2: kw= 'true'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleEBoolean2932); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1224:2: kw= 'false'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleEBoolean2951); if (state.failed) return current;
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleConfiguration_in_entryRuleConfiguration75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfiguration85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleConfiguration131 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleConfiguration152 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConfiguration164 = new BitSet(new long[]{0x000000040002E000L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_ruleConfiguration185 = new BitSet(new long[]{0x000000040002E000L});
    public static final BitSet FOLLOW_13_in_ruleConfiguration198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationElement244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetApplication_in_ruleConfigurationElement291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationConfiguration_in_ruleConfigurationElement318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneration_in_ruleConfigurationElement345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelease_in_ruleConfigurationElement372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetApplication_in_entryRuleTargetApplication407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetApplication417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleTargetApplication463 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTargetApplication484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationConfiguration_in_entryRuleGenerationConfiguration520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerationConfiguration530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGenerationConfiguration576 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleGenerationConfiguration597 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleGenerationConfiguration610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGenerationConfiguration627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneration_in_entryRuleGeneration670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneration680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleGeneration726 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGeneration738 = new BitSet(new long[]{0x0000000150042000L});
    public static final BitSet FOLLOW_ruleGData_in_ruleGeneration759 = new BitSet(new long[]{0x0000000150002000L});
    public static final BitSet FOLLOW_ruleExtensionGeneratrionConfiguration_in_ruleGeneration781 = new BitSet(new long[]{0x0000000150002000L});
    public static final BitSet FOLLOW_13_in_ruleGeneration794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGData_in_entryRuleGData830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGData840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleGData886 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGData898 = new BitSet(new long[]{0x000000000FD00000L});
    public static final BitSet FOLLOW_20_in_ruleGData912 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleGData924 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleGData945 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_22_in_ruleGData960 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleGData972 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleGData993 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_23_in_ruleGData1008 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleGData1020 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleGData1041 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_24_in_ruleGData1056 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleGData1068 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleGData1089 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_25_in_ruleGData1104 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleGData1116 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleGData1137 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleGData1152 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleGData1164 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleGData1185 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleGData1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionGeneratrionConfiguration_in_entryRuleExtensionGeneratrionConfiguration1236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensionGeneratrionConfiguration1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramGenerationConfiguration_in_ruleExtensionGeneratrionConfiguration1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentationGenerationConfiguration_in_ruleExtensionGeneratrionConfiguration1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelsAirdGenerationConfiguration_in_ruleExtensionGeneratrionConfiguration1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramGenerationConfiguration_in_entryRuleDiagramGenerationConfiguration1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramGenerationConfiguration1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDiagramGenerationConfiguration1438 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDiagramGenerationConfiguration1450 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_ruleDiagramGenerationConfiguration1463 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDiagramGenerationConfiguration1475 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleDiagramGenerationConfiguration1496 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDiagramGenerationConfiguration1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentationGenerationConfiguration_in_entryRuleDocumentationGenerationConfiguration1546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentationGenerationConfiguration1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDocumentationGenerationConfiguration1602 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDocumentationGenerationConfiguration1614 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_31_in_ruleDocumentationGenerationConfiguration1627 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleDocumentationGenerationConfiguration1648 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDocumentationGenerationConfiguration1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelsAirdGenerationConfiguration_in_entryRuleModelsAirdGenerationConfiguration1698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelsAirdGenerationConfiguration1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleModelsAirdGenerationConfiguration1754 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleModelsAirdGenerationConfiguration1766 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_33_in_ruleModelsAirdGenerationConfiguration1779 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleModelsAirdGenerationConfiguration1791 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleModelsAirdGenerationConfiguration1812 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleModelsAirdGenerationConfiguration1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelease_in_entryRuleRelease1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelease1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleRelease1918 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRelease1930 = new BitSet(new long[]{0x0000003800002000L});
    public static final BitSet FOLLOW_35_in_ruleRelease1943 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRelease1955 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleRelease1976 = new BitSet(new long[]{0x0000003000002000L});
    public static final BitSet FOLLOW_36_in_ruleRelease1991 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRelease2003 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleRelease2024 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_37_in_ruleRelease2039 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleRelease2051 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRelease2063 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRelease2081 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_39_in_ruleRelease2099 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRelease2116 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_13_in_ruleRelease2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion2175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVersion2226 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleVersion2245 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVersion2261 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleVersion2280 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVersion2295 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleVersion2314 = new BitSet(new long[]{0x0000020000000060L});
    public static final BitSet FOLLOW_ruleQualifier_in_ruleVersion2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_entryRuleQualifier2389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifier2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQualifier2441 = new BitSet(new long[]{0x0000060000000062L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifier2467 = new BitSet(new long[]{0x0000060000000062L});
    public static final BitSet FOLLOW_41_in_ruleQualifier2491 = new BitSet(new long[]{0x0000060000000062L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQualifier2508 = new BitSet(new long[]{0x0000060000000062L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifier2534 = new BitSet(new long[]{0x0000060000000062L});
    public static final BitSet FOLLOW_41_in_ruleQualifier2558 = new BitSet(new long[]{0x0000060000000062L});
    public static final BitSet FOLLOW_42_in_ruleQualifier2577 = new BitSet(new long[]{0x0000060000000062L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN2743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN2794 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleFQN2813 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN2834 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean2883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEBoolean2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleEBoolean2951 = new BitSet(new long[]{0x0000000000000002L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Configuration'", "'{'", "'}'", "'target'", "'project'", "'nsuri'", "'generation'", "'data'", "'('", "'Model'", "':'", "'Edit'", "'Editor'", "'Test'", "'Javadoc'", "'OverwriteEcore'", "')'", "'diagram'", "'OverwriteOdesign'", "'documentation'", "'EcoreToHtml:'", "'ecore'", "'aird'", "'release'", "'version'", "'description'", "'execution'", "'environments'", "','", "'representation'", "'visible'", "'.'", "'_'", "'-'", "'true'", "'false'"
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
    public static final int T__46=46;
    public static final int T__44=44;
    public static final int T__45=45;
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

                if ( ((LA1_0>=14 && LA1_0<=15)||LA1_0==17||LA1_0==34||LA1_0==40) ) {
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:158:1: ruleConfigurationElement returns [EObject current=null] : (this_TargetApplication_0= ruleTargetApplication | this_GenerationConfiguration_1= ruleGenerationConfiguration | this_Generation_2= ruleGeneration | this_Release_3= ruleRelease | this_RepresentationConfiguration_4= ruleRepresentationConfiguration ) ;
    public final EObject ruleConfigurationElement() throws RecognitionException {
        EObject current = null;

        EObject this_TargetApplication_0 = null;

        EObject this_GenerationConfiguration_1 = null;

        EObject this_Generation_2 = null;

        EObject this_Release_3 = null;

        EObject this_RepresentationConfiguration_4 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:161:28: ( (this_TargetApplication_0= ruleTargetApplication | this_GenerationConfiguration_1= ruleGenerationConfiguration | this_Generation_2= ruleGeneration | this_Release_3= ruleRelease | this_RepresentationConfiguration_4= ruleRepresentationConfiguration ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:162:1: (this_TargetApplication_0= ruleTargetApplication | this_GenerationConfiguration_1= ruleGenerationConfiguration | this_Generation_2= ruleGeneration | this_Release_3= ruleRelease | this_RepresentationConfiguration_4= ruleRepresentationConfiguration )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:162:1: (this_TargetApplication_0= ruleTargetApplication | this_GenerationConfiguration_1= ruleGenerationConfiguration | this_Generation_2= ruleGeneration | this_Release_3= ruleRelease | this_RepresentationConfiguration_4= ruleRepresentationConfiguration )
            int alt2=5;
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
            case 40:
                {
                alt2=5;
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
                case 5 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:203:5: this_RepresentationConfiguration_4= ruleRepresentationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConfigurationElementAccess().getRepresentationConfigurationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRepresentationConfiguration_in_ruleConfigurationElement399);
                    this_RepresentationConfiguration_4=ruleRepresentationConfiguration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RepresentationConfiguration_4; 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:219:1: entryRuleTargetApplication returns [EObject current=null] : iv_ruleTargetApplication= ruleTargetApplication EOF ;
    public final EObject entryRuleTargetApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetApplication = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:220:2: (iv_ruleTargetApplication= ruleTargetApplication EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:221:2: iv_ruleTargetApplication= ruleTargetApplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTargetApplicationRule()); 
            }
            pushFollow(FOLLOW_ruleTargetApplication_in_entryRuleTargetApplication434);
            iv_ruleTargetApplication=ruleTargetApplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTargetApplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetApplication444); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:228:1: ruleTargetApplication returns [EObject current=null] : ( () otherlv_1= 'target' ( (lv_type_2_0= ruleEString ) ) ) ;
    public final EObject ruleTargetApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:231:28: ( ( () otherlv_1= 'target' ( (lv_type_2_0= ruleEString ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:232:1: ( () otherlv_1= 'target' ( (lv_type_2_0= ruleEString ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:232:1: ( () otherlv_1= 'target' ( (lv_type_2_0= ruleEString ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:232:2: () otherlv_1= 'target' ( (lv_type_2_0= ruleEString ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:232:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:233:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTargetApplicationAccess().getTargetApplicationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleTargetApplication490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTargetApplicationAccess().getTargetKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:242:1: ( (lv_type_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:243:1: (lv_type_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:243:1: (lv_type_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:244:3: lv_type_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTargetApplicationAccess().getTypeEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleTargetApplication511);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:268:1: entryRuleGenerationConfiguration returns [EObject current=null] : iv_ruleGenerationConfiguration= ruleGenerationConfiguration EOF ;
    public final EObject entryRuleGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerationConfiguration = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:269:2: (iv_ruleGenerationConfiguration= ruleGenerationConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:270:2: iv_ruleGenerationConfiguration= ruleGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleGenerationConfiguration_in_entryRuleGenerationConfiguration547);
            iv_ruleGenerationConfiguration=ruleGenerationConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenerationConfiguration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerationConfiguration557); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:277:1: ruleGenerationConfiguration returns [EObject current=null] : ( () otherlv_1= 'project' ( (lv_projectName_2_0= ruleFQN ) ) (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_nsuri_4_0=null;
        AntlrDatatypeRuleToken lv_projectName_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:280:28: ( ( () otherlv_1= 'project' ( (lv_projectName_2_0= ruleFQN ) ) (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:281:1: ( () otherlv_1= 'project' ( (lv_projectName_2_0= ruleFQN ) ) (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:281:1: ( () otherlv_1= 'project' ( (lv_projectName_2_0= ruleFQN ) ) (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:281:2: () otherlv_1= 'project' ( (lv_projectName_2_0= ruleFQN ) ) (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )?
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:281:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:282:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGenerationConfigurationAccess().getGenerationConfigurationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleGenerationConfiguration603); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGenerationConfigurationAccess().getProjectKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:291:1: ( (lv_projectName_2_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:292:1: (lv_projectName_2_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:292:1: (lv_projectName_2_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:293:3: lv_projectName_2_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGenerationConfigurationAccess().getProjectNameFQNParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleGenerationConfiguration624);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:309:2: (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:309:4: otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleGenerationConfiguration637); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getGenerationConfigurationAccess().getNsuriKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:313:1: ( (lv_nsuri_4_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:314:1: (lv_nsuri_4_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:314:1: (lv_nsuri_4_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:315:3: lv_nsuri_4_0= RULE_STRING
                    {
                    lv_nsuri_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGenerationConfiguration654); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:339:1: entryRuleGeneration returns [EObject current=null] : iv_ruleGeneration= ruleGeneration EOF ;
    public final EObject entryRuleGeneration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneration = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:340:2: (iv_ruleGeneration= ruleGeneration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:341:2: iv_ruleGeneration= ruleGeneration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenerationRule()); 
            }
            pushFollow(FOLLOW_ruleGeneration_in_entryRuleGeneration697);
            iv_ruleGeneration=ruleGeneration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGeneration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneration707); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:348:1: ruleGeneration returns [EObject current=null] : ( () otherlv_1= 'generation' otherlv_2= '{' ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )? ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )* otherlv_5= '}' ) ;
    public final EObject ruleGeneration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_ownedDataGenerationConf_3_0 = null;

        EObject lv_ownedExtensionGenConf_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:351:28: ( ( () otherlv_1= 'generation' otherlv_2= '{' ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )? ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )* otherlv_5= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:352:1: ( () otherlv_1= 'generation' otherlv_2= '{' ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )? ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )* otherlv_5= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:352:1: ( () otherlv_1= 'generation' otherlv_2= '{' ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )? ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )* otherlv_5= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:352:2: () otherlv_1= 'generation' otherlv_2= '{' ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )? ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )* otherlv_5= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:352:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:353:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGenerationAccess().getGenerationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleGeneration753); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGenerationAccess().getGenerationKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGeneration765); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGenerationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:366:1: ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:367:1: (lv_ownedDataGenerationConf_3_0= ruleGData )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:367:1: (lv_ownedDataGenerationConf_3_0= ruleGData )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:368:3: lv_ownedDataGenerationConf_3_0= ruleGData
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGenerationAccess().getOwnedDataGenerationConfGDataParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGData_in_ruleGeneration786);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:384:3: ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28||LA5_0==30||LA5_0==32) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:385:1: (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:385:1: (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:386:3: lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGenerationAccess().getOwnedExtensionGenConfExtensionGeneratrionConfigurationParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExtensionGeneratrionConfiguration_in_ruleGeneration808);
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

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleGeneration821); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:414:1: entryRuleGData returns [EObject current=null] : iv_ruleGData= ruleGData EOF ;
    public final EObject entryRuleGData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGData = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:415:2: (iv_ruleGData= ruleGData EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:416:2: iv_ruleGData= ruleGData EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGDataRule()); 
            }
            pushFollow(FOLLOW_ruleGData_in_entryRuleGData857);
            iv_ruleGData=ruleGData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGData; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGData867); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:423:1: ruleGData returns [EObject current=null] : ( () otherlv_1= 'data' otherlv_2= '(' ( (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )? (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )? (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )? (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )? (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )? ) otherlv_21= ')' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:426:28: ( ( () otherlv_1= 'data' otherlv_2= '(' ( (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )? (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )? (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )? (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )? (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )? ) otherlv_21= ')' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:427:1: ( () otherlv_1= 'data' otherlv_2= '(' ( (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )? (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )? (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )? (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )? (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )? ) otherlv_21= ')' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:427:1: ( () otherlv_1= 'data' otherlv_2= '(' ( (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )? (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )? (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )? (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )? (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )? ) otherlv_21= ')' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:427:2: () otherlv_1= 'data' otherlv_2= '(' ( (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )? (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )? (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )? (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )? (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )? ) otherlv_21= ')'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:427:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:428:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGDataAccess().getGDataAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleGData913); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGDataAccess().getDataKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleGData925); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGDataAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:441:1: ( (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )? (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )? (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )? (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )? (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:441:2: (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )? (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )? (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )? (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )? (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )?
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:441:2: (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:441:4: otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleGData939); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getGDataAccess().getModelKeyword_3_0_0());
                          
                    }
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleGData951); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getGDataAccess().getColonKeyword_3_0_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:449:1: ( (lv_model_5_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:450:1: (lv_model_5_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:450:1: (lv_model_5_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:451:3: lv_model_5_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getModelEBooleanParserRuleCall_3_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleGData972);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:467:4: (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:467:6: otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleGData987); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getGDataAccess().getEditKeyword_3_1_0());
                          
                    }
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleGData999); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getGDataAccess().getColonKeyword_3_1_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:475:1: ( (lv_edit_8_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:476:1: (lv_edit_8_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:476:1: (lv_edit_8_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:477:3: lv_edit_8_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getEditEBooleanParserRuleCall_3_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleGData1020);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:493:4: (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:493:6: otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleGData1035); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getGDataAccess().getEditorKeyword_3_2_0());
                          
                    }
                    otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleGData1047); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getGDataAccess().getColonKeyword_3_2_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:501:1: ( (lv_editor_11_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:502:1: (lv_editor_11_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:502:1: (lv_editor_11_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:503:3: lv_editor_11_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getEditorEBooleanParserRuleCall_3_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleGData1068);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:519:4: (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:519:6: otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) )
                    {
                    otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleGData1083); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getGDataAccess().getTestKeyword_3_3_0());
                          
                    }
                    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleGData1095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getGDataAccess().getColonKeyword_3_3_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:527:1: ( (lv_test_14_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:528:1: (lv_test_14_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:528:1: (lv_test_14_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:529:3: lv_test_14_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getTestEBooleanParserRuleCall_3_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleGData1116);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:545:4: (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:545:6: otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) )
                    {
                    otherlv_15=(Token)match(input,25,FOLLOW_25_in_ruleGData1131); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getGDataAccess().getJavadocKeyword_3_4_0());
                          
                    }
                    otherlv_16=(Token)match(input,21,FOLLOW_21_in_ruleGData1143); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getGDataAccess().getColonKeyword_3_4_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:553:1: ( (lv_javaDoc_17_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:554:1: (lv_javaDoc_17_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:554:1: (lv_javaDoc_17_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:555:3: lv_javaDoc_17_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getJavaDocEBooleanParserRuleCall_3_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleGData1164);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:571:4: (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:571:6: otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) )
                    {
                    otherlv_18=(Token)match(input,26,FOLLOW_26_in_ruleGData1179); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getGDataAccess().getOverwriteEcoreKeyword_3_5_0());
                          
                    }
                    otherlv_19=(Token)match(input,21,FOLLOW_21_in_ruleGData1191); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getGDataAccess().getColonKeyword_3_5_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:579:1: ( (lv_overwriteEcore_20_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:580:1: (lv_overwriteEcore_20_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:580:1: (lv_overwriteEcore_20_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:581:3: lv_overwriteEcore_20_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getOverwriteEcoreEBooleanParserRuleCall_3_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleGData1212);
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

            otherlv_21=(Token)match(input,27,FOLLOW_27_in_ruleGData1227); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:609:1: entryRuleExtensionGeneratrionConfiguration returns [EObject current=null] : iv_ruleExtensionGeneratrionConfiguration= ruleExtensionGeneratrionConfiguration EOF ;
    public final EObject entryRuleExtensionGeneratrionConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionGeneratrionConfiguration = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:610:2: (iv_ruleExtensionGeneratrionConfiguration= ruleExtensionGeneratrionConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:611:2: iv_ruleExtensionGeneratrionConfiguration= ruleExtensionGeneratrionConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtensionGeneratrionConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleExtensionGeneratrionConfiguration_in_entryRuleExtensionGeneratrionConfiguration1263);
            iv_ruleExtensionGeneratrionConfiguration=ruleExtensionGeneratrionConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtensionGeneratrionConfiguration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensionGeneratrionConfiguration1273); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:618:1: ruleExtensionGeneratrionConfiguration returns [EObject current=null] : (this_DiagramGenerationConfiguration_0= ruleDiagramGenerationConfiguration | this_DocumentationGenerationConfiguration_1= ruleDocumentationGenerationConfiguration | this_ModelsAirdGenerationConfiguration_2= ruleModelsAirdGenerationConfiguration ) ;
    public final EObject ruleExtensionGeneratrionConfiguration() throws RecognitionException {
        EObject current = null;

        EObject this_DiagramGenerationConfiguration_0 = null;

        EObject this_DocumentationGenerationConfiguration_1 = null;

        EObject this_ModelsAirdGenerationConfiguration_2 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:621:28: ( (this_DiagramGenerationConfiguration_0= ruleDiagramGenerationConfiguration | this_DocumentationGenerationConfiguration_1= ruleDocumentationGenerationConfiguration | this_ModelsAirdGenerationConfiguration_2= ruleModelsAirdGenerationConfiguration ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:622:1: (this_DiagramGenerationConfiguration_0= ruleDiagramGenerationConfiguration | this_DocumentationGenerationConfiguration_1= ruleDocumentationGenerationConfiguration | this_ModelsAirdGenerationConfiguration_2= ruleModelsAirdGenerationConfiguration )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:622:1: (this_DiagramGenerationConfiguration_0= ruleDiagramGenerationConfiguration | this_DocumentationGenerationConfiguration_1= ruleDocumentationGenerationConfiguration | this_ModelsAirdGenerationConfiguration_2= ruleModelsAirdGenerationConfiguration )
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:623:5: this_DiagramGenerationConfiguration_0= ruleDiagramGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExtensionGeneratrionConfigurationAccess().getDiagramGenerationConfigurationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDiagramGenerationConfiguration_in_ruleExtensionGeneratrionConfiguration1320);
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:633:5: this_DocumentationGenerationConfiguration_1= ruleDocumentationGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExtensionGeneratrionConfigurationAccess().getDocumentationGenerationConfigurationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDocumentationGenerationConfiguration_in_ruleExtensionGeneratrionConfiguration1347);
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:643:5: this_ModelsAirdGenerationConfiguration_2= ruleModelsAirdGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExtensionGeneratrionConfigurationAccess().getModelsAirdGenerationConfigurationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleModelsAirdGenerationConfiguration_in_ruleExtensionGeneratrionConfiguration1374);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:659:1: entryRuleDiagramGenerationConfiguration returns [EObject current=null] : iv_ruleDiagramGenerationConfiguration= ruleDiagramGenerationConfiguration EOF ;
    public final EObject entryRuleDiagramGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramGenerationConfiguration = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:660:2: (iv_ruleDiagramGenerationConfiguration= ruleDiagramGenerationConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:661:2: iv_ruleDiagramGenerationConfiguration= ruleDiagramGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDiagramGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleDiagramGenerationConfiguration_in_entryRuleDiagramGenerationConfiguration1409);
            iv_ruleDiagramGenerationConfiguration=ruleDiagramGenerationConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDiagramGenerationConfiguration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagramGenerationConfiguration1419); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:668:1: ruleDiagramGenerationConfiguration returns [EObject current=null] : ( () otherlv_1= 'diagram' otherlv_2= '(' (otherlv_3= 'OverwriteOdesign' otherlv_4= ':' ( (lv_overwriteVSM_5_0= ruleEBoolean ) ) )? otherlv_6= ')' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:671:28: ( ( () otherlv_1= 'diagram' otherlv_2= '(' (otherlv_3= 'OverwriteOdesign' otherlv_4= ':' ( (lv_overwriteVSM_5_0= ruleEBoolean ) ) )? otherlv_6= ')' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:672:1: ( () otherlv_1= 'diagram' otherlv_2= '(' (otherlv_3= 'OverwriteOdesign' otherlv_4= ':' ( (lv_overwriteVSM_5_0= ruleEBoolean ) ) )? otherlv_6= ')' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:672:1: ( () otherlv_1= 'diagram' otherlv_2= '(' (otherlv_3= 'OverwriteOdesign' otherlv_4= ':' ( (lv_overwriteVSM_5_0= ruleEBoolean ) ) )? otherlv_6= ')' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:672:2: () otherlv_1= 'diagram' otherlv_2= '(' (otherlv_3= 'OverwriteOdesign' otherlv_4= ':' ( (lv_overwriteVSM_5_0= ruleEBoolean ) ) )? otherlv_6= ')'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:672:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:673:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDiagramGenerationConfigurationAccess().getDiagramGenerationConfigurationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleDiagramGenerationConfiguration1465); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDiagramGenerationConfigurationAccess().getDiagramKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleDiagramGenerationConfiguration1477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDiagramGenerationConfigurationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:686:1: (otherlv_3= 'OverwriteOdesign' otherlv_4= ':' ( (lv_overwriteVSM_5_0= ruleEBoolean ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:686:3: otherlv_3= 'OverwriteOdesign' otherlv_4= ':' ( (lv_overwriteVSM_5_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleDiagramGenerationConfiguration1490); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteOdesignKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleDiagramGenerationConfiguration1502); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDiagramGenerationConfigurationAccess().getColonKeyword_3_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:694:1: ( (lv_overwriteVSM_5_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:695:1: (lv_overwriteVSM_5_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:695:1: (lv_overwriteVSM_5_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:696:3: lv_overwriteVSM_5_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteVSMEBooleanParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleDiagramGenerationConfiguration1523);
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

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleDiagramGenerationConfiguration1537); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:724:1: entryRuleDocumentationGenerationConfiguration returns [EObject current=null] : iv_ruleDocumentationGenerationConfiguration= ruleDocumentationGenerationConfiguration EOF ;
    public final EObject entryRuleDocumentationGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentationGenerationConfiguration = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:725:2: (iv_ruleDocumentationGenerationConfiguration= ruleDocumentationGenerationConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:726:2: iv_ruleDocumentationGenerationConfiguration= ruleDocumentationGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDocumentationGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleDocumentationGenerationConfiguration_in_entryRuleDocumentationGenerationConfiguration1573);
            iv_ruleDocumentationGenerationConfiguration=ruleDocumentationGenerationConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDocumentationGenerationConfiguration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentationGenerationConfiguration1583); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:733:1: ruleDocumentationGenerationConfiguration returns [EObject current=null] : ( () otherlv_1= 'documentation' otherlv_2= '(' (otherlv_3= 'EcoreToHtml:' ( (lv_ecoreToHtml_4_0= ruleEBoolean ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleDocumentationGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_ecoreToHtml_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:736:28: ( ( () otherlv_1= 'documentation' otherlv_2= '(' (otherlv_3= 'EcoreToHtml:' ( (lv_ecoreToHtml_4_0= ruleEBoolean ) ) )? otherlv_5= ')' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:737:1: ( () otherlv_1= 'documentation' otherlv_2= '(' (otherlv_3= 'EcoreToHtml:' ( (lv_ecoreToHtml_4_0= ruleEBoolean ) ) )? otherlv_5= ')' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:737:1: ( () otherlv_1= 'documentation' otherlv_2= '(' (otherlv_3= 'EcoreToHtml:' ( (lv_ecoreToHtml_4_0= ruleEBoolean ) ) )? otherlv_5= ')' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:737:2: () otherlv_1= 'documentation' otherlv_2= '(' (otherlv_3= 'EcoreToHtml:' ( (lv_ecoreToHtml_4_0= ruleEBoolean ) ) )? otherlv_5= ')'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:737:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:738:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDocumentationGenerationConfigurationAccess().getDocumentationGenerationConfigurationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleDocumentationGenerationConfiguration1629); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDocumentationGenerationConfigurationAccess().getDocumentationKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleDocumentationGenerationConfiguration1641); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDocumentationGenerationConfigurationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:751:1: (otherlv_3= 'EcoreToHtml:' ( (lv_ecoreToHtml_4_0= ruleEBoolean ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:751:3: otherlv_3= 'EcoreToHtml:' ( (lv_ecoreToHtml_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleDocumentationGenerationConfiguration1654); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDocumentationGenerationConfigurationAccess().getEcoreToHtmlKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:755:1: ( (lv_ecoreToHtml_4_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:756:1: (lv_ecoreToHtml_4_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:756:1: (lv_ecoreToHtml_4_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:757:3: lv_ecoreToHtml_4_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDocumentationGenerationConfigurationAccess().getEcoreToHtmlEBooleanParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleDocumentationGenerationConfiguration1675);
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

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleDocumentationGenerationConfiguration1689); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:785:1: entryRuleModelsAirdGenerationConfiguration returns [EObject current=null] : iv_ruleModelsAirdGenerationConfiguration= ruleModelsAirdGenerationConfiguration EOF ;
    public final EObject entryRuleModelsAirdGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelsAirdGenerationConfiguration = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:786:2: (iv_ruleModelsAirdGenerationConfiguration= ruleModelsAirdGenerationConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:787:2: iv_ruleModelsAirdGenerationConfiguration= ruleModelsAirdGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelsAirdGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleModelsAirdGenerationConfiguration_in_entryRuleModelsAirdGenerationConfiguration1725);
            iv_ruleModelsAirdGenerationConfiguration=ruleModelsAirdGenerationConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelsAirdGenerationConfiguration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelsAirdGenerationConfiguration1735); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:794:1: ruleModelsAirdGenerationConfiguration returns [EObject current=null] : ( () otherlv_1= 'ecore' otherlv_2= '(' (otherlv_3= 'aird' otherlv_4= ':' ( (lv_genRepresentations_5_0= ruleEBoolean ) ) )? otherlv_6= ')' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:797:28: ( ( () otherlv_1= 'ecore' otherlv_2= '(' (otherlv_3= 'aird' otherlv_4= ':' ( (lv_genRepresentations_5_0= ruleEBoolean ) ) )? otherlv_6= ')' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:798:1: ( () otherlv_1= 'ecore' otherlv_2= '(' (otherlv_3= 'aird' otherlv_4= ':' ( (lv_genRepresentations_5_0= ruleEBoolean ) ) )? otherlv_6= ')' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:798:1: ( () otherlv_1= 'ecore' otherlv_2= '(' (otherlv_3= 'aird' otherlv_4= ':' ( (lv_genRepresentations_5_0= ruleEBoolean ) ) )? otherlv_6= ')' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:798:2: () otherlv_1= 'ecore' otherlv_2= '(' (otherlv_3= 'aird' otherlv_4= ':' ( (lv_genRepresentations_5_0= ruleEBoolean ) ) )? otherlv_6= ')'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:798:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:799:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getModelsAirdGenerationConfigurationAccess().getAirdGenerationConfigurationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleModelsAirdGenerationConfiguration1781); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getModelsAirdGenerationConfigurationAccess().getEcoreKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleModelsAirdGenerationConfiguration1793); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getModelsAirdGenerationConfigurationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:812:1: (otherlv_3= 'aird' otherlv_4= ':' ( (lv_genRepresentations_5_0= ruleEBoolean ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:812:3: otherlv_3= 'aird' otherlv_4= ':' ( (lv_genRepresentations_5_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleModelsAirdGenerationConfiguration1806); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getModelsAirdGenerationConfigurationAccess().getAirdKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleModelsAirdGenerationConfiguration1818); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getModelsAirdGenerationConfigurationAccess().getColonKeyword_3_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:820:1: ( (lv_genRepresentations_5_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:821:1: (lv_genRepresentations_5_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:821:1: (lv_genRepresentations_5_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:822:3: lv_genRepresentations_5_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelsAirdGenerationConfigurationAccess().getGenRepresentationsEBooleanParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleModelsAirdGenerationConfiguration1839);
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

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleModelsAirdGenerationConfiguration1853); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:850:1: entryRuleRelease returns [EObject current=null] : iv_ruleRelease= ruleRelease EOF ;
    public final EObject entryRuleRelease() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelease = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:851:2: (iv_ruleRelease= ruleRelease EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:852:2: iv_ruleRelease= ruleRelease EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReleaseRule()); 
            }
            pushFollow(FOLLOW_ruleRelease_in_entryRuleRelease1889);
            iv_ruleRelease=ruleRelease();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelease; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelease1899); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:859:1: ruleRelease returns [EObject current=null] : ( () otherlv_1= 'release' otherlv_2= '{' (otherlv_3= 'version' otherlv_4= ':' ( (lv_viewpointVersion_5_0= ruleVersion ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_viewpointDescription_8_0= ruleEString ) ) )? (otherlv_9= 'execution' otherlv_10= 'environments' otherlv_11= ':' ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* ) )? otherlv_15= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:862:28: ( ( () otherlv_1= 'release' otherlv_2= '{' (otherlv_3= 'version' otherlv_4= ':' ( (lv_viewpointVersion_5_0= ruleVersion ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_viewpointDescription_8_0= ruleEString ) ) )? (otherlv_9= 'execution' otherlv_10= 'environments' otherlv_11= ':' ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* ) )? otherlv_15= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:863:1: ( () otherlv_1= 'release' otherlv_2= '{' (otherlv_3= 'version' otherlv_4= ':' ( (lv_viewpointVersion_5_0= ruleVersion ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_viewpointDescription_8_0= ruleEString ) ) )? (otherlv_9= 'execution' otherlv_10= 'environments' otherlv_11= ':' ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* ) )? otherlv_15= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:863:1: ( () otherlv_1= 'release' otherlv_2= '{' (otherlv_3= 'version' otherlv_4= ':' ( (lv_viewpointVersion_5_0= ruleVersion ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_viewpointDescription_8_0= ruleEString ) ) )? (otherlv_9= 'execution' otherlv_10= 'environments' otherlv_11= ':' ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* ) )? otherlv_15= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:863:2: () otherlv_1= 'release' otherlv_2= '{' (otherlv_3= 'version' otherlv_4= ':' ( (lv_viewpointVersion_5_0= ruleVersion ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_viewpointDescription_8_0= ruleEString ) ) )? (otherlv_9= 'execution' otherlv_10= 'environments' otherlv_11= ':' ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* ) )? otherlv_15= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:863:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:864:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReleaseAccess().getReleaseAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleRelease1945); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReleaseAccess().getReleaseKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRelease1957); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getReleaseAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:877:1: (otherlv_3= 'version' otherlv_4= ':' ( (lv_viewpointVersion_5_0= ruleVersion ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:877:3: otherlv_3= 'version' otherlv_4= ':' ( (lv_viewpointVersion_5_0= ruleVersion ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleRelease1970); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getReleaseAccess().getVersionKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleRelease1982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getReleaseAccess().getColonKeyword_3_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:885:1: ( (lv_viewpointVersion_5_0= ruleVersion ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:886:1: (lv_viewpointVersion_5_0= ruleVersion )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:886:1: (lv_viewpointVersion_5_0= ruleVersion )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:887:3: lv_viewpointVersion_5_0= ruleVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReleaseAccess().getViewpointVersionVersionParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVersion_in_ruleRelease2003);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:903:4: (otherlv_6= 'description' otherlv_7= ':' ( (lv_viewpointDescription_8_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:903:6: otherlv_6= 'description' otherlv_7= ':' ( (lv_viewpointDescription_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleRelease2018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getReleaseAccess().getDescriptionKeyword_4_0());
                          
                    }
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleRelease2030); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getReleaseAccess().getColonKeyword_4_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:911:1: ( (lv_viewpointDescription_8_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:912:1: (lv_viewpointDescription_8_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:912:1: (lv_viewpointDescription_8_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:913:3: lv_viewpointDescription_8_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReleaseAccess().getViewpointDescriptionEStringParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleRelease2051);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:929:4: (otherlv_9= 'execution' otherlv_10= 'environments' otherlv_11= ':' ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:929:6: otherlv_9= 'execution' otherlv_10= 'environments' otherlv_11= ':' ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* )
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleRelease2066); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getReleaseAccess().getExecutionKeyword_5_0());
                          
                    }
                    otherlv_10=(Token)match(input,38,FOLLOW_38_in_ruleRelease2078); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getReleaseAccess().getEnvironmentsKeyword_5_1());
                          
                    }
                    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleRelease2090); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getReleaseAccess().getColonKeyword_5_2());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:941:1: ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:941:2: ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )*
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:941:2: ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:942:1: (lv_requiredExecutionEnvironment_12_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:942:1: (lv_requiredExecutionEnvironment_12_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:943:3: lv_requiredExecutionEnvironment_12_0= RULE_STRING
                    {
                    lv_requiredExecutionEnvironment_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRelease2108); if (state.failed) return current;
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

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:959:2: (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==39) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:959:4: otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) )
                    	    {
                    	    otherlv_13=(Token)match(input,39,FOLLOW_39_in_ruleRelease2126); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_13, grammarAccess.getReleaseAccess().getCommaKeyword_5_3_1_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:963:1: ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:964:1: (lv_requiredExecutionEnvironment_14_0= RULE_STRING )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:964:1: (lv_requiredExecutionEnvironment_14_0= RULE_STRING )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:965:3: lv_requiredExecutionEnvironment_14_0= RULE_STRING
                    	    {
                    	    lv_requiredExecutionEnvironment_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRelease2143); if (state.failed) return current;
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

            otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleRelease2165); if (state.failed) return current;
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


    // $ANTLR start "entryRuleRepresentationConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:993:1: entryRuleRepresentationConfiguration returns [EObject current=null] : iv_ruleRepresentationConfiguration= ruleRepresentationConfiguration EOF ;
    public final EObject entryRuleRepresentationConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepresentationConfiguration = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:994:2: (iv_ruleRepresentationConfiguration= ruleRepresentationConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:995:2: iv_ruleRepresentationConfiguration= ruleRepresentationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepresentationConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleRepresentationConfiguration_in_entryRuleRepresentationConfiguration2201);
            iv_ruleRepresentationConfiguration=ruleRepresentationConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRepresentationConfiguration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepresentationConfiguration2211); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRepresentationConfiguration"


    // $ANTLR start "ruleRepresentationConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1002:1: ruleRepresentationConfiguration returns [EObject current=null] : ( () otherlv_1= 'representation' otherlv_2= '{' otherlv_3= 'visible' otherlv_4= ':' ( (lv_visible_5_0= ruleEBoolean ) ) otherlv_6= '}' ) ;
    public final EObject ruleRepresentationConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_visible_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1005:28: ( ( () otherlv_1= 'representation' otherlv_2= '{' otherlv_3= 'visible' otherlv_4= ':' ( (lv_visible_5_0= ruleEBoolean ) ) otherlv_6= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1006:1: ( () otherlv_1= 'representation' otherlv_2= '{' otherlv_3= 'visible' otherlv_4= ':' ( (lv_visible_5_0= ruleEBoolean ) ) otherlv_6= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1006:1: ( () otherlv_1= 'representation' otherlv_2= '{' otherlv_3= 'visible' otherlv_4= ':' ( (lv_visible_5_0= ruleEBoolean ) ) otherlv_6= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1006:2: () otherlv_1= 'representation' otherlv_2= '{' otherlv_3= 'visible' otherlv_4= ':' ( (lv_visible_5_0= ruleEBoolean ) ) otherlv_6= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1006:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1007:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRepresentationConfigurationAccess().getRepresentationConfigurationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleRepresentationConfiguration2257); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRepresentationConfigurationAccess().getRepresentationKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRepresentationConfiguration2269); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRepresentationConfigurationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleRepresentationConfiguration2281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRepresentationConfigurationAccess().getVisibleKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleRepresentationConfiguration2293); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRepresentationConfigurationAccess().getColonKeyword_4());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1028:1: ( (lv_visible_5_0= ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1029:1: (lv_visible_5_0= ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1029:1: (lv_visible_5_0= ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1030:3: lv_visible_5_0= ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRepresentationConfigurationAccess().getVisibleEBooleanParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEBoolean_in_ruleRepresentationConfiguration2314);
            lv_visible_5_0=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRepresentationConfigurationRule());
              	        }
                     		set(
                     			current, 
                     			"visible",
                      		lv_visible_5_0, 
                      		"EBoolean");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleRepresentationConfiguration2326); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getRepresentationConfigurationAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleRepresentationConfiguration"


    // $ANTLR start "entryRuleVersion"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1058:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1059:2: (iv_ruleVersion= ruleVersion EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1060:2: iv_ruleVersion= ruleVersion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionRule()); 
            }
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion2363);
            iv_ruleVersion=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersion.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion2374); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1067:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? ) )? ) ;
    public final AntlrDatatypeRuleToken ruleVersion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        AntlrDatatypeRuleToken this_Qualifier_6 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1070:28: ( (this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? ) )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1071:1: (this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? ) )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1071:1: (this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? ) )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1071:6: this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? ) )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVersion2414); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0()); 
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1078:1: (kw= '.' (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1079:2: kw= '.' (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? )
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleVersion2433); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1084:1: (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1084:6: this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )?
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVersion2449); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_2, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1091:1: (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==42) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1092:2: kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )?
                            {
                            kw=(Token)match(input,42,FOLLOW_42_in_ruleVersion2468); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_1_1_0()); 
                                  
                            }
                            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVersion2483); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_4);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_1()); 
                                  
                            }
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1104:1: (kw= '.' this_Qualifier_6= ruleQualifier )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( (LA20_0==42) ) {
                                alt20=1;
                            }
                            switch (alt20) {
                                case 1 :
                                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1105:2: kw= '.' this_Qualifier_6= ruleQualifier
                                    {
                                    kw=(Token)match(input,42,FOLLOW_42_in_ruleVersion2502); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              current.merge(kw);
                                              newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_1_1_2_0()); 
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getVersionAccess().getQualifierParserRuleCall_1_1_1_2_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleQualifier_in_ruleVersion2524);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1129:1: entryRuleQualifier returns [String current=null] : iv_ruleQualifier= ruleQualifier EOF ;
    public final String entryRuleQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifier = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1130:2: (iv_ruleQualifier= ruleQualifier EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1131:2: iv_ruleQualifier= ruleQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleQualifier_in_entryRuleQualifier2577);
            iv_ruleQualifier=ruleQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifier2588); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1138:1: ruleQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= '_' ) (this_INT_3= RULE_INT | this_ID_4= RULE_ID | kw= '_' | kw= '-' )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;
        Token kw=null;
        Token this_INT_3=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1141:28: ( ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= '_' ) (this_INT_3= RULE_INT | this_ID_4= RULE_ID | kw= '_' | kw= '-' )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1142:1: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= '_' ) (this_INT_3= RULE_INT | this_ID_4= RULE_ID | kw= '_' | kw= '-' )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1142:1: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= '_' ) (this_INT_3= RULE_INT | this_ID_4= RULE_ID | kw= '_' | kw= '-' )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1142:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= '_' ) (this_INT_3= RULE_INT | this_ID_4= RULE_ID | kw= '_' | kw= '-' )*
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1142:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= '_' )
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
            case 43:
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1142:7: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQualifier2629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getQualifierAccess().getINTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1150:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifier2655); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getQualifierAccess().getIDTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1159:2: kw= '_'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleQualifier2679); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifierAccess().get_Keyword_0_2()); 
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1164:2: (this_INT_3= RULE_INT | this_ID_4= RULE_ID | kw= '_' | kw= '-' )*
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
                case 43:
                    {
                    alt24=3;
                    }
                    break;
                case 44:
                    {
                    alt24=4;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1164:7: this_INT_3= RULE_INT
            	    {
            	    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQualifier2696); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_INT_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_INT_3, grammarAccess.getQualifierAccess().getINTTerminalRuleCall_1_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1172:10: this_ID_4= RULE_ID
            	    {
            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifier2722); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_4, grammarAccess.getQualifierAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1181:2: kw= '_'
            	    {
            	    kw=(Token)match(input,43,FOLLOW_43_in_ruleQualifier2746); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifierAccess().get_Keyword_1_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1188:2: kw= '-'
            	    {
            	    kw=(Token)match(input,44,FOLLOW_44_in_ruleQualifier2765); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1201:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1202:2: (iv_ruleEString= ruleEString EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1203:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString2808);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString2819); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1210:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1213:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1214:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1214:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1214:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString2859); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1222:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString2885); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1237:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1238:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1239:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN2931);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN2942); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1246:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1249:28: ( (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1250:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1250:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1250:6: this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN2982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1257:1: (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==42) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1258:2: kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    {
            	    kw=(Token)match(input,42,FOLLOW_42_in_ruleFQN3001); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1263:1: ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1263:2: ( RULE_ID )=>this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN3022); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1278:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1279:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1280:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_entryRuleEBoolean3071);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBoolean3082); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1287:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1290:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1291:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1291:1: (kw= 'true' | kw= 'false' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            else if ( (LA27_0==46) ) {
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1292:2: kw= 'true'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleEBoolean3120); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:1299:2: kw= 'false'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleEBoolean3139); if (state.failed) return current;
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
    public static final BitSet FOLLOW_12_in_ruleConfiguration164 = new BitSet(new long[]{0x000001040002E000L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_ruleConfiguration185 = new BitSet(new long[]{0x000001040002E000L});
    public static final BitSet FOLLOW_13_in_ruleConfiguration198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationElement244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetApplication_in_ruleConfigurationElement291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationConfiguration_in_ruleConfigurationElement318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneration_in_ruleConfigurationElement345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelease_in_ruleConfigurationElement372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepresentationConfiguration_in_ruleConfigurationElement399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetApplication_in_entryRuleTargetApplication434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetApplication444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleTargetApplication490 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTargetApplication511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationConfiguration_in_entryRuleGenerationConfiguration547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerationConfiguration557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGenerationConfiguration603 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleGenerationConfiguration624 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleGenerationConfiguration637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGenerationConfiguration654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneration_in_entryRuleGeneration697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneration707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleGeneration753 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGeneration765 = new BitSet(new long[]{0x0000000150042000L});
    public static final BitSet FOLLOW_ruleGData_in_ruleGeneration786 = new BitSet(new long[]{0x0000000150002000L});
    public static final BitSet FOLLOW_ruleExtensionGeneratrionConfiguration_in_ruleGeneration808 = new BitSet(new long[]{0x0000000150002000L});
    public static final BitSet FOLLOW_13_in_ruleGeneration821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGData_in_entryRuleGData857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGData867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleGData913 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGData925 = new BitSet(new long[]{0x000000000FD00000L});
    public static final BitSet FOLLOW_20_in_ruleGData939 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleGData951 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleGData972 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_22_in_ruleGData987 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleGData999 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleGData1020 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_23_in_ruleGData1035 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleGData1047 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleGData1068 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_24_in_ruleGData1083 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleGData1095 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleGData1116 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_25_in_ruleGData1131 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleGData1143 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleGData1164 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleGData1179 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleGData1191 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleGData1212 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleGData1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionGeneratrionConfiguration_in_entryRuleExtensionGeneratrionConfiguration1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensionGeneratrionConfiguration1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramGenerationConfiguration_in_ruleExtensionGeneratrionConfiguration1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentationGenerationConfiguration_in_ruleExtensionGeneratrionConfiguration1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelsAirdGenerationConfiguration_in_ruleExtensionGeneratrionConfiguration1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramGenerationConfiguration_in_entryRuleDiagramGenerationConfiguration1409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramGenerationConfiguration1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDiagramGenerationConfiguration1465 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDiagramGenerationConfiguration1477 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_ruleDiagramGenerationConfiguration1490 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDiagramGenerationConfiguration1502 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleDiagramGenerationConfiguration1523 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDiagramGenerationConfiguration1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentationGenerationConfiguration_in_entryRuleDocumentationGenerationConfiguration1573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentationGenerationConfiguration1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDocumentationGenerationConfiguration1629 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDocumentationGenerationConfiguration1641 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_31_in_ruleDocumentationGenerationConfiguration1654 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleDocumentationGenerationConfiguration1675 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDocumentationGenerationConfiguration1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelsAirdGenerationConfiguration_in_entryRuleModelsAirdGenerationConfiguration1725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelsAirdGenerationConfiguration1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleModelsAirdGenerationConfiguration1781 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleModelsAirdGenerationConfiguration1793 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_33_in_ruleModelsAirdGenerationConfiguration1806 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleModelsAirdGenerationConfiguration1818 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleModelsAirdGenerationConfiguration1839 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleModelsAirdGenerationConfiguration1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelease_in_entryRuleRelease1889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelease1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleRelease1945 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRelease1957 = new BitSet(new long[]{0x0000003800002000L});
    public static final BitSet FOLLOW_35_in_ruleRelease1970 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRelease1982 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleRelease2003 = new BitSet(new long[]{0x0000003000002000L});
    public static final BitSet FOLLOW_36_in_ruleRelease2018 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRelease2030 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleRelease2051 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_37_in_ruleRelease2066 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleRelease2078 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRelease2090 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRelease2108 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_39_in_ruleRelease2126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRelease2143 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_13_in_ruleRelease2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepresentationConfiguration_in_entryRuleRepresentationConfiguration2201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepresentationConfiguration2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleRepresentationConfiguration2257 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRepresentationConfiguration2269 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleRepresentationConfiguration2281 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRepresentationConfiguration2293 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleRepresentationConfiguration2314 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRepresentationConfiguration2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion2363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVersion2414 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleVersion2433 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVersion2449 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleVersion2468 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVersion2483 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleVersion2502 = new BitSet(new long[]{0x0000080000000060L});
    public static final BitSet FOLLOW_ruleQualifier_in_ruleVersion2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_entryRuleQualifier2577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifier2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQualifier2629 = new BitSet(new long[]{0x0000180000000062L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifier2655 = new BitSet(new long[]{0x0000180000000062L});
    public static final BitSet FOLLOW_43_in_ruleQualifier2679 = new BitSet(new long[]{0x0000180000000062L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQualifier2696 = new BitSet(new long[]{0x0000180000000062L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifier2722 = new BitSet(new long[]{0x0000180000000062L});
    public static final BitSet FOLLOW_43_in_ruleQualifier2746 = new BitSet(new long[]{0x0000180000000062L});
    public static final BitSet FOLLOW_44_in_ruleQualifier2765 = new BitSet(new long[]{0x0000180000000062L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN2931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN2982 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleFQN3001 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN3022 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean3071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleEBoolean3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleEBoolean3139 = new BitSet(new long[]{0x0000000000000002L});

}
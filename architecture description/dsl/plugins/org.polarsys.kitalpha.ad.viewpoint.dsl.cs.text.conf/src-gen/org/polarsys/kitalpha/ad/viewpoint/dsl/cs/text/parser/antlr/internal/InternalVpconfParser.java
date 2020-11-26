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
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
@SuppressWarnings("all")
public class InternalVpconfParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Configuration'", "'{'", "'}'", "'target'", "'project'", "'nsuri'", "'generation'", "'data'", "'('", "'Model'", "':'", "'Edit'", "'Editor'", "'Test'", "'Javadoc'", "'OverwriteEcore'", "')'", "'diagram'", "'OverwriteOdesign'", "'documentation'", "'EcoreToHtml:'", "'ecore'", "'aird'", "'release'", "'version'", "'description'", "'execution'", "'environments'", "','", "'view'", "'visible'", "'activable'", "'.'", "'_'", "'-'", "'true'", "'false'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalVpconfParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVpconfParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVpconfParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVpconf.g"; }



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
    // InternalVpconf.g:74:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalVpconf.g:75:2: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalVpconf.g:76:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfiguration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalVpconf.g:83:1: ruleConfiguration returns [EObject current=null] : ( () otherlv_1= 'Configuration' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_vpConfigurationElements_4_0= ruleConfigurationElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_vpConfigurationElements_4_0 = null;


         enterRule(); 
            
        try {
            // InternalVpconf.g:86:28: ( ( () otherlv_1= 'Configuration' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_vpConfigurationElements_4_0= ruleConfigurationElement ) )* otherlv_5= '}' ) )
            // InternalVpconf.g:87:1: ( () otherlv_1= 'Configuration' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_vpConfigurationElements_4_0= ruleConfigurationElement ) )* otherlv_5= '}' )
            {
            // InternalVpconf.g:87:1: ( () otherlv_1= 'Configuration' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_vpConfigurationElements_4_0= ruleConfigurationElement ) )* otherlv_5= '}' )
            // InternalVpconf.g:87:2: () otherlv_1= 'Configuration' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_vpConfigurationElements_4_0= ruleConfigurationElement ) )* otherlv_5= '}'
            {
            // InternalVpconf.g:87:2: ()
            // InternalVpconf.g:88:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConfigurationAccess().getConfigurationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConfigurationAccess().getConfigurationKeyword_1());
                  
            }
            // InternalVpconf.g:97:1: ( (lv_name_2_0= ruleFQN ) )
            // InternalVpconf.g:98:1: (lv_name_2_0= ruleFQN )
            {
            // InternalVpconf.g:98:1: (lv_name_2_0= ruleFQN )
            // InternalVpconf.g:99:3: lv_name_2_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConfigurationAccess().getNameFQNParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_4);
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
                      		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.FQN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalVpconf.g:119:1: ( (lv_vpConfigurationElements_4_0= ruleConfigurationElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)||LA1_0==17||LA1_0==34||LA1_0==40) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVpconf.g:120:1: (lv_vpConfigurationElements_4_0= ruleConfigurationElement )
            	    {
            	    // InternalVpconf.g:120:1: (lv_vpConfigurationElements_4_0= ruleConfigurationElement )
            	    // InternalVpconf.g:121:3: lv_vpConfigurationElements_4_0= ruleConfigurationElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConfigurationAccess().getVpConfigurationElementsConfigurationElementParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_5);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpconf.ConfigurationElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
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
    // InternalVpconf.g:149:1: entryRuleConfigurationElement returns [EObject current=null] : iv_ruleConfigurationElement= ruleConfigurationElement EOF ;
    public final EObject entryRuleConfigurationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationElement = null;


        try {
            // InternalVpconf.g:150:2: (iv_ruleConfigurationElement= ruleConfigurationElement EOF )
            // InternalVpconf.g:151:2: iv_ruleConfigurationElement= ruleConfigurationElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationElement=ruleConfigurationElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalVpconf.g:158:1: ruleConfigurationElement returns [EObject current=null] : (this_TargetApplication_0= ruleTargetApplication | this_GenerationConfiguration_1= ruleGenerationConfiguration | this_Generation_2= ruleGeneration | this_Release_3= ruleRelease | this_ViewConfiguration_4= ruleViewConfiguration ) ;
    public final EObject ruleConfigurationElement() throws RecognitionException {
        EObject current = null;

        EObject this_TargetApplication_0 = null;

        EObject this_GenerationConfiguration_1 = null;

        EObject this_Generation_2 = null;

        EObject this_Release_3 = null;

        EObject this_ViewConfiguration_4 = null;


         enterRule(); 
            
        try {
            // InternalVpconf.g:161:28: ( (this_TargetApplication_0= ruleTargetApplication | this_GenerationConfiguration_1= ruleGenerationConfiguration | this_Generation_2= ruleGeneration | this_Release_3= ruleRelease | this_ViewConfiguration_4= ruleViewConfiguration ) )
            // InternalVpconf.g:162:1: (this_TargetApplication_0= ruleTargetApplication | this_GenerationConfiguration_1= ruleGenerationConfiguration | this_Generation_2= ruleGeneration | this_Release_3= ruleRelease | this_ViewConfiguration_4= ruleViewConfiguration )
            {
            // InternalVpconf.g:162:1: (this_TargetApplication_0= ruleTargetApplication | this_GenerationConfiguration_1= ruleGenerationConfiguration | this_Generation_2= ruleGeneration | this_Release_3= ruleRelease | this_ViewConfiguration_4= ruleViewConfiguration )
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
                    // InternalVpconf.g:163:5: this_TargetApplication_0= ruleTargetApplication
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConfigurationElementAccess().getTargetApplicationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalVpconf.g:173:5: this_GenerationConfiguration_1= ruleGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConfigurationElementAccess().getGenerationConfigurationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalVpconf.g:183:5: this_Generation_2= ruleGeneration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConfigurationElementAccess().getGenerationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalVpconf.g:193:5: this_Release_3= ruleRelease
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConfigurationElementAccess().getReleaseParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalVpconf.g:203:5: this_ViewConfiguration_4= ruleViewConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConfigurationElementAccess().getViewConfigurationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ViewConfiguration_4=ruleViewConfiguration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ViewConfiguration_4; 
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
    // InternalVpconf.g:219:1: entryRuleTargetApplication returns [EObject current=null] : iv_ruleTargetApplication= ruleTargetApplication EOF ;
    public final EObject entryRuleTargetApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetApplication = null;


        try {
            // InternalVpconf.g:220:2: (iv_ruleTargetApplication= ruleTargetApplication EOF )
            // InternalVpconf.g:221:2: iv_ruleTargetApplication= ruleTargetApplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTargetApplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTargetApplication=ruleTargetApplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTargetApplication; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalVpconf.g:228:1: ruleTargetApplication returns [EObject current=null] : ( () otherlv_1= 'target' ( (lv_type_2_0= ruleEString ) ) ) ;
    public final EObject ruleTargetApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVpconf.g:231:28: ( ( () otherlv_1= 'target' ( (lv_type_2_0= ruleEString ) ) ) )
            // InternalVpconf.g:232:1: ( () otherlv_1= 'target' ( (lv_type_2_0= ruleEString ) ) )
            {
            // InternalVpconf.g:232:1: ( () otherlv_1= 'target' ( (lv_type_2_0= ruleEString ) ) )
            // InternalVpconf.g:232:2: () otherlv_1= 'target' ( (lv_type_2_0= ruleEString ) )
            {
            // InternalVpconf.g:232:2: ()
            // InternalVpconf.g:233:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTargetApplicationAccess().getTargetApplicationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTargetApplicationAccess().getTargetKeyword_1());
                  
            }
            // InternalVpconf.g:242:1: ( (lv_type_2_0= ruleEString ) )
            // InternalVpconf.g:243:1: (lv_type_2_0= ruleEString )
            {
            // InternalVpconf.g:243:1: (lv_type_2_0= ruleEString )
            // InternalVpconf.g:244:3: lv_type_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTargetApplicationAccess().getTypeEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
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
    // InternalVpconf.g:268:1: entryRuleGenerationConfiguration returns [EObject current=null] : iv_ruleGenerationConfiguration= ruleGenerationConfiguration EOF ;
    public final EObject entryRuleGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerationConfiguration = null;


        try {
            // InternalVpconf.g:269:2: (iv_ruleGenerationConfiguration= ruleGenerationConfiguration EOF )
            // InternalVpconf.g:270:2: iv_ruleGenerationConfiguration= ruleGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGenerationConfiguration=ruleGenerationConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenerationConfiguration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalVpconf.g:277:1: ruleGenerationConfiguration returns [EObject current=null] : ( () otherlv_1= 'project' ( (lv_projectName_2_0= ruleFQN ) ) (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_nsuri_4_0=null;
        AntlrDatatypeRuleToken lv_projectName_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVpconf.g:280:28: ( ( () otherlv_1= 'project' ( (lv_projectName_2_0= ruleFQN ) ) (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )? ) )
            // InternalVpconf.g:281:1: ( () otherlv_1= 'project' ( (lv_projectName_2_0= ruleFQN ) ) (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )? )
            {
            // InternalVpconf.g:281:1: ( () otherlv_1= 'project' ( (lv_projectName_2_0= ruleFQN ) ) (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )? )
            // InternalVpconf.g:281:2: () otherlv_1= 'project' ( (lv_projectName_2_0= ruleFQN ) ) (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )?
            {
            // InternalVpconf.g:281:2: ()
            // InternalVpconf.g:282:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGenerationConfigurationAccess().getGenerationConfigurationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGenerationConfigurationAccess().getProjectKeyword_1());
                  
            }
            // InternalVpconf.g:291:1: ( (lv_projectName_2_0= ruleFQN ) )
            // InternalVpconf.g:292:1: (lv_projectName_2_0= ruleFQN )
            {
            // InternalVpconf.g:292:1: (lv_projectName_2_0= ruleFQN )
            // InternalVpconf.g:293:3: lv_projectName_2_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGenerationConfigurationAccess().getProjectNameFQNParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
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
                      		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.FQN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalVpconf.g:309:2: (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalVpconf.g:309:4: otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getGenerationConfigurationAccess().getNsuriKeyword_3_0());
                          
                    }
                    // InternalVpconf.g:313:1: ( (lv_nsuri_4_0= RULE_STRING ) )
                    // InternalVpconf.g:314:1: (lv_nsuri_4_0= RULE_STRING )
                    {
                    // InternalVpconf.g:314:1: (lv_nsuri_4_0= RULE_STRING )
                    // InternalVpconf.g:315:3: lv_nsuri_4_0= RULE_STRING
                    {
                    lv_nsuri_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
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
    // InternalVpconf.g:339:1: entryRuleGeneration returns [EObject current=null] : iv_ruleGeneration= ruleGeneration EOF ;
    public final EObject entryRuleGeneration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneration = null;


        try {
            // InternalVpconf.g:340:2: (iv_ruleGeneration= ruleGeneration EOF )
            // InternalVpconf.g:341:2: iv_ruleGeneration= ruleGeneration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenerationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGeneration=ruleGeneration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGeneration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalVpconf.g:348:1: ruleGeneration returns [EObject current=null] : ( () otherlv_1= 'generation' otherlv_2= '{' ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )? ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )* otherlv_5= '}' ) ;
    public final EObject ruleGeneration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_ownedDataGenerationConf_3_0 = null;

        EObject lv_ownedExtensionGenConf_4_0 = null;


         enterRule(); 
            
        try {
            // InternalVpconf.g:351:28: ( ( () otherlv_1= 'generation' otherlv_2= '{' ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )? ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )* otherlv_5= '}' ) )
            // InternalVpconf.g:352:1: ( () otherlv_1= 'generation' otherlv_2= '{' ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )? ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )* otherlv_5= '}' )
            {
            // InternalVpconf.g:352:1: ( () otherlv_1= 'generation' otherlv_2= '{' ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )? ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )* otherlv_5= '}' )
            // InternalVpconf.g:352:2: () otherlv_1= 'generation' otherlv_2= '{' ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )? ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )* otherlv_5= '}'
            {
            // InternalVpconf.g:352:2: ()
            // InternalVpconf.g:353:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGenerationAccess().getGenerationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGenerationAccess().getGenerationKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGenerationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalVpconf.g:366:1: ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalVpconf.g:367:1: (lv_ownedDataGenerationConf_3_0= ruleGData )
                    {
                    // InternalVpconf.g:367:1: (lv_ownedDataGenerationConf_3_0= ruleGData )
                    // InternalVpconf.g:368:3: lv_ownedDataGenerationConf_3_0= ruleGData
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGenerationAccess().getOwnedDataGenerationConfGDataParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_10);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpconf.GData");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalVpconf.g:384:3: ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28||LA5_0==30||LA5_0==32) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalVpconf.g:385:1: (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration )
            	    {
            	    // InternalVpconf.g:385:1: (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration )
            	    // InternalVpconf.g:386:3: lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGenerationAccess().getOwnedExtensionGenConfExtensionGeneratrionConfigurationParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_10);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpconf.ExtensionGeneratrionConfiguration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
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
    // InternalVpconf.g:414:1: entryRuleGData returns [EObject current=null] : iv_ruleGData= ruleGData EOF ;
    public final EObject entryRuleGData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGData = null;


        try {
            // InternalVpconf.g:415:2: (iv_ruleGData= ruleGData EOF )
            // InternalVpconf.g:416:2: iv_ruleGData= ruleGData EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGDataRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGData=ruleGData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGData; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalVpconf.g:423:1: ruleGData returns [EObject current=null] : ( () otherlv_1= 'data' otherlv_2= '(' ( (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )? (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )? (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )? (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )? (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )? ) otherlv_21= ')' ) ;
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
            // InternalVpconf.g:426:28: ( ( () otherlv_1= 'data' otherlv_2= '(' ( (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )? (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )? (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )? (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )? (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )? ) otherlv_21= ')' ) )
            // InternalVpconf.g:427:1: ( () otherlv_1= 'data' otherlv_2= '(' ( (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )? (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )? (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )? (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )? (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )? ) otherlv_21= ')' )
            {
            // InternalVpconf.g:427:1: ( () otherlv_1= 'data' otherlv_2= '(' ( (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )? (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )? (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )? (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )? (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )? ) otherlv_21= ')' )
            // InternalVpconf.g:427:2: () otherlv_1= 'data' otherlv_2= '(' ( (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )? (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )? (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )? (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )? (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )? ) otherlv_21= ')'
            {
            // InternalVpconf.g:427:2: ()
            // InternalVpconf.g:428:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGDataAccess().getGDataAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGDataAccess().getDataKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGDataAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalVpconf.g:441:1: ( (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )? (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )? (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )? (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )? (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )? )
            // InternalVpconf.g:441:2: (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )? (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )? (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )? (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )? (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )?
            {
            // InternalVpconf.g:441:2: (otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVpconf.g:441:4: otherlv_3= 'Model' otherlv_4= ':' ( (lv_model_5_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getGDataAccess().getModelKeyword_3_0_0());
                          
                    }
                    otherlv_4=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getGDataAccess().getColonKeyword_3_0_1());
                          
                    }
                    // InternalVpconf.g:449:1: ( (lv_model_5_0= ruleEBoolean ) )
                    // InternalVpconf.g:450:1: (lv_model_5_0= ruleEBoolean )
                    {
                    // InternalVpconf.g:450:1: (lv_model_5_0= ruleEBoolean )
                    // InternalVpconf.g:451:3: lv_model_5_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getModelEBooleanParserRuleCall_3_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_15);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalVpconf.g:467:4: (otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalVpconf.g:467:6: otherlv_6= 'Edit' otherlv_7= ':' ( (lv_edit_8_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getGDataAccess().getEditKeyword_3_1_0());
                          
                    }
                    otherlv_7=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getGDataAccess().getColonKeyword_3_1_1());
                          
                    }
                    // InternalVpconf.g:475:1: ( (lv_edit_8_0= ruleEBoolean ) )
                    // InternalVpconf.g:476:1: (lv_edit_8_0= ruleEBoolean )
                    {
                    // InternalVpconf.g:476:1: (lv_edit_8_0= ruleEBoolean )
                    // InternalVpconf.g:477:3: lv_edit_8_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getEditEBooleanParserRuleCall_3_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_16);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalVpconf.g:493:4: (otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalVpconf.g:493:6: otherlv_9= 'Editor' otherlv_10= ':' ( (lv_editor_11_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getGDataAccess().getEditorKeyword_3_2_0());
                          
                    }
                    otherlv_10=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getGDataAccess().getColonKeyword_3_2_1());
                          
                    }
                    // InternalVpconf.g:501:1: ( (lv_editor_11_0= ruleEBoolean ) )
                    // InternalVpconf.g:502:1: (lv_editor_11_0= ruleEBoolean )
                    {
                    // InternalVpconf.g:502:1: (lv_editor_11_0= ruleEBoolean )
                    // InternalVpconf.g:503:3: lv_editor_11_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getEditorEBooleanParserRuleCall_3_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_17);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalVpconf.g:519:4: (otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVpconf.g:519:6: otherlv_12= 'Test' otherlv_13= ':' ( (lv_test_14_0= ruleEBoolean ) )
                    {
                    otherlv_12=(Token)match(input,24,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getGDataAccess().getTestKeyword_3_3_0());
                          
                    }
                    otherlv_13=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getGDataAccess().getColonKeyword_3_3_1());
                          
                    }
                    // InternalVpconf.g:527:1: ( (lv_test_14_0= ruleEBoolean ) )
                    // InternalVpconf.g:528:1: (lv_test_14_0= ruleEBoolean )
                    {
                    // InternalVpconf.g:528:1: (lv_test_14_0= ruleEBoolean )
                    // InternalVpconf.g:529:3: lv_test_14_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getTestEBooleanParserRuleCall_3_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_18);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalVpconf.g:545:4: (otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalVpconf.g:545:6: otherlv_15= 'Javadoc' otherlv_16= ':' ( (lv_javaDoc_17_0= ruleEBoolean ) )
                    {
                    otherlv_15=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getGDataAccess().getJavadocKeyword_3_4_0());
                          
                    }
                    otherlv_16=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getGDataAccess().getColonKeyword_3_4_1());
                          
                    }
                    // InternalVpconf.g:553:1: ( (lv_javaDoc_17_0= ruleEBoolean ) )
                    // InternalVpconf.g:554:1: (lv_javaDoc_17_0= ruleEBoolean )
                    {
                    // InternalVpconf.g:554:1: (lv_javaDoc_17_0= ruleEBoolean )
                    // InternalVpconf.g:555:3: lv_javaDoc_17_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getJavaDocEBooleanParserRuleCall_3_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_19);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalVpconf.g:571:4: (otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVpconf.g:571:6: otherlv_18= 'OverwriteEcore' otherlv_19= ':' ( (lv_overwriteEcore_20_0= ruleEBoolean ) )
                    {
                    otherlv_18=(Token)match(input,26,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getGDataAccess().getOverwriteEcoreKeyword_3_5_0());
                          
                    }
                    otherlv_19=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getGDataAccess().getColonKeyword_3_5_1());
                          
                    }
                    // InternalVpconf.g:579:1: ( (lv_overwriteEcore_20_0= ruleEBoolean ) )
                    // InternalVpconf.g:580:1: (lv_overwriteEcore_20_0= ruleEBoolean )
                    {
                    // InternalVpconf.g:580:1: (lv_overwriteEcore_20_0= ruleEBoolean )
                    // InternalVpconf.g:581:3: lv_overwriteEcore_20_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getOverwriteEcoreEBooleanParserRuleCall_3_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_20);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            otherlv_21=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
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
    // InternalVpconf.g:609:1: entryRuleExtensionGeneratrionConfiguration returns [EObject current=null] : iv_ruleExtensionGeneratrionConfiguration= ruleExtensionGeneratrionConfiguration EOF ;
    public final EObject entryRuleExtensionGeneratrionConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionGeneratrionConfiguration = null;


        try {
            // InternalVpconf.g:610:2: (iv_ruleExtensionGeneratrionConfiguration= ruleExtensionGeneratrionConfiguration EOF )
            // InternalVpconf.g:611:2: iv_ruleExtensionGeneratrionConfiguration= ruleExtensionGeneratrionConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtensionGeneratrionConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExtensionGeneratrionConfiguration=ruleExtensionGeneratrionConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtensionGeneratrionConfiguration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalVpconf.g:618:1: ruleExtensionGeneratrionConfiguration returns [EObject current=null] : (this_DiagramGenerationConfiguration_0= ruleDiagramGenerationConfiguration | this_DocumentationGenerationConfiguration_1= ruleDocumentationGenerationConfiguration | this_ModelsAirdGenerationConfiguration_2= ruleModelsAirdGenerationConfiguration ) ;
    public final EObject ruleExtensionGeneratrionConfiguration() throws RecognitionException {
        EObject current = null;

        EObject this_DiagramGenerationConfiguration_0 = null;

        EObject this_DocumentationGenerationConfiguration_1 = null;

        EObject this_ModelsAirdGenerationConfiguration_2 = null;


         enterRule(); 
            
        try {
            // InternalVpconf.g:621:28: ( (this_DiagramGenerationConfiguration_0= ruleDiagramGenerationConfiguration | this_DocumentationGenerationConfiguration_1= ruleDocumentationGenerationConfiguration | this_ModelsAirdGenerationConfiguration_2= ruleModelsAirdGenerationConfiguration ) )
            // InternalVpconf.g:622:1: (this_DiagramGenerationConfiguration_0= ruleDiagramGenerationConfiguration | this_DocumentationGenerationConfiguration_1= ruleDocumentationGenerationConfiguration | this_ModelsAirdGenerationConfiguration_2= ruleModelsAirdGenerationConfiguration )
            {
            // InternalVpconf.g:622:1: (this_DiagramGenerationConfiguration_0= ruleDiagramGenerationConfiguration | this_DocumentationGenerationConfiguration_1= ruleDocumentationGenerationConfiguration | this_ModelsAirdGenerationConfiguration_2= ruleModelsAirdGenerationConfiguration )
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
                    // InternalVpconf.g:623:5: this_DiagramGenerationConfiguration_0= ruleDiagramGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExtensionGeneratrionConfigurationAccess().getDiagramGenerationConfigurationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalVpconf.g:633:5: this_DocumentationGenerationConfiguration_1= ruleDocumentationGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExtensionGeneratrionConfigurationAccess().getDocumentationGenerationConfigurationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalVpconf.g:643:5: this_ModelsAirdGenerationConfiguration_2= ruleModelsAirdGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExtensionGeneratrionConfigurationAccess().getModelsAirdGenerationConfigurationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:659:1: entryRuleDiagramGenerationConfiguration returns [EObject current=null] : iv_ruleDiagramGenerationConfiguration= ruleDiagramGenerationConfiguration EOF ;
    public final EObject entryRuleDiagramGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramGenerationConfiguration = null;


        try {
            // InternalVpconf.g:660:2: (iv_ruleDiagramGenerationConfiguration= ruleDiagramGenerationConfiguration EOF )
            // InternalVpconf.g:661:2: iv_ruleDiagramGenerationConfiguration= ruleDiagramGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDiagramGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDiagramGenerationConfiguration=ruleDiagramGenerationConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDiagramGenerationConfiguration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalVpconf.g:668:1: ruleDiagramGenerationConfiguration returns [EObject current=null] : ( () otherlv_1= 'diagram' otherlv_2= '(' (otherlv_3= 'OverwriteOdesign' otherlv_4= ':' ( (lv_overwriteVSM_5_0= ruleEBoolean ) ) )? otherlv_6= ')' ) ;
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
            // InternalVpconf.g:671:28: ( ( () otherlv_1= 'diagram' otherlv_2= '(' (otherlv_3= 'OverwriteOdesign' otherlv_4= ':' ( (lv_overwriteVSM_5_0= ruleEBoolean ) ) )? otherlv_6= ')' ) )
            // InternalVpconf.g:672:1: ( () otherlv_1= 'diagram' otherlv_2= '(' (otherlv_3= 'OverwriteOdesign' otherlv_4= ':' ( (lv_overwriteVSM_5_0= ruleEBoolean ) ) )? otherlv_6= ')' )
            {
            // InternalVpconf.g:672:1: ( () otherlv_1= 'diagram' otherlv_2= '(' (otherlv_3= 'OverwriteOdesign' otherlv_4= ':' ( (lv_overwriteVSM_5_0= ruleEBoolean ) ) )? otherlv_6= ')' )
            // InternalVpconf.g:672:2: () otherlv_1= 'diagram' otherlv_2= '(' (otherlv_3= 'OverwriteOdesign' otherlv_4= ':' ( (lv_overwriteVSM_5_0= ruleEBoolean ) ) )? otherlv_6= ')'
            {
            // InternalVpconf.g:672:2: ()
            // InternalVpconf.g:673:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDiagramGenerationConfigurationAccess().getDiagramGenerationConfigurationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDiagramGenerationConfigurationAccess().getDiagramKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDiagramGenerationConfigurationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalVpconf.g:686:1: (otherlv_3= 'OverwriteOdesign' otherlv_4= ':' ( (lv_overwriteVSM_5_0= ruleEBoolean ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVpconf.g:686:3: otherlv_3= 'OverwriteOdesign' otherlv_4= ':' ( (lv_overwriteVSM_5_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteOdesignKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDiagramGenerationConfigurationAccess().getColonKeyword_3_1());
                          
                    }
                    // InternalVpconf.g:694:1: ( (lv_overwriteVSM_5_0= ruleEBoolean ) )
                    // InternalVpconf.g:695:1: (lv_overwriteVSM_5_0= ruleEBoolean )
                    {
                    // InternalVpconf.g:695:1: (lv_overwriteVSM_5_0= ruleEBoolean )
                    // InternalVpconf.g:696:3: lv_overwriteVSM_5_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteVSMEBooleanParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_20);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
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
    // InternalVpconf.g:724:1: entryRuleDocumentationGenerationConfiguration returns [EObject current=null] : iv_ruleDocumentationGenerationConfiguration= ruleDocumentationGenerationConfiguration EOF ;
    public final EObject entryRuleDocumentationGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentationGenerationConfiguration = null;


        try {
            // InternalVpconf.g:725:2: (iv_ruleDocumentationGenerationConfiguration= ruleDocumentationGenerationConfiguration EOF )
            // InternalVpconf.g:726:2: iv_ruleDocumentationGenerationConfiguration= ruleDocumentationGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDocumentationGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDocumentationGenerationConfiguration=ruleDocumentationGenerationConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDocumentationGenerationConfiguration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalVpconf.g:733:1: ruleDocumentationGenerationConfiguration returns [EObject current=null] : ( () otherlv_1= 'documentation' otherlv_2= '(' (otherlv_3= 'EcoreToHtml:' ( (lv_ecoreToHtml_4_0= ruleEBoolean ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleDocumentationGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_ecoreToHtml_4_0 = null;


         enterRule(); 
            
        try {
            // InternalVpconf.g:736:28: ( ( () otherlv_1= 'documentation' otherlv_2= '(' (otherlv_3= 'EcoreToHtml:' ( (lv_ecoreToHtml_4_0= ruleEBoolean ) ) )? otherlv_5= ')' ) )
            // InternalVpconf.g:737:1: ( () otherlv_1= 'documentation' otherlv_2= '(' (otherlv_3= 'EcoreToHtml:' ( (lv_ecoreToHtml_4_0= ruleEBoolean ) ) )? otherlv_5= ')' )
            {
            // InternalVpconf.g:737:1: ( () otherlv_1= 'documentation' otherlv_2= '(' (otherlv_3= 'EcoreToHtml:' ( (lv_ecoreToHtml_4_0= ruleEBoolean ) ) )? otherlv_5= ')' )
            // InternalVpconf.g:737:2: () otherlv_1= 'documentation' otherlv_2= '(' (otherlv_3= 'EcoreToHtml:' ( (lv_ecoreToHtml_4_0= ruleEBoolean ) ) )? otherlv_5= ')'
            {
            // InternalVpconf.g:737:2: ()
            // InternalVpconf.g:738:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDocumentationGenerationConfigurationAccess().getDocumentationGenerationConfigurationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDocumentationGenerationConfigurationAccess().getDocumentationKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDocumentationGenerationConfigurationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalVpconf.g:751:1: (otherlv_3= 'EcoreToHtml:' ( (lv_ecoreToHtml_4_0= ruleEBoolean ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalVpconf.g:751:3: otherlv_3= 'EcoreToHtml:' ( (lv_ecoreToHtml_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDocumentationGenerationConfigurationAccess().getEcoreToHtmlKeyword_3_0());
                          
                    }
                    // InternalVpconf.g:755:1: ( (lv_ecoreToHtml_4_0= ruleEBoolean ) )
                    // InternalVpconf.g:756:1: (lv_ecoreToHtml_4_0= ruleEBoolean )
                    {
                    // InternalVpconf.g:756:1: (lv_ecoreToHtml_4_0= ruleEBoolean )
                    // InternalVpconf.g:757:3: lv_ecoreToHtml_4_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDocumentationGenerationConfigurationAccess().getEcoreToHtmlEBooleanParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_20);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
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
    // InternalVpconf.g:785:1: entryRuleModelsAirdGenerationConfiguration returns [EObject current=null] : iv_ruleModelsAirdGenerationConfiguration= ruleModelsAirdGenerationConfiguration EOF ;
    public final EObject entryRuleModelsAirdGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelsAirdGenerationConfiguration = null;


        try {
            // InternalVpconf.g:786:2: (iv_ruleModelsAirdGenerationConfiguration= ruleModelsAirdGenerationConfiguration EOF )
            // InternalVpconf.g:787:2: iv_ruleModelsAirdGenerationConfiguration= ruleModelsAirdGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelsAirdGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModelsAirdGenerationConfiguration=ruleModelsAirdGenerationConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelsAirdGenerationConfiguration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalVpconf.g:794:1: ruleModelsAirdGenerationConfiguration returns [EObject current=null] : ( () otherlv_1= 'ecore' otherlv_2= '(' (otherlv_3= 'aird' otherlv_4= ':' ( (lv_genRepresentations_5_0= ruleEBoolean ) ) )? otherlv_6= ')' ) ;
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
            // InternalVpconf.g:797:28: ( ( () otherlv_1= 'ecore' otherlv_2= '(' (otherlv_3= 'aird' otherlv_4= ':' ( (lv_genRepresentations_5_0= ruleEBoolean ) ) )? otherlv_6= ')' ) )
            // InternalVpconf.g:798:1: ( () otherlv_1= 'ecore' otherlv_2= '(' (otherlv_3= 'aird' otherlv_4= ':' ( (lv_genRepresentations_5_0= ruleEBoolean ) ) )? otherlv_6= ')' )
            {
            // InternalVpconf.g:798:1: ( () otherlv_1= 'ecore' otherlv_2= '(' (otherlv_3= 'aird' otherlv_4= ':' ( (lv_genRepresentations_5_0= ruleEBoolean ) ) )? otherlv_6= ')' )
            // InternalVpconf.g:798:2: () otherlv_1= 'ecore' otherlv_2= '(' (otherlv_3= 'aird' otherlv_4= ':' ( (lv_genRepresentations_5_0= ruleEBoolean ) ) )? otherlv_6= ')'
            {
            // InternalVpconf.g:798:2: ()
            // InternalVpconf.g:799:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getModelsAirdGenerationConfigurationAccess().getAirdGenerationConfigurationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getModelsAirdGenerationConfigurationAccess().getEcoreKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getModelsAirdGenerationConfigurationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalVpconf.g:812:1: (otherlv_3= 'aird' otherlv_4= ':' ( (lv_genRepresentations_5_0= ruleEBoolean ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVpconf.g:812:3: otherlv_3= 'aird' otherlv_4= ':' ( (lv_genRepresentations_5_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getModelsAirdGenerationConfigurationAccess().getAirdKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getModelsAirdGenerationConfigurationAccess().getColonKeyword_3_1());
                          
                    }
                    // InternalVpconf.g:820:1: ( (lv_genRepresentations_5_0= ruleEBoolean ) )
                    // InternalVpconf.g:821:1: (lv_genRepresentations_5_0= ruleEBoolean )
                    {
                    // InternalVpconf.g:821:1: (lv_genRepresentations_5_0= ruleEBoolean )
                    // InternalVpconf.g:822:3: lv_genRepresentations_5_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelsAirdGenerationConfigurationAccess().getGenRepresentationsEBooleanParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_20);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
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
    // InternalVpconf.g:850:1: entryRuleRelease returns [EObject current=null] : iv_ruleRelease= ruleRelease EOF ;
    public final EObject entryRuleRelease() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelease = null;


        try {
            // InternalVpconf.g:851:2: (iv_ruleRelease= ruleRelease EOF )
            // InternalVpconf.g:852:2: iv_ruleRelease= ruleRelease EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReleaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelease=ruleRelease();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelease; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalVpconf.g:859:1: ruleRelease returns [EObject current=null] : ( () otherlv_1= 'release' otherlv_2= '{' (otherlv_3= 'version' otherlv_4= ':' ( (lv_viewpointVersion_5_0= ruleVersion ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_viewpointDescription_8_0= ruleEString ) ) )? (otherlv_9= 'execution' otherlv_10= 'environments' otherlv_11= ':' ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* ) )? otherlv_15= '}' ) ;
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
            // InternalVpconf.g:862:28: ( ( () otherlv_1= 'release' otherlv_2= '{' (otherlv_3= 'version' otherlv_4= ':' ( (lv_viewpointVersion_5_0= ruleVersion ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_viewpointDescription_8_0= ruleEString ) ) )? (otherlv_9= 'execution' otherlv_10= 'environments' otherlv_11= ':' ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* ) )? otherlv_15= '}' ) )
            // InternalVpconf.g:863:1: ( () otherlv_1= 'release' otherlv_2= '{' (otherlv_3= 'version' otherlv_4= ':' ( (lv_viewpointVersion_5_0= ruleVersion ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_viewpointDescription_8_0= ruleEString ) ) )? (otherlv_9= 'execution' otherlv_10= 'environments' otherlv_11= ':' ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* ) )? otherlv_15= '}' )
            {
            // InternalVpconf.g:863:1: ( () otherlv_1= 'release' otherlv_2= '{' (otherlv_3= 'version' otherlv_4= ':' ( (lv_viewpointVersion_5_0= ruleVersion ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_viewpointDescription_8_0= ruleEString ) ) )? (otherlv_9= 'execution' otherlv_10= 'environments' otherlv_11= ':' ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* ) )? otherlv_15= '}' )
            // InternalVpconf.g:863:2: () otherlv_1= 'release' otherlv_2= '{' (otherlv_3= 'version' otherlv_4= ':' ( (lv_viewpointVersion_5_0= ruleVersion ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_viewpointDescription_8_0= ruleEString ) ) )? (otherlv_9= 'execution' otherlv_10= 'environments' otherlv_11= ':' ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* ) )? otherlv_15= '}'
            {
            // InternalVpconf.g:863:2: ()
            // InternalVpconf.g:864:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReleaseAccess().getReleaseAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReleaseAccess().getReleaseKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getReleaseAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalVpconf.g:877:1: (otherlv_3= 'version' otherlv_4= ':' ( (lv_viewpointVersion_5_0= ruleVersion ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalVpconf.g:877:3: otherlv_3= 'version' otherlv_4= ':' ( (lv_viewpointVersion_5_0= ruleVersion ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getReleaseAccess().getVersionKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,21,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getReleaseAccess().getColonKeyword_3_1());
                          
                    }
                    // InternalVpconf.g:885:1: ( (lv_viewpointVersion_5_0= ruleVersion ) )
                    // InternalVpconf.g:886:1: (lv_viewpointVersion_5_0= ruleVersion )
                    {
                    // InternalVpconf.g:886:1: (lv_viewpointVersion_5_0= ruleVersion )
                    // InternalVpconf.g:887:3: lv_viewpointVersion_5_0= ruleVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReleaseAccess().getViewpointVersionVersionParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_26);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpconf.Version");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalVpconf.g:903:4: (otherlv_6= 'description' otherlv_7= ':' ( (lv_viewpointDescription_8_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVpconf.g:903:6: otherlv_6= 'description' otherlv_7= ':' ( (lv_viewpointDescription_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getReleaseAccess().getDescriptionKeyword_4_0());
                          
                    }
                    otherlv_7=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getReleaseAccess().getColonKeyword_4_1());
                          
                    }
                    // InternalVpconf.g:911:1: ( (lv_viewpointDescription_8_0= ruleEString ) )
                    // InternalVpconf.g:912:1: (lv_viewpointDescription_8_0= ruleEString )
                    {
                    // InternalVpconf.g:912:1: (lv_viewpointDescription_8_0= ruleEString )
                    // InternalVpconf.g:913:3: lv_viewpointDescription_8_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReleaseAccess().getViewpointDescriptionEStringParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_27);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalVpconf.g:929:4: (otherlv_9= 'execution' otherlv_10= 'environments' otherlv_11= ':' ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalVpconf.g:929:6: otherlv_9= 'execution' otherlv_10= 'environments' otherlv_11= ':' ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* )
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getReleaseAccess().getExecutionKeyword_5_0());
                          
                    }
                    otherlv_10=(Token)match(input,38,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getReleaseAccess().getEnvironmentsKeyword_5_1());
                          
                    }
                    otherlv_11=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getReleaseAccess().getColonKeyword_5_2());
                          
                    }
                    // InternalVpconf.g:941:1: ( ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )* )
                    // InternalVpconf.g:941:2: ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )*
                    {
                    // InternalVpconf.g:941:2: ( (lv_requiredExecutionEnvironment_12_0= RULE_STRING ) )
                    // InternalVpconf.g:942:1: (lv_requiredExecutionEnvironment_12_0= RULE_STRING )
                    {
                    // InternalVpconf.g:942:1: (lv_requiredExecutionEnvironment_12_0= RULE_STRING )
                    // InternalVpconf.g:943:3: lv_requiredExecutionEnvironment_12_0= RULE_STRING
                    {
                    lv_requiredExecutionEnvironment_12_0=(Token)match(input,RULE_STRING,FOLLOW_29); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }

                    // InternalVpconf.g:959:2: (otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==39) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalVpconf.g:959:4: otherlv_13= ',' ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) )
                    	    {
                    	    otherlv_13=(Token)match(input,39,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_13, grammarAccess.getReleaseAccess().getCommaKeyword_5_3_1_0());
                    	          
                    	    }
                    	    // InternalVpconf.g:963:1: ( (lv_requiredExecutionEnvironment_14_0= RULE_STRING ) )
                    	    // InternalVpconf.g:964:1: (lv_requiredExecutionEnvironment_14_0= RULE_STRING )
                    	    {
                    	    // InternalVpconf.g:964:1: (lv_requiredExecutionEnvironment_14_0= RULE_STRING )
                    	    // InternalVpconf.g:965:3: lv_requiredExecutionEnvironment_14_0= RULE_STRING
                    	    {
                    	    lv_requiredExecutionEnvironment_14_0=(Token)match(input,RULE_STRING,FOLLOW_29); if (state.failed) return current;
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
                    	              		"org.eclipse.xtext.common.Terminals.STRING");
                    	      	    
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

            otherlv_15=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleViewConfiguration"
    // InternalVpconf.g:993:1: entryRuleViewConfiguration returns [EObject current=null] : iv_ruleViewConfiguration= ruleViewConfiguration EOF ;
    public final EObject entryRuleViewConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewConfiguration = null;


        try {
            // InternalVpconf.g:994:2: (iv_ruleViewConfiguration= ruleViewConfiguration EOF )
            // InternalVpconf.g:995:2: iv_ruleViewConfiguration= ruleViewConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getViewConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleViewConfiguration=ruleViewConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleViewConfiguration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleViewConfiguration"


    // $ANTLR start "ruleViewConfiguration"
    // InternalVpconf.g:1002:1: ruleViewConfiguration returns [EObject current=null] : ( () otherlv_1= 'view' otherlv_2= '{' (otherlv_3= 'visible' otherlv_4= ':' ( (lv_visible_5_0= ruleEBoolean ) ) )? (otherlv_6= 'activable' otherlv_7= ':' ( (lv_activable_8_0= ruleEBoolean ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleViewConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_visible_5_0 = null;

        AntlrDatatypeRuleToken lv_activable_8_0 = null;


         enterRule(); 
            
        try {
            // InternalVpconf.g:1005:28: ( ( () otherlv_1= 'view' otherlv_2= '{' (otherlv_3= 'visible' otherlv_4= ':' ( (lv_visible_5_0= ruleEBoolean ) ) )? (otherlv_6= 'activable' otherlv_7= ':' ( (lv_activable_8_0= ruleEBoolean ) ) )? otherlv_9= '}' ) )
            // InternalVpconf.g:1006:1: ( () otherlv_1= 'view' otherlv_2= '{' (otherlv_3= 'visible' otherlv_4= ':' ( (lv_visible_5_0= ruleEBoolean ) ) )? (otherlv_6= 'activable' otherlv_7= ':' ( (lv_activable_8_0= ruleEBoolean ) ) )? otherlv_9= '}' )
            {
            // InternalVpconf.g:1006:1: ( () otherlv_1= 'view' otherlv_2= '{' (otherlv_3= 'visible' otherlv_4= ':' ( (lv_visible_5_0= ruleEBoolean ) ) )? (otherlv_6= 'activable' otherlv_7= ':' ( (lv_activable_8_0= ruleEBoolean ) ) )? otherlv_9= '}' )
            // InternalVpconf.g:1006:2: () otherlv_1= 'view' otherlv_2= '{' (otherlv_3= 'visible' otherlv_4= ':' ( (lv_visible_5_0= ruleEBoolean ) ) )? (otherlv_6= 'activable' otherlv_7= ':' ( (lv_activable_8_0= ruleEBoolean ) ) )? otherlv_9= '}'
            {
            // InternalVpconf.g:1006:2: ()
            // InternalVpconf.g:1007:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getViewConfigurationAccess().getViewConfigurationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getViewConfigurationAccess().getViewKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getViewConfigurationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalVpconf.g:1020:1: (otherlv_3= 'visible' otherlv_4= ':' ( (lv_visible_5_0= ruleEBoolean ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalVpconf.g:1020:3: otherlv_3= 'visible' otherlv_4= ':' ( (lv_visible_5_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getViewConfigurationAccess().getVisibleKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getViewConfigurationAccess().getColonKeyword_3_1());
                          
                    }
                    // InternalVpconf.g:1028:1: ( (lv_visible_5_0= ruleEBoolean ) )
                    // InternalVpconf.g:1029:1: (lv_visible_5_0= ruleEBoolean )
                    {
                    // InternalVpconf.g:1029:1: (lv_visible_5_0= ruleEBoolean )
                    // InternalVpconf.g:1030:3: lv_visible_5_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewConfigurationAccess().getVisibleEBooleanParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_31);
                    lv_visible_5_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getViewConfigurationRule());
                      	        }
                             		set(
                             			current, 
                             			"visible",
                              		lv_visible_5_0, 
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalVpconf.g:1046:4: (otherlv_6= 'activable' otherlv_7= ':' ( (lv_activable_8_0= ruleEBoolean ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalVpconf.g:1046:6: otherlv_6= 'activable' otherlv_7= ':' ( (lv_activable_8_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,42,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getViewConfigurationAccess().getActivableKeyword_4_0());
                          
                    }
                    otherlv_7=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getViewConfigurationAccess().getColonKeyword_4_1());
                          
                    }
                    // InternalVpconf.g:1054:1: ( (lv_activable_8_0= ruleEBoolean ) )
                    // InternalVpconf.g:1055:1: (lv_activable_8_0= ruleEBoolean )
                    {
                    // InternalVpconf.g:1055:1: (lv_activable_8_0= ruleEBoolean )
                    // InternalVpconf.g:1056:3: lv_activable_8_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewConfigurationAccess().getActivableEBooleanParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_32);
                    lv_activable_8_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getViewConfigurationRule());
                      	        }
                             		set(
                             			current, 
                             			"activable",
                              		lv_activable_8_0, 
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getViewConfigurationAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleViewConfiguration"


    // $ANTLR start "entryRuleVersion"
    // InternalVpconf.g:1084:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalVpconf.g:1085:2: (iv_ruleVersion= ruleVersion EOF )
            // InternalVpconf.g:1086:2: iv_ruleVersion= ruleVersion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVersion=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersion.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalVpconf.g:1093:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? ) )? ) ;
    public final AntlrDatatypeRuleToken ruleVersion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        AntlrDatatypeRuleToken this_Qualifier_6 = null;


         enterRule(); 
            
        try {
            // InternalVpconf.g:1096:28: ( (this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? ) )? ) )
            // InternalVpconf.g:1097:1: (this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? ) )? )
            {
            // InternalVpconf.g:1097:1: (this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? ) )? )
            // InternalVpconf.g:1097:6: this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? ) )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0()); 
                  
            }
            // InternalVpconf.g:1104:1: (kw= '.' (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalVpconf.g:1105:2: kw= '.' (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? )
                    {
                    kw=(Token)match(input,43,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    // InternalVpconf.g:1110:1: (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )? )
                    // InternalVpconf.g:1110:6: this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )?
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_2, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
                          
                    }
                    // InternalVpconf.g:1117:1: (kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )? )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==43) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalVpconf.g:1118:2: kw= '.' this_INT_4= RULE_INT (kw= '.' this_Qualifier_6= ruleQualifier )?
                            {
                            kw=(Token)match(input,43,FOLLOW_25); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_1_1_0()); 
                                  
                            }
                            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_4);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_1()); 
                                  
                            }
                            // InternalVpconf.g:1130:1: (kw= '.' this_Qualifier_6= ruleQualifier )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0==43) ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // InternalVpconf.g:1131:2: kw= '.' this_Qualifier_6= ruleQualifier
                                    {
                                    kw=(Token)match(input,43,FOLLOW_34); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              current.merge(kw);
                                              newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_1_1_2_0()); 
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getVersionAccess().getQualifierParserRuleCall_1_1_1_2_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1155:1: entryRuleQualifier returns [String current=null] : iv_ruleQualifier= ruleQualifier EOF ;
    public final String entryRuleQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifier = null;


        try {
            // InternalVpconf.g:1156:2: (iv_ruleQualifier= ruleQualifier EOF )
            // InternalVpconf.g:1157:2: iv_ruleQualifier= ruleQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifier=ruleQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalVpconf.g:1164:1: ruleQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= '_' ) (this_INT_3= RULE_INT | this_ID_4= RULE_ID | kw= '_' | kw= '-' )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;
        Token kw=null;
        Token this_INT_3=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // InternalVpconf.g:1167:28: ( ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= '_' ) (this_INT_3= RULE_INT | this_ID_4= RULE_ID | kw= '_' | kw= '-' )* ) )
            // InternalVpconf.g:1168:1: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= '_' ) (this_INT_3= RULE_INT | this_ID_4= RULE_ID | kw= '_' | kw= '-' )* )
            {
            // InternalVpconf.g:1168:1: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= '_' ) (this_INT_3= RULE_INT | this_ID_4= RULE_ID | kw= '_' | kw= '-' )* )
            // InternalVpconf.g:1168:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= '_' ) (this_INT_3= RULE_INT | this_ID_4= RULE_ID | kw= '_' | kw= '-' )*
            {
            // InternalVpconf.g:1168:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= '_' )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt25=1;
                }
                break;
            case RULE_ID:
                {
                alt25=2;
                }
                break;
            case 44:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalVpconf.g:1168:7: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getQualifierAccess().getINTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalVpconf.g:1176:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getQualifierAccess().getIDTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalVpconf.g:1185:2: kw= '_'
                    {
                    kw=(Token)match(input,44,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifierAccess().get_Keyword_0_2()); 
                          
                    }

                    }
                    break;

            }

            // InternalVpconf.g:1190:2: (this_INT_3= RULE_INT | this_ID_4= RULE_ID | kw= '_' | kw= '-' )*
            loop26:
            do {
                int alt26=5;
                switch ( input.LA(1) ) {
                case RULE_INT:
                    {
                    alt26=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt26=2;
                    }
                    break;
                case 44:
                    {
                    alt26=3;
                    }
                    break;
                case 45:
                    {
                    alt26=4;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // InternalVpconf.g:1190:7: this_INT_3= RULE_INT
            	    {
            	    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_INT_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_INT_3, grammarAccess.getQualifierAccess().getINTTerminalRuleCall_1_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalVpconf.g:1198:10: this_ID_4= RULE_ID
            	    {
            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_4, grammarAccess.getQualifierAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // InternalVpconf.g:1207:2: kw= '_'
            	    {
            	    kw=(Token)match(input,44,FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifierAccess().get_Keyword_1_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // InternalVpconf.g:1214:2: kw= '-'
            	    {
            	    kw=(Token)match(input,45,FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifierAccess().getHyphenMinusKeyword_1_3()); 
            	          
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
    // $ANTLR end "ruleQualifier"


    // $ANTLR start "entryRuleEString"
    // InternalVpconf.g:1227:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalVpconf.g:1228:2: (iv_ruleEString= ruleEString EOF )
            // InternalVpconf.g:1229:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalVpconf.g:1236:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // InternalVpconf.g:1239:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalVpconf.g:1240:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalVpconf.g:1240:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ID) ) {
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
                    // InternalVpconf.g:1240:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalVpconf.g:1248:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
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
    // InternalVpconf.g:1263:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalVpconf.g:1264:2: (iv_ruleFQN= ruleFQN EOF )
            // InternalVpconf.g:1265:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalVpconf.g:1272:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalVpconf.g:1275:28: ( (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) )
            // InternalVpconf.g:1276:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            {
            // InternalVpconf.g:1276:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            // InternalVpconf.g:1276:6: this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalVpconf.g:1283:1: (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==43) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalVpconf.g:1284:2: kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    {
            	    kw=(Token)match(input,43,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // InternalVpconf.g:1289:1: ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    // InternalVpconf.g:1289:2: ( RULE_ID )=>this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
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
            	    break loop28;
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
    // InternalVpconf.g:1304:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalVpconf.g:1305:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalVpconf.g:1306:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalVpconf.g:1313:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVpconf.g:1316:28: ( (kw= 'true' | kw= 'false' ) )
            // InternalVpconf.g:1317:1: (kw= 'true' | kw= 'false' )
            {
            // InternalVpconf.g:1317:1: (kw= 'true' | kw= 'false' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            else if ( (LA29_0==47) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalVpconf.g:1318:2: kw= 'true'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalVpconf.g:1325:2: kw= 'false'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000001040002E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000150042000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000150002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000FD00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000003800002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000003000002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000060000002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000060L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000300000000062L});

}
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.parser.antlr.internal; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpservicesGrammarAccess;
/*******************************************************************************
 * Copyright (c) 2015, 2020 Thales Global Services S.A.S.
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
public class InternalVpservicesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Services'", "'{'", "'description:'", "'}'", "'Rules'", "'Service'", "','", "'orchestrates'", "'Rule'", "'type'", "'class'", "'Properties'", "'Property'", "'value'", "'.'", "'Java'", "'EMFvalidation'", "'Integer'", "'String'", "'Boolean'", "'Float'"
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
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
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


        public InternalVpservicesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVpservicesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVpservicesParser.tokenNames; }
    public String getGrammarFileName() { return "../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g"; }



     	private VpservicesGrammarAccess grammarAccess;
     	
        public InternalVpservicesParser(TokenStream input, VpservicesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Services";	
       	}
       	
       	@Override
       	protected VpservicesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleServices"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:75:1: entryRuleServices returns [EObject current=null] : iv_ruleServices= ruleServices EOF ;
    public final EObject entryRuleServices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServices = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:76:2: (iv_ruleServices= ruleServices EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:77:2: iv_ruleServices= ruleServices EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServicesRule()); 
            }
            pushFollow(FOLLOW_ruleServices_in_entryRuleServices75);
            iv_ruleServices=ruleServices();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleServices; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServices85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleServices"


    // $ANTLR start "ruleServices"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:84:1: ruleServices returns [EObject current=null] : ( () ( (lv_services_1_0= ruleAspect ) )+ ) ;
    public final EObject ruleServices() throws RecognitionException {
        EObject current = null;

        EObject lv_services_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:87:28: ( ( () ( (lv_services_1_0= ruleAspect ) )+ ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:88:1: ( () ( (lv_services_1_0= ruleAspect ) )+ )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:88:1: ( () ( (lv_services_1_0= ruleAspect ) )+ )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:88:2: () ( (lv_services_1_0= ruleAspect ) )+
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:88:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:89:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getServicesAccess().getServicesAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:94:2: ( (lv_services_1_0= ruleAspect ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:95:1: (lv_services_1_0= ruleAspect )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:95:1: (lv_services_1_0= ruleAspect )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:96:3: lv_services_1_0= ruleAspect
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServicesAccess().getServicesAspectParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAspect_in_ruleServices140);
            	    lv_services_1_0=ruleAspect();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getServicesRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"services",
            	              		lv_services_1_0, 
            	              		"Aspect");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // $ANTLR end "ruleServices"


    // $ANTLR start "entryRuleAspect"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:120:1: entryRuleAspect returns [EObject current=null] : iv_ruleAspect= ruleAspect EOF ;
    public final EObject entryRuleAspect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAspect = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:121:2: (iv_ruleAspect= ruleAspect EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:122:2: iv_ruleAspect= ruleAspect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAspectRule()); 
            }
            pushFollow(FOLLOW_ruleAspect_in_entryRuleAspect177);
            iv_ruleAspect=ruleAspect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAspect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspect187); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAspect"


    // $ANTLR start "ruleAspect"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:129:1: ruleAspect returns [EObject current=null] : (this_ServiceSet_0= ruleServiceSet | this_RuleSet_1= ruleRuleSet | this_PropertySet_2= rulePropertySet ) ;
    public final EObject ruleAspect() throws RecognitionException {
        EObject current = null;

        EObject this_ServiceSet_0 = null;

        EObject this_RuleSet_1 = null;

        EObject this_PropertySet_2 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:132:28: ( (this_ServiceSet_0= ruleServiceSet | this_RuleSet_1= ruleRuleSet | this_PropertySet_2= rulePropertySet ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:133:1: (this_ServiceSet_0= ruleServiceSet | this_RuleSet_1= ruleRuleSet | this_PropertySet_2= rulePropertySet )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:133:1: (this_ServiceSet_0= ruleServiceSet | this_RuleSet_1= ruleRuleSet | this_PropertySet_2= rulePropertySet )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:134:5: this_ServiceSet_0= ruleServiceSet
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAspectAccess().getServiceSetParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleServiceSet_in_ruleAspect234);
                    this_ServiceSet_0=ruleServiceSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ServiceSet_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:144:5: this_RuleSet_1= ruleRuleSet
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAspectAccess().getRuleSetParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRuleSet_in_ruleAspect261);
                    this_RuleSet_1=ruleRuleSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RuleSet_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:154:5: this_PropertySet_2= rulePropertySet
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAspectAccess().getPropertySetParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulePropertySet_in_ruleAspect288);
                    this_PropertySet_2=rulePropertySet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PropertySet_2; 
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
    // $ANTLR end "ruleAspect"


    // $ANTLR start "entryRuleServiceSet"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:170:1: entryRuleServiceSet returns [EObject current=null] : iv_ruleServiceSet= ruleServiceSet EOF ;
    public final EObject entryRuleServiceSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceSet = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:171:2: (iv_ruleServiceSet= ruleServiceSet EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:172:2: iv_ruleServiceSet= ruleServiceSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceSetRule()); 
            }
            pushFollow(FOLLOW_ruleServiceSet_in_entryRuleServiceSet323);
            iv_ruleServiceSet=ruleServiceSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleServiceSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceSet333); if (state.failed) return current;

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
    // $ANTLR end "entryRuleServiceSet"


    // $ANTLR start "ruleServiceSet"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:179:1: ruleServiceSet returns [EObject current=null] : ( () otherlv_1= 'Services' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? ( ( (lv_vpServices_6_0= ruleService ) ) ( (lv_vpServices_7_0= ruleService ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleServiceSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_vpServices_6_0 = null;

        EObject lv_vpServices_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:182:28: ( ( () otherlv_1= 'Services' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? ( ( (lv_vpServices_6_0= ruleService ) ) ( (lv_vpServices_7_0= ruleService ) )* )? otherlv_8= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:183:1: ( () otherlv_1= 'Services' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? ( ( (lv_vpServices_6_0= ruleService ) ) ( (lv_vpServices_7_0= ruleService ) )* )? otherlv_8= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:183:1: ( () otherlv_1= 'Services' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? ( ( (lv_vpServices_6_0= ruleService ) ) ( (lv_vpServices_7_0= ruleService ) )* )? otherlv_8= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:183:2: () otherlv_1= 'Services' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? ( ( (lv_vpServices_6_0= ruleService ) ) ( (lv_vpServices_7_0= ruleService ) )* )? otherlv_8= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:183:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:184:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getServiceSetAccess().getServiceSetAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleServiceSet379); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getServiceSetAccess().getServicesKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:193:1: ( (lv_name_2_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:194:1: (lv_name_2_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:194:1: (lv_name_2_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:195:3: lv_name_2_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getServiceSetAccess().getNameFQNParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleServiceSet400);
            lv_name_2_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getServiceSetRule());
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleServiceSet412); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getServiceSetAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:215:1: (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:215:3: otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleServiceSet425); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getServiceSetAccess().getDescriptionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:219:1: ( (lv_description_5_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:220:1: (lv_description_5_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:220:1: (lv_description_5_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:221:3: lv_description_5_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getServiceSetAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleServiceSet446);
                    lv_description_5_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getServiceSetRule());
                      	        }
                             		set(
                             			current, 
                             			"description",
                              		lv_description_5_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:237:4: ( ( (lv_vpServices_6_0= ruleService ) ) ( (lv_vpServices_7_0= ruleService ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:237:5: ( (lv_vpServices_6_0= ruleService ) ) ( (lv_vpServices_7_0= ruleService ) )*
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:237:5: ( (lv_vpServices_6_0= ruleService ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:238:1: (lv_vpServices_6_0= ruleService )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:238:1: (lv_vpServices_6_0= ruleService )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:239:3: lv_vpServices_6_0= ruleService
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getServiceSetAccess().getVpServicesServiceParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleService_in_ruleServiceSet470);
                    lv_vpServices_6_0=ruleService();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getServiceSetRule());
                      	        }
                             		add(
                             			current, 
                             			"vpServices",
                              		lv_vpServices_6_0, 
                              		"Service");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:255:2: ( (lv_vpServices_7_0= ruleService ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:256:1: (lv_vpServices_7_0= ruleService )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:256:1: (lv_vpServices_7_0= ruleService )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:257:3: lv_vpServices_7_0= ruleService
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getServiceSetAccess().getVpServicesServiceParserRuleCall_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleService_in_ruleServiceSet491);
                    	    lv_vpServices_7_0=ruleService();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getServiceSetRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"vpServices",
                    	              		lv_vpServices_7_0, 
                    	              		"Service");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleServiceSet506); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getServiceSetAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleServiceSet"


    // $ANTLR start "entryRuleRuleSet"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:285:1: entryRuleRuleSet returns [EObject current=null] : iv_ruleRuleSet= ruleRuleSet EOF ;
    public final EObject entryRuleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSet = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:286:2: (iv_ruleRuleSet= ruleRuleSet EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:287:2: iv_ruleRuleSet= ruleRuleSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleSetRule()); 
            }
            pushFollow(FOLLOW_ruleRuleSet_in_entryRuleRuleSet542);
            iv_ruleRuleSet=ruleRuleSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuleSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleSet552); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRuleSet"


    // $ANTLR start "ruleRuleSet"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:294:1: ruleRuleSet returns [EObject current=null] : ( () otherlv_1= 'Rules' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? ( ( (lv_vpRules_6_0= ruleRule ) ) ( (lv_vpRules_7_0= ruleRule ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_vpRules_6_0 = null;

        EObject lv_vpRules_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:297:28: ( ( () otherlv_1= 'Rules' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? ( ( (lv_vpRules_6_0= ruleRule ) ) ( (lv_vpRules_7_0= ruleRule ) )* )? otherlv_8= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:298:1: ( () otherlv_1= 'Rules' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? ( ( (lv_vpRules_6_0= ruleRule ) ) ( (lv_vpRules_7_0= ruleRule ) )* )? otherlv_8= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:298:1: ( () otherlv_1= 'Rules' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? ( ( (lv_vpRules_6_0= ruleRule ) ) ( (lv_vpRules_7_0= ruleRule ) )* )? otherlv_8= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:298:2: () otherlv_1= 'Rules' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? ( ( (lv_vpRules_6_0= ruleRule ) ) ( (lv_vpRules_7_0= ruleRule ) )* )? otherlv_8= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:298:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:299:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRuleSetAccess().getRuleSetAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleRuleSet598); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRuleSetAccess().getRulesKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:308:1: ( (lv_name_2_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:309:1: (lv_name_2_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:309:1: (lv_name_2_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:310:3: lv_name_2_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRuleSetAccess().getNameFQNParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleRuleSet619);
            lv_name_2_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRuleSetRule());
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleRuleSet631); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRuleSetAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:330:1: (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:330:3: otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleRuleSet644); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getRuleSetAccess().getDescriptionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:334:1: ( (lv_description_5_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:335:1: (lv_description_5_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:335:1: (lv_description_5_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:336:3: lv_description_5_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRuleSetAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleRuleSet665);
                    lv_description_5_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRuleSetRule());
                      	        }
                             		set(
                             			current, 
                             			"description",
                              		lv_description_5_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:352:4: ( ( (lv_vpRules_6_0= ruleRule ) ) ( (lv_vpRules_7_0= ruleRule ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:352:5: ( (lv_vpRules_6_0= ruleRule ) ) ( (lv_vpRules_7_0= ruleRule ) )*
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:352:5: ( (lv_vpRules_6_0= ruleRule ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:353:1: (lv_vpRules_6_0= ruleRule )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:353:1: (lv_vpRules_6_0= ruleRule )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:354:3: lv_vpRules_6_0= ruleRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRuleSetAccess().getVpRulesRuleParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRule_in_ruleRuleSet689);
                    lv_vpRules_6_0=ruleRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRuleSetRule());
                      	        }
                             		add(
                             			current, 
                             			"vpRules",
                              		lv_vpRules_6_0, 
                              		"Rule");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:370:2: ( (lv_vpRules_7_0= ruleRule ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==19) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:371:1: (lv_vpRules_7_0= ruleRule )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:371:1: (lv_vpRules_7_0= ruleRule )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:372:3: lv_vpRules_7_0= ruleRule
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRuleSetAccess().getVpRulesRuleParserRuleCall_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRule_in_ruleRuleSet710);
                    	    lv_vpRules_7_0=ruleRule();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getRuleSetRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"vpRules",
                    	              		lv_vpRules_7_0, 
                    	              		"Rule");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
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

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleRuleSet725); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getRuleSetAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleRuleSet"


    // $ANTLR start "entryRuleService"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:400:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:401:2: (iv_ruleService= ruleService EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:402:2: iv_ruleService= ruleService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_ruleService_in_entryRuleService761);
            iv_ruleService=ruleService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleService; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleService771); if (state.failed) return current;

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:409:1: ruleService returns [EObject current=null] : ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= 'description:' ( (lv_description_4_0= ruleEString ) ) otherlv_5= ',' )? (otherlv_6= 'orchestrates' ( ( ruleFQN ) ) (otherlv_8= ',' ( ( ruleFQN ) ) )* )? ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:412:28: ( ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= 'description:' ( (lv_description_4_0= ruleEString ) ) otherlv_5= ',' )? (otherlv_6= 'orchestrates' ( ( ruleFQN ) ) (otherlv_8= ',' ( ( ruleFQN ) ) )* )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:413:1: ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= 'description:' ( (lv_description_4_0= ruleEString ) ) otherlv_5= ',' )? (otherlv_6= 'orchestrates' ( ( ruleFQN ) ) (otherlv_8= ',' ( ( ruleFQN ) ) )* )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:413:1: ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= 'description:' ( (lv_description_4_0= ruleEString ) ) otherlv_5= ',' )? (otherlv_6= 'orchestrates' ( ( ruleFQN ) ) (otherlv_8= ',' ( ( ruleFQN ) ) )* )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:413:2: () otherlv_1= 'Service' ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= 'description:' ( (lv_description_4_0= ruleEString ) ) otherlv_5= ',' )? (otherlv_6= 'orchestrates' ( ( ruleFQN ) ) (otherlv_8= ',' ( ( ruleFQN ) ) )* )?
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:413:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:414:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getServiceAccess().getServiceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleService817); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getServiceKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:423:1: ( (lv_name_2_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:424:1: (lv_name_2_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:424:1: (lv_name_2_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:425:3: lv_name_2_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getServiceAccess().getNameFQNParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleService838);
            lv_name_2_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getServiceRule());
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:441:2: (otherlv_3= 'description:' ( (lv_description_4_0= ruleEString ) ) otherlv_5= ',' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:441:4: otherlv_3= 'description:' ( (lv_description_4_0= ruleEString ) ) otherlv_5= ','
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleService851); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getDescriptionKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:445:1: ( (lv_description_4_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:446:1: (lv_description_4_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:446:1: (lv_description_4_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:447:3: lv_description_4_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getServiceAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleService872);
                    lv_description_4_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getServiceRule());
                      	        }
                             		set(
                             			current, 
                             			"description",
                              		lv_description_4_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleService884); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getCommaKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:467:3: (otherlv_6= 'orchestrates' ( ( ruleFQN ) ) (otherlv_8= ',' ( ( ruleFQN ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:467:5: otherlv_6= 'orchestrates' ( ( ruleFQN ) ) (otherlv_8= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleService899); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getOrchestratesKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:471:1: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:472:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:472:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:473:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getServiceRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getServiceAccess().getRelatedRulesRuleCrossReference_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleService922);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:486:2: (otherlv_8= ',' ( ( ruleFQN ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==17) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:486:4: otherlv_8= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleService935); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:490:1: ( ( ruleFQN ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:491:1: ( ruleFQN )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:491:1: ( ruleFQN )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:492:3: ruleFQN
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getServiceRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getServiceAccess().getRelatedRulesRuleCrossReference_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFQN_in_ruleService958);
                    	    ruleFQN();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleRule"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:513:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:514:2: (iv_ruleRule= ruleRule EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:515:2: iv_ruleRule= ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleRule()); 
            }
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule998);
            iv_ruleRule=ruleRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule1008); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:522:1: ruleRule returns [EObject current=null] : ( () otherlv_1= 'Rule' ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= 'description:' ( (lv_description_4_0= ruleEString ) ) otherlv_5= ',' )? (otherlv_6= 'type' ( (lv_type_7_0= ruleRules_Types ) ) ) (otherlv_8= ',' otherlv_9= 'class' ( (lv_class_10_0= ruleEString ) ) )? ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        Enumerator lv_type_7_0 = null;

        AntlrDatatypeRuleToken lv_class_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:525:28: ( ( () otherlv_1= 'Rule' ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= 'description:' ( (lv_description_4_0= ruleEString ) ) otherlv_5= ',' )? (otherlv_6= 'type' ( (lv_type_7_0= ruleRules_Types ) ) ) (otherlv_8= ',' otherlv_9= 'class' ( (lv_class_10_0= ruleEString ) ) )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:526:1: ( () otherlv_1= 'Rule' ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= 'description:' ( (lv_description_4_0= ruleEString ) ) otherlv_5= ',' )? (otherlv_6= 'type' ( (lv_type_7_0= ruleRules_Types ) ) ) (otherlv_8= ',' otherlv_9= 'class' ( (lv_class_10_0= ruleEString ) ) )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:526:1: ( () otherlv_1= 'Rule' ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= 'description:' ( (lv_description_4_0= ruleEString ) ) otherlv_5= ',' )? (otherlv_6= 'type' ( (lv_type_7_0= ruleRules_Types ) ) ) (otherlv_8= ',' otherlv_9= 'class' ( (lv_class_10_0= ruleEString ) ) )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:526:2: () otherlv_1= 'Rule' ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= 'description:' ( (lv_description_4_0= ruleEString ) ) otherlv_5= ',' )? (otherlv_6= 'type' ( (lv_type_7_0= ruleRules_Types ) ) ) (otherlv_8= ',' otherlv_9= 'class' ( (lv_class_10_0= ruleEString ) ) )?
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:526:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:527:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRuleAccess().getRuleAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRule1054); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getRuleKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:536:1: ( (lv_name_2_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:537:1: (lv_name_2_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:537:1: (lv_name_2_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:538:3: lv_name_2_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRuleAccess().getNameFQNParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleRule1075);
            lv_name_2_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRuleRule());
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:554:2: (otherlv_3= 'description:' ( (lv_description_4_0= ruleEString ) ) otherlv_5= ',' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:554:4: otherlv_3= 'description:' ( (lv_description_4_0= ruleEString ) ) otherlv_5= ','
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleRule1088); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getDescriptionKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:558:1: ( (lv_description_4_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:559:1: (lv_description_4_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:559:1: (lv_description_4_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:560:3: lv_description_4_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRuleAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleRule1109);
                    lv_description_4_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRuleRule());
                      	        }
                             		set(
                             			current, 
                             			"description",
                              		lv_description_4_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleRule1121); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getCommaKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:580:3: (otherlv_6= 'type' ( (lv_type_7_0= ruleRules_Types ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:580:5: otherlv_6= 'type' ( (lv_type_7_0= ruleRules_Types ) )
            {
            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleRule1136); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getTypeKeyword_4_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:584:1: ( (lv_type_7_0= ruleRules_Types ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:585:1: (lv_type_7_0= ruleRules_Types )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:585:1: (lv_type_7_0= ruleRules_Types )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:586:3: lv_type_7_0= ruleRules_Types
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRuleAccess().getTypeRules_TypesEnumRuleCall_4_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleRules_Types_in_ruleRule1157);
            lv_type_7_0=ruleRules_Types();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRuleRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_7_0, 
                      		"Rules_Types");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:602:3: (otherlv_8= ',' otherlv_9= 'class' ( (lv_class_10_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:602:5: otherlv_8= ',' otherlv_9= 'class' ( (lv_class_10_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleRule1171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getCommaKeyword_5_0());
                          
                    }
                    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleRule1183); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getClassKeyword_5_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:610:1: ( (lv_class_10_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:611:1: (lv_class_10_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:611:1: (lv_class_10_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:612:3: lv_class_10_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRuleAccess().getClassEStringParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleRule1204);
                    lv_class_10_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRuleRule());
                      	        }
                             		set(
                             			current, 
                             			"class",
                              		lv_class_10_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRulePropertySet"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:636:1: entryRulePropertySet returns [EObject current=null] : iv_rulePropertySet= rulePropertySet EOF ;
    public final EObject entryRulePropertySet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySet = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:637:2: (iv_rulePropertySet= rulePropertySet EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:638:2: iv_rulePropertySet= rulePropertySet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertySetRule()); 
            }
            pushFollow(FOLLOW_rulePropertySet_in_entryRulePropertySet1242);
            iv_rulePropertySet=rulePropertySet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertySet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertySet1252); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertySet"


    // $ANTLR start "rulePropertySet"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:645:1: rulePropertySet returns [EObject current=null] : ( () otherlv_1= 'Properties' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_vpProperties_4_0= ruleProperty ) )* otherlv_5= '}' ) ;
    public final EObject rulePropertySet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_vpProperties_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:648:28: ( ( () otherlv_1= 'Properties' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_vpProperties_4_0= ruleProperty ) )* otherlv_5= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:649:1: ( () otherlv_1= 'Properties' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_vpProperties_4_0= ruleProperty ) )* otherlv_5= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:649:1: ( () otherlv_1= 'Properties' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_vpProperties_4_0= ruleProperty ) )* otherlv_5= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:649:2: () otherlv_1= 'Properties' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_vpProperties_4_0= ruleProperty ) )* otherlv_5= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:649:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:650:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPropertySetAccess().getPropertySetAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_rulePropertySet1298); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertySetAccess().getPropertiesKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:659:1: ( (lv_name_2_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:660:1: (lv_name_2_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:660:1: (lv_name_2_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:661:3: lv_name_2_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertySetAccess().getNameFQNParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_rulePropertySet1319);
            lv_name_2_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertySetRule());
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_rulePropertySet1331); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPropertySetAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:681:1: ( (lv_vpProperties_4_0= ruleProperty ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:682:1: (lv_vpProperties_4_0= ruleProperty )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:682:1: (lv_vpProperties_4_0= ruleProperty )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:683:3: lv_vpProperties_4_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPropertySetAccess().getVpPropertiesPropertyParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProperty_in_rulePropertySet1352);
            	    lv_vpProperties_4_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPropertySetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"vpProperties",
            	              		lv_vpProperties_4_0, 
            	              		"Property");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_rulePropertySet1365); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPropertySetAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "rulePropertySet"


    // $ANTLR start "entryRuleProperty"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:711:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:712:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:713:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1401);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1411); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:720:1: ruleProperty returns [EObject current=null] : ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_Type_4_0= rulePropertyType ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_Type_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:723:28: ( ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_Type_4_0= rulePropertyType ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:724:1: ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_Type_4_0= rulePropertyType ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:724:1: ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_Type_4_0= rulePropertyType ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:724:2: () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_Type_4_0= rulePropertyType ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )?
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:724:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:725:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPropertyAccess().getPropertyAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleProperty1457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getPropertyKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:734:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:735:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:735:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:736:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleProperty1478);
            lv_name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:752:2: (otherlv_3= 'type' ( (lv_Type_4_0= rulePropertyType ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:752:4: otherlv_3= 'type' ( (lv_Type_4_0= rulePropertyType ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleProperty1491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getTypeKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:756:1: ( (lv_Type_4_0= rulePropertyType ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:757:1: (lv_Type_4_0= rulePropertyType )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:757:1: (lv_Type_4_0= rulePropertyType )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:758:3: lv_Type_4_0= rulePropertyType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getTypePropertyTypeEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyType_in_ruleProperty1512);
                    lv_Type_4_0=rulePropertyType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"Type",
                              		lv_Type_4_0, 
                              		"PropertyType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:774:4: (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:774:6: otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleProperty1527); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getValueKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:778:1: ( (lv_value_6_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:779:1: (lv_value_6_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:779:1: (lv_value_6_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:780:3: lv_value_6_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getValueEStringParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleProperty1548);
                    lv_value_6_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_6_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleEString"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:804:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:805:2: (iv_ruleEString= ruleEString EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:806:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1587);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1598); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:813:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:816:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:817:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:817:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:817:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString1638); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:825:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString1664); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:840:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:841:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:842:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1710);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1721); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:849:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:852:28: ( (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:853:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:853:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:853:6: this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1761); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:860:1: (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==25) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:861:2: kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    {
            	    kw=(Token)match(input,25,FOLLOW_25_in_ruleFQN1780); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:866:1: ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:866:2: ( RULE_ID )=>this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1801); if (state.failed) return current;
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
            	    break loop18;
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


    // $ANTLR start "ruleRules_Types"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:885:1: ruleRules_Types returns [Enumerator current=null] : ( (enumLiteral_0= 'Java' ) | (enumLiteral_1= 'EMFvalidation' ) ) ;
    public final Enumerator ruleRules_Types() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:887:28: ( ( (enumLiteral_0= 'Java' ) | (enumLiteral_1= 'EMFvalidation' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:888:1: ( (enumLiteral_0= 'Java' ) | (enumLiteral_1= 'EMFvalidation' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:888:1: ( (enumLiteral_0= 'Java' ) | (enumLiteral_1= 'EMFvalidation' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            else if ( (LA19_0==27) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:888:2: (enumLiteral_0= 'Java' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:888:2: (enumLiteral_0= 'Java' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:888:4: enumLiteral_0= 'Java'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_26_in_ruleRules_Types1867); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRules_TypesAccess().getJavaEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRules_TypesAccess().getJavaEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:894:6: (enumLiteral_1= 'EMFvalidation' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:894:6: (enumLiteral_1= 'EMFvalidation' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:894:8: enumLiteral_1= 'EMFvalidation'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_27_in_ruleRules_Types1884); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRules_TypesAccess().getEMFvalidationEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRules_TypesAccess().getEMFvalidationEnumLiteralDeclaration_1()); 
                          
                    }

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
    // $ANTLR end "ruleRules_Types"


    // $ANTLR start "rulePropertyType"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:904:1: rulePropertyType returns [Enumerator current=null] : ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) ) ;
    public final Enumerator rulePropertyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:906:28: ( ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:907:1: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:907:1: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt20=1;
                }
                break;
            case 29:
                {
                alt20=2;
                }
                break;
            case 30:
                {
                alt20=3;
                }
                break;
            case 31:
                {
                alt20=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:907:2: (enumLiteral_0= 'Integer' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:907:2: (enumLiteral_0= 'Integer' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:907:4: enumLiteral_0= 'Integer'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_28_in_rulePropertyType1929); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPropertyTypeAccess().getIntegerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPropertyTypeAccess().getIntegerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:913:6: (enumLiteral_1= 'String' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:913:6: (enumLiteral_1= 'String' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:913:8: enumLiteral_1= 'String'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_29_in_rulePropertyType1946); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPropertyTypeAccess().getStringEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getPropertyTypeAccess().getStringEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:919:6: (enumLiteral_2= 'Boolean' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:919:6: (enumLiteral_2= 'Boolean' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:919:8: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_30_in_rulePropertyType1963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPropertyTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getPropertyTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:925:6: (enumLiteral_3= 'Float' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:925:6: (enumLiteral_3= 'Float' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpservices.g:925:8: enumLiteral_3= 'Float'
                    {
                    enumLiteral_3=(Token)match(input,31,FOLLOW_31_in_rulePropertyType1980); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPropertyTypeAccess().getFloatEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getPropertyTypeAccess().getFloatEnumLiteralDeclaration_3()); 
                          
                    }

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
    // $ANTLR end "rulePropertyType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleServices_in_entryRuleServices75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServices85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspect_in_ruleServices140 = new BitSet(new long[]{0x0000000000408802L});
    public static final BitSet FOLLOW_ruleAspect_in_entryRuleAspect177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspect187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceSet_in_ruleAspect234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleSet_in_ruleAspect261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertySet_in_ruleAspect288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceSet_in_entryRuleServiceSet323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceSet333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleServiceSet379 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleServiceSet400 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleServiceSet412 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_13_in_ruleServiceSet425 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleServiceSet446 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ruleService_in_ruleServiceSet470 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ruleService_in_ruleServiceSet491 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_ruleServiceSet506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleSet_in_entryRuleRuleSet542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleSet552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleRuleSet598 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleRuleSet619 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRuleSet631 = new BitSet(new long[]{0x0000000000086000L});
    public static final BitSet FOLLOW_13_in_ruleRuleSet644 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleRuleSet665 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_ruleRule_in_ruleRuleSet689 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_ruleRule_in_ruleRuleSet710 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_14_in_ruleRuleSet725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleService817 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleService838 = new BitSet(new long[]{0x0000000000042002L});
    public static final BitSet FOLLOW_13_in_ruleService851 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleService872 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleService884 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleService899 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleService922 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleService935 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleService958 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleRule1054 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleRule1075 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_13_in_ruleRule1088 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleRule1109 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRule1121 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRule1136 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_ruleRules_Types_in_ruleRule1157 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleRule1171 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRule1183 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleRule1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertySet_in_entryRulePropertySet1242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertySet1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePropertySet1298 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePropertySet1319 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePropertySet1331 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePropertySet1352 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_14_in_rulePropertySet1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleProperty1457 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleProperty1478 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_20_in_ruleProperty1491 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_rulePropertyType_in_ruleProperty1512 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleProperty1527 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleProperty1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1761 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleFQN1780 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1801 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_26_in_ruleRules_Types1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRules_Types1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePropertyType1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePropertyType1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePropertyType1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePropertyType1980 = new BitSet(new long[]{0x0000000000000002L});

}
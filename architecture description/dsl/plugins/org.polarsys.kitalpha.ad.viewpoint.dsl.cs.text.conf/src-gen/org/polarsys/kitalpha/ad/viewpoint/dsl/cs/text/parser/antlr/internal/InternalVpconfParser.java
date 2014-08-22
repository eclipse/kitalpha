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
@SuppressWarnings("all")
public class InternalVpconfParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Configuration'", "'{'", "'}'", "'target'", "'project'", "'nsuri'", "'generation'", "'data'", "'('", "'Model:'", "'Edit:'", "'Editor:'", "'Test:'", "'Javadoc:'", "'OverwriteEcore:'", "')'", "'diagram'", "'overwriteOdesign:'", "'.'", "'true'", "'false'"
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:67:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:68:2: (iv_ruleConfiguration= ruleConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:69:2: iv_ruleConfiguration= ruleConfiguration EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:76:1: ruleConfiguration returns [EObject current=null] : ( () otherlv_1= 'Configuration' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_vpConfigurationElements_4_0= ruleConfigurationElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_vpConfigurationElements_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:79:28: ( ( () otherlv_1= 'Configuration' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_vpConfigurationElements_4_0= ruleConfigurationElement ) )* otherlv_5= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:80:1: ( () otherlv_1= 'Configuration' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_vpConfigurationElements_4_0= ruleConfigurationElement ) )* otherlv_5= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:80:1: ( () otherlv_1= 'Configuration' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_vpConfigurationElements_4_0= ruleConfigurationElement ) )* otherlv_5= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:80:2: () otherlv_1= 'Configuration' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_vpConfigurationElements_4_0= ruleConfigurationElement ) )* otherlv_5= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:80:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:81:5: 
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:90:1: ( (lv_name_2_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:91:1: (lv_name_2_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:91:1: (lv_name_2_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:92:3: lv_name_2_0= ruleFQN
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:112:1: ( (lv_vpConfigurationElements_4_0= ruleConfigurationElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:113:1: (lv_vpConfigurationElements_4_0= ruleConfigurationElement )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:113:1: (lv_vpConfigurationElements_4_0= ruleConfigurationElement )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:114:3: lv_vpConfigurationElements_4_0= ruleConfigurationElement
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:142:1: entryRuleConfigurationElement returns [EObject current=null] : iv_ruleConfigurationElement= ruleConfigurationElement EOF ;
    public final EObject entryRuleConfigurationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationElement = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:143:2: (iv_ruleConfigurationElement= ruleConfigurationElement EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:144:2: iv_ruleConfigurationElement= ruleConfigurationElement EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:151:1: ruleConfigurationElement returns [EObject current=null] : (this_TargetApplication_0= ruleTargetApplication | this_GenerationConfiguration_1= ruleGenerationConfiguration | this_Generation_2= ruleGeneration ) ;
    public final EObject ruleConfigurationElement() throws RecognitionException {
        EObject current = null;

        EObject this_TargetApplication_0 = null;

        EObject this_GenerationConfiguration_1 = null;

        EObject this_Generation_2 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:154:28: ( (this_TargetApplication_0= ruleTargetApplication | this_GenerationConfiguration_1= ruleGenerationConfiguration | this_Generation_2= ruleGeneration ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:155:1: (this_TargetApplication_0= ruleTargetApplication | this_GenerationConfiguration_1= ruleGenerationConfiguration | this_Generation_2= ruleGeneration )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:155:1: (this_TargetApplication_0= ruleTargetApplication | this_GenerationConfiguration_1= ruleGenerationConfiguration | this_Generation_2= ruleGeneration )
            int alt2=3;
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
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:156:5: this_TargetApplication_0= ruleTargetApplication
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:166:5: this_GenerationConfiguration_1= ruleGenerationConfiguration
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:176:5: this_Generation_2= ruleGeneration
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:192:1: entryRuleTargetApplication returns [EObject current=null] : iv_ruleTargetApplication= ruleTargetApplication EOF ;
    public final EObject entryRuleTargetApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetApplication = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:193:2: (iv_ruleTargetApplication= ruleTargetApplication EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:194:2: iv_ruleTargetApplication= ruleTargetApplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTargetApplicationRule()); 
            }
            pushFollow(FOLLOW_ruleTargetApplication_in_entryRuleTargetApplication380);
            iv_ruleTargetApplication=ruleTargetApplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTargetApplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetApplication390); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:201:1: ruleTargetApplication returns [EObject current=null] : ( () otherlv_1= 'target' ( (lv_type_2_0= ruleEString ) ) ) ;
    public final EObject ruleTargetApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:204:28: ( ( () otherlv_1= 'target' ( (lv_type_2_0= ruleEString ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:205:1: ( () otherlv_1= 'target' ( (lv_type_2_0= ruleEString ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:205:1: ( () otherlv_1= 'target' ( (lv_type_2_0= ruleEString ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:205:2: () otherlv_1= 'target' ( (lv_type_2_0= ruleEString ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:205:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:206:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTargetApplicationAccess().getTargetApplicationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleTargetApplication436); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTargetApplicationAccess().getTargetKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:215:1: ( (lv_type_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:216:1: (lv_type_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:216:1: (lv_type_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:217:3: lv_type_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTargetApplicationAccess().getTypeEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleTargetApplication457);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:241:1: entryRuleGenerationConfiguration returns [EObject current=null] : iv_ruleGenerationConfiguration= ruleGenerationConfiguration EOF ;
    public final EObject entryRuleGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerationConfiguration = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:242:2: (iv_ruleGenerationConfiguration= ruleGenerationConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:243:2: iv_ruleGenerationConfiguration= ruleGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleGenerationConfiguration_in_entryRuleGenerationConfiguration493);
            iv_ruleGenerationConfiguration=ruleGenerationConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenerationConfiguration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerationConfiguration503); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:250:1: ruleGenerationConfiguration returns [EObject current=null] : ( () otherlv_1= 'project' ( (lv_projectName_2_0= ruleFQN ) ) (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_nsuri_4_0=null;
        AntlrDatatypeRuleToken lv_projectName_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:253:28: ( ( () otherlv_1= 'project' ( (lv_projectName_2_0= ruleFQN ) ) (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:254:1: ( () otherlv_1= 'project' ( (lv_projectName_2_0= ruleFQN ) ) (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:254:1: ( () otherlv_1= 'project' ( (lv_projectName_2_0= ruleFQN ) ) (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:254:2: () otherlv_1= 'project' ( (lv_projectName_2_0= ruleFQN ) ) (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )?
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:254:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:255:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGenerationConfigurationAccess().getGenerationConfigurationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleGenerationConfiguration549); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGenerationConfigurationAccess().getProjectKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:264:1: ( (lv_projectName_2_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:265:1: (lv_projectName_2_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:265:1: (lv_projectName_2_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:266:3: lv_projectName_2_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGenerationConfigurationAccess().getProjectNameFQNParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleGenerationConfiguration570);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:282:2: (otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:282:4: otherlv_3= 'nsuri' ( (lv_nsuri_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleGenerationConfiguration583); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getGenerationConfigurationAccess().getNsuriKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:286:1: ( (lv_nsuri_4_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:287:1: (lv_nsuri_4_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:287:1: (lv_nsuri_4_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:288:3: lv_nsuri_4_0= RULE_STRING
                    {
                    lv_nsuri_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGenerationConfiguration600); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:312:1: entryRuleGeneration returns [EObject current=null] : iv_ruleGeneration= ruleGeneration EOF ;
    public final EObject entryRuleGeneration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneration = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:313:2: (iv_ruleGeneration= ruleGeneration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:314:2: iv_ruleGeneration= ruleGeneration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenerationRule()); 
            }
            pushFollow(FOLLOW_ruleGeneration_in_entryRuleGeneration643);
            iv_ruleGeneration=ruleGeneration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGeneration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneration653); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:321:1: ruleGeneration returns [EObject current=null] : ( () otherlv_1= 'generation' otherlv_2= '{' ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )? ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )? otherlv_5= '}' ) ;
    public final EObject ruleGeneration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_ownedDataGenerationConf_3_0 = null;

        EObject lv_ownedExtensionGenConf_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:324:28: ( ( () otherlv_1= 'generation' otherlv_2= '{' ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )? ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )? otherlv_5= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:325:1: ( () otherlv_1= 'generation' otherlv_2= '{' ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )? ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )? otherlv_5= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:325:1: ( () otherlv_1= 'generation' otherlv_2= '{' ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )? ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )? otherlv_5= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:325:2: () otherlv_1= 'generation' otherlv_2= '{' ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )? ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )? otherlv_5= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:325:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:326:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGenerationAccess().getGenerationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleGeneration699); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGenerationAccess().getGenerationKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGeneration711); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGenerationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:339:1: ( (lv_ownedDataGenerationConf_3_0= ruleGData ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:340:1: (lv_ownedDataGenerationConf_3_0= ruleGData )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:340:1: (lv_ownedDataGenerationConf_3_0= ruleGData )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:341:3: lv_ownedDataGenerationConf_3_0= ruleGData
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGenerationAccess().getOwnedDataGenerationConfGDataParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGData_in_ruleGeneration732);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:357:3: ( (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:358:1: (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:358:1: (lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:359:3: lv_ownedExtensionGenConf_4_0= ruleExtensionGeneratrionConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGenerationAccess().getOwnedExtensionGenConfExtensionGeneratrionConfigurationParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExtensionGeneratrionConfiguration_in_ruleGeneration754);
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

            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleGeneration767); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:387:1: entryRuleGData returns [EObject current=null] : iv_ruleGData= ruleGData EOF ;
    public final EObject entryRuleGData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGData = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:388:2: (iv_ruleGData= ruleGData EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:389:2: iv_ruleGData= ruleGData EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGDataRule()); 
            }
            pushFollow(FOLLOW_ruleGData_in_entryRuleGData803);
            iv_ruleGData=ruleGData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGData; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGData813); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:396:1: ruleGData returns [EObject current=null] : ( () otherlv_1= 'data' otherlv_2= '(' ( (otherlv_3= 'Model:' ( (lv_model_4_0= ruleEBoolean ) ) )? (otherlv_5= 'Edit:' ( (lv_edit_6_0= ruleEBoolean ) ) )? (otherlv_7= 'Editor:' ( (lv_editor_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Test:' ( (lv_test_10_0= ruleEBoolean ) ) )? (otherlv_11= 'Javadoc:' ( (lv_javaDoc_12_0= ruleEBoolean ) ) )? (otherlv_13= 'OverwriteEcore:' ( (lv_overwriteEcore_14_0= ruleEBoolean ) ) )? ) otherlv_15= ')' ) ;
    public final EObject ruleGData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_model_4_0 = null;

        AntlrDatatypeRuleToken lv_edit_6_0 = null;

        AntlrDatatypeRuleToken lv_editor_8_0 = null;

        AntlrDatatypeRuleToken lv_test_10_0 = null;

        AntlrDatatypeRuleToken lv_javaDoc_12_0 = null;

        AntlrDatatypeRuleToken lv_overwriteEcore_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:399:28: ( ( () otherlv_1= 'data' otherlv_2= '(' ( (otherlv_3= 'Model:' ( (lv_model_4_0= ruleEBoolean ) ) )? (otherlv_5= 'Edit:' ( (lv_edit_6_0= ruleEBoolean ) ) )? (otherlv_7= 'Editor:' ( (lv_editor_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Test:' ( (lv_test_10_0= ruleEBoolean ) ) )? (otherlv_11= 'Javadoc:' ( (lv_javaDoc_12_0= ruleEBoolean ) ) )? (otherlv_13= 'OverwriteEcore:' ( (lv_overwriteEcore_14_0= ruleEBoolean ) ) )? ) otherlv_15= ')' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:400:1: ( () otherlv_1= 'data' otherlv_2= '(' ( (otherlv_3= 'Model:' ( (lv_model_4_0= ruleEBoolean ) ) )? (otherlv_5= 'Edit:' ( (lv_edit_6_0= ruleEBoolean ) ) )? (otherlv_7= 'Editor:' ( (lv_editor_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Test:' ( (lv_test_10_0= ruleEBoolean ) ) )? (otherlv_11= 'Javadoc:' ( (lv_javaDoc_12_0= ruleEBoolean ) ) )? (otherlv_13= 'OverwriteEcore:' ( (lv_overwriteEcore_14_0= ruleEBoolean ) ) )? ) otherlv_15= ')' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:400:1: ( () otherlv_1= 'data' otherlv_2= '(' ( (otherlv_3= 'Model:' ( (lv_model_4_0= ruleEBoolean ) ) )? (otherlv_5= 'Edit:' ( (lv_edit_6_0= ruleEBoolean ) ) )? (otherlv_7= 'Editor:' ( (lv_editor_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Test:' ( (lv_test_10_0= ruleEBoolean ) ) )? (otherlv_11= 'Javadoc:' ( (lv_javaDoc_12_0= ruleEBoolean ) ) )? (otherlv_13= 'OverwriteEcore:' ( (lv_overwriteEcore_14_0= ruleEBoolean ) ) )? ) otherlv_15= ')' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:400:2: () otherlv_1= 'data' otherlv_2= '(' ( (otherlv_3= 'Model:' ( (lv_model_4_0= ruleEBoolean ) ) )? (otherlv_5= 'Edit:' ( (lv_edit_6_0= ruleEBoolean ) ) )? (otherlv_7= 'Editor:' ( (lv_editor_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Test:' ( (lv_test_10_0= ruleEBoolean ) ) )? (otherlv_11= 'Javadoc:' ( (lv_javaDoc_12_0= ruleEBoolean ) ) )? (otherlv_13= 'OverwriteEcore:' ( (lv_overwriteEcore_14_0= ruleEBoolean ) ) )? ) otherlv_15= ')'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:400:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:401:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGDataAccess().getGDataAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleGData859); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGDataAccess().getDataKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleGData871); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGDataAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:414:1: ( (otherlv_3= 'Model:' ( (lv_model_4_0= ruleEBoolean ) ) )? (otherlv_5= 'Edit:' ( (lv_edit_6_0= ruleEBoolean ) ) )? (otherlv_7= 'Editor:' ( (lv_editor_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Test:' ( (lv_test_10_0= ruleEBoolean ) ) )? (otherlv_11= 'Javadoc:' ( (lv_javaDoc_12_0= ruleEBoolean ) ) )? (otherlv_13= 'OverwriteEcore:' ( (lv_overwriteEcore_14_0= ruleEBoolean ) ) )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:414:2: (otherlv_3= 'Model:' ( (lv_model_4_0= ruleEBoolean ) ) )? (otherlv_5= 'Edit:' ( (lv_edit_6_0= ruleEBoolean ) ) )? (otherlv_7= 'Editor:' ( (lv_editor_8_0= ruleEBoolean ) ) )? (otherlv_9= 'Test:' ( (lv_test_10_0= ruleEBoolean ) ) )? (otherlv_11= 'Javadoc:' ( (lv_javaDoc_12_0= ruleEBoolean ) ) )? (otherlv_13= 'OverwriteEcore:' ( (lv_overwriteEcore_14_0= ruleEBoolean ) ) )?
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:414:2: (otherlv_3= 'Model:' ( (lv_model_4_0= ruleEBoolean ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:414:4: otherlv_3= 'Model:' ( (lv_model_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleGData885); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getGDataAccess().getModelKeyword_3_0_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:418:1: ( (lv_model_4_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:419:1: (lv_model_4_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:419:1: (lv_model_4_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:420:3: lv_model_4_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getModelEBooleanParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleGData906);
                    lv_model_4_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGDataRule());
                      	        }
                             		set(
                             			current, 
                             			"model",
                              		lv_model_4_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:436:4: (otherlv_5= 'Edit:' ( (lv_edit_6_0= ruleEBoolean ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:436:6: otherlv_5= 'Edit:' ( (lv_edit_6_0= ruleEBoolean ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleGData921); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getGDataAccess().getEditKeyword_3_1_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:440:1: ( (lv_edit_6_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:441:1: (lv_edit_6_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:441:1: (lv_edit_6_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:442:3: lv_edit_6_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getEditEBooleanParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleGData942);
                    lv_edit_6_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGDataRule());
                      	        }
                             		set(
                             			current, 
                             			"edit",
                              		lv_edit_6_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:458:4: (otherlv_7= 'Editor:' ( (lv_editor_8_0= ruleEBoolean ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:458:6: otherlv_7= 'Editor:' ( (lv_editor_8_0= ruleEBoolean ) )
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleGData957); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getGDataAccess().getEditorKeyword_3_2_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:462:1: ( (lv_editor_8_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:463:1: (lv_editor_8_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:463:1: (lv_editor_8_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:464:3: lv_editor_8_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getEditorEBooleanParserRuleCall_3_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleGData978);
                    lv_editor_8_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGDataRule());
                      	        }
                             		set(
                             			current, 
                             			"editor",
                              		lv_editor_8_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:480:4: (otherlv_9= 'Test:' ( (lv_test_10_0= ruleEBoolean ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:480:6: otherlv_9= 'Test:' ( (lv_test_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleGData993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getGDataAccess().getTestKeyword_3_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:484:1: ( (lv_test_10_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:485:1: (lv_test_10_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:485:1: (lv_test_10_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:486:3: lv_test_10_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getTestEBooleanParserRuleCall_3_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleGData1014);
                    lv_test_10_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGDataRule());
                      	        }
                             		set(
                             			current, 
                             			"test",
                              		lv_test_10_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:502:4: (otherlv_11= 'Javadoc:' ( (lv_javaDoc_12_0= ruleEBoolean ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:502:6: otherlv_11= 'Javadoc:' ( (lv_javaDoc_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleGData1029); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getGDataAccess().getJavadocKeyword_3_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:506:1: ( (lv_javaDoc_12_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:507:1: (lv_javaDoc_12_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:507:1: (lv_javaDoc_12_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:508:3: lv_javaDoc_12_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getJavaDocEBooleanParserRuleCall_3_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleGData1050);
                    lv_javaDoc_12_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGDataRule());
                      	        }
                             		set(
                             			current, 
                             			"javaDoc",
                              		lv_javaDoc_12_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:524:4: (otherlv_13= 'OverwriteEcore:' ( (lv_overwriteEcore_14_0= ruleEBoolean ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:524:6: otherlv_13= 'OverwriteEcore:' ( (lv_overwriteEcore_14_0= ruleEBoolean ) )
                    {
                    otherlv_13=(Token)match(input,25,FOLLOW_25_in_ruleGData1065); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getGDataAccess().getOverwriteEcoreKeyword_3_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:528:1: ( (lv_overwriteEcore_14_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:529:1: (lv_overwriteEcore_14_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:529:1: (lv_overwriteEcore_14_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:530:3: lv_overwriteEcore_14_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDataAccess().getOverwriteEcoreEBooleanParserRuleCall_3_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleGData1086);
                    lv_overwriteEcore_14_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGDataRule());
                      	        }
                             		set(
                             			current, 
                             			"overwriteEcore",
                              		lv_overwriteEcore_14_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            otherlv_15=(Token)match(input,26,FOLLOW_26_in_ruleGData1101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getGDataAccess().getRightParenthesisKeyword_4());
                  
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:558:1: entryRuleExtensionGeneratrionConfiguration returns [EObject current=null] : iv_ruleExtensionGeneratrionConfiguration= ruleExtensionGeneratrionConfiguration EOF ;
    public final EObject entryRuleExtensionGeneratrionConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionGeneratrionConfiguration = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:559:2: (iv_ruleExtensionGeneratrionConfiguration= ruleExtensionGeneratrionConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:560:2: iv_ruleExtensionGeneratrionConfiguration= ruleExtensionGeneratrionConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtensionGeneratrionConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleExtensionGeneratrionConfiguration_in_entryRuleExtensionGeneratrionConfiguration1137);
            iv_ruleExtensionGeneratrionConfiguration=ruleExtensionGeneratrionConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtensionGeneratrionConfiguration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensionGeneratrionConfiguration1147); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:567:1: ruleExtensionGeneratrionConfiguration returns [EObject current=null] : this_DiagramGenerationConfiguration_0= ruleDiagramGenerationConfiguration ;
    public final EObject ruleExtensionGeneratrionConfiguration() throws RecognitionException {
        EObject current = null;

        EObject this_DiagramGenerationConfiguration_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:570:28: (this_DiagramGenerationConfiguration_0= ruleDiagramGenerationConfiguration )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:572:5: this_DiagramGenerationConfiguration_0= ruleDiagramGenerationConfiguration
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExtensionGeneratrionConfigurationAccess().getDiagramGenerationConfigurationParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleDiagramGenerationConfiguration_in_ruleExtensionGeneratrionConfiguration1193);
            this_DiagramGenerationConfiguration_0=ruleDiagramGenerationConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DiagramGenerationConfiguration_0; 
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
    // $ANTLR end "ruleExtensionGeneratrionConfiguration"


    // $ANTLR start "entryRuleDiagramGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:588:1: entryRuleDiagramGenerationConfiguration returns [EObject current=null] : iv_ruleDiagramGenerationConfiguration= ruleDiagramGenerationConfiguration EOF ;
    public final EObject entryRuleDiagramGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramGenerationConfiguration = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:589:2: (iv_ruleDiagramGenerationConfiguration= ruleDiagramGenerationConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:590:2: iv_ruleDiagramGenerationConfiguration= ruleDiagramGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDiagramGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleDiagramGenerationConfiguration_in_entryRuleDiagramGenerationConfiguration1227);
            iv_ruleDiagramGenerationConfiguration=ruleDiagramGenerationConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDiagramGenerationConfiguration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagramGenerationConfiguration1237); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:597:1: ruleDiagramGenerationConfiguration returns [EObject current=null] : ( () otherlv_1= 'diagram' otherlv_2= '(' (otherlv_3= 'overwriteOdesign:' ( (lv_overwriteVSM_4_0= ruleEBoolean ) ) ) otherlv_5= ')' ) ;
    public final EObject ruleDiagramGenerationConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_overwriteVSM_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:600:28: ( ( () otherlv_1= 'diagram' otherlv_2= '(' (otherlv_3= 'overwriteOdesign:' ( (lv_overwriteVSM_4_0= ruleEBoolean ) ) ) otherlv_5= ')' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:601:1: ( () otherlv_1= 'diagram' otherlv_2= '(' (otherlv_3= 'overwriteOdesign:' ( (lv_overwriteVSM_4_0= ruleEBoolean ) ) ) otherlv_5= ')' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:601:1: ( () otherlv_1= 'diagram' otherlv_2= '(' (otherlv_3= 'overwriteOdesign:' ( (lv_overwriteVSM_4_0= ruleEBoolean ) ) ) otherlv_5= ')' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:601:2: () otherlv_1= 'diagram' otherlv_2= '(' (otherlv_3= 'overwriteOdesign:' ( (lv_overwriteVSM_4_0= ruleEBoolean ) ) ) otherlv_5= ')'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:601:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:602:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDiagramGenerationConfigurationAccess().getDiagramGenerationConfigurationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleDiagramGenerationConfiguration1283); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDiagramGenerationConfigurationAccess().getDiagramKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleDiagramGenerationConfiguration1295); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDiagramGenerationConfigurationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:615:1: (otherlv_3= 'overwriteOdesign:' ( (lv_overwriteVSM_4_0= ruleEBoolean ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:615:3: otherlv_3= 'overwriteOdesign:' ( (lv_overwriteVSM_4_0= ruleEBoolean ) )
            {
            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleDiagramGenerationConfiguration1308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteOdesignKeyword_3_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:619:1: ( (lv_overwriteVSM_4_0= ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:620:1: (lv_overwriteVSM_4_0= ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:620:1: (lv_overwriteVSM_4_0= ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:621:3: lv_overwriteVSM_4_0= ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteVSMEBooleanParserRuleCall_3_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEBoolean_in_ruleDiagramGenerationConfiguration1329);
            lv_overwriteVSM_4_0=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDiagramGenerationConfigurationRule());
              	        }
                     		set(
                     			current, 
                     			"overwriteVSM",
                      		lv_overwriteVSM_4_0, 
                      		"EBoolean");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleDiagramGenerationConfiguration1342); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDiagramGenerationConfigurationAccess().getRightParenthesisKeyword_4());
                  
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


    // $ANTLR start "entryRuleEString"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:649:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:650:2: (iv_ruleEString= ruleEString EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:651:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1379);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1390); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:658:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:661:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:662:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:662:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:662:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString1430); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:670:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString1456); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:685:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:686:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:687:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1502);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1513); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:694:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:697:28: ( (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:698:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:698:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:698:6: this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1553); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:705:1: (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:706:2: kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    {
            	    kw=(Token)match(input,29,FOLLOW_29_in_ruleFQN1572); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:711:1: ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:711:2: ( RULE_ID )=>this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1593); if (state.failed) return current;
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
            	    break loop13;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:726:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:727:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:728:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_entryRuleEBoolean1642);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBoolean1653); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:735:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:738:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:739:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:739:1: (kw= 'true' | kw= 'false' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            else if ( (LA14_0==31) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:740:2: kw= 'true'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleEBoolean1691); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpconf.g:747:2: kw= 'false'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleEBoolean1710); if (state.failed) return current;
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
    public static final BitSet FOLLOW_11_in_ruleConfiguration131 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleConfiguration152 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConfiguration164 = new BitSet(new long[]{0x000000000002E000L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_ruleConfiguration185 = new BitSet(new long[]{0x000000000002E000L});
    public static final BitSet FOLLOW_13_in_ruleConfiguration198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationElement244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetApplication_in_ruleConfigurationElement291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationConfiguration_in_ruleConfigurationElement318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneration_in_ruleConfigurationElement345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetApplication_in_entryRuleTargetApplication380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetApplication390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleTargetApplication436 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTargetApplication457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationConfiguration_in_entryRuleGenerationConfiguration493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerationConfiguration503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGenerationConfiguration549 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleGenerationConfiguration570 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleGenerationConfiguration583 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGenerationConfiguration600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneration_in_entryRuleGeneration643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneration653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleGeneration699 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGeneration711 = new BitSet(new long[]{0x0000000008042000L});
    public static final BitSet FOLLOW_ruleGData_in_ruleGeneration732 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_ruleExtensionGeneratrionConfiguration_in_ruleGeneration754 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGeneration767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGData_in_entryRuleGData803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGData813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleGData859 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGData871 = new BitSet(new long[]{0x0000000007F00000L});
    public static final BitSet FOLLOW_20_in_ruleGData885 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleGData906 = new BitSet(new long[]{0x0000000007E00000L});
    public static final BitSet FOLLOW_21_in_ruleGData921 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleGData942 = new BitSet(new long[]{0x0000000007C00000L});
    public static final BitSet FOLLOW_22_in_ruleGData957 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleGData978 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_23_in_ruleGData993 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleGData1014 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_24_in_ruleGData1029 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleGData1050 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleGData1065 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleGData1086 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleGData1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionGeneratrionConfiguration_in_entryRuleExtensionGeneratrionConfiguration1137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensionGeneratrionConfiguration1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramGenerationConfiguration_in_ruleExtensionGeneratrionConfiguration1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramGenerationConfiguration_in_entryRuleDiagramGenerationConfiguration1227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramGenerationConfiguration1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDiagramGenerationConfiguration1283 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDiagramGenerationConfiguration1295 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDiagramGenerationConfiguration1308 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleDiagramGenerationConfiguration1329 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDiagramGenerationConfiguration1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1553 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleFQN1572 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1593 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean1642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleEBoolean1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEBoolean1710 = new BitSet(new long[]{0x0000000000000002L});

}
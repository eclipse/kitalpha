package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpbuildGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalVpbuildParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Build'", "'{'", "'target-platform:'", "'}'", "'repository:'", "'features:'", "'folder'", "'hudson-deployment'", "'ant:'", "'assigned-node:'", "'build-id:'", "'enable:'", "'jdk-name:'", "'user-deploy-job-name:'", "'user-deploy-server-url:'", "'users'", "'triggers'", "'generation-location:'", "'url:'", "'SCM'", "'Cron'", "'login:'", "'permission:'", "'.'", "'true'", "'false'", "'svn://'", "'svn+ssh://'", "'WRITE'", "'EXECUTE'", "'READ'"
    };
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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


        public InternalVpbuildParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVpbuildParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVpbuildParser.tokenNames; }
    public String getGrammarFileName() { return "../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g"; }



     	private VpbuildGrammarAccess grammarAccess;
     	
        public InternalVpbuildParser(TokenStream input, VpbuildGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Build";	
       	}
       	
       	@Override
       	protected VpbuildGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleBuild"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:68:1: entryRuleBuild returns [EObject current=null] : iv_ruleBuild= ruleBuild EOF ;
    public final EObject entryRuleBuild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuild = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:69:2: (iv_ruleBuild= ruleBuild EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:70:2: iv_ruleBuild= ruleBuild EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuildRule()); 
            }
            pushFollow(FOLLOW_ruleBuild_in_entryRuleBuild75);
            iv_ruleBuild=ruleBuild();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuild; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuild85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBuild"


    // $ANTLR start "ruleBuild"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:77:1: ruleBuild returns [EObject current=null] : ( () otherlv_1= 'Build' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' otherlv_4= 'target-platform:' ( (lv_target_platform_5_0= RULE_STRING ) ) ( (lv_mapped_repositories_6_0= ruleRepository ) )* ( (lv_hudsonDeployment_7_0= ruleHudsonDeployment ) )? otherlv_8= '}' ) ;
    public final EObject ruleBuild() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_target_platform_5_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_mapped_repositories_6_0 = null;

        EObject lv_hudsonDeployment_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:80:28: ( ( () otherlv_1= 'Build' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' otherlv_4= 'target-platform:' ( (lv_target_platform_5_0= RULE_STRING ) ) ( (lv_mapped_repositories_6_0= ruleRepository ) )* ( (lv_hudsonDeployment_7_0= ruleHudsonDeployment ) )? otherlv_8= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:81:1: ( () otherlv_1= 'Build' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' otherlv_4= 'target-platform:' ( (lv_target_platform_5_0= RULE_STRING ) ) ( (lv_mapped_repositories_6_0= ruleRepository ) )* ( (lv_hudsonDeployment_7_0= ruleHudsonDeployment ) )? otherlv_8= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:81:1: ( () otherlv_1= 'Build' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' otherlv_4= 'target-platform:' ( (lv_target_platform_5_0= RULE_STRING ) ) ( (lv_mapped_repositories_6_0= ruleRepository ) )* ( (lv_hudsonDeployment_7_0= ruleHudsonDeployment ) )? otherlv_8= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:81:2: () otherlv_1= 'Build' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' otherlv_4= 'target-platform:' ( (lv_target_platform_5_0= RULE_STRING ) ) ( (lv_mapped_repositories_6_0= ruleRepository ) )* ( (lv_hudsonDeployment_7_0= ruleHudsonDeployment ) )? otherlv_8= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:81:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:82:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBuildAccess().getBuildAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleBuild131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBuildAccess().getBuildKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:91:1: ( (lv_name_2_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:92:1: (lv_name_2_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:92:1: (lv_name_2_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:93:3: lv_name_2_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBuildAccess().getNameFQNParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleBuild152);
            lv_name_2_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBuildRule());
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleBuild164); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBuildAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleBuild176); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBuildAccess().getTargetPlatformKeyword_4());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:117:1: ( (lv_target_platform_5_0= RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:118:1: (lv_target_platform_5_0= RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:118:1: (lv_target_platform_5_0= RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:119:3: lv_target_platform_5_0= RULE_STRING
            {
            lv_target_platform_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBuild193); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_target_platform_5_0, grammarAccess.getBuildAccess().getTarget_platformSTRINGTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBuildRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"target_platform",
                      		lv_target_platform_5_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:135:2: ( (lv_mapped_repositories_6_0= ruleRepository ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:136:1: (lv_mapped_repositories_6_0= ruleRepository )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:136:1: (lv_mapped_repositories_6_0= ruleRepository )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:137:3: lv_mapped_repositories_6_0= ruleRepository
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBuildAccess().getMapped_repositoriesRepositoryParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRepository_in_ruleBuild219);
            	    lv_mapped_repositories_6_0=ruleRepository();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBuildRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"mapped_repositories",
            	              		lv_mapped_repositories_6_0, 
            	              		"Repository");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:153:3: ( (lv_hudsonDeployment_7_0= ruleHudsonDeployment ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:154:1: (lv_hudsonDeployment_7_0= ruleHudsonDeployment )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:154:1: (lv_hudsonDeployment_7_0= ruleHudsonDeployment )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:155:3: lv_hudsonDeployment_7_0= ruleHudsonDeployment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBuildAccess().getHudsonDeploymentHudsonDeploymentParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHudsonDeployment_in_ruleBuild241);
                    lv_hudsonDeployment_7_0=ruleHudsonDeployment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBuildRule());
                      	        }
                             		set(
                             			current, 
                             			"hudsonDeployment",
                              		lv_hudsonDeployment_7_0, 
                              		"HudsonDeployment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleBuild254); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getBuildAccess().getRightCurlyBracketKeyword_8());
                  
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
    // $ANTLR end "ruleBuild"


    // $ANTLR start "entryRuleRepository"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:183:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:184:2: (iv_ruleRepository= ruleRepository EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:185:2: iv_ruleRepository= ruleRepository EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepositoryRule()); 
            }
            pushFollow(FOLLOW_ruleRepository_in_entryRuleRepository290);
            iv_ruleRepository=ruleRepository();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRepository; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepository300); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:192:1: ruleRepository returns [EObject current=null] : ( () otherlv_1= 'repository:' ( (lv_protocol_2_0= ruleProtocolType ) ) ( (lv_location_3_0= RULE_STRING ) ) (otherlv_4= '{' ( (lv_folders_5_0= ruleSourceFoulder ) )* otherlv_6= '}' )? (otherlv_7= 'features:' ( (lv_features_8_0= ruleFeature ) )* ) ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_location_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_protocol_2_0 = null;

        EObject lv_folders_5_0 = null;

        EObject lv_features_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:195:28: ( ( () otherlv_1= 'repository:' ( (lv_protocol_2_0= ruleProtocolType ) ) ( (lv_location_3_0= RULE_STRING ) ) (otherlv_4= '{' ( (lv_folders_5_0= ruleSourceFoulder ) )* otherlv_6= '}' )? (otherlv_7= 'features:' ( (lv_features_8_0= ruleFeature ) )* ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:196:1: ( () otherlv_1= 'repository:' ( (lv_protocol_2_0= ruleProtocolType ) ) ( (lv_location_3_0= RULE_STRING ) ) (otherlv_4= '{' ( (lv_folders_5_0= ruleSourceFoulder ) )* otherlv_6= '}' )? (otherlv_7= 'features:' ( (lv_features_8_0= ruleFeature ) )* ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:196:1: ( () otherlv_1= 'repository:' ( (lv_protocol_2_0= ruleProtocolType ) ) ( (lv_location_3_0= RULE_STRING ) ) (otherlv_4= '{' ( (lv_folders_5_0= ruleSourceFoulder ) )* otherlv_6= '}' )? (otherlv_7= 'features:' ( (lv_features_8_0= ruleFeature ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:196:2: () otherlv_1= 'repository:' ( (lv_protocol_2_0= ruleProtocolType ) ) ( (lv_location_3_0= RULE_STRING ) ) (otherlv_4= '{' ( (lv_folders_5_0= ruleSourceFoulder ) )* otherlv_6= '}' )? (otherlv_7= 'features:' ( (lv_features_8_0= ruleFeature ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:196:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:197:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRepositoryAccess().getRepositoryAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleRepository346); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getRepositoryKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:206:1: ( (lv_protocol_2_0= ruleProtocolType ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:207:1: (lv_protocol_2_0= ruleProtocolType )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:207:1: (lv_protocol_2_0= ruleProtocolType )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:208:3: lv_protocol_2_0= ruleProtocolType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRepositoryAccess().getProtocolProtocolTypeEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleProtocolType_in_ruleRepository367);
            lv_protocol_2_0=ruleProtocolType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRepositoryRule());
              	        }
                     		set(
                     			current, 
                     			"protocol",
                      		lv_protocol_2_0, 
                      		"ProtocolType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:224:2: ( (lv_location_3_0= RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:225:1: (lv_location_3_0= RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:225:1: (lv_location_3_0= RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:226:3: lv_location_3_0= RULE_STRING
            {
            lv_location_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRepository384); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_location_3_0, grammarAccess.getRepositoryAccess().getLocationSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRepositoryRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"location",
                      		lv_location_3_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:242:2: (otherlv_4= '{' ( (lv_folders_5_0= ruleSourceFoulder ) )* otherlv_6= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:242:4: otherlv_4= '{' ( (lv_folders_5_0= ruleSourceFoulder ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleRepository402); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:246:1: ( (lv_folders_5_0= ruleSourceFoulder ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==17) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:247:1: (lv_folders_5_0= ruleSourceFoulder )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:247:1: (lv_folders_5_0= ruleSourceFoulder )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:248:3: lv_folders_5_0= ruleSourceFoulder
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRepositoryAccess().getFoldersSourceFoulderParserRuleCall_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSourceFoulder_in_ruleRepository423);
                    	    lv_folders_5_0=ruleSourceFoulder();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"folders",
                    	              		lv_folders_5_0, 
                    	              		"SourceFoulder");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleRepository436); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:268:3: (otherlv_7= 'features:' ( (lv_features_8_0= ruleFeature ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:268:5: otherlv_7= 'features:' ( (lv_features_8_0= ruleFeature ) )*
            {
            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleRepository451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getRepositoryAccess().getFeaturesKeyword_5_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:272:1: ( (lv_features_8_0= ruleFeature ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:273:1: (lv_features_8_0= ruleFeature )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:273:1: (lv_features_8_0= ruleFeature )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:274:3: lv_features_8_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRepositoryAccess().getFeaturesFeatureParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeature_in_ruleRepository472);
            	    lv_features_8_0=ruleFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRepositoryRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"features",
            	              		lv_features_8_0, 
            	              		"Feature");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleSourceFoulder"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:298:1: entryRuleSourceFoulder returns [EObject current=null] : iv_ruleSourceFoulder= ruleSourceFoulder EOF ;
    public final EObject entryRuleSourceFoulder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceFoulder = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:299:2: (iv_ruleSourceFoulder= ruleSourceFoulder EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:300:2: iv_ruleSourceFoulder= ruleSourceFoulder EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSourceFoulderRule()); 
            }
            pushFollow(FOLLOW_ruleSourceFoulder_in_entryRuleSourceFoulder510);
            iv_ruleSourceFoulder=ruleSourceFoulder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSourceFoulder; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSourceFoulder520); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSourceFoulder"


    // $ANTLR start "ruleSourceFoulder"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:307:1: ruleSourceFoulder returns [EObject current=null] : ( () otherlv_1= 'folder' ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSourceFoulder() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:310:28: ( ( () otherlv_1= 'folder' ( (lv_name_2_0= RULE_STRING ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:311:1: ( () otherlv_1= 'folder' ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:311:1: ( () otherlv_1= 'folder' ( (lv_name_2_0= RULE_STRING ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:311:2: () otherlv_1= 'folder' ( (lv_name_2_0= RULE_STRING ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:311:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:312:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSourceFoulderAccess().getSourceFolderAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleSourceFoulder566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSourceFoulderAccess().getFolderKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:321:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:322:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:322:1: (lv_name_2_0= RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:323:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSourceFoulder583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getSourceFoulderAccess().getNameSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSourceFoulderRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"STRING");
              	    
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
    // $ANTLR end "ruleSourceFoulder"


    // $ANTLR start "entryRuleHudsonDeployment"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:347:1: entryRuleHudsonDeployment returns [EObject current=null] : iv_ruleHudsonDeployment= ruleHudsonDeployment EOF ;
    public final EObject entryRuleHudsonDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHudsonDeployment = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:348:2: (iv_ruleHudsonDeployment= ruleHudsonDeployment EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:349:2: iv_ruleHudsonDeployment= ruleHudsonDeployment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHudsonDeploymentRule()); 
            }
            pushFollow(FOLLOW_ruleHudsonDeployment_in_entryRuleHudsonDeployment624);
            iv_ruleHudsonDeployment=ruleHudsonDeployment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHudsonDeployment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHudsonDeployment634); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHudsonDeployment"


    // $ANTLR start "ruleHudsonDeployment"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:356:1: ruleHudsonDeployment returns [EObject current=null] : ( () otherlv_1= 'hudson-deployment' otherlv_2= '{' (otherlv_3= 'ant:' ( (lv_antName_4_0= RULE_STRING ) ) )? (otherlv_5= 'assigned-node:' ( (lv_assignedNode_6_0= RULE_STRING ) ) )? (otherlv_7= 'build-id:' ( (lv_build_id_8_0= RULE_STRING ) ) )? (otherlv_9= 'enable:' ( (lv_enabled_10_0= ruleEBoolean ) ) )? (otherlv_11= 'jdk-name:' ( (lv_jdkName_12_0= RULE_STRING ) ) )? (otherlv_13= 'user-deploy-job-name:' ( (lv_userDeployJobName_14_0= RULE_STRING ) ) )? (otherlv_15= 'user-deploy-server-url:' ( (lv_userDeployServerUrl_16_0= RULE_STRING ) ) )? (otherlv_17= 'users' otherlv_18= '{' ( (lv_users_19_0= ruleUser ) )* otherlv_20= '}' )? (otherlv_21= 'triggers' otherlv_22= '{' ( (lv_triggers_23_0= ruleTrigger ) )* otherlv_24= '}' )? ( (lv_generationLocation_25_0= ruleGenerationLocation ) )? otherlv_26= '}' ) ;
    public final EObject ruleHudsonDeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_antName_4_0=null;
        Token otherlv_5=null;
        Token lv_assignedNode_6_0=null;
        Token otherlv_7=null;
        Token lv_build_id_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_jdkName_12_0=null;
        Token otherlv_13=null;
        Token lv_userDeployJobName_14_0=null;
        Token otherlv_15=null;
        Token lv_userDeployServerUrl_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_enabled_10_0 = null;

        EObject lv_users_19_0 = null;

        EObject lv_triggers_23_0 = null;

        EObject lv_generationLocation_25_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:359:28: ( ( () otherlv_1= 'hudson-deployment' otherlv_2= '{' (otherlv_3= 'ant:' ( (lv_antName_4_0= RULE_STRING ) ) )? (otherlv_5= 'assigned-node:' ( (lv_assignedNode_6_0= RULE_STRING ) ) )? (otherlv_7= 'build-id:' ( (lv_build_id_8_0= RULE_STRING ) ) )? (otherlv_9= 'enable:' ( (lv_enabled_10_0= ruleEBoolean ) ) )? (otherlv_11= 'jdk-name:' ( (lv_jdkName_12_0= RULE_STRING ) ) )? (otherlv_13= 'user-deploy-job-name:' ( (lv_userDeployJobName_14_0= RULE_STRING ) ) )? (otherlv_15= 'user-deploy-server-url:' ( (lv_userDeployServerUrl_16_0= RULE_STRING ) ) )? (otherlv_17= 'users' otherlv_18= '{' ( (lv_users_19_0= ruleUser ) )* otherlv_20= '}' )? (otherlv_21= 'triggers' otherlv_22= '{' ( (lv_triggers_23_0= ruleTrigger ) )* otherlv_24= '}' )? ( (lv_generationLocation_25_0= ruleGenerationLocation ) )? otherlv_26= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:360:1: ( () otherlv_1= 'hudson-deployment' otherlv_2= '{' (otherlv_3= 'ant:' ( (lv_antName_4_0= RULE_STRING ) ) )? (otherlv_5= 'assigned-node:' ( (lv_assignedNode_6_0= RULE_STRING ) ) )? (otherlv_7= 'build-id:' ( (lv_build_id_8_0= RULE_STRING ) ) )? (otherlv_9= 'enable:' ( (lv_enabled_10_0= ruleEBoolean ) ) )? (otherlv_11= 'jdk-name:' ( (lv_jdkName_12_0= RULE_STRING ) ) )? (otherlv_13= 'user-deploy-job-name:' ( (lv_userDeployJobName_14_0= RULE_STRING ) ) )? (otherlv_15= 'user-deploy-server-url:' ( (lv_userDeployServerUrl_16_0= RULE_STRING ) ) )? (otherlv_17= 'users' otherlv_18= '{' ( (lv_users_19_0= ruleUser ) )* otherlv_20= '}' )? (otherlv_21= 'triggers' otherlv_22= '{' ( (lv_triggers_23_0= ruleTrigger ) )* otherlv_24= '}' )? ( (lv_generationLocation_25_0= ruleGenerationLocation ) )? otherlv_26= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:360:1: ( () otherlv_1= 'hudson-deployment' otherlv_2= '{' (otherlv_3= 'ant:' ( (lv_antName_4_0= RULE_STRING ) ) )? (otherlv_5= 'assigned-node:' ( (lv_assignedNode_6_0= RULE_STRING ) ) )? (otherlv_7= 'build-id:' ( (lv_build_id_8_0= RULE_STRING ) ) )? (otherlv_9= 'enable:' ( (lv_enabled_10_0= ruleEBoolean ) ) )? (otherlv_11= 'jdk-name:' ( (lv_jdkName_12_0= RULE_STRING ) ) )? (otherlv_13= 'user-deploy-job-name:' ( (lv_userDeployJobName_14_0= RULE_STRING ) ) )? (otherlv_15= 'user-deploy-server-url:' ( (lv_userDeployServerUrl_16_0= RULE_STRING ) ) )? (otherlv_17= 'users' otherlv_18= '{' ( (lv_users_19_0= ruleUser ) )* otherlv_20= '}' )? (otherlv_21= 'triggers' otherlv_22= '{' ( (lv_triggers_23_0= ruleTrigger ) )* otherlv_24= '}' )? ( (lv_generationLocation_25_0= ruleGenerationLocation ) )? otherlv_26= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:360:2: () otherlv_1= 'hudson-deployment' otherlv_2= '{' (otherlv_3= 'ant:' ( (lv_antName_4_0= RULE_STRING ) ) )? (otherlv_5= 'assigned-node:' ( (lv_assignedNode_6_0= RULE_STRING ) ) )? (otherlv_7= 'build-id:' ( (lv_build_id_8_0= RULE_STRING ) ) )? (otherlv_9= 'enable:' ( (lv_enabled_10_0= ruleEBoolean ) ) )? (otherlv_11= 'jdk-name:' ( (lv_jdkName_12_0= RULE_STRING ) ) )? (otherlv_13= 'user-deploy-job-name:' ( (lv_userDeployJobName_14_0= RULE_STRING ) ) )? (otherlv_15= 'user-deploy-server-url:' ( (lv_userDeployServerUrl_16_0= RULE_STRING ) ) )? (otherlv_17= 'users' otherlv_18= '{' ( (lv_users_19_0= ruleUser ) )* otherlv_20= '}' )? (otherlv_21= 'triggers' otherlv_22= '{' ( (lv_triggers_23_0= ruleTrigger ) )* otherlv_24= '}' )? ( (lv_generationLocation_25_0= ruleGenerationLocation ) )? otherlv_26= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:360:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:361:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHudsonDeploymentAccess().getHudsonDeploymentAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleHudsonDeployment680); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getHudsonDeploymentAccess().getHudsonDeploymentKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleHudsonDeployment692); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getHudsonDeploymentAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:374:1: (otherlv_3= 'ant:' ( (lv_antName_4_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:374:3: otherlv_3= 'ant:' ( (lv_antName_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleHudsonDeployment705); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getHudsonDeploymentAccess().getAntKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:378:1: ( (lv_antName_4_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:379:1: (lv_antName_4_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:379:1: (lv_antName_4_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:380:3: lv_antName_4_0= RULE_STRING
                    {
                    lv_antName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHudsonDeployment722); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_antName_4_0, grammarAccess.getHudsonDeploymentAccess().getAntNameSTRINGTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHudsonDeploymentRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"antName",
                              		lv_antName_4_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:396:4: (otherlv_5= 'assigned-node:' ( (lv_assignedNode_6_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:396:6: otherlv_5= 'assigned-node:' ( (lv_assignedNode_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleHudsonDeployment742); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getHudsonDeploymentAccess().getAssignedNodeKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:400:1: ( (lv_assignedNode_6_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:401:1: (lv_assignedNode_6_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:401:1: (lv_assignedNode_6_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:402:3: lv_assignedNode_6_0= RULE_STRING
                    {
                    lv_assignedNode_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHudsonDeployment759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_assignedNode_6_0, grammarAccess.getHudsonDeploymentAccess().getAssignedNodeSTRINGTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHudsonDeploymentRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"assignedNode",
                              		lv_assignedNode_6_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:418:4: (otherlv_7= 'build-id:' ( (lv_build_id_8_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:418:6: otherlv_7= 'build-id:' ( (lv_build_id_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleHudsonDeployment779); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getHudsonDeploymentAccess().getBuildIdKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:422:1: ( (lv_build_id_8_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:423:1: (lv_build_id_8_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:423:1: (lv_build_id_8_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:424:3: lv_build_id_8_0= RULE_STRING
                    {
                    lv_build_id_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHudsonDeployment796); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_build_id_8_0, grammarAccess.getHudsonDeploymentAccess().getBuild_idSTRINGTerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHudsonDeploymentRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"build_id",
                              		lv_build_id_8_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:440:4: (otherlv_9= 'enable:' ( (lv_enabled_10_0= ruleEBoolean ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:440:6: otherlv_9= 'enable:' ( (lv_enabled_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleHudsonDeployment816); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getHudsonDeploymentAccess().getEnableKeyword_6_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:444:1: ( (lv_enabled_10_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:445:1: (lv_enabled_10_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:445:1: (lv_enabled_10_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:446:3: lv_enabled_10_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHudsonDeploymentAccess().getEnabledEBooleanParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleHudsonDeployment837);
                    lv_enabled_10_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getHudsonDeploymentRule());
                      	        }
                             		set(
                             			current, 
                             			"enabled",
                              		lv_enabled_10_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:462:4: (otherlv_11= 'jdk-name:' ( (lv_jdkName_12_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:462:6: otherlv_11= 'jdk-name:' ( (lv_jdkName_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleHudsonDeployment852); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getHudsonDeploymentAccess().getJdkNameKeyword_7_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:466:1: ( (lv_jdkName_12_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:467:1: (lv_jdkName_12_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:467:1: (lv_jdkName_12_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:468:3: lv_jdkName_12_0= RULE_STRING
                    {
                    lv_jdkName_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHudsonDeployment869); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_jdkName_12_0, grammarAccess.getHudsonDeploymentAccess().getJdkNameSTRINGTerminalRuleCall_7_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHudsonDeploymentRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"jdkName",
                              		lv_jdkName_12_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:484:4: (otherlv_13= 'user-deploy-job-name:' ( (lv_userDeployJobName_14_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:484:6: otherlv_13= 'user-deploy-job-name:' ( (lv_userDeployJobName_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleHudsonDeployment889); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getHudsonDeploymentAccess().getUserDeployJobNameKeyword_8_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:488:1: ( (lv_userDeployJobName_14_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:489:1: (lv_userDeployJobName_14_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:489:1: (lv_userDeployJobName_14_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:490:3: lv_userDeployJobName_14_0= RULE_STRING
                    {
                    lv_userDeployJobName_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHudsonDeployment906); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_userDeployJobName_14_0, grammarAccess.getHudsonDeploymentAccess().getUserDeployJobNameSTRINGTerminalRuleCall_8_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHudsonDeploymentRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"userDeployJobName",
                              		lv_userDeployJobName_14_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:506:4: (otherlv_15= 'user-deploy-server-url:' ( (lv_userDeployServerUrl_16_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:506:6: otherlv_15= 'user-deploy-server-url:' ( (lv_userDeployServerUrl_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,25,FOLLOW_25_in_ruleHudsonDeployment926); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getHudsonDeploymentAccess().getUserDeployServerUrlKeyword_9_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:510:1: ( (lv_userDeployServerUrl_16_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:511:1: (lv_userDeployServerUrl_16_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:511:1: (lv_userDeployServerUrl_16_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:512:3: lv_userDeployServerUrl_16_0= RULE_STRING
                    {
                    lv_userDeployServerUrl_16_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHudsonDeployment943); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_userDeployServerUrl_16_0, grammarAccess.getHudsonDeploymentAccess().getUserDeployServerUrlSTRINGTerminalRuleCall_9_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHudsonDeploymentRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"userDeployServerUrl",
                              		lv_userDeployServerUrl_16_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:528:4: (otherlv_17= 'users' otherlv_18= '{' ( (lv_users_19_0= ruleUser ) )* otherlv_20= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:528:6: otherlv_17= 'users' otherlv_18= '{' ( (lv_users_19_0= ruleUser ) )* otherlv_20= '}'
                    {
                    otherlv_17=(Token)match(input,26,FOLLOW_26_in_ruleHudsonDeployment963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getHudsonDeploymentAccess().getUsersKeyword_10_0());
                          
                    }
                    otherlv_18=(Token)match(input,12,FOLLOW_12_in_ruleHudsonDeployment975); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getHudsonDeploymentAccess().getLeftCurlyBracketKeyword_10_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:536:1: ( (lv_users_19_0= ruleUser ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==32) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:537:1: (lv_users_19_0= ruleUser )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:537:1: (lv_users_19_0= ruleUser )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:538:3: lv_users_19_0= ruleUser
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getHudsonDeploymentAccess().getUsersUserParserRuleCall_10_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleUser_in_ruleHudsonDeployment996);
                    	    lv_users_19_0=ruleUser();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getHudsonDeploymentRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"users",
                    	              		lv_users_19_0, 
                    	              		"User");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,14,FOLLOW_14_in_ruleHudsonDeployment1009); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getHudsonDeploymentAccess().getRightCurlyBracketKeyword_10_3());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:558:3: (otherlv_21= 'triggers' otherlv_22= '{' ( (lv_triggers_23_0= ruleTrigger ) )* otherlv_24= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:558:5: otherlv_21= 'triggers' otherlv_22= '{' ( (lv_triggers_23_0= ruleTrigger ) )* otherlv_24= '}'
                    {
                    otherlv_21=(Token)match(input,27,FOLLOW_27_in_ruleHudsonDeployment1024); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getHudsonDeploymentAccess().getTriggersKeyword_11_0());
                          
                    }
                    otherlv_22=(Token)match(input,12,FOLLOW_12_in_ruleHudsonDeployment1036); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getHudsonDeploymentAccess().getLeftCurlyBracketKeyword_11_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:566:1: ( (lv_triggers_23_0= ruleTrigger ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>=30 && LA15_0<=31)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:567:1: (lv_triggers_23_0= ruleTrigger )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:567:1: (lv_triggers_23_0= ruleTrigger )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:568:3: lv_triggers_23_0= ruleTrigger
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getHudsonDeploymentAccess().getTriggersTriggerParserRuleCall_11_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTrigger_in_ruleHudsonDeployment1057);
                    	    lv_triggers_23_0=ruleTrigger();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getHudsonDeploymentRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"triggers",
                    	              		lv_triggers_23_0, 
                    	              		"Trigger");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,14,FOLLOW_14_in_ruleHudsonDeployment1070); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getHudsonDeploymentAccess().getRightCurlyBracketKeyword_11_3());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:588:3: ( (lv_generationLocation_25_0= ruleGenerationLocation ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:589:1: (lv_generationLocation_25_0= ruleGenerationLocation )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:589:1: (lv_generationLocation_25_0= ruleGenerationLocation )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:590:3: lv_generationLocation_25_0= ruleGenerationLocation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHudsonDeploymentAccess().getGenerationLocationGenerationLocationParserRuleCall_12_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGenerationLocation_in_ruleHudsonDeployment1093);
                    lv_generationLocation_25_0=ruleGenerationLocation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getHudsonDeploymentRule());
                      	        }
                             		set(
                             			current, 
                             			"generationLocation",
                              		lv_generationLocation_25_0, 
                              		"GenerationLocation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_26=(Token)match(input,14,FOLLOW_14_in_ruleHudsonDeployment1106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_26, grammarAccess.getHudsonDeploymentAccess().getRightCurlyBracketKeyword_13());
                  
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
    // $ANTLR end "ruleHudsonDeployment"


    // $ANTLR start "entryRuleGenerationLocation"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:618:1: entryRuleGenerationLocation returns [EObject current=null] : iv_ruleGenerationLocation= ruleGenerationLocation EOF ;
    public final EObject entryRuleGenerationLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerationLocation = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:619:2: (iv_ruleGenerationLocation= ruleGenerationLocation EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:620:2: iv_ruleGenerationLocation= ruleGenerationLocation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenerationLocationRule()); 
            }
            pushFollow(FOLLOW_ruleGenerationLocation_in_entryRuleGenerationLocation1142);
            iv_ruleGenerationLocation=ruleGenerationLocation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenerationLocation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerationLocation1152); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGenerationLocation"


    // $ANTLR start "ruleGenerationLocation"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:627:1: ruleGenerationLocation returns [EObject current=null] : ( () otherlv_1= 'generation-location:' ( (lv_folder_2_0= RULE_STRING ) ) (otherlv_3= 'url:' ( (lv_url_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleGenerationLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_folder_2_0=null;
        Token otherlv_3=null;
        Token lv_url_4_0=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:630:28: ( ( () otherlv_1= 'generation-location:' ( (lv_folder_2_0= RULE_STRING ) ) (otherlv_3= 'url:' ( (lv_url_4_0= RULE_STRING ) ) )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:631:1: ( () otherlv_1= 'generation-location:' ( (lv_folder_2_0= RULE_STRING ) ) (otherlv_3= 'url:' ( (lv_url_4_0= RULE_STRING ) ) )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:631:1: ( () otherlv_1= 'generation-location:' ( (lv_folder_2_0= RULE_STRING ) ) (otherlv_3= 'url:' ( (lv_url_4_0= RULE_STRING ) ) )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:631:2: () otherlv_1= 'generation-location:' ( (lv_folder_2_0= RULE_STRING ) ) (otherlv_3= 'url:' ( (lv_url_4_0= RULE_STRING ) ) )?
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:631:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:632:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGenerationLocationAccess().getGenerationLocationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleGenerationLocation1198); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGenerationLocationAccess().getGenerationLocationKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:641:1: ( (lv_folder_2_0= RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:642:1: (lv_folder_2_0= RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:642:1: (lv_folder_2_0= RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:643:3: lv_folder_2_0= RULE_STRING
            {
            lv_folder_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGenerationLocation1215); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_folder_2_0, grammarAccess.getGenerationLocationAccess().getFolderSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGenerationLocationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"folder",
                      		lv_folder_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:659:2: (otherlv_3= 'url:' ( (lv_url_4_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:659:4: otherlv_3= 'url:' ( (lv_url_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleGenerationLocation1233); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getGenerationLocationAccess().getUrlKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:663:1: ( (lv_url_4_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:664:1: (lv_url_4_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:664:1: (lv_url_4_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:665:3: lv_url_4_0= RULE_STRING
                    {
                    lv_url_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGenerationLocation1250); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_url_4_0, grammarAccess.getGenerationLocationAccess().getUrlSTRINGTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getGenerationLocationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"url",
                              		lv_url_4_0, 
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
    // $ANTLR end "ruleGenerationLocation"


    // $ANTLR start "entryRuleTrigger"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:689:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:690:2: (iv_ruleTrigger= ruleTrigger EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:691:2: iv_ruleTrigger= ruleTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleTrigger_in_entryRuleTrigger1293);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrigger1303); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:698:1: ruleTrigger returns [EObject current=null] : (this_SCM_0= ruleSCM | this_Cron_1= ruleCron ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        EObject this_SCM_0 = null;

        EObject this_Cron_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:701:28: ( (this_SCM_0= ruleSCM | this_Cron_1= ruleCron ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:702:1: (this_SCM_0= ruleSCM | this_Cron_1= ruleCron )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:702:1: (this_SCM_0= ruleSCM | this_Cron_1= ruleCron )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            else if ( (LA19_0==31) ) {
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:703:5: this_SCM_0= ruleSCM
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTriggerAccess().getSCMParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSCM_in_ruleTrigger1350);
                    this_SCM_0=ruleSCM();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SCM_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:713:5: this_Cron_1= ruleCron
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTriggerAccess().getCronParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCron_in_ruleTrigger1377);
                    this_Cron_1=ruleCron();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Cron_1; 
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
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleSCM"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:729:1: entryRuleSCM returns [EObject current=null] : iv_ruleSCM= ruleSCM EOF ;
    public final EObject entryRuleSCM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSCM = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:730:2: (iv_ruleSCM= ruleSCM EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:731:2: iv_ruleSCM= ruleSCM EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSCMRule()); 
            }
            pushFollow(FOLLOW_ruleSCM_in_entryRuleSCM1412);
            iv_ruleSCM=ruleSCM();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSCM; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSCM1422); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSCM"


    // $ANTLR start "ruleSCM"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:738:1: ruleSCM returns [EObject current=null] : ( () otherlv_1= 'SCM' ( (lv_planning_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSCM() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_planning_2_0=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:741:28: ( ( () otherlv_1= 'SCM' ( (lv_planning_2_0= RULE_STRING ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:742:1: ( () otherlv_1= 'SCM' ( (lv_planning_2_0= RULE_STRING ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:742:1: ( () otherlv_1= 'SCM' ( (lv_planning_2_0= RULE_STRING ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:742:2: () otherlv_1= 'SCM' ( (lv_planning_2_0= RULE_STRING ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:742:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:743:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSCMAccess().getSCMAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleSCM1468); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSCMAccess().getSCMKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:752:1: ( (lv_planning_2_0= RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:753:1: (lv_planning_2_0= RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:753:1: (lv_planning_2_0= RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:754:3: lv_planning_2_0= RULE_STRING
            {
            lv_planning_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCM1485); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_planning_2_0, grammarAccess.getSCMAccess().getPlanningSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSCMRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"planning",
                      		lv_planning_2_0, 
                      		"STRING");
              	    
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
    // $ANTLR end "ruleSCM"


    // $ANTLR start "entryRuleCron"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:778:1: entryRuleCron returns [EObject current=null] : iv_ruleCron= ruleCron EOF ;
    public final EObject entryRuleCron() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCron = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:779:2: (iv_ruleCron= ruleCron EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:780:2: iv_ruleCron= ruleCron EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCronRule()); 
            }
            pushFollow(FOLLOW_ruleCron_in_entryRuleCron1526);
            iv_ruleCron=ruleCron();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCron; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCron1536); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCron"


    // $ANTLR start "ruleCron"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:787:1: ruleCron returns [EObject current=null] : ( () otherlv_1= 'Cron' ( (lv_planning_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleCron() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_planning_2_0=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:790:28: ( ( () otherlv_1= 'Cron' ( (lv_planning_2_0= RULE_STRING ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:791:1: ( () otherlv_1= 'Cron' ( (lv_planning_2_0= RULE_STRING ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:791:1: ( () otherlv_1= 'Cron' ( (lv_planning_2_0= RULE_STRING ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:791:2: () otherlv_1= 'Cron' ( (lv_planning_2_0= RULE_STRING ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:791:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:792:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCronAccess().getCronAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleCron1582); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCronAccess().getCronKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:801:1: ( (lv_planning_2_0= RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:802:1: (lv_planning_2_0= RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:802:1: (lv_planning_2_0= RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:803:3: lv_planning_2_0= RULE_STRING
            {
            lv_planning_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCron1599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_planning_2_0, grammarAccess.getCronAccess().getPlanningSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCronRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"planning",
                      		lv_planning_2_0, 
                      		"STRING");
              	    
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
    // $ANTLR end "ruleCron"


    // $ANTLR start "entryRuleUser"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:827:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:828:2: (iv_ruleUser= ruleUser EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:829:2: iv_ruleUser= ruleUser EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUserRule()); 
            }
            pushFollow(FOLLOW_ruleUser_in_entryRuleUser1640);
            iv_ruleUser=ruleUser();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUser; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUser1650); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:836:1: ruleUser returns [EObject current=null] : ( () otherlv_1= 'login:' ( (lv_login_2_0= RULE_STRING ) ) (otherlv_3= 'permission:' ( (lv_permission_4_0= ruleUserPermission ) ) )? ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_login_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_permission_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:839:28: ( ( () otherlv_1= 'login:' ( (lv_login_2_0= RULE_STRING ) ) (otherlv_3= 'permission:' ( (lv_permission_4_0= ruleUserPermission ) ) )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:840:1: ( () otherlv_1= 'login:' ( (lv_login_2_0= RULE_STRING ) ) (otherlv_3= 'permission:' ( (lv_permission_4_0= ruleUserPermission ) ) )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:840:1: ( () otherlv_1= 'login:' ( (lv_login_2_0= RULE_STRING ) ) (otherlv_3= 'permission:' ( (lv_permission_4_0= ruleUserPermission ) ) )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:840:2: () otherlv_1= 'login:' ( (lv_login_2_0= RULE_STRING ) ) (otherlv_3= 'permission:' ( (lv_permission_4_0= ruleUserPermission ) ) )?
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:840:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:841:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUserAccess().getUserAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleUser1696); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUserAccess().getLoginKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:850:1: ( (lv_login_2_0= RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:851:1: (lv_login_2_0= RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:851:1: (lv_login_2_0= RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:852:3: lv_login_2_0= RULE_STRING
            {
            lv_login_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUser1713); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_login_2_0, grammarAccess.getUserAccess().getLoginSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getUserRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"login",
                      		lv_login_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:868:2: (otherlv_3= 'permission:' ( (lv_permission_4_0= ruleUserPermission ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:868:4: otherlv_3= 'permission:' ( (lv_permission_4_0= ruleUserPermission ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleUser1731); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getUserAccess().getPermissionKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:872:1: ( (lv_permission_4_0= ruleUserPermission ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:873:1: (lv_permission_4_0= ruleUserPermission )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:873:1: (lv_permission_4_0= ruleUserPermission )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:874:3: lv_permission_4_0= ruleUserPermission
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUserAccess().getPermissionUserPermissionEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUserPermission_in_ruleUser1752);
                    lv_permission_4_0=ruleUserPermission();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUserRule());
                      	        }
                             		set(
                             			current, 
                             			"permission",
                              		lv_permission_4_0, 
                              		"UserPermission");
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
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleFeature"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:898:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:899:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:900:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1790);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1800); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:907:1: ruleFeature returns [EObject current=null] : ( () ( (lv_name_1_0= ruleFQN ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:910:28: ( ( () ( (lv_name_1_0= ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:911:1: ( () ( (lv_name_1_0= ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:911:1: ( () ( (lv_name_1_0= ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:911:2: () ( (lv_name_1_0= ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:911:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:912:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFeatureAccess().getFeatureAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:917:2: ( (lv_name_1_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:918:1: (lv_name_1_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:918:1: (lv_name_1_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:919:3: lv_name_1_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFeatureAccess().getNameFQNParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleFeature1855);
            lv_name_1_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFeatureRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"FQN");
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleFQN"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:945:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:946:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:947:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1894);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1905); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:954:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:957:28: ( (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:958:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:958:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:958:6: this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1945); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:965:1: (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==34) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:966:2: kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    {
            	    kw=(Token)match(input,34,FOLLOW_34_in_ruleFQN1964); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:971:1: ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:971:2: ( RULE_ID )=>this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1985); if (state.failed) return current;
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
            	    break loop21;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:986:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:987:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:988:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_entryRuleEBoolean2034);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBoolean2045); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:995:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:998:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:999:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:999:1: (kw= 'true' | kw= 'false' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            else if ( (LA22_0==36) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1000:2: kw= 'true'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleEBoolean2083); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1007:2: kw= 'false'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleEBoolean2102); if (state.failed) return current;
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


    // $ANTLR start "ruleProtocolType"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1022:1: ruleProtocolType returns [Enumerator current=null] : ( (enumLiteral_0= 'svn://' ) | (enumLiteral_1= 'svn+ssh://' ) ) ;
    public final Enumerator ruleProtocolType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1024:28: ( ( (enumLiteral_0= 'svn://' ) | (enumLiteral_1= 'svn+ssh://' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1025:1: ( (enumLiteral_0= 'svn://' ) | (enumLiteral_1= 'svn+ssh://' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1025:1: ( (enumLiteral_0= 'svn://' ) | (enumLiteral_1= 'svn+ssh://' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            else if ( (LA23_0==38) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1025:2: (enumLiteral_0= 'svn://' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1025:2: (enumLiteral_0= 'svn://' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1025:4: enumLiteral_0= 'svn://'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_37_in_ruleProtocolType2158); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getProtocolTypeAccess().getSvnEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getProtocolTypeAccess().getSvnEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1031:6: (enumLiteral_1= 'svn+ssh://' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1031:6: (enumLiteral_1= 'svn+ssh://' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1031:8: enumLiteral_1= 'svn+ssh://'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_38_in_ruleProtocolType2175); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getProtocolTypeAccess().getSvnsshEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getProtocolTypeAccess().getSvnsshEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleProtocolType"


    // $ANTLR start "ruleUserPermission"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1041:1: ruleUserPermission returns [Enumerator current=null] : ( (enumLiteral_0= 'WRITE' ) | (enumLiteral_1= 'EXECUTE' ) | (enumLiteral_2= 'READ' ) ) ;
    public final Enumerator ruleUserPermission() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1043:28: ( ( (enumLiteral_0= 'WRITE' ) | (enumLiteral_1= 'EXECUTE' ) | (enumLiteral_2= 'READ' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1044:1: ( (enumLiteral_0= 'WRITE' ) | (enumLiteral_1= 'EXECUTE' ) | (enumLiteral_2= 'READ' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1044:1: ( (enumLiteral_0= 'WRITE' ) | (enumLiteral_1= 'EXECUTE' ) | (enumLiteral_2= 'READ' ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt24=1;
                }
                break;
            case 40:
                {
                alt24=2;
                }
                break;
            case 41:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1044:2: (enumLiteral_0= 'WRITE' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1044:2: (enumLiteral_0= 'WRITE' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1044:4: enumLiteral_0= 'WRITE'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_39_in_ruleUserPermission2220); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUserPermissionAccess().getWRITEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUserPermissionAccess().getWRITEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1050:6: (enumLiteral_1= 'EXECUTE' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1050:6: (enumLiteral_1= 'EXECUTE' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1050:8: enumLiteral_1= 'EXECUTE'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_40_in_ruleUserPermission2237); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUserPermissionAccess().getEXECUTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUserPermissionAccess().getEXECUTEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1056:6: (enumLiteral_2= 'READ' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1056:6: (enumLiteral_2= 'READ' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpbuild.g:1056:8: enumLiteral_2= 'READ'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_41_in_ruleUserPermission2254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUserPermissionAccess().getREADEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getUserPermissionAccess().getREADEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleUserPermission"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleBuild_in_entryRuleBuild75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuild85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleBuild131 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleBuild152 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBuild164 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBuild176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBuild193 = new BitSet(new long[]{0x000000000004C000L});
    public static final BitSet FOLLOW_ruleRepository_in_ruleBuild219 = new BitSet(new long[]{0x000000000004C000L});
    public static final BitSet FOLLOW_ruleHudsonDeployment_in_ruleBuild241 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBuild254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepository_in_entryRuleRepository290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepository300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleRepository346 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_ruleProtocolType_in_ruleRepository367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRepository384 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_12_in_ruleRepository402 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_ruleSourceFoulder_in_ruleRepository423 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_ruleRepository436 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRepository451 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleRepository472 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSourceFoulder_in_entryRuleSourceFoulder510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSourceFoulder520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSourceFoulder566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSourceFoulder583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHudsonDeployment_in_entryRuleHudsonDeployment624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHudsonDeployment634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleHudsonDeployment680 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleHudsonDeployment692 = new BitSet(new long[]{0x000000001FF84000L});
    public static final BitSet FOLLOW_19_in_ruleHudsonDeployment705 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHudsonDeployment722 = new BitSet(new long[]{0x000000001FF04000L});
    public static final BitSet FOLLOW_20_in_ruleHudsonDeployment742 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHudsonDeployment759 = new BitSet(new long[]{0x000000001FE04000L});
    public static final BitSet FOLLOW_21_in_ruleHudsonDeployment779 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHudsonDeployment796 = new BitSet(new long[]{0x000000001FC04000L});
    public static final BitSet FOLLOW_22_in_ruleHudsonDeployment816 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleHudsonDeployment837 = new BitSet(new long[]{0x000000001F804000L});
    public static final BitSet FOLLOW_23_in_ruleHudsonDeployment852 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHudsonDeployment869 = new BitSet(new long[]{0x000000001F004000L});
    public static final BitSet FOLLOW_24_in_ruleHudsonDeployment889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHudsonDeployment906 = new BitSet(new long[]{0x000000001E004000L});
    public static final BitSet FOLLOW_25_in_ruleHudsonDeployment926 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHudsonDeployment943 = new BitSet(new long[]{0x000000001C004000L});
    public static final BitSet FOLLOW_26_in_ruleHudsonDeployment963 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleHudsonDeployment975 = new BitSet(new long[]{0x0000000100004000L});
    public static final BitSet FOLLOW_ruleUser_in_ruleHudsonDeployment996 = new BitSet(new long[]{0x0000000100004000L});
    public static final BitSet FOLLOW_14_in_ruleHudsonDeployment1009 = new BitSet(new long[]{0x0000000018004000L});
    public static final BitSet FOLLOW_27_in_ruleHudsonDeployment1024 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleHudsonDeployment1036 = new BitSet(new long[]{0x00000000C0004000L});
    public static final BitSet FOLLOW_ruleTrigger_in_ruleHudsonDeployment1057 = new BitSet(new long[]{0x00000000C0004000L});
    public static final BitSet FOLLOW_14_in_ruleHudsonDeployment1070 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_ruleGenerationLocation_in_ruleHudsonDeployment1093 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleHudsonDeployment1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationLocation_in_entryRuleGenerationLocation1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerationLocation1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleGenerationLocation1198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGenerationLocation1215 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleGenerationLocation1233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGenerationLocation1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrigger_in_entryRuleTrigger1293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrigger1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSCM_in_ruleTrigger1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCron_in_ruleTrigger1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSCM_in_entryRuleSCM1412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSCM1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSCM1468 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCM1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCron_in_entryRuleCron1526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCron1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCron1582 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCron1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_entryRuleUser1640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUser1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleUser1696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUser1713 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleUser1731 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_ruleUserPermission_in_ruleUser1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFeature1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1945 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleFQN1964 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1985 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean2034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleEBoolean2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleEBoolean2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleProtocolType2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleProtocolType2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleUserPermission2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleUserPermission2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleUserPermission2254 = new BitSet(new long[]{0x0000000000000002L});

}
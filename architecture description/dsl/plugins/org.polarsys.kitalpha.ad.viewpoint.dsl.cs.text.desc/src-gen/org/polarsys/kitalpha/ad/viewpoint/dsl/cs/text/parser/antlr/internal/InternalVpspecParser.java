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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpspecGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalVpspecParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Viewpoint'", "'{'", "'name:'", "'description:'", "'extends'", "','", "'aggregates'", "'Data'", "'UI'", "'Diagrams'", "'Services'", "'Build'", "'Configuration'", "'}'", "'.'"
    };
    public static final int RULE_ID=4;
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


        public InternalVpspecParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVpspecParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVpspecParser.tokenNames; }
    public String getGrammarFileName() { return "../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g"; }



     	private VpspecGrammarAccess grammarAccess;
     	
        public InternalVpspecParser(TokenStream input, VpspecGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Viewpoint";	
       	}
       	
       	@Override
       	protected VpspecGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleViewpoint"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:67:1: entryRuleViewpoint returns [EObject current=null] : iv_ruleViewpoint= ruleViewpoint EOF ;
    public final EObject entryRuleViewpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewpoint = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:68:2: (iv_ruleViewpoint= ruleViewpoint EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:69:2: iv_ruleViewpoint= ruleViewpoint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getViewpointRule()); 
            }
            pushFollow(FOLLOW_ruleViewpoint_in_entryRuleViewpoint75);
            iv_ruleViewpoint=ruleViewpoint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleViewpoint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewpoint85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleViewpoint"


    // $ANTLR start "ruleViewpoint"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:76:1: ruleViewpoint returns [EObject current=null] : ( () otherlv_1= 'Viewpoint' ( (lv_shortName_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'name:' ( (lv_name_5_0= RULE_STRING ) ) ) (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'aggregates' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* )? (otherlv_16= 'Data' ( ( ruleFQN ) ) )? ( ( (lv_type_18_0= 'UI' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_20_0= 'Diagrams' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_22_0= 'Services' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_24_0= 'Build' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_26_0= 'Configuration' ) ) ( ( ruleFQN ) ) )? otherlv_28= '}' ) ;
    public final EObject ruleViewpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_shortName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token lv_type_18_0=null;
        Token lv_type_20_0=null;
        Token lv_type_22_0=null;
        Token lv_type_24_0=null;
        Token lv_type_26_0=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_description_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:79:28: ( ( () otherlv_1= 'Viewpoint' ( (lv_shortName_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'name:' ( (lv_name_5_0= RULE_STRING ) ) ) (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'aggregates' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* )? (otherlv_16= 'Data' ( ( ruleFQN ) ) )? ( ( (lv_type_18_0= 'UI' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_20_0= 'Diagrams' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_22_0= 'Services' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_24_0= 'Build' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_26_0= 'Configuration' ) ) ( ( ruleFQN ) ) )? otherlv_28= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:80:1: ( () otherlv_1= 'Viewpoint' ( (lv_shortName_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'name:' ( (lv_name_5_0= RULE_STRING ) ) ) (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'aggregates' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* )? (otherlv_16= 'Data' ( ( ruleFQN ) ) )? ( ( (lv_type_18_0= 'UI' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_20_0= 'Diagrams' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_22_0= 'Services' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_24_0= 'Build' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_26_0= 'Configuration' ) ) ( ( ruleFQN ) ) )? otherlv_28= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:80:1: ( () otherlv_1= 'Viewpoint' ( (lv_shortName_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'name:' ( (lv_name_5_0= RULE_STRING ) ) ) (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'aggregates' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* )? (otherlv_16= 'Data' ( ( ruleFQN ) ) )? ( ( (lv_type_18_0= 'UI' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_20_0= 'Diagrams' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_22_0= 'Services' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_24_0= 'Build' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_26_0= 'Configuration' ) ) ( ( ruleFQN ) ) )? otherlv_28= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:80:2: () otherlv_1= 'Viewpoint' ( (lv_shortName_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'name:' ( (lv_name_5_0= RULE_STRING ) ) ) (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'aggregates' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* )? (otherlv_16= 'Data' ( ( ruleFQN ) ) )? ( ( (lv_type_18_0= 'UI' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_20_0= 'Diagrams' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_22_0= 'Services' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_24_0= 'Build' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_26_0= 'Configuration' ) ) ( ( ruleFQN ) ) )? otherlv_28= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:80:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:81:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getViewpointAccess().getViewpointAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleViewpoint131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getViewpointAccess().getViewpointKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:90:1: ( (lv_shortName_2_0= RULE_ID ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:91:1: (lv_shortName_2_0= RULE_ID )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:91:1: (lv_shortName_2_0= RULE_ID )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:92:3: lv_shortName_2_0= RULE_ID
                    {
                    lv_shortName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleViewpoint148); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_shortName_2_0, grammarAccess.getViewpointAccess().getShortNameIDTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"shortName",
                              		lv_shortName_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleViewpoint166); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getViewpointAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:112:1: (otherlv_4= 'name:' ( (lv_name_5_0= RULE_STRING ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:112:3: otherlv_4= 'name:' ( (lv_name_5_0= RULE_STRING ) )
            {
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleViewpoint179); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getViewpointAccess().getNameKeyword_4_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:116:1: ( (lv_name_5_0= RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:117:1: (lv_name_5_0= RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:117:1: (lv_name_5_0= RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:118:3: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleViewpoint196); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getViewpointAccess().getNameSTRINGTerminalRuleCall_4_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getViewpointRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:134:3: (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:134:5: otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleViewpoint215); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getViewpointAccess().getDescriptionKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:138:1: ( (lv_description_7_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:139:1: (lv_description_7_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:139:1: (lv_description_7_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:140:3: lv_description_7_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleViewpoint236);
                    lv_description_7_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getViewpointRule());
                      	        }
                             		set(
                             			current, 
                             			"description",
                              		lv_description_7_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:156:4: (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:156:6: otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleViewpoint251); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getViewpointAccess().getExtendsKeyword_6_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:160:1: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:161:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:161:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:162:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getParentsViewpointCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint274);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:175:2: (otherlv_10= ',' ( ( ruleFQN ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:175:4: otherlv_10= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleViewpoint287); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getViewpointAccess().getCommaKeyword_6_2_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:179:1: ( ( ruleFQN ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:180:1: ( ruleFQN )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:180:1: ( ruleFQN )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:181:3: ruleFQN
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getViewpointRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getViewpointAccess().getParentsViewpointCrossReference_6_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint310);
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
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:194:6: (otherlv_12= 'aggregates' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:194:8: otherlv_12= 'aggregates' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleViewpoint327); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getViewpointAccess().getAggregatesKeyword_7_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:198:1: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:199:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:199:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:200:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getDependenciesViewpointCrossReference_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint350);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:213:2: (otherlv_14= ',' ( ( ruleFQN ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:213:4: otherlv_14= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_14=(Token)match(input,16,FOLLOW_16_in_ruleViewpoint363); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_14, grammarAccess.getViewpointAccess().getCommaKeyword_7_2_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:217:1: ( ( ruleFQN ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:218:1: ( ruleFQN )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:218:1: ( ruleFQN )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:219:3: ruleFQN
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getViewpointRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getViewpointAccess().getDependenciesViewpointCrossReference_7_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint386);
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
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:232:6: (otherlv_16= 'Data' ( ( ruleFQN ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:232:8: otherlv_16= 'Data' ( ( ruleFQN ) )
                    {
                    otherlv_16=(Token)match(input,18,FOLLOW_18_in_ruleViewpoint403); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getViewpointAccess().getDataKeyword_8_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:236:1: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:237:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:237:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:238:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_DataDataCrossReference_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint426);
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

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:251:4: ( ( (lv_type_18_0= 'UI' ) ) ( ( ruleFQN ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:251:5: ( (lv_type_18_0= 'UI' ) ) ( ( ruleFQN ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:251:5: ( (lv_type_18_0= 'UI' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:252:1: (lv_type_18_0= 'UI' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:252:1: (lv_type_18_0= 'UI' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:253:3: lv_type_18_0= 'UI'
                    {
                    lv_type_18_0=(Token)match(input,19,FOLLOW_19_in_ruleViewpoint447); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_18_0, grammarAccess.getViewpointAccess().getTypeUIKeyword_9_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                             		addWithLastConsumed(current, "type", lv_type_18_0, "UI");
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:266:2: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:267:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:267:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:268:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionCrossReference_9_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint483);
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

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:281:4: ( ( (lv_type_20_0= 'Diagrams' ) ) ( ( ruleFQN ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:281:5: ( (lv_type_20_0= 'Diagrams' ) ) ( ( ruleFQN ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:281:5: ( (lv_type_20_0= 'Diagrams' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:282:1: (lv_type_20_0= 'Diagrams' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:282:1: (lv_type_20_0= 'Diagrams' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:283:3: lv_type_20_0= 'Diagrams'
                    {
                    lv_type_20_0=(Token)match(input,20,FOLLOW_20_in_ruleViewpoint504); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_20_0, grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_10_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                             		addWithLastConsumed(current, "type", lv_type_20_0, "Diagrams");
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:296:2: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:297:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:297:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:298:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetCrossReference_10_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint540);
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

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:311:4: ( ( (lv_type_22_0= 'Services' ) ) ( ( ruleFQN ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:311:5: ( (lv_type_22_0= 'Services' ) ) ( ( ruleFQN ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:311:5: ( (lv_type_22_0= 'Services' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:312:1: (lv_type_22_0= 'Services' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:312:1: (lv_type_22_0= 'Services' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:313:3: lv_type_22_0= 'Services'
                    {
                    lv_type_22_0=(Token)match(input,21,FOLLOW_21_in_ruleViewpoint561); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_22_0, grammarAccess.getViewpointAccess().getTypeServicesKeyword_11_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                             		addWithLastConsumed(current, "type", lv_type_22_0, "Services");
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:326:2: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:327:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:327:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:328:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetCrossReference_11_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint597);
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

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:341:4: ( ( (lv_type_24_0= 'Build' ) ) ( ( ruleFQN ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:341:5: ( (lv_type_24_0= 'Build' ) ) ( ( ruleFQN ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:341:5: ( (lv_type_24_0= 'Build' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:342:1: (lv_type_24_0= 'Build' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:342:1: (lv_type_24_0= 'Build' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:343:3: lv_type_24_0= 'Build'
                    {
                    lv_type_24_0=(Token)match(input,22,FOLLOW_22_in_ruleViewpoint618); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_24_0, grammarAccess.getViewpointAccess().getTypeBuildKeyword_12_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                             		addWithLastConsumed(current, "type", lv_type_24_0, "Build");
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:356:2: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:357:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:357:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:358:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_AspectsBuildCrossReference_12_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint654);
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

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:371:4: ( ( (lv_type_26_0= 'Configuration' ) ) ( ( ruleFQN ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:371:5: ( (lv_type_26_0= 'Configuration' ) ) ( ( ruleFQN ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:371:5: ( (lv_type_26_0= 'Configuration' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:372:1: (lv_type_26_0= 'Configuration' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:372:1: (lv_type_26_0= 'Configuration' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:373:3: lv_type_26_0= 'Configuration'
                    {
                    lv_type_26_0=(Token)match(input,23,FOLLOW_23_in_ruleViewpoint675); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_26_0, grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_13_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                             		addWithLastConsumed(current, "type", lv_type_26_0, "Configuration");
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:386:2: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:387:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:387:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:388:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationCrossReference_13_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint711);
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

            }

            otherlv_28=(Token)match(input,24,FOLLOW_24_in_ruleViewpoint725); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_28, grammarAccess.getViewpointAccess().getRightCurlyBracketKeyword_14());
                  
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
    // $ANTLR end "ruleViewpoint"


    // $ANTLR start "entryRuleEString"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:413:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:414:2: (iv_ruleEString= ruleEString EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:415:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString762);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString773); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:422:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:425:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:426:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:426:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:426:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:434:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString839); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:449:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:450:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:451:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN885);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN896); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:458:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:461:28: ( (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:462:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:462:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:462:6: this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN936); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:469:1: (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:470:2: kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    {
            	    kw=(Token)match(input,25,FOLLOW_25_in_ruleFQN955); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:475:1: ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:475:2: ( RULE_ID )=>this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN976); if (state.failed) return current;
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
            	    break loop14;
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


 

    public static final BitSet FOLLOW_ruleViewpoint_in_entryRuleViewpoint75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewpoint85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleViewpoint131 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleViewpoint148 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleViewpoint166 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleViewpoint179 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleViewpoint196 = new BitSet(new long[]{0x0000000001FEC000L});
    public static final BitSet FOLLOW_14_in_ruleViewpoint215 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleViewpoint236 = new BitSet(new long[]{0x0000000001FE8000L});
    public static final BitSet FOLLOW_15_in_ruleViewpoint251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint274 = new BitSet(new long[]{0x0000000001FF0000L});
    public static final BitSet FOLLOW_16_in_ruleViewpoint287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint310 = new BitSet(new long[]{0x0000000001FF0000L});
    public static final BitSet FOLLOW_17_in_ruleViewpoint327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint350 = new BitSet(new long[]{0x0000000001FD0000L});
    public static final BitSet FOLLOW_16_in_ruleViewpoint363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint386 = new BitSet(new long[]{0x0000000001FD0000L});
    public static final BitSet FOLLOW_18_in_ruleViewpoint403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint426 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_19_in_ruleViewpoint447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint483 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_20_in_ruleViewpoint504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint540 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_21_in_ruleViewpoint561 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint597 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_22_in_ruleViewpoint618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint654 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleViewpoint675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint711 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleViewpoint725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN936 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleFQN955 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN976 = new BitSet(new long[]{0x0000000002000002L});

}
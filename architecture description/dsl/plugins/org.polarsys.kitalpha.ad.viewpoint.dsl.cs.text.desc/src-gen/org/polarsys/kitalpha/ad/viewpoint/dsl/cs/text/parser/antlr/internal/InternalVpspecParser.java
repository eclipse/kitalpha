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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Viewpoint'", "'{'", "'name:'", "'description:'", "'extends'", "','", "'aggregates'", "'uses viewpoint'", "'uses model'", "'uses diagram'", "'uses workspace'", "'uses filesystem'", "'Data'", "'UI'", "'Diagrams'", "'Services'", "'Build'", "'Configuration'", "'}'", "'.'"
    };
    public static final int RULE_ID=4;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:76:1: ruleViewpoint returns [EObject current=null] : ( () otherlv_1= 'Viewpoint' ( (lv_shortName_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'name:' ( (lv_name_5_0= RULE_STRING ) ) ) (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'aggregates' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* )? (otherlv_16= 'uses viewpoint' ( ( ruleFQN ) ) (otherlv_18= ',' ( ( ruleFQN ) ) )* )? (otherlv_20= 'uses model' ( (lv_useAnyEMFResource_21_0= ruleEString ) ) (otherlv_22= ',' ( (lv_useAnyEMFResource_23_0= ruleEString ) ) )* )? (otherlv_24= 'uses diagram' ( (lv_useDiagramResource_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_useDiagramResource_27_0= ruleEString ) ) )* )? (otherlv_28= 'uses workspace' ( (lv_useWorkspaceResource_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_useWorkspaceResource_31_0= ruleEString ) ) )* )? (otherlv_32= 'uses filesystem' ( (lv_useFSResource_33_0= ruleEString ) ) (otherlv_34= ',' ( (lv_useFSResource_35_0= ruleEString ) ) )* )? (otherlv_36= 'Data' ( ( ruleFQN ) ) )? ( ( (lv_type_38_0= 'UI' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_40_0= 'Diagrams' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_42_0= 'Services' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_44_0= 'Build' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_46_0= 'Configuration' ) ) ( ( ruleFQN ) ) )? otherlv_48= '}' ) ;
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
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token lv_type_38_0=null;
        Token lv_type_40_0=null;
        Token lv_type_42_0=null;
        Token lv_type_44_0=null;
        Token lv_type_46_0=null;
        Token otherlv_48=null;
        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_useAnyEMFResource_21_0 = null;

        AntlrDatatypeRuleToken lv_useAnyEMFResource_23_0 = null;

        AntlrDatatypeRuleToken lv_useDiagramResource_25_0 = null;

        AntlrDatatypeRuleToken lv_useDiagramResource_27_0 = null;

        AntlrDatatypeRuleToken lv_useWorkspaceResource_29_0 = null;

        AntlrDatatypeRuleToken lv_useWorkspaceResource_31_0 = null;

        AntlrDatatypeRuleToken lv_useFSResource_33_0 = null;

        AntlrDatatypeRuleToken lv_useFSResource_35_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:79:28: ( ( () otherlv_1= 'Viewpoint' ( (lv_shortName_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'name:' ( (lv_name_5_0= RULE_STRING ) ) ) (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'aggregates' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* )? (otherlv_16= 'uses viewpoint' ( ( ruleFQN ) ) (otherlv_18= ',' ( ( ruleFQN ) ) )* )? (otherlv_20= 'uses model' ( (lv_useAnyEMFResource_21_0= ruleEString ) ) (otherlv_22= ',' ( (lv_useAnyEMFResource_23_0= ruleEString ) ) )* )? (otherlv_24= 'uses diagram' ( (lv_useDiagramResource_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_useDiagramResource_27_0= ruleEString ) ) )* )? (otherlv_28= 'uses workspace' ( (lv_useWorkspaceResource_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_useWorkspaceResource_31_0= ruleEString ) ) )* )? (otherlv_32= 'uses filesystem' ( (lv_useFSResource_33_0= ruleEString ) ) (otherlv_34= ',' ( (lv_useFSResource_35_0= ruleEString ) ) )* )? (otherlv_36= 'Data' ( ( ruleFQN ) ) )? ( ( (lv_type_38_0= 'UI' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_40_0= 'Diagrams' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_42_0= 'Services' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_44_0= 'Build' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_46_0= 'Configuration' ) ) ( ( ruleFQN ) ) )? otherlv_48= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:80:1: ( () otherlv_1= 'Viewpoint' ( (lv_shortName_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'name:' ( (lv_name_5_0= RULE_STRING ) ) ) (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'aggregates' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* )? (otherlv_16= 'uses viewpoint' ( ( ruleFQN ) ) (otherlv_18= ',' ( ( ruleFQN ) ) )* )? (otherlv_20= 'uses model' ( (lv_useAnyEMFResource_21_0= ruleEString ) ) (otherlv_22= ',' ( (lv_useAnyEMFResource_23_0= ruleEString ) ) )* )? (otherlv_24= 'uses diagram' ( (lv_useDiagramResource_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_useDiagramResource_27_0= ruleEString ) ) )* )? (otherlv_28= 'uses workspace' ( (lv_useWorkspaceResource_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_useWorkspaceResource_31_0= ruleEString ) ) )* )? (otherlv_32= 'uses filesystem' ( (lv_useFSResource_33_0= ruleEString ) ) (otherlv_34= ',' ( (lv_useFSResource_35_0= ruleEString ) ) )* )? (otherlv_36= 'Data' ( ( ruleFQN ) ) )? ( ( (lv_type_38_0= 'UI' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_40_0= 'Diagrams' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_42_0= 'Services' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_44_0= 'Build' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_46_0= 'Configuration' ) ) ( ( ruleFQN ) ) )? otherlv_48= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:80:1: ( () otherlv_1= 'Viewpoint' ( (lv_shortName_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'name:' ( (lv_name_5_0= RULE_STRING ) ) ) (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'aggregates' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* )? (otherlv_16= 'uses viewpoint' ( ( ruleFQN ) ) (otherlv_18= ',' ( ( ruleFQN ) ) )* )? (otherlv_20= 'uses model' ( (lv_useAnyEMFResource_21_0= ruleEString ) ) (otherlv_22= ',' ( (lv_useAnyEMFResource_23_0= ruleEString ) ) )* )? (otherlv_24= 'uses diagram' ( (lv_useDiagramResource_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_useDiagramResource_27_0= ruleEString ) ) )* )? (otherlv_28= 'uses workspace' ( (lv_useWorkspaceResource_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_useWorkspaceResource_31_0= ruleEString ) ) )* )? (otherlv_32= 'uses filesystem' ( (lv_useFSResource_33_0= ruleEString ) ) (otherlv_34= ',' ( (lv_useFSResource_35_0= ruleEString ) ) )* )? (otherlv_36= 'Data' ( ( ruleFQN ) ) )? ( ( (lv_type_38_0= 'UI' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_40_0= 'Diagrams' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_42_0= 'Services' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_44_0= 'Build' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_46_0= 'Configuration' ) ) ( ( ruleFQN ) ) )? otherlv_48= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:80:2: () otherlv_1= 'Viewpoint' ( (lv_shortName_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'name:' ( (lv_name_5_0= RULE_STRING ) ) ) (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'aggregates' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* )? (otherlv_16= 'uses viewpoint' ( ( ruleFQN ) ) (otherlv_18= ',' ( ( ruleFQN ) ) )* )? (otherlv_20= 'uses model' ( (lv_useAnyEMFResource_21_0= ruleEString ) ) (otherlv_22= ',' ( (lv_useAnyEMFResource_23_0= ruleEString ) ) )* )? (otherlv_24= 'uses diagram' ( (lv_useDiagramResource_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_useDiagramResource_27_0= ruleEString ) ) )* )? (otherlv_28= 'uses workspace' ( (lv_useWorkspaceResource_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_useWorkspaceResource_31_0= ruleEString ) ) )* )? (otherlv_32= 'uses filesystem' ( (lv_useFSResource_33_0= ruleEString ) ) (otherlv_34= ',' ( (lv_useFSResource_35_0= ruleEString ) ) )* )? (otherlv_36= 'Data' ( ( ruleFQN ) ) )? ( ( (lv_type_38_0= 'UI' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_40_0= 'Diagrams' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_42_0= 'Services' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_44_0= 'Build' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_46_0= 'Configuration' ) ) ( ( ruleFQN ) ) )? otherlv_48= '}'
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:232:6: (otherlv_16= 'uses viewpoint' ( ( ruleFQN ) ) (otherlv_18= ',' ( ( ruleFQN ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:232:8: otherlv_16= 'uses viewpoint' ( ( ruleFQN ) ) (otherlv_18= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_16=(Token)match(input,18,FOLLOW_18_in_ruleViewpoint403); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getViewpointAccess().getUsesViewpointKeyword_8_0());
                          
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
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getUseViewpointViewpointCrossReference_8_1_0()); 
                      	    
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

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:251:2: (otherlv_18= ',' ( ( ruleFQN ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:251:4: otherlv_18= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_18=(Token)match(input,16,FOLLOW_16_in_ruleViewpoint439); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_18, grammarAccess.getViewpointAccess().getCommaKeyword_8_2_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:255:1: ( ( ruleFQN ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:256:1: ( ruleFQN )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:256:1: ( ruleFQN )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:257:3: ruleFQN
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getViewpointRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getViewpointAccess().getUseViewpointViewpointCrossReference_8_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint462);
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
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:270:6: (otherlv_20= 'uses model' ( (lv_useAnyEMFResource_21_0= ruleEString ) ) (otherlv_22= ',' ( (lv_useAnyEMFResource_23_0= ruleEString ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:270:8: otherlv_20= 'uses model' ( (lv_useAnyEMFResource_21_0= ruleEString ) ) (otherlv_22= ',' ( (lv_useAnyEMFResource_23_0= ruleEString ) ) )*
                    {
                    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleViewpoint479); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getViewpointAccess().getUsesModelKeyword_9_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:274:1: ( (lv_useAnyEMFResource_21_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:275:1: (lv_useAnyEMFResource_21_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:275:1: (lv_useAnyEMFResource_21_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:276:3: lv_useAnyEMFResource_21_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getUseAnyEMFResourceEStringParserRuleCall_9_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleViewpoint500);
                    lv_useAnyEMFResource_21_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getViewpointRule());
                      	        }
                             		add(
                             			current, 
                             			"useAnyEMFResource",
                              		lv_useAnyEMFResource_21_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:292:2: (otherlv_22= ',' ( (lv_useAnyEMFResource_23_0= ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:292:4: otherlv_22= ',' ( (lv_useAnyEMFResource_23_0= ruleEString ) )
                    	    {
                    	    otherlv_22=(Token)match(input,16,FOLLOW_16_in_ruleViewpoint513); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_22, grammarAccess.getViewpointAccess().getCommaKeyword_9_2_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:296:1: ( (lv_useAnyEMFResource_23_0= ruleEString ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:297:1: (lv_useAnyEMFResource_23_0= ruleEString )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:297:1: (lv_useAnyEMFResource_23_0= ruleEString )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:298:3: lv_useAnyEMFResource_23_0= ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getViewpointAccess().getUseAnyEMFResourceEStringParserRuleCall_9_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEString_in_ruleViewpoint534);
                    	    lv_useAnyEMFResource_23_0=ruleEString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getViewpointRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"useAnyEMFResource",
                    	              		lv_useAnyEMFResource_23_0, 
                    	              		"EString");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:314:6: (otherlv_24= 'uses diagram' ( (lv_useDiagramResource_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_useDiagramResource_27_0= ruleEString ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:314:8: otherlv_24= 'uses diagram' ( (lv_useDiagramResource_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_useDiagramResource_27_0= ruleEString ) ) )*
                    {
                    otherlv_24=(Token)match(input,20,FOLLOW_20_in_ruleViewpoint551); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getViewpointAccess().getUsesDiagramKeyword_10_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:318:1: ( (lv_useDiagramResource_25_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:319:1: (lv_useDiagramResource_25_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:319:1: (lv_useDiagramResource_25_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:320:3: lv_useDiagramResource_25_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getUseDiagramResourceEStringParserRuleCall_10_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleViewpoint572);
                    lv_useDiagramResource_25_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getViewpointRule());
                      	        }
                             		add(
                             			current, 
                             			"useDiagramResource",
                              		lv_useDiagramResource_25_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:336:2: (otherlv_26= ',' ( (lv_useDiagramResource_27_0= ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==16) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:336:4: otherlv_26= ',' ( (lv_useDiagramResource_27_0= ruleEString ) )
                    	    {
                    	    otherlv_26=(Token)match(input,16,FOLLOW_16_in_ruleViewpoint585); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_26, grammarAccess.getViewpointAccess().getCommaKeyword_10_2_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:340:1: ( (lv_useDiagramResource_27_0= ruleEString ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:341:1: (lv_useDiagramResource_27_0= ruleEString )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:341:1: (lv_useDiagramResource_27_0= ruleEString )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:342:3: lv_useDiagramResource_27_0= ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getViewpointAccess().getUseDiagramResourceEStringParserRuleCall_10_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEString_in_ruleViewpoint606);
                    	    lv_useDiagramResource_27_0=ruleEString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getViewpointRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"useDiagramResource",
                    	              		lv_useDiagramResource_27_0, 
                    	              		"EString");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:358:6: (otherlv_28= 'uses workspace' ( (lv_useWorkspaceResource_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_useWorkspaceResource_31_0= ruleEString ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:358:8: otherlv_28= 'uses workspace' ( (lv_useWorkspaceResource_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_useWorkspaceResource_31_0= ruleEString ) ) )*
                    {
                    otherlv_28=(Token)match(input,21,FOLLOW_21_in_ruleViewpoint623); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_28, grammarAccess.getViewpointAccess().getUsesWorkspaceKeyword_11_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:362:1: ( (lv_useWorkspaceResource_29_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:363:1: (lv_useWorkspaceResource_29_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:363:1: (lv_useWorkspaceResource_29_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:364:3: lv_useWorkspaceResource_29_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getUseWorkspaceResourceEStringParserRuleCall_11_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleViewpoint644);
                    lv_useWorkspaceResource_29_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getViewpointRule());
                      	        }
                             		add(
                             			current, 
                             			"useWorkspaceResource",
                              		lv_useWorkspaceResource_29_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:380:2: (otherlv_30= ',' ( (lv_useWorkspaceResource_31_0= ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==16) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:380:4: otherlv_30= ',' ( (lv_useWorkspaceResource_31_0= ruleEString ) )
                    	    {
                    	    otherlv_30=(Token)match(input,16,FOLLOW_16_in_ruleViewpoint657); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_30, grammarAccess.getViewpointAccess().getCommaKeyword_11_2_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:384:1: ( (lv_useWorkspaceResource_31_0= ruleEString ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:385:1: (lv_useWorkspaceResource_31_0= ruleEString )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:385:1: (lv_useWorkspaceResource_31_0= ruleEString )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:386:3: lv_useWorkspaceResource_31_0= ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getViewpointAccess().getUseWorkspaceResourceEStringParserRuleCall_11_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEString_in_ruleViewpoint678);
                    	    lv_useWorkspaceResource_31_0=ruleEString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getViewpointRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"useWorkspaceResource",
                    	              		lv_useWorkspaceResource_31_0, 
                    	              		"EString");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:402:6: (otherlv_32= 'uses filesystem' ( (lv_useFSResource_33_0= ruleEString ) ) (otherlv_34= ',' ( (lv_useFSResource_35_0= ruleEString ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:402:8: otherlv_32= 'uses filesystem' ( (lv_useFSResource_33_0= ruleEString ) ) (otherlv_34= ',' ( (lv_useFSResource_35_0= ruleEString ) ) )*
                    {
                    otherlv_32=(Token)match(input,22,FOLLOW_22_in_ruleViewpoint695); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getViewpointAccess().getUsesFilesystemKeyword_12_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:406:1: ( (lv_useFSResource_33_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:407:1: (lv_useFSResource_33_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:407:1: (lv_useFSResource_33_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:408:3: lv_useFSResource_33_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getUseFSResourceEStringParserRuleCall_12_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleViewpoint716);
                    lv_useFSResource_33_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getViewpointRule());
                      	        }
                             		add(
                             			current, 
                             			"useFSResource",
                              		lv_useFSResource_33_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:424:2: (otherlv_34= ',' ( (lv_useFSResource_35_0= ruleEString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==16) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:424:4: otherlv_34= ',' ( (lv_useFSResource_35_0= ruleEString ) )
                    	    {
                    	    otherlv_34=(Token)match(input,16,FOLLOW_16_in_ruleViewpoint729); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_34, grammarAccess.getViewpointAccess().getCommaKeyword_12_2_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:428:1: ( (lv_useFSResource_35_0= ruleEString ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:429:1: (lv_useFSResource_35_0= ruleEString )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:429:1: (lv_useFSResource_35_0= ruleEString )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:430:3: lv_useFSResource_35_0= ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getViewpointAccess().getUseFSResourceEStringParserRuleCall_12_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEString_in_ruleViewpoint750);
                    	    lv_useFSResource_35_0=ruleEString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getViewpointRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"useFSResource",
                    	              		lv_useFSResource_35_0, 
                    	              		"EString");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:446:6: (otherlv_36= 'Data' ( ( ruleFQN ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:446:8: otherlv_36= 'Data' ( ( ruleFQN ) )
                    {
                    otherlv_36=(Token)match(input,23,FOLLOW_23_in_ruleViewpoint767); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_36, grammarAccess.getViewpointAccess().getDataKeyword_13_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:450:1: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:451:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:451:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:452:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_DataDataCrossReference_13_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint790);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:465:4: ( ( (lv_type_38_0= 'UI' ) ) ( ( ruleFQN ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:465:5: ( (lv_type_38_0= 'UI' ) ) ( ( ruleFQN ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:465:5: ( (lv_type_38_0= 'UI' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:466:1: (lv_type_38_0= 'UI' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:466:1: (lv_type_38_0= 'UI' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:467:3: lv_type_38_0= 'UI'
                    {
                    lv_type_38_0=(Token)match(input,24,FOLLOW_24_in_ruleViewpoint811); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_38_0, grammarAccess.getViewpointAccess().getTypeUIKeyword_14_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                             		addWithLastConsumed(current, "type", lv_type_38_0, "UI");
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:480:2: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:481:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:481:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:482:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionCrossReference_14_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint847);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:495:4: ( ( (lv_type_40_0= 'Diagrams' ) ) ( ( ruleFQN ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:495:5: ( (lv_type_40_0= 'Diagrams' ) ) ( ( ruleFQN ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:495:5: ( (lv_type_40_0= 'Diagrams' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:496:1: (lv_type_40_0= 'Diagrams' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:496:1: (lv_type_40_0= 'Diagrams' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:497:3: lv_type_40_0= 'Diagrams'
                    {
                    lv_type_40_0=(Token)match(input,25,FOLLOW_25_in_ruleViewpoint868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_40_0, grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_15_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                             		addWithLastConsumed(current, "type", lv_type_40_0, "Diagrams");
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:510:2: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:511:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:511:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:512:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetCrossReference_15_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint904);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:525:4: ( ( (lv_type_42_0= 'Services' ) ) ( ( ruleFQN ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:525:5: ( (lv_type_42_0= 'Services' ) ) ( ( ruleFQN ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:525:5: ( (lv_type_42_0= 'Services' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:526:1: (lv_type_42_0= 'Services' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:526:1: (lv_type_42_0= 'Services' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:527:3: lv_type_42_0= 'Services'
                    {
                    lv_type_42_0=(Token)match(input,26,FOLLOW_26_in_ruleViewpoint925); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_42_0, grammarAccess.getViewpointAccess().getTypeServicesKeyword_16_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                             		addWithLastConsumed(current, "type", lv_type_42_0, "Services");
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:540:2: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:541:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:541:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:542:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetCrossReference_16_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint961);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:555:4: ( ( (lv_type_44_0= 'Build' ) ) ( ( ruleFQN ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:555:5: ( (lv_type_44_0= 'Build' ) ) ( ( ruleFQN ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:555:5: ( (lv_type_44_0= 'Build' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:556:1: (lv_type_44_0= 'Build' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:556:1: (lv_type_44_0= 'Build' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:557:3: lv_type_44_0= 'Build'
                    {
                    lv_type_44_0=(Token)match(input,27,FOLLOW_27_in_ruleViewpoint982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_44_0, grammarAccess.getViewpointAccess().getTypeBuildKeyword_17_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                             		addWithLastConsumed(current, "type", lv_type_44_0, "Build");
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:570:2: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:571:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:571:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:572:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_AspectsBuildCrossReference_17_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint1018);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:585:4: ( ( (lv_type_46_0= 'Configuration' ) ) ( ( ruleFQN ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:585:5: ( (lv_type_46_0= 'Configuration' ) ) ( ( ruleFQN ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:585:5: ( (lv_type_46_0= 'Configuration' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:586:1: (lv_type_46_0= 'Configuration' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:586:1: (lv_type_46_0= 'Configuration' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:587:3: lv_type_46_0= 'Configuration'
                    {
                    lv_type_46_0=(Token)match(input,28,FOLLOW_28_in_ruleViewpoint1039); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_46_0, grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_18_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                             		addWithLastConsumed(current, "type", lv_type_46_0, "Configuration");
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:600:2: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:601:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:601:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:602:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationCrossReference_18_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint1075);
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

            otherlv_48=(Token)match(input,29,FOLLOW_29_in_ruleViewpoint1089); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_48, grammarAccess.getViewpointAccess().getRightCurlyBracketKeyword_19());
                  
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:627:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:628:2: (iv_ruleEString= ruleEString EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:629:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1126);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1137); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:636:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:639:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:640:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:640:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:640:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString1177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:648:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString1203); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:663:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:664:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:665:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1249);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1260); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:672:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:675:28: ( (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:676:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:676:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:676:6: this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1300); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:683:1: (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==30) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:684:2: kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleFQN1319); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:689:1: ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:689:2: ( RULE_ID )=>this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1340); if (state.failed) return current;
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
    // $ANTLR end "ruleFQN"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleViewpoint_in_entryRuleViewpoint75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewpoint85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleViewpoint131 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleViewpoint148 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleViewpoint166 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleViewpoint179 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleViewpoint196 = new BitSet(new long[]{0x000000003FFEC000L});
    public static final BitSet FOLLOW_14_in_ruleViewpoint215 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleViewpoint236 = new BitSet(new long[]{0x000000003FFE8000L});
    public static final BitSet FOLLOW_15_in_ruleViewpoint251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint274 = new BitSet(new long[]{0x000000003FFF0000L});
    public static final BitSet FOLLOW_16_in_ruleViewpoint287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint310 = new BitSet(new long[]{0x000000003FFF0000L});
    public static final BitSet FOLLOW_17_in_ruleViewpoint327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint350 = new BitSet(new long[]{0x000000003FFD0000L});
    public static final BitSet FOLLOW_16_in_ruleViewpoint363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint386 = new BitSet(new long[]{0x000000003FFD0000L});
    public static final BitSet FOLLOW_18_in_ruleViewpoint403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint426 = new BitSet(new long[]{0x000000003FF90000L});
    public static final BitSet FOLLOW_16_in_ruleViewpoint439 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint462 = new BitSet(new long[]{0x000000003FF90000L});
    public static final BitSet FOLLOW_19_in_ruleViewpoint479 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleViewpoint500 = new BitSet(new long[]{0x000000003FF10000L});
    public static final BitSet FOLLOW_16_in_ruleViewpoint513 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleViewpoint534 = new BitSet(new long[]{0x000000003FF10000L});
    public static final BitSet FOLLOW_20_in_ruleViewpoint551 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleViewpoint572 = new BitSet(new long[]{0x000000003FE10000L});
    public static final BitSet FOLLOW_16_in_ruleViewpoint585 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleViewpoint606 = new BitSet(new long[]{0x000000003FE10000L});
    public static final BitSet FOLLOW_21_in_ruleViewpoint623 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleViewpoint644 = new BitSet(new long[]{0x000000003FC10000L});
    public static final BitSet FOLLOW_16_in_ruleViewpoint657 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleViewpoint678 = new BitSet(new long[]{0x000000003FC10000L});
    public static final BitSet FOLLOW_22_in_ruleViewpoint695 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleViewpoint716 = new BitSet(new long[]{0x000000003F810000L});
    public static final BitSet FOLLOW_16_in_ruleViewpoint729 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleViewpoint750 = new BitSet(new long[]{0x000000003F810000L});
    public static final BitSet FOLLOW_23_in_ruleViewpoint767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint790 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_24_in_ruleViewpoint811 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint847 = new BitSet(new long[]{0x000000003E000000L});
    public static final BitSet FOLLOW_25_in_ruleViewpoint868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint904 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_26_in_ruleViewpoint925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint961 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_27_in_ruleViewpoint982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint1018 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleViewpoint1039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint1075 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleViewpoint1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1300 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleFQN1319 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1340 = new BitSet(new long[]{0x0000000040000002L});

}
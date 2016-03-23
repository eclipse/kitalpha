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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.DataGrammarAccess;



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
public class InternalDataParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'external'", "'import'", "'Data'", "'{'", "'description:'", "'}'", "'Class'", "'icon:'", "'extends'", "','", "'superClass'", "'abstract:'", "'Attributes:'", "'Associations:'", "'Operations:'", "'Enumeration'", "'description'", "'changeable:'", "'derived:'", "'ordered:'", "'transient:'", "'unique:'", "'unsettable:'", "'volatile:'", "'enum'", "'type'", "'id:'", "'values'", "'('", "')'", "'literal'", "'returns'", "'Annotation'", "'key:'", "'value:'", "'.'", "'true'", "'false'", "'contains'", "'refers'", "'[0,*]'", "'[1,*]'", "'[0,1]'", "'[1,1]'"
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
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


        public InternalDataParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDataParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDataParser.tokenNames; }
    public String getGrammarFileName() { return "../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g"; }



     	private DataGrammarAccess grammarAccess;
     	
        public InternalDataParser(TokenStream input, DataGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DataSpec";	
       	}
       	
       	@Override
       	protected DataGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDataSpec"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:75:1: entryRuleDataSpec returns [EObject current=null] : iv_ruleDataSpec= ruleDataSpec EOF ;
    public final EObject entryRuleDataSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSpec = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:76:2: (iv_ruleDataSpec= ruleDataSpec EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:77:2: iv_ruleDataSpec= ruleDataSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataSpecRule()); 
            }
            pushFollow(FOLLOW_ruleDataSpec_in_entryRuleDataSpec75);
            iv_ruleDataSpec=ruleDataSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSpec85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataSpec"


    // $ANTLR start "ruleDataSpec"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:84:1: ruleDataSpec returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_data_2_0= ruleData ) ) ) ;
    public final EObject ruleDataSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_data_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:87:28: ( ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_data_2_0= ruleData ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:88:1: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_data_2_0= ruleData ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:88:1: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_data_2_0= ruleData ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:88:2: () ( (lv_imports_1_0= ruleImport ) )* ( (lv_data_2_0= ruleData ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:88:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:89:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDataSpecAccess().getDataSpecAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:94:2: ( (lv_imports_1_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:95:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:95:1: (lv_imports_1_0= ruleImport )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:96:3: lv_imports_1_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataSpecAccess().getImportsImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleDataSpec140);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDataSpecRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_1_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:112:3: ( (lv_data_2_0= ruleData ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:113:1: (lv_data_2_0= ruleData )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:113:1: (lv_data_2_0= ruleData )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:114:3: lv_data_2_0= ruleData
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataSpecAccess().getDataDataParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleData_in_ruleDataSpec162);
            lv_data_2_0=ruleData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDataSpecRule());
              	        }
                     		set(
                     			current, 
                     			"data",
                      		lv_data_2_0, 
                      		"Data");
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
    // $ANTLR end "ruleDataSpec"


    // $ANTLR start "entryRuleAbstractImport"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:138:1: entryRuleAbstractImport returns [EObject current=null] : iv_ruleAbstractImport= ruleAbstractImport EOF ;
    public final EObject entryRuleAbstractImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractImport = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:139:2: (iv_ruleAbstractImport= ruleAbstractImport EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:140:2: iv_ruleAbstractImport= ruleAbstractImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractImportRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractImport_in_entryRuleAbstractImport198);
            iv_ruleAbstractImport=ruleAbstractImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractImport208); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAbstractImport"


    // $ANTLR start "ruleAbstractImport"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:147:1: ruleAbstractImport returns [EObject current=null] : (this_ImportNamespace_0= ruleImportNamespace | this_ImportURI_1= ruleImportURI ) ;
    public final EObject ruleAbstractImport() throws RecognitionException {
        EObject current = null;

        EObject this_ImportNamespace_0 = null;

        EObject this_ImportURI_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:150:28: ( (this_ImportNamespace_0= ruleImportNamespace | this_ImportURI_1= ruleImportURI ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:151:1: (this_ImportNamespace_0= ruleImportNamespace | this_ImportURI_1= ruleImportURI )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:151:1: (this_ImportNamespace_0= ruleImportNamespace | this_ImportURI_1= ruleImportURI )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:152:5: this_ImportNamespace_0= ruleImportNamespace
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractImportAccess().getImportNamespaceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImportNamespace_in_ruleAbstractImport255);
                    this_ImportNamespace_0=ruleImportNamespace();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ImportNamespace_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:162:5: this_ImportURI_1= ruleImportURI
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractImportAccess().getImportURIParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImportURI_in_ruleAbstractImport282);
                    this_ImportURI_1=ruleImportURI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ImportURI_1; 
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
    // $ANTLR end "ruleAbstractImport"


    // $ANTLR start "entryRuleImportNamespace"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:178:1: entryRuleImportNamespace returns [EObject current=null] : iv_ruleImportNamespace= ruleImportNamespace EOF ;
    public final EObject entryRuleImportNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportNamespace = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:179:2: (iv_ruleImportNamespace= ruleImportNamespace EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:180:2: iv_ruleImportNamespace= ruleImportNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportNamespaceRule()); 
            }
            pushFollow(FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace317);
            iv_ruleImportNamespace=ruleImportNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportNamespace; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportNamespace327); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImportNamespace"


    // $ANTLR start "ruleImportNamespace"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:187:1: ruleImportNamespace returns [EObject current=null] : ( (lv_importedNamespace_0_0= ruleFQN ) ) ;
    public final EObject ruleImportNamespace() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_importedNamespace_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:190:28: ( ( (lv_importedNamespace_0_0= ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:191:1: ( (lv_importedNamespace_0_0= ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:191:1: ( (lv_importedNamespace_0_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:192:1: (lv_importedNamespace_0_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:192:1: (lv_importedNamespace_0_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:193:3: lv_importedNamespace_0_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportNamespaceAccess().getImportedNamespaceFQNParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleImportNamespace372);
            lv_importedNamespace_0_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportNamespaceRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_0_0, 
                      		"FQN");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleImportNamespace"


    // $ANTLR start "entryRuleImportURI"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:217:1: entryRuleImportURI returns [EObject current=null] : iv_ruleImportURI= ruleImportURI EOF ;
    public final EObject entryRuleImportURI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportURI = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:218:2: (iv_ruleImportURI= ruleImportURI EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:219:2: iv_ruleImportURI= ruleImportURI EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportURIRule()); 
            }
            pushFollow(FOLLOW_ruleImportURI_in_entryRuleImportURI407);
            iv_ruleImportURI=ruleImportURI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportURI; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportURI417); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImportURI"


    // $ANTLR start "ruleImportURI"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:226:1: ruleImportURI returns [EObject current=null] : (otherlv_0= 'external' ( (lv_importURI_1_0= ruleEString ) ) ) ;
    public final EObject ruleImportURI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importURI_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:229:28: ( (otherlv_0= 'external' ( (lv_importURI_1_0= ruleEString ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:230:1: (otherlv_0= 'external' ( (lv_importURI_1_0= ruleEString ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:230:1: (otherlv_0= 'external' ( (lv_importURI_1_0= ruleEString ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:230:3: otherlv_0= 'external' ( (lv_importURI_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImportURI454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportURIAccess().getExternalKeyword_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:234:1: ( (lv_importURI_1_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:235:1: (lv_importURI_1_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:235:1: (lv_importURI_1_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:236:3: lv_importURI_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportURIAccess().getImportURIEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleImportURI475);
            lv_importURI_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportURIRule());
              	        }
                     		set(
                     			current, 
                     			"importURI",
                      		lv_importURI_1_0, 
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
    // $ANTLR end "ruleImportURI"


    // $ANTLR start "entryRuleImport"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:260:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:261:2: (iv_ruleImport= ruleImport EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:262:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport511);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport521); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:269:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' this_AbstractImport_1= ruleAbstractImport ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_AbstractImport_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:272:28: ( (otherlv_0= 'import' this_AbstractImport_1= ruleAbstractImport ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:273:1: (otherlv_0= 'import' this_AbstractImport_1= ruleAbstractImport )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:273:1: (otherlv_0= 'import' this_AbstractImport_1= ruleAbstractImport )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:273:3: otherlv_0= 'import' this_AbstractImport_1= ruleAbstractImport
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport558); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImportAccess().getAbstractImportParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleAbstractImport_in_ruleImport580);
            this_AbstractImport_1=ruleAbstractImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AbstractImport_1; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleData"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:294:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:295:2: (iv_ruleData= ruleData EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:296:2: iv_ruleData= ruleData EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataRule()); 
            }
            pushFollow(FOLLOW_ruleData_in_entryRuleData615);
            iv_ruleData=ruleData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleData; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleData625); if (state.failed) return current;

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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:303:1: ruleData returns [EObject current=null] : ( () otherlv_1= 'Data' ( (lv_name_2_0= ruleFQN ) )? otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_owned_annotations_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_VP_Classes_8_0 = null;

        EObject lv_VP_Enumerations_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:306:28: ( ( () otherlv_1= 'Data' ( (lv_name_2_0= ruleFQN ) )? otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:307:1: ( () otherlv_1= 'Data' ( (lv_name_2_0= ruleFQN ) )? otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) ) ) otherlv_10= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:307:1: ( () otherlv_1= 'Data' ( (lv_name_2_0= ruleFQN ) )? otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) ) ) otherlv_10= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:307:2: () otherlv_1= 'Data' ( (lv_name_2_0= ruleFQN ) )? otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) ) ) otherlv_10= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:307:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:308:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDataAccess().getDataAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleData671); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataAccess().getDataKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:317:1: ( (lv_name_2_0= ruleFQN ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:318:1: (lv_name_2_0= ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:318:1: (lv_name_2_0= ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:319:3: lv_name_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataAccess().getNameFQNParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleData692);
                    lv_name_2_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataRule());
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
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleData705); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDataAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:339:1: ( (lv_owned_annotations_4_0= ruleAnnotation ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==43) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:340:1: (lv_owned_annotations_4_0= ruleAnnotation )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:340:1: (lv_owned_annotations_4_0= ruleAnnotation )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:341:3: lv_owned_annotations_4_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataAccess().getOwned_annotationsAnnotationParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleData726);
            	    lv_owned_annotations_4_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDataRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"owned_annotations",
            	              		lv_owned_annotations_4_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:357:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:359:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:359:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:360:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getDataAccess().getUnorderedGroup_5());
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:363:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:364:3: ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )*
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:364:3: ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )*
            loop7:
            do {
                int alt7=4;
                int LA7_0 = input.LA(1);

                if ( LA7_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 1) ) {
                    alt7=2;
                }
                else if ( LA7_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 2) ) {
                    alt7=3;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:366:4: ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:366:4: ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:367:5: {...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleData", "getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:367:101: ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:368:6: ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getDataAccess().getUnorderedGroup_5(), 0);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:371:6: ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:371:7: {...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleData", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:371:16: (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:371:18: otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleData785); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getDataAccess().getDescriptionKeyword_5_0_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:375:1: ( (lv_description_7_0= ruleEString ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:376:1: (lv_description_7_0= ruleEString )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:376:1: (lv_description_7_0= ruleEString )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:377:3: lv_description_7_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataAccess().getDescriptionEStringParserRuleCall_5_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEString_in_ruleData806);
            	    lv_description_7_0=ruleEString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDataRule());
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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDataAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:400:4: ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:400:4: ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:401:5: {...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleData", "getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:401:101: ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:402:6: ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getDataAccess().getUnorderedGroup_5(), 1);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:405:6: ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==17) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:405:7: {...}? => ( (lv_VP_Classes_8_0= ruleClass ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleData", "true");
            	    	    }
            	    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:405:16: ( (lv_VP_Classes_8_0= ruleClass ) )
            	    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:406:1: (lv_VP_Classes_8_0= ruleClass )
            	    	    {
            	    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:406:1: (lv_VP_Classes_8_0= ruleClass )
            	    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:407:3: lv_VP_Classes_8_0= ruleClass
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getDataAccess().getVP_ClassesClassParserRuleCall_5_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleClass_in_ruleData882);
            	    	    lv_VP_Classes_8_0=ruleClass();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getDataRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"VP_Classes",
            	    	              		lv_VP_Classes_8_0, 
            	    	              		"Class");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDataAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:430:4: ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:430:4: ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:431:5: {...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleData", "getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:431:101: ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:432:6: ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getDataAccess().getUnorderedGroup_5(), 2);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:435:6: ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==26) ) {
            	            int LA6_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:435:7: {...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleData", "true");
            	    	    }
            	    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:435:16: ( (lv_VP_Enumerations_9_0= ruleEnumeration ) )
            	    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:436:1: (lv_VP_Enumerations_9_0= ruleEnumeration )
            	    	    {
            	    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:436:1: (lv_VP_Enumerations_9_0= ruleEnumeration )
            	    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:437:3: lv_VP_Enumerations_9_0= ruleEnumeration
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getDataAccess().getVP_EnumerationsEnumerationParserRuleCall_5_2_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleEnumeration_in_ruleData958);
            	    	    lv_VP_Enumerations_9_0=ruleEnumeration();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getDataRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"VP_Enumerations",
            	    	              		lv_VP_Enumerations_9_0, 
            	    	              		"Enumeration");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDataAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getDataAccess().getUnorderedGroup_5());

            }

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleData1011); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getDataAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleClass"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:479:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:480:2: (iv_ruleClass= ruleClass EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:481:2: iv_ruleClass= ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass1047);
            iv_ruleClass=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass1057); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:488:1: ruleClass returns [EObject current=null] : ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'icon:' ( (lv_icon_7_0= RULE_STRING ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'superClass' ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) ) (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )* )? (otherlv_16= 'abstract:' ( (lv_abstract_17_0= ruleEBoolean ) ) )? ( (lv_owned_annotations_18_0= ruleAnnotation ) )* (otherlv_19= 'Attributes:' ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )* )? (otherlv_21= 'Associations:' ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )* )? (otherlv_23= 'Operations:' ( (lv_VP_Class_Operations_24_0= ruleOperation ) )* )? otherlv_25= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_icon_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_Inheritences_13_0 = null;

        EObject lv_Inheritences_15_0 = null;

        AntlrDatatypeRuleToken lv_abstract_17_0 = null;

        EObject lv_owned_annotations_18_0 = null;

        EObject lv_VP_Class_Attributes_20_0 = null;

        EObject lv_VP_Classes_Associations_22_0 = null;

        EObject lv_VP_Class_Operations_24_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:491:28: ( ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'icon:' ( (lv_icon_7_0= RULE_STRING ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'superClass' ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) ) (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )* )? (otherlv_16= 'abstract:' ( (lv_abstract_17_0= ruleEBoolean ) ) )? ( (lv_owned_annotations_18_0= ruleAnnotation ) )* (otherlv_19= 'Attributes:' ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )* )? (otherlv_21= 'Associations:' ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )* )? (otherlv_23= 'Operations:' ( (lv_VP_Class_Operations_24_0= ruleOperation ) )* )? otherlv_25= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:492:1: ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'icon:' ( (lv_icon_7_0= RULE_STRING ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'superClass' ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) ) (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )* )? (otherlv_16= 'abstract:' ( (lv_abstract_17_0= ruleEBoolean ) ) )? ( (lv_owned_annotations_18_0= ruleAnnotation ) )* (otherlv_19= 'Attributes:' ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )* )? (otherlv_21= 'Associations:' ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )* )? (otherlv_23= 'Operations:' ( (lv_VP_Class_Operations_24_0= ruleOperation ) )* )? otherlv_25= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:492:1: ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'icon:' ( (lv_icon_7_0= RULE_STRING ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'superClass' ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) ) (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )* )? (otherlv_16= 'abstract:' ( (lv_abstract_17_0= ruleEBoolean ) ) )? ( (lv_owned_annotations_18_0= ruleAnnotation ) )* (otherlv_19= 'Attributes:' ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )* )? (otherlv_21= 'Associations:' ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )* )? (otherlv_23= 'Operations:' ( (lv_VP_Class_Operations_24_0= ruleOperation ) )* )? otherlv_25= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:492:2: () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'icon:' ( (lv_icon_7_0= RULE_STRING ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'superClass' ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) ) (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )* )? (otherlv_16= 'abstract:' ( (lv_abstract_17_0= ruleEBoolean ) ) )? ( (lv_owned_annotations_18_0= ruleAnnotation ) )* (otherlv_19= 'Attributes:' ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )* )? (otherlv_21= 'Associations:' ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )* )? (otherlv_23= 'Operations:' ( (lv_VP_Class_Operations_24_0= ruleOperation ) )* )? otherlv_25= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:492:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:493:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getClassAccess().getClassAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleClass1103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:502:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:503:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:503:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:504:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClassAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleClass1124);
            lv_name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getClassRule());
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleClass1136); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:524:1: (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:524:3: otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleClass1149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getDescriptionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:528:1: ( (lv_description_5_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:529:1: (lv_description_5_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:529:1: (lv_description_5_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:530:3: lv_description_5_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleClass1170);
                    lv_description_5_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClassRule());
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:546:4: (otherlv_6= 'icon:' ( (lv_icon_7_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:546:6: otherlv_6= 'icon:' ( (lv_icon_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleClass1185); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getClassAccess().getIconKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:550:1: ( (lv_icon_7_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:551:1: (lv_icon_7_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:551:1: (lv_icon_7_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:552:3: lv_icon_7_0= RULE_STRING
                    {
                    lv_icon_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClass1202); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_icon_7_0, grammarAccess.getClassAccess().getIconSTRINGTerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"icon",
                              		lv_icon_7_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:568:4: (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:568:6: otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleClass1222); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getClassAccess().getExtendsKeyword_6_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:572:1: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:573:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:573:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:574:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassAccess().getExtendsEClassCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleClass1245);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:587:2: (otherlv_10= ',' ( ( ruleFQN ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==20) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:587:4: otherlv_10= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleClass1258); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getClassAccess().getCommaKeyword_6_2_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:591:1: ( ( ruleFQN ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:592:1: ( ruleFQN )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:592:1: ( ruleFQN )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:593:3: ruleFQN
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getClassRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassAccess().getExtendsEClassCrossReference_6_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFQN_in_ruleClass1281);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:606:6: (otherlv_12= 'superClass' ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) ) (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:606:8: otherlv_12= 'superClass' ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) ) (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )*
                    {
                    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleClass1298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getClassAccess().getSuperClassKeyword_7_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:610:1: ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:611:1: (lv_Inheritences_13_0= ruleAbstractSuperClass )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:611:1: (lv_Inheritences_13_0= ruleAbstractSuperClass )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:612:3: lv_Inheritences_13_0= ruleAbstractSuperClass
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassAccess().getInheritencesAbstractSuperClassParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAbstractSuperClass_in_ruleClass1319);
                    lv_Inheritences_13_0=ruleAbstractSuperClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClassRule());
                      	        }
                             		add(
                             			current, 
                             			"Inheritences",
                              		lv_Inheritences_13_0, 
                              		"AbstractSuperClass");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:628:2: (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==20) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:628:4: otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) )
                    	    {
                    	    otherlv_14=(Token)match(input,20,FOLLOW_20_in_ruleClass1332); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_14, grammarAccess.getClassAccess().getCommaKeyword_7_2_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:632:1: ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:633:1: (lv_Inheritences_15_0= ruleAbstractSuperClass )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:633:1: (lv_Inheritences_15_0= ruleAbstractSuperClass )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:634:3: lv_Inheritences_15_0= ruleAbstractSuperClass
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassAccess().getInheritencesAbstractSuperClassParserRuleCall_7_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAbstractSuperClass_in_ruleClass1353);
                    	    lv_Inheritences_15_0=ruleAbstractSuperClass();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getClassRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"Inheritences",
                    	              		lv_Inheritences_15_0, 
                    	              		"AbstractSuperClass");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:650:6: (otherlv_16= 'abstract:' ( (lv_abstract_17_0= ruleEBoolean ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:650:8: otherlv_16= 'abstract:' ( (lv_abstract_17_0= ruleEBoolean ) )
                    {
                    otherlv_16=(Token)match(input,22,FOLLOW_22_in_ruleClass1370); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getClassAccess().getAbstractKeyword_8_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:654:1: ( (lv_abstract_17_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:655:1: (lv_abstract_17_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:655:1: (lv_abstract_17_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:656:3: lv_abstract_17_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassAccess().getAbstractEBooleanParserRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleClass1391);
                    lv_abstract_17_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClassRule());
                      	        }
                             		set(
                             			current, 
                             			"abstract",
                              		lv_abstract_17_0, 
                              		"EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:672:4: ( (lv_owned_annotations_18_0= ruleAnnotation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==43) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:673:1: (lv_owned_annotations_18_0= ruleAnnotation )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:673:1: (lv_owned_annotations_18_0= ruleAnnotation )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:674:3: lv_owned_annotations_18_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassAccess().getOwned_annotationsAnnotationParserRuleCall_9_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleClass1414);
            	    lv_owned_annotations_18_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"owned_annotations",
            	              		lv_owned_annotations_18_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:690:3: (otherlv_19= 'Attributes:' ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:690:5: otherlv_19= 'Attributes:' ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )*
                    {
                    otherlv_19=(Token)match(input,23,FOLLOW_23_in_ruleClass1428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getClassAccess().getAttributesKeyword_10_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:694:1: ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:695:1: (lv_VP_Class_Attributes_20_0= ruleAttribute )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:695:1: (lv_VP_Class_Attributes_20_0= ruleAttribute )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:696:3: lv_VP_Class_Attributes_20_0= ruleAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassAccess().getVP_Class_AttributesAttributeParserRuleCall_10_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleClass1449);
                    	    lv_VP_Class_Attributes_20_0=ruleAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getClassRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"VP_Class_Attributes",
                    	              		lv_VP_Class_Attributes_20_0, 
                    	              		"Attribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:712:5: (otherlv_21= 'Associations:' ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:712:7: otherlv_21= 'Associations:' ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )*
                    {
                    otherlv_21=(Token)match(input,24,FOLLOW_24_in_ruleClass1465); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getClassAccess().getAssociationsKeyword_11_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:716:1: ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:717:1: (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:717:1: (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:718:3: lv_VP_Classes_Associations_22_0= ruleAbstractAssociation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassAccess().getVP_Classes_AssociationsAbstractAssociationParserRuleCall_11_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAbstractAssociation_in_ruleClass1486);
                    	    lv_VP_Classes_Associations_22_0=ruleAbstractAssociation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getClassRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"VP_Classes_Associations",
                    	              		lv_VP_Classes_Associations_22_0, 
                    	              		"AbstractAssociation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:734:5: (otherlv_23= 'Operations:' ( (lv_VP_Class_Operations_24_0= ruleOperation ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:734:7: otherlv_23= 'Operations:' ( (lv_VP_Class_Operations_24_0= ruleOperation ) )*
                    {
                    otherlv_23=(Token)match(input,25,FOLLOW_25_in_ruleClass1502); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getClassAccess().getOperationsKeyword_12_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:738:1: ( (lv_VP_Class_Operations_24_0= ruleOperation ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:739:1: (lv_VP_Class_Operations_24_0= ruleOperation )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:739:1: (lv_VP_Class_Operations_24_0= ruleOperation )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:740:3: lv_VP_Class_Operations_24_0= ruleOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassAccess().getVP_Class_OperationsOperationParserRuleCall_12_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleOperation_in_ruleClass1523);
                    	    lv_VP_Class_Operations_24_0=ruleOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getClassRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"VP_Class_Operations",
                    	              		lv_VP_Class_Operations_24_0, 
                    	              		"Operation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_25=(Token)match(input,16,FOLLOW_16_in_ruleClass1538); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_25, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_13());
                  
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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleEnumeration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:768:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:769:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:770:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationRule()); 
            }
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration1574);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumeration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration1584); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:777:1: ruleEnumeration returns [EObject current=null] : ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( (lv_ownedValues_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )* ) otherlv_8= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_owned_annotations_4_0 = null;

        EObject lv_ownedValues_5_0 = null;

        EObject lv_ownedValues_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:780:28: ( ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( (lv_ownedValues_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )* ) otherlv_8= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:781:1: ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( (lv_ownedValues_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )* ) otherlv_8= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:781:1: ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( (lv_ownedValues_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )* ) otherlv_8= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:781:2: () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( (lv_ownedValues_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )* ) otherlv_8= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:781:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:782:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEnumerationAccess().getEnumerationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleEnumeration1630); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getEnumerationKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:791:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:792:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:792:1: (lv_name_2_0= RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:793:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration1647); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumerationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleEnumeration1664); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:813:1: ( (lv_owned_annotations_4_0= ruleAnnotation ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==43) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:814:1: (lv_owned_annotations_4_0= ruleAnnotation )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:814:1: (lv_owned_annotations_4_0= ruleAnnotation )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:815:3: lv_owned_annotations_4_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumerationAccess().getOwned_annotationsAnnotationParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleEnumeration1685);
            	    lv_owned_annotations_4_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"owned_annotations",
            	              		lv_owned_annotations_4_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:831:3: ( ( (lv_ownedValues_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:831:4: ( (lv_ownedValues_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )*
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:831:4: ( (lv_ownedValues_5_0= ruleValue ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:832:1: (lv_ownedValues_5_0= ruleValue )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:832:1: (lv_ownedValues_5_0= ruleValue )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:833:3: lv_ownedValues_5_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumerationAccess().getOwnedValuesValueParserRuleCall_5_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleEnumeration1708);
            lv_ownedValues_5_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
              	        }
                     		add(
                     			current, 
                     			"ownedValues",
                      		lv_ownedValues_5_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:849:2: (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==20) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:849:4: otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) )
            	    {
            	    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleEnumeration1721); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getCommaKeyword_5_1_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:853:1: ( (lv_ownedValues_7_0= ruleValue ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:854:1: (lv_ownedValues_7_0= ruleValue )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:854:1: (lv_ownedValues_7_0= ruleValue )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:855:3: lv_ownedValues_7_0= ruleValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumerationAccess().getOwnedValuesValueParserRuleCall_5_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValue_in_ruleEnumeration1742);
            	    lv_ownedValues_7_0=ruleValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedValues",
            	              		lv_ownedValues_7_0, 
            	              		"Value");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleEnumeration1757); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleAbstractSuperClass"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:883:1: entryRuleAbstractSuperClass returns [EObject current=null] : iv_ruleAbstractSuperClass= ruleAbstractSuperClass EOF ;
    public final EObject entryRuleAbstractSuperClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSuperClass = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:884:2: (iv_ruleAbstractSuperClass= ruleAbstractSuperClass EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:885:2: iv_ruleAbstractSuperClass= ruleAbstractSuperClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractSuperClassRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractSuperClass_in_entryRuleAbstractSuperClass1793);
            iv_ruleAbstractSuperClass=ruleAbstractSuperClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractSuperClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractSuperClass1803); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAbstractSuperClass"


    // $ANTLR start "ruleAbstractSuperClass"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:892:1: ruleAbstractSuperClass returns [EObject current=null] : (this_LocalSuperClass_0= ruleLocalSuperClass | this_ExternalSuperClass_1= ruleExternalSuperClass ) ;
    public final EObject ruleAbstractSuperClass() throws RecognitionException {
        EObject current = null;

        EObject this_LocalSuperClass_0 = null;

        EObject this_ExternalSuperClass_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:895:28: ( (this_LocalSuperClass_0= ruleLocalSuperClass | this_ExternalSuperClass_1= ruleExternalSuperClass ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:896:1: (this_LocalSuperClass_0= ruleLocalSuperClass | this_ExternalSuperClass_1= ruleExternalSuperClass )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:896:1: (this_LocalSuperClass_0= ruleLocalSuperClass | this_ExternalSuperClass_1= ruleExternalSuperClass )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==11) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:897:5: this_LocalSuperClass_0= ruleLocalSuperClass
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractSuperClassAccess().getLocalSuperClassParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLocalSuperClass_in_ruleAbstractSuperClass1850);
                    this_LocalSuperClass_0=ruleLocalSuperClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalSuperClass_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:907:5: this_ExternalSuperClass_1= ruleExternalSuperClass
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractSuperClassAccess().getExternalSuperClassParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExternalSuperClass_in_ruleAbstractSuperClass1877);
                    this_ExternalSuperClass_1=ruleExternalSuperClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExternalSuperClass_1; 
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
    // $ANTLR end "ruleAbstractSuperClass"


    // $ANTLR start "entryRuleLocalSuperClass"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:923:1: entryRuleLocalSuperClass returns [EObject current=null] : iv_ruleLocalSuperClass= ruleLocalSuperClass EOF ;
    public final EObject entryRuleLocalSuperClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalSuperClass = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:924:2: (iv_ruleLocalSuperClass= ruleLocalSuperClass EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:925:2: iv_ruleLocalSuperClass= ruleLocalSuperClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalSuperClassRule()); 
            }
            pushFollow(FOLLOW_ruleLocalSuperClass_in_entryRuleLocalSuperClass1912);
            iv_ruleLocalSuperClass=ruleLocalSuperClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalSuperClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalSuperClass1922); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLocalSuperClass"


    // $ANTLR start "ruleLocalSuperClass"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:932:1: ruleLocalSuperClass returns [EObject current=null] : ( () ( ( ruleFQN ) ) ) ;
    public final EObject ruleLocalSuperClass() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:935:28: ( ( () ( ( ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:936:1: ( () ( ( ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:936:1: ( () ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:936:2: () ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:936:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:937:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalSuperClassAccess().getLocalSuperClassAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:942:2: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:943:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:943:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:944:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalSuperClassRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalSuperClassAccess().getSuperClassClassCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleLocalSuperClass1979);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
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
    // $ANTLR end "ruleLocalSuperClass"


    // $ANTLR start "entryRuleExternalSuperClass"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:965:1: entryRuleExternalSuperClass returns [EObject current=null] : iv_ruleExternalSuperClass= ruleExternalSuperClass EOF ;
    public final EObject entryRuleExternalSuperClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalSuperClass = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:966:2: (iv_ruleExternalSuperClass= ruleExternalSuperClass EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:967:2: iv_ruleExternalSuperClass= ruleExternalSuperClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternalSuperClassRule()); 
            }
            pushFollow(FOLLOW_ruleExternalSuperClass_in_entryRuleExternalSuperClass2015);
            iv_ruleExternalSuperClass=ruleExternalSuperClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternalSuperClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalSuperClass2025); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExternalSuperClass"


    // $ANTLR start "ruleExternalSuperClass"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:974:1: ruleExternalSuperClass returns [EObject current=null] : ( () otherlv_1= 'external' ( ( ruleFQN ) ) ) ;
    public final EObject ruleExternalSuperClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:977:28: ( ( () otherlv_1= 'external' ( ( ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:978:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:978:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:978:2: () otherlv_1= 'external' ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:978:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:979:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExternalSuperClassAccess().getExternalSuperClassAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleExternalSuperClass2071); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExternalSuperClassAccess().getExternalKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:988:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:989:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:989:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:990:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExternalSuperClassRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExternalSuperClassAccess().getSuperClassEClassCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleExternalSuperClass2094);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
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
    // $ANTLR end "ruleExternalSuperClass"


    // $ANTLR start "entryRuleAbstractAssociation"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1013:1: entryRuleAbstractAssociation returns [EObject current=null] : iv_ruleAbstractAssociation= ruleAbstractAssociation EOF ;
    public final EObject entryRuleAbstractAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAssociation = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1014:2: (iv_ruleAbstractAssociation= ruleAbstractAssociation EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1015:2: iv_ruleAbstractAssociation= ruleAbstractAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractAssociationRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractAssociation_in_entryRuleAbstractAssociation2132);
            iv_ruleAbstractAssociation=ruleAbstractAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractAssociation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractAssociation2142); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAbstractAssociation"


    // $ANTLR start "ruleAbstractAssociation"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1022:1: ruleAbstractAssociation returns [EObject current=null] : (this_LocalClassAssociation_0= ruleLocalClassAssociation | this_ExternalClassAssociation_1= ruleExternalClassAssociation ) ;
    public final EObject ruleAbstractAssociation() throws RecognitionException {
        EObject current = null;

        EObject this_LocalClassAssociation_0 = null;

        EObject this_ExternalClassAssociation_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1025:28: ( (this_LocalClassAssociation_0= ruleLocalClassAssociation | this_ExternalClassAssociation_1= ruleExternalClassAssociation ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1026:1: (this_LocalClassAssociation_0= ruleLocalClassAssociation | this_ExternalClassAssociation_1= ruleExternalClassAssociation )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1026:1: (this_LocalClassAssociation_0= ruleLocalClassAssociation | this_ExternalClassAssociation_1= ruleExternalClassAssociation )
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1027:5: this_LocalClassAssociation_0= ruleLocalClassAssociation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractAssociationAccess().getLocalClassAssociationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLocalClassAssociation_in_ruleAbstractAssociation2189);
                    this_LocalClassAssociation_0=ruleLocalClassAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalClassAssociation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1037:5: this_ExternalClassAssociation_1= ruleExternalClassAssociation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractAssociationAccess().getExternalClassAssociationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExternalClassAssociation_in_ruleAbstractAssociation2216);
                    this_ExternalClassAssociation_1=ruleExternalClassAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExternalClassAssociation_1; 
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
    // $ANTLR end "ruleAbstractAssociation"


    // $ANTLR start "entryRuleLocalClassAssociation"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1053:1: entryRuleLocalClassAssociation returns [EObject current=null] : iv_ruleLocalClassAssociation= ruleLocalClassAssociation EOF ;
    public final EObject entryRuleLocalClassAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalClassAssociation = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1054:2: (iv_ruleLocalClassAssociation= ruleLocalClassAssociation EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1055:2: iv_ruleLocalClassAssociation= ruleLocalClassAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalClassAssociationRule()); 
            }
            pushFollow(FOLLOW_ruleLocalClassAssociation_in_entryRuleLocalClassAssociation2251);
            iv_ruleLocalClassAssociation=ruleLocalClassAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalClassAssociation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalClassAssociation2261); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLocalClassAssociation"


    // $ANTLR start "ruleLocalClassAssociation"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1062:1: ruleLocalClassAssociation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_23_0= ruleAnnotation ) )* ) ;
    public final EObject ruleLocalClassAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;

        Enumerator lv_type_5_0 = null;

        Enumerator lv_cardinality_6_0 = null;

        AntlrDatatypeRuleToken lv_changeable_10_0 = null;

        AntlrDatatypeRuleToken lv_derived_12_0 = null;

        AntlrDatatypeRuleToken lv_ordered_14_0 = null;

        AntlrDatatypeRuleToken lv_transient_16_0 = null;

        AntlrDatatypeRuleToken lv_unique_18_0 = null;

        AntlrDatatypeRuleToken lv_unsettable_20_0 = null;

        AntlrDatatypeRuleToken lv_volatile_22_0 = null;

        EObject lv_owned_annotations_23_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1065:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_23_0= ruleAnnotation ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1066:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_23_0= ruleAnnotation ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1066:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_23_0= ruleAnnotation ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1066:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_23_0= ruleAnnotation ) )*
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1066:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1067:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalClassAssociationAccess().getLocalClassAssociationAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1072:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1073:1: (lv_name_1_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1073:1: (lv_name_1_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1074:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleLocalClassAssociation2316);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1090:2: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1090:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ','
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleLocalClassAssociation2329); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLocalClassAssociationAccess().getDescriptionKeyword_2_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1094:1: ( (lv_description_3_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1095:1: (lv_description_3_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1095:1: (lv_description_3_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1096:3: lv_description_3_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleLocalClassAssociation2350);
                    lv_description_3_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
                      	        }
                             		set(
                             			current, 
                             			"description",
                              		lv_description_3_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleLocalClassAssociation2362); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getLocalClassAssociationAccess().getCommaKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1116:3: ( (lv_type_5_0= ruleAssociation_Types ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1117:1: (lv_type_5_0= ruleAssociation_Types )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1117:1: (lv_type_5_0= ruleAssociation_Types )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1118:3: lv_type_5_0= ruleAssociation_Types
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getTypeAssociation_TypesEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssociation_Types_in_ruleLocalClassAssociation2385);
            lv_type_5_0=ruleAssociation_Types();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_5_0, 
                      		"Association_Types");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1134:2: ( (lv_cardinality_6_0= ruleCardinalities ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1135:1: (lv_cardinality_6_0= ruleCardinalities )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1135:1: (lv_cardinality_6_0= ruleCardinalities )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1136:3: lv_cardinality_6_0= ruleCardinalities
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getCardinalityCardinalitiesEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCardinalities_in_ruleLocalClassAssociation2406);
            lv_cardinality_6_0=ruleCardinalities();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
              	        }
                     		set(
                     			current, 
                     			"cardinality",
                      		lv_cardinality_6_0, 
                      		"Cardinalities");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1152:2: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1153:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1153:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1154:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalClassAssociationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getLocalTargetClassCrossReference_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleLocalClassAssociation2429);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1167:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )* ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1169:1: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1169:1: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1170:2: ( ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1173:2: ( ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1174:3: ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )*
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1174:3: ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )*
            loop27:
            do {
                int alt27=8;
                int LA27_0 = input.LA(1);

                if ( LA27_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 0) ) {
                    alt27=1;
                }
                else if ( LA27_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 1) ) {
                    alt27=2;
                }
                else if ( LA27_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 2) ) {
                    alt27=3;
                }
                else if ( LA27_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 3) ) {
                    alt27=4;
                }
                else if ( LA27_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 4) ) {
                    alt27=5;
                }
                else if ( LA27_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 5) ) {
                    alt27=6;
                }
                else if ( LA27_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 6) ) {
                    alt27=7;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1176:4: ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1176:4: ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1177:5: {...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 0)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1177:118: ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1178:6: ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 0);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1181:6: ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1181:7: {...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1181:16: (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1181:18: otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) )
            	    {
            	    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleLocalClassAssociation2487); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getLocalClassAssociationAccess().getChangeableKeyword_6_0_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1185:1: ( (lv_changeable_10_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1186:1: (lv_changeable_10_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1186:1: (lv_changeable_10_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1187:3: lv_changeable_10_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getChangeableEBooleanParserRuleCall_6_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleLocalClassAssociation2508);
            	    lv_changeable_10_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"changeable",
            	              		lv_changeable_10_0, 
            	              		"EBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1210:4: ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1210:4: ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1211:5: {...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 1)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1211:118: ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1212:6: ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 1);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1215:6: ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1215:7: {...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1215:16: (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1215:18: otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) )
            	    {
            	    otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleLocalClassAssociation2576); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getLocalClassAssociationAccess().getDerivedKeyword_6_1_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1219:1: ( (lv_derived_12_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1220:1: (lv_derived_12_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1220:1: (lv_derived_12_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1221:3: lv_derived_12_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getDerivedEBooleanParserRuleCall_6_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleLocalClassAssociation2597);
            	    lv_derived_12_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"derived",
            	              		lv_derived_12_0, 
            	              		"EBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1244:4: ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1244:4: ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1245:5: {...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 2)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1245:118: ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1246:6: ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 2);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1249:6: ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1249:7: {...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1249:16: (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1249:18: otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) )
            	    {
            	    otherlv_13=(Token)match(input,30,FOLLOW_30_in_ruleLocalClassAssociation2665); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getLocalClassAssociationAccess().getOrderedKeyword_6_2_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1253:1: ( (lv_ordered_14_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1254:1: (lv_ordered_14_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1254:1: (lv_ordered_14_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1255:3: lv_ordered_14_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getOrderedEBooleanParserRuleCall_6_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleLocalClassAssociation2686);
            	    lv_ordered_14_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"ordered",
            	              		lv_ordered_14_0, 
            	              		"EBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1278:4: ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1278:4: ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1279:5: {...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 3)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1279:118: ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1280:6: ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 3);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1283:6: ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1283:7: {...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1283:16: (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1283:18: otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) )
            	    {
            	    otherlv_15=(Token)match(input,31,FOLLOW_31_in_ruleLocalClassAssociation2754); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getLocalClassAssociationAccess().getTransientKeyword_6_3_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1287:1: ( (lv_transient_16_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1288:1: (lv_transient_16_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1288:1: (lv_transient_16_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1289:3: lv_transient_16_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getTransientEBooleanParserRuleCall_6_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleLocalClassAssociation2775);
            	    lv_transient_16_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"transient",
            	              		lv_transient_16_0, 
            	              		"EBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1312:4: ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1312:4: ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1313:5: {...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 4)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1313:118: ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1314:6: ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 4);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1317:6: ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1317:7: {...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1317:16: (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1317:18: otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) )
            	    {
            	    otherlv_17=(Token)match(input,32,FOLLOW_32_in_ruleLocalClassAssociation2843); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_17, grammarAccess.getLocalClassAssociationAccess().getUniqueKeyword_6_4_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1321:1: ( (lv_unique_18_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1322:1: (lv_unique_18_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1322:1: (lv_unique_18_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1323:3: lv_unique_18_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getUniqueEBooleanParserRuleCall_6_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleLocalClassAssociation2864);
            	    lv_unique_18_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"unique",
            	              		lv_unique_18_0, 
            	              		"EBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1346:4: ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1346:4: ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1347:5: {...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 5)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1347:118: ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1348:6: ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 5);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1351:6: ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1351:7: {...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1351:16: (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1351:18: otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) )
            	    {
            	    otherlv_19=(Token)match(input,33,FOLLOW_33_in_ruleLocalClassAssociation2932); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_19, grammarAccess.getLocalClassAssociationAccess().getUnsettableKeyword_6_5_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1355:1: ( (lv_unsettable_20_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1356:1: (lv_unsettable_20_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1356:1: (lv_unsettable_20_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1357:3: lv_unsettable_20_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getUnsettableEBooleanParserRuleCall_6_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleLocalClassAssociation2953);
            	    lv_unsettable_20_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"unsettable",
            	              		lv_unsettable_20_0, 
            	              		"EBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1380:4: ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1380:4: ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1381:5: {...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 6)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1381:118: ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1382:6: ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 6);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1385:6: ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1385:7: {...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1385:16: (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1385:18: otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) )
            	    {
            	    otherlv_21=(Token)match(input,34,FOLLOW_34_in_ruleLocalClassAssociation3021); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_21, grammarAccess.getLocalClassAssociationAccess().getVolatileKeyword_6_6_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1389:1: ( (lv_volatile_22_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1390:1: (lv_volatile_22_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1390:1: (lv_volatile_22_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1391:3: lv_volatile_22_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getVolatileEBooleanParserRuleCall_6_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleLocalClassAssociation3042);
            	    lv_volatile_22_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"volatile",
            	              		lv_volatile_22_0, 
            	              		"EBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1421:2: ( (lv_owned_annotations_23_0= ruleAnnotation ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==43) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1422:1: (lv_owned_annotations_23_0= ruleAnnotation )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1422:1: (lv_owned_annotations_23_0= ruleAnnotation )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1423:3: lv_owned_annotations_23_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getOwned_annotationsAnnotationParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleLocalClassAssociation3104);
            	    lv_owned_annotations_23_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"owned_annotations",
            	              		lv_owned_annotations_23_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
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
    // $ANTLR end "ruleLocalClassAssociation"


    // $ANTLR start "entryRuleExternalClassAssociation"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1447:1: entryRuleExternalClassAssociation returns [EObject current=null] : iv_ruleExternalClassAssociation= ruleExternalClassAssociation EOF ;
    public final EObject entryRuleExternalClassAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalClassAssociation = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1448:2: (iv_ruleExternalClassAssociation= ruleExternalClassAssociation EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1449:2: iv_ruleExternalClassAssociation= ruleExternalClassAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternalClassAssociationRule()); 
            }
            pushFollow(FOLLOW_ruleExternalClassAssociation_in_entryRuleExternalClassAssociation3141);
            iv_ruleExternalClassAssociation=ruleExternalClassAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternalClassAssociation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalClassAssociation3151); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExternalClassAssociation"


    // $ANTLR start "ruleExternalClassAssociation"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1456:1: ruleExternalClassAssociation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) otherlv_7= 'external' ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_24_0= ruleAnnotation ) )* ) ;
    public final EObject ruleExternalClassAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;

        Enumerator lv_type_5_0 = null;

        Enumerator lv_cardinality_6_0 = null;

        AntlrDatatypeRuleToken lv_changeable_11_0 = null;

        AntlrDatatypeRuleToken lv_derived_13_0 = null;

        AntlrDatatypeRuleToken lv_ordered_15_0 = null;

        AntlrDatatypeRuleToken lv_transient_17_0 = null;

        AntlrDatatypeRuleToken lv_unique_19_0 = null;

        AntlrDatatypeRuleToken lv_unsettable_21_0 = null;

        AntlrDatatypeRuleToken lv_volatile_23_0 = null;

        EObject lv_owned_annotations_24_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1459:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) otherlv_7= 'external' ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_24_0= ruleAnnotation ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1460:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) otherlv_7= 'external' ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_24_0= ruleAnnotation ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1460:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) otherlv_7= 'external' ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_24_0= ruleAnnotation ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1460:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) otherlv_7= 'external' ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_24_0= ruleAnnotation ) )*
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1460:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1461:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExternalClassAssociationAccess().getExternalClassAssociationAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1466:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1467:1: (lv_name_1_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1467:1: (lv_name_1_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1468:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleExternalClassAssociation3206);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1484:2: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==27) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1484:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ','
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleExternalClassAssociation3219); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExternalClassAssociationAccess().getDescriptionKeyword_2_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1488:1: ( (lv_description_3_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1489:1: (lv_description_3_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1489:1: (lv_description_3_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1490:3: lv_description_3_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleExternalClassAssociation3240);
                    lv_description_3_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
                      	        }
                             		set(
                             			current, 
                             			"description",
                              		lv_description_3_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleExternalClassAssociation3252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getExternalClassAssociationAccess().getCommaKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1510:3: ( (lv_type_5_0= ruleAssociation_Types ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1511:1: (lv_type_5_0= ruleAssociation_Types )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1511:1: (lv_type_5_0= ruleAssociation_Types )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1512:3: lv_type_5_0= ruleAssociation_Types
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getTypeAssociation_TypesEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssociation_Types_in_ruleExternalClassAssociation3275);
            lv_type_5_0=ruleAssociation_Types();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_5_0, 
                      		"Association_Types");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1528:2: ( (lv_cardinality_6_0= ruleCardinalities ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1529:1: (lv_cardinality_6_0= ruleCardinalities )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1529:1: (lv_cardinality_6_0= ruleCardinalities )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1530:3: lv_cardinality_6_0= ruleCardinalities
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getCardinalityCardinalitiesEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCardinalities_in_ruleExternalClassAssociation3296);
            lv_cardinality_6_0=ruleCardinalities();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
              	        }
                     		set(
                     			current, 
                     			"cardinality",
                      		lv_cardinality_6_0, 
                      		"Cardinalities");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,11,FOLLOW_11_in_ruleExternalClassAssociation3308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getExternalClassAssociationAccess().getExternalKeyword_5());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1550:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1551:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1551:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1552:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExternalClassAssociationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getExternalTargetEClassCrossReference_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleExternalClassAssociation3331);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1565:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1567:1: ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1567:1: ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1568:2: ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7());
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1571:2: ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1572:3: ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )*
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1572:3: ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )*
            loop30:
            do {
                int alt30=8;
                int LA30_0 = input.LA(1);

                if ( LA30_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 0) ) {
                    alt30=1;
                }
                else if ( LA30_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 1) ) {
                    alt30=2;
                }
                else if ( LA30_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 2) ) {
                    alt30=3;
                }
                else if ( LA30_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 3) ) {
                    alt30=4;
                }
                else if ( LA30_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 4) ) {
                    alt30=5;
                }
                else if ( LA30_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 5) ) {
                    alt30=6;
                }
                else if ( LA30_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 6) ) {
                    alt30=7;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1574:4: ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1574:4: ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1575:5: {...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 0)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1575:121: ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1576:6: ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 0);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1579:6: ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1579:7: {...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1579:16: (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1579:18: otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) )
            	    {
            	    otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleExternalClassAssociation3389); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getExternalClassAssociationAccess().getChangeableKeyword_7_0_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1583:1: ( (lv_changeable_11_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1584:1: (lv_changeable_11_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1584:1: (lv_changeable_11_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1585:3: lv_changeable_11_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getChangeableEBooleanParserRuleCall_7_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleExternalClassAssociation3410);
            	    lv_changeable_11_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"changeable",
            	              		lv_changeable_11_0, 
            	              		"EBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1608:4: ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1608:4: ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1609:5: {...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 1)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1609:121: ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1610:6: ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 1);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1613:6: ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1613:7: {...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1613:16: (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1613:18: otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) )
            	    {
            	    otherlv_12=(Token)match(input,29,FOLLOW_29_in_ruleExternalClassAssociation3478); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getExternalClassAssociationAccess().getDerivedKeyword_7_1_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1617:1: ( (lv_derived_13_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1618:1: (lv_derived_13_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1618:1: (lv_derived_13_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1619:3: lv_derived_13_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getDerivedEBooleanParserRuleCall_7_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleExternalClassAssociation3499);
            	    lv_derived_13_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"derived",
            	              		lv_derived_13_0, 
            	              		"EBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1642:4: ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1642:4: ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1643:5: {...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 2)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1643:121: ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1644:6: ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 2);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1647:6: ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1647:7: {...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1647:16: (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1647:18: otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) )
            	    {
            	    otherlv_14=(Token)match(input,30,FOLLOW_30_in_ruleExternalClassAssociation3567); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getExternalClassAssociationAccess().getOrderedKeyword_7_2_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1651:1: ( (lv_ordered_15_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1652:1: (lv_ordered_15_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1652:1: (lv_ordered_15_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1653:3: lv_ordered_15_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getOrderedEBooleanParserRuleCall_7_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleExternalClassAssociation3588);
            	    lv_ordered_15_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"ordered",
            	              		lv_ordered_15_0, 
            	              		"EBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1676:4: ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1676:4: ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1677:5: {...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 3)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1677:121: ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1678:6: ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 3);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1681:6: ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1681:7: {...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1681:16: (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1681:18: otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) )
            	    {
            	    otherlv_16=(Token)match(input,31,FOLLOW_31_in_ruleExternalClassAssociation3656); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getExternalClassAssociationAccess().getTransientKeyword_7_3_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1685:1: ( (lv_transient_17_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1686:1: (lv_transient_17_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1686:1: (lv_transient_17_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1687:3: lv_transient_17_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getTransientEBooleanParserRuleCall_7_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleExternalClassAssociation3677);
            	    lv_transient_17_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"transient",
            	              		lv_transient_17_0, 
            	              		"EBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1710:4: ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1710:4: ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1711:5: {...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 4)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1711:121: ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1712:6: ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 4);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1715:6: ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1715:7: {...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1715:16: (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1715:18: otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) )
            	    {
            	    otherlv_18=(Token)match(input,32,FOLLOW_32_in_ruleExternalClassAssociation3745); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_18, grammarAccess.getExternalClassAssociationAccess().getUniqueKeyword_7_4_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1719:1: ( (lv_unique_19_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1720:1: (lv_unique_19_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1720:1: (lv_unique_19_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1721:3: lv_unique_19_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getUniqueEBooleanParserRuleCall_7_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleExternalClassAssociation3766);
            	    lv_unique_19_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"unique",
            	              		lv_unique_19_0, 
            	              		"EBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7());

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1744:4: ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1744:4: ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1745:5: {...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 5)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1745:121: ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1746:6: ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 5);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1749:6: ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1749:7: {...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1749:16: (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1749:18: otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) )
            	    {
            	    otherlv_20=(Token)match(input,33,FOLLOW_33_in_ruleExternalClassAssociation3834); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_20, grammarAccess.getExternalClassAssociationAccess().getUnsettableKeyword_7_5_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1753:1: ( (lv_unsettable_21_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1754:1: (lv_unsettable_21_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1754:1: (lv_unsettable_21_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1755:3: lv_unsettable_21_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getUnsettableEBooleanParserRuleCall_7_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleExternalClassAssociation3855);
            	    lv_unsettable_21_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"unsettable",
            	              		lv_unsettable_21_0, 
            	              		"EBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7());

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1778:4: ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1778:4: ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1779:5: {...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 6)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1779:121: ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1780:6: ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 6);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1783:6: ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1783:7: {...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1783:16: (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1783:18: otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) )
            	    {
            	    otherlv_22=(Token)match(input,34,FOLLOW_34_in_ruleExternalClassAssociation3923); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_22, grammarAccess.getExternalClassAssociationAccess().getVolatileKeyword_7_6_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1787:1: ( (lv_volatile_23_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1788:1: (lv_volatile_23_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1788:1: (lv_volatile_23_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1789:3: lv_volatile_23_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getVolatileEBooleanParserRuleCall_7_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleExternalClassAssociation3944);
            	    lv_volatile_23_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"volatile",
            	              		lv_volatile_23_0, 
            	              		"EBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7());

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1819:2: ( (lv_owned_annotations_24_0= ruleAnnotation ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==43) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1820:1: (lv_owned_annotations_24_0= ruleAnnotation )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1820:1: (lv_owned_annotations_24_0= ruleAnnotation )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1821:3: lv_owned_annotations_24_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getOwned_annotationsAnnotationParserRuleCall_8_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleExternalClassAssociation4006);
            	    lv_owned_annotations_24_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"owned_annotations",
            	              		lv_owned_annotations_24_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // $ANTLR end "ruleExternalClassAssociation"


    // $ANTLR start "entryRuleAbstractAttributeType"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1845:1: entryRuleAbstractAttributeType returns [EObject current=null] : iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF ;
    public final EObject entryRuleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAttributeType = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1846:2: (iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1847:2: iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractAttributeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractAttributeType_in_entryRuleAbstractAttributeType4043);
            iv_ruleAbstractAttributeType=ruleAbstractAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractAttributeType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractAttributeType4053); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAbstractAttributeType"


    // $ANTLR start "ruleAbstractAttributeType"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1854:1: ruleAbstractAttributeType returns [EObject current=null] : (this_LocalAttributeType_0= ruleLocalAttributeType | this_ExternalAttributeType_1= ruleExternalAttributeType ) ;
    public final EObject ruleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_LocalAttributeType_0 = null;

        EObject this_ExternalAttributeType_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1857:28: ( (this_LocalAttributeType_0= ruleLocalAttributeType | this_ExternalAttributeType_1= ruleExternalAttributeType ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1858:1: (this_LocalAttributeType_0= ruleLocalAttributeType | this_ExternalAttributeType_1= ruleExternalAttributeType )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1858:1: (this_LocalAttributeType_0= ruleLocalAttributeType | this_ExternalAttributeType_1= ruleExternalAttributeType )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            else if ( (LA32_0==36) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1859:5: this_LocalAttributeType_0= ruleLocalAttributeType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractAttributeTypeAccess().getLocalAttributeTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLocalAttributeType_in_ruleAbstractAttributeType4100);
                    this_LocalAttributeType_0=ruleLocalAttributeType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalAttributeType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1869:5: this_ExternalAttributeType_1= ruleExternalAttributeType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractAttributeTypeAccess().getExternalAttributeTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExternalAttributeType_in_ruleAbstractAttributeType4127);
                    this_ExternalAttributeType_1=ruleExternalAttributeType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExternalAttributeType_1; 
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
    // $ANTLR end "ruleAbstractAttributeType"


    // $ANTLR start "entryRuleLocalAttributeType"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1885:1: entryRuleLocalAttributeType returns [EObject current=null] : iv_ruleLocalAttributeType= ruleLocalAttributeType EOF ;
    public final EObject entryRuleLocalAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalAttributeType = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1886:2: (iv_ruleLocalAttributeType= ruleLocalAttributeType EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1887:2: iv_ruleLocalAttributeType= ruleLocalAttributeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalAttributeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleLocalAttributeType_in_entryRuleLocalAttributeType4162);
            iv_ruleLocalAttributeType=ruleLocalAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalAttributeType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalAttributeType4172); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLocalAttributeType"


    // $ANTLR start "ruleLocalAttributeType"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1894:1: ruleLocalAttributeType returns [EObject current=null] : ( () otherlv_1= 'enum' ( ( ruleFQN ) ) ) ;
    public final EObject ruleLocalAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1897:28: ( ( () otherlv_1= 'enum' ( ( ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1898:1: ( () otherlv_1= 'enum' ( ( ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1898:1: ( () otherlv_1= 'enum' ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1898:2: () otherlv_1= 'enum' ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1898:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1899:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalAttributeTypeAccess().getLocalAttributeTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleLocalAttributeType4218); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalAttributeTypeAccess().getEnumKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1908:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1909:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1909:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1910:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalAttributeTypeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalAttributeTypeAccess().getTypeEnumerationCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleLocalAttributeType4241);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
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
    // $ANTLR end "ruleLocalAttributeType"


    // $ANTLR start "entryRuleExternalAttributeType"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1931:1: entryRuleExternalAttributeType returns [EObject current=null] : iv_ruleExternalAttributeType= ruleExternalAttributeType EOF ;
    public final EObject entryRuleExternalAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalAttributeType = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1932:2: (iv_ruleExternalAttributeType= ruleExternalAttributeType EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1933:2: iv_ruleExternalAttributeType= ruleExternalAttributeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternalAttributeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleExternalAttributeType_in_entryRuleExternalAttributeType4277);
            iv_ruleExternalAttributeType=ruleExternalAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternalAttributeType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalAttributeType4287); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExternalAttributeType"


    // $ANTLR start "ruleExternalAttributeType"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1940:1: ruleExternalAttributeType returns [EObject current=null] : ( () otherlv_1= 'type' ( ( ruleFQN ) ) ) ;
    public final EObject ruleExternalAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1943:28: ( ( () otherlv_1= 'type' ( ( ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1944:1: ( () otherlv_1= 'type' ( ( ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1944:1: ( () otherlv_1= 'type' ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1944:2: () otherlv_1= 'type' ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1944:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1945:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExternalAttributeTypeAccess().getExternalAttributeTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleExternalAttributeType4333); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExternalAttributeTypeAccess().getTypeKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1954:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1955:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1955:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1956:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExternalAttributeTypeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExternalAttributeTypeAccess().getTypeEDataTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleExternalAttributeType4356);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
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
    // $ANTLR end "ruleExternalAttributeType"


    // $ANTLR start "entryRuleAttribute"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1977:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1978:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1979:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute4392);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute4402); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1986:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_owned_type_5_0= ruleAbstractAttributeType ) ) ( (lv_cardinality_6_0= ruleCardinalities ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (otherlv_24= 'values' otherlv_25= '(' ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )? otherlv_29= ')' )? ( (lv_owned_annotations_30_0= ruleAnnotation ) )* ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;

        EObject lv_owned_type_5_0 = null;

        Enumerator lv_cardinality_6_0 = null;

        AntlrDatatypeRuleToken lv_isId_9_0 = null;

        AntlrDatatypeRuleToken lv_changeable_11_0 = null;

        AntlrDatatypeRuleToken lv_derived_13_0 = null;

        AntlrDatatypeRuleToken lv_ordered_15_0 = null;

        AntlrDatatypeRuleToken lv_transient_17_0 = null;

        AntlrDatatypeRuleToken lv_unique_19_0 = null;

        AntlrDatatypeRuleToken lv_unsettable_21_0 = null;

        AntlrDatatypeRuleToken lv_volatile_23_0 = null;

        EObject lv_owned_values_26_0 = null;

        EObject lv_owned_values_28_0 = null;

        EObject lv_owned_annotations_30_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1989:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_owned_type_5_0= ruleAbstractAttributeType ) ) ( (lv_cardinality_6_0= ruleCardinalities ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (otherlv_24= 'values' otherlv_25= '(' ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )? otherlv_29= ')' )? ( (lv_owned_annotations_30_0= ruleAnnotation ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1990:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_owned_type_5_0= ruleAbstractAttributeType ) ) ( (lv_cardinality_6_0= ruleCardinalities ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (otherlv_24= 'values' otherlv_25= '(' ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )? otherlv_29= ')' )? ( (lv_owned_annotations_30_0= ruleAnnotation ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1990:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_owned_type_5_0= ruleAbstractAttributeType ) ) ( (lv_cardinality_6_0= ruleCardinalities ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (otherlv_24= 'values' otherlv_25= '(' ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )? otherlv_29= ')' )? ( (lv_owned_annotations_30_0= ruleAnnotation ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1990:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_owned_type_5_0= ruleAbstractAttributeType ) ) ( (lv_cardinality_6_0= ruleCardinalities ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (otherlv_24= 'values' otherlv_25= '(' ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )? otherlv_29= ')' )? ( (lv_owned_annotations_30_0= ruleAnnotation ) )*
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1990:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1991:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAttributeAccess().getAttributeAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1996:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1997:1: (lv_name_1_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1997:1: (lv_name_1_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1998:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleAttribute4457);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2014:2: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2014:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ','
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleAttribute4470); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getDescriptionKeyword_2_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2018:1: ( (lv_description_3_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2019:1: (lv_description_3_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2019:1: (lv_description_3_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2020:3: lv_description_3_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleAttribute4491);
                    lv_description_3_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                      	        }
                             		set(
                             			current, 
                             			"description",
                              		lv_description_3_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleAttribute4503); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getCommaKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2040:3: ( (lv_owned_type_5_0= ruleAbstractAttributeType ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2041:1: (lv_owned_type_5_0= ruleAbstractAttributeType )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2041:1: (lv_owned_type_5_0= ruleAbstractAttributeType )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2042:3: lv_owned_type_5_0= ruleAbstractAttributeType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getOwned_typeAbstractAttributeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbstractAttributeType_in_ruleAttribute4526);
            lv_owned_type_5_0=ruleAbstractAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"owned_type",
                      		lv_owned_type_5_0, 
                      		"AbstractAttributeType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2058:2: ( (lv_cardinality_6_0= ruleCardinalities ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=51 && LA34_0<=54)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2059:1: (lv_cardinality_6_0= ruleCardinalities )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2059:1: (lv_cardinality_6_0= ruleCardinalities )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2060:3: lv_cardinality_6_0= ruleCardinalities
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeAccess().getCardinalityCardinalitiesEnumRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCardinalities_in_ruleAttribute4547);
                    lv_cardinality_6_0=ruleCardinalities();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                      	        }
                             		set(
                             			current, 
                             			"cardinality",
                              		lv_cardinality_6_0, 
                              		"Cardinalities");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2076:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2078:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2078:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2079:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_5());
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2082:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2083:3: ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )*
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2083:3: ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )*
            loop35:
            do {
                int alt35=9;
                alt35 = dfa35.predict(input);
                switch (alt35) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2085:4: ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2085:4: ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2086:5: {...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2086:106: ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2087:6: ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 0);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2090:6: ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2090:7: {...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2090:16: (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2090:18: otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) )
            	    {
            	    otherlv_8=(Token)match(input,37,FOLLOW_37_in_ruleAttribute4606); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getIdKeyword_5_0_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2094:1: ( (lv_isId_9_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2095:1: (lv_isId_9_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2095:1: (lv_isId_9_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2096:3: lv_isId_9_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getIsIdEBooleanParserRuleCall_5_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleAttribute4627);
            	    lv_isId_9_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"isId",
            	              		lv_isId_9_0, 
            	              		"EBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2119:4: ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2119:4: ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2120:5: {...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2120:106: ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2121:6: ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 1);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2124:6: ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2124:7: {...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2124:16: (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2124:18: otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) )
            	    {
            	    otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleAttribute4695); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getChangeableKeyword_5_1_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2128:1: ( (lv_changeable_11_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2129:1: (lv_changeable_11_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2129:1: (lv_changeable_11_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2130:3: lv_changeable_11_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getChangeableEBooleanParserRuleCall_5_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleAttribute4716);
            	    lv_changeable_11_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"changeable",
            	              		lv_changeable_11_0, 
            	              		"EBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2153:4: ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2153:4: ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2154:5: {...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2154:106: ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2155:6: ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 2);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2158:6: ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2158:7: {...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2158:16: (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2158:18: otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) )
            	    {
            	    otherlv_12=(Token)match(input,29,FOLLOW_29_in_ruleAttribute4784); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getDerivedKeyword_5_2_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2162:1: ( (lv_derived_13_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2163:1: (lv_derived_13_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2163:1: (lv_derived_13_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2164:3: lv_derived_13_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getDerivedEBooleanParserRuleCall_5_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleAttribute4805);
            	    lv_derived_13_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"derived",
            	              		lv_derived_13_0, 
            	              		"EBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2187:4: ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2187:4: ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2188:5: {...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2188:106: ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2189:6: ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 3);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2192:6: ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2192:7: {...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2192:16: (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2192:18: otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) )
            	    {
            	    otherlv_14=(Token)match(input,30,FOLLOW_30_in_ruleAttribute4873); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getOrderedKeyword_5_3_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2196:1: ( (lv_ordered_15_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2197:1: (lv_ordered_15_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2197:1: (lv_ordered_15_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2198:3: lv_ordered_15_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getOrderedEBooleanParserRuleCall_5_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleAttribute4894);
            	    lv_ordered_15_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"ordered",
            	              		lv_ordered_15_0, 
            	              		"EBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2221:4: ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2221:4: ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2222:5: {...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2222:106: ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2223:6: ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 4);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2226:6: ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2226:7: {...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2226:16: (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2226:18: otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) )
            	    {
            	    otherlv_16=(Token)match(input,31,FOLLOW_31_in_ruleAttribute4962); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getAttributeAccess().getTransientKeyword_5_4_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2230:1: ( (lv_transient_17_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2231:1: (lv_transient_17_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2231:1: (lv_transient_17_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2232:3: lv_transient_17_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getTransientEBooleanParserRuleCall_5_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleAttribute4983);
            	    lv_transient_17_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"transient",
            	              		lv_transient_17_0, 
            	              		"EBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2255:4: ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2255:4: ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2256:5: {...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 5)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2256:106: ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2257:6: ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 5);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2260:6: ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2260:7: {...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2260:16: (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2260:18: otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) )
            	    {
            	    otherlv_18=(Token)match(input,32,FOLLOW_32_in_ruleAttribute5051); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_18, grammarAccess.getAttributeAccess().getUniqueKeyword_5_5_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2264:1: ( (lv_unique_19_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2265:1: (lv_unique_19_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2265:1: (lv_unique_19_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2266:3: lv_unique_19_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getUniqueEBooleanParserRuleCall_5_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleAttribute5072);
            	    lv_unique_19_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"unique",
            	              		lv_unique_19_0, 
            	              		"EBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2289:4: ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2289:4: ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2290:5: {...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 6)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2290:106: ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2291:6: ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 6);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2294:6: ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2294:7: {...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2294:16: (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2294:18: otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) )
            	    {
            	    otherlv_20=(Token)match(input,33,FOLLOW_33_in_ruleAttribute5140); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_20, grammarAccess.getAttributeAccess().getUnsettableKeyword_5_6_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2298:1: ( (lv_unsettable_21_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2299:1: (lv_unsettable_21_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2299:1: (lv_unsettable_21_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2300:3: lv_unsettable_21_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getUnsettableEBooleanParserRuleCall_5_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleAttribute5161);
            	    lv_unsettable_21_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"unsettable",
            	              		lv_unsettable_21_0, 
            	              		"EBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2323:4: ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2323:4: ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2324:5: {...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 7) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 7)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2324:106: ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2325:6: ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 7);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2328:6: ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2328:7: {...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2328:16: (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2328:18: otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) )
            	    {
            	    otherlv_22=(Token)match(input,34,FOLLOW_34_in_ruleAttribute5229); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_22, grammarAccess.getAttributeAccess().getVolatileKeyword_5_7_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2332:1: ( (lv_volatile_23_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2333:1: (lv_volatile_23_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2333:1: (lv_volatile_23_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2334:3: lv_volatile_23_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getVolatileEBooleanParserRuleCall_5_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleAttribute5250);
            	    lv_volatile_23_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"volatile",
            	              		lv_volatile_23_0, 
            	              		"EBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5());

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

            getUnorderedGroupHelper().leave(grammarAccess.getAttributeAccess().getUnorderedGroup_5());

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2364:2: (otherlv_24= 'values' otherlv_25= '(' ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )? otherlv_29= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2364:4: otherlv_24= 'values' otherlv_25= '(' ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )? otherlv_29= ')'
                    {
                    otherlv_24=(Token)match(input,38,FOLLOW_38_in_ruleAttribute5304); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getAttributeAccess().getValuesKeyword_6_0());
                          
                    }
                    otherlv_25=(Token)match(input,39,FOLLOW_39_in_ruleAttribute5316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_6_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2372:1: ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_ID)) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2372:2: ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )*
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2372:2: ( (lv_owned_values_26_0= ruleValue ) )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2373:1: (lv_owned_values_26_0= ruleValue )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2373:1: (lv_owned_values_26_0= ruleValue )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2374:3: lv_owned_values_26_0= ruleValue
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAttributeAccess().getOwned_valuesValueParserRuleCall_6_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValue_in_ruleAttribute5338);
                            lv_owned_values_26_0=ruleValue();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"owned_values",
                                      		lv_owned_values_26_0, 
                                      		"Value");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2390:2: (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )*
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==20) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2390:4: otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) )
                            	    {
                            	    otherlv_27=(Token)match(input,20,FOLLOW_20_in_ruleAttribute5351); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_27, grammarAccess.getAttributeAccess().getCommaKeyword_6_2_1_0());
                            	          
                            	    }
                            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2394:1: ( (lv_owned_values_28_0= ruleValue ) )
                            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2395:1: (lv_owned_values_28_0= ruleValue )
                            	    {
                            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2395:1: (lv_owned_values_28_0= ruleValue )
                            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2396:3: lv_owned_values_28_0= ruleValue
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getOwned_valuesValueParserRuleCall_6_2_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleValue_in_ruleAttribute5372);
                            	    lv_owned_values_28_0=ruleValue();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"owned_values",
                            	              		lv_owned_values_28_0, 
                            	              		"Value");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop36;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_29=(Token)match(input,40,FOLLOW_40_in_ruleAttribute5388); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_6_3());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2416:3: ( (lv_owned_annotations_30_0= ruleAnnotation ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==43) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2417:1: (lv_owned_annotations_30_0= ruleAnnotation )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2417:1: (lv_owned_annotations_30_0= ruleAnnotation )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2418:3: lv_owned_annotations_30_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getOwned_annotationsAnnotationParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAttribute5411);
            	    lv_owned_annotations_30_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"owned_annotations",
            	              		lv_owned_annotations_30_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleValue"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2442:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2443:2: (iv_ruleValue= ruleValue EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2444:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue5448);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue5458); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2451:1: ruleValue returns [EObject current=null] : ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'literal' )? ( (lv_literal_3_0= ruleEString ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_literal_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2454:28: ( ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'literal' )? ( (lv_literal_3_0= ruleEString ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2455:1: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'literal' )? ( (lv_literal_3_0= ruleEString ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2455:1: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'literal' )? ( (lv_literal_3_0= ruleEString ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2455:2: () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'literal' )? ( (lv_literal_3_0= ruleEString ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2455:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2456:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getValueAccess().getValueAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2461:2: ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'literal' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==41) ) {
                    alt40=1;
                }
            }
            else if ( (LA40_0==RULE_ID) ) {
                int LA40_2 = input.LA(2);

                if ( (LA40_2==41) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2461:3: ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'literal'
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2461:3: ( (lv_name_1_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2462:1: (lv_name_1_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2462:1: (lv_name_1_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2463:3: lv_name_1_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValueAccess().getNameEStringParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleValue5514);
                    lv_name_1_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValueRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleValue5526); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValueAccess().getLiteralKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2483:3: ( (lv_literal_3_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2484:1: (lv_literal_3_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2484:1: (lv_literal_3_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2485:3: lv_literal_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValueAccess().getLiteralEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleValue5549);
            lv_literal_3_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getValueRule());
              	        }
                     		set(
                     			current, 
                     			"literal",
                      		lv_literal_3_0, 
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleOperation"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2509:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2510:2: (iv_ruleOperation= ruleOperation EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2511:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation5585);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation5595); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2518:1: ruleOperation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' (otherlv_7= 'returns' ( (lv_operation_type_8_0= ruleAbstractType ) ) )? ( (lv_owned_annotations_9_0= ruleAnnotation ) )* ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_operation_type_8_0 = null;

        EObject lv_owned_annotations_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2521:28: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' (otherlv_7= 'returns' ( (lv_operation_type_8_0= ruleAbstractType ) ) )? ( (lv_owned_annotations_9_0= ruleAnnotation ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2522:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' (otherlv_7= 'returns' ( (lv_operation_type_8_0= ruleAbstractType ) ) )? ( (lv_owned_annotations_9_0= ruleAnnotation ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2522:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' (otherlv_7= 'returns' ( (lv_operation_type_8_0= ruleAbstractType ) ) )? ( (lv_owned_annotations_9_0= ruleAnnotation ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2522:2: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' (otherlv_7= 'returns' ( (lv_operation_type_8_0= ruleAbstractType ) ) )? ( (lv_owned_annotations_9_0= ruleAnnotation ) )*
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2522:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2523:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationAccess().getOperationAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2528:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2529:1: (lv_name_1_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2529:1: (lv_name_1_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2530:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleOperation5650);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleOperation5662); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2550:1: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID||LA42_0==11) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2550:2: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2550:2: ( (lv_parameters_3_0= ruleParameter ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2551:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2551:1: (lv_parameters_3_0= ruleParameter )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2552:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleOperation5684);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_3_0, 
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2568:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==20) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2568:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleOperation5697); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2572:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2573:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2573:1: (lv_parameters_5_0= ruleParameter )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2574:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleOperation5718);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_5_0, 
                    	              		"Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,40,FOLLOW_40_in_ruleOperation5734); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2594:1: (otherlv_7= 'returns' ( (lv_operation_type_8_0= ruleAbstractType ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==42) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2594:3: otherlv_7= 'returns' ( (lv_operation_type_8_0= ruleAbstractType ) )
                    {
                    otherlv_7=(Token)match(input,42,FOLLOW_42_in_ruleOperation5747); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getReturnsKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2598:1: ( (lv_operation_type_8_0= ruleAbstractType ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2599:1: (lv_operation_type_8_0= ruleAbstractType )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2599:1: (lv_operation_type_8_0= ruleAbstractType )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2600:3: lv_operation_type_8_0= ruleAbstractType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getOperation_typeAbstractTypeParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAbstractType_in_ruleOperation5768);
                    lv_operation_type_8_0=ruleAbstractType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operation_type",
                              		lv_operation_type_8_0, 
                              		"AbstractType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2616:4: ( (lv_owned_annotations_9_0= ruleAnnotation ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==43) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2617:1: (lv_owned_annotations_9_0= ruleAnnotation )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2617:1: (lv_owned_annotations_9_0= ruleAnnotation )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2618:3: lv_owned_annotations_9_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOperationAccess().getOwned_annotationsAnnotationParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleOperation5791);
            	    lv_owned_annotations_9_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOperationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"owned_annotations",
            	              		lv_owned_annotations_9_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleParameter"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2642:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2643:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2644:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter5828);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter5838); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2651:1: ruleParameter returns [EObject current=null] : ( () ( (lv_parameter_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) )? ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameter_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;

        EObject lv_owned_annotations_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2654:28: ( ( () ( (lv_parameter_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) )? ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2655:1: ( () ( (lv_parameter_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) )? ( (lv_owned_annotations_4_0= ruleAnnotation ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2655:1: ( () ( (lv_parameter_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) )? ( (lv_owned_annotations_4_0= ruleAnnotation ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2655:2: () ( (lv_parameter_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) )? ( (lv_owned_annotations_4_0= ruleAnnotation ) )*
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2655:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2656:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParameterAccess().getParameterAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2661:2: ( (lv_parameter_type_1_0= ruleAbstractType ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2662:1: (lv_parameter_type_1_0= ruleAbstractType )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2662:1: (lv_parameter_type_1_0= ruleAbstractType )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2663:3: lv_parameter_type_1_0= ruleAbstractType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getParameter_typeAbstractTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbstractType_in_ruleParameter5893);
            lv_parameter_type_1_0=ruleAbstractType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameter_type",
                      		lv_parameter_type_1_0, 
                      		"AbstractType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2679:2: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2680:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2680:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2681:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleParameter5914);
            lv_name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2697:2: ( (lv_description_3_0= ruleEString ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_ID)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2698:1: (lv_description_3_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2698:1: (lv_description_3_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2699:3: lv_description_3_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getDescriptionEStringParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleParameter5935);
                    lv_description_3_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"description",
                              		lv_description_3_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2715:3: ( (lv_owned_annotations_4_0= ruleAnnotation ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==43) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2716:1: (lv_owned_annotations_4_0= ruleAnnotation )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2716:1: (lv_owned_annotations_4_0= ruleAnnotation )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2717:3: lv_owned_annotations_4_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameterAccess().getOwned_annotationsAnnotationParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleParameter5957);
            	    lv_owned_annotations_4_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"owned_annotations",
            	              		lv_owned_annotations_4_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleAbstractType"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2741:1: entryRuleAbstractType returns [EObject current=null] : iv_ruleAbstractType= ruleAbstractType EOF ;
    public final EObject entryRuleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractType = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2742:2: (iv_ruleAbstractType= ruleAbstractType EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2743:2: iv_ruleAbstractType= ruleAbstractType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractTypeRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractType_in_entryRuleAbstractType5994);
            iv_ruleAbstractType=ruleAbstractType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractType6004); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAbstractType"


    // $ANTLR start "ruleAbstractType"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2750:1: ruleAbstractType returns [EObject current=null] : (this_LocalType_0= ruleLocalType | this_ExternalType_1= ruleExternalType ) ;
    public final EObject ruleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject this_LocalType_0 = null;

        EObject this_ExternalType_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2753:28: ( (this_LocalType_0= ruleLocalType | this_ExternalType_1= ruleExternalType ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2754:1: (this_LocalType_0= ruleLocalType | this_ExternalType_1= ruleExternalType )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2754:1: (this_LocalType_0= ruleLocalType | this_ExternalType_1= ruleExternalType )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            else if ( (LA47_0==11) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2755:5: this_LocalType_0= ruleLocalType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractTypeAccess().getLocalTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLocalType_in_ruleAbstractType6051);
                    this_LocalType_0=ruleLocalType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2765:5: this_ExternalType_1= ruleExternalType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractTypeAccess().getExternalTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExternalType_in_ruleAbstractType6078);
                    this_ExternalType_1=ruleExternalType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExternalType_1; 
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
    // $ANTLR end "ruleAbstractType"


    // $ANTLR start "entryRuleExternalType"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2781:1: entryRuleExternalType returns [EObject current=null] : iv_ruleExternalType= ruleExternalType EOF ;
    public final EObject entryRuleExternalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalType = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2782:2: (iv_ruleExternalType= ruleExternalType EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2783:2: iv_ruleExternalType= ruleExternalType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternalTypeRule()); 
            }
            pushFollow(FOLLOW_ruleExternalType_in_entryRuleExternalType6113);
            iv_ruleExternalType=ruleExternalType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternalType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalType6123); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExternalType"


    // $ANTLR start "ruleExternalType"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2790:1: ruleExternalType returns [EObject current=null] : ( () otherlv_1= 'external' ( ( ruleFQN ) ) ( (lv_cardinality_3_0= ruleCardinalities ) ) ) ;
    public final EObject ruleExternalType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_cardinality_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2793:28: ( ( () otherlv_1= 'external' ( ( ruleFQN ) ) ( (lv_cardinality_3_0= ruleCardinalities ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2794:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) ( (lv_cardinality_3_0= ruleCardinalities ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2794:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) ( (lv_cardinality_3_0= ruleCardinalities ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2794:2: () otherlv_1= 'external' ( ( ruleFQN ) ) ( (lv_cardinality_3_0= ruleCardinalities ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2794:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2795:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExternalTypeAccess().getExternalTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleExternalType6169); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExternalTypeAccess().getExternalKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2804:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2805:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2805:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2806:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExternalTypeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExternalTypeAccess().getTypeEClassifierCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleExternalType6192);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2819:2: ( (lv_cardinality_3_0= ruleCardinalities ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2820:1: (lv_cardinality_3_0= ruleCardinalities )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2820:1: (lv_cardinality_3_0= ruleCardinalities )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2821:3: lv_cardinality_3_0= ruleCardinalities
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExternalTypeAccess().getCardinalityCardinalitiesEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCardinalities_in_ruleExternalType6213);
            lv_cardinality_3_0=ruleCardinalities();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExternalTypeRule());
              	        }
                     		set(
                     			current, 
                     			"cardinality",
                      		lv_cardinality_3_0, 
                      		"Cardinalities");
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
    // $ANTLR end "ruleExternalType"


    // $ANTLR start "entryRuleLocalType"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2845:1: entryRuleLocalType returns [EObject current=null] : iv_ruleLocalType= ruleLocalType EOF ;
    public final EObject entryRuleLocalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalType = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2846:2: (iv_ruleLocalType= ruleLocalType EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2847:2: iv_ruleLocalType= ruleLocalType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalTypeRule()); 
            }
            pushFollow(FOLLOW_ruleLocalType_in_entryRuleLocalType6249);
            iv_ruleLocalType=ruleLocalType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalType6259); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLocalType"


    // $ANTLR start "ruleLocalType"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2854:1: ruleLocalType returns [EObject current=null] : ( () ( ( ruleFQN ) ) ( (lv_cardinality_2_0= ruleCardinalities ) ) ) ;
    public final EObject ruleLocalType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_cardinality_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2857:28: ( ( () ( ( ruleFQN ) ) ( (lv_cardinality_2_0= ruleCardinalities ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2858:1: ( () ( ( ruleFQN ) ) ( (lv_cardinality_2_0= ruleCardinalities ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2858:1: ( () ( ( ruleFQN ) ) ( (lv_cardinality_2_0= ruleCardinalities ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2858:2: () ( ( ruleFQN ) ) ( (lv_cardinality_2_0= ruleCardinalities ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2858:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2859:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalTypeAccess().getLocalTypeAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2864:2: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2865:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2865:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2866:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalTypeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalTypeAccess().getTypeViewpointClassifierCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleLocalType6316);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2879:2: ( (lv_cardinality_2_0= ruleCardinalities ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2880:1: (lv_cardinality_2_0= ruleCardinalities )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2880:1: (lv_cardinality_2_0= ruleCardinalities )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2881:3: lv_cardinality_2_0= ruleCardinalities
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalTypeAccess().getCardinalityCardinalitiesEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCardinalities_in_ruleLocalType6337);
            lv_cardinality_2_0=ruleCardinalities();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalTypeRule());
              	        }
                     		set(
                     			current, 
                     			"cardinality",
                      		lv_cardinality_2_0, 
                      		"Cardinalities");
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
    // $ANTLR end "ruleLocalType"


    // $ANTLR start "entryRuleAnnotation"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2907:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2908:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2909:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation6375);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation6385); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2916:1: ruleAnnotation returns [EObject current=null] : ( () otherlv_1= 'Annotation' ( (lv_source_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_owned_details_4_0= ruleDetail ) )+ otherlv_5= '}' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_source_2_0 = null;

        EObject lv_owned_details_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2919:28: ( ( () otherlv_1= 'Annotation' ( (lv_source_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_owned_details_4_0= ruleDetail ) )+ otherlv_5= '}' )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2920:1: ( () otherlv_1= 'Annotation' ( (lv_source_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_owned_details_4_0= ruleDetail ) )+ otherlv_5= '}' )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2920:1: ( () otherlv_1= 'Annotation' ( (lv_source_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_owned_details_4_0= ruleDetail ) )+ otherlv_5= '}' )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2920:2: () otherlv_1= 'Annotation' ( (lv_source_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_owned_details_4_0= ruleDetail ) )+ otherlv_5= '}' )?
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2920:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2921:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAnnotationAccess().getAnnotationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleAnnotation6431); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getAnnotationKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2930:1: ( (lv_source_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2931:1: (lv_source_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2931:1: (lv_source_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2932:3: lv_source_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationAccess().getSourceEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleAnnotation6452);
            lv_source_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"source",
                      		lv_source_2_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2948:2: (otherlv_3= '{' ( (lv_owned_details_4_0= ruleDetail ) )+ otherlv_5= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==14) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2948:4: otherlv_3= '{' ( (lv_owned_details_4_0= ruleDetail ) )+ otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleAnnotation6465); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2952:1: ( (lv_owned_details_4_0= ruleDetail ) )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==44) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2953:1: (lv_owned_details_4_0= ruleDetail )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2953:1: (lv_owned_details_4_0= ruleDetail )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2954:3: lv_owned_details_4_0= ruleDetail
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getOwned_detailsDetailParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDetail_in_ruleAnnotation6486);
                    	    lv_owned_details_4_0=ruleDetail();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"owned_details",
                    	              		lv_owned_details_4_0, 
                    	              		"Detail");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt48 >= 1 ) break loop48;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
                    } while (true);

                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleAnnotation6499); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_3_2());
                          
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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleDetail"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2982:1: entryRuleDetail returns [EObject current=null] : iv_ruleDetail= ruleDetail EOF ;
    public final EObject entryRuleDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetail = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2983:2: (iv_ruleDetail= ruleDetail EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2984:2: iv_ruleDetail= ruleDetail EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDetailRule()); 
            }
            pushFollow(FOLLOW_ruleDetail_in_entryRuleDetail6537);
            iv_ruleDetail=ruleDetail();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDetail; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDetail6547); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDetail"


    // $ANTLR start "ruleDetail"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2991:1: ruleDetail returns [EObject current=null] : ( () otherlv_1= 'key:' ( (lv_key_2_0= ruleEString ) ) (otherlv_3= 'value:' ( (lv_value_4_0= ruleEString ) ) )? ) ;
    public final EObject ruleDetail() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_key_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2994:28: ( ( () otherlv_1= 'key:' ( (lv_key_2_0= ruleEString ) ) (otherlv_3= 'value:' ( (lv_value_4_0= ruleEString ) ) )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2995:1: ( () otherlv_1= 'key:' ( (lv_key_2_0= ruleEString ) ) (otherlv_3= 'value:' ( (lv_value_4_0= ruleEString ) ) )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2995:1: ( () otherlv_1= 'key:' ( (lv_key_2_0= ruleEString ) ) (otherlv_3= 'value:' ( (lv_value_4_0= ruleEString ) ) )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2995:2: () otherlv_1= 'key:' ( (lv_key_2_0= ruleEString ) ) (otherlv_3= 'value:' ( (lv_value_4_0= ruleEString ) ) )?
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2995:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2996:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDetailAccess().getDetailAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleDetail6593); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDetailAccess().getKeyKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3005:1: ( (lv_key_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3006:1: (lv_key_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3006:1: (lv_key_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3007:3: lv_key_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDetailAccess().getKeyEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleDetail6614);
            lv_key_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDetailRule());
              	        }
                     		set(
                     			current, 
                     			"key",
                      		lv_key_2_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3023:2: (otherlv_3= 'value:' ( (lv_value_4_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==45) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3023:4: otherlv_3= 'value:' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleDetail6627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDetailAccess().getValueKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3027:1: ( (lv_value_4_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3028:1: (lv_value_4_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3028:1: (lv_value_4_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3029:3: lv_value_4_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDetailAccess().getValueEStringParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleDetail6648);
                    lv_value_4_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDetailRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_4_0, 
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
    // $ANTLR end "ruleDetail"


    // $ANTLR start "entryRuleEString"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3053:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3054:2: (iv_ruleEString= ruleEString EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3055:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString6687);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString6698); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3062:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3065:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3066:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3066:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_STRING) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_ID) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3066:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString6738); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3074:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString6764); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3089:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3090:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3091:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN6810);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN6821); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3098:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3101:28: ( (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3102:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3102:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3102:6: this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN6861); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3109:1: (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==46) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3110:2: kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    {
            	    kw=(Token)match(input,46,FOLLOW_46_in_ruleFQN6880); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3115:1: ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3115:2: ( RULE_ID )=>this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN6901); if (state.failed) return current;
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
            	    break loop52;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3130:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3131:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3132:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_entryRuleEBoolean6950);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBoolean6961); if (state.failed) return current;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3139:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3142:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3143:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3143:1: (kw= 'true' | kw= 'false' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==47) ) {
                alt53=1;
            }
            else if ( (LA53_0==48) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3144:2: kw= 'true'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleEBoolean6999); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3151:2: kw= 'false'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleEBoolean7018); if (state.failed) return current;
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


    // $ANTLR start "ruleAssociation_Types"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3166:1: ruleAssociation_Types returns [Enumerator current=null] : ( (enumLiteral_0= 'contains' ) | (enumLiteral_1= 'refers' ) ) ;
    public final Enumerator ruleAssociation_Types() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3168:28: ( ( (enumLiteral_0= 'contains' ) | (enumLiteral_1= 'refers' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3169:1: ( (enumLiteral_0= 'contains' ) | (enumLiteral_1= 'refers' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3169:1: ( (enumLiteral_0= 'contains' ) | (enumLiteral_1= 'refers' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==49) ) {
                alt54=1;
            }
            else if ( (LA54_0==50) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3169:2: (enumLiteral_0= 'contains' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3169:2: (enumLiteral_0= 'contains' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3169:4: enumLiteral_0= 'contains'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_49_in_ruleAssociation_Types7074); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssociation_TypesAccess().getContainmentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssociation_TypesAccess().getContainmentEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3175:6: (enumLiteral_1= 'refers' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3175:6: (enumLiteral_1= 'refers' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3175:8: enumLiteral_1= 'refers'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_50_in_ruleAssociation_Types7091); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssociation_TypesAccess().getReferenceEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssociation_TypesAccess().getReferenceEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleAssociation_Types"


    // $ANTLR start "ruleCardinalities"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3185:1: ruleCardinalities returns [Enumerator current=null] : ( (enumLiteral_0= '[0,*]' ) | (enumLiteral_1= '[1,*]' ) | (enumLiteral_2= '[0,1]' ) | (enumLiteral_3= '[1,1]' ) ) ;
    public final Enumerator ruleCardinalities() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3187:28: ( ( (enumLiteral_0= '[0,*]' ) | (enumLiteral_1= '[1,*]' ) | (enumLiteral_2= '[0,1]' ) | (enumLiteral_3= '[1,1]' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3188:1: ( (enumLiteral_0= '[0,*]' ) | (enumLiteral_1= '[1,*]' ) | (enumLiteral_2= '[0,1]' ) | (enumLiteral_3= '[1,1]' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3188:1: ( (enumLiteral_0= '[0,*]' ) | (enumLiteral_1= '[1,*]' ) | (enumLiteral_2= '[0,1]' ) | (enumLiteral_3= '[1,1]' ) )
            int alt55=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt55=1;
                }
                break;
            case 52:
                {
                alt55=2;
                }
                break;
            case 53:
                {
                alt55=3;
                }
                break;
            case 54:
                {
                alt55=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3188:2: (enumLiteral_0= '[0,*]' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3188:2: (enumLiteral_0= '[0,*]' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3188:4: enumLiteral_0= '[0,*]'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_ruleCardinalities7136); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCardinalitiesAccess().getNothing_Or_ManyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCardinalitiesAccess().getNothing_Or_ManyEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3194:6: (enumLiteral_1= '[1,*]' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3194:6: (enumLiteral_1= '[1,*]' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3194:8: enumLiteral_1= '[1,*]'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_52_in_ruleCardinalities7153); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCardinalitiesAccess().getOne_Or_ManyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCardinalitiesAccess().getOne_Or_ManyEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3200:6: (enumLiteral_2= '[0,1]' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3200:6: (enumLiteral_2= '[0,1]' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3200:8: enumLiteral_2= '[0,1]'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_53_in_ruleCardinalities7170); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCardinalitiesAccess().getNothing_Or_OneEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCardinalitiesAccess().getNothing_Or_OneEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3206:6: (enumLiteral_3= '[1,1]' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3206:6: (enumLiteral_3= '[1,1]' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3206:8: enumLiteral_3= '[1,1]'
                    {
                    enumLiteral_3=(Token)match(input,54,FOLLOW_54_in_ruleCardinalities7187); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCardinalitiesAccess().getOnly_OneEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCardinalitiesAccess().getOnly_OneEnumLiteralDeclaration_3()); 
                          
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
    // $ANTLR end "ruleCardinalities"

    // Delegated rules


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String DFA25_eotS =
        "\17\uffff";
    static final String DFA25_eofS =
        "\17\uffff";
    static final String DFA25_minS =
        "\1\4\2\33\1\4\2\63\2\24\4\5\1\61\2\uffff";
    static final String DFA25_maxS =
        "\1\5\2\62\1\5\2\66\2\24\4\13\1\62\2\uffff";
    static final String DFA25_acceptS =
        "\15\uffff\1\2\1\1";
    static final String DFA25_specialS =
        "\17\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\1\2",
            "\1\3\25\uffff\1\4\1\5",
            "\1\3\25\uffff\1\4\1\5",
            "\1\6\1\7",
            "\1\10\1\11\1\12\1\13",
            "\1\10\1\11\1\12\1\13",
            "\1\14",
            "\1\14",
            "\1\16\5\uffff\1\15",
            "\1\16\5\uffff\1\15",
            "\1\16\5\uffff\1\15",
            "\1\16\5\uffff\1\15",
            "\1\4\1\5",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1026:1: (this_LocalClassAssociation_0= ruleLocalClassAssociation | this_ExternalClassAssociation_1= ruleExternalClassAssociation )";
        }
    }
    static final String DFA35_eotS =
        "\12\uffff";
    static final String DFA35_eofS =
        "\1\1\11\uffff";
    static final String DFA35_minS =
        "\1\4\11\uffff";
    static final String DFA35_maxS =
        "\1\53\11\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA35_specialS =
        "\1\0\11\uffff}>";
    static final String[] DFA35_transitionS = {
            "\2\1\12\uffff\1\1\7\uffff\2\1\2\uffff\1\3\1\4\1\5\1\6\1\7\1"+
            "\10\1\11\2\uffff\1\2\1\1\4\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "()* loopback of 2083:3: ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_0 = input.LA(1);

                         
                        int index35_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA35_0==EOF||(LA35_0>=RULE_STRING && LA35_0<=RULE_ID)||LA35_0==16||(LA35_0>=24 && LA35_0<=25)||LA35_0==38||LA35_0==43) ) {s = 1;}

                        else if ( LA35_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 0) ) {s = 2;}

                        else if ( LA35_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 1) ) {s = 3;}

                        else if ( LA35_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 2) ) {s = 4;}

                        else if ( LA35_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 3) ) {s = 5;}

                        else if ( LA35_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 4) ) {s = 6;}

                        else if ( LA35_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 5) ) {s = 7;}

                        else if ( LA35_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 6) ) {s = 8;}

                        else if ( LA35_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 7) ) {s = 9;}

                         
                        input.seek(index35_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleDataSpec_in_entryRuleDataSpec75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSpec85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleDataSpec140 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_ruleData_in_ruleDataSpec162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractImport_in_entryRuleAbstractImport198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractImport208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_ruleAbstractImport255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportURI_in_ruleAbstractImport282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportNamespace327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleImportNamespace372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportURI_in_entryRuleImportURI407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportURI417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImportURI454 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleImportURI475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport558 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_ruleAbstractImport_in_ruleImport580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_entryRuleData615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleData625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleData671 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleData692 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleData705 = new BitSet(new long[]{0x0000080004038000L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleData726 = new BitSet(new long[]{0x0000080004038000L});
    public static final BitSet FOLLOW_15_in_ruleData785 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleData806 = new BitSet(new long[]{0x0000000004038000L});
    public static final BitSet FOLLOW_ruleClass_in_ruleData882 = new BitSet(new long[]{0x0000000004038000L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleData958 = new BitSet(new long[]{0x0000000004038000L});
    public static final BitSet FOLLOW_16_in_ruleData1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass1047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleClass1103 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleClass1124 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleClass1136 = new BitSet(new long[]{0x0000080003ED8000L});
    public static final BitSet FOLLOW_15_in_ruleClass1149 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleClass1170 = new BitSet(new long[]{0x0000080003ED0000L});
    public static final BitSet FOLLOW_18_in_ruleClass1185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClass1202 = new BitSet(new long[]{0x0000080003E90000L});
    public static final BitSet FOLLOW_19_in_ruleClass1222 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleClass1245 = new BitSet(new long[]{0x0000080003F10000L});
    public static final BitSet FOLLOW_20_in_ruleClass1258 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleClass1281 = new BitSet(new long[]{0x0000080003F10000L});
    public static final BitSet FOLLOW_21_in_ruleClass1298 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_ruleAbstractSuperClass_in_ruleClass1319 = new BitSet(new long[]{0x0000080003D10000L});
    public static final BitSet FOLLOW_20_in_ruleClass1332 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_ruleAbstractSuperClass_in_ruleClass1353 = new BitSet(new long[]{0x0000080003D10000L});
    public static final BitSet FOLLOW_22_in_ruleClass1370 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleClass1391 = new BitSet(new long[]{0x0000080003810000L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleClass1414 = new BitSet(new long[]{0x0000080003810000L});
    public static final BitSet FOLLOW_23_in_ruleClass1428 = new BitSet(new long[]{0x0000000003010030L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleClass1449 = new BitSet(new long[]{0x0000000003010030L});
    public static final BitSet FOLLOW_24_in_ruleClass1465 = new BitSet(new long[]{0x0000000002010030L});
    public static final BitSet FOLLOW_ruleAbstractAssociation_in_ruleClass1486 = new BitSet(new long[]{0x0000000002010030L});
    public static final BitSet FOLLOW_25_in_ruleClass1502 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleClass1523 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_16_in_ruleClass1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration1574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEnumeration1630 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration1647 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumeration1664 = new BitSet(new long[]{0x0000080000000030L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleEnumeration1685 = new BitSet(new long[]{0x0000080000000030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleEnumeration1708 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_20_in_ruleEnumeration1721 = new BitSet(new long[]{0x0000080000000030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleEnumeration1742 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_16_in_ruleEnumeration1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractSuperClass_in_entryRuleAbstractSuperClass1793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractSuperClass1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalSuperClass_in_ruleAbstractSuperClass1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalSuperClass_in_ruleAbstractSuperClass1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalSuperClass_in_entryRuleLocalSuperClass1912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalSuperClass1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleLocalSuperClass1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalSuperClass_in_entryRuleExternalSuperClass2015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalSuperClass2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleExternalSuperClass2071 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleExternalSuperClass2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractAssociation_in_entryRuleAbstractAssociation2132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractAssociation2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalClassAssociation_in_ruleAbstractAssociation2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalClassAssociation_in_ruleAbstractAssociation2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalClassAssociation_in_entryRuleLocalClassAssociation2251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalClassAssociation2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleLocalClassAssociation2316 = new BitSet(new long[]{0x0006000008000000L});
    public static final BitSet FOLLOW_27_in_ruleLocalClassAssociation2329 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleLocalClassAssociation2350 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLocalClassAssociation2362 = new BitSet(new long[]{0x0006000008000000L});
    public static final BitSet FOLLOW_ruleAssociation_Types_in_ruleLocalClassAssociation2385 = new BitSet(new long[]{0x0078000000000000L});
    public static final BitSet FOLLOW_ruleCardinalities_in_ruleLocalClassAssociation2406 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleLocalClassAssociation2429 = new BitSet(new long[]{0x00000807F0000002L});
    public static final BitSet FOLLOW_28_in_ruleLocalClassAssociation2487 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleLocalClassAssociation2508 = new BitSet(new long[]{0x00000807F0000002L});
    public static final BitSet FOLLOW_29_in_ruleLocalClassAssociation2576 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleLocalClassAssociation2597 = new BitSet(new long[]{0x00000807F0000002L});
    public static final BitSet FOLLOW_30_in_ruleLocalClassAssociation2665 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleLocalClassAssociation2686 = new BitSet(new long[]{0x00000807F0000002L});
    public static final BitSet FOLLOW_31_in_ruleLocalClassAssociation2754 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleLocalClassAssociation2775 = new BitSet(new long[]{0x00000807F0000002L});
    public static final BitSet FOLLOW_32_in_ruleLocalClassAssociation2843 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleLocalClassAssociation2864 = new BitSet(new long[]{0x00000807F0000002L});
    public static final BitSet FOLLOW_33_in_ruleLocalClassAssociation2932 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleLocalClassAssociation2953 = new BitSet(new long[]{0x00000807F0000002L});
    public static final BitSet FOLLOW_34_in_ruleLocalClassAssociation3021 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleLocalClassAssociation3042 = new BitSet(new long[]{0x00000807F0000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleLocalClassAssociation3104 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleExternalClassAssociation_in_entryRuleExternalClassAssociation3141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalClassAssociation3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleExternalClassAssociation3206 = new BitSet(new long[]{0x0006000008000000L});
    public static final BitSet FOLLOW_27_in_ruleExternalClassAssociation3219 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleExternalClassAssociation3240 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExternalClassAssociation3252 = new BitSet(new long[]{0x0006000008000000L});
    public static final BitSet FOLLOW_ruleAssociation_Types_in_ruleExternalClassAssociation3275 = new BitSet(new long[]{0x0078000000000000L});
    public static final BitSet FOLLOW_ruleCardinalities_in_ruleExternalClassAssociation3296 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleExternalClassAssociation3308 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleExternalClassAssociation3331 = new BitSet(new long[]{0x00000807F0000002L});
    public static final BitSet FOLLOW_28_in_ruleExternalClassAssociation3389 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleExternalClassAssociation3410 = new BitSet(new long[]{0x00000807F0000002L});
    public static final BitSet FOLLOW_29_in_ruleExternalClassAssociation3478 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleExternalClassAssociation3499 = new BitSet(new long[]{0x00000807F0000002L});
    public static final BitSet FOLLOW_30_in_ruleExternalClassAssociation3567 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleExternalClassAssociation3588 = new BitSet(new long[]{0x00000807F0000002L});
    public static final BitSet FOLLOW_31_in_ruleExternalClassAssociation3656 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleExternalClassAssociation3677 = new BitSet(new long[]{0x00000807F0000002L});
    public static final BitSet FOLLOW_32_in_ruleExternalClassAssociation3745 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleExternalClassAssociation3766 = new BitSet(new long[]{0x00000807F0000002L});
    public static final BitSet FOLLOW_33_in_ruleExternalClassAssociation3834 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleExternalClassAssociation3855 = new BitSet(new long[]{0x00000807F0000002L});
    public static final BitSet FOLLOW_34_in_ruleExternalClassAssociation3923 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleExternalClassAssociation3944 = new BitSet(new long[]{0x00000807F0000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleExternalClassAssociation4006 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleAbstractAttributeType_in_entryRuleAbstractAttributeType4043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractAttributeType4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalAttributeType_in_ruleAbstractAttributeType4100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalAttributeType_in_ruleAbstractAttributeType4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalAttributeType_in_entryRuleLocalAttributeType4162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalAttributeType4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleLocalAttributeType4218 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleLocalAttributeType4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalAttributeType_in_entryRuleExternalAttributeType4277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalAttributeType4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleExternalAttributeType4333 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleExternalAttributeType4356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute4392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleAttribute4457 = new BitSet(new long[]{0x0000001808000000L});
    public static final BitSet FOLLOW_27_in_ruleAttribute4470 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleAttribute4491 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAttribute4503 = new BitSet(new long[]{0x0000001808000000L});
    public static final BitSet FOLLOW_ruleAbstractAttributeType_in_ruleAttribute4526 = new BitSet(new long[]{0x00780867F0000002L});
    public static final BitSet FOLLOW_ruleCardinalities_in_ruleAttribute4547 = new BitSet(new long[]{0x00000867F0000002L});
    public static final BitSet FOLLOW_37_in_ruleAttribute4606 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleAttribute4627 = new BitSet(new long[]{0x00000867F0000002L});
    public static final BitSet FOLLOW_28_in_ruleAttribute4695 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleAttribute4716 = new BitSet(new long[]{0x00000867F0000002L});
    public static final BitSet FOLLOW_29_in_ruleAttribute4784 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleAttribute4805 = new BitSet(new long[]{0x00000867F0000002L});
    public static final BitSet FOLLOW_30_in_ruleAttribute4873 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleAttribute4894 = new BitSet(new long[]{0x00000867F0000002L});
    public static final BitSet FOLLOW_31_in_ruleAttribute4962 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleAttribute4983 = new BitSet(new long[]{0x00000867F0000002L});
    public static final BitSet FOLLOW_32_in_ruleAttribute5051 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleAttribute5072 = new BitSet(new long[]{0x00000867F0000002L});
    public static final BitSet FOLLOW_33_in_ruleAttribute5140 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleAttribute5161 = new BitSet(new long[]{0x00000867F0000002L});
    public static final BitSet FOLLOW_34_in_ruleAttribute5229 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleAttribute5250 = new BitSet(new long[]{0x00000867F0000002L});
    public static final BitSet FOLLOW_38_in_ruleAttribute5304 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleAttribute5316 = new BitSet(new long[]{0x0000090000000030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAttribute5338 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_20_in_ruleAttribute5351 = new BitSet(new long[]{0x0000080000000030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAttribute5372 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_40_in_ruleAttribute5388 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAttribute5411 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue5448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleValue5514 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleValue5526 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleValue5549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation5585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation5595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleOperation5650 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleOperation5662 = new BitSet(new long[]{0x0000010000000820L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperation5684 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_20_in_ruleOperation5697 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperation5718 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_40_in_ruleOperation5734 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleOperation5747 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_ruleAbstractType_in_ruleOperation5768 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleOperation5791 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter5828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter5838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractType_in_ruleParameter5893 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleParameter5914 = new BitSet(new long[]{0x0000080000000032L});
    public static final BitSet FOLLOW_ruleEString_in_ruleParameter5935 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleParameter5957 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleAbstractType_in_entryRuleAbstractType5994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractType6004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalType_in_ruleAbstractType6051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalType_in_ruleAbstractType6078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalType_in_entryRuleExternalType6113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalType6123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleExternalType6169 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleExternalType6192 = new BitSet(new long[]{0x0078000000000000L});
    public static final BitSet FOLLOW_ruleCardinalities_in_ruleExternalType6213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalType_in_entryRuleLocalType6249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalType6259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleLocalType6316 = new BitSet(new long[]{0x0078000000000000L});
    public static final BitSet FOLLOW_ruleCardinalities_in_ruleLocalType6337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation6375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation6385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAnnotation6431 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation6452 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleAnnotation6465 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleDetail_in_ruleAnnotation6486 = new BitSet(new long[]{0x0000100000010000L});
    public static final BitSet FOLLOW_16_in_ruleAnnotation6499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetail_in_entryRuleDetail6537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDetail6547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDetail6593 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleDetail6614 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleDetail6627 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleDetail6648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString6687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString6698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString6738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString6764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN6810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN6821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN6861 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleFQN6880 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN6901 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean6950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean6961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleEBoolean6999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleEBoolean7018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleAssociation_Types7074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAssociation_Types7091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleCardinalities7136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleCardinalities7153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleCardinalities7170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleCardinalities7187 = new BitSet(new long[]{0x0000000000000002L});

}

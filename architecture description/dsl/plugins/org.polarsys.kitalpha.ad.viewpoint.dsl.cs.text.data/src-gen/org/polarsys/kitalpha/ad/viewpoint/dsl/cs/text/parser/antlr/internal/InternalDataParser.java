/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:68:1: entryRuleDataSpec returns [EObject current=null] : iv_ruleDataSpec= ruleDataSpec EOF ;
    public final EObject entryRuleDataSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSpec = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:69:2: (iv_ruleDataSpec= ruleDataSpec EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:70:2: iv_ruleDataSpec= ruleDataSpec EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:77:1: ruleDataSpec returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_data_2_0= ruleData ) ) ) ;
    public final EObject ruleDataSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_data_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:80:28: ( ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_data_2_0= ruleData ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:81:1: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_data_2_0= ruleData ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:81:1: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_data_2_0= ruleData ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:81:2: () ( (lv_imports_1_0= ruleImport ) )* ( (lv_data_2_0= ruleData ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:81:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:82:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDataSpecAccess().getDataSpecAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:87:2: ( (lv_imports_1_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:88:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:88:1: (lv_imports_1_0= ruleImport )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:89:3: lv_imports_1_0= ruleImport
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:105:3: ( (lv_data_2_0= ruleData ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:106:1: (lv_data_2_0= ruleData )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:106:1: (lv_data_2_0= ruleData )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:107:3: lv_data_2_0= ruleData
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:131:1: entryRuleAbstractImport returns [EObject current=null] : iv_ruleAbstractImport= ruleAbstractImport EOF ;
    public final EObject entryRuleAbstractImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractImport = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:132:2: (iv_ruleAbstractImport= ruleAbstractImport EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:133:2: iv_ruleAbstractImport= ruleAbstractImport EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:140:1: ruleAbstractImport returns [EObject current=null] : (this_ImportNamespace_0= ruleImportNamespace | this_ImportURI_1= ruleImportURI ) ;
    public final EObject ruleAbstractImport() throws RecognitionException {
        EObject current = null;

        EObject this_ImportNamespace_0 = null;

        EObject this_ImportURI_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:143:28: ( (this_ImportNamespace_0= ruleImportNamespace | this_ImportURI_1= ruleImportURI ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:144:1: (this_ImportNamespace_0= ruleImportNamespace | this_ImportURI_1= ruleImportURI )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:144:1: (this_ImportNamespace_0= ruleImportNamespace | this_ImportURI_1= ruleImportURI )
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:145:5: this_ImportNamespace_0= ruleImportNamespace
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:155:5: this_ImportURI_1= ruleImportURI
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:171:1: entryRuleImportNamespace returns [EObject current=null] : iv_ruleImportNamespace= ruleImportNamespace EOF ;
    public final EObject entryRuleImportNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportNamespace = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:172:2: (iv_ruleImportNamespace= ruleImportNamespace EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:173:2: iv_ruleImportNamespace= ruleImportNamespace EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:180:1: ruleImportNamespace returns [EObject current=null] : ( (lv_importedNamespace_0_0= ruleFQN ) ) ;
    public final EObject ruleImportNamespace() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_importedNamespace_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:183:28: ( ( (lv_importedNamespace_0_0= ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:184:1: ( (lv_importedNamespace_0_0= ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:184:1: ( (lv_importedNamespace_0_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:185:1: (lv_importedNamespace_0_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:185:1: (lv_importedNamespace_0_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:186:3: lv_importedNamespace_0_0= ruleFQN
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:210:1: entryRuleImportURI returns [EObject current=null] : iv_ruleImportURI= ruleImportURI EOF ;
    public final EObject entryRuleImportURI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportURI = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:211:2: (iv_ruleImportURI= ruleImportURI EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:212:2: iv_ruleImportURI= ruleImportURI EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:219:1: ruleImportURI returns [EObject current=null] : (otherlv_0= 'external' ( (lv_importURI_1_0= ruleEString ) ) ) ;
    public final EObject ruleImportURI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importURI_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:222:28: ( (otherlv_0= 'external' ( (lv_importURI_1_0= ruleEString ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:223:1: (otherlv_0= 'external' ( (lv_importURI_1_0= ruleEString ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:223:1: (otherlv_0= 'external' ( (lv_importURI_1_0= ruleEString ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:223:3: otherlv_0= 'external' ( (lv_importURI_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImportURI454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportURIAccess().getExternalKeyword_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:227:1: ( (lv_importURI_1_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:228:1: (lv_importURI_1_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:228:1: (lv_importURI_1_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:229:3: lv_importURI_1_0= ruleEString
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:253:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:254:2: (iv_ruleImport= ruleImport EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:255:2: iv_ruleImport= ruleImport EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:262:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' this_AbstractImport_1= ruleAbstractImport ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_AbstractImport_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:265:28: ( (otherlv_0= 'import' this_AbstractImport_1= ruleAbstractImport ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:266:1: (otherlv_0= 'import' this_AbstractImport_1= ruleAbstractImport )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:266:1: (otherlv_0= 'import' this_AbstractImport_1= ruleAbstractImport )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:266:3: otherlv_0= 'import' this_AbstractImport_1= ruleAbstractImport
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:287:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:288:2: (iv_ruleData= ruleData EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:289:2: iv_ruleData= ruleData EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:296:1: ruleData returns [EObject current=null] : ( () otherlv_1= 'Data' ( (lv_name_2_0= ruleFQN ) )? otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:299:28: ( ( () otherlv_1= 'Data' ( (lv_name_2_0= ruleFQN ) )? otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:300:1: ( () otherlv_1= 'Data' ( (lv_name_2_0= ruleFQN ) )? otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) ) ) otherlv_10= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:300:1: ( () otherlv_1= 'Data' ( (lv_name_2_0= ruleFQN ) )? otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) ) ) otherlv_10= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:300:2: () otherlv_1= 'Data' ( (lv_name_2_0= ruleFQN ) )? otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) ) ) otherlv_10= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:300:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:301:5: 
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:310:1: ( (lv_name_2_0= ruleFQN ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:311:1: (lv_name_2_0= ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:311:1: (lv_name_2_0= ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:312:3: lv_name_2_0= ruleFQN
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:332:1: ( (lv_owned_annotations_4_0= ruleAnnotation ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==43) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:333:1: (lv_owned_annotations_4_0= ruleAnnotation )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:333:1: (lv_owned_annotations_4_0= ruleAnnotation )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:334:3: lv_owned_annotations_4_0= ruleAnnotation
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:350:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:352:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:352:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:353:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getDataAccess().getUnorderedGroup_5());
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:356:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:357:3: ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )*
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:357:3: ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )*
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:359:4: ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:359:4: ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:360:5: {...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleData", "getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:360:101: ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:361:6: ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getDataAccess().getUnorderedGroup_5(), 0);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:364:6: ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:364:7: {...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleData", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:364:16: (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:364:18: otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleData785); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getDataAccess().getDescriptionKeyword_5_0_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:368:1: ( (lv_description_7_0= ruleEString ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:369:1: (lv_description_7_0= ruleEString )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:369:1: (lv_description_7_0= ruleEString )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:370:3: lv_description_7_0= ruleEString
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:393:4: ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:393:4: ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:394:5: {...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleData", "getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:394:101: ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:395:6: ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getDataAccess().getUnorderedGroup_5(), 1);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:398:6: ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+
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
            	    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:398:7: {...}? => ( (lv_VP_Classes_8_0= ruleClass ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleData", "true");
            	    	    }
            	    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:398:16: ( (lv_VP_Classes_8_0= ruleClass ) )
            	    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:399:1: (lv_VP_Classes_8_0= ruleClass )
            	    	    {
            	    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:399:1: (lv_VP_Classes_8_0= ruleClass )
            	    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:400:3: lv_VP_Classes_8_0= ruleClass
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:423:4: ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:423:4: ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:424:5: {...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleData", "getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:424:101: ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:425:6: ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getDataAccess().getUnorderedGroup_5(), 2);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:428:6: ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+
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
            	    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:428:7: {...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleData", "true");
            	    	    }
            	    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:428:16: ( (lv_VP_Enumerations_9_0= ruleEnumeration ) )
            	    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:429:1: (lv_VP_Enumerations_9_0= ruleEnumeration )
            	    	    {
            	    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:429:1: (lv_VP_Enumerations_9_0= ruleEnumeration )
            	    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:430:3: lv_VP_Enumerations_9_0= ruleEnumeration
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:472:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:473:2: (iv_ruleClass= ruleClass EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:474:2: iv_ruleClass= ruleClass EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:481:1: ruleClass returns [EObject current=null] : ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'icon:' ( (lv_icon_7_0= RULE_STRING ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'superClass' ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) ) (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )* )? (otherlv_16= 'abstract:' ( (lv_abstract_17_0= ruleEBoolean ) ) )? ( (lv_owned_annotations_18_0= ruleAnnotation ) )* (otherlv_19= 'Attributes:' ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )* )? (otherlv_21= 'Associations:' ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )* )? (otherlv_23= 'Operations:' ( (lv_VP_Class_Operations_24_0= ruleOperation ) )* )? otherlv_25= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:484:28: ( ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'icon:' ( (lv_icon_7_0= RULE_STRING ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'superClass' ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) ) (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )* )? (otherlv_16= 'abstract:' ( (lv_abstract_17_0= ruleEBoolean ) ) )? ( (lv_owned_annotations_18_0= ruleAnnotation ) )* (otherlv_19= 'Attributes:' ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )* )? (otherlv_21= 'Associations:' ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )* )? (otherlv_23= 'Operations:' ( (lv_VP_Class_Operations_24_0= ruleOperation ) )* )? otherlv_25= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:485:1: ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'icon:' ( (lv_icon_7_0= RULE_STRING ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'superClass' ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) ) (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )* )? (otherlv_16= 'abstract:' ( (lv_abstract_17_0= ruleEBoolean ) ) )? ( (lv_owned_annotations_18_0= ruleAnnotation ) )* (otherlv_19= 'Attributes:' ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )* )? (otherlv_21= 'Associations:' ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )* )? (otherlv_23= 'Operations:' ( (lv_VP_Class_Operations_24_0= ruleOperation ) )* )? otherlv_25= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:485:1: ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'icon:' ( (lv_icon_7_0= RULE_STRING ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'superClass' ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) ) (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )* )? (otherlv_16= 'abstract:' ( (lv_abstract_17_0= ruleEBoolean ) ) )? ( (lv_owned_annotations_18_0= ruleAnnotation ) )* (otherlv_19= 'Attributes:' ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )* )? (otherlv_21= 'Associations:' ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )* )? (otherlv_23= 'Operations:' ( (lv_VP_Class_Operations_24_0= ruleOperation ) )* )? otherlv_25= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:485:2: () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'icon:' ( (lv_icon_7_0= RULE_STRING ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'superClass' ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) ) (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )* )? (otherlv_16= 'abstract:' ( (lv_abstract_17_0= ruleEBoolean ) ) )? ( (lv_owned_annotations_18_0= ruleAnnotation ) )* (otherlv_19= 'Attributes:' ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )* )? (otherlv_21= 'Associations:' ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )* )? (otherlv_23= 'Operations:' ( (lv_VP_Class_Operations_24_0= ruleOperation ) )* )? otherlv_25= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:485:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:486:5: 
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:495:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:496:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:496:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:497:3: lv_name_2_0= ruleEString
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:517:1: (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:517:3: otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleClass1149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getDescriptionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:521:1: ( (lv_description_5_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:522:1: (lv_description_5_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:522:1: (lv_description_5_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:523:3: lv_description_5_0= ruleEString
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:539:4: (otherlv_6= 'icon:' ( (lv_icon_7_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:539:6: otherlv_6= 'icon:' ( (lv_icon_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleClass1185); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getClassAccess().getIconKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:543:1: ( (lv_icon_7_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:544:1: (lv_icon_7_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:544:1: (lv_icon_7_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:545:3: lv_icon_7_0= RULE_STRING
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:561:4: (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:561:6: otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleClass1222); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getClassAccess().getExtendsKeyword_6_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:565:1: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:566:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:566:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:567:3: ruleFQN
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

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:580:2: (otherlv_10= ',' ( ( ruleFQN ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==20) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:580:4: otherlv_10= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleClass1258); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getClassAccess().getCommaKeyword_6_2_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:584:1: ( ( ruleFQN ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:585:1: ( ruleFQN )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:585:1: ( ruleFQN )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:586:3: ruleFQN
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:599:6: (otherlv_12= 'superClass' ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) ) (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:599:8: otherlv_12= 'superClass' ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) ) (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )*
                    {
                    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleClass1298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getClassAccess().getSuperClassKeyword_7_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:603:1: ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:604:1: (lv_Inheritences_13_0= ruleAbstractSuperClass )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:604:1: (lv_Inheritences_13_0= ruleAbstractSuperClass )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:605:3: lv_Inheritences_13_0= ruleAbstractSuperClass
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

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:621:2: (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==20) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:621:4: otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) )
                    	    {
                    	    otherlv_14=(Token)match(input,20,FOLLOW_20_in_ruleClass1332); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_14, grammarAccess.getClassAccess().getCommaKeyword_7_2_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:625:1: ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:626:1: (lv_Inheritences_15_0= ruleAbstractSuperClass )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:626:1: (lv_Inheritences_15_0= ruleAbstractSuperClass )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:627:3: lv_Inheritences_15_0= ruleAbstractSuperClass
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:643:6: (otherlv_16= 'abstract:' ( (lv_abstract_17_0= ruleEBoolean ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:643:8: otherlv_16= 'abstract:' ( (lv_abstract_17_0= ruleEBoolean ) )
                    {
                    otherlv_16=(Token)match(input,22,FOLLOW_22_in_ruleClass1370); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getClassAccess().getAbstractKeyword_8_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:647:1: ( (lv_abstract_17_0= ruleEBoolean ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:648:1: (lv_abstract_17_0= ruleEBoolean )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:648:1: (lv_abstract_17_0= ruleEBoolean )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:649:3: lv_abstract_17_0= ruleEBoolean
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:665:4: ( (lv_owned_annotations_18_0= ruleAnnotation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==43) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:666:1: (lv_owned_annotations_18_0= ruleAnnotation )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:666:1: (lv_owned_annotations_18_0= ruleAnnotation )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:667:3: lv_owned_annotations_18_0= ruleAnnotation
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:683:3: (otherlv_19= 'Attributes:' ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:683:5: otherlv_19= 'Attributes:' ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )*
                    {
                    otherlv_19=(Token)match(input,23,FOLLOW_23_in_ruleClass1428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getClassAccess().getAttributesKeyword_10_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:687:1: ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:688:1: (lv_VP_Class_Attributes_20_0= ruleAttribute )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:688:1: (lv_VP_Class_Attributes_20_0= ruleAttribute )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:689:3: lv_VP_Class_Attributes_20_0= ruleAttribute
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:705:5: (otherlv_21= 'Associations:' ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:705:7: otherlv_21= 'Associations:' ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )*
                    {
                    otherlv_21=(Token)match(input,24,FOLLOW_24_in_ruleClass1465); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getClassAccess().getAssociationsKeyword_11_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:709:1: ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:710:1: (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:710:1: (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:711:3: lv_VP_Classes_Associations_22_0= ruleAbstractAssociation
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:727:5: (otherlv_23= 'Operations:' ( (lv_VP_Class_Operations_24_0= ruleOperation ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:727:7: otherlv_23= 'Operations:' ( (lv_VP_Class_Operations_24_0= ruleOperation ) )*
                    {
                    otherlv_23=(Token)match(input,25,FOLLOW_25_in_ruleClass1502); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getClassAccess().getOperationsKeyword_12_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:731:1: ( (lv_VP_Class_Operations_24_0= ruleOperation ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:732:1: (lv_VP_Class_Operations_24_0= ruleOperation )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:732:1: (lv_VP_Class_Operations_24_0= ruleOperation )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:733:3: lv_VP_Class_Operations_24_0= ruleOperation
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:761:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:762:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:763:2: iv_ruleEnumeration= ruleEnumeration EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:770:1: ruleEnumeration returns [EObject current=null] : ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( (lv_ownedValues_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )* ) otherlv_8= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:773:28: ( ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( (lv_ownedValues_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )* ) otherlv_8= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:774:1: ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( (lv_ownedValues_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )* ) otherlv_8= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:774:1: ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( (lv_ownedValues_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )* ) otherlv_8= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:774:2: () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( (lv_ownedValues_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )* ) otherlv_8= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:774:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:775:5: 
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:784:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:785:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:785:1: (lv_name_2_0= RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:786:3: lv_name_2_0= RULE_ID
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:806:1: ( (lv_owned_annotations_4_0= ruleAnnotation ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==43) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:807:1: (lv_owned_annotations_4_0= ruleAnnotation )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:807:1: (lv_owned_annotations_4_0= ruleAnnotation )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:808:3: lv_owned_annotations_4_0= ruleAnnotation
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:824:3: ( ( (lv_ownedValues_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:824:4: ( (lv_ownedValues_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )*
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:824:4: ( (lv_ownedValues_5_0= ruleValue ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:825:1: (lv_ownedValues_5_0= ruleValue )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:825:1: (lv_ownedValues_5_0= ruleValue )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:826:3: lv_ownedValues_5_0= ruleValue
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:842:2: (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==20) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:842:4: otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) )
            	    {
            	    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleEnumeration1721); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getCommaKeyword_5_1_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:846:1: ( (lv_ownedValues_7_0= ruleValue ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:847:1: (lv_ownedValues_7_0= ruleValue )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:847:1: (lv_ownedValues_7_0= ruleValue )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:848:3: lv_ownedValues_7_0= ruleValue
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:876:1: entryRuleAbstractSuperClass returns [EObject current=null] : iv_ruleAbstractSuperClass= ruleAbstractSuperClass EOF ;
    public final EObject entryRuleAbstractSuperClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSuperClass = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:877:2: (iv_ruleAbstractSuperClass= ruleAbstractSuperClass EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:878:2: iv_ruleAbstractSuperClass= ruleAbstractSuperClass EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:885:1: ruleAbstractSuperClass returns [EObject current=null] : (this_LocalSuperClass_0= ruleLocalSuperClass | this_ExternalSuperClass_1= ruleExternalSuperClass ) ;
    public final EObject ruleAbstractSuperClass() throws RecognitionException {
        EObject current = null;

        EObject this_LocalSuperClass_0 = null;

        EObject this_ExternalSuperClass_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:888:28: ( (this_LocalSuperClass_0= ruleLocalSuperClass | this_ExternalSuperClass_1= ruleExternalSuperClass ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:889:1: (this_LocalSuperClass_0= ruleLocalSuperClass | this_ExternalSuperClass_1= ruleExternalSuperClass )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:889:1: (this_LocalSuperClass_0= ruleLocalSuperClass | this_ExternalSuperClass_1= ruleExternalSuperClass )
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:890:5: this_LocalSuperClass_0= ruleLocalSuperClass
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:900:5: this_ExternalSuperClass_1= ruleExternalSuperClass
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:916:1: entryRuleLocalSuperClass returns [EObject current=null] : iv_ruleLocalSuperClass= ruleLocalSuperClass EOF ;
    public final EObject entryRuleLocalSuperClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalSuperClass = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:917:2: (iv_ruleLocalSuperClass= ruleLocalSuperClass EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:918:2: iv_ruleLocalSuperClass= ruleLocalSuperClass EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:925:1: ruleLocalSuperClass returns [EObject current=null] : ( () ( ( ruleFQN ) ) ) ;
    public final EObject ruleLocalSuperClass() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:928:28: ( ( () ( ( ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:929:1: ( () ( ( ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:929:1: ( () ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:929:2: () ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:929:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:930:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalSuperClassAccess().getLocalSuperClassAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:935:2: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:936:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:936:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:937:3: ruleFQN
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:958:1: entryRuleExternalSuperClass returns [EObject current=null] : iv_ruleExternalSuperClass= ruleExternalSuperClass EOF ;
    public final EObject entryRuleExternalSuperClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalSuperClass = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:959:2: (iv_ruleExternalSuperClass= ruleExternalSuperClass EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:960:2: iv_ruleExternalSuperClass= ruleExternalSuperClass EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:967:1: ruleExternalSuperClass returns [EObject current=null] : ( () otherlv_1= 'external' ( ( ruleFQN ) ) ) ;
    public final EObject ruleExternalSuperClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:970:28: ( ( () otherlv_1= 'external' ( ( ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:971:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:971:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:971:2: () otherlv_1= 'external' ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:971:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:972:5: 
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:981:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:982:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:982:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:983:3: ruleFQN
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1006:1: entryRuleAbstractAssociation returns [EObject current=null] : iv_ruleAbstractAssociation= ruleAbstractAssociation EOF ;
    public final EObject entryRuleAbstractAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAssociation = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1007:2: (iv_ruleAbstractAssociation= ruleAbstractAssociation EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1008:2: iv_ruleAbstractAssociation= ruleAbstractAssociation EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1015:1: ruleAbstractAssociation returns [EObject current=null] : (this_LocalClassAssociation_0= ruleLocalClassAssociation | this_ExternalClassAssociation_1= ruleExternalClassAssociation ) ;
    public final EObject ruleAbstractAssociation() throws RecognitionException {
        EObject current = null;

        EObject this_LocalClassAssociation_0 = null;

        EObject this_ExternalClassAssociation_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1018:28: ( (this_LocalClassAssociation_0= ruleLocalClassAssociation | this_ExternalClassAssociation_1= ruleExternalClassAssociation ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1019:1: (this_LocalClassAssociation_0= ruleLocalClassAssociation | this_ExternalClassAssociation_1= ruleExternalClassAssociation )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1019:1: (this_LocalClassAssociation_0= ruleLocalClassAssociation | this_ExternalClassAssociation_1= ruleExternalClassAssociation )
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1020:5: this_LocalClassAssociation_0= ruleLocalClassAssociation
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1030:5: this_ExternalClassAssociation_1= ruleExternalClassAssociation
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1046:1: entryRuleLocalClassAssociation returns [EObject current=null] : iv_ruleLocalClassAssociation= ruleLocalClassAssociation EOF ;
    public final EObject entryRuleLocalClassAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalClassAssociation = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1047:2: (iv_ruleLocalClassAssociation= ruleLocalClassAssociation EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1048:2: iv_ruleLocalClassAssociation= ruleLocalClassAssociation EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1055:1: ruleLocalClassAssociation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_23_0= ruleAnnotation ) )* ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1058:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_23_0= ruleAnnotation ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1059:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_23_0= ruleAnnotation ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1059:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_23_0= ruleAnnotation ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1059:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_23_0= ruleAnnotation ) )*
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1059:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1060:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalClassAssociationAccess().getLocalClassAssociationAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1065:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1066:1: (lv_name_1_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1066:1: (lv_name_1_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1067:3: lv_name_1_0= ruleEString
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1083:2: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1083:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ','
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleLocalClassAssociation2329); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLocalClassAssociationAccess().getDescriptionKeyword_2_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1087:1: ( (lv_description_3_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1088:1: (lv_description_3_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1088:1: (lv_description_3_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1089:3: lv_description_3_0= ruleEString
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1109:3: ( (lv_type_5_0= ruleAssociation_Types ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1110:1: (lv_type_5_0= ruleAssociation_Types )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1110:1: (lv_type_5_0= ruleAssociation_Types )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1111:3: lv_type_5_0= ruleAssociation_Types
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1127:2: ( (lv_cardinality_6_0= ruleCardinalities ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1128:1: (lv_cardinality_6_0= ruleCardinalities )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1128:1: (lv_cardinality_6_0= ruleCardinalities )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1129:3: lv_cardinality_6_0= ruleCardinalities
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1145:2: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1146:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1146:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1147:3: ruleFQN
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1160:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )* ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1162:1: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1162:1: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1163:2: ( ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1166:2: ( ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1167:3: ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )*
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1167:3: ( ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) ) )*
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1169:4: ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1169:4: ({...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1170:5: {...}? => ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 0)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1170:118: ( ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1171:6: ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 0);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1174:6: ({...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1174:7: {...}? => (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1174:16: (otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1174:18: otherlv_9= 'changeable:' ( (lv_changeable_10_0= ruleEBoolean ) )
            	    {
            	    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleLocalClassAssociation2487); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getLocalClassAssociationAccess().getChangeableKeyword_6_0_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1178:1: ( (lv_changeable_10_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1179:1: (lv_changeable_10_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1179:1: (lv_changeable_10_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1180:3: lv_changeable_10_0= ruleEBoolean
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1203:4: ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1203:4: ({...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1204:5: {...}? => ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 1)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1204:118: ( ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1205:6: ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 1);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1208:6: ({...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1208:7: {...}? => (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1208:16: (otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1208:18: otherlv_11= 'derived:' ( (lv_derived_12_0= ruleEBoolean ) )
            	    {
            	    otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleLocalClassAssociation2576); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getLocalClassAssociationAccess().getDerivedKeyword_6_1_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1212:1: ( (lv_derived_12_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1213:1: (lv_derived_12_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1213:1: (lv_derived_12_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1214:3: lv_derived_12_0= ruleEBoolean
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1237:4: ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1237:4: ({...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1238:5: {...}? => ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 2)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1238:118: ( ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1239:6: ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 2);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1242:6: ({...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1242:7: {...}? => (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1242:16: (otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1242:18: otherlv_13= 'ordered:' ( (lv_ordered_14_0= ruleEBoolean ) )
            	    {
            	    otherlv_13=(Token)match(input,30,FOLLOW_30_in_ruleLocalClassAssociation2665); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getLocalClassAssociationAccess().getOrderedKeyword_6_2_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1246:1: ( (lv_ordered_14_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1247:1: (lv_ordered_14_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1247:1: (lv_ordered_14_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1248:3: lv_ordered_14_0= ruleEBoolean
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1271:4: ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1271:4: ({...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1272:5: {...}? => ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 3)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1272:118: ( ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1273:6: ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 3);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1276:6: ({...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1276:7: {...}? => (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1276:16: (otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1276:18: otherlv_15= 'transient:' ( (lv_transient_16_0= ruleEBoolean ) )
            	    {
            	    otherlv_15=(Token)match(input,31,FOLLOW_31_in_ruleLocalClassAssociation2754); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getLocalClassAssociationAccess().getTransientKeyword_6_3_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1280:1: ( (lv_transient_16_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1281:1: (lv_transient_16_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1281:1: (lv_transient_16_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1282:3: lv_transient_16_0= ruleEBoolean
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1305:4: ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1305:4: ({...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1306:5: {...}? => ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 4)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1306:118: ( ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1307:6: ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 4);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1310:6: ({...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1310:7: {...}? => (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1310:16: (otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1310:18: otherlv_17= 'unique:' ( (lv_unique_18_0= ruleEBoolean ) )
            	    {
            	    otherlv_17=(Token)match(input,32,FOLLOW_32_in_ruleLocalClassAssociation2843); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_17, grammarAccess.getLocalClassAssociationAccess().getUniqueKeyword_6_4_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1314:1: ( (lv_unique_18_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1315:1: (lv_unique_18_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1315:1: (lv_unique_18_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1316:3: lv_unique_18_0= ruleEBoolean
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1339:4: ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1339:4: ({...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1340:5: {...}? => ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 5)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1340:118: ( ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1341:6: ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 5);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1344:6: ({...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1344:7: {...}? => (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1344:16: (otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1344:18: otherlv_19= 'unsettable:' ( (lv_unsettable_20_0= ruleEBoolean ) )
            	    {
            	    otherlv_19=(Token)match(input,33,FOLLOW_33_in_ruleLocalClassAssociation2932); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_19, grammarAccess.getLocalClassAssociationAccess().getUnsettableKeyword_6_5_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1348:1: ( (lv_unsettable_20_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1349:1: (lv_unsettable_20_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1349:1: (lv_unsettable_20_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1350:3: lv_unsettable_20_0= ruleEBoolean
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1373:4: ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1373:4: ({...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1374:5: {...}? => ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 6)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1374:118: ( ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1375:6: ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 6);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1378:6: ({...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1378:7: {...}? => (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1378:16: (otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1378:18: otherlv_21= 'volatile:' ( (lv_volatile_22_0= ruleEBoolean ) )
            	    {
            	    otherlv_21=(Token)match(input,34,FOLLOW_34_in_ruleLocalClassAssociation3021); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_21, grammarAccess.getLocalClassAssociationAccess().getVolatileKeyword_6_6_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1382:1: ( (lv_volatile_22_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1383:1: (lv_volatile_22_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1383:1: (lv_volatile_22_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1384:3: lv_volatile_22_0= ruleEBoolean
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1414:2: ( (lv_owned_annotations_23_0= ruleAnnotation ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==43) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1415:1: (lv_owned_annotations_23_0= ruleAnnotation )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1415:1: (lv_owned_annotations_23_0= ruleAnnotation )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1416:3: lv_owned_annotations_23_0= ruleAnnotation
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1440:1: entryRuleExternalClassAssociation returns [EObject current=null] : iv_ruleExternalClassAssociation= ruleExternalClassAssociation EOF ;
    public final EObject entryRuleExternalClassAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalClassAssociation = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1441:2: (iv_ruleExternalClassAssociation= ruleExternalClassAssociation EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1442:2: iv_ruleExternalClassAssociation= ruleExternalClassAssociation EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1449:1: ruleExternalClassAssociation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) otherlv_7= 'external' ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_24_0= ruleAnnotation ) )* ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1452:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) otherlv_7= 'external' ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_24_0= ruleAnnotation ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1453:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) otherlv_7= 'external' ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_24_0= ruleAnnotation ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1453:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) otherlv_7= 'external' ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_24_0= ruleAnnotation ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1453:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) otherlv_7= 'external' ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_24_0= ruleAnnotation ) )*
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1453:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1454:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExternalClassAssociationAccess().getExternalClassAssociationAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1459:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1460:1: (lv_name_1_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1460:1: (lv_name_1_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1461:3: lv_name_1_0= ruleEString
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1477:2: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==27) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1477:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ','
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleExternalClassAssociation3219); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExternalClassAssociationAccess().getDescriptionKeyword_2_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1481:1: ( (lv_description_3_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1482:1: (lv_description_3_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1482:1: (lv_description_3_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1483:3: lv_description_3_0= ruleEString
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1503:3: ( (lv_type_5_0= ruleAssociation_Types ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1504:1: (lv_type_5_0= ruleAssociation_Types )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1504:1: (lv_type_5_0= ruleAssociation_Types )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1505:3: lv_type_5_0= ruleAssociation_Types
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1521:2: ( (lv_cardinality_6_0= ruleCardinalities ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1522:1: (lv_cardinality_6_0= ruleCardinalities )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1522:1: (lv_cardinality_6_0= ruleCardinalities )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1523:3: lv_cardinality_6_0= ruleCardinalities
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1543:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1544:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1544:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1545:3: ruleFQN
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1558:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1560:1: ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1560:1: ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1561:2: ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7());
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1564:2: ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1565:3: ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )*
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1565:3: ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )*
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1567:4: ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1567:4: ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1568:5: {...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 0)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1568:121: ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1569:6: ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 0);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1572:6: ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1572:7: {...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1572:16: (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1572:18: otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) )
            	    {
            	    otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleExternalClassAssociation3389); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getExternalClassAssociationAccess().getChangeableKeyword_7_0_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1576:1: ( (lv_changeable_11_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1577:1: (lv_changeable_11_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1577:1: (lv_changeable_11_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1578:3: lv_changeable_11_0= ruleEBoolean
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1601:4: ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1601:4: ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1602:5: {...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 1)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1602:121: ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1603:6: ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 1);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1606:6: ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1606:7: {...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1606:16: (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1606:18: otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) )
            	    {
            	    otherlv_12=(Token)match(input,29,FOLLOW_29_in_ruleExternalClassAssociation3478); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getExternalClassAssociationAccess().getDerivedKeyword_7_1_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1610:1: ( (lv_derived_13_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1611:1: (lv_derived_13_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1611:1: (lv_derived_13_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1612:3: lv_derived_13_0= ruleEBoolean
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1635:4: ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1635:4: ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1636:5: {...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 2)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1636:121: ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1637:6: ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 2);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1640:6: ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1640:7: {...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1640:16: (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1640:18: otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) )
            	    {
            	    otherlv_14=(Token)match(input,30,FOLLOW_30_in_ruleExternalClassAssociation3567); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getExternalClassAssociationAccess().getOrderedKeyword_7_2_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1644:1: ( (lv_ordered_15_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1645:1: (lv_ordered_15_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1645:1: (lv_ordered_15_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1646:3: lv_ordered_15_0= ruleEBoolean
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1669:4: ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1669:4: ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1670:5: {...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 3)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1670:121: ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1671:6: ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 3);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1674:6: ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1674:7: {...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1674:16: (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1674:18: otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) )
            	    {
            	    otherlv_16=(Token)match(input,31,FOLLOW_31_in_ruleExternalClassAssociation3656); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getExternalClassAssociationAccess().getTransientKeyword_7_3_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1678:1: ( (lv_transient_17_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1679:1: (lv_transient_17_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1679:1: (lv_transient_17_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1680:3: lv_transient_17_0= ruleEBoolean
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1703:4: ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1703:4: ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1704:5: {...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 4)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1704:121: ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1705:6: ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 4);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1708:6: ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1708:7: {...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1708:16: (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1708:18: otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) )
            	    {
            	    otherlv_18=(Token)match(input,32,FOLLOW_32_in_ruleExternalClassAssociation3745); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_18, grammarAccess.getExternalClassAssociationAccess().getUniqueKeyword_7_4_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1712:1: ( (lv_unique_19_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1713:1: (lv_unique_19_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1713:1: (lv_unique_19_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1714:3: lv_unique_19_0= ruleEBoolean
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1737:4: ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1737:4: ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1738:5: {...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 5)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1738:121: ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1739:6: ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 5);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1742:6: ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1742:7: {...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1742:16: (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1742:18: otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) )
            	    {
            	    otherlv_20=(Token)match(input,33,FOLLOW_33_in_ruleExternalClassAssociation3834); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_20, grammarAccess.getExternalClassAssociationAccess().getUnsettableKeyword_7_5_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1746:1: ( (lv_unsettable_21_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1747:1: (lv_unsettable_21_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1747:1: (lv_unsettable_21_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1748:3: lv_unsettable_21_0= ruleEBoolean
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1771:4: ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1771:4: ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1772:5: {...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 6)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1772:121: ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1773:6: ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 6);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1776:6: ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1776:7: {...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1776:16: (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1776:18: otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) )
            	    {
            	    otherlv_22=(Token)match(input,34,FOLLOW_34_in_ruleExternalClassAssociation3923); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_22, grammarAccess.getExternalClassAssociationAccess().getVolatileKeyword_7_6_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1780:1: ( (lv_volatile_23_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1781:1: (lv_volatile_23_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1781:1: (lv_volatile_23_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1782:3: lv_volatile_23_0= ruleEBoolean
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1812:2: ( (lv_owned_annotations_24_0= ruleAnnotation ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==43) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1813:1: (lv_owned_annotations_24_0= ruleAnnotation )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1813:1: (lv_owned_annotations_24_0= ruleAnnotation )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1814:3: lv_owned_annotations_24_0= ruleAnnotation
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1838:1: entryRuleAbstractAttributeType returns [EObject current=null] : iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF ;
    public final EObject entryRuleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAttributeType = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1839:2: (iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1840:2: iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1847:1: ruleAbstractAttributeType returns [EObject current=null] : (this_LocalAttributeType_0= ruleLocalAttributeType | this_ExternalAttributeType_1= ruleExternalAttributeType ) ;
    public final EObject ruleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_LocalAttributeType_0 = null;

        EObject this_ExternalAttributeType_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1850:28: ( (this_LocalAttributeType_0= ruleLocalAttributeType | this_ExternalAttributeType_1= ruleExternalAttributeType ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1851:1: (this_LocalAttributeType_0= ruleLocalAttributeType | this_ExternalAttributeType_1= ruleExternalAttributeType )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1851:1: (this_LocalAttributeType_0= ruleLocalAttributeType | this_ExternalAttributeType_1= ruleExternalAttributeType )
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1852:5: this_LocalAttributeType_0= ruleLocalAttributeType
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1862:5: this_ExternalAttributeType_1= ruleExternalAttributeType
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1878:1: entryRuleLocalAttributeType returns [EObject current=null] : iv_ruleLocalAttributeType= ruleLocalAttributeType EOF ;
    public final EObject entryRuleLocalAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalAttributeType = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1879:2: (iv_ruleLocalAttributeType= ruleLocalAttributeType EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1880:2: iv_ruleLocalAttributeType= ruleLocalAttributeType EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1887:1: ruleLocalAttributeType returns [EObject current=null] : ( () otherlv_1= 'enum' ( ( ruleFQN ) ) ) ;
    public final EObject ruleLocalAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1890:28: ( ( () otherlv_1= 'enum' ( ( ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1891:1: ( () otherlv_1= 'enum' ( ( ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1891:1: ( () otherlv_1= 'enum' ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1891:2: () otherlv_1= 'enum' ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1891:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1892:5: 
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1901:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1902:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1902:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1903:3: ruleFQN
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1924:1: entryRuleExternalAttributeType returns [EObject current=null] : iv_ruleExternalAttributeType= ruleExternalAttributeType EOF ;
    public final EObject entryRuleExternalAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalAttributeType = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1925:2: (iv_ruleExternalAttributeType= ruleExternalAttributeType EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1926:2: iv_ruleExternalAttributeType= ruleExternalAttributeType EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1933:1: ruleExternalAttributeType returns [EObject current=null] : ( () otherlv_1= 'type' ( ( ruleFQN ) ) ) ;
    public final EObject ruleExternalAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1936:28: ( ( () otherlv_1= 'type' ( ( ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1937:1: ( () otherlv_1= 'type' ( ( ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1937:1: ( () otherlv_1= 'type' ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1937:2: () otherlv_1= 'type' ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1937:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1938:5: 
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1947:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1948:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1948:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1949:3: ruleFQN
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1970:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1971:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1972:2: iv_ruleAttribute= ruleAttribute EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1979:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_owned_type_5_0= ruleAbstractAttributeType ) ) ( (lv_cardinality_6_0= ruleCardinalities ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (otherlv_24= 'values' otherlv_25= '(' ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )? otherlv_29= ')' )? ( (lv_owned_annotations_30_0= ruleAnnotation ) )* ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1982:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_owned_type_5_0= ruleAbstractAttributeType ) ) ( (lv_cardinality_6_0= ruleCardinalities ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (otherlv_24= 'values' otherlv_25= '(' ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )? otherlv_29= ')' )? ( (lv_owned_annotations_30_0= ruleAnnotation ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1983:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_owned_type_5_0= ruleAbstractAttributeType ) ) ( (lv_cardinality_6_0= ruleCardinalities ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (otherlv_24= 'values' otherlv_25= '(' ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )? otherlv_29= ')' )? ( (lv_owned_annotations_30_0= ruleAnnotation ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1983:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_owned_type_5_0= ruleAbstractAttributeType ) ) ( (lv_cardinality_6_0= ruleCardinalities ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (otherlv_24= 'values' otherlv_25= '(' ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )? otherlv_29= ')' )? ( (lv_owned_annotations_30_0= ruleAnnotation ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1983:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_owned_type_5_0= ruleAbstractAttributeType ) ) ( (lv_cardinality_6_0= ruleCardinalities ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (otherlv_24= 'values' otherlv_25= '(' ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )? otherlv_29= ')' )? ( (lv_owned_annotations_30_0= ruleAnnotation ) )*
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1983:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1984:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAttributeAccess().getAttributeAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1989:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1990:1: (lv_name_1_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1990:1: (lv_name_1_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:1991:3: lv_name_1_0= ruleEString
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2007:2: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2007:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ','
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleAttribute4470); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getDescriptionKeyword_2_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2011:1: ( (lv_description_3_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2012:1: (lv_description_3_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2012:1: (lv_description_3_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2013:3: lv_description_3_0= ruleEString
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2033:3: ( (lv_owned_type_5_0= ruleAbstractAttributeType ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2034:1: (lv_owned_type_5_0= ruleAbstractAttributeType )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2034:1: (lv_owned_type_5_0= ruleAbstractAttributeType )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2035:3: lv_owned_type_5_0= ruleAbstractAttributeType
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2051:2: ( (lv_cardinality_6_0= ruleCardinalities ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=51 && LA34_0<=54)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2052:1: (lv_cardinality_6_0= ruleCardinalities )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2052:1: (lv_cardinality_6_0= ruleCardinalities )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2053:3: lv_cardinality_6_0= ruleCardinalities
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2069:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2071:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2071:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2072:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_5());
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2075:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2076:3: ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )*
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2076:3: ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )*
            loop35:
            do {
                int alt35=9;
                alt35 = dfa35.predict(input);
                switch (alt35) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2078:4: ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2078:4: ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2079:5: {...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2079:106: ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2080:6: ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 0);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2083:6: ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2083:7: {...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2083:16: (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2083:18: otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) )
            	    {
            	    otherlv_8=(Token)match(input,37,FOLLOW_37_in_ruleAttribute4606); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getIdKeyword_5_0_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2087:1: ( (lv_isId_9_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2088:1: (lv_isId_9_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2088:1: (lv_isId_9_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2089:3: lv_isId_9_0= ruleEBoolean
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2112:4: ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2112:4: ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2113:5: {...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2113:106: ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2114:6: ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 1);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2117:6: ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2117:7: {...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2117:16: (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2117:18: otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) )
            	    {
            	    otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleAttribute4695); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getChangeableKeyword_5_1_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2121:1: ( (lv_changeable_11_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2122:1: (lv_changeable_11_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2122:1: (lv_changeable_11_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2123:3: lv_changeable_11_0= ruleEBoolean
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2146:4: ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2146:4: ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2147:5: {...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2147:106: ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2148:6: ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 2);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2151:6: ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2151:7: {...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2151:16: (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2151:18: otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) )
            	    {
            	    otherlv_12=(Token)match(input,29,FOLLOW_29_in_ruleAttribute4784); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getDerivedKeyword_5_2_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2155:1: ( (lv_derived_13_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2156:1: (lv_derived_13_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2156:1: (lv_derived_13_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2157:3: lv_derived_13_0= ruleEBoolean
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2180:4: ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2180:4: ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2181:5: {...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2181:106: ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2182:6: ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 3);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2185:6: ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2185:7: {...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2185:16: (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2185:18: otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) )
            	    {
            	    otherlv_14=(Token)match(input,30,FOLLOW_30_in_ruleAttribute4873); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getOrderedKeyword_5_3_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2189:1: ( (lv_ordered_15_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2190:1: (lv_ordered_15_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2190:1: (lv_ordered_15_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2191:3: lv_ordered_15_0= ruleEBoolean
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2214:4: ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2214:4: ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2215:5: {...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2215:106: ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2216:6: ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 4);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2219:6: ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2219:7: {...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2219:16: (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2219:18: otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) )
            	    {
            	    otherlv_16=(Token)match(input,31,FOLLOW_31_in_ruleAttribute4962); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getAttributeAccess().getTransientKeyword_5_4_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2223:1: ( (lv_transient_17_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2224:1: (lv_transient_17_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2224:1: (lv_transient_17_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2225:3: lv_transient_17_0= ruleEBoolean
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2248:4: ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2248:4: ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2249:5: {...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 5)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2249:106: ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2250:6: ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 5);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2253:6: ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2253:7: {...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2253:16: (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2253:18: otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) )
            	    {
            	    otherlv_18=(Token)match(input,32,FOLLOW_32_in_ruleAttribute5051); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_18, grammarAccess.getAttributeAccess().getUniqueKeyword_5_5_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2257:1: ( (lv_unique_19_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2258:1: (lv_unique_19_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2258:1: (lv_unique_19_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2259:3: lv_unique_19_0= ruleEBoolean
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2282:4: ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2282:4: ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2283:5: {...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 6)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2283:106: ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2284:6: ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 6);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2287:6: ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2287:7: {...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2287:16: (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2287:18: otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) )
            	    {
            	    otherlv_20=(Token)match(input,33,FOLLOW_33_in_ruleAttribute5140); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_20, grammarAccess.getAttributeAccess().getUnsettableKeyword_5_6_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2291:1: ( (lv_unsettable_21_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2292:1: (lv_unsettable_21_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2292:1: (lv_unsettable_21_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2293:3: lv_unsettable_21_0= ruleEBoolean
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
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2316:4: ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2316:4: ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2317:5: {...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 7) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 7)");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2317:106: ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2318:6: ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 7);
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2321:6: ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2321:7: {...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2321:16: (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2321:18: otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) )
            	    {
            	    otherlv_22=(Token)match(input,34,FOLLOW_34_in_ruleAttribute5229); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_22, grammarAccess.getAttributeAccess().getVolatileKeyword_5_7_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2325:1: ( (lv_volatile_23_0= ruleEBoolean ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2326:1: (lv_volatile_23_0= ruleEBoolean )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2326:1: (lv_volatile_23_0= ruleEBoolean )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2327:3: lv_volatile_23_0= ruleEBoolean
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2357:2: (otherlv_24= 'values' otherlv_25= '(' ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )? otherlv_29= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2357:4: otherlv_24= 'values' otherlv_25= '(' ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )? otherlv_29= ')'
                    {
                    otherlv_24=(Token)match(input,38,FOLLOW_38_in_ruleAttribute5304); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getAttributeAccess().getValuesKeyword_6_0());
                          
                    }
                    otherlv_25=(Token)match(input,39,FOLLOW_39_in_ruleAttribute5316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_6_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2365:1: ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_ID)) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2365:2: ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )*
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2365:2: ( (lv_owned_values_26_0= ruleValue ) )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2366:1: (lv_owned_values_26_0= ruleValue )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2366:1: (lv_owned_values_26_0= ruleValue )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2367:3: lv_owned_values_26_0= ruleValue
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

                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2383:2: (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )*
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==20) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2383:4: otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) )
                            	    {
                            	    otherlv_27=(Token)match(input,20,FOLLOW_20_in_ruleAttribute5351); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_27, grammarAccess.getAttributeAccess().getCommaKeyword_6_2_1_0());
                            	          
                            	    }
                            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2387:1: ( (lv_owned_values_28_0= ruleValue ) )
                            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2388:1: (lv_owned_values_28_0= ruleValue )
                            	    {
                            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2388:1: (lv_owned_values_28_0= ruleValue )
                            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2389:3: lv_owned_values_28_0= ruleValue
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2409:3: ( (lv_owned_annotations_30_0= ruleAnnotation ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==43) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2410:1: (lv_owned_annotations_30_0= ruleAnnotation )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2410:1: (lv_owned_annotations_30_0= ruleAnnotation )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2411:3: lv_owned_annotations_30_0= ruleAnnotation
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2435:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2436:2: (iv_ruleValue= ruleValue EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2437:2: iv_ruleValue= ruleValue EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2444:1: ruleValue returns [EObject current=null] : ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'literal' )? ( (lv_literal_3_0= ruleEString ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_literal_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2447:28: ( ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'literal' )? ( (lv_literal_3_0= ruleEString ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2448:1: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'literal' )? ( (lv_literal_3_0= ruleEString ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2448:1: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'literal' )? ( (lv_literal_3_0= ruleEString ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2448:2: () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'literal' )? ( (lv_literal_3_0= ruleEString ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2448:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2449:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getValueAccess().getValueAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2454:2: ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'literal' )?
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2454:3: ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'literal'
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2454:3: ( (lv_name_1_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2455:1: (lv_name_1_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2455:1: (lv_name_1_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2456:3: lv_name_1_0= ruleEString
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2476:3: ( (lv_literal_3_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2477:1: (lv_literal_3_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2477:1: (lv_literal_3_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2478:3: lv_literal_3_0= ruleEString
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2502:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2503:2: (iv_ruleOperation= ruleOperation EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2504:2: iv_ruleOperation= ruleOperation EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2511:1: ruleOperation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' (otherlv_7= 'returns' ( (lv_operation_type_8_0= ruleAbstractType ) ) )? ( (lv_owned_annotations_9_0= ruleAnnotation ) )* ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2514:28: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' (otherlv_7= 'returns' ( (lv_operation_type_8_0= ruleAbstractType ) ) )? ( (lv_owned_annotations_9_0= ruleAnnotation ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2515:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' (otherlv_7= 'returns' ( (lv_operation_type_8_0= ruleAbstractType ) ) )? ( (lv_owned_annotations_9_0= ruleAnnotation ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2515:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' (otherlv_7= 'returns' ( (lv_operation_type_8_0= ruleAbstractType ) ) )? ( (lv_owned_annotations_9_0= ruleAnnotation ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2515:2: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' (otherlv_7= 'returns' ( (lv_operation_type_8_0= ruleAbstractType ) ) )? ( (lv_owned_annotations_9_0= ruleAnnotation ) )*
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2515:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2516:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationAccess().getOperationAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2521:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2522:1: (lv_name_1_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2522:1: (lv_name_1_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2523:3: lv_name_1_0= ruleEString
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2543:1: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID||LA42_0==11) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2543:2: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2543:2: ( (lv_parameters_3_0= ruleParameter ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2544:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2544:1: (lv_parameters_3_0= ruleParameter )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2545:3: lv_parameters_3_0= ruleParameter
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

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2561:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==20) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2561:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleOperation5697); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2565:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2566:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2566:1: (lv_parameters_5_0= ruleParameter )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2567:3: lv_parameters_5_0= ruleParameter
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2587:1: (otherlv_7= 'returns' ( (lv_operation_type_8_0= ruleAbstractType ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==42) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2587:3: otherlv_7= 'returns' ( (lv_operation_type_8_0= ruleAbstractType ) )
                    {
                    otherlv_7=(Token)match(input,42,FOLLOW_42_in_ruleOperation5747); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getReturnsKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2591:1: ( (lv_operation_type_8_0= ruleAbstractType ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2592:1: (lv_operation_type_8_0= ruleAbstractType )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2592:1: (lv_operation_type_8_0= ruleAbstractType )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2593:3: lv_operation_type_8_0= ruleAbstractType
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2609:4: ( (lv_owned_annotations_9_0= ruleAnnotation ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==43) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2610:1: (lv_owned_annotations_9_0= ruleAnnotation )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2610:1: (lv_owned_annotations_9_0= ruleAnnotation )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2611:3: lv_owned_annotations_9_0= ruleAnnotation
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2635:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2636:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2637:2: iv_ruleParameter= ruleParameter EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2644:1: ruleParameter returns [EObject current=null] : ( () ( (lv_parameter_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) )? ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameter_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;

        EObject lv_owned_annotations_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2647:28: ( ( () ( (lv_parameter_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) )? ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2648:1: ( () ( (lv_parameter_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) )? ( (lv_owned_annotations_4_0= ruleAnnotation ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2648:1: ( () ( (lv_parameter_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) )? ( (lv_owned_annotations_4_0= ruleAnnotation ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2648:2: () ( (lv_parameter_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) )? ( (lv_owned_annotations_4_0= ruleAnnotation ) )*
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2648:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2649:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParameterAccess().getParameterAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2654:2: ( (lv_parameter_type_1_0= ruleAbstractType ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2655:1: (lv_parameter_type_1_0= ruleAbstractType )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2655:1: (lv_parameter_type_1_0= ruleAbstractType )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2656:3: lv_parameter_type_1_0= ruleAbstractType
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2672:2: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2673:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2673:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2674:3: lv_name_2_0= ruleEString
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2690:2: ( (lv_description_3_0= ruleEString ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_ID)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2691:1: (lv_description_3_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2691:1: (lv_description_3_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2692:3: lv_description_3_0= ruleEString
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2708:3: ( (lv_owned_annotations_4_0= ruleAnnotation ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==43) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2709:1: (lv_owned_annotations_4_0= ruleAnnotation )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2709:1: (lv_owned_annotations_4_0= ruleAnnotation )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2710:3: lv_owned_annotations_4_0= ruleAnnotation
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2734:1: entryRuleAbstractType returns [EObject current=null] : iv_ruleAbstractType= ruleAbstractType EOF ;
    public final EObject entryRuleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractType = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2735:2: (iv_ruleAbstractType= ruleAbstractType EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2736:2: iv_ruleAbstractType= ruleAbstractType EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2743:1: ruleAbstractType returns [EObject current=null] : (this_LocalType_0= ruleLocalType | this_ExternalType_1= ruleExternalType ) ;
    public final EObject ruleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject this_LocalType_0 = null;

        EObject this_ExternalType_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2746:28: ( (this_LocalType_0= ruleLocalType | this_ExternalType_1= ruleExternalType ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2747:1: (this_LocalType_0= ruleLocalType | this_ExternalType_1= ruleExternalType )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2747:1: (this_LocalType_0= ruleLocalType | this_ExternalType_1= ruleExternalType )
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2748:5: this_LocalType_0= ruleLocalType
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2758:5: this_ExternalType_1= ruleExternalType
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2774:1: entryRuleExternalType returns [EObject current=null] : iv_ruleExternalType= ruleExternalType EOF ;
    public final EObject entryRuleExternalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalType = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2775:2: (iv_ruleExternalType= ruleExternalType EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2776:2: iv_ruleExternalType= ruleExternalType EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2783:1: ruleExternalType returns [EObject current=null] : ( () otherlv_1= 'external' ( ( ruleFQN ) ) ( (lv_cardinality_3_0= ruleCardinalities ) ) ) ;
    public final EObject ruleExternalType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_cardinality_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2786:28: ( ( () otherlv_1= 'external' ( ( ruleFQN ) ) ( (lv_cardinality_3_0= ruleCardinalities ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2787:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) ( (lv_cardinality_3_0= ruleCardinalities ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2787:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) ( (lv_cardinality_3_0= ruleCardinalities ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2787:2: () otherlv_1= 'external' ( ( ruleFQN ) ) ( (lv_cardinality_3_0= ruleCardinalities ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2787:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2788:5: 
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2797:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2798:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2798:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2799:3: ruleFQN
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2812:2: ( (lv_cardinality_3_0= ruleCardinalities ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2813:1: (lv_cardinality_3_0= ruleCardinalities )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2813:1: (lv_cardinality_3_0= ruleCardinalities )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2814:3: lv_cardinality_3_0= ruleCardinalities
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2838:1: entryRuleLocalType returns [EObject current=null] : iv_ruleLocalType= ruleLocalType EOF ;
    public final EObject entryRuleLocalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalType = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2839:2: (iv_ruleLocalType= ruleLocalType EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2840:2: iv_ruleLocalType= ruleLocalType EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2847:1: ruleLocalType returns [EObject current=null] : ( () ( ( ruleFQN ) ) ( (lv_cardinality_2_0= ruleCardinalities ) ) ) ;
    public final EObject ruleLocalType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_cardinality_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2850:28: ( ( () ( ( ruleFQN ) ) ( (lv_cardinality_2_0= ruleCardinalities ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2851:1: ( () ( ( ruleFQN ) ) ( (lv_cardinality_2_0= ruleCardinalities ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2851:1: ( () ( ( ruleFQN ) ) ( (lv_cardinality_2_0= ruleCardinalities ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2851:2: () ( ( ruleFQN ) ) ( (lv_cardinality_2_0= ruleCardinalities ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2851:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2852:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalTypeAccess().getLocalTypeAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2857:2: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2858:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2858:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2859:3: ruleFQN
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2872:2: ( (lv_cardinality_2_0= ruleCardinalities ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2873:1: (lv_cardinality_2_0= ruleCardinalities )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2873:1: (lv_cardinality_2_0= ruleCardinalities )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2874:3: lv_cardinality_2_0= ruleCardinalities
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2900:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2901:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2902:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2909:1: ruleAnnotation returns [EObject current=null] : ( () otherlv_1= 'Annotation' ( (lv_source_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_owned_details_4_0= ruleDetail ) )+ otherlv_5= '}' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_source_2_0 = null;

        EObject lv_owned_details_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2912:28: ( ( () otherlv_1= 'Annotation' ( (lv_source_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_owned_details_4_0= ruleDetail ) )+ otherlv_5= '}' )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2913:1: ( () otherlv_1= 'Annotation' ( (lv_source_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_owned_details_4_0= ruleDetail ) )+ otherlv_5= '}' )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2913:1: ( () otherlv_1= 'Annotation' ( (lv_source_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_owned_details_4_0= ruleDetail ) )+ otherlv_5= '}' )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2913:2: () otherlv_1= 'Annotation' ( (lv_source_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_owned_details_4_0= ruleDetail ) )+ otherlv_5= '}' )?
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2913:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2914:5: 
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2923:1: ( (lv_source_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2924:1: (lv_source_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2924:1: (lv_source_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2925:3: lv_source_2_0= ruleEString
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2941:2: (otherlv_3= '{' ( (lv_owned_details_4_0= ruleDetail ) )+ otherlv_5= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==14) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2941:4: otherlv_3= '{' ( (lv_owned_details_4_0= ruleDetail ) )+ otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleAnnotation6465); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2945:1: ( (lv_owned_details_4_0= ruleDetail ) )+
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
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2946:1: (lv_owned_details_4_0= ruleDetail )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2946:1: (lv_owned_details_4_0= ruleDetail )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2947:3: lv_owned_details_4_0= ruleDetail
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2975:1: entryRuleDetail returns [EObject current=null] : iv_ruleDetail= ruleDetail EOF ;
    public final EObject entryRuleDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetail = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2976:2: (iv_ruleDetail= ruleDetail EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2977:2: iv_ruleDetail= ruleDetail EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2984:1: ruleDetail returns [EObject current=null] : ( () otherlv_1= 'key:' ( (lv_key_2_0= ruleEString ) ) (otherlv_3= 'value:' ( (lv_value_4_0= ruleEString ) ) )? ) ;
    public final EObject ruleDetail() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_key_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2987:28: ( ( () otherlv_1= 'key:' ( (lv_key_2_0= ruleEString ) ) (otherlv_3= 'value:' ( (lv_value_4_0= ruleEString ) ) )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2988:1: ( () otherlv_1= 'key:' ( (lv_key_2_0= ruleEString ) ) (otherlv_3= 'value:' ( (lv_value_4_0= ruleEString ) ) )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2988:1: ( () otherlv_1= 'key:' ( (lv_key_2_0= ruleEString ) ) (otherlv_3= 'value:' ( (lv_value_4_0= ruleEString ) ) )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2988:2: () otherlv_1= 'key:' ( (lv_key_2_0= ruleEString ) ) (otherlv_3= 'value:' ( (lv_value_4_0= ruleEString ) ) )?
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2988:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2989:5: 
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2998:1: ( (lv_key_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2999:1: (lv_key_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:2999:1: (lv_key_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3000:3: lv_key_2_0= ruleEString
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3016:2: (otherlv_3= 'value:' ( (lv_value_4_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==45) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3016:4: otherlv_3= 'value:' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleDetail6627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDetailAccess().getValueKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3020:1: ( (lv_value_4_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3021:1: (lv_value_4_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3021:1: (lv_value_4_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3022:3: lv_value_4_0= ruleEString
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3046:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3047:2: (iv_ruleEString= ruleEString EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3048:2: iv_ruleEString= ruleEString EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3055:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3058:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3059:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3059:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3059:6: this_STRING_0= RULE_STRING
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3067:10: this_ID_1= RULE_ID
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3082:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3083:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3084:2: iv_ruleFQN= ruleFQN EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3091:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3094:28: ( (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3095:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3095:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3095:6: this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN6861); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3102:1: (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==46) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3103:2: kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    {
            	    kw=(Token)match(input,46,FOLLOW_46_in_ruleFQN6880); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3108:1: ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3108:2: ( RULE_ID )=>this_ID_2= RULE_ID
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3123:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3124:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3125:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3132:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3135:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3136:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3136:1: (kw= 'true' | kw= 'false' )
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3137:2: kw= 'true'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleEBoolean6999); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3144:2: kw= 'false'
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3159:1: ruleAssociation_Types returns [Enumerator current=null] : ( (enumLiteral_0= 'contains' ) | (enumLiteral_1= 'refers' ) ) ;
    public final Enumerator ruleAssociation_Types() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3161:28: ( ( (enumLiteral_0= 'contains' ) | (enumLiteral_1= 'refers' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3162:1: ( (enumLiteral_0= 'contains' ) | (enumLiteral_1= 'refers' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3162:1: ( (enumLiteral_0= 'contains' ) | (enumLiteral_1= 'refers' ) )
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3162:2: (enumLiteral_0= 'contains' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3162:2: (enumLiteral_0= 'contains' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3162:4: enumLiteral_0= 'contains'
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3168:6: (enumLiteral_1= 'refers' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3168:6: (enumLiteral_1= 'refers' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3168:8: enumLiteral_1= 'refers'
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3178:1: ruleCardinalities returns [Enumerator current=null] : ( (enumLiteral_0= '[0,*]' ) | (enumLiteral_1= '[1,*]' ) | (enumLiteral_2= '[0,1]' ) | (enumLiteral_3= '[1,1]' ) ) ;
    public final Enumerator ruleCardinalities() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3180:28: ( ( (enumLiteral_0= '[0,*]' ) | (enumLiteral_1= '[1,*]' ) | (enumLiteral_2= '[0,1]' ) | (enumLiteral_3= '[1,1]' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3181:1: ( (enumLiteral_0= '[0,*]' ) | (enumLiteral_1= '[1,*]' ) | (enumLiteral_2= '[0,1]' ) | (enumLiteral_3= '[1,1]' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3181:1: ( (enumLiteral_0= '[0,*]' ) | (enumLiteral_1= '[1,*]' ) | (enumLiteral_2= '[0,1]' ) | (enumLiteral_3= '[1,1]' ) )
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3181:2: (enumLiteral_0= '[0,*]' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3181:2: (enumLiteral_0= '[0,*]' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3181:4: enumLiteral_0= '[0,*]'
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3187:6: (enumLiteral_1= '[1,*]' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3187:6: (enumLiteral_1= '[1,*]' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3187:8: enumLiteral_1= '[1,*]'
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3193:6: (enumLiteral_2= '[0,1]' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3193:6: (enumLiteral_2= '[0,1]' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3193:8: enumLiteral_2= '[0,1]'
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3199:6: (enumLiteral_3= '[1,1]' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3199:6: (enumLiteral_3= '[1,1]' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalData.g:3199:8: enumLiteral_3= '[1,1]'
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
            return "1019:1: (this_LocalClassAssociation_0= ruleLocalClassAssociation | this_ExternalClassAssociation_1= ruleExternalClassAssociation )";
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
            return "()* loopback of 2076:3: ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )*";
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

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
 * Copyright (c) 2017 Thales Global Services S.A.S.
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'external'", "'import'", "'Data'", "'{'", "'description:'", "'}'", "'Class'", "'icon:'", "'extends'", "','", "'superClass'", "'abstract:'", "'Attributes:'", "'Associations:'", "'Operations:'", "'Enumeration'", "'description'", "'opposite:'", "'changeable:'", "'derived:'", "'ordered:'", "'transient:'", "'unique:'", "'unsettable:'", "'volatile:'", "'enum'", "'type'", "'id:'", "'values'", "'('", "')'", "'literal'", "'returns'", "'Annotation'", "'key:'", "'value:'", "'.'", "'true'", "'false'", "'contains'", "'refers'", "'[0,*]'", "'[1,*]'", "'[0,1]'", "'[1,1]'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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
    public static final int T__48=48;
    public static final int T__49=49;
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


        public InternalDataParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDataParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDataParser.tokenNames; }
    public String getGrammarFileName() { return "InternalData.g"; }



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
    // InternalData.g:75:1: entryRuleDataSpec returns [EObject current=null] : iv_ruleDataSpec= ruleDataSpec EOF ;
    public final EObject entryRuleDataSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSpec = null;


        try {
            // InternalData.g:76:2: (iv_ruleDataSpec= ruleDataSpec EOF )
            // InternalData.g:77:2: iv_ruleDataSpec= ruleDataSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDataSpec=ruleDataSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataSpec; 
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
    // $ANTLR end "entryRuleDataSpec"


    // $ANTLR start "ruleDataSpec"
    // InternalData.g:84:1: ruleDataSpec returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_data_2_0= ruleData ) ) ) ;
    public final EObject ruleDataSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_data_2_0 = null;


         enterRule(); 
            
        try {
            // InternalData.g:87:28: ( ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_data_2_0= ruleData ) ) ) )
            // InternalData.g:88:1: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_data_2_0= ruleData ) ) )
            {
            // InternalData.g:88:1: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_data_2_0= ruleData ) ) )
            // InternalData.g:88:2: () ( (lv_imports_1_0= ruleImport ) )* ( (lv_data_2_0= ruleData ) )
            {
            // InternalData.g:88:2: ()
            // InternalData.g:89:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDataSpecAccess().getDataSpecAction_0(),
                          current);
                  
            }

            }

            // InternalData.g:94:2: ( (lv_imports_1_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalData.g:95:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // InternalData.g:95:1: (lv_imports_1_0= ruleImport )
            	    // InternalData.g:96:3: lv_imports_1_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataSpecAccess().getImportsImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_3);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalData.g:112:3: ( (lv_data_2_0= ruleData ) )
            // InternalData.g:113:1: (lv_data_2_0= ruleData )
            {
            // InternalData.g:113:1: (lv_data_2_0= ruleData )
            // InternalData.g:114:3: lv_data_2_0= ruleData
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataSpecAccess().getDataDataParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Data");
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
    // InternalData.g:138:1: entryRuleAbstractImport returns [EObject current=null] : iv_ruleAbstractImport= ruleAbstractImport EOF ;
    public final EObject entryRuleAbstractImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractImport = null;


        try {
            // InternalData.g:139:2: (iv_ruleAbstractImport= ruleAbstractImport EOF )
            // InternalData.g:140:2: iv_ruleAbstractImport= ruleAbstractImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbstractImport=ruleAbstractImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractImport; 
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
    // $ANTLR end "entryRuleAbstractImport"


    // $ANTLR start "ruleAbstractImport"
    // InternalData.g:147:1: ruleAbstractImport returns [EObject current=null] : (this_ImportNamespace_0= ruleImportNamespace | this_ImportURI_1= ruleImportURI ) ;
    public final EObject ruleAbstractImport() throws RecognitionException {
        EObject current = null;

        EObject this_ImportNamespace_0 = null;

        EObject this_ImportURI_1 = null;


         enterRule(); 
            
        try {
            // InternalData.g:150:28: ( (this_ImportNamespace_0= ruleImportNamespace | this_ImportURI_1= ruleImportURI ) )
            // InternalData.g:151:1: (this_ImportNamespace_0= ruleImportNamespace | this_ImportURI_1= ruleImportURI )
            {
            // InternalData.g:151:1: (this_ImportNamespace_0= ruleImportNamespace | this_ImportURI_1= ruleImportURI )
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
                    // InternalData.g:152:5: this_ImportNamespace_0= ruleImportNamespace
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractImportAccess().getImportNamespaceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalData.g:162:5: this_ImportURI_1= ruleImportURI
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractImportAccess().getImportURIParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalData.g:178:1: entryRuleImportNamespace returns [EObject current=null] : iv_ruleImportNamespace= ruleImportNamespace EOF ;
    public final EObject entryRuleImportNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportNamespace = null;


        try {
            // InternalData.g:179:2: (iv_ruleImportNamespace= ruleImportNamespace EOF )
            // InternalData.g:180:2: iv_ruleImportNamespace= ruleImportNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportNamespaceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImportNamespace=ruleImportNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportNamespace; 
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
    // $ANTLR end "entryRuleImportNamespace"


    // $ANTLR start "ruleImportNamespace"
    // InternalData.g:187:1: ruleImportNamespace returns [EObject current=null] : ( (lv_importedNamespace_0_0= ruleFQN ) ) ;
    public final EObject ruleImportNamespace() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_importedNamespace_0_0 = null;


         enterRule(); 
            
        try {
            // InternalData.g:190:28: ( ( (lv_importedNamespace_0_0= ruleFQN ) ) )
            // InternalData.g:191:1: ( (lv_importedNamespace_0_0= ruleFQN ) )
            {
            // InternalData.g:191:1: ( (lv_importedNamespace_0_0= ruleFQN ) )
            // InternalData.g:192:1: (lv_importedNamespace_0_0= ruleFQN )
            {
            // InternalData.g:192:1: (lv_importedNamespace_0_0= ruleFQN )
            // InternalData.g:193:3: lv_importedNamespace_0_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportNamespaceAccess().getImportedNamespaceFQNParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.FQN");
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
    // InternalData.g:217:1: entryRuleImportURI returns [EObject current=null] : iv_ruleImportURI= ruleImportURI EOF ;
    public final EObject entryRuleImportURI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportURI = null;


        try {
            // InternalData.g:218:2: (iv_ruleImportURI= ruleImportURI EOF )
            // InternalData.g:219:2: iv_ruleImportURI= ruleImportURI EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportURIRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImportURI=ruleImportURI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportURI; 
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
    // $ANTLR end "entryRuleImportURI"


    // $ANTLR start "ruleImportURI"
    // InternalData.g:226:1: ruleImportURI returns [EObject current=null] : (otherlv_0= 'external' ( (lv_importURI_1_0= ruleEString ) ) ) ;
    public final EObject ruleImportURI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importURI_1_0 = null;


         enterRule(); 
            
        try {
            // InternalData.g:229:28: ( (otherlv_0= 'external' ( (lv_importURI_1_0= ruleEString ) ) ) )
            // InternalData.g:230:1: (otherlv_0= 'external' ( (lv_importURI_1_0= ruleEString ) ) )
            {
            // InternalData.g:230:1: (otherlv_0= 'external' ( (lv_importURI_1_0= ruleEString ) ) )
            // InternalData.g:230:3: otherlv_0= 'external' ( (lv_importURI_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportURIAccess().getExternalKeyword_0());
                  
            }
            // InternalData.g:234:1: ( (lv_importURI_1_0= ruleEString ) )
            // InternalData.g:235:1: (lv_importURI_1_0= ruleEString )
            {
            // InternalData.g:235:1: (lv_importURI_1_0= ruleEString )
            // InternalData.g:236:3: lv_importURI_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportURIAccess().getImportURIEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
    // $ANTLR end "ruleImportURI"


    // $ANTLR start "entryRuleImport"
    // InternalData.g:260:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalData.g:261:2: (iv_ruleImport= ruleImport EOF )
            // InternalData.g:262:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalData.g:269:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' this_AbstractImport_1= ruleAbstractImport ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_AbstractImport_1 = null;


         enterRule(); 
            
        try {
            // InternalData.g:272:28: ( (otherlv_0= 'import' this_AbstractImport_1= ruleAbstractImport ) )
            // InternalData.g:273:1: (otherlv_0= 'import' this_AbstractImport_1= ruleAbstractImport )
            {
            // InternalData.g:273:1: (otherlv_0= 'import' this_AbstractImport_1= ruleAbstractImport )
            // InternalData.g:273:3: otherlv_0= 'import' this_AbstractImport_1= ruleAbstractImport
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImportAccess().getAbstractImportParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_2);
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
    // InternalData.g:294:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalData.g:295:2: (iv_ruleData= ruleData EOF )
            // InternalData.g:296:2: iv_ruleData= ruleData EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleData; 
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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalData.g:303:1: ruleData returns [EObject current=null] : ( () otherlv_1= 'Data' ( (lv_name_2_0= ruleFQN ) )? otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) ;
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
            // InternalData.g:306:28: ( ( () otherlv_1= 'Data' ( (lv_name_2_0= ruleFQN ) )? otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) )
            // InternalData.g:307:1: ( () otherlv_1= 'Data' ( (lv_name_2_0= ruleFQN ) )? otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) ) ) otherlv_10= '}' )
            {
            // InternalData.g:307:1: ( () otherlv_1= 'Data' ( (lv_name_2_0= ruleFQN ) )? otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) ) ) otherlv_10= '}' )
            // InternalData.g:307:2: () otherlv_1= 'Data' ( (lv_name_2_0= ruleFQN ) )? otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) ) ) otherlv_10= '}'
            {
            // InternalData.g:307:2: ()
            // InternalData.g:308:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDataAccess().getDataAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataAccess().getDataKeyword_1());
                  
            }
            // InternalData.g:317:1: ( (lv_name_2_0= ruleFQN ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalData.g:318:1: (lv_name_2_0= ruleFQN )
                    {
                    // InternalData.g:318:1: (lv_name_2_0= ruleFQN )
                    // InternalData.g:319:3: lv_name_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataAccess().getNameFQNParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_7);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.FQN");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDataAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalData.g:339:1: ( (lv_owned_annotations_4_0= ruleAnnotation ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==44) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalData.g:340:1: (lv_owned_annotations_4_0= ruleAnnotation )
            	    {
            	    // InternalData.g:340:1: (lv_owned_annotations_4_0= ruleAnnotation )
            	    // InternalData.g:341:3: lv_owned_annotations_4_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataAccess().getOwned_annotationsAnnotationParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_8);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalData.g:357:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) ) )
            // InternalData.g:359:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) )
            {
            // InternalData.g:359:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* ) )
            // InternalData.g:360:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getDataAccess().getUnorderedGroup_5());
            // InternalData.g:363:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )* )
            // InternalData.g:364:3: ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )*
            {
            // InternalData.g:364:3: ( ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) ) )*
            loop7:
            do {
                int alt7=4;
                int LA7_0 = input.LA(1);

                if ( LA7_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 1) ) {
                    alt7=2;
                }
                else if ( LA7_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 2) ) {
                    alt7=3;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalData.g:366:4: ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalData.g:366:4: ({...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    // InternalData.g:367:5: {...}? => ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleData", "getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalData.g:367:101: ( ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    // InternalData.g:368:6: ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getDataAccess().getUnorderedGroup_5(), 0);
            	    // InternalData.g:371:6: ({...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) ) )
            	    // InternalData.g:371:7: {...}? => (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleData", "true");
            	    }
            	    // InternalData.g:371:16: (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )
            	    // InternalData.g:371:18: otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getDataAccess().getDescriptionKeyword_5_0_0());
            	          
            	    }
            	    // InternalData.g:375:1: ( (lv_description_7_0= ruleEString ) )
            	    // InternalData.g:376:1: (lv_description_7_0= ruleEString )
            	    {
            	    // InternalData.g:376:1: (lv_description_7_0= ruleEString )
            	    // InternalData.g:377:3: lv_description_7_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataAccess().getDescriptionEStringParserRuleCall_5_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_9);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
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
            	    // InternalData.g:400:4: ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) )
            	    {
            	    // InternalData.g:400:4: ({...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ ) )
            	    // InternalData.g:401:5: {...}? => ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleData", "getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalData.g:401:101: ( ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+ )
            	    // InternalData.g:402:6: ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getDataAccess().getUnorderedGroup_5(), 1);
            	    // InternalData.g:405:6: ({...}? => ( (lv_VP_Classes_8_0= ruleClass ) ) )+
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
            	    	    // InternalData.g:405:7: {...}? => ( (lv_VP_Classes_8_0= ruleClass ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleData", "true");
            	    	    }
            	    	    // InternalData.g:405:16: ( (lv_VP_Classes_8_0= ruleClass ) )
            	    	    // InternalData.g:406:1: (lv_VP_Classes_8_0= ruleClass )
            	    	    {
            	    	    // InternalData.g:406:1: (lv_VP_Classes_8_0= ruleClass )
            	    	    // InternalData.g:407:3: lv_VP_Classes_8_0= ruleClass
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getDataAccess().getVP_ClassesClassParserRuleCall_5_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_9);
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
            	    	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Class");
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
            	    // InternalData.g:430:4: ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) )
            	    {
            	    // InternalData.g:430:4: ({...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ ) )
            	    // InternalData.g:431:5: {...}? => ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleData", "getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalData.g:431:101: ( ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+ )
            	    // InternalData.g:432:6: ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getDataAccess().getUnorderedGroup_5(), 2);
            	    // InternalData.g:435:6: ({...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) ) )+
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
            	    	    // InternalData.g:435:7: {...}? => ( (lv_VP_Enumerations_9_0= ruleEnumeration ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleData", "true");
            	    	    }
            	    	    // InternalData.g:435:16: ( (lv_VP_Enumerations_9_0= ruleEnumeration ) )
            	    	    // InternalData.g:436:1: (lv_VP_Enumerations_9_0= ruleEnumeration )
            	    	    {
            	    	    // InternalData.g:436:1: (lv_VP_Enumerations_9_0= ruleEnumeration )
            	    	    // InternalData.g:437:3: lv_VP_Enumerations_9_0= ruleEnumeration
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getDataAccess().getVP_EnumerationsEnumerationParserRuleCall_5_2_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_9);
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
            	    	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Enumeration");
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

            otherlv_10=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalData.g:479:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalData.g:480:2: (iv_ruleClass= ruleClass EOF )
            // InternalData.g:481:2: iv_ruleClass= ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass; 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalData.g:488:1: ruleClass returns [EObject current=null] : ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'icon:' ( (lv_icon_7_0= RULE_STRING ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'superClass' ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) ) (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )* )? (otherlv_16= 'abstract:' ( (lv_abstract_17_0= ruleEBoolean ) ) )? ( (lv_owned_annotations_18_0= ruleAnnotation ) )* (otherlv_19= 'Attributes:' ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )* )? (otherlv_21= 'Associations:' ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )* )? (otherlv_23= 'Operations:' ( (lv_VP_Class_Operations_24_0= ruleOperation ) )* )? otherlv_25= '}' ) ;
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
            // InternalData.g:491:28: ( ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'icon:' ( (lv_icon_7_0= RULE_STRING ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'superClass' ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) ) (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )* )? (otherlv_16= 'abstract:' ( (lv_abstract_17_0= ruleEBoolean ) ) )? ( (lv_owned_annotations_18_0= ruleAnnotation ) )* (otherlv_19= 'Attributes:' ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )* )? (otherlv_21= 'Associations:' ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )* )? (otherlv_23= 'Operations:' ( (lv_VP_Class_Operations_24_0= ruleOperation ) )* )? otherlv_25= '}' ) )
            // InternalData.g:492:1: ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'icon:' ( (lv_icon_7_0= RULE_STRING ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'superClass' ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) ) (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )* )? (otherlv_16= 'abstract:' ( (lv_abstract_17_0= ruleEBoolean ) ) )? ( (lv_owned_annotations_18_0= ruleAnnotation ) )* (otherlv_19= 'Attributes:' ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )* )? (otherlv_21= 'Associations:' ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )* )? (otherlv_23= 'Operations:' ( (lv_VP_Class_Operations_24_0= ruleOperation ) )* )? otherlv_25= '}' )
            {
            // InternalData.g:492:1: ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'icon:' ( (lv_icon_7_0= RULE_STRING ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'superClass' ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) ) (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )* )? (otherlv_16= 'abstract:' ( (lv_abstract_17_0= ruleEBoolean ) ) )? ( (lv_owned_annotations_18_0= ruleAnnotation ) )* (otherlv_19= 'Attributes:' ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )* )? (otherlv_21= 'Associations:' ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )* )? (otherlv_23= 'Operations:' ( (lv_VP_Class_Operations_24_0= ruleOperation ) )* )? otherlv_25= '}' )
            // InternalData.g:492:2: () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'icon:' ( (lv_icon_7_0= RULE_STRING ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'superClass' ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) ) (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )* )? (otherlv_16= 'abstract:' ( (lv_abstract_17_0= ruleEBoolean ) ) )? ( (lv_owned_annotations_18_0= ruleAnnotation ) )* (otherlv_19= 'Attributes:' ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )* )? (otherlv_21= 'Associations:' ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )* )? (otherlv_23= 'Operations:' ( (lv_VP_Class_Operations_24_0= ruleOperation ) )* )? otherlv_25= '}'
            {
            // InternalData.g:492:2: ()
            // InternalData.g:493:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getClassAccess().getClassAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
                  
            }
            // InternalData.g:502:1: ( (lv_name_2_0= ruleEString ) )
            // InternalData.g:503:1: (lv_name_2_0= ruleEString )
            {
            // InternalData.g:503:1: (lv_name_2_0= ruleEString )
            // InternalData.g:504:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClassAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
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
                      		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalData.g:524:1: (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalData.g:524:3: otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getDescriptionKeyword_4_0());
                          
                    }
                    // InternalData.g:528:1: ( (lv_description_5_0= ruleEString ) )
                    // InternalData.g:529:1: (lv_description_5_0= ruleEString )
                    {
                    // InternalData.g:529:1: (lv_description_5_0= ruleEString )
                    // InternalData.g:530:3: lv_description_5_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_11);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalData.g:546:4: (otherlv_6= 'icon:' ( (lv_icon_7_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalData.g:546:6: otherlv_6= 'icon:' ( (lv_icon_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getClassAccess().getIconKeyword_5_0());
                          
                    }
                    // InternalData.g:550:1: ( (lv_icon_7_0= RULE_STRING ) )
                    // InternalData.g:551:1: (lv_icon_7_0= RULE_STRING )
                    {
                    // InternalData.g:551:1: (lv_icon_7_0= RULE_STRING )
                    // InternalData.g:552:3: lv_icon_7_0= RULE_STRING
                    {
                    lv_icon_7_0=(Token)match(input,RULE_STRING,FOLLOW_13); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalData.g:568:4: (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalData.g:568:6: otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getClassAccess().getExtendsKeyword_6_0());
                          
                    }
                    // InternalData.g:572:1: ( ( ruleFQN ) )
                    // InternalData.g:573:1: ( ruleFQN )
                    {
                    // InternalData.g:573:1: ( ruleFQN )
                    // InternalData.g:574:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassAccess().getExtendsEClassCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_15);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalData.g:587:2: (otherlv_10= ',' ( ( ruleFQN ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==20) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalData.g:587:4: otherlv_10= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_10=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getClassAccess().getCommaKeyword_6_2_0());
                    	          
                    	    }
                    	    // InternalData.g:591:1: ( ( ruleFQN ) )
                    	    // InternalData.g:592:1: ( ruleFQN )
                    	    {
                    	    // InternalData.g:592:1: ( ruleFQN )
                    	    // InternalData.g:593:3: ruleFQN
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getClassRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassAccess().getExtendsEClassCrossReference_6_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_15);
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

            // InternalData.g:606:6: (otherlv_12= 'superClass' ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) ) (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalData.g:606:8: otherlv_12= 'superClass' ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) ) (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )*
                    {
                    otherlv_12=(Token)match(input,21,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getClassAccess().getSuperClassKeyword_7_0());
                          
                    }
                    // InternalData.g:610:1: ( (lv_Inheritences_13_0= ruleAbstractSuperClass ) )
                    // InternalData.g:611:1: (lv_Inheritences_13_0= ruleAbstractSuperClass )
                    {
                    // InternalData.g:611:1: (lv_Inheritences_13_0= ruleAbstractSuperClass )
                    // InternalData.g:612:3: lv_Inheritences_13_0= ruleAbstractSuperClass
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassAccess().getInheritencesAbstractSuperClassParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_16);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.AbstractSuperClass");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalData.g:628:2: (otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==20) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalData.g:628:4: otherlv_14= ',' ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) )
                    	    {
                    	    otherlv_14=(Token)match(input,20,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_14, grammarAccess.getClassAccess().getCommaKeyword_7_2_0());
                    	          
                    	    }
                    	    // InternalData.g:632:1: ( (lv_Inheritences_15_0= ruleAbstractSuperClass ) )
                    	    // InternalData.g:633:1: (lv_Inheritences_15_0= ruleAbstractSuperClass )
                    	    {
                    	    // InternalData.g:633:1: (lv_Inheritences_15_0= ruleAbstractSuperClass )
                    	    // InternalData.g:634:3: lv_Inheritences_15_0= ruleAbstractSuperClass
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassAccess().getInheritencesAbstractSuperClassParserRuleCall_7_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_16);
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
                    	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.AbstractSuperClass");
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

            // InternalData.g:650:6: (otherlv_16= 'abstract:' ( (lv_abstract_17_0= ruleEBoolean ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalData.g:650:8: otherlv_16= 'abstract:' ( (lv_abstract_17_0= ruleEBoolean ) )
                    {
                    otherlv_16=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getClassAccess().getAbstractKeyword_8_0());
                          
                    }
                    // InternalData.g:654:1: ( (lv_abstract_17_0= ruleEBoolean ) )
                    // InternalData.g:655:1: (lv_abstract_17_0= ruleEBoolean )
                    {
                    // InternalData.g:655:1: (lv_abstract_17_0= ruleEBoolean )
                    // InternalData.g:656:3: lv_abstract_17_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassAccess().getAbstractEBooleanParserRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_18);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalData.g:672:4: ( (lv_owned_annotations_18_0= ruleAnnotation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==44) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalData.g:673:1: (lv_owned_annotations_18_0= ruleAnnotation )
            	    {
            	    // InternalData.g:673:1: (lv_owned_annotations_18_0= ruleAnnotation )
            	    // InternalData.g:674:3: lv_owned_annotations_18_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassAccess().getOwned_annotationsAnnotationParserRuleCall_9_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_18);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalData.g:690:3: (otherlv_19= 'Attributes:' ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalData.g:690:5: otherlv_19= 'Attributes:' ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )*
                    {
                    otherlv_19=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getClassAccess().getAttributesKeyword_10_0());
                          
                    }
                    // InternalData.g:694:1: ( (lv_VP_Class_Attributes_20_0= ruleAttribute ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalData.g:695:1: (lv_VP_Class_Attributes_20_0= ruleAttribute )
                    	    {
                    	    // InternalData.g:695:1: (lv_VP_Class_Attributes_20_0= ruleAttribute )
                    	    // InternalData.g:696:3: lv_VP_Class_Attributes_20_0= ruleAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassAccess().getVP_Class_AttributesAttributeParserRuleCall_10_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_19);
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
                    	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Attribute");
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

            // InternalData.g:712:5: (otherlv_21= 'Associations:' ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalData.g:712:7: otherlv_21= 'Associations:' ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )*
                    {
                    otherlv_21=(Token)match(input,24,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getClassAccess().getAssociationsKeyword_11_0());
                          
                    }
                    // InternalData.g:716:1: ( (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalData.g:717:1: (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation )
                    	    {
                    	    // InternalData.g:717:1: (lv_VP_Classes_Associations_22_0= ruleAbstractAssociation )
                    	    // InternalData.g:718:3: lv_VP_Classes_Associations_22_0= ruleAbstractAssociation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassAccess().getVP_Classes_AssociationsAbstractAssociationParserRuleCall_11_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_20);
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
                    	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.AbstractAssociation");
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

            // InternalData.g:734:5: (otherlv_23= 'Operations:' ( (lv_VP_Class_Operations_24_0= ruleOperation ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalData.g:734:7: otherlv_23= 'Operations:' ( (lv_VP_Class_Operations_24_0= ruleOperation ) )*
                    {
                    otherlv_23=(Token)match(input,25,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getClassAccess().getOperationsKeyword_12_0());
                          
                    }
                    // InternalData.g:738:1: ( (lv_VP_Class_Operations_24_0= ruleOperation ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalData.g:739:1: (lv_VP_Class_Operations_24_0= ruleOperation )
                    	    {
                    	    // InternalData.g:739:1: (lv_VP_Class_Operations_24_0= ruleOperation )
                    	    // InternalData.g:740:3: lv_VP_Class_Operations_24_0= ruleOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassAccess().getVP_Class_OperationsOperationParserRuleCall_12_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_21);
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
                    	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Operation");
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

            otherlv_25=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalData.g:768:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalData.g:769:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalData.g:770:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumeration; 
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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalData.g:777:1: ruleEnumeration returns [EObject current=null] : ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( (lv_ownedValues_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )* ) otherlv_8= '}' ) ;
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
            // InternalData.g:780:28: ( ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( (lv_ownedValues_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )* ) otherlv_8= '}' ) )
            // InternalData.g:781:1: ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( (lv_ownedValues_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )* ) otherlv_8= '}' )
            {
            // InternalData.g:781:1: ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( (lv_ownedValues_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )* ) otherlv_8= '}' )
            // InternalData.g:781:2: () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ( ( (lv_ownedValues_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )* ) otherlv_8= '}'
            {
            // InternalData.g:781:2: ()
            // InternalData.g:782:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEnumerationAccess().getEnumerationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getEnumerationKeyword_1());
                  
            }
            // InternalData.g:791:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalData.g:792:1: (lv_name_2_0= RULE_ID )
            {
            // InternalData.g:792:1: (lv_name_2_0= RULE_ID )
            // InternalData.g:793:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalData.g:813:1: ( (lv_owned_annotations_4_0= ruleAnnotation ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==44) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalData.g:814:1: (lv_owned_annotations_4_0= ruleAnnotation )
            	    {
            	    // InternalData.g:814:1: (lv_owned_annotations_4_0= ruleAnnotation )
            	    // InternalData.g:815:3: lv_owned_annotations_4_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumerationAccess().getOwned_annotationsAnnotationParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_22);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalData.g:831:3: ( ( (lv_ownedValues_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )* )
            // InternalData.g:831:4: ( (lv_ownedValues_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )*
            {
            // InternalData.g:831:4: ( (lv_ownedValues_5_0= ruleValue ) )
            // InternalData.g:832:1: (lv_ownedValues_5_0= ruleValue )
            {
            // InternalData.g:832:1: (lv_ownedValues_5_0= ruleValue )
            // InternalData.g:833:3: lv_ownedValues_5_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumerationAccess().getOwnedValuesValueParserRuleCall_5_0_0()); 
              	    
            }
            pushFollow(FOLLOW_23);
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
                      		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalData.g:849:2: (otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==20) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalData.g:849:4: otherlv_6= ',' ( (lv_ownedValues_7_0= ruleValue ) )
            	    {
            	    otherlv_6=(Token)match(input,20,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getCommaKeyword_5_1_0());
            	          
            	    }
            	    // InternalData.g:853:1: ( (lv_ownedValues_7_0= ruleValue ) )
            	    // InternalData.g:854:1: (lv_ownedValues_7_0= ruleValue )
            	    {
            	    // InternalData.g:854:1: (lv_ownedValues_7_0= ruleValue )
            	    // InternalData.g:855:3: lv_ownedValues_7_0= ruleValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumerationAccess().getOwnedValuesValueParserRuleCall_5_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_23);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Value");
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

            otherlv_8=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalData.g:883:1: entryRuleAbstractSuperClass returns [EObject current=null] : iv_ruleAbstractSuperClass= ruleAbstractSuperClass EOF ;
    public final EObject entryRuleAbstractSuperClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSuperClass = null;


        try {
            // InternalData.g:884:2: (iv_ruleAbstractSuperClass= ruleAbstractSuperClass EOF )
            // InternalData.g:885:2: iv_ruleAbstractSuperClass= ruleAbstractSuperClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractSuperClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbstractSuperClass=ruleAbstractSuperClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractSuperClass; 
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
    // $ANTLR end "entryRuleAbstractSuperClass"


    // $ANTLR start "ruleAbstractSuperClass"
    // InternalData.g:892:1: ruleAbstractSuperClass returns [EObject current=null] : (this_LocalSuperClass_0= ruleLocalSuperClass | this_ExternalSuperClass_1= ruleExternalSuperClass ) ;
    public final EObject ruleAbstractSuperClass() throws RecognitionException {
        EObject current = null;

        EObject this_LocalSuperClass_0 = null;

        EObject this_ExternalSuperClass_1 = null;


         enterRule(); 
            
        try {
            // InternalData.g:895:28: ( (this_LocalSuperClass_0= ruleLocalSuperClass | this_ExternalSuperClass_1= ruleExternalSuperClass ) )
            // InternalData.g:896:1: (this_LocalSuperClass_0= ruleLocalSuperClass | this_ExternalSuperClass_1= ruleExternalSuperClass )
            {
            // InternalData.g:896:1: (this_LocalSuperClass_0= ruleLocalSuperClass | this_ExternalSuperClass_1= ruleExternalSuperClass )
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
                    // InternalData.g:897:5: this_LocalSuperClass_0= ruleLocalSuperClass
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractSuperClassAccess().getLocalSuperClassParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalData.g:907:5: this_ExternalSuperClass_1= ruleExternalSuperClass
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractSuperClassAccess().getExternalSuperClassParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalData.g:923:1: entryRuleLocalSuperClass returns [EObject current=null] : iv_ruleLocalSuperClass= ruleLocalSuperClass EOF ;
    public final EObject entryRuleLocalSuperClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalSuperClass = null;


        try {
            // InternalData.g:924:2: (iv_ruleLocalSuperClass= ruleLocalSuperClass EOF )
            // InternalData.g:925:2: iv_ruleLocalSuperClass= ruleLocalSuperClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalSuperClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLocalSuperClass=ruleLocalSuperClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalSuperClass; 
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
    // $ANTLR end "entryRuleLocalSuperClass"


    // $ANTLR start "ruleLocalSuperClass"
    // InternalData.g:932:1: ruleLocalSuperClass returns [EObject current=null] : ( () ( ( ruleFQN ) ) ) ;
    public final EObject ruleLocalSuperClass() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // InternalData.g:935:28: ( ( () ( ( ruleFQN ) ) ) )
            // InternalData.g:936:1: ( () ( ( ruleFQN ) ) )
            {
            // InternalData.g:936:1: ( () ( ( ruleFQN ) ) )
            // InternalData.g:936:2: () ( ( ruleFQN ) )
            {
            // InternalData.g:936:2: ()
            // InternalData.g:937:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalSuperClassAccess().getLocalSuperClassAction_0(),
                          current);
                  
            }

            }

            // InternalData.g:942:2: ( ( ruleFQN ) )
            // InternalData.g:943:1: ( ruleFQN )
            {
            // InternalData.g:943:1: ( ruleFQN )
            // InternalData.g:944:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalSuperClassRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalSuperClassAccess().getSuperClassClassCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
    // InternalData.g:965:1: entryRuleExternalSuperClass returns [EObject current=null] : iv_ruleExternalSuperClass= ruleExternalSuperClass EOF ;
    public final EObject entryRuleExternalSuperClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalSuperClass = null;


        try {
            // InternalData.g:966:2: (iv_ruleExternalSuperClass= ruleExternalSuperClass EOF )
            // InternalData.g:967:2: iv_ruleExternalSuperClass= ruleExternalSuperClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternalSuperClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExternalSuperClass=ruleExternalSuperClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternalSuperClass; 
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
    // $ANTLR end "entryRuleExternalSuperClass"


    // $ANTLR start "ruleExternalSuperClass"
    // InternalData.g:974:1: ruleExternalSuperClass returns [EObject current=null] : ( () otherlv_1= 'external' ( ( ruleFQN ) ) ) ;
    public final EObject ruleExternalSuperClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalData.g:977:28: ( ( () otherlv_1= 'external' ( ( ruleFQN ) ) ) )
            // InternalData.g:978:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) )
            {
            // InternalData.g:978:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) )
            // InternalData.g:978:2: () otherlv_1= 'external' ( ( ruleFQN ) )
            {
            // InternalData.g:978:2: ()
            // InternalData.g:979:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExternalSuperClassAccess().getExternalSuperClassAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExternalSuperClassAccess().getExternalKeyword_1());
                  
            }
            // InternalData.g:988:1: ( ( ruleFQN ) )
            // InternalData.g:989:1: ( ruleFQN )
            {
            // InternalData.g:989:1: ( ruleFQN )
            // InternalData.g:990:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExternalSuperClassRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExternalSuperClassAccess().getSuperClassEClassCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
    // InternalData.g:1013:1: entryRuleAbstractAssociation returns [EObject current=null] : iv_ruleAbstractAssociation= ruleAbstractAssociation EOF ;
    public final EObject entryRuleAbstractAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAssociation = null;


        try {
            // InternalData.g:1014:2: (iv_ruleAbstractAssociation= ruleAbstractAssociation EOF )
            // InternalData.g:1015:2: iv_ruleAbstractAssociation= ruleAbstractAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractAssociationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbstractAssociation=ruleAbstractAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractAssociation; 
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
    // $ANTLR end "entryRuleAbstractAssociation"


    // $ANTLR start "ruleAbstractAssociation"
    // InternalData.g:1022:1: ruleAbstractAssociation returns [EObject current=null] : (this_LocalClassAssociation_0= ruleLocalClassAssociation | this_ExternalClassAssociation_1= ruleExternalClassAssociation ) ;
    public final EObject ruleAbstractAssociation() throws RecognitionException {
        EObject current = null;

        EObject this_LocalClassAssociation_0 = null;

        EObject this_ExternalClassAssociation_1 = null;


         enterRule(); 
            
        try {
            // InternalData.g:1025:28: ( (this_LocalClassAssociation_0= ruleLocalClassAssociation | this_ExternalClassAssociation_1= ruleExternalClassAssociation ) )
            // InternalData.g:1026:1: (this_LocalClassAssociation_0= ruleLocalClassAssociation | this_ExternalClassAssociation_1= ruleExternalClassAssociation )
            {
            // InternalData.g:1026:1: (this_LocalClassAssociation_0= ruleLocalClassAssociation | this_ExternalClassAssociation_1= ruleExternalClassAssociation )
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalData.g:1027:5: this_LocalClassAssociation_0= ruleLocalClassAssociation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractAssociationAccess().getLocalClassAssociationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalData.g:1037:5: this_ExternalClassAssociation_1= ruleExternalClassAssociation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractAssociationAccess().getExternalClassAssociationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalData.g:1053:1: entryRuleLocalClassAssociation returns [EObject current=null] : iv_ruleLocalClassAssociation= ruleLocalClassAssociation EOF ;
    public final EObject entryRuleLocalClassAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalClassAssociation = null;


        try {
            // InternalData.g:1054:2: (iv_ruleLocalClassAssociation= ruleLocalClassAssociation EOF )
            // InternalData.g:1055:2: iv_ruleLocalClassAssociation= ruleLocalClassAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalClassAssociationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLocalClassAssociation=ruleLocalClassAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalClassAssociation; 
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
    // $ANTLR end "entryRuleLocalClassAssociation"


    // $ANTLR start "ruleLocalClassAssociation"
    // InternalData.g:1062:1: ruleLocalClassAssociation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'opposite:' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'changeable:' ( (lv_changeable_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'derived:' ( (lv_derived_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'ordered:' ( (lv_ordered_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'transient:' ( (lv_transient_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unique:' ( (lv_unique_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'unsettable:' ( (lv_unsettable_22_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'volatile:' ( (lv_volatile_24_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_25_0= ruleAnnotation ) )* ) ;
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
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;

        Enumerator lv_type_5_0 = null;

        Enumerator lv_cardinality_6_0 = null;

        AntlrDatatypeRuleToken lv_changeable_12_0 = null;

        AntlrDatatypeRuleToken lv_derived_14_0 = null;

        AntlrDatatypeRuleToken lv_ordered_16_0 = null;

        AntlrDatatypeRuleToken lv_transient_18_0 = null;

        AntlrDatatypeRuleToken lv_unique_20_0 = null;

        AntlrDatatypeRuleToken lv_unsettable_22_0 = null;

        AntlrDatatypeRuleToken lv_volatile_24_0 = null;

        EObject lv_owned_annotations_25_0 = null;


         enterRule(); 
            
        try {
            // InternalData.g:1065:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'opposite:' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'changeable:' ( (lv_changeable_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'derived:' ( (lv_derived_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'ordered:' ( (lv_ordered_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'transient:' ( (lv_transient_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unique:' ( (lv_unique_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'unsettable:' ( (lv_unsettable_22_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'volatile:' ( (lv_volatile_24_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_25_0= ruleAnnotation ) )* ) )
            // InternalData.g:1066:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'opposite:' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'changeable:' ( (lv_changeable_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'derived:' ( (lv_derived_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'ordered:' ( (lv_ordered_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'transient:' ( (lv_transient_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unique:' ( (lv_unique_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'unsettable:' ( (lv_unsettable_22_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'volatile:' ( (lv_volatile_24_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_25_0= ruleAnnotation ) )* )
            {
            // InternalData.g:1066:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'opposite:' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'changeable:' ( (lv_changeable_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'derived:' ( (lv_derived_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'ordered:' ( (lv_ordered_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'transient:' ( (lv_transient_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unique:' ( (lv_unique_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'unsettable:' ( (lv_unsettable_22_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'volatile:' ( (lv_volatile_24_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_25_0= ruleAnnotation ) )* )
            // InternalData.g:1066:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'opposite:' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'changeable:' ( (lv_changeable_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'derived:' ( (lv_derived_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'ordered:' ( (lv_ordered_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'transient:' ( (lv_transient_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unique:' ( (lv_unique_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'unsettable:' ( (lv_unsettable_22_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'volatile:' ( (lv_volatile_24_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_25_0= ruleAnnotation ) )*
            {
            // InternalData.g:1066:2: ()
            // InternalData.g:1067:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalClassAssociationAccess().getLocalClassAssociationAction_0(),
                          current);
                  
            }

            }

            // InternalData.g:1072:2: ( (lv_name_1_0= ruleEString ) )
            // InternalData.g:1073:1: (lv_name_1_0= ruleEString )
            {
            // InternalData.g:1073:1: (lv_name_1_0= ruleEString )
            // InternalData.g:1074:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_24);
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
                      		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalData.g:1090:2: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalData.g:1090:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ','
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLocalClassAssociationAccess().getDescriptionKeyword_2_0());
                          
                    }
                    // InternalData.g:1094:1: ( (lv_description_3_0= ruleEString ) )
                    // InternalData.g:1095:1: (lv_description_3_0= ruleEString )
                    {
                    // InternalData.g:1095:1: (lv_description_3_0= ruleEString )
                    // InternalData.g:1096:3: lv_description_3_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_25);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getLocalClassAssociationAccess().getCommaKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // InternalData.g:1116:3: ( (lv_type_5_0= ruleAssociation_Types ) )
            // InternalData.g:1117:1: (lv_type_5_0= ruleAssociation_Types )
            {
            // InternalData.g:1117:1: (lv_type_5_0= ruleAssociation_Types )
            // InternalData.g:1118:3: lv_type_5_0= ruleAssociation_Types
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getTypeAssociation_TypesEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_26);
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
                      		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Association_Types");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalData.g:1134:2: ( (lv_cardinality_6_0= ruleCardinalities ) )
            // InternalData.g:1135:1: (lv_cardinality_6_0= ruleCardinalities )
            {
            // InternalData.g:1135:1: (lv_cardinality_6_0= ruleCardinalities )
            // InternalData.g:1136:3: lv_cardinality_6_0= ruleCardinalities
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getCardinalityCardinalitiesEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_14);
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
                      		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Cardinalities");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalData.g:1152:2: ( ( ruleFQN ) )
            // InternalData.g:1153:1: ( ruleFQN )
            {
            // InternalData.g:1153:1: ( ruleFQN )
            // InternalData.g:1154:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalClassAssociationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getLocalTargetClassCrossReference_5_0()); 
              	    
            }
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalData.g:1167:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'opposite:' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'changeable:' ( (lv_changeable_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'derived:' ( (lv_derived_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'ordered:' ( (lv_ordered_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'transient:' ( (lv_transient_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unique:' ( (lv_unique_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'unsettable:' ( (lv_unsettable_22_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'volatile:' ( (lv_volatile_24_0= ruleEBoolean ) ) ) ) ) ) )* ) ) )
            // InternalData.g:1169:1: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'opposite:' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'changeable:' ( (lv_changeable_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'derived:' ( (lv_derived_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'ordered:' ( (lv_ordered_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'transient:' ( (lv_transient_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unique:' ( (lv_unique_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'unsettable:' ( (lv_unsettable_22_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'volatile:' ( (lv_volatile_24_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            {
            // InternalData.g:1169:1: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'opposite:' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'changeable:' ( (lv_changeable_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'derived:' ( (lv_derived_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'ordered:' ( (lv_ordered_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'transient:' ( (lv_transient_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unique:' ( (lv_unique_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'unsettable:' ( (lv_unsettable_22_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'volatile:' ( (lv_volatile_24_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            // InternalData.g:1170:2: ( ( ({...}? => ( ({...}? => (otherlv_9= 'opposite:' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'changeable:' ( (lv_changeable_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'derived:' ( (lv_derived_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'ordered:' ( (lv_ordered_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'transient:' ( (lv_transient_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unique:' ( (lv_unique_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'unsettable:' ( (lv_unsettable_22_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'volatile:' ( (lv_volatile_24_0= ruleEBoolean ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());
            // InternalData.g:1173:2: ( ( ({...}? => ( ({...}? => (otherlv_9= 'opposite:' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'changeable:' ( (lv_changeable_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'derived:' ( (lv_derived_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'ordered:' ( (lv_ordered_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'transient:' ( (lv_transient_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unique:' ( (lv_unique_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'unsettable:' ( (lv_unsettable_22_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'volatile:' ( (lv_volatile_24_0= ruleEBoolean ) ) ) ) ) ) )* )
            // InternalData.g:1174:3: ( ({...}? => ( ({...}? => (otherlv_9= 'opposite:' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'changeable:' ( (lv_changeable_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'derived:' ( (lv_derived_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'ordered:' ( (lv_ordered_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'transient:' ( (lv_transient_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unique:' ( (lv_unique_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'unsettable:' ( (lv_unsettable_22_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'volatile:' ( (lv_volatile_24_0= ruleEBoolean ) ) ) ) ) ) )*
            {
            // InternalData.g:1174:3: ( ({...}? => ( ({...}? => (otherlv_9= 'opposite:' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'changeable:' ( (lv_changeable_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'derived:' ( (lv_derived_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'ordered:' ( (lv_ordered_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'transient:' ( (lv_transient_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unique:' ( (lv_unique_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'unsettable:' ( (lv_unsettable_22_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'volatile:' ( (lv_volatile_24_0= ruleEBoolean ) ) ) ) ) ) )*
            loop27:
            do {
                int alt27=9;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // InternalData.g:1176:4: ({...}? => ( ({...}? => (otherlv_9= 'opposite:' ( ( ruleFQN ) ) ) ) ) )
            	    {
            	    // InternalData.g:1176:4: ({...}? => ( ({...}? => (otherlv_9= 'opposite:' ( ( ruleFQN ) ) ) ) ) )
            	    // InternalData.g:1177:5: {...}? => ( ({...}? => (otherlv_9= 'opposite:' ( ( ruleFQN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 0)");
            	    }
            	    // InternalData.g:1177:118: ( ({...}? => (otherlv_9= 'opposite:' ( ( ruleFQN ) ) ) ) )
            	    // InternalData.g:1178:6: ({...}? => (otherlv_9= 'opposite:' ( ( ruleFQN ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 0);
            	    // InternalData.g:1181:6: ({...}? => (otherlv_9= 'opposite:' ( ( ruleFQN ) ) ) )
            	    // InternalData.g:1181:7: {...}? => (otherlv_9= 'opposite:' ( ( ruleFQN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "true");
            	    }
            	    // InternalData.g:1181:16: (otherlv_9= 'opposite:' ( ( ruleFQN ) ) )
            	    // InternalData.g:1181:18: otherlv_9= 'opposite:' ( ( ruleFQN ) )
            	    {
            	    otherlv_9=(Token)match(input,28,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getLocalClassAssociationAccess().getOppositeKeyword_6_0_0());
            	          
            	    }
            	    // InternalData.g:1185:1: ( ( ruleFQN ) )
            	    // InternalData.g:1186:1: ( ruleFQN )
            	    {
            	    // InternalData.g:1186:1: ( ruleFQN )
            	    // InternalData.g:1187:3: ruleFQN
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getLocalClassAssociationRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getOppositeLocalClassAssociationCrossReference_6_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_27);
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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalData.g:1207:4: ({...}? => ( ({...}? => (otherlv_11= 'changeable:' ( (lv_changeable_12_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalData.g:1207:4: ({...}? => ( ({...}? => (otherlv_11= 'changeable:' ( (lv_changeable_12_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalData.g:1208:5: {...}? => ( ({...}? => (otherlv_11= 'changeable:' ( (lv_changeable_12_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 1)");
            	    }
            	    // InternalData.g:1208:118: ( ({...}? => (otherlv_11= 'changeable:' ( (lv_changeable_12_0= ruleEBoolean ) ) ) ) )
            	    // InternalData.g:1209:6: ({...}? => (otherlv_11= 'changeable:' ( (lv_changeable_12_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 1);
            	    // InternalData.g:1212:6: ({...}? => (otherlv_11= 'changeable:' ( (lv_changeable_12_0= ruleEBoolean ) ) ) )
            	    // InternalData.g:1212:7: {...}? => (otherlv_11= 'changeable:' ( (lv_changeable_12_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "true");
            	    }
            	    // InternalData.g:1212:16: (otherlv_11= 'changeable:' ( (lv_changeable_12_0= ruleEBoolean ) ) )
            	    // InternalData.g:1212:18: otherlv_11= 'changeable:' ( (lv_changeable_12_0= ruleEBoolean ) )
            	    {
            	    otherlv_11=(Token)match(input,29,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getLocalClassAssociationAccess().getChangeableKeyword_6_1_0());
            	          
            	    }
            	    // InternalData.g:1216:1: ( (lv_changeable_12_0= ruleEBoolean ) )
            	    // InternalData.g:1217:1: (lv_changeable_12_0= ruleEBoolean )
            	    {
            	    // InternalData.g:1217:1: (lv_changeable_12_0= ruleEBoolean )
            	    // InternalData.g:1218:3: lv_changeable_12_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getChangeableEBooleanParserRuleCall_6_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_changeable_12_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"changeable",
            	              		lv_changeable_12_0, 
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
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
            	    // InternalData.g:1241:4: ({...}? => ( ({...}? => (otherlv_13= 'derived:' ( (lv_derived_14_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalData.g:1241:4: ({...}? => ( ({...}? => (otherlv_13= 'derived:' ( (lv_derived_14_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalData.g:1242:5: {...}? => ( ({...}? => (otherlv_13= 'derived:' ( (lv_derived_14_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 2)");
            	    }
            	    // InternalData.g:1242:118: ( ({...}? => (otherlv_13= 'derived:' ( (lv_derived_14_0= ruleEBoolean ) ) ) ) )
            	    // InternalData.g:1243:6: ({...}? => (otherlv_13= 'derived:' ( (lv_derived_14_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 2);
            	    // InternalData.g:1246:6: ({...}? => (otherlv_13= 'derived:' ( (lv_derived_14_0= ruleEBoolean ) ) ) )
            	    // InternalData.g:1246:7: {...}? => (otherlv_13= 'derived:' ( (lv_derived_14_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "true");
            	    }
            	    // InternalData.g:1246:16: (otherlv_13= 'derived:' ( (lv_derived_14_0= ruleEBoolean ) ) )
            	    // InternalData.g:1246:18: otherlv_13= 'derived:' ( (lv_derived_14_0= ruleEBoolean ) )
            	    {
            	    otherlv_13=(Token)match(input,30,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getLocalClassAssociationAccess().getDerivedKeyword_6_2_0());
            	          
            	    }
            	    // InternalData.g:1250:1: ( (lv_derived_14_0= ruleEBoolean ) )
            	    // InternalData.g:1251:1: (lv_derived_14_0= ruleEBoolean )
            	    {
            	    // InternalData.g:1251:1: (lv_derived_14_0= ruleEBoolean )
            	    // InternalData.g:1252:3: lv_derived_14_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getDerivedEBooleanParserRuleCall_6_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_derived_14_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"derived",
            	              		lv_derived_14_0, 
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
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
            	    // InternalData.g:1275:4: ({...}? => ( ({...}? => (otherlv_15= 'ordered:' ( (lv_ordered_16_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalData.g:1275:4: ({...}? => ( ({...}? => (otherlv_15= 'ordered:' ( (lv_ordered_16_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalData.g:1276:5: {...}? => ( ({...}? => (otherlv_15= 'ordered:' ( (lv_ordered_16_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 3)");
            	    }
            	    // InternalData.g:1276:118: ( ({...}? => (otherlv_15= 'ordered:' ( (lv_ordered_16_0= ruleEBoolean ) ) ) ) )
            	    // InternalData.g:1277:6: ({...}? => (otherlv_15= 'ordered:' ( (lv_ordered_16_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 3);
            	    // InternalData.g:1280:6: ({...}? => (otherlv_15= 'ordered:' ( (lv_ordered_16_0= ruleEBoolean ) ) ) )
            	    // InternalData.g:1280:7: {...}? => (otherlv_15= 'ordered:' ( (lv_ordered_16_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "true");
            	    }
            	    // InternalData.g:1280:16: (otherlv_15= 'ordered:' ( (lv_ordered_16_0= ruleEBoolean ) ) )
            	    // InternalData.g:1280:18: otherlv_15= 'ordered:' ( (lv_ordered_16_0= ruleEBoolean ) )
            	    {
            	    otherlv_15=(Token)match(input,31,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getLocalClassAssociationAccess().getOrderedKeyword_6_3_0());
            	          
            	    }
            	    // InternalData.g:1284:1: ( (lv_ordered_16_0= ruleEBoolean ) )
            	    // InternalData.g:1285:1: (lv_ordered_16_0= ruleEBoolean )
            	    {
            	    // InternalData.g:1285:1: (lv_ordered_16_0= ruleEBoolean )
            	    // InternalData.g:1286:3: lv_ordered_16_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getOrderedEBooleanParserRuleCall_6_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_ordered_16_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"ordered",
            	              		lv_ordered_16_0, 
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
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
            	    // InternalData.g:1309:4: ({...}? => ( ({...}? => (otherlv_17= 'transient:' ( (lv_transient_18_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalData.g:1309:4: ({...}? => ( ({...}? => (otherlv_17= 'transient:' ( (lv_transient_18_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalData.g:1310:5: {...}? => ( ({...}? => (otherlv_17= 'transient:' ( (lv_transient_18_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 4)");
            	    }
            	    // InternalData.g:1310:118: ( ({...}? => (otherlv_17= 'transient:' ( (lv_transient_18_0= ruleEBoolean ) ) ) ) )
            	    // InternalData.g:1311:6: ({...}? => (otherlv_17= 'transient:' ( (lv_transient_18_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 4);
            	    // InternalData.g:1314:6: ({...}? => (otherlv_17= 'transient:' ( (lv_transient_18_0= ruleEBoolean ) ) ) )
            	    // InternalData.g:1314:7: {...}? => (otherlv_17= 'transient:' ( (lv_transient_18_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "true");
            	    }
            	    // InternalData.g:1314:16: (otherlv_17= 'transient:' ( (lv_transient_18_0= ruleEBoolean ) ) )
            	    // InternalData.g:1314:18: otherlv_17= 'transient:' ( (lv_transient_18_0= ruleEBoolean ) )
            	    {
            	    otherlv_17=(Token)match(input,32,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_17, grammarAccess.getLocalClassAssociationAccess().getTransientKeyword_6_4_0());
            	          
            	    }
            	    // InternalData.g:1318:1: ( (lv_transient_18_0= ruleEBoolean ) )
            	    // InternalData.g:1319:1: (lv_transient_18_0= ruleEBoolean )
            	    {
            	    // InternalData.g:1319:1: (lv_transient_18_0= ruleEBoolean )
            	    // InternalData.g:1320:3: lv_transient_18_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getTransientEBooleanParserRuleCall_6_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_transient_18_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"transient",
            	              		lv_transient_18_0, 
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
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
            	    // InternalData.g:1343:4: ({...}? => ( ({...}? => (otherlv_19= 'unique:' ( (lv_unique_20_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalData.g:1343:4: ({...}? => ( ({...}? => (otherlv_19= 'unique:' ( (lv_unique_20_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalData.g:1344:5: {...}? => ( ({...}? => (otherlv_19= 'unique:' ( (lv_unique_20_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 5)");
            	    }
            	    // InternalData.g:1344:118: ( ({...}? => (otherlv_19= 'unique:' ( (lv_unique_20_0= ruleEBoolean ) ) ) ) )
            	    // InternalData.g:1345:6: ({...}? => (otherlv_19= 'unique:' ( (lv_unique_20_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 5);
            	    // InternalData.g:1348:6: ({...}? => (otherlv_19= 'unique:' ( (lv_unique_20_0= ruleEBoolean ) ) ) )
            	    // InternalData.g:1348:7: {...}? => (otherlv_19= 'unique:' ( (lv_unique_20_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "true");
            	    }
            	    // InternalData.g:1348:16: (otherlv_19= 'unique:' ( (lv_unique_20_0= ruleEBoolean ) ) )
            	    // InternalData.g:1348:18: otherlv_19= 'unique:' ( (lv_unique_20_0= ruleEBoolean ) )
            	    {
            	    otherlv_19=(Token)match(input,33,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_19, grammarAccess.getLocalClassAssociationAccess().getUniqueKeyword_6_5_0());
            	          
            	    }
            	    // InternalData.g:1352:1: ( (lv_unique_20_0= ruleEBoolean ) )
            	    // InternalData.g:1353:1: (lv_unique_20_0= ruleEBoolean )
            	    {
            	    // InternalData.g:1353:1: (lv_unique_20_0= ruleEBoolean )
            	    // InternalData.g:1354:3: lv_unique_20_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getUniqueEBooleanParserRuleCall_6_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_unique_20_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"unique",
            	              		lv_unique_20_0, 
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
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
            	    // InternalData.g:1377:4: ({...}? => ( ({...}? => (otherlv_21= 'unsettable:' ( (lv_unsettable_22_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalData.g:1377:4: ({...}? => ( ({...}? => (otherlv_21= 'unsettable:' ( (lv_unsettable_22_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalData.g:1378:5: {...}? => ( ({...}? => (otherlv_21= 'unsettable:' ( (lv_unsettable_22_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 6)");
            	    }
            	    // InternalData.g:1378:118: ( ({...}? => (otherlv_21= 'unsettable:' ( (lv_unsettable_22_0= ruleEBoolean ) ) ) ) )
            	    // InternalData.g:1379:6: ({...}? => (otherlv_21= 'unsettable:' ( (lv_unsettable_22_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 6);
            	    // InternalData.g:1382:6: ({...}? => (otherlv_21= 'unsettable:' ( (lv_unsettable_22_0= ruleEBoolean ) ) ) )
            	    // InternalData.g:1382:7: {...}? => (otherlv_21= 'unsettable:' ( (lv_unsettable_22_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "true");
            	    }
            	    // InternalData.g:1382:16: (otherlv_21= 'unsettable:' ( (lv_unsettable_22_0= ruleEBoolean ) ) )
            	    // InternalData.g:1382:18: otherlv_21= 'unsettable:' ( (lv_unsettable_22_0= ruleEBoolean ) )
            	    {
            	    otherlv_21=(Token)match(input,34,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_21, grammarAccess.getLocalClassAssociationAccess().getUnsettableKeyword_6_6_0());
            	          
            	    }
            	    // InternalData.g:1386:1: ( (lv_unsettable_22_0= ruleEBoolean ) )
            	    // InternalData.g:1387:1: (lv_unsettable_22_0= ruleEBoolean )
            	    {
            	    // InternalData.g:1387:1: (lv_unsettable_22_0= ruleEBoolean )
            	    // InternalData.g:1388:3: lv_unsettable_22_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getUnsettableEBooleanParserRuleCall_6_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_unsettable_22_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"unsettable",
            	              		lv_unsettable_22_0, 
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
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
            	case 8 :
            	    // InternalData.g:1411:4: ({...}? => ( ({...}? => (otherlv_23= 'volatile:' ( (lv_volatile_24_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalData.g:1411:4: ({...}? => ( ({...}? => (otherlv_23= 'volatile:' ( (lv_volatile_24_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalData.g:1412:5: {...}? => ( ({...}? => (otherlv_23= 'volatile:' ( (lv_volatile_24_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 7) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 7)");
            	    }
            	    // InternalData.g:1412:118: ( ({...}? => (otherlv_23= 'volatile:' ( (lv_volatile_24_0= ruleEBoolean ) ) ) ) )
            	    // InternalData.g:1413:6: ({...}? => (otherlv_23= 'volatile:' ( (lv_volatile_24_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 7);
            	    // InternalData.g:1416:6: ({...}? => (otherlv_23= 'volatile:' ( (lv_volatile_24_0= ruleEBoolean ) ) ) )
            	    // InternalData.g:1416:7: {...}? => (otherlv_23= 'volatile:' ( (lv_volatile_24_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleLocalClassAssociation", "true");
            	    }
            	    // InternalData.g:1416:16: (otherlv_23= 'volatile:' ( (lv_volatile_24_0= ruleEBoolean ) ) )
            	    // InternalData.g:1416:18: otherlv_23= 'volatile:' ( (lv_volatile_24_0= ruleEBoolean ) )
            	    {
            	    otherlv_23=(Token)match(input,35,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_23, grammarAccess.getLocalClassAssociationAccess().getVolatileKeyword_6_7_0());
            	          
            	    }
            	    // InternalData.g:1420:1: ( (lv_volatile_24_0= ruleEBoolean ) )
            	    // InternalData.g:1421:1: (lv_volatile_24_0= ruleEBoolean )
            	    {
            	    // InternalData.g:1421:1: (lv_volatile_24_0= ruleEBoolean )
            	    // InternalData.g:1422:3: lv_volatile_24_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getVolatileEBooleanParserRuleCall_6_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_volatile_24_0=ruleEBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"volatile",
            	              		lv_volatile_24_0, 
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
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

            // InternalData.g:1452:2: ( (lv_owned_annotations_25_0= ruleAnnotation ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==44) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalData.g:1453:1: (lv_owned_annotations_25_0= ruleAnnotation )
            	    {
            	    // InternalData.g:1453:1: (lv_owned_annotations_25_0= ruleAnnotation )
            	    // InternalData.g:1454:3: lv_owned_annotations_25_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getOwned_annotationsAnnotationParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_owned_annotations_25_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"owned_annotations",
            	              		lv_owned_annotations_25_0, 
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Annotation");
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
    // InternalData.g:1478:1: entryRuleExternalClassAssociation returns [EObject current=null] : iv_ruleExternalClassAssociation= ruleExternalClassAssociation EOF ;
    public final EObject entryRuleExternalClassAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalClassAssociation = null;


        try {
            // InternalData.g:1479:2: (iv_ruleExternalClassAssociation= ruleExternalClassAssociation EOF )
            // InternalData.g:1480:2: iv_ruleExternalClassAssociation= ruleExternalClassAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternalClassAssociationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExternalClassAssociation=ruleExternalClassAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternalClassAssociation; 
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
    // $ANTLR end "entryRuleExternalClassAssociation"


    // $ANTLR start "ruleExternalClassAssociation"
    // InternalData.g:1487:1: ruleExternalClassAssociation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) otherlv_7= 'external' ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_24_0= ruleAnnotation ) )* ) ;
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
            // InternalData.g:1490:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) otherlv_7= 'external' ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_24_0= ruleAnnotation ) )* ) )
            // InternalData.g:1491:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) otherlv_7= 'external' ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_24_0= ruleAnnotation ) )* )
            {
            // InternalData.g:1491:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) otherlv_7= 'external' ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_24_0= ruleAnnotation ) )* )
            // InternalData.g:1491:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_type_5_0= ruleAssociation_Types ) ) ( (lv_cardinality_6_0= ruleCardinalities ) ) otherlv_7= 'external' ( ( ruleFQN ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) ( (lv_owned_annotations_24_0= ruleAnnotation ) )*
            {
            // InternalData.g:1491:2: ()
            // InternalData.g:1492:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExternalClassAssociationAccess().getExternalClassAssociationAction_0(),
                          current);
                  
            }

            }

            // InternalData.g:1497:2: ( (lv_name_1_0= ruleEString ) )
            // InternalData.g:1498:1: (lv_name_1_0= ruleEString )
            {
            // InternalData.g:1498:1: (lv_name_1_0= ruleEString )
            // InternalData.g:1499:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_24);
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
                      		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalData.g:1515:2: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==27) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalData.g:1515:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ','
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExternalClassAssociationAccess().getDescriptionKeyword_2_0());
                          
                    }
                    // InternalData.g:1519:1: ( (lv_description_3_0= ruleEString ) )
                    // InternalData.g:1520:1: (lv_description_3_0= ruleEString )
                    {
                    // InternalData.g:1520:1: (lv_description_3_0= ruleEString )
                    // InternalData.g:1521:3: lv_description_3_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_25);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getExternalClassAssociationAccess().getCommaKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // InternalData.g:1541:3: ( (lv_type_5_0= ruleAssociation_Types ) )
            // InternalData.g:1542:1: (lv_type_5_0= ruleAssociation_Types )
            {
            // InternalData.g:1542:1: (lv_type_5_0= ruleAssociation_Types )
            // InternalData.g:1543:3: lv_type_5_0= ruleAssociation_Types
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getTypeAssociation_TypesEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_26);
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
                      		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Association_Types");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalData.g:1559:2: ( (lv_cardinality_6_0= ruleCardinalities ) )
            // InternalData.g:1560:1: (lv_cardinality_6_0= ruleCardinalities )
            {
            // InternalData.g:1560:1: (lv_cardinality_6_0= ruleCardinalities )
            // InternalData.g:1561:3: lv_cardinality_6_0= ruleCardinalities
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getCardinalityCardinalitiesEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_29);
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
                      		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Cardinalities");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,11,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getExternalClassAssociationAccess().getExternalKeyword_5());
                  
            }
            // InternalData.g:1581:1: ( ( ruleFQN ) )
            // InternalData.g:1582:1: ( ruleFQN )
            {
            // InternalData.g:1582:1: ( ruleFQN )
            // InternalData.g:1583:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExternalClassAssociationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getExternalTargetEClassCrossReference_6_0()); 
              	    
            }
            pushFollow(FOLLOW_30);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalData.g:1596:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) )
            // InternalData.g:1598:1: ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            {
            // InternalData.g:1598:1: ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            // InternalData.g:1599:2: ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7());
            // InternalData.g:1602:2: ( ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* )
            // InternalData.g:1603:3: ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )*
            {
            // InternalData.g:1603:3: ( ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )*
            loop30:
            do {
                int alt30=8;
                int LA30_0 = input.LA(1);

                if ( LA30_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 0) ) {
                    alt30=1;
                }
                else if ( LA30_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 1) ) {
                    alt30=2;
                }
                else if ( LA30_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 2) ) {
                    alt30=3;
                }
                else if ( LA30_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 3) ) {
                    alt30=4;
                }
                else if ( LA30_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 4) ) {
                    alt30=5;
                }
                else if ( LA30_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 5) ) {
                    alt30=6;
                }
                else if ( LA30_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 6) ) {
                    alt30=7;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalData.g:1605:4: ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalData.g:1605:4: ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalData.g:1606:5: {...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 0)");
            	    }
            	    // InternalData.g:1606:121: ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) )
            	    // InternalData.g:1607:6: ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 0);
            	    // InternalData.g:1610:6: ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) )
            	    // InternalData.g:1610:7: {...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "true");
            	    }
            	    // InternalData.g:1610:16: (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) )
            	    // InternalData.g:1610:18: otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) )
            	    {
            	    otherlv_10=(Token)match(input,29,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getExternalClassAssociationAccess().getChangeableKeyword_7_0_0());
            	          
            	    }
            	    // InternalData.g:1614:1: ( (lv_changeable_11_0= ruleEBoolean ) )
            	    // InternalData.g:1615:1: (lv_changeable_11_0= ruleEBoolean )
            	    {
            	    // InternalData.g:1615:1: (lv_changeable_11_0= ruleEBoolean )
            	    // InternalData.g:1616:3: lv_changeable_11_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getChangeableEBooleanParserRuleCall_7_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_30);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
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
            	    // InternalData.g:1639:4: ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalData.g:1639:4: ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalData.g:1640:5: {...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 1)");
            	    }
            	    // InternalData.g:1640:121: ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) )
            	    // InternalData.g:1641:6: ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 1);
            	    // InternalData.g:1644:6: ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) )
            	    // InternalData.g:1644:7: {...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "true");
            	    }
            	    // InternalData.g:1644:16: (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) )
            	    // InternalData.g:1644:18: otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) )
            	    {
            	    otherlv_12=(Token)match(input,30,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getExternalClassAssociationAccess().getDerivedKeyword_7_1_0());
            	          
            	    }
            	    // InternalData.g:1648:1: ( (lv_derived_13_0= ruleEBoolean ) )
            	    // InternalData.g:1649:1: (lv_derived_13_0= ruleEBoolean )
            	    {
            	    // InternalData.g:1649:1: (lv_derived_13_0= ruleEBoolean )
            	    // InternalData.g:1650:3: lv_derived_13_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getDerivedEBooleanParserRuleCall_7_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_30);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
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
            	    // InternalData.g:1673:4: ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalData.g:1673:4: ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalData.g:1674:5: {...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 2)");
            	    }
            	    // InternalData.g:1674:121: ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) )
            	    // InternalData.g:1675:6: ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 2);
            	    // InternalData.g:1678:6: ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) )
            	    // InternalData.g:1678:7: {...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "true");
            	    }
            	    // InternalData.g:1678:16: (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) )
            	    // InternalData.g:1678:18: otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) )
            	    {
            	    otherlv_14=(Token)match(input,31,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getExternalClassAssociationAccess().getOrderedKeyword_7_2_0());
            	          
            	    }
            	    // InternalData.g:1682:1: ( (lv_ordered_15_0= ruleEBoolean ) )
            	    // InternalData.g:1683:1: (lv_ordered_15_0= ruleEBoolean )
            	    {
            	    // InternalData.g:1683:1: (lv_ordered_15_0= ruleEBoolean )
            	    // InternalData.g:1684:3: lv_ordered_15_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getOrderedEBooleanParserRuleCall_7_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_30);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
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
            	    // InternalData.g:1707:4: ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalData.g:1707:4: ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalData.g:1708:5: {...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 3)");
            	    }
            	    // InternalData.g:1708:121: ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) )
            	    // InternalData.g:1709:6: ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 3);
            	    // InternalData.g:1712:6: ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) )
            	    // InternalData.g:1712:7: {...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "true");
            	    }
            	    // InternalData.g:1712:16: (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) )
            	    // InternalData.g:1712:18: otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) )
            	    {
            	    otherlv_16=(Token)match(input,32,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getExternalClassAssociationAccess().getTransientKeyword_7_3_0());
            	          
            	    }
            	    // InternalData.g:1716:1: ( (lv_transient_17_0= ruleEBoolean ) )
            	    // InternalData.g:1717:1: (lv_transient_17_0= ruleEBoolean )
            	    {
            	    // InternalData.g:1717:1: (lv_transient_17_0= ruleEBoolean )
            	    // InternalData.g:1718:3: lv_transient_17_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getTransientEBooleanParserRuleCall_7_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_30);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
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
            	    // InternalData.g:1741:4: ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalData.g:1741:4: ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalData.g:1742:5: {...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 4)");
            	    }
            	    // InternalData.g:1742:121: ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) )
            	    // InternalData.g:1743:6: ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 4);
            	    // InternalData.g:1746:6: ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) )
            	    // InternalData.g:1746:7: {...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "true");
            	    }
            	    // InternalData.g:1746:16: (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) )
            	    // InternalData.g:1746:18: otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) )
            	    {
            	    otherlv_18=(Token)match(input,33,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_18, grammarAccess.getExternalClassAssociationAccess().getUniqueKeyword_7_4_0());
            	          
            	    }
            	    // InternalData.g:1750:1: ( (lv_unique_19_0= ruleEBoolean ) )
            	    // InternalData.g:1751:1: (lv_unique_19_0= ruleEBoolean )
            	    {
            	    // InternalData.g:1751:1: (lv_unique_19_0= ruleEBoolean )
            	    // InternalData.g:1752:3: lv_unique_19_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getUniqueEBooleanParserRuleCall_7_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_30);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
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
            	    // InternalData.g:1775:4: ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalData.g:1775:4: ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalData.g:1776:5: {...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 5)");
            	    }
            	    // InternalData.g:1776:121: ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) )
            	    // InternalData.g:1777:6: ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 5);
            	    // InternalData.g:1780:6: ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) )
            	    // InternalData.g:1780:7: {...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "true");
            	    }
            	    // InternalData.g:1780:16: (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) )
            	    // InternalData.g:1780:18: otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) )
            	    {
            	    otherlv_20=(Token)match(input,34,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_20, grammarAccess.getExternalClassAssociationAccess().getUnsettableKeyword_7_5_0());
            	          
            	    }
            	    // InternalData.g:1784:1: ( (lv_unsettable_21_0= ruleEBoolean ) )
            	    // InternalData.g:1785:1: (lv_unsettable_21_0= ruleEBoolean )
            	    {
            	    // InternalData.g:1785:1: (lv_unsettable_21_0= ruleEBoolean )
            	    // InternalData.g:1786:3: lv_unsettable_21_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getUnsettableEBooleanParserRuleCall_7_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_30);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
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
            	    // InternalData.g:1809:4: ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalData.g:1809:4: ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalData.g:1810:5: {...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 6)");
            	    }
            	    // InternalData.g:1810:121: ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) )
            	    // InternalData.g:1811:6: ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 6);
            	    // InternalData.g:1814:6: ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) )
            	    // InternalData.g:1814:7: {...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleExternalClassAssociation", "true");
            	    }
            	    // InternalData.g:1814:16: (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) )
            	    // InternalData.g:1814:18: otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) )
            	    {
            	    otherlv_22=(Token)match(input,35,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_22, grammarAccess.getExternalClassAssociationAccess().getVolatileKeyword_7_6_0());
            	          
            	    }
            	    // InternalData.g:1818:1: ( (lv_volatile_23_0= ruleEBoolean ) )
            	    // InternalData.g:1819:1: (lv_volatile_23_0= ruleEBoolean )
            	    {
            	    // InternalData.g:1819:1: (lv_volatile_23_0= ruleEBoolean )
            	    // InternalData.g:1820:3: lv_volatile_23_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getVolatileEBooleanParserRuleCall_7_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_30);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
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

            // InternalData.g:1850:2: ( (lv_owned_annotations_24_0= ruleAnnotation ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==44) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalData.g:1851:1: (lv_owned_annotations_24_0= ruleAnnotation )
            	    {
            	    // InternalData.g:1851:1: (lv_owned_annotations_24_0= ruleAnnotation )
            	    // InternalData.g:1852:3: lv_owned_annotations_24_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getOwned_annotationsAnnotationParserRuleCall_8_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_28);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Annotation");
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
    // InternalData.g:1876:1: entryRuleAbstractAttributeType returns [EObject current=null] : iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF ;
    public final EObject entryRuleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAttributeType = null;


        try {
            // InternalData.g:1877:2: (iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF )
            // InternalData.g:1878:2: iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractAttributeTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbstractAttributeType=ruleAbstractAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractAttributeType; 
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
    // $ANTLR end "entryRuleAbstractAttributeType"


    // $ANTLR start "ruleAbstractAttributeType"
    // InternalData.g:1885:1: ruleAbstractAttributeType returns [EObject current=null] : (this_LocalAttributeType_0= ruleLocalAttributeType | this_ExternalAttributeType_1= ruleExternalAttributeType ) ;
    public final EObject ruleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_LocalAttributeType_0 = null;

        EObject this_ExternalAttributeType_1 = null;


         enterRule(); 
            
        try {
            // InternalData.g:1888:28: ( (this_LocalAttributeType_0= ruleLocalAttributeType | this_ExternalAttributeType_1= ruleExternalAttributeType ) )
            // InternalData.g:1889:1: (this_LocalAttributeType_0= ruleLocalAttributeType | this_ExternalAttributeType_1= ruleExternalAttributeType )
            {
            // InternalData.g:1889:1: (this_LocalAttributeType_0= ruleLocalAttributeType | this_ExternalAttributeType_1= ruleExternalAttributeType )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            else if ( (LA32_0==37) ) {
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
                    // InternalData.g:1890:5: this_LocalAttributeType_0= ruleLocalAttributeType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractAttributeTypeAccess().getLocalAttributeTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalData.g:1900:5: this_ExternalAttributeType_1= ruleExternalAttributeType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractAttributeTypeAccess().getExternalAttributeTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalData.g:1916:1: entryRuleLocalAttributeType returns [EObject current=null] : iv_ruleLocalAttributeType= ruleLocalAttributeType EOF ;
    public final EObject entryRuleLocalAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalAttributeType = null;


        try {
            // InternalData.g:1917:2: (iv_ruleLocalAttributeType= ruleLocalAttributeType EOF )
            // InternalData.g:1918:2: iv_ruleLocalAttributeType= ruleLocalAttributeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalAttributeTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLocalAttributeType=ruleLocalAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalAttributeType; 
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
    // $ANTLR end "entryRuleLocalAttributeType"


    // $ANTLR start "ruleLocalAttributeType"
    // InternalData.g:1925:1: ruleLocalAttributeType returns [EObject current=null] : ( () otherlv_1= 'enum' ( ( ruleFQN ) ) ) ;
    public final EObject ruleLocalAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalData.g:1928:28: ( ( () otherlv_1= 'enum' ( ( ruleFQN ) ) ) )
            // InternalData.g:1929:1: ( () otherlv_1= 'enum' ( ( ruleFQN ) ) )
            {
            // InternalData.g:1929:1: ( () otherlv_1= 'enum' ( ( ruleFQN ) ) )
            // InternalData.g:1929:2: () otherlv_1= 'enum' ( ( ruleFQN ) )
            {
            // InternalData.g:1929:2: ()
            // InternalData.g:1930:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalAttributeTypeAccess().getLocalAttributeTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalAttributeTypeAccess().getEnumKeyword_1());
                  
            }
            // InternalData.g:1939:1: ( ( ruleFQN ) )
            // InternalData.g:1940:1: ( ruleFQN )
            {
            // InternalData.g:1940:1: ( ruleFQN )
            // InternalData.g:1941:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalAttributeTypeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalAttributeTypeAccess().getTypeEnumerationCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
    // InternalData.g:1962:1: entryRuleExternalAttributeType returns [EObject current=null] : iv_ruleExternalAttributeType= ruleExternalAttributeType EOF ;
    public final EObject entryRuleExternalAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalAttributeType = null;


        try {
            // InternalData.g:1963:2: (iv_ruleExternalAttributeType= ruleExternalAttributeType EOF )
            // InternalData.g:1964:2: iv_ruleExternalAttributeType= ruleExternalAttributeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternalAttributeTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExternalAttributeType=ruleExternalAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternalAttributeType; 
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
    // $ANTLR end "entryRuleExternalAttributeType"


    // $ANTLR start "ruleExternalAttributeType"
    // InternalData.g:1971:1: ruleExternalAttributeType returns [EObject current=null] : ( () otherlv_1= 'type' ( ( ruleFQN ) ) ) ;
    public final EObject ruleExternalAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalData.g:1974:28: ( ( () otherlv_1= 'type' ( ( ruleFQN ) ) ) )
            // InternalData.g:1975:1: ( () otherlv_1= 'type' ( ( ruleFQN ) ) )
            {
            // InternalData.g:1975:1: ( () otherlv_1= 'type' ( ( ruleFQN ) ) )
            // InternalData.g:1975:2: () otherlv_1= 'type' ( ( ruleFQN ) )
            {
            // InternalData.g:1975:2: ()
            // InternalData.g:1976:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExternalAttributeTypeAccess().getExternalAttributeTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExternalAttributeTypeAccess().getTypeKeyword_1());
                  
            }
            // InternalData.g:1985:1: ( ( ruleFQN ) )
            // InternalData.g:1986:1: ( ruleFQN )
            {
            // InternalData.g:1986:1: ( ruleFQN )
            // InternalData.g:1987:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExternalAttributeTypeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExternalAttributeTypeAccess().getTypeEDataTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
    // InternalData.g:2008:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalData.g:2009:2: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalData.g:2010:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalData.g:2017:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_owned_type_5_0= ruleAbstractAttributeType ) ) ( (lv_cardinality_6_0= ruleCardinalities ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (otherlv_24= 'values' otherlv_25= '(' ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )? otherlv_29= ')' )? ( (lv_owned_annotations_30_0= ruleAnnotation ) )* ) ;
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
            // InternalData.g:2020:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_owned_type_5_0= ruleAbstractAttributeType ) ) ( (lv_cardinality_6_0= ruleCardinalities ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (otherlv_24= 'values' otherlv_25= '(' ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )? otherlv_29= ')' )? ( (lv_owned_annotations_30_0= ruleAnnotation ) )* ) )
            // InternalData.g:2021:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_owned_type_5_0= ruleAbstractAttributeType ) ) ( (lv_cardinality_6_0= ruleCardinalities ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (otherlv_24= 'values' otherlv_25= '(' ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )? otherlv_29= ')' )? ( (lv_owned_annotations_30_0= ruleAnnotation ) )* )
            {
            // InternalData.g:2021:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_owned_type_5_0= ruleAbstractAttributeType ) ) ( (lv_cardinality_6_0= ruleCardinalities ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (otherlv_24= 'values' otherlv_25= '(' ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )? otherlv_29= ')' )? ( (lv_owned_annotations_30_0= ruleAnnotation ) )* )
            // InternalData.g:2021:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )? ( (lv_owned_type_5_0= ruleAbstractAttributeType ) ) ( (lv_cardinality_6_0= ruleCardinalities ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (otherlv_24= 'values' otherlv_25= '(' ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )? otherlv_29= ')' )? ( (lv_owned_annotations_30_0= ruleAnnotation ) )*
            {
            // InternalData.g:2021:2: ()
            // InternalData.g:2022:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAttributeAccess().getAttributeAction_0(),
                          current);
                  
            }

            }

            // InternalData.g:2027:2: ( (lv_name_1_0= ruleEString ) )
            // InternalData.g:2028:1: (lv_name_1_0= ruleEString )
            {
            // InternalData.g:2028:1: (lv_name_1_0= ruleEString )
            // InternalData.g:2029:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_31);
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
                      		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalData.g:2045:2: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ',' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalData.g:2045:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= ','
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getDescriptionKeyword_2_0());
                          
                    }
                    // InternalData.g:2049:1: ( (lv_description_3_0= ruleEString ) )
                    // InternalData.g:2050:1: (lv_description_3_0= ruleEString )
                    {
                    // InternalData.g:2050:1: (lv_description_3_0= ruleEString )
                    // InternalData.g:2051:3: lv_description_3_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_25);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getCommaKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // InternalData.g:2071:3: ( (lv_owned_type_5_0= ruleAbstractAttributeType ) )
            // InternalData.g:2072:1: (lv_owned_type_5_0= ruleAbstractAttributeType )
            {
            // InternalData.g:2072:1: (lv_owned_type_5_0= ruleAbstractAttributeType )
            // InternalData.g:2073:3: lv_owned_type_5_0= ruleAbstractAttributeType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getOwned_typeAbstractAttributeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_32);
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
                      		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.AbstractAttributeType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalData.g:2089:2: ( (lv_cardinality_6_0= ruleCardinalities ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=52 && LA34_0<=55)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalData.g:2090:1: (lv_cardinality_6_0= ruleCardinalities )
                    {
                    // InternalData.g:2090:1: (lv_cardinality_6_0= ruleCardinalities )
                    // InternalData.g:2091:3: lv_cardinality_6_0= ruleCardinalities
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeAccess().getCardinalityCardinalitiesEnumRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_33);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Cardinalities");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalData.g:2107:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) ) )
            // InternalData.g:2109:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            {
            // InternalData.g:2109:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            // InternalData.g:2110:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_5());
            // InternalData.g:2113:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )* )
            // InternalData.g:2114:3: ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )*
            {
            // InternalData.g:2114:3: ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )*
            loop35:
            do {
                int alt35=9;
                alt35 = dfa35.predict(input);
                switch (alt35) {
            	case 1 :
            	    // InternalData.g:2116:4: ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalData.g:2116:4: ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalData.g:2117:5: {...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalData.g:2117:106: ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) )
            	    // InternalData.g:2118:6: ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 0);
            	    // InternalData.g:2121:6: ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) )
            	    // InternalData.g:2121:7: {...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // InternalData.g:2121:16: (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) )
            	    // InternalData.g:2121:18: otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) )
            	    {
            	    otherlv_8=(Token)match(input,38,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getIdKeyword_5_0_0());
            	          
            	    }
            	    // InternalData.g:2125:1: ( (lv_isId_9_0= ruleEBoolean ) )
            	    // InternalData.g:2126:1: (lv_isId_9_0= ruleEBoolean )
            	    {
            	    // InternalData.g:2126:1: (lv_isId_9_0= ruleEBoolean )
            	    // InternalData.g:2127:3: lv_isId_9_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getIsIdEBooleanParserRuleCall_5_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_33);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
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
            	    // InternalData.g:2150:4: ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalData.g:2150:4: ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalData.g:2151:5: {...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalData.g:2151:106: ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) )
            	    // InternalData.g:2152:6: ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 1);
            	    // InternalData.g:2155:6: ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) )
            	    // InternalData.g:2155:7: {...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // InternalData.g:2155:16: (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) )
            	    // InternalData.g:2155:18: otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) )
            	    {
            	    otherlv_10=(Token)match(input,29,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getChangeableKeyword_5_1_0());
            	          
            	    }
            	    // InternalData.g:2159:1: ( (lv_changeable_11_0= ruleEBoolean ) )
            	    // InternalData.g:2160:1: (lv_changeable_11_0= ruleEBoolean )
            	    {
            	    // InternalData.g:2160:1: (lv_changeable_11_0= ruleEBoolean )
            	    // InternalData.g:2161:3: lv_changeable_11_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getChangeableEBooleanParserRuleCall_5_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_33);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
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
            	    // InternalData.g:2184:4: ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalData.g:2184:4: ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalData.g:2185:5: {...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalData.g:2185:106: ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) )
            	    // InternalData.g:2186:6: ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 2);
            	    // InternalData.g:2189:6: ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) )
            	    // InternalData.g:2189:7: {...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // InternalData.g:2189:16: (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) )
            	    // InternalData.g:2189:18: otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) )
            	    {
            	    otherlv_12=(Token)match(input,30,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getDerivedKeyword_5_2_0());
            	          
            	    }
            	    // InternalData.g:2193:1: ( (lv_derived_13_0= ruleEBoolean ) )
            	    // InternalData.g:2194:1: (lv_derived_13_0= ruleEBoolean )
            	    {
            	    // InternalData.g:2194:1: (lv_derived_13_0= ruleEBoolean )
            	    // InternalData.g:2195:3: lv_derived_13_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getDerivedEBooleanParserRuleCall_5_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_33);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
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
            	    // InternalData.g:2218:4: ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalData.g:2218:4: ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalData.g:2219:5: {...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // InternalData.g:2219:106: ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) )
            	    // InternalData.g:2220:6: ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 3);
            	    // InternalData.g:2223:6: ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) )
            	    // InternalData.g:2223:7: {...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // InternalData.g:2223:16: (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) )
            	    // InternalData.g:2223:18: otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) )
            	    {
            	    otherlv_14=(Token)match(input,31,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getOrderedKeyword_5_3_0());
            	          
            	    }
            	    // InternalData.g:2227:1: ( (lv_ordered_15_0= ruleEBoolean ) )
            	    // InternalData.g:2228:1: (lv_ordered_15_0= ruleEBoolean )
            	    {
            	    // InternalData.g:2228:1: (lv_ordered_15_0= ruleEBoolean )
            	    // InternalData.g:2229:3: lv_ordered_15_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getOrderedEBooleanParserRuleCall_5_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_33);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
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
            	    // InternalData.g:2252:4: ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalData.g:2252:4: ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalData.g:2253:5: {...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // InternalData.g:2253:106: ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) )
            	    // InternalData.g:2254:6: ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 4);
            	    // InternalData.g:2257:6: ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) )
            	    // InternalData.g:2257:7: {...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // InternalData.g:2257:16: (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) )
            	    // InternalData.g:2257:18: otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) )
            	    {
            	    otherlv_16=(Token)match(input,32,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getAttributeAccess().getTransientKeyword_5_4_0());
            	          
            	    }
            	    // InternalData.g:2261:1: ( (lv_transient_17_0= ruleEBoolean ) )
            	    // InternalData.g:2262:1: (lv_transient_17_0= ruleEBoolean )
            	    {
            	    // InternalData.g:2262:1: (lv_transient_17_0= ruleEBoolean )
            	    // InternalData.g:2263:3: lv_transient_17_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getTransientEBooleanParserRuleCall_5_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_33);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
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
            	    // InternalData.g:2286:4: ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalData.g:2286:4: ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalData.g:2287:5: {...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 5)");
            	    }
            	    // InternalData.g:2287:106: ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) )
            	    // InternalData.g:2288:6: ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 5);
            	    // InternalData.g:2291:6: ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) )
            	    // InternalData.g:2291:7: {...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // InternalData.g:2291:16: (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) )
            	    // InternalData.g:2291:18: otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) )
            	    {
            	    otherlv_18=(Token)match(input,33,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_18, grammarAccess.getAttributeAccess().getUniqueKeyword_5_5_0());
            	          
            	    }
            	    // InternalData.g:2295:1: ( (lv_unique_19_0= ruleEBoolean ) )
            	    // InternalData.g:2296:1: (lv_unique_19_0= ruleEBoolean )
            	    {
            	    // InternalData.g:2296:1: (lv_unique_19_0= ruleEBoolean )
            	    // InternalData.g:2297:3: lv_unique_19_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getUniqueEBooleanParserRuleCall_5_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_33);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
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
            	    // InternalData.g:2320:4: ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalData.g:2320:4: ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalData.g:2321:5: {...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 6)");
            	    }
            	    // InternalData.g:2321:106: ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) )
            	    // InternalData.g:2322:6: ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 6);
            	    // InternalData.g:2325:6: ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) )
            	    // InternalData.g:2325:7: {...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // InternalData.g:2325:16: (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) )
            	    // InternalData.g:2325:18: otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) )
            	    {
            	    otherlv_20=(Token)match(input,34,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_20, grammarAccess.getAttributeAccess().getUnsettableKeyword_5_6_0());
            	          
            	    }
            	    // InternalData.g:2329:1: ( (lv_unsettable_21_0= ruleEBoolean ) )
            	    // InternalData.g:2330:1: (lv_unsettable_21_0= ruleEBoolean )
            	    {
            	    // InternalData.g:2330:1: (lv_unsettable_21_0= ruleEBoolean )
            	    // InternalData.g:2331:3: lv_unsettable_21_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getUnsettableEBooleanParserRuleCall_5_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_33);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
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
            	    // InternalData.g:2354:4: ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalData.g:2354:4: ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalData.g:2355:5: {...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 7) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 7)");
            	    }
            	    // InternalData.g:2355:106: ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) )
            	    // InternalData.g:2356:6: ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 7);
            	    // InternalData.g:2359:6: ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) )
            	    // InternalData.g:2359:7: {...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // InternalData.g:2359:16: (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) )
            	    // InternalData.g:2359:18: otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) )
            	    {
            	    otherlv_22=(Token)match(input,35,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_22, grammarAccess.getAttributeAccess().getVolatileKeyword_5_7_0());
            	          
            	    }
            	    // InternalData.g:2363:1: ( (lv_volatile_23_0= ruleEBoolean ) )
            	    // InternalData.g:2364:1: (lv_volatile_23_0= ruleEBoolean )
            	    {
            	    // InternalData.g:2364:1: (lv_volatile_23_0= ruleEBoolean )
            	    // InternalData.g:2365:3: lv_volatile_23_0= ruleEBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getVolatileEBooleanParserRuleCall_5_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_33);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
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

            // InternalData.g:2395:2: (otherlv_24= 'values' otherlv_25= '(' ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )? otherlv_29= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalData.g:2395:4: otherlv_24= 'values' otherlv_25= '(' ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )? otherlv_29= ')'
                    {
                    otherlv_24=(Token)match(input,39,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getAttributeAccess().getValuesKeyword_6_0());
                          
                    }
                    otherlv_25=(Token)match(input,40,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_6_1());
                          
                    }
                    // InternalData.g:2403:1: ( ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )* )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_ID)) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalData.g:2403:2: ( (lv_owned_values_26_0= ruleValue ) ) (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )*
                            {
                            // InternalData.g:2403:2: ( (lv_owned_values_26_0= ruleValue ) )
                            // InternalData.g:2404:1: (lv_owned_values_26_0= ruleValue )
                            {
                            // InternalData.g:2404:1: (lv_owned_values_26_0= ruleValue )
                            // InternalData.g:2405:3: lv_owned_values_26_0= ruleValue
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAttributeAccess().getOwned_valuesValueParserRuleCall_6_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_36);
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
                                      		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Value");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalData.g:2421:2: (otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) ) )*
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==20) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // InternalData.g:2421:4: otherlv_27= ',' ( (lv_owned_values_28_0= ruleValue ) )
                            	    {
                            	    otherlv_27=(Token)match(input,20,FOLLOW_22); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_27, grammarAccess.getAttributeAccess().getCommaKeyword_6_2_1_0());
                            	          
                            	    }
                            	    // InternalData.g:2425:1: ( (lv_owned_values_28_0= ruleValue ) )
                            	    // InternalData.g:2426:1: (lv_owned_values_28_0= ruleValue )
                            	    {
                            	    // InternalData.g:2426:1: (lv_owned_values_28_0= ruleValue )
                            	    // InternalData.g:2427:3: lv_owned_values_28_0= ruleValue
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getOwned_valuesValueParserRuleCall_6_2_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_36);
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
                            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Value");
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

                    otherlv_29=(Token)match(input,41,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_6_3());
                          
                    }

                    }
                    break;

            }

            // InternalData.g:2447:3: ( (lv_owned_annotations_30_0= ruleAnnotation ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==44) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalData.g:2448:1: (lv_owned_annotations_30_0= ruleAnnotation )
            	    {
            	    // InternalData.g:2448:1: (lv_owned_annotations_30_0= ruleAnnotation )
            	    // InternalData.g:2449:3: lv_owned_annotations_30_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getOwned_annotationsAnnotationParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_28);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Annotation");
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
    // InternalData.g:2473:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalData.g:2474:2: (iv_ruleValue= ruleValue EOF )
            // InternalData.g:2475:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalData.g:2482:1: ruleValue returns [EObject current=null] : ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'literal' )? ( (lv_literal_3_0= ruleEString ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_literal_3_0 = null;


         enterRule(); 
            
        try {
            // InternalData.g:2485:28: ( ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'literal' )? ( (lv_literal_3_0= ruleEString ) ) ) )
            // InternalData.g:2486:1: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'literal' )? ( (lv_literal_3_0= ruleEString ) ) )
            {
            // InternalData.g:2486:1: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'literal' )? ( (lv_literal_3_0= ruleEString ) ) )
            // InternalData.g:2486:2: () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'literal' )? ( (lv_literal_3_0= ruleEString ) )
            {
            // InternalData.g:2486:2: ()
            // InternalData.g:2487:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getValueAccess().getValueAction_0(),
                          current);
                  
            }

            }

            // InternalData.g:2492:2: ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'literal' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==42) ) {
                    alt40=1;
                }
            }
            else if ( (LA40_0==RULE_ID) ) {
                int LA40_2 = input.LA(2);

                if ( (LA40_2==42) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // InternalData.g:2492:3: ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'literal'
                    {
                    // InternalData.g:2492:3: ( (lv_name_1_0= ruleEString ) )
                    // InternalData.g:2493:1: (lv_name_1_0= ruleEString )
                    {
                    // InternalData.g:2493:1: (lv_name_1_0= ruleEString )
                    // InternalData.g:2494:3: lv_name_1_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValueAccess().getNameEStringParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_37);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,42,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValueAccess().getLiteralKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // InternalData.g:2514:3: ( (lv_literal_3_0= ruleEString ) )
            // InternalData.g:2515:1: (lv_literal_3_0= ruleEString )
            {
            // InternalData.g:2515:1: (lv_literal_3_0= ruleEString )
            // InternalData.g:2516:3: lv_literal_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValueAccess().getLiteralEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleOperation"
    // InternalData.g:2540:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalData.g:2541:2: (iv_ruleOperation= ruleOperation EOF )
            // InternalData.g:2542:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalData.g:2549:1: ruleOperation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' (otherlv_7= 'returns' ( (lv_operation_type_8_0= ruleAbstractType ) ) )? ( (lv_owned_annotations_9_0= ruleAnnotation ) )* ) ;
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
            // InternalData.g:2552:28: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' (otherlv_7= 'returns' ( (lv_operation_type_8_0= ruleAbstractType ) ) )? ( (lv_owned_annotations_9_0= ruleAnnotation ) )* ) )
            // InternalData.g:2553:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' (otherlv_7= 'returns' ( (lv_operation_type_8_0= ruleAbstractType ) ) )? ( (lv_owned_annotations_9_0= ruleAnnotation ) )* )
            {
            // InternalData.g:2553:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' (otherlv_7= 'returns' ( (lv_operation_type_8_0= ruleAbstractType ) ) )? ( (lv_owned_annotations_9_0= ruleAnnotation ) )* )
            // InternalData.g:2553:2: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' (otherlv_7= 'returns' ( (lv_operation_type_8_0= ruleAbstractType ) ) )? ( (lv_owned_annotations_9_0= ruleAnnotation ) )*
            {
            // InternalData.g:2553:2: ()
            // InternalData.g:2554:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationAccess().getOperationAction_0(),
                          current);
                  
            }

            }

            // InternalData.g:2559:2: ( (lv_name_1_0= ruleEString ) )
            // InternalData.g:2560:1: (lv_name_1_0= ruleEString )
            {
            // InternalData.g:2560:1: (lv_name_1_0= ruleEString )
            // InternalData.g:2561:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_34);
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
                      		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalData.g:2581:1: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID||LA42_0==11) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalData.g:2581:2: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    {
                    // InternalData.g:2581:2: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalData.g:2582:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalData.g:2582:1: (lv_parameters_3_0= ruleParameter )
                    // InternalData.g:2583:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_36);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalData.g:2599:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==20) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalData.g:2599:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // InternalData.g:2603:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalData.g:2604:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalData.g:2604:1: (lv_parameters_5_0= ruleParameter )
                    	    // InternalData.g:2605:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_36);
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
                    	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Parameter");
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

            otherlv_6=(Token)match(input,41,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
                  
            }
            // InternalData.g:2625:1: (otherlv_7= 'returns' ( (lv_operation_type_8_0= ruleAbstractType ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==43) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalData.g:2625:3: otherlv_7= 'returns' ( (lv_operation_type_8_0= ruleAbstractType ) )
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getReturnsKeyword_5_0());
                          
                    }
                    // InternalData.g:2629:1: ( (lv_operation_type_8_0= ruleAbstractType ) )
                    // InternalData.g:2630:1: (lv_operation_type_8_0= ruleAbstractType )
                    {
                    // InternalData.g:2630:1: (lv_operation_type_8_0= ruleAbstractType )
                    // InternalData.g:2631:3: lv_operation_type_8_0= ruleAbstractType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getOperation_typeAbstractTypeParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_28);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.AbstractType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalData.g:2647:4: ( (lv_owned_annotations_9_0= ruleAnnotation ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==44) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalData.g:2648:1: (lv_owned_annotations_9_0= ruleAnnotation )
            	    {
            	    // InternalData.g:2648:1: (lv_owned_annotations_9_0= ruleAnnotation )
            	    // InternalData.g:2649:3: lv_owned_annotations_9_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOperationAccess().getOwned_annotationsAnnotationParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_28);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Annotation");
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
    // InternalData.g:2673:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalData.g:2674:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalData.g:2675:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalData.g:2682:1: ruleParameter returns [EObject current=null] : ( () ( (lv_parameter_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) )? ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameter_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;

        EObject lv_owned_annotations_4_0 = null;


         enterRule(); 
            
        try {
            // InternalData.g:2685:28: ( ( () ( (lv_parameter_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) )? ( (lv_owned_annotations_4_0= ruleAnnotation ) )* ) )
            // InternalData.g:2686:1: ( () ( (lv_parameter_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) )? ( (lv_owned_annotations_4_0= ruleAnnotation ) )* )
            {
            // InternalData.g:2686:1: ( () ( (lv_parameter_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) )? ( (lv_owned_annotations_4_0= ruleAnnotation ) )* )
            // InternalData.g:2686:2: () ( (lv_parameter_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) )? ( (lv_owned_annotations_4_0= ruleAnnotation ) )*
            {
            // InternalData.g:2686:2: ()
            // InternalData.g:2687:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParameterAccess().getParameterAction_0(),
                          current);
                  
            }

            }

            // InternalData.g:2692:2: ( (lv_parameter_type_1_0= ruleAbstractType ) )
            // InternalData.g:2693:1: (lv_parameter_type_1_0= ruleAbstractType )
            {
            // InternalData.g:2693:1: (lv_parameter_type_1_0= ruleAbstractType )
            // InternalData.g:2694:3: lv_parameter_type_1_0= ruleAbstractType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getParameter_typeAbstractTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_4);
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
                      		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.AbstractType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalData.g:2710:2: ( (lv_name_2_0= ruleEString ) )
            // InternalData.g:2711:1: (lv_name_2_0= ruleEString )
            {
            // InternalData.g:2711:1: (lv_name_2_0= ruleEString )
            // InternalData.g:2712:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_40);
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
                      		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalData.g:2728:2: ( (lv_description_3_0= ruleEString ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_ID)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalData.g:2729:1: (lv_description_3_0= ruleEString )
                    {
                    // InternalData.g:2729:1: (lv_description_3_0= ruleEString )
                    // InternalData.g:2730:3: lv_description_3_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getDescriptionEStringParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_28);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalData.g:2746:3: ( (lv_owned_annotations_4_0= ruleAnnotation ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==44) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalData.g:2747:1: (lv_owned_annotations_4_0= ruleAnnotation )
            	    {
            	    // InternalData.g:2747:1: (lv_owned_annotations_4_0= ruleAnnotation )
            	    // InternalData.g:2748:3: lv_owned_annotations_4_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameterAccess().getOwned_annotationsAnnotationParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_28);
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
            	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Annotation");
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
    // InternalData.g:2772:1: entryRuleAbstractType returns [EObject current=null] : iv_ruleAbstractType= ruleAbstractType EOF ;
    public final EObject entryRuleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractType = null;


        try {
            // InternalData.g:2773:2: (iv_ruleAbstractType= ruleAbstractType EOF )
            // InternalData.g:2774:2: iv_ruleAbstractType= ruleAbstractType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbstractType=ruleAbstractType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractType; 
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
    // $ANTLR end "entryRuleAbstractType"


    // $ANTLR start "ruleAbstractType"
    // InternalData.g:2781:1: ruleAbstractType returns [EObject current=null] : (this_LocalType_0= ruleLocalType | this_ExternalType_1= ruleExternalType ) ;
    public final EObject ruleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject this_LocalType_0 = null;

        EObject this_ExternalType_1 = null;


         enterRule(); 
            
        try {
            // InternalData.g:2784:28: ( (this_LocalType_0= ruleLocalType | this_ExternalType_1= ruleExternalType ) )
            // InternalData.g:2785:1: (this_LocalType_0= ruleLocalType | this_ExternalType_1= ruleExternalType )
            {
            // InternalData.g:2785:1: (this_LocalType_0= ruleLocalType | this_ExternalType_1= ruleExternalType )
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
                    // InternalData.g:2786:5: this_LocalType_0= ruleLocalType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractTypeAccess().getLocalTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalData.g:2796:5: this_ExternalType_1= ruleExternalType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractTypeAccess().getExternalTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalData.g:2812:1: entryRuleExternalType returns [EObject current=null] : iv_ruleExternalType= ruleExternalType EOF ;
    public final EObject entryRuleExternalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalType = null;


        try {
            // InternalData.g:2813:2: (iv_ruleExternalType= ruleExternalType EOF )
            // InternalData.g:2814:2: iv_ruleExternalType= ruleExternalType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternalTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExternalType=ruleExternalType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternalType; 
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
    // $ANTLR end "entryRuleExternalType"


    // $ANTLR start "ruleExternalType"
    // InternalData.g:2821:1: ruleExternalType returns [EObject current=null] : ( () otherlv_1= 'external' ( ( ruleFQN ) ) ( (lv_cardinality_3_0= ruleCardinalities ) ) ) ;
    public final EObject ruleExternalType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_cardinality_3_0 = null;


         enterRule(); 
            
        try {
            // InternalData.g:2824:28: ( ( () otherlv_1= 'external' ( ( ruleFQN ) ) ( (lv_cardinality_3_0= ruleCardinalities ) ) ) )
            // InternalData.g:2825:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) ( (lv_cardinality_3_0= ruleCardinalities ) ) )
            {
            // InternalData.g:2825:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) ( (lv_cardinality_3_0= ruleCardinalities ) ) )
            // InternalData.g:2825:2: () otherlv_1= 'external' ( ( ruleFQN ) ) ( (lv_cardinality_3_0= ruleCardinalities ) )
            {
            // InternalData.g:2825:2: ()
            // InternalData.g:2826:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExternalTypeAccess().getExternalTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExternalTypeAccess().getExternalKeyword_1());
                  
            }
            // InternalData.g:2835:1: ( ( ruleFQN ) )
            // InternalData.g:2836:1: ( ruleFQN )
            {
            // InternalData.g:2836:1: ( ruleFQN )
            // InternalData.g:2837:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExternalTypeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExternalTypeAccess().getTypeEClassifierCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_26);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalData.g:2850:2: ( (lv_cardinality_3_0= ruleCardinalities ) )
            // InternalData.g:2851:1: (lv_cardinality_3_0= ruleCardinalities )
            {
            // InternalData.g:2851:1: (lv_cardinality_3_0= ruleCardinalities )
            // InternalData.g:2852:3: lv_cardinality_3_0= ruleCardinalities
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExternalTypeAccess().getCardinalityCardinalitiesEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Cardinalities");
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
    // InternalData.g:2876:1: entryRuleLocalType returns [EObject current=null] : iv_ruleLocalType= ruleLocalType EOF ;
    public final EObject entryRuleLocalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalType = null;


        try {
            // InternalData.g:2877:2: (iv_ruleLocalType= ruleLocalType EOF )
            // InternalData.g:2878:2: iv_ruleLocalType= ruleLocalType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLocalType=ruleLocalType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalType; 
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
    // $ANTLR end "entryRuleLocalType"


    // $ANTLR start "ruleLocalType"
    // InternalData.g:2885:1: ruleLocalType returns [EObject current=null] : ( () ( ( ruleFQN ) ) ( (lv_cardinality_2_0= ruleCardinalities ) ) ) ;
    public final EObject ruleLocalType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_cardinality_2_0 = null;


         enterRule(); 
            
        try {
            // InternalData.g:2888:28: ( ( () ( ( ruleFQN ) ) ( (lv_cardinality_2_0= ruleCardinalities ) ) ) )
            // InternalData.g:2889:1: ( () ( ( ruleFQN ) ) ( (lv_cardinality_2_0= ruleCardinalities ) ) )
            {
            // InternalData.g:2889:1: ( () ( ( ruleFQN ) ) ( (lv_cardinality_2_0= ruleCardinalities ) ) )
            // InternalData.g:2889:2: () ( ( ruleFQN ) ) ( (lv_cardinality_2_0= ruleCardinalities ) )
            {
            // InternalData.g:2889:2: ()
            // InternalData.g:2890:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalTypeAccess().getLocalTypeAction_0(),
                          current);
                  
            }

            }

            // InternalData.g:2895:2: ( ( ruleFQN ) )
            // InternalData.g:2896:1: ( ruleFQN )
            {
            // InternalData.g:2896:1: ( ruleFQN )
            // InternalData.g:2897:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalTypeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalTypeAccess().getTypeViewpointClassifierCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_26);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalData.g:2910:2: ( (lv_cardinality_2_0= ruleCardinalities ) )
            // InternalData.g:2911:1: (lv_cardinality_2_0= ruleCardinalities )
            {
            // InternalData.g:2911:1: (lv_cardinality_2_0= ruleCardinalities )
            // InternalData.g:2912:3: lv_cardinality_2_0= ruleCardinalities
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalTypeAccess().getCardinalityCardinalitiesEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Cardinalities");
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
    // InternalData.g:2938:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalData.g:2939:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalData.g:2940:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalData.g:2947:1: ruleAnnotation returns [EObject current=null] : ( () otherlv_1= 'Annotation' ( (lv_source_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_owned_details_4_0= ruleDetail ) )+ otherlv_5= '}' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_source_2_0 = null;

        EObject lv_owned_details_4_0 = null;


         enterRule(); 
            
        try {
            // InternalData.g:2950:28: ( ( () otherlv_1= 'Annotation' ( (lv_source_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_owned_details_4_0= ruleDetail ) )+ otherlv_5= '}' )? ) )
            // InternalData.g:2951:1: ( () otherlv_1= 'Annotation' ( (lv_source_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_owned_details_4_0= ruleDetail ) )+ otherlv_5= '}' )? )
            {
            // InternalData.g:2951:1: ( () otherlv_1= 'Annotation' ( (lv_source_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_owned_details_4_0= ruleDetail ) )+ otherlv_5= '}' )? )
            // InternalData.g:2951:2: () otherlv_1= 'Annotation' ( (lv_source_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_owned_details_4_0= ruleDetail ) )+ otherlv_5= '}' )?
            {
            // InternalData.g:2951:2: ()
            // InternalData.g:2952:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAnnotationAccess().getAnnotationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getAnnotationKeyword_1());
                  
            }
            // InternalData.g:2961:1: ( (lv_source_2_0= ruleEString ) )
            // InternalData.g:2962:1: (lv_source_2_0= ruleEString )
            {
            // InternalData.g:2962:1: (lv_source_2_0= ruleEString )
            // InternalData.g:2963:3: lv_source_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationAccess().getSourceEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_41);
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
                      		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalData.g:2979:2: (otherlv_3= '{' ( (lv_owned_details_4_0= ruleDetail ) )+ otherlv_5= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==14) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalData.g:2979:4: otherlv_3= '{' ( (lv_owned_details_4_0= ruleDetail ) )+ otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_3_0());
                          
                    }
                    // InternalData.g:2983:1: ( (lv_owned_details_4_0= ruleDetail ) )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==45) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalData.g:2984:1: (lv_owned_details_4_0= ruleDetail )
                    	    {
                    	    // InternalData.g:2984:1: (lv_owned_details_4_0= ruleDetail )
                    	    // InternalData.g:2985:3: lv_owned_details_4_0= ruleDetail
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getOwned_detailsDetailParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_43);
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
                    	              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Detail");
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

                    otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalData.g:3013:1: entryRuleDetail returns [EObject current=null] : iv_ruleDetail= ruleDetail EOF ;
    public final EObject entryRuleDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetail = null;


        try {
            // InternalData.g:3014:2: (iv_ruleDetail= ruleDetail EOF )
            // InternalData.g:3015:2: iv_ruleDetail= ruleDetail EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDetailRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDetail=ruleDetail();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDetail; 
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
    // $ANTLR end "entryRuleDetail"


    // $ANTLR start "ruleDetail"
    // InternalData.g:3022:1: ruleDetail returns [EObject current=null] : ( () otherlv_1= 'key:' ( (lv_key_2_0= ruleEString ) ) (otherlv_3= 'value:' ( (lv_value_4_0= ruleEString ) ) )? ) ;
    public final EObject ruleDetail() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_key_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // InternalData.g:3025:28: ( ( () otherlv_1= 'key:' ( (lv_key_2_0= ruleEString ) ) (otherlv_3= 'value:' ( (lv_value_4_0= ruleEString ) ) )? ) )
            // InternalData.g:3026:1: ( () otherlv_1= 'key:' ( (lv_key_2_0= ruleEString ) ) (otherlv_3= 'value:' ( (lv_value_4_0= ruleEString ) ) )? )
            {
            // InternalData.g:3026:1: ( () otherlv_1= 'key:' ( (lv_key_2_0= ruleEString ) ) (otherlv_3= 'value:' ( (lv_value_4_0= ruleEString ) ) )? )
            // InternalData.g:3026:2: () otherlv_1= 'key:' ( (lv_key_2_0= ruleEString ) ) (otherlv_3= 'value:' ( (lv_value_4_0= ruleEString ) ) )?
            {
            // InternalData.g:3026:2: ()
            // InternalData.g:3027:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDetailAccess().getDetailAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDetailAccess().getKeyKeyword_1());
                  
            }
            // InternalData.g:3036:1: ( (lv_key_2_0= ruleEString ) )
            // InternalData.g:3037:1: (lv_key_2_0= ruleEString )
            {
            // InternalData.g:3037:1: (lv_key_2_0= ruleEString )
            // InternalData.g:3038:3: lv_key_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDetailAccess().getKeyEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_44);
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
                      		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalData.g:3054:2: (otherlv_3= 'value:' ( (lv_value_4_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==46) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalData.g:3054:4: otherlv_3= 'value:' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,46,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDetailAccess().getValueKeyword_3_0());
                          
                    }
                    // InternalData.g:3058:1: ( (lv_value_4_0= ruleEString ) )
                    // InternalData.g:3059:1: (lv_value_4_0= ruleEString )
                    {
                    // InternalData.g:3059:1: (lv_value_4_0= ruleEString )
                    // InternalData.g:3060:3: lv_value_4_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDetailAccess().getValueEStringParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
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
    // InternalData.g:3084:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalData.g:3085:2: (iv_ruleEString= ruleEString EOF )
            // InternalData.g:3086:2: iv_ruleEString= ruleEString EOF
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
    // InternalData.g:3093:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // InternalData.g:3096:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalData.g:3097:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalData.g:3097:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalData.g:3097:6: this_STRING_0= RULE_STRING
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
                    // InternalData.g:3105:10: this_ID_1= RULE_ID
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
    // InternalData.g:3120:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalData.g:3121:2: (iv_ruleFQN= ruleFQN EOF )
            // InternalData.g:3122:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalData.g:3129:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalData.g:3132:28: ( (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) )
            // InternalData.g:3133:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            {
            // InternalData.g:3133:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            // InternalData.g:3133:6: this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalData.g:3140:1: (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==47) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalData.g:3141:2: kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    {
            	    kw=(Token)match(input,47,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // InternalData.g:3146:1: ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    // InternalData.g:3146:2: ( RULE_ID )=>this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
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
    // InternalData.g:3161:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalData.g:3162:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalData.g:3163:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalData.g:3170:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalData.g:3173:28: ( (kw= 'true' | kw= 'false' ) )
            // InternalData.g:3174:1: (kw= 'true' | kw= 'false' )
            {
            // InternalData.g:3174:1: (kw= 'true' | kw= 'false' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==48) ) {
                alt53=1;
            }
            else if ( (LA53_0==49) ) {
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
                    // InternalData.g:3175:2: kw= 'true'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalData.g:3182:2: kw= 'false'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
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
    // InternalData.g:3197:1: ruleAssociation_Types returns [Enumerator current=null] : ( (enumLiteral_0= 'contains' ) | (enumLiteral_1= 'refers' ) ) ;
    public final Enumerator ruleAssociation_Types() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalData.g:3199:28: ( ( (enumLiteral_0= 'contains' ) | (enumLiteral_1= 'refers' ) ) )
            // InternalData.g:3200:1: ( (enumLiteral_0= 'contains' ) | (enumLiteral_1= 'refers' ) )
            {
            // InternalData.g:3200:1: ( (enumLiteral_0= 'contains' ) | (enumLiteral_1= 'refers' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==50) ) {
                alt54=1;
            }
            else if ( (LA54_0==51) ) {
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
                    // InternalData.g:3200:2: (enumLiteral_0= 'contains' )
                    {
                    // InternalData.g:3200:2: (enumLiteral_0= 'contains' )
                    // InternalData.g:3200:4: enumLiteral_0= 'contains'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssociation_TypesAccess().getContainmentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssociation_TypesAccess().getContainmentEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalData.g:3206:6: (enumLiteral_1= 'refers' )
                    {
                    // InternalData.g:3206:6: (enumLiteral_1= 'refers' )
                    // InternalData.g:3206:8: enumLiteral_1= 'refers'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
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
    // InternalData.g:3216:1: ruleCardinalities returns [Enumerator current=null] : ( (enumLiteral_0= '[0,*]' ) | (enumLiteral_1= '[1,*]' ) | (enumLiteral_2= '[0,1]' ) | (enumLiteral_3= '[1,1]' ) ) ;
    public final Enumerator ruleCardinalities() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalData.g:3218:28: ( ( (enumLiteral_0= '[0,*]' ) | (enumLiteral_1= '[1,*]' ) | (enumLiteral_2= '[0,1]' ) | (enumLiteral_3= '[1,1]' ) ) )
            // InternalData.g:3219:1: ( (enumLiteral_0= '[0,*]' ) | (enumLiteral_1= '[1,*]' ) | (enumLiteral_2= '[0,1]' ) | (enumLiteral_3= '[1,1]' ) )
            {
            // InternalData.g:3219:1: ( (enumLiteral_0= '[0,*]' ) | (enumLiteral_1= '[1,*]' ) | (enumLiteral_2= '[0,1]' ) | (enumLiteral_3= '[1,1]' ) )
            int alt55=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt55=1;
                }
                break;
            case 53:
                {
                alt55=2;
                }
                break;
            case 54:
                {
                alt55=3;
                }
                break;
            case 55:
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
                    // InternalData.g:3219:2: (enumLiteral_0= '[0,*]' )
                    {
                    // InternalData.g:3219:2: (enumLiteral_0= '[0,*]' )
                    // InternalData.g:3219:4: enumLiteral_0= '[0,*]'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCardinalitiesAccess().getNothing_Or_ManyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCardinalitiesAccess().getNothing_Or_ManyEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalData.g:3225:6: (enumLiteral_1= '[1,*]' )
                    {
                    // InternalData.g:3225:6: (enumLiteral_1= '[1,*]' )
                    // InternalData.g:3225:8: enumLiteral_1= '[1,*]'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCardinalitiesAccess().getOne_Or_ManyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCardinalitiesAccess().getOne_Or_ManyEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalData.g:3231:6: (enumLiteral_2= '[0,1]' )
                    {
                    // InternalData.g:3231:6: (enumLiteral_2= '[0,1]' )
                    // InternalData.g:3231:8: enumLiteral_2= '[0,1]'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCardinalitiesAccess().getNothing_Or_OneEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCardinalitiesAccess().getNothing_Or_OneEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalData.g:3237:6: (enumLiteral_3= '[1,1]' )
                    {
                    // InternalData.g:3237:6: (enumLiteral_3= '[1,1]' )
                    // InternalData.g:3237:8: enumLiteral_3= '[1,1]'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
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
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\4\2\33\1\4\2\64\2\24\4\5\1\62\2\uffff";
    static final String dfa_3s = "\1\5\2\63\1\5\2\67\2\24\4\13\1\63\2\uffff";
    static final String dfa_4s = "\15\uffff\1\1\1\2";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2",
            "\1\3\26\uffff\1\4\1\5",
            "\1\3\26\uffff\1\4\1\5",
            "\1\6\1\7",
            "\1\10\1\11\1\12\1\13",
            "\1\10\1\11\1\12\1\13",
            "\1\14",
            "\1\14",
            "\1\15\5\uffff\1\16",
            "\1\15\5\uffff\1\16",
            "\1\15\5\uffff\1\16",
            "\1\15\5\uffff\1\16",
            "\1\4\1\5",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1026:1: (this_LocalClassAssociation_0= ruleLocalClassAssociation | this_ExternalClassAssociation_1= ruleExternalClassAssociation )";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\1\11\uffff";
    static final String dfa_9s = "\1\4\11\uffff";
    static final String dfa_10s = "\1\54\11\uffff";
    static final String dfa_11s = "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_12s = "\1\0\11\uffff}>";
    static final String[] dfa_13s = {
            "\2\1\12\uffff\1\1\10\uffff\1\1\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\10\uffff\1\1",
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

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 1174:3: ( ({...}? => ( ({...}? => (otherlv_9= 'opposite:' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'changeable:' ( (lv_changeable_12_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'derived:' ( (lv_derived_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'ordered:' ( (lv_ordered_16_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'transient:' ( (lv_transient_18_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'unique:' ( (lv_unique_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'unsettable:' ( (lv_unsettable_22_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'volatile:' ( (lv_volatile_24_0= ruleEBoolean ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_0 = input.LA(1);

                         
                        int index27_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_0==EOF||(LA27_0>=RULE_STRING && LA27_0<=RULE_ID)||LA27_0==16||LA27_0==25||LA27_0==44) ) {s = 1;}

                        else if ( LA27_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 0) ) {s = 2;}

                        else if ( LA27_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 1) ) {s = 3;}

                        else if ( LA27_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 2) ) {s = 4;}

                        else if ( LA27_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 3) ) {s = 5;}

                        else if ( LA27_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 4) ) {s = 6;}

                        else if ( LA27_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 5) ) {s = 7;}

                        else if ( LA27_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 6) ) {s = 8;}

                        else if ( LA27_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 7) ) {s = 9;}

                         
                        input.seek(index27_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String[] dfa_14s = {
            "\2\1\12\uffff\1\1\7\uffff\2\1\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff\1\2\1\1\4\uffff\1\1",
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
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 2114:3: ( ({...}? => ( ({...}? => (otherlv_8= 'id:' ( (lv_isId_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'changeable:' ( (lv_changeable_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'derived:' ( (lv_derived_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ordered:' ( (lv_ordered_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'transient:' ( (lv_transient_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'unique:' ( (lv_unique_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unsettable:' ( (lv_unsettable_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volatile:' ( (lv_volatile_23_0= ruleEBoolean ) ) ) ) ) ) )*";
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
                        if ( (LA35_0==EOF||(LA35_0>=RULE_STRING && LA35_0<=RULE_ID)||LA35_0==16||(LA35_0>=24 && LA35_0<=25)||LA35_0==39||LA35_0==44) ) {s = 1;}

                        else if ( LA35_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 0) ) {s = 2;}

                        else if ( LA35_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 1) ) {s = 3;}

                        else if ( LA35_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 2) ) {s = 4;}

                        else if ( LA35_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 3) ) {s = 5;}

                        else if ( LA35_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 4) ) {s = 6;}

                        else if ( LA35_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 5) ) {s = 7;}

                        else if ( LA35_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 6) ) {s = 8;}

                        else if ( LA35_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 7) ) {s = 9;}

                         
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
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100004038000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004038000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000100003ED8000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000100003ED0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000100003E90000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000100003F10000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000100003D10000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000100003810000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003010030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002010030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100000000030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000C000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00F0000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100FF0000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100FE0000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000003008000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00F010CFE0000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000010CFE0000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000120000000030L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000100000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000820L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000032L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200000010000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000000002L});

}

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.parser.antlr.internal; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpuiGrammarAccess;
/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
@SuppressWarnings("all")
public class InternalVpuiParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'UIDescription'", "'{'", "'}'", "'UI'", "'label:'", "'Container'", "'description:'", "'for'", "'Field'", "','", "'type'", "'mapped-to'", "'.'", "'text'", "'textarea'", "'checkbox'", "'radiobox'", "'simpleChoiceList'", "'multipleChoiceList'"
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


        public InternalVpuiParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVpuiParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVpuiParser.tokenNames; }
    public String getGrammarFileName() { return "../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g"; }



     	private VpuiGrammarAccess grammarAccess;
     	
        public InternalVpuiParser(TokenStream input, VpuiGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "UserInterface";	
       	}
       	
       	@Override
       	protected VpuiGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleUserInterface"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:75:1: entryRuleUserInterface returns [EObject current=null] : iv_ruleUserInterface= ruleUserInterface EOF ;
    public final EObject entryRuleUserInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserInterface = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:76:2: (iv_ruleUserInterface= ruleUserInterface EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:77:2: iv_ruleUserInterface= ruleUserInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUserInterfaceRule()); 
            }
            pushFollow(FOLLOW_ruleUserInterface_in_entryRuleUserInterface75);
            iv_ruleUserInterface=ruleUserInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUserInterface; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserInterface85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUserInterface"


    // $ANTLR start "ruleUserInterface"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:84:1: ruleUserInterface returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_uiDescription_2_0= ruleAspect ) ) ) ;
    public final EObject ruleUserInterface() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_uiDescription_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:87:28: ( ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_uiDescription_2_0= ruleAspect ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:88:1: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_uiDescription_2_0= ruleAspect ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:88:1: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_uiDescription_2_0= ruleAspect ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:88:2: () ( (lv_imports_1_0= ruleImport ) )* ( (lv_uiDescription_2_0= ruleAspect ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:88:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:89:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUserInterfaceAccess().getUserInterfaceAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:94:2: ( (lv_imports_1_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:95:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:95:1: (lv_imports_1_0= ruleImport )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:96:3: lv_imports_1_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUserInterfaceAccess().getImportsImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleUserInterface140);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUserInterfaceRule());
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:112:3: ( (lv_uiDescription_2_0= ruleAspect ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:113:1: (lv_uiDescription_2_0= ruleAspect )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:113:1: (lv_uiDescription_2_0= ruleAspect )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:114:3: lv_uiDescription_2_0= ruleAspect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUserInterfaceAccess().getUiDescriptionAspectParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAspect_in_ruleUserInterface162);
            lv_uiDescription_2_0=ruleAspect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUserInterfaceRule());
              	        }
                     		set(
                     			current, 
                     			"uiDescription",
                      		lv_uiDescription_2_0, 
                      		"Aspect");
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
    // $ANTLR end "ruleUserInterface"


    // $ANTLR start "entryRuleImport"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:138:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:139:2: (iv_ruleImport= ruleImport EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:140:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport198);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport208); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:147:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQN ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:150:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:151:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:151:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:151:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQN ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport245); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:155:1: ( (lv_importedNamespace_1_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:156:1: (lv_importedNamespace_1_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:156:1: (lv_importedNamespace_1_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:157:3: lv_importedNamespace_1_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceFQNParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleImport266);
            lv_importedNamespace_1_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleAspect"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:181:1: entryRuleAspect returns [EObject current=null] : iv_ruleAspect= ruleAspect EOF ;
    public final EObject entryRuleAspect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAspect = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:182:2: (iv_ruleAspect= ruleAspect EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:183:2: iv_ruleAspect= ruleAspect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAspectRule()); 
            }
            pushFollow(FOLLOW_ruleAspect_in_entryRuleAspect302);
            iv_ruleAspect=ruleAspect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAspect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspect312); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:190:1: ruleAspect returns [EObject current=null] : this_UIDescription_0= ruleUIDescription ;
    public final EObject ruleAspect() throws RecognitionException {
        EObject current = null;

        EObject this_UIDescription_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:193:28: (this_UIDescription_0= ruleUIDescription )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:195:5: this_UIDescription_0= ruleUIDescription
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAspectAccess().getUIDescriptionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleUIDescription_in_ruleAspect358);
            this_UIDescription_0=ruleUIDescription();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_UIDescription_0; 
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
    // $ANTLR end "ruleAspect"


    // $ANTLR start "entryRuleUIDescription"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:211:1: entryRuleUIDescription returns [EObject current=null] : iv_ruleUIDescription= ruleUIDescription EOF ;
    public final EObject entryRuleUIDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIDescription = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:212:2: (iv_ruleUIDescription= ruleUIDescription EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:213:2: iv_ruleUIDescription= ruleUIDescription EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUIDescriptionRule()); 
            }
            pushFollow(FOLLOW_ruleUIDescription_in_entryRuleUIDescription392);
            iv_ruleUIDescription=ruleUIDescription();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUIDescription; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIDescription402); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUIDescription"


    // $ANTLR start "ruleUIDescription"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:220:1: ruleUIDescription returns [EObject current=null] : ( () otherlv_1= 'UIDescription' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( ( ( ruleUI ) )=> (lv_UIs_4_0= ruleUI ) )* otherlv_5= '}' ) ;
    public final EObject ruleUIDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_UIs_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:223:28: ( ( () otherlv_1= 'UIDescription' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( ( ( ruleUI ) )=> (lv_UIs_4_0= ruleUI ) )* otherlv_5= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:224:1: ( () otherlv_1= 'UIDescription' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( ( ( ruleUI ) )=> (lv_UIs_4_0= ruleUI ) )* otherlv_5= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:224:1: ( () otherlv_1= 'UIDescription' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( ( ( ruleUI ) )=> (lv_UIs_4_0= ruleUI ) )* otherlv_5= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:224:2: () otherlv_1= 'UIDescription' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( ( ( ruleUI ) )=> (lv_UIs_4_0= ruleUI ) )* otherlv_5= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:224:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:225:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUIDescriptionAccess().getUIDescriptionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleUIDescription448); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUIDescriptionAccess().getUIDescriptionKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:234:1: ( (lv_name_2_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:235:1: (lv_name_2_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:235:1: (lv_name_2_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:236:3: lv_name_2_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getNameFQNParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleUIDescription469);
            lv_name_2_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleUIDescription481); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getUIDescriptionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:256:1: ( ( ( ruleUI ) )=> (lv_UIs_4_0= ruleUI ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) && (synpred1_InternalVpui())) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:256:2: ( ( ruleUI ) )=> (lv_UIs_4_0= ruleUI )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:261:1: (lv_UIs_4_0= ruleUI )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:262:3: lv_UIs_4_0= ruleUI
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUIDescriptionAccess().getUIsUIParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUI_in_ruleUIDescription512);
            	    lv_UIs_4_0=ruleUI();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUIDescriptionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"UIs",
            	              		lv_UIs_4_0, 
            	              		"UI");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleUIDescription525); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getUIDescriptionAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleUIDescription"


    // $ANTLR start "entryRuleUI"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:292:1: entryRuleUI returns [EObject current=null] : iv_ruleUI= ruleUI EOF ;
    public final EObject entryRuleUI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUI = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:293:2: (iv_ruleUI= ruleUI EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:294:2: iv_ruleUI= ruleUI EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUIRule()); 
            }
            pushFollow(FOLLOW_ruleUI_in_entryRuleUI563);
            iv_ruleUI=ruleUI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUI; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUI573); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUI"


    // $ANTLR start "ruleUI"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:301:1: ruleUI returns [EObject current=null] : ( () otherlv_1= 'UI' ( (lv_name_2_0= ruleEString ) )? ( (lv_UI_DataSource_3_0= ruleDataSource ) )? otherlv_4= '{' (otherlv_5= 'label:' ( (lv_label_6_0= ruleEString ) ) )? ( (lv_UI_Containers_7_0= ruleUIContainer ) )* otherlv_8= '}' ) ;
    public final EObject ruleUI() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_UI_DataSource_3_0 = null;

        AntlrDatatypeRuleToken lv_label_6_0 = null;

        EObject lv_UI_Containers_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:304:28: ( ( () otherlv_1= 'UI' ( (lv_name_2_0= ruleEString ) )? ( (lv_UI_DataSource_3_0= ruleDataSource ) )? otherlv_4= '{' (otherlv_5= 'label:' ( (lv_label_6_0= ruleEString ) ) )? ( (lv_UI_Containers_7_0= ruleUIContainer ) )* otherlv_8= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:305:1: ( () otherlv_1= 'UI' ( (lv_name_2_0= ruleEString ) )? ( (lv_UI_DataSource_3_0= ruleDataSource ) )? otherlv_4= '{' (otherlv_5= 'label:' ( (lv_label_6_0= ruleEString ) ) )? ( (lv_UI_Containers_7_0= ruleUIContainer ) )* otherlv_8= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:305:1: ( () otherlv_1= 'UI' ( (lv_name_2_0= ruleEString ) )? ( (lv_UI_DataSource_3_0= ruleDataSource ) )? otherlv_4= '{' (otherlv_5= 'label:' ( (lv_label_6_0= ruleEString ) ) )? ( (lv_UI_Containers_7_0= ruleUIContainer ) )* otherlv_8= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:305:2: () otherlv_1= 'UI' ( (lv_name_2_0= ruleEString ) )? ( (lv_UI_DataSource_3_0= ruleDataSource ) )? otherlv_4= '{' (otherlv_5= 'label:' ( (lv_label_6_0= ruleEString ) ) )? ( (lv_UI_Containers_7_0= ruleUIContainer ) )* otherlv_8= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:305:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:306:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUIAccess().getUIAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleUI619); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUIAccess().getUIKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:315:1: ( (lv_name_2_0= ruleEString ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:316:1: (lv_name_2_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:316:1: (lv_name_2_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:317:3: lv_name_2_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUIAccess().getNameEStringParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleUI640);
                    lv_name_2_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUIRule());
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
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:333:3: ( (lv_UI_DataSource_3_0= ruleDataSource ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:334:1: (lv_UI_DataSource_3_0= ruleDataSource )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:334:1: (lv_UI_DataSource_3_0= ruleDataSource )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:335:3: lv_UI_DataSource_3_0= ruleDataSource
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUIAccess().getUI_DataSourceDataSourceParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDataSource_in_ruleUI662);
                    lv_UI_DataSource_3_0=ruleDataSource();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUIRule());
                      	        }
                             		set(
                             			current, 
                             			"UI_DataSource",
                              		lv_UI_DataSource_3_0, 
                              		"DataSource");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleUI675); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getUIAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:355:1: (otherlv_5= 'label:' ( (lv_label_6_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:355:3: otherlv_5= 'label:' ( (lv_label_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleUI688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getUIAccess().getLabelKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:359:1: ( (lv_label_6_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:360:1: (lv_label_6_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:360:1: (lv_label_6_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:361:3: lv_label_6_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUIAccess().getLabelEStringParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleUI709);
                    lv_label_6_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUIRule());
                      	        }
                             		set(
                             			current, 
                             			"label",
                              		lv_label_6_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:377:4: ( (lv_UI_Containers_7_0= ruleUIContainer ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:378:1: (lv_UI_Containers_7_0= ruleUIContainer )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:378:1: (lv_UI_Containers_7_0= ruleUIContainer )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:379:3: lv_UI_Containers_7_0= ruleUIContainer
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUIAccess().getUI_ContainersUIContainerParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUIContainer_in_ruleUI732);
            	    lv_UI_Containers_7_0=ruleUIContainer();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUIRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"UI_Containers",
            	              		lv_UI_Containers_7_0, 
            	              		"UIContainer");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleUI745); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getUIAccess().getRightCurlyBracketKeyword_7());
                  
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
    // $ANTLR end "ruleUI"


    // $ANTLR start "entryRuleUIContainer"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:407:1: entryRuleUIContainer returns [EObject current=null] : iv_ruleUIContainer= ruleUIContainer EOF ;
    public final EObject entryRuleUIContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIContainer = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:408:2: (iv_ruleUIContainer= ruleUIContainer EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:409:2: iv_ruleUIContainer= ruleUIContainer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUIContainerRule()); 
            }
            pushFollow(FOLLOW_ruleUIContainer_in_entryRuleUIContainer781);
            iv_ruleUIContainer=ruleUIContainer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUIContainer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIContainer791); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUIContainer"


    // $ANTLR start "ruleUIContainer"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:416:1: ruleUIContainer returns [EObject current=null] : ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'label:' ( (lv_label_5_0= ruleEString ) ) )? (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? ( ( (lv_UI_fields_8_0= ruleUIField ) ) ( (lv_UI_fields_9_0= ruleUIField ) )* )? ( ( (lv_subContainers_10_0= ruleUIContainer ) ) ( (lv_subContainers_11_0= ruleUIContainer ) )* )? otherlv_12= '}' ) ;
    public final EObject ruleUIContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_label_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_UI_fields_8_0 = null;

        EObject lv_UI_fields_9_0 = null;

        EObject lv_subContainers_10_0 = null;

        EObject lv_subContainers_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:419:28: ( ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'label:' ( (lv_label_5_0= ruleEString ) ) )? (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? ( ( (lv_UI_fields_8_0= ruleUIField ) ) ( (lv_UI_fields_9_0= ruleUIField ) )* )? ( ( (lv_subContainers_10_0= ruleUIContainer ) ) ( (lv_subContainers_11_0= ruleUIContainer ) )* )? otherlv_12= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:420:1: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'label:' ( (lv_label_5_0= ruleEString ) ) )? (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? ( ( (lv_UI_fields_8_0= ruleUIField ) ) ( (lv_UI_fields_9_0= ruleUIField ) )* )? ( ( (lv_subContainers_10_0= ruleUIContainer ) ) ( (lv_subContainers_11_0= ruleUIContainer ) )* )? otherlv_12= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:420:1: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'label:' ( (lv_label_5_0= ruleEString ) ) )? (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? ( ( (lv_UI_fields_8_0= ruleUIField ) ) ( (lv_UI_fields_9_0= ruleUIField ) )* )? ( ( (lv_subContainers_10_0= ruleUIContainer ) ) ( (lv_subContainers_11_0= ruleUIContainer ) )* )? otherlv_12= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:420:2: () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'label:' ( (lv_label_5_0= ruleEString ) ) )? (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? ( ( (lv_UI_fields_8_0= ruleUIField ) ) ( (lv_UI_fields_9_0= ruleUIField ) )* )? ( ( (lv_subContainers_10_0= ruleUIContainer ) ) ( (lv_subContainers_11_0= ruleUIContainer ) )* )? otherlv_12= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:420:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:421:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUIContainerAccess().getUIContainerAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleUIContainer837); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUIContainerAccess().getContainerKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:430:1: ( (lv_name_2_0= ruleEString ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:431:1: (lv_name_2_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:431:1: (lv_name_2_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:432:3: lv_name_2_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUIContainerAccess().getNameEStringParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleUIContainer858);
                    lv_name_2_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUIContainerRule());
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
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleUIContainer871); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getUIContainerAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:452:1: (otherlv_4= 'label:' ( (lv_label_5_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:452:3: otherlv_4= 'label:' ( (lv_label_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleUIContainer884); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getUIContainerAccess().getLabelKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:456:1: ( (lv_label_5_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:457:1: (lv_label_5_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:457:1: (lv_label_5_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:458:3: lv_label_5_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUIContainerAccess().getLabelEStringParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleUIContainer905);
                    lv_label_5_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUIContainerRule());
                      	        }
                             		set(
                             			current, 
                             			"label",
                              		lv_label_5_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:474:4: (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:474:6: otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleUIContainer920); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getUIContainerAccess().getDescriptionKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:478:1: ( (lv_description_7_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:479:1: (lv_description_7_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:479:1: (lv_description_7_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:480:3: lv_description_7_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUIContainerAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleUIContainer941);
                    lv_description_7_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUIContainerRule());
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:496:4: ( ( (lv_UI_fields_8_0= ruleUIField ) ) ( (lv_UI_fields_9_0= ruleUIField ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:496:5: ( (lv_UI_fields_8_0= ruleUIField ) ) ( (lv_UI_fields_9_0= ruleUIField ) )*
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:496:5: ( (lv_UI_fields_8_0= ruleUIField ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:497:1: (lv_UI_fields_8_0= ruleUIField )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:497:1: (lv_UI_fields_8_0= ruleUIField )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:498:3: lv_UI_fields_8_0= ruleUIField
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUIContainerAccess().getUI_fieldsUIFieldParserRuleCall_6_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUIField_in_ruleUIContainer965);
                    lv_UI_fields_8_0=ruleUIField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUIContainerRule());
                      	        }
                             		add(
                             			current, 
                             			"UI_fields",
                              		lv_UI_fields_8_0, 
                              		"UIField");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:514:2: ( (lv_UI_fields_9_0= ruleUIField ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==20) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:515:1: (lv_UI_fields_9_0= ruleUIField )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:515:1: (lv_UI_fields_9_0= ruleUIField )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:516:3: lv_UI_fields_9_0= ruleUIField
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getUIContainerAccess().getUI_fieldsUIFieldParserRuleCall_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleUIField_in_ruleUIContainer986);
                    	    lv_UI_fields_9_0=ruleUIField();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getUIContainerRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"UI_fields",
                    	              		lv_UI_fields_9_0, 
                    	              		"UIField");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:532:5: ( ( (lv_subContainers_10_0= ruleUIContainer ) ) ( (lv_subContainers_11_0= ruleUIContainer ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:532:6: ( (lv_subContainers_10_0= ruleUIContainer ) ) ( (lv_subContainers_11_0= ruleUIContainer ) )*
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:532:6: ( (lv_subContainers_10_0= ruleUIContainer ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:533:1: (lv_subContainers_10_0= ruleUIContainer )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:533:1: (lv_subContainers_10_0= ruleUIContainer )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:534:3: lv_subContainers_10_0= ruleUIContainer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUIContainerAccess().getSubContainersUIContainerParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUIContainer_in_ruleUIContainer1011);
                    lv_subContainers_10_0=ruleUIContainer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUIContainerRule());
                      	        }
                             		add(
                             			current, 
                             			"subContainers",
                              		lv_subContainers_10_0, 
                              		"UIContainer");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:550:2: ( (lv_subContainers_11_0= ruleUIContainer ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==17) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:551:1: (lv_subContainers_11_0= ruleUIContainer )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:551:1: (lv_subContainers_11_0= ruleUIContainer )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:552:3: lv_subContainers_11_0= ruleUIContainer
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getUIContainerAccess().getSubContainersUIContainerParserRuleCall_7_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleUIContainer_in_ruleUIContainer1032);
                    	    lv_subContainers_11_0=ruleUIContainer();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getUIContainerRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subContainers",
                    	              		lv_subContainers_11_0, 
                    	              		"UIContainer");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
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

            otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleUIContainer1047); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getUIContainerAccess().getRightCurlyBracketKeyword_8());
                  
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
    // $ANTLR end "ruleUIContainer"


    // $ANTLR start "entryRuleDataSource"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:580:1: entryRuleDataSource returns [EObject current=null] : iv_ruleDataSource= ruleDataSource EOF ;
    public final EObject entryRuleDataSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSource = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:581:2: (iv_ruleDataSource= ruleDataSource EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:582:2: iv_ruleDataSource= ruleDataSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataSourceRule()); 
            }
            pushFollow(FOLLOW_ruleDataSource_in_entryRuleDataSource1083);
            iv_ruleDataSource=ruleDataSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSource1093); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataSource"


    // $ANTLR start "ruleDataSource"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:589:1: ruleDataSource returns [EObject current=null] : this_LocalClass_0= ruleLocalClass ;
    public final EObject ruleDataSource() throws RecognitionException {
        EObject current = null;

        EObject this_LocalClass_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:592:28: (this_LocalClass_0= ruleLocalClass )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:594:5: this_LocalClass_0= ruleLocalClass
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDataSourceAccess().getLocalClassParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleLocalClass_in_ruleDataSource1139);
            this_LocalClass_0=ruleLocalClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LocalClass_0; 
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
    // $ANTLR end "ruleDataSource"


    // $ANTLR start "entryRuleLocalClass"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:610:1: entryRuleLocalClass returns [EObject current=null] : iv_ruleLocalClass= ruleLocalClass EOF ;
    public final EObject entryRuleLocalClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalClass = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:611:2: (iv_ruleLocalClass= ruleLocalClass EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:612:2: iv_ruleLocalClass= ruleLocalClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalClassRule()); 
            }
            pushFollow(FOLLOW_ruleLocalClass_in_entryRuleLocalClass1173);
            iv_ruleLocalClass=ruleLocalClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalClass1183); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalClass"


    // $ANTLR start "ruleLocalClass"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:619:1: ruleLocalClass returns [EObject current=null] : ( () otherlv_1= 'for' ( ( ruleFQN ) ) ) ;
    public final EObject ruleLocalClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:622:28: ( ( () otherlv_1= 'for' ( ( ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:623:1: ( () otherlv_1= 'for' ( ( ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:623:1: ( () otherlv_1= 'for' ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:623:2: () otherlv_1= 'for' ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:623:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:624:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalClassAccess().getLocalClassAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleLocalClass1229); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalClassAccess().getForKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:633:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:634:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:634:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:635:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalClassRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalClassAccess().getUI_For_LocalClassClassCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleLocalClass1252);
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
    // $ANTLR end "ruleLocalClass"


    // $ANTLR start "entryRuleUIField"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:656:1: entryRuleUIField returns [EObject current=null] : iv_ruleUIField= ruleUIField EOF ;
    public final EObject entryRuleUIField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIField = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:657:2: (iv_ruleUIField= ruleUIField EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:658:2: iv_ruleUIField= ruleUIField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUIFieldRule()); 
            }
            pushFollow(FOLLOW_ruleUIField_in_entryRuleUIField1288);
            iv_ruleUIField=ruleUIField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUIField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIField1298); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUIField"


    // $ANTLR start "ruleUIField"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:665:1: ruleUIField returns [EObject current=null] : ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'label:' ( (lv_label_4_0= ruleEString ) ) )? (otherlv_5= 'description:' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ',' )? (otherlv_8= 'type' ( (lv_type_9_0= ruleUI_Field_Type ) ) )? otherlv_10= ',' ( (lv_Mapping_11_0= ruleFieldMapping ) ) ) ;
    public final EObject ruleUIField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_label_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        Enumerator lv_type_9_0 = null;

        EObject lv_Mapping_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:668:28: ( ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'label:' ( (lv_label_4_0= ruleEString ) ) )? (otherlv_5= 'description:' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ',' )? (otherlv_8= 'type' ( (lv_type_9_0= ruleUI_Field_Type ) ) )? otherlv_10= ',' ( (lv_Mapping_11_0= ruleFieldMapping ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:669:1: ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'label:' ( (lv_label_4_0= ruleEString ) ) )? (otherlv_5= 'description:' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ',' )? (otherlv_8= 'type' ( (lv_type_9_0= ruleUI_Field_Type ) ) )? otherlv_10= ',' ( (lv_Mapping_11_0= ruleFieldMapping ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:669:1: ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'label:' ( (lv_label_4_0= ruleEString ) ) )? (otherlv_5= 'description:' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ',' )? (otherlv_8= 'type' ( (lv_type_9_0= ruleUI_Field_Type ) ) )? otherlv_10= ',' ( (lv_Mapping_11_0= ruleFieldMapping ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:669:2: () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'label:' ( (lv_label_4_0= ruleEString ) ) )? (otherlv_5= 'description:' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ',' )? (otherlv_8= 'type' ( (lv_type_9_0= ruleUI_Field_Type ) ) )? otherlv_10= ',' ( (lv_Mapping_11_0= ruleFieldMapping ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:669:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:670:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUIFieldAccess().getUIFieldAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleUIField1344); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUIFieldAccess().getFieldKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:679:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:680:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:680:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:681:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUIFieldAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleUIField1365);
            lv_name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUIFieldRule());
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:697:2: (otherlv_3= 'label:' ( (lv_label_4_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:697:4: otherlv_3= 'label:' ( (lv_label_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleUIField1378); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getUIFieldAccess().getLabelKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:701:1: ( (lv_label_4_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:702:1: (lv_label_4_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:702:1: (lv_label_4_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:703:3: lv_label_4_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUIFieldAccess().getLabelEStringParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleUIField1399);
                    lv_label_4_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUIFieldRule());
                      	        }
                             		set(
                             			current, 
                             			"label",
                              		lv_label_4_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:719:4: (otherlv_5= 'description:' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:719:6: otherlv_5= 'description:' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ','
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleUIField1414); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getUIFieldAccess().getDescriptionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:723:1: ( (lv_description_6_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:724:1: (lv_description_6_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:724:1: (lv_description_6_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:725:3: lv_description_6_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUIFieldAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleUIField1435);
                    lv_description_6_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUIFieldRule());
                      	        }
                             		set(
                             			current, 
                             			"description",
                              		lv_description_6_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleUIField1447); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getUIFieldAccess().getCommaKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:745:3: (otherlv_8= 'type' ( (lv_type_9_0= ruleUI_Field_Type ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:745:5: otherlv_8= 'type' ( (lv_type_9_0= ruleUI_Field_Type ) )
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleUIField1462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getUIFieldAccess().getTypeKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:749:1: ( (lv_type_9_0= ruleUI_Field_Type ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:750:1: (lv_type_9_0= ruleUI_Field_Type )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:750:1: (lv_type_9_0= ruleUI_Field_Type )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:751:3: lv_type_9_0= ruleUI_Field_Type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUIFieldAccess().getTypeUI_Field_TypeEnumRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUI_Field_Type_in_ruleUIField1483);
                    lv_type_9_0=ruleUI_Field_Type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUIFieldRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_9_0, 
                              		"UI_Field_Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleUIField1497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getUIFieldAccess().getCommaKeyword_6());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:771:1: ( (lv_Mapping_11_0= ruleFieldMapping ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:772:1: (lv_Mapping_11_0= ruleFieldMapping )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:772:1: (lv_Mapping_11_0= ruleFieldMapping )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:773:3: lv_Mapping_11_0= ruleFieldMapping
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUIFieldAccess().getMappingFieldMappingParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFieldMapping_in_ruleUIField1518);
            lv_Mapping_11_0=ruleFieldMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUIFieldRule());
              	        }
                     		set(
                     			current, 
                     			"Mapping",
                      		lv_Mapping_11_0, 
                      		"FieldMapping");
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
    // $ANTLR end "ruleUIField"


    // $ANTLR start "entryRuleFieldMapping"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:797:1: entryRuleFieldMapping returns [EObject current=null] : iv_ruleFieldMapping= ruleFieldMapping EOF ;
    public final EObject entryRuleFieldMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldMapping = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:798:2: (iv_ruleFieldMapping= ruleFieldMapping EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:799:2: iv_ruleFieldMapping= ruleFieldMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldMappingRule()); 
            }
            pushFollow(FOLLOW_ruleFieldMapping_in_entryRuleFieldMapping1554);
            iv_ruleFieldMapping=ruleFieldMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldMapping1564); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldMapping"


    // $ANTLR start "ruleFieldMapping"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:806:1: ruleFieldMapping returns [EObject current=null] : ( () otherlv_1= 'mapped-to' ( ( ruleFQN ) )? ) ;
    public final EObject ruleFieldMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:809:28: ( ( () otherlv_1= 'mapped-to' ( ( ruleFQN ) )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:810:1: ( () otherlv_1= 'mapped-to' ( ( ruleFQN ) )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:810:1: ( () otherlv_1= 'mapped-to' ( ( ruleFQN ) )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:810:2: () otherlv_1= 'mapped-to' ( ( ruleFQN ) )?
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:810:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:811:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFieldMappingAccess().getFieldMappingAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleFieldMapping1610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFieldMappingAccess().getMappedToKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:820:1: ( ( ruleFQN ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:821:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:821:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:822:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getFieldMappingRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldMappingAccess().getUI_Field_Mapped_ToAbstractFeatureCrossReference_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleFieldMapping1633);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleFieldMapping"


    // $ANTLR start "entryRuleEString"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:843:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:844:2: (iv_ruleEString= ruleEString EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:845:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1671);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1682); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:852:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:855:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:856:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:856:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:856:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString1722); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:864:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString1748); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:879:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:880:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:881:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1794);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1805); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:888:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:891:28: ( (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:892:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:892:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:892:6: this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1845); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:899:1: (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:900:2: kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    {
            	    kw=(Token)match(input,24,FOLLOW_24_in_ruleFQN1864); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:905:1: ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:905:2: ( RULE_ID )=>this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1885); if (state.failed) return current;
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
            	    break loop19;
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


    // $ANTLR start "ruleUI_Field_Type"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:924:1: ruleUI_Field_Type returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'textarea' ) | (enumLiteral_2= 'checkbox' ) | (enumLiteral_3= 'radiobox' ) | (enumLiteral_4= 'simpleChoiceList' ) | (enumLiteral_5= 'multipleChoiceList' ) ) ;
    public final Enumerator ruleUI_Field_Type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:926:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'textarea' ) | (enumLiteral_2= 'checkbox' ) | (enumLiteral_3= 'radiobox' ) | (enumLiteral_4= 'simpleChoiceList' ) | (enumLiteral_5= 'multipleChoiceList' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:927:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'textarea' ) | (enumLiteral_2= 'checkbox' ) | (enumLiteral_3= 'radiobox' ) | (enumLiteral_4= 'simpleChoiceList' ) | (enumLiteral_5= 'multipleChoiceList' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:927:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'textarea' ) | (enumLiteral_2= 'checkbox' ) | (enumLiteral_3= 'radiobox' ) | (enumLiteral_4= 'simpleChoiceList' ) | (enumLiteral_5= 'multipleChoiceList' ) )
            int alt20=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt20=1;
                }
                break;
            case 26:
                {
                alt20=2;
                }
                break;
            case 27:
                {
                alt20=3;
                }
                break;
            case 28:
                {
                alt20=4;
                }
                break;
            case 29:
                {
                alt20=5;
                }
                break;
            case 30:
                {
                alt20=6;
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:927:2: (enumLiteral_0= 'text' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:927:2: (enumLiteral_0= 'text' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:927:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_25_in_ruleUI_Field_Type1951); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUI_Field_TypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUI_Field_TypeAccess().getTextEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:933:6: (enumLiteral_1= 'textarea' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:933:6: (enumLiteral_1= 'textarea' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:933:8: enumLiteral_1= 'textarea'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_26_in_ruleUI_Field_Type1968); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUI_Field_TypeAccess().getTextareaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUI_Field_TypeAccess().getTextareaEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:939:6: (enumLiteral_2= 'checkbox' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:939:6: (enumLiteral_2= 'checkbox' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:939:8: enumLiteral_2= 'checkbox'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_27_in_ruleUI_Field_Type1985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUI_Field_TypeAccess().getCheckboxEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getUI_Field_TypeAccess().getCheckboxEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:945:6: (enumLiteral_3= 'radiobox' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:945:6: (enumLiteral_3= 'radiobox' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:945:8: enumLiteral_3= 'radiobox'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_28_in_ruleUI_Field_Type2002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUI_Field_TypeAccess().getRadioboxEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getUI_Field_TypeAccess().getRadioboxEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:951:6: (enumLiteral_4= 'simpleChoiceList' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:951:6: (enumLiteral_4= 'simpleChoiceList' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:951:8: enumLiteral_4= 'simpleChoiceList'
                    {
                    enumLiteral_4=(Token)match(input,29,FOLLOW_29_in_ruleUI_Field_Type2019); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUI_Field_TypeAccess().getSimpleChoiceListEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getUI_Field_TypeAccess().getSimpleChoiceListEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:957:6: (enumLiteral_5= 'multipleChoiceList' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:957:6: (enumLiteral_5= 'multipleChoiceList' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:957:8: enumLiteral_5= 'multipleChoiceList'
                    {
                    enumLiteral_5=(Token)match(input,30,FOLLOW_30_in_ruleUI_Field_Type2036); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUI_Field_TypeAccess().getMultipleChoiceListEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getUI_Field_TypeAccess().getMultipleChoiceListEnumLiteralDeclaration_5()); 
                          
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
    // $ANTLR end "ruleUI_Field_Type"

    // $ANTLR start synpred1_InternalVpui
    public final void synpred1_InternalVpui_fragment() throws RecognitionException {   
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:256:2: ( ( ruleUI ) )
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:257:1: ( ruleUI )
        {
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:257:1: ( ruleUI )
        // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpui.g:258:1: ruleUI
        {
        pushFollow(FOLLOW_ruleUI_in_synpred1_InternalVpui495);
        ruleUI();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalVpui

    // Delegated rules

    public final boolean synpred1_InternalVpui() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalVpui_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleUserInterface_in_entryRuleUserInterface75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserInterface85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleUserInterface140 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_ruleAspect_in_ruleUserInterface162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport245 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleImport266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspect_in_entryRuleAspect302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspect312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescription_in_ruleAspect358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescription_in_entryRuleUIDescription392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescription402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleUIDescription448 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleUIDescription469 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleUIDescription481 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleUI_in_ruleUIDescription512 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleUIDescription525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUI_in_entryRuleUI563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUI573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleUI619 = new BitSet(new long[]{0x0000000000082030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleUI640 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_ruleDataSource_in_ruleUI662 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleUI675 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_16_in_ruleUI688 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleUI709 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_ruleUIContainer_in_ruleUI732 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_ruleUI745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIContainer_in_entryRuleUIContainer781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIContainer791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleUIContainer837 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleUIContainer858 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleUIContainer871 = new BitSet(new long[]{0x0000000000174000L});
    public static final BitSet FOLLOW_16_in_ruleUIContainer884 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleUIContainer905 = new BitSet(new long[]{0x0000000000164000L});
    public static final BitSet FOLLOW_18_in_ruleUIContainer920 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleUIContainer941 = new BitSet(new long[]{0x0000000000124000L});
    public static final BitSet FOLLOW_ruleUIField_in_ruleUIContainer965 = new BitSet(new long[]{0x0000000000124000L});
    public static final BitSet FOLLOW_ruleUIField_in_ruleUIContainer986 = new BitSet(new long[]{0x0000000000124000L});
    public static final BitSet FOLLOW_ruleUIContainer_in_ruleUIContainer1011 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_ruleUIContainer_in_ruleUIContainer1032 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_ruleUIContainer1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSource_in_entryRuleDataSource1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSource1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalClass_in_ruleDataSource1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalClass_in_entryRuleLocalClass1173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalClass1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleLocalClass1229 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleLocalClass1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIField_in_entryRuleUIField1288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIField1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleUIField1344 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleUIField1365 = new BitSet(new long[]{0x0000000000650000L});
    public static final BitSet FOLLOW_16_in_ruleUIField1378 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleUIField1399 = new BitSet(new long[]{0x0000000000640000L});
    public static final BitSet FOLLOW_18_in_ruleUIField1414 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleUIField1435 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleUIField1447 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleUIField1462 = new BitSet(new long[]{0x000000007E000000L});
    public static final BitSet FOLLOW_ruleUI_Field_Type_in_ruleUIField1483 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleUIField1497 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleFieldMapping_in_ruleUIField1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldMapping_in_entryRuleFieldMapping1554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldMapping1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFieldMapping1610 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFieldMapping1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1845 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleFQN1864 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1885 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_25_in_ruleUI_Field_Type1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleUI_Field_Type1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleUI_Field_Type1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleUI_Field_Type2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleUI_Field_Type2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleUI_Field_Type2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUI_in_synpred1_InternalVpui495 = new BitSet(new long[]{0x0000000000000002L});

}
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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpdiagramGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalVpdiagramParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'Diagrams'", "'{'", "'}'", "'Diagram'", "'description:'", "'DiagramExtension'", "'extended-diagram:'", "'Mapping'", "'Representation'", "'BeginLabel'", "'CenterLabel'", "'EndLabel'", "'condition:'", "'Style'", "'line-style:'", "'begin-decorator:'", "'end-decorator:'", "'color:'", "'Container'", "'import:'", "'domain-context:'", "'content-layout:'", "'Contains'", "'reuse'", "','", "'provided-by'", "'query'", "'association'", "'Label'", "'BasicStyle'", "'border-color:'", "'background:'", "'form:'", "'HistogramStyle'", "'Section'", "'foreground:'", "'minValue:'", "'value:'", "'maxValue:'", "'Image'", "'border:'", "'path:'", "'FlatStyle'", "'content:'", "'police:'", "'bold'", "'italic'", "'Node'", "'BorderedNode'", "'position:'", "'alignment:'", "'Actions'", "'OpenAction'", "'precondition:'", "'label:'", "'icon:'", "'Create'", "'action-for:'", "'Delete'", "'Drop'", "'ReconnectEdge'", "'Edge'", "'association-context:'", "'class-association-context:'", "'source:'", "'target:'", "'EdgeImport'", "'query:'", "'target-query:'", "'target-association:'", "'source-query:'", "'source-association:'", "'external'", "'+'", "'Java'", "'.'", "'Square'", "'Lozenge'", "'Eclipse'", "'Note'", "'Dot'", "'Triangle'", "'Stroke'", "'Ring'", "'GradientLeftToRight'", "'Liquid'", "'GradientTopToBottom'", "'border'", "'node'", "'center'", "'left'", "'right'", "'solid'", "'dash'", "'dot'", "'dash_dot'", "'NoDecoration'", "'OutputArrow'", "'InputArrow'", "'OutputClosedArrow'", "'InputClosedArrow'", "'OutputFillClosedArrow'", "'InputFillClosedArrow'", "'Diamond'", "'FillDiamond'", "'InputArrowWithDiamond'", "'InputArrowWothFillDiamond'", "'black'", "'blue'", "'red'", "'green'", "'yellow'", "'purple'", "'orange'", "'chocolate'", "'gray'", "'white'", "'dark_blue'", "'dark_red'", "'dark_green'", "'dark_yellow'", "'dark_purple'", "'dark_orange'", "'dark_chocolate'", "'dark_gray'", "'light_blue'", "'light_red'", "'light_green'", "'light_yellow'", "'light_purple'", "'light_orange'", "'light_chocolate'", "'light_gray'", "'FreeForm'", "'List'"
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
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__141=141;
    public static final int T__85=85;
    public static final int T__142=142;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__140=140;
    public static final int T__86=86;
    public static final int T__145=145;
    public static final int T__89=89;
    public static final int T__146=146;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=4;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int T__131=131;
    public static final int T__73=73;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int T__134=134;
    public static final int T__78=78;
    public static final int T__135=135;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=6;
    public static final int T__113=113;
    public static final int T__112=112;
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
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
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


        public InternalVpdiagramParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVpdiagramParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVpdiagramParser.tokenNames; }
    public String getGrammarFileName() { return "../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g"; }



     	private VpdiagramGrammarAccess grammarAccess;
     	
        public InternalVpdiagramParser(TokenStream input, VpdiagramGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Diagrams";	
       	}
       	
       	@Override
       	protected VpdiagramGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDiagrams"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:68:1: entryRuleDiagrams returns [EObject current=null] : iv_ruleDiagrams= ruleDiagrams EOF ;
    public final EObject entryRuleDiagrams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagrams = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:69:2: (iv_ruleDiagrams= ruleDiagrams EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:70:2: iv_ruleDiagrams= ruleDiagrams EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDiagramsRule()); 
            }
            pushFollow(FOLLOW_ruleDiagrams_in_entryRuleDiagrams75);
            iv_ruleDiagrams=ruleDiagrams();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDiagrams; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagrams85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiagrams"


    // $ANTLR start "ruleDiagrams"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:77:1: ruleDiagrams returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_diagrams_2_0= ruleAspect ) ) ) ;
    public final EObject ruleDiagrams() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_diagrams_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:80:28: ( ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_diagrams_2_0= ruleAspect ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:81:1: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_diagrams_2_0= ruleAspect ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:81:1: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_diagrams_2_0= ruleAspect ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:81:2: () ( (lv_imports_1_0= ruleImport ) )* ( (lv_diagrams_2_0= ruleAspect ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:81:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:82:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDiagramsAccess().getDiagramsAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:87:2: ( (lv_imports_1_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:88:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:88:1: (lv_imports_1_0= ruleImport )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:89:3: lv_imports_1_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDiagramsAccess().getImportsImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleDiagrams140);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDiagramsRule());
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:105:3: ( (lv_diagrams_2_0= ruleAspect ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:106:1: (lv_diagrams_2_0= ruleAspect )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:106:1: (lv_diagrams_2_0= ruleAspect )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:107:3: lv_diagrams_2_0= ruleAspect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDiagramsAccess().getDiagramsAspectParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAspect_in_ruleDiagrams162);
            lv_diagrams_2_0=ruleAspect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDiagramsRule());
              	        }
                     		set(
                     			current, 
                     			"diagrams",
                      		lv_diagrams_2_0, 
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
    // $ANTLR end "ruleDiagrams"


    // $ANTLR start "entryRuleImport"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:131:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:132:2: (iv_ruleImport= ruleImport EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:133:2: iv_ruleImport= ruleImport EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:140:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQN ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:143:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:144:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:144:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:144:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQN ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport245); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:148:1: ( (lv_importedNamespace_1_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:149:1: (lv_importedNamespace_1_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:149:1: (lv_importedNamespace_1_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:150:3: lv_importedNamespace_1_0= ruleFQN
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:174:1: entryRuleAspect returns [EObject current=null] : iv_ruleAspect= ruleAspect EOF ;
    public final EObject entryRuleAspect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAspect = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:175:2: (iv_ruleAspect= ruleAspect EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:176:2: iv_ruleAspect= ruleAspect EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:183:1: ruleAspect returns [EObject current=null] : this_DiagramSet_0= ruleDiagramSet ;
    public final EObject ruleAspect() throws RecognitionException {
        EObject current = null;

        EObject this_DiagramSet_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:186:28: (this_DiagramSet_0= ruleDiagramSet )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:188:5: this_DiagramSet_0= ruleDiagramSet
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAspectAccess().getDiagramSetParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleDiagramSet_in_ruleAspect358);
            this_DiagramSet_0=ruleDiagramSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DiagramSet_0; 
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


    // $ANTLR start "entryRuleDiagramSet"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:204:1: entryRuleDiagramSet returns [EObject current=null] : iv_ruleDiagramSet= ruleDiagramSet EOF ;
    public final EObject entryRuleDiagramSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramSet = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:205:2: (iv_ruleDiagramSet= ruleDiagramSet EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:206:2: iv_ruleDiagramSet= ruleDiagramSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDiagramSetRule()); 
            }
            pushFollow(FOLLOW_ruleDiagramSet_in_entryRuleDiagramSet392);
            iv_ruleDiagramSet=ruleDiagramSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDiagramSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagramSet402); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiagramSet"


    // $ANTLR start "ruleDiagramSet"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:213:1: ruleDiagramSet returns [EObject current=null] : ( () otherlv_1= 'Diagrams' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_diagrams_4_0= ruleDiagramRepresentation ) )* otherlv_5= '}' ) ;
    public final EObject ruleDiagramSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_diagrams_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:216:28: ( ( () otherlv_1= 'Diagrams' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_diagrams_4_0= ruleDiagramRepresentation ) )* otherlv_5= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:217:1: ( () otherlv_1= 'Diagrams' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_diagrams_4_0= ruleDiagramRepresentation ) )* otherlv_5= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:217:1: ( () otherlv_1= 'Diagrams' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_diagrams_4_0= ruleDiagramRepresentation ) )* otherlv_5= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:217:2: () otherlv_1= 'Diagrams' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_diagrams_4_0= ruleDiagramRepresentation ) )* otherlv_5= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:217:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:218:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDiagramSetAccess().getDiagramSetAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleDiagramSet448); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDiagramSetAccess().getDiagramsKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:227:1: ( (lv_name_2_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:228:1: (lv_name_2_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:228:1: (lv_name_2_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:229:3: lv_name_2_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDiagramSetAccess().getNameFQNParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleDiagramSet469);
            lv_name_2_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDiagramSetRule());
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDiagramSet481); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDiagramSetAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:249:1: ( (lv_diagrams_4_0= ruleDiagramRepresentation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15||LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:250:1: (lv_diagrams_4_0= ruleDiagramRepresentation )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:250:1: (lv_diagrams_4_0= ruleDiagramRepresentation )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:251:3: lv_diagrams_4_0= ruleDiagramRepresentation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDiagramSetAccess().getDiagramsDiagramRepresentationParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDiagramRepresentation_in_ruleDiagramSet502);
            	    lv_diagrams_4_0=ruleDiagramRepresentation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDiagramSetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"diagrams",
            	              		lv_diagrams_4_0, 
            	              		"DiagramRepresentation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleDiagramSet515); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDiagramSetAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleDiagramSet"


    // $ANTLR start "entryRuleDiagramRepresentation"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:279:1: entryRuleDiagramRepresentation returns [EObject current=null] : iv_ruleDiagramRepresentation= ruleDiagramRepresentation EOF ;
    public final EObject entryRuleDiagramRepresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramRepresentation = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:280:2: (iv_ruleDiagramRepresentation= ruleDiagramRepresentation EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:281:2: iv_ruleDiagramRepresentation= ruleDiagramRepresentation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDiagramRepresentationRule()); 
            }
            pushFollow(FOLLOW_ruleDiagramRepresentation_in_entryRuleDiagramRepresentation551);
            iv_ruleDiagramRepresentation=ruleDiagramRepresentation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDiagramRepresentation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagramRepresentation561); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiagramRepresentation"


    // $ANTLR start "ruleDiagramRepresentation"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:288:1: ruleDiagramRepresentation returns [EObject current=null] : (this_Diagram_0= ruleDiagram | this_DiagramExtension_1= ruleDiagramExtension ) ;
    public final EObject ruleDiagramRepresentation() throws RecognitionException {
        EObject current = null;

        EObject this_Diagram_0 = null;

        EObject this_DiagramExtension_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:291:28: ( (this_Diagram_0= ruleDiagram | this_DiagramExtension_1= ruleDiagramExtension ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:292:1: (this_Diagram_0= ruleDiagram | this_DiagramExtension_1= ruleDiagramExtension )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:292:1: (this_Diagram_0= ruleDiagram | this_DiagramExtension_1= ruleDiagramExtension )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:293:5: this_Diagram_0= ruleDiagram
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDiagramRepresentationAccess().getDiagramParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDiagram_in_ruleDiagramRepresentation608);
                    this_Diagram_0=ruleDiagram();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Diagram_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:303:5: this_DiagramExtension_1= ruleDiagramExtension
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDiagramRepresentationAccess().getDiagramExtensionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDiagramExtension_in_ruleDiagramRepresentation635);
                    this_DiagramExtension_1=ruleDiagramExtension();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DiagramExtension_1; 
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
    // $ANTLR end "ruleDiagramRepresentation"


    // $ANTLR start "entryRuleDiagramChildren"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:321:1: entryRuleDiagramChildren returns [EObject current=null] : iv_ruleDiagramChildren= ruleDiagramChildren EOF ;
    public final EObject entryRuleDiagramChildren() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramChildren = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:322:2: (iv_ruleDiagramChildren= ruleDiagramChildren EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:323:2: iv_ruleDiagramChildren= ruleDiagramChildren EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDiagramChildrenRule()); 
            }
            pushFollow(FOLLOW_ruleDiagramChildren_in_entryRuleDiagramChildren672);
            iv_ruleDiagramChildren=ruleDiagramChildren();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDiagramChildren; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagramChildren682); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiagramChildren"


    // $ANTLR start "ruleDiagramChildren"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:330:1: ruleDiagramChildren returns [EObject current=null] : (this_AbstractEdge_0= ruleAbstractEdge | this_Container_1= ruleContainer | this_Node_2= ruleNode ) ;
    public final EObject ruleDiagramChildren() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractEdge_0 = null;

        EObject this_Container_1 = null;

        EObject this_Node_2 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:333:28: ( (this_AbstractEdge_0= ruleAbstractEdge | this_Container_1= ruleContainer | this_Node_2= ruleNode ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:334:1: (this_AbstractEdge_0= ruleAbstractEdge | this_Container_1= ruleContainer | this_Node_2= ruleNode )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:334:1: (this_AbstractEdge_0= ruleAbstractEdge | this_Container_1= ruleContainer | this_Node_2= ruleNode )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 73:
            case 78:
                {
                alt4=1;
                }
                break;
            case 30:
                {
                alt4=2;
                }
                break;
            case 59:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:335:5: this_AbstractEdge_0= ruleAbstractEdge
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDiagramChildrenAccess().getAbstractEdgeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAbstractEdge_in_ruleDiagramChildren729);
                    this_AbstractEdge_0=ruleAbstractEdge();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AbstractEdge_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:345:5: this_Container_1= ruleContainer
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDiagramChildrenAccess().getContainerParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleContainer_in_ruleDiagramChildren756);
                    this_Container_1=ruleContainer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Container_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:355:5: this_Node_2= ruleNode
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDiagramChildrenAccess().getNodeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNode_in_ruleDiagramChildren783);
                    this_Node_2=ruleNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Node_2; 
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
    // $ANTLR end "ruleDiagramChildren"


    // $ANTLR start "entryRuleAbstractNode"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:371:1: entryRuleAbstractNode returns [EObject current=null] : iv_ruleAbstractNode= ruleAbstractNode EOF ;
    public final EObject entryRuleAbstractNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNode = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:372:2: (iv_ruleAbstractNode= ruleAbstractNode EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:373:2: iv_ruleAbstractNode= ruleAbstractNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractNodeRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode818);
            iv_ruleAbstractNode=ruleAbstractNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractNode828); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractNode"


    // $ANTLR start "ruleAbstractNode"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:380:1: ruleAbstractNode returns [EObject current=null] : (this_Node_0= ruleNode | this_BorderedNode_1= ruleBorderedNode | this_Container_2= ruleContainer ) ;
    public final EObject ruleAbstractNode() throws RecognitionException {
        EObject current = null;

        EObject this_Node_0 = null;

        EObject this_BorderedNode_1 = null;

        EObject this_Container_2 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:383:28: ( (this_Node_0= ruleNode | this_BorderedNode_1= ruleBorderedNode | this_Container_2= ruleContainer ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:384:1: (this_Node_0= ruleNode | this_BorderedNode_1= ruleBorderedNode | this_Container_2= ruleContainer )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:384:1: (this_Node_0= ruleNode | this_BorderedNode_1= ruleBorderedNode | this_Container_2= ruleContainer )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt5=1;
                }
                break;
            case 60:
                {
                alt5=2;
                }
                break;
            case 30:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:385:5: this_Node_0= ruleNode
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractNodeAccess().getNodeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNode_in_ruleAbstractNode875);
                    this_Node_0=ruleNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Node_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:395:5: this_BorderedNode_1= ruleBorderedNode
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractNodeAccess().getBorderedNodeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBorderedNode_in_ruleAbstractNode902);
                    this_BorderedNode_1=ruleBorderedNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BorderedNode_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:405:5: this_Container_2= ruleContainer
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractNodeAccess().getContainerParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleContainer_in_ruleAbstractNode929);
                    this_Container_2=ruleContainer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Container_2; 
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
    // $ANTLR end "ruleAbstractNode"


    // $ANTLR start "entryRuleAbstractEdge"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:421:1: entryRuleAbstractEdge returns [EObject current=null] : iv_ruleAbstractEdge= ruleAbstractEdge EOF ;
    public final EObject entryRuleAbstractEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractEdge = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:422:2: (iv_ruleAbstractEdge= ruleAbstractEdge EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:423:2: iv_ruleAbstractEdge= ruleAbstractEdge EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractEdgeRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractEdge_in_entryRuleAbstractEdge964);
            iv_ruleAbstractEdge=ruleAbstractEdge();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractEdge; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractEdge974); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractEdge"


    // $ANTLR start "ruleAbstractEdge"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:430:1: ruleAbstractEdge returns [EObject current=null] : (this_Edge_0= ruleEdge | this_EdgeImport_1= ruleEdgeImport ) ;
    public final EObject ruleAbstractEdge() throws RecognitionException {
        EObject current = null;

        EObject this_Edge_0 = null;

        EObject this_EdgeImport_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:433:28: ( (this_Edge_0= ruleEdge | this_EdgeImport_1= ruleEdgeImport ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:434:1: (this_Edge_0= ruleEdge | this_EdgeImport_1= ruleEdgeImport )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:434:1: (this_Edge_0= ruleEdge | this_EdgeImport_1= ruleEdgeImport )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==73) ) {
                alt6=1;
            }
            else if ( (LA6_0==78) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:435:5: this_Edge_0= ruleEdge
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEdgeAccess().getEdgeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEdge_in_ruleAbstractEdge1021);
                    this_Edge_0=ruleEdge();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Edge_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:445:5: this_EdgeImport_1= ruleEdgeImport
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEdgeAccess().getEdgeImportParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEdgeImport_in_ruleAbstractEdge1048);
                    this_EdgeImport_1=ruleEdgeImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EdgeImport_1; 
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
    // $ANTLR end "ruleAbstractEdge"


    // $ANTLR start "entryRuleAbstractContainerStyle"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:463:1: entryRuleAbstractContainerStyle returns [EObject current=null] : iv_ruleAbstractContainerStyle= ruleAbstractContainerStyle EOF ;
    public final EObject entryRuleAbstractContainerStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractContainerStyle = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:464:2: (iv_ruleAbstractContainerStyle= ruleAbstractContainerStyle EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:465:2: iv_ruleAbstractContainerStyle= ruleAbstractContainerStyle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractContainerStyleRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractContainerStyle_in_entryRuleAbstractContainerStyle1085);
            iv_ruleAbstractContainerStyle=ruleAbstractContainerStyle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractContainerStyle; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractContainerStyle1095); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractContainerStyle"


    // $ANTLR start "ruleAbstractContainerStyle"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:472:1: ruleAbstractContainerStyle returns [EObject current=null] : (this_FlatStyle_0= ruleFlatStyle | this_ImageStyle_1= ruleImageStyle ) ;
    public final EObject ruleAbstractContainerStyle() throws RecognitionException {
        EObject current = null;

        EObject this_FlatStyle_0 = null;

        EObject this_ImageStyle_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:475:28: ( (this_FlatStyle_0= ruleFlatStyle | this_ImageStyle_1= ruleImageStyle ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:476:1: (this_FlatStyle_0= ruleFlatStyle | this_ImageStyle_1= ruleImageStyle )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:476:1: (this_FlatStyle_0= ruleFlatStyle | this_ImageStyle_1= ruleImageStyle )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==54) ) {
                alt7=1;
            }
            else if ( (LA7_0==51) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:477:5: this_FlatStyle_0= ruleFlatStyle
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractContainerStyleAccess().getFlatStyleParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFlatStyle_in_ruleAbstractContainerStyle1142);
                    this_FlatStyle_0=ruleFlatStyle();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FlatStyle_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:487:5: this_ImageStyle_1= ruleImageStyle
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractContainerStyleAccess().getImageStyleParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImageStyle_in_ruleAbstractContainerStyle1169);
                    this_ImageStyle_1=ruleImageStyle();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ImageStyle_1; 
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
    // $ANTLR end "ruleAbstractContainerStyle"


    // $ANTLR start "entryRuleAbstractNodeStyle"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:503:1: entryRuleAbstractNodeStyle returns [EObject current=null] : iv_ruleAbstractNodeStyle= ruleAbstractNodeStyle EOF ;
    public final EObject entryRuleAbstractNodeStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNodeStyle = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:504:2: (iv_ruleAbstractNodeStyle= ruleAbstractNodeStyle EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:505:2: iv_ruleAbstractNodeStyle= ruleAbstractNodeStyle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractNodeStyleRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractNodeStyle_in_entryRuleAbstractNodeStyle1204);
            iv_ruleAbstractNodeStyle=ruleAbstractNodeStyle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractNodeStyle; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractNodeStyle1214); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractNodeStyle"


    // $ANTLR start "ruleAbstractNodeStyle"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:512:1: ruleAbstractNodeStyle returns [EObject current=null] : (this_ImageStyle_0= ruleImageStyle | this_BasicStyle_1= ruleBasicStyle | this_HistogramStyle_2= ruleHistogramStyle ) ;
    public final EObject ruleAbstractNodeStyle() throws RecognitionException {
        EObject current = null;

        EObject this_ImageStyle_0 = null;

        EObject this_BasicStyle_1 = null;

        EObject this_HistogramStyle_2 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:515:28: ( (this_ImageStyle_0= ruleImageStyle | this_BasicStyle_1= ruleBasicStyle | this_HistogramStyle_2= ruleHistogramStyle ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:516:1: (this_ImageStyle_0= ruleImageStyle | this_BasicStyle_1= ruleBasicStyle | this_HistogramStyle_2= ruleHistogramStyle )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:516:1: (this_ImageStyle_0= ruleImageStyle | this_BasicStyle_1= ruleBasicStyle | this_HistogramStyle_2= ruleHistogramStyle )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt8=1;
                }
                break;
            case 41:
                {
                alt8=2;
                }
                break;
            case 45:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:517:5: this_ImageStyle_0= ruleImageStyle
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractNodeStyleAccess().getImageStyleParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImageStyle_in_ruleAbstractNodeStyle1261);
                    this_ImageStyle_0=ruleImageStyle();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ImageStyle_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:527:5: this_BasicStyle_1= ruleBasicStyle
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractNodeStyleAccess().getBasicStyleParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBasicStyle_in_ruleAbstractNodeStyle1288);
                    this_BasicStyle_1=ruleBasicStyle();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BasicStyle_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:537:5: this_HistogramStyle_2= ruleHistogramStyle
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractNodeStyleAccess().getHistogramStyleParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHistogramStyle_in_ruleAbstractNodeStyle1315);
                    this_HistogramStyle_2=ruleHistogramStyle();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_HistogramStyle_2; 
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
    // $ANTLR end "ruleAbstractNodeStyle"


    // $ANTLR start "entryRuleDiagram"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:553:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:554:2: (iv_ruleDiagram= ruleDiagram EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:555:2: iv_ruleDiagram= ruleDiagram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDiagramRule()); 
            }
            pushFollow(FOLLOW_ruleDiagram_in_entryRuleDiagram1350);
            iv_ruleDiagram=ruleDiagram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDiagram; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagram1360); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:562:1: ruleDiagram returns [EObject current=null] : ( () otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_the_domain_6_0= ruleDomainContainer ) ) ( (lv_the_MappingSet_7_0= ruleMappingSet ) )? ( (lv_the_ActionSet_8_0= ruleActionSet ) )? otherlv_9= '}' ) ;
    public final EObject ruleDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_9=null;
        EObject lv_the_domain_6_0 = null;

        EObject lv_the_MappingSet_7_0 = null;

        EObject lv_the_ActionSet_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:565:28: ( ( () otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_the_domain_6_0= ruleDomainContainer ) ) ( (lv_the_MappingSet_7_0= ruleMappingSet ) )? ( (lv_the_ActionSet_8_0= ruleActionSet ) )? otherlv_9= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:566:1: ( () otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_the_domain_6_0= ruleDomainContainer ) ) ( (lv_the_MappingSet_7_0= ruleMappingSet ) )? ( (lv_the_ActionSet_8_0= ruleActionSet ) )? otherlv_9= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:566:1: ( () otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_the_domain_6_0= ruleDomainContainer ) ) ( (lv_the_MappingSet_7_0= ruleMappingSet ) )? ( (lv_the_ActionSet_8_0= ruleActionSet ) )? otherlv_9= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:566:2: () otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_the_domain_6_0= ruleDomainContainer ) ) ( (lv_the_MappingSet_7_0= ruleMappingSet ) )? ( (lv_the_ActionSet_8_0= ruleActionSet ) )? otherlv_9= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:566:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:567:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDiagramAccess().getDiagramAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleDiagram1406); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDiagramAccess().getDiagramKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:576:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:577:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:577:1: (lv_name_2_0= RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:578:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDiagram1423); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getDiagramAccess().getNameSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDiagramRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDiagram1440); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:598:1: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:598:3: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleDiagram1453); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDiagramAccess().getDescriptionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:602:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:603:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:603:1: (lv_description_5_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:604:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDiagram1470); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_description_5_0, grammarAccess.getDiagramAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDiagramRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"description",
                              		lv_description_5_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:620:4: ( (lv_the_domain_6_0= ruleDomainContainer ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:621:1: (lv_the_domain_6_0= ruleDomainContainer )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:621:1: (lv_the_domain_6_0= ruleDomainContainer )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:622:3: lv_the_domain_6_0= ruleDomainContainer
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDiagramAccess().getThe_domainDomainContainerParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDomainContainer_in_ruleDiagram1498);
            lv_the_domain_6_0=ruleDomainContainer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDiagramRule());
              	        }
                     		set(
                     			current, 
                     			"the_domain",
                      		lv_the_domain_6_0, 
                      		"DomainContainer");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:638:2: ( (lv_the_MappingSet_7_0= ruleMappingSet ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:639:1: (lv_the_MappingSet_7_0= ruleMappingSet )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:639:1: (lv_the_MappingSet_7_0= ruleMappingSet )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:640:3: lv_the_MappingSet_7_0= ruleMappingSet
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDiagramAccess().getThe_MappingSetMappingSetParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMappingSet_in_ruleDiagram1519);
                    lv_the_MappingSet_7_0=ruleMappingSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDiagramRule());
                      	        }
                             		set(
                             			current, 
                             			"the_MappingSet",
                              		lv_the_MappingSet_7_0, 
                              		"MappingSet");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:656:3: ( (lv_the_ActionSet_8_0= ruleActionSet ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==63) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:657:1: (lv_the_ActionSet_8_0= ruleActionSet )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:657:1: (lv_the_ActionSet_8_0= ruleActionSet )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:658:3: lv_the_ActionSet_8_0= ruleActionSet
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDiagramAccess().getThe_ActionSetActionSetParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleActionSet_in_ruleDiagram1541);
                    lv_the_ActionSet_8_0=ruleActionSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDiagramRule());
                      	        }
                             		set(
                             			current, 
                             			"the_ActionSet",
                              		lv_the_ActionSet_8_0, 
                              		"ActionSet");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleDiagram1554); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_8());
                  
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
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleDiagramExtension"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:686:1: entryRuleDiagramExtension returns [EObject current=null] : iv_ruleDiagramExtension= ruleDiagramExtension EOF ;
    public final EObject entryRuleDiagramExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramExtension = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:687:2: (iv_ruleDiagramExtension= ruleDiagramExtension EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:688:2: iv_ruleDiagramExtension= ruleDiagramExtension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDiagramExtensionRule()); 
            }
            pushFollow(FOLLOW_ruleDiagramExtension_in_entryRuleDiagramExtension1590);
            iv_ruleDiagramExtension=ruleDiagramExtension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDiagramExtension; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagramExtension1600); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiagramExtension"


    // $ANTLR start "ruleDiagramExtension"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:695:1: ruleDiagramExtension returns [EObject current=null] : ( () otherlv_1= 'DiagramExtension' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'extended-diagram:' ( ( ruleFQN ) ) )? ( (lv_the_MappingSet_6_0= ruleMappingSet ) )? ( (lv_the_ActionSet_7_0= ruleActionSet ) )? otherlv_8= '}' ) ;
    public final EObject ruleDiagramExtension() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_the_MappingSet_6_0 = null;

        EObject lv_the_ActionSet_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:698:28: ( ( () otherlv_1= 'DiagramExtension' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'extended-diagram:' ( ( ruleFQN ) ) )? ( (lv_the_MappingSet_6_0= ruleMappingSet ) )? ( (lv_the_ActionSet_7_0= ruleActionSet ) )? otherlv_8= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:699:1: ( () otherlv_1= 'DiagramExtension' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'extended-diagram:' ( ( ruleFQN ) ) )? ( (lv_the_MappingSet_6_0= ruleMappingSet ) )? ( (lv_the_ActionSet_7_0= ruleActionSet ) )? otherlv_8= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:699:1: ( () otherlv_1= 'DiagramExtension' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'extended-diagram:' ( ( ruleFQN ) ) )? ( (lv_the_MappingSet_6_0= ruleMappingSet ) )? ( (lv_the_ActionSet_7_0= ruleActionSet ) )? otherlv_8= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:699:2: () otherlv_1= 'DiagramExtension' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'extended-diagram:' ( ( ruleFQN ) ) )? ( (lv_the_MappingSet_6_0= ruleMappingSet ) )? ( (lv_the_ActionSet_7_0= ruleActionSet ) )? otherlv_8= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:699:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:700:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDiagramExtensionAccess().getDiagramExtensionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleDiagramExtension1646); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDiagramExtensionAccess().getDiagramExtensionKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:709:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:710:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:710:1: (lv_name_2_0= RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:711:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDiagramExtension1663); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getDiagramExtensionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDiagramExtensionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDiagramExtension1680); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDiagramExtensionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:731:1: (otherlv_4= 'extended-diagram:' ( ( ruleFQN ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:731:3: otherlv_4= 'extended-diagram:' ( ( ruleFQN ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleDiagramExtension1693); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDiagramExtensionAccess().getExtendedDiagramKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:735:1: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:736:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:736:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:737:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getDiagramExtensionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDiagramExtensionAccess().getExtented_diagramDiagramDescriptionCrossReference_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleDiagramExtension1716);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:750:4: ( (lv_the_MappingSet_6_0= ruleMappingSet ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:751:1: (lv_the_MappingSet_6_0= ruleMappingSet )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:751:1: (lv_the_MappingSet_6_0= ruleMappingSet )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:752:3: lv_the_MappingSet_6_0= ruleMappingSet
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDiagramExtensionAccess().getThe_MappingSetMappingSetParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMappingSet_in_ruleDiagramExtension1739);
                    lv_the_MappingSet_6_0=ruleMappingSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDiagramExtensionRule());
                      	        }
                             		set(
                             			current, 
                             			"the_MappingSet",
                              		lv_the_MappingSet_6_0, 
                              		"MappingSet");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:768:3: ( (lv_the_ActionSet_7_0= ruleActionSet ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==63) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:769:1: (lv_the_ActionSet_7_0= ruleActionSet )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:769:1: (lv_the_ActionSet_7_0= ruleActionSet )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:770:3: lv_the_ActionSet_7_0= ruleActionSet
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDiagramExtensionAccess().getThe_ActionSetActionSetParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleActionSet_in_ruleDiagramExtension1761);
                    lv_the_ActionSet_7_0=ruleActionSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDiagramExtensionRule());
                      	        }
                             		set(
                             			current, 
                             			"the_ActionSet",
                              		lv_the_ActionSet_7_0, 
                              		"ActionSet");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleDiagramExtension1774); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getDiagramExtensionAccess().getRightCurlyBracketKeyword_7());
                  
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
    // $ANTLR end "ruleDiagramExtension"


    // $ANTLR start "entryRuleMappingSet"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:798:1: entryRuleMappingSet returns [EObject current=null] : iv_ruleMappingSet= ruleMappingSet EOF ;
    public final EObject entryRuleMappingSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingSet = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:799:2: (iv_ruleMappingSet= ruleMappingSet EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:800:2: iv_ruleMappingSet= ruleMappingSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingSetRule()); 
            }
            pushFollow(FOLLOW_ruleMappingSet_in_entryRuleMappingSet1810);
            iv_ruleMappingSet=ruleMappingSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingSet1820); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMappingSet"


    // $ANTLR start "ruleMappingSet"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:807:1: ruleMappingSet returns [EObject current=null] : ( () otherlv_1= 'Mapping' otherlv_2= '{' ( (lv_diagram_Elements_3_0= ruleDiagramChildren ) )* otherlv_4= '}' ) ;
    public final EObject ruleMappingSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_diagram_Elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:810:28: ( ( () otherlv_1= 'Mapping' otherlv_2= '{' ( (lv_diagram_Elements_3_0= ruleDiagramChildren ) )* otherlv_4= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:811:1: ( () otherlv_1= 'Mapping' otherlv_2= '{' ( (lv_diagram_Elements_3_0= ruleDiagramChildren ) )* otherlv_4= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:811:1: ( () otherlv_1= 'Mapping' otherlv_2= '{' ( (lv_diagram_Elements_3_0= ruleDiagramChildren ) )* otherlv_4= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:811:2: () otherlv_1= 'Mapping' otherlv_2= '{' ( (lv_diagram_Elements_3_0= ruleDiagramChildren ) )* otherlv_4= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:811:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:812:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMappingSetAccess().getMappingSetAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleMappingSet1866); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMappingSetAccess().getMappingKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleMappingSet1878); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMappingSetAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:825:1: ( (lv_diagram_Elements_3_0= ruleDiagramChildren ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30||LA15_0==59||LA15_0==73||LA15_0==78) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:826:1: (lv_diagram_Elements_3_0= ruleDiagramChildren )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:826:1: (lv_diagram_Elements_3_0= ruleDiagramChildren )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:827:3: lv_diagram_Elements_3_0= ruleDiagramChildren
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMappingSetAccess().getDiagram_ElementsDiagramChildrenParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDiagramChildren_in_ruleMappingSet1899);
            	    lv_diagram_Elements_3_0=ruleDiagramChildren();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMappingSetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"diagram_Elements",
            	              		lv_diagram_Elements_3_0, 
            	              		"DiagramChildren");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleMappingSet1912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMappingSetAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleMappingSet"


    // $ANTLR start "entryRuleEdgeDescription"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:855:1: entryRuleEdgeDescription returns [EObject current=null] : iv_ruleEdgeDescription= ruleEdgeDescription EOF ;
    public final EObject entryRuleEdgeDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeDescription = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:856:2: (iv_ruleEdgeDescription= ruleEdgeDescription EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:857:2: iv_ruleEdgeDescription= ruleEdgeDescription EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeDescriptionRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeDescription_in_entryRuleEdgeDescription1948);
            iv_ruleEdgeDescription=ruleEdgeDescription();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeDescription; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeDescription1958); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEdgeDescription"


    // $ANTLR start "ruleEdgeDescription"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:864:1: ruleEdgeDescription returns [EObject current=null] : ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'BeginLabel' otherlv_5= '{' ( (lv_begin_Label_6_0= ruleLabel ) ) otherlv_7= '}' )? (otherlv_8= 'CenterLabel' otherlv_9= '{' ( (lv_center_label_10_0= ruleLabel ) ) otherlv_11= '}' )? (otherlv_12= 'EndLabel' otherlv_13= '{' ( (lv_end_label_14_0= ruleLabel ) ) otherlv_15= '}' )? ( (lv_style_16_0= ruleEdgeStyle ) )? otherlv_17= '}' ) ;
    public final EObject ruleEdgeDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_condition_3_0 = null;

        EObject lv_begin_Label_6_0 = null;

        EObject lv_center_label_10_0 = null;

        EObject lv_end_label_14_0 = null;

        EObject lv_style_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:867:28: ( ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'BeginLabel' otherlv_5= '{' ( (lv_begin_Label_6_0= ruleLabel ) ) otherlv_7= '}' )? (otherlv_8= 'CenterLabel' otherlv_9= '{' ( (lv_center_label_10_0= ruleLabel ) ) otherlv_11= '}' )? (otherlv_12= 'EndLabel' otherlv_13= '{' ( (lv_end_label_14_0= ruleLabel ) ) otherlv_15= '}' )? ( (lv_style_16_0= ruleEdgeStyle ) )? otherlv_17= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:868:1: ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'BeginLabel' otherlv_5= '{' ( (lv_begin_Label_6_0= ruleLabel ) ) otherlv_7= '}' )? (otherlv_8= 'CenterLabel' otherlv_9= '{' ( (lv_center_label_10_0= ruleLabel ) ) otherlv_11= '}' )? (otherlv_12= 'EndLabel' otherlv_13= '{' ( (lv_end_label_14_0= ruleLabel ) ) otherlv_15= '}' )? ( (lv_style_16_0= ruleEdgeStyle ) )? otherlv_17= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:868:1: ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'BeginLabel' otherlv_5= '{' ( (lv_begin_Label_6_0= ruleLabel ) ) otherlv_7= '}' )? (otherlv_8= 'CenterLabel' otherlv_9= '{' ( (lv_center_label_10_0= ruleLabel ) ) otherlv_11= '}' )? (otherlv_12= 'EndLabel' otherlv_13= '{' ( (lv_end_label_14_0= ruleLabel ) ) otherlv_15= '}' )? ( (lv_style_16_0= ruleEdgeStyle ) )? otherlv_17= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:868:2: () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'BeginLabel' otherlv_5= '{' ( (lv_begin_Label_6_0= ruleLabel ) ) otherlv_7= '}' )? (otherlv_8= 'CenterLabel' otherlv_9= '{' ( (lv_center_label_10_0= ruleLabel ) ) otherlv_11= '}' )? (otherlv_12= 'EndLabel' otherlv_13= '{' ( (lv_end_label_14_0= ruleLabel ) ) otherlv_15= '}' )? ( (lv_style_16_0= ruleEdgeStyle ) )? otherlv_17= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:868:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:869:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEdgeDescriptionAccess().getEdgeDescriptionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleEdgeDescription2004); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEdgeDescriptionAccess().getRepresentationKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleEdgeDescription2016); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEdgeDescriptionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:882:1: ( (lv_condition_3_0= ruleCondition ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:883:1: (lv_condition_3_0= ruleCondition )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:883:1: (lv_condition_3_0= ruleCondition )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:884:3: lv_condition_3_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeDescriptionAccess().getConditionConditionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCondition_in_ruleEdgeDescription2037);
                    lv_condition_3_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEdgeDescriptionRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_3_0, 
                              		"Condition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:900:3: (otherlv_4= 'BeginLabel' otherlv_5= '{' ( (lv_begin_Label_6_0= ruleLabel ) ) otherlv_7= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:900:5: otherlv_4= 'BeginLabel' otherlv_5= '{' ( (lv_begin_Label_6_0= ruleLabel ) ) otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleEdgeDescription2051); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEdgeDescriptionAccess().getBeginLabelKeyword_4_0());
                          
                    }
                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleEdgeDescription2063); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEdgeDescriptionAccess().getLeftCurlyBracketKeyword_4_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:908:1: ( (lv_begin_Label_6_0= ruleLabel ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:909:1: (lv_begin_Label_6_0= ruleLabel )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:909:1: (lv_begin_Label_6_0= ruleLabel )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:910:3: lv_begin_Label_6_0= ruleLabel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeDescriptionAccess().getBegin_LabelLabelParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLabel_in_ruleEdgeDescription2084);
                    lv_begin_Label_6_0=ruleLabel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEdgeDescriptionRule());
                      	        }
                             		set(
                             			current, 
                             			"begin_Label",
                              		lv_begin_Label_6_0, 
                              		"Label");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleEdgeDescription2096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEdgeDescriptionAccess().getRightCurlyBracketKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:930:3: (otherlv_8= 'CenterLabel' otherlv_9= '{' ( (lv_center_label_10_0= ruleLabel ) ) otherlv_11= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:930:5: otherlv_8= 'CenterLabel' otherlv_9= '{' ( (lv_center_label_10_0= ruleLabel ) ) otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleEdgeDescription2111); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEdgeDescriptionAccess().getCenterLabelKeyword_5_0());
                          
                    }
                    otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleEdgeDescription2123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getEdgeDescriptionAccess().getLeftCurlyBracketKeyword_5_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:938:1: ( (lv_center_label_10_0= ruleLabel ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:939:1: (lv_center_label_10_0= ruleLabel )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:939:1: (lv_center_label_10_0= ruleLabel )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:940:3: lv_center_label_10_0= ruleLabel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeDescriptionAccess().getCenter_labelLabelParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLabel_in_ruleEdgeDescription2144);
                    lv_center_label_10_0=ruleLabel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEdgeDescriptionRule());
                      	        }
                             		set(
                             			current, 
                             			"center_label",
                              		lv_center_label_10_0, 
                              		"Label");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleEdgeDescription2156); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getEdgeDescriptionAccess().getRightCurlyBracketKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:960:3: (otherlv_12= 'EndLabel' otherlv_13= '{' ( (lv_end_label_14_0= ruleLabel ) ) otherlv_15= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:960:5: otherlv_12= 'EndLabel' otherlv_13= '{' ( (lv_end_label_14_0= ruleLabel ) ) otherlv_15= '}'
                    {
                    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleEdgeDescription2171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getEdgeDescriptionAccess().getEndLabelKeyword_6_0());
                          
                    }
                    otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleEdgeDescription2183); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getEdgeDescriptionAccess().getLeftCurlyBracketKeyword_6_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:968:1: ( (lv_end_label_14_0= ruleLabel ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:969:1: (lv_end_label_14_0= ruleLabel )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:969:1: (lv_end_label_14_0= ruleLabel )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:970:3: lv_end_label_14_0= ruleLabel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeDescriptionAccess().getEnd_labelLabelParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLabel_in_ruleEdgeDescription2204);
                    lv_end_label_14_0=ruleLabel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEdgeDescriptionRule());
                      	        }
                             		set(
                             			current, 
                             			"end_label",
                              		lv_end_label_14_0, 
                              		"Label");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,14,FOLLOW_14_in_ruleEdgeDescription2216); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getEdgeDescriptionAccess().getRightCurlyBracketKeyword_6_3());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:990:3: ( (lv_style_16_0= ruleEdgeStyle ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:991:1: (lv_style_16_0= ruleEdgeStyle )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:991:1: (lv_style_16_0= ruleEdgeStyle )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:992:3: lv_style_16_0= ruleEdgeStyle
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeDescriptionAccess().getStyleEdgeStyleParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEdgeStyle_in_ruleEdgeDescription2239);
                    lv_style_16_0=ruleEdgeStyle();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEdgeDescriptionRule());
                      	        }
                             		set(
                             			current, 
                             			"style",
                              		lv_style_16_0, 
                              		"EdgeStyle");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleEdgeDescription2252); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getEdgeDescriptionAccess().getRightCurlyBracketKeyword_8());
                  
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
    // $ANTLR end "ruleEdgeDescription"


    // $ANTLR start "entryRuleCondition"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1020:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1021:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1022:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition2288);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition2298); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1029:1: ruleCondition returns [EObject current=null] : ( () otherlv_1= 'condition:' ( (lv_expression_2_0= ruleForeignExpressionElement ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1032:28: ( ( () otherlv_1= 'condition:' ( (lv_expression_2_0= ruleForeignExpressionElement ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1033:1: ( () otherlv_1= 'condition:' ( (lv_expression_2_0= ruleForeignExpressionElement ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1033:1: ( () otherlv_1= 'condition:' ( (lv_expression_2_0= ruleForeignExpressionElement ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1033:2: () otherlv_1= 'condition:' ( (lv_expression_2_0= ruleForeignExpressionElement ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1033:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1034:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConditionAccess().getConditionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleCondition2344); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getConditionKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1043:1: ( (lv_expression_2_0= ruleForeignExpressionElement ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1044:1: (lv_expression_2_0= ruleForeignExpressionElement )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1044:1: (lv_expression_2_0= ruleForeignExpressionElement )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1045:3: lv_expression_2_0= ruleForeignExpressionElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionAccess().getExpressionForeignExpressionElementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForeignExpressionElement_in_ruleCondition2365);
            lv_expression_2_0=ruleForeignExpressionElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"ForeignExpressionElement");
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleEdgeStyle"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1069:1: entryRuleEdgeStyle returns [EObject current=null] : iv_ruleEdgeStyle= ruleEdgeStyle EOF ;
    public final EObject entryRuleEdgeStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeStyle = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1070:2: (iv_ruleEdgeStyle= ruleEdgeStyle EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1071:2: iv_ruleEdgeStyle= ruleEdgeStyle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeStyleRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeStyle_in_entryRuleEdgeStyle2401);
            iv_ruleEdgeStyle=ruleEdgeStyle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeStyle; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeStyle2411); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEdgeStyle"


    // $ANTLR start "ruleEdgeStyle"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1078:1: ruleEdgeStyle returns [EObject current=null] : ( () otherlv_1= 'Style' otherlv_2= '{' (otherlv_3= 'line-style:' ( (lv_lineStyle_4_0= ruleLineStyle ) ) )? (otherlv_5= 'begin-decorator:' ( (lv_beginDecorator_6_0= ruleEdgeArrows ) ) )? (otherlv_7= 'end-decorator:' ( (lv_endDecorator_8_0= ruleEdgeArrows ) ) )? (otherlv_9= 'color:' ( (lv_color_10_0= ruleSystemColors ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleEdgeStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_lineStyle_4_0 = null;

        Enumerator lv_beginDecorator_6_0 = null;

        Enumerator lv_endDecorator_8_0 = null;

        Enumerator lv_color_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1081:28: ( ( () otherlv_1= 'Style' otherlv_2= '{' (otherlv_3= 'line-style:' ( (lv_lineStyle_4_0= ruleLineStyle ) ) )? (otherlv_5= 'begin-decorator:' ( (lv_beginDecorator_6_0= ruleEdgeArrows ) ) )? (otherlv_7= 'end-decorator:' ( (lv_endDecorator_8_0= ruleEdgeArrows ) ) )? (otherlv_9= 'color:' ( (lv_color_10_0= ruleSystemColors ) ) )? otherlv_11= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1082:1: ( () otherlv_1= 'Style' otherlv_2= '{' (otherlv_3= 'line-style:' ( (lv_lineStyle_4_0= ruleLineStyle ) ) )? (otherlv_5= 'begin-decorator:' ( (lv_beginDecorator_6_0= ruleEdgeArrows ) ) )? (otherlv_7= 'end-decorator:' ( (lv_endDecorator_8_0= ruleEdgeArrows ) ) )? (otherlv_9= 'color:' ( (lv_color_10_0= ruleSystemColors ) ) )? otherlv_11= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1082:1: ( () otherlv_1= 'Style' otherlv_2= '{' (otherlv_3= 'line-style:' ( (lv_lineStyle_4_0= ruleLineStyle ) ) )? (otherlv_5= 'begin-decorator:' ( (lv_beginDecorator_6_0= ruleEdgeArrows ) ) )? (otherlv_7= 'end-decorator:' ( (lv_endDecorator_8_0= ruleEdgeArrows ) ) )? (otherlv_9= 'color:' ( (lv_color_10_0= ruleSystemColors ) ) )? otherlv_11= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1082:2: () otherlv_1= 'Style' otherlv_2= '{' (otherlv_3= 'line-style:' ( (lv_lineStyle_4_0= ruleLineStyle ) ) )? (otherlv_5= 'begin-decorator:' ( (lv_beginDecorator_6_0= ruleEdgeArrows ) ) )? (otherlv_7= 'end-decorator:' ( (lv_endDecorator_8_0= ruleEdgeArrows ) ) )? (otherlv_9= 'color:' ( (lv_color_10_0= ruleSystemColors ) ) )? otherlv_11= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1082:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1083:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEdgeStyleAccess().getEdgeStyleAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleEdgeStyle2457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEdgeStyleAccess().getStyleKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleEdgeStyle2469); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEdgeStyleAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1096:1: (otherlv_3= 'line-style:' ( (lv_lineStyle_4_0= ruleLineStyle ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1096:3: otherlv_3= 'line-style:' ( (lv_lineStyle_4_0= ruleLineStyle ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleEdgeStyle2482); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEdgeStyleAccess().getLineStyleKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1100:1: ( (lv_lineStyle_4_0= ruleLineStyle ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1101:1: (lv_lineStyle_4_0= ruleLineStyle )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1101:1: (lv_lineStyle_4_0= ruleLineStyle )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1102:3: lv_lineStyle_4_0= ruleLineStyle
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getLineStyleLineStyleEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLineStyle_in_ruleEdgeStyle2503);
                    lv_lineStyle_4_0=ruleLineStyle();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
                      	        }
                             		set(
                             			current, 
                             			"lineStyle",
                              		lv_lineStyle_4_0, 
                              		"LineStyle");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1118:4: (otherlv_5= 'begin-decorator:' ( (lv_beginDecorator_6_0= ruleEdgeArrows ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1118:6: otherlv_5= 'begin-decorator:' ( (lv_beginDecorator_6_0= ruleEdgeArrows ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleEdgeStyle2518); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEdgeStyleAccess().getBeginDecoratorKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1122:1: ( (lv_beginDecorator_6_0= ruleEdgeArrows ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1123:1: (lv_beginDecorator_6_0= ruleEdgeArrows )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1123:1: (lv_beginDecorator_6_0= ruleEdgeArrows )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1124:3: lv_beginDecorator_6_0= ruleEdgeArrows
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getBeginDecoratorEdgeArrowsEnumRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEdgeArrows_in_ruleEdgeStyle2539);
                    lv_beginDecorator_6_0=ruleEdgeArrows();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
                      	        }
                             		set(
                             			current, 
                             			"beginDecorator",
                              		lv_beginDecorator_6_0, 
                              		"EdgeArrows");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1140:4: (otherlv_7= 'end-decorator:' ( (lv_endDecorator_8_0= ruleEdgeArrows ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1140:6: otherlv_7= 'end-decorator:' ( (lv_endDecorator_8_0= ruleEdgeArrows ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleEdgeStyle2554); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEdgeStyleAccess().getEndDecoratorKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1144:1: ( (lv_endDecorator_8_0= ruleEdgeArrows ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1145:1: (lv_endDecorator_8_0= ruleEdgeArrows )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1145:1: (lv_endDecorator_8_0= ruleEdgeArrows )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1146:3: lv_endDecorator_8_0= ruleEdgeArrows
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getEndDecoratorEdgeArrowsEnumRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEdgeArrows_in_ruleEdgeStyle2575);
                    lv_endDecorator_8_0=ruleEdgeArrows();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
                      	        }
                             		set(
                             			current, 
                             			"endDecorator",
                              		lv_endDecorator_8_0, 
                              		"EdgeArrows");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1162:4: (otherlv_9= 'color:' ( (lv_color_10_0= ruleSystemColors ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1162:6: otherlv_9= 'color:' ( (lv_color_10_0= ruleSystemColors ) )
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleEdgeStyle2590); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getEdgeStyleAccess().getColorKeyword_6_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1166:1: ( (lv_color_10_0= ruleSystemColors ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1167:1: (lv_color_10_0= ruleSystemColors )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1167:1: (lv_color_10_0= ruleSystemColors )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1168:3: lv_color_10_0= ruleSystemColors
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getColorSystemColorsEnumRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSystemColors_in_ruleEdgeStyle2611);
                    lv_color_10_0=ruleSystemColors();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
                      	        }
                             		set(
                             			current, 
                             			"color",
                              		lv_color_10_0, 
                              		"SystemColors");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleEdgeStyle2625); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getEdgeStyleAccess().getRightCurlyBracketKeyword_7());
                  
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
    // $ANTLR end "ruleEdgeStyle"


    // $ANTLR start "entryRuleContainer"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1196:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1197:2: (iv_ruleContainer= ruleContainer EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1198:2: iv_ruleContainer= ruleContainer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerRule()); 
            }
            pushFollow(FOLLOW_ruleContainer_in_entryRuleContainer2661);
            iv_ruleContainer=ruleContainer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainer2671); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1205:1: ruleContainer returns [EObject current=null] : ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? (otherlv_8= 'content-layout:' ( (lv_contentLayout_9_0= ruleContainerLayout ) ) )? ( (lv_style_10_0= ruleContainerDescription ) )* ( (lv_children_11_0= ruleContainerChildren ) )? otherlv_12= '}' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_the_domain_7_0 = null;

        Enumerator lv_contentLayout_9_0 = null;

        EObject lv_style_10_0 = null;

        EObject lv_children_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1208:28: ( ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? (otherlv_8= 'content-layout:' ( (lv_contentLayout_9_0= ruleContainerLayout ) ) )? ( (lv_style_10_0= ruleContainerDescription ) )* ( (lv_children_11_0= ruleContainerChildren ) )? otherlv_12= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1209:1: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? (otherlv_8= 'content-layout:' ( (lv_contentLayout_9_0= ruleContainerLayout ) ) )? ( (lv_style_10_0= ruleContainerDescription ) )* ( (lv_children_11_0= ruleContainerChildren ) )? otherlv_12= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1209:1: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? (otherlv_8= 'content-layout:' ( (lv_contentLayout_9_0= ruleContainerLayout ) ) )? ( (lv_style_10_0= ruleContainerDescription ) )* ( (lv_children_11_0= ruleContainerChildren ) )? otherlv_12= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1209:2: () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? (otherlv_8= 'content-layout:' ( (lv_contentLayout_9_0= ruleContainerLayout ) ) )? ( (lv_style_10_0= ruleContainerDescription ) )* ( (lv_children_11_0= ruleContainerChildren ) )? otherlv_12= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1209:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1210:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getContainerAccess().getContainerAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleContainer2717); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1219:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1220:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1220:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1221:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleContainer2738);
            lv_name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getContainerRule());
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleContainer2750); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1241:1: (otherlv_4= 'import:' ( ( ruleFQN ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1241:3: otherlv_4= 'import:' ( ( ruleFQN ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleContainer2763); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getImportKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1245:1: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1246:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1246:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1247:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getContainerRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerAccess().getImportsContainerMappingCrossReference_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleContainer2786);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1260:4: (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1260:6: otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleContainer2801); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getDomainContextKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1264:1: ( (lv_the_domain_7_0= ruleNodeDomainElement ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1265:1: (lv_the_domain_7_0= ruleNodeDomainElement )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1265:1: (lv_the_domain_7_0= ruleNodeDomainElement )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1266:3: lv_the_domain_7_0= ruleNodeDomainElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerAccess().getThe_domainNodeDomainElementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNodeDomainElement_in_ruleContainer2822);
                    lv_the_domain_7_0=ruleNodeDomainElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContainerRule());
                      	        }
                             		set(
                             			current, 
                             			"the_domain",
                              		lv_the_domain_7_0, 
                              		"NodeDomainElement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1282:4: (otherlv_8= 'content-layout:' ( (lv_contentLayout_9_0= ruleContainerLayout ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1282:6: otherlv_8= 'content-layout:' ( (lv_contentLayout_9_0= ruleContainerLayout ) )
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleContainer2837); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getContainerAccess().getContentLayoutKeyword_6_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1286:1: ( (lv_contentLayout_9_0= ruleContainerLayout ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1287:1: (lv_contentLayout_9_0= ruleContainerLayout )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1287:1: (lv_contentLayout_9_0= ruleContainerLayout )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1288:3: lv_contentLayout_9_0= ruleContainerLayout
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerAccess().getContentLayoutContainerLayoutEnumRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleContainerLayout_in_ruleContainer2858);
                    lv_contentLayout_9_0=ruleContainerLayout();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContainerRule());
                      	        }
                             		set(
                             			current, 
                             			"contentLayout",
                              		lv_contentLayout_9_0, 
                              		"ContainerLayout");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1304:4: ( (lv_style_10_0= ruleContainerDescription ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==20) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1305:1: (lv_style_10_0= ruleContainerDescription )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1305:1: (lv_style_10_0= ruleContainerDescription )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1306:3: lv_style_10_0= ruleContainerDescription
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContainerAccess().getStyleContainerDescriptionParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleContainerDescription_in_ruleContainer2881);
            	    lv_style_10_0=ruleContainerDescription();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"style",
            	              		lv_style_10_0, 
            	              		"ContainerDescription");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1322:3: ( (lv_children_11_0= ruleContainerChildren ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1323:1: (lv_children_11_0= ruleContainerChildren )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1323:1: (lv_children_11_0= ruleContainerChildren )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1324:3: lv_children_11_0= ruleContainerChildren
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerAccess().getChildrenContainerChildrenParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleContainerChildren_in_ruleContainer2903);
                    lv_children_11_0=ruleContainerChildren();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContainerRule());
                      	        }
                             		set(
                             			current, 
                             			"children",
                              		lv_children_11_0, 
                              		"ContainerChildren");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleContainer2916); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_9());
                  
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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleContainerChildren"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1352:1: entryRuleContainerChildren returns [EObject current=null] : iv_ruleContainerChildren= ruleContainerChildren EOF ;
    public final EObject entryRuleContainerChildren() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerChildren = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1353:2: (iv_ruleContainerChildren= ruleContainerChildren EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1354:2: iv_ruleContainerChildren= ruleContainerChildren EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerChildrenRule()); 
            }
            pushFollow(FOLLOW_ruleContainerChildren_in_entryRuleContainerChildren2952);
            iv_ruleContainerChildren=ruleContainerChildren();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerChildren; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerChildren2962); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainerChildren"


    // $ANTLR start "ruleContainerChildren"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1361:1: ruleContainerChildren returns [EObject current=null] : ( () otherlv_1= 'Contains' otherlv_2= '{' (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ( (lv_owned_nodes_7_0= ruleAbstractNode ) )* otherlv_8= '}' ) ;
    public final EObject ruleContainerChildren() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_owned_nodes_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1364:28: ( ( () otherlv_1= 'Contains' otherlv_2= '{' (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ( (lv_owned_nodes_7_0= ruleAbstractNode ) )* otherlv_8= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1365:1: ( () otherlv_1= 'Contains' otherlv_2= '{' (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ( (lv_owned_nodes_7_0= ruleAbstractNode ) )* otherlv_8= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1365:1: ( () otherlv_1= 'Contains' otherlv_2= '{' (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ( (lv_owned_nodes_7_0= ruleAbstractNode ) )* otherlv_8= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1365:2: () otherlv_1= 'Contains' otherlv_2= '{' (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ( (lv_owned_nodes_7_0= ruleAbstractNode ) )* otherlv_8= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1365:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1366:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getContainerChildrenAccess().getContainerChildrenAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleContainerChildren3008); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getContainerChildrenAccess().getContainsKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleContainerChildren3020); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getContainerChildrenAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1379:1: (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1379:3: otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleContainerChildren3033); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getContainerChildrenAccess().getReuseKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1383:1: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1384:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1384:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1385:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getContainerChildrenRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerChildrenAccess().getReused_nodesAbstractNodeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleContainerChildren3056);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1398:2: (otherlv_5= ',' ( ( ruleFQN ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==36) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1398:4: otherlv_5= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleContainerChildren3069); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getContainerChildrenAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1402:1: ( ( ruleFQN ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1403:1: ( ruleFQN )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1403:1: ( ruleFQN )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1404:3: ruleFQN
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getContainerChildrenRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getContainerChildrenAccess().getReused_nodesAbstractNodeCrossReference_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFQN_in_ruleContainerChildren3092);
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
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1417:6: ( (lv_owned_nodes_7_0= ruleAbstractNode ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==30||(LA32_0>=59 && LA32_0<=60)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1418:1: (lv_owned_nodes_7_0= ruleAbstractNode )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1418:1: (lv_owned_nodes_7_0= ruleAbstractNode )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1419:3: lv_owned_nodes_7_0= ruleAbstractNode
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContainerChildrenAccess().getOwned_nodesAbstractNodeParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractNode_in_ruleContainerChildren3117);
            	    lv_owned_nodes_7_0=ruleAbstractNode();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getContainerChildrenRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"owned_nodes",
            	              		lv_owned_nodes_7_0, 
            	              		"AbstractNode");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleContainerChildren3130); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getContainerChildrenAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleContainerChildren"


    // $ANTLR start "entryRuleNodeDomainElement"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1447:1: entryRuleNodeDomainElement returns [EObject current=null] : iv_ruleNodeDomainElement= ruleNodeDomainElement EOF ;
    public final EObject entryRuleNodeDomainElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeDomainElement = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1448:2: (iv_ruleNodeDomainElement= ruleNodeDomainElement EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1449:2: iv_ruleNodeDomainElement= ruleNodeDomainElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeDomainElementRule()); 
            }
            pushFollow(FOLLOW_ruleNodeDomainElement_in_entryRuleNodeDomainElement3166);
            iv_ruleNodeDomainElement=ruleNodeDomainElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeDomainElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeDomainElement3176); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeDomainElement"


    // $ANTLR start "ruleNodeDomainElement"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1456:1: ruleNodeDomainElement returns [EObject current=null] : ( () ( (lv_domain_Class_1_0= ruleAbstractClass ) ) (otherlv_2= 'provided-by' ( (otherlv_3= 'query' ( (lv_query_4_0= RULE_STRING ) ) ) | (otherlv_5= 'association' ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) ) ) ) )? ) ;
    public final EObject ruleNodeDomainElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_query_4_0=null;
        Token otherlv_5=null;
        EObject lv_domain_Class_1_0 = null;

        EObject lv_chlidren_list_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1459:28: ( ( () ( (lv_domain_Class_1_0= ruleAbstractClass ) ) (otherlv_2= 'provided-by' ( (otherlv_3= 'query' ( (lv_query_4_0= RULE_STRING ) ) ) | (otherlv_5= 'association' ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) ) ) ) )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1460:1: ( () ( (lv_domain_Class_1_0= ruleAbstractClass ) ) (otherlv_2= 'provided-by' ( (otherlv_3= 'query' ( (lv_query_4_0= RULE_STRING ) ) ) | (otherlv_5= 'association' ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) ) ) ) )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1460:1: ( () ( (lv_domain_Class_1_0= ruleAbstractClass ) ) (otherlv_2= 'provided-by' ( (otherlv_3= 'query' ( (lv_query_4_0= RULE_STRING ) ) ) | (otherlv_5= 'association' ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) ) ) ) )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1460:2: () ( (lv_domain_Class_1_0= ruleAbstractClass ) ) (otherlv_2= 'provided-by' ( (otherlv_3= 'query' ( (lv_query_4_0= RULE_STRING ) ) ) | (otherlv_5= 'association' ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) ) ) ) )?
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1460:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1461:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNodeDomainElementAccess().getNodeDomainElementAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1466:2: ( (lv_domain_Class_1_0= ruleAbstractClass ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1467:1: (lv_domain_Class_1_0= ruleAbstractClass )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1467:1: (lv_domain_Class_1_0= ruleAbstractClass )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1468:3: lv_domain_Class_1_0= ruleAbstractClass
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNodeDomainElementAccess().getDomain_ClassAbstractClassParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbstractClass_in_ruleNodeDomainElement3231);
            lv_domain_Class_1_0=ruleAbstractClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNodeDomainElementRule());
              	        }
                     		set(
                     			current, 
                     			"domain_Class",
                      		lv_domain_Class_1_0, 
                      		"AbstractClass");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1484:2: (otherlv_2= 'provided-by' ( (otherlv_3= 'query' ( (lv_query_4_0= RULE_STRING ) ) ) | (otherlv_5= 'association' ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) ) ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==37) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1484:4: otherlv_2= 'provided-by' ( (otherlv_3= 'query' ( (lv_query_4_0= RULE_STRING ) ) ) | (otherlv_5= 'association' ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) ) ) )
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleNodeDomainElement3244); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNodeDomainElementAccess().getProvidedByKeyword_2_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1488:1: ( (otherlv_3= 'query' ( (lv_query_4_0= RULE_STRING ) ) ) | (otherlv_5= 'association' ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) ) ) )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==38) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==39) ) {
                        alt33=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1488:2: (otherlv_3= 'query' ( (lv_query_4_0= RULE_STRING ) ) )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1488:2: (otherlv_3= 'query' ( (lv_query_4_0= RULE_STRING ) ) )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1488:4: otherlv_3= 'query' ( (lv_query_4_0= RULE_STRING ) )
                            {
                            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleNodeDomainElement3258); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getNodeDomainElementAccess().getQueryKeyword_2_1_0_0());
                                  
                            }
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1492:1: ( (lv_query_4_0= RULE_STRING ) )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1493:1: (lv_query_4_0= RULE_STRING )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1493:1: (lv_query_4_0= RULE_STRING )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1494:3: lv_query_4_0= RULE_STRING
                            {
                            lv_query_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNodeDomainElement3275); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_query_4_0, grammarAccess.getNodeDomainElementAccess().getQuerySTRINGTerminalRuleCall_2_1_0_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getNodeDomainElementRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"query",
                                      		lv_query_4_0, 
                                      		"STRING");
                              	    
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1511:6: (otherlv_5= 'association' ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) ) )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1511:6: (otherlv_5= 'association' ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) ) )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1511:8: otherlv_5= 'association' ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) )
                            {
                            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleNodeDomainElement3300); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getNodeDomainElementAccess().getAssociationKeyword_2_1_1_0());
                                  
                            }
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1515:1: ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1516:1: (lv_chlidren_list_6_0= ruleAbstractAssociation2 )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1516:1: (lv_chlidren_list_6_0= ruleAbstractAssociation2 )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1517:3: lv_chlidren_list_6_0= ruleAbstractAssociation2
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNodeDomainElementAccess().getChlidren_listAbstractAssociation2ParserRuleCall_2_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleAbstractAssociation2_in_ruleNodeDomainElement3321);
                            lv_chlidren_list_6_0=ruleAbstractAssociation2();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNodeDomainElementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"chlidren_list",
                                      		lv_chlidren_list_6_0, 
                                      		"AbstractAssociation2");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleNodeDomainElement"


    // $ANTLR start "entryRuleContainerDescription"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1541:1: entryRuleContainerDescription returns [EObject current=null] : iv_ruleContainerDescription= ruleContainerDescription EOF ;
    public final EObject entryRuleContainerDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerDescription = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1542:2: (iv_ruleContainerDescription= ruleContainerDescription EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1543:2: iv_ruleContainerDescription= ruleContainerDescription EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerDescriptionRule()); 
            }
            pushFollow(FOLLOW_ruleContainerDescription_in_entryRuleContainerDescription3361);
            iv_ruleContainerDescription=ruleContainerDescription();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerDescription; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerDescription3371); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainerDescription"


    // $ANTLR start "ruleContainerDescription"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1550:1: ruleContainerDescription returns [EObject current=null] : ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) otherlv_7= '}' )? (otherlv_8= 'Style' ( ( '{' )=>otherlv_9= '{' ) ( (lv_style_10_0= ruleAbstractContainerStyle ) ) otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleContainerDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_condition_3_0 = null;

        EObject lv_node_Label_6_0 = null;

        EObject lv_style_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1553:28: ( ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) otherlv_7= '}' )? (otherlv_8= 'Style' ( ( '{' )=>otherlv_9= '{' ) ( (lv_style_10_0= ruleAbstractContainerStyle ) ) otherlv_11= '}' )? otherlv_12= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1554:1: ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) otherlv_7= '}' )? (otherlv_8= 'Style' ( ( '{' )=>otherlv_9= '{' ) ( (lv_style_10_0= ruleAbstractContainerStyle ) ) otherlv_11= '}' )? otherlv_12= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1554:1: ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) otherlv_7= '}' )? (otherlv_8= 'Style' ( ( '{' )=>otherlv_9= '{' ) ( (lv_style_10_0= ruleAbstractContainerStyle ) ) otherlv_11= '}' )? otherlv_12= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1554:2: () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) otherlv_7= '}' )? (otherlv_8= 'Style' ( ( '{' )=>otherlv_9= '{' ) ( (lv_style_10_0= ruleAbstractContainerStyle ) ) otherlv_11= '}' )? otherlv_12= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1554:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1555:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getContainerDescriptionAccess().getContainerDescriptionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleContainerDescription3417); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getContainerDescriptionAccess().getRepresentationKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleContainerDescription3429); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getContainerDescriptionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1568:1: ( (lv_condition_3_0= ruleCondition ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==24) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1569:1: (lv_condition_3_0= ruleCondition )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1569:1: (lv_condition_3_0= ruleCondition )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1570:3: lv_condition_3_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerDescriptionAccess().getConditionConditionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCondition_in_ruleContainerDescription3450);
                    lv_condition_3_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContainerDescriptionRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_3_0, 
                              		"Condition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1586:3: (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) otherlv_7= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1586:5: otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleContainerDescription3464); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getContainerDescriptionAccess().getLabelKeyword_4_0());
                          
                    }
                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleContainerDescription3476); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getContainerDescriptionAccess().getLeftCurlyBracketKeyword_4_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1594:1: ( (lv_node_Label_6_0= ruleLabel ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1595:1: (lv_node_Label_6_0= ruleLabel )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1595:1: (lv_node_Label_6_0= ruleLabel )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1596:3: lv_node_Label_6_0= ruleLabel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerDescriptionAccess().getNode_LabelLabelParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLabel_in_ruleContainerDescription3497);
                    lv_node_Label_6_0=ruleLabel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContainerDescriptionRule());
                      	        }
                             		set(
                             			current, 
                             			"node_Label",
                              		lv_node_Label_6_0, 
                              		"Label");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleContainerDescription3509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getContainerDescriptionAccess().getRightCurlyBracketKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1616:3: (otherlv_8= 'Style' ( ( '{' )=>otherlv_9= '{' ) ( (lv_style_10_0= ruleAbstractContainerStyle ) ) otherlv_11= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==25) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1616:5: otherlv_8= 'Style' ( ( '{' )=>otherlv_9= '{' ) ( (lv_style_10_0= ruleAbstractContainerStyle ) ) otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleContainerDescription3524); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getContainerDescriptionAccess().getStyleKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1620:1: ( ( '{' )=>otherlv_9= '{' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1620:2: ( '{' )=>otherlv_9= '{'
                    {
                    otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleContainerDescription3544); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getContainerDescriptionAccess().getLeftCurlyBracketKeyword_5_1());
                          
                    }

                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1625:2: ( (lv_style_10_0= ruleAbstractContainerStyle ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1626:1: (lv_style_10_0= ruleAbstractContainerStyle )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1626:1: (lv_style_10_0= ruleAbstractContainerStyle )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1627:3: lv_style_10_0= ruleAbstractContainerStyle
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerDescriptionAccess().getStyleAbstractContainerStyleParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAbstractContainerStyle_in_ruleContainerDescription3566);
                    lv_style_10_0=ruleAbstractContainerStyle();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContainerDescriptionRule());
                      	        }
                             		set(
                             			current, 
                             			"style",
                              		lv_style_10_0, 
                              		"AbstractContainerStyle");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleContainerDescription3578); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getContainerDescriptionAccess().getRightCurlyBracketKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleContainerDescription3592); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getContainerDescriptionAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleContainerDescription"


    // $ANTLR start "entryRuleBasicStyle"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1659:1: entryRuleBasicStyle returns [EObject current=null] : iv_ruleBasicStyle= ruleBasicStyle EOF ;
    public final EObject entryRuleBasicStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicStyle = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1660:2: (iv_ruleBasicStyle= ruleBasicStyle EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1661:2: iv_ruleBasicStyle= ruleBasicStyle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicStyleRule()); 
            }
            pushFollow(FOLLOW_ruleBasicStyle_in_entryRuleBasicStyle3628);
            iv_ruleBasicStyle=ruleBasicStyle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicStyle; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicStyle3638); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicStyle"


    // $ANTLR start "ruleBasicStyle"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1668:1: ruleBasicStyle returns [EObject current=null] : ( () otherlv_1= 'BasicStyle' otherlv_2= '{' (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'background:' ( (lv_backgroundColor_6_0= ruleSystemColors ) ) )? (otherlv_7= 'form:' ( (lv_form_8_0= ruleNode_Form ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleBasicStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_borderColor_4_0 = null;

        Enumerator lv_backgroundColor_6_0 = null;

        Enumerator lv_form_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1671:28: ( ( () otherlv_1= 'BasicStyle' otherlv_2= '{' (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'background:' ( (lv_backgroundColor_6_0= ruleSystemColors ) ) )? (otherlv_7= 'form:' ( (lv_form_8_0= ruleNode_Form ) ) )? otherlv_9= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1672:1: ( () otherlv_1= 'BasicStyle' otherlv_2= '{' (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'background:' ( (lv_backgroundColor_6_0= ruleSystemColors ) ) )? (otherlv_7= 'form:' ( (lv_form_8_0= ruleNode_Form ) ) )? otherlv_9= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1672:1: ( () otherlv_1= 'BasicStyle' otherlv_2= '{' (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'background:' ( (lv_backgroundColor_6_0= ruleSystemColors ) ) )? (otherlv_7= 'form:' ( (lv_form_8_0= ruleNode_Form ) ) )? otherlv_9= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1672:2: () otherlv_1= 'BasicStyle' otherlv_2= '{' (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'background:' ( (lv_backgroundColor_6_0= ruleSystemColors ) ) )? (otherlv_7= 'form:' ( (lv_form_8_0= ruleNode_Form ) ) )? otherlv_9= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1672:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1673:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBasicStyleAccess().getBasicStyleAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleBasicStyle3684); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBasicStyleAccess().getBasicStyleKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleBasicStyle3696); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBasicStyleAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1686:1: (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==42) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1686:3: otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) )
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleBasicStyle3709); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBasicStyleAccess().getBorderColorKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1690:1: ( (lv_borderColor_4_0= ruleSystemColors ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1691:1: (lv_borderColor_4_0= ruleSystemColors )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1691:1: (lv_borderColor_4_0= ruleSystemColors )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1692:3: lv_borderColor_4_0= ruleSystemColors
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBasicStyleAccess().getBorderColorSystemColorsEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSystemColors_in_ruleBasicStyle3730);
                    lv_borderColor_4_0=ruleSystemColors();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBasicStyleRule());
                      	        }
                             		set(
                             			current, 
                             			"borderColor",
                              		lv_borderColor_4_0, 
                              		"SystemColors");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1708:4: (otherlv_5= 'background:' ( (lv_backgroundColor_6_0= ruleSystemColors ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==43) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1708:6: otherlv_5= 'background:' ( (lv_backgroundColor_6_0= ruleSystemColors ) )
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleBasicStyle3745); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getBasicStyleAccess().getBackgroundKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1712:1: ( (lv_backgroundColor_6_0= ruleSystemColors ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1713:1: (lv_backgroundColor_6_0= ruleSystemColors )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1713:1: (lv_backgroundColor_6_0= ruleSystemColors )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1714:3: lv_backgroundColor_6_0= ruleSystemColors
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBasicStyleAccess().getBackgroundColorSystemColorsEnumRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSystemColors_in_ruleBasicStyle3766);
                    lv_backgroundColor_6_0=ruleSystemColors();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBasicStyleRule());
                      	        }
                             		set(
                             			current, 
                             			"backgroundColor",
                              		lv_backgroundColor_6_0, 
                              		"SystemColors");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1730:4: (otherlv_7= 'form:' ( (lv_form_8_0= ruleNode_Form ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==44) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1730:6: otherlv_7= 'form:' ( (lv_form_8_0= ruleNode_Form ) )
                    {
                    otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleBasicStyle3781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getBasicStyleAccess().getFormKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1734:1: ( (lv_form_8_0= ruleNode_Form ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1735:1: (lv_form_8_0= ruleNode_Form )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1735:1: (lv_form_8_0= ruleNode_Form )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1736:3: lv_form_8_0= ruleNode_Form
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBasicStyleAccess().getFormNode_FormEnumRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNode_Form_in_ruleBasicStyle3802);
                    lv_form_8_0=ruleNode_Form();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBasicStyleRule());
                      	        }
                             		set(
                             			current, 
                             			"form",
                              		lv_form_8_0, 
                              		"Node_Form");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleBasicStyle3816); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getBasicStyleAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleBasicStyle"


    // $ANTLR start "entryRuleHistogramStyle"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1764:1: entryRuleHistogramStyle returns [EObject current=null] : iv_ruleHistogramStyle= ruleHistogramStyle EOF ;
    public final EObject entryRuleHistogramStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHistogramStyle = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1765:2: (iv_ruleHistogramStyle= ruleHistogramStyle EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1766:2: iv_ruleHistogramStyle= ruleHistogramStyle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHistogramStyleRule()); 
            }
            pushFollow(FOLLOW_ruleHistogramStyle_in_entryRuleHistogramStyle3852);
            iv_ruleHistogramStyle=ruleHistogramStyle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHistogramStyle; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHistogramStyle3862); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHistogramStyle"


    // $ANTLR start "ruleHistogramStyle"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1773:1: ruleHistogramStyle returns [EObject current=null] : ( () otherlv_1= 'HistogramStyle' otherlv_2= '{' (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? ( (lv_sections_5_0= ruleHistogramSection ) )* otherlv_6= '}' ) ;
    public final EObject ruleHistogramStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Enumerator lv_borderColor_4_0 = null;

        EObject lv_sections_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1776:28: ( ( () otherlv_1= 'HistogramStyle' otherlv_2= '{' (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? ( (lv_sections_5_0= ruleHistogramSection ) )* otherlv_6= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1777:1: ( () otherlv_1= 'HistogramStyle' otherlv_2= '{' (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? ( (lv_sections_5_0= ruleHistogramSection ) )* otherlv_6= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1777:1: ( () otherlv_1= 'HistogramStyle' otherlv_2= '{' (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? ( (lv_sections_5_0= ruleHistogramSection ) )* otherlv_6= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1777:2: () otherlv_1= 'HistogramStyle' otherlv_2= '{' (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? ( (lv_sections_5_0= ruleHistogramSection ) )* otherlv_6= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1777:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1778:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHistogramStyleAccess().getHistogramStyleAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleHistogramStyle3908); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getHistogramStyleAccess().getHistogramStyleKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleHistogramStyle3920); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getHistogramStyleAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1791:1: (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==42) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1791:3: otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) )
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleHistogramStyle3933); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getHistogramStyleAccess().getBorderColorKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1795:1: ( (lv_borderColor_4_0= ruleSystemColors ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1796:1: (lv_borderColor_4_0= ruleSystemColors )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1796:1: (lv_borderColor_4_0= ruleSystemColors )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1797:3: lv_borderColor_4_0= ruleSystemColors
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHistogramStyleAccess().getBorderColorSystemColorsEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSystemColors_in_ruleHistogramStyle3954);
                    lv_borderColor_4_0=ruleSystemColors();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getHistogramStyleRule());
                      	        }
                             		set(
                             			current, 
                             			"borderColor",
                              		lv_borderColor_4_0, 
                              		"SystemColors");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1813:4: ( (lv_sections_5_0= ruleHistogramSection ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==46) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1814:1: (lv_sections_5_0= ruleHistogramSection )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1814:1: (lv_sections_5_0= ruleHistogramSection )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1815:3: lv_sections_5_0= ruleHistogramSection
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHistogramStyleAccess().getSectionsHistogramSectionParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleHistogramSection_in_ruleHistogramStyle3977);
            	    lv_sections_5_0=ruleHistogramSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getHistogramStyleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"sections",
            	              		lv_sections_5_0, 
            	              		"HistogramSection");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleHistogramStyle3990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getHistogramStyleAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleHistogramStyle"


    // $ANTLR start "entryRuleHistogramSection"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1843:1: entryRuleHistogramSection returns [EObject current=null] : iv_ruleHistogramSection= ruleHistogramSection EOF ;
    public final EObject entryRuleHistogramSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHistogramSection = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1844:2: (iv_ruleHistogramSection= ruleHistogramSection EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1845:2: iv_ruleHistogramSection= ruleHistogramSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHistogramSectionRule()); 
            }
            pushFollow(FOLLOW_ruleHistogramSection_in_entryRuleHistogramSection4026);
            iv_ruleHistogramSection=ruleHistogramSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHistogramSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHistogramSection4036); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHistogramSection"


    // $ANTLR start "ruleHistogramSection"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1852:1: ruleHistogramSection returns [EObject current=null] : ( () otherlv_1= 'Section' otherlv_2= '{' (otherlv_3= 'background:' ( (lv_backgroundColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'foreground:' ( (lv_forgroundColor_6_0= ruleSystemColors ) ) )? (otherlv_7= 'minValue:' ( (lv_minValue_8_0= ruleForeignExpressionElement ) ) )? (otherlv_9= 'value:' ( (lv_value_10_0= ruleForeignExpressionElement ) ) )? (otherlv_11= 'maxValue:' ( (lv_maxValue_12_0= ruleForeignExpressionElement ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleHistogramSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Enumerator lv_backgroundColor_4_0 = null;

        Enumerator lv_forgroundColor_6_0 = null;

        EObject lv_minValue_8_0 = null;

        EObject lv_value_10_0 = null;

        EObject lv_maxValue_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1855:28: ( ( () otherlv_1= 'Section' otherlv_2= '{' (otherlv_3= 'background:' ( (lv_backgroundColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'foreground:' ( (lv_forgroundColor_6_0= ruleSystemColors ) ) )? (otherlv_7= 'minValue:' ( (lv_minValue_8_0= ruleForeignExpressionElement ) ) )? (otherlv_9= 'value:' ( (lv_value_10_0= ruleForeignExpressionElement ) ) )? (otherlv_11= 'maxValue:' ( (lv_maxValue_12_0= ruleForeignExpressionElement ) ) )? otherlv_13= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1856:1: ( () otherlv_1= 'Section' otherlv_2= '{' (otherlv_3= 'background:' ( (lv_backgroundColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'foreground:' ( (lv_forgroundColor_6_0= ruleSystemColors ) ) )? (otherlv_7= 'minValue:' ( (lv_minValue_8_0= ruleForeignExpressionElement ) ) )? (otherlv_9= 'value:' ( (lv_value_10_0= ruleForeignExpressionElement ) ) )? (otherlv_11= 'maxValue:' ( (lv_maxValue_12_0= ruleForeignExpressionElement ) ) )? otherlv_13= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1856:1: ( () otherlv_1= 'Section' otherlv_2= '{' (otherlv_3= 'background:' ( (lv_backgroundColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'foreground:' ( (lv_forgroundColor_6_0= ruleSystemColors ) ) )? (otherlv_7= 'minValue:' ( (lv_minValue_8_0= ruleForeignExpressionElement ) ) )? (otherlv_9= 'value:' ( (lv_value_10_0= ruleForeignExpressionElement ) ) )? (otherlv_11= 'maxValue:' ( (lv_maxValue_12_0= ruleForeignExpressionElement ) ) )? otherlv_13= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1856:2: () otherlv_1= 'Section' otherlv_2= '{' (otherlv_3= 'background:' ( (lv_backgroundColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'foreground:' ( (lv_forgroundColor_6_0= ruleSystemColors ) ) )? (otherlv_7= 'minValue:' ( (lv_minValue_8_0= ruleForeignExpressionElement ) ) )? (otherlv_9= 'value:' ( (lv_value_10_0= ruleForeignExpressionElement ) ) )? (otherlv_11= 'maxValue:' ( (lv_maxValue_12_0= ruleForeignExpressionElement ) ) )? otherlv_13= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1856:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1857:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHistogramSectionAccess().getHistogramSectionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleHistogramSection4082); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getHistogramSectionAccess().getSectionKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleHistogramSection4094); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getHistogramSectionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1870:1: (otherlv_3= 'background:' ( (lv_backgroundColor_4_0= ruleSystemColors ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==43) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1870:3: otherlv_3= 'background:' ( (lv_backgroundColor_4_0= ruleSystemColors ) )
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleHistogramSection4107); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getHistogramSectionAccess().getBackgroundKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1874:1: ( (lv_backgroundColor_4_0= ruleSystemColors ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1875:1: (lv_backgroundColor_4_0= ruleSystemColors )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1875:1: (lv_backgroundColor_4_0= ruleSystemColors )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1876:3: lv_backgroundColor_4_0= ruleSystemColors
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHistogramSectionAccess().getBackgroundColorSystemColorsEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSystemColors_in_ruleHistogramSection4128);
                    lv_backgroundColor_4_0=ruleSystemColors();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getHistogramSectionRule());
                      	        }
                             		set(
                             			current, 
                             			"backgroundColor",
                              		lv_backgroundColor_4_0, 
                              		"SystemColors");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1892:4: (otherlv_5= 'foreground:' ( (lv_forgroundColor_6_0= ruleSystemColors ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==47) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1892:6: otherlv_5= 'foreground:' ( (lv_forgroundColor_6_0= ruleSystemColors ) )
                    {
                    otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleHistogramSection4143); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getHistogramSectionAccess().getForegroundKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1896:1: ( (lv_forgroundColor_6_0= ruleSystemColors ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1897:1: (lv_forgroundColor_6_0= ruleSystemColors )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1897:1: (lv_forgroundColor_6_0= ruleSystemColors )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1898:3: lv_forgroundColor_6_0= ruleSystemColors
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHistogramSectionAccess().getForgroundColorSystemColorsEnumRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSystemColors_in_ruleHistogramSection4164);
                    lv_forgroundColor_6_0=ruleSystemColors();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getHistogramSectionRule());
                      	        }
                             		set(
                             			current, 
                             			"forgroundColor",
                              		lv_forgroundColor_6_0, 
                              		"SystemColors");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1914:4: (otherlv_7= 'minValue:' ( (lv_minValue_8_0= ruleForeignExpressionElement ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==48) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1914:6: otherlv_7= 'minValue:' ( (lv_minValue_8_0= ruleForeignExpressionElement ) )
                    {
                    otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleHistogramSection4179); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getHistogramSectionAccess().getMinValueKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1918:1: ( (lv_minValue_8_0= ruleForeignExpressionElement ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1919:1: (lv_minValue_8_0= ruleForeignExpressionElement )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1919:1: (lv_minValue_8_0= ruleForeignExpressionElement )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1920:3: lv_minValue_8_0= ruleForeignExpressionElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHistogramSectionAccess().getMinValueForeignExpressionElementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleForeignExpressionElement_in_ruleHistogramSection4200);
                    lv_minValue_8_0=ruleForeignExpressionElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getHistogramSectionRule());
                      	        }
                             		set(
                             			current, 
                             			"minValue",
                              		lv_minValue_8_0, 
                              		"ForeignExpressionElement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1936:4: (otherlv_9= 'value:' ( (lv_value_10_0= ruleForeignExpressionElement ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==49) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1936:6: otherlv_9= 'value:' ( (lv_value_10_0= ruleForeignExpressionElement ) )
                    {
                    otherlv_9=(Token)match(input,49,FOLLOW_49_in_ruleHistogramSection4215); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getHistogramSectionAccess().getValueKeyword_6_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1940:1: ( (lv_value_10_0= ruleForeignExpressionElement ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1941:1: (lv_value_10_0= ruleForeignExpressionElement )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1941:1: (lv_value_10_0= ruleForeignExpressionElement )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1942:3: lv_value_10_0= ruleForeignExpressionElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHistogramSectionAccess().getValueForeignExpressionElementParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleForeignExpressionElement_in_ruleHistogramSection4236);
                    lv_value_10_0=ruleForeignExpressionElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getHistogramSectionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_10_0, 
                              		"ForeignExpressionElement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1958:4: (otherlv_11= 'maxValue:' ( (lv_maxValue_12_0= ruleForeignExpressionElement ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==50) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1958:6: otherlv_11= 'maxValue:' ( (lv_maxValue_12_0= ruleForeignExpressionElement ) )
                    {
                    otherlv_11=(Token)match(input,50,FOLLOW_50_in_ruleHistogramSection4251); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getHistogramSectionAccess().getMaxValueKeyword_7_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1962:1: ( (lv_maxValue_12_0= ruleForeignExpressionElement ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1963:1: (lv_maxValue_12_0= ruleForeignExpressionElement )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1963:1: (lv_maxValue_12_0= ruleForeignExpressionElement )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1964:3: lv_maxValue_12_0= ruleForeignExpressionElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHistogramSectionAccess().getMaxValueForeignExpressionElementParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleForeignExpressionElement_in_ruleHistogramSection4272);
                    lv_maxValue_12_0=ruleForeignExpressionElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getHistogramSectionRule());
                      	        }
                             		set(
                             			current, 
                             			"maxValue",
                              		lv_maxValue_12_0, 
                              		"ForeignExpressionElement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleHistogramSection4286); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getHistogramSectionAccess().getRightCurlyBracketKeyword_8());
                  
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
    // $ANTLR end "ruleHistogramSection"


    // $ANTLR start "entryRuleImageStyle"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1992:1: entryRuleImageStyle returns [EObject current=null] : iv_ruleImageStyle= ruleImageStyle EOF ;
    public final EObject entryRuleImageStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageStyle = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1993:2: (iv_ruleImageStyle= ruleImageStyle EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1994:2: iv_ruleImageStyle= ruleImageStyle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImageStyleRule()); 
            }
            pushFollow(FOLLOW_ruleImageStyle_in_entryRuleImageStyle4322);
            iv_ruleImageStyle=ruleImageStyle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImageStyle; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageStyle4332); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImageStyle"


    // $ANTLR start "ruleImageStyle"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2001:1: ruleImageStyle returns [EObject current=null] : ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'path:' ( (lv_imagePath_6_0= RULE_STRING ) ) ) otherlv_7= '}' ) ;
    public final EObject ruleImageStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_imagePath_6_0=null;
        Token otherlv_7=null;
        Enumerator lv_borderColor_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2004:28: ( ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'path:' ( (lv_imagePath_6_0= RULE_STRING ) ) ) otherlv_7= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2005:1: ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'path:' ( (lv_imagePath_6_0= RULE_STRING ) ) ) otherlv_7= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2005:1: ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'path:' ( (lv_imagePath_6_0= RULE_STRING ) ) ) otherlv_7= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2005:2: () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'path:' ( (lv_imagePath_6_0= RULE_STRING ) ) ) otherlv_7= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2005:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2006:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getImageStyleAccess().getImageStyleAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleImageStyle4378); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getImageStyleAccess().getImageKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleImageStyle4390); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getImageStyleAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2019:1: (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==52) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2019:3: otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) )
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleImageStyle4403); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getImageStyleAccess().getBorderKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2023:1: ( (lv_borderColor_4_0= ruleSystemColors ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2024:1: (lv_borderColor_4_0= ruleSystemColors )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2024:1: (lv_borderColor_4_0= ruleSystemColors )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2025:3: lv_borderColor_4_0= ruleSystemColors
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImageStyleAccess().getBorderColorSystemColorsEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSystemColors_in_ruleImageStyle4424);
                    lv_borderColor_4_0=ruleSystemColors();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImageStyleRule());
                      	        }
                             		set(
                             			current, 
                             			"borderColor",
                              		lv_borderColor_4_0, 
                              		"SystemColors");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2041:4: (otherlv_5= 'path:' ( (lv_imagePath_6_0= RULE_STRING ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2041:6: otherlv_5= 'path:' ( (lv_imagePath_6_0= RULE_STRING ) )
            {
            otherlv_5=(Token)match(input,53,FOLLOW_53_in_ruleImageStyle4439); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getImageStyleAccess().getPathKeyword_4_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2045:1: ( (lv_imagePath_6_0= RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2046:1: (lv_imagePath_6_0= RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2046:1: (lv_imagePath_6_0= RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2047:3: lv_imagePath_6_0= RULE_STRING
            {
            lv_imagePath_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImageStyle4456); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_imagePath_6_0, grammarAccess.getImageStyleAccess().getImagePathSTRINGTerminalRuleCall_4_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getImageStyleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"imagePath",
                      		lv_imagePath_6_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleImageStyle4474); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getImageStyleAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleImageStyle"


    // $ANTLR start "entryRuleFlatStyle"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2075:1: entryRuleFlatStyle returns [EObject current=null] : iv_ruleFlatStyle= ruleFlatStyle EOF ;
    public final EObject entryRuleFlatStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlatStyle = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2076:2: (iv_ruleFlatStyle= ruleFlatStyle EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2077:2: iv_ruleFlatStyle= ruleFlatStyle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlatStyleRule()); 
            }
            pushFollow(FOLLOW_ruleFlatStyle_in_entryRuleFlatStyle4510);
            iv_ruleFlatStyle=ruleFlatStyle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlatStyle; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlatStyle4520); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlatStyle"


    // $ANTLR start "ruleFlatStyle"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2084:1: ruleFlatStyle returns [EObject current=null] : ( () otherlv_1= 'FlatStyle' otherlv_2= '{' (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'background:' ( (lv_backgroundStyle_6_0= ruleBackgroundStyle ) )? ( (lv_backgroundColor_7_0= ruleSystemColors ) ) )? (otherlv_8= 'foreground:' ( (lv_forgroundColor_9_0= ruleSystemColors ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleFlatStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_borderColor_4_0 = null;

        Enumerator lv_backgroundStyle_6_0 = null;

        Enumerator lv_backgroundColor_7_0 = null;

        Enumerator lv_forgroundColor_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2087:28: ( ( () otherlv_1= 'FlatStyle' otherlv_2= '{' (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'background:' ( (lv_backgroundStyle_6_0= ruleBackgroundStyle ) )? ( (lv_backgroundColor_7_0= ruleSystemColors ) ) )? (otherlv_8= 'foreground:' ( (lv_forgroundColor_9_0= ruleSystemColors ) ) )? otherlv_10= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2088:1: ( () otherlv_1= 'FlatStyle' otherlv_2= '{' (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'background:' ( (lv_backgroundStyle_6_0= ruleBackgroundStyle ) )? ( (lv_backgroundColor_7_0= ruleSystemColors ) ) )? (otherlv_8= 'foreground:' ( (lv_forgroundColor_9_0= ruleSystemColors ) ) )? otherlv_10= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2088:1: ( () otherlv_1= 'FlatStyle' otherlv_2= '{' (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'background:' ( (lv_backgroundStyle_6_0= ruleBackgroundStyle ) )? ( (lv_backgroundColor_7_0= ruleSystemColors ) ) )? (otherlv_8= 'foreground:' ( (lv_forgroundColor_9_0= ruleSystemColors ) ) )? otherlv_10= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2088:2: () otherlv_1= 'FlatStyle' otherlv_2= '{' (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'background:' ( (lv_backgroundStyle_6_0= ruleBackgroundStyle ) )? ( (lv_backgroundColor_7_0= ruleSystemColors ) ) )? (otherlv_8= 'foreground:' ( (lv_forgroundColor_9_0= ruleSystemColors ) ) )? otherlv_10= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2088:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2089:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFlatStyleAccess().getFlatStyleAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleFlatStyle4566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFlatStyleAccess().getFlatStyleKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleFlatStyle4578); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFlatStyleAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2102:1: (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==52) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2102:3: otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) )
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleFlatStyle4591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFlatStyleAccess().getBorderKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2106:1: ( (lv_borderColor_4_0= ruleSystemColors ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2107:1: (lv_borderColor_4_0= ruleSystemColors )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2107:1: (lv_borderColor_4_0= ruleSystemColors )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2108:3: lv_borderColor_4_0= ruleSystemColors
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFlatStyleAccess().getBorderColorSystemColorsEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSystemColors_in_ruleFlatStyle4612);
                    lv_borderColor_4_0=ruleSystemColors();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFlatStyleRule());
                      	        }
                             		set(
                             			current, 
                             			"borderColor",
                              		lv_borderColor_4_0, 
                              		"SystemColors");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2124:4: (otherlv_5= 'background:' ( (lv_backgroundStyle_6_0= ruleBackgroundStyle ) )? ( (lv_backgroundColor_7_0= ruleSystemColors ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==43) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2124:6: otherlv_5= 'background:' ( (lv_backgroundStyle_6_0= ruleBackgroundStyle ) )? ( (lv_backgroundColor_7_0= ruleSystemColors ) )
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleFlatStyle4627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getFlatStyleAccess().getBackgroundKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2128:1: ( (lv_backgroundStyle_6_0= ruleBackgroundStyle ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( ((LA50_0>=96 && LA50_0<=98)) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2129:1: (lv_backgroundStyle_6_0= ruleBackgroundStyle )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2129:1: (lv_backgroundStyle_6_0= ruleBackgroundStyle )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2130:3: lv_backgroundStyle_6_0= ruleBackgroundStyle
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFlatStyleAccess().getBackgroundStyleBackgroundStyleEnumRuleCall_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBackgroundStyle_in_ruleFlatStyle4648);
                            lv_backgroundStyle_6_0=ruleBackgroundStyle();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFlatStyleRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"backgroundStyle",
                                      		lv_backgroundStyle_6_0, 
                                      		"BackgroundStyle");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2146:3: ( (lv_backgroundColor_7_0= ruleSystemColors ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2147:1: (lv_backgroundColor_7_0= ruleSystemColors )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2147:1: (lv_backgroundColor_7_0= ruleSystemColors )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2148:3: lv_backgroundColor_7_0= ruleSystemColors
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFlatStyleAccess().getBackgroundColorSystemColorsEnumRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSystemColors_in_ruleFlatStyle4670);
                    lv_backgroundColor_7_0=ruleSystemColors();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFlatStyleRule());
                      	        }
                             		set(
                             			current, 
                             			"backgroundColor",
                              		lv_backgroundColor_7_0, 
                              		"SystemColors");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2164:4: (otherlv_8= 'foreground:' ( (lv_forgroundColor_9_0= ruleSystemColors ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==47) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2164:6: otherlv_8= 'foreground:' ( (lv_forgroundColor_9_0= ruleSystemColors ) )
                    {
                    otherlv_8=(Token)match(input,47,FOLLOW_47_in_ruleFlatStyle4685); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getFlatStyleAccess().getForegroundKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2168:1: ( (lv_forgroundColor_9_0= ruleSystemColors ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2169:1: (lv_forgroundColor_9_0= ruleSystemColors )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2169:1: (lv_forgroundColor_9_0= ruleSystemColors )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2170:3: lv_forgroundColor_9_0= ruleSystemColors
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFlatStyleAccess().getForgroundColorSystemColorsEnumRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSystemColors_in_ruleFlatStyle4706);
                    lv_forgroundColor_9_0=ruleSystemColors();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFlatStyleRule());
                      	        }
                             		set(
                             			current, 
                             			"forgroundColor",
                              		lv_forgroundColor_9_0, 
                              		"SystemColors");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleFlatStyle4720); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getFlatStyleAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleFlatStyle"


    // $ANTLR start "entryRuleLabel"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2198:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2199:2: (iv_ruleLabel= ruleLabel EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2200:2: iv_ruleLabel= ruleLabel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelRule()); 
            }
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel4756);
            iv_ruleLabel=ruleLabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel4766); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2207:1: ruleLabel returns [EObject current=null] : ( () (otherlv_1= 'content:' ( (lv_value_2_0= ruleExpression ) ) ) (otherlv_3= 'police:' ( (lv_bold_4_0= 'bold' ) )? ( (lv_italic_5_0= 'italic' ) )? ( (lv_color_6_0= ruleSystemColors ) )? ( (lv_size_7_0= ruleEInt ) )? )? ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_bold_4_0=null;
        Token lv_italic_5_0=null;
        EObject lv_value_2_0 = null;

        Enumerator lv_color_6_0 = null;

        AntlrDatatypeRuleToken lv_size_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2210:28: ( ( () (otherlv_1= 'content:' ( (lv_value_2_0= ruleExpression ) ) ) (otherlv_3= 'police:' ( (lv_bold_4_0= 'bold' ) )? ( (lv_italic_5_0= 'italic' ) )? ( (lv_color_6_0= ruleSystemColors ) )? ( (lv_size_7_0= ruleEInt ) )? )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2211:1: ( () (otherlv_1= 'content:' ( (lv_value_2_0= ruleExpression ) ) ) (otherlv_3= 'police:' ( (lv_bold_4_0= 'bold' ) )? ( (lv_italic_5_0= 'italic' ) )? ( (lv_color_6_0= ruleSystemColors ) )? ( (lv_size_7_0= ruleEInt ) )? )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2211:1: ( () (otherlv_1= 'content:' ( (lv_value_2_0= ruleExpression ) ) ) (otherlv_3= 'police:' ( (lv_bold_4_0= 'bold' ) )? ( (lv_italic_5_0= 'italic' ) )? ( (lv_color_6_0= ruleSystemColors ) )? ( (lv_size_7_0= ruleEInt ) )? )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2211:2: () (otherlv_1= 'content:' ( (lv_value_2_0= ruleExpression ) ) ) (otherlv_3= 'police:' ( (lv_bold_4_0= 'bold' ) )? ( (lv_italic_5_0= 'italic' ) )? ( (lv_color_6_0= ruleSystemColors ) )? ( (lv_size_7_0= ruleEInt ) )? )?
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2211:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2212:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLabelAccess().getLabelAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2217:2: (otherlv_1= 'content:' ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2217:4: otherlv_1= 'content:' ( (lv_value_2_0= ruleExpression ) )
            {
            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleLabel4813); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getContentKeyword_1_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2221:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2222:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2222:1: (lv_value_2_0= ruleExpression )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2223:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLabelAccess().getValueExpressionParserRuleCall_1_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleLabel4834);
            lv_value_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLabelRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2239:3: (otherlv_3= 'police:' ( (lv_bold_4_0= 'bold' ) )? ( (lv_italic_5_0= 'italic' ) )? ( (lv_color_6_0= ruleSystemColors ) )? ( (lv_size_7_0= ruleEInt ) )? )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==56) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2239:5: otherlv_3= 'police:' ( (lv_bold_4_0= 'bold' ) )? ( (lv_italic_5_0= 'italic' ) )? ( (lv_color_6_0= ruleSystemColors ) )? ( (lv_size_7_0= ruleEInt ) )?
                    {
                    otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleLabel4848); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getLabelAccess().getPoliceKeyword_2_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2243:1: ( (lv_bold_4_0= 'bold' ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==57) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2244:1: (lv_bold_4_0= 'bold' )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2244:1: (lv_bold_4_0= 'bold' )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2245:3: lv_bold_4_0= 'bold'
                            {
                            lv_bold_4_0=(Token)match(input,57,FOLLOW_57_in_ruleLabel4866); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_bold_4_0, grammarAccess.getLabelAccess().getBoldBoldKeyword_2_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getLabelRule());
                              	        }
                                     		setWithLastConsumed(current, "bold", true, "bold");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2258:3: ( (lv_italic_5_0= 'italic' ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==58) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2259:1: (lv_italic_5_0= 'italic' )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2259:1: (lv_italic_5_0= 'italic' )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2260:3: lv_italic_5_0= 'italic'
                            {
                            lv_italic_5_0=(Token)match(input,58,FOLLOW_58_in_ruleLabel4898); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_italic_5_0, grammarAccess.getLabelAccess().getItalicItalicKeyword_2_2_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getLabelRule());
                              	        }
                                     		setWithLastConsumed(current, "italic", true, "italic");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2273:3: ( (lv_color_6_0= ruleSystemColors ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( ((LA55_0>=119 && LA55_0<=144)) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2274:1: (lv_color_6_0= ruleSystemColors )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2274:1: (lv_color_6_0= ruleSystemColors )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2275:3: lv_color_6_0= ruleSystemColors
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLabelAccess().getColorSystemColorsEnumRuleCall_2_3_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSystemColors_in_ruleLabel4933);
                            lv_color_6_0=ruleSystemColors();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLabelRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"color",
                                      		lv_color_6_0, 
                                      		"SystemColors");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2291:3: ( (lv_size_7_0= ruleEInt ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_INT) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2292:1: (lv_size_7_0= ruleEInt )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2292:1: (lv_size_7_0= ruleEInt )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2293:3: lv_size_7_0= ruleEInt
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLabelAccess().getSizeEIntParserRuleCall_2_4_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEInt_in_ruleLabel4955);
                            lv_size_7_0=ruleEInt();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLabelRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"size",
                                      		lv_size_7_0, 
                                      		"EInt");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleNode"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2317:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2318:2: (iv_ruleNode= ruleNode EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2319:2: iv_ruleNode= ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode4994);
            iv_ruleNode=ruleNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode5004); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2326:1: ruleNode returns [EObject current=null] : ( () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? ( (lv_style_8_0= ruleNodeDescription ) )* ( (lv_children_9_0= ruleNodeChildren ) )? otherlv_10= '}' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_the_domain_7_0 = null;

        EObject lv_style_8_0 = null;

        EObject lv_children_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2329:28: ( ( () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? ( (lv_style_8_0= ruleNodeDescription ) )* ( (lv_children_9_0= ruleNodeChildren ) )? otherlv_10= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2330:1: ( () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? ( (lv_style_8_0= ruleNodeDescription ) )* ( (lv_children_9_0= ruleNodeChildren ) )? otherlv_10= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2330:1: ( () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? ( (lv_style_8_0= ruleNodeDescription ) )* ( (lv_children_9_0= ruleNodeChildren ) )? otherlv_10= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2330:2: () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? ( (lv_style_8_0= ruleNodeDescription ) )* ( (lv_children_9_0= ruleNodeChildren ) )? otherlv_10= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2330:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2331:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNodeAccess().getNodeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleNode5050); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getNodeKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2340:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2341:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2341:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2342:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNodeAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleNode5071);
            lv_name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNodeRule());
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleNode5083); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2362:1: (otherlv_4= 'import:' ( ( ruleFQN ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==31) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2362:3: otherlv_4= 'import:' ( ( ruleFQN ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleNode5096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getImportKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2366:1: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2367:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2367:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2368:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getNodeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeAccess().getImportsNodeMappingCrossReference_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleNode5119);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2381:4: (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==32) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2381:6: otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleNode5134); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getDomainContextKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2385:1: ( (lv_the_domain_7_0= ruleNodeDomainElement ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2386:1: (lv_the_domain_7_0= ruleNodeDomainElement )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2386:1: (lv_the_domain_7_0= ruleNodeDomainElement )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2387:3: lv_the_domain_7_0= ruleNodeDomainElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeAccess().getThe_domainNodeDomainElementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNodeDomainElement_in_ruleNode5155);
                    lv_the_domain_7_0=ruleNodeDomainElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodeRule());
                      	        }
                             		set(
                             			current, 
                             			"the_domain",
                              		lv_the_domain_7_0, 
                              		"NodeDomainElement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2403:4: ( (lv_style_8_0= ruleNodeDescription ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==20) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2404:1: (lv_style_8_0= ruleNodeDescription )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2404:1: (lv_style_8_0= ruleNodeDescription )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2405:3: lv_style_8_0= ruleNodeDescription
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeAccess().getStyleNodeDescriptionParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNodeDescription_in_ruleNode5178);
            	    lv_style_8_0=ruleNodeDescription();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"style",
            	              		lv_style_8_0, 
            	              		"NodeDescription");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2421:3: ( (lv_children_9_0= ruleNodeChildren ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==34) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2422:1: (lv_children_9_0= ruleNodeChildren )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2422:1: (lv_children_9_0= ruleNodeChildren )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2423:3: lv_children_9_0= ruleNodeChildren
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeAccess().getChildrenNodeChildrenParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNodeChildren_in_ruleNode5200);
                    lv_children_9_0=ruleNodeChildren();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodeRule());
                      	        }
                             		set(
                             			current, 
                             			"children",
                              		lv_children_9_0, 
                              		"NodeChildren");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleNode5213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_8());
                  
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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleNodeChildren"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2451:1: entryRuleNodeChildren returns [EObject current=null] : iv_ruleNodeChildren= ruleNodeChildren EOF ;
    public final EObject entryRuleNodeChildren() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeChildren = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2452:2: (iv_ruleNodeChildren= ruleNodeChildren EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2453:2: iv_ruleNodeChildren= ruleNodeChildren EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeChildrenRule()); 
            }
            pushFollow(FOLLOW_ruleNodeChildren_in_entryRuleNodeChildren5249);
            iv_ruleNodeChildren=ruleNodeChildren();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeChildren; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeChildren5259); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeChildren"


    // $ANTLR start "ruleNodeChildren"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2460:1: ruleNodeChildren returns [EObject current=null] : ( () otherlv_1= 'Contains' otherlv_2= '{' (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ( (lv_owned_boderednodes_7_0= ruleBorderedNode ) )* otherlv_8= '}' ) ;
    public final EObject ruleNodeChildren() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_owned_boderednodes_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2463:28: ( ( () otherlv_1= 'Contains' otherlv_2= '{' (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ( (lv_owned_boderednodes_7_0= ruleBorderedNode ) )* otherlv_8= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2464:1: ( () otherlv_1= 'Contains' otherlv_2= '{' (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ( (lv_owned_boderednodes_7_0= ruleBorderedNode ) )* otherlv_8= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2464:1: ( () otherlv_1= 'Contains' otherlv_2= '{' (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ( (lv_owned_boderednodes_7_0= ruleBorderedNode ) )* otherlv_8= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2464:2: () otherlv_1= 'Contains' otherlv_2= '{' (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ( (lv_owned_boderednodes_7_0= ruleBorderedNode ) )* otherlv_8= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2464:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2465:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNodeChildrenAccess().getNodeChildrenAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleNodeChildren5305); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNodeChildrenAccess().getContainsKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleNodeChildren5317); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNodeChildrenAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2478:1: (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==35) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2478:3: otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleNodeChildren5330); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNodeChildrenAccess().getReuseKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2482:1: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2483:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2483:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2484:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getNodeChildrenRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeChildrenAccess().getReused_boderednodesBorderedNodeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleNodeChildren5353);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2497:2: (otherlv_5= ',' ( ( ruleFQN ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==36) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2497:4: otherlv_5= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleNodeChildren5366); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getNodeChildrenAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2501:1: ( ( ruleFQN ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2502:1: ( ruleFQN )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2502:1: ( ruleFQN )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2503:3: ruleFQN
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getNodeChildrenRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNodeChildrenAccess().getReused_boderednodesBorderedNodeCrossReference_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFQN_in_ruleNodeChildren5389);
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
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2516:6: ( (lv_owned_boderednodes_7_0= ruleBorderedNode ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==60) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2517:1: (lv_owned_boderednodes_7_0= ruleBorderedNode )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2517:1: (lv_owned_boderednodes_7_0= ruleBorderedNode )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2518:3: lv_owned_boderednodes_7_0= ruleBorderedNode
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeChildrenAccess().getOwned_boderednodesBorderedNodeParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBorderedNode_in_ruleNodeChildren5414);
            	    lv_owned_boderednodes_7_0=ruleBorderedNode();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNodeChildrenRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"owned_boderednodes",
            	              		lv_owned_boderednodes_7_0, 
            	              		"BorderedNode");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleNodeChildren5427); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getNodeChildrenAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleNodeChildren"


    // $ANTLR start "entryRuleBorderedNode"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2546:1: entryRuleBorderedNode returns [EObject current=null] : iv_ruleBorderedNode= ruleBorderedNode EOF ;
    public final EObject entryRuleBorderedNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorderedNode = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2547:2: (iv_ruleBorderedNode= ruleBorderedNode EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2548:2: iv_ruleBorderedNode= ruleBorderedNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBorderedNodeRule()); 
            }
            pushFollow(FOLLOW_ruleBorderedNode_in_entryRuleBorderedNode5463);
            iv_ruleBorderedNode=ruleBorderedNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBorderedNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorderedNode5473); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBorderedNode"


    // $ANTLR start "ruleBorderedNode"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2555:1: ruleBorderedNode returns [EObject current=null] : ( () otherlv_1= 'BorderedNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? ( (lv_style_8_0= ruleNodeDescription ) )* otherlv_9= '}' ) ;
    public final EObject ruleBorderedNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_the_domain_7_0 = null;

        EObject lv_style_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2558:28: ( ( () otherlv_1= 'BorderedNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? ( (lv_style_8_0= ruleNodeDescription ) )* otherlv_9= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2559:1: ( () otherlv_1= 'BorderedNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? ( (lv_style_8_0= ruleNodeDescription ) )* otherlv_9= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2559:1: ( () otherlv_1= 'BorderedNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? ( (lv_style_8_0= ruleNodeDescription ) )* otherlv_9= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2559:2: () otherlv_1= 'BorderedNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? ( (lv_style_8_0= ruleNodeDescription ) )* otherlv_9= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2559:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2560:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBorderedNodeAccess().getBorderedNodeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleBorderedNode5519); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBorderedNodeAccess().getBorderedNodeKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2569:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2570:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2570:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2571:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBorderedNodeAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleBorderedNode5540);
            lv_name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBorderedNodeRule());
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleBorderedNode5552); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBorderedNodeAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2591:1: (otherlv_4= 'import:' ( ( ruleFQN ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==31) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2591:3: otherlv_4= 'import:' ( ( ruleFQN ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleBorderedNode5565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getBorderedNodeAccess().getImportKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2595:1: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2596:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2596:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2597:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBorderedNodeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBorderedNodeAccess().getImportsNodeMappingCrossReference_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleBorderedNode5588);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2610:4: (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==32) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2610:6: otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleBorderedNode5603); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getBorderedNodeAccess().getDomainContextKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2614:1: ( (lv_the_domain_7_0= ruleNodeDomainElement ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2615:1: (lv_the_domain_7_0= ruleNodeDomainElement )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2615:1: (lv_the_domain_7_0= ruleNodeDomainElement )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2616:3: lv_the_domain_7_0= ruleNodeDomainElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBorderedNodeAccess().getThe_domainNodeDomainElementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNodeDomainElement_in_ruleBorderedNode5624);
                    lv_the_domain_7_0=ruleNodeDomainElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBorderedNodeRule());
                      	        }
                             		set(
                             			current, 
                             			"the_domain",
                              		lv_the_domain_7_0, 
                              		"NodeDomainElement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2632:4: ( (lv_style_8_0= ruleNodeDescription ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==20) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2633:1: (lv_style_8_0= ruleNodeDescription )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2633:1: (lv_style_8_0= ruleNodeDescription )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2634:3: lv_style_8_0= ruleNodeDescription
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBorderedNodeAccess().getStyleNodeDescriptionParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNodeDescription_in_ruleBorderedNode5647);
            	    lv_style_8_0=ruleNodeDescription();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBorderedNodeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"style",
            	              		lv_style_8_0, 
            	              		"NodeDescription");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleBorderedNode5660); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getBorderedNodeAccess().getRightCurlyBracketKeyword_7());
                  
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
    // $ANTLR end "ruleBorderedNode"


    // $ANTLR start "entryRuleNodeDescription"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2662:1: entryRuleNodeDescription returns [EObject current=null] : iv_ruleNodeDescription= ruleNodeDescription EOF ;
    public final EObject entryRuleNodeDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeDescription = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2663:2: (iv_ruleNodeDescription= ruleNodeDescription EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2664:2: iv_ruleNodeDescription= ruleNodeDescription EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeDescriptionRule()); 
            }
            pushFollow(FOLLOW_ruleNodeDescription_in_entryRuleNodeDescription5696);
            iv_ruleNodeDescription=ruleNodeDescription();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeDescription; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeDescription5706); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeDescription"


    // $ANTLR start "ruleNodeDescription"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2671:1: ruleNodeDescription returns [EObject current=null] : ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) (otherlv_7= 'position:' ( (lv_label_position_8_0= ruleLabelPosition ) ) )? (otherlv_9= 'alignment:' ( (lv_label_alignement_10_0= ruleLabelAlignment ) ) )? otherlv_11= '}' )? (otherlv_12= 'Style' otherlv_13= '{' ( (lv_style_14_0= ruleAbstractNodeStyle ) ) otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleNodeDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_condition_3_0 = null;

        EObject lv_node_Label_6_0 = null;

        Enumerator lv_label_position_8_0 = null;

        Enumerator lv_label_alignement_10_0 = null;

        EObject lv_style_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2674:28: ( ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) (otherlv_7= 'position:' ( (lv_label_position_8_0= ruleLabelPosition ) ) )? (otherlv_9= 'alignment:' ( (lv_label_alignement_10_0= ruleLabelAlignment ) ) )? otherlv_11= '}' )? (otherlv_12= 'Style' otherlv_13= '{' ( (lv_style_14_0= ruleAbstractNodeStyle ) ) otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2675:1: ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) (otherlv_7= 'position:' ( (lv_label_position_8_0= ruleLabelPosition ) ) )? (otherlv_9= 'alignment:' ( (lv_label_alignement_10_0= ruleLabelAlignment ) ) )? otherlv_11= '}' )? (otherlv_12= 'Style' otherlv_13= '{' ( (lv_style_14_0= ruleAbstractNodeStyle ) ) otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2675:1: ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) (otherlv_7= 'position:' ( (lv_label_position_8_0= ruleLabelPosition ) ) )? (otherlv_9= 'alignment:' ( (lv_label_alignement_10_0= ruleLabelAlignment ) ) )? otherlv_11= '}' )? (otherlv_12= 'Style' otherlv_13= '{' ( (lv_style_14_0= ruleAbstractNodeStyle ) ) otherlv_15= '}' )? otherlv_16= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2675:2: () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) (otherlv_7= 'position:' ( (lv_label_position_8_0= ruleLabelPosition ) ) )? (otherlv_9= 'alignment:' ( (lv_label_alignement_10_0= ruleLabelAlignment ) ) )? otherlv_11= '}' )? (otherlv_12= 'Style' otherlv_13= '{' ( (lv_style_14_0= ruleAbstractNodeStyle ) ) otherlv_15= '}' )? otherlv_16= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2675:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2676:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNodeDescriptionAccess().getNodeDescriptionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleNodeDescription5752); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNodeDescriptionAccess().getRepresentationKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleNodeDescription5764); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNodeDescriptionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2689:1: ( (lv_condition_3_0= ruleCondition ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==24) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2690:1: (lv_condition_3_0= ruleCondition )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2690:1: (lv_condition_3_0= ruleCondition )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2691:3: lv_condition_3_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeDescriptionAccess().getConditionConditionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCondition_in_ruleNodeDescription5785);
                    lv_condition_3_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodeDescriptionRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_3_0, 
                              		"Condition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2707:3: (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) (otherlv_7= 'position:' ( (lv_label_position_8_0= ruleLabelPosition ) ) )? (otherlv_9= 'alignment:' ( (lv_label_alignement_10_0= ruleLabelAlignment ) ) )? otherlv_11= '}' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==40) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2707:5: otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) (otherlv_7= 'position:' ( (lv_label_position_8_0= ruleLabelPosition ) ) )? (otherlv_9= 'alignment:' ( (lv_label_alignement_10_0= ruleLabelAlignment ) ) )? otherlv_11= '}'
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleNodeDescription5799); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNodeDescriptionAccess().getLabelKeyword_4_0());
                          
                    }
                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleNodeDescription5811); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getNodeDescriptionAccess().getLeftCurlyBracketKeyword_4_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2715:1: ( (lv_node_Label_6_0= ruleLabel ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2716:1: (lv_node_Label_6_0= ruleLabel )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2716:1: (lv_node_Label_6_0= ruleLabel )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2717:3: lv_node_Label_6_0= ruleLabel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeDescriptionAccess().getNode_LabelLabelParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLabel_in_ruleNodeDescription5832);
                    lv_node_Label_6_0=ruleLabel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodeDescriptionRule());
                      	        }
                             		set(
                             			current, 
                             			"node_Label",
                              		lv_node_Label_6_0, 
                              		"Label");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2733:2: (otherlv_7= 'position:' ( (lv_label_position_8_0= ruleLabelPosition ) ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==61) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2733:4: otherlv_7= 'position:' ( (lv_label_position_8_0= ruleLabelPosition ) )
                            {
                            otherlv_7=(Token)match(input,61,FOLLOW_61_in_ruleNodeDescription5845); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getNodeDescriptionAccess().getPositionKeyword_4_3_0());
                                  
                            }
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2737:1: ( (lv_label_position_8_0= ruleLabelPosition ) )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2738:1: (lv_label_position_8_0= ruleLabelPosition )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2738:1: (lv_label_position_8_0= ruleLabelPosition )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2739:3: lv_label_position_8_0= ruleLabelPosition
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNodeDescriptionAccess().getLabel_positionLabelPositionEnumRuleCall_4_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleLabelPosition_in_ruleNodeDescription5866);
                            lv_label_position_8_0=ruleLabelPosition();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNodeDescriptionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"label_position",
                                      		lv_label_position_8_0, 
                                      		"LabelPosition");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2755:4: (otherlv_9= 'alignment:' ( (lv_label_alignement_10_0= ruleLabelAlignment ) ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==62) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2755:6: otherlv_9= 'alignment:' ( (lv_label_alignement_10_0= ruleLabelAlignment ) )
                            {
                            otherlv_9=(Token)match(input,62,FOLLOW_62_in_ruleNodeDescription5881); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getNodeDescriptionAccess().getAlignmentKeyword_4_4_0());
                                  
                            }
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2759:1: ( (lv_label_alignement_10_0= ruleLabelAlignment ) )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2760:1: (lv_label_alignement_10_0= ruleLabelAlignment )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2760:1: (lv_label_alignement_10_0= ruleLabelAlignment )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2761:3: lv_label_alignement_10_0= ruleLabelAlignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNodeDescriptionAccess().getLabel_alignementLabelAlignmentEnumRuleCall_4_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleLabelAlignment_in_ruleNodeDescription5902);
                            lv_label_alignement_10_0=ruleLabelAlignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNodeDescriptionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"label_alignement",
                                      		lv_label_alignement_10_0, 
                                      		"LabelAlignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleNodeDescription5916); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getNodeDescriptionAccess().getRightCurlyBracketKeyword_4_5());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2781:3: (otherlv_12= 'Style' otherlv_13= '{' ( (lv_style_14_0= ruleAbstractNodeStyle ) ) otherlv_15= '}' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==25) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2781:5: otherlv_12= 'Style' otherlv_13= '{' ( (lv_style_14_0= ruleAbstractNodeStyle ) ) otherlv_15= '}'
                    {
                    otherlv_12=(Token)match(input,25,FOLLOW_25_in_ruleNodeDescription5931); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getNodeDescriptionAccess().getStyleKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleNodeDescription5943); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getNodeDescriptionAccess().getLeftCurlyBracketKeyword_5_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2789:1: ( (lv_style_14_0= ruleAbstractNodeStyle ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2790:1: (lv_style_14_0= ruleAbstractNodeStyle )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2790:1: (lv_style_14_0= ruleAbstractNodeStyle )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2791:3: lv_style_14_0= ruleAbstractNodeStyle
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeDescriptionAccess().getStyleAbstractNodeStyleParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAbstractNodeStyle_in_ruleNodeDescription5964);
                    lv_style_14_0=ruleAbstractNodeStyle();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodeDescriptionRule());
                      	        }
                             		set(
                             			current, 
                             			"style",
                              		lv_style_14_0, 
                              		"AbstractNodeStyle");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,14,FOLLOW_14_in_ruleNodeDescription5976); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getNodeDescriptionAccess().getRightCurlyBracketKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleNodeDescription5990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getNodeDescriptionAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleNodeDescription"


    // $ANTLR start "entryRuleActionSet"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2823:1: entryRuleActionSet returns [EObject current=null] : iv_ruleActionSet= ruleActionSet EOF ;
    public final EObject entryRuleActionSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionSet = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2824:2: (iv_ruleActionSet= ruleActionSet EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2825:2: iv_ruleActionSet= ruleActionSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionSetRule()); 
            }
            pushFollow(FOLLOW_ruleActionSet_in_entryRuleActionSet6026);
            iv_ruleActionSet=ruleActionSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActionSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionSet6036); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionSet"


    // $ANTLR start "ruleActionSet"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2832:1: ruleActionSet returns [EObject current=null] : ( () otherlv_1= 'Actions' otherlv_2= '{' ( (lv_actions_3_0= ruleAction ) )* ( (lv_openActions_4_0= ruleOpenAction ) )* otherlv_5= '}' ) ;
    public final EObject ruleActionSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_actions_3_0 = null;

        EObject lv_openActions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2835:28: ( ( () otherlv_1= 'Actions' otherlv_2= '{' ( (lv_actions_3_0= ruleAction ) )* ( (lv_openActions_4_0= ruleOpenAction ) )* otherlv_5= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2836:1: ( () otherlv_1= 'Actions' otherlv_2= '{' ( (lv_actions_3_0= ruleAction ) )* ( (lv_openActions_4_0= ruleOpenAction ) )* otherlv_5= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2836:1: ( () otherlv_1= 'Actions' otherlv_2= '{' ( (lv_actions_3_0= ruleAction ) )* ( (lv_openActions_4_0= ruleOpenAction ) )* otherlv_5= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2836:2: () otherlv_1= 'Actions' otherlv_2= '{' ( (lv_actions_3_0= ruleAction ) )* ( (lv_openActions_4_0= ruleOpenAction ) )* otherlv_5= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2836:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2837:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActionSetAccess().getActionSetAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleActionSet6082); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActionSetAccess().getActionsKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleActionSet6094); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActionSetAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2850:1: ( (lv_actions_3_0= ruleAction ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==68||(LA73_0>=70 && LA73_0<=72)) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2851:1: (lv_actions_3_0= ruleAction )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2851:1: (lv_actions_3_0= ruleAction )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2852:3: lv_actions_3_0= ruleAction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getActionSetAccess().getActionsActionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAction_in_ruleActionSet6115);
            	    lv_actions_3_0=ruleAction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getActionSetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"actions",
            	              		lv_actions_3_0, 
            	              		"Action");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2868:3: ( (lv_openActions_4_0= ruleOpenAction ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==64) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2869:1: (lv_openActions_4_0= ruleOpenAction )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2869:1: (lv_openActions_4_0= ruleOpenAction )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2870:3: lv_openActions_4_0= ruleOpenAction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getActionSetAccess().getOpenActionsOpenActionParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpenAction_in_ruleActionSet6137);
            	    lv_openActions_4_0=ruleOpenAction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getActionSetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"openActions",
            	              		lv_openActions_4_0, 
            	              		"OpenAction");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleActionSet6150); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getActionSetAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleActionSet"


    // $ANTLR start "entryRuleOpenAction"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2898:1: entryRuleOpenAction returns [EObject current=null] : iv_ruleOpenAction= ruleOpenAction EOF ;
    public final EObject entryRuleOpenAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenAction = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2899:2: (iv_ruleOpenAction= ruleOpenAction EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2900:2: iv_ruleOpenAction= ruleOpenAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpenActionRule()); 
            }
            pushFollow(FOLLOW_ruleOpenAction_in_entryRuleOpenAction6186);
            iv_ruleOpenAction=ruleOpenAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpenAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenAction6196); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpenAction"


    // $ANTLR start "ruleOpenAction"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2907:1: ruleOpenAction returns [EObject current=null] : ( () otherlv_1= 'OpenAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'icon:' ( (lv_icon_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleOpenAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_label_7_0=null;
        Token otherlv_8=null;
        Token lv_icon_9_0=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_precondition_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2910:28: ( ( () otherlv_1= 'OpenAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'icon:' ( (lv_icon_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2911:1: ( () otherlv_1= 'OpenAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'icon:' ( (lv_icon_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2911:1: ( () otherlv_1= 'OpenAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'icon:' ( (lv_icon_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2911:2: () otherlv_1= 'OpenAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'icon:' ( (lv_icon_9_0= RULE_STRING ) ) )? otherlv_10= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2911:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2912:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOpenActionAccess().getOpenActionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleOpenAction6242); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOpenActionAccess().getOpenActionKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2921:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2922:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2922:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2923:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOpenActionAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleOpenAction6263);
            lv_name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOpenActionRule());
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleOpenAction6275); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOpenActionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2943:1: (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==65) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2943:3: otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,65,FOLLOW_65_in_ruleOpenAction6288); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getOpenActionAccess().getPreconditionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2947:1: ( (lv_precondition_5_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2948:1: (lv_precondition_5_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2948:1: (lv_precondition_5_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2949:3: lv_precondition_5_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOpenActionAccess().getPreconditionEStringParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleOpenAction6309);
                    lv_precondition_5_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOpenActionRule());
                      	        }
                             		set(
                             			current, 
                             			"precondition",
                              		lv_precondition_5_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2965:4: (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==66) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2965:6: otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,66,FOLLOW_66_in_ruleOpenAction6324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getOpenActionAccess().getLabelKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2969:1: ( (lv_label_7_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2970:1: (lv_label_7_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2970:1: (lv_label_7_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2971:3: lv_label_7_0= RULE_STRING
                    {
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOpenAction6341); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_7_0, grammarAccess.getOpenActionAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOpenActionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"label",
                              		lv_label_7_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2987:4: (otherlv_8= 'icon:' ( (lv_icon_9_0= RULE_STRING ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==67) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2987:6: otherlv_8= 'icon:' ( (lv_icon_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,67,FOLLOW_67_in_ruleOpenAction6361); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getOpenActionAccess().getIconKeyword_6_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2991:1: ( (lv_icon_9_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2992:1: (lv_icon_9_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2992:1: (lv_icon_9_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2993:3: lv_icon_9_0= RULE_STRING
                    {
                    lv_icon_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOpenAction6378); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_icon_9_0, grammarAccess.getOpenActionAccess().getIconSTRINGTerminalRuleCall_6_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOpenActionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"icon",
                              		lv_icon_9_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleOpenAction6397); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getOpenActionAccess().getRightCurlyBracketKeyword_7());
                  
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
    // $ANTLR end "ruleOpenAction"


    // $ANTLR start "entryRuleAction"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3021:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3022:2: (iv_ruleAction= ruleAction EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3023:2: iv_ruleAction= ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction6433);
            iv_ruleAction=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction6443); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3030:1: ruleAction returns [EObject current=null] : (this_Create_0= ruleCreate | this_Delete_1= ruleDelete | this_Drop_2= ruleDrop | this_ReconnectEdge_3= ruleReconnectEdge ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Create_0 = null;

        EObject this_Delete_1 = null;

        EObject this_Drop_2 = null;

        EObject this_ReconnectEdge_3 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3033:28: ( (this_Create_0= ruleCreate | this_Delete_1= ruleDelete | this_Drop_2= ruleDrop | this_ReconnectEdge_3= ruleReconnectEdge ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3034:1: (this_Create_0= ruleCreate | this_Delete_1= ruleDelete | this_Drop_2= ruleDrop | this_ReconnectEdge_3= ruleReconnectEdge )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3034:1: (this_Create_0= ruleCreate | this_Delete_1= ruleDelete | this_Drop_2= ruleDrop | this_ReconnectEdge_3= ruleReconnectEdge )
            int alt78=4;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt78=1;
                }
                break;
            case 70:
                {
                alt78=2;
                }
                break;
            case 71:
                {
                alt78=3;
                }
                break;
            case 72:
                {
                alt78=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3035:5: this_Create_0= ruleCreate
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionAccess().getCreateParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreate_in_ruleAction6490);
                    this_Create_0=ruleCreate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Create_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3045:5: this_Delete_1= ruleDelete
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionAccess().getDeleteParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDelete_in_ruleAction6517);
                    this_Delete_1=ruleDelete();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Delete_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3055:5: this_Drop_2= ruleDrop
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionAccess().getDropParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDrop_in_ruleAction6544);
                    this_Drop_2=ruleDrop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Drop_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3065:5: this_ReconnectEdge_3= ruleReconnectEdge
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionAccess().getReconnectEdgeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReconnectEdge_in_ruleAction6571);
                    this_ReconnectEdge_3=ruleReconnectEdge();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReconnectEdge_3; 
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleCreate"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3081:1: entryRuleCreate returns [EObject current=null] : iv_ruleCreate= ruleCreate EOF ;
    public final EObject entryRuleCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreate = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3082:2: (iv_ruleCreate= ruleCreate EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3083:2: iv_ruleCreate= ruleCreate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateRule()); 
            }
            pushFollow(FOLLOW_ruleCreate_in_entryRuleCreate6606);
            iv_ruleCreate=ruleCreate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreate6616); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreate"


    // $ANTLR start "ruleCreate"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3090:1: ruleCreate returns [EObject current=null] : ( () otherlv_1= 'Create' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) (otherlv_10= 'icon:' ( (lv_icon_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleCreate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_label_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_icon_11_0=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_precondition_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3093:28: ( ( () otherlv_1= 'Create' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) (otherlv_10= 'icon:' ( (lv_icon_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3094:1: ( () otherlv_1= 'Create' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) (otherlv_10= 'icon:' ( (lv_icon_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3094:1: ( () otherlv_1= 'Create' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) (otherlv_10= 'icon:' ( (lv_icon_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3094:2: () otherlv_1= 'Create' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) (otherlv_10= 'icon:' ( (lv_icon_11_0= RULE_STRING ) ) )? otherlv_12= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3094:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3095:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCreateAccess().getCreateAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleCreate6662); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateAccess().getCreateKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3104:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3105:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3105:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3106:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleCreate6683);
            lv_name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCreateRule());
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleCreate6695); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCreateAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3126:1: (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==65) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3126:3: otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,65,FOLLOW_65_in_ruleCreate6708); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getCreateAccess().getPreconditionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3130:1: ( (lv_precondition_5_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3131:1: (lv_precondition_5_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3131:1: (lv_precondition_5_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3132:3: lv_precondition_5_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateAccess().getPreconditionEStringParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleCreate6729);
                    lv_precondition_5_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreateRule());
                      	        }
                             		set(
                             			current, 
                             			"precondition",
                              		lv_precondition_5_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3148:4: (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==66) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3148:6: otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,66,FOLLOW_66_in_ruleCreate6744); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCreateAccess().getLabelKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3152:1: ( (lv_label_7_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3153:1: (lv_label_7_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3153:1: (lv_label_7_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3154:3: lv_label_7_0= RULE_STRING
                    {
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCreate6761); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_7_0, grammarAccess.getCreateAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"label",
                              		lv_label_7_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3170:4: (otherlv_8= 'action-for:' ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3170:6: otherlv_8= 'action-for:' ( ( ruleFQN ) )
            {
            otherlv_8=(Token)match(input,69,FOLLOW_69_in_ruleCreate6781); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getCreateAccess().getActionForKeyword_6_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3174:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3175:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3175:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3176:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateAccess().getTool_ForDiagramElementCrossReference_6_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleCreate6804);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3189:3: (otherlv_10= 'icon:' ( (lv_icon_11_0= RULE_STRING ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==67) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3189:5: otherlv_10= 'icon:' ( (lv_icon_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,67,FOLLOW_67_in_ruleCreate6818); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getCreateAccess().getIconKeyword_7_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3193:1: ( (lv_icon_11_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3194:1: (lv_icon_11_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3194:1: (lv_icon_11_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3195:3: lv_icon_11_0= RULE_STRING
                    {
                    lv_icon_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCreate6835); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_icon_11_0, grammarAccess.getCreateAccess().getIconSTRINGTerminalRuleCall_7_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"icon",
                              		lv_icon_11_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleCreate6854); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getCreateAccess().getRightCurlyBracketKeyword_8());
                  
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
    // $ANTLR end "ruleCreate"


    // $ANTLR start "entryRuleDelete"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3223:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3224:2: (iv_ruleDelete= ruleDelete EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3225:2: iv_ruleDelete= ruleDelete EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteRule()); 
            }
            pushFollow(FOLLOW_ruleDelete_in_entryRuleDelete6890);
            iv_ruleDelete=ruleDelete();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDelete; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelete6900); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3232:1: ruleDelete returns [EObject current=null] : ( () otherlv_1= 'Delete' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_label_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_precondition_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3235:28: ( ( () otherlv_1= 'Delete' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3236:1: ( () otherlv_1= 'Delete' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3236:1: ( () otherlv_1= 'Delete' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3236:2: () otherlv_1= 'Delete' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3236:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3237:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDeleteAccess().getDeleteAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleDelete6946); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getDeleteKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3246:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3247:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3247:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3248:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeleteAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleDelete6967);
            lv_name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeleteRule());
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDelete6979); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDeleteAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3268:1: (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==65) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3268:3: otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,65,FOLLOW_65_in_ruleDelete6992); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDeleteAccess().getPreconditionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3272:1: ( (lv_precondition_5_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3273:1: (lv_precondition_5_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3273:1: (lv_precondition_5_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3274:3: lv_precondition_5_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeleteAccess().getPreconditionEStringParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleDelete7013);
                    lv_precondition_5_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDeleteRule());
                      	        }
                             		set(
                             			current, 
                             			"precondition",
                              		lv_precondition_5_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3290:4: (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==66) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3290:6: otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,66,FOLLOW_66_in_ruleDelete7028); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getDeleteAccess().getLabelKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3294:1: ( (lv_label_7_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3295:1: (lv_label_7_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3295:1: (lv_label_7_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3296:3: lv_label_7_0= RULE_STRING
                    {
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDelete7045); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_7_0, grammarAccess.getDeleteAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDeleteRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"label",
                              		lv_label_7_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3312:4: (otherlv_8= 'action-for:' ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3312:6: otherlv_8= 'action-for:' ( ( ruleFQN ) )
            {
            otherlv_8=(Token)match(input,69,FOLLOW_69_in_ruleDelete7065); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getDeleteAccess().getActionForKeyword_6_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3316:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3317:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3317:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3318:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeleteAccess().getTool_ForDiagramElementCrossReference_6_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleDelete7088);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleDelete7101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getDeleteAccess().getRightCurlyBracketKeyword_7());
                  
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
    // $ANTLR end "ruleDelete"


    // $ANTLR start "entryRuleDrop"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3343:1: entryRuleDrop returns [EObject current=null] : iv_ruleDrop= ruleDrop EOF ;
    public final EObject entryRuleDrop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrop = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3344:2: (iv_ruleDrop= ruleDrop EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3345:2: iv_ruleDrop= ruleDrop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropRule()); 
            }
            pushFollow(FOLLOW_ruleDrop_in_entryRuleDrop7137);
            iv_ruleDrop=ruleDrop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDrop; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDrop7147); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDrop"


    // $ANTLR start "ruleDrop"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3352:1: ruleDrop returns [EObject current=null] : ( () otherlv_1= 'Drop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' ) ;
    public final EObject ruleDrop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_label_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_precondition_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3355:28: ( ( () otherlv_1= 'Drop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3356:1: ( () otherlv_1= 'Drop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3356:1: ( () otherlv_1= 'Drop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3356:2: () otherlv_1= 'Drop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3356:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3357:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDropAccess().getDropAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleDrop7193); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropAccess().getDropKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3366:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3367:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3367:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3368:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDropAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleDrop7214);
            lv_name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDropRule());
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDrop7226); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDropAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3388:1: (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==65) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3388:3: otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,65,FOLLOW_65_in_ruleDrop7239); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDropAccess().getPreconditionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3392:1: ( (lv_precondition_5_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3393:1: (lv_precondition_5_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3393:1: (lv_precondition_5_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3394:3: lv_precondition_5_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDropAccess().getPreconditionEStringParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleDrop7260);
                    lv_precondition_5_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDropRule());
                      	        }
                             		set(
                             			current, 
                             			"precondition",
                              		lv_precondition_5_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3410:4: (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==66) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3410:6: otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,66,FOLLOW_66_in_ruleDrop7275); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getDropAccess().getLabelKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3414:1: ( (lv_label_7_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3415:1: (lv_label_7_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3415:1: (lv_label_7_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3416:3: lv_label_7_0= RULE_STRING
                    {
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDrop7292); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_7_0, grammarAccess.getDropAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDropRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"label",
                              		lv_label_7_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3432:4: (otherlv_8= 'action-for:' ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3432:6: otherlv_8= 'action-for:' ( ( ruleFQN ) )
            {
            otherlv_8=(Token)match(input,69,FOLLOW_69_in_ruleDrop7312); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getDropAccess().getActionForKeyword_6_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3436:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3437:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3437:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3438:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDropAccess().getTool_ForDiagramElementCrossReference_6_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleDrop7335);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleDrop7348); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getDropAccess().getRightCurlyBracketKeyword_7());
                  
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
    // $ANTLR end "ruleDrop"


    // $ANTLR start "entryRuleReconnectEdge"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3463:1: entryRuleReconnectEdge returns [EObject current=null] : iv_ruleReconnectEdge= ruleReconnectEdge EOF ;
    public final EObject entryRuleReconnectEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReconnectEdge = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3464:2: (iv_ruleReconnectEdge= ruleReconnectEdge EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3465:2: iv_ruleReconnectEdge= ruleReconnectEdge EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReconnectEdgeRule()); 
            }
            pushFollow(FOLLOW_ruleReconnectEdge_in_entryRuleReconnectEdge7384);
            iv_ruleReconnectEdge=ruleReconnectEdge();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReconnectEdge; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReconnectEdge7394); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReconnectEdge"


    // $ANTLR start "ruleReconnectEdge"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3472:1: ruleReconnectEdge returns [EObject current=null] : ( () otherlv_1= 'ReconnectEdge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' ) ;
    public final EObject ruleReconnectEdge() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_label_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_precondition_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3475:28: ( ( () otherlv_1= 'ReconnectEdge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3476:1: ( () otherlv_1= 'ReconnectEdge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3476:1: ( () otherlv_1= 'ReconnectEdge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3476:2: () otherlv_1= 'ReconnectEdge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3476:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3477:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReconnectEdgeAccess().getReconnectEdgeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleReconnectEdge7440); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReconnectEdgeAccess().getReconnectEdgeKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3486:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3487:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3487:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3488:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReconnectEdgeAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleReconnectEdge7461);
            lv_name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReconnectEdgeRule());
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleReconnectEdge7473); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getReconnectEdgeAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3508:1: (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==65) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3508:3: otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,65,FOLLOW_65_in_ruleReconnectEdge7486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getReconnectEdgeAccess().getPreconditionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3512:1: ( (lv_precondition_5_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3513:1: (lv_precondition_5_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3513:1: (lv_precondition_5_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3514:3: lv_precondition_5_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReconnectEdgeAccess().getPreconditionEStringParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleReconnectEdge7507);
                    lv_precondition_5_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReconnectEdgeRule());
                      	        }
                             		set(
                             			current, 
                             			"precondition",
                              		lv_precondition_5_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3530:4: (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==66) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3530:6: otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,66,FOLLOW_66_in_ruleReconnectEdge7522); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getReconnectEdgeAccess().getLabelKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3534:1: ( (lv_label_7_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3535:1: (lv_label_7_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3535:1: (lv_label_7_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3536:3: lv_label_7_0= RULE_STRING
                    {
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleReconnectEdge7539); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_7_0, grammarAccess.getReconnectEdgeAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReconnectEdgeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"label",
                              		lv_label_7_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3552:4: (otherlv_8= 'action-for:' ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3552:6: otherlv_8= 'action-for:' ( ( ruleFQN ) )
            {
            otherlv_8=(Token)match(input,69,FOLLOW_69_in_ruleReconnectEdge7559); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getReconnectEdgeAccess().getActionForKeyword_6_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3556:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3557:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3557:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3558:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReconnectEdgeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReconnectEdgeAccess().getTool_ForDiagramElementCrossReference_6_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleReconnectEdge7582);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleReconnectEdge7595); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getReconnectEdgeAccess().getRightCurlyBracketKeyword_7());
                  
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
    // $ANTLR end "ruleReconnectEdge"


    // $ANTLR start "entryRuleDomainContainer"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3583:1: entryRuleDomainContainer returns [EObject current=null] : iv_ruleDomainContainer= ruleDomainContainer EOF ;
    public final EObject entryRuleDomainContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainContainer = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3584:2: (iv_ruleDomainContainer= ruleDomainContainer EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3585:2: iv_ruleDomainContainer= ruleDomainContainer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainContainerRule()); 
            }
            pushFollow(FOLLOW_ruleDomainContainer_in_entryRuleDomainContainer7631);
            iv_ruleDomainContainer=ruleDomainContainer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainContainer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainContainer7641); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainContainer"


    // $ANTLR start "ruleDomainContainer"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3592:1: ruleDomainContainer returns [EObject current=null] : ( () (otherlv_1= 'domain-context:' ( (lv_the_domain_2_0= ruleAbstractClass ) ) ) ) ;
    public final EObject ruleDomainContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_the_domain_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3595:28: ( ( () (otherlv_1= 'domain-context:' ( (lv_the_domain_2_0= ruleAbstractClass ) ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3596:1: ( () (otherlv_1= 'domain-context:' ( (lv_the_domain_2_0= ruleAbstractClass ) ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3596:1: ( () (otherlv_1= 'domain-context:' ( (lv_the_domain_2_0= ruleAbstractClass ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3596:2: () (otherlv_1= 'domain-context:' ( (lv_the_domain_2_0= ruleAbstractClass ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3596:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3597:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDomainContainerAccess().getDomainContainerAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3602:2: (otherlv_1= 'domain-context:' ( (lv_the_domain_2_0= ruleAbstractClass ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3602:4: otherlv_1= 'domain-context:' ( (lv_the_domain_2_0= ruleAbstractClass ) )
            {
            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleDomainContainer7688); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDomainContainerAccess().getDomainContextKeyword_1_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3606:1: ( (lv_the_domain_2_0= ruleAbstractClass ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3607:1: (lv_the_domain_2_0= ruleAbstractClass )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3607:1: (lv_the_domain_2_0= ruleAbstractClass )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3608:3: lv_the_domain_2_0= ruleAbstractClass
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDomainContainerAccess().getThe_domainAbstractClassParserRuleCall_1_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbstractClass_in_ruleDomainContainer7709);
            lv_the_domain_2_0=ruleAbstractClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDomainContainerRule());
              	        }
                     		set(
                     			current, 
                     			"the_domain",
                      		lv_the_domain_2_0, 
                      		"AbstractClass");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
    // $ANTLR end "ruleDomainContainer"


    // $ANTLR start "entryRuleEdge"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3632:1: entryRuleEdge returns [EObject current=null] : iv_ruleEdge= ruleEdge EOF ;
    public final EObject entryRuleEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdge = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3633:2: (iv_ruleEdge= ruleEdge EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3634:2: iv_ruleEdge= ruleEdge EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeRule()); 
            }
            pushFollow(FOLLOW_ruleEdge_in_entryRuleEdge7746);
            iv_ruleEdge=ruleEdge();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdge; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdge7756); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEdge"


    // $ANTLR start "ruleEdge"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3641:1: ruleEdge returns [EObject current=null] : ( () otherlv_1= 'Edge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'association-context:' ( (lv_the_domain_5_0= ruleEdgeDomainAssociation ) ) ) | (otherlv_6= 'class-association-context:' ( (lv_the_domain_7_0= ruleEdgeDomainElement ) ) ) ) (otherlv_8= 'source:' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* ) (otherlv_12= 'target:' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* ) ( (lv_e_description_16_0= ruleEdgeDescription ) )* otherlv_17= '}' ) ;
    public final EObject ruleEdge() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_the_domain_5_0 = null;

        EObject lv_the_domain_7_0 = null;

        EObject lv_e_description_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3644:28: ( ( () otherlv_1= 'Edge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'association-context:' ( (lv_the_domain_5_0= ruleEdgeDomainAssociation ) ) ) | (otherlv_6= 'class-association-context:' ( (lv_the_domain_7_0= ruleEdgeDomainElement ) ) ) ) (otherlv_8= 'source:' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* ) (otherlv_12= 'target:' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* ) ( (lv_e_description_16_0= ruleEdgeDescription ) )* otherlv_17= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3645:1: ( () otherlv_1= 'Edge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'association-context:' ( (lv_the_domain_5_0= ruleEdgeDomainAssociation ) ) ) | (otherlv_6= 'class-association-context:' ( (lv_the_domain_7_0= ruleEdgeDomainElement ) ) ) ) (otherlv_8= 'source:' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* ) (otherlv_12= 'target:' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* ) ( (lv_e_description_16_0= ruleEdgeDescription ) )* otherlv_17= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3645:1: ( () otherlv_1= 'Edge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'association-context:' ( (lv_the_domain_5_0= ruleEdgeDomainAssociation ) ) ) | (otherlv_6= 'class-association-context:' ( (lv_the_domain_7_0= ruleEdgeDomainElement ) ) ) ) (otherlv_8= 'source:' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* ) (otherlv_12= 'target:' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* ) ( (lv_e_description_16_0= ruleEdgeDescription ) )* otherlv_17= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3645:2: () otherlv_1= 'Edge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'association-context:' ( (lv_the_domain_5_0= ruleEdgeDomainAssociation ) ) ) | (otherlv_6= 'class-association-context:' ( (lv_the_domain_7_0= ruleEdgeDomainElement ) ) ) ) (otherlv_8= 'source:' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* ) (otherlv_12= 'target:' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* ) ( (lv_e_description_16_0= ruleEdgeDescription ) )* otherlv_17= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3645:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3646:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEdgeAccess().getEdgeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleEdge7802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEdgeAccess().getEdgeKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3655:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3656:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3656:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3657:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleEdge7823);
            lv_name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEdgeRule());
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleEdge7835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEdgeAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3677:1: ( (otherlv_4= 'association-context:' ( (lv_the_domain_5_0= ruleEdgeDomainAssociation ) ) ) | (otherlv_6= 'class-association-context:' ( (lv_the_domain_7_0= ruleEdgeDomainElement ) ) ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==74) ) {
                alt88=1;
            }
            else if ( (LA88_0==75) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3677:2: (otherlv_4= 'association-context:' ( (lv_the_domain_5_0= ruleEdgeDomainAssociation ) ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3677:2: (otherlv_4= 'association-context:' ( (lv_the_domain_5_0= ruleEdgeDomainAssociation ) ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3677:4: otherlv_4= 'association-context:' ( (lv_the_domain_5_0= ruleEdgeDomainAssociation ) )
                    {
                    otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleEdge7849); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEdgeAccess().getAssociationContextKeyword_4_0_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3681:1: ( (lv_the_domain_5_0= ruleEdgeDomainAssociation ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3682:1: (lv_the_domain_5_0= ruleEdgeDomainAssociation )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3682:1: (lv_the_domain_5_0= ruleEdgeDomainAssociation )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3683:3: lv_the_domain_5_0= ruleEdgeDomainAssociation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeAccess().getThe_domainEdgeDomainAssociationParserRuleCall_4_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEdgeDomainAssociation_in_ruleEdge7870);
                    lv_the_domain_5_0=ruleEdgeDomainAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEdgeRule());
                      	        }
                             		set(
                             			current, 
                             			"the_domain",
                              		lv_the_domain_5_0, 
                              		"EdgeDomainAssociation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3700:6: (otherlv_6= 'class-association-context:' ( (lv_the_domain_7_0= ruleEdgeDomainElement ) ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3700:6: (otherlv_6= 'class-association-context:' ( (lv_the_domain_7_0= ruleEdgeDomainElement ) ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3700:8: otherlv_6= 'class-association-context:' ( (lv_the_domain_7_0= ruleEdgeDomainElement ) )
                    {
                    otherlv_6=(Token)match(input,75,FOLLOW_75_in_ruleEdge7890); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEdgeAccess().getClassAssociationContextKeyword_4_1_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3704:1: ( (lv_the_domain_7_0= ruleEdgeDomainElement ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3705:1: (lv_the_domain_7_0= ruleEdgeDomainElement )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3705:1: (lv_the_domain_7_0= ruleEdgeDomainElement )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3706:3: lv_the_domain_7_0= ruleEdgeDomainElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeAccess().getThe_domainEdgeDomainElementParserRuleCall_4_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEdgeDomainElement_in_ruleEdge7911);
                    lv_the_domain_7_0=ruleEdgeDomainElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEdgeRule());
                      	        }
                             		set(
                             			current, 
                             			"the_domain",
                              		lv_the_domain_7_0, 
                              		"EdgeDomainElement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3722:4: (otherlv_8= 'source:' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3722:6: otherlv_8= 'source:' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )*
            {
            otherlv_8=(Token)match(input,76,FOLLOW_76_in_ruleEdge7926); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getEdgeAccess().getSourceKeyword_5_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3726:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3727:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3727:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3728:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEdgeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeAccess().getSourceDiagramElementCrossReference_5_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleEdge7949);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3741:2: (otherlv_10= ',' ( ( ruleFQN ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==36) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3741:4: otherlv_10= ',' ( ( ruleFQN ) )
            	    {
            	    otherlv_10=(Token)match(input,36,FOLLOW_36_in_ruleEdge7962); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getEdgeAccess().getCommaKeyword_5_2_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3745:1: ( ( ruleFQN ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3746:1: ( ruleFQN )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3746:1: ( ruleFQN )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3747:3: ruleFQN
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEdgeRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEdgeAccess().getSourceDiagramElementCrossReference_5_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFQN_in_ruleEdge7985);
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
            	    break loop89;
                }
            } while (true);


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3760:5: (otherlv_12= 'target:' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3760:7: otherlv_12= 'target:' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )*
            {
            otherlv_12=(Token)match(input,77,FOLLOW_77_in_ruleEdge8001); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getEdgeAccess().getTargetKeyword_6_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3764:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3765:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3765:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3766:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEdgeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeAccess().getTargetDiagramElementCrossReference_6_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleEdge8024);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3779:2: (otherlv_14= ',' ( ( ruleFQN ) ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==36) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3779:4: otherlv_14= ',' ( ( ruleFQN ) )
            	    {
            	    otherlv_14=(Token)match(input,36,FOLLOW_36_in_ruleEdge8037); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getEdgeAccess().getCommaKeyword_6_2_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3783:1: ( ( ruleFQN ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3784:1: ( ruleFQN )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3784:1: ( ruleFQN )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3785:3: ruleFQN
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEdgeRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEdgeAccess().getTargetDiagramElementCrossReference_6_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFQN_in_ruleEdge8060);
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
            	    break loop90;
                }
            } while (true);


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3798:5: ( (lv_e_description_16_0= ruleEdgeDescription ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==20) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3799:1: (lv_e_description_16_0= ruleEdgeDescription )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3799:1: (lv_e_description_16_0= ruleEdgeDescription )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3800:3: lv_e_description_16_0= ruleEdgeDescription
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEdgeAccess().getE_descriptionEdgeDescriptionParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEdgeDescription_in_ruleEdge8084);
            	    lv_e_description_16_0=ruleEdgeDescription();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEdgeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"e_description",
            	              		lv_e_description_16_0, 
            	              		"EdgeDescription");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleEdge8097); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getEdgeAccess().getRightCurlyBracketKeyword_8());
                  
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
    // $ANTLR end "ruleEdge"


    // $ANTLR start "entryRuleEdgeImport"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3828:1: entryRuleEdgeImport returns [EObject current=null] : iv_ruleEdgeImport= ruleEdgeImport EOF ;
    public final EObject entryRuleEdgeImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeImport = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3829:2: (iv_ruleEdgeImport= ruleEdgeImport EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3830:2: iv_ruleEdgeImport= ruleEdgeImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeImportRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeImport_in_entryRuleEdgeImport8133);
            iv_ruleEdgeImport=ruleEdgeImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeImport8143); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEdgeImport"


    // $ANTLR start "ruleEdgeImport"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3837:1: ruleEdgeImport returns [EObject current=null] : ( () otherlv_1= 'EdgeImport' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) ) ( (lv_e_description_6_0= ruleEdgeDescription ) )* otherlv_7= '}' ) ;
    public final EObject ruleEdgeImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_e_description_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3840:28: ( ( () otherlv_1= 'EdgeImport' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) ) ( (lv_e_description_6_0= ruleEdgeDescription ) )* otherlv_7= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3841:1: ( () otherlv_1= 'EdgeImport' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) ) ( (lv_e_description_6_0= ruleEdgeDescription ) )* otherlv_7= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3841:1: ( () otherlv_1= 'EdgeImport' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) ) ( (lv_e_description_6_0= ruleEdgeDescription ) )* otherlv_7= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3841:2: () otherlv_1= 'EdgeImport' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) ) ( (lv_e_description_6_0= ruleEdgeDescription ) )* otherlv_7= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3841:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3842:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEdgeImportAccess().getEdgeImportAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleEdgeImport8189); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEdgeImportAccess().getEdgeImportKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3851:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3852:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3852:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3853:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeImportAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleEdgeImport8210);
            lv_name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEdgeImportRule());
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleEdgeImport8222); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEdgeImportAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3873:1: (otherlv_4= 'import:' ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3873:3: otherlv_4= 'import:' ( ( ruleFQN ) )
            {
            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleEdgeImport8235); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEdgeImportAccess().getImportKeyword_4_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3877:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3878:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3878:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3879:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEdgeImportRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeImportAccess().getImportsEdgeMappingCrossReference_4_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleEdgeImport8258);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3892:3: ( (lv_e_description_6_0= ruleEdgeDescription ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==20) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3893:1: (lv_e_description_6_0= ruleEdgeDescription )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3893:1: (lv_e_description_6_0= ruleEdgeDescription )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3894:3: lv_e_description_6_0= ruleEdgeDescription
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEdgeImportAccess().getE_descriptionEdgeDescriptionParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEdgeDescription_in_ruleEdgeImport8280);
            	    lv_e_description_6_0=ruleEdgeDescription();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEdgeImportRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"e_description",
            	              		lv_e_description_6_0, 
            	              		"EdgeDescription");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleEdgeImport8293); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getEdgeImportAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleEdgeImport"


    // $ANTLR start "entryRuleEdgeDomainAssociation"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3922:1: entryRuleEdgeDomainAssociation returns [EObject current=null] : iv_ruleEdgeDomainAssociation= ruleEdgeDomainAssociation EOF ;
    public final EObject entryRuleEdgeDomainAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeDomainAssociation = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3923:2: (iv_ruleEdgeDomainAssociation= ruleEdgeDomainAssociation EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3924:2: iv_ruleEdgeDomainAssociation= ruleEdgeDomainAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeDomainAssociationRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeDomainAssociation_in_entryRuleEdgeDomainAssociation8329);
            iv_ruleEdgeDomainAssociation=ruleEdgeDomainAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeDomainAssociation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeDomainAssociation8339); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEdgeDomainAssociation"


    // $ANTLR start "ruleEdgeDomainAssociation"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3931:1: ruleEdgeDomainAssociation returns [EObject current=null] : ( () ( (otherlv_1= 'query:' ( (lv_target_query_2_0= RULE_STRING ) ) ) | ( (lv_target_Locator_3_0= ruleAbstractAssociation2 ) ) ) ) ;
    public final EObject ruleEdgeDomainAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_target_query_2_0=null;
        EObject lv_target_Locator_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3934:28: ( ( () ( (otherlv_1= 'query:' ( (lv_target_query_2_0= RULE_STRING ) ) ) | ( (lv_target_Locator_3_0= ruleAbstractAssociation2 ) ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3935:1: ( () ( (otherlv_1= 'query:' ( (lv_target_query_2_0= RULE_STRING ) ) ) | ( (lv_target_Locator_3_0= ruleAbstractAssociation2 ) ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3935:1: ( () ( (otherlv_1= 'query:' ( (lv_target_query_2_0= RULE_STRING ) ) ) | ( (lv_target_Locator_3_0= ruleAbstractAssociation2 ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3935:2: () ( (otherlv_1= 'query:' ( (lv_target_query_2_0= RULE_STRING ) ) ) | ( (lv_target_Locator_3_0= ruleAbstractAssociation2 ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3935:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3936:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEdgeDomainAssociationAccess().getEdgeDomainAssociationAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3941:2: ( (otherlv_1= 'query:' ( (lv_target_query_2_0= RULE_STRING ) ) ) | ( (lv_target_Locator_3_0= ruleAbstractAssociation2 ) ) )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==79) ) {
                alt93=1;
            }
            else if ( (LA93_0==RULE_ID||LA93_0==84) ) {
                alt93=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3941:3: (otherlv_1= 'query:' ( (lv_target_query_2_0= RULE_STRING ) ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3941:3: (otherlv_1= 'query:' ( (lv_target_query_2_0= RULE_STRING ) ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3941:5: otherlv_1= 'query:' ( (lv_target_query_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleEdgeDomainAssociation8387); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEdgeDomainAssociationAccess().getQueryKeyword_1_0_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3945:1: ( (lv_target_query_2_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3946:1: (lv_target_query_2_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3946:1: (lv_target_query_2_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3947:3: lv_target_query_2_0= RULE_STRING
                    {
                    lv_target_query_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEdgeDomainAssociation8404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_target_query_2_0, grammarAccess.getEdgeDomainAssociationAccess().getTarget_querySTRINGTerminalRuleCall_1_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEdgeDomainAssociationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"target_query",
                              		lv_target_query_2_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3964:6: ( (lv_target_Locator_3_0= ruleAbstractAssociation2 ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3964:6: ( (lv_target_Locator_3_0= ruleAbstractAssociation2 ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3965:1: (lv_target_Locator_3_0= ruleAbstractAssociation2 )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3965:1: (lv_target_Locator_3_0= ruleAbstractAssociation2 )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3966:3: lv_target_Locator_3_0= ruleAbstractAssociation2
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeDomainAssociationAccess().getTarget_LocatorAbstractAssociation2ParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAbstractAssociation2_in_ruleEdgeDomainAssociation8437);
                    lv_target_Locator_3_0=ruleAbstractAssociation2();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEdgeDomainAssociationRule());
                      	        }
                             		set(
                             			current, 
                             			"target_Locator",
                              		lv_target_Locator_3_0, 
                              		"AbstractAssociation2");
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
    // $ANTLR end "ruleEdgeDomainAssociation"


    // $ANTLR start "entryRuleEdgeDomainElement"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3990:1: entryRuleEdgeDomainElement returns [EObject current=null] : iv_ruleEdgeDomainElement= ruleEdgeDomainElement EOF ;
    public final EObject entryRuleEdgeDomainElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeDomainElement = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3991:2: (iv_ruleEdgeDomainElement= ruleEdgeDomainElement EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3992:2: iv_ruleEdgeDomainElement= ruleEdgeDomainElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeDomainElementRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeDomainElement_in_entryRuleEdgeDomainElement8474);
            iv_ruleEdgeDomainElement=ruleEdgeDomainElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeDomainElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeDomainElement8484); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEdgeDomainElement"


    // $ANTLR start "ruleEdgeDomainElement"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3999:1: ruleEdgeDomainElement returns [EObject current=null] : ( () ( (lv_the_Domain_1_0= ruleAbstractClass ) ) ( (otherlv_2= 'target-query:' ( (lv_target_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'target-association:' ( (lv_target_Locator_5_0= ruleAbstractAssociation2 ) ) ) ) ( (otherlv_6= 'source-query:' ( (lv_source_query_7_0= RULE_STRING ) ) ) | (otherlv_8= 'source-association:' ( (lv_source_Locator_9_0= ruleAbstractAssociation2 ) ) ) ) ) ;
    public final EObject ruleEdgeDomainElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_target_query_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_source_query_7_0=null;
        Token otherlv_8=null;
        EObject lv_the_Domain_1_0 = null;

        EObject lv_target_Locator_5_0 = null;

        EObject lv_source_Locator_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4002:28: ( ( () ( (lv_the_Domain_1_0= ruleAbstractClass ) ) ( (otherlv_2= 'target-query:' ( (lv_target_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'target-association:' ( (lv_target_Locator_5_0= ruleAbstractAssociation2 ) ) ) ) ( (otherlv_6= 'source-query:' ( (lv_source_query_7_0= RULE_STRING ) ) ) | (otherlv_8= 'source-association:' ( (lv_source_Locator_9_0= ruleAbstractAssociation2 ) ) ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4003:1: ( () ( (lv_the_Domain_1_0= ruleAbstractClass ) ) ( (otherlv_2= 'target-query:' ( (lv_target_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'target-association:' ( (lv_target_Locator_5_0= ruleAbstractAssociation2 ) ) ) ) ( (otherlv_6= 'source-query:' ( (lv_source_query_7_0= RULE_STRING ) ) ) | (otherlv_8= 'source-association:' ( (lv_source_Locator_9_0= ruleAbstractAssociation2 ) ) ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4003:1: ( () ( (lv_the_Domain_1_0= ruleAbstractClass ) ) ( (otherlv_2= 'target-query:' ( (lv_target_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'target-association:' ( (lv_target_Locator_5_0= ruleAbstractAssociation2 ) ) ) ) ( (otherlv_6= 'source-query:' ( (lv_source_query_7_0= RULE_STRING ) ) ) | (otherlv_8= 'source-association:' ( (lv_source_Locator_9_0= ruleAbstractAssociation2 ) ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4003:2: () ( (lv_the_Domain_1_0= ruleAbstractClass ) ) ( (otherlv_2= 'target-query:' ( (lv_target_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'target-association:' ( (lv_target_Locator_5_0= ruleAbstractAssociation2 ) ) ) ) ( (otherlv_6= 'source-query:' ( (lv_source_query_7_0= RULE_STRING ) ) ) | (otherlv_8= 'source-association:' ( (lv_source_Locator_9_0= ruleAbstractAssociation2 ) ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4003:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4004:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEdgeDomainElementAccess().getEdgeDomainElementAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4009:2: ( (lv_the_Domain_1_0= ruleAbstractClass ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4010:1: (lv_the_Domain_1_0= ruleAbstractClass )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4010:1: (lv_the_Domain_1_0= ruleAbstractClass )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4011:3: lv_the_Domain_1_0= ruleAbstractClass
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeDomainElementAccess().getThe_DomainAbstractClassParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbstractClass_in_ruleEdgeDomainElement8539);
            lv_the_Domain_1_0=ruleAbstractClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEdgeDomainElementRule());
              	        }
                     		set(
                     			current, 
                     			"the_Domain",
                      		lv_the_Domain_1_0, 
                      		"AbstractClass");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4027:2: ( (otherlv_2= 'target-query:' ( (lv_target_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'target-association:' ( (lv_target_Locator_5_0= ruleAbstractAssociation2 ) ) ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==80) ) {
                alt94=1;
            }
            else if ( (LA94_0==81) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4027:3: (otherlv_2= 'target-query:' ( (lv_target_query_3_0= RULE_STRING ) ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4027:3: (otherlv_2= 'target-query:' ( (lv_target_query_3_0= RULE_STRING ) ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4027:5: otherlv_2= 'target-query:' ( (lv_target_query_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,80,FOLLOW_80_in_ruleEdgeDomainElement8553); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEdgeDomainElementAccess().getTargetQueryKeyword_2_0_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4031:1: ( (lv_target_query_3_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4032:1: (lv_target_query_3_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4032:1: (lv_target_query_3_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4033:3: lv_target_query_3_0= RULE_STRING
                    {
                    lv_target_query_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEdgeDomainElement8570); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_target_query_3_0, grammarAccess.getEdgeDomainElementAccess().getTarget_querySTRINGTerminalRuleCall_2_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEdgeDomainElementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"target_query",
                              		lv_target_query_3_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4050:6: (otherlv_4= 'target-association:' ( (lv_target_Locator_5_0= ruleAbstractAssociation2 ) ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4050:6: (otherlv_4= 'target-association:' ( (lv_target_Locator_5_0= ruleAbstractAssociation2 ) ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4050:8: otherlv_4= 'target-association:' ( (lv_target_Locator_5_0= ruleAbstractAssociation2 ) )
                    {
                    otherlv_4=(Token)match(input,81,FOLLOW_81_in_ruleEdgeDomainElement8595); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEdgeDomainElementAccess().getTargetAssociationKeyword_2_1_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4054:1: ( (lv_target_Locator_5_0= ruleAbstractAssociation2 ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4055:1: (lv_target_Locator_5_0= ruleAbstractAssociation2 )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4055:1: (lv_target_Locator_5_0= ruleAbstractAssociation2 )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4056:3: lv_target_Locator_5_0= ruleAbstractAssociation2
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeDomainElementAccess().getTarget_LocatorAbstractAssociation2ParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAbstractAssociation2_in_ruleEdgeDomainElement8616);
                    lv_target_Locator_5_0=ruleAbstractAssociation2();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEdgeDomainElementRule());
                      	        }
                             		set(
                             			current, 
                             			"target_Locator",
                              		lv_target_Locator_5_0, 
                              		"AbstractAssociation2");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4072:4: ( (otherlv_6= 'source-query:' ( (lv_source_query_7_0= RULE_STRING ) ) ) | (otherlv_8= 'source-association:' ( (lv_source_Locator_9_0= ruleAbstractAssociation2 ) ) ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==82) ) {
                alt95=1;
            }
            else if ( (LA95_0==83) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4072:5: (otherlv_6= 'source-query:' ( (lv_source_query_7_0= RULE_STRING ) ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4072:5: (otherlv_6= 'source-query:' ( (lv_source_query_7_0= RULE_STRING ) ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4072:7: otherlv_6= 'source-query:' ( (lv_source_query_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,82,FOLLOW_82_in_ruleEdgeDomainElement8632); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEdgeDomainElementAccess().getSourceQueryKeyword_3_0_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4076:1: ( (lv_source_query_7_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4077:1: (lv_source_query_7_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4077:1: (lv_source_query_7_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4078:3: lv_source_query_7_0= RULE_STRING
                    {
                    lv_source_query_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEdgeDomainElement8649); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_source_query_7_0, grammarAccess.getEdgeDomainElementAccess().getSource_querySTRINGTerminalRuleCall_3_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEdgeDomainElementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"source_query",
                              		lv_source_query_7_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4095:6: (otherlv_8= 'source-association:' ( (lv_source_Locator_9_0= ruleAbstractAssociation2 ) ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4095:6: (otherlv_8= 'source-association:' ( (lv_source_Locator_9_0= ruleAbstractAssociation2 ) ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4095:8: otherlv_8= 'source-association:' ( (lv_source_Locator_9_0= ruleAbstractAssociation2 ) )
                    {
                    otherlv_8=(Token)match(input,83,FOLLOW_83_in_ruleEdgeDomainElement8674); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEdgeDomainElementAccess().getSourceAssociationKeyword_3_1_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4099:1: ( (lv_source_Locator_9_0= ruleAbstractAssociation2 ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4100:1: (lv_source_Locator_9_0= ruleAbstractAssociation2 )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4100:1: (lv_source_Locator_9_0= ruleAbstractAssociation2 )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4101:3: lv_source_Locator_9_0= ruleAbstractAssociation2
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeDomainElementAccess().getSource_LocatorAbstractAssociation2ParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAbstractAssociation2_in_ruleEdgeDomainElement8695);
                    lv_source_Locator_9_0=ruleAbstractAssociation2();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEdgeDomainElementRule());
                      	        }
                             		set(
                             			current, 
                             			"source_Locator",
                              		lv_source_Locator_9_0, 
                              		"AbstractAssociation2");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleEdgeDomainElement"


    // $ANTLR start "entryRuleAbstractClass"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4125:1: entryRuleAbstractClass returns [EObject current=null] : iv_ruleAbstractClass= ruleAbstractClass EOF ;
    public final EObject entryRuleAbstractClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractClass = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4126:2: (iv_ruleAbstractClass= ruleAbstractClass EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4127:2: iv_ruleAbstractClass= ruleAbstractClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractClassRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractClass_in_entryRuleAbstractClass8733);
            iv_ruleAbstractClass=ruleAbstractClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractClass8743); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractClass"


    // $ANTLR start "ruleAbstractClass"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4134:1: ruleAbstractClass returns [EObject current=null] : (this_LocalClass2_0= ruleLocalClass2 | this_ExternalClass_1= ruleExternalClass ) ;
    public final EObject ruleAbstractClass() throws RecognitionException {
        EObject current = null;

        EObject this_LocalClass2_0 = null;

        EObject this_ExternalClass_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4137:28: ( (this_LocalClass2_0= ruleLocalClass2 | this_ExternalClass_1= ruleExternalClass ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4138:1: (this_LocalClass2_0= ruleLocalClass2 | this_ExternalClass_1= ruleExternalClass )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4138:1: (this_LocalClass2_0= ruleLocalClass2 | this_ExternalClass_1= ruleExternalClass )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_ID) ) {
                alt96=1;
            }
            else if ( (LA96_0==84) ) {
                alt96=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4139:5: this_LocalClass2_0= ruleLocalClass2
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractClassAccess().getLocalClass2ParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLocalClass2_in_ruleAbstractClass8790);
                    this_LocalClass2_0=ruleLocalClass2();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalClass2_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4149:5: this_ExternalClass_1= ruleExternalClass
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractClassAccess().getExternalClassParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExternalClass_in_ruleAbstractClass8817);
                    this_ExternalClass_1=ruleExternalClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExternalClass_1; 
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
    // $ANTLR end "ruleAbstractClass"


    // $ANTLR start "entryRuleLocalClass2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4165:1: entryRuleLocalClass2 returns [EObject current=null] : iv_ruleLocalClass2= ruleLocalClass2 EOF ;
    public final EObject entryRuleLocalClass2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalClass2 = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4166:2: (iv_ruleLocalClass2= ruleLocalClass2 EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4167:2: iv_ruleLocalClass2= ruleLocalClass2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalClass2Rule()); 
            }
            pushFollow(FOLLOW_ruleLocalClass2_in_entryRuleLocalClass28852);
            iv_ruleLocalClass2=ruleLocalClass2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalClass2; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalClass28862); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalClass2"


    // $ANTLR start "ruleLocalClass2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4174:1: ruleLocalClass2 returns [EObject current=null] : ( () ( ( ruleFQN ) ) ) ;
    public final EObject ruleLocalClass2() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4177:28: ( ( () ( ( ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4178:1: ( () ( ( ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4178:1: ( () ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4178:2: () ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4178:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4179:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalClass2Access().getLocalClassAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4184:2: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4185:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4185:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4186:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalClass2Rule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalClass2Access().getClassClassCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleLocalClass28919);
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
    // $ANTLR end "ruleLocalClass2"


    // $ANTLR start "entryRuleExternalClass"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4207:1: entryRuleExternalClass returns [EObject current=null] : iv_ruleExternalClass= ruleExternalClass EOF ;
    public final EObject entryRuleExternalClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalClass = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4208:2: (iv_ruleExternalClass= ruleExternalClass EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4209:2: iv_ruleExternalClass= ruleExternalClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternalClassRule()); 
            }
            pushFollow(FOLLOW_ruleExternalClass_in_entryRuleExternalClass8955);
            iv_ruleExternalClass=ruleExternalClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternalClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalClass8965); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalClass"


    // $ANTLR start "ruleExternalClass"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4216:1: ruleExternalClass returns [EObject current=null] : ( () otherlv_1= 'external' ( ( ruleFQN ) ) ) ;
    public final EObject ruleExternalClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4219:28: ( ( () otherlv_1= 'external' ( ( ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4220:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4220:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4220:2: () otherlv_1= 'external' ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4220:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4221:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExternalClassAccess().getExternalClassAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,84,FOLLOW_84_in_ruleExternalClass9011); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExternalClassAccess().getExternalKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4230:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4231:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4231:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4232:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExternalClassRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExternalClassAccess().getClassEClassCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleExternalClass9034);
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
    // $ANTLR end "ruleExternalClass"


    // $ANTLR start "entryRuleAbstractAssociation2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4253:1: entryRuleAbstractAssociation2 returns [EObject current=null] : iv_ruleAbstractAssociation2= ruleAbstractAssociation2 EOF ;
    public final EObject entryRuleAbstractAssociation2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAssociation2 = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4254:2: (iv_ruleAbstractAssociation2= ruleAbstractAssociation2 EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4255:2: iv_ruleAbstractAssociation2= ruleAbstractAssociation2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractAssociation2Rule()); 
            }
            pushFollow(FOLLOW_ruleAbstractAssociation2_in_entryRuleAbstractAssociation29070);
            iv_ruleAbstractAssociation2=ruleAbstractAssociation2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractAssociation2; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractAssociation29080); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractAssociation2"


    // $ANTLR start "ruleAbstractAssociation2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4262:1: ruleAbstractAssociation2 returns [EObject current=null] : (this_ExternalAssociation_0= ruleExternalAssociation | this_LocalAssociation_1= ruleLocalAssociation ) ;
    public final EObject ruleAbstractAssociation2() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalAssociation_0 = null;

        EObject this_LocalAssociation_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4265:28: ( (this_ExternalAssociation_0= ruleExternalAssociation | this_LocalAssociation_1= ruleLocalAssociation ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4266:1: (this_ExternalAssociation_0= ruleExternalAssociation | this_LocalAssociation_1= ruleLocalAssociation )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4266:1: (this_ExternalAssociation_0= ruleExternalAssociation | this_LocalAssociation_1= ruleLocalAssociation )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==84) ) {
                alt97=1;
            }
            else if ( (LA97_0==RULE_ID) ) {
                alt97=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4267:5: this_ExternalAssociation_0= ruleExternalAssociation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractAssociation2Access().getExternalAssociationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExternalAssociation_in_ruleAbstractAssociation29127);
                    this_ExternalAssociation_0=ruleExternalAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExternalAssociation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4277:5: this_LocalAssociation_1= ruleLocalAssociation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractAssociation2Access().getLocalAssociationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLocalAssociation_in_ruleAbstractAssociation29154);
                    this_LocalAssociation_1=ruleLocalAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalAssociation_1; 
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
    // $ANTLR end "ruleAbstractAssociation2"


    // $ANTLR start "entryRuleLocalAssociation"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4293:1: entryRuleLocalAssociation returns [EObject current=null] : iv_ruleLocalAssociation= ruleLocalAssociation EOF ;
    public final EObject entryRuleLocalAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalAssociation = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4294:2: (iv_ruleLocalAssociation= ruleLocalAssociation EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4295:2: iv_ruleLocalAssociation= ruleLocalAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalAssociationRule()); 
            }
            pushFollow(FOLLOW_ruleLocalAssociation_in_entryRuleLocalAssociation9189);
            iv_ruleLocalAssociation=ruleLocalAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalAssociation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalAssociation9199); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalAssociation"


    // $ANTLR start "ruleLocalAssociation"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4302:1: ruleLocalAssociation returns [EObject current=null] : ( () ( ( ruleFQN ) ) ) ;
    public final EObject ruleLocalAssociation() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4305:28: ( ( () ( ( ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4306:1: ( () ( ( ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4306:1: ( () ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4306:2: () ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4306:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4307:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalAssociationAccess().getLocalAssociationAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4312:2: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4313:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4313:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4314:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalAssociationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalAssociationAccess().getReferenceLocalClassAssociationCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleLocalAssociation9256);
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
    // $ANTLR end "ruleLocalAssociation"


    // $ANTLR start "entryRuleExternalAssociation"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4335:1: entryRuleExternalAssociation returns [EObject current=null] : iv_ruleExternalAssociation= ruleExternalAssociation EOF ;
    public final EObject entryRuleExternalAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalAssociation = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4336:2: (iv_ruleExternalAssociation= ruleExternalAssociation EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4337:2: iv_ruleExternalAssociation= ruleExternalAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternalAssociationRule()); 
            }
            pushFollow(FOLLOW_ruleExternalAssociation_in_entryRuleExternalAssociation9292);
            iv_ruleExternalAssociation=ruleExternalAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternalAssociation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalAssociation9302); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalAssociation"


    // $ANTLR start "ruleExternalAssociation"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4344:1: ruleExternalAssociation returns [EObject current=null] : ( () otherlv_1= 'external' ( ( ruleFQN ) ) ) ;
    public final EObject ruleExternalAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4347:28: ( ( () otherlv_1= 'external' ( ( ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4348:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4348:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4348:2: () otherlv_1= 'external' ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4348:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4349:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExternalAssociationAccess().getExternalAssociationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,84,FOLLOW_84_in_ruleExternalAssociation9348); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExternalAssociationAccess().getExternalKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4358:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4359:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4359:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4360:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExternalAssociationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExternalAssociationAccess().getReferenceEReferenceCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleExternalAssociation9371);
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
    // $ANTLR end "ruleExternalAssociation"


    // $ANTLR start "entryRuleLocalAttribute"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4383:1: entryRuleLocalAttribute returns [EObject current=null] : iv_ruleLocalAttribute= ruleLocalAttribute EOF ;
    public final EObject entryRuleLocalAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalAttribute = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4384:2: (iv_ruleLocalAttribute= ruleLocalAttribute EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4385:2: iv_ruleLocalAttribute= ruleLocalAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleLocalAttribute_in_entryRuleLocalAttribute9409);
            iv_ruleLocalAttribute=ruleLocalAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalAttribute9419); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalAttribute"


    // $ANTLR start "ruleLocalAttribute"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4392:1: ruleLocalAttribute returns [EObject current=null] : ( () ( ( ruleFQN ) ) ) ;
    public final EObject ruleLocalAttribute() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4395:28: ( ( () ( ( ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4396:1: ( () ( ( ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4396:1: ( () ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4396:2: () ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4396:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4397:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalAttributeAccess().getLocalAttributeAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4402:2: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4403:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4403:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4404:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalAttributeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalAttributeAccess().getAttributeAttributeCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleLocalAttribute9476);
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
    // $ANTLR end "ruleLocalAttribute"


    // $ANTLR start "entryRuleExternalAttribute"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4425:1: entryRuleExternalAttribute returns [EObject current=null] : iv_ruleExternalAttribute= ruleExternalAttribute EOF ;
    public final EObject entryRuleExternalAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalAttribute = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4426:2: (iv_ruleExternalAttribute= ruleExternalAttribute EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4427:2: iv_ruleExternalAttribute= ruleExternalAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternalAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleExternalAttribute_in_entryRuleExternalAttribute9512);
            iv_ruleExternalAttribute=ruleExternalAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternalAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalAttribute9522); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalAttribute"


    // $ANTLR start "ruleExternalAttribute"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4434:1: ruleExternalAttribute returns [EObject current=null] : ( () otherlv_1= 'external' ( ( ruleFQN ) ) ) ;
    public final EObject ruleExternalAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4437:28: ( ( () otherlv_1= 'external' ( ( ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4438:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4438:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4438:2: () otherlv_1= 'external' ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4438:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4439:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExternalAttributeAccess().getExternalAttributeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,84,FOLLOW_84_in_ruleExternalAttribute9568); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExternalAttributeAccess().getExternalKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4448:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4449:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4449:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4450:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExternalAttributeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExternalAttributeAccess().getAttributeEAttributeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleExternalAttribute9591);
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
    // $ANTLR end "ruleExternalAttribute"


    // $ANTLR start "entryRuleExpression"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4471:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4472:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4473:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression9627);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression9637); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4480:1: ruleExpression returns [EObject current=null] : ( () ( ( (lv_expressionElements_1_0= ruleExpressionElement ) ) (otherlv_2= '+' ( (lv_expressionElements_3_0= ruleExpressionElement ) ) )* )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressionElements_1_0 = null;

        EObject lv_expressionElements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4483:28: ( ( () ( ( (lv_expressionElements_1_0= ruleExpressionElement ) ) (otherlv_2= '+' ( (lv_expressionElements_3_0= ruleExpressionElement ) ) )* )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4484:1: ( () ( ( (lv_expressionElements_1_0= ruleExpressionElement ) ) (otherlv_2= '+' ( (lv_expressionElements_3_0= ruleExpressionElement ) ) )* )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4484:1: ( () ( ( (lv_expressionElements_1_0= ruleExpressionElement ) ) (otherlv_2= '+' ( (lv_expressionElements_3_0= ruleExpressionElement ) ) )* )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4484:2: () ( ( (lv_expressionElements_1_0= ruleExpressionElement ) ) (otherlv_2= '+' ( (lv_expressionElements_3_0= ruleExpressionElement ) ) )* )?
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4484:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4485:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionAccess().getExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4490:2: ( ( (lv_expressionElements_1_0= ruleExpressionElement ) ) (otherlv_2= '+' ( (lv_expressionElements_3_0= ruleExpressionElement ) ) )* )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( ((LA99_0>=RULE_STRING && LA99_0<=RULE_ID)||LA99_0==86) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4490:3: ( (lv_expressionElements_1_0= ruleExpressionElement ) ) (otherlv_2= '+' ( (lv_expressionElements_3_0= ruleExpressionElement ) ) )*
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4490:3: ( (lv_expressionElements_1_0= ruleExpressionElement ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4491:1: (lv_expressionElements_1_0= ruleExpressionElement )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4491:1: (lv_expressionElements_1_0= ruleExpressionElement )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4492:3: lv_expressionElements_1_0= ruleExpressionElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionElementsExpressionElementParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpressionElement_in_ruleExpression9693);
                    lv_expressionElements_1_0=ruleExpressionElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"expressionElements",
                              		lv_expressionElements_1_0, 
                              		"ExpressionElement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4508:2: (otherlv_2= '+' ( (lv_expressionElements_3_0= ruleExpressionElement ) ) )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==85) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4508:4: otherlv_2= '+' ( (lv_expressionElements_3_0= ruleExpressionElement ) )
                    	    {
                    	    otherlv_2=(Token)match(input,85,FOLLOW_85_in_ruleExpression9706); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getPlusSignKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4512:1: ( (lv_expressionElements_3_0= ruleExpressionElement ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4513:1: (lv_expressionElements_3_0= ruleExpressionElement )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4513:1: (lv_expressionElements_3_0= ruleExpressionElement )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4514:3: lv_expressionElements_3_0= ruleExpressionElement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionElementsExpressionElementParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpressionElement_in_ruleExpression9727);
                    	    lv_expressionElements_3_0=ruleExpressionElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"expressionElements",
                    	              		lv_expressionElements_3_0, 
                    	              		"ExpressionElement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop98;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpressionElement"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4538:1: entryRuleExpressionElement returns [EObject current=null] : iv_ruleExpressionElement= ruleExpressionElement EOF ;
    public final EObject entryRuleExpressionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionElement = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4539:2: (iv_ruleExpressionElement= ruleExpressionElement EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4540:2: iv_ruleExpressionElement= ruleExpressionElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionElementRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionElement_in_entryRuleExpressionElement9767);
            iv_ruleExpressionElement=ruleExpressionElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionElement9777); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionElement"


    // $ANTLR start "ruleExpressionElement"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4547:1: ruleExpressionElement returns [EObject current=null] : (this_ForeignExpressionElement_0= ruleForeignExpressionElement | this_StringElement_1= ruleStringElement ) ;
    public final EObject ruleExpressionElement() throws RecognitionException {
        EObject current = null;

        EObject this_ForeignExpressionElement_0 = null;

        EObject this_StringElement_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4550:28: ( (this_ForeignExpressionElement_0= ruleForeignExpressionElement | this_StringElement_1= ruleStringElement ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4551:1: (this_ForeignExpressionElement_0= ruleForeignExpressionElement | this_StringElement_1= ruleStringElement )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4551:1: (this_ForeignExpressionElement_0= ruleForeignExpressionElement | this_StringElement_1= ruleStringElement )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==RULE_ID||LA100_0==86) ) {
                alt100=1;
            }
            else if ( (LA100_0==RULE_STRING) ) {
                alt100=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4552:5: this_ForeignExpressionElement_0= ruleForeignExpressionElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionElementAccess().getForeignExpressionElementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleForeignExpressionElement_in_ruleExpressionElement9824);
                    this_ForeignExpressionElement_0=ruleForeignExpressionElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ForeignExpressionElement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4562:5: this_StringElement_1= ruleStringElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionElementAccess().getStringElementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringElement_in_ruleExpressionElement9851);
                    this_StringElement_1=ruleStringElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringElement_1; 
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
    // $ANTLR end "ruleExpressionElement"


    // $ANTLR start "entryRuleForeignExpressionElement"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4578:1: entryRuleForeignExpressionElement returns [EObject current=null] : iv_ruleForeignExpressionElement= ruleForeignExpressionElement EOF ;
    public final EObject entryRuleForeignExpressionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignExpressionElement = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4579:2: (iv_ruleForeignExpressionElement= ruleForeignExpressionElement EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4580:2: iv_ruleForeignExpressionElement= ruleForeignExpressionElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForeignExpressionElementRule()); 
            }
            pushFollow(FOLLOW_ruleForeignExpressionElement_in_entryRuleForeignExpressionElement9886);
            iv_ruleForeignExpressionElement=ruleForeignExpressionElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForeignExpressionElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeignExpressionElement9896); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForeignExpressionElement"


    // $ANTLR start "ruleForeignExpressionElement"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4587:1: ruleForeignExpressionElement returns [EObject current=null] : (this_JavaElement_0= ruleJavaElement | this_DomainElement_1= ruleDomainElement ) ;
    public final EObject ruleForeignExpressionElement() throws RecognitionException {
        EObject current = null;

        EObject this_JavaElement_0 = null;

        EObject this_DomainElement_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4590:28: ( (this_JavaElement_0= ruleJavaElement | this_DomainElement_1= ruleDomainElement ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4591:1: (this_JavaElement_0= ruleJavaElement | this_DomainElement_1= ruleDomainElement )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4591:1: (this_JavaElement_0= ruleJavaElement | this_DomainElement_1= ruleDomainElement )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==86) ) {
                alt101=1;
            }
            else if ( (LA101_0==RULE_ID) ) {
                alt101=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4592:5: this_JavaElement_0= ruleJavaElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getForeignExpressionElementAccess().getJavaElementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJavaElement_in_ruleForeignExpressionElement9943);
                    this_JavaElement_0=ruleJavaElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JavaElement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4602:5: this_DomainElement_1= ruleDomainElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getForeignExpressionElementAccess().getDomainElementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDomainElement_in_ruleForeignExpressionElement9970);
                    this_DomainElement_1=ruleDomainElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DomainElement_1; 
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
    // $ANTLR end "ruleForeignExpressionElement"


    // $ANTLR start "entryRuleJavaElement"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4618:1: entryRuleJavaElement returns [EObject current=null] : iv_ruleJavaElement= ruleJavaElement EOF ;
    public final EObject entryRuleJavaElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaElement = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4619:2: (iv_ruleJavaElement= ruleJavaElement EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4620:2: iv_ruleJavaElement= ruleJavaElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJavaElementRule()); 
            }
            pushFollow(FOLLOW_ruleJavaElement_in_entryRuleJavaElement10005);
            iv_ruleJavaElement=ruleJavaElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJavaElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaElement10015); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJavaElement"


    // $ANTLR start "ruleJavaElement"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4627:1: ruleJavaElement returns [EObject current=null] : ( () otherlv_1= 'Java' ( (lv_method_2_0= ruleFQN ) ) ) ;
    public final EObject ruleJavaElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_method_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4630:28: ( ( () otherlv_1= 'Java' ( (lv_method_2_0= ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4631:1: ( () otherlv_1= 'Java' ( (lv_method_2_0= ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4631:1: ( () otherlv_1= 'Java' ( (lv_method_2_0= ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4631:2: () otherlv_1= 'Java' ( (lv_method_2_0= ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4631:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4632:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJavaElementAccess().getJavaElementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,86,FOLLOW_86_in_ruleJavaElement10061); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJavaElementAccess().getJavaKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4641:1: ( (lv_method_2_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4642:1: (lv_method_2_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4642:1: (lv_method_2_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4643:3: lv_method_2_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJavaElementAccess().getMethodFQNParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleJavaElement10082);
            lv_method_2_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJavaElementRule());
              	        }
                     		set(
                     			current, 
                     			"method",
                      		lv_method_2_0, 
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
    // $ANTLR end "ruleJavaElement"


    // $ANTLR start "entryRuleDomainElement"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4667:1: entryRuleDomainElement returns [EObject current=null] : iv_ruleDomainElement= ruleDomainElement EOF ;
    public final EObject entryRuleDomainElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainElement = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4668:2: (iv_ruleDomainElement= ruleDomainElement EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4669:2: iv_ruleDomainElement= ruleDomainElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainElementRule()); 
            }
            pushFollow(FOLLOW_ruleDomainElement_in_entryRuleDomainElement10118);
            iv_ruleDomainElement=ruleDomainElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainElement10128); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainElement"


    // $ANTLR start "ruleDomainElement"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4676:1: ruleDomainElement returns [EObject current=null] : ( () ( ( ruleFQN ) ) ) ;
    public final EObject ruleDomainElement() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4679:28: ( ( () ( ( ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4680:1: ( () ( ( ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4680:1: ( () ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4680:2: () ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4680:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4681:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDomainElementAccess().getDomainElementAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4686:2: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4687:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4687:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4688:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDomainElementRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDomainElementAccess().getAttributeAttributeCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleDomainElement10185);
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
    // $ANTLR end "ruleDomainElement"


    // $ANTLR start "entryRuleStringElement"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4709:1: entryRuleStringElement returns [EObject current=null] : iv_ruleStringElement= ruleStringElement EOF ;
    public final EObject entryRuleStringElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringElement = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4710:2: (iv_ruleStringElement= ruleStringElement EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4711:2: iv_ruleStringElement= ruleStringElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringElementRule()); 
            }
            pushFollow(FOLLOW_ruleStringElement_in_entryRuleStringElement10221);
            iv_ruleStringElement=ruleStringElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringElement10231); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringElement"


    // $ANTLR start "ruleStringElement"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4718:1: ruleStringElement returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringElement() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4721:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4722:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4722:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4722:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4722:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4723:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringElementAccess().getStringElementAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4728:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4729:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4729:1: (lv_value_1_0= RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4730:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringElement10282); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getStringElementAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringElementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
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
    // $ANTLR end "ruleStringElement"


    // $ANTLR start "entryRuleEString"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4754:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4755:2: (iv_ruleEString= ruleEString EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4756:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString10324);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString10335); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4763:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4766:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4767:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4767:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==RULE_STRING) ) {
                alt102=1;
            }
            else if ( (LA102_0==RULE_ID) ) {
                alt102=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4767:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString10375); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4775:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString10401); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4790:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4791:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4792:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN10447);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN10458); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4799:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4802:28: ( (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4803:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4803:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4803:6: this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN10498); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4810:1: (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==87) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4811:2: kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    {
            	    kw=(Token)match(input,87,FOLLOW_87_in_ruleFQN10517); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4816:1: ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4816:2: ( RULE_ID )=>this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN10538); if (state.failed) return current;
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
            	    break loop103;
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


    // $ANTLR start "entryRuleEInt"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4833:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4834:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4835:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_ruleEInt_in_entryRuleEInt10589);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEInt10600); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4842:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4845:28: (this_INT_0= RULE_INT )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4846:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEInt10639); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
                  
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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleNode_Form"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4861:1: ruleNode_Form returns [Enumerator current=null] : ( (enumLiteral_0= 'Square' ) | (enumLiteral_1= 'Lozenge' ) | (enumLiteral_2= 'Eclipse' ) | (enumLiteral_3= 'Note' ) | (enumLiteral_4= 'Dot' ) | (enumLiteral_5= 'Triangle' ) | (enumLiteral_6= 'Stroke' ) | (enumLiteral_7= 'Ring' ) ) ;
    public final Enumerator ruleNode_Form() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;

         enterRule(); 
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4863:28: ( ( (enumLiteral_0= 'Square' ) | (enumLiteral_1= 'Lozenge' ) | (enumLiteral_2= 'Eclipse' ) | (enumLiteral_3= 'Note' ) | (enumLiteral_4= 'Dot' ) | (enumLiteral_5= 'Triangle' ) | (enumLiteral_6= 'Stroke' ) | (enumLiteral_7= 'Ring' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4864:1: ( (enumLiteral_0= 'Square' ) | (enumLiteral_1= 'Lozenge' ) | (enumLiteral_2= 'Eclipse' ) | (enumLiteral_3= 'Note' ) | (enumLiteral_4= 'Dot' ) | (enumLiteral_5= 'Triangle' ) | (enumLiteral_6= 'Stroke' ) | (enumLiteral_7= 'Ring' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4864:1: ( (enumLiteral_0= 'Square' ) | (enumLiteral_1= 'Lozenge' ) | (enumLiteral_2= 'Eclipse' ) | (enumLiteral_3= 'Note' ) | (enumLiteral_4= 'Dot' ) | (enumLiteral_5= 'Triangle' ) | (enumLiteral_6= 'Stroke' ) | (enumLiteral_7= 'Ring' ) )
            int alt104=8;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt104=1;
                }
                break;
            case 89:
                {
                alt104=2;
                }
                break;
            case 90:
                {
                alt104=3;
                }
                break;
            case 91:
                {
                alt104=4;
                }
                break;
            case 92:
                {
                alt104=5;
                }
                break;
            case 93:
                {
                alt104=6;
                }
                break;
            case 94:
                {
                alt104=7;
                }
                break;
            case 95:
                {
                alt104=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4864:2: (enumLiteral_0= 'Square' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4864:2: (enumLiteral_0= 'Square' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4864:4: enumLiteral_0= 'Square'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_88_in_ruleNode_Form10697); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getNode_FormAccess().getSquareEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getNode_FormAccess().getSquareEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4870:6: (enumLiteral_1= 'Lozenge' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4870:6: (enumLiteral_1= 'Lozenge' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4870:8: enumLiteral_1= 'Lozenge'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_89_in_ruleNode_Form10714); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getNode_FormAccess().getLozengeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getNode_FormAccess().getLozengeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4876:6: (enumLiteral_2= 'Eclipse' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4876:6: (enumLiteral_2= 'Eclipse' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4876:8: enumLiteral_2= 'Eclipse'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_90_in_ruleNode_Form10731); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getNode_FormAccess().getEclipseEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getNode_FormAccess().getEclipseEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4882:6: (enumLiteral_3= 'Note' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4882:6: (enumLiteral_3= 'Note' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4882:8: enumLiteral_3= 'Note'
                    {
                    enumLiteral_3=(Token)match(input,91,FOLLOW_91_in_ruleNode_Form10748); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getNode_FormAccess().getNoteEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getNode_FormAccess().getNoteEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4888:6: (enumLiteral_4= 'Dot' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4888:6: (enumLiteral_4= 'Dot' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4888:8: enumLiteral_4= 'Dot'
                    {
                    enumLiteral_4=(Token)match(input,92,FOLLOW_92_in_ruleNode_Form10765); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getNode_FormAccess().getDotEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getNode_FormAccess().getDotEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4894:6: (enumLiteral_5= 'Triangle' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4894:6: (enumLiteral_5= 'Triangle' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4894:8: enumLiteral_5= 'Triangle'
                    {
                    enumLiteral_5=(Token)match(input,93,FOLLOW_93_in_ruleNode_Form10782); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getNode_FormAccess().getTriangleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getNode_FormAccess().getTriangleEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4900:6: (enumLiteral_6= 'Stroke' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4900:6: (enumLiteral_6= 'Stroke' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4900:8: enumLiteral_6= 'Stroke'
                    {
                    enumLiteral_6=(Token)match(input,94,FOLLOW_94_in_ruleNode_Form10799); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getNode_FormAccess().getStrokeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getNode_FormAccess().getStrokeEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4906:6: (enumLiteral_7= 'Ring' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4906:6: (enumLiteral_7= 'Ring' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4906:8: enumLiteral_7= 'Ring'
                    {
                    enumLiteral_7=(Token)match(input,95,FOLLOW_95_in_ruleNode_Form10816); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getNode_FormAccess().getRingEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getNode_FormAccess().getRingEnumLiteralDeclaration_7()); 
                          
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
    // $ANTLR end "ruleNode_Form"


    // $ANTLR start "ruleBackgroundStyle"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4916:1: ruleBackgroundStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'GradientLeftToRight' ) | (enumLiteral_1= 'Liquid' ) | (enumLiteral_2= 'GradientTopToBottom' ) ) ;
    public final Enumerator ruleBackgroundStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4918:28: ( ( (enumLiteral_0= 'GradientLeftToRight' ) | (enumLiteral_1= 'Liquid' ) | (enumLiteral_2= 'GradientTopToBottom' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4919:1: ( (enumLiteral_0= 'GradientLeftToRight' ) | (enumLiteral_1= 'Liquid' ) | (enumLiteral_2= 'GradientTopToBottom' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4919:1: ( (enumLiteral_0= 'GradientLeftToRight' ) | (enumLiteral_1= 'Liquid' ) | (enumLiteral_2= 'GradientTopToBottom' ) )
            int alt105=3;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt105=1;
                }
                break;
            case 97:
                {
                alt105=2;
                }
                break;
            case 98:
                {
                alt105=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4919:2: (enumLiteral_0= 'GradientLeftToRight' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4919:2: (enumLiteral_0= 'GradientLeftToRight' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4919:4: enumLiteral_0= 'GradientLeftToRight'
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_96_in_ruleBackgroundStyle10861); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBackgroundStyleAccess().getGradientLeftToRightEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBackgroundStyleAccess().getGradientLeftToRightEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4925:6: (enumLiteral_1= 'Liquid' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4925:6: (enumLiteral_1= 'Liquid' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4925:8: enumLiteral_1= 'Liquid'
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_97_in_ruleBackgroundStyle10878); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBackgroundStyleAccess().getLiquidEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getBackgroundStyleAccess().getLiquidEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4931:6: (enumLiteral_2= 'GradientTopToBottom' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4931:6: (enumLiteral_2= 'GradientTopToBottom' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4931:8: enumLiteral_2= 'GradientTopToBottom'
                    {
                    enumLiteral_2=(Token)match(input,98,FOLLOW_98_in_ruleBackgroundStyle10895); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBackgroundStyleAccess().getGradientTopToBottomEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getBackgroundStyleAccess().getGradientTopToBottomEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleBackgroundStyle"


    // $ANTLR start "ruleLabelPosition"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4941:1: ruleLabelPosition returns [Enumerator current=null] : ( (enumLiteral_0= 'border' ) | (enumLiteral_1= 'node' ) ) ;
    public final Enumerator ruleLabelPosition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4943:28: ( ( (enumLiteral_0= 'border' ) | (enumLiteral_1= 'node' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4944:1: ( (enumLiteral_0= 'border' ) | (enumLiteral_1= 'node' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4944:1: ( (enumLiteral_0= 'border' ) | (enumLiteral_1= 'node' ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==99) ) {
                alt106=1;
            }
            else if ( (LA106_0==100) ) {
                alt106=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4944:2: (enumLiteral_0= 'border' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4944:2: (enumLiteral_0= 'border' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4944:4: enumLiteral_0= 'border'
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_99_in_ruleLabelPosition10940); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLabelPositionAccess().getBorderEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getLabelPositionAccess().getBorderEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4950:6: (enumLiteral_1= 'node' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4950:6: (enumLiteral_1= 'node' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4950:8: enumLiteral_1= 'node'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_100_in_ruleLabelPosition10957); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLabelPositionAccess().getNodeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getLabelPositionAccess().getNodeEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleLabelPosition"


    // $ANTLR start "ruleLabelAlignment"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4960:1: ruleLabelAlignment returns [Enumerator current=null] : ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'right' ) ) ;
    public final Enumerator ruleLabelAlignment() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4962:28: ( ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'right' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4963:1: ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'right' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4963:1: ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'right' ) )
            int alt107=3;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt107=1;
                }
                break;
            case 102:
                {
                alt107=2;
                }
                break;
            case 103:
                {
                alt107=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4963:2: (enumLiteral_0= 'center' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4963:2: (enumLiteral_0= 'center' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4963:4: enumLiteral_0= 'center'
                    {
                    enumLiteral_0=(Token)match(input,101,FOLLOW_101_in_ruleLabelAlignment11002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLabelAlignmentAccess().getCENTEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getLabelAlignmentAccess().getCENTEREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4969:6: (enumLiteral_1= 'left' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4969:6: (enumLiteral_1= 'left' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4969:8: enumLiteral_1= 'left'
                    {
                    enumLiteral_1=(Token)match(input,102,FOLLOW_102_in_ruleLabelAlignment11019); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLabelAlignmentAccess().getLEFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getLabelAlignmentAccess().getLEFTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4975:6: (enumLiteral_2= 'right' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4975:6: (enumLiteral_2= 'right' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4975:8: enumLiteral_2= 'right'
                    {
                    enumLiteral_2=(Token)match(input,103,FOLLOW_103_in_ruleLabelAlignment11036); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLabelAlignmentAccess().getRIGHTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getLabelAlignmentAccess().getRIGHTEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleLabelAlignment"


    // $ANTLR start "ruleLineStyle"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4985:1: ruleLineStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) ) ;
    public final Enumerator ruleLineStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4987:28: ( ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4988:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4988:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) )
            int alt108=4;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt108=1;
                }
                break;
            case 105:
                {
                alt108=2;
                }
                break;
            case 106:
                {
                alt108=3;
                }
                break;
            case 107:
                {
                alt108=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4988:2: (enumLiteral_0= 'solid' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4988:2: (enumLiteral_0= 'solid' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4988:4: enumLiteral_0= 'solid'
                    {
                    enumLiteral_0=(Token)match(input,104,FOLLOW_104_in_ruleLineStyle11081); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLineStyleAccess().getSolidEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getLineStyleAccess().getSolidEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4994:6: (enumLiteral_1= 'dash' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4994:6: (enumLiteral_1= 'dash' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4994:8: enumLiteral_1= 'dash'
                    {
                    enumLiteral_1=(Token)match(input,105,FOLLOW_105_in_ruleLineStyle11098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLineStyleAccess().getDashEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getLineStyleAccess().getDashEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5000:6: (enumLiteral_2= 'dot' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5000:6: (enumLiteral_2= 'dot' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5000:8: enumLiteral_2= 'dot'
                    {
                    enumLiteral_2=(Token)match(input,106,FOLLOW_106_in_ruleLineStyle11115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLineStyleAccess().getDotEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getLineStyleAccess().getDotEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5006:6: (enumLiteral_3= 'dash_dot' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5006:6: (enumLiteral_3= 'dash_dot' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5006:8: enumLiteral_3= 'dash_dot'
                    {
                    enumLiteral_3=(Token)match(input,107,FOLLOW_107_in_ruleLineStyle11132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLineStyleAccess().getDash_dotEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getLineStyleAccess().getDash_dotEnumLiteralDeclaration_3()); 
                          
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
    // $ANTLR end "ruleLineStyle"


    // $ANTLR start "ruleEdgeArrows"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5016:1: ruleEdgeArrows returns [Enumerator current=null] : ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWothFillDiamond' ) ) ;
    public final Enumerator ruleEdgeArrows() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;

         enterRule(); 
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5018:28: ( ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWothFillDiamond' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5019:1: ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWothFillDiamond' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5019:1: ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWothFillDiamond' ) )
            int alt109=11;
            switch ( input.LA(1) ) {
            case 108:
                {
                alt109=1;
                }
                break;
            case 109:
                {
                alt109=2;
                }
                break;
            case 110:
                {
                alt109=3;
                }
                break;
            case 111:
                {
                alt109=4;
                }
                break;
            case 112:
                {
                alt109=5;
                }
                break;
            case 113:
                {
                alt109=6;
                }
                break;
            case 114:
                {
                alt109=7;
                }
                break;
            case 115:
                {
                alt109=8;
                }
                break;
            case 116:
                {
                alt109=9;
                }
                break;
            case 117:
                {
                alt109=10;
                }
                break;
            case 118:
                {
                alt109=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5019:2: (enumLiteral_0= 'NoDecoration' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5019:2: (enumLiteral_0= 'NoDecoration' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5019:4: enumLiteral_0= 'NoDecoration'
                    {
                    enumLiteral_0=(Token)match(input,108,FOLLOW_108_in_ruleEdgeArrows11177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEdgeArrowsAccess().getNoDecorationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getEdgeArrowsAccess().getNoDecorationEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5025:6: (enumLiteral_1= 'OutputArrow' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5025:6: (enumLiteral_1= 'OutputArrow' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5025:8: enumLiteral_1= 'OutputArrow'
                    {
                    enumLiteral_1=(Token)match(input,109,FOLLOW_109_in_ruleEdgeArrows11194); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEdgeArrowsAccess().getOutputArrowEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getEdgeArrowsAccess().getOutputArrowEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5031:6: (enumLiteral_2= 'InputArrow' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5031:6: (enumLiteral_2= 'InputArrow' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5031:8: enumLiteral_2= 'InputArrow'
                    {
                    enumLiteral_2=(Token)match(input,110,FOLLOW_110_in_ruleEdgeArrows11211); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEdgeArrowsAccess().getInputArrowEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getEdgeArrowsAccess().getInputArrowEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5037:6: (enumLiteral_3= 'OutputClosedArrow' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5037:6: (enumLiteral_3= 'OutputClosedArrow' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5037:8: enumLiteral_3= 'OutputClosedArrow'
                    {
                    enumLiteral_3=(Token)match(input,111,FOLLOW_111_in_ruleEdgeArrows11228); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEdgeArrowsAccess().getOutputClosedArrowEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getEdgeArrowsAccess().getOutputClosedArrowEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5043:6: (enumLiteral_4= 'InputClosedArrow' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5043:6: (enumLiteral_4= 'InputClosedArrow' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5043:8: enumLiteral_4= 'InputClosedArrow'
                    {
                    enumLiteral_4=(Token)match(input,112,FOLLOW_112_in_ruleEdgeArrows11245); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEdgeArrowsAccess().getInputClosedArrowEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getEdgeArrowsAccess().getInputClosedArrowEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5049:6: (enumLiteral_5= 'OutputFillClosedArrow' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5049:6: (enumLiteral_5= 'OutputFillClosedArrow' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5049:8: enumLiteral_5= 'OutputFillClosedArrow'
                    {
                    enumLiteral_5=(Token)match(input,113,FOLLOW_113_in_ruleEdgeArrows11262); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEdgeArrowsAccess().getOutputFillClosedArrowEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getEdgeArrowsAccess().getOutputFillClosedArrowEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5055:6: (enumLiteral_6= 'InputFillClosedArrow' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5055:6: (enumLiteral_6= 'InputFillClosedArrow' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5055:8: enumLiteral_6= 'InputFillClosedArrow'
                    {
                    enumLiteral_6=(Token)match(input,114,FOLLOW_114_in_ruleEdgeArrows11279); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEdgeArrowsAccess().getInputFillClosedArrowEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getEdgeArrowsAccess().getInputFillClosedArrowEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5061:6: (enumLiteral_7= 'Diamond' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5061:6: (enumLiteral_7= 'Diamond' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5061:8: enumLiteral_7= 'Diamond'
                    {
                    enumLiteral_7=(Token)match(input,115,FOLLOW_115_in_ruleEdgeArrows11296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEdgeArrowsAccess().getDiamondEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getEdgeArrowsAccess().getDiamondEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5067:6: (enumLiteral_8= 'FillDiamond' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5067:6: (enumLiteral_8= 'FillDiamond' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5067:8: enumLiteral_8= 'FillDiamond'
                    {
                    enumLiteral_8=(Token)match(input,116,FOLLOW_116_in_ruleEdgeArrows11313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEdgeArrowsAccess().getFillDiamondEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getEdgeArrowsAccess().getFillDiamondEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5073:6: (enumLiteral_9= 'InputArrowWithDiamond' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5073:6: (enumLiteral_9= 'InputArrowWithDiamond' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5073:8: enumLiteral_9= 'InputArrowWithDiamond'
                    {
                    enumLiteral_9=(Token)match(input,117,FOLLOW_117_in_ruleEdgeArrows11330); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEdgeArrowsAccess().getInputArrowWithDiamondEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getEdgeArrowsAccess().getInputArrowWithDiamondEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5079:6: (enumLiteral_10= 'InputArrowWothFillDiamond' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5079:6: (enumLiteral_10= 'InputArrowWothFillDiamond' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5079:8: enumLiteral_10= 'InputArrowWothFillDiamond'
                    {
                    enumLiteral_10=(Token)match(input,118,FOLLOW_118_in_ruleEdgeArrows11347); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEdgeArrowsAccess().getInputArrowWithFillDiamondEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getEdgeArrowsAccess().getInputArrowWithFillDiamondEnumLiteralDeclaration_10()); 
                          
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
    // $ANTLR end "ruleEdgeArrows"


    // $ANTLR start "ruleSystemColors"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5089:1: ruleSystemColors returns [Enumerator current=null] : ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'red' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'yellow' ) | (enumLiteral_5= 'purple' ) | (enumLiteral_6= 'orange' ) | (enumLiteral_7= 'chocolate' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'white' ) | (enumLiteral_10= 'dark_blue' ) | (enumLiteral_11= 'dark_red' ) | (enumLiteral_12= 'dark_green' ) | (enumLiteral_13= 'dark_yellow' ) | (enumLiteral_14= 'dark_purple' ) | (enumLiteral_15= 'dark_orange' ) | (enumLiteral_16= 'dark_chocolate' ) | (enumLiteral_17= 'dark_gray' ) | (enumLiteral_18= 'light_blue' ) | (enumLiteral_19= 'light_red' ) | (enumLiteral_20= 'light_green' ) | (enumLiteral_21= 'light_yellow' ) | (enumLiteral_22= 'light_purple' ) | (enumLiteral_23= 'light_orange' ) | (enumLiteral_24= 'light_chocolate' ) | (enumLiteral_25= 'light_gray' ) ) ;
    public final Enumerator ruleSystemColors() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;
        Token enumLiteral_20=null;
        Token enumLiteral_21=null;
        Token enumLiteral_22=null;
        Token enumLiteral_23=null;
        Token enumLiteral_24=null;
        Token enumLiteral_25=null;

         enterRule(); 
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5091:28: ( ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'red' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'yellow' ) | (enumLiteral_5= 'purple' ) | (enumLiteral_6= 'orange' ) | (enumLiteral_7= 'chocolate' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'white' ) | (enumLiteral_10= 'dark_blue' ) | (enumLiteral_11= 'dark_red' ) | (enumLiteral_12= 'dark_green' ) | (enumLiteral_13= 'dark_yellow' ) | (enumLiteral_14= 'dark_purple' ) | (enumLiteral_15= 'dark_orange' ) | (enumLiteral_16= 'dark_chocolate' ) | (enumLiteral_17= 'dark_gray' ) | (enumLiteral_18= 'light_blue' ) | (enumLiteral_19= 'light_red' ) | (enumLiteral_20= 'light_green' ) | (enumLiteral_21= 'light_yellow' ) | (enumLiteral_22= 'light_purple' ) | (enumLiteral_23= 'light_orange' ) | (enumLiteral_24= 'light_chocolate' ) | (enumLiteral_25= 'light_gray' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5092:1: ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'red' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'yellow' ) | (enumLiteral_5= 'purple' ) | (enumLiteral_6= 'orange' ) | (enumLiteral_7= 'chocolate' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'white' ) | (enumLiteral_10= 'dark_blue' ) | (enumLiteral_11= 'dark_red' ) | (enumLiteral_12= 'dark_green' ) | (enumLiteral_13= 'dark_yellow' ) | (enumLiteral_14= 'dark_purple' ) | (enumLiteral_15= 'dark_orange' ) | (enumLiteral_16= 'dark_chocolate' ) | (enumLiteral_17= 'dark_gray' ) | (enumLiteral_18= 'light_blue' ) | (enumLiteral_19= 'light_red' ) | (enumLiteral_20= 'light_green' ) | (enumLiteral_21= 'light_yellow' ) | (enumLiteral_22= 'light_purple' ) | (enumLiteral_23= 'light_orange' ) | (enumLiteral_24= 'light_chocolate' ) | (enumLiteral_25= 'light_gray' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5092:1: ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'red' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'yellow' ) | (enumLiteral_5= 'purple' ) | (enumLiteral_6= 'orange' ) | (enumLiteral_7= 'chocolate' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'white' ) | (enumLiteral_10= 'dark_blue' ) | (enumLiteral_11= 'dark_red' ) | (enumLiteral_12= 'dark_green' ) | (enumLiteral_13= 'dark_yellow' ) | (enumLiteral_14= 'dark_purple' ) | (enumLiteral_15= 'dark_orange' ) | (enumLiteral_16= 'dark_chocolate' ) | (enumLiteral_17= 'dark_gray' ) | (enumLiteral_18= 'light_blue' ) | (enumLiteral_19= 'light_red' ) | (enumLiteral_20= 'light_green' ) | (enumLiteral_21= 'light_yellow' ) | (enumLiteral_22= 'light_purple' ) | (enumLiteral_23= 'light_orange' ) | (enumLiteral_24= 'light_chocolate' ) | (enumLiteral_25= 'light_gray' ) )
            int alt110=26;
            switch ( input.LA(1) ) {
            case 119:
                {
                alt110=1;
                }
                break;
            case 120:
                {
                alt110=2;
                }
                break;
            case 121:
                {
                alt110=3;
                }
                break;
            case 122:
                {
                alt110=4;
                }
                break;
            case 123:
                {
                alt110=5;
                }
                break;
            case 124:
                {
                alt110=6;
                }
                break;
            case 125:
                {
                alt110=7;
                }
                break;
            case 126:
                {
                alt110=8;
                }
                break;
            case 127:
                {
                alt110=9;
                }
                break;
            case 128:
                {
                alt110=10;
                }
                break;
            case 129:
                {
                alt110=11;
                }
                break;
            case 130:
                {
                alt110=12;
                }
                break;
            case 131:
                {
                alt110=13;
                }
                break;
            case 132:
                {
                alt110=14;
                }
                break;
            case 133:
                {
                alt110=15;
                }
                break;
            case 134:
                {
                alt110=16;
                }
                break;
            case 135:
                {
                alt110=17;
                }
                break;
            case 136:
                {
                alt110=18;
                }
                break;
            case 137:
                {
                alt110=19;
                }
                break;
            case 138:
                {
                alt110=20;
                }
                break;
            case 139:
                {
                alt110=21;
                }
                break;
            case 140:
                {
                alt110=22;
                }
                break;
            case 141:
                {
                alt110=23;
                }
                break;
            case 142:
                {
                alt110=24;
                }
                break;
            case 143:
                {
                alt110=25;
                }
                break;
            case 144:
                {
                alt110=26;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5092:2: (enumLiteral_0= 'black' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5092:2: (enumLiteral_0= 'black' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5092:4: enumLiteral_0= 'black'
                    {
                    enumLiteral_0=(Token)match(input,119,FOLLOW_119_in_ruleSystemColors11392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getBlackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSystemColorsAccess().getBlackEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5098:6: (enumLiteral_1= 'blue' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5098:6: (enumLiteral_1= 'blue' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5098:8: enumLiteral_1= 'blue'
                    {
                    enumLiteral_1=(Token)match(input,120,FOLLOW_120_in_ruleSystemColors11409); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getBlueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSystemColorsAccess().getBlueEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5104:6: (enumLiteral_2= 'red' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5104:6: (enumLiteral_2= 'red' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5104:8: enumLiteral_2= 'red'
                    {
                    enumLiteral_2=(Token)match(input,121,FOLLOW_121_in_ruleSystemColors11426); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getRedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getSystemColorsAccess().getRedEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5110:6: (enumLiteral_3= 'green' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5110:6: (enumLiteral_3= 'green' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5110:8: enumLiteral_3= 'green'
                    {
                    enumLiteral_3=(Token)match(input,122,FOLLOW_122_in_ruleSystemColors11443); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getGreenEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getSystemColorsAccess().getGreenEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5116:6: (enumLiteral_4= 'yellow' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5116:6: (enumLiteral_4= 'yellow' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5116:8: enumLiteral_4= 'yellow'
                    {
                    enumLiteral_4=(Token)match(input,123,FOLLOW_123_in_ruleSystemColors11460); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getYellowEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getSystemColorsAccess().getYellowEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5122:6: (enumLiteral_5= 'purple' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5122:6: (enumLiteral_5= 'purple' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5122:8: enumLiteral_5= 'purple'
                    {
                    enumLiteral_5=(Token)match(input,124,FOLLOW_124_in_ruleSystemColors11477); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getPurpleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getSystemColorsAccess().getPurpleEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5128:6: (enumLiteral_6= 'orange' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5128:6: (enumLiteral_6= 'orange' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5128:8: enumLiteral_6= 'orange'
                    {
                    enumLiteral_6=(Token)match(input,125,FOLLOW_125_in_ruleSystemColors11494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getOrangeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getSystemColorsAccess().getOrangeEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5134:6: (enumLiteral_7= 'chocolate' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5134:6: (enumLiteral_7= 'chocolate' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5134:8: enumLiteral_7= 'chocolate'
                    {
                    enumLiteral_7=(Token)match(input,126,FOLLOW_126_in_ruleSystemColors11511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getChocolateEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getSystemColorsAccess().getChocolateEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5140:6: (enumLiteral_8= 'gray' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5140:6: (enumLiteral_8= 'gray' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5140:8: enumLiteral_8= 'gray'
                    {
                    enumLiteral_8=(Token)match(input,127,FOLLOW_127_in_ruleSystemColors11528); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getGrayEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getSystemColorsAccess().getGrayEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5146:6: (enumLiteral_9= 'white' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5146:6: (enumLiteral_9= 'white' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5146:8: enumLiteral_9= 'white'
                    {
                    enumLiteral_9=(Token)match(input,128,FOLLOW_128_in_ruleSystemColors11545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getWhiteEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getSystemColorsAccess().getWhiteEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5152:6: (enumLiteral_10= 'dark_blue' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5152:6: (enumLiteral_10= 'dark_blue' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5152:8: enumLiteral_10= 'dark_blue'
                    {
                    enumLiteral_10=(Token)match(input,129,FOLLOW_129_in_ruleSystemColors11562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getDark_blueEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getSystemColorsAccess().getDark_blueEnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5158:6: (enumLiteral_11= 'dark_red' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5158:6: (enumLiteral_11= 'dark_red' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5158:8: enumLiteral_11= 'dark_red'
                    {
                    enumLiteral_11=(Token)match(input,130,FOLLOW_130_in_ruleSystemColors11579); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getDark_redEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getSystemColorsAccess().getDark_redEnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5164:6: (enumLiteral_12= 'dark_green' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5164:6: (enumLiteral_12= 'dark_green' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5164:8: enumLiteral_12= 'dark_green'
                    {
                    enumLiteral_12=(Token)match(input,131,FOLLOW_131_in_ruleSystemColors11596); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getDark_greenEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_12, grammarAccess.getSystemColorsAccess().getDark_greenEnumLiteralDeclaration_12()); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5170:6: (enumLiteral_13= 'dark_yellow' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5170:6: (enumLiteral_13= 'dark_yellow' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5170:8: enumLiteral_13= 'dark_yellow'
                    {
                    enumLiteral_13=(Token)match(input,132,FOLLOW_132_in_ruleSystemColors11613); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getDark_yellowEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_13, grammarAccess.getSystemColorsAccess().getDark_yellowEnumLiteralDeclaration_13()); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5176:6: (enumLiteral_14= 'dark_purple' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5176:6: (enumLiteral_14= 'dark_purple' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5176:8: enumLiteral_14= 'dark_purple'
                    {
                    enumLiteral_14=(Token)match(input,133,FOLLOW_133_in_ruleSystemColors11630); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getDark_purpleEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_14, grammarAccess.getSystemColorsAccess().getDark_purpleEnumLiteralDeclaration_14()); 
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5182:6: (enumLiteral_15= 'dark_orange' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5182:6: (enumLiteral_15= 'dark_orange' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5182:8: enumLiteral_15= 'dark_orange'
                    {
                    enumLiteral_15=(Token)match(input,134,FOLLOW_134_in_ruleSystemColors11647); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getDark_orangeEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_15, grammarAccess.getSystemColorsAccess().getDark_orangeEnumLiteralDeclaration_15()); 
                          
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5188:6: (enumLiteral_16= 'dark_chocolate' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5188:6: (enumLiteral_16= 'dark_chocolate' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5188:8: enumLiteral_16= 'dark_chocolate'
                    {
                    enumLiteral_16=(Token)match(input,135,FOLLOW_135_in_ruleSystemColors11664); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getDark_chocolateEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_16, grammarAccess.getSystemColorsAccess().getDark_chocolateEnumLiteralDeclaration_16()); 
                          
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5194:6: (enumLiteral_17= 'dark_gray' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5194:6: (enumLiteral_17= 'dark_gray' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5194:8: enumLiteral_17= 'dark_gray'
                    {
                    enumLiteral_17=(Token)match(input,136,FOLLOW_136_in_ruleSystemColors11681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getDark_grayEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_17, grammarAccess.getSystemColorsAccess().getDark_grayEnumLiteralDeclaration_17()); 
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5200:6: (enumLiteral_18= 'light_blue' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5200:6: (enumLiteral_18= 'light_blue' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5200:8: enumLiteral_18= 'light_blue'
                    {
                    enumLiteral_18=(Token)match(input,137,FOLLOW_137_in_ruleSystemColors11698); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getLight_blueEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_18, grammarAccess.getSystemColorsAccess().getLight_blueEnumLiteralDeclaration_18()); 
                          
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5206:6: (enumLiteral_19= 'light_red' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5206:6: (enumLiteral_19= 'light_red' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5206:8: enumLiteral_19= 'light_red'
                    {
                    enumLiteral_19=(Token)match(input,138,FOLLOW_138_in_ruleSystemColors11715); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getLight_redEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_19, grammarAccess.getSystemColorsAccess().getLight_redEnumLiteralDeclaration_19()); 
                          
                    }

                    }


                    }
                    break;
                case 21 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5212:6: (enumLiteral_20= 'light_green' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5212:6: (enumLiteral_20= 'light_green' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5212:8: enumLiteral_20= 'light_green'
                    {
                    enumLiteral_20=(Token)match(input,139,FOLLOW_139_in_ruleSystemColors11732); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getLight_greenEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_20, grammarAccess.getSystemColorsAccess().getLight_greenEnumLiteralDeclaration_20()); 
                          
                    }

                    }


                    }
                    break;
                case 22 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5218:6: (enumLiteral_21= 'light_yellow' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5218:6: (enumLiteral_21= 'light_yellow' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5218:8: enumLiteral_21= 'light_yellow'
                    {
                    enumLiteral_21=(Token)match(input,140,FOLLOW_140_in_ruleSystemColors11749); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getLight_yellowEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_21, grammarAccess.getSystemColorsAccess().getLight_yellowEnumLiteralDeclaration_21()); 
                          
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5224:6: (enumLiteral_22= 'light_purple' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5224:6: (enumLiteral_22= 'light_purple' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5224:8: enumLiteral_22= 'light_purple'
                    {
                    enumLiteral_22=(Token)match(input,141,FOLLOW_141_in_ruleSystemColors11766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getLight_purpleEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_22, grammarAccess.getSystemColorsAccess().getLight_purpleEnumLiteralDeclaration_22()); 
                          
                    }

                    }


                    }
                    break;
                case 24 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5230:6: (enumLiteral_23= 'light_orange' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5230:6: (enumLiteral_23= 'light_orange' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5230:8: enumLiteral_23= 'light_orange'
                    {
                    enumLiteral_23=(Token)match(input,142,FOLLOW_142_in_ruleSystemColors11783); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getLight_orangeEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_23, grammarAccess.getSystemColorsAccess().getLight_orangeEnumLiteralDeclaration_23()); 
                          
                    }

                    }


                    }
                    break;
                case 25 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5236:6: (enumLiteral_24= 'light_chocolate' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5236:6: (enumLiteral_24= 'light_chocolate' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5236:8: enumLiteral_24= 'light_chocolate'
                    {
                    enumLiteral_24=(Token)match(input,143,FOLLOW_143_in_ruleSystemColors11800); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getLight_chocolateEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_24, grammarAccess.getSystemColorsAccess().getLight_chocolateEnumLiteralDeclaration_24()); 
                          
                    }

                    }


                    }
                    break;
                case 26 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5242:6: (enumLiteral_25= 'light_gray' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5242:6: (enumLiteral_25= 'light_gray' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5242:8: enumLiteral_25= 'light_gray'
                    {
                    enumLiteral_25=(Token)match(input,144,FOLLOW_144_in_ruleSystemColors11817); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getLight_grayEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_25, grammarAccess.getSystemColorsAccess().getLight_grayEnumLiteralDeclaration_25()); 
                          
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
    // $ANTLR end "ruleSystemColors"


    // $ANTLR start "ruleContainerLayout"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5252:1: ruleContainerLayout returns [Enumerator current=null] : ( (enumLiteral_0= 'FreeForm' ) | (enumLiteral_1= 'List' ) ) ;
    public final Enumerator ruleContainerLayout() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5254:28: ( ( (enumLiteral_0= 'FreeForm' ) | (enumLiteral_1= 'List' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5255:1: ( (enumLiteral_0= 'FreeForm' ) | (enumLiteral_1= 'List' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5255:1: ( (enumLiteral_0= 'FreeForm' ) | (enumLiteral_1= 'List' ) )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==145) ) {
                alt111=1;
            }
            else if ( (LA111_0==146) ) {
                alt111=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5255:2: (enumLiteral_0= 'FreeForm' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5255:2: (enumLiteral_0= 'FreeForm' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5255:4: enumLiteral_0= 'FreeForm'
                    {
                    enumLiteral_0=(Token)match(input,145,FOLLOW_145_in_ruleContainerLayout11862); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getContainerLayoutAccess().getFreeFormEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getContainerLayoutAccess().getFreeFormEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5261:6: (enumLiteral_1= 'List' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5261:6: (enumLiteral_1= 'List' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5261:8: enumLiteral_1= 'List'
                    {
                    enumLiteral_1=(Token)match(input,146,FOLLOW_146_in_ruleContainerLayout11879); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getContainerLayoutAccess().getListEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getContainerLayoutAccess().getListEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleContainerLayout"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDiagrams_in_entryRuleDiagrams75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagrams85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleDiagrams140 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_ruleAspect_in_ruleDiagrams162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport245 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleImport266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspect_in_entryRuleAspect302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspect312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramSet_in_ruleAspect358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramSet_in_entryRuleDiagramSet392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramSet402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleDiagramSet448 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleDiagramSet469 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDiagramSet481 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_ruleDiagramRepresentation_in_ruleDiagramSet502 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_14_in_ruleDiagramSet515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramRepresentation_in_entryRuleDiagramRepresentation551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramRepresentation561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_ruleDiagramRepresentation608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramExtension_in_ruleDiagramRepresentation635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramChildren_in_entryRuleDiagramChildren672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramChildren682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractEdge_in_ruleDiagramChildren729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_ruleDiagramChildren756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_ruleDiagramChildren783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNode828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_ruleAbstractNode875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderedNode_in_ruleAbstractNode902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_ruleAbstractNode929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractEdge_in_entryRuleAbstractEdge964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractEdge974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdge_in_ruleAbstractEdge1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeImport_in_ruleAbstractEdge1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractContainerStyle_in_entryRuleAbstractContainerStyle1085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractContainerStyle1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlatStyle_in_ruleAbstractContainerStyle1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageStyle_in_ruleAbstractContainerStyle1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractNodeStyle_in_entryRuleAbstractNodeStyle1204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNodeStyle1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageStyle_in_ruleAbstractNodeStyle1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicStyle_in_ruleAbstractNodeStyle1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHistogramStyle_in_ruleAbstractNodeStyle1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_entryRuleDiagram1350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagram1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDiagram1406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDiagram1423 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDiagram1440 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_16_in_ruleDiagram1453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDiagram1470 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_ruleDomainContainer_in_ruleDiagram1498 = new BitSet(new long[]{0x8000000000084000L});
    public static final BitSet FOLLOW_ruleMappingSet_in_ruleDiagram1519 = new BitSet(new long[]{0x8000000000004000L});
    public static final BitSet FOLLOW_ruleActionSet_in_ruleDiagram1541 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDiagram1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramExtension_in_entryRuleDiagramExtension1590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramExtension1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDiagramExtension1646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDiagramExtension1663 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDiagramExtension1680 = new BitSet(new long[]{0x80000000000C4000L});
    public static final BitSet FOLLOW_18_in_ruleDiagramExtension1693 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleDiagramExtension1716 = new BitSet(new long[]{0x8000000000084000L});
    public static final BitSet FOLLOW_ruleMappingSet_in_ruleDiagramExtension1739 = new BitSet(new long[]{0x8000000000004000L});
    public static final BitSet FOLLOW_ruleActionSet_in_ruleDiagramExtension1761 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDiagramExtension1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingSet_in_entryRuleMappingSet1810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingSet1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleMappingSet1866 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMappingSet1878 = new BitSet(new long[]{0x0800000040004000L,0x0000000000004200L});
    public static final BitSet FOLLOW_ruleDiagramChildren_in_ruleMappingSet1899 = new BitSet(new long[]{0x0800000040004000L,0x0000000000004200L});
    public static final BitSet FOLLOW_14_in_ruleMappingSet1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeDescription_in_entryRuleEdgeDescription1948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeDescription1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleEdgeDescription2004 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEdgeDescription2016 = new BitSet(new long[]{0x0000000003E04000L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleEdgeDescription2037 = new BitSet(new long[]{0x0000000002E04000L});
    public static final BitSet FOLLOW_21_in_ruleEdgeDescription2051 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEdgeDescription2063 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleEdgeDescription2084 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEdgeDescription2096 = new BitSet(new long[]{0x0000000002C04000L});
    public static final BitSet FOLLOW_22_in_ruleEdgeDescription2111 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEdgeDescription2123 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleEdgeDescription2144 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEdgeDescription2156 = new BitSet(new long[]{0x0000000002804000L});
    public static final BitSet FOLLOW_23_in_ruleEdgeDescription2171 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEdgeDescription2183 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleEdgeDescription2204 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEdgeDescription2216 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_ruleEdgeStyle_in_ruleEdgeDescription2239 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEdgeDescription2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition2288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCondition2344 = new BitSet(new long[]{0x0000000000000020L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleForeignExpressionElement_in_ruleCondition2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeStyle_in_entryRuleEdgeStyle2401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeStyle2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleEdgeStyle2457 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEdgeStyle2469 = new BitSet(new long[]{0x000000003C004000L});
    public static final BitSet FOLLOW_26_in_ruleEdgeStyle2482 = new BitSet(new long[]{0x0000000000000000L,0x00000F0000000000L});
    public static final BitSet FOLLOW_ruleLineStyle_in_ruleEdgeStyle2503 = new BitSet(new long[]{0x0000000038004000L});
    public static final BitSet FOLLOW_27_in_ruleEdgeStyle2518 = new BitSet(new long[]{0x0000000000000000L,0x007FF00000000000L});
    public static final BitSet FOLLOW_ruleEdgeArrows_in_ruleEdgeStyle2539 = new BitSet(new long[]{0x0000000030004000L});
    public static final BitSet FOLLOW_28_in_ruleEdgeStyle2554 = new BitSet(new long[]{0x0000000000000000L,0x007FF00000000000L});
    public static final BitSet FOLLOW_ruleEdgeArrows_in_ruleEdgeStyle2575 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_29_in_ruleEdgeStyle2590 = new BitSet(new long[]{0x0000000000000000L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleSystemColors_in_ruleEdgeStyle2611 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEdgeStyle2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer2661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainer2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleContainer2717 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleContainer2738 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleContainer2750 = new BitSet(new long[]{0x0000000780104000L});
    public static final BitSet FOLLOW_31_in_ruleContainer2763 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleContainer2786 = new BitSet(new long[]{0x0000000700104000L});
    public static final BitSet FOLLOW_32_in_ruleContainer2801 = new BitSet(new long[]{0x0000000000000020L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleNodeDomainElement_in_ruleContainer2822 = new BitSet(new long[]{0x0000000600104000L});
    public static final BitSet FOLLOW_33_in_ruleContainer2837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_ruleContainerLayout_in_ruleContainer2858 = new BitSet(new long[]{0x0000000400104000L});
    public static final BitSet FOLLOW_ruleContainerDescription_in_ruleContainer2881 = new BitSet(new long[]{0x0000000400104000L});
    public static final BitSet FOLLOW_ruleContainerChildren_in_ruleContainer2903 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContainer2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerChildren_in_entryRuleContainerChildren2952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerChildren2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleContainerChildren3008 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleContainerChildren3020 = new BitSet(new long[]{0x1800000840004000L,0x0000000000004200L});
    public static final BitSet FOLLOW_35_in_ruleContainerChildren3033 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleContainerChildren3056 = new BitSet(new long[]{0x1800001040004000L,0x0000000000004200L});
    public static final BitSet FOLLOW_36_in_ruleContainerChildren3069 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleContainerChildren3092 = new BitSet(new long[]{0x1800001040004000L,0x0000000000004200L});
    public static final BitSet FOLLOW_ruleAbstractNode_in_ruleContainerChildren3117 = new BitSet(new long[]{0x1800000040004000L,0x0000000000004200L});
    public static final BitSet FOLLOW_14_in_ruleContainerChildren3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDomainElement_in_entryRuleNodeDomainElement3166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeDomainElement3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractClass_in_ruleNodeDomainElement3231 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleNodeDomainElement3244 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_38_in_ruleNodeDomainElement3258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNodeDomainElement3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNodeDomainElement3300 = new BitSet(new long[]{0x0000000000000020L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleAbstractAssociation2_in_ruleNodeDomainElement3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerDescription_in_entryRuleContainerDescription3361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerDescription3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleContainerDescription3417 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleContainerDescription3429 = new BitSet(new long[]{0x0000010003004000L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleContainerDescription3450 = new BitSet(new long[]{0x0000010002004000L});
    public static final BitSet FOLLOW_40_in_ruleContainerDescription3464 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleContainerDescription3476 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleContainerDescription3497 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContainerDescription3509 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_ruleContainerDescription3524 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleContainerDescription3544 = new BitSet(new long[]{0x0048000000000000L});
    public static final BitSet FOLLOW_ruleAbstractContainerStyle_in_ruleContainerDescription3566 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContainerDescription3578 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContainerDescription3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicStyle_in_entryRuleBasicStyle3628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicStyle3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleBasicStyle3684 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBasicStyle3696 = new BitSet(new long[]{0x00001C0000004000L});
    public static final BitSet FOLLOW_42_in_ruleBasicStyle3709 = new BitSet(new long[]{0x0000000000000000L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleSystemColors_in_ruleBasicStyle3730 = new BitSet(new long[]{0x0000180000004000L});
    public static final BitSet FOLLOW_43_in_ruleBasicStyle3745 = new BitSet(new long[]{0x0000000000000000L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleSystemColors_in_ruleBasicStyle3766 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_44_in_ruleBasicStyle3781 = new BitSet(new long[]{0x0000000000000000L,0x00000000FF000000L});
    public static final BitSet FOLLOW_ruleNode_Form_in_ruleBasicStyle3802 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBasicStyle3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHistogramStyle_in_entryRuleHistogramStyle3852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHistogramStyle3862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleHistogramStyle3908 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleHistogramStyle3920 = new BitSet(new long[]{0x0000440000004000L});
    public static final BitSet FOLLOW_42_in_ruleHistogramStyle3933 = new BitSet(new long[]{0x0000000000000000L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleSystemColors_in_ruleHistogramStyle3954 = new BitSet(new long[]{0x0000400000004000L});
    public static final BitSet FOLLOW_ruleHistogramSection_in_ruleHistogramStyle3977 = new BitSet(new long[]{0x0000400000004000L});
    public static final BitSet FOLLOW_14_in_ruleHistogramStyle3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHistogramSection_in_entryRuleHistogramSection4026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHistogramSection4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleHistogramSection4082 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleHistogramSection4094 = new BitSet(new long[]{0x0007880000004000L});
    public static final BitSet FOLLOW_43_in_ruleHistogramSection4107 = new BitSet(new long[]{0x0000000000000000L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleSystemColors_in_ruleHistogramSection4128 = new BitSet(new long[]{0x0007800000004000L});
    public static final BitSet FOLLOW_47_in_ruleHistogramSection4143 = new BitSet(new long[]{0x0000000000000000L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleSystemColors_in_ruleHistogramSection4164 = new BitSet(new long[]{0x0007000000004000L});
    public static final BitSet FOLLOW_48_in_ruleHistogramSection4179 = new BitSet(new long[]{0x0000000000000020L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleForeignExpressionElement_in_ruleHistogramSection4200 = new BitSet(new long[]{0x0006000000004000L});
    public static final BitSet FOLLOW_49_in_ruleHistogramSection4215 = new BitSet(new long[]{0x0000000000000020L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleForeignExpressionElement_in_ruleHistogramSection4236 = new BitSet(new long[]{0x0004000000004000L});
    public static final BitSet FOLLOW_50_in_ruleHistogramSection4251 = new BitSet(new long[]{0x0000000000000020L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleForeignExpressionElement_in_ruleHistogramSection4272 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleHistogramSection4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageStyle_in_entryRuleImageStyle4322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageStyle4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleImageStyle4378 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImageStyle4390 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_52_in_ruleImageStyle4403 = new BitSet(new long[]{0x0000000000000000L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleSystemColors_in_ruleImageStyle4424 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleImageStyle4439 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImageStyle4456 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImageStyle4474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlatStyle_in_entryRuleFlatStyle4510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlatStyle4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleFlatStyle4566 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFlatStyle4578 = new BitSet(new long[]{0x0010880000004000L});
    public static final BitSet FOLLOW_52_in_ruleFlatStyle4591 = new BitSet(new long[]{0x0000000000000000L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleSystemColors_in_ruleFlatStyle4612 = new BitSet(new long[]{0x0000880000004000L});
    public static final BitSet FOLLOW_43_in_ruleFlatStyle4627 = new BitSet(new long[]{0x0000000000000000L,0xFF80000700000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleBackgroundStyle_in_ruleFlatStyle4648 = new BitSet(new long[]{0x0000000000000000L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleSystemColors_in_ruleFlatStyle4670 = new BitSet(new long[]{0x0000800000004000L});
    public static final BitSet FOLLOW_47_in_ruleFlatStyle4685 = new BitSet(new long[]{0x0000000000000000L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleSystemColors_in_ruleFlatStyle4706 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFlatStyle4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel4756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel4766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleLabel4813 = new BitSet(new long[]{0x0100000000000030L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLabel4834 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleLabel4848 = new BitSet(new long[]{0x0600000000000042L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_57_in_ruleLabel4866 = new BitSet(new long[]{0x0400000000000042L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_58_in_ruleLabel4898 = new BitSet(new long[]{0x0000000000000042L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleSystemColors_in_ruleLabel4933 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleEInt_in_ruleLabel4955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode4994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleNode5050 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleNode5071 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNode5083 = new BitSet(new long[]{0x0000000580104000L});
    public static final BitSet FOLLOW_31_in_ruleNode5096 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleNode5119 = new BitSet(new long[]{0x0000000500104000L});
    public static final BitSet FOLLOW_32_in_ruleNode5134 = new BitSet(new long[]{0x0000000000000020L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleNodeDomainElement_in_ruleNode5155 = new BitSet(new long[]{0x0000000400104000L});
    public static final BitSet FOLLOW_ruleNodeDescription_in_ruleNode5178 = new BitSet(new long[]{0x0000000400104000L});
    public static final BitSet FOLLOW_ruleNodeChildren_in_ruleNode5200 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNode5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeChildren_in_entryRuleNodeChildren5249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeChildren5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleNodeChildren5305 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNodeChildren5317 = new BitSet(new long[]{0x1000000800004000L});
    public static final BitSet FOLLOW_35_in_ruleNodeChildren5330 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleNodeChildren5353 = new BitSet(new long[]{0x1000001000004000L});
    public static final BitSet FOLLOW_36_in_ruleNodeChildren5366 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleNodeChildren5389 = new BitSet(new long[]{0x1000001000004000L});
    public static final BitSet FOLLOW_ruleBorderedNode_in_ruleNodeChildren5414 = new BitSet(new long[]{0x1000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNodeChildren5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderedNode_in_entryRuleBorderedNode5463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorderedNode5473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleBorderedNode5519 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleBorderedNode5540 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBorderedNode5552 = new BitSet(new long[]{0x0000000180104000L});
    public static final BitSet FOLLOW_31_in_ruleBorderedNode5565 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleBorderedNode5588 = new BitSet(new long[]{0x0000000100104000L});
    public static final BitSet FOLLOW_32_in_ruleBorderedNode5603 = new BitSet(new long[]{0x0000000000000020L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleNodeDomainElement_in_ruleBorderedNode5624 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_ruleNodeDescription_in_ruleBorderedNode5647 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_14_in_ruleBorderedNode5660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDescription_in_entryRuleNodeDescription5696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeDescription5706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleNodeDescription5752 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNodeDescription5764 = new BitSet(new long[]{0x0000010003004000L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleNodeDescription5785 = new BitSet(new long[]{0x0000010002004000L});
    public static final BitSet FOLLOW_40_in_ruleNodeDescription5799 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNodeDescription5811 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleNodeDescription5832 = new BitSet(new long[]{0x6000000000004000L});
    public static final BitSet FOLLOW_61_in_ruleNodeDescription5845 = new BitSet(new long[]{0x0000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_ruleLabelPosition_in_ruleNodeDescription5866 = new BitSet(new long[]{0x4000000000004000L});
    public static final BitSet FOLLOW_62_in_ruleNodeDescription5881 = new BitSet(new long[]{0x0000000000000000L,0x000000E000000000L});
    public static final BitSet FOLLOW_ruleLabelAlignment_in_ruleNodeDescription5902 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNodeDescription5916 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_ruleNodeDescription5931 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNodeDescription5943 = new BitSet(new long[]{0x0048220000000000L});
    public static final BitSet FOLLOW_ruleAbstractNodeStyle_in_ruleNodeDescription5964 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNodeDescription5976 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNodeDescription5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionSet_in_entryRuleActionSet6026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionSet6036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleActionSet6082 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActionSet6094 = new BitSet(new long[]{0x0000000000004000L,0x00000000000001D1L});
    public static final BitSet FOLLOW_ruleAction_in_ruleActionSet6115 = new BitSet(new long[]{0x0000000000004000L,0x00000000000001D1L});
    public static final BitSet FOLLOW_ruleOpenAction_in_ruleActionSet6137 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000001L});
    public static final BitSet FOLLOW_14_in_ruleActionSet6150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenAction_in_entryRuleOpenAction6186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenAction6196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleOpenAction6242 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleOpenAction6263 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOpenAction6275 = new BitSet(new long[]{0x0000000000004000L,0x000000000000000EL});
    public static final BitSet FOLLOW_65_in_ruleOpenAction6288 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleOpenAction6309 = new BitSet(new long[]{0x0000000000004000L,0x000000000000000CL});
    public static final BitSet FOLLOW_66_in_ruleOpenAction6324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOpenAction6341 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleOpenAction6361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOpenAction6378 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleOpenAction6397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction6433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction6443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreate_in_ruleAction6490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelete_in_ruleAction6517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDrop_in_ruleAction6544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReconnectEdge_in_ruleAction6571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreate_in_entryRuleCreate6606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreate6616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCreate6662 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleCreate6683 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCreate6695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000026L});
    public static final BitSet FOLLOW_65_in_ruleCreate6708 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleCreate6729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_66_in_ruleCreate6744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCreate6761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleCreate6781 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleCreate6804 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleCreate6818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCreate6835 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCreate6854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelete_in_entryRuleDelete6890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelete6900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleDelete6946 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleDelete6967 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDelete6979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000026L});
    public static final BitSet FOLLOW_65_in_ruleDelete6992 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleDelete7013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_66_in_ruleDelete7028 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDelete7045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleDelete7065 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleDelete7088 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDelete7101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDrop_in_entryRuleDrop7137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDrop7147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleDrop7193 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleDrop7214 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDrop7226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000026L});
    public static final BitSet FOLLOW_65_in_ruleDrop7239 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleDrop7260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_66_in_ruleDrop7275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDrop7292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleDrop7312 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleDrop7335 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDrop7348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReconnectEdge_in_entryRuleReconnectEdge7384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReconnectEdge7394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleReconnectEdge7440 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleReconnectEdge7461 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleReconnectEdge7473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000026L});
    public static final BitSet FOLLOW_65_in_ruleReconnectEdge7486 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleReconnectEdge7507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_66_in_ruleReconnectEdge7522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleReconnectEdge7539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleReconnectEdge7559 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleReconnectEdge7582 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleReconnectEdge7595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainContainer_in_entryRuleDomainContainer7631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainContainer7641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDomainContainer7688 = new BitSet(new long[]{0x0000000000000020L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleAbstractClass_in_ruleDomainContainer7709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdge_in_entryRuleEdge7746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdge7756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleEdge7802 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleEdge7823 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEdge7835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_74_in_ruleEdge7849 = new BitSet(new long[]{0x0000000000000020L,0x0000000000108000L});
    public static final BitSet FOLLOW_ruleEdgeDomainAssociation_in_ruleEdge7870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_75_in_ruleEdge7890 = new BitSet(new long[]{0x0000000000000020L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleEdgeDomainElement_in_ruleEdge7911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleEdge7926 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEdge7949 = new BitSet(new long[]{0x0000001000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_36_in_ruleEdge7962 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEdge7985 = new BitSet(new long[]{0x0000001000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleEdge8001 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEdge8024 = new BitSet(new long[]{0x0000001000104000L});
    public static final BitSet FOLLOW_36_in_ruleEdge8037 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEdge8060 = new BitSet(new long[]{0x0000001000104000L});
    public static final BitSet FOLLOW_ruleEdgeDescription_in_ruleEdge8084 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_14_in_ruleEdge8097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeImport_in_entryRuleEdgeImport8133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeImport8143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleEdgeImport8189 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleEdgeImport8210 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEdgeImport8222 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEdgeImport8235 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEdgeImport8258 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_ruleEdgeDescription_in_ruleEdgeImport8280 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_14_in_ruleEdgeImport8293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeDomainAssociation_in_entryRuleEdgeDomainAssociation8329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeDomainAssociation8339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleEdgeDomainAssociation8387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEdgeDomainAssociation8404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractAssociation2_in_ruleEdgeDomainAssociation8437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeDomainElement_in_entryRuleEdgeDomainElement8474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeDomainElement8484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractClass_in_ruleEdgeDomainElement8539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_80_in_ruleEdgeDomainElement8553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEdgeDomainElement8570 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_81_in_ruleEdgeDomainElement8595 = new BitSet(new long[]{0x0000000000000020L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleAbstractAssociation2_in_ruleEdgeDomainElement8616 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_82_in_ruleEdgeDomainElement8632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEdgeDomainElement8649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleEdgeDomainElement8674 = new BitSet(new long[]{0x0000000000000020L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleAbstractAssociation2_in_ruleEdgeDomainElement8695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractClass_in_entryRuleAbstractClass8733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractClass8743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalClass2_in_ruleAbstractClass8790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalClass_in_ruleAbstractClass8817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalClass2_in_entryRuleLocalClass28852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalClass28862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleLocalClass28919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalClass_in_entryRuleExternalClass8955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalClass8965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleExternalClass9011 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleExternalClass9034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractAssociation2_in_entryRuleAbstractAssociation29070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractAssociation29080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalAssociation_in_ruleAbstractAssociation29127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalAssociation_in_ruleAbstractAssociation29154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalAssociation_in_entryRuleLocalAssociation9189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalAssociation9199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleLocalAssociation9256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalAssociation_in_entryRuleExternalAssociation9292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalAssociation9302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleExternalAssociation9348 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleExternalAssociation9371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalAttribute_in_entryRuleLocalAttribute9409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalAttribute9419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleLocalAttribute9476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalAttribute_in_entryRuleExternalAttribute9512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalAttribute9522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleExternalAttribute9568 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleExternalAttribute9591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression9627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression9637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionElement_in_ruleExpression9693 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ruleExpression9706 = new BitSet(new long[]{0x0000000000000030L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpressionElement_in_ruleExpression9727 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleExpressionElement_in_entryRuleExpressionElement9767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionElement9777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeignExpressionElement_in_ruleExpressionElement9824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringElement_in_ruleExpressionElement9851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeignExpressionElement_in_entryRuleForeignExpressionElement9886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeignExpressionElement9896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaElement_in_ruleForeignExpressionElement9943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_ruleForeignExpressionElement9970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaElement_in_entryRuleJavaElement10005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaElement10015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleJavaElement10061 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleJavaElement10082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_entryRuleDomainElement10118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainElement10128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleDomainElement10185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringElement_in_entryRuleStringElement10221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringElement10231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringElement10282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString10324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString10335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString10375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString10401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN10447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN10458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN10498 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleFQN10517 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN10538 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt10589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEInt10600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEInt10639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleNode_Form10697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleNode_Form10714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleNode_Form10731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleNode_Form10748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleNode_Form10765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleNode_Form10782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleNode_Form10799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleNode_Form10816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleBackgroundStyle10861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleBackgroundStyle10878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleBackgroundStyle10895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleLabelPosition10940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleLabelPosition10957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleLabelAlignment11002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleLabelAlignment11019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleLabelAlignment11036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleLineStyle11081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleLineStyle11098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleLineStyle11115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleLineStyle11132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleEdgeArrows11177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleEdgeArrows11194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleEdgeArrows11211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleEdgeArrows11228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleEdgeArrows11245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleEdgeArrows11262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleEdgeArrows11279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleEdgeArrows11296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleEdgeArrows11313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleEdgeArrows11330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleEdgeArrows11347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleSystemColors11392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleSystemColors11409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleSystemColors11426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleSystemColors11443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleSystemColors11460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleSystemColors11477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleSystemColors11494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleSystemColors11511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleSystemColors11528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleSystemColors11545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleSystemColors11562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleSystemColors11579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleSystemColors11596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleSystemColors11613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleSystemColors11630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ruleSystemColors11647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleSystemColors11664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ruleSystemColors11681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ruleSystemColors11698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_ruleSystemColors11715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_ruleSystemColors11732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_ruleSystemColors11749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_ruleSystemColors11766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_ruleSystemColors11783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_ruleSystemColors11800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_ruleSystemColors11817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_ruleContainerLayout11862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_ruleContainerLayout11879 = new BitSet(new long[]{0x0000000000000002L});

}
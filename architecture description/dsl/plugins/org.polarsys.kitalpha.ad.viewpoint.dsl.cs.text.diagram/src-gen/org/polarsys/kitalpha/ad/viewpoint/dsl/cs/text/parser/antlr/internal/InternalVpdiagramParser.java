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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'external'", "'Diagrams'", "'{'", "'}'", "'Diagram'", "'description:'", "'DiagramExtension'", "'extended-diagram:'", "'Mapping'", "'Representation'", "'BeginLabel'", "'CenterLabel'", "'EndLabel'", "'condition:'", "'Style'", "'line-style:'", "'begin-decorator:'", "'end-decorator:'", "'color:'", "'Container'", "'import:'", "'domain-context:'", "'content-layout:'", "'Contains'", "'reuse'", "','", "'provided-by'", "'query'", "'association'", "'Label'", "'BasicStyle'", "'border-color:'", "'background:'", "'form:'", "'HistogramStyle'", "'Section'", "'foreground:'", "'minValue:'", "'value:'", "'maxValue:'", "'Image'", "'border:'", "'path:'", "'FlatStyle'", "'content:'", "'police:'", "'bold'", "'italic'", "'Node'", "'BorderedNode'", "'position:'", "'alignment:'", "'Actions'", "'OpenAction'", "'precondition:'", "'label:'", "'icon:'", "'Create'", "'action-for:'", "'Delete'", "'Drop'", "'ReconnectEdge'", "'Edge'", "'association-context:'", "'class-association-context:'", "'source:'", "'target:'", "'EdgeImport'", "'query:'", "'target-query:'", "'target-association:'", "'source-query:'", "'source-association:'", "'+'", "'Java'", "'.'", "'Square'", "'Lozenge'", "'Eclipse'", "'Note'", "'Dot'", "'Triangle'", "'Stroke'", "'Ring'", "'GradientLeftToRight'", "'Liquid'", "'GradientTopToBottom'", "'border'", "'node'", "'center'", "'left'", "'right'", "'solid'", "'dash'", "'dot'", "'dash_dot'", "'NoDecoration'", "'OutputArrow'", "'InputArrow'", "'OutputClosedArrow'", "'InputClosedArrow'", "'OutputFillClosedArrow'", "'InputFillClosedArrow'", "'Diamond'", "'FillDiamond'", "'InputArrowWithDiamond'", "'InputArrowWothFillDiamond'", "'black'", "'blue'", "'red'", "'green'", "'yellow'", "'purple'", "'orange'", "'chocolate'", "'gray'", "'white'", "'dark_blue'", "'dark_red'", "'dark_green'", "'dark_yellow'", "'dark_purple'", "'dark_orange'", "'dark_chocolate'", "'dark_gray'", "'light_blue'", "'light_red'", "'light_green'", "'light_yellow'", "'light_purple'", "'light_orange'", "'light_chocolate'", "'light_gray'", "'FreeForm'", "'List'"
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:77:1: ruleDiagrams returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleAbstractImport ) )* ( (lv_diagrams_2_0= ruleAspect ) ) ) ;
    public final EObject ruleDiagrams() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_diagrams_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:80:28: ( ( () ( (lv_imports_1_0= ruleAbstractImport ) )* ( (lv_diagrams_2_0= ruleAspect ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:81:1: ( () ( (lv_imports_1_0= ruleAbstractImport ) )* ( (lv_diagrams_2_0= ruleAspect ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:81:1: ( () ( (lv_imports_1_0= ruleAbstractImport ) )* ( (lv_diagrams_2_0= ruleAspect ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:81:2: () ( (lv_imports_1_0= ruleAbstractImport ) )* ( (lv_diagrams_2_0= ruleAspect ) )
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:87:2: ( (lv_imports_1_0= ruleAbstractImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:88:1: (lv_imports_1_0= ruleAbstractImport )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:88:1: (lv_imports_1_0= ruleAbstractImport )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:89:3: lv_imports_1_0= ruleAbstractImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDiagramsAccess().getImportsAbstractImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractImport_in_ruleDiagrams140);
            	    lv_imports_1_0=ruleAbstractImport();

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
            	              		"AbstractImport");
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


    // $ANTLR start "entryRuleAbstractImport"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:131:1: entryRuleAbstractImport returns [EObject current=null] : iv_ruleAbstractImport= ruleAbstractImport EOF ;
    public final EObject entryRuleAbstractImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractImport = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:132:2: (iv_ruleAbstractImport= ruleAbstractImport EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:133:2: iv_ruleAbstractImport= ruleAbstractImport EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:140:1: ruleAbstractImport returns [EObject current=null] : (this_ImportNameSpace_0= ruleImportNameSpace | this_ImportGroup_1= ruleImportGroup ) ;
    public final EObject ruleAbstractImport() throws RecognitionException {
        EObject current = null;

        EObject this_ImportNameSpace_0 = null;

        EObject this_ImportGroup_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:143:28: ( (this_ImportNameSpace_0= ruleImportNameSpace | this_ImportGroup_1= ruleImportGroup ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:144:1: (this_ImportNameSpace_0= ruleImportNameSpace | this_ImportGroup_1= ruleImportGroup )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:144:1: (this_ImportNameSpace_0= ruleImportNameSpace | this_ImportGroup_1= ruleImportGroup )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==12) ) {
                    alt2=2;
                }
                else if ( (LA2_1==RULE_ID) ) {
                    alt2=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:145:5: this_ImportNameSpace_0= ruleImportNameSpace
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractImportAccess().getImportNameSpaceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImportNameSpace_in_ruleAbstractImport255);
                    this_ImportNameSpace_0=ruleImportNameSpace();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ImportNameSpace_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:155:5: this_ImportGroup_1= ruleImportGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractImportAccess().getImportGroupParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImportGroup_in_ruleAbstractImport282);
                    this_ImportGroup_1=ruleImportGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ImportGroup_1; 
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


    // $ANTLR start "entryRuleImportNameSpace"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:171:1: entryRuleImportNameSpace returns [EObject current=null] : iv_ruleImportNameSpace= ruleImportNameSpace EOF ;
    public final EObject entryRuleImportNameSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportNameSpace = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:172:2: (iv_ruleImportNameSpace= ruleImportNameSpace EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:173:2: iv_ruleImportNameSpace= ruleImportNameSpace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportNameSpaceRule()); 
            }
            pushFollow(FOLLOW_ruleImportNameSpace_in_entryRuleImportNameSpace317);
            iv_ruleImportNameSpace=ruleImportNameSpace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportNameSpace; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportNameSpace327); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportNameSpace"


    // $ANTLR start "ruleImportNameSpace"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:180:1: ruleImportNameSpace returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQN ) ) ) ;
    public final EObject ruleImportNameSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:183:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:184:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:184:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:184:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQN ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImportNameSpace364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportNameSpaceAccess().getImportKeyword_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:188:1: ( (lv_importedNamespace_1_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:189:1: (lv_importedNamespace_1_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:189:1: (lv_importedNamespace_1_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:190:3: lv_importedNamespace_1_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportNameSpaceAccess().getImportedNamespaceFQNParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleImportNameSpace385);
            lv_importedNamespace_1_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportNameSpaceRule());
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
    // $ANTLR end "ruleImportNameSpace"


    // $ANTLR start "entryRuleImportGroup"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:214:1: entryRuleImportGroup returns [EObject current=null] : iv_ruleImportGroup= ruleImportGroup EOF ;
    public final EObject entryRuleImportGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportGroup = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:215:2: (iv_ruleImportGroup= ruleImportGroup EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:216:2: iv_ruleImportGroup= ruleImportGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportGroupRule()); 
            }
            pushFollow(FOLLOW_ruleImportGroup_in_entryRuleImportGroup421);
            iv_ruleImportGroup=ruleImportGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportGroup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportGroup431); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportGroup"


    // $ANTLR start "ruleImportGroup"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:223:1: ruleImportGroup returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= 'external' ( (lv_importedGroup_2_0= ruleEString ) ) ) ;
    public final EObject ruleImportGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_importedGroup_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:226:28: ( (otherlv_0= 'import' otherlv_1= 'external' ( (lv_importedGroup_2_0= ruleEString ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:227:1: (otherlv_0= 'import' otherlv_1= 'external' ( (lv_importedGroup_2_0= ruleEString ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:227:1: (otherlv_0= 'import' otherlv_1= 'external' ( (lv_importedGroup_2_0= ruleEString ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:227:3: otherlv_0= 'import' otherlv_1= 'external' ( (lv_importedGroup_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImportGroup468); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportGroupAccess().getImportKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleImportGroup480); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getImportGroupAccess().getExternalKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:235:1: ( (lv_importedGroup_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:236:1: (lv_importedGroup_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:236:1: (lv_importedGroup_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:237:3: lv_importedGroup_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportGroupAccess().getImportedGroupEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleImportGroup501);
            lv_importedGroup_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportGroupRule());
              	        }
                     		set(
                     			current, 
                     			"importedGroup",
                      		lv_importedGroup_2_0, 
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
    // $ANTLR end "ruleImportGroup"


    // $ANTLR start "entryRuleAspect"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:261:1: entryRuleAspect returns [EObject current=null] : iv_ruleAspect= ruleAspect EOF ;
    public final EObject entryRuleAspect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAspect = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:262:2: (iv_ruleAspect= ruleAspect EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:263:2: iv_ruleAspect= ruleAspect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAspectRule()); 
            }
            pushFollow(FOLLOW_ruleAspect_in_entryRuleAspect537);
            iv_ruleAspect=ruleAspect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAspect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspect547); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:270:1: ruleAspect returns [EObject current=null] : this_DiagramSet_0= ruleDiagramSet ;
    public final EObject ruleAspect() throws RecognitionException {
        EObject current = null;

        EObject this_DiagramSet_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:273:28: (this_DiagramSet_0= ruleDiagramSet )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:275:5: this_DiagramSet_0= ruleDiagramSet
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAspectAccess().getDiagramSetParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleDiagramSet_in_ruleAspect593);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:291:1: entryRuleDiagramSet returns [EObject current=null] : iv_ruleDiagramSet= ruleDiagramSet EOF ;
    public final EObject entryRuleDiagramSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramSet = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:292:2: (iv_ruleDiagramSet= ruleDiagramSet EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:293:2: iv_ruleDiagramSet= ruleDiagramSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDiagramSetRule()); 
            }
            pushFollow(FOLLOW_ruleDiagramSet_in_entryRuleDiagramSet627);
            iv_ruleDiagramSet=ruleDiagramSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDiagramSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagramSet637); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:300:1: ruleDiagramSet returns [EObject current=null] : ( () otherlv_1= 'Diagrams' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_diagrams_4_0= ruleDiagramRepresentation ) )* otherlv_5= '}' ) ;
    public final EObject ruleDiagramSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_diagrams_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:303:28: ( ( () otherlv_1= 'Diagrams' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_diagrams_4_0= ruleDiagramRepresentation ) )* otherlv_5= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:304:1: ( () otherlv_1= 'Diagrams' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_diagrams_4_0= ruleDiagramRepresentation ) )* otherlv_5= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:304:1: ( () otherlv_1= 'Diagrams' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_diagrams_4_0= ruleDiagramRepresentation ) )* otherlv_5= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:304:2: () otherlv_1= 'Diagrams' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_diagrams_4_0= ruleDiagramRepresentation ) )* otherlv_5= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:304:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:305:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDiagramSetAccess().getDiagramSetAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleDiagramSet683); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDiagramSetAccess().getDiagramsKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:314:1: ( (lv_name_2_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:315:1: (lv_name_2_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:315:1: (lv_name_2_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:316:3: lv_name_2_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDiagramSetAccess().getNameFQNParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleDiagramSet704);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleDiagramSet716); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDiagramSetAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:336:1: ( (lv_diagrams_4_0= ruleDiagramRepresentation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16||LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:337:1: (lv_diagrams_4_0= ruleDiagramRepresentation )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:337:1: (lv_diagrams_4_0= ruleDiagramRepresentation )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:338:3: lv_diagrams_4_0= ruleDiagramRepresentation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDiagramSetAccess().getDiagramsDiagramRepresentationParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDiagramRepresentation_in_ruleDiagramSet737);
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
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDiagramSet750); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:366:1: entryRuleDiagramRepresentation returns [EObject current=null] : iv_ruleDiagramRepresentation= ruleDiagramRepresentation EOF ;
    public final EObject entryRuleDiagramRepresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramRepresentation = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:367:2: (iv_ruleDiagramRepresentation= ruleDiagramRepresentation EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:368:2: iv_ruleDiagramRepresentation= ruleDiagramRepresentation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDiagramRepresentationRule()); 
            }
            pushFollow(FOLLOW_ruleDiagramRepresentation_in_entryRuleDiagramRepresentation786);
            iv_ruleDiagramRepresentation=ruleDiagramRepresentation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDiagramRepresentation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagramRepresentation796); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:375:1: ruleDiagramRepresentation returns [EObject current=null] : (this_Diagram_0= ruleDiagram | this_DiagramExtension_1= ruleDiagramExtension ) ;
    public final EObject ruleDiagramRepresentation() throws RecognitionException {
        EObject current = null;

        EObject this_Diagram_0 = null;

        EObject this_DiagramExtension_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:378:28: ( (this_Diagram_0= ruleDiagram | this_DiagramExtension_1= ruleDiagramExtension ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:379:1: (this_Diagram_0= ruleDiagram | this_DiagramExtension_1= ruleDiagramExtension )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:379:1: (this_Diagram_0= ruleDiagram | this_DiagramExtension_1= ruleDiagramExtension )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:380:5: this_Diagram_0= ruleDiagram
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDiagramRepresentationAccess().getDiagramParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDiagram_in_ruleDiagramRepresentation843);
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:390:5: this_DiagramExtension_1= ruleDiagramExtension
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDiagramRepresentationAccess().getDiagramExtensionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDiagramExtension_in_ruleDiagramRepresentation870);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:408:1: entryRuleDiagramChildren returns [EObject current=null] : iv_ruleDiagramChildren= ruleDiagramChildren EOF ;
    public final EObject entryRuleDiagramChildren() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramChildren = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:409:2: (iv_ruleDiagramChildren= ruleDiagramChildren EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:410:2: iv_ruleDiagramChildren= ruleDiagramChildren EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDiagramChildrenRule()); 
            }
            pushFollow(FOLLOW_ruleDiagramChildren_in_entryRuleDiagramChildren907);
            iv_ruleDiagramChildren=ruleDiagramChildren();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDiagramChildren; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagramChildren917); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:417:1: ruleDiagramChildren returns [EObject current=null] : (this_AbstractEdge_0= ruleAbstractEdge | this_Container_1= ruleContainer | this_Node_2= ruleNode ) ;
    public final EObject ruleDiagramChildren() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractEdge_0 = null;

        EObject this_Container_1 = null;

        EObject this_Node_2 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:420:28: ( (this_AbstractEdge_0= ruleAbstractEdge | this_Container_1= ruleContainer | this_Node_2= ruleNode ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:421:1: (this_AbstractEdge_0= ruleAbstractEdge | this_Container_1= ruleContainer | this_Node_2= ruleNode )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:421:1: (this_AbstractEdge_0= ruleAbstractEdge | this_Container_1= ruleContainer | this_Node_2= ruleNode )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 74:
            case 79:
                {
                alt5=1;
                }
                break;
            case 31:
                {
                alt5=2;
                }
                break;
            case 60:
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:422:5: this_AbstractEdge_0= ruleAbstractEdge
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDiagramChildrenAccess().getAbstractEdgeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAbstractEdge_in_ruleDiagramChildren964);
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:432:5: this_Container_1= ruleContainer
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDiagramChildrenAccess().getContainerParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleContainer_in_ruleDiagramChildren991);
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:442:5: this_Node_2= ruleNode
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDiagramChildrenAccess().getNodeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNode_in_ruleDiagramChildren1018);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:458:1: entryRuleAbstractNode returns [EObject current=null] : iv_ruleAbstractNode= ruleAbstractNode EOF ;
    public final EObject entryRuleAbstractNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNode = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:459:2: (iv_ruleAbstractNode= ruleAbstractNode EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:460:2: iv_ruleAbstractNode= ruleAbstractNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractNodeRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode1053);
            iv_ruleAbstractNode=ruleAbstractNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractNode1063); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:467:1: ruleAbstractNode returns [EObject current=null] : (this_Node_0= ruleNode | this_BorderedNode_1= ruleBorderedNode | this_Container_2= ruleContainer ) ;
    public final EObject ruleAbstractNode() throws RecognitionException {
        EObject current = null;

        EObject this_Node_0 = null;

        EObject this_BorderedNode_1 = null;

        EObject this_Container_2 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:470:28: ( (this_Node_0= ruleNode | this_BorderedNode_1= ruleBorderedNode | this_Container_2= ruleContainer ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:471:1: (this_Node_0= ruleNode | this_BorderedNode_1= ruleBorderedNode | this_Container_2= ruleContainer )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:471:1: (this_Node_0= ruleNode | this_BorderedNode_1= ruleBorderedNode | this_Container_2= ruleContainer )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt6=1;
                }
                break;
            case 61:
                {
                alt6=2;
                }
                break;
            case 31:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:472:5: this_Node_0= ruleNode
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractNodeAccess().getNodeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNode_in_ruleAbstractNode1110);
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:482:5: this_BorderedNode_1= ruleBorderedNode
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractNodeAccess().getBorderedNodeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBorderedNode_in_ruleAbstractNode1137);
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:492:5: this_Container_2= ruleContainer
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractNodeAccess().getContainerParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleContainer_in_ruleAbstractNode1164);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:508:1: entryRuleAbstractEdge returns [EObject current=null] : iv_ruleAbstractEdge= ruleAbstractEdge EOF ;
    public final EObject entryRuleAbstractEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractEdge = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:509:2: (iv_ruleAbstractEdge= ruleAbstractEdge EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:510:2: iv_ruleAbstractEdge= ruleAbstractEdge EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractEdgeRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractEdge_in_entryRuleAbstractEdge1199);
            iv_ruleAbstractEdge=ruleAbstractEdge();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractEdge; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractEdge1209); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:517:1: ruleAbstractEdge returns [EObject current=null] : (this_Edge_0= ruleEdge | this_EdgeImport_1= ruleEdgeImport ) ;
    public final EObject ruleAbstractEdge() throws RecognitionException {
        EObject current = null;

        EObject this_Edge_0 = null;

        EObject this_EdgeImport_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:520:28: ( (this_Edge_0= ruleEdge | this_EdgeImport_1= ruleEdgeImport ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:521:1: (this_Edge_0= ruleEdge | this_EdgeImport_1= ruleEdgeImport )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:521:1: (this_Edge_0= ruleEdge | this_EdgeImport_1= ruleEdgeImport )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==74) ) {
                alt7=1;
            }
            else if ( (LA7_0==79) ) {
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:522:5: this_Edge_0= ruleEdge
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEdgeAccess().getEdgeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEdge_in_ruleAbstractEdge1256);
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:532:5: this_EdgeImport_1= ruleEdgeImport
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractEdgeAccess().getEdgeImportParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEdgeImport_in_ruleAbstractEdge1283);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:550:1: entryRuleAbstractContainerStyle returns [EObject current=null] : iv_ruleAbstractContainerStyle= ruleAbstractContainerStyle EOF ;
    public final EObject entryRuleAbstractContainerStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractContainerStyle = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:551:2: (iv_ruleAbstractContainerStyle= ruleAbstractContainerStyle EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:552:2: iv_ruleAbstractContainerStyle= ruleAbstractContainerStyle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractContainerStyleRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractContainerStyle_in_entryRuleAbstractContainerStyle1320);
            iv_ruleAbstractContainerStyle=ruleAbstractContainerStyle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractContainerStyle; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractContainerStyle1330); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:559:1: ruleAbstractContainerStyle returns [EObject current=null] : (this_FlatStyle_0= ruleFlatStyle | this_ImageStyle_1= ruleImageStyle ) ;
    public final EObject ruleAbstractContainerStyle() throws RecognitionException {
        EObject current = null;

        EObject this_FlatStyle_0 = null;

        EObject this_ImageStyle_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:562:28: ( (this_FlatStyle_0= ruleFlatStyle | this_ImageStyle_1= ruleImageStyle ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:563:1: (this_FlatStyle_0= ruleFlatStyle | this_ImageStyle_1= ruleImageStyle )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:563:1: (this_FlatStyle_0= ruleFlatStyle | this_ImageStyle_1= ruleImageStyle )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==55) ) {
                alt8=1;
            }
            else if ( (LA8_0==52) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:564:5: this_FlatStyle_0= ruleFlatStyle
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractContainerStyleAccess().getFlatStyleParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFlatStyle_in_ruleAbstractContainerStyle1377);
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:574:5: this_ImageStyle_1= ruleImageStyle
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractContainerStyleAccess().getImageStyleParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImageStyle_in_ruleAbstractContainerStyle1404);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:590:1: entryRuleAbstractNodeStyle returns [EObject current=null] : iv_ruleAbstractNodeStyle= ruleAbstractNodeStyle EOF ;
    public final EObject entryRuleAbstractNodeStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNodeStyle = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:591:2: (iv_ruleAbstractNodeStyle= ruleAbstractNodeStyle EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:592:2: iv_ruleAbstractNodeStyle= ruleAbstractNodeStyle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractNodeStyleRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractNodeStyle_in_entryRuleAbstractNodeStyle1439);
            iv_ruleAbstractNodeStyle=ruleAbstractNodeStyle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractNodeStyle; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractNodeStyle1449); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:599:1: ruleAbstractNodeStyle returns [EObject current=null] : (this_ImageStyle_0= ruleImageStyle | this_BasicStyle_1= ruleBasicStyle | this_HistogramStyle_2= ruleHistogramStyle ) ;
    public final EObject ruleAbstractNodeStyle() throws RecognitionException {
        EObject current = null;

        EObject this_ImageStyle_0 = null;

        EObject this_BasicStyle_1 = null;

        EObject this_HistogramStyle_2 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:602:28: ( (this_ImageStyle_0= ruleImageStyle | this_BasicStyle_1= ruleBasicStyle | this_HistogramStyle_2= ruleHistogramStyle ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:603:1: (this_ImageStyle_0= ruleImageStyle | this_BasicStyle_1= ruleBasicStyle | this_HistogramStyle_2= ruleHistogramStyle )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:603:1: (this_ImageStyle_0= ruleImageStyle | this_BasicStyle_1= ruleBasicStyle | this_HistogramStyle_2= ruleHistogramStyle )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt9=1;
                }
                break;
            case 42:
                {
                alt9=2;
                }
                break;
            case 46:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:604:5: this_ImageStyle_0= ruleImageStyle
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractNodeStyleAccess().getImageStyleParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImageStyle_in_ruleAbstractNodeStyle1496);
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:614:5: this_BasicStyle_1= ruleBasicStyle
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractNodeStyleAccess().getBasicStyleParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBasicStyle_in_ruleAbstractNodeStyle1523);
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:624:5: this_HistogramStyle_2= ruleHistogramStyle
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractNodeStyleAccess().getHistogramStyleParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHistogramStyle_in_ruleAbstractNodeStyle1550);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:640:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:641:2: (iv_ruleDiagram= ruleDiagram EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:642:2: iv_ruleDiagram= ruleDiagram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDiagramRule()); 
            }
            pushFollow(FOLLOW_ruleDiagram_in_entryRuleDiagram1585);
            iv_ruleDiagram=ruleDiagram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDiagram; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagram1595); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:649:1: ruleDiagram returns [EObject current=null] : ( () otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_the_domain_6_0= ruleDomainContainer ) ) ( (lv_the_MappingSet_7_0= ruleMappingSet ) )? ( (lv_the_ActionSet_8_0= ruleActionSet ) )? otherlv_9= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:652:28: ( ( () otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_the_domain_6_0= ruleDomainContainer ) ) ( (lv_the_MappingSet_7_0= ruleMappingSet ) )? ( (lv_the_ActionSet_8_0= ruleActionSet ) )? otherlv_9= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:653:1: ( () otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_the_domain_6_0= ruleDomainContainer ) ) ( (lv_the_MappingSet_7_0= ruleMappingSet ) )? ( (lv_the_ActionSet_8_0= ruleActionSet ) )? otherlv_9= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:653:1: ( () otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_the_domain_6_0= ruleDomainContainer ) ) ( (lv_the_MappingSet_7_0= ruleMappingSet ) )? ( (lv_the_ActionSet_8_0= ruleActionSet ) )? otherlv_9= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:653:2: () otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_the_domain_6_0= ruleDomainContainer ) ) ( (lv_the_MappingSet_7_0= ruleMappingSet ) )? ( (lv_the_ActionSet_8_0= ruleActionSet ) )? otherlv_9= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:653:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:654:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDiagramAccess().getDiagramAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleDiagram1641); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDiagramAccess().getDiagramKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:663:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:664:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:664:1: (lv_name_2_0= RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:665:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDiagram1658); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleDiagram1675); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:685:1: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:685:3: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleDiagram1688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDiagramAccess().getDescriptionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:689:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:690:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:690:1: (lv_description_5_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:691:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDiagram1705); if (state.failed) return current;
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:707:4: ( (lv_the_domain_6_0= ruleDomainContainer ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:708:1: (lv_the_domain_6_0= ruleDomainContainer )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:708:1: (lv_the_domain_6_0= ruleDomainContainer )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:709:3: lv_the_domain_6_0= ruleDomainContainer
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDiagramAccess().getThe_domainDomainContainerParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDomainContainer_in_ruleDiagram1733);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:725:2: ( (lv_the_MappingSet_7_0= ruleMappingSet ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:726:1: (lv_the_MappingSet_7_0= ruleMappingSet )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:726:1: (lv_the_MappingSet_7_0= ruleMappingSet )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:727:3: lv_the_MappingSet_7_0= ruleMappingSet
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDiagramAccess().getThe_MappingSetMappingSetParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMappingSet_in_ruleDiagram1754);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:743:3: ( (lv_the_ActionSet_8_0= ruleActionSet ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==64) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:744:1: (lv_the_ActionSet_8_0= ruleActionSet )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:744:1: (lv_the_ActionSet_8_0= ruleActionSet )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:745:3: lv_the_ActionSet_8_0= ruleActionSet
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDiagramAccess().getThe_ActionSetActionSetParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleActionSet_in_ruleDiagram1776);
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

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleDiagram1789); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:773:1: entryRuleDiagramExtension returns [EObject current=null] : iv_ruleDiagramExtension= ruleDiagramExtension EOF ;
    public final EObject entryRuleDiagramExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramExtension = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:774:2: (iv_ruleDiagramExtension= ruleDiagramExtension EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:775:2: iv_ruleDiagramExtension= ruleDiagramExtension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDiagramExtensionRule()); 
            }
            pushFollow(FOLLOW_ruleDiagramExtension_in_entryRuleDiagramExtension1825);
            iv_ruleDiagramExtension=ruleDiagramExtension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDiagramExtension; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagramExtension1835); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:782:1: ruleDiagramExtension returns [EObject current=null] : ( () otherlv_1= 'DiagramExtension' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'extended-diagram:' ( ( ruleFQN ) ) )? ( (lv_the_MappingSet_6_0= ruleMappingSet ) )? ( (lv_the_ActionSet_7_0= ruleActionSet ) )? otherlv_8= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:785:28: ( ( () otherlv_1= 'DiagramExtension' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'extended-diagram:' ( ( ruleFQN ) ) )? ( (lv_the_MappingSet_6_0= ruleMappingSet ) )? ( (lv_the_ActionSet_7_0= ruleActionSet ) )? otherlv_8= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:786:1: ( () otherlv_1= 'DiagramExtension' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'extended-diagram:' ( ( ruleFQN ) ) )? ( (lv_the_MappingSet_6_0= ruleMappingSet ) )? ( (lv_the_ActionSet_7_0= ruleActionSet ) )? otherlv_8= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:786:1: ( () otherlv_1= 'DiagramExtension' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'extended-diagram:' ( ( ruleFQN ) ) )? ( (lv_the_MappingSet_6_0= ruleMappingSet ) )? ( (lv_the_ActionSet_7_0= ruleActionSet ) )? otherlv_8= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:786:2: () otherlv_1= 'DiagramExtension' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'extended-diagram:' ( ( ruleFQN ) ) )? ( (lv_the_MappingSet_6_0= ruleMappingSet ) )? ( (lv_the_ActionSet_7_0= ruleActionSet ) )? otherlv_8= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:786:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:787:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDiagramExtensionAccess().getDiagramExtensionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleDiagramExtension1881); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDiagramExtensionAccess().getDiagramExtensionKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:796:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:797:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:797:1: (lv_name_2_0= RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:798:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDiagramExtension1898); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleDiagramExtension1915); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDiagramExtensionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:818:1: (otherlv_4= 'extended-diagram:' ( ( ruleFQN ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:818:3: otherlv_4= 'extended-diagram:' ( ( ruleFQN ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleDiagramExtension1928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDiagramExtensionAccess().getExtendedDiagramKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:822:1: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:823:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:823:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:824:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getDiagramExtensionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDiagramExtensionAccess().getExtented_diagramDiagramDescriptionCrossReference_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleDiagramExtension1951);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:837:4: ( (lv_the_MappingSet_6_0= ruleMappingSet ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:838:1: (lv_the_MappingSet_6_0= ruleMappingSet )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:838:1: (lv_the_MappingSet_6_0= ruleMappingSet )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:839:3: lv_the_MappingSet_6_0= ruleMappingSet
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDiagramExtensionAccess().getThe_MappingSetMappingSetParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMappingSet_in_ruleDiagramExtension1974);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:855:3: ( (lv_the_ActionSet_7_0= ruleActionSet ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==64) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:856:1: (lv_the_ActionSet_7_0= ruleActionSet )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:856:1: (lv_the_ActionSet_7_0= ruleActionSet )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:857:3: lv_the_ActionSet_7_0= ruleActionSet
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDiagramExtensionAccess().getThe_ActionSetActionSetParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleActionSet_in_ruleDiagramExtension1996);
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

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleDiagramExtension2009); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:885:1: entryRuleMappingSet returns [EObject current=null] : iv_ruleMappingSet= ruleMappingSet EOF ;
    public final EObject entryRuleMappingSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingSet = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:886:2: (iv_ruleMappingSet= ruleMappingSet EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:887:2: iv_ruleMappingSet= ruleMappingSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingSetRule()); 
            }
            pushFollow(FOLLOW_ruleMappingSet_in_entryRuleMappingSet2045);
            iv_ruleMappingSet=ruleMappingSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingSet2055); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:894:1: ruleMappingSet returns [EObject current=null] : ( () otherlv_1= 'Mapping' otherlv_2= '{' ( (lv_diagram_Elements_3_0= ruleDiagramChildren ) )* otherlv_4= '}' ) ;
    public final EObject ruleMappingSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_diagram_Elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:897:28: ( ( () otherlv_1= 'Mapping' otherlv_2= '{' ( (lv_diagram_Elements_3_0= ruleDiagramChildren ) )* otherlv_4= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:898:1: ( () otherlv_1= 'Mapping' otherlv_2= '{' ( (lv_diagram_Elements_3_0= ruleDiagramChildren ) )* otherlv_4= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:898:1: ( () otherlv_1= 'Mapping' otherlv_2= '{' ( (lv_diagram_Elements_3_0= ruleDiagramChildren ) )* otherlv_4= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:898:2: () otherlv_1= 'Mapping' otherlv_2= '{' ( (lv_diagram_Elements_3_0= ruleDiagramChildren ) )* otherlv_4= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:898:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:899:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMappingSetAccess().getMappingSetAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleMappingSet2101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMappingSetAccess().getMappingKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleMappingSet2113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMappingSetAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:912:1: ( (lv_diagram_Elements_3_0= ruleDiagramChildren ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31||LA16_0==60||LA16_0==74||LA16_0==79) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:913:1: (lv_diagram_Elements_3_0= ruleDiagramChildren )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:913:1: (lv_diagram_Elements_3_0= ruleDiagramChildren )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:914:3: lv_diagram_Elements_3_0= ruleDiagramChildren
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMappingSetAccess().getDiagram_ElementsDiagramChildrenParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDiagramChildren_in_ruleMappingSet2134);
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
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleMappingSet2147); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:942:1: entryRuleEdgeDescription returns [EObject current=null] : iv_ruleEdgeDescription= ruleEdgeDescription EOF ;
    public final EObject entryRuleEdgeDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeDescription = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:943:2: (iv_ruleEdgeDescription= ruleEdgeDescription EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:944:2: iv_ruleEdgeDescription= ruleEdgeDescription EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeDescriptionRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeDescription_in_entryRuleEdgeDescription2183);
            iv_ruleEdgeDescription=ruleEdgeDescription();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeDescription; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeDescription2193); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:951:1: ruleEdgeDescription returns [EObject current=null] : ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'BeginLabel' otherlv_5= '{' ( (lv_begin_Label_6_0= ruleLabel ) ) otherlv_7= '}' )? (otherlv_8= 'CenterLabel' otherlv_9= '{' ( (lv_center_label_10_0= ruleLabel ) ) otherlv_11= '}' )? (otherlv_12= 'EndLabel' otherlv_13= '{' ( (lv_end_label_14_0= ruleLabel ) ) otherlv_15= '}' )? ( (lv_style_16_0= ruleEdgeStyle ) )? otherlv_17= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:954:28: ( ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'BeginLabel' otherlv_5= '{' ( (lv_begin_Label_6_0= ruleLabel ) ) otherlv_7= '}' )? (otherlv_8= 'CenterLabel' otherlv_9= '{' ( (lv_center_label_10_0= ruleLabel ) ) otherlv_11= '}' )? (otherlv_12= 'EndLabel' otherlv_13= '{' ( (lv_end_label_14_0= ruleLabel ) ) otherlv_15= '}' )? ( (lv_style_16_0= ruleEdgeStyle ) )? otherlv_17= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:955:1: ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'BeginLabel' otherlv_5= '{' ( (lv_begin_Label_6_0= ruleLabel ) ) otherlv_7= '}' )? (otherlv_8= 'CenterLabel' otherlv_9= '{' ( (lv_center_label_10_0= ruleLabel ) ) otherlv_11= '}' )? (otherlv_12= 'EndLabel' otherlv_13= '{' ( (lv_end_label_14_0= ruleLabel ) ) otherlv_15= '}' )? ( (lv_style_16_0= ruleEdgeStyle ) )? otherlv_17= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:955:1: ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'BeginLabel' otherlv_5= '{' ( (lv_begin_Label_6_0= ruleLabel ) ) otherlv_7= '}' )? (otherlv_8= 'CenterLabel' otherlv_9= '{' ( (lv_center_label_10_0= ruleLabel ) ) otherlv_11= '}' )? (otherlv_12= 'EndLabel' otherlv_13= '{' ( (lv_end_label_14_0= ruleLabel ) ) otherlv_15= '}' )? ( (lv_style_16_0= ruleEdgeStyle ) )? otherlv_17= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:955:2: () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'BeginLabel' otherlv_5= '{' ( (lv_begin_Label_6_0= ruleLabel ) ) otherlv_7= '}' )? (otherlv_8= 'CenterLabel' otherlv_9= '{' ( (lv_center_label_10_0= ruleLabel ) ) otherlv_11= '}' )? (otherlv_12= 'EndLabel' otherlv_13= '{' ( (lv_end_label_14_0= ruleLabel ) ) otherlv_15= '}' )? ( (lv_style_16_0= ruleEdgeStyle ) )? otherlv_17= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:955:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:956:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEdgeDescriptionAccess().getEdgeDescriptionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleEdgeDescription2239); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEdgeDescriptionAccess().getRepresentationKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleEdgeDescription2251); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEdgeDescriptionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:969:1: ( (lv_condition_3_0= ruleCondition ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:970:1: (lv_condition_3_0= ruleCondition )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:970:1: (lv_condition_3_0= ruleCondition )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:971:3: lv_condition_3_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeDescriptionAccess().getConditionConditionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCondition_in_ruleEdgeDescription2272);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:987:3: (otherlv_4= 'BeginLabel' otherlv_5= '{' ( (lv_begin_Label_6_0= ruleLabel ) ) otherlv_7= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:987:5: otherlv_4= 'BeginLabel' otherlv_5= '{' ( (lv_begin_Label_6_0= ruleLabel ) ) otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleEdgeDescription2286); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEdgeDescriptionAccess().getBeginLabelKeyword_4_0());
                          
                    }
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEdgeDescription2298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEdgeDescriptionAccess().getLeftCurlyBracketKeyword_4_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:995:1: ( (lv_begin_Label_6_0= ruleLabel ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:996:1: (lv_begin_Label_6_0= ruleLabel )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:996:1: (lv_begin_Label_6_0= ruleLabel )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:997:3: lv_begin_Label_6_0= ruleLabel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeDescriptionAccess().getBegin_LabelLabelParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLabel_in_ruleEdgeDescription2319);
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

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleEdgeDescription2331); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEdgeDescriptionAccess().getRightCurlyBracketKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1017:3: (otherlv_8= 'CenterLabel' otherlv_9= '{' ( (lv_center_label_10_0= ruleLabel ) ) otherlv_11= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1017:5: otherlv_8= 'CenterLabel' otherlv_9= '{' ( (lv_center_label_10_0= ruleLabel ) ) otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleEdgeDescription2346); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEdgeDescriptionAccess().getCenterLabelKeyword_5_0());
                          
                    }
                    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleEdgeDescription2358); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getEdgeDescriptionAccess().getLeftCurlyBracketKeyword_5_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1025:1: ( (lv_center_label_10_0= ruleLabel ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1026:1: (lv_center_label_10_0= ruleLabel )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1026:1: (lv_center_label_10_0= ruleLabel )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1027:3: lv_center_label_10_0= ruleLabel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeDescriptionAccess().getCenter_labelLabelParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLabel_in_ruleEdgeDescription2379);
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

                    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleEdgeDescription2391); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getEdgeDescriptionAccess().getRightCurlyBracketKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1047:3: (otherlv_12= 'EndLabel' otherlv_13= '{' ( (lv_end_label_14_0= ruleLabel ) ) otherlv_15= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1047:5: otherlv_12= 'EndLabel' otherlv_13= '{' ( (lv_end_label_14_0= ruleLabel ) ) otherlv_15= '}'
                    {
                    otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleEdgeDescription2406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getEdgeDescriptionAccess().getEndLabelKeyword_6_0());
                          
                    }
                    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleEdgeDescription2418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getEdgeDescriptionAccess().getLeftCurlyBracketKeyword_6_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1055:1: ( (lv_end_label_14_0= ruleLabel ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1056:1: (lv_end_label_14_0= ruleLabel )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1056:1: (lv_end_label_14_0= ruleLabel )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1057:3: lv_end_label_14_0= ruleLabel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeDescriptionAccess().getEnd_labelLabelParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLabel_in_ruleEdgeDescription2439);
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

                    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleEdgeDescription2451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getEdgeDescriptionAccess().getRightCurlyBracketKeyword_6_3());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1077:3: ( (lv_style_16_0= ruleEdgeStyle ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1078:1: (lv_style_16_0= ruleEdgeStyle )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1078:1: (lv_style_16_0= ruleEdgeStyle )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1079:3: lv_style_16_0= ruleEdgeStyle
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeDescriptionAccess().getStyleEdgeStyleParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEdgeStyle_in_ruleEdgeDescription2474);
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

            otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleEdgeDescription2487); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1107:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1108:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1109:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition2523);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition2533); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1116:1: ruleCondition returns [EObject current=null] : ( () otherlv_1= 'condition:' ( (lv_expression_2_0= ruleForeignExpressionElement ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1119:28: ( ( () otherlv_1= 'condition:' ( (lv_expression_2_0= ruleForeignExpressionElement ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1120:1: ( () otherlv_1= 'condition:' ( (lv_expression_2_0= ruleForeignExpressionElement ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1120:1: ( () otherlv_1= 'condition:' ( (lv_expression_2_0= ruleForeignExpressionElement ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1120:2: () otherlv_1= 'condition:' ( (lv_expression_2_0= ruleForeignExpressionElement ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1120:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1121:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConditionAccess().getConditionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleCondition2579); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getConditionKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1130:1: ( (lv_expression_2_0= ruleForeignExpressionElement ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1131:1: (lv_expression_2_0= ruleForeignExpressionElement )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1131:1: (lv_expression_2_0= ruleForeignExpressionElement )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1132:3: lv_expression_2_0= ruleForeignExpressionElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionAccess().getExpressionForeignExpressionElementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForeignExpressionElement_in_ruleCondition2600);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1156:1: entryRuleEdgeStyle returns [EObject current=null] : iv_ruleEdgeStyle= ruleEdgeStyle EOF ;
    public final EObject entryRuleEdgeStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeStyle = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1157:2: (iv_ruleEdgeStyle= ruleEdgeStyle EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1158:2: iv_ruleEdgeStyle= ruleEdgeStyle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeStyleRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeStyle_in_entryRuleEdgeStyle2636);
            iv_ruleEdgeStyle=ruleEdgeStyle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeStyle; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeStyle2646); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1165:1: ruleEdgeStyle returns [EObject current=null] : ( () otherlv_1= 'Style' otherlv_2= '{' (otherlv_3= 'line-style:' ( (lv_lineStyle_4_0= ruleLineStyle ) ) )? (otherlv_5= 'begin-decorator:' ( (lv_beginDecorator_6_0= ruleEdgeArrows ) ) )? (otherlv_7= 'end-decorator:' ( (lv_endDecorator_8_0= ruleEdgeArrows ) ) )? (otherlv_9= 'color:' ( (lv_color_10_0= ruleSystemColors ) ) )? otherlv_11= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1168:28: ( ( () otherlv_1= 'Style' otherlv_2= '{' (otherlv_3= 'line-style:' ( (lv_lineStyle_4_0= ruleLineStyle ) ) )? (otherlv_5= 'begin-decorator:' ( (lv_beginDecorator_6_0= ruleEdgeArrows ) ) )? (otherlv_7= 'end-decorator:' ( (lv_endDecorator_8_0= ruleEdgeArrows ) ) )? (otherlv_9= 'color:' ( (lv_color_10_0= ruleSystemColors ) ) )? otherlv_11= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1169:1: ( () otherlv_1= 'Style' otherlv_2= '{' (otherlv_3= 'line-style:' ( (lv_lineStyle_4_0= ruleLineStyle ) ) )? (otherlv_5= 'begin-decorator:' ( (lv_beginDecorator_6_0= ruleEdgeArrows ) ) )? (otherlv_7= 'end-decorator:' ( (lv_endDecorator_8_0= ruleEdgeArrows ) ) )? (otherlv_9= 'color:' ( (lv_color_10_0= ruleSystemColors ) ) )? otherlv_11= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1169:1: ( () otherlv_1= 'Style' otherlv_2= '{' (otherlv_3= 'line-style:' ( (lv_lineStyle_4_0= ruleLineStyle ) ) )? (otherlv_5= 'begin-decorator:' ( (lv_beginDecorator_6_0= ruleEdgeArrows ) ) )? (otherlv_7= 'end-decorator:' ( (lv_endDecorator_8_0= ruleEdgeArrows ) ) )? (otherlv_9= 'color:' ( (lv_color_10_0= ruleSystemColors ) ) )? otherlv_11= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1169:2: () otherlv_1= 'Style' otherlv_2= '{' (otherlv_3= 'line-style:' ( (lv_lineStyle_4_0= ruleLineStyle ) ) )? (otherlv_5= 'begin-decorator:' ( (lv_beginDecorator_6_0= ruleEdgeArrows ) ) )? (otherlv_7= 'end-decorator:' ( (lv_endDecorator_8_0= ruleEdgeArrows ) ) )? (otherlv_9= 'color:' ( (lv_color_10_0= ruleSystemColors ) ) )? otherlv_11= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1169:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1170:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEdgeStyleAccess().getEdgeStyleAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleEdgeStyle2692); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEdgeStyleAccess().getStyleKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleEdgeStyle2704); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEdgeStyleAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1183:1: (otherlv_3= 'line-style:' ( (lv_lineStyle_4_0= ruleLineStyle ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1183:3: otherlv_3= 'line-style:' ( (lv_lineStyle_4_0= ruleLineStyle ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleEdgeStyle2717); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEdgeStyleAccess().getLineStyleKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1187:1: ( (lv_lineStyle_4_0= ruleLineStyle ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1188:1: (lv_lineStyle_4_0= ruleLineStyle )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1188:1: (lv_lineStyle_4_0= ruleLineStyle )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1189:3: lv_lineStyle_4_0= ruleLineStyle
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getLineStyleLineStyleEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLineStyle_in_ruleEdgeStyle2738);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1205:4: (otherlv_5= 'begin-decorator:' ( (lv_beginDecorator_6_0= ruleEdgeArrows ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1205:6: otherlv_5= 'begin-decorator:' ( (lv_beginDecorator_6_0= ruleEdgeArrows ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleEdgeStyle2753); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEdgeStyleAccess().getBeginDecoratorKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1209:1: ( (lv_beginDecorator_6_0= ruleEdgeArrows ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1210:1: (lv_beginDecorator_6_0= ruleEdgeArrows )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1210:1: (lv_beginDecorator_6_0= ruleEdgeArrows )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1211:3: lv_beginDecorator_6_0= ruleEdgeArrows
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getBeginDecoratorEdgeArrowsEnumRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEdgeArrows_in_ruleEdgeStyle2774);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1227:4: (otherlv_7= 'end-decorator:' ( (lv_endDecorator_8_0= ruleEdgeArrows ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1227:6: otherlv_7= 'end-decorator:' ( (lv_endDecorator_8_0= ruleEdgeArrows ) )
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleEdgeStyle2789); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEdgeStyleAccess().getEndDecoratorKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1231:1: ( (lv_endDecorator_8_0= ruleEdgeArrows ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1232:1: (lv_endDecorator_8_0= ruleEdgeArrows )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1232:1: (lv_endDecorator_8_0= ruleEdgeArrows )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1233:3: lv_endDecorator_8_0= ruleEdgeArrows
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getEndDecoratorEdgeArrowsEnumRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEdgeArrows_in_ruleEdgeStyle2810);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1249:4: (otherlv_9= 'color:' ( (lv_color_10_0= ruleSystemColors ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1249:6: otherlv_9= 'color:' ( (lv_color_10_0= ruleSystemColors ) )
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_30_in_ruleEdgeStyle2825); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getEdgeStyleAccess().getColorKeyword_6_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1253:1: ( (lv_color_10_0= ruleSystemColors ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1254:1: (lv_color_10_0= ruleSystemColors )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1254:1: (lv_color_10_0= ruleSystemColors )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1255:3: lv_color_10_0= ruleSystemColors
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getColorSystemColorsEnumRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSystemColors_in_ruleEdgeStyle2846);
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

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleEdgeStyle2860); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1283:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1284:2: (iv_ruleContainer= ruleContainer EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1285:2: iv_ruleContainer= ruleContainer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerRule()); 
            }
            pushFollow(FOLLOW_ruleContainer_in_entryRuleContainer2896);
            iv_ruleContainer=ruleContainer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainer2906); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1292:1: ruleContainer returns [EObject current=null] : ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? (otherlv_8= 'content-layout:' ( (lv_contentLayout_9_0= ruleContainerLayout ) ) )? ( (lv_style_10_0= ruleContainerDescription ) )* ( (lv_children_11_0= ruleContainerChildren ) )? otherlv_12= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1295:28: ( ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? (otherlv_8= 'content-layout:' ( (lv_contentLayout_9_0= ruleContainerLayout ) ) )? ( (lv_style_10_0= ruleContainerDescription ) )* ( (lv_children_11_0= ruleContainerChildren ) )? otherlv_12= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1296:1: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? (otherlv_8= 'content-layout:' ( (lv_contentLayout_9_0= ruleContainerLayout ) ) )? ( (lv_style_10_0= ruleContainerDescription ) )* ( (lv_children_11_0= ruleContainerChildren ) )? otherlv_12= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1296:1: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? (otherlv_8= 'content-layout:' ( (lv_contentLayout_9_0= ruleContainerLayout ) ) )? ( (lv_style_10_0= ruleContainerDescription ) )* ( (lv_children_11_0= ruleContainerChildren ) )? otherlv_12= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1296:2: () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? (otherlv_8= 'content-layout:' ( (lv_contentLayout_9_0= ruleContainerLayout ) ) )? ( (lv_style_10_0= ruleContainerDescription ) )* ( (lv_children_11_0= ruleContainerChildren ) )? otherlv_12= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1296:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1297:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getContainerAccess().getContainerAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleContainer2952); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1306:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1307:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1307:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1308:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleContainer2973);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleContainer2985); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1328:1: (otherlv_4= 'import:' ( ( ruleFQN ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1328:3: otherlv_4= 'import:' ( ( ruleFQN ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleContainer2998); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getImportKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1332:1: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1333:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1333:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1334:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getContainerRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerAccess().getImportsContainerMappingCrossReference_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleContainer3021);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1347:4: (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1347:6: otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) )
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleContainer3036); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getDomainContextKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1351:1: ( (lv_the_domain_7_0= ruleNodeDomainElement ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1352:1: (lv_the_domain_7_0= ruleNodeDomainElement )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1352:1: (lv_the_domain_7_0= ruleNodeDomainElement )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1353:3: lv_the_domain_7_0= ruleNodeDomainElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerAccess().getThe_domainNodeDomainElementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNodeDomainElement_in_ruleContainer3057);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1369:4: (otherlv_8= 'content-layout:' ( (lv_contentLayout_9_0= ruleContainerLayout ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1369:6: otherlv_8= 'content-layout:' ( (lv_contentLayout_9_0= ruleContainerLayout ) )
                    {
                    otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleContainer3072); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getContainerAccess().getContentLayoutKeyword_6_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1373:1: ( (lv_contentLayout_9_0= ruleContainerLayout ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1374:1: (lv_contentLayout_9_0= ruleContainerLayout )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1374:1: (lv_contentLayout_9_0= ruleContainerLayout )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1375:3: lv_contentLayout_9_0= ruleContainerLayout
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerAccess().getContentLayoutContainerLayoutEnumRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleContainerLayout_in_ruleContainer3093);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1391:4: ( (lv_style_10_0= ruleContainerDescription ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==21) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1392:1: (lv_style_10_0= ruleContainerDescription )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1392:1: (lv_style_10_0= ruleContainerDescription )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1393:3: lv_style_10_0= ruleContainerDescription
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContainerAccess().getStyleContainerDescriptionParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleContainerDescription_in_ruleContainer3116);
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
            	    break loop29;
                }
            } while (true);

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1409:3: ( (lv_children_11_0= ruleContainerChildren ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==35) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1410:1: (lv_children_11_0= ruleContainerChildren )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1410:1: (lv_children_11_0= ruleContainerChildren )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1411:3: lv_children_11_0= ruleContainerChildren
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerAccess().getChildrenContainerChildrenParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleContainerChildren_in_ruleContainer3138);
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

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleContainer3151); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1439:1: entryRuleContainerChildren returns [EObject current=null] : iv_ruleContainerChildren= ruleContainerChildren EOF ;
    public final EObject entryRuleContainerChildren() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerChildren = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1440:2: (iv_ruleContainerChildren= ruleContainerChildren EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1441:2: iv_ruleContainerChildren= ruleContainerChildren EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerChildrenRule()); 
            }
            pushFollow(FOLLOW_ruleContainerChildren_in_entryRuleContainerChildren3187);
            iv_ruleContainerChildren=ruleContainerChildren();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerChildren; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerChildren3197); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1448:1: ruleContainerChildren returns [EObject current=null] : ( () otherlv_1= 'Contains' otherlv_2= '{' (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ( (lv_owned_nodes_7_0= ruleAbstractNode ) )* otherlv_8= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1451:28: ( ( () otherlv_1= 'Contains' otherlv_2= '{' (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ( (lv_owned_nodes_7_0= ruleAbstractNode ) )* otherlv_8= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1452:1: ( () otherlv_1= 'Contains' otherlv_2= '{' (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ( (lv_owned_nodes_7_0= ruleAbstractNode ) )* otherlv_8= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1452:1: ( () otherlv_1= 'Contains' otherlv_2= '{' (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ( (lv_owned_nodes_7_0= ruleAbstractNode ) )* otherlv_8= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1452:2: () otherlv_1= 'Contains' otherlv_2= '{' (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ( (lv_owned_nodes_7_0= ruleAbstractNode ) )* otherlv_8= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1452:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1453:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getContainerChildrenAccess().getContainerChildrenAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleContainerChildren3243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getContainerChildrenAccess().getContainsKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleContainerChildren3255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getContainerChildrenAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1466:1: (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1466:3: otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleContainerChildren3268); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getContainerChildrenAccess().getReuseKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1470:1: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1471:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1471:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1472:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getContainerChildrenRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerChildrenAccess().getReused_nodesAbstractNodeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleContainerChildren3291);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1485:2: (otherlv_5= ',' ( ( ruleFQN ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==37) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1485:4: otherlv_5= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleContainerChildren3304); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getContainerChildrenAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1489:1: ( ( ruleFQN ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1490:1: ( ruleFQN )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1490:1: ( ruleFQN )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1491:3: ruleFQN
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getContainerChildrenRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getContainerChildrenAccess().getReused_nodesAbstractNodeCrossReference_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFQN_in_ruleContainerChildren3327);
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
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1504:6: ( (lv_owned_nodes_7_0= ruleAbstractNode ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==31||(LA33_0>=60 && LA33_0<=61)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1505:1: (lv_owned_nodes_7_0= ruleAbstractNode )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1505:1: (lv_owned_nodes_7_0= ruleAbstractNode )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1506:3: lv_owned_nodes_7_0= ruleAbstractNode
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContainerChildrenAccess().getOwned_nodesAbstractNodeParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractNode_in_ruleContainerChildren3352);
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
            	    break loop33;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleContainerChildren3365); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1534:1: entryRuleNodeDomainElement returns [EObject current=null] : iv_ruleNodeDomainElement= ruleNodeDomainElement EOF ;
    public final EObject entryRuleNodeDomainElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeDomainElement = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1535:2: (iv_ruleNodeDomainElement= ruleNodeDomainElement EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1536:2: iv_ruleNodeDomainElement= ruleNodeDomainElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeDomainElementRule()); 
            }
            pushFollow(FOLLOW_ruleNodeDomainElement_in_entryRuleNodeDomainElement3401);
            iv_ruleNodeDomainElement=ruleNodeDomainElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeDomainElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeDomainElement3411); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1543:1: ruleNodeDomainElement returns [EObject current=null] : ( () ( (lv_domain_Class_1_0= ruleAbstractClass ) ) (otherlv_2= 'provided-by' ( (otherlv_3= 'query' ( (lv_query_4_0= RULE_STRING ) ) ) | (otherlv_5= 'association' ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) ) ) ) )? ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1546:28: ( ( () ( (lv_domain_Class_1_0= ruleAbstractClass ) ) (otherlv_2= 'provided-by' ( (otherlv_3= 'query' ( (lv_query_4_0= RULE_STRING ) ) ) | (otherlv_5= 'association' ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) ) ) ) )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1547:1: ( () ( (lv_domain_Class_1_0= ruleAbstractClass ) ) (otherlv_2= 'provided-by' ( (otherlv_3= 'query' ( (lv_query_4_0= RULE_STRING ) ) ) | (otherlv_5= 'association' ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) ) ) ) )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1547:1: ( () ( (lv_domain_Class_1_0= ruleAbstractClass ) ) (otherlv_2= 'provided-by' ( (otherlv_3= 'query' ( (lv_query_4_0= RULE_STRING ) ) ) | (otherlv_5= 'association' ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) ) ) ) )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1547:2: () ( (lv_domain_Class_1_0= ruleAbstractClass ) ) (otherlv_2= 'provided-by' ( (otherlv_3= 'query' ( (lv_query_4_0= RULE_STRING ) ) ) | (otherlv_5= 'association' ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) ) ) ) )?
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1547:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1548:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNodeDomainElementAccess().getNodeDomainElementAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1553:2: ( (lv_domain_Class_1_0= ruleAbstractClass ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1554:1: (lv_domain_Class_1_0= ruleAbstractClass )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1554:1: (lv_domain_Class_1_0= ruleAbstractClass )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1555:3: lv_domain_Class_1_0= ruleAbstractClass
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNodeDomainElementAccess().getDomain_ClassAbstractClassParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbstractClass_in_ruleNodeDomainElement3466);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1571:2: (otherlv_2= 'provided-by' ( (otherlv_3= 'query' ( (lv_query_4_0= RULE_STRING ) ) ) | (otherlv_5= 'association' ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) ) ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==38) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1571:4: otherlv_2= 'provided-by' ( (otherlv_3= 'query' ( (lv_query_4_0= RULE_STRING ) ) ) | (otherlv_5= 'association' ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) ) ) )
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleNodeDomainElement3479); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNodeDomainElementAccess().getProvidedByKeyword_2_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1575:1: ( (otherlv_3= 'query' ( (lv_query_4_0= RULE_STRING ) ) ) | (otherlv_5= 'association' ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) ) ) )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==39) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==40) ) {
                        alt34=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1575:2: (otherlv_3= 'query' ( (lv_query_4_0= RULE_STRING ) ) )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1575:2: (otherlv_3= 'query' ( (lv_query_4_0= RULE_STRING ) ) )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1575:4: otherlv_3= 'query' ( (lv_query_4_0= RULE_STRING ) )
                            {
                            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleNodeDomainElement3493); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getNodeDomainElementAccess().getQueryKeyword_2_1_0_0());
                                  
                            }
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1579:1: ( (lv_query_4_0= RULE_STRING ) )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1580:1: (lv_query_4_0= RULE_STRING )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1580:1: (lv_query_4_0= RULE_STRING )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1581:3: lv_query_4_0= RULE_STRING
                            {
                            lv_query_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNodeDomainElement3510); if (state.failed) return current;
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
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1598:6: (otherlv_5= 'association' ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) ) )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1598:6: (otherlv_5= 'association' ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) ) )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1598:8: otherlv_5= 'association' ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) )
                            {
                            otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleNodeDomainElement3535); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getNodeDomainElementAccess().getAssociationKeyword_2_1_1_0());
                                  
                            }
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1602:1: ( (lv_chlidren_list_6_0= ruleAbstractAssociation2 ) )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1603:1: (lv_chlidren_list_6_0= ruleAbstractAssociation2 )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1603:1: (lv_chlidren_list_6_0= ruleAbstractAssociation2 )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1604:3: lv_chlidren_list_6_0= ruleAbstractAssociation2
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNodeDomainElementAccess().getChlidren_listAbstractAssociation2ParserRuleCall_2_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleAbstractAssociation2_in_ruleNodeDomainElement3556);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1628:1: entryRuleContainerDescription returns [EObject current=null] : iv_ruleContainerDescription= ruleContainerDescription EOF ;
    public final EObject entryRuleContainerDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerDescription = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1629:2: (iv_ruleContainerDescription= ruleContainerDescription EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1630:2: iv_ruleContainerDescription= ruleContainerDescription EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerDescriptionRule()); 
            }
            pushFollow(FOLLOW_ruleContainerDescription_in_entryRuleContainerDescription3596);
            iv_ruleContainerDescription=ruleContainerDescription();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerDescription; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerDescription3606); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1637:1: ruleContainerDescription returns [EObject current=null] : ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) otherlv_7= '}' )? (otherlv_8= 'Style' ( ( '{' )=>otherlv_9= '{' ) ( (lv_style_10_0= ruleAbstractContainerStyle ) ) otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1640:28: ( ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) otherlv_7= '}' )? (otherlv_8= 'Style' ( ( '{' )=>otherlv_9= '{' ) ( (lv_style_10_0= ruleAbstractContainerStyle ) ) otherlv_11= '}' )? otherlv_12= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1641:1: ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) otherlv_7= '}' )? (otherlv_8= 'Style' ( ( '{' )=>otherlv_9= '{' ) ( (lv_style_10_0= ruleAbstractContainerStyle ) ) otherlv_11= '}' )? otherlv_12= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1641:1: ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) otherlv_7= '}' )? (otherlv_8= 'Style' ( ( '{' )=>otherlv_9= '{' ) ( (lv_style_10_0= ruleAbstractContainerStyle ) ) otherlv_11= '}' )? otherlv_12= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1641:2: () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) otherlv_7= '}' )? (otherlv_8= 'Style' ( ( '{' )=>otherlv_9= '{' ) ( (lv_style_10_0= ruleAbstractContainerStyle ) ) otherlv_11= '}' )? otherlv_12= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1641:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1642:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getContainerDescriptionAccess().getContainerDescriptionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleContainerDescription3652); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getContainerDescriptionAccess().getRepresentationKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleContainerDescription3664); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getContainerDescriptionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1655:1: ( (lv_condition_3_0= ruleCondition ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==25) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1656:1: (lv_condition_3_0= ruleCondition )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1656:1: (lv_condition_3_0= ruleCondition )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1657:3: lv_condition_3_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerDescriptionAccess().getConditionConditionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCondition_in_ruleContainerDescription3685);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1673:3: (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) otherlv_7= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==41) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1673:5: otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleContainerDescription3699); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getContainerDescriptionAccess().getLabelKeyword_4_0());
                          
                    }
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleContainerDescription3711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getContainerDescriptionAccess().getLeftCurlyBracketKeyword_4_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1681:1: ( (lv_node_Label_6_0= ruleLabel ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1682:1: (lv_node_Label_6_0= ruleLabel )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1682:1: (lv_node_Label_6_0= ruleLabel )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1683:3: lv_node_Label_6_0= ruleLabel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerDescriptionAccess().getNode_LabelLabelParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLabel_in_ruleContainerDescription3732);
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

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleContainerDescription3744); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getContainerDescriptionAccess().getRightCurlyBracketKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1703:3: (otherlv_8= 'Style' ( ( '{' )=>otherlv_9= '{' ) ( (lv_style_10_0= ruleAbstractContainerStyle ) ) otherlv_11= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==26) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1703:5: otherlv_8= 'Style' ( ( '{' )=>otherlv_9= '{' ) ( (lv_style_10_0= ruleAbstractContainerStyle ) ) otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleContainerDescription3759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getContainerDescriptionAccess().getStyleKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1707:1: ( ( '{' )=>otherlv_9= '{' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1707:2: ( '{' )=>otherlv_9= '{'
                    {
                    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleContainerDescription3779); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getContainerDescriptionAccess().getLeftCurlyBracketKeyword_5_1());
                          
                    }

                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1712:2: ( (lv_style_10_0= ruleAbstractContainerStyle ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1713:1: (lv_style_10_0= ruleAbstractContainerStyle )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1713:1: (lv_style_10_0= ruleAbstractContainerStyle )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1714:3: lv_style_10_0= ruleAbstractContainerStyle
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerDescriptionAccess().getStyleAbstractContainerStyleParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAbstractContainerStyle_in_ruleContainerDescription3801);
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

                    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleContainerDescription3813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getContainerDescriptionAccess().getRightCurlyBracketKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleContainerDescription3827); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1746:1: entryRuleBasicStyle returns [EObject current=null] : iv_ruleBasicStyle= ruleBasicStyle EOF ;
    public final EObject entryRuleBasicStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicStyle = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1747:2: (iv_ruleBasicStyle= ruleBasicStyle EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1748:2: iv_ruleBasicStyle= ruleBasicStyle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicStyleRule()); 
            }
            pushFollow(FOLLOW_ruleBasicStyle_in_entryRuleBasicStyle3863);
            iv_ruleBasicStyle=ruleBasicStyle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicStyle; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicStyle3873); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1755:1: ruleBasicStyle returns [EObject current=null] : ( () otherlv_1= 'BasicStyle' otherlv_2= '{' (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'background:' ( (lv_backgroundColor_6_0= ruleSystemColors ) ) )? (otherlv_7= 'form:' ( (lv_form_8_0= ruleNode_Form ) ) )? otherlv_9= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1758:28: ( ( () otherlv_1= 'BasicStyle' otherlv_2= '{' (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'background:' ( (lv_backgroundColor_6_0= ruleSystemColors ) ) )? (otherlv_7= 'form:' ( (lv_form_8_0= ruleNode_Form ) ) )? otherlv_9= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1759:1: ( () otherlv_1= 'BasicStyle' otherlv_2= '{' (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'background:' ( (lv_backgroundColor_6_0= ruleSystemColors ) ) )? (otherlv_7= 'form:' ( (lv_form_8_0= ruleNode_Form ) ) )? otherlv_9= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1759:1: ( () otherlv_1= 'BasicStyle' otherlv_2= '{' (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'background:' ( (lv_backgroundColor_6_0= ruleSystemColors ) ) )? (otherlv_7= 'form:' ( (lv_form_8_0= ruleNode_Form ) ) )? otherlv_9= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1759:2: () otherlv_1= 'BasicStyle' otherlv_2= '{' (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'background:' ( (lv_backgroundColor_6_0= ruleSystemColors ) ) )? (otherlv_7= 'form:' ( (lv_form_8_0= ruleNode_Form ) ) )? otherlv_9= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1759:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1760:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBasicStyleAccess().getBasicStyleAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleBasicStyle3919); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBasicStyleAccess().getBasicStyleKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleBasicStyle3931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBasicStyleAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1773:1: (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==43) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1773:3: otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) )
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleBasicStyle3944); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBasicStyleAccess().getBorderColorKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1777:1: ( (lv_borderColor_4_0= ruleSystemColors ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1778:1: (lv_borderColor_4_0= ruleSystemColors )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1778:1: (lv_borderColor_4_0= ruleSystemColors )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1779:3: lv_borderColor_4_0= ruleSystemColors
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBasicStyleAccess().getBorderColorSystemColorsEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSystemColors_in_ruleBasicStyle3965);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1795:4: (otherlv_5= 'background:' ( (lv_backgroundColor_6_0= ruleSystemColors ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==44) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1795:6: otherlv_5= 'background:' ( (lv_backgroundColor_6_0= ruleSystemColors ) )
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleBasicStyle3980); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getBasicStyleAccess().getBackgroundKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1799:1: ( (lv_backgroundColor_6_0= ruleSystemColors ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1800:1: (lv_backgroundColor_6_0= ruleSystemColors )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1800:1: (lv_backgroundColor_6_0= ruleSystemColors )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1801:3: lv_backgroundColor_6_0= ruleSystemColors
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBasicStyleAccess().getBackgroundColorSystemColorsEnumRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSystemColors_in_ruleBasicStyle4001);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1817:4: (otherlv_7= 'form:' ( (lv_form_8_0= ruleNode_Form ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==45) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1817:6: otherlv_7= 'form:' ( (lv_form_8_0= ruleNode_Form ) )
                    {
                    otherlv_7=(Token)match(input,45,FOLLOW_45_in_ruleBasicStyle4016); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getBasicStyleAccess().getFormKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1821:1: ( (lv_form_8_0= ruleNode_Form ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1822:1: (lv_form_8_0= ruleNode_Form )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1822:1: (lv_form_8_0= ruleNode_Form )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1823:3: lv_form_8_0= ruleNode_Form
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBasicStyleAccess().getFormNode_FormEnumRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNode_Form_in_ruleBasicStyle4037);
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

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleBasicStyle4051); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1851:1: entryRuleHistogramStyle returns [EObject current=null] : iv_ruleHistogramStyle= ruleHistogramStyle EOF ;
    public final EObject entryRuleHistogramStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHistogramStyle = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1852:2: (iv_ruleHistogramStyle= ruleHistogramStyle EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1853:2: iv_ruleHistogramStyle= ruleHistogramStyle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHistogramStyleRule()); 
            }
            pushFollow(FOLLOW_ruleHistogramStyle_in_entryRuleHistogramStyle4087);
            iv_ruleHistogramStyle=ruleHistogramStyle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHistogramStyle; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHistogramStyle4097); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1860:1: ruleHistogramStyle returns [EObject current=null] : ( () otherlv_1= 'HistogramStyle' otherlv_2= '{' (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? ( (lv_sections_5_0= ruleHistogramSection ) )* otherlv_6= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1863:28: ( ( () otherlv_1= 'HistogramStyle' otherlv_2= '{' (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? ( (lv_sections_5_0= ruleHistogramSection ) )* otherlv_6= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1864:1: ( () otherlv_1= 'HistogramStyle' otherlv_2= '{' (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? ( (lv_sections_5_0= ruleHistogramSection ) )* otherlv_6= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1864:1: ( () otherlv_1= 'HistogramStyle' otherlv_2= '{' (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? ( (lv_sections_5_0= ruleHistogramSection ) )* otherlv_6= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1864:2: () otherlv_1= 'HistogramStyle' otherlv_2= '{' (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? ( (lv_sections_5_0= ruleHistogramSection ) )* otherlv_6= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1864:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1865:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHistogramStyleAccess().getHistogramStyleAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleHistogramStyle4143); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getHistogramStyleAccess().getHistogramStyleKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleHistogramStyle4155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getHistogramStyleAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1878:1: (otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==43) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1878:3: otherlv_3= 'border-color:' ( (lv_borderColor_4_0= ruleSystemColors ) )
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleHistogramStyle4168); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getHistogramStyleAccess().getBorderColorKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1882:1: ( (lv_borderColor_4_0= ruleSystemColors ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1883:1: (lv_borderColor_4_0= ruleSystemColors )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1883:1: (lv_borderColor_4_0= ruleSystemColors )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1884:3: lv_borderColor_4_0= ruleSystemColors
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHistogramStyleAccess().getBorderColorSystemColorsEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSystemColors_in_ruleHistogramStyle4189);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1900:4: ( (lv_sections_5_0= ruleHistogramSection ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==47) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1901:1: (lv_sections_5_0= ruleHistogramSection )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1901:1: (lv_sections_5_0= ruleHistogramSection )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1902:3: lv_sections_5_0= ruleHistogramSection
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHistogramStyleAccess().getSectionsHistogramSectionParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleHistogramSection_in_ruleHistogramStyle4212);
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
            	    break loop43;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleHistogramStyle4225); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1930:1: entryRuleHistogramSection returns [EObject current=null] : iv_ruleHistogramSection= ruleHistogramSection EOF ;
    public final EObject entryRuleHistogramSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHistogramSection = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1931:2: (iv_ruleHistogramSection= ruleHistogramSection EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1932:2: iv_ruleHistogramSection= ruleHistogramSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHistogramSectionRule()); 
            }
            pushFollow(FOLLOW_ruleHistogramSection_in_entryRuleHistogramSection4261);
            iv_ruleHistogramSection=ruleHistogramSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHistogramSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHistogramSection4271); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1939:1: ruleHistogramSection returns [EObject current=null] : ( () otherlv_1= 'Section' otherlv_2= '{' (otherlv_3= 'background:' ( (lv_backgroundColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'foreground:' ( (lv_forgroundColor_6_0= ruleSystemColors ) ) )? (otherlv_7= 'minValue:' ( (lv_minValue_8_0= ruleForeignExpressionElement ) ) )? (otherlv_9= 'value:' ( (lv_value_10_0= ruleForeignExpressionElement ) ) )? (otherlv_11= 'maxValue:' ( (lv_maxValue_12_0= ruleForeignExpressionElement ) ) )? otherlv_13= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1942:28: ( ( () otherlv_1= 'Section' otherlv_2= '{' (otherlv_3= 'background:' ( (lv_backgroundColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'foreground:' ( (lv_forgroundColor_6_0= ruleSystemColors ) ) )? (otherlv_7= 'minValue:' ( (lv_minValue_8_0= ruleForeignExpressionElement ) ) )? (otherlv_9= 'value:' ( (lv_value_10_0= ruleForeignExpressionElement ) ) )? (otherlv_11= 'maxValue:' ( (lv_maxValue_12_0= ruleForeignExpressionElement ) ) )? otherlv_13= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1943:1: ( () otherlv_1= 'Section' otherlv_2= '{' (otherlv_3= 'background:' ( (lv_backgroundColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'foreground:' ( (lv_forgroundColor_6_0= ruleSystemColors ) ) )? (otherlv_7= 'minValue:' ( (lv_minValue_8_0= ruleForeignExpressionElement ) ) )? (otherlv_9= 'value:' ( (lv_value_10_0= ruleForeignExpressionElement ) ) )? (otherlv_11= 'maxValue:' ( (lv_maxValue_12_0= ruleForeignExpressionElement ) ) )? otherlv_13= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1943:1: ( () otherlv_1= 'Section' otherlv_2= '{' (otherlv_3= 'background:' ( (lv_backgroundColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'foreground:' ( (lv_forgroundColor_6_0= ruleSystemColors ) ) )? (otherlv_7= 'minValue:' ( (lv_minValue_8_0= ruleForeignExpressionElement ) ) )? (otherlv_9= 'value:' ( (lv_value_10_0= ruleForeignExpressionElement ) ) )? (otherlv_11= 'maxValue:' ( (lv_maxValue_12_0= ruleForeignExpressionElement ) ) )? otherlv_13= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1943:2: () otherlv_1= 'Section' otherlv_2= '{' (otherlv_3= 'background:' ( (lv_backgroundColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'foreground:' ( (lv_forgroundColor_6_0= ruleSystemColors ) ) )? (otherlv_7= 'minValue:' ( (lv_minValue_8_0= ruleForeignExpressionElement ) ) )? (otherlv_9= 'value:' ( (lv_value_10_0= ruleForeignExpressionElement ) ) )? (otherlv_11= 'maxValue:' ( (lv_maxValue_12_0= ruleForeignExpressionElement ) ) )? otherlv_13= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1943:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1944:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHistogramSectionAccess().getHistogramSectionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleHistogramSection4317); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getHistogramSectionAccess().getSectionKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleHistogramSection4329); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getHistogramSectionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1957:1: (otherlv_3= 'background:' ( (lv_backgroundColor_4_0= ruleSystemColors ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==44) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1957:3: otherlv_3= 'background:' ( (lv_backgroundColor_4_0= ruleSystemColors ) )
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleHistogramSection4342); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getHistogramSectionAccess().getBackgroundKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1961:1: ( (lv_backgroundColor_4_0= ruleSystemColors ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1962:1: (lv_backgroundColor_4_0= ruleSystemColors )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1962:1: (lv_backgroundColor_4_0= ruleSystemColors )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1963:3: lv_backgroundColor_4_0= ruleSystemColors
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHistogramSectionAccess().getBackgroundColorSystemColorsEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSystemColors_in_ruleHistogramSection4363);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1979:4: (otherlv_5= 'foreground:' ( (lv_forgroundColor_6_0= ruleSystemColors ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==48) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1979:6: otherlv_5= 'foreground:' ( (lv_forgroundColor_6_0= ruleSystemColors ) )
                    {
                    otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleHistogramSection4378); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getHistogramSectionAccess().getForegroundKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1983:1: ( (lv_forgroundColor_6_0= ruleSystemColors ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1984:1: (lv_forgroundColor_6_0= ruleSystemColors )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1984:1: (lv_forgroundColor_6_0= ruleSystemColors )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:1985:3: lv_forgroundColor_6_0= ruleSystemColors
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHistogramSectionAccess().getForgroundColorSystemColorsEnumRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSystemColors_in_ruleHistogramSection4399);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2001:4: (otherlv_7= 'minValue:' ( (lv_minValue_8_0= ruleForeignExpressionElement ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==49) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2001:6: otherlv_7= 'minValue:' ( (lv_minValue_8_0= ruleForeignExpressionElement ) )
                    {
                    otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruleHistogramSection4414); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getHistogramSectionAccess().getMinValueKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2005:1: ( (lv_minValue_8_0= ruleForeignExpressionElement ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2006:1: (lv_minValue_8_0= ruleForeignExpressionElement )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2006:1: (lv_minValue_8_0= ruleForeignExpressionElement )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2007:3: lv_minValue_8_0= ruleForeignExpressionElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHistogramSectionAccess().getMinValueForeignExpressionElementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleForeignExpressionElement_in_ruleHistogramSection4435);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2023:4: (otherlv_9= 'value:' ( (lv_value_10_0= ruleForeignExpressionElement ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==50) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2023:6: otherlv_9= 'value:' ( (lv_value_10_0= ruleForeignExpressionElement ) )
                    {
                    otherlv_9=(Token)match(input,50,FOLLOW_50_in_ruleHistogramSection4450); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getHistogramSectionAccess().getValueKeyword_6_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2027:1: ( (lv_value_10_0= ruleForeignExpressionElement ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2028:1: (lv_value_10_0= ruleForeignExpressionElement )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2028:1: (lv_value_10_0= ruleForeignExpressionElement )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2029:3: lv_value_10_0= ruleForeignExpressionElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHistogramSectionAccess().getValueForeignExpressionElementParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleForeignExpressionElement_in_ruleHistogramSection4471);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2045:4: (otherlv_11= 'maxValue:' ( (lv_maxValue_12_0= ruleForeignExpressionElement ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==51) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2045:6: otherlv_11= 'maxValue:' ( (lv_maxValue_12_0= ruleForeignExpressionElement ) )
                    {
                    otherlv_11=(Token)match(input,51,FOLLOW_51_in_ruleHistogramSection4486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getHistogramSectionAccess().getMaxValueKeyword_7_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2049:1: ( (lv_maxValue_12_0= ruleForeignExpressionElement ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2050:1: (lv_maxValue_12_0= ruleForeignExpressionElement )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2050:1: (lv_maxValue_12_0= ruleForeignExpressionElement )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2051:3: lv_maxValue_12_0= ruleForeignExpressionElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHistogramSectionAccess().getMaxValueForeignExpressionElementParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleForeignExpressionElement_in_ruleHistogramSection4507);
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

            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleHistogramSection4521); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2079:1: entryRuleImageStyle returns [EObject current=null] : iv_ruleImageStyle= ruleImageStyle EOF ;
    public final EObject entryRuleImageStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageStyle = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2080:2: (iv_ruleImageStyle= ruleImageStyle EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2081:2: iv_ruleImageStyle= ruleImageStyle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImageStyleRule()); 
            }
            pushFollow(FOLLOW_ruleImageStyle_in_entryRuleImageStyle4557);
            iv_ruleImageStyle=ruleImageStyle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImageStyle; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageStyle4567); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2088:1: ruleImageStyle returns [EObject current=null] : ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'path:' ( (lv_imagePath_6_0= RULE_STRING ) ) ) otherlv_7= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2091:28: ( ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'path:' ( (lv_imagePath_6_0= RULE_STRING ) ) ) otherlv_7= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2092:1: ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'path:' ( (lv_imagePath_6_0= RULE_STRING ) ) ) otherlv_7= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2092:1: ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'path:' ( (lv_imagePath_6_0= RULE_STRING ) ) ) otherlv_7= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2092:2: () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'path:' ( (lv_imagePath_6_0= RULE_STRING ) ) ) otherlv_7= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2092:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2093:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getImageStyleAccess().getImageStyleAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleImageStyle4613); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getImageStyleAccess().getImageKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleImageStyle4625); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getImageStyleAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2106:1: (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==53) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2106:3: otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) )
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleImageStyle4638); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getImageStyleAccess().getBorderKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2110:1: ( (lv_borderColor_4_0= ruleSystemColors ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2111:1: (lv_borderColor_4_0= ruleSystemColors )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2111:1: (lv_borderColor_4_0= ruleSystemColors )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2112:3: lv_borderColor_4_0= ruleSystemColors
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImageStyleAccess().getBorderColorSystemColorsEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSystemColors_in_ruleImageStyle4659);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2128:4: (otherlv_5= 'path:' ( (lv_imagePath_6_0= RULE_STRING ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2128:6: otherlv_5= 'path:' ( (lv_imagePath_6_0= RULE_STRING ) )
            {
            otherlv_5=(Token)match(input,54,FOLLOW_54_in_ruleImageStyle4674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getImageStyleAccess().getPathKeyword_4_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2132:1: ( (lv_imagePath_6_0= RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2133:1: (lv_imagePath_6_0= RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2133:1: (lv_imagePath_6_0= RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2134:3: lv_imagePath_6_0= RULE_STRING
            {
            lv_imagePath_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImageStyle4691); if (state.failed) return current;
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

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleImageStyle4709); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2162:1: entryRuleFlatStyle returns [EObject current=null] : iv_ruleFlatStyle= ruleFlatStyle EOF ;
    public final EObject entryRuleFlatStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlatStyle = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2163:2: (iv_ruleFlatStyle= ruleFlatStyle EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2164:2: iv_ruleFlatStyle= ruleFlatStyle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlatStyleRule()); 
            }
            pushFollow(FOLLOW_ruleFlatStyle_in_entryRuleFlatStyle4745);
            iv_ruleFlatStyle=ruleFlatStyle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlatStyle; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlatStyle4755); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2171:1: ruleFlatStyle returns [EObject current=null] : ( () otherlv_1= 'FlatStyle' otherlv_2= '{' (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'background:' ( (lv_backgroundStyle_6_0= ruleBackgroundStyle ) )? ( (lv_backgroundColor_7_0= ruleSystemColors ) ) )? (otherlv_8= 'foreground:' ( (lv_forgroundColor_9_0= ruleSystemColors ) ) )? otherlv_10= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2174:28: ( ( () otherlv_1= 'FlatStyle' otherlv_2= '{' (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'background:' ( (lv_backgroundStyle_6_0= ruleBackgroundStyle ) )? ( (lv_backgroundColor_7_0= ruleSystemColors ) ) )? (otherlv_8= 'foreground:' ( (lv_forgroundColor_9_0= ruleSystemColors ) ) )? otherlv_10= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2175:1: ( () otherlv_1= 'FlatStyle' otherlv_2= '{' (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'background:' ( (lv_backgroundStyle_6_0= ruleBackgroundStyle ) )? ( (lv_backgroundColor_7_0= ruleSystemColors ) ) )? (otherlv_8= 'foreground:' ( (lv_forgroundColor_9_0= ruleSystemColors ) ) )? otherlv_10= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2175:1: ( () otherlv_1= 'FlatStyle' otherlv_2= '{' (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'background:' ( (lv_backgroundStyle_6_0= ruleBackgroundStyle ) )? ( (lv_backgroundColor_7_0= ruleSystemColors ) ) )? (otherlv_8= 'foreground:' ( (lv_forgroundColor_9_0= ruleSystemColors ) ) )? otherlv_10= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2175:2: () otherlv_1= 'FlatStyle' otherlv_2= '{' (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )? (otherlv_5= 'background:' ( (lv_backgroundStyle_6_0= ruleBackgroundStyle ) )? ( (lv_backgroundColor_7_0= ruleSystemColors ) ) )? (otherlv_8= 'foreground:' ( (lv_forgroundColor_9_0= ruleSystemColors ) ) )? otherlv_10= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2175:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2176:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFlatStyleAccess().getFlatStyleAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleFlatStyle4801); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFlatStyleAccess().getFlatStyleKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleFlatStyle4813); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFlatStyleAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2189:1: (otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==53) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2189:3: otherlv_3= 'border:' ( (lv_borderColor_4_0= ruleSystemColors ) )
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleFlatStyle4826); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFlatStyleAccess().getBorderKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2193:1: ( (lv_borderColor_4_0= ruleSystemColors ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2194:1: (lv_borderColor_4_0= ruleSystemColors )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2194:1: (lv_borderColor_4_0= ruleSystemColors )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2195:3: lv_borderColor_4_0= ruleSystemColors
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFlatStyleAccess().getBorderColorSystemColorsEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSystemColors_in_ruleFlatStyle4847);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2211:4: (otherlv_5= 'background:' ( (lv_backgroundStyle_6_0= ruleBackgroundStyle ) )? ( (lv_backgroundColor_7_0= ruleSystemColors ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==44) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2211:6: otherlv_5= 'background:' ( (lv_backgroundStyle_6_0= ruleBackgroundStyle ) )? ( (lv_backgroundColor_7_0= ruleSystemColors ) )
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleFlatStyle4862); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getFlatStyleAccess().getBackgroundKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2215:1: ( (lv_backgroundStyle_6_0= ruleBackgroundStyle ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( ((LA51_0>=96 && LA51_0<=98)) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2216:1: (lv_backgroundStyle_6_0= ruleBackgroundStyle )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2216:1: (lv_backgroundStyle_6_0= ruleBackgroundStyle )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2217:3: lv_backgroundStyle_6_0= ruleBackgroundStyle
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFlatStyleAccess().getBackgroundStyleBackgroundStyleEnumRuleCall_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBackgroundStyle_in_ruleFlatStyle4883);
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

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2233:3: ( (lv_backgroundColor_7_0= ruleSystemColors ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2234:1: (lv_backgroundColor_7_0= ruleSystemColors )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2234:1: (lv_backgroundColor_7_0= ruleSystemColors )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2235:3: lv_backgroundColor_7_0= ruleSystemColors
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFlatStyleAccess().getBackgroundColorSystemColorsEnumRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSystemColors_in_ruleFlatStyle4905);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2251:4: (otherlv_8= 'foreground:' ( (lv_forgroundColor_9_0= ruleSystemColors ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==48) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2251:6: otherlv_8= 'foreground:' ( (lv_forgroundColor_9_0= ruleSystemColors ) )
                    {
                    otherlv_8=(Token)match(input,48,FOLLOW_48_in_ruleFlatStyle4920); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getFlatStyleAccess().getForegroundKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2255:1: ( (lv_forgroundColor_9_0= ruleSystemColors ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2256:1: (lv_forgroundColor_9_0= ruleSystemColors )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2256:1: (lv_forgroundColor_9_0= ruleSystemColors )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2257:3: lv_forgroundColor_9_0= ruleSystemColors
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFlatStyleAccess().getForgroundColorSystemColorsEnumRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSystemColors_in_ruleFlatStyle4941);
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

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleFlatStyle4955); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2285:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2286:2: (iv_ruleLabel= ruleLabel EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2287:2: iv_ruleLabel= ruleLabel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelRule()); 
            }
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel4991);
            iv_ruleLabel=ruleLabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel5001); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2294:1: ruleLabel returns [EObject current=null] : ( () (otherlv_1= 'content:' ( (lv_value_2_0= ruleExpression ) ) ) (otherlv_3= 'police:' ( (lv_bold_4_0= 'bold' ) )? ( (lv_italic_5_0= 'italic' ) )? ( (lv_color_6_0= ruleSystemColors ) )? ( (lv_size_7_0= ruleEInt ) )? )? ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2297:28: ( ( () (otherlv_1= 'content:' ( (lv_value_2_0= ruleExpression ) ) ) (otherlv_3= 'police:' ( (lv_bold_4_0= 'bold' ) )? ( (lv_italic_5_0= 'italic' ) )? ( (lv_color_6_0= ruleSystemColors ) )? ( (lv_size_7_0= ruleEInt ) )? )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2298:1: ( () (otherlv_1= 'content:' ( (lv_value_2_0= ruleExpression ) ) ) (otherlv_3= 'police:' ( (lv_bold_4_0= 'bold' ) )? ( (lv_italic_5_0= 'italic' ) )? ( (lv_color_6_0= ruleSystemColors ) )? ( (lv_size_7_0= ruleEInt ) )? )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2298:1: ( () (otherlv_1= 'content:' ( (lv_value_2_0= ruleExpression ) ) ) (otherlv_3= 'police:' ( (lv_bold_4_0= 'bold' ) )? ( (lv_italic_5_0= 'italic' ) )? ( (lv_color_6_0= ruleSystemColors ) )? ( (lv_size_7_0= ruleEInt ) )? )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2298:2: () (otherlv_1= 'content:' ( (lv_value_2_0= ruleExpression ) ) ) (otherlv_3= 'police:' ( (lv_bold_4_0= 'bold' ) )? ( (lv_italic_5_0= 'italic' ) )? ( (lv_color_6_0= ruleSystemColors ) )? ( (lv_size_7_0= ruleEInt ) )? )?
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2298:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2299:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLabelAccess().getLabelAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2304:2: (otherlv_1= 'content:' ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2304:4: otherlv_1= 'content:' ( (lv_value_2_0= ruleExpression ) )
            {
            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleLabel5048); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getContentKeyword_1_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2308:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2309:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2309:1: (lv_value_2_0= ruleExpression )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2310:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLabelAccess().getValueExpressionParserRuleCall_1_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleLabel5069);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2326:3: (otherlv_3= 'police:' ( (lv_bold_4_0= 'bold' ) )? ( (lv_italic_5_0= 'italic' ) )? ( (lv_color_6_0= ruleSystemColors ) )? ( (lv_size_7_0= ruleEInt ) )? )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==57) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2326:5: otherlv_3= 'police:' ( (lv_bold_4_0= 'bold' ) )? ( (lv_italic_5_0= 'italic' ) )? ( (lv_color_6_0= ruleSystemColors ) )? ( (lv_size_7_0= ruleEInt ) )?
                    {
                    otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleLabel5083); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getLabelAccess().getPoliceKeyword_2_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2330:1: ( (lv_bold_4_0= 'bold' ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==58) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2331:1: (lv_bold_4_0= 'bold' )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2331:1: (lv_bold_4_0= 'bold' )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2332:3: lv_bold_4_0= 'bold'
                            {
                            lv_bold_4_0=(Token)match(input,58,FOLLOW_58_in_ruleLabel5101); if (state.failed) return current;
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

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2345:3: ( (lv_italic_5_0= 'italic' ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==59) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2346:1: (lv_italic_5_0= 'italic' )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2346:1: (lv_italic_5_0= 'italic' )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2347:3: lv_italic_5_0= 'italic'
                            {
                            lv_italic_5_0=(Token)match(input,59,FOLLOW_59_in_ruleLabel5133); if (state.failed) return current;
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

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2360:3: ( (lv_color_6_0= ruleSystemColors ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( ((LA56_0>=119 && LA56_0<=144)) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2361:1: (lv_color_6_0= ruleSystemColors )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2361:1: (lv_color_6_0= ruleSystemColors )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2362:3: lv_color_6_0= ruleSystemColors
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLabelAccess().getColorSystemColorsEnumRuleCall_2_3_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSystemColors_in_ruleLabel5168);
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

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2378:3: ( (lv_size_7_0= ruleEInt ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==RULE_INT) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2379:1: (lv_size_7_0= ruleEInt )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2379:1: (lv_size_7_0= ruleEInt )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2380:3: lv_size_7_0= ruleEInt
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLabelAccess().getSizeEIntParserRuleCall_2_4_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEInt_in_ruleLabel5190);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2404:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2405:2: (iv_ruleNode= ruleNode EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2406:2: iv_ruleNode= ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode5229);
            iv_ruleNode=ruleNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode5239); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2413:1: ruleNode returns [EObject current=null] : ( () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? ( (lv_style_8_0= ruleNodeDescription ) )* ( (lv_children_9_0= ruleNodeChildren ) )? otherlv_10= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2416:28: ( ( () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? ( (lv_style_8_0= ruleNodeDescription ) )* ( (lv_children_9_0= ruleNodeChildren ) )? otherlv_10= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2417:1: ( () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? ( (lv_style_8_0= ruleNodeDescription ) )* ( (lv_children_9_0= ruleNodeChildren ) )? otherlv_10= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2417:1: ( () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? ( (lv_style_8_0= ruleNodeDescription ) )* ( (lv_children_9_0= ruleNodeChildren ) )? otherlv_10= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2417:2: () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? ( (lv_style_8_0= ruleNodeDescription ) )* ( (lv_children_9_0= ruleNodeChildren ) )? otherlv_10= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2417:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2418:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNodeAccess().getNodeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleNode5285); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getNodeKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2427:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2428:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2428:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2429:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNodeAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleNode5306);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleNode5318); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2449:1: (otherlv_4= 'import:' ( ( ruleFQN ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==32) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2449:3: otherlv_4= 'import:' ( ( ruleFQN ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleNode5331); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getImportKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2453:1: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2454:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2454:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2455:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getNodeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeAccess().getImportsNodeMappingCrossReference_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleNode5354);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2468:4: (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==33) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2468:6: otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) )
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleNode5369); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getDomainContextKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2472:1: ( (lv_the_domain_7_0= ruleNodeDomainElement ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2473:1: (lv_the_domain_7_0= ruleNodeDomainElement )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2473:1: (lv_the_domain_7_0= ruleNodeDomainElement )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2474:3: lv_the_domain_7_0= ruleNodeDomainElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeAccess().getThe_domainNodeDomainElementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNodeDomainElement_in_ruleNode5390);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2490:4: ( (lv_style_8_0= ruleNodeDescription ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==21) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2491:1: (lv_style_8_0= ruleNodeDescription )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2491:1: (lv_style_8_0= ruleNodeDescription )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2492:3: lv_style_8_0= ruleNodeDescription
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeAccess().getStyleNodeDescriptionParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNodeDescription_in_ruleNode5413);
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
            	    break loop61;
                }
            } while (true);

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2508:3: ( (lv_children_9_0= ruleNodeChildren ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==35) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2509:1: (lv_children_9_0= ruleNodeChildren )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2509:1: (lv_children_9_0= ruleNodeChildren )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2510:3: lv_children_9_0= ruleNodeChildren
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeAccess().getChildrenNodeChildrenParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNodeChildren_in_ruleNode5435);
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

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleNode5448); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2538:1: entryRuleNodeChildren returns [EObject current=null] : iv_ruleNodeChildren= ruleNodeChildren EOF ;
    public final EObject entryRuleNodeChildren() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeChildren = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2539:2: (iv_ruleNodeChildren= ruleNodeChildren EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2540:2: iv_ruleNodeChildren= ruleNodeChildren EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeChildrenRule()); 
            }
            pushFollow(FOLLOW_ruleNodeChildren_in_entryRuleNodeChildren5484);
            iv_ruleNodeChildren=ruleNodeChildren();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeChildren; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeChildren5494); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2547:1: ruleNodeChildren returns [EObject current=null] : ( () otherlv_1= 'Contains' otherlv_2= '{' (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ( (lv_owned_boderednodes_7_0= ruleBorderedNode ) )* otherlv_8= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2550:28: ( ( () otherlv_1= 'Contains' otherlv_2= '{' (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ( (lv_owned_boderednodes_7_0= ruleBorderedNode ) )* otherlv_8= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2551:1: ( () otherlv_1= 'Contains' otherlv_2= '{' (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ( (lv_owned_boderednodes_7_0= ruleBorderedNode ) )* otherlv_8= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2551:1: ( () otherlv_1= 'Contains' otherlv_2= '{' (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ( (lv_owned_boderednodes_7_0= ruleBorderedNode ) )* otherlv_8= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2551:2: () otherlv_1= 'Contains' otherlv_2= '{' (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ( (lv_owned_boderednodes_7_0= ruleBorderedNode ) )* otherlv_8= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2551:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2552:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNodeChildrenAccess().getNodeChildrenAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleNodeChildren5540); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNodeChildrenAccess().getContainsKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleNodeChildren5552); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNodeChildrenAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2565:1: (otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==36) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2565:3: otherlv_3= 'reuse' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleNodeChildren5565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNodeChildrenAccess().getReuseKeyword_3_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2569:1: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2570:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2570:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2571:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getNodeChildrenRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeChildrenAccess().getReused_boderednodesBorderedNodeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleNodeChildren5588);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2584:2: (otherlv_5= ',' ( ( ruleFQN ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==37) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2584:4: otherlv_5= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleNodeChildren5601); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getNodeChildrenAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2588:1: ( ( ruleFQN ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2589:1: ( ruleFQN )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2589:1: ( ruleFQN )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2590:3: ruleFQN
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getNodeChildrenRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNodeChildrenAccess().getReused_boderednodesBorderedNodeCrossReference_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFQN_in_ruleNodeChildren5624);
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
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2603:6: ( (lv_owned_boderednodes_7_0= ruleBorderedNode ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==61) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2604:1: (lv_owned_boderednodes_7_0= ruleBorderedNode )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2604:1: (lv_owned_boderednodes_7_0= ruleBorderedNode )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2605:3: lv_owned_boderednodes_7_0= ruleBorderedNode
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeChildrenAccess().getOwned_boderednodesBorderedNodeParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBorderedNode_in_ruleNodeChildren5649);
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
            	    break loop65;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleNodeChildren5662); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2633:1: entryRuleBorderedNode returns [EObject current=null] : iv_ruleBorderedNode= ruleBorderedNode EOF ;
    public final EObject entryRuleBorderedNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorderedNode = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2634:2: (iv_ruleBorderedNode= ruleBorderedNode EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2635:2: iv_ruleBorderedNode= ruleBorderedNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBorderedNodeRule()); 
            }
            pushFollow(FOLLOW_ruleBorderedNode_in_entryRuleBorderedNode5698);
            iv_ruleBorderedNode=ruleBorderedNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBorderedNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorderedNode5708); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2642:1: ruleBorderedNode returns [EObject current=null] : ( () otherlv_1= 'BorderedNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? ( (lv_style_8_0= ruleNodeDescription ) )* otherlv_9= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2645:28: ( ( () otherlv_1= 'BorderedNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? ( (lv_style_8_0= ruleNodeDescription ) )* otherlv_9= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2646:1: ( () otherlv_1= 'BorderedNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? ( (lv_style_8_0= ruleNodeDescription ) )* otherlv_9= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2646:1: ( () otherlv_1= 'BorderedNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? ( (lv_style_8_0= ruleNodeDescription ) )* otherlv_9= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2646:2: () otherlv_1= 'BorderedNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) )? (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )? ( (lv_style_8_0= ruleNodeDescription ) )* otherlv_9= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2646:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2647:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBorderedNodeAccess().getBorderedNodeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleBorderedNode5754); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBorderedNodeAccess().getBorderedNodeKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2656:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2657:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2657:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2658:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBorderedNodeAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleBorderedNode5775);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleBorderedNode5787); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBorderedNodeAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2678:1: (otherlv_4= 'import:' ( ( ruleFQN ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==32) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2678:3: otherlv_4= 'import:' ( ( ruleFQN ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleBorderedNode5800); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getBorderedNodeAccess().getImportKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2682:1: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2683:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2683:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2684:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBorderedNodeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBorderedNodeAccess().getImportsNodeMappingCrossReference_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleBorderedNode5823);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2697:4: (otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==33) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2697:6: otherlv_6= 'domain-context:' ( (lv_the_domain_7_0= ruleNodeDomainElement ) )
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleBorderedNode5838); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getBorderedNodeAccess().getDomainContextKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2701:1: ( (lv_the_domain_7_0= ruleNodeDomainElement ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2702:1: (lv_the_domain_7_0= ruleNodeDomainElement )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2702:1: (lv_the_domain_7_0= ruleNodeDomainElement )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2703:3: lv_the_domain_7_0= ruleNodeDomainElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBorderedNodeAccess().getThe_domainNodeDomainElementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNodeDomainElement_in_ruleBorderedNode5859);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2719:4: ( (lv_style_8_0= ruleNodeDescription ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==21) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2720:1: (lv_style_8_0= ruleNodeDescription )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2720:1: (lv_style_8_0= ruleNodeDescription )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2721:3: lv_style_8_0= ruleNodeDescription
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBorderedNodeAccess().getStyleNodeDescriptionParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNodeDescription_in_ruleBorderedNode5882);
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
            	    break loop68;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleBorderedNode5895); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2749:1: entryRuleNodeDescription returns [EObject current=null] : iv_ruleNodeDescription= ruleNodeDescription EOF ;
    public final EObject entryRuleNodeDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeDescription = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2750:2: (iv_ruleNodeDescription= ruleNodeDescription EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2751:2: iv_ruleNodeDescription= ruleNodeDescription EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeDescriptionRule()); 
            }
            pushFollow(FOLLOW_ruleNodeDescription_in_entryRuleNodeDescription5931);
            iv_ruleNodeDescription=ruleNodeDescription();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeDescription; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeDescription5941); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2758:1: ruleNodeDescription returns [EObject current=null] : ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) (otherlv_7= 'position:' ( (lv_label_position_8_0= ruleLabelPosition ) ) )? (otherlv_9= 'alignment:' ( (lv_label_alignement_10_0= ruleLabelAlignment ) ) )? otherlv_11= '}' )? (otherlv_12= 'Style' otherlv_13= '{' ( (lv_style_14_0= ruleAbstractNodeStyle ) ) otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2761:28: ( ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) (otherlv_7= 'position:' ( (lv_label_position_8_0= ruleLabelPosition ) ) )? (otherlv_9= 'alignment:' ( (lv_label_alignement_10_0= ruleLabelAlignment ) ) )? otherlv_11= '}' )? (otherlv_12= 'Style' otherlv_13= '{' ( (lv_style_14_0= ruleAbstractNodeStyle ) ) otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2762:1: ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) (otherlv_7= 'position:' ( (lv_label_position_8_0= ruleLabelPosition ) ) )? (otherlv_9= 'alignment:' ( (lv_label_alignement_10_0= ruleLabelAlignment ) ) )? otherlv_11= '}' )? (otherlv_12= 'Style' otherlv_13= '{' ( (lv_style_14_0= ruleAbstractNodeStyle ) ) otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2762:1: ( () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) (otherlv_7= 'position:' ( (lv_label_position_8_0= ruleLabelPosition ) ) )? (otherlv_9= 'alignment:' ( (lv_label_alignement_10_0= ruleLabelAlignment ) ) )? otherlv_11= '}' )? (otherlv_12= 'Style' otherlv_13= '{' ( (lv_style_14_0= ruleAbstractNodeStyle ) ) otherlv_15= '}' )? otherlv_16= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2762:2: () otherlv_1= 'Representation' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) (otherlv_7= 'position:' ( (lv_label_position_8_0= ruleLabelPosition ) ) )? (otherlv_9= 'alignment:' ( (lv_label_alignement_10_0= ruleLabelAlignment ) ) )? otherlv_11= '}' )? (otherlv_12= 'Style' otherlv_13= '{' ( (lv_style_14_0= ruleAbstractNodeStyle ) ) otherlv_15= '}' )? otherlv_16= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2762:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2763:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNodeDescriptionAccess().getNodeDescriptionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleNodeDescription5987); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNodeDescriptionAccess().getRepresentationKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleNodeDescription5999); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNodeDescriptionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2776:1: ( (lv_condition_3_0= ruleCondition ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==25) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2777:1: (lv_condition_3_0= ruleCondition )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2777:1: (lv_condition_3_0= ruleCondition )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2778:3: lv_condition_3_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeDescriptionAccess().getConditionConditionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCondition_in_ruleNodeDescription6020);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2794:3: (otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) (otherlv_7= 'position:' ( (lv_label_position_8_0= ruleLabelPosition ) ) )? (otherlv_9= 'alignment:' ( (lv_label_alignement_10_0= ruleLabelAlignment ) ) )? otherlv_11= '}' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==41) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2794:5: otherlv_4= 'Label' otherlv_5= '{' ( (lv_node_Label_6_0= ruleLabel ) ) (otherlv_7= 'position:' ( (lv_label_position_8_0= ruleLabelPosition ) ) )? (otherlv_9= 'alignment:' ( (lv_label_alignement_10_0= ruleLabelAlignment ) ) )? otherlv_11= '}'
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleNodeDescription6034); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNodeDescriptionAccess().getLabelKeyword_4_0());
                          
                    }
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleNodeDescription6046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getNodeDescriptionAccess().getLeftCurlyBracketKeyword_4_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2802:1: ( (lv_node_Label_6_0= ruleLabel ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2803:1: (lv_node_Label_6_0= ruleLabel )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2803:1: (lv_node_Label_6_0= ruleLabel )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2804:3: lv_node_Label_6_0= ruleLabel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeDescriptionAccess().getNode_LabelLabelParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLabel_in_ruleNodeDescription6067);
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

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2820:2: (otherlv_7= 'position:' ( (lv_label_position_8_0= ruleLabelPosition ) ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==62) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2820:4: otherlv_7= 'position:' ( (lv_label_position_8_0= ruleLabelPosition ) )
                            {
                            otherlv_7=(Token)match(input,62,FOLLOW_62_in_ruleNodeDescription6080); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getNodeDescriptionAccess().getPositionKeyword_4_3_0());
                                  
                            }
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2824:1: ( (lv_label_position_8_0= ruleLabelPosition ) )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2825:1: (lv_label_position_8_0= ruleLabelPosition )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2825:1: (lv_label_position_8_0= ruleLabelPosition )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2826:3: lv_label_position_8_0= ruleLabelPosition
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNodeDescriptionAccess().getLabel_positionLabelPositionEnumRuleCall_4_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleLabelPosition_in_ruleNodeDescription6101);
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

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2842:4: (otherlv_9= 'alignment:' ( (lv_label_alignement_10_0= ruleLabelAlignment ) ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==63) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2842:6: otherlv_9= 'alignment:' ( (lv_label_alignement_10_0= ruleLabelAlignment ) )
                            {
                            otherlv_9=(Token)match(input,63,FOLLOW_63_in_ruleNodeDescription6116); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getNodeDescriptionAccess().getAlignmentKeyword_4_4_0());
                                  
                            }
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2846:1: ( (lv_label_alignement_10_0= ruleLabelAlignment ) )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2847:1: (lv_label_alignement_10_0= ruleLabelAlignment )
                            {
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2847:1: (lv_label_alignement_10_0= ruleLabelAlignment )
                            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2848:3: lv_label_alignement_10_0= ruleLabelAlignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNodeDescriptionAccess().getLabel_alignementLabelAlignmentEnumRuleCall_4_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleLabelAlignment_in_ruleNodeDescription6137);
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

                    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleNodeDescription6151); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getNodeDescriptionAccess().getRightCurlyBracketKeyword_4_5());
                          
                    }

                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2868:3: (otherlv_12= 'Style' otherlv_13= '{' ( (lv_style_14_0= ruleAbstractNodeStyle ) ) otherlv_15= '}' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==26) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2868:5: otherlv_12= 'Style' otherlv_13= '{' ( (lv_style_14_0= ruleAbstractNodeStyle ) ) otherlv_15= '}'
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_26_in_ruleNodeDescription6166); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getNodeDescriptionAccess().getStyleKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleNodeDescription6178); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getNodeDescriptionAccess().getLeftCurlyBracketKeyword_5_1());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2876:1: ( (lv_style_14_0= ruleAbstractNodeStyle ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2877:1: (lv_style_14_0= ruleAbstractNodeStyle )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2877:1: (lv_style_14_0= ruleAbstractNodeStyle )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2878:3: lv_style_14_0= ruleAbstractNodeStyle
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeDescriptionAccess().getStyleAbstractNodeStyleParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAbstractNodeStyle_in_ruleNodeDescription6199);
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

                    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleNodeDescription6211); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getNodeDescriptionAccess().getRightCurlyBracketKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_15_in_ruleNodeDescription6225); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2910:1: entryRuleActionSet returns [EObject current=null] : iv_ruleActionSet= ruleActionSet EOF ;
    public final EObject entryRuleActionSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionSet = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2911:2: (iv_ruleActionSet= ruleActionSet EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2912:2: iv_ruleActionSet= ruleActionSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionSetRule()); 
            }
            pushFollow(FOLLOW_ruleActionSet_in_entryRuleActionSet6261);
            iv_ruleActionSet=ruleActionSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActionSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionSet6271); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2919:1: ruleActionSet returns [EObject current=null] : ( () otherlv_1= 'Actions' otherlv_2= '{' ( (lv_actions_3_0= ruleAction ) )* ( (lv_openActions_4_0= ruleOpenAction ) )* otherlv_5= '}' ) ;
    public final EObject ruleActionSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_actions_3_0 = null;

        EObject lv_openActions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2922:28: ( ( () otherlv_1= 'Actions' otherlv_2= '{' ( (lv_actions_3_0= ruleAction ) )* ( (lv_openActions_4_0= ruleOpenAction ) )* otherlv_5= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2923:1: ( () otherlv_1= 'Actions' otherlv_2= '{' ( (lv_actions_3_0= ruleAction ) )* ( (lv_openActions_4_0= ruleOpenAction ) )* otherlv_5= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2923:1: ( () otherlv_1= 'Actions' otherlv_2= '{' ( (lv_actions_3_0= ruleAction ) )* ( (lv_openActions_4_0= ruleOpenAction ) )* otherlv_5= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2923:2: () otherlv_1= 'Actions' otherlv_2= '{' ( (lv_actions_3_0= ruleAction ) )* ( (lv_openActions_4_0= ruleOpenAction ) )* otherlv_5= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2923:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2924:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActionSetAccess().getActionSetAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleActionSet6317); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActionSetAccess().getActionsKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleActionSet6329); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActionSetAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2937:1: ( (lv_actions_3_0= ruleAction ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==69||(LA74_0>=71 && LA74_0<=73)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2938:1: (lv_actions_3_0= ruleAction )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2938:1: (lv_actions_3_0= ruleAction )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2939:3: lv_actions_3_0= ruleAction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getActionSetAccess().getActionsActionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAction_in_ruleActionSet6350);
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
            	    break loop74;
                }
            } while (true);

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2955:3: ( (lv_openActions_4_0= ruleOpenAction ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==65) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2956:1: (lv_openActions_4_0= ruleOpenAction )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2956:1: (lv_openActions_4_0= ruleOpenAction )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2957:3: lv_openActions_4_0= ruleOpenAction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getActionSetAccess().getOpenActionsOpenActionParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpenAction_in_ruleActionSet6372);
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
            	    break loop75;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleActionSet6385); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2985:1: entryRuleOpenAction returns [EObject current=null] : iv_ruleOpenAction= ruleOpenAction EOF ;
    public final EObject entryRuleOpenAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenAction = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2986:2: (iv_ruleOpenAction= ruleOpenAction EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2987:2: iv_ruleOpenAction= ruleOpenAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpenActionRule()); 
            }
            pushFollow(FOLLOW_ruleOpenAction_in_entryRuleOpenAction6421);
            iv_ruleOpenAction=ruleOpenAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpenAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenAction6431); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2994:1: ruleOpenAction returns [EObject current=null] : ( () otherlv_1= 'OpenAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'icon:' ( (lv_icon_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2997:28: ( ( () otherlv_1= 'OpenAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'icon:' ( (lv_icon_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2998:1: ( () otherlv_1= 'OpenAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'icon:' ( (lv_icon_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2998:1: ( () otherlv_1= 'OpenAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'icon:' ( (lv_icon_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2998:2: () otherlv_1= 'OpenAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'icon:' ( (lv_icon_9_0= RULE_STRING ) ) )? otherlv_10= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2998:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:2999:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOpenActionAccess().getOpenActionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleOpenAction6477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOpenActionAccess().getOpenActionKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3008:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3009:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3009:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3010:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOpenActionAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleOpenAction6498);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleOpenAction6510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOpenActionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3030:1: (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==66) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3030:3: otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,66,FOLLOW_66_in_ruleOpenAction6523); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getOpenActionAccess().getPreconditionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3034:1: ( (lv_precondition_5_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3035:1: (lv_precondition_5_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3035:1: (lv_precondition_5_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3036:3: lv_precondition_5_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOpenActionAccess().getPreconditionEStringParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleOpenAction6544);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3052:4: (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==67) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3052:6: otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,67,FOLLOW_67_in_ruleOpenAction6559); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getOpenActionAccess().getLabelKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3056:1: ( (lv_label_7_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3057:1: (lv_label_7_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3057:1: (lv_label_7_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3058:3: lv_label_7_0= RULE_STRING
                    {
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOpenAction6576); if (state.failed) return current;
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3074:4: (otherlv_8= 'icon:' ( (lv_icon_9_0= RULE_STRING ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==68) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3074:6: otherlv_8= 'icon:' ( (lv_icon_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,68,FOLLOW_68_in_ruleOpenAction6596); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getOpenActionAccess().getIconKeyword_6_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3078:1: ( (lv_icon_9_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3079:1: (lv_icon_9_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3079:1: (lv_icon_9_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3080:3: lv_icon_9_0= RULE_STRING
                    {
                    lv_icon_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOpenAction6613); if (state.failed) return current;
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

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleOpenAction6632); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3108:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3109:2: (iv_ruleAction= ruleAction EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3110:2: iv_ruleAction= ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction6668);
            iv_ruleAction=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction6678); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3117:1: ruleAction returns [EObject current=null] : (this_Create_0= ruleCreate | this_Delete_1= ruleDelete | this_Drop_2= ruleDrop | this_ReconnectEdge_3= ruleReconnectEdge ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Create_0 = null;

        EObject this_Delete_1 = null;

        EObject this_Drop_2 = null;

        EObject this_ReconnectEdge_3 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3120:28: ( (this_Create_0= ruleCreate | this_Delete_1= ruleDelete | this_Drop_2= ruleDrop | this_ReconnectEdge_3= ruleReconnectEdge ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3121:1: (this_Create_0= ruleCreate | this_Delete_1= ruleDelete | this_Drop_2= ruleDrop | this_ReconnectEdge_3= ruleReconnectEdge )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3121:1: (this_Create_0= ruleCreate | this_Delete_1= ruleDelete | this_Drop_2= ruleDrop | this_ReconnectEdge_3= ruleReconnectEdge )
            int alt79=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt79=1;
                }
                break;
            case 71:
                {
                alt79=2;
                }
                break;
            case 72:
                {
                alt79=3;
                }
                break;
            case 73:
                {
                alt79=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3122:5: this_Create_0= ruleCreate
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionAccess().getCreateParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreate_in_ruleAction6725);
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3132:5: this_Delete_1= ruleDelete
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionAccess().getDeleteParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDelete_in_ruleAction6752);
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3142:5: this_Drop_2= ruleDrop
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionAccess().getDropParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDrop_in_ruleAction6779);
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3152:5: this_ReconnectEdge_3= ruleReconnectEdge
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionAccess().getReconnectEdgeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReconnectEdge_in_ruleAction6806);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3168:1: entryRuleCreate returns [EObject current=null] : iv_ruleCreate= ruleCreate EOF ;
    public final EObject entryRuleCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreate = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3169:2: (iv_ruleCreate= ruleCreate EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3170:2: iv_ruleCreate= ruleCreate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateRule()); 
            }
            pushFollow(FOLLOW_ruleCreate_in_entryRuleCreate6841);
            iv_ruleCreate=ruleCreate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreate6851); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3177:1: ruleCreate returns [EObject current=null] : ( () otherlv_1= 'Create' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) (otherlv_10= 'icon:' ( (lv_icon_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3180:28: ( ( () otherlv_1= 'Create' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) (otherlv_10= 'icon:' ( (lv_icon_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3181:1: ( () otherlv_1= 'Create' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) (otherlv_10= 'icon:' ( (lv_icon_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3181:1: ( () otherlv_1= 'Create' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) (otherlv_10= 'icon:' ( (lv_icon_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3181:2: () otherlv_1= 'Create' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) (otherlv_10= 'icon:' ( (lv_icon_11_0= RULE_STRING ) ) )? otherlv_12= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3181:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3182:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCreateAccess().getCreateAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleCreate6897); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateAccess().getCreateKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3191:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3192:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3192:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3193:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleCreate6918);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleCreate6930); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCreateAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3213:1: (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==66) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3213:3: otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,66,FOLLOW_66_in_ruleCreate6943); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getCreateAccess().getPreconditionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3217:1: ( (lv_precondition_5_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3218:1: (lv_precondition_5_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3218:1: (lv_precondition_5_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3219:3: lv_precondition_5_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateAccess().getPreconditionEStringParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleCreate6964);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3235:4: (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==67) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3235:6: otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,67,FOLLOW_67_in_ruleCreate6979); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCreateAccess().getLabelKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3239:1: ( (lv_label_7_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3240:1: (lv_label_7_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3240:1: (lv_label_7_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3241:3: lv_label_7_0= RULE_STRING
                    {
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCreate6996); if (state.failed) return current;
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3257:4: (otherlv_8= 'action-for:' ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3257:6: otherlv_8= 'action-for:' ( ( ruleFQN ) )
            {
            otherlv_8=(Token)match(input,70,FOLLOW_70_in_ruleCreate7016); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getCreateAccess().getActionForKeyword_6_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3261:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3262:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3262:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3263:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateAccess().getTool_ForDiagramElementCrossReference_6_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleCreate7039);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3276:3: (otherlv_10= 'icon:' ( (lv_icon_11_0= RULE_STRING ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==68) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3276:5: otherlv_10= 'icon:' ( (lv_icon_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,68,FOLLOW_68_in_ruleCreate7053); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getCreateAccess().getIconKeyword_7_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3280:1: ( (lv_icon_11_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3281:1: (lv_icon_11_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3281:1: (lv_icon_11_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3282:3: lv_icon_11_0= RULE_STRING
                    {
                    lv_icon_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCreate7070); if (state.failed) return current;
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

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleCreate7089); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3310:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3311:2: (iv_ruleDelete= ruleDelete EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3312:2: iv_ruleDelete= ruleDelete EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteRule()); 
            }
            pushFollow(FOLLOW_ruleDelete_in_entryRuleDelete7125);
            iv_ruleDelete=ruleDelete();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDelete; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelete7135); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3319:1: ruleDelete returns [EObject current=null] : ( () otherlv_1= 'Delete' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3322:28: ( ( () otherlv_1= 'Delete' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3323:1: ( () otherlv_1= 'Delete' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3323:1: ( () otherlv_1= 'Delete' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3323:2: () otherlv_1= 'Delete' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3323:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3324:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDeleteAccess().getDeleteAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleDelete7181); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getDeleteKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3333:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3334:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3334:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3335:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeleteAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleDelete7202);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleDelete7214); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDeleteAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3355:1: (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==66) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3355:3: otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,66,FOLLOW_66_in_ruleDelete7227); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDeleteAccess().getPreconditionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3359:1: ( (lv_precondition_5_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3360:1: (lv_precondition_5_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3360:1: (lv_precondition_5_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3361:3: lv_precondition_5_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeleteAccess().getPreconditionEStringParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleDelete7248);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3377:4: (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==67) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3377:6: otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,67,FOLLOW_67_in_ruleDelete7263); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getDeleteAccess().getLabelKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3381:1: ( (lv_label_7_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3382:1: (lv_label_7_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3382:1: (lv_label_7_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3383:3: lv_label_7_0= RULE_STRING
                    {
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDelete7280); if (state.failed) return current;
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3399:4: (otherlv_8= 'action-for:' ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3399:6: otherlv_8= 'action-for:' ( ( ruleFQN ) )
            {
            otherlv_8=(Token)match(input,70,FOLLOW_70_in_ruleDelete7300); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getDeleteAccess().getActionForKeyword_6_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3403:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3404:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3404:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3405:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeleteAccess().getTool_ForDiagramElementCrossReference_6_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleDelete7323);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleDelete7336); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3430:1: entryRuleDrop returns [EObject current=null] : iv_ruleDrop= ruleDrop EOF ;
    public final EObject entryRuleDrop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrop = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3431:2: (iv_ruleDrop= ruleDrop EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3432:2: iv_ruleDrop= ruleDrop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropRule()); 
            }
            pushFollow(FOLLOW_ruleDrop_in_entryRuleDrop7372);
            iv_ruleDrop=ruleDrop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDrop; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDrop7382); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3439:1: ruleDrop returns [EObject current=null] : ( () otherlv_1= 'Drop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3442:28: ( ( () otherlv_1= 'Drop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3443:1: ( () otherlv_1= 'Drop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3443:1: ( () otherlv_1= 'Drop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3443:2: () otherlv_1= 'Drop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3443:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3444:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDropAccess().getDropAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleDrop7428); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropAccess().getDropKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3453:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3454:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3454:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3455:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDropAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleDrop7449);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleDrop7461); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDropAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3475:1: (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==66) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3475:3: otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,66,FOLLOW_66_in_ruleDrop7474); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDropAccess().getPreconditionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3479:1: ( (lv_precondition_5_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3480:1: (lv_precondition_5_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3480:1: (lv_precondition_5_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3481:3: lv_precondition_5_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDropAccess().getPreconditionEStringParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleDrop7495);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3497:4: (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==67) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3497:6: otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,67,FOLLOW_67_in_ruleDrop7510); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getDropAccess().getLabelKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3501:1: ( (lv_label_7_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3502:1: (lv_label_7_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3502:1: (lv_label_7_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3503:3: lv_label_7_0= RULE_STRING
                    {
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDrop7527); if (state.failed) return current;
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3519:4: (otherlv_8= 'action-for:' ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3519:6: otherlv_8= 'action-for:' ( ( ruleFQN ) )
            {
            otherlv_8=(Token)match(input,70,FOLLOW_70_in_ruleDrop7547); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getDropAccess().getActionForKeyword_6_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3523:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3524:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3524:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3525:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDropAccess().getTool_ForDiagramElementCrossReference_6_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleDrop7570);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleDrop7583); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3550:1: entryRuleReconnectEdge returns [EObject current=null] : iv_ruleReconnectEdge= ruleReconnectEdge EOF ;
    public final EObject entryRuleReconnectEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReconnectEdge = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3551:2: (iv_ruleReconnectEdge= ruleReconnectEdge EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3552:2: iv_ruleReconnectEdge= ruleReconnectEdge EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReconnectEdgeRule()); 
            }
            pushFollow(FOLLOW_ruleReconnectEdge_in_entryRuleReconnectEdge7619);
            iv_ruleReconnectEdge=ruleReconnectEdge();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReconnectEdge; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReconnectEdge7629); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3559:1: ruleReconnectEdge returns [EObject current=null] : ( () otherlv_1= 'ReconnectEdge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3562:28: ( ( () otherlv_1= 'ReconnectEdge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3563:1: ( () otherlv_1= 'ReconnectEdge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3563:1: ( () otherlv_1= 'ReconnectEdge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3563:2: () otherlv_1= 'ReconnectEdge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )? (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )? (otherlv_8= 'action-for:' ( ( ruleFQN ) ) ) otherlv_10= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3563:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3564:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReconnectEdgeAccess().getReconnectEdgeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleReconnectEdge7675); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReconnectEdgeAccess().getReconnectEdgeKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3573:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3574:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3574:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3575:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReconnectEdgeAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleReconnectEdge7696);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleReconnectEdge7708); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getReconnectEdgeAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3595:1: (otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==66) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3595:3: otherlv_4= 'precondition:' ( (lv_precondition_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,66,FOLLOW_66_in_ruleReconnectEdge7721); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getReconnectEdgeAccess().getPreconditionKeyword_4_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3599:1: ( (lv_precondition_5_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3600:1: (lv_precondition_5_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3600:1: (lv_precondition_5_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3601:3: lv_precondition_5_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReconnectEdgeAccess().getPreconditionEStringParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleReconnectEdge7742);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3617:4: (otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==67) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3617:6: otherlv_6= 'label:' ( (lv_label_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,67,FOLLOW_67_in_ruleReconnectEdge7757); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getReconnectEdgeAccess().getLabelKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3621:1: ( (lv_label_7_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3622:1: (lv_label_7_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3622:1: (lv_label_7_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3623:3: lv_label_7_0= RULE_STRING
                    {
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleReconnectEdge7774); if (state.failed) return current;
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3639:4: (otherlv_8= 'action-for:' ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3639:6: otherlv_8= 'action-for:' ( ( ruleFQN ) )
            {
            otherlv_8=(Token)match(input,70,FOLLOW_70_in_ruleReconnectEdge7794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getReconnectEdgeAccess().getActionForKeyword_6_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3643:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3644:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3644:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3645:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReconnectEdgeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReconnectEdgeAccess().getTool_ForDiagramElementCrossReference_6_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleReconnectEdge7817);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleReconnectEdge7830); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3670:1: entryRuleDomainContainer returns [EObject current=null] : iv_ruleDomainContainer= ruleDomainContainer EOF ;
    public final EObject entryRuleDomainContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainContainer = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3671:2: (iv_ruleDomainContainer= ruleDomainContainer EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3672:2: iv_ruleDomainContainer= ruleDomainContainer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainContainerRule()); 
            }
            pushFollow(FOLLOW_ruleDomainContainer_in_entryRuleDomainContainer7866);
            iv_ruleDomainContainer=ruleDomainContainer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainContainer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainContainer7876); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3679:1: ruleDomainContainer returns [EObject current=null] : ( () (otherlv_1= 'domain-context:' ( (lv_the_domain_2_0= ruleAbstractClass ) ) ) ) ;
    public final EObject ruleDomainContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_the_domain_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3682:28: ( ( () (otherlv_1= 'domain-context:' ( (lv_the_domain_2_0= ruleAbstractClass ) ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3683:1: ( () (otherlv_1= 'domain-context:' ( (lv_the_domain_2_0= ruleAbstractClass ) ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3683:1: ( () (otherlv_1= 'domain-context:' ( (lv_the_domain_2_0= ruleAbstractClass ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3683:2: () (otherlv_1= 'domain-context:' ( (lv_the_domain_2_0= ruleAbstractClass ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3683:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3684:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDomainContainerAccess().getDomainContainerAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3689:2: (otherlv_1= 'domain-context:' ( (lv_the_domain_2_0= ruleAbstractClass ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3689:4: otherlv_1= 'domain-context:' ( (lv_the_domain_2_0= ruleAbstractClass ) )
            {
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleDomainContainer7923); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDomainContainerAccess().getDomainContextKeyword_1_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3693:1: ( (lv_the_domain_2_0= ruleAbstractClass ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3694:1: (lv_the_domain_2_0= ruleAbstractClass )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3694:1: (lv_the_domain_2_0= ruleAbstractClass )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3695:3: lv_the_domain_2_0= ruleAbstractClass
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDomainContainerAccess().getThe_domainAbstractClassParserRuleCall_1_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbstractClass_in_ruleDomainContainer7944);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3719:1: entryRuleEdge returns [EObject current=null] : iv_ruleEdge= ruleEdge EOF ;
    public final EObject entryRuleEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdge = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3720:2: (iv_ruleEdge= ruleEdge EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3721:2: iv_ruleEdge= ruleEdge EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeRule()); 
            }
            pushFollow(FOLLOW_ruleEdge_in_entryRuleEdge7981);
            iv_ruleEdge=ruleEdge();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdge; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdge7991); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3728:1: ruleEdge returns [EObject current=null] : ( () otherlv_1= 'Edge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'association-context:' ( (lv_the_domain_5_0= ruleEdgeDomainAssociation ) ) ) | (otherlv_6= 'class-association-context:' ( (lv_the_domain_7_0= ruleEdgeDomainElement ) ) ) ) (otherlv_8= 'source:' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* ) (otherlv_12= 'target:' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* ) ( (lv_e_description_16_0= ruleEdgeDescription ) )* otherlv_17= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3731:28: ( ( () otherlv_1= 'Edge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'association-context:' ( (lv_the_domain_5_0= ruleEdgeDomainAssociation ) ) ) | (otherlv_6= 'class-association-context:' ( (lv_the_domain_7_0= ruleEdgeDomainElement ) ) ) ) (otherlv_8= 'source:' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* ) (otherlv_12= 'target:' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* ) ( (lv_e_description_16_0= ruleEdgeDescription ) )* otherlv_17= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3732:1: ( () otherlv_1= 'Edge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'association-context:' ( (lv_the_domain_5_0= ruleEdgeDomainAssociation ) ) ) | (otherlv_6= 'class-association-context:' ( (lv_the_domain_7_0= ruleEdgeDomainElement ) ) ) ) (otherlv_8= 'source:' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* ) (otherlv_12= 'target:' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* ) ( (lv_e_description_16_0= ruleEdgeDescription ) )* otherlv_17= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3732:1: ( () otherlv_1= 'Edge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'association-context:' ( (lv_the_domain_5_0= ruleEdgeDomainAssociation ) ) ) | (otherlv_6= 'class-association-context:' ( (lv_the_domain_7_0= ruleEdgeDomainElement ) ) ) ) (otherlv_8= 'source:' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* ) (otherlv_12= 'target:' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* ) ( (lv_e_description_16_0= ruleEdgeDescription ) )* otherlv_17= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3732:2: () otherlv_1= 'Edge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'association-context:' ( (lv_the_domain_5_0= ruleEdgeDomainAssociation ) ) ) | (otherlv_6= 'class-association-context:' ( (lv_the_domain_7_0= ruleEdgeDomainElement ) ) ) ) (otherlv_8= 'source:' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* ) (otherlv_12= 'target:' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* ) ( (lv_e_description_16_0= ruleEdgeDescription ) )* otherlv_17= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3732:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3733:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEdgeAccess().getEdgeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleEdge8037); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEdgeAccess().getEdgeKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3742:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3743:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3743:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3744:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleEdge8058);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleEdge8070); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEdgeAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3764:1: ( (otherlv_4= 'association-context:' ( (lv_the_domain_5_0= ruleEdgeDomainAssociation ) ) ) | (otherlv_6= 'class-association-context:' ( (lv_the_domain_7_0= ruleEdgeDomainElement ) ) ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==75) ) {
                alt89=1;
            }
            else if ( (LA89_0==76) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3764:2: (otherlv_4= 'association-context:' ( (lv_the_domain_5_0= ruleEdgeDomainAssociation ) ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3764:2: (otherlv_4= 'association-context:' ( (lv_the_domain_5_0= ruleEdgeDomainAssociation ) ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3764:4: otherlv_4= 'association-context:' ( (lv_the_domain_5_0= ruleEdgeDomainAssociation ) )
                    {
                    otherlv_4=(Token)match(input,75,FOLLOW_75_in_ruleEdge8084); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEdgeAccess().getAssociationContextKeyword_4_0_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3768:1: ( (lv_the_domain_5_0= ruleEdgeDomainAssociation ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3769:1: (lv_the_domain_5_0= ruleEdgeDomainAssociation )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3769:1: (lv_the_domain_5_0= ruleEdgeDomainAssociation )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3770:3: lv_the_domain_5_0= ruleEdgeDomainAssociation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeAccess().getThe_domainEdgeDomainAssociationParserRuleCall_4_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEdgeDomainAssociation_in_ruleEdge8105);
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3787:6: (otherlv_6= 'class-association-context:' ( (lv_the_domain_7_0= ruleEdgeDomainElement ) ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3787:6: (otherlv_6= 'class-association-context:' ( (lv_the_domain_7_0= ruleEdgeDomainElement ) ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3787:8: otherlv_6= 'class-association-context:' ( (lv_the_domain_7_0= ruleEdgeDomainElement ) )
                    {
                    otherlv_6=(Token)match(input,76,FOLLOW_76_in_ruleEdge8125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEdgeAccess().getClassAssociationContextKeyword_4_1_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3791:1: ( (lv_the_domain_7_0= ruleEdgeDomainElement ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3792:1: (lv_the_domain_7_0= ruleEdgeDomainElement )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3792:1: (lv_the_domain_7_0= ruleEdgeDomainElement )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3793:3: lv_the_domain_7_0= ruleEdgeDomainElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeAccess().getThe_domainEdgeDomainElementParserRuleCall_4_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEdgeDomainElement_in_ruleEdge8146);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3809:4: (otherlv_8= 'source:' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3809:6: otherlv_8= 'source:' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )*
            {
            otherlv_8=(Token)match(input,77,FOLLOW_77_in_ruleEdge8161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getEdgeAccess().getSourceKeyword_5_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3813:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3814:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3814:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3815:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEdgeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeAccess().getSourceDiagramElementCrossReference_5_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleEdge8184);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3828:2: (otherlv_10= ',' ( ( ruleFQN ) ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==37) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3828:4: otherlv_10= ',' ( ( ruleFQN ) )
            	    {
            	    otherlv_10=(Token)match(input,37,FOLLOW_37_in_ruleEdge8197); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getEdgeAccess().getCommaKeyword_5_2_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3832:1: ( ( ruleFQN ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3833:1: ( ruleFQN )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3833:1: ( ruleFQN )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3834:3: ruleFQN
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEdgeRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEdgeAccess().getSourceDiagramElementCrossReference_5_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFQN_in_ruleEdge8220);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3847:5: (otherlv_12= 'target:' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3847:7: otherlv_12= 'target:' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )*
            {
            otherlv_12=(Token)match(input,78,FOLLOW_78_in_ruleEdge8236); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getEdgeAccess().getTargetKeyword_6_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3851:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3852:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3852:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3853:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEdgeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeAccess().getTargetDiagramElementCrossReference_6_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleEdge8259);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3866:2: (otherlv_14= ',' ( ( ruleFQN ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==37) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3866:4: otherlv_14= ',' ( ( ruleFQN ) )
            	    {
            	    otherlv_14=(Token)match(input,37,FOLLOW_37_in_ruleEdge8272); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getEdgeAccess().getCommaKeyword_6_2_0());
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3870:1: ( ( ruleFQN ) )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3871:1: ( ruleFQN )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3871:1: ( ruleFQN )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3872:3: ruleFQN
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEdgeRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEdgeAccess().getTargetDiagramElementCrossReference_6_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFQN_in_ruleEdge8295);
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
            	    break loop91;
                }
            } while (true);


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3885:5: ( (lv_e_description_16_0= ruleEdgeDescription ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==21) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3886:1: (lv_e_description_16_0= ruleEdgeDescription )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3886:1: (lv_e_description_16_0= ruleEdgeDescription )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3887:3: lv_e_description_16_0= ruleEdgeDescription
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEdgeAccess().getE_descriptionEdgeDescriptionParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEdgeDescription_in_ruleEdge8319);
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
            	    break loop92;
                }
            } while (true);

            otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleEdge8332); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3915:1: entryRuleEdgeImport returns [EObject current=null] : iv_ruleEdgeImport= ruleEdgeImport EOF ;
    public final EObject entryRuleEdgeImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeImport = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3916:2: (iv_ruleEdgeImport= ruleEdgeImport EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3917:2: iv_ruleEdgeImport= ruleEdgeImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeImportRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeImport_in_entryRuleEdgeImport8368);
            iv_ruleEdgeImport=ruleEdgeImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeImport8378); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3924:1: ruleEdgeImport returns [EObject current=null] : ( () otherlv_1= 'EdgeImport' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) ) ( (lv_e_description_6_0= ruleEdgeDescription ) )* otherlv_7= '}' ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3927:28: ( ( () otherlv_1= 'EdgeImport' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) ) ( (lv_e_description_6_0= ruleEdgeDescription ) )* otherlv_7= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3928:1: ( () otherlv_1= 'EdgeImport' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) ) ( (lv_e_description_6_0= ruleEdgeDescription ) )* otherlv_7= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3928:1: ( () otherlv_1= 'EdgeImport' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) ) ( (lv_e_description_6_0= ruleEdgeDescription ) )* otherlv_7= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3928:2: () otherlv_1= 'EdgeImport' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'import:' ( ( ruleFQN ) ) ) ( (lv_e_description_6_0= ruleEdgeDescription ) )* otherlv_7= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3928:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3929:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEdgeImportAccess().getEdgeImportAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleEdgeImport8424); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEdgeImportAccess().getEdgeImportKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3938:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3939:1: (lv_name_2_0= ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3939:1: (lv_name_2_0= ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3940:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeImportAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleEdgeImport8445);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleEdgeImport8457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEdgeImportAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3960:1: (otherlv_4= 'import:' ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3960:3: otherlv_4= 'import:' ( ( ruleFQN ) )
            {
            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleEdgeImport8470); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEdgeImportAccess().getImportKeyword_4_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3964:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3965:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3965:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3966:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEdgeImportRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeImportAccess().getImportsEdgeMappingCrossReference_4_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleEdgeImport8493);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3979:3: ( (lv_e_description_6_0= ruleEdgeDescription ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==21) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3980:1: (lv_e_description_6_0= ruleEdgeDescription )
            	    {
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3980:1: (lv_e_description_6_0= ruleEdgeDescription )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:3981:3: lv_e_description_6_0= ruleEdgeDescription
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEdgeImportAccess().getE_descriptionEdgeDescriptionParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEdgeDescription_in_ruleEdgeImport8515);
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
            	    break loop93;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleEdgeImport8528); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4009:1: entryRuleEdgeDomainAssociation returns [EObject current=null] : iv_ruleEdgeDomainAssociation= ruleEdgeDomainAssociation EOF ;
    public final EObject entryRuleEdgeDomainAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeDomainAssociation = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4010:2: (iv_ruleEdgeDomainAssociation= ruleEdgeDomainAssociation EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4011:2: iv_ruleEdgeDomainAssociation= ruleEdgeDomainAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeDomainAssociationRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeDomainAssociation_in_entryRuleEdgeDomainAssociation8564);
            iv_ruleEdgeDomainAssociation=ruleEdgeDomainAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeDomainAssociation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeDomainAssociation8574); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4018:1: ruleEdgeDomainAssociation returns [EObject current=null] : ( () ( (otherlv_1= 'query:' ( (lv_target_query_2_0= RULE_STRING ) ) ) | ( (lv_target_Locator_3_0= ruleAbstractAssociation2 ) ) ) ) ;
    public final EObject ruleEdgeDomainAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_target_query_2_0=null;
        EObject lv_target_Locator_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4021:28: ( ( () ( (otherlv_1= 'query:' ( (lv_target_query_2_0= RULE_STRING ) ) ) | ( (lv_target_Locator_3_0= ruleAbstractAssociation2 ) ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4022:1: ( () ( (otherlv_1= 'query:' ( (lv_target_query_2_0= RULE_STRING ) ) ) | ( (lv_target_Locator_3_0= ruleAbstractAssociation2 ) ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4022:1: ( () ( (otherlv_1= 'query:' ( (lv_target_query_2_0= RULE_STRING ) ) ) | ( (lv_target_Locator_3_0= ruleAbstractAssociation2 ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4022:2: () ( (otherlv_1= 'query:' ( (lv_target_query_2_0= RULE_STRING ) ) ) | ( (lv_target_Locator_3_0= ruleAbstractAssociation2 ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4022:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4023:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEdgeDomainAssociationAccess().getEdgeDomainAssociationAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4028:2: ( (otherlv_1= 'query:' ( (lv_target_query_2_0= RULE_STRING ) ) ) | ( (lv_target_Locator_3_0= ruleAbstractAssociation2 ) ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==80) ) {
                alt94=1;
            }
            else if ( (LA94_0==RULE_ID||LA94_0==12) ) {
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4028:3: (otherlv_1= 'query:' ( (lv_target_query_2_0= RULE_STRING ) ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4028:3: (otherlv_1= 'query:' ( (lv_target_query_2_0= RULE_STRING ) ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4028:5: otherlv_1= 'query:' ( (lv_target_query_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleEdgeDomainAssociation8622); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEdgeDomainAssociationAccess().getQueryKeyword_1_0_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4032:1: ( (lv_target_query_2_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4033:1: (lv_target_query_2_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4033:1: (lv_target_query_2_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4034:3: lv_target_query_2_0= RULE_STRING
                    {
                    lv_target_query_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEdgeDomainAssociation8639); if (state.failed) return current;
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4051:6: ( (lv_target_Locator_3_0= ruleAbstractAssociation2 ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4051:6: ( (lv_target_Locator_3_0= ruleAbstractAssociation2 ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4052:1: (lv_target_Locator_3_0= ruleAbstractAssociation2 )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4052:1: (lv_target_Locator_3_0= ruleAbstractAssociation2 )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4053:3: lv_target_Locator_3_0= ruleAbstractAssociation2
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeDomainAssociationAccess().getTarget_LocatorAbstractAssociation2ParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAbstractAssociation2_in_ruleEdgeDomainAssociation8672);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4077:1: entryRuleEdgeDomainElement returns [EObject current=null] : iv_ruleEdgeDomainElement= ruleEdgeDomainElement EOF ;
    public final EObject entryRuleEdgeDomainElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeDomainElement = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4078:2: (iv_ruleEdgeDomainElement= ruleEdgeDomainElement EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4079:2: iv_ruleEdgeDomainElement= ruleEdgeDomainElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeDomainElementRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeDomainElement_in_entryRuleEdgeDomainElement8709);
            iv_ruleEdgeDomainElement=ruleEdgeDomainElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeDomainElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeDomainElement8719); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4086:1: ruleEdgeDomainElement returns [EObject current=null] : ( () ( (lv_the_Domain_1_0= ruleAbstractClass ) ) ( (otherlv_2= 'target-query:' ( (lv_target_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'target-association:' ( (lv_target_Locator_5_0= ruleAbstractAssociation2 ) ) ) ) ( (otherlv_6= 'source-query:' ( (lv_source_query_7_0= RULE_STRING ) ) ) | (otherlv_8= 'source-association:' ( (lv_source_Locator_9_0= ruleAbstractAssociation2 ) ) ) ) ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4089:28: ( ( () ( (lv_the_Domain_1_0= ruleAbstractClass ) ) ( (otherlv_2= 'target-query:' ( (lv_target_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'target-association:' ( (lv_target_Locator_5_0= ruleAbstractAssociation2 ) ) ) ) ( (otherlv_6= 'source-query:' ( (lv_source_query_7_0= RULE_STRING ) ) ) | (otherlv_8= 'source-association:' ( (lv_source_Locator_9_0= ruleAbstractAssociation2 ) ) ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4090:1: ( () ( (lv_the_Domain_1_0= ruleAbstractClass ) ) ( (otherlv_2= 'target-query:' ( (lv_target_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'target-association:' ( (lv_target_Locator_5_0= ruleAbstractAssociation2 ) ) ) ) ( (otherlv_6= 'source-query:' ( (lv_source_query_7_0= RULE_STRING ) ) ) | (otherlv_8= 'source-association:' ( (lv_source_Locator_9_0= ruleAbstractAssociation2 ) ) ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4090:1: ( () ( (lv_the_Domain_1_0= ruleAbstractClass ) ) ( (otherlv_2= 'target-query:' ( (lv_target_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'target-association:' ( (lv_target_Locator_5_0= ruleAbstractAssociation2 ) ) ) ) ( (otherlv_6= 'source-query:' ( (lv_source_query_7_0= RULE_STRING ) ) ) | (otherlv_8= 'source-association:' ( (lv_source_Locator_9_0= ruleAbstractAssociation2 ) ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4090:2: () ( (lv_the_Domain_1_0= ruleAbstractClass ) ) ( (otherlv_2= 'target-query:' ( (lv_target_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'target-association:' ( (lv_target_Locator_5_0= ruleAbstractAssociation2 ) ) ) ) ( (otherlv_6= 'source-query:' ( (lv_source_query_7_0= RULE_STRING ) ) ) | (otherlv_8= 'source-association:' ( (lv_source_Locator_9_0= ruleAbstractAssociation2 ) ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4090:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4091:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEdgeDomainElementAccess().getEdgeDomainElementAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4096:2: ( (lv_the_Domain_1_0= ruleAbstractClass ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4097:1: (lv_the_Domain_1_0= ruleAbstractClass )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4097:1: (lv_the_Domain_1_0= ruleAbstractClass )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4098:3: lv_the_Domain_1_0= ruleAbstractClass
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeDomainElementAccess().getThe_DomainAbstractClassParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbstractClass_in_ruleEdgeDomainElement8774);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4114:2: ( (otherlv_2= 'target-query:' ( (lv_target_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'target-association:' ( (lv_target_Locator_5_0= ruleAbstractAssociation2 ) ) ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==81) ) {
                alt95=1;
            }
            else if ( (LA95_0==82) ) {
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4114:3: (otherlv_2= 'target-query:' ( (lv_target_query_3_0= RULE_STRING ) ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4114:3: (otherlv_2= 'target-query:' ( (lv_target_query_3_0= RULE_STRING ) ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4114:5: otherlv_2= 'target-query:' ( (lv_target_query_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,81,FOLLOW_81_in_ruleEdgeDomainElement8788); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEdgeDomainElementAccess().getTargetQueryKeyword_2_0_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4118:1: ( (lv_target_query_3_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4119:1: (lv_target_query_3_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4119:1: (lv_target_query_3_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4120:3: lv_target_query_3_0= RULE_STRING
                    {
                    lv_target_query_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEdgeDomainElement8805); if (state.failed) return current;
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4137:6: (otherlv_4= 'target-association:' ( (lv_target_Locator_5_0= ruleAbstractAssociation2 ) ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4137:6: (otherlv_4= 'target-association:' ( (lv_target_Locator_5_0= ruleAbstractAssociation2 ) ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4137:8: otherlv_4= 'target-association:' ( (lv_target_Locator_5_0= ruleAbstractAssociation2 ) )
                    {
                    otherlv_4=(Token)match(input,82,FOLLOW_82_in_ruleEdgeDomainElement8830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEdgeDomainElementAccess().getTargetAssociationKeyword_2_1_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4141:1: ( (lv_target_Locator_5_0= ruleAbstractAssociation2 ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4142:1: (lv_target_Locator_5_0= ruleAbstractAssociation2 )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4142:1: (lv_target_Locator_5_0= ruleAbstractAssociation2 )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4143:3: lv_target_Locator_5_0= ruleAbstractAssociation2
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeDomainElementAccess().getTarget_LocatorAbstractAssociation2ParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAbstractAssociation2_in_ruleEdgeDomainElement8851);
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

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4159:4: ( (otherlv_6= 'source-query:' ( (lv_source_query_7_0= RULE_STRING ) ) ) | (otherlv_8= 'source-association:' ( (lv_source_Locator_9_0= ruleAbstractAssociation2 ) ) ) )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==83) ) {
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4159:5: (otherlv_6= 'source-query:' ( (lv_source_query_7_0= RULE_STRING ) ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4159:5: (otherlv_6= 'source-query:' ( (lv_source_query_7_0= RULE_STRING ) ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4159:7: otherlv_6= 'source-query:' ( (lv_source_query_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,83,FOLLOW_83_in_ruleEdgeDomainElement8867); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEdgeDomainElementAccess().getSourceQueryKeyword_3_0_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4163:1: ( (lv_source_query_7_0= RULE_STRING ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4164:1: (lv_source_query_7_0= RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4164:1: (lv_source_query_7_0= RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4165:3: lv_source_query_7_0= RULE_STRING
                    {
                    lv_source_query_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEdgeDomainElement8884); if (state.failed) return current;
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4182:6: (otherlv_8= 'source-association:' ( (lv_source_Locator_9_0= ruleAbstractAssociation2 ) ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4182:6: (otherlv_8= 'source-association:' ( (lv_source_Locator_9_0= ruleAbstractAssociation2 ) ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4182:8: otherlv_8= 'source-association:' ( (lv_source_Locator_9_0= ruleAbstractAssociation2 ) )
                    {
                    otherlv_8=(Token)match(input,84,FOLLOW_84_in_ruleEdgeDomainElement8909); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEdgeDomainElementAccess().getSourceAssociationKeyword_3_1_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4186:1: ( (lv_source_Locator_9_0= ruleAbstractAssociation2 ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4187:1: (lv_source_Locator_9_0= ruleAbstractAssociation2 )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4187:1: (lv_source_Locator_9_0= ruleAbstractAssociation2 )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4188:3: lv_source_Locator_9_0= ruleAbstractAssociation2
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeDomainElementAccess().getSource_LocatorAbstractAssociation2ParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAbstractAssociation2_in_ruleEdgeDomainElement8930);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4212:1: entryRuleAbstractClass returns [EObject current=null] : iv_ruleAbstractClass= ruleAbstractClass EOF ;
    public final EObject entryRuleAbstractClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractClass = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4213:2: (iv_ruleAbstractClass= ruleAbstractClass EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4214:2: iv_ruleAbstractClass= ruleAbstractClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractClassRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractClass_in_entryRuleAbstractClass8968);
            iv_ruleAbstractClass=ruleAbstractClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractClass8978); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4221:1: ruleAbstractClass returns [EObject current=null] : (this_LocalClass2_0= ruleLocalClass2 | this_ExternalClass_1= ruleExternalClass ) ;
    public final EObject ruleAbstractClass() throws RecognitionException {
        EObject current = null;

        EObject this_LocalClass2_0 = null;

        EObject this_ExternalClass_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4224:28: ( (this_LocalClass2_0= ruleLocalClass2 | this_ExternalClass_1= ruleExternalClass ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4225:1: (this_LocalClass2_0= ruleLocalClass2 | this_ExternalClass_1= ruleExternalClass )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4225:1: (this_LocalClass2_0= ruleLocalClass2 | this_ExternalClass_1= ruleExternalClass )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_ID) ) {
                alt97=1;
            }
            else if ( (LA97_0==12) ) {
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4226:5: this_LocalClass2_0= ruleLocalClass2
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractClassAccess().getLocalClass2ParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLocalClass2_in_ruleAbstractClass9025);
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4236:5: this_ExternalClass_1= ruleExternalClass
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractClassAccess().getExternalClassParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExternalClass_in_ruleAbstractClass9052);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4252:1: entryRuleLocalClass2 returns [EObject current=null] : iv_ruleLocalClass2= ruleLocalClass2 EOF ;
    public final EObject entryRuleLocalClass2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalClass2 = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4253:2: (iv_ruleLocalClass2= ruleLocalClass2 EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4254:2: iv_ruleLocalClass2= ruleLocalClass2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalClass2Rule()); 
            }
            pushFollow(FOLLOW_ruleLocalClass2_in_entryRuleLocalClass29087);
            iv_ruleLocalClass2=ruleLocalClass2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalClass2; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalClass29097); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4261:1: ruleLocalClass2 returns [EObject current=null] : ( () ( ( ruleFQN ) ) ) ;
    public final EObject ruleLocalClass2() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4264:28: ( ( () ( ( ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4265:1: ( () ( ( ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4265:1: ( () ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4265:2: () ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4265:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4266:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalClass2Access().getLocalClassAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4271:2: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4272:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4272:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4273:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalClass2Rule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalClass2Access().getClassClassCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleLocalClass29154);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4294:1: entryRuleExternalClass returns [EObject current=null] : iv_ruleExternalClass= ruleExternalClass EOF ;
    public final EObject entryRuleExternalClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalClass = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4295:2: (iv_ruleExternalClass= ruleExternalClass EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4296:2: iv_ruleExternalClass= ruleExternalClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternalClassRule()); 
            }
            pushFollow(FOLLOW_ruleExternalClass_in_entryRuleExternalClass9190);
            iv_ruleExternalClass=ruleExternalClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternalClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalClass9200); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4303:1: ruleExternalClass returns [EObject current=null] : ( () otherlv_1= 'external' ( ( ruleFQN ) ) ) ;
    public final EObject ruleExternalClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4306:28: ( ( () otherlv_1= 'external' ( ( ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4307:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4307:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4307:2: () otherlv_1= 'external' ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4307:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4308:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExternalClassAccess().getExternalClassAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleExternalClass9246); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExternalClassAccess().getExternalKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4317:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4318:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4318:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4319:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExternalClassRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExternalClassAccess().getClassEClassCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleExternalClass9269);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4340:1: entryRuleAbstractAssociation2 returns [EObject current=null] : iv_ruleAbstractAssociation2= ruleAbstractAssociation2 EOF ;
    public final EObject entryRuleAbstractAssociation2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAssociation2 = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4341:2: (iv_ruleAbstractAssociation2= ruleAbstractAssociation2 EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4342:2: iv_ruleAbstractAssociation2= ruleAbstractAssociation2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractAssociation2Rule()); 
            }
            pushFollow(FOLLOW_ruleAbstractAssociation2_in_entryRuleAbstractAssociation29305);
            iv_ruleAbstractAssociation2=ruleAbstractAssociation2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractAssociation2; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractAssociation29315); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4349:1: ruleAbstractAssociation2 returns [EObject current=null] : (this_ExternalAssociation_0= ruleExternalAssociation | this_LocalAssociation_1= ruleLocalAssociation ) ;
    public final EObject ruleAbstractAssociation2() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalAssociation_0 = null;

        EObject this_LocalAssociation_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4352:28: ( (this_ExternalAssociation_0= ruleExternalAssociation | this_LocalAssociation_1= ruleLocalAssociation ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4353:1: (this_ExternalAssociation_0= ruleExternalAssociation | this_LocalAssociation_1= ruleLocalAssociation )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4353:1: (this_ExternalAssociation_0= ruleExternalAssociation | this_LocalAssociation_1= ruleLocalAssociation )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==12) ) {
                alt98=1;
            }
            else if ( (LA98_0==RULE_ID) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4354:5: this_ExternalAssociation_0= ruleExternalAssociation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractAssociation2Access().getExternalAssociationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExternalAssociation_in_ruleAbstractAssociation29362);
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4364:5: this_LocalAssociation_1= ruleLocalAssociation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractAssociation2Access().getLocalAssociationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLocalAssociation_in_ruleAbstractAssociation29389);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4380:1: entryRuleLocalAssociation returns [EObject current=null] : iv_ruleLocalAssociation= ruleLocalAssociation EOF ;
    public final EObject entryRuleLocalAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalAssociation = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4381:2: (iv_ruleLocalAssociation= ruleLocalAssociation EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4382:2: iv_ruleLocalAssociation= ruleLocalAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalAssociationRule()); 
            }
            pushFollow(FOLLOW_ruleLocalAssociation_in_entryRuleLocalAssociation9424);
            iv_ruleLocalAssociation=ruleLocalAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalAssociation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalAssociation9434); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4389:1: ruleLocalAssociation returns [EObject current=null] : ( () ( ( ruleFQN ) ) ) ;
    public final EObject ruleLocalAssociation() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4392:28: ( ( () ( ( ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4393:1: ( () ( ( ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4393:1: ( () ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4393:2: () ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4393:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4394:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalAssociationAccess().getLocalAssociationAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4399:2: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4400:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4400:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4401:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalAssociationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalAssociationAccess().getReferenceAbstractAssociationCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleLocalAssociation9491);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4422:1: entryRuleExternalAssociation returns [EObject current=null] : iv_ruleExternalAssociation= ruleExternalAssociation EOF ;
    public final EObject entryRuleExternalAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalAssociation = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4423:2: (iv_ruleExternalAssociation= ruleExternalAssociation EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4424:2: iv_ruleExternalAssociation= ruleExternalAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternalAssociationRule()); 
            }
            pushFollow(FOLLOW_ruleExternalAssociation_in_entryRuleExternalAssociation9527);
            iv_ruleExternalAssociation=ruleExternalAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternalAssociation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalAssociation9537); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4431:1: ruleExternalAssociation returns [EObject current=null] : ( () otherlv_1= 'external' ( ( ruleFQN ) ) ) ;
    public final EObject ruleExternalAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4434:28: ( ( () otherlv_1= 'external' ( ( ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4435:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4435:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4435:2: () otherlv_1= 'external' ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4435:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4436:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExternalAssociationAccess().getExternalAssociationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleExternalAssociation9583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExternalAssociationAccess().getExternalKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4445:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4446:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4446:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4447:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExternalAssociationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExternalAssociationAccess().getReferenceEReferenceCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleExternalAssociation9606);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4470:1: entryRuleLocalAttribute returns [EObject current=null] : iv_ruleLocalAttribute= ruleLocalAttribute EOF ;
    public final EObject entryRuleLocalAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalAttribute = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4471:2: (iv_ruleLocalAttribute= ruleLocalAttribute EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4472:2: iv_ruleLocalAttribute= ruleLocalAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleLocalAttribute_in_entryRuleLocalAttribute9644);
            iv_ruleLocalAttribute=ruleLocalAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalAttribute9654); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4479:1: ruleLocalAttribute returns [EObject current=null] : ( () ( ( ruleFQN ) ) ) ;
    public final EObject ruleLocalAttribute() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4482:28: ( ( () ( ( ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4483:1: ( () ( ( ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4483:1: ( () ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4483:2: () ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4483:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4484:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalAttributeAccess().getLocalAttributeAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4489:2: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4490:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4490:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4491:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalAttributeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalAttributeAccess().getAttributeAttributeCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleLocalAttribute9711);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4512:1: entryRuleExternalAttribute returns [EObject current=null] : iv_ruleExternalAttribute= ruleExternalAttribute EOF ;
    public final EObject entryRuleExternalAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalAttribute = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4513:2: (iv_ruleExternalAttribute= ruleExternalAttribute EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4514:2: iv_ruleExternalAttribute= ruleExternalAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternalAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleExternalAttribute_in_entryRuleExternalAttribute9747);
            iv_ruleExternalAttribute=ruleExternalAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternalAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalAttribute9757); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4521:1: ruleExternalAttribute returns [EObject current=null] : ( () otherlv_1= 'external' ( ( ruleFQN ) ) ) ;
    public final EObject ruleExternalAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4524:28: ( ( () otherlv_1= 'external' ( ( ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4525:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4525:1: ( () otherlv_1= 'external' ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4525:2: () otherlv_1= 'external' ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4525:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4526:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExternalAttributeAccess().getExternalAttributeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleExternalAttribute9803); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExternalAttributeAccess().getExternalKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4535:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4536:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4536:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4537:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExternalAttributeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExternalAttributeAccess().getAttributeEAttributeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleExternalAttribute9826);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4558:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4559:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4560:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression9862);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression9872); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4567:1: ruleExpression returns [EObject current=null] : ( () ( ( (lv_expressionElements_1_0= ruleExpressionElement ) ) (otherlv_2= '+' ( (lv_expressionElements_3_0= ruleExpressionElement ) ) )* )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressionElements_1_0 = null;

        EObject lv_expressionElements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4570:28: ( ( () ( ( (lv_expressionElements_1_0= ruleExpressionElement ) ) (otherlv_2= '+' ( (lv_expressionElements_3_0= ruleExpressionElement ) ) )* )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4571:1: ( () ( ( (lv_expressionElements_1_0= ruleExpressionElement ) ) (otherlv_2= '+' ( (lv_expressionElements_3_0= ruleExpressionElement ) ) )* )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4571:1: ( () ( ( (lv_expressionElements_1_0= ruleExpressionElement ) ) (otherlv_2= '+' ( (lv_expressionElements_3_0= ruleExpressionElement ) ) )* )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4571:2: () ( ( (lv_expressionElements_1_0= ruleExpressionElement ) ) (otherlv_2= '+' ( (lv_expressionElements_3_0= ruleExpressionElement ) ) )* )?
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4571:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4572:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionAccess().getExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4577:2: ( ( (lv_expressionElements_1_0= ruleExpressionElement ) ) (otherlv_2= '+' ( (lv_expressionElements_3_0= ruleExpressionElement ) ) )* )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( ((LA100_0>=RULE_STRING && LA100_0<=RULE_ID)||LA100_0==86) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4577:3: ( (lv_expressionElements_1_0= ruleExpressionElement ) ) (otherlv_2= '+' ( (lv_expressionElements_3_0= ruleExpressionElement ) ) )*
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4577:3: ( (lv_expressionElements_1_0= ruleExpressionElement ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4578:1: (lv_expressionElements_1_0= ruleExpressionElement )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4578:1: (lv_expressionElements_1_0= ruleExpressionElement )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4579:3: lv_expressionElements_1_0= ruleExpressionElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionElementsExpressionElementParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpressionElement_in_ruleExpression9928);
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

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4595:2: (otherlv_2= '+' ( (lv_expressionElements_3_0= ruleExpressionElement ) ) )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==85) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4595:4: otherlv_2= '+' ( (lv_expressionElements_3_0= ruleExpressionElement ) )
                    	    {
                    	    otherlv_2=(Token)match(input,85,FOLLOW_85_in_ruleExpression9941); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getPlusSignKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4599:1: ( (lv_expressionElements_3_0= ruleExpressionElement ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4600:1: (lv_expressionElements_3_0= ruleExpressionElement )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4600:1: (lv_expressionElements_3_0= ruleExpressionElement )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4601:3: lv_expressionElements_3_0= ruleExpressionElement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionElementsExpressionElementParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpressionElement_in_ruleExpression9962);
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
                    	    break loop99;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4625:1: entryRuleExpressionElement returns [EObject current=null] : iv_ruleExpressionElement= ruleExpressionElement EOF ;
    public final EObject entryRuleExpressionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionElement = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4626:2: (iv_ruleExpressionElement= ruleExpressionElement EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4627:2: iv_ruleExpressionElement= ruleExpressionElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionElementRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionElement_in_entryRuleExpressionElement10002);
            iv_ruleExpressionElement=ruleExpressionElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionElement10012); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4634:1: ruleExpressionElement returns [EObject current=null] : (this_ForeignExpressionElement_0= ruleForeignExpressionElement | this_StringElement_1= ruleStringElement ) ;
    public final EObject ruleExpressionElement() throws RecognitionException {
        EObject current = null;

        EObject this_ForeignExpressionElement_0 = null;

        EObject this_StringElement_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4637:28: ( (this_ForeignExpressionElement_0= ruleForeignExpressionElement | this_StringElement_1= ruleStringElement ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4638:1: (this_ForeignExpressionElement_0= ruleForeignExpressionElement | this_StringElement_1= ruleStringElement )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4638:1: (this_ForeignExpressionElement_0= ruleForeignExpressionElement | this_StringElement_1= ruleStringElement )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RULE_ID||LA101_0==86) ) {
                alt101=1;
            }
            else if ( (LA101_0==RULE_STRING) ) {
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4639:5: this_ForeignExpressionElement_0= ruleForeignExpressionElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionElementAccess().getForeignExpressionElementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleForeignExpressionElement_in_ruleExpressionElement10059);
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4649:5: this_StringElement_1= ruleStringElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionElementAccess().getStringElementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringElement_in_ruleExpressionElement10086);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4665:1: entryRuleForeignExpressionElement returns [EObject current=null] : iv_ruleForeignExpressionElement= ruleForeignExpressionElement EOF ;
    public final EObject entryRuleForeignExpressionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignExpressionElement = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4666:2: (iv_ruleForeignExpressionElement= ruleForeignExpressionElement EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4667:2: iv_ruleForeignExpressionElement= ruleForeignExpressionElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForeignExpressionElementRule()); 
            }
            pushFollow(FOLLOW_ruleForeignExpressionElement_in_entryRuleForeignExpressionElement10121);
            iv_ruleForeignExpressionElement=ruleForeignExpressionElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForeignExpressionElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeignExpressionElement10131); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4674:1: ruleForeignExpressionElement returns [EObject current=null] : (this_JavaElement_0= ruleJavaElement | this_DomainElement_1= ruleDomainElement ) ;
    public final EObject ruleForeignExpressionElement() throws RecognitionException {
        EObject current = null;

        EObject this_JavaElement_0 = null;

        EObject this_DomainElement_1 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4677:28: ( (this_JavaElement_0= ruleJavaElement | this_DomainElement_1= ruleDomainElement ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4678:1: (this_JavaElement_0= ruleJavaElement | this_DomainElement_1= ruleDomainElement )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4678:1: (this_JavaElement_0= ruleJavaElement | this_DomainElement_1= ruleDomainElement )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==86) ) {
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4679:5: this_JavaElement_0= ruleJavaElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getForeignExpressionElementAccess().getJavaElementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJavaElement_in_ruleForeignExpressionElement10178);
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4689:5: this_DomainElement_1= ruleDomainElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getForeignExpressionElementAccess().getDomainElementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDomainElement_in_ruleForeignExpressionElement10205);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4705:1: entryRuleJavaElement returns [EObject current=null] : iv_ruleJavaElement= ruleJavaElement EOF ;
    public final EObject entryRuleJavaElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaElement = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4706:2: (iv_ruleJavaElement= ruleJavaElement EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4707:2: iv_ruleJavaElement= ruleJavaElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJavaElementRule()); 
            }
            pushFollow(FOLLOW_ruleJavaElement_in_entryRuleJavaElement10240);
            iv_ruleJavaElement=ruleJavaElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJavaElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaElement10250); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4714:1: ruleJavaElement returns [EObject current=null] : ( () otherlv_1= 'Java' ( (lv_method_2_0= ruleFQN ) ) ) ;
    public final EObject ruleJavaElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_method_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4717:28: ( ( () otherlv_1= 'Java' ( (lv_method_2_0= ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4718:1: ( () otherlv_1= 'Java' ( (lv_method_2_0= ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4718:1: ( () otherlv_1= 'Java' ( (lv_method_2_0= ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4718:2: () otherlv_1= 'Java' ( (lv_method_2_0= ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4718:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4719:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJavaElementAccess().getJavaElementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,86,FOLLOW_86_in_ruleJavaElement10296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJavaElementAccess().getJavaKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4728:1: ( (lv_method_2_0= ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4729:1: (lv_method_2_0= ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4729:1: (lv_method_2_0= ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4730:3: lv_method_2_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJavaElementAccess().getMethodFQNParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleJavaElement10317);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4754:1: entryRuleDomainElement returns [EObject current=null] : iv_ruleDomainElement= ruleDomainElement EOF ;
    public final EObject entryRuleDomainElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainElement = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4755:2: (iv_ruleDomainElement= ruleDomainElement EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4756:2: iv_ruleDomainElement= ruleDomainElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainElementRule()); 
            }
            pushFollow(FOLLOW_ruleDomainElement_in_entryRuleDomainElement10353);
            iv_ruleDomainElement=ruleDomainElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainElement10363); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4763:1: ruleDomainElement returns [EObject current=null] : ( () ( ( ruleFQN ) ) ) ;
    public final EObject ruleDomainElement() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4766:28: ( ( () ( ( ruleFQN ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4767:1: ( () ( ( ruleFQN ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4767:1: ( () ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4767:2: () ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4767:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4768:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDomainElementAccess().getDomainElementAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4773:2: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4774:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4774:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4775:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDomainElementRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDomainElementAccess().getAttributeAttributeCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleDomainElement10420);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4796:1: entryRuleStringElement returns [EObject current=null] : iv_ruleStringElement= ruleStringElement EOF ;
    public final EObject entryRuleStringElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringElement = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4797:2: (iv_ruleStringElement= ruleStringElement EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4798:2: iv_ruleStringElement= ruleStringElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringElementRule()); 
            }
            pushFollow(FOLLOW_ruleStringElement_in_entryRuleStringElement10456);
            iv_ruleStringElement=ruleStringElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringElement10466); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4805:1: ruleStringElement returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringElement() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4808:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4809:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4809:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4809:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4809:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4810:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringElementAccess().getStringElementAction_0(),
                          current);
                  
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4815:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4816:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4816:1: (lv_value_1_0= RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4817:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringElement10517); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4841:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4842:2: (iv_ruleEString= ruleEString EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4843:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString10559);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString10570); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4850:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4853:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4854:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4854:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==RULE_STRING) ) {
                alt103=1;
            }
            else if ( (LA103_0==RULE_ID) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4854:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString10610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4862:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString10636); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4877:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4878:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4879:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN10682);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN10693); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4886:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4889:28: ( (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4890:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4890:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4890:6: this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN10733); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4897:1: (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==87) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4898:2: kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    {
            	    kw=(Token)match(input,87,FOLLOW_87_in_ruleFQN10752); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4903:1: ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4903:2: ( RULE_ID )=>this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN10773); if (state.failed) return current;
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
            	    break loop104;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4920:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4921:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4922:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_ruleEInt_in_entryRuleEInt10824);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEInt10835); if (state.failed) return current;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4929:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4932:28: (this_INT_0= RULE_INT )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4933:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEInt10874); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4948:1: ruleNode_Form returns [Enumerator current=null] : ( (enumLiteral_0= 'Square' ) | (enumLiteral_1= 'Lozenge' ) | (enumLiteral_2= 'Eclipse' ) | (enumLiteral_3= 'Note' ) | (enumLiteral_4= 'Dot' ) | (enumLiteral_5= 'Triangle' ) | (enumLiteral_6= 'Stroke' ) | (enumLiteral_7= 'Ring' ) ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4950:28: ( ( (enumLiteral_0= 'Square' ) | (enumLiteral_1= 'Lozenge' ) | (enumLiteral_2= 'Eclipse' ) | (enumLiteral_3= 'Note' ) | (enumLiteral_4= 'Dot' ) | (enumLiteral_5= 'Triangle' ) | (enumLiteral_6= 'Stroke' ) | (enumLiteral_7= 'Ring' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4951:1: ( (enumLiteral_0= 'Square' ) | (enumLiteral_1= 'Lozenge' ) | (enumLiteral_2= 'Eclipse' ) | (enumLiteral_3= 'Note' ) | (enumLiteral_4= 'Dot' ) | (enumLiteral_5= 'Triangle' ) | (enumLiteral_6= 'Stroke' ) | (enumLiteral_7= 'Ring' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4951:1: ( (enumLiteral_0= 'Square' ) | (enumLiteral_1= 'Lozenge' ) | (enumLiteral_2= 'Eclipse' ) | (enumLiteral_3= 'Note' ) | (enumLiteral_4= 'Dot' ) | (enumLiteral_5= 'Triangle' ) | (enumLiteral_6= 'Stroke' ) | (enumLiteral_7= 'Ring' ) )
            int alt105=8;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt105=1;
                }
                break;
            case 89:
                {
                alt105=2;
                }
                break;
            case 90:
                {
                alt105=3;
                }
                break;
            case 91:
                {
                alt105=4;
                }
                break;
            case 92:
                {
                alt105=5;
                }
                break;
            case 93:
                {
                alt105=6;
                }
                break;
            case 94:
                {
                alt105=7;
                }
                break;
            case 95:
                {
                alt105=8;
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4951:2: (enumLiteral_0= 'Square' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4951:2: (enumLiteral_0= 'Square' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4951:4: enumLiteral_0= 'Square'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_88_in_ruleNode_Form10932); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getNode_FormAccess().getSquareEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getNode_FormAccess().getSquareEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4957:6: (enumLiteral_1= 'Lozenge' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4957:6: (enumLiteral_1= 'Lozenge' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4957:8: enumLiteral_1= 'Lozenge'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_89_in_ruleNode_Form10949); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getNode_FormAccess().getLozengeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getNode_FormAccess().getLozengeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4963:6: (enumLiteral_2= 'Eclipse' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4963:6: (enumLiteral_2= 'Eclipse' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4963:8: enumLiteral_2= 'Eclipse'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_90_in_ruleNode_Form10966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getNode_FormAccess().getEclipseEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getNode_FormAccess().getEclipseEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4969:6: (enumLiteral_3= 'Note' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4969:6: (enumLiteral_3= 'Note' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4969:8: enumLiteral_3= 'Note'
                    {
                    enumLiteral_3=(Token)match(input,91,FOLLOW_91_in_ruleNode_Form10983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getNode_FormAccess().getNoteEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getNode_FormAccess().getNoteEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4975:6: (enumLiteral_4= 'Dot' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4975:6: (enumLiteral_4= 'Dot' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4975:8: enumLiteral_4= 'Dot'
                    {
                    enumLiteral_4=(Token)match(input,92,FOLLOW_92_in_ruleNode_Form11000); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getNode_FormAccess().getDotEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getNode_FormAccess().getDotEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4981:6: (enumLiteral_5= 'Triangle' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4981:6: (enumLiteral_5= 'Triangle' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4981:8: enumLiteral_5= 'Triangle'
                    {
                    enumLiteral_5=(Token)match(input,93,FOLLOW_93_in_ruleNode_Form11017); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getNode_FormAccess().getTriangleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getNode_FormAccess().getTriangleEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4987:6: (enumLiteral_6= 'Stroke' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4987:6: (enumLiteral_6= 'Stroke' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4987:8: enumLiteral_6= 'Stroke'
                    {
                    enumLiteral_6=(Token)match(input,94,FOLLOW_94_in_ruleNode_Form11034); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getNode_FormAccess().getStrokeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getNode_FormAccess().getStrokeEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4993:6: (enumLiteral_7= 'Ring' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4993:6: (enumLiteral_7= 'Ring' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:4993:8: enumLiteral_7= 'Ring'
                    {
                    enumLiteral_7=(Token)match(input,95,FOLLOW_95_in_ruleNode_Form11051); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5003:1: ruleBackgroundStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'GradientLeftToRight' ) | (enumLiteral_1= 'Liquid' ) | (enumLiteral_2= 'GradientTopToBottom' ) ) ;
    public final Enumerator ruleBackgroundStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5005:28: ( ( (enumLiteral_0= 'GradientLeftToRight' ) | (enumLiteral_1= 'Liquid' ) | (enumLiteral_2= 'GradientTopToBottom' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5006:1: ( (enumLiteral_0= 'GradientLeftToRight' ) | (enumLiteral_1= 'Liquid' ) | (enumLiteral_2= 'GradientTopToBottom' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5006:1: ( (enumLiteral_0= 'GradientLeftToRight' ) | (enumLiteral_1= 'Liquid' ) | (enumLiteral_2= 'GradientTopToBottom' ) )
            int alt106=3;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt106=1;
                }
                break;
            case 97:
                {
                alt106=2;
                }
                break;
            case 98:
                {
                alt106=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5006:2: (enumLiteral_0= 'GradientLeftToRight' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5006:2: (enumLiteral_0= 'GradientLeftToRight' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5006:4: enumLiteral_0= 'GradientLeftToRight'
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_96_in_ruleBackgroundStyle11096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBackgroundStyleAccess().getGradientLeftToRightEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBackgroundStyleAccess().getGradientLeftToRightEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5012:6: (enumLiteral_1= 'Liquid' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5012:6: (enumLiteral_1= 'Liquid' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5012:8: enumLiteral_1= 'Liquid'
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_97_in_ruleBackgroundStyle11113); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBackgroundStyleAccess().getLiquidEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getBackgroundStyleAccess().getLiquidEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5018:6: (enumLiteral_2= 'GradientTopToBottom' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5018:6: (enumLiteral_2= 'GradientTopToBottom' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5018:8: enumLiteral_2= 'GradientTopToBottom'
                    {
                    enumLiteral_2=(Token)match(input,98,FOLLOW_98_in_ruleBackgroundStyle11130); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5028:1: ruleLabelPosition returns [Enumerator current=null] : ( (enumLiteral_0= 'border' ) | (enumLiteral_1= 'node' ) ) ;
    public final Enumerator ruleLabelPosition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5030:28: ( ( (enumLiteral_0= 'border' ) | (enumLiteral_1= 'node' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5031:1: ( (enumLiteral_0= 'border' ) | (enumLiteral_1= 'node' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5031:1: ( (enumLiteral_0= 'border' ) | (enumLiteral_1= 'node' ) )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==99) ) {
                alt107=1;
            }
            else if ( (LA107_0==100) ) {
                alt107=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5031:2: (enumLiteral_0= 'border' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5031:2: (enumLiteral_0= 'border' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5031:4: enumLiteral_0= 'border'
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_99_in_ruleLabelPosition11175); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLabelPositionAccess().getBorderEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getLabelPositionAccess().getBorderEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5037:6: (enumLiteral_1= 'node' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5037:6: (enumLiteral_1= 'node' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5037:8: enumLiteral_1= 'node'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_100_in_ruleLabelPosition11192); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5047:1: ruleLabelAlignment returns [Enumerator current=null] : ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'right' ) ) ;
    public final Enumerator ruleLabelAlignment() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5049:28: ( ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'right' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5050:1: ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'right' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5050:1: ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'right' ) )
            int alt108=3;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt108=1;
                }
                break;
            case 102:
                {
                alt108=2;
                }
                break;
            case 103:
                {
                alt108=3;
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5050:2: (enumLiteral_0= 'center' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5050:2: (enumLiteral_0= 'center' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5050:4: enumLiteral_0= 'center'
                    {
                    enumLiteral_0=(Token)match(input,101,FOLLOW_101_in_ruleLabelAlignment11237); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLabelAlignmentAccess().getCENTEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getLabelAlignmentAccess().getCENTEREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5056:6: (enumLiteral_1= 'left' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5056:6: (enumLiteral_1= 'left' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5056:8: enumLiteral_1= 'left'
                    {
                    enumLiteral_1=(Token)match(input,102,FOLLOW_102_in_ruleLabelAlignment11254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLabelAlignmentAccess().getLEFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getLabelAlignmentAccess().getLEFTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5062:6: (enumLiteral_2= 'right' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5062:6: (enumLiteral_2= 'right' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5062:8: enumLiteral_2= 'right'
                    {
                    enumLiteral_2=(Token)match(input,103,FOLLOW_103_in_ruleLabelAlignment11271); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5072:1: ruleLineStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) ) ;
    public final Enumerator ruleLineStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5074:28: ( ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5075:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5075:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) )
            int alt109=4;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt109=1;
                }
                break;
            case 105:
                {
                alt109=2;
                }
                break;
            case 106:
                {
                alt109=3;
                }
                break;
            case 107:
                {
                alt109=4;
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5075:2: (enumLiteral_0= 'solid' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5075:2: (enumLiteral_0= 'solid' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5075:4: enumLiteral_0= 'solid'
                    {
                    enumLiteral_0=(Token)match(input,104,FOLLOW_104_in_ruleLineStyle11316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLineStyleAccess().getSolidEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getLineStyleAccess().getSolidEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5081:6: (enumLiteral_1= 'dash' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5081:6: (enumLiteral_1= 'dash' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5081:8: enumLiteral_1= 'dash'
                    {
                    enumLiteral_1=(Token)match(input,105,FOLLOW_105_in_ruleLineStyle11333); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLineStyleAccess().getDashEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getLineStyleAccess().getDashEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5087:6: (enumLiteral_2= 'dot' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5087:6: (enumLiteral_2= 'dot' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5087:8: enumLiteral_2= 'dot'
                    {
                    enumLiteral_2=(Token)match(input,106,FOLLOW_106_in_ruleLineStyle11350); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLineStyleAccess().getDotEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getLineStyleAccess().getDotEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5093:6: (enumLiteral_3= 'dash_dot' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5093:6: (enumLiteral_3= 'dash_dot' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5093:8: enumLiteral_3= 'dash_dot'
                    {
                    enumLiteral_3=(Token)match(input,107,FOLLOW_107_in_ruleLineStyle11367); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5103:1: ruleEdgeArrows returns [Enumerator current=null] : ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWothFillDiamond' ) ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5105:28: ( ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWothFillDiamond' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5106:1: ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWothFillDiamond' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5106:1: ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWothFillDiamond' ) )
            int alt110=11;
            switch ( input.LA(1) ) {
            case 108:
                {
                alt110=1;
                }
                break;
            case 109:
                {
                alt110=2;
                }
                break;
            case 110:
                {
                alt110=3;
                }
                break;
            case 111:
                {
                alt110=4;
                }
                break;
            case 112:
                {
                alt110=5;
                }
                break;
            case 113:
                {
                alt110=6;
                }
                break;
            case 114:
                {
                alt110=7;
                }
                break;
            case 115:
                {
                alt110=8;
                }
                break;
            case 116:
                {
                alt110=9;
                }
                break;
            case 117:
                {
                alt110=10;
                }
                break;
            case 118:
                {
                alt110=11;
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5106:2: (enumLiteral_0= 'NoDecoration' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5106:2: (enumLiteral_0= 'NoDecoration' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5106:4: enumLiteral_0= 'NoDecoration'
                    {
                    enumLiteral_0=(Token)match(input,108,FOLLOW_108_in_ruleEdgeArrows11412); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEdgeArrowsAccess().getNoDecorationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getEdgeArrowsAccess().getNoDecorationEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5112:6: (enumLiteral_1= 'OutputArrow' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5112:6: (enumLiteral_1= 'OutputArrow' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5112:8: enumLiteral_1= 'OutputArrow'
                    {
                    enumLiteral_1=(Token)match(input,109,FOLLOW_109_in_ruleEdgeArrows11429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEdgeArrowsAccess().getOutputArrowEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getEdgeArrowsAccess().getOutputArrowEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5118:6: (enumLiteral_2= 'InputArrow' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5118:6: (enumLiteral_2= 'InputArrow' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5118:8: enumLiteral_2= 'InputArrow'
                    {
                    enumLiteral_2=(Token)match(input,110,FOLLOW_110_in_ruleEdgeArrows11446); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEdgeArrowsAccess().getInputArrowEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getEdgeArrowsAccess().getInputArrowEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5124:6: (enumLiteral_3= 'OutputClosedArrow' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5124:6: (enumLiteral_3= 'OutputClosedArrow' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5124:8: enumLiteral_3= 'OutputClosedArrow'
                    {
                    enumLiteral_3=(Token)match(input,111,FOLLOW_111_in_ruleEdgeArrows11463); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEdgeArrowsAccess().getOutputClosedArrowEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getEdgeArrowsAccess().getOutputClosedArrowEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5130:6: (enumLiteral_4= 'InputClosedArrow' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5130:6: (enumLiteral_4= 'InputClosedArrow' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5130:8: enumLiteral_4= 'InputClosedArrow'
                    {
                    enumLiteral_4=(Token)match(input,112,FOLLOW_112_in_ruleEdgeArrows11480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEdgeArrowsAccess().getInputClosedArrowEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getEdgeArrowsAccess().getInputClosedArrowEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5136:6: (enumLiteral_5= 'OutputFillClosedArrow' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5136:6: (enumLiteral_5= 'OutputFillClosedArrow' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5136:8: enumLiteral_5= 'OutputFillClosedArrow'
                    {
                    enumLiteral_5=(Token)match(input,113,FOLLOW_113_in_ruleEdgeArrows11497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEdgeArrowsAccess().getOutputFillClosedArrowEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getEdgeArrowsAccess().getOutputFillClosedArrowEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5142:6: (enumLiteral_6= 'InputFillClosedArrow' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5142:6: (enumLiteral_6= 'InputFillClosedArrow' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5142:8: enumLiteral_6= 'InputFillClosedArrow'
                    {
                    enumLiteral_6=(Token)match(input,114,FOLLOW_114_in_ruleEdgeArrows11514); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEdgeArrowsAccess().getInputFillClosedArrowEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getEdgeArrowsAccess().getInputFillClosedArrowEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5148:6: (enumLiteral_7= 'Diamond' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5148:6: (enumLiteral_7= 'Diamond' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5148:8: enumLiteral_7= 'Diamond'
                    {
                    enumLiteral_7=(Token)match(input,115,FOLLOW_115_in_ruleEdgeArrows11531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEdgeArrowsAccess().getDiamondEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getEdgeArrowsAccess().getDiamondEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5154:6: (enumLiteral_8= 'FillDiamond' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5154:6: (enumLiteral_8= 'FillDiamond' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5154:8: enumLiteral_8= 'FillDiamond'
                    {
                    enumLiteral_8=(Token)match(input,116,FOLLOW_116_in_ruleEdgeArrows11548); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEdgeArrowsAccess().getFillDiamondEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getEdgeArrowsAccess().getFillDiamondEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5160:6: (enumLiteral_9= 'InputArrowWithDiamond' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5160:6: (enumLiteral_9= 'InputArrowWithDiamond' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5160:8: enumLiteral_9= 'InputArrowWithDiamond'
                    {
                    enumLiteral_9=(Token)match(input,117,FOLLOW_117_in_ruleEdgeArrows11565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEdgeArrowsAccess().getInputArrowWithDiamondEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getEdgeArrowsAccess().getInputArrowWithDiamondEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5166:6: (enumLiteral_10= 'InputArrowWothFillDiamond' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5166:6: (enumLiteral_10= 'InputArrowWothFillDiamond' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5166:8: enumLiteral_10= 'InputArrowWothFillDiamond'
                    {
                    enumLiteral_10=(Token)match(input,118,FOLLOW_118_in_ruleEdgeArrows11582); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5176:1: ruleSystemColors returns [Enumerator current=null] : ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'red' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'yellow' ) | (enumLiteral_5= 'purple' ) | (enumLiteral_6= 'orange' ) | (enumLiteral_7= 'chocolate' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'white' ) | (enumLiteral_10= 'dark_blue' ) | (enumLiteral_11= 'dark_red' ) | (enumLiteral_12= 'dark_green' ) | (enumLiteral_13= 'dark_yellow' ) | (enumLiteral_14= 'dark_purple' ) | (enumLiteral_15= 'dark_orange' ) | (enumLiteral_16= 'dark_chocolate' ) | (enumLiteral_17= 'dark_gray' ) | (enumLiteral_18= 'light_blue' ) | (enumLiteral_19= 'light_red' ) | (enumLiteral_20= 'light_green' ) | (enumLiteral_21= 'light_yellow' ) | (enumLiteral_22= 'light_purple' ) | (enumLiteral_23= 'light_orange' ) | (enumLiteral_24= 'light_chocolate' ) | (enumLiteral_25= 'light_gray' ) ) ;
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
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5178:28: ( ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'red' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'yellow' ) | (enumLiteral_5= 'purple' ) | (enumLiteral_6= 'orange' ) | (enumLiteral_7= 'chocolate' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'white' ) | (enumLiteral_10= 'dark_blue' ) | (enumLiteral_11= 'dark_red' ) | (enumLiteral_12= 'dark_green' ) | (enumLiteral_13= 'dark_yellow' ) | (enumLiteral_14= 'dark_purple' ) | (enumLiteral_15= 'dark_orange' ) | (enumLiteral_16= 'dark_chocolate' ) | (enumLiteral_17= 'dark_gray' ) | (enumLiteral_18= 'light_blue' ) | (enumLiteral_19= 'light_red' ) | (enumLiteral_20= 'light_green' ) | (enumLiteral_21= 'light_yellow' ) | (enumLiteral_22= 'light_purple' ) | (enumLiteral_23= 'light_orange' ) | (enumLiteral_24= 'light_chocolate' ) | (enumLiteral_25= 'light_gray' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5179:1: ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'red' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'yellow' ) | (enumLiteral_5= 'purple' ) | (enumLiteral_6= 'orange' ) | (enumLiteral_7= 'chocolate' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'white' ) | (enumLiteral_10= 'dark_blue' ) | (enumLiteral_11= 'dark_red' ) | (enumLiteral_12= 'dark_green' ) | (enumLiteral_13= 'dark_yellow' ) | (enumLiteral_14= 'dark_purple' ) | (enumLiteral_15= 'dark_orange' ) | (enumLiteral_16= 'dark_chocolate' ) | (enumLiteral_17= 'dark_gray' ) | (enumLiteral_18= 'light_blue' ) | (enumLiteral_19= 'light_red' ) | (enumLiteral_20= 'light_green' ) | (enumLiteral_21= 'light_yellow' ) | (enumLiteral_22= 'light_purple' ) | (enumLiteral_23= 'light_orange' ) | (enumLiteral_24= 'light_chocolate' ) | (enumLiteral_25= 'light_gray' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5179:1: ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'red' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'yellow' ) | (enumLiteral_5= 'purple' ) | (enumLiteral_6= 'orange' ) | (enumLiteral_7= 'chocolate' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'white' ) | (enumLiteral_10= 'dark_blue' ) | (enumLiteral_11= 'dark_red' ) | (enumLiteral_12= 'dark_green' ) | (enumLiteral_13= 'dark_yellow' ) | (enumLiteral_14= 'dark_purple' ) | (enumLiteral_15= 'dark_orange' ) | (enumLiteral_16= 'dark_chocolate' ) | (enumLiteral_17= 'dark_gray' ) | (enumLiteral_18= 'light_blue' ) | (enumLiteral_19= 'light_red' ) | (enumLiteral_20= 'light_green' ) | (enumLiteral_21= 'light_yellow' ) | (enumLiteral_22= 'light_purple' ) | (enumLiteral_23= 'light_orange' ) | (enumLiteral_24= 'light_chocolate' ) | (enumLiteral_25= 'light_gray' ) )
            int alt111=26;
            switch ( input.LA(1) ) {
            case 119:
                {
                alt111=1;
                }
                break;
            case 120:
                {
                alt111=2;
                }
                break;
            case 121:
                {
                alt111=3;
                }
                break;
            case 122:
                {
                alt111=4;
                }
                break;
            case 123:
                {
                alt111=5;
                }
                break;
            case 124:
                {
                alt111=6;
                }
                break;
            case 125:
                {
                alt111=7;
                }
                break;
            case 126:
                {
                alt111=8;
                }
                break;
            case 127:
                {
                alt111=9;
                }
                break;
            case 128:
                {
                alt111=10;
                }
                break;
            case 129:
                {
                alt111=11;
                }
                break;
            case 130:
                {
                alt111=12;
                }
                break;
            case 131:
                {
                alt111=13;
                }
                break;
            case 132:
                {
                alt111=14;
                }
                break;
            case 133:
                {
                alt111=15;
                }
                break;
            case 134:
                {
                alt111=16;
                }
                break;
            case 135:
                {
                alt111=17;
                }
                break;
            case 136:
                {
                alt111=18;
                }
                break;
            case 137:
                {
                alt111=19;
                }
                break;
            case 138:
                {
                alt111=20;
                }
                break;
            case 139:
                {
                alt111=21;
                }
                break;
            case 140:
                {
                alt111=22;
                }
                break;
            case 141:
                {
                alt111=23;
                }
                break;
            case 142:
                {
                alt111=24;
                }
                break;
            case 143:
                {
                alt111=25;
                }
                break;
            case 144:
                {
                alt111=26;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5179:2: (enumLiteral_0= 'black' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5179:2: (enumLiteral_0= 'black' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5179:4: enumLiteral_0= 'black'
                    {
                    enumLiteral_0=(Token)match(input,119,FOLLOW_119_in_ruleSystemColors11627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getBlackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSystemColorsAccess().getBlackEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5185:6: (enumLiteral_1= 'blue' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5185:6: (enumLiteral_1= 'blue' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5185:8: enumLiteral_1= 'blue'
                    {
                    enumLiteral_1=(Token)match(input,120,FOLLOW_120_in_ruleSystemColors11644); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getBlueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSystemColorsAccess().getBlueEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5191:6: (enumLiteral_2= 'red' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5191:6: (enumLiteral_2= 'red' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5191:8: enumLiteral_2= 'red'
                    {
                    enumLiteral_2=(Token)match(input,121,FOLLOW_121_in_ruleSystemColors11661); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getRedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getSystemColorsAccess().getRedEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5197:6: (enumLiteral_3= 'green' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5197:6: (enumLiteral_3= 'green' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5197:8: enumLiteral_3= 'green'
                    {
                    enumLiteral_3=(Token)match(input,122,FOLLOW_122_in_ruleSystemColors11678); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getGreenEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getSystemColorsAccess().getGreenEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5203:6: (enumLiteral_4= 'yellow' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5203:6: (enumLiteral_4= 'yellow' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5203:8: enumLiteral_4= 'yellow'
                    {
                    enumLiteral_4=(Token)match(input,123,FOLLOW_123_in_ruleSystemColors11695); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getYellowEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getSystemColorsAccess().getYellowEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5209:6: (enumLiteral_5= 'purple' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5209:6: (enumLiteral_5= 'purple' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5209:8: enumLiteral_5= 'purple'
                    {
                    enumLiteral_5=(Token)match(input,124,FOLLOW_124_in_ruleSystemColors11712); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getPurpleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getSystemColorsAccess().getPurpleEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5215:6: (enumLiteral_6= 'orange' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5215:6: (enumLiteral_6= 'orange' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5215:8: enumLiteral_6= 'orange'
                    {
                    enumLiteral_6=(Token)match(input,125,FOLLOW_125_in_ruleSystemColors11729); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getOrangeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getSystemColorsAccess().getOrangeEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5221:6: (enumLiteral_7= 'chocolate' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5221:6: (enumLiteral_7= 'chocolate' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5221:8: enumLiteral_7= 'chocolate'
                    {
                    enumLiteral_7=(Token)match(input,126,FOLLOW_126_in_ruleSystemColors11746); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getChocolateEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getSystemColorsAccess().getChocolateEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5227:6: (enumLiteral_8= 'gray' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5227:6: (enumLiteral_8= 'gray' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5227:8: enumLiteral_8= 'gray'
                    {
                    enumLiteral_8=(Token)match(input,127,FOLLOW_127_in_ruleSystemColors11763); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getGrayEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getSystemColorsAccess().getGrayEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5233:6: (enumLiteral_9= 'white' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5233:6: (enumLiteral_9= 'white' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5233:8: enumLiteral_9= 'white'
                    {
                    enumLiteral_9=(Token)match(input,128,FOLLOW_128_in_ruleSystemColors11780); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getWhiteEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getSystemColorsAccess().getWhiteEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5239:6: (enumLiteral_10= 'dark_blue' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5239:6: (enumLiteral_10= 'dark_blue' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5239:8: enumLiteral_10= 'dark_blue'
                    {
                    enumLiteral_10=(Token)match(input,129,FOLLOW_129_in_ruleSystemColors11797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getDark_blueEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getSystemColorsAccess().getDark_blueEnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5245:6: (enumLiteral_11= 'dark_red' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5245:6: (enumLiteral_11= 'dark_red' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5245:8: enumLiteral_11= 'dark_red'
                    {
                    enumLiteral_11=(Token)match(input,130,FOLLOW_130_in_ruleSystemColors11814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getDark_redEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getSystemColorsAccess().getDark_redEnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5251:6: (enumLiteral_12= 'dark_green' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5251:6: (enumLiteral_12= 'dark_green' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5251:8: enumLiteral_12= 'dark_green'
                    {
                    enumLiteral_12=(Token)match(input,131,FOLLOW_131_in_ruleSystemColors11831); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getDark_greenEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_12, grammarAccess.getSystemColorsAccess().getDark_greenEnumLiteralDeclaration_12()); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5257:6: (enumLiteral_13= 'dark_yellow' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5257:6: (enumLiteral_13= 'dark_yellow' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5257:8: enumLiteral_13= 'dark_yellow'
                    {
                    enumLiteral_13=(Token)match(input,132,FOLLOW_132_in_ruleSystemColors11848); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getDark_yellowEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_13, grammarAccess.getSystemColorsAccess().getDark_yellowEnumLiteralDeclaration_13()); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5263:6: (enumLiteral_14= 'dark_purple' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5263:6: (enumLiteral_14= 'dark_purple' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5263:8: enumLiteral_14= 'dark_purple'
                    {
                    enumLiteral_14=(Token)match(input,133,FOLLOW_133_in_ruleSystemColors11865); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getDark_purpleEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_14, grammarAccess.getSystemColorsAccess().getDark_purpleEnumLiteralDeclaration_14()); 
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5269:6: (enumLiteral_15= 'dark_orange' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5269:6: (enumLiteral_15= 'dark_orange' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5269:8: enumLiteral_15= 'dark_orange'
                    {
                    enumLiteral_15=(Token)match(input,134,FOLLOW_134_in_ruleSystemColors11882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getDark_orangeEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_15, grammarAccess.getSystemColorsAccess().getDark_orangeEnumLiteralDeclaration_15()); 
                          
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5275:6: (enumLiteral_16= 'dark_chocolate' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5275:6: (enumLiteral_16= 'dark_chocolate' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5275:8: enumLiteral_16= 'dark_chocolate'
                    {
                    enumLiteral_16=(Token)match(input,135,FOLLOW_135_in_ruleSystemColors11899); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getDark_chocolateEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_16, grammarAccess.getSystemColorsAccess().getDark_chocolateEnumLiteralDeclaration_16()); 
                          
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5281:6: (enumLiteral_17= 'dark_gray' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5281:6: (enumLiteral_17= 'dark_gray' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5281:8: enumLiteral_17= 'dark_gray'
                    {
                    enumLiteral_17=(Token)match(input,136,FOLLOW_136_in_ruleSystemColors11916); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getDark_grayEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_17, grammarAccess.getSystemColorsAccess().getDark_grayEnumLiteralDeclaration_17()); 
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5287:6: (enumLiteral_18= 'light_blue' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5287:6: (enumLiteral_18= 'light_blue' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5287:8: enumLiteral_18= 'light_blue'
                    {
                    enumLiteral_18=(Token)match(input,137,FOLLOW_137_in_ruleSystemColors11933); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getLight_blueEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_18, grammarAccess.getSystemColorsAccess().getLight_blueEnumLiteralDeclaration_18()); 
                          
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5293:6: (enumLiteral_19= 'light_red' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5293:6: (enumLiteral_19= 'light_red' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5293:8: enumLiteral_19= 'light_red'
                    {
                    enumLiteral_19=(Token)match(input,138,FOLLOW_138_in_ruleSystemColors11950); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getLight_redEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_19, grammarAccess.getSystemColorsAccess().getLight_redEnumLiteralDeclaration_19()); 
                          
                    }

                    }


                    }
                    break;
                case 21 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5299:6: (enumLiteral_20= 'light_green' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5299:6: (enumLiteral_20= 'light_green' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5299:8: enumLiteral_20= 'light_green'
                    {
                    enumLiteral_20=(Token)match(input,139,FOLLOW_139_in_ruleSystemColors11967); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getLight_greenEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_20, grammarAccess.getSystemColorsAccess().getLight_greenEnumLiteralDeclaration_20()); 
                          
                    }

                    }


                    }
                    break;
                case 22 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5305:6: (enumLiteral_21= 'light_yellow' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5305:6: (enumLiteral_21= 'light_yellow' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5305:8: enumLiteral_21= 'light_yellow'
                    {
                    enumLiteral_21=(Token)match(input,140,FOLLOW_140_in_ruleSystemColors11984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getLight_yellowEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_21, grammarAccess.getSystemColorsAccess().getLight_yellowEnumLiteralDeclaration_21()); 
                          
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5311:6: (enumLiteral_22= 'light_purple' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5311:6: (enumLiteral_22= 'light_purple' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5311:8: enumLiteral_22= 'light_purple'
                    {
                    enumLiteral_22=(Token)match(input,141,FOLLOW_141_in_ruleSystemColors12001); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getLight_purpleEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_22, grammarAccess.getSystemColorsAccess().getLight_purpleEnumLiteralDeclaration_22()); 
                          
                    }

                    }


                    }
                    break;
                case 24 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5317:6: (enumLiteral_23= 'light_orange' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5317:6: (enumLiteral_23= 'light_orange' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5317:8: enumLiteral_23= 'light_orange'
                    {
                    enumLiteral_23=(Token)match(input,142,FOLLOW_142_in_ruleSystemColors12018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getLight_orangeEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_23, grammarAccess.getSystemColorsAccess().getLight_orangeEnumLiteralDeclaration_23()); 
                          
                    }

                    }


                    }
                    break;
                case 25 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5323:6: (enumLiteral_24= 'light_chocolate' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5323:6: (enumLiteral_24= 'light_chocolate' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5323:8: enumLiteral_24= 'light_chocolate'
                    {
                    enumLiteral_24=(Token)match(input,143,FOLLOW_143_in_ruleSystemColors12035); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSystemColorsAccess().getLight_chocolateEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_24, grammarAccess.getSystemColorsAccess().getLight_chocolateEnumLiteralDeclaration_24()); 
                          
                    }

                    }


                    }
                    break;
                case 26 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5329:6: (enumLiteral_25= 'light_gray' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5329:6: (enumLiteral_25= 'light_gray' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5329:8: enumLiteral_25= 'light_gray'
                    {
                    enumLiteral_25=(Token)match(input,144,FOLLOW_144_in_ruleSystemColors12052); if (state.failed) return current;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5339:1: ruleContainerLayout returns [Enumerator current=null] : ( (enumLiteral_0= 'FreeForm' ) | (enumLiteral_1= 'List' ) ) ;
    public final Enumerator ruleContainerLayout() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5341:28: ( ( (enumLiteral_0= 'FreeForm' ) | (enumLiteral_1= 'List' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5342:1: ( (enumLiteral_0= 'FreeForm' ) | (enumLiteral_1= 'List' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5342:1: ( (enumLiteral_0= 'FreeForm' ) | (enumLiteral_1= 'List' ) )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==145) ) {
                alt112=1;
            }
            else if ( (LA112_0==146) ) {
                alt112=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5342:2: (enumLiteral_0= 'FreeForm' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5342:2: (enumLiteral_0= 'FreeForm' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5342:4: enumLiteral_0= 'FreeForm'
                    {
                    enumLiteral_0=(Token)match(input,145,FOLLOW_145_in_ruleContainerLayout12097); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getContainerLayoutAccess().getFreeFormEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getContainerLayoutAccess().getFreeFormEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5348:6: (enumLiteral_1= 'List' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5348:6: (enumLiteral_1= 'List' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpdiagram.g:5348:8: enumLiteral_1= 'List'
                    {
                    enumLiteral_1=(Token)match(input,146,FOLLOW_146_in_ruleContainerLayout12114); if (state.failed) return current;
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
    public static final BitSet FOLLOW_ruleAbstractImport_in_ruleDiagrams140 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_ruleAspect_in_ruleDiagrams162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractImport_in_entryRuleAbstractImport198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractImport208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNameSpace_in_ruleAbstractImport255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportGroup_in_ruleAbstractImport282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNameSpace_in_entryRuleImportNameSpace317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportNameSpace327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImportNameSpace364 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleImportNameSpace385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportGroup_in_entryRuleImportGroup421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportGroup431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImportGroup468 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImportGroup480 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleImportGroup501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspect_in_entryRuleAspect537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspect547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramSet_in_ruleAspect593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramSet_in_entryRuleDiagramSet627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramSet637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDiagramSet683 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleDiagramSet704 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDiagramSet716 = new BitSet(new long[]{0x0000000000058000L});
    public static final BitSet FOLLOW_ruleDiagramRepresentation_in_ruleDiagramSet737 = new BitSet(new long[]{0x0000000000058000L});
    public static final BitSet FOLLOW_15_in_ruleDiagramSet750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramRepresentation_in_entryRuleDiagramRepresentation786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramRepresentation796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_ruleDiagramRepresentation843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramExtension_in_ruleDiagramRepresentation870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramChildren_in_entryRuleDiagramChildren907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramChildren917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractEdge_in_ruleDiagramChildren964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_ruleDiagramChildren991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_ruleDiagramChildren1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode1053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNode1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_ruleAbstractNode1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderedNode_in_ruleAbstractNode1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_ruleAbstractNode1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractEdge_in_entryRuleAbstractEdge1199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractEdge1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdge_in_ruleAbstractEdge1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeImport_in_ruleAbstractEdge1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractContainerStyle_in_entryRuleAbstractContainerStyle1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractContainerStyle1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlatStyle_in_ruleAbstractContainerStyle1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageStyle_in_ruleAbstractContainerStyle1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractNodeStyle_in_entryRuleAbstractNodeStyle1439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNodeStyle1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageStyle_in_ruleAbstractNodeStyle1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicStyle_in_ruleAbstractNodeStyle1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHistogramStyle_in_ruleAbstractNodeStyle1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_entryRuleDiagram1585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagram1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDiagram1641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDiagram1658 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDiagram1675 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_17_in_ruleDiagram1688 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDiagram1705 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_ruleDomainContainer_in_ruleDiagram1733 = new BitSet(new long[]{0x0000000000108000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMappingSet_in_ruleDiagram1754 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleActionSet_in_ruleDiagram1776 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDiagram1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramExtension_in_entryRuleDiagramExtension1825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramExtension1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDiagramExtension1881 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDiagramExtension1898 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDiagramExtension1915 = new BitSet(new long[]{0x0000000000188000L,0x0000000000000001L});
    public static final BitSet FOLLOW_19_in_ruleDiagramExtension1928 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleDiagramExtension1951 = new BitSet(new long[]{0x0000000000108000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMappingSet_in_ruleDiagramExtension1974 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleActionSet_in_ruleDiagramExtension1996 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDiagramExtension2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingSet_in_entryRuleMappingSet2045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingSet2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleMappingSet2101 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMappingSet2113 = new BitSet(new long[]{0x1000000080008000L,0x0000000000008400L});
    public static final BitSet FOLLOW_ruleDiagramChildren_in_ruleMappingSet2134 = new BitSet(new long[]{0x1000000080008000L,0x0000000000008400L});
    public static final BitSet FOLLOW_15_in_ruleMappingSet2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeDescription_in_entryRuleEdgeDescription2183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeDescription2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEdgeDescription2239 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEdgeDescription2251 = new BitSet(new long[]{0x0000000007C08000L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleEdgeDescription2272 = new BitSet(new long[]{0x0000000005C08000L});
    public static final BitSet FOLLOW_22_in_ruleEdgeDescription2286 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEdgeDescription2298 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleEdgeDescription2319 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEdgeDescription2331 = new BitSet(new long[]{0x0000000005808000L});
    public static final BitSet FOLLOW_23_in_ruleEdgeDescription2346 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEdgeDescription2358 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleEdgeDescription2379 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEdgeDescription2391 = new BitSet(new long[]{0x0000000005008000L});
    public static final BitSet FOLLOW_24_in_ruleEdgeDescription2406 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEdgeDescription2418 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleEdgeDescription2439 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEdgeDescription2451 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_ruleEdgeStyle_in_ruleEdgeDescription2474 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEdgeDescription2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition2523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCondition2579 = new BitSet(new long[]{0x0000000000000020L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleForeignExpressionElement_in_ruleCondition2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeStyle_in_entryRuleEdgeStyle2636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeStyle2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEdgeStyle2692 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEdgeStyle2704 = new BitSet(new long[]{0x0000000078008000L});
    public static final BitSet FOLLOW_27_in_ruleEdgeStyle2717 = new BitSet(new long[]{0x0000000000000000L,0x00000F0000000000L});
    public static final BitSet FOLLOW_ruleLineStyle_in_ruleEdgeStyle2738 = new BitSet(new long[]{0x0000000070008000L});
    public static final BitSet FOLLOW_28_in_ruleEdgeStyle2753 = new BitSet(new long[]{0x0000000000000000L,0x007FF00000000000L});
    public static final BitSet FOLLOW_ruleEdgeArrows_in_ruleEdgeStyle2774 = new BitSet(new long[]{0x0000000060008000L});
    public static final BitSet FOLLOW_29_in_ruleEdgeStyle2789 = new BitSet(new long[]{0x0000000000000000L,0x007FF00000000000L});
    public static final BitSet FOLLOW_ruleEdgeArrows_in_ruleEdgeStyle2810 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_30_in_ruleEdgeStyle2825 = new BitSet(new long[]{0x0000000000000000L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleSystemColors_in_ruleEdgeStyle2846 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEdgeStyle2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer2896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainer2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleContainer2952 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleContainer2973 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContainer2985 = new BitSet(new long[]{0x0000000F00208000L});
    public static final BitSet FOLLOW_32_in_ruleContainer2998 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleContainer3021 = new BitSet(new long[]{0x0000000E00208000L});
    public static final BitSet FOLLOW_33_in_ruleContainer3036 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_ruleNodeDomainElement_in_ruleContainer3057 = new BitSet(new long[]{0x0000000C00208000L});
    public static final BitSet FOLLOW_34_in_ruleContainer3072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_ruleContainerLayout_in_ruleContainer3093 = new BitSet(new long[]{0x0000000800208000L});
    public static final BitSet FOLLOW_ruleContainerDescription_in_ruleContainer3116 = new BitSet(new long[]{0x0000000800208000L});
    public static final BitSet FOLLOW_ruleContainerChildren_in_ruleContainer3138 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContainer3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerChildren_in_entryRuleContainerChildren3187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerChildren3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleContainerChildren3243 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContainerChildren3255 = new BitSet(new long[]{0x3000001080008000L,0x0000000000008400L});
    public static final BitSet FOLLOW_36_in_ruleContainerChildren3268 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleContainerChildren3291 = new BitSet(new long[]{0x3000002080008000L,0x0000000000008400L});
    public static final BitSet FOLLOW_37_in_ruleContainerChildren3304 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleContainerChildren3327 = new BitSet(new long[]{0x3000002080008000L,0x0000000000008400L});
    public static final BitSet FOLLOW_ruleAbstractNode_in_ruleContainerChildren3352 = new BitSet(new long[]{0x3000000080008000L,0x0000000000008400L});
    public static final BitSet FOLLOW_15_in_ruleContainerChildren3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDomainElement_in_entryRuleNodeDomainElement3401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeDomainElement3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractClass_in_ruleNodeDomainElement3466 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleNodeDomainElement3479 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_39_in_ruleNodeDomainElement3493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNodeDomainElement3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleNodeDomainElement3535 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_ruleAbstractAssociation2_in_ruleNodeDomainElement3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerDescription_in_entryRuleContainerDescription3596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerDescription3606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleContainerDescription3652 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContainerDescription3664 = new BitSet(new long[]{0x0000020006008000L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleContainerDescription3685 = new BitSet(new long[]{0x0000020004008000L});
    public static final BitSet FOLLOW_41_in_ruleContainerDescription3699 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContainerDescription3711 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleContainerDescription3732 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContainerDescription3744 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_26_in_ruleContainerDescription3759 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContainerDescription3779 = new BitSet(new long[]{0x0090000000000000L});
    public static final BitSet FOLLOW_ruleAbstractContainerStyle_in_ruleContainerDescription3801 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContainerDescription3813 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContainerDescription3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicStyle_in_entryRuleBasicStyle3863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicStyle3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleBasicStyle3919 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBasicStyle3931 = new BitSet(new long[]{0x0000380000008000L});
    public static final BitSet FOLLOW_43_in_ruleBasicStyle3944 = new BitSet(new long[]{0x0000000000000000L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleSystemColors_in_ruleBasicStyle3965 = new BitSet(new long[]{0x0000300000008000L});
    public static final BitSet FOLLOW_44_in_ruleBasicStyle3980 = new BitSet(new long[]{0x0000000000000000L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleSystemColors_in_ruleBasicStyle4001 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_45_in_ruleBasicStyle4016 = new BitSet(new long[]{0x0000000000000000L,0x00000000FF000000L});
    public static final BitSet FOLLOW_ruleNode_Form_in_ruleBasicStyle4037 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBasicStyle4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHistogramStyle_in_entryRuleHistogramStyle4087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHistogramStyle4097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleHistogramStyle4143 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleHistogramStyle4155 = new BitSet(new long[]{0x0000880000008000L});
    public static final BitSet FOLLOW_43_in_ruleHistogramStyle4168 = new BitSet(new long[]{0x0000000000000000L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleSystemColors_in_ruleHistogramStyle4189 = new BitSet(new long[]{0x0000800000008000L});
    public static final BitSet FOLLOW_ruleHistogramSection_in_ruleHistogramStyle4212 = new BitSet(new long[]{0x0000800000008000L});
    public static final BitSet FOLLOW_15_in_ruleHistogramStyle4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHistogramSection_in_entryRuleHistogramSection4261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHistogramSection4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleHistogramSection4317 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleHistogramSection4329 = new BitSet(new long[]{0x000F100000008000L});
    public static final BitSet FOLLOW_44_in_ruleHistogramSection4342 = new BitSet(new long[]{0x0000000000000000L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleSystemColors_in_ruleHistogramSection4363 = new BitSet(new long[]{0x000F000000008000L});
    public static final BitSet FOLLOW_48_in_ruleHistogramSection4378 = new BitSet(new long[]{0x0000000000000000L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleSystemColors_in_ruleHistogramSection4399 = new BitSet(new long[]{0x000E000000008000L});
    public static final BitSet FOLLOW_49_in_ruleHistogramSection4414 = new BitSet(new long[]{0x0000000000000020L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleForeignExpressionElement_in_ruleHistogramSection4435 = new BitSet(new long[]{0x000C000000008000L});
    public static final BitSet FOLLOW_50_in_ruleHistogramSection4450 = new BitSet(new long[]{0x0000000000000020L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleForeignExpressionElement_in_ruleHistogramSection4471 = new BitSet(new long[]{0x0008000000008000L});
    public static final BitSet FOLLOW_51_in_ruleHistogramSection4486 = new BitSet(new long[]{0x0000000000000020L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleForeignExpressionElement_in_ruleHistogramSection4507 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleHistogramSection4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageStyle_in_entryRuleImageStyle4557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageStyle4567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleImageStyle4613 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImageStyle4625 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_53_in_ruleImageStyle4638 = new BitSet(new long[]{0x0000000000000000L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleSystemColors_in_ruleImageStyle4659 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleImageStyle4674 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImageStyle4691 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImageStyle4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlatStyle_in_entryRuleFlatStyle4745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlatStyle4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleFlatStyle4801 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFlatStyle4813 = new BitSet(new long[]{0x0021100000008000L});
    public static final BitSet FOLLOW_53_in_ruleFlatStyle4826 = new BitSet(new long[]{0x0000000000000000L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleSystemColors_in_ruleFlatStyle4847 = new BitSet(new long[]{0x0001100000008000L});
    public static final BitSet FOLLOW_44_in_ruleFlatStyle4862 = new BitSet(new long[]{0x0000000000000000L,0xFF80000700000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleBackgroundStyle_in_ruleFlatStyle4883 = new BitSet(new long[]{0x0000000000000000L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleSystemColors_in_ruleFlatStyle4905 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_48_in_ruleFlatStyle4920 = new BitSet(new long[]{0x0000000000000000L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleSystemColors_in_ruleFlatStyle4941 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFlatStyle4955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel4991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel5001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleLabel5048 = new BitSet(new long[]{0x0200000000000030L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLabel5069 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_ruleLabel5083 = new BitSet(new long[]{0x0C00000000000042L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_58_in_ruleLabel5101 = new BitSet(new long[]{0x0800000000000042L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_59_in_ruleLabel5133 = new BitSet(new long[]{0x0000000000000042L,0xFF80000000000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleSystemColors_in_ruleLabel5168 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleEInt_in_ruleLabel5190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode5229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode5239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleNode5285 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleNode5306 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNode5318 = new BitSet(new long[]{0x0000000B00208000L});
    public static final BitSet FOLLOW_32_in_ruleNode5331 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleNode5354 = new BitSet(new long[]{0x0000000A00208000L});
    public static final BitSet FOLLOW_33_in_ruleNode5369 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_ruleNodeDomainElement_in_ruleNode5390 = new BitSet(new long[]{0x0000000800208000L});
    public static final BitSet FOLLOW_ruleNodeDescription_in_ruleNode5413 = new BitSet(new long[]{0x0000000800208000L});
    public static final BitSet FOLLOW_ruleNodeChildren_in_ruleNode5435 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNode5448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeChildren_in_entryRuleNodeChildren5484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeChildren5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleNodeChildren5540 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNodeChildren5552 = new BitSet(new long[]{0x2000001000008000L});
    public static final BitSet FOLLOW_36_in_ruleNodeChildren5565 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleNodeChildren5588 = new BitSet(new long[]{0x2000002000008000L});
    public static final BitSet FOLLOW_37_in_ruleNodeChildren5601 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleNodeChildren5624 = new BitSet(new long[]{0x2000002000008000L});
    public static final BitSet FOLLOW_ruleBorderedNode_in_ruleNodeChildren5649 = new BitSet(new long[]{0x2000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNodeChildren5662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderedNode_in_entryRuleBorderedNode5698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorderedNode5708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleBorderedNode5754 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleBorderedNode5775 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBorderedNode5787 = new BitSet(new long[]{0x0000000300208000L});
    public static final BitSet FOLLOW_32_in_ruleBorderedNode5800 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleBorderedNode5823 = new BitSet(new long[]{0x0000000200208000L});
    public static final BitSet FOLLOW_33_in_ruleBorderedNode5838 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_ruleNodeDomainElement_in_ruleBorderedNode5859 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_ruleNodeDescription_in_ruleBorderedNode5882 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_15_in_ruleBorderedNode5895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDescription_in_entryRuleNodeDescription5931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeDescription5941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleNodeDescription5987 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNodeDescription5999 = new BitSet(new long[]{0x0000020006008000L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleNodeDescription6020 = new BitSet(new long[]{0x0000020004008000L});
    public static final BitSet FOLLOW_41_in_ruleNodeDescription6034 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNodeDescription6046 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleNodeDescription6067 = new BitSet(new long[]{0xC000000000008000L});
    public static final BitSet FOLLOW_62_in_ruleNodeDescription6080 = new BitSet(new long[]{0x0000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_ruleLabelPosition_in_ruleNodeDescription6101 = new BitSet(new long[]{0x8000000000008000L});
    public static final BitSet FOLLOW_63_in_ruleNodeDescription6116 = new BitSet(new long[]{0x0000000000000000L,0x000000E000000000L});
    public static final BitSet FOLLOW_ruleLabelAlignment_in_ruleNodeDescription6137 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNodeDescription6151 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_26_in_ruleNodeDescription6166 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNodeDescription6178 = new BitSet(new long[]{0x0090440000000000L});
    public static final BitSet FOLLOW_ruleAbstractNodeStyle_in_ruleNodeDescription6199 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNodeDescription6211 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNodeDescription6225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionSet_in_entryRuleActionSet6261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionSet6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleActionSet6317 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleActionSet6329 = new BitSet(new long[]{0x0000000000008000L,0x00000000000003A2L});
    public static final BitSet FOLLOW_ruleAction_in_ruleActionSet6350 = new BitSet(new long[]{0x0000000000008000L,0x00000000000003A2L});
    public static final BitSet FOLLOW_ruleOpenAction_in_ruleActionSet6372 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleActionSet6385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenAction_in_entryRuleOpenAction6421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenAction6431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleOpenAction6477 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleOpenAction6498 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleOpenAction6510 = new BitSet(new long[]{0x0000000000008000L,0x000000000000001CL});
    public static final BitSet FOLLOW_66_in_ruleOpenAction6523 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleOpenAction6544 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_ruleOpenAction6559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOpenAction6576 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleOpenAction6596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOpenAction6613 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleOpenAction6632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction6668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction6678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreate_in_ruleAction6725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelete_in_ruleAction6752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDrop_in_ruleAction6779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReconnectEdge_in_ruleAction6806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreate_in_entryRuleCreate6841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreate6851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleCreate6897 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleCreate6918 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCreate6930 = new BitSet(new long[]{0x0000000000000000L,0x000000000000004CL});
    public static final BitSet FOLLOW_66_in_ruleCreate6943 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleCreate6964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_67_in_ruleCreate6979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCreate6996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleCreate7016 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleCreate7039 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleCreate7053 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCreate7070 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCreate7089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelete_in_entryRuleDelete7125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelete7135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleDelete7181 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleDelete7202 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDelete7214 = new BitSet(new long[]{0x0000000000000000L,0x000000000000004CL});
    public static final BitSet FOLLOW_66_in_ruleDelete7227 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleDelete7248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_67_in_ruleDelete7263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDelete7280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleDelete7300 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleDelete7323 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDelete7336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDrop_in_entryRuleDrop7372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDrop7382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleDrop7428 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleDrop7449 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDrop7461 = new BitSet(new long[]{0x0000000000000000L,0x000000000000004CL});
    public static final BitSet FOLLOW_66_in_ruleDrop7474 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleDrop7495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_67_in_ruleDrop7510 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDrop7527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleDrop7547 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleDrop7570 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDrop7583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReconnectEdge_in_entryRuleReconnectEdge7619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReconnectEdge7629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleReconnectEdge7675 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleReconnectEdge7696 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleReconnectEdge7708 = new BitSet(new long[]{0x0000000000000000L,0x000000000000004CL});
    public static final BitSet FOLLOW_66_in_ruleReconnectEdge7721 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleReconnectEdge7742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_67_in_ruleReconnectEdge7757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleReconnectEdge7774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleReconnectEdge7794 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleReconnectEdge7817 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleReconnectEdge7830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainContainer_in_entryRuleDomainContainer7866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainContainer7876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDomainContainer7923 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_ruleAbstractClass_in_ruleDomainContainer7944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdge_in_entryRuleEdge7981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdge7991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleEdge8037 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleEdge8058 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEdge8070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_ruleEdge8084 = new BitSet(new long[]{0x0000000000001020L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleEdgeDomainAssociation_in_ruleEdge8105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_76_in_ruleEdge8125 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_ruleEdgeDomainElement_in_ruleEdge8146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleEdge8161 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEdge8184 = new BitSet(new long[]{0x0000002000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_37_in_ruleEdge8197 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEdge8220 = new BitSet(new long[]{0x0000002000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleEdge8236 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEdge8259 = new BitSet(new long[]{0x0000002000208000L});
    public static final BitSet FOLLOW_37_in_ruleEdge8272 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEdge8295 = new BitSet(new long[]{0x0000002000208000L});
    public static final BitSet FOLLOW_ruleEdgeDescription_in_ruleEdge8319 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_15_in_ruleEdge8332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeImport_in_entryRuleEdgeImport8368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeImport8378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleEdgeImport8424 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleEdgeImport8445 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEdgeImport8457 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleEdgeImport8470 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEdgeImport8493 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_ruleEdgeDescription_in_ruleEdgeImport8515 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_15_in_ruleEdgeImport8528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeDomainAssociation_in_entryRuleEdgeDomainAssociation8564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeDomainAssociation8574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleEdgeDomainAssociation8622 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEdgeDomainAssociation8639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractAssociation2_in_ruleEdgeDomainAssociation8672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeDomainElement_in_entryRuleEdgeDomainElement8709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeDomainElement8719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractClass_in_ruleEdgeDomainElement8774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_81_in_ruleEdgeDomainElement8788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEdgeDomainElement8805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_82_in_ruleEdgeDomainElement8830 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_ruleAbstractAssociation2_in_ruleEdgeDomainElement8851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_83_in_ruleEdgeDomainElement8867 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEdgeDomainElement8884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleEdgeDomainElement8909 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_ruleAbstractAssociation2_in_ruleEdgeDomainElement8930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractClass_in_entryRuleAbstractClass8968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractClass8978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalClass2_in_ruleAbstractClass9025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalClass_in_ruleAbstractClass9052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalClass2_in_entryRuleLocalClass29087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalClass29097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleLocalClass29154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalClass_in_entryRuleExternalClass9190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalClass9200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleExternalClass9246 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleExternalClass9269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractAssociation2_in_entryRuleAbstractAssociation29305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractAssociation29315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalAssociation_in_ruleAbstractAssociation29362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalAssociation_in_ruleAbstractAssociation29389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalAssociation_in_entryRuleLocalAssociation9424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalAssociation9434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleLocalAssociation9491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalAssociation_in_entryRuleExternalAssociation9527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalAssociation9537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleExternalAssociation9583 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleExternalAssociation9606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalAttribute_in_entryRuleLocalAttribute9644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalAttribute9654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleLocalAttribute9711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalAttribute_in_entryRuleExternalAttribute9747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalAttribute9757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleExternalAttribute9803 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleExternalAttribute9826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression9862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression9872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionElement_in_ruleExpression9928 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ruleExpression9941 = new BitSet(new long[]{0x0000000000000030L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpressionElement_in_ruleExpression9962 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleExpressionElement_in_entryRuleExpressionElement10002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionElement10012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeignExpressionElement_in_ruleExpressionElement10059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringElement_in_ruleExpressionElement10086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeignExpressionElement_in_entryRuleForeignExpressionElement10121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeignExpressionElement10131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaElement_in_ruleForeignExpressionElement10178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_ruleForeignExpressionElement10205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaElement_in_entryRuleJavaElement10240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaElement10250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleJavaElement10296 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleJavaElement10317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_entryRuleDomainElement10353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainElement10363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleDomainElement10420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringElement_in_entryRuleStringElement10456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringElement10466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringElement10517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString10559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString10570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString10610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString10636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN10682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN10693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN10733 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleFQN10752 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN10773 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt10824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEInt10835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEInt10874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleNode_Form10932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleNode_Form10949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleNode_Form10966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleNode_Form10983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleNode_Form11000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleNode_Form11017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleNode_Form11034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleNode_Form11051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleBackgroundStyle11096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleBackgroundStyle11113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleBackgroundStyle11130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleLabelPosition11175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleLabelPosition11192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleLabelAlignment11237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleLabelAlignment11254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleLabelAlignment11271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleLineStyle11316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleLineStyle11333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleLineStyle11350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleLineStyle11367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleEdgeArrows11412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleEdgeArrows11429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleEdgeArrows11446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleEdgeArrows11463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleEdgeArrows11480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleEdgeArrows11497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleEdgeArrows11514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleEdgeArrows11531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleEdgeArrows11548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleEdgeArrows11565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleEdgeArrows11582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleSystemColors11627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleSystemColors11644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleSystemColors11661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleSystemColors11678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleSystemColors11695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleSystemColors11712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleSystemColors11729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleSystemColors11746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleSystemColors11763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleSystemColors11780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleSystemColors11797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleSystemColors11814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleSystemColors11831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleSystemColors11848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleSystemColors11865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ruleSystemColors11882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleSystemColors11899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ruleSystemColors11916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ruleSystemColors11933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_ruleSystemColors11950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_ruleSystemColors11967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_ruleSystemColors11984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_ruleSystemColors12001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_ruleSystemColors12018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_ruleSystemColors12035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_ruleSystemColors12052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_ruleContainerLayout12097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_ruleContainerLayout12114 = new BitSet(new long[]{0x0000000000000002L});

}
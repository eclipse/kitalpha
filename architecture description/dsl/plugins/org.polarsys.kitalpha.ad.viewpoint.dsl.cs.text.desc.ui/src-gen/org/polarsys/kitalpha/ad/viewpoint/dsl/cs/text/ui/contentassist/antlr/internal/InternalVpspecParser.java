package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpspecGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalVpspecParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Viewpoint'", "'{'", "'}'", "'name:'", "'description:'", "'extends'", "','", "'aggregates'", "'Data'", "'.'", "'UI'", "'Diagrams'", "'Services'", "'Build'", "'Configuration'"
    };
    public static final int RULE_ID=5;
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


        public InternalVpspecParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVpspecParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVpspecParser.tokenNames; }
    public String getGrammarFileName() { return "../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g"; }


     
     	private VpspecGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(VpspecGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleViewpoint"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:61:1: entryRuleViewpoint : ruleViewpoint EOF ;
    public final void entryRuleViewpoint() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:62:1: ( ruleViewpoint EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:63:1: ruleViewpoint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointRule()); 
            }
            pushFollow(FOLLOW_ruleViewpoint_in_entryRuleViewpoint67);
            ruleViewpoint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewpoint74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleViewpoint"


    // $ANTLR start "ruleViewpoint"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:70:1: ruleViewpoint : ( ( rule__Viewpoint__Group__0 ) ) ;
    public final void ruleViewpoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:74:2: ( ( ( rule__Viewpoint__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:75:1: ( ( rule__Viewpoint__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:75:1: ( ( rule__Viewpoint__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:76:1: ( rule__Viewpoint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:77:1: ( rule__Viewpoint__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:77:2: rule__Viewpoint__Group__0
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__0_in_ruleViewpoint100);
            rule__Viewpoint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleViewpoint"


    // $ANTLR start "entryRuleEString"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:89:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:90:1: ( ruleEString EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:91:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString127);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString134); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:98:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:102:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:103:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:103:1: ( ( rule__EString__Alternatives ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:104:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:105:1: ( rule__EString__Alternatives )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:105:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString160);
            rule__EString__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFQN"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:117:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:118:1: ( ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:119:1: ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN187);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN194); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:126:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:130:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:131:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:131:1: ( ( rule__FQN__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:132:1: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:133:1: ( rule__FQN__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:133:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN220);
            rule__FQN__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:149:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:153:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:154:1: ( RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:154:1: ( RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:155:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives260); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:160:6: ( RULE_ID )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:160:6: ( RULE_ID )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:161:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives277); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Viewpoint__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:174:1: rule__Viewpoint__Group__0 : rule__Viewpoint__Group__0__Impl rule__Viewpoint__Group__1 ;
    public final void rule__Viewpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:178:1: ( rule__Viewpoint__Group__0__Impl rule__Viewpoint__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:179:2: rule__Viewpoint__Group__0__Impl rule__Viewpoint__Group__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__0__Impl_in_rule__Viewpoint__Group__0308);
            rule__Viewpoint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__1_in_rule__Viewpoint__Group__0311);
            rule__Viewpoint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__0"


    // $ANTLR start "rule__Viewpoint__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:186:1: rule__Viewpoint__Group__0__Impl : ( () ) ;
    public final void rule__Viewpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:190:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:191:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:191:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:192:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getViewpointAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:193:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:195:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getViewpointAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:205:1: rule__Viewpoint__Group__1 : rule__Viewpoint__Group__1__Impl rule__Viewpoint__Group__2 ;
    public final void rule__Viewpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:209:1: ( rule__Viewpoint__Group__1__Impl rule__Viewpoint__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:210:2: rule__Viewpoint__Group__1__Impl rule__Viewpoint__Group__2
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__1__Impl_in_rule__Viewpoint__Group__1369);
            rule__Viewpoint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__2_in_rule__Viewpoint__Group__1372);
            rule__Viewpoint__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__1"


    // $ANTLR start "rule__Viewpoint__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:217:1: rule__Viewpoint__Group__1__Impl : ( 'Viewpoint' ) ;
    public final void rule__Viewpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:221:1: ( ( 'Viewpoint' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:222:1: ( 'Viewpoint' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:222:1: ( 'Viewpoint' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:223:1: 'Viewpoint'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getViewpointKeyword_1()); 
            }
            match(input,11,FOLLOW_11_in_rule__Viewpoint__Group__1__Impl400); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getViewpointKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:236:1: rule__Viewpoint__Group__2 : rule__Viewpoint__Group__2__Impl rule__Viewpoint__Group__3 ;
    public final void rule__Viewpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:240:1: ( rule__Viewpoint__Group__2__Impl rule__Viewpoint__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:241:2: rule__Viewpoint__Group__2__Impl rule__Viewpoint__Group__3
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__2__Impl_in_rule__Viewpoint__Group__2431);
            rule__Viewpoint__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__3_in_rule__Viewpoint__Group__2434);
            rule__Viewpoint__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__2"


    // $ANTLR start "rule__Viewpoint__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:248:1: rule__Viewpoint__Group__2__Impl : ( ( rule__Viewpoint__ShortNameAssignment_2 )? ) ;
    public final void rule__Viewpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:252:1: ( ( ( rule__Viewpoint__ShortNameAssignment_2 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:253:1: ( ( rule__Viewpoint__ShortNameAssignment_2 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:253:1: ( ( rule__Viewpoint__ShortNameAssignment_2 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:254:1: ( rule__Viewpoint__ShortNameAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getShortNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:255:1: ( rule__Viewpoint__ShortNameAssignment_2 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:255:2: rule__Viewpoint__ShortNameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__ShortNameAssignment_2_in_rule__Viewpoint__Group__2__Impl461);
                    rule__Viewpoint__ShortNameAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getShortNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:265:1: rule__Viewpoint__Group__3 : rule__Viewpoint__Group__3__Impl rule__Viewpoint__Group__4 ;
    public final void rule__Viewpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:269:1: ( rule__Viewpoint__Group__3__Impl rule__Viewpoint__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:270:2: rule__Viewpoint__Group__3__Impl rule__Viewpoint__Group__4
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__3__Impl_in_rule__Viewpoint__Group__3492);
            rule__Viewpoint__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__4_in_rule__Viewpoint__Group__3495);
            rule__Viewpoint__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__3"


    // $ANTLR start "rule__Viewpoint__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:277:1: rule__Viewpoint__Group__3__Impl : ( '{' ) ;
    public final void rule__Viewpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:281:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:282:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:282:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:283:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,12,FOLLOW_12_in_rule__Viewpoint__Group__3__Impl523); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__3__Impl"


    // $ANTLR start "rule__Viewpoint__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:296:1: rule__Viewpoint__Group__4 : rule__Viewpoint__Group__4__Impl rule__Viewpoint__Group__5 ;
    public final void rule__Viewpoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:300:1: ( rule__Viewpoint__Group__4__Impl rule__Viewpoint__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:301:2: rule__Viewpoint__Group__4__Impl rule__Viewpoint__Group__5
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__4__Impl_in_rule__Viewpoint__Group__4554);
            rule__Viewpoint__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__5_in_rule__Viewpoint__Group__4557);
            rule__Viewpoint__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__4"


    // $ANTLR start "rule__Viewpoint__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:308:1: rule__Viewpoint__Group__4__Impl : ( ( rule__Viewpoint__Group_4__0 ) ) ;
    public final void rule__Viewpoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:312:1: ( ( ( rule__Viewpoint__Group_4__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:313:1: ( ( rule__Viewpoint__Group_4__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:313:1: ( ( rule__Viewpoint__Group_4__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:314:1: ( rule__Viewpoint__Group_4__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:315:1: ( rule__Viewpoint__Group_4__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:315:2: rule__Viewpoint__Group_4__0
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_4__0_in_rule__Viewpoint__Group__4__Impl584);
            rule__Viewpoint__Group_4__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__4__Impl"


    // $ANTLR start "rule__Viewpoint__Group__5"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:325:1: rule__Viewpoint__Group__5 : rule__Viewpoint__Group__5__Impl rule__Viewpoint__Group__6 ;
    public final void rule__Viewpoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:329:1: ( rule__Viewpoint__Group__5__Impl rule__Viewpoint__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:330:2: rule__Viewpoint__Group__5__Impl rule__Viewpoint__Group__6
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__5__Impl_in_rule__Viewpoint__Group__5614);
            rule__Viewpoint__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__6_in_rule__Viewpoint__Group__5617);
            rule__Viewpoint__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__5"


    // $ANTLR start "rule__Viewpoint__Group__5__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:337:1: rule__Viewpoint__Group__5__Impl : ( ( rule__Viewpoint__Group_5__0 )? ) ;
    public final void rule__Viewpoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:341:1: ( ( ( rule__Viewpoint__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:342:1: ( ( rule__Viewpoint__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:342:1: ( ( rule__Viewpoint__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:343:1: ( rule__Viewpoint__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:344:1: ( rule__Viewpoint__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:344:2: rule__Viewpoint__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_5__0_in_rule__Viewpoint__Group__5__Impl644);
                    rule__Viewpoint__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__5__Impl"


    // $ANTLR start "rule__Viewpoint__Group__6"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:354:1: rule__Viewpoint__Group__6 : rule__Viewpoint__Group__6__Impl rule__Viewpoint__Group__7 ;
    public final void rule__Viewpoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:358:1: ( rule__Viewpoint__Group__6__Impl rule__Viewpoint__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:359:2: rule__Viewpoint__Group__6__Impl rule__Viewpoint__Group__7
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__6__Impl_in_rule__Viewpoint__Group__6675);
            rule__Viewpoint__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__7_in_rule__Viewpoint__Group__6678);
            rule__Viewpoint__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__6"


    // $ANTLR start "rule__Viewpoint__Group__6__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:366:1: rule__Viewpoint__Group__6__Impl : ( ( rule__Viewpoint__Group_6__0 )? ) ;
    public final void rule__Viewpoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:370:1: ( ( ( rule__Viewpoint__Group_6__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:371:1: ( ( rule__Viewpoint__Group_6__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:371:1: ( ( rule__Viewpoint__Group_6__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:372:1: ( rule__Viewpoint__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_6()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:373:1: ( rule__Viewpoint__Group_6__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:373:2: rule__Viewpoint__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_6__0_in_rule__Viewpoint__Group__6__Impl705);
                    rule__Viewpoint__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__6__Impl"


    // $ANTLR start "rule__Viewpoint__Group__7"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:383:1: rule__Viewpoint__Group__7 : rule__Viewpoint__Group__7__Impl rule__Viewpoint__Group__8 ;
    public final void rule__Viewpoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:387:1: ( rule__Viewpoint__Group__7__Impl rule__Viewpoint__Group__8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:388:2: rule__Viewpoint__Group__7__Impl rule__Viewpoint__Group__8
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__7__Impl_in_rule__Viewpoint__Group__7736);
            rule__Viewpoint__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__8_in_rule__Viewpoint__Group__7739);
            rule__Viewpoint__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__7"


    // $ANTLR start "rule__Viewpoint__Group__7__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:395:1: rule__Viewpoint__Group__7__Impl : ( ( rule__Viewpoint__Group_7__0 )? ) ;
    public final void rule__Viewpoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:399:1: ( ( ( rule__Viewpoint__Group_7__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:400:1: ( ( rule__Viewpoint__Group_7__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:400:1: ( ( rule__Viewpoint__Group_7__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:401:1: ( rule__Viewpoint__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_7()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:402:1: ( rule__Viewpoint__Group_7__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:402:2: rule__Viewpoint__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_7__0_in_rule__Viewpoint__Group__7__Impl766);
                    rule__Viewpoint__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__7__Impl"


    // $ANTLR start "rule__Viewpoint__Group__8"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:412:1: rule__Viewpoint__Group__8 : rule__Viewpoint__Group__8__Impl rule__Viewpoint__Group__9 ;
    public final void rule__Viewpoint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:416:1: ( rule__Viewpoint__Group__8__Impl rule__Viewpoint__Group__9 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:417:2: rule__Viewpoint__Group__8__Impl rule__Viewpoint__Group__9
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__8__Impl_in_rule__Viewpoint__Group__8797);
            rule__Viewpoint__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__9_in_rule__Viewpoint__Group__8800);
            rule__Viewpoint__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__8"


    // $ANTLR start "rule__Viewpoint__Group__8__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:424:1: rule__Viewpoint__Group__8__Impl : ( ( rule__Viewpoint__Group_8__0 )? ) ;
    public final void rule__Viewpoint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:428:1: ( ( ( rule__Viewpoint__Group_8__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:429:1: ( ( rule__Viewpoint__Group_8__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:429:1: ( ( rule__Viewpoint__Group_8__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:430:1: ( rule__Viewpoint__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_8()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:431:1: ( rule__Viewpoint__Group_8__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:431:2: rule__Viewpoint__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_8__0_in_rule__Viewpoint__Group__8__Impl827);
                    rule__Viewpoint__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__8__Impl"


    // $ANTLR start "rule__Viewpoint__Group__9"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:441:1: rule__Viewpoint__Group__9 : rule__Viewpoint__Group__9__Impl rule__Viewpoint__Group__10 ;
    public final void rule__Viewpoint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:445:1: ( rule__Viewpoint__Group__9__Impl rule__Viewpoint__Group__10 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:446:2: rule__Viewpoint__Group__9__Impl rule__Viewpoint__Group__10
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__9__Impl_in_rule__Viewpoint__Group__9858);
            rule__Viewpoint__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__10_in_rule__Viewpoint__Group__9861);
            rule__Viewpoint__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__9"


    // $ANTLR start "rule__Viewpoint__Group__9__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:453:1: rule__Viewpoint__Group__9__Impl : ( ( rule__Viewpoint__Group_9__0 )? ) ;
    public final void rule__Viewpoint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:457:1: ( ( ( rule__Viewpoint__Group_9__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:458:1: ( ( rule__Viewpoint__Group_9__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:458:1: ( ( rule__Viewpoint__Group_9__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:459:1: ( rule__Viewpoint__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_9()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:460:1: ( rule__Viewpoint__Group_9__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:460:2: rule__Viewpoint__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_9__0_in_rule__Viewpoint__Group__9__Impl888);
                    rule__Viewpoint__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__9__Impl"


    // $ANTLR start "rule__Viewpoint__Group__10"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:470:1: rule__Viewpoint__Group__10 : rule__Viewpoint__Group__10__Impl rule__Viewpoint__Group__11 ;
    public final void rule__Viewpoint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:474:1: ( rule__Viewpoint__Group__10__Impl rule__Viewpoint__Group__11 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:475:2: rule__Viewpoint__Group__10__Impl rule__Viewpoint__Group__11
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__10__Impl_in_rule__Viewpoint__Group__10919);
            rule__Viewpoint__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__11_in_rule__Viewpoint__Group__10922);
            rule__Viewpoint__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__10"


    // $ANTLR start "rule__Viewpoint__Group__10__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:482:1: rule__Viewpoint__Group__10__Impl : ( ( rule__Viewpoint__Group_10__0 )? ) ;
    public final void rule__Viewpoint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:486:1: ( ( ( rule__Viewpoint__Group_10__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:487:1: ( ( rule__Viewpoint__Group_10__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:487:1: ( ( rule__Viewpoint__Group_10__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:488:1: ( rule__Viewpoint__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_10()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:489:1: ( rule__Viewpoint__Group_10__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:489:2: rule__Viewpoint__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_10__0_in_rule__Viewpoint__Group__10__Impl949);
                    rule__Viewpoint__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__10__Impl"


    // $ANTLR start "rule__Viewpoint__Group__11"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:499:1: rule__Viewpoint__Group__11 : rule__Viewpoint__Group__11__Impl rule__Viewpoint__Group__12 ;
    public final void rule__Viewpoint__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:503:1: ( rule__Viewpoint__Group__11__Impl rule__Viewpoint__Group__12 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:504:2: rule__Viewpoint__Group__11__Impl rule__Viewpoint__Group__12
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__11__Impl_in_rule__Viewpoint__Group__11980);
            rule__Viewpoint__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__12_in_rule__Viewpoint__Group__11983);
            rule__Viewpoint__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__11"


    // $ANTLR start "rule__Viewpoint__Group__11__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:511:1: rule__Viewpoint__Group__11__Impl : ( ( rule__Viewpoint__Group_11__0 )? ) ;
    public final void rule__Viewpoint__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:515:1: ( ( ( rule__Viewpoint__Group_11__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:516:1: ( ( rule__Viewpoint__Group_11__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:516:1: ( ( rule__Viewpoint__Group_11__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:517:1: ( rule__Viewpoint__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_11()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:518:1: ( rule__Viewpoint__Group_11__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:518:2: rule__Viewpoint__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_11__0_in_rule__Viewpoint__Group__11__Impl1010);
                    rule__Viewpoint__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__11__Impl"


    // $ANTLR start "rule__Viewpoint__Group__12"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:528:1: rule__Viewpoint__Group__12 : rule__Viewpoint__Group__12__Impl rule__Viewpoint__Group__13 ;
    public final void rule__Viewpoint__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:532:1: ( rule__Viewpoint__Group__12__Impl rule__Viewpoint__Group__13 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:533:2: rule__Viewpoint__Group__12__Impl rule__Viewpoint__Group__13
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__12__Impl_in_rule__Viewpoint__Group__121041);
            rule__Viewpoint__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__13_in_rule__Viewpoint__Group__121044);
            rule__Viewpoint__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__12"


    // $ANTLR start "rule__Viewpoint__Group__12__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:540:1: rule__Viewpoint__Group__12__Impl : ( ( rule__Viewpoint__Group_12__0 )? ) ;
    public final void rule__Viewpoint__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:544:1: ( ( ( rule__Viewpoint__Group_12__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:545:1: ( ( rule__Viewpoint__Group_12__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:545:1: ( ( rule__Viewpoint__Group_12__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:546:1: ( rule__Viewpoint__Group_12__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_12()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:547:1: ( rule__Viewpoint__Group_12__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:547:2: rule__Viewpoint__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_12__0_in_rule__Viewpoint__Group__12__Impl1071);
                    rule__Viewpoint__Group_12__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__12__Impl"


    // $ANTLR start "rule__Viewpoint__Group__13"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:557:1: rule__Viewpoint__Group__13 : rule__Viewpoint__Group__13__Impl rule__Viewpoint__Group__14 ;
    public final void rule__Viewpoint__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:561:1: ( rule__Viewpoint__Group__13__Impl rule__Viewpoint__Group__14 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:562:2: rule__Viewpoint__Group__13__Impl rule__Viewpoint__Group__14
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__13__Impl_in_rule__Viewpoint__Group__131102);
            rule__Viewpoint__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__14_in_rule__Viewpoint__Group__131105);
            rule__Viewpoint__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__13"


    // $ANTLR start "rule__Viewpoint__Group__13__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:569:1: rule__Viewpoint__Group__13__Impl : ( ( rule__Viewpoint__Group_13__0 )? ) ;
    public final void rule__Viewpoint__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:573:1: ( ( ( rule__Viewpoint__Group_13__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:574:1: ( ( rule__Viewpoint__Group_13__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:574:1: ( ( rule__Viewpoint__Group_13__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:575:1: ( rule__Viewpoint__Group_13__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_13()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:576:1: ( rule__Viewpoint__Group_13__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:576:2: rule__Viewpoint__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_13__0_in_rule__Viewpoint__Group__13__Impl1132);
                    rule__Viewpoint__Group_13__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__13__Impl"


    // $ANTLR start "rule__Viewpoint__Group__14"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:586:1: rule__Viewpoint__Group__14 : rule__Viewpoint__Group__14__Impl ;
    public final void rule__Viewpoint__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:590:1: ( rule__Viewpoint__Group__14__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:591:2: rule__Viewpoint__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__14__Impl_in_rule__Viewpoint__Group__141163);
            rule__Viewpoint__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__14"


    // $ANTLR start "rule__Viewpoint__Group__14__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:597:1: rule__Viewpoint__Group__14__Impl : ( '}' ) ;
    public final void rule__Viewpoint__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:601:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:602:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:602:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:603:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getRightCurlyBracketKeyword_14()); 
            }
            match(input,13,FOLLOW_13_in_rule__Viewpoint__Group__14__Impl1191); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getRightCurlyBracketKeyword_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__14__Impl"


    // $ANTLR start "rule__Viewpoint__Group_4__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:646:1: rule__Viewpoint__Group_4__0 : rule__Viewpoint__Group_4__0__Impl rule__Viewpoint__Group_4__1 ;
    public final void rule__Viewpoint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:650:1: ( rule__Viewpoint__Group_4__0__Impl rule__Viewpoint__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:651:2: rule__Viewpoint__Group_4__0__Impl rule__Viewpoint__Group_4__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_4__0__Impl_in_rule__Viewpoint__Group_4__01252);
            rule__Viewpoint__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_4__1_in_rule__Viewpoint__Group_4__01255);
            rule__Viewpoint__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_4__0"


    // $ANTLR start "rule__Viewpoint__Group_4__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:658:1: rule__Viewpoint__Group_4__0__Impl : ( 'name:' ) ;
    public final void rule__Viewpoint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:662:1: ( ( 'name:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:663:1: ( 'name:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:663:1: ( 'name:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:664:1: 'name:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getNameKeyword_4_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__Viewpoint__Group_4__0__Impl1283); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getNameKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_4__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_4__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:677:1: rule__Viewpoint__Group_4__1 : rule__Viewpoint__Group_4__1__Impl ;
    public final void rule__Viewpoint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:681:1: ( rule__Viewpoint__Group_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:682:2: rule__Viewpoint__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_4__1__Impl_in_rule__Viewpoint__Group_4__11314);
            rule__Viewpoint__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_4__1"


    // $ANTLR start "rule__Viewpoint__Group_4__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:688:1: rule__Viewpoint__Group_4__1__Impl : ( ( rule__Viewpoint__NameAssignment_4_1 ) ) ;
    public final void rule__Viewpoint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:692:1: ( ( ( rule__Viewpoint__NameAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:693:1: ( ( rule__Viewpoint__NameAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:693:1: ( ( rule__Viewpoint__NameAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:694:1: ( rule__Viewpoint__NameAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getNameAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:695:1: ( rule__Viewpoint__NameAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:695:2: rule__Viewpoint__NameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__NameAssignment_4_1_in_rule__Viewpoint__Group_4__1__Impl1341);
            rule__Viewpoint__NameAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getNameAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_4__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_5__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:709:1: rule__Viewpoint__Group_5__0 : rule__Viewpoint__Group_5__0__Impl rule__Viewpoint__Group_5__1 ;
    public final void rule__Viewpoint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:713:1: ( rule__Viewpoint__Group_5__0__Impl rule__Viewpoint__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:714:2: rule__Viewpoint__Group_5__0__Impl rule__Viewpoint__Group_5__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_5__0__Impl_in_rule__Viewpoint__Group_5__01375);
            rule__Viewpoint__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_5__1_in_rule__Viewpoint__Group_5__01378);
            rule__Viewpoint__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5__0"


    // $ANTLR start "rule__Viewpoint__Group_5__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:721:1: rule__Viewpoint__Group_5__0__Impl : ( 'description:' ) ;
    public final void rule__Viewpoint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:725:1: ( ( 'description:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:726:1: ( 'description:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:726:1: ( 'description:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:727:1: 'description:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDescriptionKeyword_5_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Viewpoint__Group_5__0__Impl1406); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getDescriptionKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_5__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:740:1: rule__Viewpoint__Group_5__1 : rule__Viewpoint__Group_5__1__Impl ;
    public final void rule__Viewpoint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:744:1: ( rule__Viewpoint__Group_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:745:2: rule__Viewpoint__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_5__1__Impl_in_rule__Viewpoint__Group_5__11437);
            rule__Viewpoint__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5__1"


    // $ANTLR start "rule__Viewpoint__Group_5__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:751:1: rule__Viewpoint__Group_5__1__Impl : ( ( rule__Viewpoint__DescriptionAssignment_5_1 ) ) ;
    public final void rule__Viewpoint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:755:1: ( ( ( rule__Viewpoint__DescriptionAssignment_5_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:756:1: ( ( rule__Viewpoint__DescriptionAssignment_5_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:756:1: ( ( rule__Viewpoint__DescriptionAssignment_5_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:757:1: ( rule__Viewpoint__DescriptionAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDescriptionAssignment_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:758:1: ( rule__Viewpoint__DescriptionAssignment_5_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:758:2: rule__Viewpoint__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__DescriptionAssignment_5_1_in_rule__Viewpoint__Group_5__1__Impl1464);
            rule__Viewpoint__DescriptionAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getDescriptionAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_6__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:772:1: rule__Viewpoint__Group_6__0 : rule__Viewpoint__Group_6__0__Impl rule__Viewpoint__Group_6__1 ;
    public final void rule__Viewpoint__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:776:1: ( rule__Viewpoint__Group_6__0__Impl rule__Viewpoint__Group_6__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:777:2: rule__Viewpoint__Group_6__0__Impl rule__Viewpoint__Group_6__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_6__0__Impl_in_rule__Viewpoint__Group_6__01498);
            rule__Viewpoint__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_6__1_in_rule__Viewpoint__Group_6__01501);
            rule__Viewpoint__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6__0"


    // $ANTLR start "rule__Viewpoint__Group_6__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:784:1: rule__Viewpoint__Group_6__0__Impl : ( 'extends' ) ;
    public final void rule__Viewpoint__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:788:1: ( ( 'extends' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:789:1: ( 'extends' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:789:1: ( 'extends' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:790:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getExtendsKeyword_6_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__Viewpoint__Group_6__0__Impl1529); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getExtendsKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_6__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:803:1: rule__Viewpoint__Group_6__1 : rule__Viewpoint__Group_6__1__Impl rule__Viewpoint__Group_6__2 ;
    public final void rule__Viewpoint__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:807:1: ( rule__Viewpoint__Group_6__1__Impl rule__Viewpoint__Group_6__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:808:2: rule__Viewpoint__Group_6__1__Impl rule__Viewpoint__Group_6__2
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_6__1__Impl_in_rule__Viewpoint__Group_6__11560);
            rule__Viewpoint__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_6__2_in_rule__Viewpoint__Group_6__11563);
            rule__Viewpoint__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6__1"


    // $ANTLR start "rule__Viewpoint__Group_6__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:815:1: rule__Viewpoint__Group_6__1__Impl : ( ( rule__Viewpoint__ParentsAssignment_6_1 ) ) ;
    public final void rule__Viewpoint__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:819:1: ( ( ( rule__Viewpoint__ParentsAssignment_6_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:820:1: ( ( rule__Viewpoint__ParentsAssignment_6_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:820:1: ( ( rule__Viewpoint__ParentsAssignment_6_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:821:1: ( rule__Viewpoint__ParentsAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsAssignment_6_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:822:1: ( rule__Viewpoint__ParentsAssignment_6_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:822:2: rule__Viewpoint__ParentsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__ParentsAssignment_6_1_in_rule__Viewpoint__Group_6__1__Impl1590);
            rule__Viewpoint__ParentsAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getParentsAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_6__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:832:1: rule__Viewpoint__Group_6__2 : rule__Viewpoint__Group_6__2__Impl ;
    public final void rule__Viewpoint__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:836:1: ( rule__Viewpoint__Group_6__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:837:2: rule__Viewpoint__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_6__2__Impl_in_rule__Viewpoint__Group_6__21620);
            rule__Viewpoint__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6__2"


    // $ANTLR start "rule__Viewpoint__Group_6__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:843:1: rule__Viewpoint__Group_6__2__Impl : ( ( rule__Viewpoint__Group_6_2__0 )* ) ;
    public final void rule__Viewpoint__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:847:1: ( ( ( rule__Viewpoint__Group_6_2__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:848:1: ( ( rule__Viewpoint__Group_6_2__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:848:1: ( ( rule__Viewpoint__Group_6_2__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:849:1: ( rule__Viewpoint__Group_6_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_6_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:850:1: ( rule__Viewpoint__Group_6_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:850:2: rule__Viewpoint__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Viewpoint__Group_6_2__0_in_rule__Viewpoint__Group_6__2__Impl1647);
            	    rule__Viewpoint__Group_6_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group_6_2__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:866:1: rule__Viewpoint__Group_6_2__0 : rule__Viewpoint__Group_6_2__0__Impl rule__Viewpoint__Group_6_2__1 ;
    public final void rule__Viewpoint__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:870:1: ( rule__Viewpoint__Group_6_2__0__Impl rule__Viewpoint__Group_6_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:871:2: rule__Viewpoint__Group_6_2__0__Impl rule__Viewpoint__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_6_2__0__Impl_in_rule__Viewpoint__Group_6_2__01684);
            rule__Viewpoint__Group_6_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_6_2__1_in_rule__Viewpoint__Group_6_2__01687);
            rule__Viewpoint__Group_6_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6_2__0"


    // $ANTLR start "rule__Viewpoint__Group_6_2__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:878:1: rule__Viewpoint__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:882:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:883:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:883:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:884:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getCommaKeyword_6_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Viewpoint__Group_6_2__0__Impl1715); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getCommaKeyword_6_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6_2__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_6_2__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:897:1: rule__Viewpoint__Group_6_2__1 : rule__Viewpoint__Group_6_2__1__Impl ;
    public final void rule__Viewpoint__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:901:1: ( rule__Viewpoint__Group_6_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:902:2: rule__Viewpoint__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_6_2__1__Impl_in_rule__Viewpoint__Group_6_2__11746);
            rule__Viewpoint__Group_6_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6_2__1"


    // $ANTLR start "rule__Viewpoint__Group_6_2__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:908:1: rule__Viewpoint__Group_6_2__1__Impl : ( ( rule__Viewpoint__ParentsAssignment_6_2_1 ) ) ;
    public final void rule__Viewpoint__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:912:1: ( ( ( rule__Viewpoint__ParentsAssignment_6_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:913:1: ( ( rule__Viewpoint__ParentsAssignment_6_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:913:1: ( ( rule__Viewpoint__ParentsAssignment_6_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:914:1: ( rule__Viewpoint__ParentsAssignment_6_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsAssignment_6_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:915:1: ( rule__Viewpoint__ParentsAssignment_6_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:915:2: rule__Viewpoint__ParentsAssignment_6_2_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__ParentsAssignment_6_2_1_in_rule__Viewpoint__Group_6_2__1__Impl1773);
            rule__Viewpoint__ParentsAssignment_6_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getParentsAssignment_6_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6_2__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:929:1: rule__Viewpoint__Group_7__0 : rule__Viewpoint__Group_7__0__Impl rule__Viewpoint__Group_7__1 ;
    public final void rule__Viewpoint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:933:1: ( rule__Viewpoint__Group_7__0__Impl rule__Viewpoint__Group_7__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:934:2: rule__Viewpoint__Group_7__0__Impl rule__Viewpoint__Group_7__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_7__0__Impl_in_rule__Viewpoint__Group_7__01807);
            rule__Viewpoint__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_7__1_in_rule__Viewpoint__Group_7__01810);
            rule__Viewpoint__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7__0"


    // $ANTLR start "rule__Viewpoint__Group_7__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:941:1: rule__Viewpoint__Group_7__0__Impl : ( 'aggregates' ) ;
    public final void rule__Viewpoint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:945:1: ( ( 'aggregates' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:946:1: ( 'aggregates' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:946:1: ( 'aggregates' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:947:1: 'aggregates'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getAggregatesKeyword_7_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Viewpoint__Group_7__0__Impl1838); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getAggregatesKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:960:1: rule__Viewpoint__Group_7__1 : rule__Viewpoint__Group_7__1__Impl rule__Viewpoint__Group_7__2 ;
    public final void rule__Viewpoint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:964:1: ( rule__Viewpoint__Group_7__1__Impl rule__Viewpoint__Group_7__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:965:2: rule__Viewpoint__Group_7__1__Impl rule__Viewpoint__Group_7__2
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_7__1__Impl_in_rule__Viewpoint__Group_7__11869);
            rule__Viewpoint__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_7__2_in_rule__Viewpoint__Group_7__11872);
            rule__Viewpoint__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7__1"


    // $ANTLR start "rule__Viewpoint__Group_7__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:972:1: rule__Viewpoint__Group_7__1__Impl : ( ( rule__Viewpoint__DependenciesAssignment_7_1 ) ) ;
    public final void rule__Viewpoint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:976:1: ( ( ( rule__Viewpoint__DependenciesAssignment_7_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:977:1: ( ( rule__Viewpoint__DependenciesAssignment_7_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:977:1: ( ( rule__Viewpoint__DependenciesAssignment_7_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:978:1: ( rule__Viewpoint__DependenciesAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesAssignment_7_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:979:1: ( rule__Viewpoint__DependenciesAssignment_7_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:979:2: rule__Viewpoint__DependenciesAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__DependenciesAssignment_7_1_in_rule__Viewpoint__Group_7__1__Impl1899);
            rule__Viewpoint__DependenciesAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getDependenciesAssignment_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:989:1: rule__Viewpoint__Group_7__2 : rule__Viewpoint__Group_7__2__Impl ;
    public final void rule__Viewpoint__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:993:1: ( rule__Viewpoint__Group_7__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:994:2: rule__Viewpoint__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_7__2__Impl_in_rule__Viewpoint__Group_7__21929);
            rule__Viewpoint__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7__2"


    // $ANTLR start "rule__Viewpoint__Group_7__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1000:1: rule__Viewpoint__Group_7__2__Impl : ( ( rule__Viewpoint__Group_7_2__0 )* ) ;
    public final void rule__Viewpoint__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1004:1: ( ( ( rule__Viewpoint__Group_7_2__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1005:1: ( ( rule__Viewpoint__Group_7_2__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1005:1: ( ( rule__Viewpoint__Group_7_2__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1006:1: ( rule__Viewpoint__Group_7_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_7_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1007:1: ( rule__Viewpoint__Group_7_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1007:2: rule__Viewpoint__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Viewpoint__Group_7_2__0_in_rule__Viewpoint__Group_7__2__Impl1956);
            	    rule__Viewpoint__Group_7_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7_2__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1023:1: rule__Viewpoint__Group_7_2__0 : rule__Viewpoint__Group_7_2__0__Impl rule__Viewpoint__Group_7_2__1 ;
    public final void rule__Viewpoint__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1027:1: ( rule__Viewpoint__Group_7_2__0__Impl rule__Viewpoint__Group_7_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1028:2: rule__Viewpoint__Group_7_2__0__Impl rule__Viewpoint__Group_7_2__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_7_2__0__Impl_in_rule__Viewpoint__Group_7_2__01993);
            rule__Viewpoint__Group_7_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_7_2__1_in_rule__Viewpoint__Group_7_2__01996);
            rule__Viewpoint__Group_7_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7_2__0"


    // $ANTLR start "rule__Viewpoint__Group_7_2__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1035:1: rule__Viewpoint__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1039:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1040:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1040:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1041:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getCommaKeyword_7_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Viewpoint__Group_7_2__0__Impl2024); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getCommaKeyword_7_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7_2__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7_2__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1054:1: rule__Viewpoint__Group_7_2__1 : rule__Viewpoint__Group_7_2__1__Impl ;
    public final void rule__Viewpoint__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1058:1: ( rule__Viewpoint__Group_7_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1059:2: rule__Viewpoint__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_7_2__1__Impl_in_rule__Viewpoint__Group_7_2__12055);
            rule__Viewpoint__Group_7_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7_2__1"


    // $ANTLR start "rule__Viewpoint__Group_7_2__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1065:1: rule__Viewpoint__Group_7_2__1__Impl : ( ( rule__Viewpoint__DependenciesAssignment_7_2_1 ) ) ;
    public final void rule__Viewpoint__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1069:1: ( ( ( rule__Viewpoint__DependenciesAssignment_7_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1070:1: ( ( rule__Viewpoint__DependenciesAssignment_7_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1070:1: ( ( rule__Viewpoint__DependenciesAssignment_7_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1071:1: ( rule__Viewpoint__DependenciesAssignment_7_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesAssignment_7_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1072:1: ( rule__Viewpoint__DependenciesAssignment_7_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1072:2: rule__Viewpoint__DependenciesAssignment_7_2_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__DependenciesAssignment_7_2_1_in_rule__Viewpoint__Group_7_2__1__Impl2082);
            rule__Viewpoint__DependenciesAssignment_7_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getDependenciesAssignment_7_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7_2__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_8__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1086:1: rule__Viewpoint__Group_8__0 : rule__Viewpoint__Group_8__0__Impl rule__Viewpoint__Group_8__1 ;
    public final void rule__Viewpoint__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1090:1: ( rule__Viewpoint__Group_8__0__Impl rule__Viewpoint__Group_8__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1091:2: rule__Viewpoint__Group_8__0__Impl rule__Viewpoint__Group_8__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_8__0__Impl_in_rule__Viewpoint__Group_8__02116);
            rule__Viewpoint__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_8__1_in_rule__Viewpoint__Group_8__02119);
            rule__Viewpoint__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_8__0"


    // $ANTLR start "rule__Viewpoint__Group_8__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1098:1: rule__Viewpoint__Group_8__0__Impl : ( 'Data' ) ;
    public final void rule__Viewpoint__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1102:1: ( ( 'Data' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1103:1: ( 'Data' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1103:1: ( 'Data' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1104:1: 'Data'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDataKeyword_8_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Viewpoint__Group_8__0__Impl2147); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getDataKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_8__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_8__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1117:1: rule__Viewpoint__Group_8__1 : rule__Viewpoint__Group_8__1__Impl ;
    public final void rule__Viewpoint__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1121:1: ( rule__Viewpoint__Group_8__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1122:2: rule__Viewpoint__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_8__1__Impl_in_rule__Viewpoint__Group_8__12178);
            rule__Viewpoint__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_8__1"


    // $ANTLR start "rule__Viewpoint__Group_8__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1128:1: rule__Viewpoint__Group_8__1__Impl : ( ( rule__Viewpoint__VP_DataAssignment_8_1 ) ) ;
    public final void rule__Viewpoint__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1132:1: ( ( ( rule__Viewpoint__VP_DataAssignment_8_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1133:1: ( ( rule__Viewpoint__VP_DataAssignment_8_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1133:1: ( ( rule__Viewpoint__VP_DataAssignment_8_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1134:1: ( rule__Viewpoint__VP_DataAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_DataAssignment_8_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1135:1: ( rule__Viewpoint__VP_DataAssignment_8_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1135:2: rule__Viewpoint__VP_DataAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_DataAssignment_8_1_in_rule__Viewpoint__Group_8__1__Impl2205);
            rule__Viewpoint__VP_DataAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_DataAssignment_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_8__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_9__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1149:1: rule__Viewpoint__Group_9__0 : rule__Viewpoint__Group_9__0__Impl rule__Viewpoint__Group_9__1 ;
    public final void rule__Viewpoint__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1153:1: ( rule__Viewpoint__Group_9__0__Impl rule__Viewpoint__Group_9__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1154:2: rule__Viewpoint__Group_9__0__Impl rule__Viewpoint__Group_9__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_9__0__Impl_in_rule__Viewpoint__Group_9__02239);
            rule__Viewpoint__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_9__1_in_rule__Viewpoint__Group_9__02242);
            rule__Viewpoint__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_9__0"


    // $ANTLR start "rule__Viewpoint__Group_9__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1161:1: rule__Viewpoint__Group_9__0__Impl : ( ( rule__Viewpoint__TypeAssignment_9_0 ) ) ;
    public final void rule__Viewpoint__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1165:1: ( ( ( rule__Viewpoint__TypeAssignment_9_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1166:1: ( ( rule__Viewpoint__TypeAssignment_9_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1166:1: ( ( rule__Viewpoint__TypeAssignment_9_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1167:1: ( rule__Viewpoint__TypeAssignment_9_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeAssignment_9_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1168:1: ( rule__Viewpoint__TypeAssignment_9_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1168:2: rule__Viewpoint__TypeAssignment_9_0
            {
            pushFollow(FOLLOW_rule__Viewpoint__TypeAssignment_9_0_in_rule__Viewpoint__Group_9__0__Impl2269);
            rule__Viewpoint__TypeAssignment_9_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeAssignment_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_9__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_9__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1178:1: rule__Viewpoint__Group_9__1 : rule__Viewpoint__Group_9__1__Impl ;
    public final void rule__Viewpoint__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1182:1: ( rule__Viewpoint__Group_9__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1183:2: rule__Viewpoint__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_9__1__Impl_in_rule__Viewpoint__Group_9__12299);
            rule__Viewpoint__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_9__1"


    // $ANTLR start "rule__Viewpoint__Group_9__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1189:1: rule__Viewpoint__Group_9__1__Impl : ( ( rule__Viewpoint__VP_AspectsAssignment_9_1 ) ) ;
    public final void rule__Viewpoint__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1193:1: ( ( ( rule__Viewpoint__VP_AspectsAssignment_9_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1194:1: ( ( rule__Viewpoint__VP_AspectsAssignment_9_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1194:1: ( ( rule__Viewpoint__VP_AspectsAssignment_9_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1195:1: ( rule__Viewpoint__VP_AspectsAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_9_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1196:1: ( rule__Viewpoint__VP_AspectsAssignment_9_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1196:2: rule__Viewpoint__VP_AspectsAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_AspectsAssignment_9_1_in_rule__Viewpoint__Group_9__1__Impl2326);
            rule__Viewpoint__VP_AspectsAssignment_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_9_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_9__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_10__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1210:1: rule__Viewpoint__Group_10__0 : rule__Viewpoint__Group_10__0__Impl rule__Viewpoint__Group_10__1 ;
    public final void rule__Viewpoint__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1214:1: ( rule__Viewpoint__Group_10__0__Impl rule__Viewpoint__Group_10__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1215:2: rule__Viewpoint__Group_10__0__Impl rule__Viewpoint__Group_10__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_10__0__Impl_in_rule__Viewpoint__Group_10__02360);
            rule__Viewpoint__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_10__1_in_rule__Viewpoint__Group_10__02363);
            rule__Viewpoint__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_10__0"


    // $ANTLR start "rule__Viewpoint__Group_10__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1222:1: rule__Viewpoint__Group_10__0__Impl : ( ( rule__Viewpoint__TypeAssignment_10_0 ) ) ;
    public final void rule__Viewpoint__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1226:1: ( ( ( rule__Viewpoint__TypeAssignment_10_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1227:1: ( ( rule__Viewpoint__TypeAssignment_10_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1227:1: ( ( rule__Viewpoint__TypeAssignment_10_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1228:1: ( rule__Viewpoint__TypeAssignment_10_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeAssignment_10_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1229:1: ( rule__Viewpoint__TypeAssignment_10_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1229:2: rule__Viewpoint__TypeAssignment_10_0
            {
            pushFollow(FOLLOW_rule__Viewpoint__TypeAssignment_10_0_in_rule__Viewpoint__Group_10__0__Impl2390);
            rule__Viewpoint__TypeAssignment_10_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeAssignment_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_10__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_10__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1239:1: rule__Viewpoint__Group_10__1 : rule__Viewpoint__Group_10__1__Impl ;
    public final void rule__Viewpoint__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1243:1: ( rule__Viewpoint__Group_10__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1244:2: rule__Viewpoint__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_10__1__Impl_in_rule__Viewpoint__Group_10__12420);
            rule__Viewpoint__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_10__1"


    // $ANTLR start "rule__Viewpoint__Group_10__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1250:1: rule__Viewpoint__Group_10__1__Impl : ( ( rule__Viewpoint__VP_AspectsAssignment_10_1 ) ) ;
    public final void rule__Viewpoint__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1254:1: ( ( ( rule__Viewpoint__VP_AspectsAssignment_10_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1255:1: ( ( rule__Viewpoint__VP_AspectsAssignment_10_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1255:1: ( ( rule__Viewpoint__VP_AspectsAssignment_10_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1256:1: ( rule__Viewpoint__VP_AspectsAssignment_10_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_10_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1257:1: ( rule__Viewpoint__VP_AspectsAssignment_10_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1257:2: rule__Viewpoint__VP_AspectsAssignment_10_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_AspectsAssignment_10_1_in_rule__Viewpoint__Group_10__1__Impl2447);
            rule__Viewpoint__VP_AspectsAssignment_10_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_10_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_10__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_11__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1271:1: rule__Viewpoint__Group_11__0 : rule__Viewpoint__Group_11__0__Impl rule__Viewpoint__Group_11__1 ;
    public final void rule__Viewpoint__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1275:1: ( rule__Viewpoint__Group_11__0__Impl rule__Viewpoint__Group_11__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1276:2: rule__Viewpoint__Group_11__0__Impl rule__Viewpoint__Group_11__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_11__0__Impl_in_rule__Viewpoint__Group_11__02481);
            rule__Viewpoint__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_11__1_in_rule__Viewpoint__Group_11__02484);
            rule__Viewpoint__Group_11__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_11__0"


    // $ANTLR start "rule__Viewpoint__Group_11__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1283:1: rule__Viewpoint__Group_11__0__Impl : ( ( rule__Viewpoint__TypeAssignment_11_0 ) ) ;
    public final void rule__Viewpoint__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1287:1: ( ( ( rule__Viewpoint__TypeAssignment_11_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1288:1: ( ( rule__Viewpoint__TypeAssignment_11_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1288:1: ( ( rule__Viewpoint__TypeAssignment_11_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1289:1: ( rule__Viewpoint__TypeAssignment_11_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeAssignment_11_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1290:1: ( rule__Viewpoint__TypeAssignment_11_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1290:2: rule__Viewpoint__TypeAssignment_11_0
            {
            pushFollow(FOLLOW_rule__Viewpoint__TypeAssignment_11_0_in_rule__Viewpoint__Group_11__0__Impl2511);
            rule__Viewpoint__TypeAssignment_11_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeAssignment_11_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_11__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_11__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1300:1: rule__Viewpoint__Group_11__1 : rule__Viewpoint__Group_11__1__Impl ;
    public final void rule__Viewpoint__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1304:1: ( rule__Viewpoint__Group_11__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1305:2: rule__Viewpoint__Group_11__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_11__1__Impl_in_rule__Viewpoint__Group_11__12541);
            rule__Viewpoint__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_11__1"


    // $ANTLR start "rule__Viewpoint__Group_11__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1311:1: rule__Viewpoint__Group_11__1__Impl : ( ( rule__Viewpoint__VP_AspectsAssignment_11_1 ) ) ;
    public final void rule__Viewpoint__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1315:1: ( ( ( rule__Viewpoint__VP_AspectsAssignment_11_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1316:1: ( ( rule__Viewpoint__VP_AspectsAssignment_11_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1316:1: ( ( rule__Viewpoint__VP_AspectsAssignment_11_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1317:1: ( rule__Viewpoint__VP_AspectsAssignment_11_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_11_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1318:1: ( rule__Viewpoint__VP_AspectsAssignment_11_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1318:2: rule__Viewpoint__VP_AspectsAssignment_11_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_AspectsAssignment_11_1_in_rule__Viewpoint__Group_11__1__Impl2568);
            rule__Viewpoint__VP_AspectsAssignment_11_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_11_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_11__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_12__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1332:1: rule__Viewpoint__Group_12__0 : rule__Viewpoint__Group_12__0__Impl rule__Viewpoint__Group_12__1 ;
    public final void rule__Viewpoint__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1336:1: ( rule__Viewpoint__Group_12__0__Impl rule__Viewpoint__Group_12__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1337:2: rule__Viewpoint__Group_12__0__Impl rule__Viewpoint__Group_12__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_12__0__Impl_in_rule__Viewpoint__Group_12__02602);
            rule__Viewpoint__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_12__1_in_rule__Viewpoint__Group_12__02605);
            rule__Viewpoint__Group_12__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_12__0"


    // $ANTLR start "rule__Viewpoint__Group_12__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1344:1: rule__Viewpoint__Group_12__0__Impl : ( ( rule__Viewpoint__TypeAssignment_12_0 ) ) ;
    public final void rule__Viewpoint__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1348:1: ( ( ( rule__Viewpoint__TypeAssignment_12_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1349:1: ( ( rule__Viewpoint__TypeAssignment_12_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1349:1: ( ( rule__Viewpoint__TypeAssignment_12_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1350:1: ( rule__Viewpoint__TypeAssignment_12_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeAssignment_12_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1351:1: ( rule__Viewpoint__TypeAssignment_12_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1351:2: rule__Viewpoint__TypeAssignment_12_0
            {
            pushFollow(FOLLOW_rule__Viewpoint__TypeAssignment_12_0_in_rule__Viewpoint__Group_12__0__Impl2632);
            rule__Viewpoint__TypeAssignment_12_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeAssignment_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_12__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_12__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1361:1: rule__Viewpoint__Group_12__1 : rule__Viewpoint__Group_12__1__Impl ;
    public final void rule__Viewpoint__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1365:1: ( rule__Viewpoint__Group_12__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1366:2: rule__Viewpoint__Group_12__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_12__1__Impl_in_rule__Viewpoint__Group_12__12662);
            rule__Viewpoint__Group_12__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_12__1"


    // $ANTLR start "rule__Viewpoint__Group_12__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1372:1: rule__Viewpoint__Group_12__1__Impl : ( ( rule__Viewpoint__VP_AspectsAssignment_12_1 ) ) ;
    public final void rule__Viewpoint__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1376:1: ( ( ( rule__Viewpoint__VP_AspectsAssignment_12_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1377:1: ( ( rule__Viewpoint__VP_AspectsAssignment_12_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1377:1: ( ( rule__Viewpoint__VP_AspectsAssignment_12_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1378:1: ( rule__Viewpoint__VP_AspectsAssignment_12_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_12_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1379:1: ( rule__Viewpoint__VP_AspectsAssignment_12_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1379:2: rule__Viewpoint__VP_AspectsAssignment_12_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_AspectsAssignment_12_1_in_rule__Viewpoint__Group_12__1__Impl2689);
            rule__Viewpoint__VP_AspectsAssignment_12_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_12_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_12__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_13__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1393:1: rule__Viewpoint__Group_13__0 : rule__Viewpoint__Group_13__0__Impl rule__Viewpoint__Group_13__1 ;
    public final void rule__Viewpoint__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1397:1: ( rule__Viewpoint__Group_13__0__Impl rule__Viewpoint__Group_13__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1398:2: rule__Viewpoint__Group_13__0__Impl rule__Viewpoint__Group_13__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_13__0__Impl_in_rule__Viewpoint__Group_13__02723);
            rule__Viewpoint__Group_13__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_13__1_in_rule__Viewpoint__Group_13__02726);
            rule__Viewpoint__Group_13__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_13__0"


    // $ANTLR start "rule__Viewpoint__Group_13__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1405:1: rule__Viewpoint__Group_13__0__Impl : ( ( rule__Viewpoint__TypeAssignment_13_0 ) ) ;
    public final void rule__Viewpoint__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1409:1: ( ( ( rule__Viewpoint__TypeAssignment_13_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1410:1: ( ( rule__Viewpoint__TypeAssignment_13_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1410:1: ( ( rule__Viewpoint__TypeAssignment_13_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1411:1: ( rule__Viewpoint__TypeAssignment_13_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeAssignment_13_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1412:1: ( rule__Viewpoint__TypeAssignment_13_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1412:2: rule__Viewpoint__TypeAssignment_13_0
            {
            pushFollow(FOLLOW_rule__Viewpoint__TypeAssignment_13_0_in_rule__Viewpoint__Group_13__0__Impl2753);
            rule__Viewpoint__TypeAssignment_13_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeAssignment_13_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_13__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_13__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1422:1: rule__Viewpoint__Group_13__1 : rule__Viewpoint__Group_13__1__Impl ;
    public final void rule__Viewpoint__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1426:1: ( rule__Viewpoint__Group_13__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1427:2: rule__Viewpoint__Group_13__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_13__1__Impl_in_rule__Viewpoint__Group_13__12783);
            rule__Viewpoint__Group_13__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_13__1"


    // $ANTLR start "rule__Viewpoint__Group_13__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1433:1: rule__Viewpoint__Group_13__1__Impl : ( ( rule__Viewpoint__VP_AspectsAssignment_13_1 ) ) ;
    public final void rule__Viewpoint__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1437:1: ( ( ( rule__Viewpoint__VP_AspectsAssignment_13_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1438:1: ( ( rule__Viewpoint__VP_AspectsAssignment_13_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1438:1: ( ( rule__Viewpoint__VP_AspectsAssignment_13_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1439:1: ( rule__Viewpoint__VP_AspectsAssignment_13_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_13_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1440:1: ( rule__Viewpoint__VP_AspectsAssignment_13_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1440:2: rule__Viewpoint__VP_AspectsAssignment_13_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_AspectsAssignment_13_1_in_rule__Viewpoint__Group_13__1__Impl2810);
            rule__Viewpoint__VP_AspectsAssignment_13_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_13_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_13__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1454:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1458:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1459:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__02844);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__02847);
            rule__FQN__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1466:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1470:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1471:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1471:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1472:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl2874); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1483:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1487:1: ( rule__FQN__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1488:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__12903);
            rule__FQN__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1494:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1498:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1499:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1499:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1500:1: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1501:1: ( rule__FQN__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1501:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl2930);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1515:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1519:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1520:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__02965);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__02968);
            rule__FQN__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1527:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1531:1: ( ( '.' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1532:1: ( '.' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1532:1: ( '.' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1533:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__FQN__Group_1__0__Impl2996); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1546:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1550:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1551:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__13027);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1557:1: rule__FQN__Group_1__1__Impl : ( ( RULE_ID ) ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1561:1: ( ( ( RULE_ID ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1562:1: ( ( RULE_ID ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1562:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1563:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1564:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1564:3: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl3055); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Viewpoint__ShortNameAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1579:1: rule__Viewpoint__ShortNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Viewpoint__ShortNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1583:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1584:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1584:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1585:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getShortNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Viewpoint__ShortNameAssignment_23094); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getShortNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__ShortNameAssignment_2"


    // $ANTLR start "rule__Viewpoint__NameAssignment_4_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1594:1: rule__Viewpoint__NameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Viewpoint__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1598:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1599:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1599:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1600:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getNameSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Viewpoint__NameAssignment_4_13125); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getNameSTRINGTerminalRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__NameAssignment_4_1"


    // $ANTLR start "rule__Viewpoint__DescriptionAssignment_5_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1609:1: rule__Viewpoint__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1613:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1614:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1614:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1615:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__DescriptionAssignment_5_13156);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__DescriptionAssignment_5_1"


    // $ANTLR start "rule__Viewpoint__ParentsAssignment_6_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1624:1: rule__Viewpoint__ParentsAssignment_6_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__ParentsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1628:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1629:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1629:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1630:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsViewpointCrossReference_6_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1631:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1632:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsViewpointFQNParserRuleCall_6_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__ParentsAssignment_6_13191);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getParentsViewpointFQNParserRuleCall_6_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getParentsViewpointCrossReference_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__ParentsAssignment_6_1"


    // $ANTLR start "rule__Viewpoint__ParentsAssignment_6_2_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1643:1: rule__Viewpoint__ParentsAssignment_6_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__ParentsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1647:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1648:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1648:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1649:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsViewpointCrossReference_6_2_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1650:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1651:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsViewpointFQNParserRuleCall_6_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__ParentsAssignment_6_2_13230);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getParentsViewpointFQNParserRuleCall_6_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getParentsViewpointCrossReference_6_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__ParentsAssignment_6_2_1"


    // $ANTLR start "rule__Viewpoint__DependenciesAssignment_7_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1662:1: rule__Viewpoint__DependenciesAssignment_7_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__DependenciesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1666:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1667:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1667:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1668:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesViewpointCrossReference_7_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1669:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1670:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesViewpointFQNParserRuleCall_7_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__DependenciesAssignment_7_13269);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getDependenciesViewpointFQNParserRuleCall_7_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getDependenciesViewpointCrossReference_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__DependenciesAssignment_7_1"


    // $ANTLR start "rule__Viewpoint__DependenciesAssignment_7_2_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1681:1: rule__Viewpoint__DependenciesAssignment_7_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__DependenciesAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1685:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1686:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1686:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1687:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesViewpointCrossReference_7_2_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1688:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1689:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesViewpointFQNParserRuleCall_7_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__DependenciesAssignment_7_2_13308);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getDependenciesViewpointFQNParserRuleCall_7_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getDependenciesViewpointCrossReference_7_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__DependenciesAssignment_7_2_1"


    // $ANTLR start "rule__Viewpoint__VP_DataAssignment_8_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1700:1: rule__Viewpoint__VP_DataAssignment_8_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_DataAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1704:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1705:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1705:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1706:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_DataDataCrossReference_8_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1707:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1708:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_DataDataFQNParserRuleCall_8_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_DataAssignment_8_13347);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_DataDataFQNParserRuleCall_8_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_DataDataCrossReference_8_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__VP_DataAssignment_8_1"


    // $ANTLR start "rule__Viewpoint__TypeAssignment_9_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1719:1: rule__Viewpoint__TypeAssignment_9_0 : ( ( 'UI' ) ) ;
    public final void rule__Viewpoint__TypeAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1723:1: ( ( ( 'UI' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1724:1: ( ( 'UI' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1724:1: ( ( 'UI' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1725:1: ( 'UI' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeUIKeyword_9_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1726:1: ( 'UI' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1727:1: 'UI'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeUIKeyword_9_0_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Viewpoint__TypeAssignment_9_03387); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeUIKeyword_9_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeUIKeyword_9_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__TypeAssignment_9_0"


    // $ANTLR start "rule__Viewpoint__VP_AspectsAssignment_9_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1742:1: rule__Viewpoint__VP_AspectsAssignment_9_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_AspectsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1746:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1747:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1747:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1748:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionCrossReference_9_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1749:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1750:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionFQNParserRuleCall_9_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_9_13430);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionFQNParserRuleCall_9_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionCrossReference_9_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__VP_AspectsAssignment_9_1"


    // $ANTLR start "rule__Viewpoint__TypeAssignment_10_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1761:1: rule__Viewpoint__TypeAssignment_10_0 : ( ( 'Diagrams' ) ) ;
    public final void rule__Viewpoint__TypeAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1765:1: ( ( ( 'Diagrams' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1766:1: ( ( 'Diagrams' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1766:1: ( ( 'Diagrams' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1767:1: ( 'Diagrams' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_10_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1768:1: ( 'Diagrams' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1769:1: 'Diagrams'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_10_0_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__Viewpoint__TypeAssignment_10_03470); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_10_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_10_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__TypeAssignment_10_0"


    // $ANTLR start "rule__Viewpoint__VP_AspectsAssignment_10_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1784:1: rule__Viewpoint__VP_AspectsAssignment_10_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_AspectsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1788:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1789:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1789:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1790:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetCrossReference_10_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1791:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1792:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetFQNParserRuleCall_10_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_10_13513);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetFQNParserRuleCall_10_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetCrossReference_10_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__VP_AspectsAssignment_10_1"


    // $ANTLR start "rule__Viewpoint__TypeAssignment_11_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1803:1: rule__Viewpoint__TypeAssignment_11_0 : ( ( 'Services' ) ) ;
    public final void rule__Viewpoint__TypeAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1807:1: ( ( ( 'Services' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1808:1: ( ( 'Services' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1808:1: ( ( 'Services' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1809:1: ( 'Services' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeServicesKeyword_11_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1810:1: ( 'Services' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1811:1: 'Services'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeServicesKeyword_11_0_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Viewpoint__TypeAssignment_11_03553); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeServicesKeyword_11_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeServicesKeyword_11_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__TypeAssignment_11_0"


    // $ANTLR start "rule__Viewpoint__VP_AspectsAssignment_11_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1826:1: rule__Viewpoint__VP_AspectsAssignment_11_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_AspectsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1830:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1831:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1831:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1832:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetCrossReference_11_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1833:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1834:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetFQNParserRuleCall_11_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_11_13596);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetFQNParserRuleCall_11_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetCrossReference_11_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__VP_AspectsAssignment_11_1"


    // $ANTLR start "rule__Viewpoint__TypeAssignment_12_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1845:1: rule__Viewpoint__TypeAssignment_12_0 : ( ( 'Build' ) ) ;
    public final void rule__Viewpoint__TypeAssignment_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1849:1: ( ( ( 'Build' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1850:1: ( ( 'Build' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1850:1: ( ( 'Build' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1851:1: ( 'Build' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeBuildKeyword_12_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1852:1: ( 'Build' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1853:1: 'Build'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeBuildKeyword_12_0_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Viewpoint__TypeAssignment_12_03636); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeBuildKeyword_12_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeBuildKeyword_12_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__TypeAssignment_12_0"


    // $ANTLR start "rule__Viewpoint__VP_AspectsAssignment_12_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1868:1: rule__Viewpoint__VP_AspectsAssignment_12_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_AspectsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1872:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1873:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1873:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1874:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsBuildCrossReference_12_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1875:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1876:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsBuildFQNParserRuleCall_12_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_12_13679);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsBuildFQNParserRuleCall_12_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsBuildCrossReference_12_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__VP_AspectsAssignment_12_1"


    // $ANTLR start "rule__Viewpoint__TypeAssignment_13_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1887:1: rule__Viewpoint__TypeAssignment_13_0 : ( ( 'Configuration' ) ) ;
    public final void rule__Viewpoint__TypeAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1891:1: ( ( ( 'Configuration' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1892:1: ( ( 'Configuration' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1892:1: ( ( 'Configuration' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1893:1: ( 'Configuration' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_13_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1894:1: ( 'Configuration' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1895:1: 'Configuration'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_13_0_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Viewpoint__TypeAssignment_13_03719); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_13_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_13_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__TypeAssignment_13_0"


    // $ANTLR start "rule__Viewpoint__VP_AspectsAssignment_13_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1910:1: rule__Viewpoint__VP_AspectsAssignment_13_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_AspectsAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1914:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1915:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1915:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1916:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationCrossReference_13_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1917:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1918:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationFQNParserRuleCall_13_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_13_13762);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationFQNParserRuleCall_13_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationCrossReference_13_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__VP_AspectsAssignment_13_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleViewpoint_in_entryRuleViewpoint67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewpoint74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__0_in_ruleViewpoint100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__0__Impl_in_rule__Viewpoint__Group__0308 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__1_in_rule__Viewpoint__Group__0311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__1__Impl_in_rule__Viewpoint__Group__1369 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__2_in_rule__Viewpoint__Group__1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Viewpoint__Group__1__Impl400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__2__Impl_in_rule__Viewpoint__Group__2431 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__3_in_rule__Viewpoint__Group__2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__ShortNameAssignment_2_in_rule__Viewpoint__Group__2__Impl461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__3__Impl_in_rule__Viewpoint__Group__3492 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__4_in_rule__Viewpoint__Group__3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Viewpoint__Group__3__Impl523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__4__Impl_in_rule__Viewpoint__Group__4554 = new BitSet(new long[]{0x0000000003EDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__5_in_rule__Viewpoint__Group__4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_4__0_in_rule__Viewpoint__Group__4__Impl584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__5__Impl_in_rule__Viewpoint__Group__5614 = new BitSet(new long[]{0x0000000003EDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__6_in_rule__Viewpoint__Group__5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_5__0_in_rule__Viewpoint__Group__5__Impl644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__6__Impl_in_rule__Viewpoint__Group__6675 = new BitSet(new long[]{0x0000000003EDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__7_in_rule__Viewpoint__Group__6678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__0_in_rule__Viewpoint__Group__6__Impl705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__7__Impl_in_rule__Viewpoint__Group__7736 = new BitSet(new long[]{0x0000000003EDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__8_in_rule__Viewpoint__Group__7739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__0_in_rule__Viewpoint__Group__7__Impl766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__8__Impl_in_rule__Viewpoint__Group__8797 = new BitSet(new long[]{0x0000000003EDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__9_in_rule__Viewpoint__Group__8800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8__0_in_rule__Viewpoint__Group__8__Impl827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__9__Impl_in_rule__Viewpoint__Group__9858 = new BitSet(new long[]{0x0000000003EDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__10_in_rule__Viewpoint__Group__9861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9__0_in_rule__Viewpoint__Group__9__Impl888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__10__Impl_in_rule__Viewpoint__Group__10919 = new BitSet(new long[]{0x0000000003EDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__11_in_rule__Viewpoint__Group__10922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10__0_in_rule__Viewpoint__Group__10__Impl949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__11__Impl_in_rule__Viewpoint__Group__11980 = new BitSet(new long[]{0x0000000003EDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__12_in_rule__Viewpoint__Group__11983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11__0_in_rule__Viewpoint__Group__11__Impl1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__12__Impl_in_rule__Viewpoint__Group__121041 = new BitSet(new long[]{0x0000000003EDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__13_in_rule__Viewpoint__Group__121044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12__0_in_rule__Viewpoint__Group__12__Impl1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__13__Impl_in_rule__Viewpoint__Group__131102 = new BitSet(new long[]{0x0000000003EDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__14_in_rule__Viewpoint__Group__131105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_13__0_in_rule__Viewpoint__Group__13__Impl1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__14__Impl_in_rule__Viewpoint__Group__141163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Viewpoint__Group__14__Impl1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_4__0__Impl_in_rule__Viewpoint__Group_4__01252 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_4__1_in_rule__Viewpoint__Group_4__01255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Viewpoint__Group_4__0__Impl1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_4__1__Impl_in_rule__Viewpoint__Group_4__11314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__NameAssignment_4_1_in_rule__Viewpoint__Group_4__1__Impl1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_5__0__Impl_in_rule__Viewpoint__Group_5__01375 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_5__1_in_rule__Viewpoint__Group_5__01378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Viewpoint__Group_5__0__Impl1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_5__1__Impl_in_rule__Viewpoint__Group_5__11437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__DescriptionAssignment_5_1_in_rule__Viewpoint__Group_5__1__Impl1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__0__Impl_in_rule__Viewpoint__Group_6__01498 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__1_in_rule__Viewpoint__Group_6__01501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Viewpoint__Group_6__0__Impl1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__1__Impl_in_rule__Viewpoint__Group_6__11560 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__2_in_rule__Viewpoint__Group_6__11563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__ParentsAssignment_6_1_in_rule__Viewpoint__Group_6__1__Impl1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__2__Impl_in_rule__Viewpoint__Group_6__21620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6_2__0_in_rule__Viewpoint__Group_6__2__Impl1647 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6_2__0__Impl_in_rule__Viewpoint__Group_6_2__01684 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6_2__1_in_rule__Viewpoint__Group_6_2__01687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Viewpoint__Group_6_2__0__Impl1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6_2__1__Impl_in_rule__Viewpoint__Group_6_2__11746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__ParentsAssignment_6_2_1_in_rule__Viewpoint__Group_6_2__1__Impl1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__0__Impl_in_rule__Viewpoint__Group_7__01807 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__1_in_rule__Viewpoint__Group_7__01810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Viewpoint__Group_7__0__Impl1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__1__Impl_in_rule__Viewpoint__Group_7__11869 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__2_in_rule__Viewpoint__Group_7__11872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__DependenciesAssignment_7_1_in_rule__Viewpoint__Group_7__1__Impl1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__2__Impl_in_rule__Viewpoint__Group_7__21929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7_2__0_in_rule__Viewpoint__Group_7__2__Impl1956 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7_2__0__Impl_in_rule__Viewpoint__Group_7_2__01993 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7_2__1_in_rule__Viewpoint__Group_7_2__01996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Viewpoint__Group_7_2__0__Impl2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7_2__1__Impl_in_rule__Viewpoint__Group_7_2__12055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__DependenciesAssignment_7_2_1_in_rule__Viewpoint__Group_7_2__1__Impl2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8__0__Impl_in_rule__Viewpoint__Group_8__02116 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8__1_in_rule__Viewpoint__Group_8__02119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Viewpoint__Group_8__0__Impl2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8__1__Impl_in_rule__Viewpoint__Group_8__12178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_DataAssignment_8_1_in_rule__Viewpoint__Group_8__1__Impl2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9__0__Impl_in_rule__Viewpoint__Group_9__02239 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9__1_in_rule__Viewpoint__Group_9__02242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__TypeAssignment_9_0_in_rule__Viewpoint__Group_9__0__Impl2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9__1__Impl_in_rule__Viewpoint__Group_9__12299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_AspectsAssignment_9_1_in_rule__Viewpoint__Group_9__1__Impl2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10__0__Impl_in_rule__Viewpoint__Group_10__02360 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10__1_in_rule__Viewpoint__Group_10__02363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__TypeAssignment_10_0_in_rule__Viewpoint__Group_10__0__Impl2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10__1__Impl_in_rule__Viewpoint__Group_10__12420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_AspectsAssignment_10_1_in_rule__Viewpoint__Group_10__1__Impl2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11__0__Impl_in_rule__Viewpoint__Group_11__02481 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11__1_in_rule__Viewpoint__Group_11__02484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__TypeAssignment_11_0_in_rule__Viewpoint__Group_11__0__Impl2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11__1__Impl_in_rule__Viewpoint__Group_11__12541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_AspectsAssignment_11_1_in_rule__Viewpoint__Group_11__1__Impl2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12__0__Impl_in_rule__Viewpoint__Group_12__02602 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12__1_in_rule__Viewpoint__Group_12__02605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__TypeAssignment_12_0_in_rule__Viewpoint__Group_12__0__Impl2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12__1__Impl_in_rule__Viewpoint__Group_12__12662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_AspectsAssignment_12_1_in_rule__Viewpoint__Group_12__1__Impl2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_13__0__Impl_in_rule__Viewpoint__Group_13__02723 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_13__1_in_rule__Viewpoint__Group_13__02726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__TypeAssignment_13_0_in_rule__Viewpoint__Group_13__0__Impl2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_13__1__Impl_in_rule__Viewpoint__Group_13__12783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_AspectsAssignment_13_1_in_rule__Viewpoint__Group_13__1__Impl2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__02844 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__02847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__12903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl2930 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__02965 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__02968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FQN__Group_1__0__Impl2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__13027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Viewpoint__ShortNameAssignment_23094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Viewpoint__NameAssignment_4_13125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__DescriptionAssignment_5_13156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__ParentsAssignment_6_13191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__ParentsAssignment_6_2_13230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__DependenciesAssignment_7_13269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__DependenciesAssignment_7_2_13308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_DataAssignment_8_13347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Viewpoint__TypeAssignment_9_03387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_9_13430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Viewpoint__TypeAssignment_10_03470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_10_13513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Viewpoint__TypeAssignment_11_03553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_11_13596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Viewpoint__TypeAssignment_12_03636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_12_13679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Viewpoint__TypeAssignment_13_03719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_13_13762 = new BitSet(new long[]{0x0000000000000002L});

}
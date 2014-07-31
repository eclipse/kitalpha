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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Viewpoint'", "'{'", "'}'", "'name:'", "'description:'", "'extends'", "','", "'aggregates'", "'use viewpoint:'", "'use anyEMF:'", "'use diagram:'", "'Data'", "'.'", "'UI'", "'Diagrams'", "'Services'", "'Build'", "'Configuration'"
    };
    public static final int RULE_ID=5;
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

            if ( (LA7_0==20) ) {
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

            if ( (LA8_0==21) ) {
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

            if ( (LA9_0==22) ) {
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:586:1: rule__Viewpoint__Group__14 : rule__Viewpoint__Group__14__Impl rule__Viewpoint__Group__15 ;
    public final void rule__Viewpoint__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:590:1: ( rule__Viewpoint__Group__14__Impl rule__Viewpoint__Group__15 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:591:2: rule__Viewpoint__Group__14__Impl rule__Viewpoint__Group__15
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__14__Impl_in_rule__Viewpoint__Group__141163);
            rule__Viewpoint__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__15_in_rule__Viewpoint__Group__141166);
            rule__Viewpoint__Group__15();

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:598:1: rule__Viewpoint__Group__14__Impl : ( ( rule__Viewpoint__Group_14__0 )? ) ;
    public final void rule__Viewpoint__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:602:1: ( ( ( rule__Viewpoint__Group_14__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:603:1: ( ( rule__Viewpoint__Group_14__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:603:1: ( ( rule__Viewpoint__Group_14__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:604:1: ( rule__Viewpoint__Group_14__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_14()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:605:1: ( rule__Viewpoint__Group_14__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:605:2: rule__Viewpoint__Group_14__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_14__0_in_rule__Viewpoint__Group__14__Impl1193);
                    rule__Viewpoint__Group_14__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_14()); 
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


    // $ANTLR start "rule__Viewpoint__Group__15"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:615:1: rule__Viewpoint__Group__15 : rule__Viewpoint__Group__15__Impl rule__Viewpoint__Group__16 ;
    public final void rule__Viewpoint__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:619:1: ( rule__Viewpoint__Group__15__Impl rule__Viewpoint__Group__16 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:620:2: rule__Viewpoint__Group__15__Impl rule__Viewpoint__Group__16
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__15__Impl_in_rule__Viewpoint__Group__151224);
            rule__Viewpoint__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__16_in_rule__Viewpoint__Group__151227);
            rule__Viewpoint__Group__16();

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
    // $ANTLR end "rule__Viewpoint__Group__15"


    // $ANTLR start "rule__Viewpoint__Group__15__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:627:1: rule__Viewpoint__Group__15__Impl : ( ( rule__Viewpoint__Group_15__0 )? ) ;
    public final void rule__Viewpoint__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:631:1: ( ( ( rule__Viewpoint__Group_15__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:632:1: ( ( rule__Viewpoint__Group_15__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:632:1: ( ( rule__Viewpoint__Group_15__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:633:1: ( rule__Viewpoint__Group_15__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_15()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:634:1: ( rule__Viewpoint__Group_15__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:634:2: rule__Viewpoint__Group_15__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_15__0_in_rule__Viewpoint__Group__15__Impl1254);
                    rule__Viewpoint__Group_15__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_15()); 
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
    // $ANTLR end "rule__Viewpoint__Group__15__Impl"


    // $ANTLR start "rule__Viewpoint__Group__16"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:644:1: rule__Viewpoint__Group__16 : rule__Viewpoint__Group__16__Impl rule__Viewpoint__Group__17 ;
    public final void rule__Viewpoint__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:648:1: ( rule__Viewpoint__Group__16__Impl rule__Viewpoint__Group__17 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:649:2: rule__Viewpoint__Group__16__Impl rule__Viewpoint__Group__17
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__16__Impl_in_rule__Viewpoint__Group__161285);
            rule__Viewpoint__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__17_in_rule__Viewpoint__Group__161288);
            rule__Viewpoint__Group__17();

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
    // $ANTLR end "rule__Viewpoint__Group__16"


    // $ANTLR start "rule__Viewpoint__Group__16__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:656:1: rule__Viewpoint__Group__16__Impl : ( ( rule__Viewpoint__Group_16__0 )? ) ;
    public final void rule__Viewpoint__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:660:1: ( ( ( rule__Viewpoint__Group_16__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:661:1: ( ( rule__Viewpoint__Group_16__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:661:1: ( ( rule__Viewpoint__Group_16__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:662:1: ( rule__Viewpoint__Group_16__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_16()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:663:1: ( rule__Viewpoint__Group_16__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:663:2: rule__Viewpoint__Group_16__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_16__0_in_rule__Viewpoint__Group__16__Impl1315);
                    rule__Viewpoint__Group_16__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_16()); 
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
    // $ANTLR end "rule__Viewpoint__Group__16__Impl"


    // $ANTLR start "rule__Viewpoint__Group__17"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:673:1: rule__Viewpoint__Group__17 : rule__Viewpoint__Group__17__Impl ;
    public final void rule__Viewpoint__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:677:1: ( rule__Viewpoint__Group__17__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:678:2: rule__Viewpoint__Group__17__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__17__Impl_in_rule__Viewpoint__Group__171346);
            rule__Viewpoint__Group__17__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group__17"


    // $ANTLR start "rule__Viewpoint__Group__17__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:684:1: rule__Viewpoint__Group__17__Impl : ( '}' ) ;
    public final void rule__Viewpoint__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:688:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:689:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:689:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:690:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getRightCurlyBracketKeyword_17()); 
            }
            match(input,13,FOLLOW_13_in_rule__Viewpoint__Group__17__Impl1374); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getRightCurlyBracketKeyword_17()); 
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
    // $ANTLR end "rule__Viewpoint__Group__17__Impl"


    // $ANTLR start "rule__Viewpoint__Group_4__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:739:1: rule__Viewpoint__Group_4__0 : rule__Viewpoint__Group_4__0__Impl rule__Viewpoint__Group_4__1 ;
    public final void rule__Viewpoint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:743:1: ( rule__Viewpoint__Group_4__0__Impl rule__Viewpoint__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:744:2: rule__Viewpoint__Group_4__0__Impl rule__Viewpoint__Group_4__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_4__0__Impl_in_rule__Viewpoint__Group_4__01441);
            rule__Viewpoint__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_4__1_in_rule__Viewpoint__Group_4__01444);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:751:1: rule__Viewpoint__Group_4__0__Impl : ( 'name:' ) ;
    public final void rule__Viewpoint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:755:1: ( ( 'name:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:756:1: ( 'name:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:756:1: ( 'name:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:757:1: 'name:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getNameKeyword_4_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__Viewpoint__Group_4__0__Impl1472); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:770:1: rule__Viewpoint__Group_4__1 : rule__Viewpoint__Group_4__1__Impl ;
    public final void rule__Viewpoint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:774:1: ( rule__Viewpoint__Group_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:775:2: rule__Viewpoint__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_4__1__Impl_in_rule__Viewpoint__Group_4__11503);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:781:1: rule__Viewpoint__Group_4__1__Impl : ( ( rule__Viewpoint__NameAssignment_4_1 ) ) ;
    public final void rule__Viewpoint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:785:1: ( ( ( rule__Viewpoint__NameAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:786:1: ( ( rule__Viewpoint__NameAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:786:1: ( ( rule__Viewpoint__NameAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:787:1: ( rule__Viewpoint__NameAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getNameAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:788:1: ( rule__Viewpoint__NameAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:788:2: rule__Viewpoint__NameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__NameAssignment_4_1_in_rule__Viewpoint__Group_4__1__Impl1530);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:802:1: rule__Viewpoint__Group_5__0 : rule__Viewpoint__Group_5__0__Impl rule__Viewpoint__Group_5__1 ;
    public final void rule__Viewpoint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:806:1: ( rule__Viewpoint__Group_5__0__Impl rule__Viewpoint__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:807:2: rule__Viewpoint__Group_5__0__Impl rule__Viewpoint__Group_5__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_5__0__Impl_in_rule__Viewpoint__Group_5__01564);
            rule__Viewpoint__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_5__1_in_rule__Viewpoint__Group_5__01567);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:814:1: rule__Viewpoint__Group_5__0__Impl : ( 'description:' ) ;
    public final void rule__Viewpoint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:818:1: ( ( 'description:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:819:1: ( 'description:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:819:1: ( 'description:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:820:1: 'description:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDescriptionKeyword_5_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Viewpoint__Group_5__0__Impl1595); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:833:1: rule__Viewpoint__Group_5__1 : rule__Viewpoint__Group_5__1__Impl ;
    public final void rule__Viewpoint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:837:1: ( rule__Viewpoint__Group_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:838:2: rule__Viewpoint__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_5__1__Impl_in_rule__Viewpoint__Group_5__11626);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:844:1: rule__Viewpoint__Group_5__1__Impl : ( ( rule__Viewpoint__DescriptionAssignment_5_1 ) ) ;
    public final void rule__Viewpoint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:848:1: ( ( ( rule__Viewpoint__DescriptionAssignment_5_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:849:1: ( ( rule__Viewpoint__DescriptionAssignment_5_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:849:1: ( ( rule__Viewpoint__DescriptionAssignment_5_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:850:1: ( rule__Viewpoint__DescriptionAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDescriptionAssignment_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:851:1: ( rule__Viewpoint__DescriptionAssignment_5_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:851:2: rule__Viewpoint__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__DescriptionAssignment_5_1_in_rule__Viewpoint__Group_5__1__Impl1653);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:865:1: rule__Viewpoint__Group_6__0 : rule__Viewpoint__Group_6__0__Impl rule__Viewpoint__Group_6__1 ;
    public final void rule__Viewpoint__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:869:1: ( rule__Viewpoint__Group_6__0__Impl rule__Viewpoint__Group_6__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:870:2: rule__Viewpoint__Group_6__0__Impl rule__Viewpoint__Group_6__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_6__0__Impl_in_rule__Viewpoint__Group_6__01687);
            rule__Viewpoint__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_6__1_in_rule__Viewpoint__Group_6__01690);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:877:1: rule__Viewpoint__Group_6__0__Impl : ( 'extends' ) ;
    public final void rule__Viewpoint__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:881:1: ( ( 'extends' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:882:1: ( 'extends' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:882:1: ( 'extends' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:883:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getExtendsKeyword_6_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__Viewpoint__Group_6__0__Impl1718); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:896:1: rule__Viewpoint__Group_6__1 : rule__Viewpoint__Group_6__1__Impl rule__Viewpoint__Group_6__2 ;
    public final void rule__Viewpoint__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:900:1: ( rule__Viewpoint__Group_6__1__Impl rule__Viewpoint__Group_6__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:901:2: rule__Viewpoint__Group_6__1__Impl rule__Viewpoint__Group_6__2
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_6__1__Impl_in_rule__Viewpoint__Group_6__11749);
            rule__Viewpoint__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_6__2_in_rule__Viewpoint__Group_6__11752);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:908:1: rule__Viewpoint__Group_6__1__Impl : ( ( rule__Viewpoint__ParentsAssignment_6_1 ) ) ;
    public final void rule__Viewpoint__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:912:1: ( ( ( rule__Viewpoint__ParentsAssignment_6_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:913:1: ( ( rule__Viewpoint__ParentsAssignment_6_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:913:1: ( ( rule__Viewpoint__ParentsAssignment_6_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:914:1: ( rule__Viewpoint__ParentsAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsAssignment_6_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:915:1: ( rule__Viewpoint__ParentsAssignment_6_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:915:2: rule__Viewpoint__ParentsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__ParentsAssignment_6_1_in_rule__Viewpoint__Group_6__1__Impl1779);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:925:1: rule__Viewpoint__Group_6__2 : rule__Viewpoint__Group_6__2__Impl ;
    public final void rule__Viewpoint__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:929:1: ( rule__Viewpoint__Group_6__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:930:2: rule__Viewpoint__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_6__2__Impl_in_rule__Viewpoint__Group_6__21809);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:936:1: rule__Viewpoint__Group_6__2__Impl : ( ( rule__Viewpoint__Group_6_2__0 )* ) ;
    public final void rule__Viewpoint__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:940:1: ( ( ( rule__Viewpoint__Group_6_2__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:941:1: ( ( rule__Viewpoint__Group_6_2__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:941:1: ( ( rule__Viewpoint__Group_6_2__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:942:1: ( rule__Viewpoint__Group_6_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_6_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:943:1: ( rule__Viewpoint__Group_6_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==17) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:943:2: rule__Viewpoint__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Viewpoint__Group_6_2__0_in_rule__Viewpoint__Group_6__2__Impl1836);
            	    rule__Viewpoint__Group_6_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:959:1: rule__Viewpoint__Group_6_2__0 : rule__Viewpoint__Group_6_2__0__Impl rule__Viewpoint__Group_6_2__1 ;
    public final void rule__Viewpoint__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:963:1: ( rule__Viewpoint__Group_6_2__0__Impl rule__Viewpoint__Group_6_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:964:2: rule__Viewpoint__Group_6_2__0__Impl rule__Viewpoint__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_6_2__0__Impl_in_rule__Viewpoint__Group_6_2__01873);
            rule__Viewpoint__Group_6_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_6_2__1_in_rule__Viewpoint__Group_6_2__01876);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:971:1: rule__Viewpoint__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:975:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:976:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:976:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:977:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getCommaKeyword_6_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Viewpoint__Group_6_2__0__Impl1904); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:990:1: rule__Viewpoint__Group_6_2__1 : rule__Viewpoint__Group_6_2__1__Impl ;
    public final void rule__Viewpoint__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:994:1: ( rule__Viewpoint__Group_6_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:995:2: rule__Viewpoint__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_6_2__1__Impl_in_rule__Viewpoint__Group_6_2__11935);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1001:1: rule__Viewpoint__Group_6_2__1__Impl : ( ( rule__Viewpoint__ParentsAssignment_6_2_1 ) ) ;
    public final void rule__Viewpoint__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1005:1: ( ( ( rule__Viewpoint__ParentsAssignment_6_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1006:1: ( ( rule__Viewpoint__ParentsAssignment_6_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1006:1: ( ( rule__Viewpoint__ParentsAssignment_6_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1007:1: ( rule__Viewpoint__ParentsAssignment_6_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsAssignment_6_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1008:1: ( rule__Viewpoint__ParentsAssignment_6_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1008:2: rule__Viewpoint__ParentsAssignment_6_2_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__ParentsAssignment_6_2_1_in_rule__Viewpoint__Group_6_2__1__Impl1962);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1022:1: rule__Viewpoint__Group_7__0 : rule__Viewpoint__Group_7__0__Impl rule__Viewpoint__Group_7__1 ;
    public final void rule__Viewpoint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1026:1: ( rule__Viewpoint__Group_7__0__Impl rule__Viewpoint__Group_7__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1027:2: rule__Viewpoint__Group_7__0__Impl rule__Viewpoint__Group_7__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_7__0__Impl_in_rule__Viewpoint__Group_7__01996);
            rule__Viewpoint__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_7__1_in_rule__Viewpoint__Group_7__01999);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1034:1: rule__Viewpoint__Group_7__0__Impl : ( 'aggregates' ) ;
    public final void rule__Viewpoint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1038:1: ( ( 'aggregates' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1039:1: ( 'aggregates' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1039:1: ( 'aggregates' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1040:1: 'aggregates'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getAggregatesKeyword_7_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Viewpoint__Group_7__0__Impl2027); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1053:1: rule__Viewpoint__Group_7__1 : rule__Viewpoint__Group_7__1__Impl rule__Viewpoint__Group_7__2 ;
    public final void rule__Viewpoint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1057:1: ( rule__Viewpoint__Group_7__1__Impl rule__Viewpoint__Group_7__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1058:2: rule__Viewpoint__Group_7__1__Impl rule__Viewpoint__Group_7__2
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_7__1__Impl_in_rule__Viewpoint__Group_7__12058);
            rule__Viewpoint__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_7__2_in_rule__Viewpoint__Group_7__12061);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1065:1: rule__Viewpoint__Group_7__1__Impl : ( ( rule__Viewpoint__DependenciesAssignment_7_1 ) ) ;
    public final void rule__Viewpoint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1069:1: ( ( ( rule__Viewpoint__DependenciesAssignment_7_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1070:1: ( ( rule__Viewpoint__DependenciesAssignment_7_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1070:1: ( ( rule__Viewpoint__DependenciesAssignment_7_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1071:1: ( rule__Viewpoint__DependenciesAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesAssignment_7_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1072:1: ( rule__Viewpoint__DependenciesAssignment_7_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1072:2: rule__Viewpoint__DependenciesAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__DependenciesAssignment_7_1_in_rule__Viewpoint__Group_7__1__Impl2088);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1082:1: rule__Viewpoint__Group_7__2 : rule__Viewpoint__Group_7__2__Impl ;
    public final void rule__Viewpoint__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1086:1: ( rule__Viewpoint__Group_7__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1087:2: rule__Viewpoint__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_7__2__Impl_in_rule__Viewpoint__Group_7__22118);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1093:1: rule__Viewpoint__Group_7__2__Impl : ( ( rule__Viewpoint__Group_7_2__0 )* ) ;
    public final void rule__Viewpoint__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1097:1: ( ( ( rule__Viewpoint__Group_7_2__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1098:1: ( ( rule__Viewpoint__Group_7_2__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1098:1: ( ( rule__Viewpoint__Group_7_2__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1099:1: ( rule__Viewpoint__Group_7_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_7_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1100:1: ( rule__Viewpoint__Group_7_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1100:2: rule__Viewpoint__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Viewpoint__Group_7_2__0_in_rule__Viewpoint__Group_7__2__Impl2145);
            	    rule__Viewpoint__Group_7_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1116:1: rule__Viewpoint__Group_7_2__0 : rule__Viewpoint__Group_7_2__0__Impl rule__Viewpoint__Group_7_2__1 ;
    public final void rule__Viewpoint__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1120:1: ( rule__Viewpoint__Group_7_2__0__Impl rule__Viewpoint__Group_7_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1121:2: rule__Viewpoint__Group_7_2__0__Impl rule__Viewpoint__Group_7_2__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_7_2__0__Impl_in_rule__Viewpoint__Group_7_2__02182);
            rule__Viewpoint__Group_7_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_7_2__1_in_rule__Viewpoint__Group_7_2__02185);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1128:1: rule__Viewpoint__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1132:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1133:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1133:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1134:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getCommaKeyword_7_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Viewpoint__Group_7_2__0__Impl2213); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1147:1: rule__Viewpoint__Group_7_2__1 : rule__Viewpoint__Group_7_2__1__Impl ;
    public final void rule__Viewpoint__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1151:1: ( rule__Viewpoint__Group_7_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1152:2: rule__Viewpoint__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_7_2__1__Impl_in_rule__Viewpoint__Group_7_2__12244);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1158:1: rule__Viewpoint__Group_7_2__1__Impl : ( ( rule__Viewpoint__DependenciesAssignment_7_2_1 ) ) ;
    public final void rule__Viewpoint__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1162:1: ( ( ( rule__Viewpoint__DependenciesAssignment_7_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1163:1: ( ( rule__Viewpoint__DependenciesAssignment_7_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1163:1: ( ( rule__Viewpoint__DependenciesAssignment_7_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1164:1: ( rule__Viewpoint__DependenciesAssignment_7_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesAssignment_7_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1165:1: ( rule__Viewpoint__DependenciesAssignment_7_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1165:2: rule__Viewpoint__DependenciesAssignment_7_2_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__DependenciesAssignment_7_2_1_in_rule__Viewpoint__Group_7_2__1__Impl2271);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1179:1: rule__Viewpoint__Group_8__0 : rule__Viewpoint__Group_8__0__Impl rule__Viewpoint__Group_8__1 ;
    public final void rule__Viewpoint__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1183:1: ( rule__Viewpoint__Group_8__0__Impl rule__Viewpoint__Group_8__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1184:2: rule__Viewpoint__Group_8__0__Impl rule__Viewpoint__Group_8__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_8__0__Impl_in_rule__Viewpoint__Group_8__02305);
            rule__Viewpoint__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_8__1_in_rule__Viewpoint__Group_8__02308);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1191:1: rule__Viewpoint__Group_8__0__Impl : ( 'use viewpoint:' ) ;
    public final void rule__Viewpoint__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1195:1: ( ( 'use viewpoint:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1196:1: ( 'use viewpoint:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1196:1: ( 'use viewpoint:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1197:1: 'use viewpoint:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseViewpointKeyword_8_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Viewpoint__Group_8__0__Impl2336); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseViewpointKeyword_8_0()); 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1210:1: rule__Viewpoint__Group_8__1 : rule__Viewpoint__Group_8__1__Impl rule__Viewpoint__Group_8__2 ;
    public final void rule__Viewpoint__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1214:1: ( rule__Viewpoint__Group_8__1__Impl rule__Viewpoint__Group_8__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1215:2: rule__Viewpoint__Group_8__1__Impl rule__Viewpoint__Group_8__2
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_8__1__Impl_in_rule__Viewpoint__Group_8__12367);
            rule__Viewpoint__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_8__2_in_rule__Viewpoint__Group_8__12370);
            rule__Viewpoint__Group_8__2();

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1222:1: rule__Viewpoint__Group_8__1__Impl : ( ( rule__Viewpoint__UseViewpointAssignment_8_1 ) ) ;
    public final void rule__Viewpoint__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1226:1: ( ( ( rule__Viewpoint__UseViewpointAssignment_8_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1227:1: ( ( rule__Viewpoint__UseViewpointAssignment_8_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1227:1: ( ( rule__Viewpoint__UseViewpointAssignment_8_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1228:1: ( rule__Viewpoint__UseViewpointAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseViewpointAssignment_8_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1229:1: ( rule__Viewpoint__UseViewpointAssignment_8_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1229:2: rule__Viewpoint__UseViewpointAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseViewpointAssignment_8_1_in_rule__Viewpoint__Group_8__1__Impl2397);
            rule__Viewpoint__UseViewpointAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseViewpointAssignment_8_1()); 
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


    // $ANTLR start "rule__Viewpoint__Group_8__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1239:1: rule__Viewpoint__Group_8__2 : rule__Viewpoint__Group_8__2__Impl ;
    public final void rule__Viewpoint__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1243:1: ( rule__Viewpoint__Group_8__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1244:2: rule__Viewpoint__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_8__2__Impl_in_rule__Viewpoint__Group_8__22427);
            rule__Viewpoint__Group_8__2__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group_8__2"


    // $ANTLR start "rule__Viewpoint__Group_8__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1250:1: rule__Viewpoint__Group_8__2__Impl : ( ( rule__Viewpoint__Group_8_2__0 )* ) ;
    public final void rule__Viewpoint__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1254:1: ( ( ( rule__Viewpoint__Group_8_2__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1255:1: ( ( rule__Viewpoint__Group_8_2__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1255:1: ( ( rule__Viewpoint__Group_8_2__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1256:1: ( rule__Viewpoint__Group_8_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_8_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1257:1: ( rule__Viewpoint__Group_8_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==17) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1257:2: rule__Viewpoint__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Viewpoint__Group_8_2__0_in_rule__Viewpoint__Group_8__2__Impl2454);
            	    rule__Viewpoint__Group_8_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_8_2()); 
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
    // $ANTLR end "rule__Viewpoint__Group_8__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group_8_2__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1273:1: rule__Viewpoint__Group_8_2__0 : rule__Viewpoint__Group_8_2__0__Impl rule__Viewpoint__Group_8_2__1 ;
    public final void rule__Viewpoint__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1277:1: ( rule__Viewpoint__Group_8_2__0__Impl rule__Viewpoint__Group_8_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1278:2: rule__Viewpoint__Group_8_2__0__Impl rule__Viewpoint__Group_8_2__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_8_2__0__Impl_in_rule__Viewpoint__Group_8_2__02491);
            rule__Viewpoint__Group_8_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_8_2__1_in_rule__Viewpoint__Group_8_2__02494);
            rule__Viewpoint__Group_8_2__1();

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
    // $ANTLR end "rule__Viewpoint__Group_8_2__0"


    // $ANTLR start "rule__Viewpoint__Group_8_2__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1285:1: rule__Viewpoint__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1289:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1290:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1290:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1291:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getCommaKeyword_8_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Viewpoint__Group_8_2__0__Impl2522); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getCommaKeyword_8_2_0()); 
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
    // $ANTLR end "rule__Viewpoint__Group_8_2__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_8_2__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1304:1: rule__Viewpoint__Group_8_2__1 : rule__Viewpoint__Group_8_2__1__Impl ;
    public final void rule__Viewpoint__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1308:1: ( rule__Viewpoint__Group_8_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1309:2: rule__Viewpoint__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_8_2__1__Impl_in_rule__Viewpoint__Group_8_2__12553);
            rule__Viewpoint__Group_8_2__1__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group_8_2__1"


    // $ANTLR start "rule__Viewpoint__Group_8_2__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1315:1: rule__Viewpoint__Group_8_2__1__Impl : ( ( rule__Viewpoint__UseViewpointAssignment_8_2_1 ) ) ;
    public final void rule__Viewpoint__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1319:1: ( ( ( rule__Viewpoint__UseViewpointAssignment_8_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1320:1: ( ( rule__Viewpoint__UseViewpointAssignment_8_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1320:1: ( ( rule__Viewpoint__UseViewpointAssignment_8_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1321:1: ( rule__Viewpoint__UseViewpointAssignment_8_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseViewpointAssignment_8_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1322:1: ( rule__Viewpoint__UseViewpointAssignment_8_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1322:2: rule__Viewpoint__UseViewpointAssignment_8_2_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseViewpointAssignment_8_2_1_in_rule__Viewpoint__Group_8_2__1__Impl2580);
            rule__Viewpoint__UseViewpointAssignment_8_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseViewpointAssignment_8_2_1()); 
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
    // $ANTLR end "rule__Viewpoint__Group_8_2__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_9__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1336:1: rule__Viewpoint__Group_9__0 : rule__Viewpoint__Group_9__0__Impl rule__Viewpoint__Group_9__1 ;
    public final void rule__Viewpoint__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1340:1: ( rule__Viewpoint__Group_9__0__Impl rule__Viewpoint__Group_9__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1341:2: rule__Viewpoint__Group_9__0__Impl rule__Viewpoint__Group_9__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_9__0__Impl_in_rule__Viewpoint__Group_9__02614);
            rule__Viewpoint__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_9__1_in_rule__Viewpoint__Group_9__02617);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1348:1: rule__Viewpoint__Group_9__0__Impl : ( 'use anyEMF:' ) ;
    public final void rule__Viewpoint__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1352:1: ( ( 'use anyEMF:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1353:1: ( 'use anyEMF:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1353:1: ( 'use anyEMF:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1354:1: 'use anyEMF:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseAnyEMFKeyword_9_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Viewpoint__Group_9__0__Impl2645); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseAnyEMFKeyword_9_0()); 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1367:1: rule__Viewpoint__Group_9__1 : rule__Viewpoint__Group_9__1__Impl rule__Viewpoint__Group_9__2 ;
    public final void rule__Viewpoint__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1371:1: ( rule__Viewpoint__Group_9__1__Impl rule__Viewpoint__Group_9__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1372:2: rule__Viewpoint__Group_9__1__Impl rule__Viewpoint__Group_9__2
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_9__1__Impl_in_rule__Viewpoint__Group_9__12676);
            rule__Viewpoint__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_9__2_in_rule__Viewpoint__Group_9__12679);
            rule__Viewpoint__Group_9__2();

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1379:1: rule__Viewpoint__Group_9__1__Impl : ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_1 ) ) ;
    public final void rule__Viewpoint__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1383:1: ( ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1384:1: ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1384:1: ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1385:1: ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseAnyEMFResourceAssignment_9_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1386:1: ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1386:2: rule__Viewpoint__UseAnyEMFResourceAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseAnyEMFResourceAssignment_9_1_in_rule__Viewpoint__Group_9__1__Impl2706);
            rule__Viewpoint__UseAnyEMFResourceAssignment_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseAnyEMFResourceAssignment_9_1()); 
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


    // $ANTLR start "rule__Viewpoint__Group_9__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1396:1: rule__Viewpoint__Group_9__2 : rule__Viewpoint__Group_9__2__Impl ;
    public final void rule__Viewpoint__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1400:1: ( rule__Viewpoint__Group_9__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1401:2: rule__Viewpoint__Group_9__2__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_9__2__Impl_in_rule__Viewpoint__Group_9__22736);
            rule__Viewpoint__Group_9__2__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group_9__2"


    // $ANTLR start "rule__Viewpoint__Group_9__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1407:1: rule__Viewpoint__Group_9__2__Impl : ( ( rule__Viewpoint__Group_9_2__0 )* ) ;
    public final void rule__Viewpoint__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1411:1: ( ( ( rule__Viewpoint__Group_9_2__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1412:1: ( ( rule__Viewpoint__Group_9_2__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1412:1: ( ( rule__Viewpoint__Group_9_2__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1413:1: ( rule__Viewpoint__Group_9_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_9_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1414:1: ( rule__Viewpoint__Group_9_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==17) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1414:2: rule__Viewpoint__Group_9_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Viewpoint__Group_9_2__0_in_rule__Viewpoint__Group_9__2__Impl2763);
            	    rule__Viewpoint__Group_9_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_9_2()); 
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
    // $ANTLR end "rule__Viewpoint__Group_9__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group_9_2__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1430:1: rule__Viewpoint__Group_9_2__0 : rule__Viewpoint__Group_9_2__0__Impl rule__Viewpoint__Group_9_2__1 ;
    public final void rule__Viewpoint__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1434:1: ( rule__Viewpoint__Group_9_2__0__Impl rule__Viewpoint__Group_9_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1435:2: rule__Viewpoint__Group_9_2__0__Impl rule__Viewpoint__Group_9_2__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_9_2__0__Impl_in_rule__Viewpoint__Group_9_2__02800);
            rule__Viewpoint__Group_9_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_9_2__1_in_rule__Viewpoint__Group_9_2__02803);
            rule__Viewpoint__Group_9_2__1();

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
    // $ANTLR end "rule__Viewpoint__Group_9_2__0"


    // $ANTLR start "rule__Viewpoint__Group_9_2__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1442:1: rule__Viewpoint__Group_9_2__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_9_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1446:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1447:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1447:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1448:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getCommaKeyword_9_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Viewpoint__Group_9_2__0__Impl2831); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getCommaKeyword_9_2_0()); 
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
    // $ANTLR end "rule__Viewpoint__Group_9_2__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_9_2__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1461:1: rule__Viewpoint__Group_9_2__1 : rule__Viewpoint__Group_9_2__1__Impl ;
    public final void rule__Viewpoint__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1465:1: ( rule__Viewpoint__Group_9_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1466:2: rule__Viewpoint__Group_9_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_9_2__1__Impl_in_rule__Viewpoint__Group_9_2__12862);
            rule__Viewpoint__Group_9_2__1__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group_9_2__1"


    // $ANTLR start "rule__Viewpoint__Group_9_2__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1472:1: rule__Viewpoint__Group_9_2__1__Impl : ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1 ) ) ;
    public final void rule__Viewpoint__Group_9_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1476:1: ( ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1477:1: ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1477:1: ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1478:1: ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseAnyEMFResourceAssignment_9_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1479:1: ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1479:2: rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1_in_rule__Viewpoint__Group_9_2__1__Impl2889);
            rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseAnyEMFResourceAssignment_9_2_1()); 
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
    // $ANTLR end "rule__Viewpoint__Group_9_2__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_10__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1493:1: rule__Viewpoint__Group_10__0 : rule__Viewpoint__Group_10__0__Impl rule__Viewpoint__Group_10__1 ;
    public final void rule__Viewpoint__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1497:1: ( rule__Viewpoint__Group_10__0__Impl rule__Viewpoint__Group_10__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1498:2: rule__Viewpoint__Group_10__0__Impl rule__Viewpoint__Group_10__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_10__0__Impl_in_rule__Viewpoint__Group_10__02923);
            rule__Viewpoint__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_10__1_in_rule__Viewpoint__Group_10__02926);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1505:1: rule__Viewpoint__Group_10__0__Impl : ( 'use diagram:' ) ;
    public final void rule__Viewpoint__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1509:1: ( ( 'use diagram:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1510:1: ( 'use diagram:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1510:1: ( 'use diagram:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1511:1: 'use diagram:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseDiagramKeyword_10_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Viewpoint__Group_10__0__Impl2954); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseDiagramKeyword_10_0()); 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1524:1: rule__Viewpoint__Group_10__1 : rule__Viewpoint__Group_10__1__Impl rule__Viewpoint__Group_10__2 ;
    public final void rule__Viewpoint__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1528:1: ( rule__Viewpoint__Group_10__1__Impl rule__Viewpoint__Group_10__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1529:2: rule__Viewpoint__Group_10__1__Impl rule__Viewpoint__Group_10__2
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_10__1__Impl_in_rule__Viewpoint__Group_10__12985);
            rule__Viewpoint__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_10__2_in_rule__Viewpoint__Group_10__12988);
            rule__Viewpoint__Group_10__2();

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1536:1: rule__Viewpoint__Group_10__1__Impl : ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_1 ) ) ;
    public final void rule__Viewpoint__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1540:1: ( ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1541:1: ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1541:1: ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1542:1: ( rule__Viewpoint__UseDiagramResourceAssignment_10_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseDiagramResourceAssignment_10_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1543:1: ( rule__Viewpoint__UseDiagramResourceAssignment_10_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1543:2: rule__Viewpoint__UseDiagramResourceAssignment_10_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseDiagramResourceAssignment_10_1_in_rule__Viewpoint__Group_10__1__Impl3015);
            rule__Viewpoint__UseDiagramResourceAssignment_10_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseDiagramResourceAssignment_10_1()); 
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


    // $ANTLR start "rule__Viewpoint__Group_10__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1553:1: rule__Viewpoint__Group_10__2 : rule__Viewpoint__Group_10__2__Impl ;
    public final void rule__Viewpoint__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1557:1: ( rule__Viewpoint__Group_10__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1558:2: rule__Viewpoint__Group_10__2__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_10__2__Impl_in_rule__Viewpoint__Group_10__23045);
            rule__Viewpoint__Group_10__2__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group_10__2"


    // $ANTLR start "rule__Viewpoint__Group_10__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1564:1: rule__Viewpoint__Group_10__2__Impl : ( ( rule__Viewpoint__Group_10_2__0 )* ) ;
    public final void rule__Viewpoint__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1568:1: ( ( ( rule__Viewpoint__Group_10_2__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1569:1: ( ( rule__Viewpoint__Group_10_2__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1569:1: ( ( rule__Viewpoint__Group_10_2__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1570:1: ( rule__Viewpoint__Group_10_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_10_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1571:1: ( rule__Viewpoint__Group_10_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==17) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1571:2: rule__Viewpoint__Group_10_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Viewpoint__Group_10_2__0_in_rule__Viewpoint__Group_10__2__Impl3072);
            	    rule__Viewpoint__Group_10_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_10_2()); 
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
    // $ANTLR end "rule__Viewpoint__Group_10__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group_10_2__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1587:1: rule__Viewpoint__Group_10_2__0 : rule__Viewpoint__Group_10_2__0__Impl rule__Viewpoint__Group_10_2__1 ;
    public final void rule__Viewpoint__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1591:1: ( rule__Viewpoint__Group_10_2__0__Impl rule__Viewpoint__Group_10_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1592:2: rule__Viewpoint__Group_10_2__0__Impl rule__Viewpoint__Group_10_2__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_10_2__0__Impl_in_rule__Viewpoint__Group_10_2__03109);
            rule__Viewpoint__Group_10_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_10_2__1_in_rule__Viewpoint__Group_10_2__03112);
            rule__Viewpoint__Group_10_2__1();

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
    // $ANTLR end "rule__Viewpoint__Group_10_2__0"


    // $ANTLR start "rule__Viewpoint__Group_10_2__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1599:1: rule__Viewpoint__Group_10_2__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1603:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1604:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1604:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1605:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getCommaKeyword_10_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Viewpoint__Group_10_2__0__Impl3140); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getCommaKeyword_10_2_0()); 
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
    // $ANTLR end "rule__Viewpoint__Group_10_2__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_10_2__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1618:1: rule__Viewpoint__Group_10_2__1 : rule__Viewpoint__Group_10_2__1__Impl ;
    public final void rule__Viewpoint__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1622:1: ( rule__Viewpoint__Group_10_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1623:2: rule__Viewpoint__Group_10_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_10_2__1__Impl_in_rule__Viewpoint__Group_10_2__13171);
            rule__Viewpoint__Group_10_2__1__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group_10_2__1"


    // $ANTLR start "rule__Viewpoint__Group_10_2__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1629:1: rule__Viewpoint__Group_10_2__1__Impl : ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_2_1 ) ) ;
    public final void rule__Viewpoint__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1633:1: ( ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1634:1: ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1634:1: ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1635:1: ( rule__Viewpoint__UseDiagramResourceAssignment_10_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseDiagramResourceAssignment_10_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1636:1: ( rule__Viewpoint__UseDiagramResourceAssignment_10_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1636:2: rule__Viewpoint__UseDiagramResourceAssignment_10_2_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseDiagramResourceAssignment_10_2_1_in_rule__Viewpoint__Group_10_2__1__Impl3198);
            rule__Viewpoint__UseDiagramResourceAssignment_10_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseDiagramResourceAssignment_10_2_1()); 
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
    // $ANTLR end "rule__Viewpoint__Group_10_2__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_11__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1650:1: rule__Viewpoint__Group_11__0 : rule__Viewpoint__Group_11__0__Impl rule__Viewpoint__Group_11__1 ;
    public final void rule__Viewpoint__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1654:1: ( rule__Viewpoint__Group_11__0__Impl rule__Viewpoint__Group_11__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1655:2: rule__Viewpoint__Group_11__0__Impl rule__Viewpoint__Group_11__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_11__0__Impl_in_rule__Viewpoint__Group_11__03232);
            rule__Viewpoint__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_11__1_in_rule__Viewpoint__Group_11__03235);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1662:1: rule__Viewpoint__Group_11__0__Impl : ( 'Data' ) ;
    public final void rule__Viewpoint__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1666:1: ( ( 'Data' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1667:1: ( 'Data' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1667:1: ( 'Data' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1668:1: 'Data'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDataKeyword_11_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__Viewpoint__Group_11__0__Impl3263); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getDataKeyword_11_0()); 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1681:1: rule__Viewpoint__Group_11__1 : rule__Viewpoint__Group_11__1__Impl ;
    public final void rule__Viewpoint__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1685:1: ( rule__Viewpoint__Group_11__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1686:2: rule__Viewpoint__Group_11__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_11__1__Impl_in_rule__Viewpoint__Group_11__13294);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1692:1: rule__Viewpoint__Group_11__1__Impl : ( ( rule__Viewpoint__VP_DataAssignment_11_1 ) ) ;
    public final void rule__Viewpoint__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1696:1: ( ( ( rule__Viewpoint__VP_DataAssignment_11_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1697:1: ( ( rule__Viewpoint__VP_DataAssignment_11_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1697:1: ( ( rule__Viewpoint__VP_DataAssignment_11_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1698:1: ( rule__Viewpoint__VP_DataAssignment_11_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_DataAssignment_11_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1699:1: ( rule__Viewpoint__VP_DataAssignment_11_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1699:2: rule__Viewpoint__VP_DataAssignment_11_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_DataAssignment_11_1_in_rule__Viewpoint__Group_11__1__Impl3321);
            rule__Viewpoint__VP_DataAssignment_11_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_DataAssignment_11_1()); 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1713:1: rule__Viewpoint__Group_12__0 : rule__Viewpoint__Group_12__0__Impl rule__Viewpoint__Group_12__1 ;
    public final void rule__Viewpoint__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1717:1: ( rule__Viewpoint__Group_12__0__Impl rule__Viewpoint__Group_12__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1718:2: rule__Viewpoint__Group_12__0__Impl rule__Viewpoint__Group_12__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_12__0__Impl_in_rule__Viewpoint__Group_12__03355);
            rule__Viewpoint__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_12__1_in_rule__Viewpoint__Group_12__03358);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1725:1: rule__Viewpoint__Group_12__0__Impl : ( ( rule__Viewpoint__TypeAssignment_12_0 ) ) ;
    public final void rule__Viewpoint__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1729:1: ( ( ( rule__Viewpoint__TypeAssignment_12_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1730:1: ( ( rule__Viewpoint__TypeAssignment_12_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1730:1: ( ( rule__Viewpoint__TypeAssignment_12_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1731:1: ( rule__Viewpoint__TypeAssignment_12_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeAssignment_12_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1732:1: ( rule__Viewpoint__TypeAssignment_12_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1732:2: rule__Viewpoint__TypeAssignment_12_0
            {
            pushFollow(FOLLOW_rule__Viewpoint__TypeAssignment_12_0_in_rule__Viewpoint__Group_12__0__Impl3385);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1742:1: rule__Viewpoint__Group_12__1 : rule__Viewpoint__Group_12__1__Impl ;
    public final void rule__Viewpoint__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1746:1: ( rule__Viewpoint__Group_12__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1747:2: rule__Viewpoint__Group_12__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_12__1__Impl_in_rule__Viewpoint__Group_12__13415);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1753:1: rule__Viewpoint__Group_12__1__Impl : ( ( rule__Viewpoint__VP_AspectsAssignment_12_1 ) ) ;
    public final void rule__Viewpoint__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1757:1: ( ( ( rule__Viewpoint__VP_AspectsAssignment_12_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1758:1: ( ( rule__Viewpoint__VP_AspectsAssignment_12_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1758:1: ( ( rule__Viewpoint__VP_AspectsAssignment_12_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1759:1: ( rule__Viewpoint__VP_AspectsAssignment_12_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_12_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1760:1: ( rule__Viewpoint__VP_AspectsAssignment_12_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1760:2: rule__Viewpoint__VP_AspectsAssignment_12_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_AspectsAssignment_12_1_in_rule__Viewpoint__Group_12__1__Impl3442);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1774:1: rule__Viewpoint__Group_13__0 : rule__Viewpoint__Group_13__0__Impl rule__Viewpoint__Group_13__1 ;
    public final void rule__Viewpoint__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1778:1: ( rule__Viewpoint__Group_13__0__Impl rule__Viewpoint__Group_13__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1779:2: rule__Viewpoint__Group_13__0__Impl rule__Viewpoint__Group_13__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_13__0__Impl_in_rule__Viewpoint__Group_13__03476);
            rule__Viewpoint__Group_13__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_13__1_in_rule__Viewpoint__Group_13__03479);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1786:1: rule__Viewpoint__Group_13__0__Impl : ( ( rule__Viewpoint__TypeAssignment_13_0 ) ) ;
    public final void rule__Viewpoint__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1790:1: ( ( ( rule__Viewpoint__TypeAssignment_13_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1791:1: ( ( rule__Viewpoint__TypeAssignment_13_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1791:1: ( ( rule__Viewpoint__TypeAssignment_13_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1792:1: ( rule__Viewpoint__TypeAssignment_13_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeAssignment_13_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1793:1: ( rule__Viewpoint__TypeAssignment_13_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1793:2: rule__Viewpoint__TypeAssignment_13_0
            {
            pushFollow(FOLLOW_rule__Viewpoint__TypeAssignment_13_0_in_rule__Viewpoint__Group_13__0__Impl3506);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1803:1: rule__Viewpoint__Group_13__1 : rule__Viewpoint__Group_13__1__Impl ;
    public final void rule__Viewpoint__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1807:1: ( rule__Viewpoint__Group_13__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1808:2: rule__Viewpoint__Group_13__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_13__1__Impl_in_rule__Viewpoint__Group_13__13536);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1814:1: rule__Viewpoint__Group_13__1__Impl : ( ( rule__Viewpoint__VP_AspectsAssignment_13_1 ) ) ;
    public final void rule__Viewpoint__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1818:1: ( ( ( rule__Viewpoint__VP_AspectsAssignment_13_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1819:1: ( ( rule__Viewpoint__VP_AspectsAssignment_13_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1819:1: ( ( rule__Viewpoint__VP_AspectsAssignment_13_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1820:1: ( rule__Viewpoint__VP_AspectsAssignment_13_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_13_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1821:1: ( rule__Viewpoint__VP_AspectsAssignment_13_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1821:2: rule__Viewpoint__VP_AspectsAssignment_13_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_AspectsAssignment_13_1_in_rule__Viewpoint__Group_13__1__Impl3563);
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


    // $ANTLR start "rule__Viewpoint__Group_14__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1835:1: rule__Viewpoint__Group_14__0 : rule__Viewpoint__Group_14__0__Impl rule__Viewpoint__Group_14__1 ;
    public final void rule__Viewpoint__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1839:1: ( rule__Viewpoint__Group_14__0__Impl rule__Viewpoint__Group_14__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1840:2: rule__Viewpoint__Group_14__0__Impl rule__Viewpoint__Group_14__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_14__0__Impl_in_rule__Viewpoint__Group_14__03597);
            rule__Viewpoint__Group_14__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_14__1_in_rule__Viewpoint__Group_14__03600);
            rule__Viewpoint__Group_14__1();

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
    // $ANTLR end "rule__Viewpoint__Group_14__0"


    // $ANTLR start "rule__Viewpoint__Group_14__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1847:1: rule__Viewpoint__Group_14__0__Impl : ( ( rule__Viewpoint__TypeAssignment_14_0 ) ) ;
    public final void rule__Viewpoint__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1851:1: ( ( ( rule__Viewpoint__TypeAssignment_14_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1852:1: ( ( rule__Viewpoint__TypeAssignment_14_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1852:1: ( ( rule__Viewpoint__TypeAssignment_14_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1853:1: ( rule__Viewpoint__TypeAssignment_14_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeAssignment_14_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1854:1: ( rule__Viewpoint__TypeAssignment_14_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1854:2: rule__Viewpoint__TypeAssignment_14_0
            {
            pushFollow(FOLLOW_rule__Viewpoint__TypeAssignment_14_0_in_rule__Viewpoint__Group_14__0__Impl3627);
            rule__Viewpoint__TypeAssignment_14_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeAssignment_14_0()); 
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
    // $ANTLR end "rule__Viewpoint__Group_14__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_14__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1864:1: rule__Viewpoint__Group_14__1 : rule__Viewpoint__Group_14__1__Impl ;
    public final void rule__Viewpoint__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1868:1: ( rule__Viewpoint__Group_14__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1869:2: rule__Viewpoint__Group_14__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_14__1__Impl_in_rule__Viewpoint__Group_14__13657);
            rule__Viewpoint__Group_14__1__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group_14__1"


    // $ANTLR start "rule__Viewpoint__Group_14__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1875:1: rule__Viewpoint__Group_14__1__Impl : ( ( rule__Viewpoint__VP_AspectsAssignment_14_1 ) ) ;
    public final void rule__Viewpoint__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1879:1: ( ( ( rule__Viewpoint__VP_AspectsAssignment_14_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1880:1: ( ( rule__Viewpoint__VP_AspectsAssignment_14_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1880:1: ( ( rule__Viewpoint__VP_AspectsAssignment_14_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1881:1: ( rule__Viewpoint__VP_AspectsAssignment_14_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_14_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1882:1: ( rule__Viewpoint__VP_AspectsAssignment_14_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1882:2: rule__Viewpoint__VP_AspectsAssignment_14_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_AspectsAssignment_14_1_in_rule__Viewpoint__Group_14__1__Impl3684);
            rule__Viewpoint__VP_AspectsAssignment_14_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_14_1()); 
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
    // $ANTLR end "rule__Viewpoint__Group_14__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_15__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1896:1: rule__Viewpoint__Group_15__0 : rule__Viewpoint__Group_15__0__Impl rule__Viewpoint__Group_15__1 ;
    public final void rule__Viewpoint__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1900:1: ( rule__Viewpoint__Group_15__0__Impl rule__Viewpoint__Group_15__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1901:2: rule__Viewpoint__Group_15__0__Impl rule__Viewpoint__Group_15__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_15__0__Impl_in_rule__Viewpoint__Group_15__03718);
            rule__Viewpoint__Group_15__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_15__1_in_rule__Viewpoint__Group_15__03721);
            rule__Viewpoint__Group_15__1();

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
    // $ANTLR end "rule__Viewpoint__Group_15__0"


    // $ANTLR start "rule__Viewpoint__Group_15__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1908:1: rule__Viewpoint__Group_15__0__Impl : ( ( rule__Viewpoint__TypeAssignment_15_0 ) ) ;
    public final void rule__Viewpoint__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1912:1: ( ( ( rule__Viewpoint__TypeAssignment_15_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1913:1: ( ( rule__Viewpoint__TypeAssignment_15_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1913:1: ( ( rule__Viewpoint__TypeAssignment_15_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1914:1: ( rule__Viewpoint__TypeAssignment_15_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeAssignment_15_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1915:1: ( rule__Viewpoint__TypeAssignment_15_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1915:2: rule__Viewpoint__TypeAssignment_15_0
            {
            pushFollow(FOLLOW_rule__Viewpoint__TypeAssignment_15_0_in_rule__Viewpoint__Group_15__0__Impl3748);
            rule__Viewpoint__TypeAssignment_15_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeAssignment_15_0()); 
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
    // $ANTLR end "rule__Viewpoint__Group_15__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_15__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1925:1: rule__Viewpoint__Group_15__1 : rule__Viewpoint__Group_15__1__Impl ;
    public final void rule__Viewpoint__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1929:1: ( rule__Viewpoint__Group_15__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1930:2: rule__Viewpoint__Group_15__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_15__1__Impl_in_rule__Viewpoint__Group_15__13778);
            rule__Viewpoint__Group_15__1__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group_15__1"


    // $ANTLR start "rule__Viewpoint__Group_15__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1936:1: rule__Viewpoint__Group_15__1__Impl : ( ( rule__Viewpoint__VP_AspectsAssignment_15_1 ) ) ;
    public final void rule__Viewpoint__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1940:1: ( ( ( rule__Viewpoint__VP_AspectsAssignment_15_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1941:1: ( ( rule__Viewpoint__VP_AspectsAssignment_15_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1941:1: ( ( rule__Viewpoint__VP_AspectsAssignment_15_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1942:1: ( rule__Viewpoint__VP_AspectsAssignment_15_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_15_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1943:1: ( rule__Viewpoint__VP_AspectsAssignment_15_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1943:2: rule__Viewpoint__VP_AspectsAssignment_15_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_AspectsAssignment_15_1_in_rule__Viewpoint__Group_15__1__Impl3805);
            rule__Viewpoint__VP_AspectsAssignment_15_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_15_1()); 
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
    // $ANTLR end "rule__Viewpoint__Group_15__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_16__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1957:1: rule__Viewpoint__Group_16__0 : rule__Viewpoint__Group_16__0__Impl rule__Viewpoint__Group_16__1 ;
    public final void rule__Viewpoint__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1961:1: ( rule__Viewpoint__Group_16__0__Impl rule__Viewpoint__Group_16__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1962:2: rule__Viewpoint__Group_16__0__Impl rule__Viewpoint__Group_16__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_16__0__Impl_in_rule__Viewpoint__Group_16__03839);
            rule__Viewpoint__Group_16__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_16__1_in_rule__Viewpoint__Group_16__03842);
            rule__Viewpoint__Group_16__1();

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
    // $ANTLR end "rule__Viewpoint__Group_16__0"


    // $ANTLR start "rule__Viewpoint__Group_16__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1969:1: rule__Viewpoint__Group_16__0__Impl : ( ( rule__Viewpoint__TypeAssignment_16_0 ) ) ;
    public final void rule__Viewpoint__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1973:1: ( ( ( rule__Viewpoint__TypeAssignment_16_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1974:1: ( ( rule__Viewpoint__TypeAssignment_16_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1974:1: ( ( rule__Viewpoint__TypeAssignment_16_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1975:1: ( rule__Viewpoint__TypeAssignment_16_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeAssignment_16_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1976:1: ( rule__Viewpoint__TypeAssignment_16_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1976:2: rule__Viewpoint__TypeAssignment_16_0
            {
            pushFollow(FOLLOW_rule__Viewpoint__TypeAssignment_16_0_in_rule__Viewpoint__Group_16__0__Impl3869);
            rule__Viewpoint__TypeAssignment_16_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeAssignment_16_0()); 
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
    // $ANTLR end "rule__Viewpoint__Group_16__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_16__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1986:1: rule__Viewpoint__Group_16__1 : rule__Viewpoint__Group_16__1__Impl ;
    public final void rule__Viewpoint__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1990:1: ( rule__Viewpoint__Group_16__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1991:2: rule__Viewpoint__Group_16__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_16__1__Impl_in_rule__Viewpoint__Group_16__13899);
            rule__Viewpoint__Group_16__1__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group_16__1"


    // $ANTLR start "rule__Viewpoint__Group_16__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1997:1: rule__Viewpoint__Group_16__1__Impl : ( ( rule__Viewpoint__VP_AspectsAssignment_16_1 ) ) ;
    public final void rule__Viewpoint__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2001:1: ( ( ( rule__Viewpoint__VP_AspectsAssignment_16_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2002:1: ( ( rule__Viewpoint__VP_AspectsAssignment_16_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2002:1: ( ( rule__Viewpoint__VP_AspectsAssignment_16_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2003:1: ( rule__Viewpoint__VP_AspectsAssignment_16_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_16_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2004:1: ( rule__Viewpoint__VP_AspectsAssignment_16_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2004:2: rule__Viewpoint__VP_AspectsAssignment_16_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_AspectsAssignment_16_1_in_rule__Viewpoint__Group_16__1__Impl3926);
            rule__Viewpoint__VP_AspectsAssignment_16_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_16_1()); 
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
    // $ANTLR end "rule__Viewpoint__Group_16__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2018:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2022:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2023:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__03960);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__03963);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2030:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2034:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2035:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2035:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2036:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl3990); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2047:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2051:1: ( rule__FQN__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2052:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14019);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2058:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2062:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2063:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2063:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2064:1: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2065:1: ( rule__FQN__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==23) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2065:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4046);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2079:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2083:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2084:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__04081);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__04084);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2091:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2095:1: ( ( '.' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2096:1: ( '.' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2096:1: ( '.' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2097:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__FQN__Group_1__0__Impl4112); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2110:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2114:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2115:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__14143);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2121:1: rule__FQN__Group_1__1__Impl : ( ( RULE_ID ) ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2125:1: ( ( ( RULE_ID ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2126:1: ( ( RULE_ID ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2126:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2127:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2128:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2128:3: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl4171); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2143:1: rule__Viewpoint__ShortNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Viewpoint__ShortNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2147:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2148:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2148:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2149:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getShortNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Viewpoint__ShortNameAssignment_24210); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2158:1: rule__Viewpoint__NameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Viewpoint__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2162:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2163:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2163:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2164:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getNameSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Viewpoint__NameAssignment_4_14241); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2173:1: rule__Viewpoint__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2177:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2178:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2178:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2179:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__DescriptionAssignment_5_14272);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2188:1: rule__Viewpoint__ParentsAssignment_6_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__ParentsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2192:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2193:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2193:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2194:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsViewpointCrossReference_6_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2195:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2196:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsViewpointFQNParserRuleCall_6_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__ParentsAssignment_6_14307);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2207:1: rule__Viewpoint__ParentsAssignment_6_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__ParentsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2211:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2212:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2212:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2213:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsViewpointCrossReference_6_2_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2214:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2215:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsViewpointFQNParserRuleCall_6_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__ParentsAssignment_6_2_14346);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2226:1: rule__Viewpoint__DependenciesAssignment_7_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__DependenciesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2230:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2231:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2231:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2232:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesViewpointCrossReference_7_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2233:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2234:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesViewpointFQNParserRuleCall_7_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__DependenciesAssignment_7_14385);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2245:1: rule__Viewpoint__DependenciesAssignment_7_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__DependenciesAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2249:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2250:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2250:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2251:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesViewpointCrossReference_7_2_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2252:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2253:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesViewpointFQNParserRuleCall_7_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__DependenciesAssignment_7_2_14424);
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


    // $ANTLR start "rule__Viewpoint__UseViewpointAssignment_8_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2264:1: rule__Viewpoint__UseViewpointAssignment_8_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__UseViewpointAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2268:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2269:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2269:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2270:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseViewpointViewpointCrossReference_8_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2271:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2272:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseViewpointViewpointFQNParserRuleCall_8_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__UseViewpointAssignment_8_14463);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseViewpointViewpointFQNParserRuleCall_8_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseViewpointViewpointCrossReference_8_1_0()); 
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
    // $ANTLR end "rule__Viewpoint__UseViewpointAssignment_8_1"


    // $ANTLR start "rule__Viewpoint__UseViewpointAssignment_8_2_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2283:1: rule__Viewpoint__UseViewpointAssignment_8_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__UseViewpointAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2287:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2288:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2288:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2289:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseViewpointViewpointCrossReference_8_2_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2290:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2291:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseViewpointViewpointFQNParserRuleCall_8_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__UseViewpointAssignment_8_2_14502);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseViewpointViewpointFQNParserRuleCall_8_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseViewpointViewpointCrossReference_8_2_1_0()); 
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
    // $ANTLR end "rule__Viewpoint__UseViewpointAssignment_8_2_1"


    // $ANTLR start "rule__Viewpoint__UseAnyEMFResourceAssignment_9_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2302:1: rule__Viewpoint__UseAnyEMFResourceAssignment_9_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__UseAnyEMFResourceAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2306:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2307:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2307:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2308:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseAnyEMFResourceEStringParserRuleCall_9_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__UseAnyEMFResourceAssignment_9_14537);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseAnyEMFResourceEStringParserRuleCall_9_1_0()); 
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
    // $ANTLR end "rule__Viewpoint__UseAnyEMFResourceAssignment_9_1"


    // $ANTLR start "rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2317:1: rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2321:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2322:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2322:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2323:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseAnyEMFResourceEStringParserRuleCall_9_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_14568);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseAnyEMFResourceEStringParserRuleCall_9_2_1_0()); 
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
    // $ANTLR end "rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1"


    // $ANTLR start "rule__Viewpoint__UseDiagramResourceAssignment_10_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2332:1: rule__Viewpoint__UseDiagramResourceAssignment_10_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__UseDiagramResourceAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2336:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2337:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2337:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2338:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseDiagramResourceEStringParserRuleCall_10_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__UseDiagramResourceAssignment_10_14599);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseDiagramResourceEStringParserRuleCall_10_1_0()); 
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
    // $ANTLR end "rule__Viewpoint__UseDiagramResourceAssignment_10_1"


    // $ANTLR start "rule__Viewpoint__UseDiagramResourceAssignment_10_2_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2347:1: rule__Viewpoint__UseDiagramResourceAssignment_10_2_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__UseDiagramResourceAssignment_10_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2351:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2352:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2352:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2353:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseDiagramResourceEStringParserRuleCall_10_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__UseDiagramResourceAssignment_10_2_14630);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseDiagramResourceEStringParserRuleCall_10_2_1_0()); 
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
    // $ANTLR end "rule__Viewpoint__UseDiagramResourceAssignment_10_2_1"


    // $ANTLR start "rule__Viewpoint__VP_DataAssignment_11_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2362:1: rule__Viewpoint__VP_DataAssignment_11_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_DataAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2366:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2367:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2367:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2368:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_DataDataCrossReference_11_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2369:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2370:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_DataDataFQNParserRuleCall_11_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_DataAssignment_11_14665);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_DataDataFQNParserRuleCall_11_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_DataDataCrossReference_11_1_0()); 
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
    // $ANTLR end "rule__Viewpoint__VP_DataAssignment_11_1"


    // $ANTLR start "rule__Viewpoint__TypeAssignment_12_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2381:1: rule__Viewpoint__TypeAssignment_12_0 : ( ( 'UI' ) ) ;
    public final void rule__Viewpoint__TypeAssignment_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2385:1: ( ( ( 'UI' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2386:1: ( ( 'UI' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2386:1: ( ( 'UI' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2387:1: ( 'UI' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeUIKeyword_12_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2388:1: ( 'UI' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2389:1: 'UI'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeUIKeyword_12_0_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Viewpoint__TypeAssignment_12_04705); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeUIKeyword_12_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeUIKeyword_12_0_0()); 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2404:1: rule__Viewpoint__VP_AspectsAssignment_12_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_AspectsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2408:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2409:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2409:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2410:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionCrossReference_12_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2411:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2412:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionFQNParserRuleCall_12_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_12_14748);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionFQNParserRuleCall_12_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionCrossReference_12_1_0()); 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2423:1: rule__Viewpoint__TypeAssignment_13_0 : ( ( 'Diagrams' ) ) ;
    public final void rule__Viewpoint__TypeAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2427:1: ( ( ( 'Diagrams' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2428:1: ( ( 'Diagrams' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2428:1: ( ( 'Diagrams' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2429:1: ( 'Diagrams' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_13_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2430:1: ( 'Diagrams' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2431:1: 'Diagrams'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_13_0_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Viewpoint__TypeAssignment_13_04788); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_13_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_13_0_0()); 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2446:1: rule__Viewpoint__VP_AspectsAssignment_13_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_AspectsAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2450:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2451:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2451:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2452:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetCrossReference_13_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2453:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2454:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetFQNParserRuleCall_13_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_13_14831);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetFQNParserRuleCall_13_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetCrossReference_13_1_0()); 
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


    // $ANTLR start "rule__Viewpoint__TypeAssignment_14_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2465:1: rule__Viewpoint__TypeAssignment_14_0 : ( ( 'Services' ) ) ;
    public final void rule__Viewpoint__TypeAssignment_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2469:1: ( ( ( 'Services' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2470:1: ( ( 'Services' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2470:1: ( ( 'Services' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2471:1: ( 'Services' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeServicesKeyword_14_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2472:1: ( 'Services' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2473:1: 'Services'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeServicesKeyword_14_0_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Viewpoint__TypeAssignment_14_04871); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeServicesKeyword_14_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeServicesKeyword_14_0_0()); 
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
    // $ANTLR end "rule__Viewpoint__TypeAssignment_14_0"


    // $ANTLR start "rule__Viewpoint__VP_AspectsAssignment_14_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2488:1: rule__Viewpoint__VP_AspectsAssignment_14_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_AspectsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2492:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2493:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2493:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2494:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetCrossReference_14_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2495:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2496:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetFQNParserRuleCall_14_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_14_14914);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetFQNParserRuleCall_14_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetCrossReference_14_1_0()); 
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
    // $ANTLR end "rule__Viewpoint__VP_AspectsAssignment_14_1"


    // $ANTLR start "rule__Viewpoint__TypeAssignment_15_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2507:1: rule__Viewpoint__TypeAssignment_15_0 : ( ( 'Build' ) ) ;
    public final void rule__Viewpoint__TypeAssignment_15_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2511:1: ( ( ( 'Build' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2512:1: ( ( 'Build' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2512:1: ( ( 'Build' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2513:1: ( 'Build' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeBuildKeyword_15_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2514:1: ( 'Build' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2515:1: 'Build'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeBuildKeyword_15_0_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Viewpoint__TypeAssignment_15_04954); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeBuildKeyword_15_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeBuildKeyword_15_0_0()); 
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
    // $ANTLR end "rule__Viewpoint__TypeAssignment_15_0"


    // $ANTLR start "rule__Viewpoint__VP_AspectsAssignment_15_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2530:1: rule__Viewpoint__VP_AspectsAssignment_15_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_AspectsAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2534:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2535:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2535:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2536:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsBuildCrossReference_15_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2537:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2538:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsBuildFQNParserRuleCall_15_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_15_14997);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsBuildFQNParserRuleCall_15_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsBuildCrossReference_15_1_0()); 
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
    // $ANTLR end "rule__Viewpoint__VP_AspectsAssignment_15_1"


    // $ANTLR start "rule__Viewpoint__TypeAssignment_16_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2549:1: rule__Viewpoint__TypeAssignment_16_0 : ( ( 'Configuration' ) ) ;
    public final void rule__Viewpoint__TypeAssignment_16_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2553:1: ( ( ( 'Configuration' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2554:1: ( ( 'Configuration' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2554:1: ( ( 'Configuration' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2555:1: ( 'Configuration' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_16_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2556:1: ( 'Configuration' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2557:1: 'Configuration'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_16_0_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Viewpoint__TypeAssignment_16_05037); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_16_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_16_0_0()); 
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
    // $ANTLR end "rule__Viewpoint__TypeAssignment_16_0"


    // $ANTLR start "rule__Viewpoint__VP_AspectsAssignment_16_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2572:1: rule__Viewpoint__VP_AspectsAssignment_16_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_AspectsAssignment_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2576:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2577:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2577:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2578:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationCrossReference_16_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2579:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2580:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationFQNParserRuleCall_16_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_16_15080);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationFQNParserRuleCall_16_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationCrossReference_16_1_0()); 
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
    // $ANTLR end "rule__Viewpoint__VP_AspectsAssignment_16_1"

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
    public static final BitSet FOLLOW_rule__Viewpoint__Group__4__Impl_in_rule__Viewpoint__Group__4554 = new BitSet(new long[]{0x000000001F7DA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__5_in_rule__Viewpoint__Group__4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_4__0_in_rule__Viewpoint__Group__4__Impl584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__5__Impl_in_rule__Viewpoint__Group__5614 = new BitSet(new long[]{0x000000001F7DA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__6_in_rule__Viewpoint__Group__5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_5__0_in_rule__Viewpoint__Group__5__Impl644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__6__Impl_in_rule__Viewpoint__Group__6675 = new BitSet(new long[]{0x000000001F7DA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__7_in_rule__Viewpoint__Group__6678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__0_in_rule__Viewpoint__Group__6__Impl705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__7__Impl_in_rule__Viewpoint__Group__7736 = new BitSet(new long[]{0x000000001F7DA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__8_in_rule__Viewpoint__Group__7739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__0_in_rule__Viewpoint__Group__7__Impl766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__8__Impl_in_rule__Viewpoint__Group__8797 = new BitSet(new long[]{0x000000001F7DA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__9_in_rule__Viewpoint__Group__8800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8__0_in_rule__Viewpoint__Group__8__Impl827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__9__Impl_in_rule__Viewpoint__Group__9858 = new BitSet(new long[]{0x000000001F7DA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__10_in_rule__Viewpoint__Group__9861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9__0_in_rule__Viewpoint__Group__9__Impl888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__10__Impl_in_rule__Viewpoint__Group__10919 = new BitSet(new long[]{0x000000001F7DA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__11_in_rule__Viewpoint__Group__10922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10__0_in_rule__Viewpoint__Group__10__Impl949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__11__Impl_in_rule__Viewpoint__Group__11980 = new BitSet(new long[]{0x000000001F7DA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__12_in_rule__Viewpoint__Group__11983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11__0_in_rule__Viewpoint__Group__11__Impl1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__12__Impl_in_rule__Viewpoint__Group__121041 = new BitSet(new long[]{0x000000001F7DA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__13_in_rule__Viewpoint__Group__121044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12__0_in_rule__Viewpoint__Group__12__Impl1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__13__Impl_in_rule__Viewpoint__Group__131102 = new BitSet(new long[]{0x000000001F7DA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__14_in_rule__Viewpoint__Group__131105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_13__0_in_rule__Viewpoint__Group__13__Impl1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__14__Impl_in_rule__Viewpoint__Group__141163 = new BitSet(new long[]{0x000000001F7DA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__15_in_rule__Viewpoint__Group__141166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_14__0_in_rule__Viewpoint__Group__14__Impl1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__15__Impl_in_rule__Viewpoint__Group__151224 = new BitSet(new long[]{0x000000001F7DA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__16_in_rule__Viewpoint__Group__151227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_15__0_in_rule__Viewpoint__Group__15__Impl1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__16__Impl_in_rule__Viewpoint__Group__161285 = new BitSet(new long[]{0x000000001F7DA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__17_in_rule__Viewpoint__Group__161288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_16__0_in_rule__Viewpoint__Group__16__Impl1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__17__Impl_in_rule__Viewpoint__Group__171346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Viewpoint__Group__17__Impl1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_4__0__Impl_in_rule__Viewpoint__Group_4__01441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_4__1_in_rule__Viewpoint__Group_4__01444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Viewpoint__Group_4__0__Impl1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_4__1__Impl_in_rule__Viewpoint__Group_4__11503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__NameAssignment_4_1_in_rule__Viewpoint__Group_4__1__Impl1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_5__0__Impl_in_rule__Viewpoint__Group_5__01564 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_5__1_in_rule__Viewpoint__Group_5__01567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Viewpoint__Group_5__0__Impl1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_5__1__Impl_in_rule__Viewpoint__Group_5__11626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__DescriptionAssignment_5_1_in_rule__Viewpoint__Group_5__1__Impl1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__0__Impl_in_rule__Viewpoint__Group_6__01687 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__1_in_rule__Viewpoint__Group_6__01690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Viewpoint__Group_6__0__Impl1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__1__Impl_in_rule__Viewpoint__Group_6__11749 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__2_in_rule__Viewpoint__Group_6__11752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__ParentsAssignment_6_1_in_rule__Viewpoint__Group_6__1__Impl1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__2__Impl_in_rule__Viewpoint__Group_6__21809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6_2__0_in_rule__Viewpoint__Group_6__2__Impl1836 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6_2__0__Impl_in_rule__Viewpoint__Group_6_2__01873 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6_2__1_in_rule__Viewpoint__Group_6_2__01876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Viewpoint__Group_6_2__0__Impl1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6_2__1__Impl_in_rule__Viewpoint__Group_6_2__11935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__ParentsAssignment_6_2_1_in_rule__Viewpoint__Group_6_2__1__Impl1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__0__Impl_in_rule__Viewpoint__Group_7__01996 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__1_in_rule__Viewpoint__Group_7__01999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Viewpoint__Group_7__0__Impl2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__1__Impl_in_rule__Viewpoint__Group_7__12058 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__2_in_rule__Viewpoint__Group_7__12061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__DependenciesAssignment_7_1_in_rule__Viewpoint__Group_7__1__Impl2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__2__Impl_in_rule__Viewpoint__Group_7__22118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7_2__0_in_rule__Viewpoint__Group_7__2__Impl2145 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7_2__0__Impl_in_rule__Viewpoint__Group_7_2__02182 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7_2__1_in_rule__Viewpoint__Group_7_2__02185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Viewpoint__Group_7_2__0__Impl2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7_2__1__Impl_in_rule__Viewpoint__Group_7_2__12244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__DependenciesAssignment_7_2_1_in_rule__Viewpoint__Group_7_2__1__Impl2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8__0__Impl_in_rule__Viewpoint__Group_8__02305 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8__1_in_rule__Viewpoint__Group_8__02308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Viewpoint__Group_8__0__Impl2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8__1__Impl_in_rule__Viewpoint__Group_8__12367 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8__2_in_rule__Viewpoint__Group_8__12370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseViewpointAssignment_8_1_in_rule__Viewpoint__Group_8__1__Impl2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8__2__Impl_in_rule__Viewpoint__Group_8__22427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8_2__0_in_rule__Viewpoint__Group_8__2__Impl2454 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8_2__0__Impl_in_rule__Viewpoint__Group_8_2__02491 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8_2__1_in_rule__Viewpoint__Group_8_2__02494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Viewpoint__Group_8_2__0__Impl2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8_2__1__Impl_in_rule__Viewpoint__Group_8_2__12553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseViewpointAssignment_8_2_1_in_rule__Viewpoint__Group_8_2__1__Impl2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9__0__Impl_in_rule__Viewpoint__Group_9__02614 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9__1_in_rule__Viewpoint__Group_9__02617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Viewpoint__Group_9__0__Impl2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9__1__Impl_in_rule__Viewpoint__Group_9__12676 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9__2_in_rule__Viewpoint__Group_9__12679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseAnyEMFResourceAssignment_9_1_in_rule__Viewpoint__Group_9__1__Impl2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9__2__Impl_in_rule__Viewpoint__Group_9__22736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9_2__0_in_rule__Viewpoint__Group_9__2__Impl2763 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9_2__0__Impl_in_rule__Viewpoint__Group_9_2__02800 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9_2__1_in_rule__Viewpoint__Group_9_2__02803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Viewpoint__Group_9_2__0__Impl2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9_2__1__Impl_in_rule__Viewpoint__Group_9_2__12862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1_in_rule__Viewpoint__Group_9_2__1__Impl2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10__0__Impl_in_rule__Viewpoint__Group_10__02923 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10__1_in_rule__Viewpoint__Group_10__02926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Viewpoint__Group_10__0__Impl2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10__1__Impl_in_rule__Viewpoint__Group_10__12985 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10__2_in_rule__Viewpoint__Group_10__12988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseDiagramResourceAssignment_10_1_in_rule__Viewpoint__Group_10__1__Impl3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10__2__Impl_in_rule__Viewpoint__Group_10__23045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10_2__0_in_rule__Viewpoint__Group_10__2__Impl3072 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10_2__0__Impl_in_rule__Viewpoint__Group_10_2__03109 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10_2__1_in_rule__Viewpoint__Group_10_2__03112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Viewpoint__Group_10_2__0__Impl3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10_2__1__Impl_in_rule__Viewpoint__Group_10_2__13171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseDiagramResourceAssignment_10_2_1_in_rule__Viewpoint__Group_10_2__1__Impl3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11__0__Impl_in_rule__Viewpoint__Group_11__03232 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11__1_in_rule__Viewpoint__Group_11__03235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Viewpoint__Group_11__0__Impl3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11__1__Impl_in_rule__Viewpoint__Group_11__13294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_DataAssignment_11_1_in_rule__Viewpoint__Group_11__1__Impl3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12__0__Impl_in_rule__Viewpoint__Group_12__03355 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12__1_in_rule__Viewpoint__Group_12__03358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__TypeAssignment_12_0_in_rule__Viewpoint__Group_12__0__Impl3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12__1__Impl_in_rule__Viewpoint__Group_12__13415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_AspectsAssignment_12_1_in_rule__Viewpoint__Group_12__1__Impl3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_13__0__Impl_in_rule__Viewpoint__Group_13__03476 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_13__1_in_rule__Viewpoint__Group_13__03479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__TypeAssignment_13_0_in_rule__Viewpoint__Group_13__0__Impl3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_13__1__Impl_in_rule__Viewpoint__Group_13__13536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_AspectsAssignment_13_1_in_rule__Viewpoint__Group_13__1__Impl3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_14__0__Impl_in_rule__Viewpoint__Group_14__03597 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_14__1_in_rule__Viewpoint__Group_14__03600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__TypeAssignment_14_0_in_rule__Viewpoint__Group_14__0__Impl3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_14__1__Impl_in_rule__Viewpoint__Group_14__13657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_AspectsAssignment_14_1_in_rule__Viewpoint__Group_14__1__Impl3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_15__0__Impl_in_rule__Viewpoint__Group_15__03718 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_15__1_in_rule__Viewpoint__Group_15__03721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__TypeAssignment_15_0_in_rule__Viewpoint__Group_15__0__Impl3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_15__1__Impl_in_rule__Viewpoint__Group_15__13778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_AspectsAssignment_15_1_in_rule__Viewpoint__Group_15__1__Impl3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_16__0__Impl_in_rule__Viewpoint__Group_16__03839 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_16__1_in_rule__Viewpoint__Group_16__03842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__TypeAssignment_16_0_in_rule__Viewpoint__Group_16__0__Impl3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_16__1__Impl_in_rule__Viewpoint__Group_16__13899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_AspectsAssignment_16_1_in_rule__Viewpoint__Group_16__1__Impl3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__03960 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__03963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4046 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__04081 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__04084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FQN__Group_1__0__Impl4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__14143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Viewpoint__ShortNameAssignment_24210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Viewpoint__NameAssignment_4_14241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__DescriptionAssignment_5_14272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__ParentsAssignment_6_14307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__ParentsAssignment_6_2_14346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__DependenciesAssignment_7_14385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__DependenciesAssignment_7_2_14424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__UseViewpointAssignment_8_14463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__UseViewpointAssignment_8_2_14502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__UseAnyEMFResourceAssignment_9_14537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_14568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__UseDiagramResourceAssignment_10_14599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__UseDiagramResourceAssignment_10_2_14630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_DataAssignment_11_14665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Viewpoint__TypeAssignment_12_04705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_12_14748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Viewpoint__TypeAssignment_13_04788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_13_14831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Viewpoint__TypeAssignment_14_04871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_14_14914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Viewpoint__TypeAssignment_15_04954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_15_14997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Viewpoint__TypeAssignment_16_05037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_16_15080 = new BitSet(new long[]{0x0000000000000002L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Viewpoint'", "'{'", "'}'", "'name:'", "'description:'", "'extends'", "','", "'aggregates'", "'uses viewpoint'", "'uses model'", "'uses diagram'", "'uses workspace'", "'uses filesystem'", "'Data'", "'.'", "'UI'", "'Diagrams'", "'Activity Explorer'", "'Services'", "'Build'", "'Configuration'"
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
    public static final int T__31=31;
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

            if ( (LA10_0==23) ) {
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

            if ( (LA11_0==24) ) {
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:673:1: rule__Viewpoint__Group__17 : rule__Viewpoint__Group__17__Impl rule__Viewpoint__Group__18 ;
    public final void rule__Viewpoint__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:677:1: ( rule__Viewpoint__Group__17__Impl rule__Viewpoint__Group__18 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:678:2: rule__Viewpoint__Group__17__Impl rule__Viewpoint__Group__18
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__17__Impl_in_rule__Viewpoint__Group__171346);
            rule__Viewpoint__Group__17__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__18_in_rule__Viewpoint__Group__171349);
            rule__Viewpoint__Group__18();

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:685:1: rule__Viewpoint__Group__17__Impl : ( ( rule__Viewpoint__Group_17__0 )? ) ;
    public final void rule__Viewpoint__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:689:1: ( ( ( rule__Viewpoint__Group_17__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:690:1: ( ( rule__Viewpoint__Group_17__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:690:1: ( ( rule__Viewpoint__Group_17__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:691:1: ( rule__Viewpoint__Group_17__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_17()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:692:1: ( rule__Viewpoint__Group_17__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:692:2: rule__Viewpoint__Group_17__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_17__0_in_rule__Viewpoint__Group__17__Impl1376);
                    rule__Viewpoint__Group_17__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_17()); 
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


    // $ANTLR start "rule__Viewpoint__Group__18"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:702:1: rule__Viewpoint__Group__18 : rule__Viewpoint__Group__18__Impl rule__Viewpoint__Group__19 ;
    public final void rule__Viewpoint__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:706:1: ( rule__Viewpoint__Group__18__Impl rule__Viewpoint__Group__19 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:707:2: rule__Viewpoint__Group__18__Impl rule__Viewpoint__Group__19
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__18__Impl_in_rule__Viewpoint__Group__181407);
            rule__Viewpoint__Group__18__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__19_in_rule__Viewpoint__Group__181410);
            rule__Viewpoint__Group__19();

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
    // $ANTLR end "rule__Viewpoint__Group__18"


    // $ANTLR start "rule__Viewpoint__Group__18__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:714:1: rule__Viewpoint__Group__18__Impl : ( ( rule__Viewpoint__Group_18__0 )? ) ;
    public final void rule__Viewpoint__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:718:1: ( ( ( rule__Viewpoint__Group_18__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:719:1: ( ( rule__Viewpoint__Group_18__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:719:1: ( ( rule__Viewpoint__Group_18__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:720:1: ( rule__Viewpoint__Group_18__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_18()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:721:1: ( rule__Viewpoint__Group_18__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:721:2: rule__Viewpoint__Group_18__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_18__0_in_rule__Viewpoint__Group__18__Impl1437);
                    rule__Viewpoint__Group_18__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_18()); 
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
    // $ANTLR end "rule__Viewpoint__Group__18__Impl"


    // $ANTLR start "rule__Viewpoint__Group__19"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:731:1: rule__Viewpoint__Group__19 : rule__Viewpoint__Group__19__Impl rule__Viewpoint__Group__20 ;
    public final void rule__Viewpoint__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:735:1: ( rule__Viewpoint__Group__19__Impl rule__Viewpoint__Group__20 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:736:2: rule__Viewpoint__Group__19__Impl rule__Viewpoint__Group__20
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__19__Impl_in_rule__Viewpoint__Group__191468);
            rule__Viewpoint__Group__19__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__20_in_rule__Viewpoint__Group__191471);
            rule__Viewpoint__Group__20();

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
    // $ANTLR end "rule__Viewpoint__Group__19"


    // $ANTLR start "rule__Viewpoint__Group__19__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:743:1: rule__Viewpoint__Group__19__Impl : ( ( rule__Viewpoint__Group_19__0 )? ) ;
    public final void rule__Viewpoint__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:747:1: ( ( ( rule__Viewpoint__Group_19__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:748:1: ( ( rule__Viewpoint__Group_19__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:748:1: ( ( rule__Viewpoint__Group_19__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:749:1: ( rule__Viewpoint__Group_19__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_19()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:750:1: ( rule__Viewpoint__Group_19__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:750:2: rule__Viewpoint__Group_19__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_19__0_in_rule__Viewpoint__Group__19__Impl1498);
                    rule__Viewpoint__Group_19__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_19()); 
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
    // $ANTLR end "rule__Viewpoint__Group__19__Impl"


    // $ANTLR start "rule__Viewpoint__Group__20"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:760:1: rule__Viewpoint__Group__20 : rule__Viewpoint__Group__20__Impl ;
    public final void rule__Viewpoint__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:764:1: ( rule__Viewpoint__Group__20__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:765:2: rule__Viewpoint__Group__20__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__20__Impl_in_rule__Viewpoint__Group__201529);
            rule__Viewpoint__Group__20__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group__20"


    // $ANTLR start "rule__Viewpoint__Group__20__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:771:1: rule__Viewpoint__Group__20__Impl : ( '}' ) ;
    public final void rule__Viewpoint__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:775:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:776:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:776:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:777:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getRightCurlyBracketKeyword_20()); 
            }
            match(input,13,FOLLOW_13_in_rule__Viewpoint__Group__20__Impl1557); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getRightCurlyBracketKeyword_20()); 
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
    // $ANTLR end "rule__Viewpoint__Group__20__Impl"


    // $ANTLR start "rule__Viewpoint__Group_4__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:832:1: rule__Viewpoint__Group_4__0 : rule__Viewpoint__Group_4__0__Impl rule__Viewpoint__Group_4__1 ;
    public final void rule__Viewpoint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:836:1: ( rule__Viewpoint__Group_4__0__Impl rule__Viewpoint__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:837:2: rule__Viewpoint__Group_4__0__Impl rule__Viewpoint__Group_4__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_4__0__Impl_in_rule__Viewpoint__Group_4__01630);
            rule__Viewpoint__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_4__1_in_rule__Viewpoint__Group_4__01633);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:844:1: rule__Viewpoint__Group_4__0__Impl : ( 'name:' ) ;
    public final void rule__Viewpoint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:848:1: ( ( 'name:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:849:1: ( 'name:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:849:1: ( 'name:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:850:1: 'name:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getNameKeyword_4_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__Viewpoint__Group_4__0__Impl1661); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:863:1: rule__Viewpoint__Group_4__1 : rule__Viewpoint__Group_4__1__Impl ;
    public final void rule__Viewpoint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:867:1: ( rule__Viewpoint__Group_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:868:2: rule__Viewpoint__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_4__1__Impl_in_rule__Viewpoint__Group_4__11692);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:874:1: rule__Viewpoint__Group_4__1__Impl : ( ( rule__Viewpoint__NameAssignment_4_1 ) ) ;
    public final void rule__Viewpoint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:878:1: ( ( ( rule__Viewpoint__NameAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:879:1: ( ( rule__Viewpoint__NameAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:879:1: ( ( rule__Viewpoint__NameAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:880:1: ( rule__Viewpoint__NameAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getNameAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:881:1: ( rule__Viewpoint__NameAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:881:2: rule__Viewpoint__NameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__NameAssignment_4_1_in_rule__Viewpoint__Group_4__1__Impl1719);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:895:1: rule__Viewpoint__Group_5__0 : rule__Viewpoint__Group_5__0__Impl rule__Viewpoint__Group_5__1 ;
    public final void rule__Viewpoint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:899:1: ( rule__Viewpoint__Group_5__0__Impl rule__Viewpoint__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:900:2: rule__Viewpoint__Group_5__0__Impl rule__Viewpoint__Group_5__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_5__0__Impl_in_rule__Viewpoint__Group_5__01753);
            rule__Viewpoint__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_5__1_in_rule__Viewpoint__Group_5__01756);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:907:1: rule__Viewpoint__Group_5__0__Impl : ( 'description:' ) ;
    public final void rule__Viewpoint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:911:1: ( ( 'description:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:912:1: ( 'description:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:912:1: ( 'description:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:913:1: 'description:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDescriptionKeyword_5_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Viewpoint__Group_5__0__Impl1784); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:926:1: rule__Viewpoint__Group_5__1 : rule__Viewpoint__Group_5__1__Impl ;
    public final void rule__Viewpoint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:930:1: ( rule__Viewpoint__Group_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:931:2: rule__Viewpoint__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_5__1__Impl_in_rule__Viewpoint__Group_5__11815);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:937:1: rule__Viewpoint__Group_5__1__Impl : ( ( rule__Viewpoint__DescriptionAssignment_5_1 ) ) ;
    public final void rule__Viewpoint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:941:1: ( ( ( rule__Viewpoint__DescriptionAssignment_5_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:942:1: ( ( rule__Viewpoint__DescriptionAssignment_5_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:942:1: ( ( rule__Viewpoint__DescriptionAssignment_5_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:943:1: ( rule__Viewpoint__DescriptionAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDescriptionAssignment_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:944:1: ( rule__Viewpoint__DescriptionAssignment_5_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:944:2: rule__Viewpoint__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__DescriptionAssignment_5_1_in_rule__Viewpoint__Group_5__1__Impl1842);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:958:1: rule__Viewpoint__Group_6__0 : rule__Viewpoint__Group_6__0__Impl rule__Viewpoint__Group_6__1 ;
    public final void rule__Viewpoint__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:962:1: ( rule__Viewpoint__Group_6__0__Impl rule__Viewpoint__Group_6__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:963:2: rule__Viewpoint__Group_6__0__Impl rule__Viewpoint__Group_6__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_6__0__Impl_in_rule__Viewpoint__Group_6__01876);
            rule__Viewpoint__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_6__1_in_rule__Viewpoint__Group_6__01879);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:970:1: rule__Viewpoint__Group_6__0__Impl : ( 'extends' ) ;
    public final void rule__Viewpoint__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:974:1: ( ( 'extends' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:975:1: ( 'extends' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:975:1: ( 'extends' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:976:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getExtendsKeyword_6_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__Viewpoint__Group_6__0__Impl1907); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:989:1: rule__Viewpoint__Group_6__1 : rule__Viewpoint__Group_6__1__Impl rule__Viewpoint__Group_6__2 ;
    public final void rule__Viewpoint__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:993:1: ( rule__Viewpoint__Group_6__1__Impl rule__Viewpoint__Group_6__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:994:2: rule__Viewpoint__Group_6__1__Impl rule__Viewpoint__Group_6__2
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_6__1__Impl_in_rule__Viewpoint__Group_6__11938);
            rule__Viewpoint__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_6__2_in_rule__Viewpoint__Group_6__11941);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1001:1: rule__Viewpoint__Group_6__1__Impl : ( ( rule__Viewpoint__ParentsAssignment_6_1 ) ) ;
    public final void rule__Viewpoint__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1005:1: ( ( ( rule__Viewpoint__ParentsAssignment_6_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1006:1: ( ( rule__Viewpoint__ParentsAssignment_6_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1006:1: ( ( rule__Viewpoint__ParentsAssignment_6_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1007:1: ( rule__Viewpoint__ParentsAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsAssignment_6_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1008:1: ( rule__Viewpoint__ParentsAssignment_6_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1008:2: rule__Viewpoint__ParentsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__ParentsAssignment_6_1_in_rule__Viewpoint__Group_6__1__Impl1968);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1018:1: rule__Viewpoint__Group_6__2 : rule__Viewpoint__Group_6__2__Impl ;
    public final void rule__Viewpoint__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1022:1: ( rule__Viewpoint__Group_6__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1023:2: rule__Viewpoint__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_6__2__Impl_in_rule__Viewpoint__Group_6__21998);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1029:1: rule__Viewpoint__Group_6__2__Impl : ( ( rule__Viewpoint__Group_6_2__0 )* ) ;
    public final void rule__Viewpoint__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1033:1: ( ( ( rule__Viewpoint__Group_6_2__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1034:1: ( ( rule__Viewpoint__Group_6_2__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1034:1: ( ( rule__Viewpoint__Group_6_2__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1035:1: ( rule__Viewpoint__Group_6_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_6_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1036:1: ( rule__Viewpoint__Group_6_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==17) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1036:2: rule__Viewpoint__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Viewpoint__Group_6_2__0_in_rule__Viewpoint__Group_6__2__Impl2025);
            	    rule__Viewpoint__Group_6_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1052:1: rule__Viewpoint__Group_6_2__0 : rule__Viewpoint__Group_6_2__0__Impl rule__Viewpoint__Group_6_2__1 ;
    public final void rule__Viewpoint__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1056:1: ( rule__Viewpoint__Group_6_2__0__Impl rule__Viewpoint__Group_6_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1057:2: rule__Viewpoint__Group_6_2__0__Impl rule__Viewpoint__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_6_2__0__Impl_in_rule__Viewpoint__Group_6_2__02062);
            rule__Viewpoint__Group_6_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_6_2__1_in_rule__Viewpoint__Group_6_2__02065);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1064:1: rule__Viewpoint__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1068:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1069:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1069:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1070:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getCommaKeyword_6_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Viewpoint__Group_6_2__0__Impl2093); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1083:1: rule__Viewpoint__Group_6_2__1 : rule__Viewpoint__Group_6_2__1__Impl ;
    public final void rule__Viewpoint__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1087:1: ( rule__Viewpoint__Group_6_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1088:2: rule__Viewpoint__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_6_2__1__Impl_in_rule__Viewpoint__Group_6_2__12124);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1094:1: rule__Viewpoint__Group_6_2__1__Impl : ( ( rule__Viewpoint__ParentsAssignment_6_2_1 ) ) ;
    public final void rule__Viewpoint__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1098:1: ( ( ( rule__Viewpoint__ParentsAssignment_6_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1099:1: ( ( rule__Viewpoint__ParentsAssignment_6_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1099:1: ( ( rule__Viewpoint__ParentsAssignment_6_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1100:1: ( rule__Viewpoint__ParentsAssignment_6_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsAssignment_6_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1101:1: ( rule__Viewpoint__ParentsAssignment_6_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1101:2: rule__Viewpoint__ParentsAssignment_6_2_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__ParentsAssignment_6_2_1_in_rule__Viewpoint__Group_6_2__1__Impl2151);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1115:1: rule__Viewpoint__Group_7__0 : rule__Viewpoint__Group_7__0__Impl rule__Viewpoint__Group_7__1 ;
    public final void rule__Viewpoint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1119:1: ( rule__Viewpoint__Group_7__0__Impl rule__Viewpoint__Group_7__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1120:2: rule__Viewpoint__Group_7__0__Impl rule__Viewpoint__Group_7__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_7__0__Impl_in_rule__Viewpoint__Group_7__02185);
            rule__Viewpoint__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_7__1_in_rule__Viewpoint__Group_7__02188);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1127:1: rule__Viewpoint__Group_7__0__Impl : ( 'aggregates' ) ;
    public final void rule__Viewpoint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1131:1: ( ( 'aggregates' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1132:1: ( 'aggregates' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1132:1: ( 'aggregates' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1133:1: 'aggregates'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getAggregatesKeyword_7_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Viewpoint__Group_7__0__Impl2216); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1146:1: rule__Viewpoint__Group_7__1 : rule__Viewpoint__Group_7__1__Impl rule__Viewpoint__Group_7__2 ;
    public final void rule__Viewpoint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1150:1: ( rule__Viewpoint__Group_7__1__Impl rule__Viewpoint__Group_7__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1151:2: rule__Viewpoint__Group_7__1__Impl rule__Viewpoint__Group_7__2
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_7__1__Impl_in_rule__Viewpoint__Group_7__12247);
            rule__Viewpoint__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_7__2_in_rule__Viewpoint__Group_7__12250);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1158:1: rule__Viewpoint__Group_7__1__Impl : ( ( rule__Viewpoint__DependenciesAssignment_7_1 ) ) ;
    public final void rule__Viewpoint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1162:1: ( ( ( rule__Viewpoint__DependenciesAssignment_7_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1163:1: ( ( rule__Viewpoint__DependenciesAssignment_7_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1163:1: ( ( rule__Viewpoint__DependenciesAssignment_7_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1164:1: ( rule__Viewpoint__DependenciesAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesAssignment_7_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1165:1: ( rule__Viewpoint__DependenciesAssignment_7_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1165:2: rule__Viewpoint__DependenciesAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__DependenciesAssignment_7_1_in_rule__Viewpoint__Group_7__1__Impl2277);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1175:1: rule__Viewpoint__Group_7__2 : rule__Viewpoint__Group_7__2__Impl ;
    public final void rule__Viewpoint__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1179:1: ( rule__Viewpoint__Group_7__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1180:2: rule__Viewpoint__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_7__2__Impl_in_rule__Viewpoint__Group_7__22307);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1186:1: rule__Viewpoint__Group_7__2__Impl : ( ( rule__Viewpoint__Group_7_2__0 )* ) ;
    public final void rule__Viewpoint__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1190:1: ( ( ( rule__Viewpoint__Group_7_2__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1191:1: ( ( rule__Viewpoint__Group_7_2__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1191:1: ( ( rule__Viewpoint__Group_7_2__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1192:1: ( rule__Viewpoint__Group_7_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_7_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1193:1: ( rule__Viewpoint__Group_7_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==17) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1193:2: rule__Viewpoint__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Viewpoint__Group_7_2__0_in_rule__Viewpoint__Group_7__2__Impl2334);
            	    rule__Viewpoint__Group_7_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1209:1: rule__Viewpoint__Group_7_2__0 : rule__Viewpoint__Group_7_2__0__Impl rule__Viewpoint__Group_7_2__1 ;
    public final void rule__Viewpoint__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1213:1: ( rule__Viewpoint__Group_7_2__0__Impl rule__Viewpoint__Group_7_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1214:2: rule__Viewpoint__Group_7_2__0__Impl rule__Viewpoint__Group_7_2__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_7_2__0__Impl_in_rule__Viewpoint__Group_7_2__02371);
            rule__Viewpoint__Group_7_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_7_2__1_in_rule__Viewpoint__Group_7_2__02374);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1221:1: rule__Viewpoint__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1225:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1226:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1226:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1227:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getCommaKeyword_7_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Viewpoint__Group_7_2__0__Impl2402); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1240:1: rule__Viewpoint__Group_7_2__1 : rule__Viewpoint__Group_7_2__1__Impl ;
    public final void rule__Viewpoint__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1244:1: ( rule__Viewpoint__Group_7_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1245:2: rule__Viewpoint__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_7_2__1__Impl_in_rule__Viewpoint__Group_7_2__12433);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1251:1: rule__Viewpoint__Group_7_2__1__Impl : ( ( rule__Viewpoint__DependenciesAssignment_7_2_1 ) ) ;
    public final void rule__Viewpoint__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1255:1: ( ( ( rule__Viewpoint__DependenciesAssignment_7_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1256:1: ( ( rule__Viewpoint__DependenciesAssignment_7_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1256:1: ( ( rule__Viewpoint__DependenciesAssignment_7_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1257:1: ( rule__Viewpoint__DependenciesAssignment_7_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesAssignment_7_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1258:1: ( rule__Viewpoint__DependenciesAssignment_7_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1258:2: rule__Viewpoint__DependenciesAssignment_7_2_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__DependenciesAssignment_7_2_1_in_rule__Viewpoint__Group_7_2__1__Impl2460);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1272:1: rule__Viewpoint__Group_8__0 : rule__Viewpoint__Group_8__0__Impl rule__Viewpoint__Group_8__1 ;
    public final void rule__Viewpoint__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1276:1: ( rule__Viewpoint__Group_8__0__Impl rule__Viewpoint__Group_8__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1277:2: rule__Viewpoint__Group_8__0__Impl rule__Viewpoint__Group_8__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_8__0__Impl_in_rule__Viewpoint__Group_8__02494);
            rule__Viewpoint__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_8__1_in_rule__Viewpoint__Group_8__02497);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1284:1: rule__Viewpoint__Group_8__0__Impl : ( 'uses viewpoint' ) ;
    public final void rule__Viewpoint__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1288:1: ( ( 'uses viewpoint' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1289:1: ( 'uses viewpoint' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1289:1: ( 'uses viewpoint' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1290:1: 'uses viewpoint'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUsesViewpointKeyword_8_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Viewpoint__Group_8__0__Impl2525); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUsesViewpointKeyword_8_0()); 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1303:1: rule__Viewpoint__Group_8__1 : rule__Viewpoint__Group_8__1__Impl rule__Viewpoint__Group_8__2 ;
    public final void rule__Viewpoint__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1307:1: ( rule__Viewpoint__Group_8__1__Impl rule__Viewpoint__Group_8__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1308:2: rule__Viewpoint__Group_8__1__Impl rule__Viewpoint__Group_8__2
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_8__1__Impl_in_rule__Viewpoint__Group_8__12556);
            rule__Viewpoint__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_8__2_in_rule__Viewpoint__Group_8__12559);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1315:1: rule__Viewpoint__Group_8__1__Impl : ( ( rule__Viewpoint__UseViewpointAssignment_8_1 ) ) ;
    public final void rule__Viewpoint__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1319:1: ( ( ( rule__Viewpoint__UseViewpointAssignment_8_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1320:1: ( ( rule__Viewpoint__UseViewpointAssignment_8_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1320:1: ( ( rule__Viewpoint__UseViewpointAssignment_8_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1321:1: ( rule__Viewpoint__UseViewpointAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseViewpointAssignment_8_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1322:1: ( rule__Viewpoint__UseViewpointAssignment_8_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1322:2: rule__Viewpoint__UseViewpointAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseViewpointAssignment_8_1_in_rule__Viewpoint__Group_8__1__Impl2586);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1332:1: rule__Viewpoint__Group_8__2 : rule__Viewpoint__Group_8__2__Impl ;
    public final void rule__Viewpoint__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1336:1: ( rule__Viewpoint__Group_8__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1337:2: rule__Viewpoint__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_8__2__Impl_in_rule__Viewpoint__Group_8__22616);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1343:1: rule__Viewpoint__Group_8__2__Impl : ( ( rule__Viewpoint__Group_8_2__0 )* ) ;
    public final void rule__Viewpoint__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1347:1: ( ( ( rule__Viewpoint__Group_8_2__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1348:1: ( ( rule__Viewpoint__Group_8_2__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1348:1: ( ( rule__Viewpoint__Group_8_2__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1349:1: ( rule__Viewpoint__Group_8_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_8_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1350:1: ( rule__Viewpoint__Group_8_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==17) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1350:2: rule__Viewpoint__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Viewpoint__Group_8_2__0_in_rule__Viewpoint__Group_8__2__Impl2643);
            	    rule__Viewpoint__Group_8_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1366:1: rule__Viewpoint__Group_8_2__0 : rule__Viewpoint__Group_8_2__0__Impl rule__Viewpoint__Group_8_2__1 ;
    public final void rule__Viewpoint__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1370:1: ( rule__Viewpoint__Group_8_2__0__Impl rule__Viewpoint__Group_8_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1371:2: rule__Viewpoint__Group_8_2__0__Impl rule__Viewpoint__Group_8_2__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_8_2__0__Impl_in_rule__Viewpoint__Group_8_2__02680);
            rule__Viewpoint__Group_8_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_8_2__1_in_rule__Viewpoint__Group_8_2__02683);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1378:1: rule__Viewpoint__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1382:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1383:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1383:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1384:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getCommaKeyword_8_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Viewpoint__Group_8_2__0__Impl2711); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1397:1: rule__Viewpoint__Group_8_2__1 : rule__Viewpoint__Group_8_2__1__Impl ;
    public final void rule__Viewpoint__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1401:1: ( rule__Viewpoint__Group_8_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1402:2: rule__Viewpoint__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_8_2__1__Impl_in_rule__Viewpoint__Group_8_2__12742);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1408:1: rule__Viewpoint__Group_8_2__1__Impl : ( ( rule__Viewpoint__UseViewpointAssignment_8_2_1 ) ) ;
    public final void rule__Viewpoint__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1412:1: ( ( ( rule__Viewpoint__UseViewpointAssignment_8_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1413:1: ( ( rule__Viewpoint__UseViewpointAssignment_8_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1413:1: ( ( rule__Viewpoint__UseViewpointAssignment_8_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1414:1: ( rule__Viewpoint__UseViewpointAssignment_8_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseViewpointAssignment_8_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1415:1: ( rule__Viewpoint__UseViewpointAssignment_8_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1415:2: rule__Viewpoint__UseViewpointAssignment_8_2_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseViewpointAssignment_8_2_1_in_rule__Viewpoint__Group_8_2__1__Impl2769);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1429:1: rule__Viewpoint__Group_9__0 : rule__Viewpoint__Group_9__0__Impl rule__Viewpoint__Group_9__1 ;
    public final void rule__Viewpoint__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1433:1: ( rule__Viewpoint__Group_9__0__Impl rule__Viewpoint__Group_9__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1434:2: rule__Viewpoint__Group_9__0__Impl rule__Viewpoint__Group_9__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_9__0__Impl_in_rule__Viewpoint__Group_9__02803);
            rule__Viewpoint__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_9__1_in_rule__Viewpoint__Group_9__02806);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1441:1: rule__Viewpoint__Group_9__0__Impl : ( 'uses model' ) ;
    public final void rule__Viewpoint__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1445:1: ( ( 'uses model' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1446:1: ( 'uses model' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1446:1: ( 'uses model' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1447:1: 'uses model'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUsesModelKeyword_9_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Viewpoint__Group_9__0__Impl2834); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUsesModelKeyword_9_0()); 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1460:1: rule__Viewpoint__Group_9__1 : rule__Viewpoint__Group_9__1__Impl rule__Viewpoint__Group_9__2 ;
    public final void rule__Viewpoint__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1464:1: ( rule__Viewpoint__Group_9__1__Impl rule__Viewpoint__Group_9__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1465:2: rule__Viewpoint__Group_9__1__Impl rule__Viewpoint__Group_9__2
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_9__1__Impl_in_rule__Viewpoint__Group_9__12865);
            rule__Viewpoint__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_9__2_in_rule__Viewpoint__Group_9__12868);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1472:1: rule__Viewpoint__Group_9__1__Impl : ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_1 ) ) ;
    public final void rule__Viewpoint__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1476:1: ( ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1477:1: ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1477:1: ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1478:1: ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseAnyEMFResourceAssignment_9_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1479:1: ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1479:2: rule__Viewpoint__UseAnyEMFResourceAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseAnyEMFResourceAssignment_9_1_in_rule__Viewpoint__Group_9__1__Impl2895);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1489:1: rule__Viewpoint__Group_9__2 : rule__Viewpoint__Group_9__2__Impl ;
    public final void rule__Viewpoint__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1493:1: ( rule__Viewpoint__Group_9__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1494:2: rule__Viewpoint__Group_9__2__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_9__2__Impl_in_rule__Viewpoint__Group_9__22925);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1500:1: rule__Viewpoint__Group_9__2__Impl : ( ( rule__Viewpoint__Group_9_2__0 )* ) ;
    public final void rule__Viewpoint__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1504:1: ( ( ( rule__Viewpoint__Group_9_2__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1505:1: ( ( rule__Viewpoint__Group_9_2__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1505:1: ( ( rule__Viewpoint__Group_9_2__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1506:1: ( rule__Viewpoint__Group_9_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_9_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1507:1: ( rule__Viewpoint__Group_9_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==17) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1507:2: rule__Viewpoint__Group_9_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Viewpoint__Group_9_2__0_in_rule__Viewpoint__Group_9__2__Impl2952);
            	    rule__Viewpoint__Group_9_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1523:1: rule__Viewpoint__Group_9_2__0 : rule__Viewpoint__Group_9_2__0__Impl rule__Viewpoint__Group_9_2__1 ;
    public final void rule__Viewpoint__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1527:1: ( rule__Viewpoint__Group_9_2__0__Impl rule__Viewpoint__Group_9_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1528:2: rule__Viewpoint__Group_9_2__0__Impl rule__Viewpoint__Group_9_2__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_9_2__0__Impl_in_rule__Viewpoint__Group_9_2__02989);
            rule__Viewpoint__Group_9_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_9_2__1_in_rule__Viewpoint__Group_9_2__02992);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1535:1: rule__Viewpoint__Group_9_2__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_9_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1539:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1540:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1540:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1541:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getCommaKeyword_9_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Viewpoint__Group_9_2__0__Impl3020); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1554:1: rule__Viewpoint__Group_9_2__1 : rule__Viewpoint__Group_9_2__1__Impl ;
    public final void rule__Viewpoint__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1558:1: ( rule__Viewpoint__Group_9_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1559:2: rule__Viewpoint__Group_9_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_9_2__1__Impl_in_rule__Viewpoint__Group_9_2__13051);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1565:1: rule__Viewpoint__Group_9_2__1__Impl : ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1 ) ) ;
    public final void rule__Viewpoint__Group_9_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1569:1: ( ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1570:1: ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1570:1: ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1571:1: ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseAnyEMFResourceAssignment_9_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1572:1: ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1572:2: rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1_in_rule__Viewpoint__Group_9_2__1__Impl3078);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1586:1: rule__Viewpoint__Group_10__0 : rule__Viewpoint__Group_10__0__Impl rule__Viewpoint__Group_10__1 ;
    public final void rule__Viewpoint__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1590:1: ( rule__Viewpoint__Group_10__0__Impl rule__Viewpoint__Group_10__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1591:2: rule__Viewpoint__Group_10__0__Impl rule__Viewpoint__Group_10__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_10__0__Impl_in_rule__Viewpoint__Group_10__03112);
            rule__Viewpoint__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_10__1_in_rule__Viewpoint__Group_10__03115);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1598:1: rule__Viewpoint__Group_10__0__Impl : ( 'uses diagram' ) ;
    public final void rule__Viewpoint__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1602:1: ( ( 'uses diagram' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1603:1: ( 'uses diagram' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1603:1: ( 'uses diagram' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1604:1: 'uses diagram'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUsesDiagramKeyword_10_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Viewpoint__Group_10__0__Impl3143); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUsesDiagramKeyword_10_0()); 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1617:1: rule__Viewpoint__Group_10__1 : rule__Viewpoint__Group_10__1__Impl rule__Viewpoint__Group_10__2 ;
    public final void rule__Viewpoint__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1621:1: ( rule__Viewpoint__Group_10__1__Impl rule__Viewpoint__Group_10__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1622:2: rule__Viewpoint__Group_10__1__Impl rule__Viewpoint__Group_10__2
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_10__1__Impl_in_rule__Viewpoint__Group_10__13174);
            rule__Viewpoint__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_10__2_in_rule__Viewpoint__Group_10__13177);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1629:1: rule__Viewpoint__Group_10__1__Impl : ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_1 ) ) ;
    public final void rule__Viewpoint__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1633:1: ( ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1634:1: ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1634:1: ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1635:1: ( rule__Viewpoint__UseDiagramResourceAssignment_10_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseDiagramResourceAssignment_10_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1636:1: ( rule__Viewpoint__UseDiagramResourceAssignment_10_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1636:2: rule__Viewpoint__UseDiagramResourceAssignment_10_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseDiagramResourceAssignment_10_1_in_rule__Viewpoint__Group_10__1__Impl3204);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1646:1: rule__Viewpoint__Group_10__2 : rule__Viewpoint__Group_10__2__Impl ;
    public final void rule__Viewpoint__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1650:1: ( rule__Viewpoint__Group_10__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1651:2: rule__Viewpoint__Group_10__2__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_10__2__Impl_in_rule__Viewpoint__Group_10__23234);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1657:1: rule__Viewpoint__Group_10__2__Impl : ( ( rule__Viewpoint__Group_10_2__0 )* ) ;
    public final void rule__Viewpoint__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1661:1: ( ( ( rule__Viewpoint__Group_10_2__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1662:1: ( ( rule__Viewpoint__Group_10_2__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1662:1: ( ( rule__Viewpoint__Group_10_2__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1663:1: ( rule__Viewpoint__Group_10_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_10_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1664:1: ( rule__Viewpoint__Group_10_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==17) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1664:2: rule__Viewpoint__Group_10_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Viewpoint__Group_10_2__0_in_rule__Viewpoint__Group_10__2__Impl3261);
            	    rule__Viewpoint__Group_10_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1680:1: rule__Viewpoint__Group_10_2__0 : rule__Viewpoint__Group_10_2__0__Impl rule__Viewpoint__Group_10_2__1 ;
    public final void rule__Viewpoint__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1684:1: ( rule__Viewpoint__Group_10_2__0__Impl rule__Viewpoint__Group_10_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1685:2: rule__Viewpoint__Group_10_2__0__Impl rule__Viewpoint__Group_10_2__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_10_2__0__Impl_in_rule__Viewpoint__Group_10_2__03298);
            rule__Viewpoint__Group_10_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_10_2__1_in_rule__Viewpoint__Group_10_2__03301);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1692:1: rule__Viewpoint__Group_10_2__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1696:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1697:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1697:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1698:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getCommaKeyword_10_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Viewpoint__Group_10_2__0__Impl3329); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1711:1: rule__Viewpoint__Group_10_2__1 : rule__Viewpoint__Group_10_2__1__Impl ;
    public final void rule__Viewpoint__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1715:1: ( rule__Viewpoint__Group_10_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1716:2: rule__Viewpoint__Group_10_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_10_2__1__Impl_in_rule__Viewpoint__Group_10_2__13360);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1722:1: rule__Viewpoint__Group_10_2__1__Impl : ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_2_1 ) ) ;
    public final void rule__Viewpoint__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1726:1: ( ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1727:1: ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1727:1: ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1728:1: ( rule__Viewpoint__UseDiagramResourceAssignment_10_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseDiagramResourceAssignment_10_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1729:1: ( rule__Viewpoint__UseDiagramResourceAssignment_10_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1729:2: rule__Viewpoint__UseDiagramResourceAssignment_10_2_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseDiagramResourceAssignment_10_2_1_in_rule__Viewpoint__Group_10_2__1__Impl3387);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1743:1: rule__Viewpoint__Group_11__0 : rule__Viewpoint__Group_11__0__Impl rule__Viewpoint__Group_11__1 ;
    public final void rule__Viewpoint__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1747:1: ( rule__Viewpoint__Group_11__0__Impl rule__Viewpoint__Group_11__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1748:2: rule__Viewpoint__Group_11__0__Impl rule__Viewpoint__Group_11__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_11__0__Impl_in_rule__Viewpoint__Group_11__03421);
            rule__Viewpoint__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_11__1_in_rule__Viewpoint__Group_11__03424);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1755:1: rule__Viewpoint__Group_11__0__Impl : ( 'uses workspace' ) ;
    public final void rule__Viewpoint__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1759:1: ( ( 'uses workspace' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1760:1: ( 'uses workspace' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1760:1: ( 'uses workspace' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1761:1: 'uses workspace'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUsesWorkspaceKeyword_11_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__Viewpoint__Group_11__0__Impl3452); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUsesWorkspaceKeyword_11_0()); 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1774:1: rule__Viewpoint__Group_11__1 : rule__Viewpoint__Group_11__1__Impl rule__Viewpoint__Group_11__2 ;
    public final void rule__Viewpoint__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1778:1: ( rule__Viewpoint__Group_11__1__Impl rule__Viewpoint__Group_11__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1779:2: rule__Viewpoint__Group_11__1__Impl rule__Viewpoint__Group_11__2
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_11__1__Impl_in_rule__Viewpoint__Group_11__13483);
            rule__Viewpoint__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_11__2_in_rule__Viewpoint__Group_11__13486);
            rule__Viewpoint__Group_11__2();

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1786:1: rule__Viewpoint__Group_11__1__Impl : ( ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_1 ) ) ;
    public final void rule__Viewpoint__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1790:1: ( ( ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1791:1: ( ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1791:1: ( ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1792:1: ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseWorkspaceResourceAssignment_11_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1793:1: ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1793:2: rule__Viewpoint__UseWorkspaceResourceAssignment_11_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseWorkspaceResourceAssignment_11_1_in_rule__Viewpoint__Group_11__1__Impl3513);
            rule__Viewpoint__UseWorkspaceResourceAssignment_11_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseWorkspaceResourceAssignment_11_1()); 
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


    // $ANTLR start "rule__Viewpoint__Group_11__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1803:1: rule__Viewpoint__Group_11__2 : rule__Viewpoint__Group_11__2__Impl ;
    public final void rule__Viewpoint__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1807:1: ( rule__Viewpoint__Group_11__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1808:2: rule__Viewpoint__Group_11__2__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_11__2__Impl_in_rule__Viewpoint__Group_11__23543);
            rule__Viewpoint__Group_11__2__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group_11__2"


    // $ANTLR start "rule__Viewpoint__Group_11__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1814:1: rule__Viewpoint__Group_11__2__Impl : ( ( rule__Viewpoint__Group_11_2__0 )* ) ;
    public final void rule__Viewpoint__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1818:1: ( ( ( rule__Viewpoint__Group_11_2__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1819:1: ( ( rule__Viewpoint__Group_11_2__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1819:1: ( ( rule__Viewpoint__Group_11_2__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1820:1: ( rule__Viewpoint__Group_11_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_11_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1821:1: ( rule__Viewpoint__Group_11_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==17) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1821:2: rule__Viewpoint__Group_11_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Viewpoint__Group_11_2__0_in_rule__Viewpoint__Group_11__2__Impl3570);
            	    rule__Viewpoint__Group_11_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_11_2()); 
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
    // $ANTLR end "rule__Viewpoint__Group_11__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group_11_2__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1837:1: rule__Viewpoint__Group_11_2__0 : rule__Viewpoint__Group_11_2__0__Impl rule__Viewpoint__Group_11_2__1 ;
    public final void rule__Viewpoint__Group_11_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1841:1: ( rule__Viewpoint__Group_11_2__0__Impl rule__Viewpoint__Group_11_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1842:2: rule__Viewpoint__Group_11_2__0__Impl rule__Viewpoint__Group_11_2__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_11_2__0__Impl_in_rule__Viewpoint__Group_11_2__03607);
            rule__Viewpoint__Group_11_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_11_2__1_in_rule__Viewpoint__Group_11_2__03610);
            rule__Viewpoint__Group_11_2__1();

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
    // $ANTLR end "rule__Viewpoint__Group_11_2__0"


    // $ANTLR start "rule__Viewpoint__Group_11_2__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1849:1: rule__Viewpoint__Group_11_2__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_11_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1853:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1854:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1854:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1855:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getCommaKeyword_11_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Viewpoint__Group_11_2__0__Impl3638); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getCommaKeyword_11_2_0()); 
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
    // $ANTLR end "rule__Viewpoint__Group_11_2__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_11_2__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1868:1: rule__Viewpoint__Group_11_2__1 : rule__Viewpoint__Group_11_2__1__Impl ;
    public final void rule__Viewpoint__Group_11_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1872:1: ( rule__Viewpoint__Group_11_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1873:2: rule__Viewpoint__Group_11_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_11_2__1__Impl_in_rule__Viewpoint__Group_11_2__13669);
            rule__Viewpoint__Group_11_2__1__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group_11_2__1"


    // $ANTLR start "rule__Viewpoint__Group_11_2__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1879:1: rule__Viewpoint__Group_11_2__1__Impl : ( ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1 ) ) ;
    public final void rule__Viewpoint__Group_11_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1883:1: ( ( ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1884:1: ( ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1884:1: ( ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1885:1: ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseWorkspaceResourceAssignment_11_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1886:1: ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1886:2: rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1_in_rule__Viewpoint__Group_11_2__1__Impl3696);
            rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseWorkspaceResourceAssignment_11_2_1()); 
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
    // $ANTLR end "rule__Viewpoint__Group_11_2__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_12__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1900:1: rule__Viewpoint__Group_12__0 : rule__Viewpoint__Group_12__0__Impl rule__Viewpoint__Group_12__1 ;
    public final void rule__Viewpoint__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1904:1: ( rule__Viewpoint__Group_12__0__Impl rule__Viewpoint__Group_12__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1905:2: rule__Viewpoint__Group_12__0__Impl rule__Viewpoint__Group_12__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_12__0__Impl_in_rule__Viewpoint__Group_12__03730);
            rule__Viewpoint__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_12__1_in_rule__Viewpoint__Group_12__03733);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1912:1: rule__Viewpoint__Group_12__0__Impl : ( 'uses filesystem' ) ;
    public final void rule__Viewpoint__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1916:1: ( ( 'uses filesystem' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1917:1: ( 'uses filesystem' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1917:1: ( 'uses filesystem' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1918:1: 'uses filesystem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUsesFilesystemKeyword_12_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Viewpoint__Group_12__0__Impl3761); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUsesFilesystemKeyword_12_0()); 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1931:1: rule__Viewpoint__Group_12__1 : rule__Viewpoint__Group_12__1__Impl rule__Viewpoint__Group_12__2 ;
    public final void rule__Viewpoint__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1935:1: ( rule__Viewpoint__Group_12__1__Impl rule__Viewpoint__Group_12__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1936:2: rule__Viewpoint__Group_12__1__Impl rule__Viewpoint__Group_12__2
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_12__1__Impl_in_rule__Viewpoint__Group_12__13792);
            rule__Viewpoint__Group_12__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_12__2_in_rule__Viewpoint__Group_12__13795);
            rule__Viewpoint__Group_12__2();

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1943:1: rule__Viewpoint__Group_12__1__Impl : ( ( rule__Viewpoint__UseFSResourceAssignment_12_1 ) ) ;
    public final void rule__Viewpoint__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1947:1: ( ( ( rule__Viewpoint__UseFSResourceAssignment_12_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1948:1: ( ( rule__Viewpoint__UseFSResourceAssignment_12_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1948:1: ( ( rule__Viewpoint__UseFSResourceAssignment_12_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1949:1: ( rule__Viewpoint__UseFSResourceAssignment_12_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseFSResourceAssignment_12_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1950:1: ( rule__Viewpoint__UseFSResourceAssignment_12_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1950:2: rule__Viewpoint__UseFSResourceAssignment_12_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseFSResourceAssignment_12_1_in_rule__Viewpoint__Group_12__1__Impl3822);
            rule__Viewpoint__UseFSResourceAssignment_12_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseFSResourceAssignment_12_1()); 
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


    // $ANTLR start "rule__Viewpoint__Group_12__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1960:1: rule__Viewpoint__Group_12__2 : rule__Viewpoint__Group_12__2__Impl ;
    public final void rule__Viewpoint__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1964:1: ( rule__Viewpoint__Group_12__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1965:2: rule__Viewpoint__Group_12__2__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_12__2__Impl_in_rule__Viewpoint__Group_12__23852);
            rule__Viewpoint__Group_12__2__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group_12__2"


    // $ANTLR start "rule__Viewpoint__Group_12__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1971:1: rule__Viewpoint__Group_12__2__Impl : ( ( rule__Viewpoint__Group_12_2__0 )* ) ;
    public final void rule__Viewpoint__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1975:1: ( ( ( rule__Viewpoint__Group_12_2__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1976:1: ( ( rule__Viewpoint__Group_12_2__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1976:1: ( ( rule__Viewpoint__Group_12_2__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1977:1: ( rule__Viewpoint__Group_12_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_12_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1978:1: ( rule__Viewpoint__Group_12_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==17) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1978:2: rule__Viewpoint__Group_12_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Viewpoint__Group_12_2__0_in_rule__Viewpoint__Group_12__2__Impl3879);
            	    rule__Viewpoint__Group_12_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_12_2()); 
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
    // $ANTLR end "rule__Viewpoint__Group_12__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group_12_2__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1994:1: rule__Viewpoint__Group_12_2__0 : rule__Viewpoint__Group_12_2__0__Impl rule__Viewpoint__Group_12_2__1 ;
    public final void rule__Viewpoint__Group_12_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1998:1: ( rule__Viewpoint__Group_12_2__0__Impl rule__Viewpoint__Group_12_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1999:2: rule__Viewpoint__Group_12_2__0__Impl rule__Viewpoint__Group_12_2__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_12_2__0__Impl_in_rule__Viewpoint__Group_12_2__03916);
            rule__Viewpoint__Group_12_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_12_2__1_in_rule__Viewpoint__Group_12_2__03919);
            rule__Viewpoint__Group_12_2__1();

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
    // $ANTLR end "rule__Viewpoint__Group_12_2__0"


    // $ANTLR start "rule__Viewpoint__Group_12_2__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2006:1: rule__Viewpoint__Group_12_2__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_12_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2010:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2011:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2011:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2012:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getCommaKeyword_12_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Viewpoint__Group_12_2__0__Impl3947); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getCommaKeyword_12_2_0()); 
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
    // $ANTLR end "rule__Viewpoint__Group_12_2__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_12_2__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2025:1: rule__Viewpoint__Group_12_2__1 : rule__Viewpoint__Group_12_2__1__Impl ;
    public final void rule__Viewpoint__Group_12_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2029:1: ( rule__Viewpoint__Group_12_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2030:2: rule__Viewpoint__Group_12_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_12_2__1__Impl_in_rule__Viewpoint__Group_12_2__13978);
            rule__Viewpoint__Group_12_2__1__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group_12_2__1"


    // $ANTLR start "rule__Viewpoint__Group_12_2__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2036:1: rule__Viewpoint__Group_12_2__1__Impl : ( ( rule__Viewpoint__UseFSResourceAssignment_12_2_1 ) ) ;
    public final void rule__Viewpoint__Group_12_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2040:1: ( ( ( rule__Viewpoint__UseFSResourceAssignment_12_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2041:1: ( ( rule__Viewpoint__UseFSResourceAssignment_12_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2041:1: ( ( rule__Viewpoint__UseFSResourceAssignment_12_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2042:1: ( rule__Viewpoint__UseFSResourceAssignment_12_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseFSResourceAssignment_12_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2043:1: ( rule__Viewpoint__UseFSResourceAssignment_12_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2043:2: rule__Viewpoint__UseFSResourceAssignment_12_2_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseFSResourceAssignment_12_2_1_in_rule__Viewpoint__Group_12_2__1__Impl4005);
            rule__Viewpoint__UseFSResourceAssignment_12_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseFSResourceAssignment_12_2_1()); 
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
    // $ANTLR end "rule__Viewpoint__Group_12_2__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_13__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2057:1: rule__Viewpoint__Group_13__0 : rule__Viewpoint__Group_13__0__Impl rule__Viewpoint__Group_13__1 ;
    public final void rule__Viewpoint__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2061:1: ( rule__Viewpoint__Group_13__0__Impl rule__Viewpoint__Group_13__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2062:2: rule__Viewpoint__Group_13__0__Impl rule__Viewpoint__Group_13__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_13__0__Impl_in_rule__Viewpoint__Group_13__04039);
            rule__Viewpoint__Group_13__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_13__1_in_rule__Viewpoint__Group_13__04042);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2069:1: rule__Viewpoint__Group_13__0__Impl : ( 'Data' ) ;
    public final void rule__Viewpoint__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2073:1: ( ( 'Data' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2074:1: ( 'Data' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2074:1: ( 'Data' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2075:1: 'Data'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDataKeyword_13_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Viewpoint__Group_13__0__Impl4070); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getDataKeyword_13_0()); 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2088:1: rule__Viewpoint__Group_13__1 : rule__Viewpoint__Group_13__1__Impl ;
    public final void rule__Viewpoint__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2092:1: ( rule__Viewpoint__Group_13__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2093:2: rule__Viewpoint__Group_13__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_13__1__Impl_in_rule__Viewpoint__Group_13__14101);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2099:1: rule__Viewpoint__Group_13__1__Impl : ( ( rule__Viewpoint__VP_DataAssignment_13_1 ) ) ;
    public final void rule__Viewpoint__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2103:1: ( ( ( rule__Viewpoint__VP_DataAssignment_13_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2104:1: ( ( rule__Viewpoint__VP_DataAssignment_13_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2104:1: ( ( rule__Viewpoint__VP_DataAssignment_13_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2105:1: ( rule__Viewpoint__VP_DataAssignment_13_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_DataAssignment_13_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2106:1: ( rule__Viewpoint__VP_DataAssignment_13_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2106:2: rule__Viewpoint__VP_DataAssignment_13_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_DataAssignment_13_1_in_rule__Viewpoint__Group_13__1__Impl4128);
            rule__Viewpoint__VP_DataAssignment_13_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_DataAssignment_13_1()); 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2120:1: rule__Viewpoint__Group_14__0 : rule__Viewpoint__Group_14__0__Impl rule__Viewpoint__Group_14__1 ;
    public final void rule__Viewpoint__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2124:1: ( rule__Viewpoint__Group_14__0__Impl rule__Viewpoint__Group_14__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2125:2: rule__Viewpoint__Group_14__0__Impl rule__Viewpoint__Group_14__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_14__0__Impl_in_rule__Viewpoint__Group_14__04162);
            rule__Viewpoint__Group_14__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_14__1_in_rule__Viewpoint__Group_14__04165);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2132:1: rule__Viewpoint__Group_14__0__Impl : ( ( rule__Viewpoint__TypeAssignment_14_0 ) ) ;
    public final void rule__Viewpoint__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2136:1: ( ( ( rule__Viewpoint__TypeAssignment_14_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2137:1: ( ( rule__Viewpoint__TypeAssignment_14_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2137:1: ( ( rule__Viewpoint__TypeAssignment_14_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2138:1: ( rule__Viewpoint__TypeAssignment_14_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeAssignment_14_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2139:1: ( rule__Viewpoint__TypeAssignment_14_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2139:2: rule__Viewpoint__TypeAssignment_14_0
            {
            pushFollow(FOLLOW_rule__Viewpoint__TypeAssignment_14_0_in_rule__Viewpoint__Group_14__0__Impl4192);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2149:1: rule__Viewpoint__Group_14__1 : rule__Viewpoint__Group_14__1__Impl ;
    public final void rule__Viewpoint__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2153:1: ( rule__Viewpoint__Group_14__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2154:2: rule__Viewpoint__Group_14__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_14__1__Impl_in_rule__Viewpoint__Group_14__14222);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2160:1: rule__Viewpoint__Group_14__1__Impl : ( ( rule__Viewpoint__VP_AspectsAssignment_14_1 ) ) ;
    public final void rule__Viewpoint__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2164:1: ( ( ( rule__Viewpoint__VP_AspectsAssignment_14_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2165:1: ( ( rule__Viewpoint__VP_AspectsAssignment_14_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2165:1: ( ( rule__Viewpoint__VP_AspectsAssignment_14_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2166:1: ( rule__Viewpoint__VP_AspectsAssignment_14_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_14_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2167:1: ( rule__Viewpoint__VP_AspectsAssignment_14_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2167:2: rule__Viewpoint__VP_AspectsAssignment_14_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_AspectsAssignment_14_1_in_rule__Viewpoint__Group_14__1__Impl4249);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2181:1: rule__Viewpoint__Group_15__0 : rule__Viewpoint__Group_15__0__Impl rule__Viewpoint__Group_15__1 ;
    public final void rule__Viewpoint__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2185:1: ( rule__Viewpoint__Group_15__0__Impl rule__Viewpoint__Group_15__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2186:2: rule__Viewpoint__Group_15__0__Impl rule__Viewpoint__Group_15__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_15__0__Impl_in_rule__Viewpoint__Group_15__04283);
            rule__Viewpoint__Group_15__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_15__1_in_rule__Viewpoint__Group_15__04286);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2193:1: rule__Viewpoint__Group_15__0__Impl : ( ( rule__Viewpoint__TypeAssignment_15_0 ) ) ;
    public final void rule__Viewpoint__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2197:1: ( ( ( rule__Viewpoint__TypeAssignment_15_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2198:1: ( ( rule__Viewpoint__TypeAssignment_15_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2198:1: ( ( rule__Viewpoint__TypeAssignment_15_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2199:1: ( rule__Viewpoint__TypeAssignment_15_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeAssignment_15_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2200:1: ( rule__Viewpoint__TypeAssignment_15_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2200:2: rule__Viewpoint__TypeAssignment_15_0
            {
            pushFollow(FOLLOW_rule__Viewpoint__TypeAssignment_15_0_in_rule__Viewpoint__Group_15__0__Impl4313);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2210:1: rule__Viewpoint__Group_15__1 : rule__Viewpoint__Group_15__1__Impl ;
    public final void rule__Viewpoint__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2214:1: ( rule__Viewpoint__Group_15__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2215:2: rule__Viewpoint__Group_15__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_15__1__Impl_in_rule__Viewpoint__Group_15__14343);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2221:1: rule__Viewpoint__Group_15__1__Impl : ( ( rule__Viewpoint__VP_AspectsAssignment_15_1 ) ) ;
    public final void rule__Viewpoint__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2225:1: ( ( ( rule__Viewpoint__VP_AspectsAssignment_15_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2226:1: ( ( rule__Viewpoint__VP_AspectsAssignment_15_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2226:1: ( ( rule__Viewpoint__VP_AspectsAssignment_15_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2227:1: ( rule__Viewpoint__VP_AspectsAssignment_15_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_15_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2228:1: ( rule__Viewpoint__VP_AspectsAssignment_15_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2228:2: rule__Viewpoint__VP_AspectsAssignment_15_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_AspectsAssignment_15_1_in_rule__Viewpoint__Group_15__1__Impl4370);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2242:1: rule__Viewpoint__Group_16__0 : rule__Viewpoint__Group_16__0__Impl rule__Viewpoint__Group_16__1 ;
    public final void rule__Viewpoint__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2246:1: ( rule__Viewpoint__Group_16__0__Impl rule__Viewpoint__Group_16__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2247:2: rule__Viewpoint__Group_16__0__Impl rule__Viewpoint__Group_16__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_16__0__Impl_in_rule__Viewpoint__Group_16__04404);
            rule__Viewpoint__Group_16__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_16__1_in_rule__Viewpoint__Group_16__04407);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2254:1: rule__Viewpoint__Group_16__0__Impl : ( ( rule__Viewpoint__TypeAssignment_16_0 ) ) ;
    public final void rule__Viewpoint__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2258:1: ( ( ( rule__Viewpoint__TypeAssignment_16_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2259:1: ( ( rule__Viewpoint__TypeAssignment_16_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2259:1: ( ( rule__Viewpoint__TypeAssignment_16_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2260:1: ( rule__Viewpoint__TypeAssignment_16_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeAssignment_16_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2261:1: ( rule__Viewpoint__TypeAssignment_16_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2261:2: rule__Viewpoint__TypeAssignment_16_0
            {
            pushFollow(FOLLOW_rule__Viewpoint__TypeAssignment_16_0_in_rule__Viewpoint__Group_16__0__Impl4434);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2271:1: rule__Viewpoint__Group_16__1 : rule__Viewpoint__Group_16__1__Impl ;
    public final void rule__Viewpoint__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2275:1: ( rule__Viewpoint__Group_16__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2276:2: rule__Viewpoint__Group_16__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_16__1__Impl_in_rule__Viewpoint__Group_16__14464);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2282:1: rule__Viewpoint__Group_16__1__Impl : ( ( rule__Viewpoint__VP_AspectsAssignment_16_1 ) ) ;
    public final void rule__Viewpoint__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2286:1: ( ( ( rule__Viewpoint__VP_AspectsAssignment_16_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2287:1: ( ( rule__Viewpoint__VP_AspectsAssignment_16_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2287:1: ( ( rule__Viewpoint__VP_AspectsAssignment_16_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2288:1: ( rule__Viewpoint__VP_AspectsAssignment_16_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_16_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2289:1: ( rule__Viewpoint__VP_AspectsAssignment_16_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2289:2: rule__Viewpoint__VP_AspectsAssignment_16_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_AspectsAssignment_16_1_in_rule__Viewpoint__Group_16__1__Impl4491);
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


    // $ANTLR start "rule__Viewpoint__Group_17__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2303:1: rule__Viewpoint__Group_17__0 : rule__Viewpoint__Group_17__0__Impl rule__Viewpoint__Group_17__1 ;
    public final void rule__Viewpoint__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2307:1: ( rule__Viewpoint__Group_17__0__Impl rule__Viewpoint__Group_17__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2308:2: rule__Viewpoint__Group_17__0__Impl rule__Viewpoint__Group_17__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_17__0__Impl_in_rule__Viewpoint__Group_17__04525);
            rule__Viewpoint__Group_17__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_17__1_in_rule__Viewpoint__Group_17__04528);
            rule__Viewpoint__Group_17__1();

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
    // $ANTLR end "rule__Viewpoint__Group_17__0"


    // $ANTLR start "rule__Viewpoint__Group_17__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2315:1: rule__Viewpoint__Group_17__0__Impl : ( ( rule__Viewpoint__TypeAssignment_17_0 ) ) ;
    public final void rule__Viewpoint__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2319:1: ( ( ( rule__Viewpoint__TypeAssignment_17_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2320:1: ( ( rule__Viewpoint__TypeAssignment_17_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2320:1: ( ( rule__Viewpoint__TypeAssignment_17_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2321:1: ( rule__Viewpoint__TypeAssignment_17_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeAssignment_17_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2322:1: ( rule__Viewpoint__TypeAssignment_17_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2322:2: rule__Viewpoint__TypeAssignment_17_0
            {
            pushFollow(FOLLOW_rule__Viewpoint__TypeAssignment_17_0_in_rule__Viewpoint__Group_17__0__Impl4555);
            rule__Viewpoint__TypeAssignment_17_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeAssignment_17_0()); 
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
    // $ANTLR end "rule__Viewpoint__Group_17__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_17__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2332:1: rule__Viewpoint__Group_17__1 : rule__Viewpoint__Group_17__1__Impl ;
    public final void rule__Viewpoint__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2336:1: ( rule__Viewpoint__Group_17__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2337:2: rule__Viewpoint__Group_17__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_17__1__Impl_in_rule__Viewpoint__Group_17__14585);
            rule__Viewpoint__Group_17__1__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group_17__1"


    // $ANTLR start "rule__Viewpoint__Group_17__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2343:1: rule__Viewpoint__Group_17__1__Impl : ( ( rule__Viewpoint__VP_AspectsAssignment_17_1 ) ) ;
    public final void rule__Viewpoint__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2347:1: ( ( ( rule__Viewpoint__VP_AspectsAssignment_17_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2348:1: ( ( rule__Viewpoint__VP_AspectsAssignment_17_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2348:1: ( ( rule__Viewpoint__VP_AspectsAssignment_17_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2349:1: ( rule__Viewpoint__VP_AspectsAssignment_17_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_17_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2350:1: ( rule__Viewpoint__VP_AspectsAssignment_17_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2350:2: rule__Viewpoint__VP_AspectsAssignment_17_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_AspectsAssignment_17_1_in_rule__Viewpoint__Group_17__1__Impl4612);
            rule__Viewpoint__VP_AspectsAssignment_17_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_17_1()); 
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
    // $ANTLR end "rule__Viewpoint__Group_17__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_18__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2364:1: rule__Viewpoint__Group_18__0 : rule__Viewpoint__Group_18__0__Impl rule__Viewpoint__Group_18__1 ;
    public final void rule__Viewpoint__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2368:1: ( rule__Viewpoint__Group_18__0__Impl rule__Viewpoint__Group_18__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2369:2: rule__Viewpoint__Group_18__0__Impl rule__Viewpoint__Group_18__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_18__0__Impl_in_rule__Viewpoint__Group_18__04646);
            rule__Viewpoint__Group_18__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_18__1_in_rule__Viewpoint__Group_18__04649);
            rule__Viewpoint__Group_18__1();

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
    // $ANTLR end "rule__Viewpoint__Group_18__0"


    // $ANTLR start "rule__Viewpoint__Group_18__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2376:1: rule__Viewpoint__Group_18__0__Impl : ( ( rule__Viewpoint__TypeAssignment_18_0 ) ) ;
    public final void rule__Viewpoint__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2380:1: ( ( ( rule__Viewpoint__TypeAssignment_18_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2381:1: ( ( rule__Viewpoint__TypeAssignment_18_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2381:1: ( ( rule__Viewpoint__TypeAssignment_18_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2382:1: ( rule__Viewpoint__TypeAssignment_18_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeAssignment_18_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2383:1: ( rule__Viewpoint__TypeAssignment_18_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2383:2: rule__Viewpoint__TypeAssignment_18_0
            {
            pushFollow(FOLLOW_rule__Viewpoint__TypeAssignment_18_0_in_rule__Viewpoint__Group_18__0__Impl4676);
            rule__Viewpoint__TypeAssignment_18_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeAssignment_18_0()); 
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
    // $ANTLR end "rule__Viewpoint__Group_18__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_18__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2393:1: rule__Viewpoint__Group_18__1 : rule__Viewpoint__Group_18__1__Impl ;
    public final void rule__Viewpoint__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2397:1: ( rule__Viewpoint__Group_18__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2398:2: rule__Viewpoint__Group_18__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_18__1__Impl_in_rule__Viewpoint__Group_18__14706);
            rule__Viewpoint__Group_18__1__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group_18__1"


    // $ANTLR start "rule__Viewpoint__Group_18__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2404:1: rule__Viewpoint__Group_18__1__Impl : ( ( rule__Viewpoint__VP_AspectsAssignment_18_1 ) ) ;
    public final void rule__Viewpoint__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2408:1: ( ( ( rule__Viewpoint__VP_AspectsAssignment_18_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2409:1: ( ( rule__Viewpoint__VP_AspectsAssignment_18_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2409:1: ( ( rule__Viewpoint__VP_AspectsAssignment_18_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2410:1: ( rule__Viewpoint__VP_AspectsAssignment_18_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_18_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2411:1: ( rule__Viewpoint__VP_AspectsAssignment_18_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2411:2: rule__Viewpoint__VP_AspectsAssignment_18_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_AspectsAssignment_18_1_in_rule__Viewpoint__Group_18__1__Impl4733);
            rule__Viewpoint__VP_AspectsAssignment_18_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_18_1()); 
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
    // $ANTLR end "rule__Viewpoint__Group_18__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_19__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2425:1: rule__Viewpoint__Group_19__0 : rule__Viewpoint__Group_19__0__Impl rule__Viewpoint__Group_19__1 ;
    public final void rule__Viewpoint__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2429:1: ( rule__Viewpoint__Group_19__0__Impl rule__Viewpoint__Group_19__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2430:2: rule__Viewpoint__Group_19__0__Impl rule__Viewpoint__Group_19__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_19__0__Impl_in_rule__Viewpoint__Group_19__04767);
            rule__Viewpoint__Group_19__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_19__1_in_rule__Viewpoint__Group_19__04770);
            rule__Viewpoint__Group_19__1();

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
    // $ANTLR end "rule__Viewpoint__Group_19__0"


    // $ANTLR start "rule__Viewpoint__Group_19__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2437:1: rule__Viewpoint__Group_19__0__Impl : ( ( rule__Viewpoint__TypeAssignment_19_0 ) ) ;
    public final void rule__Viewpoint__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2441:1: ( ( ( rule__Viewpoint__TypeAssignment_19_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2442:1: ( ( rule__Viewpoint__TypeAssignment_19_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2442:1: ( ( rule__Viewpoint__TypeAssignment_19_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2443:1: ( rule__Viewpoint__TypeAssignment_19_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeAssignment_19_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2444:1: ( rule__Viewpoint__TypeAssignment_19_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2444:2: rule__Viewpoint__TypeAssignment_19_0
            {
            pushFollow(FOLLOW_rule__Viewpoint__TypeAssignment_19_0_in_rule__Viewpoint__Group_19__0__Impl4797);
            rule__Viewpoint__TypeAssignment_19_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeAssignment_19_0()); 
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
    // $ANTLR end "rule__Viewpoint__Group_19__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_19__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2454:1: rule__Viewpoint__Group_19__1 : rule__Viewpoint__Group_19__1__Impl ;
    public final void rule__Viewpoint__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2458:1: ( rule__Viewpoint__Group_19__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2459:2: rule__Viewpoint__Group_19__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_19__1__Impl_in_rule__Viewpoint__Group_19__14827);
            rule__Viewpoint__Group_19__1__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group_19__1"


    // $ANTLR start "rule__Viewpoint__Group_19__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2465:1: rule__Viewpoint__Group_19__1__Impl : ( ( rule__Viewpoint__VP_AspectsAssignment_19_1 ) ) ;
    public final void rule__Viewpoint__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2469:1: ( ( ( rule__Viewpoint__VP_AspectsAssignment_19_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2470:1: ( ( rule__Viewpoint__VP_AspectsAssignment_19_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2470:1: ( ( rule__Viewpoint__VP_AspectsAssignment_19_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2471:1: ( rule__Viewpoint__VP_AspectsAssignment_19_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_19_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2472:1: ( rule__Viewpoint__VP_AspectsAssignment_19_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2472:2: rule__Viewpoint__VP_AspectsAssignment_19_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_AspectsAssignment_19_1_in_rule__Viewpoint__Group_19__1__Impl4854);
            rule__Viewpoint__VP_AspectsAssignment_19_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_19_1()); 
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
    // $ANTLR end "rule__Viewpoint__Group_19__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2486:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2490:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2491:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__04888);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04891);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2498:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2502:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2503:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2503:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2504:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl4918); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2515:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2519:1: ( rule__FQN__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2520:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14947);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2526:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2530:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2531:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2531:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2532:1: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2533:1: ( rule__FQN__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==25) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2533:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4974);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2547:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2551:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2552:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__05009);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__05012);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2559:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2563:1: ( ( '.' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2564:1: ( '.' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2564:1: ( '.' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2565:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__FQN__Group_1__0__Impl5040); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2578:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2582:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2583:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__15071);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2589:1: rule__FQN__Group_1__1__Impl : ( ( RULE_ID ) ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2593:1: ( ( ( RULE_ID ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2594:1: ( ( RULE_ID ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2594:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2595:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2596:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2596:3: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl5099); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2611:1: rule__Viewpoint__ShortNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Viewpoint__ShortNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2615:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2616:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2616:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2617:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getShortNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Viewpoint__ShortNameAssignment_25138); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2626:1: rule__Viewpoint__NameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Viewpoint__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2630:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2631:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2631:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2632:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getNameSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Viewpoint__NameAssignment_4_15169); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2641:1: rule__Viewpoint__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2645:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2646:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2646:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2647:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__DescriptionAssignment_5_15200);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2656:1: rule__Viewpoint__ParentsAssignment_6_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__ParentsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2660:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2661:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2661:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2662:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsViewpointCrossReference_6_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2663:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2664:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsViewpointFQNParserRuleCall_6_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__ParentsAssignment_6_15235);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2675:1: rule__Viewpoint__ParentsAssignment_6_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__ParentsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2679:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2680:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2680:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2681:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsViewpointCrossReference_6_2_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2682:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2683:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsViewpointFQNParserRuleCall_6_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__ParentsAssignment_6_2_15274);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2694:1: rule__Viewpoint__DependenciesAssignment_7_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__DependenciesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2698:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2699:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2699:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2700:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesViewpointCrossReference_7_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2701:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2702:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesViewpointFQNParserRuleCall_7_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__DependenciesAssignment_7_15313);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2713:1: rule__Viewpoint__DependenciesAssignment_7_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__DependenciesAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2717:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2718:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2718:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2719:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesViewpointCrossReference_7_2_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2720:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2721:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesViewpointFQNParserRuleCall_7_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__DependenciesAssignment_7_2_15352);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2732:1: rule__Viewpoint__UseViewpointAssignment_8_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__UseViewpointAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2736:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2737:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2737:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2738:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseViewpointViewpointCrossReference_8_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2739:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2740:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseViewpointViewpointFQNParserRuleCall_8_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__UseViewpointAssignment_8_15391);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2751:1: rule__Viewpoint__UseViewpointAssignment_8_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__UseViewpointAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2755:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2756:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2756:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2757:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseViewpointViewpointCrossReference_8_2_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2758:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2759:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseViewpointViewpointFQNParserRuleCall_8_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__UseViewpointAssignment_8_2_15430);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2770:1: rule__Viewpoint__UseAnyEMFResourceAssignment_9_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__UseAnyEMFResourceAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2774:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2775:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2775:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2776:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseAnyEMFResourceEStringParserRuleCall_9_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__UseAnyEMFResourceAssignment_9_15465);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2785:1: rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2789:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2790:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2790:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2791:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseAnyEMFResourceEStringParserRuleCall_9_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_15496);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2800:1: rule__Viewpoint__UseDiagramResourceAssignment_10_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__UseDiagramResourceAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2804:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2805:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2805:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2806:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseDiagramResourceEStringParserRuleCall_10_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__UseDiagramResourceAssignment_10_15527);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2815:1: rule__Viewpoint__UseDiagramResourceAssignment_10_2_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__UseDiagramResourceAssignment_10_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2819:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2820:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2820:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2821:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseDiagramResourceEStringParserRuleCall_10_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__UseDiagramResourceAssignment_10_2_15558);
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


    // $ANTLR start "rule__Viewpoint__UseWorkspaceResourceAssignment_11_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2830:1: rule__Viewpoint__UseWorkspaceResourceAssignment_11_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__UseWorkspaceResourceAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2834:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2835:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2835:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2836:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseWorkspaceResourceEStringParserRuleCall_11_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__UseWorkspaceResourceAssignment_11_15589);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseWorkspaceResourceEStringParserRuleCall_11_1_0()); 
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
    // $ANTLR end "rule__Viewpoint__UseWorkspaceResourceAssignment_11_1"


    // $ANTLR start "rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2845:1: rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2849:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2850:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2850:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2851:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseWorkspaceResourceEStringParserRuleCall_11_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_15620);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseWorkspaceResourceEStringParserRuleCall_11_2_1_0()); 
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
    // $ANTLR end "rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1"


    // $ANTLR start "rule__Viewpoint__UseFSResourceAssignment_12_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2860:1: rule__Viewpoint__UseFSResourceAssignment_12_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__UseFSResourceAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2864:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2865:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2865:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2866:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseFSResourceEStringParserRuleCall_12_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__UseFSResourceAssignment_12_15651);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseFSResourceEStringParserRuleCall_12_1_0()); 
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
    // $ANTLR end "rule__Viewpoint__UseFSResourceAssignment_12_1"


    // $ANTLR start "rule__Viewpoint__UseFSResourceAssignment_12_2_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2875:1: rule__Viewpoint__UseFSResourceAssignment_12_2_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__UseFSResourceAssignment_12_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2879:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2880:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2880:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2881:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseFSResourceEStringParserRuleCall_12_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__UseFSResourceAssignment_12_2_15682);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseFSResourceEStringParserRuleCall_12_2_1_0()); 
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
    // $ANTLR end "rule__Viewpoint__UseFSResourceAssignment_12_2_1"


    // $ANTLR start "rule__Viewpoint__VP_DataAssignment_13_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2890:1: rule__Viewpoint__VP_DataAssignment_13_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_DataAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2894:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2895:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2895:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2896:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_DataDataCrossReference_13_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2897:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2898:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_DataDataFQNParserRuleCall_13_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_DataAssignment_13_15717);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_DataDataFQNParserRuleCall_13_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_DataDataCrossReference_13_1_0()); 
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
    // $ANTLR end "rule__Viewpoint__VP_DataAssignment_13_1"


    // $ANTLR start "rule__Viewpoint__TypeAssignment_14_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2909:1: rule__Viewpoint__TypeAssignment_14_0 : ( ( 'UI' ) ) ;
    public final void rule__Viewpoint__TypeAssignment_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2913:1: ( ( ( 'UI' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2914:1: ( ( 'UI' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2914:1: ( ( 'UI' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2915:1: ( 'UI' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeUIKeyword_14_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2916:1: ( 'UI' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2917:1: 'UI'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeUIKeyword_14_0_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Viewpoint__TypeAssignment_14_05757); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeUIKeyword_14_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeUIKeyword_14_0_0()); 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2932:1: rule__Viewpoint__VP_AspectsAssignment_14_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_AspectsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2936:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2937:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2937:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2938:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionCrossReference_14_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2939:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2940:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionFQNParserRuleCall_14_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_14_15800);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionFQNParserRuleCall_14_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionCrossReference_14_1_0()); 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2951:1: rule__Viewpoint__TypeAssignment_15_0 : ( ( 'Diagrams' ) ) ;
    public final void rule__Viewpoint__TypeAssignment_15_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2955:1: ( ( ( 'Diagrams' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2956:1: ( ( 'Diagrams' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2956:1: ( ( 'Diagrams' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2957:1: ( 'Diagrams' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_15_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2958:1: ( 'Diagrams' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2959:1: 'Diagrams'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_15_0_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Viewpoint__TypeAssignment_15_05840); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_15_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_15_0_0()); 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2974:1: rule__Viewpoint__VP_AspectsAssignment_15_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_AspectsAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2978:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2979:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2979:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2980:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetCrossReference_15_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2981:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2982:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetFQNParserRuleCall_15_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_15_15883);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetFQNParserRuleCall_15_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetCrossReference_15_1_0()); 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2993:1: rule__Viewpoint__TypeAssignment_16_0 : ( ( 'Activity Explorer' ) ) ;
    public final void rule__Viewpoint__TypeAssignment_16_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2997:1: ( ( ( 'Activity Explorer' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2998:1: ( ( 'Activity Explorer' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2998:1: ( ( 'Activity Explorer' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2999:1: ( 'Activity Explorer' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeActivityExplorerKeyword_16_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3000:1: ( 'Activity Explorer' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3001:1: 'Activity Explorer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeActivityExplorerKeyword_16_0_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Viewpoint__TypeAssignment_16_05923); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeActivityExplorerKeyword_16_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeActivityExplorerKeyword_16_0_0()); 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3016:1: rule__Viewpoint__VP_AspectsAssignment_16_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_AspectsAssignment_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3020:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3021:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3021:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3022:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsViewpointActivityExplorerCrossReference_16_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3023:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3024:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsViewpointActivityExplorerFQNParserRuleCall_16_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_16_15966);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsViewpointActivityExplorerFQNParserRuleCall_16_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsViewpointActivityExplorerCrossReference_16_1_0()); 
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


    // $ANTLR start "rule__Viewpoint__TypeAssignment_17_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3035:1: rule__Viewpoint__TypeAssignment_17_0 : ( ( 'Services' ) ) ;
    public final void rule__Viewpoint__TypeAssignment_17_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3039:1: ( ( ( 'Services' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3040:1: ( ( 'Services' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3040:1: ( ( 'Services' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3041:1: ( 'Services' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeServicesKeyword_17_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3042:1: ( 'Services' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3043:1: 'Services'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeServicesKeyword_17_0_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__Viewpoint__TypeAssignment_17_06006); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeServicesKeyword_17_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeServicesKeyword_17_0_0()); 
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
    // $ANTLR end "rule__Viewpoint__TypeAssignment_17_0"


    // $ANTLR start "rule__Viewpoint__VP_AspectsAssignment_17_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3058:1: rule__Viewpoint__VP_AspectsAssignment_17_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_AspectsAssignment_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3062:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3063:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3063:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3064:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetCrossReference_17_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3065:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3066:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetFQNParserRuleCall_17_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_17_16049);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetFQNParserRuleCall_17_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetCrossReference_17_1_0()); 
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
    // $ANTLR end "rule__Viewpoint__VP_AspectsAssignment_17_1"


    // $ANTLR start "rule__Viewpoint__TypeAssignment_18_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3077:1: rule__Viewpoint__TypeAssignment_18_0 : ( ( 'Build' ) ) ;
    public final void rule__Viewpoint__TypeAssignment_18_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3081:1: ( ( ( 'Build' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3082:1: ( ( 'Build' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3082:1: ( ( 'Build' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3083:1: ( 'Build' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeBuildKeyword_18_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3084:1: ( 'Build' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3085:1: 'Build'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeBuildKeyword_18_0_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Viewpoint__TypeAssignment_18_06089); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeBuildKeyword_18_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeBuildKeyword_18_0_0()); 
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
    // $ANTLR end "rule__Viewpoint__TypeAssignment_18_0"


    // $ANTLR start "rule__Viewpoint__VP_AspectsAssignment_18_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3100:1: rule__Viewpoint__VP_AspectsAssignment_18_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_AspectsAssignment_18_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3104:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3105:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3105:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3106:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsBuildCrossReference_18_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3107:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3108:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsBuildFQNParserRuleCall_18_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_18_16132);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsBuildFQNParserRuleCall_18_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsBuildCrossReference_18_1_0()); 
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
    // $ANTLR end "rule__Viewpoint__VP_AspectsAssignment_18_1"


    // $ANTLR start "rule__Viewpoint__TypeAssignment_19_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3119:1: rule__Viewpoint__TypeAssignment_19_0 : ( ( 'Configuration' ) ) ;
    public final void rule__Viewpoint__TypeAssignment_19_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3123:1: ( ( ( 'Configuration' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3124:1: ( ( 'Configuration' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3124:1: ( ( 'Configuration' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3125:1: ( 'Configuration' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_19_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3126:1: ( 'Configuration' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3127:1: 'Configuration'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_19_0_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__Viewpoint__TypeAssignment_19_06172); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_19_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_19_0_0()); 
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
    // $ANTLR end "rule__Viewpoint__TypeAssignment_19_0"


    // $ANTLR start "rule__Viewpoint__VP_AspectsAssignment_19_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3142:1: rule__Viewpoint__VP_AspectsAssignment_19_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_AspectsAssignment_19_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3146:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3147:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3147:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3148:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationCrossReference_19_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3149:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3150:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationFQNParserRuleCall_19_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_19_16215);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationFQNParserRuleCall_19_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationCrossReference_19_1_0()); 
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
    // $ANTLR end "rule__Viewpoint__VP_AspectsAssignment_19_1"

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
    public static final BitSet FOLLOW_rule__Viewpoint__Group__4__Impl_in_rule__Viewpoint__Group__4554 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__5_in_rule__Viewpoint__Group__4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_4__0_in_rule__Viewpoint__Group__4__Impl584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__5__Impl_in_rule__Viewpoint__Group__5614 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__6_in_rule__Viewpoint__Group__5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_5__0_in_rule__Viewpoint__Group__5__Impl644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__6__Impl_in_rule__Viewpoint__Group__6675 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__7_in_rule__Viewpoint__Group__6678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__0_in_rule__Viewpoint__Group__6__Impl705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__7__Impl_in_rule__Viewpoint__Group__7736 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__8_in_rule__Viewpoint__Group__7739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__0_in_rule__Viewpoint__Group__7__Impl766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__8__Impl_in_rule__Viewpoint__Group__8797 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__9_in_rule__Viewpoint__Group__8800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8__0_in_rule__Viewpoint__Group__8__Impl827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__9__Impl_in_rule__Viewpoint__Group__9858 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__10_in_rule__Viewpoint__Group__9861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9__0_in_rule__Viewpoint__Group__9__Impl888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__10__Impl_in_rule__Viewpoint__Group__10919 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__11_in_rule__Viewpoint__Group__10922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10__0_in_rule__Viewpoint__Group__10__Impl949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__11__Impl_in_rule__Viewpoint__Group__11980 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__12_in_rule__Viewpoint__Group__11983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11__0_in_rule__Viewpoint__Group__11__Impl1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__12__Impl_in_rule__Viewpoint__Group__121041 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__13_in_rule__Viewpoint__Group__121044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12__0_in_rule__Viewpoint__Group__12__Impl1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__13__Impl_in_rule__Viewpoint__Group__131102 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__14_in_rule__Viewpoint__Group__131105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_13__0_in_rule__Viewpoint__Group__13__Impl1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__14__Impl_in_rule__Viewpoint__Group__141163 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__15_in_rule__Viewpoint__Group__141166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_14__0_in_rule__Viewpoint__Group__14__Impl1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__15__Impl_in_rule__Viewpoint__Group__151224 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__16_in_rule__Viewpoint__Group__151227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_15__0_in_rule__Viewpoint__Group__15__Impl1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__16__Impl_in_rule__Viewpoint__Group__161285 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__17_in_rule__Viewpoint__Group__161288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_16__0_in_rule__Viewpoint__Group__16__Impl1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__17__Impl_in_rule__Viewpoint__Group__171346 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__18_in_rule__Viewpoint__Group__171349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_17__0_in_rule__Viewpoint__Group__17__Impl1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__18__Impl_in_rule__Viewpoint__Group__181407 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__19_in_rule__Viewpoint__Group__181410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_18__0_in_rule__Viewpoint__Group__18__Impl1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__19__Impl_in_rule__Viewpoint__Group__191468 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__20_in_rule__Viewpoint__Group__191471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_19__0_in_rule__Viewpoint__Group__19__Impl1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__20__Impl_in_rule__Viewpoint__Group__201529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Viewpoint__Group__20__Impl1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_4__0__Impl_in_rule__Viewpoint__Group_4__01630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_4__1_in_rule__Viewpoint__Group_4__01633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Viewpoint__Group_4__0__Impl1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_4__1__Impl_in_rule__Viewpoint__Group_4__11692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__NameAssignment_4_1_in_rule__Viewpoint__Group_4__1__Impl1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_5__0__Impl_in_rule__Viewpoint__Group_5__01753 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_5__1_in_rule__Viewpoint__Group_5__01756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Viewpoint__Group_5__0__Impl1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_5__1__Impl_in_rule__Viewpoint__Group_5__11815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__DescriptionAssignment_5_1_in_rule__Viewpoint__Group_5__1__Impl1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__0__Impl_in_rule__Viewpoint__Group_6__01876 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__1_in_rule__Viewpoint__Group_6__01879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Viewpoint__Group_6__0__Impl1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__1__Impl_in_rule__Viewpoint__Group_6__11938 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__2_in_rule__Viewpoint__Group_6__11941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__ParentsAssignment_6_1_in_rule__Viewpoint__Group_6__1__Impl1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__2__Impl_in_rule__Viewpoint__Group_6__21998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6_2__0_in_rule__Viewpoint__Group_6__2__Impl2025 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6_2__0__Impl_in_rule__Viewpoint__Group_6_2__02062 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6_2__1_in_rule__Viewpoint__Group_6_2__02065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Viewpoint__Group_6_2__0__Impl2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6_2__1__Impl_in_rule__Viewpoint__Group_6_2__12124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__ParentsAssignment_6_2_1_in_rule__Viewpoint__Group_6_2__1__Impl2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__0__Impl_in_rule__Viewpoint__Group_7__02185 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__1_in_rule__Viewpoint__Group_7__02188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Viewpoint__Group_7__0__Impl2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__1__Impl_in_rule__Viewpoint__Group_7__12247 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__2_in_rule__Viewpoint__Group_7__12250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__DependenciesAssignment_7_1_in_rule__Viewpoint__Group_7__1__Impl2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__2__Impl_in_rule__Viewpoint__Group_7__22307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7_2__0_in_rule__Viewpoint__Group_7__2__Impl2334 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7_2__0__Impl_in_rule__Viewpoint__Group_7_2__02371 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7_2__1_in_rule__Viewpoint__Group_7_2__02374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Viewpoint__Group_7_2__0__Impl2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7_2__1__Impl_in_rule__Viewpoint__Group_7_2__12433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__DependenciesAssignment_7_2_1_in_rule__Viewpoint__Group_7_2__1__Impl2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8__0__Impl_in_rule__Viewpoint__Group_8__02494 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8__1_in_rule__Viewpoint__Group_8__02497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Viewpoint__Group_8__0__Impl2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8__1__Impl_in_rule__Viewpoint__Group_8__12556 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8__2_in_rule__Viewpoint__Group_8__12559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseViewpointAssignment_8_1_in_rule__Viewpoint__Group_8__1__Impl2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8__2__Impl_in_rule__Viewpoint__Group_8__22616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8_2__0_in_rule__Viewpoint__Group_8__2__Impl2643 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8_2__0__Impl_in_rule__Viewpoint__Group_8_2__02680 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8_2__1_in_rule__Viewpoint__Group_8_2__02683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Viewpoint__Group_8_2__0__Impl2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8_2__1__Impl_in_rule__Viewpoint__Group_8_2__12742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseViewpointAssignment_8_2_1_in_rule__Viewpoint__Group_8_2__1__Impl2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9__0__Impl_in_rule__Viewpoint__Group_9__02803 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9__1_in_rule__Viewpoint__Group_9__02806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Viewpoint__Group_9__0__Impl2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9__1__Impl_in_rule__Viewpoint__Group_9__12865 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9__2_in_rule__Viewpoint__Group_9__12868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseAnyEMFResourceAssignment_9_1_in_rule__Viewpoint__Group_9__1__Impl2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9__2__Impl_in_rule__Viewpoint__Group_9__22925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9_2__0_in_rule__Viewpoint__Group_9__2__Impl2952 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9_2__0__Impl_in_rule__Viewpoint__Group_9_2__02989 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9_2__1_in_rule__Viewpoint__Group_9_2__02992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Viewpoint__Group_9_2__0__Impl3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9_2__1__Impl_in_rule__Viewpoint__Group_9_2__13051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1_in_rule__Viewpoint__Group_9_2__1__Impl3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10__0__Impl_in_rule__Viewpoint__Group_10__03112 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10__1_in_rule__Viewpoint__Group_10__03115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Viewpoint__Group_10__0__Impl3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10__1__Impl_in_rule__Viewpoint__Group_10__13174 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10__2_in_rule__Viewpoint__Group_10__13177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseDiagramResourceAssignment_10_1_in_rule__Viewpoint__Group_10__1__Impl3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10__2__Impl_in_rule__Viewpoint__Group_10__23234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10_2__0_in_rule__Viewpoint__Group_10__2__Impl3261 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10_2__0__Impl_in_rule__Viewpoint__Group_10_2__03298 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10_2__1_in_rule__Viewpoint__Group_10_2__03301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Viewpoint__Group_10_2__0__Impl3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10_2__1__Impl_in_rule__Viewpoint__Group_10_2__13360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseDiagramResourceAssignment_10_2_1_in_rule__Viewpoint__Group_10_2__1__Impl3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11__0__Impl_in_rule__Viewpoint__Group_11__03421 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11__1_in_rule__Viewpoint__Group_11__03424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Viewpoint__Group_11__0__Impl3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11__1__Impl_in_rule__Viewpoint__Group_11__13483 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11__2_in_rule__Viewpoint__Group_11__13486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseWorkspaceResourceAssignment_11_1_in_rule__Viewpoint__Group_11__1__Impl3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11__2__Impl_in_rule__Viewpoint__Group_11__23543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11_2__0_in_rule__Viewpoint__Group_11__2__Impl3570 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11_2__0__Impl_in_rule__Viewpoint__Group_11_2__03607 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11_2__1_in_rule__Viewpoint__Group_11_2__03610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Viewpoint__Group_11_2__0__Impl3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11_2__1__Impl_in_rule__Viewpoint__Group_11_2__13669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1_in_rule__Viewpoint__Group_11_2__1__Impl3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12__0__Impl_in_rule__Viewpoint__Group_12__03730 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12__1_in_rule__Viewpoint__Group_12__03733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Viewpoint__Group_12__0__Impl3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12__1__Impl_in_rule__Viewpoint__Group_12__13792 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12__2_in_rule__Viewpoint__Group_12__13795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseFSResourceAssignment_12_1_in_rule__Viewpoint__Group_12__1__Impl3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12__2__Impl_in_rule__Viewpoint__Group_12__23852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12_2__0_in_rule__Viewpoint__Group_12__2__Impl3879 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12_2__0__Impl_in_rule__Viewpoint__Group_12_2__03916 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12_2__1_in_rule__Viewpoint__Group_12_2__03919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Viewpoint__Group_12_2__0__Impl3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12_2__1__Impl_in_rule__Viewpoint__Group_12_2__13978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseFSResourceAssignment_12_2_1_in_rule__Viewpoint__Group_12_2__1__Impl4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_13__0__Impl_in_rule__Viewpoint__Group_13__04039 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_13__1_in_rule__Viewpoint__Group_13__04042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Viewpoint__Group_13__0__Impl4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_13__1__Impl_in_rule__Viewpoint__Group_13__14101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_DataAssignment_13_1_in_rule__Viewpoint__Group_13__1__Impl4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_14__0__Impl_in_rule__Viewpoint__Group_14__04162 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_14__1_in_rule__Viewpoint__Group_14__04165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__TypeAssignment_14_0_in_rule__Viewpoint__Group_14__0__Impl4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_14__1__Impl_in_rule__Viewpoint__Group_14__14222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_AspectsAssignment_14_1_in_rule__Viewpoint__Group_14__1__Impl4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_15__0__Impl_in_rule__Viewpoint__Group_15__04283 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_15__1_in_rule__Viewpoint__Group_15__04286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__TypeAssignment_15_0_in_rule__Viewpoint__Group_15__0__Impl4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_15__1__Impl_in_rule__Viewpoint__Group_15__14343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_AspectsAssignment_15_1_in_rule__Viewpoint__Group_15__1__Impl4370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_16__0__Impl_in_rule__Viewpoint__Group_16__04404 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_16__1_in_rule__Viewpoint__Group_16__04407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__TypeAssignment_16_0_in_rule__Viewpoint__Group_16__0__Impl4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_16__1__Impl_in_rule__Viewpoint__Group_16__14464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_AspectsAssignment_16_1_in_rule__Viewpoint__Group_16__1__Impl4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_17__0__Impl_in_rule__Viewpoint__Group_17__04525 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_17__1_in_rule__Viewpoint__Group_17__04528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__TypeAssignment_17_0_in_rule__Viewpoint__Group_17__0__Impl4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_17__1__Impl_in_rule__Viewpoint__Group_17__14585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_AspectsAssignment_17_1_in_rule__Viewpoint__Group_17__1__Impl4612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_18__0__Impl_in_rule__Viewpoint__Group_18__04646 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_18__1_in_rule__Viewpoint__Group_18__04649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__TypeAssignment_18_0_in_rule__Viewpoint__Group_18__0__Impl4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_18__1__Impl_in_rule__Viewpoint__Group_18__14706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_AspectsAssignment_18_1_in_rule__Viewpoint__Group_18__1__Impl4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_19__0__Impl_in_rule__Viewpoint__Group_19__04767 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_19__1_in_rule__Viewpoint__Group_19__04770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__TypeAssignment_19_0_in_rule__Viewpoint__Group_19__0__Impl4797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_19__1__Impl_in_rule__Viewpoint__Group_19__14827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_AspectsAssignment_19_1_in_rule__Viewpoint__Group_19__1__Impl4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__04888 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl4918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4974 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__05009 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__05012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FQN__Group_1__0__Impl5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__15071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl5099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Viewpoint__ShortNameAssignment_25138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Viewpoint__NameAssignment_4_15169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__DescriptionAssignment_5_15200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__ParentsAssignment_6_15235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__ParentsAssignment_6_2_15274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__DependenciesAssignment_7_15313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__DependenciesAssignment_7_2_15352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__UseViewpointAssignment_8_15391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__UseViewpointAssignment_8_2_15430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__UseAnyEMFResourceAssignment_9_15465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_15496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__UseDiagramResourceAssignment_10_15527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__UseDiagramResourceAssignment_10_2_15558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__UseWorkspaceResourceAssignment_11_15589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_15620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__UseFSResourceAssignment_12_15651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__UseFSResourceAssignment_12_2_15682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_DataAssignment_13_15717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Viewpoint__TypeAssignment_14_05757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_14_15800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Viewpoint__TypeAssignment_15_05840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_15_15883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Viewpoint__TypeAssignment_16_05923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_16_15966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Viewpoint__TypeAssignment_17_06006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_17_16049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Viewpoint__TypeAssignment_18_06089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_18_16132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Viewpoint__TypeAssignment_19_06172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_19_16215 = new BitSet(new long[]{0x0000000000000002L});

}
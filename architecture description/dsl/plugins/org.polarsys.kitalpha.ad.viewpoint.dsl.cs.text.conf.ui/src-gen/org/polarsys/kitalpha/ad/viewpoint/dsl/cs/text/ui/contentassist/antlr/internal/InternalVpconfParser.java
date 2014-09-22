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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpconfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalVpconfParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'Configuration'", "'{'", "'}'", "'target'", "'project'", "'nsuri'", "'generation'", "'data'", "'('", "')'", "'Model:'", "'Edit:'", "'Editor:'", "'Test:'", "'Javadoc:'", "'OverwriteEcore:'", "'diagram'", "'OverwriteOdesign:'", "'documentation'", "'EcoreToHtml:'", "'.'"
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
    public static final int T__32=32;
    public static final int T__33=33;
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


        public InternalVpconfParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVpconfParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVpconfParser.tokenNames; }
    public String getGrammarFileName() { return "../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g"; }


     
     	private VpconfGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(VpconfGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:61:1: entryRuleConfiguration : ruleConfiguration EOF ;
    public final void entryRuleConfiguration() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:62:1: ( ruleConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:63:1: ruleConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleConfiguration_in_entryRuleConfiguration67);
            ruleConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfiguration74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:70:1: ruleConfiguration : ( ( rule__Configuration__Group__0 ) ) ;
    public final void ruleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:74:2: ( ( ( rule__Configuration__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:75:1: ( ( rule__Configuration__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:75:1: ( ( rule__Configuration__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:76:1: ( rule__Configuration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:77:1: ( rule__Configuration__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:77:2: rule__Configuration__Group__0
            {
            pushFollow(FOLLOW_rule__Configuration__Group__0_in_ruleConfiguration100);
            rule__Configuration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleConfigurationElement"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:89:1: entryRuleConfigurationElement : ruleConfigurationElement EOF ;
    public final void entryRuleConfigurationElement() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:90:1: ( ruleConfigurationElement EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:91:1: ruleConfigurationElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationElementRule()); 
            }
            pushFollow(FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement127);
            ruleConfigurationElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationElement134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConfigurationElement"


    // $ANTLR start "ruleConfigurationElement"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:98:1: ruleConfigurationElement : ( ( rule__ConfigurationElement__Alternatives ) ) ;
    public final void ruleConfigurationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:102:2: ( ( ( rule__ConfigurationElement__Alternatives ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:103:1: ( ( rule__ConfigurationElement__Alternatives ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:103:1: ( ( rule__ConfigurationElement__Alternatives ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:104:1: ( rule__ConfigurationElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationElementAccess().getAlternatives()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:105:1: ( rule__ConfigurationElement__Alternatives )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:105:2: rule__ConfigurationElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ConfigurationElement__Alternatives_in_ruleConfigurationElement160);
            rule__ConfigurationElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigurationElement"


    // $ANTLR start "entryRuleTargetApplication"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:117:1: entryRuleTargetApplication : ruleTargetApplication EOF ;
    public final void entryRuleTargetApplication() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:118:1: ( ruleTargetApplication EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:119:1: ruleTargetApplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationRule()); 
            }
            pushFollow(FOLLOW_ruleTargetApplication_in_entryRuleTargetApplication187);
            ruleTargetApplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetApplicationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetApplication194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTargetApplication"


    // $ANTLR start "ruleTargetApplication"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:126:1: ruleTargetApplication : ( ( rule__TargetApplication__Group__0 ) ) ;
    public final void ruleTargetApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:130:2: ( ( ( rule__TargetApplication__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:131:1: ( ( rule__TargetApplication__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:131:1: ( ( rule__TargetApplication__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:132:1: ( rule__TargetApplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:133:1: ( rule__TargetApplication__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:133:2: rule__TargetApplication__Group__0
            {
            pushFollow(FOLLOW_rule__TargetApplication__Group__0_in_ruleTargetApplication220);
            rule__TargetApplication__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetApplicationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTargetApplication"


    // $ANTLR start "entryRuleGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:145:1: entryRuleGenerationConfiguration : ruleGenerationConfiguration EOF ;
    public final void entryRuleGenerationConfiguration() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:146:1: ( ruleGenerationConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:147:1: ruleGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleGenerationConfiguration_in_entryRuleGenerationConfiguration247);
            ruleGenerationConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerationConfiguration254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGenerationConfiguration"


    // $ANTLR start "ruleGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:154:1: ruleGenerationConfiguration : ( ( rule__GenerationConfiguration__Group__0 ) ) ;
    public final void ruleGenerationConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:158:2: ( ( ( rule__GenerationConfiguration__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:159:1: ( ( rule__GenerationConfiguration__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:159:1: ( ( rule__GenerationConfiguration__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:160:1: ( rule__GenerationConfiguration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:161:1: ( rule__GenerationConfiguration__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:161:2: rule__GenerationConfiguration__Group__0
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__0_in_ruleGenerationConfiguration280);
            rule__GenerationConfiguration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenerationConfiguration"


    // $ANTLR start "entryRuleGeneration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:173:1: entryRuleGeneration : ruleGeneration EOF ;
    public final void entryRuleGeneration() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:174:1: ( ruleGeneration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:175:1: ruleGeneration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationRule()); 
            }
            pushFollow(FOLLOW_ruleGeneration_in_entryRuleGeneration307);
            ruleGeneration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneration314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGeneration"


    // $ANTLR start "ruleGeneration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:182:1: ruleGeneration : ( ( rule__Generation__Group__0 ) ) ;
    public final void ruleGeneration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:186:2: ( ( ( rule__Generation__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:187:1: ( ( rule__Generation__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:187:1: ( ( rule__Generation__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:188:1: ( rule__Generation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:189:1: ( rule__Generation__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:189:2: rule__Generation__Group__0
            {
            pushFollow(FOLLOW_rule__Generation__Group__0_in_ruleGeneration340);
            rule__Generation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneration"


    // $ANTLR start "entryRuleGData"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:201:1: entryRuleGData : ruleGData EOF ;
    public final void entryRuleGData() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:202:1: ( ruleGData EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:203:1: ruleGData EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataRule()); 
            }
            pushFollow(FOLLOW_ruleGData_in_entryRuleGData367);
            ruleGData();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGData374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGData"


    // $ANTLR start "ruleGData"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:210:1: ruleGData : ( ( rule__GData__Group__0 ) ) ;
    public final void ruleGData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:214:2: ( ( ( rule__GData__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:215:1: ( ( rule__GData__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:215:1: ( ( rule__GData__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:216:1: ( rule__GData__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:217:1: ( rule__GData__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:217:2: rule__GData__Group__0
            {
            pushFollow(FOLLOW_rule__GData__Group__0_in_ruleGData400);
            rule__GData__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGData"


    // $ANTLR start "entryRuleExtensionGeneratrionConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:229:1: entryRuleExtensionGeneratrionConfiguration : ruleExtensionGeneratrionConfiguration EOF ;
    public final void entryRuleExtensionGeneratrionConfiguration() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:230:1: ( ruleExtensionGeneratrionConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:231:1: ruleExtensionGeneratrionConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionGeneratrionConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleExtensionGeneratrionConfiguration_in_entryRuleExtensionGeneratrionConfiguration427);
            ruleExtensionGeneratrionConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionGeneratrionConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensionGeneratrionConfiguration434); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExtensionGeneratrionConfiguration"


    // $ANTLR start "ruleExtensionGeneratrionConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:238:1: ruleExtensionGeneratrionConfiguration : ( ( rule__ExtensionGeneratrionConfiguration__Alternatives ) ) ;
    public final void ruleExtensionGeneratrionConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:242:2: ( ( ( rule__ExtensionGeneratrionConfiguration__Alternatives ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:243:1: ( ( rule__ExtensionGeneratrionConfiguration__Alternatives ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:243:1: ( ( rule__ExtensionGeneratrionConfiguration__Alternatives ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:244:1: ( rule__ExtensionGeneratrionConfiguration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionGeneratrionConfigurationAccess().getAlternatives()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:245:1: ( rule__ExtensionGeneratrionConfiguration__Alternatives )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:245:2: rule__ExtensionGeneratrionConfiguration__Alternatives
            {
            pushFollow(FOLLOW_rule__ExtensionGeneratrionConfiguration__Alternatives_in_ruleExtensionGeneratrionConfiguration460);
            rule__ExtensionGeneratrionConfiguration__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionGeneratrionConfigurationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtensionGeneratrionConfiguration"


    // $ANTLR start "entryRuleDiagramGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:257:1: entryRuleDiagramGenerationConfiguration : ruleDiagramGenerationConfiguration EOF ;
    public final void entryRuleDiagramGenerationConfiguration() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:258:1: ( ruleDiagramGenerationConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:259:1: ruleDiagramGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleDiagramGenerationConfiguration_in_entryRuleDiagramGenerationConfiguration487);
            ruleDiagramGenerationConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramGenerationConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagramGenerationConfiguration494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDiagramGenerationConfiguration"


    // $ANTLR start "ruleDiagramGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:266:1: ruleDiagramGenerationConfiguration : ( ( rule__DiagramGenerationConfiguration__Group__0 ) ) ;
    public final void ruleDiagramGenerationConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:270:2: ( ( ( rule__DiagramGenerationConfiguration__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:271:1: ( ( rule__DiagramGenerationConfiguration__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:271:1: ( ( rule__DiagramGenerationConfiguration__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:272:1: ( rule__DiagramGenerationConfiguration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:273:1: ( rule__DiagramGenerationConfiguration__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:273:2: rule__DiagramGenerationConfiguration__Group__0
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__0_in_ruleDiagramGenerationConfiguration520);
            rule__DiagramGenerationConfiguration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramGenerationConfigurationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiagramGenerationConfiguration"


    // $ANTLR start "entryRuleDocumentationGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:285:1: entryRuleDocumentationGenerationConfiguration : ruleDocumentationGenerationConfiguration EOF ;
    public final void entryRuleDocumentationGenerationConfiguration() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:286:1: ( ruleDocumentationGenerationConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:287:1: ruleDocumentationGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleDocumentationGenerationConfiguration_in_entryRuleDocumentationGenerationConfiguration547);
            ruleDocumentationGenerationConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentationGenerationConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentationGenerationConfiguration554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDocumentationGenerationConfiguration"


    // $ANTLR start "ruleDocumentationGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:294:1: ruleDocumentationGenerationConfiguration : ( ( rule__DocumentationGenerationConfiguration__Group__0 ) ) ;
    public final void ruleDocumentationGenerationConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:298:2: ( ( ( rule__DocumentationGenerationConfiguration__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:299:1: ( ( rule__DocumentationGenerationConfiguration__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:299:1: ( ( rule__DocumentationGenerationConfiguration__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:300:1: ( rule__DocumentationGenerationConfiguration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:301:1: ( rule__DocumentationGenerationConfiguration__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:301:2: rule__DocumentationGenerationConfiguration__Group__0
            {
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group__0_in_ruleDocumentationGenerationConfiguration580);
            rule__DocumentationGenerationConfiguration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentationGenerationConfigurationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocumentationGenerationConfiguration"


    // $ANTLR start "entryRuleEString"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:313:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:314:1: ( ruleEString EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:315:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString607);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString614); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:322:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:326:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:327:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:327:1: ( ( rule__EString__Alternatives ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:328:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:329:1: ( rule__EString__Alternatives )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:329:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString640);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:341:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:342:1: ( ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:343:1: ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN667);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN674); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:350:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:354:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:355:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:355:1: ( ( rule__FQN__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:356:1: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:357:1: ( rule__FQN__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:357:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN700);
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


    // $ANTLR start "entryRuleEBoolean"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:369:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:370:1: ( ruleEBoolean EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:371:1: ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_entryRuleEBoolean727);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEBooleanRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBoolean734); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:378:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:382:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:383:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:383:1: ( ( rule__EBoolean__Alternatives ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:384:1: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:385:1: ( rule__EBoolean__Alternatives )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:385:2: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean760);
            rule__EBoolean__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "rule__ConfigurationElement__Alternatives"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:399:1: rule__ConfigurationElement__Alternatives : ( ( ruleTargetApplication ) | ( ruleGenerationConfiguration ) | ( ruleGeneration ) );
    public final void rule__ConfigurationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:403:1: ( ( ruleTargetApplication ) | ( ruleGenerationConfiguration ) | ( ruleGeneration ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 17:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:404:1: ( ruleTargetApplication )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:404:1: ( ruleTargetApplication )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:405:1: ruleTargetApplication
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationElementAccess().getTargetApplicationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleTargetApplication_in_rule__ConfigurationElement__Alternatives798);
                    ruleTargetApplication();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigurationElementAccess().getTargetApplicationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:410:6: ( ruleGenerationConfiguration )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:410:6: ( ruleGenerationConfiguration )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:411:1: ruleGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationElementAccess().getGenerationConfigurationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGenerationConfiguration_in_rule__ConfigurationElement__Alternatives815);
                    ruleGenerationConfiguration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigurationElementAccess().getGenerationConfigurationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:416:6: ( ruleGeneration )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:416:6: ( ruleGeneration )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:417:1: ruleGeneration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationElementAccess().getGenerationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleGeneration_in_rule__ConfigurationElement__Alternatives832);
                    ruleGeneration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigurationElementAccess().getGenerationParserRuleCall_2()); 
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
    // $ANTLR end "rule__ConfigurationElement__Alternatives"


    // $ANTLR start "rule__ExtensionGeneratrionConfiguration__Alternatives"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:427:1: rule__ExtensionGeneratrionConfiguration__Alternatives : ( ( ruleDiagramGenerationConfiguration ) | ( ruleDocumentationGenerationConfiguration ) );
    public final void rule__ExtensionGeneratrionConfiguration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:431:1: ( ( ruleDiagramGenerationConfiguration ) | ( ruleDocumentationGenerationConfiguration ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==29) ) {
                alt2=1;
            }
            else if ( (LA2_0==31) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:432:1: ( ruleDiagramGenerationConfiguration )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:432:1: ( ruleDiagramGenerationConfiguration )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:433:1: ruleDiagramGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtensionGeneratrionConfigurationAccess().getDiagramGenerationConfigurationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleDiagramGenerationConfiguration_in_rule__ExtensionGeneratrionConfiguration__Alternatives864);
                    ruleDiagramGenerationConfiguration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExtensionGeneratrionConfigurationAccess().getDiagramGenerationConfigurationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:438:6: ( ruleDocumentationGenerationConfiguration )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:438:6: ( ruleDocumentationGenerationConfiguration )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:439:1: ruleDocumentationGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtensionGeneratrionConfigurationAccess().getDocumentationGenerationConfigurationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleDocumentationGenerationConfiguration_in_rule__ExtensionGeneratrionConfiguration__Alternatives881);
                    ruleDocumentationGenerationConfiguration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExtensionGeneratrionConfigurationAccess().getDocumentationGenerationConfigurationParserRuleCall_1()); 
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
    // $ANTLR end "rule__ExtensionGeneratrionConfiguration__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:449:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:453:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:454:1: ( RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:454:1: ( RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:455:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives913); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:460:6: ( RULE_ID )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:460:6: ( RULE_ID )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:461:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives930); if (state.failed) return ;
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


    // $ANTLR start "rule__EBoolean__Alternatives"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:471:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:475:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:476:1: ( 'true' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:476:1: ( 'true' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:477:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__EBoolean__Alternatives963); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:484:6: ( 'false' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:484:6: ( 'false' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:485:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__EBoolean__Alternatives983); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__Configuration__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:499:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:503:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:504:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__01015);
            rule__Configuration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__01018);
            rule__Configuration__Group__1();

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
    // $ANTLR end "rule__Configuration__Group__0"


    // $ANTLR start "rule__Configuration__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:511:1: rule__Configuration__Group__0__Impl : ( () ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:515:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:516:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:516:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:517:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getConfigurationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:518:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:520:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getConfigurationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__0__Impl"


    // $ANTLR start "rule__Configuration__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:530:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:534:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:535:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__11076);
            rule__Configuration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__11079);
            rule__Configuration__Group__2();

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
    // $ANTLR end "rule__Configuration__Group__1"


    // $ANTLR start "rule__Configuration__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:542:1: rule__Configuration__Group__1__Impl : ( 'Configuration' ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:546:1: ( ( 'Configuration' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:547:1: ( 'Configuration' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:547:1: ( 'Configuration' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:548:1: 'Configuration'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getConfigurationKeyword_1()); 
            }
            match(input,13,FOLLOW_13_in_rule__Configuration__Group__1__Impl1107); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getConfigurationKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__1__Impl"


    // $ANTLR start "rule__Configuration__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:561:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl rule__Configuration__Group__3 ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:565:1: ( rule__Configuration__Group__2__Impl rule__Configuration__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:566:2: rule__Configuration__Group__2__Impl rule__Configuration__Group__3
            {
            pushFollow(FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__21138);
            rule__Configuration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__3_in_rule__Configuration__Group__21141);
            rule__Configuration__Group__3();

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
    // $ANTLR end "rule__Configuration__Group__2"


    // $ANTLR start "rule__Configuration__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:573:1: rule__Configuration__Group__2__Impl : ( ( rule__Configuration__NameAssignment_2 ) ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:577:1: ( ( ( rule__Configuration__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:578:1: ( ( rule__Configuration__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:578:1: ( ( rule__Configuration__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:579:1: ( rule__Configuration__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:580:1: ( rule__Configuration__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:580:2: rule__Configuration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Configuration__NameAssignment_2_in_rule__Configuration__Group__2__Impl1168);
            rule__Configuration__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__2__Impl"


    // $ANTLR start "rule__Configuration__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:590:1: rule__Configuration__Group__3 : rule__Configuration__Group__3__Impl rule__Configuration__Group__4 ;
    public final void rule__Configuration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:594:1: ( rule__Configuration__Group__3__Impl rule__Configuration__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:595:2: rule__Configuration__Group__3__Impl rule__Configuration__Group__4
            {
            pushFollow(FOLLOW_rule__Configuration__Group__3__Impl_in_rule__Configuration__Group__31198);
            rule__Configuration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__4_in_rule__Configuration__Group__31201);
            rule__Configuration__Group__4();

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
    // $ANTLR end "rule__Configuration__Group__3"


    // $ANTLR start "rule__Configuration__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:602:1: rule__Configuration__Group__3__Impl : ( '{' ) ;
    public final void rule__Configuration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:606:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:607:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:607:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:608:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,14,FOLLOW_14_in_rule__Configuration__Group__3__Impl1229); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__3__Impl"


    // $ANTLR start "rule__Configuration__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:621:1: rule__Configuration__Group__4 : rule__Configuration__Group__4__Impl rule__Configuration__Group__5 ;
    public final void rule__Configuration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:625:1: ( rule__Configuration__Group__4__Impl rule__Configuration__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:626:2: rule__Configuration__Group__4__Impl rule__Configuration__Group__5
            {
            pushFollow(FOLLOW_rule__Configuration__Group__4__Impl_in_rule__Configuration__Group__41260);
            rule__Configuration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__5_in_rule__Configuration__Group__41263);
            rule__Configuration__Group__5();

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
    // $ANTLR end "rule__Configuration__Group__4"


    // $ANTLR start "rule__Configuration__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:633:1: rule__Configuration__Group__4__Impl : ( ( rule__Configuration__VpConfigurationElementsAssignment_4 )* ) ;
    public final void rule__Configuration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:637:1: ( ( ( rule__Configuration__VpConfigurationElementsAssignment_4 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:638:1: ( ( rule__Configuration__VpConfigurationElementsAssignment_4 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:638:1: ( ( rule__Configuration__VpConfigurationElementsAssignment_4 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:639:1: ( rule__Configuration__VpConfigurationElementsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getVpConfigurationElementsAssignment_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:640:1: ( rule__Configuration__VpConfigurationElementsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=16 && LA5_0<=17)||LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:640:2: rule__Configuration__VpConfigurationElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Configuration__VpConfigurationElementsAssignment_4_in_rule__Configuration__Group__4__Impl1290);
            	    rule__Configuration__VpConfigurationElementsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getVpConfigurationElementsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__4__Impl"


    // $ANTLR start "rule__Configuration__Group__5"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:650:1: rule__Configuration__Group__5 : rule__Configuration__Group__5__Impl ;
    public final void rule__Configuration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:654:1: ( rule__Configuration__Group__5__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:655:2: rule__Configuration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Configuration__Group__5__Impl_in_rule__Configuration__Group__51321);
            rule__Configuration__Group__5__Impl();

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
    // $ANTLR end "rule__Configuration__Group__5"


    // $ANTLR start "rule__Configuration__Group__5__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:661:1: rule__Configuration__Group__5__Impl : ( '}' ) ;
    public final void rule__Configuration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:665:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:666:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:666:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:667:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,15,FOLLOW_15_in_rule__Configuration__Group__5__Impl1349); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__5__Impl"


    // $ANTLR start "rule__TargetApplication__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:692:1: rule__TargetApplication__Group__0 : rule__TargetApplication__Group__0__Impl rule__TargetApplication__Group__1 ;
    public final void rule__TargetApplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:696:1: ( rule__TargetApplication__Group__0__Impl rule__TargetApplication__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:697:2: rule__TargetApplication__Group__0__Impl rule__TargetApplication__Group__1
            {
            pushFollow(FOLLOW_rule__TargetApplication__Group__0__Impl_in_rule__TargetApplication__Group__01392);
            rule__TargetApplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TargetApplication__Group__1_in_rule__TargetApplication__Group__01395);
            rule__TargetApplication__Group__1();

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
    // $ANTLR end "rule__TargetApplication__Group__0"


    // $ANTLR start "rule__TargetApplication__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:704:1: rule__TargetApplication__Group__0__Impl : ( () ) ;
    public final void rule__TargetApplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:708:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:709:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:709:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:710:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationAccess().getTargetApplicationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:711:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:713:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetApplicationAccess().getTargetApplicationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetApplication__Group__0__Impl"


    // $ANTLR start "rule__TargetApplication__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:723:1: rule__TargetApplication__Group__1 : rule__TargetApplication__Group__1__Impl rule__TargetApplication__Group__2 ;
    public final void rule__TargetApplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:727:1: ( rule__TargetApplication__Group__1__Impl rule__TargetApplication__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:728:2: rule__TargetApplication__Group__1__Impl rule__TargetApplication__Group__2
            {
            pushFollow(FOLLOW_rule__TargetApplication__Group__1__Impl_in_rule__TargetApplication__Group__11453);
            rule__TargetApplication__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TargetApplication__Group__2_in_rule__TargetApplication__Group__11456);
            rule__TargetApplication__Group__2();

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
    // $ANTLR end "rule__TargetApplication__Group__1"


    // $ANTLR start "rule__TargetApplication__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:735:1: rule__TargetApplication__Group__1__Impl : ( 'target' ) ;
    public final void rule__TargetApplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:739:1: ( ( 'target' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:740:1: ( 'target' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:740:1: ( 'target' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:741:1: 'target'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationAccess().getTargetKeyword_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__TargetApplication__Group__1__Impl1484); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetApplicationAccess().getTargetKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetApplication__Group__1__Impl"


    // $ANTLR start "rule__TargetApplication__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:754:1: rule__TargetApplication__Group__2 : rule__TargetApplication__Group__2__Impl ;
    public final void rule__TargetApplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:758:1: ( rule__TargetApplication__Group__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:759:2: rule__TargetApplication__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TargetApplication__Group__2__Impl_in_rule__TargetApplication__Group__21515);
            rule__TargetApplication__Group__2__Impl();

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
    // $ANTLR end "rule__TargetApplication__Group__2"


    // $ANTLR start "rule__TargetApplication__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:765:1: rule__TargetApplication__Group__2__Impl : ( ( rule__TargetApplication__TypeAssignment_2 ) ) ;
    public final void rule__TargetApplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:769:1: ( ( ( rule__TargetApplication__TypeAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:770:1: ( ( rule__TargetApplication__TypeAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:770:1: ( ( rule__TargetApplication__TypeAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:771:1: ( rule__TargetApplication__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationAccess().getTypeAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:772:1: ( rule__TargetApplication__TypeAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:772:2: rule__TargetApplication__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__TargetApplication__TypeAssignment_2_in_rule__TargetApplication__Group__2__Impl1542);
            rule__TargetApplication__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetApplicationAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetApplication__Group__2__Impl"


    // $ANTLR start "rule__GenerationConfiguration__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:788:1: rule__GenerationConfiguration__Group__0 : rule__GenerationConfiguration__Group__0__Impl rule__GenerationConfiguration__Group__1 ;
    public final void rule__GenerationConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:792:1: ( rule__GenerationConfiguration__Group__0__Impl rule__GenerationConfiguration__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:793:2: rule__GenerationConfiguration__Group__0__Impl rule__GenerationConfiguration__Group__1
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__0__Impl_in_rule__GenerationConfiguration__Group__01578);
            rule__GenerationConfiguration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__1_in_rule__GenerationConfiguration__Group__01581);
            rule__GenerationConfiguration__Group__1();

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
    // $ANTLR end "rule__GenerationConfiguration__Group__0"


    // $ANTLR start "rule__GenerationConfiguration__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:800:1: rule__GenerationConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__GenerationConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:804:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:805:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:805:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:806:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getGenerationConfigurationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:807:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:809:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationAccess().getGenerationConfigurationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenerationConfiguration__Group__0__Impl"


    // $ANTLR start "rule__GenerationConfiguration__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:819:1: rule__GenerationConfiguration__Group__1 : rule__GenerationConfiguration__Group__1__Impl rule__GenerationConfiguration__Group__2 ;
    public final void rule__GenerationConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:823:1: ( rule__GenerationConfiguration__Group__1__Impl rule__GenerationConfiguration__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:824:2: rule__GenerationConfiguration__Group__1__Impl rule__GenerationConfiguration__Group__2
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__1__Impl_in_rule__GenerationConfiguration__Group__11639);
            rule__GenerationConfiguration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__2_in_rule__GenerationConfiguration__Group__11642);
            rule__GenerationConfiguration__Group__2();

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
    // $ANTLR end "rule__GenerationConfiguration__Group__1"


    // $ANTLR start "rule__GenerationConfiguration__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:831:1: rule__GenerationConfiguration__Group__1__Impl : ( 'project' ) ;
    public final void rule__GenerationConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:835:1: ( ( 'project' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:836:1: ( 'project' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:836:1: ( 'project' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:837:1: 'project'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getProjectKeyword_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__GenerationConfiguration__Group__1__Impl1670); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationAccess().getProjectKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenerationConfiguration__Group__1__Impl"


    // $ANTLR start "rule__GenerationConfiguration__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:850:1: rule__GenerationConfiguration__Group__2 : rule__GenerationConfiguration__Group__2__Impl rule__GenerationConfiguration__Group__3 ;
    public final void rule__GenerationConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:854:1: ( rule__GenerationConfiguration__Group__2__Impl rule__GenerationConfiguration__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:855:2: rule__GenerationConfiguration__Group__2__Impl rule__GenerationConfiguration__Group__3
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__2__Impl_in_rule__GenerationConfiguration__Group__21701);
            rule__GenerationConfiguration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__3_in_rule__GenerationConfiguration__Group__21704);
            rule__GenerationConfiguration__Group__3();

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
    // $ANTLR end "rule__GenerationConfiguration__Group__2"


    // $ANTLR start "rule__GenerationConfiguration__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:862:1: rule__GenerationConfiguration__Group__2__Impl : ( ( rule__GenerationConfiguration__ProjectNameAssignment_2 ) ) ;
    public final void rule__GenerationConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:866:1: ( ( ( rule__GenerationConfiguration__ProjectNameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:867:1: ( ( rule__GenerationConfiguration__ProjectNameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:867:1: ( ( rule__GenerationConfiguration__ProjectNameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:868:1: ( rule__GenerationConfiguration__ProjectNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getProjectNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:869:1: ( rule__GenerationConfiguration__ProjectNameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:869:2: rule__GenerationConfiguration__ProjectNameAssignment_2
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__ProjectNameAssignment_2_in_rule__GenerationConfiguration__Group__2__Impl1731);
            rule__GenerationConfiguration__ProjectNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationAccess().getProjectNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenerationConfiguration__Group__2__Impl"


    // $ANTLR start "rule__GenerationConfiguration__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:879:1: rule__GenerationConfiguration__Group__3 : rule__GenerationConfiguration__Group__3__Impl ;
    public final void rule__GenerationConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:883:1: ( rule__GenerationConfiguration__Group__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:884:2: rule__GenerationConfiguration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__3__Impl_in_rule__GenerationConfiguration__Group__31761);
            rule__GenerationConfiguration__Group__3__Impl();

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
    // $ANTLR end "rule__GenerationConfiguration__Group__3"


    // $ANTLR start "rule__GenerationConfiguration__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:890:1: rule__GenerationConfiguration__Group__3__Impl : ( ( rule__GenerationConfiguration__Group_3__0 )? ) ;
    public final void rule__GenerationConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:894:1: ( ( ( rule__GenerationConfiguration__Group_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:895:1: ( ( rule__GenerationConfiguration__Group_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:895:1: ( ( rule__GenerationConfiguration__Group_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:896:1: ( rule__GenerationConfiguration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:897:1: ( rule__GenerationConfiguration__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:897:2: rule__GenerationConfiguration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__GenerationConfiguration__Group_3__0_in_rule__GenerationConfiguration__Group__3__Impl1788);
                    rule__GenerationConfiguration__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenerationConfiguration__Group__3__Impl"


    // $ANTLR start "rule__GenerationConfiguration__Group_3__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:915:1: rule__GenerationConfiguration__Group_3__0 : rule__GenerationConfiguration__Group_3__0__Impl rule__GenerationConfiguration__Group_3__1 ;
    public final void rule__GenerationConfiguration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:919:1: ( rule__GenerationConfiguration__Group_3__0__Impl rule__GenerationConfiguration__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:920:2: rule__GenerationConfiguration__Group_3__0__Impl rule__GenerationConfiguration__Group_3__1
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group_3__0__Impl_in_rule__GenerationConfiguration__Group_3__01827);
            rule__GenerationConfiguration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group_3__1_in_rule__GenerationConfiguration__Group_3__01830);
            rule__GenerationConfiguration__Group_3__1();

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
    // $ANTLR end "rule__GenerationConfiguration__Group_3__0"


    // $ANTLR start "rule__GenerationConfiguration__Group_3__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:927:1: rule__GenerationConfiguration__Group_3__0__Impl : ( 'nsuri' ) ;
    public final void rule__GenerationConfiguration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:931:1: ( ( 'nsuri' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:932:1: ( 'nsuri' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:932:1: ( 'nsuri' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:933:1: 'nsuri'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getNsuriKeyword_3_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__GenerationConfiguration__Group_3__0__Impl1858); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationAccess().getNsuriKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenerationConfiguration__Group_3__0__Impl"


    // $ANTLR start "rule__GenerationConfiguration__Group_3__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:946:1: rule__GenerationConfiguration__Group_3__1 : rule__GenerationConfiguration__Group_3__1__Impl ;
    public final void rule__GenerationConfiguration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:950:1: ( rule__GenerationConfiguration__Group_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:951:2: rule__GenerationConfiguration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group_3__1__Impl_in_rule__GenerationConfiguration__Group_3__11889);
            rule__GenerationConfiguration__Group_3__1__Impl();

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
    // $ANTLR end "rule__GenerationConfiguration__Group_3__1"


    // $ANTLR start "rule__GenerationConfiguration__Group_3__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:957:1: rule__GenerationConfiguration__Group_3__1__Impl : ( ( rule__GenerationConfiguration__NsuriAssignment_3_1 ) ) ;
    public final void rule__GenerationConfiguration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:961:1: ( ( ( rule__GenerationConfiguration__NsuriAssignment_3_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:962:1: ( ( rule__GenerationConfiguration__NsuriAssignment_3_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:962:1: ( ( rule__GenerationConfiguration__NsuriAssignment_3_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:963:1: ( rule__GenerationConfiguration__NsuriAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getNsuriAssignment_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:964:1: ( rule__GenerationConfiguration__NsuriAssignment_3_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:964:2: rule__GenerationConfiguration__NsuriAssignment_3_1
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__NsuriAssignment_3_1_in_rule__GenerationConfiguration__Group_3__1__Impl1916);
            rule__GenerationConfiguration__NsuriAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationAccess().getNsuriAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenerationConfiguration__Group_3__1__Impl"


    // $ANTLR start "rule__Generation__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:978:1: rule__Generation__Group__0 : rule__Generation__Group__0__Impl rule__Generation__Group__1 ;
    public final void rule__Generation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:982:1: ( rule__Generation__Group__0__Impl rule__Generation__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:983:2: rule__Generation__Group__0__Impl rule__Generation__Group__1
            {
            pushFollow(FOLLOW_rule__Generation__Group__0__Impl_in_rule__Generation__Group__01950);
            rule__Generation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generation__Group__1_in_rule__Generation__Group__01953);
            rule__Generation__Group__1();

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
    // $ANTLR end "rule__Generation__Group__0"


    // $ANTLR start "rule__Generation__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:990:1: rule__Generation__Group__0__Impl : ( () ) ;
    public final void rule__Generation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:994:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:995:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:995:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:996:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getGenerationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:997:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:999:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationAccess().getGenerationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generation__Group__0__Impl"


    // $ANTLR start "rule__Generation__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1009:1: rule__Generation__Group__1 : rule__Generation__Group__1__Impl rule__Generation__Group__2 ;
    public final void rule__Generation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1013:1: ( rule__Generation__Group__1__Impl rule__Generation__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1014:2: rule__Generation__Group__1__Impl rule__Generation__Group__2
            {
            pushFollow(FOLLOW_rule__Generation__Group__1__Impl_in_rule__Generation__Group__12011);
            rule__Generation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generation__Group__2_in_rule__Generation__Group__12014);
            rule__Generation__Group__2();

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
    // $ANTLR end "rule__Generation__Group__1"


    // $ANTLR start "rule__Generation__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1021:1: rule__Generation__Group__1__Impl : ( 'generation' ) ;
    public final void rule__Generation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1025:1: ( ( 'generation' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1026:1: ( 'generation' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1026:1: ( 'generation' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1027:1: 'generation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getGenerationKeyword_1()); 
            }
            match(input,19,FOLLOW_19_in_rule__Generation__Group__1__Impl2042); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationAccess().getGenerationKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generation__Group__1__Impl"


    // $ANTLR start "rule__Generation__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1040:1: rule__Generation__Group__2 : rule__Generation__Group__2__Impl rule__Generation__Group__3 ;
    public final void rule__Generation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1044:1: ( rule__Generation__Group__2__Impl rule__Generation__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1045:2: rule__Generation__Group__2__Impl rule__Generation__Group__3
            {
            pushFollow(FOLLOW_rule__Generation__Group__2__Impl_in_rule__Generation__Group__22073);
            rule__Generation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generation__Group__3_in_rule__Generation__Group__22076);
            rule__Generation__Group__3();

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
    // $ANTLR end "rule__Generation__Group__2"


    // $ANTLR start "rule__Generation__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1052:1: rule__Generation__Group__2__Impl : ( '{' ) ;
    public final void rule__Generation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1056:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1057:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1057:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1058:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_14_in_rule__Generation__Group__2__Impl2104); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generation__Group__2__Impl"


    // $ANTLR start "rule__Generation__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1071:1: rule__Generation__Group__3 : rule__Generation__Group__3__Impl rule__Generation__Group__4 ;
    public final void rule__Generation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1075:1: ( rule__Generation__Group__3__Impl rule__Generation__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1076:2: rule__Generation__Group__3__Impl rule__Generation__Group__4
            {
            pushFollow(FOLLOW_rule__Generation__Group__3__Impl_in_rule__Generation__Group__32135);
            rule__Generation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generation__Group__4_in_rule__Generation__Group__32138);
            rule__Generation__Group__4();

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
    // $ANTLR end "rule__Generation__Group__3"


    // $ANTLR start "rule__Generation__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1083:1: rule__Generation__Group__3__Impl : ( ( rule__Generation__OwnedDataGenerationConfAssignment_3 )? ) ;
    public final void rule__Generation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1087:1: ( ( ( rule__Generation__OwnedDataGenerationConfAssignment_3 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1088:1: ( ( rule__Generation__OwnedDataGenerationConfAssignment_3 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1088:1: ( ( rule__Generation__OwnedDataGenerationConfAssignment_3 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1089:1: ( rule__Generation__OwnedDataGenerationConfAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getOwnedDataGenerationConfAssignment_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1090:1: ( rule__Generation__OwnedDataGenerationConfAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1090:2: rule__Generation__OwnedDataGenerationConfAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Generation__OwnedDataGenerationConfAssignment_3_in_rule__Generation__Group__3__Impl2165);
                    rule__Generation__OwnedDataGenerationConfAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationAccess().getOwnedDataGenerationConfAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generation__Group__3__Impl"


    // $ANTLR start "rule__Generation__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1100:1: rule__Generation__Group__4 : rule__Generation__Group__4__Impl rule__Generation__Group__5 ;
    public final void rule__Generation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1104:1: ( rule__Generation__Group__4__Impl rule__Generation__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1105:2: rule__Generation__Group__4__Impl rule__Generation__Group__5
            {
            pushFollow(FOLLOW_rule__Generation__Group__4__Impl_in_rule__Generation__Group__42196);
            rule__Generation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generation__Group__5_in_rule__Generation__Group__42199);
            rule__Generation__Group__5();

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
    // $ANTLR end "rule__Generation__Group__4"


    // $ANTLR start "rule__Generation__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1112:1: rule__Generation__Group__4__Impl : ( ( rule__Generation__OwnedExtensionGenConfAssignment_4 )* ) ;
    public final void rule__Generation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1116:1: ( ( ( rule__Generation__OwnedExtensionGenConfAssignment_4 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1117:1: ( ( rule__Generation__OwnedExtensionGenConfAssignment_4 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1117:1: ( ( rule__Generation__OwnedExtensionGenConfAssignment_4 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1118:1: ( rule__Generation__OwnedExtensionGenConfAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getOwnedExtensionGenConfAssignment_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1119:1: ( rule__Generation__OwnedExtensionGenConfAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==29||LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1119:2: rule__Generation__OwnedExtensionGenConfAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Generation__OwnedExtensionGenConfAssignment_4_in_rule__Generation__Group__4__Impl2226);
            	    rule__Generation__OwnedExtensionGenConfAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationAccess().getOwnedExtensionGenConfAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generation__Group__4__Impl"


    // $ANTLR start "rule__Generation__Group__5"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1129:1: rule__Generation__Group__5 : rule__Generation__Group__5__Impl ;
    public final void rule__Generation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1133:1: ( rule__Generation__Group__5__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1134:2: rule__Generation__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Generation__Group__5__Impl_in_rule__Generation__Group__52257);
            rule__Generation__Group__5__Impl();

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
    // $ANTLR end "rule__Generation__Group__5"


    // $ANTLR start "rule__Generation__Group__5__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1140:1: rule__Generation__Group__5__Impl : ( '}' ) ;
    public final void rule__Generation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1144:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1145:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1145:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1146:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,15,FOLLOW_15_in_rule__Generation__Group__5__Impl2285); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generation__Group__5__Impl"


    // $ANTLR start "rule__GData__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1171:1: rule__GData__Group__0 : rule__GData__Group__0__Impl rule__GData__Group__1 ;
    public final void rule__GData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1175:1: ( rule__GData__Group__0__Impl rule__GData__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1176:2: rule__GData__Group__0__Impl rule__GData__Group__1
            {
            pushFollow(FOLLOW_rule__GData__Group__0__Impl_in_rule__GData__Group__02328);
            rule__GData__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group__1_in_rule__GData__Group__02331);
            rule__GData__Group__1();

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
    // $ANTLR end "rule__GData__Group__0"


    // $ANTLR start "rule__GData__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1183:1: rule__GData__Group__0__Impl : ( () ) ;
    public final void rule__GData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1187:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1188:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1188:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1189:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGDataAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1190:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1192:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getGDataAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group__0__Impl"


    // $ANTLR start "rule__GData__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1202:1: rule__GData__Group__1 : rule__GData__Group__1__Impl rule__GData__Group__2 ;
    public final void rule__GData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1206:1: ( rule__GData__Group__1__Impl rule__GData__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1207:2: rule__GData__Group__1__Impl rule__GData__Group__2
            {
            pushFollow(FOLLOW_rule__GData__Group__1__Impl_in_rule__GData__Group__12389);
            rule__GData__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group__2_in_rule__GData__Group__12392);
            rule__GData__Group__2();

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
    // $ANTLR end "rule__GData__Group__1"


    // $ANTLR start "rule__GData__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1214:1: rule__GData__Group__1__Impl : ( 'data' ) ;
    public final void rule__GData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1218:1: ( ( 'data' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1219:1: ( 'data' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1219:1: ( 'data' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1220:1: 'data'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getDataKeyword_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__GData__Group__1__Impl2420); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getDataKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group__1__Impl"


    // $ANTLR start "rule__GData__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1233:1: rule__GData__Group__2 : rule__GData__Group__2__Impl rule__GData__Group__3 ;
    public final void rule__GData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1237:1: ( rule__GData__Group__2__Impl rule__GData__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1238:2: rule__GData__Group__2__Impl rule__GData__Group__3
            {
            pushFollow(FOLLOW_rule__GData__Group__2__Impl_in_rule__GData__Group__22451);
            rule__GData__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group__3_in_rule__GData__Group__22454);
            rule__GData__Group__3();

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
    // $ANTLR end "rule__GData__Group__2"


    // $ANTLR start "rule__GData__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1245:1: rule__GData__Group__2__Impl : ( '(' ) ;
    public final void rule__GData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1249:1: ( ( '(' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1250:1: ( '(' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1250:1: ( '(' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1251:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__GData__Group__2__Impl2482); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group__2__Impl"


    // $ANTLR start "rule__GData__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1264:1: rule__GData__Group__3 : rule__GData__Group__3__Impl rule__GData__Group__4 ;
    public final void rule__GData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1268:1: ( rule__GData__Group__3__Impl rule__GData__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1269:2: rule__GData__Group__3__Impl rule__GData__Group__4
            {
            pushFollow(FOLLOW_rule__GData__Group__3__Impl_in_rule__GData__Group__32513);
            rule__GData__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group__4_in_rule__GData__Group__32516);
            rule__GData__Group__4();

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
    // $ANTLR end "rule__GData__Group__3"


    // $ANTLR start "rule__GData__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1276:1: rule__GData__Group__3__Impl : ( ( rule__GData__Group_3__0 ) ) ;
    public final void rule__GData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1280:1: ( ( ( rule__GData__Group_3__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1281:1: ( ( rule__GData__Group_3__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1281:1: ( ( rule__GData__Group_3__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1282:1: ( rule__GData__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1283:1: ( rule__GData__Group_3__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1283:2: rule__GData__Group_3__0
            {
            pushFollow(FOLLOW_rule__GData__Group_3__0_in_rule__GData__Group__3__Impl2543);
            rule__GData__Group_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group__3__Impl"


    // $ANTLR start "rule__GData__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1293:1: rule__GData__Group__4 : rule__GData__Group__4__Impl ;
    public final void rule__GData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1297:1: ( rule__GData__Group__4__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1298:2: rule__GData__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group__4__Impl_in_rule__GData__Group__42573);
            rule__GData__Group__4__Impl();

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
    // $ANTLR end "rule__GData__Group__4"


    // $ANTLR start "rule__GData__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1304:1: rule__GData__Group__4__Impl : ( ')' ) ;
    public final void rule__GData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1308:1: ( ( ')' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1309:1: ( ')' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1309:1: ( ')' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1310:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,22,FOLLOW_22_in_rule__GData__Group__4__Impl2601); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group__4__Impl"


    // $ANTLR start "rule__GData__Group_3__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1333:1: rule__GData__Group_3__0 : rule__GData__Group_3__0__Impl rule__GData__Group_3__1 ;
    public final void rule__GData__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1337:1: ( rule__GData__Group_3__0__Impl rule__GData__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1338:2: rule__GData__Group_3__0__Impl rule__GData__Group_3__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3__0__Impl_in_rule__GData__Group_3__02642);
            rule__GData__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3__1_in_rule__GData__Group_3__02645);
            rule__GData__Group_3__1();

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
    // $ANTLR end "rule__GData__Group_3__0"


    // $ANTLR start "rule__GData__Group_3__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1345:1: rule__GData__Group_3__0__Impl : ( ( rule__GData__Group_3_0__0 )? ) ;
    public final void rule__GData__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1349:1: ( ( ( rule__GData__Group_3_0__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1350:1: ( ( rule__GData__Group_3_0__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1350:1: ( ( rule__GData__Group_3_0__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1351:1: ( rule__GData__Group_3_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1352:1: ( rule__GData__Group_3_0__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1352:2: rule__GData__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_0__0_in_rule__GData__Group_3__0__Impl2672);
                    rule__GData__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getGroup_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group_3__0__Impl"


    // $ANTLR start "rule__GData__Group_3__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1362:1: rule__GData__Group_3__1 : rule__GData__Group_3__1__Impl rule__GData__Group_3__2 ;
    public final void rule__GData__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1366:1: ( rule__GData__Group_3__1__Impl rule__GData__Group_3__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1367:2: rule__GData__Group_3__1__Impl rule__GData__Group_3__2
            {
            pushFollow(FOLLOW_rule__GData__Group_3__1__Impl_in_rule__GData__Group_3__12703);
            rule__GData__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3__2_in_rule__GData__Group_3__12706);
            rule__GData__Group_3__2();

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
    // $ANTLR end "rule__GData__Group_3__1"


    // $ANTLR start "rule__GData__Group_3__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1374:1: rule__GData__Group_3__1__Impl : ( ( rule__GData__Group_3_1__0 )? ) ;
    public final void rule__GData__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1378:1: ( ( ( rule__GData__Group_3_1__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1379:1: ( ( rule__GData__Group_3_1__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1379:1: ( ( rule__GData__Group_3_1__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1380:1: ( rule__GData__Group_3_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1381:1: ( rule__GData__Group_3_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1381:2: rule__GData__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_1__0_in_rule__GData__Group_3__1__Impl2733);
                    rule__GData__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group_3__1__Impl"


    // $ANTLR start "rule__GData__Group_3__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1391:1: rule__GData__Group_3__2 : rule__GData__Group_3__2__Impl rule__GData__Group_3__3 ;
    public final void rule__GData__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1395:1: ( rule__GData__Group_3__2__Impl rule__GData__Group_3__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1396:2: rule__GData__Group_3__2__Impl rule__GData__Group_3__3
            {
            pushFollow(FOLLOW_rule__GData__Group_3__2__Impl_in_rule__GData__Group_3__22764);
            rule__GData__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3__3_in_rule__GData__Group_3__22767);
            rule__GData__Group_3__3();

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
    // $ANTLR end "rule__GData__Group_3__2"


    // $ANTLR start "rule__GData__Group_3__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1403:1: rule__GData__Group_3__2__Impl : ( ( rule__GData__Group_3_2__0 )? ) ;
    public final void rule__GData__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1407:1: ( ( ( rule__GData__Group_3_2__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1408:1: ( ( rule__GData__Group_3_2__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1408:1: ( ( rule__GData__Group_3_2__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1409:1: ( rule__GData__Group_3_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1410:1: ( rule__GData__Group_3_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1410:2: rule__GData__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_2__0_in_rule__GData__Group_3__2__Impl2794);
                    rule__GData__Group_3_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getGroup_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group_3__2__Impl"


    // $ANTLR start "rule__GData__Group_3__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1420:1: rule__GData__Group_3__3 : rule__GData__Group_3__3__Impl rule__GData__Group_3__4 ;
    public final void rule__GData__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1424:1: ( rule__GData__Group_3__3__Impl rule__GData__Group_3__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1425:2: rule__GData__Group_3__3__Impl rule__GData__Group_3__4
            {
            pushFollow(FOLLOW_rule__GData__Group_3__3__Impl_in_rule__GData__Group_3__32825);
            rule__GData__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3__4_in_rule__GData__Group_3__32828);
            rule__GData__Group_3__4();

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
    // $ANTLR end "rule__GData__Group_3__3"


    // $ANTLR start "rule__GData__Group_3__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1432:1: rule__GData__Group_3__3__Impl : ( ( rule__GData__Group_3_3__0 )? ) ;
    public final void rule__GData__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1436:1: ( ( ( rule__GData__Group_3_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1437:1: ( ( rule__GData__Group_3_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1437:1: ( ( rule__GData__Group_3_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1438:1: ( rule__GData__Group_3_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1439:1: ( rule__GData__Group_3_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1439:2: rule__GData__Group_3_3__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_3__0_in_rule__GData__Group_3__3__Impl2855);
                    rule__GData__Group_3_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getGroup_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group_3__3__Impl"


    // $ANTLR start "rule__GData__Group_3__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1449:1: rule__GData__Group_3__4 : rule__GData__Group_3__4__Impl rule__GData__Group_3__5 ;
    public final void rule__GData__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1453:1: ( rule__GData__Group_3__4__Impl rule__GData__Group_3__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1454:2: rule__GData__Group_3__4__Impl rule__GData__Group_3__5
            {
            pushFollow(FOLLOW_rule__GData__Group_3__4__Impl_in_rule__GData__Group_3__42886);
            rule__GData__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3__5_in_rule__GData__Group_3__42889);
            rule__GData__Group_3__5();

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
    // $ANTLR end "rule__GData__Group_3__4"


    // $ANTLR start "rule__GData__Group_3__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1461:1: rule__GData__Group_3__4__Impl : ( ( rule__GData__Group_3_4__0 )? ) ;
    public final void rule__GData__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1465:1: ( ( ( rule__GData__Group_3_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1466:1: ( ( rule__GData__Group_3_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1466:1: ( ( rule__GData__Group_3_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1467:1: ( rule__GData__Group_3_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1468:1: ( rule__GData__Group_3_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1468:2: rule__GData__Group_3_4__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_4__0_in_rule__GData__Group_3__4__Impl2916);
                    rule__GData__Group_3_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getGroup_3_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group_3__4__Impl"


    // $ANTLR start "rule__GData__Group_3__5"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1478:1: rule__GData__Group_3__5 : rule__GData__Group_3__5__Impl ;
    public final void rule__GData__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1482:1: ( rule__GData__Group_3__5__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1483:2: rule__GData__Group_3__5__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3__5__Impl_in_rule__GData__Group_3__52947);
            rule__GData__Group_3__5__Impl();

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
    // $ANTLR end "rule__GData__Group_3__5"


    // $ANTLR start "rule__GData__Group_3__5__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1489:1: rule__GData__Group_3__5__Impl : ( ( rule__GData__Group_3_5__0 )? ) ;
    public final void rule__GData__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1493:1: ( ( ( rule__GData__Group_3_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1494:1: ( ( rule__GData__Group_3_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1494:1: ( ( rule__GData__Group_3_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1495:1: ( rule__GData__Group_3_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1496:1: ( rule__GData__Group_3_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1496:2: rule__GData__Group_3_5__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_5__0_in_rule__GData__Group_3__5__Impl2974);
                    rule__GData__Group_3_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getGroup_3_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group_3__5__Impl"


    // $ANTLR start "rule__GData__Group_3_0__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1518:1: rule__GData__Group_3_0__0 : rule__GData__Group_3_0__0__Impl rule__GData__Group_3_0__1 ;
    public final void rule__GData__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1522:1: ( rule__GData__Group_3_0__0__Impl rule__GData__Group_3_0__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1523:2: rule__GData__Group_3_0__0__Impl rule__GData__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_0__0__Impl_in_rule__GData__Group_3_0__03017);
            rule__GData__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_0__1_in_rule__GData__Group_3_0__03020);
            rule__GData__Group_3_0__1();

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
    // $ANTLR end "rule__GData__Group_3_0__0"


    // $ANTLR start "rule__GData__Group_3_0__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1530:1: rule__GData__Group_3_0__0__Impl : ( 'Model:' ) ;
    public final void rule__GData__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1534:1: ( ( 'Model:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1535:1: ( 'Model:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1535:1: ( 'Model:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1536:1: 'Model:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getModelKeyword_3_0_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__GData__Group_3_0__0__Impl3048); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getModelKeyword_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group_3_0__0__Impl"


    // $ANTLR start "rule__GData__Group_3_0__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1549:1: rule__GData__Group_3_0__1 : rule__GData__Group_3_0__1__Impl ;
    public final void rule__GData__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1553:1: ( rule__GData__Group_3_0__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1554:2: rule__GData__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_0__1__Impl_in_rule__GData__Group_3_0__13079);
            rule__GData__Group_3_0__1__Impl();

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
    // $ANTLR end "rule__GData__Group_3_0__1"


    // $ANTLR start "rule__GData__Group_3_0__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1560:1: rule__GData__Group_3_0__1__Impl : ( ( rule__GData__ModelAssignment_3_0_1 ) ) ;
    public final void rule__GData__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1564:1: ( ( ( rule__GData__ModelAssignment_3_0_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1565:1: ( ( rule__GData__ModelAssignment_3_0_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1565:1: ( ( rule__GData__ModelAssignment_3_0_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1566:1: ( rule__GData__ModelAssignment_3_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getModelAssignment_3_0_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1567:1: ( rule__GData__ModelAssignment_3_0_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1567:2: rule__GData__ModelAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__GData__ModelAssignment_3_0_1_in_rule__GData__Group_3_0__1__Impl3106);
            rule__GData__ModelAssignment_3_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getModelAssignment_3_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group_3_0__1__Impl"


    // $ANTLR start "rule__GData__Group_3_1__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1581:1: rule__GData__Group_3_1__0 : rule__GData__Group_3_1__0__Impl rule__GData__Group_3_1__1 ;
    public final void rule__GData__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1585:1: ( rule__GData__Group_3_1__0__Impl rule__GData__Group_3_1__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1586:2: rule__GData__Group_3_1__0__Impl rule__GData__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_1__0__Impl_in_rule__GData__Group_3_1__03140);
            rule__GData__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_1__1_in_rule__GData__Group_3_1__03143);
            rule__GData__Group_3_1__1();

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
    // $ANTLR end "rule__GData__Group_3_1__0"


    // $ANTLR start "rule__GData__Group_3_1__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1593:1: rule__GData__Group_3_1__0__Impl : ( 'Edit:' ) ;
    public final void rule__GData__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1597:1: ( ( 'Edit:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1598:1: ( 'Edit:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1598:1: ( 'Edit:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1599:1: 'Edit:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditKeyword_3_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__GData__Group_3_1__0__Impl3171); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getEditKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group_3_1__0__Impl"


    // $ANTLR start "rule__GData__Group_3_1__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1612:1: rule__GData__Group_3_1__1 : rule__GData__Group_3_1__1__Impl ;
    public final void rule__GData__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1616:1: ( rule__GData__Group_3_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1617:2: rule__GData__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_1__1__Impl_in_rule__GData__Group_3_1__13202);
            rule__GData__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__GData__Group_3_1__1"


    // $ANTLR start "rule__GData__Group_3_1__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1623:1: rule__GData__Group_3_1__1__Impl : ( ( rule__GData__EditAssignment_3_1_1 ) ) ;
    public final void rule__GData__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1627:1: ( ( ( rule__GData__EditAssignment_3_1_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1628:1: ( ( rule__GData__EditAssignment_3_1_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1628:1: ( ( rule__GData__EditAssignment_3_1_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1629:1: ( rule__GData__EditAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditAssignment_3_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1630:1: ( rule__GData__EditAssignment_3_1_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1630:2: rule__GData__EditAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__GData__EditAssignment_3_1_1_in_rule__GData__Group_3_1__1__Impl3229);
            rule__GData__EditAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getEditAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group_3_1__1__Impl"


    // $ANTLR start "rule__GData__Group_3_2__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1644:1: rule__GData__Group_3_2__0 : rule__GData__Group_3_2__0__Impl rule__GData__Group_3_2__1 ;
    public final void rule__GData__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1648:1: ( rule__GData__Group_3_2__0__Impl rule__GData__Group_3_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1649:2: rule__GData__Group_3_2__0__Impl rule__GData__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_2__0__Impl_in_rule__GData__Group_3_2__03263);
            rule__GData__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_2__1_in_rule__GData__Group_3_2__03266);
            rule__GData__Group_3_2__1();

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
    // $ANTLR end "rule__GData__Group_3_2__0"


    // $ANTLR start "rule__GData__Group_3_2__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1656:1: rule__GData__Group_3_2__0__Impl : ( 'Editor:' ) ;
    public final void rule__GData__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1660:1: ( ( 'Editor:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1661:1: ( 'Editor:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1661:1: ( 'Editor:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1662:1: 'Editor:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditorKeyword_3_2_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__GData__Group_3_2__0__Impl3294); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getEditorKeyword_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group_3_2__0__Impl"


    // $ANTLR start "rule__GData__Group_3_2__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1675:1: rule__GData__Group_3_2__1 : rule__GData__Group_3_2__1__Impl ;
    public final void rule__GData__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1679:1: ( rule__GData__Group_3_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1680:2: rule__GData__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_2__1__Impl_in_rule__GData__Group_3_2__13325);
            rule__GData__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__GData__Group_3_2__1"


    // $ANTLR start "rule__GData__Group_3_2__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1686:1: rule__GData__Group_3_2__1__Impl : ( ( rule__GData__EditorAssignment_3_2_1 ) ) ;
    public final void rule__GData__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1690:1: ( ( ( rule__GData__EditorAssignment_3_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1691:1: ( ( rule__GData__EditorAssignment_3_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1691:1: ( ( rule__GData__EditorAssignment_3_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1692:1: ( rule__GData__EditorAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditorAssignment_3_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1693:1: ( rule__GData__EditorAssignment_3_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1693:2: rule__GData__EditorAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__GData__EditorAssignment_3_2_1_in_rule__GData__Group_3_2__1__Impl3352);
            rule__GData__EditorAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getEditorAssignment_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group_3_2__1__Impl"


    // $ANTLR start "rule__GData__Group_3_3__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1707:1: rule__GData__Group_3_3__0 : rule__GData__Group_3_3__0__Impl rule__GData__Group_3_3__1 ;
    public final void rule__GData__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1711:1: ( rule__GData__Group_3_3__0__Impl rule__GData__Group_3_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1712:2: rule__GData__Group_3_3__0__Impl rule__GData__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_3__0__Impl_in_rule__GData__Group_3_3__03386);
            rule__GData__Group_3_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_3__1_in_rule__GData__Group_3_3__03389);
            rule__GData__Group_3_3__1();

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
    // $ANTLR end "rule__GData__Group_3_3__0"


    // $ANTLR start "rule__GData__Group_3_3__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1719:1: rule__GData__Group_3_3__0__Impl : ( 'Test:' ) ;
    public final void rule__GData__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1723:1: ( ( 'Test:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1724:1: ( 'Test:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1724:1: ( 'Test:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1725:1: 'Test:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getTestKeyword_3_3_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__GData__Group_3_3__0__Impl3417); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getTestKeyword_3_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group_3_3__0__Impl"


    // $ANTLR start "rule__GData__Group_3_3__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1738:1: rule__GData__Group_3_3__1 : rule__GData__Group_3_3__1__Impl ;
    public final void rule__GData__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1742:1: ( rule__GData__Group_3_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1743:2: rule__GData__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_3__1__Impl_in_rule__GData__Group_3_3__13448);
            rule__GData__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__GData__Group_3_3__1"


    // $ANTLR start "rule__GData__Group_3_3__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1749:1: rule__GData__Group_3_3__1__Impl : ( ( rule__GData__TestAssignment_3_3_1 ) ) ;
    public final void rule__GData__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1753:1: ( ( ( rule__GData__TestAssignment_3_3_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1754:1: ( ( rule__GData__TestAssignment_3_3_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1754:1: ( ( rule__GData__TestAssignment_3_3_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1755:1: ( rule__GData__TestAssignment_3_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getTestAssignment_3_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1756:1: ( rule__GData__TestAssignment_3_3_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1756:2: rule__GData__TestAssignment_3_3_1
            {
            pushFollow(FOLLOW_rule__GData__TestAssignment_3_3_1_in_rule__GData__Group_3_3__1__Impl3475);
            rule__GData__TestAssignment_3_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getTestAssignment_3_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group_3_3__1__Impl"


    // $ANTLR start "rule__GData__Group_3_4__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1770:1: rule__GData__Group_3_4__0 : rule__GData__Group_3_4__0__Impl rule__GData__Group_3_4__1 ;
    public final void rule__GData__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1774:1: ( rule__GData__Group_3_4__0__Impl rule__GData__Group_3_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1775:2: rule__GData__Group_3_4__0__Impl rule__GData__Group_3_4__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_4__0__Impl_in_rule__GData__Group_3_4__03509);
            rule__GData__Group_3_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_4__1_in_rule__GData__Group_3_4__03512);
            rule__GData__Group_3_4__1();

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
    // $ANTLR end "rule__GData__Group_3_4__0"


    // $ANTLR start "rule__GData__Group_3_4__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1782:1: rule__GData__Group_3_4__0__Impl : ( 'Javadoc:' ) ;
    public final void rule__GData__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1786:1: ( ( 'Javadoc:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1787:1: ( 'Javadoc:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1787:1: ( 'Javadoc:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1788:1: 'Javadoc:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getJavadocKeyword_3_4_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__GData__Group_3_4__0__Impl3540); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getJavadocKeyword_3_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group_3_4__0__Impl"


    // $ANTLR start "rule__GData__Group_3_4__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1801:1: rule__GData__Group_3_4__1 : rule__GData__Group_3_4__1__Impl ;
    public final void rule__GData__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1805:1: ( rule__GData__Group_3_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1806:2: rule__GData__Group_3_4__1__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_4__1__Impl_in_rule__GData__Group_3_4__13571);
            rule__GData__Group_3_4__1__Impl();

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
    // $ANTLR end "rule__GData__Group_3_4__1"


    // $ANTLR start "rule__GData__Group_3_4__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1812:1: rule__GData__Group_3_4__1__Impl : ( ( rule__GData__JavaDocAssignment_3_4_1 ) ) ;
    public final void rule__GData__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1816:1: ( ( ( rule__GData__JavaDocAssignment_3_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1817:1: ( ( rule__GData__JavaDocAssignment_3_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1817:1: ( ( rule__GData__JavaDocAssignment_3_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1818:1: ( rule__GData__JavaDocAssignment_3_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getJavaDocAssignment_3_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1819:1: ( rule__GData__JavaDocAssignment_3_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1819:2: rule__GData__JavaDocAssignment_3_4_1
            {
            pushFollow(FOLLOW_rule__GData__JavaDocAssignment_3_4_1_in_rule__GData__Group_3_4__1__Impl3598);
            rule__GData__JavaDocAssignment_3_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getJavaDocAssignment_3_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group_3_4__1__Impl"


    // $ANTLR start "rule__GData__Group_3_5__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1833:1: rule__GData__Group_3_5__0 : rule__GData__Group_3_5__0__Impl rule__GData__Group_3_5__1 ;
    public final void rule__GData__Group_3_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1837:1: ( rule__GData__Group_3_5__0__Impl rule__GData__Group_3_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1838:2: rule__GData__Group_3_5__0__Impl rule__GData__Group_3_5__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_5__0__Impl_in_rule__GData__Group_3_5__03632);
            rule__GData__Group_3_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_5__1_in_rule__GData__Group_3_5__03635);
            rule__GData__Group_3_5__1();

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
    // $ANTLR end "rule__GData__Group_3_5__0"


    // $ANTLR start "rule__GData__Group_3_5__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1845:1: rule__GData__Group_3_5__0__Impl : ( 'OverwriteEcore:' ) ;
    public final void rule__GData__Group_3_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1849:1: ( ( 'OverwriteEcore:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1850:1: ( 'OverwriteEcore:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1850:1: ( 'OverwriteEcore:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1851:1: 'OverwriteEcore:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getOverwriteEcoreKeyword_3_5_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__GData__Group_3_5__0__Impl3663); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getOverwriteEcoreKeyword_3_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group_3_5__0__Impl"


    // $ANTLR start "rule__GData__Group_3_5__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1864:1: rule__GData__Group_3_5__1 : rule__GData__Group_3_5__1__Impl ;
    public final void rule__GData__Group_3_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1868:1: ( rule__GData__Group_3_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1869:2: rule__GData__Group_3_5__1__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_5__1__Impl_in_rule__GData__Group_3_5__13694);
            rule__GData__Group_3_5__1__Impl();

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
    // $ANTLR end "rule__GData__Group_3_5__1"


    // $ANTLR start "rule__GData__Group_3_5__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1875:1: rule__GData__Group_3_5__1__Impl : ( ( rule__GData__OverwriteEcoreAssignment_3_5_1 ) ) ;
    public final void rule__GData__Group_3_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1879:1: ( ( ( rule__GData__OverwriteEcoreAssignment_3_5_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1880:1: ( ( rule__GData__OverwriteEcoreAssignment_3_5_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1880:1: ( ( rule__GData__OverwriteEcoreAssignment_3_5_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1881:1: ( rule__GData__OverwriteEcoreAssignment_3_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getOverwriteEcoreAssignment_3_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1882:1: ( rule__GData__OverwriteEcoreAssignment_3_5_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1882:2: rule__GData__OverwriteEcoreAssignment_3_5_1
            {
            pushFollow(FOLLOW_rule__GData__OverwriteEcoreAssignment_3_5_1_in_rule__GData__Group_3_5__1__Impl3721);
            rule__GData__OverwriteEcoreAssignment_3_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getOverwriteEcoreAssignment_3_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group_3_5__1__Impl"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1896:1: rule__DiagramGenerationConfiguration__Group__0 : rule__DiagramGenerationConfiguration__Group__0__Impl rule__DiagramGenerationConfiguration__Group__1 ;
    public final void rule__DiagramGenerationConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1900:1: ( rule__DiagramGenerationConfiguration__Group__0__Impl rule__DiagramGenerationConfiguration__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1901:2: rule__DiagramGenerationConfiguration__Group__0__Impl rule__DiagramGenerationConfiguration__Group__1
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__0__Impl_in_rule__DiagramGenerationConfiguration__Group__03755);
            rule__DiagramGenerationConfiguration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__1_in_rule__DiagramGenerationConfiguration__Group__03758);
            rule__DiagramGenerationConfiguration__Group__1();

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
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group__0"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1908:1: rule__DiagramGenerationConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__DiagramGenerationConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1912:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1913:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1913:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1914:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getDiagramGenerationConfigurationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1915:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1917:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramGenerationConfigurationAccess().getDiagramGenerationConfigurationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group__0__Impl"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1927:1: rule__DiagramGenerationConfiguration__Group__1 : rule__DiagramGenerationConfiguration__Group__1__Impl rule__DiagramGenerationConfiguration__Group__2 ;
    public final void rule__DiagramGenerationConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1931:1: ( rule__DiagramGenerationConfiguration__Group__1__Impl rule__DiagramGenerationConfiguration__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1932:2: rule__DiagramGenerationConfiguration__Group__1__Impl rule__DiagramGenerationConfiguration__Group__2
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__1__Impl_in_rule__DiagramGenerationConfiguration__Group__13816);
            rule__DiagramGenerationConfiguration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__2_in_rule__DiagramGenerationConfiguration__Group__13819);
            rule__DiagramGenerationConfiguration__Group__2();

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
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group__1"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1939:1: rule__DiagramGenerationConfiguration__Group__1__Impl : ( 'diagram' ) ;
    public final void rule__DiagramGenerationConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1943:1: ( ( 'diagram' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1944:1: ( 'diagram' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1944:1: ( 'diagram' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1945:1: 'diagram'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getDiagramKeyword_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__DiagramGenerationConfiguration__Group__1__Impl3847); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramGenerationConfigurationAccess().getDiagramKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group__1__Impl"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1958:1: rule__DiagramGenerationConfiguration__Group__2 : rule__DiagramGenerationConfiguration__Group__2__Impl rule__DiagramGenerationConfiguration__Group__3 ;
    public final void rule__DiagramGenerationConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1962:1: ( rule__DiagramGenerationConfiguration__Group__2__Impl rule__DiagramGenerationConfiguration__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1963:2: rule__DiagramGenerationConfiguration__Group__2__Impl rule__DiagramGenerationConfiguration__Group__3
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__2__Impl_in_rule__DiagramGenerationConfiguration__Group__23878);
            rule__DiagramGenerationConfiguration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__3_in_rule__DiagramGenerationConfiguration__Group__23881);
            rule__DiagramGenerationConfiguration__Group__3();

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
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group__2"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1970:1: rule__DiagramGenerationConfiguration__Group__2__Impl : ( '(' ) ;
    public final void rule__DiagramGenerationConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1974:1: ( ( '(' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1975:1: ( '(' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1975:1: ( '(' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1976:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__DiagramGenerationConfiguration__Group__2__Impl3909); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramGenerationConfigurationAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group__2__Impl"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1989:1: rule__DiagramGenerationConfiguration__Group__3 : rule__DiagramGenerationConfiguration__Group__3__Impl rule__DiagramGenerationConfiguration__Group__4 ;
    public final void rule__DiagramGenerationConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1993:1: ( rule__DiagramGenerationConfiguration__Group__3__Impl rule__DiagramGenerationConfiguration__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1994:2: rule__DiagramGenerationConfiguration__Group__3__Impl rule__DiagramGenerationConfiguration__Group__4
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__3__Impl_in_rule__DiagramGenerationConfiguration__Group__33940);
            rule__DiagramGenerationConfiguration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__4_in_rule__DiagramGenerationConfiguration__Group__33943);
            rule__DiagramGenerationConfiguration__Group__4();

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
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group__3"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2001:1: rule__DiagramGenerationConfiguration__Group__3__Impl : ( ( rule__DiagramGenerationConfiguration__Group_3__0 )? ) ;
    public final void rule__DiagramGenerationConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2005:1: ( ( ( rule__DiagramGenerationConfiguration__Group_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2006:1: ( ( rule__DiagramGenerationConfiguration__Group_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2006:1: ( ( rule__DiagramGenerationConfiguration__Group_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2007:1: ( rule__DiagramGenerationConfiguration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2008:1: ( rule__DiagramGenerationConfiguration__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2008:2: rule__DiagramGenerationConfiguration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group_3__0_in_rule__DiagramGenerationConfiguration__Group__3__Impl3970);
                    rule__DiagramGenerationConfiguration__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramGenerationConfigurationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group__3__Impl"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2018:1: rule__DiagramGenerationConfiguration__Group__4 : rule__DiagramGenerationConfiguration__Group__4__Impl ;
    public final void rule__DiagramGenerationConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2022:1: ( rule__DiagramGenerationConfiguration__Group__4__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2023:2: rule__DiagramGenerationConfiguration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__4__Impl_in_rule__DiagramGenerationConfiguration__Group__44001);
            rule__DiagramGenerationConfiguration__Group__4__Impl();

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
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group__4"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2029:1: rule__DiagramGenerationConfiguration__Group__4__Impl : ( ')' ) ;
    public final void rule__DiagramGenerationConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2033:1: ( ( ')' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2034:1: ( ')' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2034:1: ( ')' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2035:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,22,FOLLOW_22_in_rule__DiagramGenerationConfiguration__Group__4__Impl4029); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramGenerationConfigurationAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group__4__Impl"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group_3__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2058:1: rule__DiagramGenerationConfiguration__Group_3__0 : rule__DiagramGenerationConfiguration__Group_3__0__Impl rule__DiagramGenerationConfiguration__Group_3__1 ;
    public final void rule__DiagramGenerationConfiguration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2062:1: ( rule__DiagramGenerationConfiguration__Group_3__0__Impl rule__DiagramGenerationConfiguration__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2063:2: rule__DiagramGenerationConfiguration__Group_3__0__Impl rule__DiagramGenerationConfiguration__Group_3__1
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group_3__0__Impl_in_rule__DiagramGenerationConfiguration__Group_3__04070);
            rule__DiagramGenerationConfiguration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group_3__1_in_rule__DiagramGenerationConfiguration__Group_3__04073);
            rule__DiagramGenerationConfiguration__Group_3__1();

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
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group_3__0"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group_3__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2070:1: rule__DiagramGenerationConfiguration__Group_3__0__Impl : ( 'OverwriteOdesign:' ) ;
    public final void rule__DiagramGenerationConfiguration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2074:1: ( ( 'OverwriteOdesign:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2075:1: ( 'OverwriteOdesign:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2075:1: ( 'OverwriteOdesign:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2076:1: 'OverwriteOdesign:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteOdesignKeyword_3_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__DiagramGenerationConfiguration__Group_3__0__Impl4101); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteOdesignKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group_3__0__Impl"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group_3__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2089:1: rule__DiagramGenerationConfiguration__Group_3__1 : rule__DiagramGenerationConfiguration__Group_3__1__Impl ;
    public final void rule__DiagramGenerationConfiguration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2093:1: ( rule__DiagramGenerationConfiguration__Group_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2094:2: rule__DiagramGenerationConfiguration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group_3__1__Impl_in_rule__DiagramGenerationConfiguration__Group_3__14132);
            rule__DiagramGenerationConfiguration__Group_3__1__Impl();

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
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group_3__1"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group_3__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2100:1: rule__DiagramGenerationConfiguration__Group_3__1__Impl : ( ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1 ) ) ;
    public final void rule__DiagramGenerationConfiguration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2104:1: ( ( ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2105:1: ( ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2105:1: ( ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2106:1: ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteVSMAssignment_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2107:1: ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2107:2: rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1_in_rule__DiagramGenerationConfiguration__Group_3__1__Impl4159);
            rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteVSMAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group_3__1__Impl"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2121:1: rule__DocumentationGenerationConfiguration__Group__0 : rule__DocumentationGenerationConfiguration__Group__0__Impl rule__DocumentationGenerationConfiguration__Group__1 ;
    public final void rule__DocumentationGenerationConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2125:1: ( rule__DocumentationGenerationConfiguration__Group__0__Impl rule__DocumentationGenerationConfiguration__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2126:2: rule__DocumentationGenerationConfiguration__Group__0__Impl rule__DocumentationGenerationConfiguration__Group__1
            {
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group__0__Impl_in_rule__DocumentationGenerationConfiguration__Group__04193);
            rule__DocumentationGenerationConfiguration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group__1_in_rule__DocumentationGenerationConfiguration__Group__04196);
            rule__DocumentationGenerationConfiguration__Group__1();

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
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group__0"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2133:1: rule__DocumentationGenerationConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__DocumentationGenerationConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2137:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2138:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2138:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2139:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getDocumentationGenerationConfigurationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2140:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2142:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentationGenerationConfigurationAccess().getDocumentationGenerationConfigurationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group__0__Impl"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2152:1: rule__DocumentationGenerationConfiguration__Group__1 : rule__DocumentationGenerationConfiguration__Group__1__Impl rule__DocumentationGenerationConfiguration__Group__2 ;
    public final void rule__DocumentationGenerationConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2156:1: ( rule__DocumentationGenerationConfiguration__Group__1__Impl rule__DocumentationGenerationConfiguration__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2157:2: rule__DocumentationGenerationConfiguration__Group__1__Impl rule__DocumentationGenerationConfiguration__Group__2
            {
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group__1__Impl_in_rule__DocumentationGenerationConfiguration__Group__14254);
            rule__DocumentationGenerationConfiguration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group__2_in_rule__DocumentationGenerationConfiguration__Group__14257);
            rule__DocumentationGenerationConfiguration__Group__2();

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
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group__1"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2164:1: rule__DocumentationGenerationConfiguration__Group__1__Impl : ( 'documentation' ) ;
    public final void rule__DocumentationGenerationConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2168:1: ( ( 'documentation' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2169:1: ( 'documentation' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2169:1: ( 'documentation' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2170:1: 'documentation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getDocumentationKeyword_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__DocumentationGenerationConfiguration__Group__1__Impl4285); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentationGenerationConfigurationAccess().getDocumentationKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group__1__Impl"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2183:1: rule__DocumentationGenerationConfiguration__Group__2 : rule__DocumentationGenerationConfiguration__Group__2__Impl rule__DocumentationGenerationConfiguration__Group__3 ;
    public final void rule__DocumentationGenerationConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2187:1: ( rule__DocumentationGenerationConfiguration__Group__2__Impl rule__DocumentationGenerationConfiguration__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2188:2: rule__DocumentationGenerationConfiguration__Group__2__Impl rule__DocumentationGenerationConfiguration__Group__3
            {
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group__2__Impl_in_rule__DocumentationGenerationConfiguration__Group__24316);
            rule__DocumentationGenerationConfiguration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group__3_in_rule__DocumentationGenerationConfiguration__Group__24319);
            rule__DocumentationGenerationConfiguration__Group__3();

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
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group__2"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2195:1: rule__DocumentationGenerationConfiguration__Group__2__Impl : ( '(' ) ;
    public final void rule__DocumentationGenerationConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2199:1: ( ( '(' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2200:1: ( '(' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2200:1: ( '(' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2201:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__DocumentationGenerationConfiguration__Group__2__Impl4347); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentationGenerationConfigurationAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group__2__Impl"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2214:1: rule__DocumentationGenerationConfiguration__Group__3 : rule__DocumentationGenerationConfiguration__Group__3__Impl rule__DocumentationGenerationConfiguration__Group__4 ;
    public final void rule__DocumentationGenerationConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2218:1: ( rule__DocumentationGenerationConfiguration__Group__3__Impl rule__DocumentationGenerationConfiguration__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2219:2: rule__DocumentationGenerationConfiguration__Group__3__Impl rule__DocumentationGenerationConfiguration__Group__4
            {
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group__3__Impl_in_rule__DocumentationGenerationConfiguration__Group__34378);
            rule__DocumentationGenerationConfiguration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group__4_in_rule__DocumentationGenerationConfiguration__Group__34381);
            rule__DocumentationGenerationConfiguration__Group__4();

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
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group__3"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2226:1: rule__DocumentationGenerationConfiguration__Group__3__Impl : ( ( rule__DocumentationGenerationConfiguration__Group_3__0 )? ) ;
    public final void rule__DocumentationGenerationConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2230:1: ( ( ( rule__DocumentationGenerationConfiguration__Group_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2231:1: ( ( rule__DocumentationGenerationConfiguration__Group_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2231:1: ( ( rule__DocumentationGenerationConfiguration__Group_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2232:1: ( rule__DocumentationGenerationConfiguration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2233:1: ( rule__DocumentationGenerationConfiguration__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2233:2: rule__DocumentationGenerationConfiguration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group_3__0_in_rule__DocumentationGenerationConfiguration__Group__3__Impl4408);
                    rule__DocumentationGenerationConfiguration__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentationGenerationConfigurationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group__3__Impl"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2243:1: rule__DocumentationGenerationConfiguration__Group__4 : rule__DocumentationGenerationConfiguration__Group__4__Impl ;
    public final void rule__DocumentationGenerationConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2247:1: ( rule__DocumentationGenerationConfiguration__Group__4__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2248:2: rule__DocumentationGenerationConfiguration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group__4__Impl_in_rule__DocumentationGenerationConfiguration__Group__44439);
            rule__DocumentationGenerationConfiguration__Group__4__Impl();

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
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group__4"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2254:1: rule__DocumentationGenerationConfiguration__Group__4__Impl : ( ')' ) ;
    public final void rule__DocumentationGenerationConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2258:1: ( ( ')' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2259:1: ( ')' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2259:1: ( ')' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2260:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,22,FOLLOW_22_in_rule__DocumentationGenerationConfiguration__Group__4__Impl4467); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentationGenerationConfigurationAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group__4__Impl"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group_3__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2283:1: rule__DocumentationGenerationConfiguration__Group_3__0 : rule__DocumentationGenerationConfiguration__Group_3__0__Impl rule__DocumentationGenerationConfiguration__Group_3__1 ;
    public final void rule__DocumentationGenerationConfiguration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2287:1: ( rule__DocumentationGenerationConfiguration__Group_3__0__Impl rule__DocumentationGenerationConfiguration__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2288:2: rule__DocumentationGenerationConfiguration__Group_3__0__Impl rule__DocumentationGenerationConfiguration__Group_3__1
            {
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group_3__0__Impl_in_rule__DocumentationGenerationConfiguration__Group_3__04508);
            rule__DocumentationGenerationConfiguration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group_3__1_in_rule__DocumentationGenerationConfiguration__Group_3__04511);
            rule__DocumentationGenerationConfiguration__Group_3__1();

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
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group_3__0"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group_3__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2295:1: rule__DocumentationGenerationConfiguration__Group_3__0__Impl : ( 'EcoreToHtml:' ) ;
    public final void rule__DocumentationGenerationConfiguration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2299:1: ( ( 'EcoreToHtml:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2300:1: ( 'EcoreToHtml:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2300:1: ( 'EcoreToHtml:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2301:1: 'EcoreToHtml:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getEcoreToHtmlKeyword_3_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__DocumentationGenerationConfiguration__Group_3__0__Impl4539); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentationGenerationConfigurationAccess().getEcoreToHtmlKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group_3__0__Impl"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group_3__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2314:1: rule__DocumentationGenerationConfiguration__Group_3__1 : rule__DocumentationGenerationConfiguration__Group_3__1__Impl ;
    public final void rule__DocumentationGenerationConfiguration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2318:1: ( rule__DocumentationGenerationConfiguration__Group_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2319:2: rule__DocumentationGenerationConfiguration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group_3__1__Impl_in_rule__DocumentationGenerationConfiguration__Group_3__14570);
            rule__DocumentationGenerationConfiguration__Group_3__1__Impl();

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
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group_3__1"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group_3__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2325:1: rule__DocumentationGenerationConfiguration__Group_3__1__Impl : ( ( rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1 ) ) ;
    public final void rule__DocumentationGenerationConfiguration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2329:1: ( ( ( rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2330:1: ( ( rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2330:1: ( ( rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2331:1: ( rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getEcoreToHtmlAssignment_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2332:1: ( rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2332:2: rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1
            {
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1_in_rule__DocumentationGenerationConfiguration__Group_3__1__Impl4597);
            rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentationGenerationConfigurationAccess().getEcoreToHtmlAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group_3__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2346:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2350:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2351:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__04631);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04634);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2358:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2362:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2363:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2363:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2364:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl4661); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2375:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2379:1: ( rule__FQN__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2380:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14690);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2386:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2390:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2391:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2391:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2392:1: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2393:1: ( rule__FQN__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2393:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4717);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2407:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2411:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2412:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__04752);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__04755);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2419:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2423:1: ( ( '.' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2424:1: ( '.' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2424:1: ( '.' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2425:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__FQN__Group_1__0__Impl4783); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2438:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2442:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2443:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__14814);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2449:1: rule__FQN__Group_1__1__Impl : ( ( RULE_ID ) ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2453:1: ( ( ( RULE_ID ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2454:1: ( ( RULE_ID ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2454:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2455:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2456:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2456:3: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl4842); if (state.failed) return ;

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


    // $ANTLR start "rule__Configuration__NameAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2471:1: rule__Configuration__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__Configuration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2475:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2476:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2476:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2477:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getNameFQNParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Configuration__NameAssignment_24881);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getNameFQNParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__NameAssignment_2"


    // $ANTLR start "rule__Configuration__VpConfigurationElementsAssignment_4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2486:1: rule__Configuration__VpConfigurationElementsAssignment_4 : ( ruleConfigurationElement ) ;
    public final void rule__Configuration__VpConfigurationElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2490:1: ( ( ruleConfigurationElement ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2491:1: ( ruleConfigurationElement )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2491:1: ( ruleConfigurationElement )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2492:1: ruleConfigurationElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getVpConfigurationElementsConfigurationElementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleConfigurationElement_in_rule__Configuration__VpConfigurationElementsAssignment_44912);
            ruleConfigurationElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getVpConfigurationElementsConfigurationElementParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__VpConfigurationElementsAssignment_4"


    // $ANTLR start "rule__TargetApplication__TypeAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2501:1: rule__TargetApplication__TypeAssignment_2 : ( ruleEString ) ;
    public final void rule__TargetApplication__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2505:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2506:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2506:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2507:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationAccess().getTypeEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__TargetApplication__TypeAssignment_24943);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetApplicationAccess().getTypeEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetApplication__TypeAssignment_2"


    // $ANTLR start "rule__GenerationConfiguration__ProjectNameAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2516:1: rule__GenerationConfiguration__ProjectNameAssignment_2 : ( ruleFQN ) ;
    public final void rule__GenerationConfiguration__ProjectNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2520:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2521:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2521:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2522:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getProjectNameFQNParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__GenerationConfiguration__ProjectNameAssignment_24974);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationAccess().getProjectNameFQNParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenerationConfiguration__ProjectNameAssignment_2"


    // $ANTLR start "rule__GenerationConfiguration__NsuriAssignment_3_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2531:1: rule__GenerationConfiguration__NsuriAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__GenerationConfiguration__NsuriAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2535:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2536:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2536:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2537:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getNsuriSTRINGTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GenerationConfiguration__NsuriAssignment_3_15005); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationAccess().getNsuriSTRINGTerminalRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenerationConfiguration__NsuriAssignment_3_1"


    // $ANTLR start "rule__Generation__OwnedDataGenerationConfAssignment_3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2546:1: rule__Generation__OwnedDataGenerationConfAssignment_3 : ( ruleGData ) ;
    public final void rule__Generation__OwnedDataGenerationConfAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2550:1: ( ( ruleGData ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2551:1: ( ruleGData )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2551:1: ( ruleGData )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2552:1: ruleGData
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getOwnedDataGenerationConfGDataParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleGData_in_rule__Generation__OwnedDataGenerationConfAssignment_35036);
            ruleGData();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationAccess().getOwnedDataGenerationConfGDataParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generation__OwnedDataGenerationConfAssignment_3"


    // $ANTLR start "rule__Generation__OwnedExtensionGenConfAssignment_4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2561:1: rule__Generation__OwnedExtensionGenConfAssignment_4 : ( ruleExtensionGeneratrionConfiguration ) ;
    public final void rule__Generation__OwnedExtensionGenConfAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2565:1: ( ( ruleExtensionGeneratrionConfiguration ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2566:1: ( ruleExtensionGeneratrionConfiguration )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2566:1: ( ruleExtensionGeneratrionConfiguration )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2567:1: ruleExtensionGeneratrionConfiguration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getOwnedExtensionGenConfExtensionGeneratrionConfigurationParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleExtensionGeneratrionConfiguration_in_rule__Generation__OwnedExtensionGenConfAssignment_45067);
            ruleExtensionGeneratrionConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationAccess().getOwnedExtensionGenConfExtensionGeneratrionConfigurationParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generation__OwnedExtensionGenConfAssignment_4"


    // $ANTLR start "rule__GData__ModelAssignment_3_0_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2576:1: rule__GData__ModelAssignment_3_0_1 : ( ruleEBoolean ) ;
    public final void rule__GData__ModelAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2580:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2581:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2581:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2582:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getModelEBooleanParserRuleCall_3_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__ModelAssignment_3_0_15098);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getModelEBooleanParserRuleCall_3_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__ModelAssignment_3_0_1"


    // $ANTLR start "rule__GData__EditAssignment_3_1_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2591:1: rule__GData__EditAssignment_3_1_1 : ( ruleEBoolean ) ;
    public final void rule__GData__EditAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2595:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2596:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2596:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2597:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditEBooleanParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__EditAssignment_3_1_15129);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getEditEBooleanParserRuleCall_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__EditAssignment_3_1_1"


    // $ANTLR start "rule__GData__EditorAssignment_3_2_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2606:1: rule__GData__EditorAssignment_3_2_1 : ( ruleEBoolean ) ;
    public final void rule__GData__EditorAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2610:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2611:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2611:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2612:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditorEBooleanParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__EditorAssignment_3_2_15160);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getEditorEBooleanParserRuleCall_3_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__EditorAssignment_3_2_1"


    // $ANTLR start "rule__GData__TestAssignment_3_3_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2621:1: rule__GData__TestAssignment_3_3_1 : ( ruleEBoolean ) ;
    public final void rule__GData__TestAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2625:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2626:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2626:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2627:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getTestEBooleanParserRuleCall_3_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__TestAssignment_3_3_15191);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getTestEBooleanParserRuleCall_3_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__TestAssignment_3_3_1"


    // $ANTLR start "rule__GData__JavaDocAssignment_3_4_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2636:1: rule__GData__JavaDocAssignment_3_4_1 : ( ruleEBoolean ) ;
    public final void rule__GData__JavaDocAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2640:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2641:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2641:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2642:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getJavaDocEBooleanParserRuleCall_3_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__JavaDocAssignment_3_4_15222);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getJavaDocEBooleanParserRuleCall_3_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__JavaDocAssignment_3_4_1"


    // $ANTLR start "rule__GData__OverwriteEcoreAssignment_3_5_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2651:1: rule__GData__OverwriteEcoreAssignment_3_5_1 : ( ruleEBoolean ) ;
    public final void rule__GData__OverwriteEcoreAssignment_3_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2655:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2656:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2656:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2657:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getOverwriteEcoreEBooleanParserRuleCall_3_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__OverwriteEcoreAssignment_3_5_15253);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getOverwriteEcoreEBooleanParserRuleCall_3_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__OverwriteEcoreAssignment_3_5_1"


    // $ANTLR start "rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2666:1: rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2670:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2671:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2671:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2672:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteVSMEBooleanParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_15284);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteVSMEBooleanParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2681:1: rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2685:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2686:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2686:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2687:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getEcoreToHtmlEBooleanParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_15315);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentationGenerationConfigurationAccess().getEcoreToHtmlEBooleanParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleConfiguration_in_entryRuleConfiguration67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfiguration74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__0_in_ruleConfiguration100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationElement134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationElement__Alternatives_in_ruleConfigurationElement160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetApplication_in_entryRuleTargetApplication187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetApplication194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetApplication__Group__0_in_ruleTargetApplication220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationConfiguration_in_entryRuleGenerationConfiguration247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerationConfiguration254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__0_in_ruleGenerationConfiguration280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneration_in_entryRuleGeneration307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneration314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__0_in_ruleGeneration340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGData_in_entryRuleGData367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGData374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group__0_in_ruleGData400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionGeneratrionConfiguration_in_entryRuleExtensionGeneratrionConfiguration427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensionGeneratrionConfiguration434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionGeneratrionConfiguration__Alternatives_in_ruleExtensionGeneratrionConfiguration460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramGenerationConfiguration_in_entryRuleDiagramGenerationConfiguration487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramGenerationConfiguration494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__0_in_ruleDiagramGenerationConfiguration520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentationGenerationConfiguration_in_entryRuleDocumentationGenerationConfiguration547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentationGenerationConfiguration554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group__0_in_ruleDocumentationGenerationConfiguration580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetApplication_in_rule__ConfigurationElement__Alternatives798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationConfiguration_in_rule__ConfigurationElement__Alternatives815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneration_in_rule__ConfigurationElement__Alternatives832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramGenerationConfiguration_in_rule__ExtensionGeneratrionConfiguration__Alternatives864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentationGenerationConfiguration_in_rule__ExtensionGeneratrionConfiguration__Alternatives881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__EBoolean__Alternatives963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EBoolean__Alternatives983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__01015 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__01018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__11076 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__11079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Configuration__Group__1__Impl1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__21138 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__3_in_rule__Configuration__Group__21141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__NameAssignment_2_in_rule__Configuration__Group__2__Impl1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__3__Impl_in_rule__Configuration__Group__31198 = new BitSet(new long[]{0x00000000000B8000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__4_in_rule__Configuration__Group__31201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Configuration__Group__3__Impl1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__4__Impl_in_rule__Configuration__Group__41260 = new BitSet(new long[]{0x00000000000B8000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__5_in_rule__Configuration__Group__41263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__VpConfigurationElementsAssignment_4_in_rule__Configuration__Group__4__Impl1290 = new BitSet(new long[]{0x00000000000B0002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__5__Impl_in_rule__Configuration__Group__51321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Configuration__Group__5__Impl1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetApplication__Group__0__Impl_in_rule__TargetApplication__Group__01392 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__TargetApplication__Group__1_in_rule__TargetApplication__Group__01395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetApplication__Group__1__Impl_in_rule__TargetApplication__Group__11453 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__TargetApplication__Group__2_in_rule__TargetApplication__Group__11456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TargetApplication__Group__1__Impl1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetApplication__Group__2__Impl_in_rule__TargetApplication__Group__21515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetApplication__TypeAssignment_2_in_rule__TargetApplication__Group__2__Impl1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__0__Impl_in_rule__GenerationConfiguration__Group__01578 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__1_in_rule__GenerationConfiguration__Group__01581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__1__Impl_in_rule__GenerationConfiguration__Group__11639 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__2_in_rule__GenerationConfiguration__Group__11642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__GenerationConfiguration__Group__1__Impl1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__2__Impl_in_rule__GenerationConfiguration__Group__21701 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__3_in_rule__GenerationConfiguration__Group__21704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__ProjectNameAssignment_2_in_rule__GenerationConfiguration__Group__2__Impl1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__3__Impl_in_rule__GenerationConfiguration__Group__31761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group_3__0_in_rule__GenerationConfiguration__Group__3__Impl1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group_3__0__Impl_in_rule__GenerationConfiguration__Group_3__01827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group_3__1_in_rule__GenerationConfiguration__Group_3__01830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__GenerationConfiguration__Group_3__0__Impl1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group_3__1__Impl_in_rule__GenerationConfiguration__Group_3__11889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__NsuriAssignment_3_1_in_rule__GenerationConfiguration__Group_3__1__Impl1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__0__Impl_in_rule__Generation__Group__01950 = new BitSet(new long[]{0x00000000000B0000L});
    public static final BitSet FOLLOW_rule__Generation__Group__1_in_rule__Generation__Group__01953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__1__Impl_in_rule__Generation__Group__12011 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Generation__Group__2_in_rule__Generation__Group__12014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Generation__Group__1__Impl2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__2__Impl_in_rule__Generation__Group__22073 = new BitSet(new long[]{0x00000000A0108000L});
    public static final BitSet FOLLOW_rule__Generation__Group__3_in_rule__Generation__Group__22076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Generation__Group__2__Impl2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__3__Impl_in_rule__Generation__Group__32135 = new BitSet(new long[]{0x00000000A0108000L});
    public static final BitSet FOLLOW_rule__Generation__Group__4_in_rule__Generation__Group__32138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__OwnedDataGenerationConfAssignment_3_in_rule__Generation__Group__3__Impl2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__4__Impl_in_rule__Generation__Group__42196 = new BitSet(new long[]{0x00000000A0108000L});
    public static final BitSet FOLLOW_rule__Generation__Group__5_in_rule__Generation__Group__42199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__OwnedExtensionGenConfAssignment_4_in_rule__Generation__Group__4__Impl2226 = new BitSet(new long[]{0x00000000A0000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__5__Impl_in_rule__Generation__Group__52257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Generation__Group__5__Impl2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group__0__Impl_in_rule__GData__Group__02328 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__GData__Group__1_in_rule__GData__Group__02331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group__1__Impl_in_rule__GData__Group__12389 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__GData__Group__2_in_rule__GData__Group__12392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__GData__Group__1__Impl2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group__2__Impl_in_rule__GData__Group__22451 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_rule__GData__Group__3_in_rule__GData__Group__22454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__GData__Group__2__Impl2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group__3__Impl_in_rule__GData__Group__32513 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__GData__Group__4_in_rule__GData__Group__32516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__0_in_rule__GData__Group__3__Impl2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group__4__Impl_in_rule__GData__Group__42573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__GData__Group__4__Impl2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__0__Impl_in_rule__GData__Group_3__02642 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_rule__GData__Group_3__1_in_rule__GData__Group_3__02645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_0__0_in_rule__GData__Group_3__0__Impl2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__1__Impl_in_rule__GData__Group_3__12703 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_rule__GData__Group_3__2_in_rule__GData__Group_3__12706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_1__0_in_rule__GData__Group_3__1__Impl2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__2__Impl_in_rule__GData__Group_3__22764 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_rule__GData__Group_3__3_in_rule__GData__Group_3__22767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_2__0_in_rule__GData__Group_3__2__Impl2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__3__Impl_in_rule__GData__Group_3__32825 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_rule__GData__Group_3__4_in_rule__GData__Group_3__32828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_3__0_in_rule__GData__Group_3__3__Impl2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__4__Impl_in_rule__GData__Group_3__42886 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_rule__GData__Group_3__5_in_rule__GData__Group_3__42889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_4__0_in_rule__GData__Group_3__4__Impl2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__5__Impl_in_rule__GData__Group_3__52947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_5__0_in_rule__GData__Group_3__5__Impl2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_0__0__Impl_in_rule__GData__Group_3_0__03017 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__GData__Group_3_0__1_in_rule__GData__Group_3_0__03020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__GData__Group_3_0__0__Impl3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_0__1__Impl_in_rule__GData__Group_3_0__13079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__ModelAssignment_3_0_1_in_rule__GData__Group_3_0__1__Impl3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_1__0__Impl_in_rule__GData__Group_3_1__03140 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__GData__Group_3_1__1_in_rule__GData__Group_3_1__03143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__GData__Group_3_1__0__Impl3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_1__1__Impl_in_rule__GData__Group_3_1__13202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__EditAssignment_3_1_1_in_rule__GData__Group_3_1__1__Impl3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_2__0__Impl_in_rule__GData__Group_3_2__03263 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__GData__Group_3_2__1_in_rule__GData__Group_3_2__03266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__GData__Group_3_2__0__Impl3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_2__1__Impl_in_rule__GData__Group_3_2__13325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__EditorAssignment_3_2_1_in_rule__GData__Group_3_2__1__Impl3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_3__0__Impl_in_rule__GData__Group_3_3__03386 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__GData__Group_3_3__1_in_rule__GData__Group_3_3__03389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__GData__Group_3_3__0__Impl3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_3__1__Impl_in_rule__GData__Group_3_3__13448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__TestAssignment_3_3_1_in_rule__GData__Group_3_3__1__Impl3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_4__0__Impl_in_rule__GData__Group_3_4__03509 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__GData__Group_3_4__1_in_rule__GData__Group_3_4__03512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__GData__Group_3_4__0__Impl3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_4__1__Impl_in_rule__GData__Group_3_4__13571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__JavaDocAssignment_3_4_1_in_rule__GData__Group_3_4__1__Impl3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_5__0__Impl_in_rule__GData__Group_3_5__03632 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__GData__Group_3_5__1_in_rule__GData__Group_3_5__03635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__GData__Group_3_5__0__Impl3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_5__1__Impl_in_rule__GData__Group_3_5__13694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__OverwriteEcoreAssignment_3_5_1_in_rule__GData__Group_3_5__1__Impl3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__0__Impl_in_rule__DiagramGenerationConfiguration__Group__03755 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__1_in_rule__DiagramGenerationConfiguration__Group__03758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__1__Impl_in_rule__DiagramGenerationConfiguration__Group__13816 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__2_in_rule__DiagramGenerationConfiguration__Group__13819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DiagramGenerationConfiguration__Group__1__Impl3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__2__Impl_in_rule__DiagramGenerationConfiguration__Group__23878 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__3_in_rule__DiagramGenerationConfiguration__Group__23881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DiagramGenerationConfiguration__Group__2__Impl3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__3__Impl_in_rule__DiagramGenerationConfiguration__Group__33940 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__4_in_rule__DiagramGenerationConfiguration__Group__33943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group_3__0_in_rule__DiagramGenerationConfiguration__Group__3__Impl3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__4__Impl_in_rule__DiagramGenerationConfiguration__Group__44001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DiagramGenerationConfiguration__Group__4__Impl4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group_3__0__Impl_in_rule__DiagramGenerationConfiguration__Group_3__04070 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group_3__1_in_rule__DiagramGenerationConfiguration__Group_3__04073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DiagramGenerationConfiguration__Group_3__0__Impl4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group_3__1__Impl_in_rule__DiagramGenerationConfiguration__Group_3__14132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1_in_rule__DiagramGenerationConfiguration__Group_3__1__Impl4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group__0__Impl_in_rule__DocumentationGenerationConfiguration__Group__04193 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group__1_in_rule__DocumentationGenerationConfiguration__Group__04196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group__1__Impl_in_rule__DocumentationGenerationConfiguration__Group__14254 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group__2_in_rule__DocumentationGenerationConfiguration__Group__14257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__DocumentationGenerationConfiguration__Group__1__Impl4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group__2__Impl_in_rule__DocumentationGenerationConfiguration__Group__24316 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group__3_in_rule__DocumentationGenerationConfiguration__Group__24319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DocumentationGenerationConfiguration__Group__2__Impl4347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group__3__Impl_in_rule__DocumentationGenerationConfiguration__Group__34378 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group__4_in_rule__DocumentationGenerationConfiguration__Group__34381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group_3__0_in_rule__DocumentationGenerationConfiguration__Group__3__Impl4408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group__4__Impl_in_rule__DocumentationGenerationConfiguration__Group__44439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DocumentationGenerationConfiguration__Group__4__Impl4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group_3__0__Impl_in_rule__DocumentationGenerationConfiguration__Group_3__04508 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group_3__1_in_rule__DocumentationGenerationConfiguration__Group_3__04511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__DocumentationGenerationConfiguration__Group_3__0__Impl4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group_3__1__Impl_in_rule__DocumentationGenerationConfiguration__Group_3__14570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1_in_rule__DocumentationGenerationConfiguration__Group_3__1__Impl4597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__04631 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4717 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__04752 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__04755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FQN__Group_1__0__Impl4783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__14814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl4842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Configuration__NameAssignment_24881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_rule__Configuration__VpConfigurationElementsAssignment_44912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__TargetApplication__TypeAssignment_24943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__GenerationConfiguration__ProjectNameAssignment_24974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GenerationConfiguration__NsuriAssignment_3_15005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGData_in_rule__Generation__OwnedDataGenerationConfAssignment_35036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionGeneratrionConfiguration_in_rule__Generation__OwnedExtensionGenConfAssignment_45067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__ModelAssignment_3_0_15098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__EditAssignment_3_1_15129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__EditorAssignment_3_2_15160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__TestAssignment_3_3_15191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__JavaDocAssignment_3_4_15222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__OverwriteEcoreAssignment_3_5_15253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_15284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_15315 = new BitSet(new long[]{0x0000000000000002L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'Configuration'", "'{'", "'}'", "'target'", "'project'", "'nsuri'", "'generation'", "'data'", "'('", "')'", "'Model:'", "'Edit:'", "'Editor:'", "'Test:'", "'Javadoc:'", "'OverwriteEcore:'", "'diagram'", "'overwriteOdesign:'", "'.'"
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:238:1: ruleExtensionGeneratrionConfiguration : ( ruleDiagramGenerationConfiguration ) ;
    public final void ruleExtensionGeneratrionConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:242:2: ( ( ruleDiagramGenerationConfiguration ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:243:1: ( ruleDiagramGenerationConfiguration )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:243:1: ( ruleDiagramGenerationConfiguration )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:244:1: ruleDiagramGenerationConfiguration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionGeneratrionConfigurationAccess().getDiagramGenerationConfigurationParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleDiagramGenerationConfiguration_in_ruleExtensionGeneratrionConfiguration460);
            ruleDiagramGenerationConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionGeneratrionConfigurationAccess().getDiagramGenerationConfigurationParserRuleCall()); 
            }

            }


            }

        }
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
            pushFollow(FOLLOW_ruleDiagramGenerationConfiguration_in_entryRuleDiagramGenerationConfiguration486);
            ruleDiagramGenerationConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramGenerationConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagramGenerationConfiguration493); if (state.failed) return ;

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
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__0_in_ruleDiagramGenerationConfiguration519);
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


    // $ANTLR start "entryRuleEString"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:285:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:286:1: ( ruleEString EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:287:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString546);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString553); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:294:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:298:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:299:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:299:1: ( ( rule__EString__Alternatives ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:300:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:301:1: ( rule__EString__Alternatives )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:301:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString579);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:313:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:314:1: ( ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:315:1: ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN606);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN613); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:322:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:326:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:327:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:327:1: ( ( rule__FQN__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:328:1: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:329:1: ( rule__FQN__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:329:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN639);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:341:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:342:1: ( ruleEBoolean EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:343:1: ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_entryRuleEBoolean666);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEBooleanRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBoolean673); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:350:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:354:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:355:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:355:1: ( ( rule__EBoolean__Alternatives ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:356:1: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:357:1: ( rule__EBoolean__Alternatives )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:357:2: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean699);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:371:1: rule__ConfigurationElement__Alternatives : ( ( ruleTargetApplication ) | ( ruleGenerationConfiguration ) | ( ruleGeneration ) );
    public final void rule__ConfigurationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:375:1: ( ( ruleTargetApplication ) | ( ruleGenerationConfiguration ) | ( ruleGeneration ) )
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:376:1: ( ruleTargetApplication )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:376:1: ( ruleTargetApplication )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:377:1: ruleTargetApplication
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationElementAccess().getTargetApplicationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleTargetApplication_in_rule__ConfigurationElement__Alternatives737);
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:382:6: ( ruleGenerationConfiguration )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:382:6: ( ruleGenerationConfiguration )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:383:1: ruleGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationElementAccess().getGenerationConfigurationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGenerationConfiguration_in_rule__ConfigurationElement__Alternatives754);
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:388:6: ( ruleGeneration )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:388:6: ( ruleGeneration )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:389:1: ruleGeneration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationElementAccess().getGenerationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleGeneration_in_rule__ConfigurationElement__Alternatives771);
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


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:399:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:403:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:404:1: ( RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:404:1: ( RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:405:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives803); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:410:6: ( RULE_ID )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:410:6: ( RULE_ID )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:411:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives820); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:421:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:425:1: ( ( 'true' ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:426:1: ( 'true' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:426:1: ( 'true' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:427:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__EBoolean__Alternatives853); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:434:6: ( 'false' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:434:6: ( 'false' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:435:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__EBoolean__Alternatives873); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:449:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:453:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:454:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__0905);
            rule__Configuration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__0908);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:461:1: rule__Configuration__Group__0__Impl : ( () ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:465:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:466:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:466:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:467:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getConfigurationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:468:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:470:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:480:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:484:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:485:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__1966);
            rule__Configuration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__1969);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:492:1: rule__Configuration__Group__1__Impl : ( 'Configuration' ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:496:1: ( ( 'Configuration' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:497:1: ( 'Configuration' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:497:1: ( 'Configuration' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:498:1: 'Configuration'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getConfigurationKeyword_1()); 
            }
            match(input,13,FOLLOW_13_in_rule__Configuration__Group__1__Impl997); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:511:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl rule__Configuration__Group__3 ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:515:1: ( rule__Configuration__Group__2__Impl rule__Configuration__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:516:2: rule__Configuration__Group__2__Impl rule__Configuration__Group__3
            {
            pushFollow(FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__21028);
            rule__Configuration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__3_in_rule__Configuration__Group__21031);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:523:1: rule__Configuration__Group__2__Impl : ( ( rule__Configuration__NameAssignment_2 ) ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:527:1: ( ( ( rule__Configuration__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:528:1: ( ( rule__Configuration__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:528:1: ( ( rule__Configuration__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:529:1: ( rule__Configuration__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:530:1: ( rule__Configuration__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:530:2: rule__Configuration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Configuration__NameAssignment_2_in_rule__Configuration__Group__2__Impl1058);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:540:1: rule__Configuration__Group__3 : rule__Configuration__Group__3__Impl rule__Configuration__Group__4 ;
    public final void rule__Configuration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:544:1: ( rule__Configuration__Group__3__Impl rule__Configuration__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:545:2: rule__Configuration__Group__3__Impl rule__Configuration__Group__4
            {
            pushFollow(FOLLOW_rule__Configuration__Group__3__Impl_in_rule__Configuration__Group__31088);
            rule__Configuration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__4_in_rule__Configuration__Group__31091);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:552:1: rule__Configuration__Group__3__Impl : ( '{' ) ;
    public final void rule__Configuration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:556:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:557:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:557:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:558:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,14,FOLLOW_14_in_rule__Configuration__Group__3__Impl1119); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:571:1: rule__Configuration__Group__4 : rule__Configuration__Group__4__Impl rule__Configuration__Group__5 ;
    public final void rule__Configuration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:575:1: ( rule__Configuration__Group__4__Impl rule__Configuration__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:576:2: rule__Configuration__Group__4__Impl rule__Configuration__Group__5
            {
            pushFollow(FOLLOW_rule__Configuration__Group__4__Impl_in_rule__Configuration__Group__41150);
            rule__Configuration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__5_in_rule__Configuration__Group__41153);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:583:1: rule__Configuration__Group__4__Impl : ( ( rule__Configuration__VpConfigurationElementsAssignment_4 )* ) ;
    public final void rule__Configuration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:587:1: ( ( ( rule__Configuration__VpConfigurationElementsAssignment_4 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:588:1: ( ( rule__Configuration__VpConfigurationElementsAssignment_4 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:588:1: ( ( rule__Configuration__VpConfigurationElementsAssignment_4 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:589:1: ( rule__Configuration__VpConfigurationElementsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getVpConfigurationElementsAssignment_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:590:1: ( rule__Configuration__VpConfigurationElementsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=16 && LA4_0<=17)||LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:590:2: rule__Configuration__VpConfigurationElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Configuration__VpConfigurationElementsAssignment_4_in_rule__Configuration__Group__4__Impl1180);
            	    rule__Configuration__VpConfigurationElementsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:600:1: rule__Configuration__Group__5 : rule__Configuration__Group__5__Impl ;
    public final void rule__Configuration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:604:1: ( rule__Configuration__Group__5__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:605:2: rule__Configuration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Configuration__Group__5__Impl_in_rule__Configuration__Group__51211);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:611:1: rule__Configuration__Group__5__Impl : ( '}' ) ;
    public final void rule__Configuration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:615:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:616:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:616:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:617:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,15,FOLLOW_15_in_rule__Configuration__Group__5__Impl1239); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:642:1: rule__TargetApplication__Group__0 : rule__TargetApplication__Group__0__Impl rule__TargetApplication__Group__1 ;
    public final void rule__TargetApplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:646:1: ( rule__TargetApplication__Group__0__Impl rule__TargetApplication__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:647:2: rule__TargetApplication__Group__0__Impl rule__TargetApplication__Group__1
            {
            pushFollow(FOLLOW_rule__TargetApplication__Group__0__Impl_in_rule__TargetApplication__Group__01282);
            rule__TargetApplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TargetApplication__Group__1_in_rule__TargetApplication__Group__01285);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:654:1: rule__TargetApplication__Group__0__Impl : ( () ) ;
    public final void rule__TargetApplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:658:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:659:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:659:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:660:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationAccess().getTargetApplicationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:661:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:663:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:673:1: rule__TargetApplication__Group__1 : rule__TargetApplication__Group__1__Impl rule__TargetApplication__Group__2 ;
    public final void rule__TargetApplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:677:1: ( rule__TargetApplication__Group__1__Impl rule__TargetApplication__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:678:2: rule__TargetApplication__Group__1__Impl rule__TargetApplication__Group__2
            {
            pushFollow(FOLLOW_rule__TargetApplication__Group__1__Impl_in_rule__TargetApplication__Group__11343);
            rule__TargetApplication__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TargetApplication__Group__2_in_rule__TargetApplication__Group__11346);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:685:1: rule__TargetApplication__Group__1__Impl : ( 'target' ) ;
    public final void rule__TargetApplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:689:1: ( ( 'target' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:690:1: ( 'target' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:690:1: ( 'target' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:691:1: 'target'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationAccess().getTargetKeyword_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__TargetApplication__Group__1__Impl1374); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:704:1: rule__TargetApplication__Group__2 : rule__TargetApplication__Group__2__Impl ;
    public final void rule__TargetApplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:708:1: ( rule__TargetApplication__Group__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:709:2: rule__TargetApplication__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TargetApplication__Group__2__Impl_in_rule__TargetApplication__Group__21405);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:715:1: rule__TargetApplication__Group__2__Impl : ( ( rule__TargetApplication__TypeAssignment_2 ) ) ;
    public final void rule__TargetApplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:719:1: ( ( ( rule__TargetApplication__TypeAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:720:1: ( ( rule__TargetApplication__TypeAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:720:1: ( ( rule__TargetApplication__TypeAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:721:1: ( rule__TargetApplication__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationAccess().getTypeAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:722:1: ( rule__TargetApplication__TypeAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:722:2: rule__TargetApplication__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__TargetApplication__TypeAssignment_2_in_rule__TargetApplication__Group__2__Impl1432);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:738:1: rule__GenerationConfiguration__Group__0 : rule__GenerationConfiguration__Group__0__Impl rule__GenerationConfiguration__Group__1 ;
    public final void rule__GenerationConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:742:1: ( rule__GenerationConfiguration__Group__0__Impl rule__GenerationConfiguration__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:743:2: rule__GenerationConfiguration__Group__0__Impl rule__GenerationConfiguration__Group__1
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__0__Impl_in_rule__GenerationConfiguration__Group__01468);
            rule__GenerationConfiguration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__1_in_rule__GenerationConfiguration__Group__01471);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:750:1: rule__GenerationConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__GenerationConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:754:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:755:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:755:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:756:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getGenerationConfigurationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:757:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:759:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:769:1: rule__GenerationConfiguration__Group__1 : rule__GenerationConfiguration__Group__1__Impl rule__GenerationConfiguration__Group__2 ;
    public final void rule__GenerationConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:773:1: ( rule__GenerationConfiguration__Group__1__Impl rule__GenerationConfiguration__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:774:2: rule__GenerationConfiguration__Group__1__Impl rule__GenerationConfiguration__Group__2
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__1__Impl_in_rule__GenerationConfiguration__Group__11529);
            rule__GenerationConfiguration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__2_in_rule__GenerationConfiguration__Group__11532);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:781:1: rule__GenerationConfiguration__Group__1__Impl : ( 'project' ) ;
    public final void rule__GenerationConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:785:1: ( ( 'project' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:786:1: ( 'project' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:786:1: ( 'project' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:787:1: 'project'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getProjectKeyword_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__GenerationConfiguration__Group__1__Impl1560); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:800:1: rule__GenerationConfiguration__Group__2 : rule__GenerationConfiguration__Group__2__Impl rule__GenerationConfiguration__Group__3 ;
    public final void rule__GenerationConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:804:1: ( rule__GenerationConfiguration__Group__2__Impl rule__GenerationConfiguration__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:805:2: rule__GenerationConfiguration__Group__2__Impl rule__GenerationConfiguration__Group__3
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__2__Impl_in_rule__GenerationConfiguration__Group__21591);
            rule__GenerationConfiguration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__3_in_rule__GenerationConfiguration__Group__21594);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:812:1: rule__GenerationConfiguration__Group__2__Impl : ( ( rule__GenerationConfiguration__ProjectNameAssignment_2 ) ) ;
    public final void rule__GenerationConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:816:1: ( ( ( rule__GenerationConfiguration__ProjectNameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:817:1: ( ( rule__GenerationConfiguration__ProjectNameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:817:1: ( ( rule__GenerationConfiguration__ProjectNameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:818:1: ( rule__GenerationConfiguration__ProjectNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getProjectNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:819:1: ( rule__GenerationConfiguration__ProjectNameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:819:2: rule__GenerationConfiguration__ProjectNameAssignment_2
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__ProjectNameAssignment_2_in_rule__GenerationConfiguration__Group__2__Impl1621);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:829:1: rule__GenerationConfiguration__Group__3 : rule__GenerationConfiguration__Group__3__Impl ;
    public final void rule__GenerationConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:833:1: ( rule__GenerationConfiguration__Group__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:834:2: rule__GenerationConfiguration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__3__Impl_in_rule__GenerationConfiguration__Group__31651);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:840:1: rule__GenerationConfiguration__Group__3__Impl : ( ( rule__GenerationConfiguration__Group_3__0 )? ) ;
    public final void rule__GenerationConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:844:1: ( ( ( rule__GenerationConfiguration__Group_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:845:1: ( ( rule__GenerationConfiguration__Group_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:845:1: ( ( rule__GenerationConfiguration__Group_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:846:1: ( rule__GenerationConfiguration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:847:1: ( rule__GenerationConfiguration__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:847:2: rule__GenerationConfiguration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__GenerationConfiguration__Group_3__0_in_rule__GenerationConfiguration__Group__3__Impl1678);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:865:1: rule__GenerationConfiguration__Group_3__0 : rule__GenerationConfiguration__Group_3__0__Impl rule__GenerationConfiguration__Group_3__1 ;
    public final void rule__GenerationConfiguration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:869:1: ( rule__GenerationConfiguration__Group_3__0__Impl rule__GenerationConfiguration__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:870:2: rule__GenerationConfiguration__Group_3__0__Impl rule__GenerationConfiguration__Group_3__1
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group_3__0__Impl_in_rule__GenerationConfiguration__Group_3__01717);
            rule__GenerationConfiguration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group_3__1_in_rule__GenerationConfiguration__Group_3__01720);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:877:1: rule__GenerationConfiguration__Group_3__0__Impl : ( 'nsuri' ) ;
    public final void rule__GenerationConfiguration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:881:1: ( ( 'nsuri' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:882:1: ( 'nsuri' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:882:1: ( 'nsuri' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:883:1: 'nsuri'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getNsuriKeyword_3_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__GenerationConfiguration__Group_3__0__Impl1748); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:896:1: rule__GenerationConfiguration__Group_3__1 : rule__GenerationConfiguration__Group_3__1__Impl ;
    public final void rule__GenerationConfiguration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:900:1: ( rule__GenerationConfiguration__Group_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:901:2: rule__GenerationConfiguration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group_3__1__Impl_in_rule__GenerationConfiguration__Group_3__11779);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:907:1: rule__GenerationConfiguration__Group_3__1__Impl : ( ( rule__GenerationConfiguration__NsuriAssignment_3_1 ) ) ;
    public final void rule__GenerationConfiguration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:911:1: ( ( ( rule__GenerationConfiguration__NsuriAssignment_3_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:912:1: ( ( rule__GenerationConfiguration__NsuriAssignment_3_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:912:1: ( ( rule__GenerationConfiguration__NsuriAssignment_3_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:913:1: ( rule__GenerationConfiguration__NsuriAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getNsuriAssignment_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:914:1: ( rule__GenerationConfiguration__NsuriAssignment_3_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:914:2: rule__GenerationConfiguration__NsuriAssignment_3_1
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__NsuriAssignment_3_1_in_rule__GenerationConfiguration__Group_3__1__Impl1806);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:928:1: rule__Generation__Group__0 : rule__Generation__Group__0__Impl rule__Generation__Group__1 ;
    public final void rule__Generation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:932:1: ( rule__Generation__Group__0__Impl rule__Generation__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:933:2: rule__Generation__Group__0__Impl rule__Generation__Group__1
            {
            pushFollow(FOLLOW_rule__Generation__Group__0__Impl_in_rule__Generation__Group__01840);
            rule__Generation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generation__Group__1_in_rule__Generation__Group__01843);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:940:1: rule__Generation__Group__0__Impl : ( () ) ;
    public final void rule__Generation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:944:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:945:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:945:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:946:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getGenerationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:947:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:949:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:959:1: rule__Generation__Group__1 : rule__Generation__Group__1__Impl rule__Generation__Group__2 ;
    public final void rule__Generation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:963:1: ( rule__Generation__Group__1__Impl rule__Generation__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:964:2: rule__Generation__Group__1__Impl rule__Generation__Group__2
            {
            pushFollow(FOLLOW_rule__Generation__Group__1__Impl_in_rule__Generation__Group__11901);
            rule__Generation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generation__Group__2_in_rule__Generation__Group__11904);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:971:1: rule__Generation__Group__1__Impl : ( 'generation' ) ;
    public final void rule__Generation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:975:1: ( ( 'generation' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:976:1: ( 'generation' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:976:1: ( 'generation' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:977:1: 'generation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getGenerationKeyword_1()); 
            }
            match(input,19,FOLLOW_19_in_rule__Generation__Group__1__Impl1932); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:990:1: rule__Generation__Group__2 : rule__Generation__Group__2__Impl rule__Generation__Group__3 ;
    public final void rule__Generation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:994:1: ( rule__Generation__Group__2__Impl rule__Generation__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:995:2: rule__Generation__Group__2__Impl rule__Generation__Group__3
            {
            pushFollow(FOLLOW_rule__Generation__Group__2__Impl_in_rule__Generation__Group__21963);
            rule__Generation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generation__Group__3_in_rule__Generation__Group__21966);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1002:1: rule__Generation__Group__2__Impl : ( '{' ) ;
    public final void rule__Generation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1006:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1007:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1007:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1008:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_14_in_rule__Generation__Group__2__Impl1994); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1021:1: rule__Generation__Group__3 : rule__Generation__Group__3__Impl rule__Generation__Group__4 ;
    public final void rule__Generation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1025:1: ( rule__Generation__Group__3__Impl rule__Generation__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1026:2: rule__Generation__Group__3__Impl rule__Generation__Group__4
            {
            pushFollow(FOLLOW_rule__Generation__Group__3__Impl_in_rule__Generation__Group__32025);
            rule__Generation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generation__Group__4_in_rule__Generation__Group__32028);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1033:1: rule__Generation__Group__3__Impl : ( ( rule__Generation__OwnedDataGenerationConfAssignment_3 )? ) ;
    public final void rule__Generation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1037:1: ( ( ( rule__Generation__OwnedDataGenerationConfAssignment_3 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1038:1: ( ( rule__Generation__OwnedDataGenerationConfAssignment_3 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1038:1: ( ( rule__Generation__OwnedDataGenerationConfAssignment_3 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1039:1: ( rule__Generation__OwnedDataGenerationConfAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getOwnedDataGenerationConfAssignment_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1040:1: ( rule__Generation__OwnedDataGenerationConfAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1040:2: rule__Generation__OwnedDataGenerationConfAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Generation__OwnedDataGenerationConfAssignment_3_in_rule__Generation__Group__3__Impl2055);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1050:1: rule__Generation__Group__4 : rule__Generation__Group__4__Impl rule__Generation__Group__5 ;
    public final void rule__Generation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1054:1: ( rule__Generation__Group__4__Impl rule__Generation__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1055:2: rule__Generation__Group__4__Impl rule__Generation__Group__5
            {
            pushFollow(FOLLOW_rule__Generation__Group__4__Impl_in_rule__Generation__Group__42086);
            rule__Generation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generation__Group__5_in_rule__Generation__Group__42089);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1062:1: rule__Generation__Group__4__Impl : ( ( rule__Generation__OwnedExtensionGenConfAssignment_4 )? ) ;
    public final void rule__Generation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1066:1: ( ( ( rule__Generation__OwnedExtensionGenConfAssignment_4 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1067:1: ( ( rule__Generation__OwnedExtensionGenConfAssignment_4 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1067:1: ( ( rule__Generation__OwnedExtensionGenConfAssignment_4 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1068:1: ( rule__Generation__OwnedExtensionGenConfAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getOwnedExtensionGenConfAssignment_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1069:1: ( rule__Generation__OwnedExtensionGenConfAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1069:2: rule__Generation__OwnedExtensionGenConfAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Generation__OwnedExtensionGenConfAssignment_4_in_rule__Generation__Group__4__Impl2116);
                    rule__Generation__OwnedExtensionGenConfAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1079:1: rule__Generation__Group__5 : rule__Generation__Group__5__Impl ;
    public final void rule__Generation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1083:1: ( rule__Generation__Group__5__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1084:2: rule__Generation__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Generation__Group__5__Impl_in_rule__Generation__Group__52147);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1090:1: rule__Generation__Group__5__Impl : ( '}' ) ;
    public final void rule__Generation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1094:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1095:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1095:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1096:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,15,FOLLOW_15_in_rule__Generation__Group__5__Impl2175); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1121:1: rule__GData__Group__0 : rule__GData__Group__0__Impl rule__GData__Group__1 ;
    public final void rule__GData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1125:1: ( rule__GData__Group__0__Impl rule__GData__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1126:2: rule__GData__Group__0__Impl rule__GData__Group__1
            {
            pushFollow(FOLLOW_rule__GData__Group__0__Impl_in_rule__GData__Group__02218);
            rule__GData__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group__1_in_rule__GData__Group__02221);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1133:1: rule__GData__Group__0__Impl : ( () ) ;
    public final void rule__GData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1137:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1138:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1138:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1139:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGDataAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1140:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1142:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1152:1: rule__GData__Group__1 : rule__GData__Group__1__Impl rule__GData__Group__2 ;
    public final void rule__GData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1156:1: ( rule__GData__Group__1__Impl rule__GData__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1157:2: rule__GData__Group__1__Impl rule__GData__Group__2
            {
            pushFollow(FOLLOW_rule__GData__Group__1__Impl_in_rule__GData__Group__12279);
            rule__GData__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group__2_in_rule__GData__Group__12282);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1164:1: rule__GData__Group__1__Impl : ( 'data' ) ;
    public final void rule__GData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1168:1: ( ( 'data' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1169:1: ( 'data' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1169:1: ( 'data' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1170:1: 'data'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getDataKeyword_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__GData__Group__1__Impl2310); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1183:1: rule__GData__Group__2 : rule__GData__Group__2__Impl rule__GData__Group__3 ;
    public final void rule__GData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1187:1: ( rule__GData__Group__2__Impl rule__GData__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1188:2: rule__GData__Group__2__Impl rule__GData__Group__3
            {
            pushFollow(FOLLOW_rule__GData__Group__2__Impl_in_rule__GData__Group__22341);
            rule__GData__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group__3_in_rule__GData__Group__22344);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1195:1: rule__GData__Group__2__Impl : ( '(' ) ;
    public final void rule__GData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1199:1: ( ( '(' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1200:1: ( '(' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1200:1: ( '(' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1201:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__GData__Group__2__Impl2372); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1214:1: rule__GData__Group__3 : rule__GData__Group__3__Impl rule__GData__Group__4 ;
    public final void rule__GData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1218:1: ( rule__GData__Group__3__Impl rule__GData__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1219:2: rule__GData__Group__3__Impl rule__GData__Group__4
            {
            pushFollow(FOLLOW_rule__GData__Group__3__Impl_in_rule__GData__Group__32403);
            rule__GData__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group__4_in_rule__GData__Group__32406);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1226:1: rule__GData__Group__3__Impl : ( ( rule__GData__Group_3__0 ) ) ;
    public final void rule__GData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1230:1: ( ( ( rule__GData__Group_3__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1231:1: ( ( rule__GData__Group_3__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1231:1: ( ( rule__GData__Group_3__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1232:1: ( rule__GData__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1233:1: ( rule__GData__Group_3__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1233:2: rule__GData__Group_3__0
            {
            pushFollow(FOLLOW_rule__GData__Group_3__0_in_rule__GData__Group__3__Impl2433);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1243:1: rule__GData__Group__4 : rule__GData__Group__4__Impl ;
    public final void rule__GData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1247:1: ( rule__GData__Group__4__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1248:2: rule__GData__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group__4__Impl_in_rule__GData__Group__42463);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1254:1: rule__GData__Group__4__Impl : ( ')' ) ;
    public final void rule__GData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1258:1: ( ( ')' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1259:1: ( ')' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1259:1: ( ')' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1260:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,22,FOLLOW_22_in_rule__GData__Group__4__Impl2491); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1283:1: rule__GData__Group_3__0 : rule__GData__Group_3__0__Impl rule__GData__Group_3__1 ;
    public final void rule__GData__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1287:1: ( rule__GData__Group_3__0__Impl rule__GData__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1288:2: rule__GData__Group_3__0__Impl rule__GData__Group_3__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3__0__Impl_in_rule__GData__Group_3__02532);
            rule__GData__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3__1_in_rule__GData__Group_3__02535);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1295:1: rule__GData__Group_3__0__Impl : ( ( rule__GData__Group_3_0__0 )? ) ;
    public final void rule__GData__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1299:1: ( ( ( rule__GData__Group_3_0__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1300:1: ( ( rule__GData__Group_3_0__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1300:1: ( ( rule__GData__Group_3_0__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1301:1: ( rule__GData__Group_3_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1302:1: ( rule__GData__Group_3_0__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1302:2: rule__GData__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_0__0_in_rule__GData__Group_3__0__Impl2562);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1312:1: rule__GData__Group_3__1 : rule__GData__Group_3__1__Impl rule__GData__Group_3__2 ;
    public final void rule__GData__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1316:1: ( rule__GData__Group_3__1__Impl rule__GData__Group_3__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1317:2: rule__GData__Group_3__1__Impl rule__GData__Group_3__2
            {
            pushFollow(FOLLOW_rule__GData__Group_3__1__Impl_in_rule__GData__Group_3__12593);
            rule__GData__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3__2_in_rule__GData__Group_3__12596);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1324:1: rule__GData__Group_3__1__Impl : ( ( rule__GData__Group_3_1__0 )? ) ;
    public final void rule__GData__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1328:1: ( ( ( rule__GData__Group_3_1__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1329:1: ( ( rule__GData__Group_3_1__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1329:1: ( ( rule__GData__Group_3_1__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1330:1: ( rule__GData__Group_3_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1331:1: ( rule__GData__Group_3_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1331:2: rule__GData__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_1__0_in_rule__GData__Group_3__1__Impl2623);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1341:1: rule__GData__Group_3__2 : rule__GData__Group_3__2__Impl rule__GData__Group_3__3 ;
    public final void rule__GData__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1345:1: ( rule__GData__Group_3__2__Impl rule__GData__Group_3__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1346:2: rule__GData__Group_3__2__Impl rule__GData__Group_3__3
            {
            pushFollow(FOLLOW_rule__GData__Group_3__2__Impl_in_rule__GData__Group_3__22654);
            rule__GData__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3__3_in_rule__GData__Group_3__22657);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1353:1: rule__GData__Group_3__2__Impl : ( ( rule__GData__Group_3_2__0 )? ) ;
    public final void rule__GData__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1357:1: ( ( ( rule__GData__Group_3_2__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1358:1: ( ( rule__GData__Group_3_2__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1358:1: ( ( rule__GData__Group_3_2__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1359:1: ( rule__GData__Group_3_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1360:1: ( rule__GData__Group_3_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1360:2: rule__GData__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_2__0_in_rule__GData__Group_3__2__Impl2684);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1370:1: rule__GData__Group_3__3 : rule__GData__Group_3__3__Impl rule__GData__Group_3__4 ;
    public final void rule__GData__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1374:1: ( rule__GData__Group_3__3__Impl rule__GData__Group_3__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1375:2: rule__GData__Group_3__3__Impl rule__GData__Group_3__4
            {
            pushFollow(FOLLOW_rule__GData__Group_3__3__Impl_in_rule__GData__Group_3__32715);
            rule__GData__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3__4_in_rule__GData__Group_3__32718);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1382:1: rule__GData__Group_3__3__Impl : ( ( rule__GData__Group_3_3__0 )? ) ;
    public final void rule__GData__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1386:1: ( ( ( rule__GData__Group_3_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1387:1: ( ( rule__GData__Group_3_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1387:1: ( ( rule__GData__Group_3_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1388:1: ( rule__GData__Group_3_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1389:1: ( rule__GData__Group_3_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1389:2: rule__GData__Group_3_3__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_3__0_in_rule__GData__Group_3__3__Impl2745);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1399:1: rule__GData__Group_3__4 : rule__GData__Group_3__4__Impl rule__GData__Group_3__5 ;
    public final void rule__GData__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1403:1: ( rule__GData__Group_3__4__Impl rule__GData__Group_3__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1404:2: rule__GData__Group_3__4__Impl rule__GData__Group_3__5
            {
            pushFollow(FOLLOW_rule__GData__Group_3__4__Impl_in_rule__GData__Group_3__42776);
            rule__GData__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3__5_in_rule__GData__Group_3__42779);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1411:1: rule__GData__Group_3__4__Impl : ( ( rule__GData__Group_3_4__0 )? ) ;
    public final void rule__GData__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1415:1: ( ( ( rule__GData__Group_3_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1416:1: ( ( rule__GData__Group_3_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1416:1: ( ( rule__GData__Group_3_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1417:1: ( rule__GData__Group_3_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1418:1: ( rule__GData__Group_3_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1418:2: rule__GData__Group_3_4__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_4__0_in_rule__GData__Group_3__4__Impl2806);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1428:1: rule__GData__Group_3__5 : rule__GData__Group_3__5__Impl ;
    public final void rule__GData__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1432:1: ( rule__GData__Group_3__5__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1433:2: rule__GData__Group_3__5__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3__5__Impl_in_rule__GData__Group_3__52837);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1439:1: rule__GData__Group_3__5__Impl : ( ( rule__GData__Group_3_5__0 )? ) ;
    public final void rule__GData__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1443:1: ( ( ( rule__GData__Group_3_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1444:1: ( ( rule__GData__Group_3_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1444:1: ( ( rule__GData__Group_3_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1445:1: ( rule__GData__Group_3_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1446:1: ( rule__GData__Group_3_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1446:2: rule__GData__Group_3_5__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_5__0_in_rule__GData__Group_3__5__Impl2864);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1468:1: rule__GData__Group_3_0__0 : rule__GData__Group_3_0__0__Impl rule__GData__Group_3_0__1 ;
    public final void rule__GData__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1472:1: ( rule__GData__Group_3_0__0__Impl rule__GData__Group_3_0__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1473:2: rule__GData__Group_3_0__0__Impl rule__GData__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_0__0__Impl_in_rule__GData__Group_3_0__02907);
            rule__GData__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_0__1_in_rule__GData__Group_3_0__02910);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1480:1: rule__GData__Group_3_0__0__Impl : ( 'Model:' ) ;
    public final void rule__GData__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1484:1: ( ( 'Model:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1485:1: ( 'Model:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1485:1: ( 'Model:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1486:1: 'Model:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getModelKeyword_3_0_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__GData__Group_3_0__0__Impl2938); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1499:1: rule__GData__Group_3_0__1 : rule__GData__Group_3_0__1__Impl ;
    public final void rule__GData__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1503:1: ( rule__GData__Group_3_0__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1504:2: rule__GData__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_0__1__Impl_in_rule__GData__Group_3_0__12969);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1510:1: rule__GData__Group_3_0__1__Impl : ( ( rule__GData__ModelAssignment_3_0_1 ) ) ;
    public final void rule__GData__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1514:1: ( ( ( rule__GData__ModelAssignment_3_0_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1515:1: ( ( rule__GData__ModelAssignment_3_0_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1515:1: ( ( rule__GData__ModelAssignment_3_0_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1516:1: ( rule__GData__ModelAssignment_3_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getModelAssignment_3_0_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1517:1: ( rule__GData__ModelAssignment_3_0_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1517:2: rule__GData__ModelAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__GData__ModelAssignment_3_0_1_in_rule__GData__Group_3_0__1__Impl2996);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1531:1: rule__GData__Group_3_1__0 : rule__GData__Group_3_1__0__Impl rule__GData__Group_3_1__1 ;
    public final void rule__GData__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1535:1: ( rule__GData__Group_3_1__0__Impl rule__GData__Group_3_1__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1536:2: rule__GData__Group_3_1__0__Impl rule__GData__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_1__0__Impl_in_rule__GData__Group_3_1__03030);
            rule__GData__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_1__1_in_rule__GData__Group_3_1__03033);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1543:1: rule__GData__Group_3_1__0__Impl : ( 'Edit:' ) ;
    public final void rule__GData__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1547:1: ( ( 'Edit:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1548:1: ( 'Edit:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1548:1: ( 'Edit:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1549:1: 'Edit:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditKeyword_3_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__GData__Group_3_1__0__Impl3061); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1562:1: rule__GData__Group_3_1__1 : rule__GData__Group_3_1__1__Impl ;
    public final void rule__GData__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1566:1: ( rule__GData__Group_3_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1567:2: rule__GData__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_1__1__Impl_in_rule__GData__Group_3_1__13092);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1573:1: rule__GData__Group_3_1__1__Impl : ( ( rule__GData__EditAssignment_3_1_1 ) ) ;
    public final void rule__GData__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1577:1: ( ( ( rule__GData__EditAssignment_3_1_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1578:1: ( ( rule__GData__EditAssignment_3_1_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1578:1: ( ( rule__GData__EditAssignment_3_1_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1579:1: ( rule__GData__EditAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditAssignment_3_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1580:1: ( rule__GData__EditAssignment_3_1_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1580:2: rule__GData__EditAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__GData__EditAssignment_3_1_1_in_rule__GData__Group_3_1__1__Impl3119);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1594:1: rule__GData__Group_3_2__0 : rule__GData__Group_3_2__0__Impl rule__GData__Group_3_2__1 ;
    public final void rule__GData__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1598:1: ( rule__GData__Group_3_2__0__Impl rule__GData__Group_3_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1599:2: rule__GData__Group_3_2__0__Impl rule__GData__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_2__0__Impl_in_rule__GData__Group_3_2__03153);
            rule__GData__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_2__1_in_rule__GData__Group_3_2__03156);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1606:1: rule__GData__Group_3_2__0__Impl : ( 'Editor:' ) ;
    public final void rule__GData__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1610:1: ( ( 'Editor:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1611:1: ( 'Editor:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1611:1: ( 'Editor:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1612:1: 'Editor:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditorKeyword_3_2_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__GData__Group_3_2__0__Impl3184); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1625:1: rule__GData__Group_3_2__1 : rule__GData__Group_3_2__1__Impl ;
    public final void rule__GData__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1629:1: ( rule__GData__Group_3_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1630:2: rule__GData__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_2__1__Impl_in_rule__GData__Group_3_2__13215);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1636:1: rule__GData__Group_3_2__1__Impl : ( ( rule__GData__EditorAssignment_3_2_1 ) ) ;
    public final void rule__GData__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1640:1: ( ( ( rule__GData__EditorAssignment_3_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1641:1: ( ( rule__GData__EditorAssignment_3_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1641:1: ( ( rule__GData__EditorAssignment_3_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1642:1: ( rule__GData__EditorAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditorAssignment_3_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1643:1: ( rule__GData__EditorAssignment_3_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1643:2: rule__GData__EditorAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__GData__EditorAssignment_3_2_1_in_rule__GData__Group_3_2__1__Impl3242);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1657:1: rule__GData__Group_3_3__0 : rule__GData__Group_3_3__0__Impl rule__GData__Group_3_3__1 ;
    public final void rule__GData__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1661:1: ( rule__GData__Group_3_3__0__Impl rule__GData__Group_3_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1662:2: rule__GData__Group_3_3__0__Impl rule__GData__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_3__0__Impl_in_rule__GData__Group_3_3__03276);
            rule__GData__Group_3_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_3__1_in_rule__GData__Group_3_3__03279);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1669:1: rule__GData__Group_3_3__0__Impl : ( 'Test:' ) ;
    public final void rule__GData__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1673:1: ( ( 'Test:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1674:1: ( 'Test:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1674:1: ( 'Test:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1675:1: 'Test:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getTestKeyword_3_3_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__GData__Group_3_3__0__Impl3307); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1688:1: rule__GData__Group_3_3__1 : rule__GData__Group_3_3__1__Impl ;
    public final void rule__GData__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1692:1: ( rule__GData__Group_3_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1693:2: rule__GData__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_3__1__Impl_in_rule__GData__Group_3_3__13338);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1699:1: rule__GData__Group_3_3__1__Impl : ( ( rule__GData__TestAssignment_3_3_1 ) ) ;
    public final void rule__GData__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1703:1: ( ( ( rule__GData__TestAssignment_3_3_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1704:1: ( ( rule__GData__TestAssignment_3_3_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1704:1: ( ( rule__GData__TestAssignment_3_3_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1705:1: ( rule__GData__TestAssignment_3_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getTestAssignment_3_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1706:1: ( rule__GData__TestAssignment_3_3_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1706:2: rule__GData__TestAssignment_3_3_1
            {
            pushFollow(FOLLOW_rule__GData__TestAssignment_3_3_1_in_rule__GData__Group_3_3__1__Impl3365);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1720:1: rule__GData__Group_3_4__0 : rule__GData__Group_3_4__0__Impl rule__GData__Group_3_4__1 ;
    public final void rule__GData__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1724:1: ( rule__GData__Group_3_4__0__Impl rule__GData__Group_3_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1725:2: rule__GData__Group_3_4__0__Impl rule__GData__Group_3_4__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_4__0__Impl_in_rule__GData__Group_3_4__03399);
            rule__GData__Group_3_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_4__1_in_rule__GData__Group_3_4__03402);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1732:1: rule__GData__Group_3_4__0__Impl : ( 'Javadoc:' ) ;
    public final void rule__GData__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1736:1: ( ( 'Javadoc:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1737:1: ( 'Javadoc:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1737:1: ( 'Javadoc:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1738:1: 'Javadoc:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getJavadocKeyword_3_4_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__GData__Group_3_4__0__Impl3430); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1751:1: rule__GData__Group_3_4__1 : rule__GData__Group_3_4__1__Impl ;
    public final void rule__GData__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1755:1: ( rule__GData__Group_3_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1756:2: rule__GData__Group_3_4__1__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_4__1__Impl_in_rule__GData__Group_3_4__13461);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1762:1: rule__GData__Group_3_4__1__Impl : ( ( rule__GData__JavaDocAssignment_3_4_1 ) ) ;
    public final void rule__GData__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1766:1: ( ( ( rule__GData__JavaDocAssignment_3_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1767:1: ( ( rule__GData__JavaDocAssignment_3_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1767:1: ( ( rule__GData__JavaDocAssignment_3_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1768:1: ( rule__GData__JavaDocAssignment_3_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getJavaDocAssignment_3_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1769:1: ( rule__GData__JavaDocAssignment_3_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1769:2: rule__GData__JavaDocAssignment_3_4_1
            {
            pushFollow(FOLLOW_rule__GData__JavaDocAssignment_3_4_1_in_rule__GData__Group_3_4__1__Impl3488);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1783:1: rule__GData__Group_3_5__0 : rule__GData__Group_3_5__0__Impl rule__GData__Group_3_5__1 ;
    public final void rule__GData__Group_3_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1787:1: ( rule__GData__Group_3_5__0__Impl rule__GData__Group_3_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1788:2: rule__GData__Group_3_5__0__Impl rule__GData__Group_3_5__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_5__0__Impl_in_rule__GData__Group_3_5__03522);
            rule__GData__Group_3_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_5__1_in_rule__GData__Group_3_5__03525);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1795:1: rule__GData__Group_3_5__0__Impl : ( 'OverwriteEcore:' ) ;
    public final void rule__GData__Group_3_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1799:1: ( ( 'OverwriteEcore:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1800:1: ( 'OverwriteEcore:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1800:1: ( 'OverwriteEcore:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1801:1: 'OverwriteEcore:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getOverwriteEcoreKeyword_3_5_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__GData__Group_3_5__0__Impl3553); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1814:1: rule__GData__Group_3_5__1 : rule__GData__Group_3_5__1__Impl ;
    public final void rule__GData__Group_3_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1818:1: ( rule__GData__Group_3_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1819:2: rule__GData__Group_3_5__1__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_5__1__Impl_in_rule__GData__Group_3_5__13584);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1825:1: rule__GData__Group_3_5__1__Impl : ( ( rule__GData__OverwriteEcoreAssignment_3_5_1 ) ) ;
    public final void rule__GData__Group_3_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1829:1: ( ( ( rule__GData__OverwriteEcoreAssignment_3_5_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1830:1: ( ( rule__GData__OverwriteEcoreAssignment_3_5_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1830:1: ( ( rule__GData__OverwriteEcoreAssignment_3_5_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1831:1: ( rule__GData__OverwriteEcoreAssignment_3_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getOverwriteEcoreAssignment_3_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1832:1: ( rule__GData__OverwriteEcoreAssignment_3_5_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1832:2: rule__GData__OverwriteEcoreAssignment_3_5_1
            {
            pushFollow(FOLLOW_rule__GData__OverwriteEcoreAssignment_3_5_1_in_rule__GData__Group_3_5__1__Impl3611);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1846:1: rule__DiagramGenerationConfiguration__Group__0 : rule__DiagramGenerationConfiguration__Group__0__Impl rule__DiagramGenerationConfiguration__Group__1 ;
    public final void rule__DiagramGenerationConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1850:1: ( rule__DiagramGenerationConfiguration__Group__0__Impl rule__DiagramGenerationConfiguration__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1851:2: rule__DiagramGenerationConfiguration__Group__0__Impl rule__DiagramGenerationConfiguration__Group__1
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__0__Impl_in_rule__DiagramGenerationConfiguration__Group__03645);
            rule__DiagramGenerationConfiguration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__1_in_rule__DiagramGenerationConfiguration__Group__03648);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1858:1: rule__DiagramGenerationConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__DiagramGenerationConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1862:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1863:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1863:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1864:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getDiagramGenerationConfigurationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1865:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1867:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1877:1: rule__DiagramGenerationConfiguration__Group__1 : rule__DiagramGenerationConfiguration__Group__1__Impl rule__DiagramGenerationConfiguration__Group__2 ;
    public final void rule__DiagramGenerationConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1881:1: ( rule__DiagramGenerationConfiguration__Group__1__Impl rule__DiagramGenerationConfiguration__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1882:2: rule__DiagramGenerationConfiguration__Group__1__Impl rule__DiagramGenerationConfiguration__Group__2
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__1__Impl_in_rule__DiagramGenerationConfiguration__Group__13706);
            rule__DiagramGenerationConfiguration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__2_in_rule__DiagramGenerationConfiguration__Group__13709);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1889:1: rule__DiagramGenerationConfiguration__Group__1__Impl : ( 'diagram' ) ;
    public final void rule__DiagramGenerationConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1893:1: ( ( 'diagram' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1894:1: ( 'diagram' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1894:1: ( 'diagram' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1895:1: 'diagram'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getDiagramKeyword_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__DiagramGenerationConfiguration__Group__1__Impl3737); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1908:1: rule__DiagramGenerationConfiguration__Group__2 : rule__DiagramGenerationConfiguration__Group__2__Impl rule__DiagramGenerationConfiguration__Group__3 ;
    public final void rule__DiagramGenerationConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1912:1: ( rule__DiagramGenerationConfiguration__Group__2__Impl rule__DiagramGenerationConfiguration__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1913:2: rule__DiagramGenerationConfiguration__Group__2__Impl rule__DiagramGenerationConfiguration__Group__3
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__2__Impl_in_rule__DiagramGenerationConfiguration__Group__23768);
            rule__DiagramGenerationConfiguration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__3_in_rule__DiagramGenerationConfiguration__Group__23771);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1920:1: rule__DiagramGenerationConfiguration__Group__2__Impl : ( '(' ) ;
    public final void rule__DiagramGenerationConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1924:1: ( ( '(' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1925:1: ( '(' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1925:1: ( '(' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1926:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__DiagramGenerationConfiguration__Group__2__Impl3799); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1939:1: rule__DiagramGenerationConfiguration__Group__3 : rule__DiagramGenerationConfiguration__Group__3__Impl rule__DiagramGenerationConfiguration__Group__4 ;
    public final void rule__DiagramGenerationConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1943:1: ( rule__DiagramGenerationConfiguration__Group__3__Impl rule__DiagramGenerationConfiguration__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1944:2: rule__DiagramGenerationConfiguration__Group__3__Impl rule__DiagramGenerationConfiguration__Group__4
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__3__Impl_in_rule__DiagramGenerationConfiguration__Group__33830);
            rule__DiagramGenerationConfiguration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__4_in_rule__DiagramGenerationConfiguration__Group__33833);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1951:1: rule__DiagramGenerationConfiguration__Group__3__Impl : ( ( rule__DiagramGenerationConfiguration__Group_3__0 ) ) ;
    public final void rule__DiagramGenerationConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1955:1: ( ( ( rule__DiagramGenerationConfiguration__Group_3__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1956:1: ( ( rule__DiagramGenerationConfiguration__Group_3__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1956:1: ( ( rule__DiagramGenerationConfiguration__Group_3__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1957:1: ( rule__DiagramGenerationConfiguration__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1958:1: ( rule__DiagramGenerationConfiguration__Group_3__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1958:2: rule__DiagramGenerationConfiguration__Group_3__0
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group_3__0_in_rule__DiagramGenerationConfiguration__Group__3__Impl3860);
            rule__DiagramGenerationConfiguration__Group_3__0();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1968:1: rule__DiagramGenerationConfiguration__Group__4 : rule__DiagramGenerationConfiguration__Group__4__Impl ;
    public final void rule__DiagramGenerationConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1972:1: ( rule__DiagramGenerationConfiguration__Group__4__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1973:2: rule__DiagramGenerationConfiguration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__4__Impl_in_rule__DiagramGenerationConfiguration__Group__43890);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1979:1: rule__DiagramGenerationConfiguration__Group__4__Impl : ( ')' ) ;
    public final void rule__DiagramGenerationConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1983:1: ( ( ')' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1984:1: ( ')' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1984:1: ( ')' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1985:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,22,FOLLOW_22_in_rule__DiagramGenerationConfiguration__Group__4__Impl3918); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2008:1: rule__DiagramGenerationConfiguration__Group_3__0 : rule__DiagramGenerationConfiguration__Group_3__0__Impl rule__DiagramGenerationConfiguration__Group_3__1 ;
    public final void rule__DiagramGenerationConfiguration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2012:1: ( rule__DiagramGenerationConfiguration__Group_3__0__Impl rule__DiagramGenerationConfiguration__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2013:2: rule__DiagramGenerationConfiguration__Group_3__0__Impl rule__DiagramGenerationConfiguration__Group_3__1
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group_3__0__Impl_in_rule__DiagramGenerationConfiguration__Group_3__03959);
            rule__DiagramGenerationConfiguration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group_3__1_in_rule__DiagramGenerationConfiguration__Group_3__03962);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2020:1: rule__DiagramGenerationConfiguration__Group_3__0__Impl : ( 'overwriteOdesign:' ) ;
    public final void rule__DiagramGenerationConfiguration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2024:1: ( ( 'overwriteOdesign:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2025:1: ( 'overwriteOdesign:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2025:1: ( 'overwriteOdesign:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2026:1: 'overwriteOdesign:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteOdesignKeyword_3_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__DiagramGenerationConfiguration__Group_3__0__Impl3990); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2039:1: rule__DiagramGenerationConfiguration__Group_3__1 : rule__DiagramGenerationConfiguration__Group_3__1__Impl ;
    public final void rule__DiagramGenerationConfiguration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2043:1: ( rule__DiagramGenerationConfiguration__Group_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2044:2: rule__DiagramGenerationConfiguration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group_3__1__Impl_in_rule__DiagramGenerationConfiguration__Group_3__14021);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2050:1: rule__DiagramGenerationConfiguration__Group_3__1__Impl : ( ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1 ) ) ;
    public final void rule__DiagramGenerationConfiguration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2054:1: ( ( ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2055:1: ( ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2055:1: ( ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2056:1: ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteVSMAssignment_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2057:1: ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2057:2: rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1_in_rule__DiagramGenerationConfiguration__Group_3__1__Impl4048);
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


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2071:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2075:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2076:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__04082);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04085);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2083:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2087:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2088:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2088:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2089:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl4112); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2100:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2104:1: ( rule__FQN__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2105:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14141);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2111:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2115:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2116:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2116:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2117:1: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2118:1: ( rule__FQN__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2118:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4168);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2132:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2136:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2137:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__04203);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__04206);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2144:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2148:1: ( ( '.' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2149:1: ( '.' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2149:1: ( '.' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2150:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__FQN__Group_1__0__Impl4234); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2163:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2167:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2168:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__14265);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2174:1: rule__FQN__Group_1__1__Impl : ( ( RULE_ID ) ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2178:1: ( ( ( RULE_ID ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2179:1: ( ( RULE_ID ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2179:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2180:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2181:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2181:3: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl4293); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2196:1: rule__Configuration__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__Configuration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2200:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2201:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2201:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2202:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getNameFQNParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Configuration__NameAssignment_24332);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2211:1: rule__Configuration__VpConfigurationElementsAssignment_4 : ( ruleConfigurationElement ) ;
    public final void rule__Configuration__VpConfigurationElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2215:1: ( ( ruleConfigurationElement ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2216:1: ( ruleConfigurationElement )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2216:1: ( ruleConfigurationElement )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2217:1: ruleConfigurationElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getVpConfigurationElementsConfigurationElementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleConfigurationElement_in_rule__Configuration__VpConfigurationElementsAssignment_44363);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2226:1: rule__TargetApplication__TypeAssignment_2 : ( ruleEString ) ;
    public final void rule__TargetApplication__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2230:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2231:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2231:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2232:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationAccess().getTypeEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__TargetApplication__TypeAssignment_24394);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2241:1: rule__GenerationConfiguration__ProjectNameAssignment_2 : ( ruleFQN ) ;
    public final void rule__GenerationConfiguration__ProjectNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2245:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2246:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2246:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2247:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getProjectNameFQNParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__GenerationConfiguration__ProjectNameAssignment_24425);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2256:1: rule__GenerationConfiguration__NsuriAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__GenerationConfiguration__NsuriAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2260:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2261:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2261:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2262:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getNsuriSTRINGTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GenerationConfiguration__NsuriAssignment_3_14456); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2271:1: rule__Generation__OwnedDataGenerationConfAssignment_3 : ( ruleGData ) ;
    public final void rule__Generation__OwnedDataGenerationConfAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2275:1: ( ( ruleGData ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2276:1: ( ruleGData )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2276:1: ( ruleGData )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2277:1: ruleGData
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getOwnedDataGenerationConfGDataParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleGData_in_rule__Generation__OwnedDataGenerationConfAssignment_34487);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2286:1: rule__Generation__OwnedExtensionGenConfAssignment_4 : ( ruleExtensionGeneratrionConfiguration ) ;
    public final void rule__Generation__OwnedExtensionGenConfAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2290:1: ( ( ruleExtensionGeneratrionConfiguration ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2291:1: ( ruleExtensionGeneratrionConfiguration )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2291:1: ( ruleExtensionGeneratrionConfiguration )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2292:1: ruleExtensionGeneratrionConfiguration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getOwnedExtensionGenConfExtensionGeneratrionConfigurationParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleExtensionGeneratrionConfiguration_in_rule__Generation__OwnedExtensionGenConfAssignment_44518);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2301:1: rule__GData__ModelAssignment_3_0_1 : ( ruleEBoolean ) ;
    public final void rule__GData__ModelAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2305:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2306:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2306:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2307:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getModelEBooleanParserRuleCall_3_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__ModelAssignment_3_0_14549);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2316:1: rule__GData__EditAssignment_3_1_1 : ( ruleEBoolean ) ;
    public final void rule__GData__EditAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2320:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2321:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2321:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2322:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditEBooleanParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__EditAssignment_3_1_14580);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2331:1: rule__GData__EditorAssignment_3_2_1 : ( ruleEBoolean ) ;
    public final void rule__GData__EditorAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2335:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2336:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2336:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2337:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditorEBooleanParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__EditorAssignment_3_2_14611);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2346:1: rule__GData__TestAssignment_3_3_1 : ( ruleEBoolean ) ;
    public final void rule__GData__TestAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2350:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2351:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2351:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2352:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getTestEBooleanParserRuleCall_3_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__TestAssignment_3_3_14642);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2361:1: rule__GData__JavaDocAssignment_3_4_1 : ( ruleEBoolean ) ;
    public final void rule__GData__JavaDocAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2365:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2366:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2366:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2367:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getJavaDocEBooleanParserRuleCall_3_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__JavaDocAssignment_3_4_14673);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2376:1: rule__GData__OverwriteEcoreAssignment_3_5_1 : ( ruleEBoolean ) ;
    public final void rule__GData__OverwriteEcoreAssignment_3_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2380:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2381:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2381:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2382:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getOverwriteEcoreEBooleanParserRuleCall_3_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__OverwriteEcoreAssignment_3_5_14704);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2391:1: rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2395:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2396:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2396:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2397:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteVSMEBooleanParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_14735);
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
    public static final BitSet FOLLOW_ruleDiagramGenerationConfiguration_in_ruleExtensionGeneratrionConfiguration460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramGenerationConfiguration_in_entryRuleDiagramGenerationConfiguration486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramGenerationConfiguration493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__0_in_ruleDiagramGenerationConfiguration519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetApplication_in_rule__ConfigurationElement__Alternatives737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationConfiguration_in_rule__ConfigurationElement__Alternatives754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneration_in_rule__ConfigurationElement__Alternatives771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__EBoolean__Alternatives853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EBoolean__Alternatives873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__0905 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__0908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__1966 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Configuration__Group__1__Impl997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__21028 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__3_in_rule__Configuration__Group__21031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__NameAssignment_2_in_rule__Configuration__Group__2__Impl1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__3__Impl_in_rule__Configuration__Group__31088 = new BitSet(new long[]{0x00000000000B8000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__4_in_rule__Configuration__Group__31091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Configuration__Group__3__Impl1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__4__Impl_in_rule__Configuration__Group__41150 = new BitSet(new long[]{0x00000000000B8000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__5_in_rule__Configuration__Group__41153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__VpConfigurationElementsAssignment_4_in_rule__Configuration__Group__4__Impl1180 = new BitSet(new long[]{0x00000000000B0002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__5__Impl_in_rule__Configuration__Group__51211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Configuration__Group__5__Impl1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetApplication__Group__0__Impl_in_rule__TargetApplication__Group__01282 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__TargetApplication__Group__1_in_rule__TargetApplication__Group__01285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetApplication__Group__1__Impl_in_rule__TargetApplication__Group__11343 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__TargetApplication__Group__2_in_rule__TargetApplication__Group__11346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TargetApplication__Group__1__Impl1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetApplication__Group__2__Impl_in_rule__TargetApplication__Group__21405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetApplication__TypeAssignment_2_in_rule__TargetApplication__Group__2__Impl1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__0__Impl_in_rule__GenerationConfiguration__Group__01468 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__1_in_rule__GenerationConfiguration__Group__01471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__1__Impl_in_rule__GenerationConfiguration__Group__11529 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__2_in_rule__GenerationConfiguration__Group__11532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__GenerationConfiguration__Group__1__Impl1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__2__Impl_in_rule__GenerationConfiguration__Group__21591 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__3_in_rule__GenerationConfiguration__Group__21594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__ProjectNameAssignment_2_in_rule__GenerationConfiguration__Group__2__Impl1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__3__Impl_in_rule__GenerationConfiguration__Group__31651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group_3__0_in_rule__GenerationConfiguration__Group__3__Impl1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group_3__0__Impl_in_rule__GenerationConfiguration__Group_3__01717 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group_3__1_in_rule__GenerationConfiguration__Group_3__01720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__GenerationConfiguration__Group_3__0__Impl1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group_3__1__Impl_in_rule__GenerationConfiguration__Group_3__11779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__NsuriAssignment_3_1_in_rule__GenerationConfiguration__Group_3__1__Impl1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__0__Impl_in_rule__Generation__Group__01840 = new BitSet(new long[]{0x00000000000B0000L});
    public static final BitSet FOLLOW_rule__Generation__Group__1_in_rule__Generation__Group__01843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__1__Impl_in_rule__Generation__Group__11901 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Generation__Group__2_in_rule__Generation__Group__11904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Generation__Group__1__Impl1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__2__Impl_in_rule__Generation__Group__21963 = new BitSet(new long[]{0x0000000020108000L});
    public static final BitSet FOLLOW_rule__Generation__Group__3_in_rule__Generation__Group__21966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Generation__Group__2__Impl1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__3__Impl_in_rule__Generation__Group__32025 = new BitSet(new long[]{0x0000000020108000L});
    public static final BitSet FOLLOW_rule__Generation__Group__4_in_rule__Generation__Group__32028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__OwnedDataGenerationConfAssignment_3_in_rule__Generation__Group__3__Impl2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__4__Impl_in_rule__Generation__Group__42086 = new BitSet(new long[]{0x0000000020108000L});
    public static final BitSet FOLLOW_rule__Generation__Group__5_in_rule__Generation__Group__42089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__OwnedExtensionGenConfAssignment_4_in_rule__Generation__Group__4__Impl2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__5__Impl_in_rule__Generation__Group__52147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Generation__Group__5__Impl2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group__0__Impl_in_rule__GData__Group__02218 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__GData__Group__1_in_rule__GData__Group__02221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group__1__Impl_in_rule__GData__Group__12279 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__GData__Group__2_in_rule__GData__Group__12282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__GData__Group__1__Impl2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group__2__Impl_in_rule__GData__Group__22341 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_rule__GData__Group__3_in_rule__GData__Group__22344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__GData__Group__2__Impl2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group__3__Impl_in_rule__GData__Group__32403 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__GData__Group__4_in_rule__GData__Group__32406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__0_in_rule__GData__Group__3__Impl2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group__4__Impl_in_rule__GData__Group__42463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__GData__Group__4__Impl2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__0__Impl_in_rule__GData__Group_3__02532 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_rule__GData__Group_3__1_in_rule__GData__Group_3__02535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_0__0_in_rule__GData__Group_3__0__Impl2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__1__Impl_in_rule__GData__Group_3__12593 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_rule__GData__Group_3__2_in_rule__GData__Group_3__12596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_1__0_in_rule__GData__Group_3__1__Impl2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__2__Impl_in_rule__GData__Group_3__22654 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_rule__GData__Group_3__3_in_rule__GData__Group_3__22657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_2__0_in_rule__GData__Group_3__2__Impl2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__3__Impl_in_rule__GData__Group_3__32715 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_rule__GData__Group_3__4_in_rule__GData__Group_3__32718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_3__0_in_rule__GData__Group_3__3__Impl2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__4__Impl_in_rule__GData__Group_3__42776 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_rule__GData__Group_3__5_in_rule__GData__Group_3__42779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_4__0_in_rule__GData__Group_3__4__Impl2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__5__Impl_in_rule__GData__Group_3__52837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_5__0_in_rule__GData__Group_3__5__Impl2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_0__0__Impl_in_rule__GData__Group_3_0__02907 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__GData__Group_3_0__1_in_rule__GData__Group_3_0__02910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__GData__Group_3_0__0__Impl2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_0__1__Impl_in_rule__GData__Group_3_0__12969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__ModelAssignment_3_0_1_in_rule__GData__Group_3_0__1__Impl2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_1__0__Impl_in_rule__GData__Group_3_1__03030 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__GData__Group_3_1__1_in_rule__GData__Group_3_1__03033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__GData__Group_3_1__0__Impl3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_1__1__Impl_in_rule__GData__Group_3_1__13092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__EditAssignment_3_1_1_in_rule__GData__Group_3_1__1__Impl3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_2__0__Impl_in_rule__GData__Group_3_2__03153 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__GData__Group_3_2__1_in_rule__GData__Group_3_2__03156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__GData__Group_3_2__0__Impl3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_2__1__Impl_in_rule__GData__Group_3_2__13215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__EditorAssignment_3_2_1_in_rule__GData__Group_3_2__1__Impl3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_3__0__Impl_in_rule__GData__Group_3_3__03276 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__GData__Group_3_3__1_in_rule__GData__Group_3_3__03279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__GData__Group_3_3__0__Impl3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_3__1__Impl_in_rule__GData__Group_3_3__13338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__TestAssignment_3_3_1_in_rule__GData__Group_3_3__1__Impl3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_4__0__Impl_in_rule__GData__Group_3_4__03399 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__GData__Group_3_4__1_in_rule__GData__Group_3_4__03402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__GData__Group_3_4__0__Impl3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_4__1__Impl_in_rule__GData__Group_3_4__13461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__JavaDocAssignment_3_4_1_in_rule__GData__Group_3_4__1__Impl3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_5__0__Impl_in_rule__GData__Group_3_5__03522 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__GData__Group_3_5__1_in_rule__GData__Group_3_5__03525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__GData__Group_3_5__0__Impl3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_5__1__Impl_in_rule__GData__Group_3_5__13584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__OverwriteEcoreAssignment_3_5_1_in_rule__GData__Group_3_5__1__Impl3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__0__Impl_in_rule__DiagramGenerationConfiguration__Group__03645 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__1_in_rule__DiagramGenerationConfiguration__Group__03648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__1__Impl_in_rule__DiagramGenerationConfiguration__Group__13706 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__2_in_rule__DiagramGenerationConfiguration__Group__13709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DiagramGenerationConfiguration__Group__1__Impl3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__2__Impl_in_rule__DiagramGenerationConfiguration__Group__23768 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__3_in_rule__DiagramGenerationConfiguration__Group__23771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DiagramGenerationConfiguration__Group__2__Impl3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__3__Impl_in_rule__DiagramGenerationConfiguration__Group__33830 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__4_in_rule__DiagramGenerationConfiguration__Group__33833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group_3__0_in_rule__DiagramGenerationConfiguration__Group__3__Impl3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__4__Impl_in_rule__DiagramGenerationConfiguration__Group__43890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DiagramGenerationConfiguration__Group__4__Impl3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group_3__0__Impl_in_rule__DiagramGenerationConfiguration__Group_3__03959 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group_3__1_in_rule__DiagramGenerationConfiguration__Group_3__03962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DiagramGenerationConfiguration__Group_3__0__Impl3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group_3__1__Impl_in_rule__DiagramGenerationConfiguration__Group_3__14021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1_in_rule__DiagramGenerationConfiguration__Group_3__1__Impl4048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__04082 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4168 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__04203 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__04206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FQN__Group_1__0__Impl4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__14265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Configuration__NameAssignment_24332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_rule__Configuration__VpConfigurationElementsAssignment_44363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__TargetApplication__TypeAssignment_24394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__GenerationConfiguration__ProjectNameAssignment_24425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GenerationConfiguration__NsuriAssignment_3_14456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGData_in_rule__Generation__OwnedDataGenerationConfAssignment_34487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionGeneratrionConfiguration_in_rule__Generation__OwnedExtensionGenConfAssignment_44518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__ModelAssignment_3_0_14549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__EditAssignment_3_1_14580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__EditorAssignment_3_2_14611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__TestAssignment_3_3_14642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__JavaDocAssignment_3_4_14673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__OverwriteEcoreAssignment_3_5_14704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_14735 = new BitSet(new long[]{0x0000000000000002L});

}
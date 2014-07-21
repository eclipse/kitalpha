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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EMF'", "'true'", "'false'", "'Configuration'", "'{'", "'}'", "'target'", "'project'", "'nsuri'", "'generation'", "'data'", "'('", "')'", "'Model:'", "'Edit:'", "'Editor:'", "'Test:'", "'Javadoc:'", "'OverwriteEcore:'", "'diagram'", "'overwriteOdesign:'", "'.'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
    public static final int T__32=32;
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


    // $ANTLR start "entryRuleTargetApplicationType"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:285:1: entryRuleTargetApplicationType : ruleTargetApplicationType EOF ;
    public final void entryRuleTargetApplicationType() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:286:1: ( ruleTargetApplicationType EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:287:1: ruleTargetApplicationType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationTypeRule()); 
            }
            pushFollow(FOLLOW_ruleTargetApplicationType_in_entryRuleTargetApplicationType546);
            ruleTargetApplicationType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetApplicationTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetApplicationType553); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTargetApplicationType"


    // $ANTLR start "ruleTargetApplicationType"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:294:1: ruleTargetApplicationType : ( 'EMF' ) ;
    public final void ruleTargetApplicationType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:298:2: ( ( 'EMF' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:299:1: ( 'EMF' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:299:1: ( 'EMF' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:300:1: 'EMF'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationTypeAccess().getEMFKeyword()); 
            }
            match(input,11,FOLLOW_11_in_ruleTargetApplicationType580); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetApplicationTypeAccess().getEMFKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTargetApplicationType"


    // $ANTLR start "entryRuleFQN"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:317:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:318:1: ( ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:319:1: ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN610);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN617); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:326:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:330:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:331:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:331:1: ( ( rule__FQN__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:332:1: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:333:1: ( rule__FQN__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:333:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN643);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:345:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:346:1: ( ruleEBoolean EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:347:1: ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_entryRuleEBoolean670);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEBooleanRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBoolean677); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:354:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:358:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:359:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:359:1: ( ( rule__EBoolean__Alternatives ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:360:1: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:361:1: ( rule__EBoolean__Alternatives )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:361:2: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean703);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:375:1: rule__ConfigurationElement__Alternatives : ( ( ruleTargetApplication ) | ( ruleGenerationConfiguration ) | ( ruleGeneration ) );
    public final void rule__ConfigurationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:379:1: ( ( ruleTargetApplication ) | ( ruleGenerationConfiguration ) | ( ruleGeneration ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 20:
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:380:1: ( ruleTargetApplication )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:380:1: ( ruleTargetApplication )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:381:1: ruleTargetApplication
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationElementAccess().getTargetApplicationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleTargetApplication_in_rule__ConfigurationElement__Alternatives741);
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:386:6: ( ruleGenerationConfiguration )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:386:6: ( ruleGenerationConfiguration )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:387:1: ruleGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationElementAccess().getGenerationConfigurationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGenerationConfiguration_in_rule__ConfigurationElement__Alternatives758);
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:392:6: ( ruleGeneration )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:392:6: ( ruleGeneration )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:393:1: ruleGeneration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationElementAccess().getGenerationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleGeneration_in_rule__ConfigurationElement__Alternatives775);
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


    // $ANTLR start "rule__EBoolean__Alternatives"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:404:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:408:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:409:1: ( 'true' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:409:1: ( 'true' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:410:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__EBoolean__Alternatives809); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:417:6: ( 'false' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:417:6: ( 'false' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:418:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__EBoolean__Alternatives829); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:432:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:436:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:437:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__0861);
            rule__Configuration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__0864);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:444:1: rule__Configuration__Group__0__Impl : ( () ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:448:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:449:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:449:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:450:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getConfigurationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:451:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:453:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:463:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:467:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:468:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__1922);
            rule__Configuration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__1925);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:475:1: rule__Configuration__Group__1__Impl : ( 'Configuration' ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:479:1: ( ( 'Configuration' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:480:1: ( 'Configuration' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:480:1: ( 'Configuration' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:481:1: 'Configuration'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getConfigurationKeyword_1()); 
            }
            match(input,14,FOLLOW_14_in_rule__Configuration__Group__1__Impl953); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:494:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl rule__Configuration__Group__3 ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:498:1: ( rule__Configuration__Group__2__Impl rule__Configuration__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:499:2: rule__Configuration__Group__2__Impl rule__Configuration__Group__3
            {
            pushFollow(FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__2984);
            rule__Configuration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__3_in_rule__Configuration__Group__2987);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:506:1: rule__Configuration__Group__2__Impl : ( ( rule__Configuration__NameAssignment_2 ) ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:510:1: ( ( ( rule__Configuration__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:511:1: ( ( rule__Configuration__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:511:1: ( ( rule__Configuration__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:512:1: ( rule__Configuration__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:513:1: ( rule__Configuration__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:513:2: rule__Configuration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Configuration__NameAssignment_2_in_rule__Configuration__Group__2__Impl1014);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:523:1: rule__Configuration__Group__3 : rule__Configuration__Group__3__Impl rule__Configuration__Group__4 ;
    public final void rule__Configuration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:527:1: ( rule__Configuration__Group__3__Impl rule__Configuration__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:528:2: rule__Configuration__Group__3__Impl rule__Configuration__Group__4
            {
            pushFollow(FOLLOW_rule__Configuration__Group__3__Impl_in_rule__Configuration__Group__31044);
            rule__Configuration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__4_in_rule__Configuration__Group__31047);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:535:1: rule__Configuration__Group__3__Impl : ( '{' ) ;
    public final void rule__Configuration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:539:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:540:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:540:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:541:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__Configuration__Group__3__Impl1075); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:554:1: rule__Configuration__Group__4 : rule__Configuration__Group__4__Impl rule__Configuration__Group__5 ;
    public final void rule__Configuration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:558:1: ( rule__Configuration__Group__4__Impl rule__Configuration__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:559:2: rule__Configuration__Group__4__Impl rule__Configuration__Group__5
            {
            pushFollow(FOLLOW_rule__Configuration__Group__4__Impl_in_rule__Configuration__Group__41106);
            rule__Configuration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__5_in_rule__Configuration__Group__41109);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:566:1: rule__Configuration__Group__4__Impl : ( ( rule__Configuration__VpConfigurationElementsAssignment_4 )* ) ;
    public final void rule__Configuration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:570:1: ( ( ( rule__Configuration__VpConfigurationElementsAssignment_4 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:571:1: ( ( rule__Configuration__VpConfigurationElementsAssignment_4 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:571:1: ( ( rule__Configuration__VpConfigurationElementsAssignment_4 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:572:1: ( rule__Configuration__VpConfigurationElementsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getVpConfigurationElementsAssignment_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:573:1: ( rule__Configuration__VpConfigurationElementsAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=17 && LA3_0<=18)||LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:573:2: rule__Configuration__VpConfigurationElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Configuration__VpConfigurationElementsAssignment_4_in_rule__Configuration__Group__4__Impl1136);
            	    rule__Configuration__VpConfigurationElementsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:583:1: rule__Configuration__Group__5 : rule__Configuration__Group__5__Impl ;
    public final void rule__Configuration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:587:1: ( rule__Configuration__Group__5__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:588:2: rule__Configuration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Configuration__Group__5__Impl_in_rule__Configuration__Group__51167);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:594:1: rule__Configuration__Group__5__Impl : ( '}' ) ;
    public final void rule__Configuration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:598:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:599:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:599:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:600:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,16,FOLLOW_16_in_rule__Configuration__Group__5__Impl1195); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:625:1: rule__TargetApplication__Group__0 : rule__TargetApplication__Group__0__Impl rule__TargetApplication__Group__1 ;
    public final void rule__TargetApplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:629:1: ( rule__TargetApplication__Group__0__Impl rule__TargetApplication__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:630:2: rule__TargetApplication__Group__0__Impl rule__TargetApplication__Group__1
            {
            pushFollow(FOLLOW_rule__TargetApplication__Group__0__Impl_in_rule__TargetApplication__Group__01238);
            rule__TargetApplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TargetApplication__Group__1_in_rule__TargetApplication__Group__01241);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:637:1: rule__TargetApplication__Group__0__Impl : ( () ) ;
    public final void rule__TargetApplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:641:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:642:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:642:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:643:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationAccess().getTargetApplicationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:644:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:646:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:656:1: rule__TargetApplication__Group__1 : rule__TargetApplication__Group__1__Impl rule__TargetApplication__Group__2 ;
    public final void rule__TargetApplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:660:1: ( rule__TargetApplication__Group__1__Impl rule__TargetApplication__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:661:2: rule__TargetApplication__Group__1__Impl rule__TargetApplication__Group__2
            {
            pushFollow(FOLLOW_rule__TargetApplication__Group__1__Impl_in_rule__TargetApplication__Group__11299);
            rule__TargetApplication__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TargetApplication__Group__2_in_rule__TargetApplication__Group__11302);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:668:1: rule__TargetApplication__Group__1__Impl : ( 'target' ) ;
    public final void rule__TargetApplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:672:1: ( ( 'target' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:673:1: ( 'target' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:673:1: ( 'target' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:674:1: 'target'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationAccess().getTargetKeyword_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__TargetApplication__Group__1__Impl1330); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:687:1: rule__TargetApplication__Group__2 : rule__TargetApplication__Group__2__Impl ;
    public final void rule__TargetApplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:691:1: ( rule__TargetApplication__Group__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:692:2: rule__TargetApplication__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TargetApplication__Group__2__Impl_in_rule__TargetApplication__Group__21361);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:698:1: rule__TargetApplication__Group__2__Impl : ( ( rule__TargetApplication__TypeAssignment_2 ) ) ;
    public final void rule__TargetApplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:702:1: ( ( ( rule__TargetApplication__TypeAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:703:1: ( ( rule__TargetApplication__TypeAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:703:1: ( ( rule__TargetApplication__TypeAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:704:1: ( rule__TargetApplication__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationAccess().getTypeAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:705:1: ( rule__TargetApplication__TypeAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:705:2: rule__TargetApplication__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__TargetApplication__TypeAssignment_2_in_rule__TargetApplication__Group__2__Impl1388);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:721:1: rule__GenerationConfiguration__Group__0 : rule__GenerationConfiguration__Group__0__Impl rule__GenerationConfiguration__Group__1 ;
    public final void rule__GenerationConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:725:1: ( rule__GenerationConfiguration__Group__0__Impl rule__GenerationConfiguration__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:726:2: rule__GenerationConfiguration__Group__0__Impl rule__GenerationConfiguration__Group__1
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__0__Impl_in_rule__GenerationConfiguration__Group__01424);
            rule__GenerationConfiguration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__1_in_rule__GenerationConfiguration__Group__01427);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:733:1: rule__GenerationConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__GenerationConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:737:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:738:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:738:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:739:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getGenerationConfigurationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:740:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:742:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:752:1: rule__GenerationConfiguration__Group__1 : rule__GenerationConfiguration__Group__1__Impl rule__GenerationConfiguration__Group__2 ;
    public final void rule__GenerationConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:756:1: ( rule__GenerationConfiguration__Group__1__Impl rule__GenerationConfiguration__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:757:2: rule__GenerationConfiguration__Group__1__Impl rule__GenerationConfiguration__Group__2
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__1__Impl_in_rule__GenerationConfiguration__Group__11485);
            rule__GenerationConfiguration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__2_in_rule__GenerationConfiguration__Group__11488);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:764:1: rule__GenerationConfiguration__Group__1__Impl : ( 'project' ) ;
    public final void rule__GenerationConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:768:1: ( ( 'project' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:769:1: ( 'project' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:769:1: ( 'project' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:770:1: 'project'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getProjectKeyword_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__GenerationConfiguration__Group__1__Impl1516); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:783:1: rule__GenerationConfiguration__Group__2 : rule__GenerationConfiguration__Group__2__Impl rule__GenerationConfiguration__Group__3 ;
    public final void rule__GenerationConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:787:1: ( rule__GenerationConfiguration__Group__2__Impl rule__GenerationConfiguration__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:788:2: rule__GenerationConfiguration__Group__2__Impl rule__GenerationConfiguration__Group__3
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__2__Impl_in_rule__GenerationConfiguration__Group__21547);
            rule__GenerationConfiguration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__3_in_rule__GenerationConfiguration__Group__21550);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:795:1: rule__GenerationConfiguration__Group__2__Impl : ( ( rule__GenerationConfiguration__ProjectNameAssignment_2 ) ) ;
    public final void rule__GenerationConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:799:1: ( ( ( rule__GenerationConfiguration__ProjectNameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:800:1: ( ( rule__GenerationConfiguration__ProjectNameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:800:1: ( ( rule__GenerationConfiguration__ProjectNameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:801:1: ( rule__GenerationConfiguration__ProjectNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getProjectNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:802:1: ( rule__GenerationConfiguration__ProjectNameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:802:2: rule__GenerationConfiguration__ProjectNameAssignment_2
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__ProjectNameAssignment_2_in_rule__GenerationConfiguration__Group__2__Impl1577);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:812:1: rule__GenerationConfiguration__Group__3 : rule__GenerationConfiguration__Group__3__Impl ;
    public final void rule__GenerationConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:816:1: ( rule__GenerationConfiguration__Group__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:817:2: rule__GenerationConfiguration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__3__Impl_in_rule__GenerationConfiguration__Group__31607);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:823:1: rule__GenerationConfiguration__Group__3__Impl : ( ( rule__GenerationConfiguration__Group_3__0 )? ) ;
    public final void rule__GenerationConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:827:1: ( ( ( rule__GenerationConfiguration__Group_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:828:1: ( ( rule__GenerationConfiguration__Group_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:828:1: ( ( rule__GenerationConfiguration__Group_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:829:1: ( rule__GenerationConfiguration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:830:1: ( rule__GenerationConfiguration__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:830:2: rule__GenerationConfiguration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__GenerationConfiguration__Group_3__0_in_rule__GenerationConfiguration__Group__3__Impl1634);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:848:1: rule__GenerationConfiguration__Group_3__0 : rule__GenerationConfiguration__Group_3__0__Impl rule__GenerationConfiguration__Group_3__1 ;
    public final void rule__GenerationConfiguration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:852:1: ( rule__GenerationConfiguration__Group_3__0__Impl rule__GenerationConfiguration__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:853:2: rule__GenerationConfiguration__Group_3__0__Impl rule__GenerationConfiguration__Group_3__1
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group_3__0__Impl_in_rule__GenerationConfiguration__Group_3__01673);
            rule__GenerationConfiguration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group_3__1_in_rule__GenerationConfiguration__Group_3__01676);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:860:1: rule__GenerationConfiguration__Group_3__0__Impl : ( 'nsuri' ) ;
    public final void rule__GenerationConfiguration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:864:1: ( ( 'nsuri' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:865:1: ( 'nsuri' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:865:1: ( 'nsuri' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:866:1: 'nsuri'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getNsuriKeyword_3_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__GenerationConfiguration__Group_3__0__Impl1704); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:879:1: rule__GenerationConfiguration__Group_3__1 : rule__GenerationConfiguration__Group_3__1__Impl ;
    public final void rule__GenerationConfiguration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:883:1: ( rule__GenerationConfiguration__Group_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:884:2: rule__GenerationConfiguration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group_3__1__Impl_in_rule__GenerationConfiguration__Group_3__11735);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:890:1: rule__GenerationConfiguration__Group_3__1__Impl : ( ( rule__GenerationConfiguration__NsuriAssignment_3_1 ) ) ;
    public final void rule__GenerationConfiguration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:894:1: ( ( ( rule__GenerationConfiguration__NsuriAssignment_3_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:895:1: ( ( rule__GenerationConfiguration__NsuriAssignment_3_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:895:1: ( ( rule__GenerationConfiguration__NsuriAssignment_3_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:896:1: ( rule__GenerationConfiguration__NsuriAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getNsuriAssignment_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:897:1: ( rule__GenerationConfiguration__NsuriAssignment_3_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:897:2: rule__GenerationConfiguration__NsuriAssignment_3_1
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__NsuriAssignment_3_1_in_rule__GenerationConfiguration__Group_3__1__Impl1762);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:911:1: rule__Generation__Group__0 : rule__Generation__Group__0__Impl rule__Generation__Group__1 ;
    public final void rule__Generation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:915:1: ( rule__Generation__Group__0__Impl rule__Generation__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:916:2: rule__Generation__Group__0__Impl rule__Generation__Group__1
            {
            pushFollow(FOLLOW_rule__Generation__Group__0__Impl_in_rule__Generation__Group__01796);
            rule__Generation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generation__Group__1_in_rule__Generation__Group__01799);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:923:1: rule__Generation__Group__0__Impl : ( () ) ;
    public final void rule__Generation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:927:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:928:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:928:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:929:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getGenerationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:930:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:932:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:942:1: rule__Generation__Group__1 : rule__Generation__Group__1__Impl rule__Generation__Group__2 ;
    public final void rule__Generation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:946:1: ( rule__Generation__Group__1__Impl rule__Generation__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:947:2: rule__Generation__Group__1__Impl rule__Generation__Group__2
            {
            pushFollow(FOLLOW_rule__Generation__Group__1__Impl_in_rule__Generation__Group__11857);
            rule__Generation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generation__Group__2_in_rule__Generation__Group__11860);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:954:1: rule__Generation__Group__1__Impl : ( 'generation' ) ;
    public final void rule__Generation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:958:1: ( ( 'generation' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:959:1: ( 'generation' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:959:1: ( 'generation' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:960:1: 'generation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getGenerationKeyword_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Generation__Group__1__Impl1888); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:973:1: rule__Generation__Group__2 : rule__Generation__Group__2__Impl rule__Generation__Group__3 ;
    public final void rule__Generation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:977:1: ( rule__Generation__Group__2__Impl rule__Generation__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:978:2: rule__Generation__Group__2__Impl rule__Generation__Group__3
            {
            pushFollow(FOLLOW_rule__Generation__Group__2__Impl_in_rule__Generation__Group__21919);
            rule__Generation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generation__Group__3_in_rule__Generation__Group__21922);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:985:1: rule__Generation__Group__2__Impl : ( '{' ) ;
    public final void rule__Generation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:989:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:990:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:990:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:991:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,15,FOLLOW_15_in_rule__Generation__Group__2__Impl1950); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1004:1: rule__Generation__Group__3 : rule__Generation__Group__3__Impl rule__Generation__Group__4 ;
    public final void rule__Generation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1008:1: ( rule__Generation__Group__3__Impl rule__Generation__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1009:2: rule__Generation__Group__3__Impl rule__Generation__Group__4
            {
            pushFollow(FOLLOW_rule__Generation__Group__3__Impl_in_rule__Generation__Group__31981);
            rule__Generation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generation__Group__4_in_rule__Generation__Group__31984);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1016:1: rule__Generation__Group__3__Impl : ( ( rule__Generation__OwnedDataGenerationConfAssignment_3 )? ) ;
    public final void rule__Generation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1020:1: ( ( ( rule__Generation__OwnedDataGenerationConfAssignment_3 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1021:1: ( ( rule__Generation__OwnedDataGenerationConfAssignment_3 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1021:1: ( ( rule__Generation__OwnedDataGenerationConfAssignment_3 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1022:1: ( rule__Generation__OwnedDataGenerationConfAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getOwnedDataGenerationConfAssignment_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1023:1: ( rule__Generation__OwnedDataGenerationConfAssignment_3 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1023:2: rule__Generation__OwnedDataGenerationConfAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Generation__OwnedDataGenerationConfAssignment_3_in_rule__Generation__Group__3__Impl2011);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1033:1: rule__Generation__Group__4 : rule__Generation__Group__4__Impl rule__Generation__Group__5 ;
    public final void rule__Generation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1037:1: ( rule__Generation__Group__4__Impl rule__Generation__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1038:2: rule__Generation__Group__4__Impl rule__Generation__Group__5
            {
            pushFollow(FOLLOW_rule__Generation__Group__4__Impl_in_rule__Generation__Group__42042);
            rule__Generation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generation__Group__5_in_rule__Generation__Group__42045);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1045:1: rule__Generation__Group__4__Impl : ( ( rule__Generation__OwnedExtensionGenConfAssignment_4 )? ) ;
    public final void rule__Generation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1049:1: ( ( ( rule__Generation__OwnedExtensionGenConfAssignment_4 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1050:1: ( ( rule__Generation__OwnedExtensionGenConfAssignment_4 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1050:1: ( ( rule__Generation__OwnedExtensionGenConfAssignment_4 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1051:1: ( rule__Generation__OwnedExtensionGenConfAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getOwnedExtensionGenConfAssignment_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1052:1: ( rule__Generation__OwnedExtensionGenConfAssignment_4 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1052:2: rule__Generation__OwnedExtensionGenConfAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Generation__OwnedExtensionGenConfAssignment_4_in_rule__Generation__Group__4__Impl2072);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1062:1: rule__Generation__Group__5 : rule__Generation__Group__5__Impl ;
    public final void rule__Generation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1066:1: ( rule__Generation__Group__5__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1067:2: rule__Generation__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Generation__Group__5__Impl_in_rule__Generation__Group__52103);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1073:1: rule__Generation__Group__5__Impl : ( '}' ) ;
    public final void rule__Generation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1077:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1078:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1078:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1079:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,16,FOLLOW_16_in_rule__Generation__Group__5__Impl2131); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1104:1: rule__GData__Group__0 : rule__GData__Group__0__Impl rule__GData__Group__1 ;
    public final void rule__GData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1108:1: ( rule__GData__Group__0__Impl rule__GData__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1109:2: rule__GData__Group__0__Impl rule__GData__Group__1
            {
            pushFollow(FOLLOW_rule__GData__Group__0__Impl_in_rule__GData__Group__02174);
            rule__GData__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group__1_in_rule__GData__Group__02177);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1116:1: rule__GData__Group__0__Impl : ( () ) ;
    public final void rule__GData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1120:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1121:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1121:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1122:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGDataAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1123:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1125:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1135:1: rule__GData__Group__1 : rule__GData__Group__1__Impl rule__GData__Group__2 ;
    public final void rule__GData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1139:1: ( rule__GData__Group__1__Impl rule__GData__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1140:2: rule__GData__Group__1__Impl rule__GData__Group__2
            {
            pushFollow(FOLLOW_rule__GData__Group__1__Impl_in_rule__GData__Group__12235);
            rule__GData__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group__2_in_rule__GData__Group__12238);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1147:1: rule__GData__Group__1__Impl : ( 'data' ) ;
    public final void rule__GData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1151:1: ( ( 'data' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1152:1: ( 'data' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1152:1: ( 'data' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1153:1: 'data'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getDataKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__GData__Group__1__Impl2266); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1166:1: rule__GData__Group__2 : rule__GData__Group__2__Impl rule__GData__Group__3 ;
    public final void rule__GData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1170:1: ( rule__GData__Group__2__Impl rule__GData__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1171:2: rule__GData__Group__2__Impl rule__GData__Group__3
            {
            pushFollow(FOLLOW_rule__GData__Group__2__Impl_in_rule__GData__Group__22297);
            rule__GData__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group__3_in_rule__GData__Group__22300);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1178:1: rule__GData__Group__2__Impl : ( '(' ) ;
    public final void rule__GData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1182:1: ( ( '(' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1183:1: ( '(' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1183:1: ( '(' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1184:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__GData__Group__2__Impl2328); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1197:1: rule__GData__Group__3 : rule__GData__Group__3__Impl rule__GData__Group__4 ;
    public final void rule__GData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1201:1: ( rule__GData__Group__3__Impl rule__GData__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1202:2: rule__GData__Group__3__Impl rule__GData__Group__4
            {
            pushFollow(FOLLOW_rule__GData__Group__3__Impl_in_rule__GData__Group__32359);
            rule__GData__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group__4_in_rule__GData__Group__32362);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1209:1: rule__GData__Group__3__Impl : ( ( rule__GData__Group_3__0 ) ) ;
    public final void rule__GData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1213:1: ( ( ( rule__GData__Group_3__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1214:1: ( ( rule__GData__Group_3__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1214:1: ( ( rule__GData__Group_3__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1215:1: ( rule__GData__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1216:1: ( rule__GData__Group_3__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1216:2: rule__GData__Group_3__0
            {
            pushFollow(FOLLOW_rule__GData__Group_3__0_in_rule__GData__Group__3__Impl2389);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1226:1: rule__GData__Group__4 : rule__GData__Group__4__Impl ;
    public final void rule__GData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1230:1: ( rule__GData__Group__4__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1231:2: rule__GData__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group__4__Impl_in_rule__GData__Group__42419);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1237:1: rule__GData__Group__4__Impl : ( ')' ) ;
    public final void rule__GData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1241:1: ( ( ')' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1242:1: ( ')' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1242:1: ( ')' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1243:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,23,FOLLOW_23_in_rule__GData__Group__4__Impl2447); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1266:1: rule__GData__Group_3__0 : rule__GData__Group_3__0__Impl rule__GData__Group_3__1 ;
    public final void rule__GData__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1270:1: ( rule__GData__Group_3__0__Impl rule__GData__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1271:2: rule__GData__Group_3__0__Impl rule__GData__Group_3__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3__0__Impl_in_rule__GData__Group_3__02488);
            rule__GData__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3__1_in_rule__GData__Group_3__02491);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1278:1: rule__GData__Group_3__0__Impl : ( ( rule__GData__Group_3_0__0 )? ) ;
    public final void rule__GData__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1282:1: ( ( ( rule__GData__Group_3_0__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1283:1: ( ( rule__GData__Group_3_0__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1283:1: ( ( rule__GData__Group_3_0__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1284:1: ( rule__GData__Group_3_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1285:1: ( rule__GData__Group_3_0__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1285:2: rule__GData__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_0__0_in_rule__GData__Group_3__0__Impl2518);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1295:1: rule__GData__Group_3__1 : rule__GData__Group_3__1__Impl rule__GData__Group_3__2 ;
    public final void rule__GData__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1299:1: ( rule__GData__Group_3__1__Impl rule__GData__Group_3__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1300:2: rule__GData__Group_3__1__Impl rule__GData__Group_3__2
            {
            pushFollow(FOLLOW_rule__GData__Group_3__1__Impl_in_rule__GData__Group_3__12549);
            rule__GData__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3__2_in_rule__GData__Group_3__12552);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1307:1: rule__GData__Group_3__1__Impl : ( ( rule__GData__Group_3_1__0 )? ) ;
    public final void rule__GData__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1311:1: ( ( ( rule__GData__Group_3_1__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1312:1: ( ( rule__GData__Group_3_1__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1312:1: ( ( rule__GData__Group_3_1__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1313:1: ( rule__GData__Group_3_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1314:1: ( rule__GData__Group_3_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1314:2: rule__GData__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_1__0_in_rule__GData__Group_3__1__Impl2579);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1324:1: rule__GData__Group_3__2 : rule__GData__Group_3__2__Impl rule__GData__Group_3__3 ;
    public final void rule__GData__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1328:1: ( rule__GData__Group_3__2__Impl rule__GData__Group_3__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1329:2: rule__GData__Group_3__2__Impl rule__GData__Group_3__3
            {
            pushFollow(FOLLOW_rule__GData__Group_3__2__Impl_in_rule__GData__Group_3__22610);
            rule__GData__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3__3_in_rule__GData__Group_3__22613);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1336:1: rule__GData__Group_3__2__Impl : ( ( rule__GData__Group_3_2__0 )? ) ;
    public final void rule__GData__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1340:1: ( ( ( rule__GData__Group_3_2__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1341:1: ( ( rule__GData__Group_3_2__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1341:1: ( ( rule__GData__Group_3_2__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1342:1: ( rule__GData__Group_3_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1343:1: ( rule__GData__Group_3_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1343:2: rule__GData__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_2__0_in_rule__GData__Group_3__2__Impl2640);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1353:1: rule__GData__Group_3__3 : rule__GData__Group_3__3__Impl rule__GData__Group_3__4 ;
    public final void rule__GData__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1357:1: ( rule__GData__Group_3__3__Impl rule__GData__Group_3__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1358:2: rule__GData__Group_3__3__Impl rule__GData__Group_3__4
            {
            pushFollow(FOLLOW_rule__GData__Group_3__3__Impl_in_rule__GData__Group_3__32671);
            rule__GData__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3__4_in_rule__GData__Group_3__32674);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1365:1: rule__GData__Group_3__3__Impl : ( ( rule__GData__Group_3_3__0 )? ) ;
    public final void rule__GData__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1369:1: ( ( ( rule__GData__Group_3_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1370:1: ( ( rule__GData__Group_3_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1370:1: ( ( rule__GData__Group_3_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1371:1: ( rule__GData__Group_3_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1372:1: ( rule__GData__Group_3_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1372:2: rule__GData__Group_3_3__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_3__0_in_rule__GData__Group_3__3__Impl2701);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1382:1: rule__GData__Group_3__4 : rule__GData__Group_3__4__Impl rule__GData__Group_3__5 ;
    public final void rule__GData__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1386:1: ( rule__GData__Group_3__4__Impl rule__GData__Group_3__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1387:2: rule__GData__Group_3__4__Impl rule__GData__Group_3__5
            {
            pushFollow(FOLLOW_rule__GData__Group_3__4__Impl_in_rule__GData__Group_3__42732);
            rule__GData__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3__5_in_rule__GData__Group_3__42735);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1394:1: rule__GData__Group_3__4__Impl : ( ( rule__GData__Group_3_4__0 )? ) ;
    public final void rule__GData__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1398:1: ( ( ( rule__GData__Group_3_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1399:1: ( ( rule__GData__Group_3_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1399:1: ( ( rule__GData__Group_3_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1400:1: ( rule__GData__Group_3_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1401:1: ( rule__GData__Group_3_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1401:2: rule__GData__Group_3_4__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_4__0_in_rule__GData__Group_3__4__Impl2762);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1411:1: rule__GData__Group_3__5 : rule__GData__Group_3__5__Impl ;
    public final void rule__GData__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1415:1: ( rule__GData__Group_3__5__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1416:2: rule__GData__Group_3__5__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3__5__Impl_in_rule__GData__Group_3__52793);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1422:1: rule__GData__Group_3__5__Impl : ( ( rule__GData__Group_3_5__0 )? ) ;
    public final void rule__GData__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1426:1: ( ( ( rule__GData__Group_3_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1427:1: ( ( rule__GData__Group_3_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1427:1: ( ( rule__GData__Group_3_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1428:1: ( rule__GData__Group_3_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1429:1: ( rule__GData__Group_3_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1429:2: rule__GData__Group_3_5__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_5__0_in_rule__GData__Group_3__5__Impl2820);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1451:1: rule__GData__Group_3_0__0 : rule__GData__Group_3_0__0__Impl rule__GData__Group_3_0__1 ;
    public final void rule__GData__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1455:1: ( rule__GData__Group_3_0__0__Impl rule__GData__Group_3_0__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1456:2: rule__GData__Group_3_0__0__Impl rule__GData__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_0__0__Impl_in_rule__GData__Group_3_0__02863);
            rule__GData__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_0__1_in_rule__GData__Group_3_0__02866);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1463:1: rule__GData__Group_3_0__0__Impl : ( 'Model:' ) ;
    public final void rule__GData__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1467:1: ( ( 'Model:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1468:1: ( 'Model:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1468:1: ( 'Model:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1469:1: 'Model:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getModelKeyword_3_0_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__GData__Group_3_0__0__Impl2894); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1482:1: rule__GData__Group_3_0__1 : rule__GData__Group_3_0__1__Impl ;
    public final void rule__GData__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1486:1: ( rule__GData__Group_3_0__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1487:2: rule__GData__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_0__1__Impl_in_rule__GData__Group_3_0__12925);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1493:1: rule__GData__Group_3_0__1__Impl : ( ( rule__GData__ModelAssignment_3_0_1 ) ) ;
    public final void rule__GData__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1497:1: ( ( ( rule__GData__ModelAssignment_3_0_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1498:1: ( ( rule__GData__ModelAssignment_3_0_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1498:1: ( ( rule__GData__ModelAssignment_3_0_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1499:1: ( rule__GData__ModelAssignment_3_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getModelAssignment_3_0_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1500:1: ( rule__GData__ModelAssignment_3_0_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1500:2: rule__GData__ModelAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__GData__ModelAssignment_3_0_1_in_rule__GData__Group_3_0__1__Impl2952);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1514:1: rule__GData__Group_3_1__0 : rule__GData__Group_3_1__0__Impl rule__GData__Group_3_1__1 ;
    public final void rule__GData__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1518:1: ( rule__GData__Group_3_1__0__Impl rule__GData__Group_3_1__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1519:2: rule__GData__Group_3_1__0__Impl rule__GData__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_1__0__Impl_in_rule__GData__Group_3_1__02986);
            rule__GData__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_1__1_in_rule__GData__Group_3_1__02989);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1526:1: rule__GData__Group_3_1__0__Impl : ( 'Edit:' ) ;
    public final void rule__GData__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1530:1: ( ( 'Edit:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1531:1: ( 'Edit:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1531:1: ( 'Edit:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1532:1: 'Edit:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditKeyword_3_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__GData__Group_3_1__0__Impl3017); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1545:1: rule__GData__Group_3_1__1 : rule__GData__Group_3_1__1__Impl ;
    public final void rule__GData__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1549:1: ( rule__GData__Group_3_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1550:2: rule__GData__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_1__1__Impl_in_rule__GData__Group_3_1__13048);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1556:1: rule__GData__Group_3_1__1__Impl : ( ( rule__GData__EditAssignment_3_1_1 ) ) ;
    public final void rule__GData__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1560:1: ( ( ( rule__GData__EditAssignment_3_1_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1561:1: ( ( rule__GData__EditAssignment_3_1_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1561:1: ( ( rule__GData__EditAssignment_3_1_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1562:1: ( rule__GData__EditAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditAssignment_3_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1563:1: ( rule__GData__EditAssignment_3_1_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1563:2: rule__GData__EditAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__GData__EditAssignment_3_1_1_in_rule__GData__Group_3_1__1__Impl3075);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1577:1: rule__GData__Group_3_2__0 : rule__GData__Group_3_2__0__Impl rule__GData__Group_3_2__1 ;
    public final void rule__GData__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1581:1: ( rule__GData__Group_3_2__0__Impl rule__GData__Group_3_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1582:2: rule__GData__Group_3_2__0__Impl rule__GData__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_2__0__Impl_in_rule__GData__Group_3_2__03109);
            rule__GData__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_2__1_in_rule__GData__Group_3_2__03112);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1589:1: rule__GData__Group_3_2__0__Impl : ( 'Editor:' ) ;
    public final void rule__GData__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1593:1: ( ( 'Editor:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1594:1: ( 'Editor:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1594:1: ( 'Editor:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1595:1: 'Editor:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditorKeyword_3_2_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__GData__Group_3_2__0__Impl3140); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1608:1: rule__GData__Group_3_2__1 : rule__GData__Group_3_2__1__Impl ;
    public final void rule__GData__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1612:1: ( rule__GData__Group_3_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1613:2: rule__GData__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_2__1__Impl_in_rule__GData__Group_3_2__13171);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1619:1: rule__GData__Group_3_2__1__Impl : ( ( rule__GData__EditorAssignment_3_2_1 ) ) ;
    public final void rule__GData__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1623:1: ( ( ( rule__GData__EditorAssignment_3_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1624:1: ( ( rule__GData__EditorAssignment_3_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1624:1: ( ( rule__GData__EditorAssignment_3_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1625:1: ( rule__GData__EditorAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditorAssignment_3_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1626:1: ( rule__GData__EditorAssignment_3_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1626:2: rule__GData__EditorAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__GData__EditorAssignment_3_2_1_in_rule__GData__Group_3_2__1__Impl3198);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1640:1: rule__GData__Group_3_3__0 : rule__GData__Group_3_3__0__Impl rule__GData__Group_3_3__1 ;
    public final void rule__GData__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1644:1: ( rule__GData__Group_3_3__0__Impl rule__GData__Group_3_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1645:2: rule__GData__Group_3_3__0__Impl rule__GData__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_3__0__Impl_in_rule__GData__Group_3_3__03232);
            rule__GData__Group_3_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_3__1_in_rule__GData__Group_3_3__03235);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1652:1: rule__GData__Group_3_3__0__Impl : ( 'Test:' ) ;
    public final void rule__GData__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1656:1: ( ( 'Test:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1657:1: ( 'Test:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1657:1: ( 'Test:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1658:1: 'Test:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getTestKeyword_3_3_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__GData__Group_3_3__0__Impl3263); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1671:1: rule__GData__Group_3_3__1 : rule__GData__Group_3_3__1__Impl ;
    public final void rule__GData__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1675:1: ( rule__GData__Group_3_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1676:2: rule__GData__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_3__1__Impl_in_rule__GData__Group_3_3__13294);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1682:1: rule__GData__Group_3_3__1__Impl : ( ( rule__GData__TestAssignment_3_3_1 ) ) ;
    public final void rule__GData__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1686:1: ( ( ( rule__GData__TestAssignment_3_3_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1687:1: ( ( rule__GData__TestAssignment_3_3_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1687:1: ( ( rule__GData__TestAssignment_3_3_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1688:1: ( rule__GData__TestAssignment_3_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getTestAssignment_3_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1689:1: ( rule__GData__TestAssignment_3_3_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1689:2: rule__GData__TestAssignment_3_3_1
            {
            pushFollow(FOLLOW_rule__GData__TestAssignment_3_3_1_in_rule__GData__Group_3_3__1__Impl3321);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1703:1: rule__GData__Group_3_4__0 : rule__GData__Group_3_4__0__Impl rule__GData__Group_3_4__1 ;
    public final void rule__GData__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1707:1: ( rule__GData__Group_3_4__0__Impl rule__GData__Group_3_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1708:2: rule__GData__Group_3_4__0__Impl rule__GData__Group_3_4__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_4__0__Impl_in_rule__GData__Group_3_4__03355);
            rule__GData__Group_3_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_4__1_in_rule__GData__Group_3_4__03358);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1715:1: rule__GData__Group_3_4__0__Impl : ( 'Javadoc:' ) ;
    public final void rule__GData__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1719:1: ( ( 'Javadoc:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1720:1: ( 'Javadoc:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1720:1: ( 'Javadoc:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1721:1: 'Javadoc:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getJavadocKeyword_3_4_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__GData__Group_3_4__0__Impl3386); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1734:1: rule__GData__Group_3_4__1 : rule__GData__Group_3_4__1__Impl ;
    public final void rule__GData__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1738:1: ( rule__GData__Group_3_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1739:2: rule__GData__Group_3_4__1__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_4__1__Impl_in_rule__GData__Group_3_4__13417);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1745:1: rule__GData__Group_3_4__1__Impl : ( ( rule__GData__JavaDocAssignment_3_4_1 ) ) ;
    public final void rule__GData__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1749:1: ( ( ( rule__GData__JavaDocAssignment_3_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1750:1: ( ( rule__GData__JavaDocAssignment_3_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1750:1: ( ( rule__GData__JavaDocAssignment_3_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1751:1: ( rule__GData__JavaDocAssignment_3_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getJavaDocAssignment_3_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1752:1: ( rule__GData__JavaDocAssignment_3_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1752:2: rule__GData__JavaDocAssignment_3_4_1
            {
            pushFollow(FOLLOW_rule__GData__JavaDocAssignment_3_4_1_in_rule__GData__Group_3_4__1__Impl3444);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1766:1: rule__GData__Group_3_5__0 : rule__GData__Group_3_5__0__Impl rule__GData__Group_3_5__1 ;
    public final void rule__GData__Group_3_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1770:1: ( rule__GData__Group_3_5__0__Impl rule__GData__Group_3_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1771:2: rule__GData__Group_3_5__0__Impl rule__GData__Group_3_5__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_5__0__Impl_in_rule__GData__Group_3_5__03478);
            rule__GData__Group_3_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_5__1_in_rule__GData__Group_3_5__03481);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1778:1: rule__GData__Group_3_5__0__Impl : ( 'OverwriteEcore:' ) ;
    public final void rule__GData__Group_3_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1782:1: ( ( 'OverwriteEcore:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1783:1: ( 'OverwriteEcore:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1783:1: ( 'OverwriteEcore:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1784:1: 'OverwriteEcore:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getOverwriteEcoreKeyword_3_5_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__GData__Group_3_5__0__Impl3509); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1797:1: rule__GData__Group_3_5__1 : rule__GData__Group_3_5__1__Impl ;
    public final void rule__GData__Group_3_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1801:1: ( rule__GData__Group_3_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1802:2: rule__GData__Group_3_5__1__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_5__1__Impl_in_rule__GData__Group_3_5__13540);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1808:1: rule__GData__Group_3_5__1__Impl : ( ( rule__GData__OverwriteEcoreAssignment_3_5_1 ) ) ;
    public final void rule__GData__Group_3_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1812:1: ( ( ( rule__GData__OverwriteEcoreAssignment_3_5_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1813:1: ( ( rule__GData__OverwriteEcoreAssignment_3_5_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1813:1: ( ( rule__GData__OverwriteEcoreAssignment_3_5_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1814:1: ( rule__GData__OverwriteEcoreAssignment_3_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getOverwriteEcoreAssignment_3_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1815:1: ( rule__GData__OverwriteEcoreAssignment_3_5_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1815:2: rule__GData__OverwriteEcoreAssignment_3_5_1
            {
            pushFollow(FOLLOW_rule__GData__OverwriteEcoreAssignment_3_5_1_in_rule__GData__Group_3_5__1__Impl3567);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1829:1: rule__DiagramGenerationConfiguration__Group__0 : rule__DiagramGenerationConfiguration__Group__0__Impl rule__DiagramGenerationConfiguration__Group__1 ;
    public final void rule__DiagramGenerationConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1833:1: ( rule__DiagramGenerationConfiguration__Group__0__Impl rule__DiagramGenerationConfiguration__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1834:2: rule__DiagramGenerationConfiguration__Group__0__Impl rule__DiagramGenerationConfiguration__Group__1
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__0__Impl_in_rule__DiagramGenerationConfiguration__Group__03601);
            rule__DiagramGenerationConfiguration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__1_in_rule__DiagramGenerationConfiguration__Group__03604);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1841:1: rule__DiagramGenerationConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__DiagramGenerationConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1845:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1846:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1846:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1847:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getDiagramGenerationConfigurationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1848:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1850:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1860:1: rule__DiagramGenerationConfiguration__Group__1 : rule__DiagramGenerationConfiguration__Group__1__Impl rule__DiagramGenerationConfiguration__Group__2 ;
    public final void rule__DiagramGenerationConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1864:1: ( rule__DiagramGenerationConfiguration__Group__1__Impl rule__DiagramGenerationConfiguration__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1865:2: rule__DiagramGenerationConfiguration__Group__1__Impl rule__DiagramGenerationConfiguration__Group__2
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__1__Impl_in_rule__DiagramGenerationConfiguration__Group__13662);
            rule__DiagramGenerationConfiguration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__2_in_rule__DiagramGenerationConfiguration__Group__13665);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1872:1: rule__DiagramGenerationConfiguration__Group__1__Impl : ( 'diagram' ) ;
    public final void rule__DiagramGenerationConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1876:1: ( ( 'diagram' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1877:1: ( 'diagram' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1877:1: ( 'diagram' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1878:1: 'diagram'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getDiagramKeyword_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__DiagramGenerationConfiguration__Group__1__Impl3693); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1891:1: rule__DiagramGenerationConfiguration__Group__2 : rule__DiagramGenerationConfiguration__Group__2__Impl rule__DiagramGenerationConfiguration__Group__3 ;
    public final void rule__DiagramGenerationConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1895:1: ( rule__DiagramGenerationConfiguration__Group__2__Impl rule__DiagramGenerationConfiguration__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1896:2: rule__DiagramGenerationConfiguration__Group__2__Impl rule__DiagramGenerationConfiguration__Group__3
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__2__Impl_in_rule__DiagramGenerationConfiguration__Group__23724);
            rule__DiagramGenerationConfiguration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__3_in_rule__DiagramGenerationConfiguration__Group__23727);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1903:1: rule__DiagramGenerationConfiguration__Group__2__Impl : ( '(' ) ;
    public final void rule__DiagramGenerationConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1907:1: ( ( '(' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1908:1: ( '(' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1908:1: ( '(' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1909:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__DiagramGenerationConfiguration__Group__2__Impl3755); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1922:1: rule__DiagramGenerationConfiguration__Group__3 : rule__DiagramGenerationConfiguration__Group__3__Impl rule__DiagramGenerationConfiguration__Group__4 ;
    public final void rule__DiagramGenerationConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1926:1: ( rule__DiagramGenerationConfiguration__Group__3__Impl rule__DiagramGenerationConfiguration__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1927:2: rule__DiagramGenerationConfiguration__Group__3__Impl rule__DiagramGenerationConfiguration__Group__4
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__3__Impl_in_rule__DiagramGenerationConfiguration__Group__33786);
            rule__DiagramGenerationConfiguration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__4_in_rule__DiagramGenerationConfiguration__Group__33789);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1934:1: rule__DiagramGenerationConfiguration__Group__3__Impl : ( ( rule__DiagramGenerationConfiguration__Group_3__0 ) ) ;
    public final void rule__DiagramGenerationConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1938:1: ( ( ( rule__DiagramGenerationConfiguration__Group_3__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1939:1: ( ( rule__DiagramGenerationConfiguration__Group_3__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1939:1: ( ( rule__DiagramGenerationConfiguration__Group_3__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1940:1: ( rule__DiagramGenerationConfiguration__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1941:1: ( rule__DiagramGenerationConfiguration__Group_3__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1941:2: rule__DiagramGenerationConfiguration__Group_3__0
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group_3__0_in_rule__DiagramGenerationConfiguration__Group__3__Impl3816);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1951:1: rule__DiagramGenerationConfiguration__Group__4 : rule__DiagramGenerationConfiguration__Group__4__Impl ;
    public final void rule__DiagramGenerationConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1955:1: ( rule__DiagramGenerationConfiguration__Group__4__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1956:2: rule__DiagramGenerationConfiguration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__4__Impl_in_rule__DiagramGenerationConfiguration__Group__43846);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1962:1: rule__DiagramGenerationConfiguration__Group__4__Impl : ( ')' ) ;
    public final void rule__DiagramGenerationConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1966:1: ( ( ')' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1967:1: ( ')' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1967:1: ( ')' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1968:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,23,FOLLOW_23_in_rule__DiagramGenerationConfiguration__Group__4__Impl3874); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1991:1: rule__DiagramGenerationConfiguration__Group_3__0 : rule__DiagramGenerationConfiguration__Group_3__0__Impl rule__DiagramGenerationConfiguration__Group_3__1 ;
    public final void rule__DiagramGenerationConfiguration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1995:1: ( rule__DiagramGenerationConfiguration__Group_3__0__Impl rule__DiagramGenerationConfiguration__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1996:2: rule__DiagramGenerationConfiguration__Group_3__0__Impl rule__DiagramGenerationConfiguration__Group_3__1
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group_3__0__Impl_in_rule__DiagramGenerationConfiguration__Group_3__03915);
            rule__DiagramGenerationConfiguration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group_3__1_in_rule__DiagramGenerationConfiguration__Group_3__03918);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2003:1: rule__DiagramGenerationConfiguration__Group_3__0__Impl : ( 'overwriteOdesign:' ) ;
    public final void rule__DiagramGenerationConfiguration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2007:1: ( ( 'overwriteOdesign:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2008:1: ( 'overwriteOdesign:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2008:1: ( 'overwriteOdesign:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2009:1: 'overwriteOdesign:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteOdesignKeyword_3_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__DiagramGenerationConfiguration__Group_3__0__Impl3946); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2022:1: rule__DiagramGenerationConfiguration__Group_3__1 : rule__DiagramGenerationConfiguration__Group_3__1__Impl ;
    public final void rule__DiagramGenerationConfiguration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2026:1: ( rule__DiagramGenerationConfiguration__Group_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2027:2: rule__DiagramGenerationConfiguration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group_3__1__Impl_in_rule__DiagramGenerationConfiguration__Group_3__13977);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2033:1: rule__DiagramGenerationConfiguration__Group_3__1__Impl : ( ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1 ) ) ;
    public final void rule__DiagramGenerationConfiguration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2037:1: ( ( ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2038:1: ( ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2038:1: ( ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2039:1: ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteVSMAssignment_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2040:1: ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2040:2: rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1_in_rule__DiagramGenerationConfiguration__Group_3__1__Impl4004);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2054:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2058:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2059:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__04038);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04041);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2066:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2070:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2071:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2071:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2072:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl4068); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2083:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2087:1: ( rule__FQN__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2088:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14097);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2094:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2098:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2099:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2099:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2100:1: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2101:1: ( rule__FQN__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2101:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4124);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2115:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2119:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2120:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__04159);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__04162);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2127:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2131:1: ( ( '.' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2132:1: ( '.' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2132:1: ( '.' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2133:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__FQN__Group_1__0__Impl4190); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2146:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2150:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2151:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__14221);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2157:1: rule__FQN__Group_1__1__Impl : ( ( RULE_ID ) ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2161:1: ( ( ( RULE_ID ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2162:1: ( ( RULE_ID ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2162:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2163:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2164:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2164:3: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl4249); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2179:1: rule__Configuration__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__Configuration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2183:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2184:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2184:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2185:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getNameFQNParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Configuration__NameAssignment_24288);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2194:1: rule__Configuration__VpConfigurationElementsAssignment_4 : ( ruleConfigurationElement ) ;
    public final void rule__Configuration__VpConfigurationElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2198:1: ( ( ruleConfigurationElement ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2199:1: ( ruleConfigurationElement )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2199:1: ( ruleConfigurationElement )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2200:1: ruleConfigurationElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getVpConfigurationElementsConfigurationElementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleConfigurationElement_in_rule__Configuration__VpConfigurationElementsAssignment_44319);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2209:1: rule__TargetApplication__TypeAssignment_2 : ( ruleTargetApplicationType ) ;
    public final void rule__TargetApplication__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2213:1: ( ( ruleTargetApplicationType ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2214:1: ( ruleTargetApplicationType )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2214:1: ( ruleTargetApplicationType )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2215:1: ruleTargetApplicationType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationAccess().getTypeTargetApplicationTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleTargetApplicationType_in_rule__TargetApplication__TypeAssignment_24350);
            ruleTargetApplicationType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetApplicationAccess().getTypeTargetApplicationTypeParserRuleCall_2_0()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2224:1: rule__GenerationConfiguration__ProjectNameAssignment_2 : ( ruleFQN ) ;
    public final void rule__GenerationConfiguration__ProjectNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2228:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2229:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2229:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2230:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getProjectNameFQNParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__GenerationConfiguration__ProjectNameAssignment_24381);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2239:1: rule__GenerationConfiguration__NsuriAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__GenerationConfiguration__NsuriAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2243:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2244:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2244:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2245:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getNsuriSTRINGTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GenerationConfiguration__NsuriAssignment_3_14412); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2254:1: rule__Generation__OwnedDataGenerationConfAssignment_3 : ( ruleGData ) ;
    public final void rule__Generation__OwnedDataGenerationConfAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2258:1: ( ( ruleGData ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2259:1: ( ruleGData )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2259:1: ( ruleGData )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2260:1: ruleGData
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getOwnedDataGenerationConfGDataParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleGData_in_rule__Generation__OwnedDataGenerationConfAssignment_34443);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2269:1: rule__Generation__OwnedExtensionGenConfAssignment_4 : ( ruleExtensionGeneratrionConfiguration ) ;
    public final void rule__Generation__OwnedExtensionGenConfAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2273:1: ( ( ruleExtensionGeneratrionConfiguration ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2274:1: ( ruleExtensionGeneratrionConfiguration )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2274:1: ( ruleExtensionGeneratrionConfiguration )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2275:1: ruleExtensionGeneratrionConfiguration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getOwnedExtensionGenConfExtensionGeneratrionConfigurationParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleExtensionGeneratrionConfiguration_in_rule__Generation__OwnedExtensionGenConfAssignment_44474);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2284:1: rule__GData__ModelAssignment_3_0_1 : ( ruleEBoolean ) ;
    public final void rule__GData__ModelAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2288:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2289:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2289:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2290:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getModelEBooleanParserRuleCall_3_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__ModelAssignment_3_0_14505);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2299:1: rule__GData__EditAssignment_3_1_1 : ( ruleEBoolean ) ;
    public final void rule__GData__EditAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2303:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2304:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2304:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2305:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditEBooleanParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__EditAssignment_3_1_14536);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2314:1: rule__GData__EditorAssignment_3_2_1 : ( ruleEBoolean ) ;
    public final void rule__GData__EditorAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2318:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2319:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2319:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2320:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditorEBooleanParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__EditorAssignment_3_2_14567);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2329:1: rule__GData__TestAssignment_3_3_1 : ( ruleEBoolean ) ;
    public final void rule__GData__TestAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2333:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2334:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2334:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2335:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getTestEBooleanParserRuleCall_3_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__TestAssignment_3_3_14598);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2344:1: rule__GData__JavaDocAssignment_3_4_1 : ( ruleEBoolean ) ;
    public final void rule__GData__JavaDocAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2348:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2349:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2349:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2350:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getJavaDocEBooleanParserRuleCall_3_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__JavaDocAssignment_3_4_14629);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2359:1: rule__GData__OverwriteEcoreAssignment_3_5_1 : ( ruleEBoolean ) ;
    public final void rule__GData__OverwriteEcoreAssignment_3_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2363:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2364:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2364:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2365:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getOverwriteEcoreEBooleanParserRuleCall_3_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__OverwriteEcoreAssignment_3_5_14660);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2374:1: rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2378:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2379:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2379:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2380:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteVSMEBooleanParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_14691);
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
    public static final BitSet FOLLOW_ruleTargetApplicationType_in_entryRuleTargetApplicationType546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetApplicationType553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleTargetApplicationType580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetApplication_in_rule__ConfigurationElement__Alternatives741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationConfiguration_in_rule__ConfigurationElement__Alternatives758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneration_in_rule__ConfigurationElement__Alternatives775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EBoolean__Alternatives809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EBoolean__Alternatives829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__0861 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__0864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__1922 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Configuration__Group__1__Impl953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__2984 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__3_in_rule__Configuration__Group__2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__NameAssignment_2_in_rule__Configuration__Group__2__Impl1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__3__Impl_in_rule__Configuration__Group__31044 = new BitSet(new long[]{0x0000000000170000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__4_in_rule__Configuration__Group__31047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Configuration__Group__3__Impl1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__4__Impl_in_rule__Configuration__Group__41106 = new BitSet(new long[]{0x0000000000170000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__5_in_rule__Configuration__Group__41109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__VpConfigurationElementsAssignment_4_in_rule__Configuration__Group__4__Impl1136 = new BitSet(new long[]{0x0000000000160002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__5__Impl_in_rule__Configuration__Group__51167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Configuration__Group__5__Impl1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetApplication__Group__0__Impl_in_rule__TargetApplication__Group__01238 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__TargetApplication__Group__1_in_rule__TargetApplication__Group__01241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetApplication__Group__1__Impl_in_rule__TargetApplication__Group__11299 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__TargetApplication__Group__2_in_rule__TargetApplication__Group__11302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TargetApplication__Group__1__Impl1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetApplication__Group__2__Impl_in_rule__TargetApplication__Group__21361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetApplication__TypeAssignment_2_in_rule__TargetApplication__Group__2__Impl1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__0__Impl_in_rule__GenerationConfiguration__Group__01424 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__1_in_rule__GenerationConfiguration__Group__01427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__1__Impl_in_rule__GenerationConfiguration__Group__11485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__2_in_rule__GenerationConfiguration__Group__11488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__GenerationConfiguration__Group__1__Impl1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__2__Impl_in_rule__GenerationConfiguration__Group__21547 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__3_in_rule__GenerationConfiguration__Group__21550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__ProjectNameAssignment_2_in_rule__GenerationConfiguration__Group__2__Impl1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__3__Impl_in_rule__GenerationConfiguration__Group__31607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group_3__0_in_rule__GenerationConfiguration__Group__3__Impl1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group_3__0__Impl_in_rule__GenerationConfiguration__Group_3__01673 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group_3__1_in_rule__GenerationConfiguration__Group_3__01676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__GenerationConfiguration__Group_3__0__Impl1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group_3__1__Impl_in_rule__GenerationConfiguration__Group_3__11735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__NsuriAssignment_3_1_in_rule__GenerationConfiguration__Group_3__1__Impl1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__0__Impl_in_rule__Generation__Group__01796 = new BitSet(new long[]{0x0000000000160000L});
    public static final BitSet FOLLOW_rule__Generation__Group__1_in_rule__Generation__Group__01799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__1__Impl_in_rule__Generation__Group__11857 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Generation__Group__2_in_rule__Generation__Group__11860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Generation__Group__1__Impl1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__2__Impl_in_rule__Generation__Group__21919 = new BitSet(new long[]{0x0000000040210000L});
    public static final BitSet FOLLOW_rule__Generation__Group__3_in_rule__Generation__Group__21922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Generation__Group__2__Impl1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__3__Impl_in_rule__Generation__Group__31981 = new BitSet(new long[]{0x0000000040210000L});
    public static final BitSet FOLLOW_rule__Generation__Group__4_in_rule__Generation__Group__31984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__OwnedDataGenerationConfAssignment_3_in_rule__Generation__Group__3__Impl2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__4__Impl_in_rule__Generation__Group__42042 = new BitSet(new long[]{0x0000000040210000L});
    public static final BitSet FOLLOW_rule__Generation__Group__5_in_rule__Generation__Group__42045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__OwnedExtensionGenConfAssignment_4_in_rule__Generation__Group__4__Impl2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__5__Impl_in_rule__Generation__Group__52103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Generation__Group__5__Impl2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group__0__Impl_in_rule__GData__Group__02174 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__GData__Group__1_in_rule__GData__Group__02177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group__1__Impl_in_rule__GData__Group__12235 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__GData__Group__2_in_rule__GData__Group__12238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__GData__Group__1__Impl2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group__2__Impl_in_rule__GData__Group__22297 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_rule__GData__Group__3_in_rule__GData__Group__22300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__GData__Group__2__Impl2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group__3__Impl_in_rule__GData__Group__32359 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__GData__Group__4_in_rule__GData__Group__32362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__0_in_rule__GData__Group__3__Impl2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group__4__Impl_in_rule__GData__Group__42419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__GData__Group__4__Impl2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__0__Impl_in_rule__GData__Group_3__02488 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_rule__GData__Group_3__1_in_rule__GData__Group_3__02491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_0__0_in_rule__GData__Group_3__0__Impl2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__1__Impl_in_rule__GData__Group_3__12549 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_rule__GData__Group_3__2_in_rule__GData__Group_3__12552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_1__0_in_rule__GData__Group_3__1__Impl2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__2__Impl_in_rule__GData__Group_3__22610 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_rule__GData__Group_3__3_in_rule__GData__Group_3__22613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_2__0_in_rule__GData__Group_3__2__Impl2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__3__Impl_in_rule__GData__Group_3__32671 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_rule__GData__Group_3__4_in_rule__GData__Group_3__32674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_3__0_in_rule__GData__Group_3__3__Impl2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__4__Impl_in_rule__GData__Group_3__42732 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_rule__GData__Group_3__5_in_rule__GData__Group_3__42735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_4__0_in_rule__GData__Group_3__4__Impl2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__5__Impl_in_rule__GData__Group_3__52793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_5__0_in_rule__GData__Group_3__5__Impl2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_0__0__Impl_in_rule__GData__Group_3_0__02863 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__GData__Group_3_0__1_in_rule__GData__Group_3_0__02866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__GData__Group_3_0__0__Impl2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_0__1__Impl_in_rule__GData__Group_3_0__12925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__ModelAssignment_3_0_1_in_rule__GData__Group_3_0__1__Impl2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_1__0__Impl_in_rule__GData__Group_3_1__02986 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__GData__Group_3_1__1_in_rule__GData__Group_3_1__02989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__GData__Group_3_1__0__Impl3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_1__1__Impl_in_rule__GData__Group_3_1__13048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__EditAssignment_3_1_1_in_rule__GData__Group_3_1__1__Impl3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_2__0__Impl_in_rule__GData__Group_3_2__03109 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__GData__Group_3_2__1_in_rule__GData__Group_3_2__03112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__GData__Group_3_2__0__Impl3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_2__1__Impl_in_rule__GData__Group_3_2__13171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__EditorAssignment_3_2_1_in_rule__GData__Group_3_2__1__Impl3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_3__0__Impl_in_rule__GData__Group_3_3__03232 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__GData__Group_3_3__1_in_rule__GData__Group_3_3__03235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__GData__Group_3_3__0__Impl3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_3__1__Impl_in_rule__GData__Group_3_3__13294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__TestAssignment_3_3_1_in_rule__GData__Group_3_3__1__Impl3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_4__0__Impl_in_rule__GData__Group_3_4__03355 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__GData__Group_3_4__1_in_rule__GData__Group_3_4__03358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__GData__Group_3_4__0__Impl3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_4__1__Impl_in_rule__GData__Group_3_4__13417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__JavaDocAssignment_3_4_1_in_rule__GData__Group_3_4__1__Impl3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_5__0__Impl_in_rule__GData__Group_3_5__03478 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__GData__Group_3_5__1_in_rule__GData__Group_3_5__03481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__GData__Group_3_5__0__Impl3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_5__1__Impl_in_rule__GData__Group_3_5__13540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__OverwriteEcoreAssignment_3_5_1_in_rule__GData__Group_3_5__1__Impl3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__0__Impl_in_rule__DiagramGenerationConfiguration__Group__03601 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__1_in_rule__DiagramGenerationConfiguration__Group__03604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__1__Impl_in_rule__DiagramGenerationConfiguration__Group__13662 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__2_in_rule__DiagramGenerationConfiguration__Group__13665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DiagramGenerationConfiguration__Group__1__Impl3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__2__Impl_in_rule__DiagramGenerationConfiguration__Group__23724 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__3_in_rule__DiagramGenerationConfiguration__Group__23727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DiagramGenerationConfiguration__Group__2__Impl3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__3__Impl_in_rule__DiagramGenerationConfiguration__Group__33786 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__4_in_rule__DiagramGenerationConfiguration__Group__33789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group_3__0_in_rule__DiagramGenerationConfiguration__Group__3__Impl3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__4__Impl_in_rule__DiagramGenerationConfiguration__Group__43846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DiagramGenerationConfiguration__Group__4__Impl3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group_3__0__Impl_in_rule__DiagramGenerationConfiguration__Group_3__03915 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group_3__1_in_rule__DiagramGenerationConfiguration__Group_3__03918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__DiagramGenerationConfiguration__Group_3__0__Impl3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group_3__1__Impl_in_rule__DiagramGenerationConfiguration__Group_3__13977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_1_in_rule__DiagramGenerationConfiguration__Group_3__1__Impl4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__04038 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4124 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__04159 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__04162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FQN__Group_1__0__Impl4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__14221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Configuration__NameAssignment_24288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_rule__Configuration__VpConfigurationElementsAssignment_44319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetApplicationType_in_rule__TargetApplication__TypeAssignment_24350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__GenerationConfiguration__ProjectNameAssignment_24381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GenerationConfiguration__NsuriAssignment_3_14412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGData_in_rule__Generation__OwnedDataGenerationConfAssignment_34443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionGeneratrionConfiguration_in_rule__Generation__OwnedExtensionGenConfAssignment_44474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__ModelAssignment_3_0_14505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__EditAssignment_3_1_14536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__EditorAssignment_3_2_14567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__TestAssignment_3_3_14598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__JavaDocAssignment_3_4_14629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__OverwriteEcoreAssignment_3_5_14660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_14691 = new BitSet(new long[]{0x0000000000000002L});

}
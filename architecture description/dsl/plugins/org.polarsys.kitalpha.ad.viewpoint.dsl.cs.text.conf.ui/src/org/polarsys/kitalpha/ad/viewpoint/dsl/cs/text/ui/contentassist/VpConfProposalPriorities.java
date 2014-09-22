package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist;

import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.ui.editor.contentassist.ContentProposalPriorities;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpconfGrammarAccess;

import com.google.inject.Inject;

public class VpConfProposalPriorities extends ContentProposalPriorities {
	
	@Inject
	private IGrammarAccess access;
	
	private static final int confDataModelPriority 					= 550;
	private static final int confDataEditPriority					= 500;
	private static final int confDataEditorPriority					= 450;
	private static final int confDataTestPriority					= 400;
	private static final int confDataJavaDocPriority				= 350;
	private static final int confDataOverwriteEcore					= 300;
	
	private static final int confDiagramOverwriteOdesign			= 200;
	
	private static final int confDocumentationEcoreToHtmlPriority	= 100;
	
	
	public void adjustKeywordPriority(ICompletionProposal proposal,
			String prefix){
		//Default priority
		keywordPriority = 100;
		
		if (access instanceof VpconfGrammarAccess){
			
			boolean affected = false;
			VpconfGrammarAccess grammar = (VpconfGrammarAccess)access;
			
			
			if (!affected && proposal.getDisplayString().matches(grammar.getDocumentationGenerationConfigurationAccess().getEcoreToHtmlKeyword_3_0().getValue())){
				keywordPriority = confDocumentationEcoreToHtmlPriority;
				affected = true;
			}
			
			
			if (!affected && proposal.getDisplayString().matches(grammar.getDiagramGenerationConfigurationAccess().getOverwriteOdesignKeyword_3_0().getValue())){
				keywordPriority = confDiagramOverwriteOdesign;
				affected = true;
			}
			
			if (!affected && proposal.getDisplayString().matches(grammar.getGDataAccess().getOverwriteEcoreKeyword_3_5_0().getValue())){
				keywordPriority = confDataOverwriteEcore;
				affected = true;
			}
			
			if (!affected && proposal.getDisplayString().matches(grammar.getGDataAccess().getJavadocKeyword_3_4_0().getValue())){
				keywordPriority = confDataJavaDocPriority;
				affected = true;
			}
			
			if (!affected && proposal.getDisplayString().matches(grammar.getGDataAccess().getTestKeyword_3_3_0().getValue())){
				keywordPriority = confDataTestPriority;
				affected = true;
			}
			
			if (!affected && proposal.getDisplayString().matches(grammar.getGDataAccess().getEditorKeyword_3_2_0().getValue())){
				keywordPriority = confDataEditorPriority;
				affected = true;
			}
			
			if (!affected && proposal.getDisplayString().matches(grammar.getGDataAccess().getEditKeyword_3_1_0().getValue())){
				keywordPriority = confDataEditPriority;
				affected = true;
			}
			
			if (!affected && proposal.getDisplayString().matches(grammar.getGDataAccess().getModelKeyword_3_0_0().getValue())){
				keywordPriority = confDataModelPriority;
				affected = true;
			}
		}
		adjustPriority(proposal, prefix, keywordPriority);
	}

}

/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist;

import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.ui.editor.contentassist.ContentProposalPriorities;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpconfGrammarAccess;

import com.google.inject.Inject;


/**
 * 
 * @author Faycal ABKA
 *
 */
public class VpConfProposalPriorities extends ContentProposalPriorities {
	
	@Inject
	private IGrammarAccess access;
	
	private static final int confTargetApplicationPriority			= 1000;
	private static final int confProjectPriority   					= 950;
	private static final int confNsURIPriority 						= 900;
	private static final int confViewPriority						= 850;
	private static final int confReleasePriority					= 800;
	private static final int confGenerationPriority					= 750;
	private static final int confDataModelPriority 					= 550;
	private static final int confDataEditPriority					= 500;
	private static final int confDataEditorPriority					= 450;
	private static final int confDataTestPriority					= 400;
	private static final int confDataJavaDocPriority				= 350;
	private static final int confDataOverwriteEcore					= 300;
	private static final int confDiagramOverwriteOdesign			= 200;
	private static final int confDocumentationEcoreToHtmlPriority	= 100;
	
	
	@Override
	public void adjustKeywordPriority(ICompletionProposal proposal,
			String prefix){
		//Default priority
		keywordPriority = 300;
		
		if (access instanceof VpconfGrammarAccess){
			
			boolean affected = false;
			VpconfGrammarAccess grammar = (VpconfGrammarAccess)access;
			
			if (!affected && proposal.getDisplayString().matches(grammar.getTargetApplicationAccess().getTargetKeyword_1().getValue())){
				keywordPriority = confTargetApplicationPriority;
				affected = true;
			}
			
			if (!affected && proposal.getDisplayString().matches(grammar.getGenerationConfigurationAccess().getProjectKeyword_1().getValue())){
				keywordPriority = confProjectPriority;
				affected = true;
			}
			
			if (!affected && proposal.getDisplayString().matches(grammar.getGenerationConfigurationAccess().getNsuriKeyword_3_0().getValue())){
				keywordPriority = confNsURIPriority;
				affected = true;
			}
			
			if (!affected && proposal.getDisplayString().matches(grammar.getViewConfigurationAccess().getViewKeyword_1().getValue())){
				keywordPriority = confViewPriority;
				affected = true;
			}
			

			if (!affected && proposal.getDisplayString().matches(grammar.getReleaseAccess().getReleaseKeyword_1().getValue())){
				keywordPriority = confReleasePriority;
				affected = true;
			}
			
			if (!affected && proposal.getDisplayString().matches(grammar.getGenerationAccess().getGenerationKeyword_1().getValue())){
				keywordPriority = confGenerationPriority;
				affected = true;
			}
			
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

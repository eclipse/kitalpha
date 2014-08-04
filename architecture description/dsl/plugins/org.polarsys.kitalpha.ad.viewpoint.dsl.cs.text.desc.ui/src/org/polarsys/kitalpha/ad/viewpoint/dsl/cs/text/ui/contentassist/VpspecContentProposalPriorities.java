/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist;

import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.ui.editor.contentassist.ContentProposalPriorities;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpspecGrammarAccess;

import com.google.inject.Inject;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpspecContentProposalPriorities extends ContentProposalPriorities {
	
	@Inject
	private IGrammarAccess access;
	
	private static final int descriptionPriority = 760;
	private static final int parentsPriority = 740;
	private static final int dependenciesPriority = 720;
	private static final int useViewpointPriority = 700;
	private static final int useAnyEMFPriority = 680;
	private static final int useDiagramPriority = 660;
	private static final int useWorkspacePriority = 640;
	private static final int useFileSystemPriority = 620;
	private static final int dataPriority = 600;
	private static final int uiPriority = 500;
	private static final int diagramPriority = 400;
	private static final int serviceSetPriority = 300;
	private static final int buildPriority = 200;
	private static final int configurationPriority = 100;

	public void adjustKeywordPriority(ICompletionProposal proposal, String prefix) {
		//Set default priority to 100
		keywordPriority = 100;
		if (access instanceof VpspecGrammarAccess) {
			boolean affected = false;
			VpspecGrammarAccess grammar = (VpspecGrammarAccess) access;
			//Inside Viewpoint
			if (!affected && proposal.getDisplayString().matches(grammar.getViewpointAccess().getDescriptionKeyword_5_0().getValue())) {
				keywordPriority = descriptionPriority;
				affected = true;
			}
			if (!affected && proposal.getDisplayString().matches(grammar.getViewpointAccess().getExtendsKeyword_6_0().getValue())) {
				keywordPriority = parentsPriority;
				affected = true;
			}
			if (!affected && proposal.getDisplayString().matches(grammar.getViewpointAccess().getAggregatesKeyword_7_0().getValue())) {
				keywordPriority = dependenciesPriority;
				affected = true;
			}
			if (!affected && proposal.getDisplayString().matches(grammar.getViewpointAccess().getUseViewpointKeyword_8_0().getValue())){
				keywordPriority = useViewpointPriority;
				affected = true;
			}
			if (!affected && proposal.getDisplayString().matches(grammar.getViewpointAccess().getUseAnyEMFKeyword_9_0().getValue())){
				keywordPriority = useAnyEMFPriority;
				affected = true;
			}
			if (!affected && proposal.getDisplayString().matches(grammar.getViewpointAccess().getUseDiagramKeyword_10_0().getValue())){
				keywordPriority = useDiagramPriority;
				affected = true;
			}
			if (!affected && proposal.getDisplayString().matches(grammar.getViewpointAccess().getUseWorkspaceKeyword_11_0().getValue())){
				keywordPriority = useWorkspacePriority;
				affected = true;
			}
			if (!affected && proposal.getDisplayString().matches(grammar.getViewpointAccess().getUseFilesystemKeyword_12_0().getValue())){
				keywordPriority = useFileSystemPriority;
				affected = true;
			}
			if (!affected && proposal.getDisplayString().matches(grammar.getViewpointAccess().getDataKeyword_13_0().getValue())) {
				keywordPriority = dataPriority;
				affected = true;
			}
			if (!affected && proposal.getDisplayString().matches(grammar.getViewpointAccess().getTypeUIKeyword_14_0_0().getValue())) {
				keywordPriority = uiPriority;
				affected = true;
			}
			if (!affected && proposal.getDisplayString().matches(grammar.getViewpointAccess().getTypeDiagramsKeyword_15_0_0().getValue())) {
				keywordPriority = diagramPriority;
				affected = true;
			}
			if (!affected && proposal.getDisplayString().matches(grammar.getViewpointAccess().getTypeServicesKeyword_16_0_0().getValue())) {
				keywordPriority = serviceSetPriority;
				affected = true;
			}
			if (!affected && proposal.getDisplayString().matches(grammar.getViewpointAccess().getTypeBuildKeyword_17_0_0().getValue())) {
				keywordPriority = buildPriority;
				affected = true;
			}
			if (!affected && proposal.getDisplayString().matches(grammar.getViewpointAccess().getTypeConfigurationKeyword_18_0_0().getValue())) {
				keywordPriority = configurationPriority;
				affected = true;
			}
		}
		adjustPriority(proposal, prefix, keywordPriority);
	}
}

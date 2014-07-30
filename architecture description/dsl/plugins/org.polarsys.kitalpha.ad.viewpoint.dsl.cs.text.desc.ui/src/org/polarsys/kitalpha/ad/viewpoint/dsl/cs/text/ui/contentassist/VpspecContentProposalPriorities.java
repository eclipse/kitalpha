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
/**
 * Copyright (c) THALES, 2012. All rights reserved.
 */
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
	
	private static final int descriptionPriority = 700;
	private static final int parentsPriority = 680;
	private static final int dependenciesPriority = 660;
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
			if (!affected && proposal.getDisplayString().matches(grammar.getViewpointAccess().getDataKeyword_11_0().getValue())) {
				keywordPriority = dataPriority;
				affected = true;
			}
			if (!affected && proposal.getDisplayString().matches(grammar.getViewpointAccess().getTypeUIKeyword_12_0_0().getValue())) {
				keywordPriority = uiPriority;
				affected = true;
			}
			if (!affected && proposal.getDisplayString().matches(grammar.getViewpointAccess().getTypeDiagramsKeyword_13_0_0().getValue())) {
				keywordPriority = diagramPriority;
				affected = true;
			}
			if (!affected && proposal.getDisplayString().matches(grammar.getViewpointAccess().getTypeServicesKeyword_14_0_0().getValue())) {
				keywordPriority = serviceSetPriority;
				affected = true;
			}
			if (!affected && proposal.getDisplayString().matches(grammar.getViewpointAccess().getTypeBuildKeyword_15_0_0().getValue())) {
				keywordPriority = buildPriority;
				affected = true;
			}
			if (!affected && proposal.getDisplayString().matches(grammar.getViewpointAccess().getTypeConfigurationKeyword_16_0_0().getValue())) {
				keywordPriority = configurationPriority;
				affected = true;
			}
		}
		adjustPriority(proposal, prefix, keywordPriority);
	}
}

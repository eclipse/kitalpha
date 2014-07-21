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

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ConfigurationElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Generation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpconfGrammarAccess;

import com.google.inject.Inject;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpconfProposalProvider extends AbstractVpconfProposalProvider {
	
	@Inject
	private IGrammarAccess grammar;
	

	@Override
	public void complete_TargetApplicationType(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		List<String> targetPlatformProposals = TargetApplicationReader.getSupportedModelingEnvironment();
		// Add target platform as proposal
		for (String proposal :targetPlatformProposals) {
			acceptor.accept(createCompletionProposal(proposal, context));
		}
	}
	
	//Forbid many declarations of diagram overwrite.
	@Override
	public void completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,	ICompletionProposalAcceptor acceptor) {
		if (grammar instanceof VpconfGrammarAccess) {
			VpconfGrammarAccess access = (VpconfGrammarAccess) grammar;
			ICompletionProposal proposal = createCompletionProposal(keyword.getValue(), getKeywordDisplayString(keyword), getImage(keyword), contentAssistContext);
			if (proposal == null) {
				return;
			}
			EObject current = contentAssistContext.getCurrentModel();
			
			if (current != null && NodeModelUtils.getNode(current) != null){
				ICompositeNode rootNode = NodeModelUtils.getNode(current).getRootNode();
				EObject root = NodeModelUtils.findActualSemanticObjectFor(rootNode);
				
				if (root !=null){
					
					Configuration configAspect = (Configuration)root;
					Iterator<ConfigurationElement> it = configAspect.getVpConfigurationElements().iterator();
					
					while (it.hasNext()){
						ConfigurationElement ce = it.next();
						if (ce instanceof Generation){
							Generation gen = (Generation)ce;
							if (gen.getOwnedExtensionGenConf().size() == 1 &&
									proposal.getDisplayString().matches(access.getDiagramGenerationConfigurationAccess().getDiagramKeyword_1().getValue()))
								return;
						}
					}
				}
			}
		}
		super.completeKeyword(keyword, contentAssistContext, acceptor);
	}
	
}

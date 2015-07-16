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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ConfigurationElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ExtensionGeneratrionConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Generation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.configuration.DiagramGenerationConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpconfGrammarAccess;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.DocumentationGenerationConfiguration;

import com.google.inject.Inject;


/**
 * 
 * @author Amine Lajmi
 *         Faycal Abka
 *
 */
public class VpconfProposalProvider extends AbstractVpconfProposalProvider {
	
	private final static String SPACE = " ";
	private final static String QUOTES = "\""; 
	
	@Inject
	private IGrammarAccess grammar;
	

	@Override
	public void completeTargetApplication_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		List<String> targetPlatformProposals = TargetApplicationReader.getSupportedModelingEnvironment();
		// Add target platform as proposal
		for (String proposal :targetPlatformProposals) {
			if (proposal.contains(SPACE))
				proposal = QUOTES + proposal + QUOTES;
			acceptor.accept(createCompletionProposal(proposal, context));
		}
	}
	
	
	//Forbid many declarations of diagram/documentation overwrite.
	@Override
	public void completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,	ICompletionProposalAcceptor acceptor) {
		if (grammar instanceof VpconfGrammarAccess) {
			VpconfGrammarAccess access = (VpconfGrammarAccess) grammar;
			ICompletionProposal proposal = createCompletionProposal(keyword.getValue(), getKeywordDisplayString(keyword), getImage(keyword), contentAssistContext);
			
			
			
			EObject current = contentAssistContext.getCurrentModel();
			
			if (current != null && NodeModelUtils.getNode(current) != null && proposal != null){
				ICompositeNode rootNode = NodeModelUtils.getNode(current).getRootNode();
				EObject root = NodeModelUtils.findActualSemanticObjectFor(rootNode);
				
				if (root !=null){
					
					Configuration configAspect = (Configuration)root;
					Iterator<ConfigurationElement> it = configAspect.getVpConfigurationElements().iterator();
					
					while (it.hasNext()){
						ConfigurationElement ce = it.next();
						if (ce instanceof Generation){
							Generation gen = (Generation)ce;
							
							if (proposal.getDisplayString().matches(access.getGenerationAccess().getGenerationKeyword_1().getValue()))
								return;
							
							EList<ExtensionGeneratrionConfiguration> listConfig = gen.getOwnedExtensionGenConf();
							
							for (ExtensionGeneratrionConfiguration confOpt : listConfig) {
								
								if (confOpt instanceof DiagramGenerationConfiguration &&
										proposal.getDisplayString().matches(access.getDiagramGenerationConfigurationAccess().getDiagramKeyword_1().getValue())){
									
									return;
								}
								
								if (confOpt instanceof DocumentationGenerationConfiguration &&
										proposal.getDisplayString().matches(access.getDocumentationGenerationConfigurationAccess().getDocumentationKeyword_1().getValue())){
									return;
								}
							}
							
							INode currentNode = contentAssistContext.getCurrentNode();
							INode nextNode    = currentNode.getNextSibling();
							while (nextNode != null && !nextNode.getText().equals(")")){
								if (nextNode.getText().equals(proposal.getDisplayString())){
									return;
								}
								nextNode = nextNode.getNextSibling();
							}
						}
					}
				}
				
				getPriorityHelper().adjustKeywordPriority(proposal, contentAssistContext.getPrefix());
				acceptor.accept(proposal);
				
			}
		}
	}
	
}

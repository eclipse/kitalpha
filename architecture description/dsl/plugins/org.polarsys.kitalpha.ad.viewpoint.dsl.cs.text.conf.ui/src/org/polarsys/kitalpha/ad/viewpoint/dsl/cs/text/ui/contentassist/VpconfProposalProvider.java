/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist;

import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.RequiredExecutionEnvironmentHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ConfigurationElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ExtensionGeneratrionConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GData;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Generation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GenerationConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Release;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.TargetApplication;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ViewConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.configuration.DiagramGenerationConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpconfGrammarAccess;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.DocumentationGenerationConfiguration;

import com.google.inject.Inject;


/**
 * 
 * @author Amine Lajmi
 *         Faycal Abka
 *
 */
public class VpconfProposalProvider extends AbstractVpconfProposalProvider {
	
	private static final String SPACE = " ";
	private static final String QUOTES = "\""; 
	
	private static final Image image;
	
	static final String JDT_PLUGIN_ID = "org.eclipse.jdt.ui";
	static final String LIB_ICON_PATH = "icons/full/obj16/library_obj.png";
	
	static {
	
		final Bundle jdtBundle = Platform.getBundle(JDT_PLUGIN_ID);
		final URL url = FileLocator.find(jdtBundle, new Path(LIB_ICON_PATH), Collections.<String, String> emptyMap());
		
		image = ImageDescriptor.createFromURL(url).createImage();
	}
	
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
	
	
	@Override
	public void completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,	ICompletionProposalAcceptor acceptor) {
		if (grammar instanceof VpconfGrammarAccess) {
			VpconfGrammarAccess access = (VpconfGrammarAccess) grammar;
			ICompletionProposal proposal = createCompletionProposal(keyword.getValue(), getKeywordDisplayString(keyword), getImage(keyword), contentAssistContext);
			
			EObject current = contentAssistContext.getCurrentModel();
			
			if (current != null && NodeModelUtils.getNode(current) != null && proposal != null){
				ICompositeNode rootNode = NodeModelUtils.getNode(current).getRootNode();
				EObject root = NodeModelUtils.findActualSemanticObjectFor(rootNode);
				
				if (root != null && root instanceof Configuration){
					
					Configuration configAspect = (Configuration)root;
					Iterator<ConfigurationElement> it = configAspect.getVpConfigurationElements().iterator();
					
					while (it.hasNext()){
						ConfigurationElement ce = it.next();
						if (ce instanceof ViewConfiguration){
							if (proposal.getDisplayString().matches(access.getViewConfigurationAccess().getViewKeyword_1().getValue())){
								return;
							}
						}
						if (ce instanceof GenerationConfiguration){
							if (proposal.getDisplayString().matches(access.getGenerationConfigurationAccess().getProjectKeyword_1().getValue())){
								return;
							}
							
							if (proposal.getDisplayString().matches(access.getGenerationConfigurationAccess().getNsuriKeyword_3_0().getValue())){
								return;
							}
						}
						
						if (ce instanceof TargetApplication){
							if (proposal.getDisplayString().matches(access.getTargetApplicationAccess().getTargetKeyword_1().getValue())){
								return;
							}
						}
						
						if (ce instanceof Generation){
							Generation gen = (Generation)ce;
							
							if (proposal.getDisplayString().matches(access.getGenerationAccess().getGenerationKeyword_1().getValue()))
								return;
							
							EList<ExtensionGeneratrionConfiguration> listConfig = gen.getOwnedExtensionGenConf();
							
							for (ExtensionGeneratrionConfiguration confOpt : listConfig) {
								if (confOpt instanceof GData &&
										proposal.getDisplayString().matches(access.getGDataAccess().getDataKeyword_1().getValue())){
									return;
								}
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
						
						if (ce instanceof Release){
							if (proposal.getDisplayString().matches(access.getReleaseAccess().getReleaseKeyword_1().getValue()))
								return;
						}
					}
				}
				
				INode currentNode = contentAssistContext.getCurrentNode();
				
				if (proposal.getDisplayString().matches(access.getGenerationConfigurationAccess().getNsuriKeyword_3_0().getValue())){
					INode nextSibling = currentNode.getNextSibling();
					if (nextSibling != null){
						String text = nextSibling.getText();
						if (text.equals(access.getViewConfigurationAccess().getViewKeyword_1().getValue())){
							return;
						}
					}
				}
				
				if (proposal.getDisplayString().matches(access.getViewConfigurationAccess().getViewKeyword_1().getValue())){
					INode nextSibling = currentNode.getNextSibling();
					if (nextSibling != null){
						String text = nextSibling.getText();
						if (text.equals(access.getGenerationAccess().getGenerationKeyword_1().getValue())){
							return;
						}
					}
				}
				
				if (proposal.getDisplayString().matches(access.getGenerationAccess().getGenerationKeyword_1().getValue())){
					INode nextSibling = currentNode.getNextSibling();
					if (nextSibling != null){
						String text = nextSibling.getText();
						if (text.equals(access.getViewConfigurationAccess().getViewKeyword_1().getValue())){
							return;
						}
					}
				}
				
				getPriorityHelper().adjustKeywordPriority(proposal, contentAssistContext.getPrefix());
				acceptor.accept(proposal);
			}
		}
	}
	
	@Override
	public void completeRelease_RequiredExecutionEnvironment(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		Collection<String> availableExecutionEnvironements = RequiredExecutionEnvironmentHelper.getAvailableExecutionEnvironement();
		for (String jre : availableExecutionEnvironements) {
			if (context.getMatcher().isCandidateMatchingPrefix(jre, context.getPrefix())){
				String jre2 = QUOTES + jre + QUOTES;
				acceptor.accept(createCompletionProposal(jre2, new StyledString(jre), image, context));
			}
		}
	}
	
}

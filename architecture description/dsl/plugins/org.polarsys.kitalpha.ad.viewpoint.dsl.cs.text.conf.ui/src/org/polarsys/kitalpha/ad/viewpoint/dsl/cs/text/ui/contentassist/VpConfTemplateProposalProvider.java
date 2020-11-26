/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ConfigurationElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Generation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Release;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ViewConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpconfGrammarAccess;

import com.google.inject.Inject;

/**
 * 
 * @author Faycal ABKA
 *
 */
public class VpConfTemplateProposalProvider extends CommonTemplateProposalProvider {

	private static final int CONFIGURATION_TEMPLATE_PRIORITY = 80;
	private static final int VIEW_TEMPLATE_PRIORITY = 75;
	private static final int RELEASE_TEMPLATE_PRIORITY = 70;
	private static final int GENERATION_OPTIONS_PRIROITY = 65;

	@Inject
	IGrammarAccess access;

	@Inject
	public VpConfTemplateProposalProvider(TemplateStore templateStore, ContextTypeRegistry registry,
			ContextTypeIdHelper helper) {
		super(templateStore, registry, helper);
	}

	@Override
	protected TemplateProposal createProposal(Template template, TemplateContext templateContext,
			ContentAssistContext context, Image image, int relevance) {
		if (access instanceof VpconfGrammarAccess){
			VpconfGrammarAccess g = (VpconfGrammarAccess)access;
			EObject rootModel = context.getRootModel();
			INode currentNode = context.getCurrentNode();
			String contextId = template.getContextTypeId();
			INode next = currentNode.getNextSibling();
			INode lastCompleteNode = context.getLastCompleteNode();
			if (rootModel instanceof Configuration){
				Configuration conf = (Configuration)rootModel;
				EList<ConfigurationElement> elts = conf.getVpConfigurationElements();
				//don't display Release & Generation before View
				if (next != null && (contextId.equalsIgnoreCase(VpConfTemplateIDs.RELEASE_TEMPLATE_ID) ||
						contextId.equalsIgnoreCase(VpConfTemplateIDs.GENERATION_OPTIONS_TEMPLATE_ID))){
					String text = next.getText();
					if (text.equals(g.getViewConfigurationAccess().getViewKeyword_1().getValue())){
						return null;
					}
				}
				//Don't display generation before View or release
				if (next != null && (contextId.equalsIgnoreCase(VpConfTemplateIDs.GENERATION_OPTIONS_TEMPLATE_ID))){
					String text = next.getText();
					if (text.equals(g.getViewConfigurationAccess().getViewKeyword_1().getValue()) || text.equals(g.getReleaseAccess().getReleaseKeyword_1().getValue())){
						return null;
					}
				}
				//we accept only 1 instance of each one config
				for (ConfigurationElement e : elts) {
					if (e instanceof ViewConfiguration && contextId.equalsIgnoreCase(VpConfTemplateIDs.VIEW_TEMPLATE_ID)){
						return null;
					}
					if (e instanceof Release && contextId.equalsIgnoreCase(VpConfTemplateIDs.RELEASE_TEMPLATE_ID)){
						return null;
					}
					if (e instanceof Generation && contextId.equalsIgnoreCase(VpConfTemplateIDs.GENERATION_OPTIONS_TEMPLATE_ID)){
						return null;
					}
				}
				
				//Don't disply View after generation or release
				if (lastCompleteNode != null && lastCompleteNode.getSemanticElement() != null){
					EObject previousSemanticElement = lastCompleteNode.getSemanticElement();
					if (contextId.equalsIgnoreCase(VpConfTemplateIDs.VIEW_TEMPLATE_ID) && (previousSemanticElement instanceof Release || previousSemanticElement instanceof Generation)){
						return null;
					}
				}
				
				//Don't disply release after generation
				if (lastCompleteNode != null && lastCompleteNode.getSemanticElement() != null){
					EObject semanticElement = lastCompleteNode.getSemanticElement();
					if (contextId.equalsIgnoreCase(VpConfTemplateIDs.RELEASE_TEMPLATE_ID) && (semanticElement instanceof Generation)){
						return null;
					}
				}
				
				//Don't disply generation after generation
				if (lastCompleteNode != null && lastCompleteNode.getSemanticElement() != null){
					EObject semanticElement = lastCompleteNode.getSemanticElement();
					if (contextId.equalsIgnoreCase(VpConfTemplateIDs.GENERATION_OPTIONS_TEMPLATE_ID) && (semanticElement instanceof Generation)){
						return null;
					}
				}
				
			}
		}
		return super.createProposal(template, templateContext, context, image, relevance);
	}

	@Override
	public int getRelevance(Template template) {
		String contextTypeId = template.getContextTypeId();

		if (contextTypeId.equals(VpConfTemplateIDs.CONFIGURATION_TEMPLATE_ID)){
			return CONFIGURATION_TEMPLATE_PRIORITY;
		}
		if (contextTypeId.equals(VpConfTemplateIDs.VIEW_TEMPLATE_ID)){
			return VIEW_TEMPLATE_PRIORITY;
		}
		if (contextTypeId.equals(VpConfTemplateIDs.RELEASE_TEMPLATE_ID)){
			return RELEASE_TEMPLATE_PRIORITY;
		}
		if (contextTypeId.equals(VpConfTemplateIDs.GENERATION_OPTIONS_TEMPLATE_ID)){
			return GENERATION_OPTIONS_PRIROITY;
		}
		return 0; //No Other templates wanted
	}

}

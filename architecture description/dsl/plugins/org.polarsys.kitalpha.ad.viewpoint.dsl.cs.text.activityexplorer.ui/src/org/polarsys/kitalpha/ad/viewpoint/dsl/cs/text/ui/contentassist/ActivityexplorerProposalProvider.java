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

import java.net.URL;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.constants.IActivityExplorerExtensionsIDs;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ActivityexplorerProposalProvider extends AbstractActivityexplorerProposalProvider {
	
	private static final String EXTENSION_PATH_ICON = "icons/obj16/extension_obj.gif";
	private static final String BUNDLE_EXTENSION_ICON = "org.eclipse.pde.ui";
	private static final Bundle PDE_CORE_UI_BUNDLE = Platform.getBundle(BUNDLE_EXTENSION_ICON);
	private static final URL ICONURL = FileLocator.find(PDE_CORE_UI_BUNDLE, new Path(EXTENSION_PATH_ICON), null);
	private static final Image EXTENSION_ICON = ImageDescriptor.createFromURL(ICONURL).createImage();
	
	
	//TODO restrect the proposal of keyword following where they appear
	@Override
	public void completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
			ICompletionProposalAcceptor acceptor) {
		
		ICompletionProposal proposal;
		
		if (keyword.getValue().equals("Activity")) {
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "Explorer");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		if (keyword.getValue().equals("tab")) {
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "name");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		if (keyword.getValue().equals("image")) {

			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "off", ":");
			acceptProposal(proposal, contentAssistContext, acceptor);
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "on", ":");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		if (keyword.getValue().equals("predicated")) {
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, ":");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		if (keyword.getValue().equals("show")) {
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "viewer", ":");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		if (keyword.getValue().equals("extended")) {
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "page");
			acceptProposal(proposal, contentAssistContext, acceptor);
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "section");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		if (keyword.getValue().equals("icon")) {
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, ":");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		if (keyword.getValue().equals("filtering")) {
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, ":");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		if (keyword.getValue().equals("expanded")) {
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, ":");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		if (keyword.getValue().equals("model")) {
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "type", ":");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		super.completeKeyword(keyword, contentAssistContext, acceptor);
	}
	
	
	protected StyledString getKeywordDisplayString(String keyword) {
		return new StyledString(keyword);
	}
	
	private void acceptProposal(ICompletionProposal proposal, ContentAssistContext contentAssistContext, ICompletionProposalAcceptor acceptor) {
		getPriorityHelper().adjustKeywordPriority(proposal, contentAssistContext.getPrefix());
		acceptor.accept(proposal);
	}
	
	private ICompletionProposal createProposalForComplexKeyword(Keyword keyword, ContentAssistContext contentAssistContext, String... suffixes){
		StringBuffer buf = new StringBuffer(keyword.getValue());
		
		for (String suffix : suffixes) {
			buf.append(" ").append(suffix);
		}
		
		return createCompletionProposal(buf.toString(), getKeywordDisplayString(buf.toString()),
				getImage(keyword), contentAssistContext);
	}
	

	@Override
	public void completePage_ImagePathOn(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		complete_iconPath(model, assignment, context, acceptor);
	}
	
	@Override
	public void completePage_ImagePathOff(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		complete_iconPath(model, assignment, context, acceptor);
	}
	
	@Override
	public void completeOverview_ImagePathOn(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		complete_iconPath(model, assignment, context, acceptor);
	}
	
	@Override
	public void completeOverview_ImagePathOff(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		complete_iconPath(model, assignment, context, acceptor);
	}
	
	
	@Override
	public void completeActivityExtension_ImagePathOff(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		complete_iconPath(model, assignment, context, acceptor);
	}
	
	@Override
	public void completeSectionExtension_ExtendedPageID(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		List<String> pageIds = ActivityExplorerContentAssistHelper.getActivityExplorerExtensions(IActivityExplorerExtensionsIDs.PAGE);
		List<String> modelPageIds = ActivityExplorerContentAssistHelper.getNewDefinedPages(model);
		
		pageIds.addAll(modelPageIds);
		
		for (String id : pageIds) {
			ICompletionProposal proposal = createCompletionProposal(id, getKeywordDisplayString(id), EXTENSION_ICON, context);
			acceptor.accept(proposal);
		}
	}
	
	@Override
	public void completeActivityExtension_ExtendedSectionID(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		List<String> sectionIds = ActivityExplorerContentAssistHelper.getActivityExplorerExtensions(IActivityExplorerExtensionsIDs.SECTION);
		List<String> modelSectionIds = ActivityExplorerContentAssistHelper.getNewDefinedSections(model);
		
		sectionIds.addAll(modelSectionIds);
		
		for (String id : sectionIds) {
			ICompletionProposal proposal = createCompletionProposal(id, getKeywordDisplayString(id), EXTENSION_ICON, context);
			acceptor.accept(proposal);
		}
	}
	
	
	public void completePage_Index(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		int index = ActivityExplorerContentAssistHelper.getNextIndexPage(model);
		
		ICompletionProposal proposal = createCompletionProposal(String.valueOf(index), getKeywordDisplayString(String.valueOf(index)), null, context);
		acceptor.accept(proposal);
	}
	
	
	
}

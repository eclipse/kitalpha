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
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.IExternalContentSupport.IExternalContentProvider;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.helper.extensions.ActivityExplorerExtensionPointHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.AbstractPage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.PageExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Section;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.SectionExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.helpers.ActivityExplorerAspectHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.util.ProjectUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;

import com.google.inject.Inject;

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
	
	@Inject
	IExternalContentProvider contentProvider;
	
	
	//TODO restrect the proposal of keyword following where they appear
	@Override
	public void completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
			ICompletionProposalAcceptor acceptor) {
		
		ICompletionProposal proposal;
		
		if (keyword.getValue().equals("activity")) {
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "explorer");
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
			EObject parentSemanticModel = getParentSemanticNodeModel(contentAssistContext);
			
			if (parentSemanticModel instanceof PageExtension)
			{
				proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "page");
				acceptProposal(proposal, contentAssistContext, acceptor);
				return;
			}
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
		
		if (keyword.getValue().equals("file")) {
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "extension", ":");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		if (keyword.getValue().equals("page")) {
			proposal = createCompletionProposal(keyword.getValue(), getKeywordDisplayString(keyword.getValue()),getImage(keyword), contentAssistContext);
			acceptProposal(proposal, contentAssistContext, acceptor);
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "extensions", ":");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		if (keyword.getValue().equals("section")) {
			
			EObject parentSemanticModel = getParentSemanticNodeModel(contentAssistContext);
			
			if (parentSemanticModel instanceof SectionExtension)
			{
				proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "extensions", ":");
				acceptProposal(proposal, contentAssistContext, acceptor);
				return;
			}
			
			proposal = createCompletionProposal(keyword.getValue(), getKeywordDisplayString(keyword.getValue()),getImage(keyword), contentAssistContext);
			acceptProposal(proposal, contentAssistContext, acceptor);
			
			return;
		}
		
		super.completeKeyword(keyword, contentAssistContext, acceptor);
	}
	
	private EObject getParentSemanticNodeModel(ContentAssistContext contentAssistContext)
	{
		INode node = contentAssistContext.getCurrentNode();
		return node.getParent().getSemanticElement();
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
	public void completeActivity_ImagePathOff(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		complete_iconPath(model, assignment, context, acceptor);
	}
	
	@Override
	public void completePageExtension_ExtendedPageID(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		Viewpoint root = getRootContainer(model);
		
		List<String> pageIds = ActivityExplorerAspectHelper.getViewpointPagesIDs(root);
		pageIds.addAll(ActivityExplorerAspectHelper.getUsedViewpointPagesIDs(root));
		pageIds.addAll(ActivityExplorerExtensionPointHelper.getPlateformePagesIDs());
		pageIds.addAll(getLocalPageIds(model));
		
		for (String id : pageIds) {
			ICompletionProposal proposal = createCompletionProposal(id, getKeywordDisplayString(id), EXTENSION_ICON, context);
			acceptor.accept(proposal);
		}
	}
	
	private List<String> getLocalPageIds(EObject model){
		List<String> result = new ArrayList<String>();
		ViewpointActivityExplorer current = (ViewpointActivityExplorer) EcoreUtil.getRootContainer(model);
		
		EList<AbstractPage> ownedPages = current.getOwnedPages();
		
		for (AbstractPage p : ownedPages) {
			if (p instanceof Page)
				result.add(((Page) p).getActivityExplorerItemID());
		}
		
		return result;
	}
	
	
	@Override
	public void completeSectionExtension_ExtendedSectionID(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		
		
		Viewpoint root = getRootContainer(model);
		
		List<String> sectionIds = ActivityExplorerAspectHelper.getUsedViewpointSectionsIDs(root);
		sectionIds.addAll(ActivityExplorerAspectHelper.getUsedViewpointSectionsIDs(root));
		sectionIds.addAll(ActivityExplorerExtensionPointHelper.getPlateformeSectionsIDs());
		sectionIds.addAll(getLocalSectionIds(model));

		for (String id : sectionIds) {
			ICompletionProposal proposal = createCompletionProposal(id, getKeywordDisplayString(id), EXTENSION_ICON, context);
			acceptor.accept(proposal);
		}
	}
	
	private List<String> getLocalSectionIds(EObject model){
		List<String> result = new ArrayList<String>();
		ViewpointActivityExplorer current = (ViewpointActivityExplorer) EcoreUtil.getRootContainer(model);
		
		EList<AbstractPage> ownedPages = current.getOwnedPages();
		
		for (AbstractPage p : ownedPages) {
			EList<Section> ownedSections = p.getOwnedSections();
			for (Section section : ownedSections) {
				result.add(section.getActivityExplorerItemID());
			}
		}
		return result;
	}
	
	private Viewpoint getRootContainer(EObject eObject){
		EObject root = ProjectUtil.getRootViewpoint(eObject, contentProvider);
		
		if (root instanceof Viewpoint)
			return (Viewpoint)root;
		
		return null;
	}
}

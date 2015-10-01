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
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.resource.IExternalContentSupport.IExternalContentProvider;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.helper.extensions.ActivityExplorerExtensionPointHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.AbstractPage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Section;
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
	
	private static final ArrayList<String> ACTIVITY_EXPLORER_KEYWORDS = new ArrayList<String>();
	
	static {
		ACTIVITY_EXPLORER_KEYWORDS.add("image-on");
		ACTIVITY_EXPLORER_KEYWORDS.add("image-off");
		ACTIVITY_EXPLORER_KEYWORDS.add("predicated");
		ACTIVITY_EXPLORER_KEYWORDS.add("show-viewer");
		ACTIVITY_EXPLORER_KEYWORDS.add("filtering");
		ACTIVITY_EXPLORER_KEYWORDS.add("expanded");
		ACTIVITY_EXPLORER_KEYWORDS.add("icon");
	}
	
	@Inject
	IExternalContentProvider contentProvider;
	
	
	@Override
	public void completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
			ICompletionProposalAcceptor acceptor) {
		
		ICompletionProposal proposal;
		
		if (ACTIVITY_EXPLORER_KEYWORDS.contains(keyword.getValue())){
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, ":");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		super.completeKeyword(keyword, contentAssistContext, acceptor);
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

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
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.SynchronizationMode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationDescriptions;

/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
/**
 *
 * @author Amine Lajmi
 * 		   Faycal ABKA
 *
 */
public class VpdiagramProposalProvider extends AbstractVpdiagramProposalProvider {

	private static final ArrayList<String> KEYWORDS_STYLE = new ArrayList<String>();

	private static final String SIRIUS_PLUGIN_ID = "org.eclipse.sirius.editor";
	private static final String SIRIUS_GIF_PATH = "icons/full/obj16/Sirius.gif";
	private static final String EMF_PLUGIN_ID = "org.eclipse.emf.ecore.edit";
	private static final String EMF_GIF_PATH = "icons/full/obj16/EPackage.gif";


	static {
		KEYWORDS_STYLE.add("over-all-edges");
		KEYWORDS_STYLE.add("source");
		KEYWORDS_STYLE.add("target");
		KEYWORDS_STYLE.add("routing");
		KEYWORDS_STYLE.add("folding");
		KEYWORDS_STYLE.add("center-source-mappings");
		KEYWORDS_STYLE.add("center-target-mappings");
		KEYWORDS_STYLE.add("begin-label-style-description");
		KEYWORDS_STYLE.add("center-label-style-description");
		KEYWORDS_STYLE.add("end-label-style-description");
		KEYWORDS_STYLE.add("line-style");
		KEYWORDS_STYLE.add("size");
		KEYWORDS_STYLE.add("end-centring");

		KEYWORDS_STYLE.add("over-all-colors");
		KEYWORDS_STYLE.add("color-use-case");

		KEYWORDS_STYLE.add("over-all-labels");
		KEYWORDS_STYLE.add("format");
		KEYWORDS_STYLE.add("expression");
		KEYWORDS_STYLE.add("alignment");
		KEYWORDS_STYLE.add("show");
		KEYWORDS_STYLE.add("path");

		KEYWORDS_STYLE.add("over-all-containers");
		KEYWORDS_STYLE.add("width");
		KEYWORDS_STYLE.add("height");
		KEYWORDS_STYLE.add("round-corner");
		KEYWORDS_STYLE.add("tooltip-expression");
		KEYWORDS_STYLE.add("border-dimension");
		KEYWORDS_STYLE.add("workspace");
		KEYWORDS_STYLE.add("background");
		KEYWORDS_STYLE.add("shape");


		KEYWORDS_STYLE.add("over-all-nodes");
		KEYWORDS_STYLE.add("label-position");
		KEYWORDS_STYLE.add("hide-label");
		KEYWORDS_STYLE.add("resize-kind");
		KEYWORDS_STYLE.add("size-dimension");
		KEYWORDS_STYLE.add("gauge-alignment");
		KEYWORDS_STYLE.add("lozenge-dimension");
		KEYWORDS_STYLE.add("ellipse-dimension");
		KEYWORDS_STYLE.add("square-dimension");
		KEYWORDS_STYLE.add("stroke-dimension");
		KEYWORDS_STYLE.add("horizontal");
		KEYWORDS_STYLE.add("vertical");
	}

	@Override
	public void completeKeyword(final Keyword keyword, final ContentAssistContext contentAssistContext,
			final ICompletionProposalAcceptor acceptor) {

		ICompletionProposal proposal;

		if (KEYWORDS_STYLE.contains(keyword.getValue())){
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext);
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}

		if (keyword.getValue().equals("color")){
			final EObject container = getParentSemanticNodeModel(contentAssistContext);

			if (container instanceof StyleCustomizationDescriptions){
				super.completeKeyword(keyword, contentAssistContext, acceptor);
				return;
			}

			proposal = createProposalForComplexKeyword(keyword, contentAssistContext);
			acceptProposal(proposal, contentAssistContext, acceptor);

			return;
		}

		if (keyword.getValue().equalsIgnoreCase(SynchronizationMode.NOT_SYNCHRONIZED.getLiteral().replace("_", "-"))){
			final StyledString styledString = new StyledString();
			styledString.append(keyword.getValue());
			styledString.append(" - ");
			styledString.append(new StyledString("The Mapping Will Be Always Not synchronized", StyledString.QUALIFIER_STYLER)); //$NON-NLS-1$;

			proposal = createCompletionProposal(keyword.getValue(), styledString, getImage(keyword), contentAssistContext);
			acceptor.accept(proposal);
			return;
		}

		if (keyword.getValue().equalsIgnoreCase(SynchronizationMode.SYNCHRONIZED.getLiteral())){
			final StyledString styledString = new StyledString();
			styledString.append(keyword.getValue());
			styledString.append(" - ");
			styledString.append(new StyledString("The Mapping Will Be always Synchronized", StyledString.QUALIFIER_STYLER)); //$NON-NLS-1$;

			proposal = createCompletionProposal(keyword.getValue(), styledString, getImage(keyword), contentAssistContext);
			acceptor.accept(proposal);
			return;
		}

		if (keyword.getValue().equalsIgnoreCase(SynchronizationMode.UNSYNCHRONIZABLE.getLiteral())){
			final StyledString styledString = new StyledString();
			styledString.append(keyword.getValue());
			styledString.append(" - ");
			styledString.append(new StyledString("The Synchronization Of The Mapping Depends On the Synchronization Defined By The User", StyledString.QUALIFIER_STYLER)); //$NON-NLS-1$;

			proposal = createCompletionProposal(keyword.getValue(), styledString, getImage(keyword), contentAssistContext);
			acceptor.accept(proposal);
			return;
		}

		super.completeKeyword(keyword, contentAssistContext, acceptor);
	}

	@Override
	protected ICompletionProposal createProposalForComplexKeyword(final Keyword keyword, final ContentAssistContext contentAssistContext, final String... suffixes){
		final StringBuffer buf = new StringBuffer(keyword.getValue());

		for (final String suffix : suffixes) {
			buf.append(" ").append(suffix);
		}

		return createCompletionProposal(buf.toString() + " : ", getKeywordDisplayString(buf.toString()),
				getImage(keyword), contentAssistContext);
	}

	@Override
	public void completeOpenAction_Icon(final EObject model, final Assignment assignment,
			final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
		final XtextResource resource = (XtextResource) model.eResource();
		final String platformString = resource.getURI().toPlatformString(true);
		final IFile myFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformString));
		final IProject currentProject = myFile.getProject();
		final IFolder iconFolder = currentProject.getFolder("icons");
		final IPath iconRelativePath = iconFolder.getProjectRelativePath();
		final List<IResource> collectICons = collectICons(iconFolder, new ArrayList<IResource>());
		for (final IResource candidate : collectICons) {
			if (candidate instanceof IFile) {
				final IFile xfile = (IFile) candidate;
				final Image image = getImage(xfile.getLocation());
				final IPath projectRelativePath = xfile.getProjectRelativePath();
				final IPath makeRelativeTo = projectRelativePath.makeRelativeTo(iconRelativePath);
				acceptor.accept(createCompletionProposal("\""+makeRelativeTo.toString()+"\"", makeRelativeTo.toString(), image, context));
			}
		}
	}

	@Override
	public void completeCreate_Icon(final EObject model, final Assignment assignment,
			final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
		final XtextResource resource = (XtextResource) model.eResource();
		final String platformString = resource.getURI().toPlatformString(true);
		final IFile myFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformString));
		final IProject currentProject = myFile.getProject();
		final IFolder iconFolder = currentProject.getFolder("icons");
		final IPath iconRelativePath = iconFolder.getProjectRelativePath();
		final List<IResource> collectICons = collectICons(iconFolder, new ArrayList<IResource>());
		for (final IResource candidate : collectICons) {
			if (candidate instanceof IFile) {
				final IFile xfile = (IFile) candidate;
				final Image image = getImage(xfile.getLocation());
				final IPath projectRelativePath = xfile.getProjectRelativePath();
				final IPath makeRelativeTo = projectRelativePath.makeRelativeTo(iconRelativePath);
				acceptor.accept(createCompletionProposal("\""+makeRelativeTo.toString()+"\"", makeRelativeTo.toString(), image, context));
			}
		}
	}


	@Override
	public void completeImageStyle_ImagePath(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
		final XtextResource resource = (XtextResource) model.eResource();
		final String platformString = resource.getURI().toPlatformString(true);
		final IFile myFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformString));
		final IProject currentProject = myFile.getProject();
		final IFolder iconFolder = currentProject.getFolder("icons");
		final IPath iconRelativePath = iconFolder.getProjectRelativePath();
		final List<IResource> collectICons = collectICons(iconFolder, new ArrayList<IResource>());
		for (final IResource candidate : collectICons) {
			if (candidate instanceof IFile) {
				final IFile xfile = (IFile) candidate;
				final Image image = getImage(xfile.getLocation());
				final IPath projectRelativePath = xfile.getProjectRelativePath();
				final IPath makeRelativeTo = projectRelativePath.makeRelativeTo(iconRelativePath);
				acceptor.accept(createCompletionProposal("\""+makeRelativeTo.toString()+"\"", makeRelativeTo.toString(), image, context));
			}
		}
	}

	@Override
	public void completeImportGroup_ImportedGroup(final EObject model,
			final Assignment assignment, final ContentAssistContext context,
			final ICompletionProposalAcceptor acceptor) {


		final Bundle bundlesirius = Platform.getBundle(SIRIUS_PLUGIN_ID);
		final URL urlsirius = FileLocator.find(bundlesirius, new Path(SIRIUS_GIF_PATH),
				null);

		final Bundle bundleemf = Platform.getBundle(EMF_PLUGIN_ID);
		final URL urlemf = FileLocator.find(bundleemf, new Path(EMF_GIF_PATH),
				null);

		final Image imagesirius = ImageDescriptor.createFromURL(urlsirius).createImage();
		final Image imageemf = ImageDescriptor.createFromURL(urlemf).createImage();


		final DiagramUseLinks imports = UseLinksContentassistHelper.getViewpointRepresentation(model);

		final Collection<String> importsDiagram = imports.get(UseLinksContentassistHelper.DIAGRAM_KEY);
		final List<String> sortedList = new LinkedList<String>();

		if ((importsDiagram != null) && !importsDiagram.isEmpty()) {
			sortedList.addAll(importsDiagram);
		}

		final Collection<String> importsModel = imports.get(UseLinksContentassistHelper.MODEL_KEY);

		if ((importsModel != null) && !importsModel.isEmpty()) {
			sortedList.addAll(importsModel);
		}


		for (final String uri : sortedList) {
			final StyledString styledUri = new StyledString();
			styledUri.append(uri);
			final Collection<String> modelValues = imports.get(UseLinksContentassistHelper.MODEL_KEY);
			if ((modelValues != null) && modelValues.contains(uri)){
				acceptor.accept(createCompletionProposal(createProposal(uri),
						styledUri, imageemf, context));
			} else {
				acceptor.accept(createCompletionProposal(createProposal(uri),
						styledUri, imagesirius, context));
			}
		}

	}


	private String createProposal(final String uri) {
		final StringBuffer tmp = new StringBuffer();
		tmp.append("\"").append(uri).append("\"");
		return tmp.toString();
	}
	
	@Override
	public void completeBasic_Icon(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		complete_iconPath(model, assignment, context, acceptor);
	}
	
	@Override
	public void completeMappingBased_Icon(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		complete_iconPath(model, assignment, context, acceptor);
	}
	
	@Override
	public void completeSemanticBased_Icon(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		complete_iconPath(model, assignment, context, acceptor);
	}
}

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
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization;
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
	
	private static final ArrayList<String> SIMPLE_KEYWORDS = new ArrayList<String>();
	
	static {
		SIMPLE_KEYWORDS.add("source");
		SIMPLE_KEYWORDS.add("target");
		SIMPLE_KEYWORDS.add("routing");
		SIMPLE_KEYWORDS.add("folding");
		SIMPLE_KEYWORDS.add("alignment");
		SIMPLE_KEYWORDS.add("format");
		SIMPLE_KEYWORDS.add("show");
		SIMPLE_KEYWORDS.add("path");
		SIMPLE_KEYWORDS.add("expression");
		SIMPLE_KEYWORDS.add("width");
		SIMPLE_KEYWORDS.add("height");
		SIMPLE_KEYWORDS.add("background");
		SIMPLE_KEYWORDS.add("shape");
		SIMPLE_KEYWORDS.add("workspace");
		SIMPLE_KEYWORDS.add("horizontal");
		SIMPLE_KEYWORDS.add("vertical");
	}
	
	@Override
	public void completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
			ICompletionProposalAcceptor acceptor) {
		
		ICompletionProposal proposal;
		
		if (SIMPLE_KEYWORDS.contains(keyword.getValue())){
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext);
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		if (keyword.getValue().equals("over")){
			EObject container = getParentSemanticNodeModel(contentAssistContext);
			if (container instanceof EdgeStyleCustomization){
				proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "all", "edges");
				acceptProposal(proposal, contentAssistContext, acceptor);
				return;
			}
			
			if (container instanceof ColorCustomization){
				proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "all", "colors");
				acceptProposal(proposal, contentAssistContext, acceptor);
				return;
			}
			
			if (container instanceof LabelCustomization){
				proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "all", "labels");
				acceptProposal(proposal, contentAssistContext, acceptor);
				return;
			}
			
			if (container instanceof ContainerStyleCustomization){
				proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "all", "containers");
				acceptProposal(proposal, contentAssistContext, acceptor);
				return;
			}
			
			if (container instanceof NodeStyleCustomization){
				proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "all", "nodes");
				acceptProposal(proposal, contentAssistContext, acceptor);
				return;
			}
		}
		
		if (keyword.getValue().equals("center")){
			EObject container = getParentSemanticNodeModel(contentAssistContext);

			if (container instanceof EdgeStyleCustomization){
				proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "source", "mappings");
				acceptProposal(proposal, contentAssistContext, acceptor);
				proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "target", "mappings");
				acceptProposal(proposal, contentAssistContext, acceptor);
				proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "label", "style", "description");
				acceptProposal(proposal, contentAssistContext, acceptor);
				return;
			}
		}
		
		if (keyword.getValue().equals("begin")){
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "label", "style", "description");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		if (keyword.getValue().equals("end")){
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "label", "style", "description");
			acceptProposal(proposal, contentAssistContext, acceptor);
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "centring");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		if (keyword.getValue().equals("line")){
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "style");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		if (keyword.getValue().equals("color")){
			EObject container = getParentSemanticNodeModel(contentAssistContext);
			
			if (container instanceof StyleCustomizationDescriptions){
				super.completeKeyword(keyword, contentAssistContext, acceptor);
				return;
			}
			
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext);
			acceptProposal(proposal, contentAssistContext, acceptor);
			
			if (container instanceof ColorCustomization){
				proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "use", "case");
				acceptProposal(proposal, contentAssistContext, acceptor);
			}
			
			return;
		}
		
		if (keyword.getValue().equals("size")){
			EObject container = getParentSemanticNodeModel(contentAssistContext);
			
			if (container instanceof NodeStyleCustomization){
				proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "dimension");
				acceptProposal(proposal, contentAssistContext, acceptor);
			} else {
				proposal = createProposalForComplexKeyword(keyword, contentAssistContext);
				acceptProposal(proposal, contentAssistContext, acceptor);
			}
			return;
		}
		
		if (keyword.getValue().equals("icon")){
			proposal = super.createProposalForComplexKeyword(keyword, contentAssistContext);
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		if (keyword.getValue().equals("round")){
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "corner");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		if (keyword.getValue().equals("tooltip")){
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "expression");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		if (keyword.getValue().equals("border")){
			EObject eObject = getParentSemanticNodeModel(contentAssistContext);
			
			if (eObject instanceof NodeStyleCustomization){
				String lastValue = NodeModelUtils.getTokenText(contentAssistContext.getLastCompleteNode());
				if (lastValue.contains("->")){
					super.completeKeyword(keyword, contentAssistContext, acceptor);
					return;
				}
			}
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "dimension");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		if (keyword.getValue().equals("label")){
			EObject container = getParentSemanticNodeModel(contentAssistContext);
			
			if (container instanceof NodeStyleCustomization){
				proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "position");
				acceptProposal(proposal, contentAssistContext, acceptor);
			} else {
				super.completeKeyword(keyword, contentAssistContext, acceptor);
			}
			return;
		}
		
		if (keyword.getValue().equals("hide")){
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "label");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		if (keyword.getValue().equals("resize")){
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "kind");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		if (keyword.getValue().equals("lozenge") || keyword.getValue().equals("ellipse")){
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "dimension");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		if (keyword.getValue().equals("gauge")){
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "alignment");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		if (keyword.getValue().equals("square") || keyword.getValue().equals("stroke")){
			proposal = createProposalForComplexKeyword(keyword, contentAssistContext, "dimension");
			acceptProposal(proposal, contentAssistContext, acceptor);
			return;
		}
		
		super.completeKeyword(keyword, contentAssistContext, acceptor);
	}
	
	@Override
	protected ICompletionProposal createProposalForComplexKeyword(Keyword keyword, ContentAssistContext contentAssistContext, String... suffixes){
		StringBuffer buf = new StringBuffer(keyword.getValue());
		
		for (String suffix : suffixes) {
			buf.append(" ").append(suffix);
		}
		
		return createCompletionProposal(buf.toString() + " -> ", getKeywordDisplayString(buf.toString()),
				getImage(keyword), contentAssistContext);
	}

	@Override
	public void completeOpenAction_Icon(EObject model, Assignment assignment,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		XtextResource resource = (XtextResource) model.eResource();
		String platformString = resource.getURI().toPlatformString(true);
		IFile myFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformString));
		IProject currentProject = myFile.getProject();
		IFolder iconFolder = currentProject.getFolder("icons");
		IPath iconRelativePath = iconFolder.getProjectRelativePath();
		List<IResource> collectICons = collectICons(iconFolder, new ArrayList<IResource>());
		for (IResource candidate : collectICons) {
			if (candidate instanceof IFile) {
				IFile xfile = (IFile) candidate;
				Image image = getImage(xfile.getLocation());
				IPath projectRelativePath = xfile.getProjectRelativePath();
				IPath makeRelativeTo = projectRelativePath.makeRelativeTo(iconRelativePath);
				acceptor.accept(createCompletionProposal("\""+makeRelativeTo.toString()+"\"", makeRelativeTo.toString(), image, context));
			}	
		}			
	}
	
	@Override
	public void completeCreate_Icon(EObject model, Assignment assignment,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		XtextResource resource = (XtextResource) model.eResource();
		String platformString = resource.getURI().toPlatformString(true);
		IFile myFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformString));
		IProject currentProject = myFile.getProject();
		IFolder iconFolder = currentProject.getFolder("icons");
		IPath iconRelativePath = iconFolder.getProjectRelativePath();
		List<IResource> collectICons = collectICons(iconFolder, new ArrayList<IResource>());
		for (IResource candidate : collectICons) {
			if (candidate instanceof IFile) {
				IFile xfile = (IFile) candidate;
				Image image = getImage(xfile.getLocation());
				IPath projectRelativePath = xfile.getProjectRelativePath();
				IPath makeRelativeTo = projectRelativePath.makeRelativeTo(iconRelativePath);
				acceptor.accept(createCompletionProposal("\""+makeRelativeTo.toString()+"\"", makeRelativeTo.toString(), image, context));
			}	
		}			
	}
	
	
	@Override
	public void completeImageStyle_ImagePath(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		XtextResource resource = (XtextResource) model.eResource();
		String platformString = resource.getURI().toPlatformString(true);
		IFile myFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformString));
		IProject currentProject = myFile.getProject();
		IFolder iconFolder = currentProject.getFolder("icons");
		IPath iconRelativePath = iconFolder.getProjectRelativePath();
		List<IResource> collectICons = collectICons(iconFolder, new ArrayList<IResource>());
		for (IResource candidate : collectICons) {
			if (candidate instanceof IFile) {
				IFile xfile = (IFile) candidate;
				Image image = getImage(xfile.getLocation());
				IPath projectRelativePath = xfile.getProjectRelativePath();
				IPath makeRelativeTo = projectRelativePath.makeRelativeTo(iconRelativePath);
				acceptor.accept(createCompletionProposal("\""+makeRelativeTo.toString()+"\"", makeRelativeTo.toString(), image, context));
			}	
		}
	}
	
	@Override
	public void completeImportGroup_ImportedGroup(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		
		 final String SIRIUS_PLUGIN_ID = "org.eclipse.sirius.editor";
		 final String SIRIUS_GIF_PATH = "icons/full/obj16/Sirius.gif";
		 
		 final String EMF_PLUGIN_ID = "org.eclipse.emf.ecore.edit";
		 final String EMF_GIF_PATH = "icons/full/obj16/EPackage.gif";

		 final Bundle bundle_sirius = Platform.getBundle(SIRIUS_PLUGIN_ID);
		 final URL url_sirius = FileLocator.find(bundle_sirius, new Path(SIRIUS_GIF_PATH),
				null);
		 
		 final Bundle bundle_emf = Platform.getBundle(EMF_PLUGIN_ID);
		 final URL url_emf = FileLocator.find(bundle_emf, new Path(EMF_GIF_PATH),
				 null);
		 
		 Image image_sirius = ImageDescriptor.createFromURL(url_sirius).createImage();
		 Image image_emf = ImageDescriptor.createFromURL(url_emf).createImage();
		 
		 
		 DiagramUseLinks imports = UseLinksContentassistHelper.getViewpointRepresentation(model);

		 Collection<String> importsDiagram = imports.get(UseLinksContentassistHelper.DIAGRAM_KEY);	
         List<String> sortedList = new LinkedList<String>();	
         	
         if (importsDiagram != null && !importsDiagram.isEmpty())	
                 sortedList.addAll(importsDiagram);	
         	
         Collection<String> importsModel = imports.get(UseLinksContentassistHelper.MODEL_KEY);	
         	
         if (importsModel != null && !importsModel.isEmpty())	
                 sortedList.addAll(importsModel);	
         	
         	
         for (String uri : sortedList) {	
                 StyledString styledUri = new StyledString();	
                 styledUri.append(uri);	
                 Collection<String> modelValues = imports.get(UseLinksContentassistHelper.MODEL_KEY);
                 if (modelValues != null && modelValues.contains(uri)){	
                         acceptor.accept(createCompletionProposal(createProposal(uri),	
                                         styledUri, image_emf, context));	
                 } else {	
                         acceptor.accept(createCompletionProposal(createProposal(uri),	
                                         styledUri, image_sirius, context));	
                 }	
         }

	}

	private String createProposal(String uri) {
		StringBuffer tmp = new StringBuffer();
		tmp.append("\"").append(uri).append("\"");
		return tmp.toString();
	}
}

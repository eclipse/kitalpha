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
import java.util.Collections;
import java.util.HashSet;
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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.resource.IExternalContentSupport.IExternalContentProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.AbstractImport;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.Diagrams;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.ImportGroup;

import com.google.inject.Inject;

/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpdiagramProposalProvider extends AbstractVpdiagramProposalProvider {
	
	@Inject
	private IExternalContentProvider contentProvider;

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
	
	private Collection<String> computeAlreadyImportedURI(EObject model)
	{
		if (!(model instanceof Diagrams))
			return Collections.emptyList();
		
		
		Collection<String> result = new HashSet<String>();
		
		Diagrams diag = (Diagrams)model;
		
		List<AbstractImport> imports = diag.getImports();
		
		for (AbstractImport import1 : imports) {
			if (import1 instanceof ImportGroup)
			{
				ImportGroup importURI = (ImportGroup)import1;
				
				String uri = importURI.getImportedGroup();
				
				if (uri != null && !uri.isEmpty())
				{
					if (uri.startsWith("\""))
						uri = uri.substring(1);
					
					if (uri.endsWith("\""))
						uri = uri.substring(0, uri.lastIndexOf("\""));
					result.add(uri);
				}
			}
		}
		
		return result;
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
				Collections.EMPTY_MAP);
		 
		 final Bundle bundle_emf = Platform.getBundle(EMF_PLUGIN_ID);
		 final URL url_emf = FileLocator.find(bundle_emf, new Path(EMF_GIF_PATH),
				 Collections.EMPTY_MAP);
		 
		 Image image_sirius = ImageDescriptor.createFromURL(url_sirius).createImage();
		 Image image_emf = ImageDescriptor.createFromURL(url_emf).createImage();
		 
		 
		 DiagramUseLinks imports = UseLinksContentassistHelper.getViewpointRepresentation(model, contentProvider);

		 Collection<String> importsDiagram = imports.get(UseLinksContentassistHelper.DIAGRAM_KEY);	
         List<String> sortedList = new LinkedList<String>();	
         	
         if (importsDiagram != null && !importsDiagram.isEmpty())	
                 sortedList.addAll(importsDiagram);	
         	
         Collection<String> importsModel = imports.get(UseLinksContentassistHelper.MODEL_KEY);	
         	
         if (importsModel != null && !importsModel.isEmpty())	
                 sortedList.addAll(importsModel);	
         
         
         Collection<String> alreadyImported = computeAlreadyImportedURI(model.eContainer());
         	
         for (String uri : sortedList) {
        	 
        	 if (!alreadyImported.contains(uri))
        	 {
                 Collection<String> modelValues = imports.get(UseLinksContentassistHelper.MODEL_KEY);
                 if (modelValues != null && modelValues.contains(uri)){	
                         acceptor.accept(createCompletionProposal(createProposal(uri),	
                                         buidStyledStringFor(uri), image_emf, context));	
                 } else {	
                         acceptor.accept(createCompletionProposal(createProposal(uri),	
                                         buidStyledStringFor(uri), image_sirius, context));	
                 }
        	 }
         }
	}
	
	private StyledString buidStyledStringFor(String uri)
	{
		if (URI.createURI(uri).isPlatformPlugin())
		{
			return new StyledString(uri, StyledString.COUNTER_STYLER);
		}
		else
		{
			return new StyledString(uri, StyledString.DECORATIONS_STYLER);
		}
	}

	private String createProposal(String uri) {
		StringBuffer tmp = new StringBuffer();
		tmp.append("\"").append(uri).append("\"");
		return tmp.toString();
	}
}

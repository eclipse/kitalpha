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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.AbstractVpdiagramProposalProvider;

/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpdiagramProposalProvider extends AbstractVpdiagramProposalProvider {

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
}

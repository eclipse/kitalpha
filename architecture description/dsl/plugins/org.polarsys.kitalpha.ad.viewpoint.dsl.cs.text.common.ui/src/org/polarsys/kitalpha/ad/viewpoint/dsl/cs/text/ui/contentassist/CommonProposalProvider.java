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

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.util.ProjectUtil;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class CommonProposalProvider extends AbstractCommonProposalProvider {
	
	@Override
	public void complete_EBoolean(EObject model, RuleCall ruleCall,
		ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("true", context));
		acceptor.accept(createCompletionProposal("false", context));
	}
	
	//utility functions shared by child grammars	
	public List<IResource> collectICons(IResource resource, List<IResource> children) {
		if (resource.getType() == IResource.FILE) {
			return children;
		}
		IResource[] members;
		try {
			members = ((IContainer) resource).members();
		} catch (CoreException e) {
			//resource is not accessible, just return what we have
			return children;
		}
		for (int i = 0; i < members.length; i++) {
			if (members[i].getType() == IResource.FILE) {
				children.add(members[i]);
			} else {
				collectICons(members[i], children);
			}
		}
		return children;
	}
	
    @SuppressWarnings("deprecation")
	public Image getImage(IPath path) {
        URL url = null;
        try {
            url = path.toFile().toURL();
        } catch (MalformedURLException e) {
            return null;
        }
        final Image image = ImageDescriptor.createFromURL(url).createImage();
        return image;
    }
    
    protected void complete_iconPath(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor){
    	IProject project = ProjectUtil.getEclipseProjectOf(model);
		List<IResource> resources = ProjectUtil.getFolderResources(project, "icons", IResource.FILE, true);
		IFolder iconFolder = ProjectUtil.getFolderInProject(project, "icons");
		IPath iconRelativePath = iconFolder.getProjectRelativePath();
		
		for (IResource iResource : resources) {
			IPath path = iResource.getLocation();
			if (path != null){
				try {
					IPath projectRelativePath = iResource.getProjectRelativePath();
					IPath relativePath = projectRelativePath.makeRelativeTo(iconRelativePath);
					ICompletionProposal proposal = createCompletionProposal("\"" + relativePath.toString() + "\"", relativePath.toString(), getImage(path), context);
					acceptor.accept(proposal);
				} catch (SWTException e) {
					//Die
				}
			}
		}
    }
    
    protected StyledString getKeywordDisplayString(String keyword) {
		return new StyledString(keyword);
	}
    
    protected ICompletionProposal createProposalForComplexKeyword(Keyword keyword, ContentAssistContext contentAssistContext, String... suffixes){
		StringBuffer buf = new StringBuffer(keyword.getValue());
		
		for (String suffix : suffixes) {
			buf.append(" ").append(suffix);
		}
		
		return createCompletionProposal(buf.toString(), getKeywordDisplayString(buf.toString()),
				getImage(keyword), contentAssistContext);
	}
    
    protected void acceptProposal(ICompletionProposal proposal, ContentAssistContext contentAssistContext, ICompletionProposalAcceptor acceptor) {
		getPriorityHelper().adjustKeywordPriority(proposal, contentAssistContext.getPrefix());
		acceptor.accept(proposal);
	}
    
    protected EObject getParentSemanticNodeModel(ContentAssistContext contentAssistContext)
	{
		INode node = contentAssistContext.getCurrentNode();
		return node.getParent().getSemanticElement();
	}
}

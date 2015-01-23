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

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.AbstractCommonProposalProvider;


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
		if (resource.getType() == IResource.FILE)
			return children;
		IResource[] members;
		try {
			members = ((IContainer) resource).members();
		} catch (CoreException e) {
			//resource is not accessible, just return what we have
			return children;
		}
		for (int i = 0; i < members.length; i++) {
			if (members[i].getType() == IResource.FILE)
				children.add(members[i]);
			else
				collectICons(members[i], children);
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
}

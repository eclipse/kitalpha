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
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ContentProposalLabelProvider;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.ServiceSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helper.URIConverterHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.WorkspaceResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.Services;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpspecGrammarAccess;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.inject.Inject;

/**
 * 
 * @author Amine Lajmi
 * 		   Faycal Abka
 *
 */
public class VpspecProposalProvider extends AbstractVpspecProposalProvider {
	
	private static final String SIRIUS_PLUGIN_ID = "org.eclipse.sirius.editor";
	private static final String IMG_PATH = "icons/full/obj16/Sirius.gif";
	private static final String PLUGIN_ID = "org.eclipse.ui";
	private static final String IMG_FOLDER_PATH = "icons/full/obj16/fldr_obj.gif";
	private static final String EMF_PLUGIN_ID = "org.eclipse.emf.ecore.edit";
	private static final String SCHEMAT_PATH = "icons/full/obj16/EPackage.gif";

	@Inject
	IGrammarAccess grammar;
	
	@Inject
	@ContentProposalLabelProvider
	private ILabelProvider labelProvider;

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;	
	
	@Override
	public void completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,	ICompletionProposalAcceptor acceptor) {
		if (grammar instanceof VpspecGrammarAccess) {
			VpspecGrammarAccess access = (VpspecGrammarAccess) grammar;
			ICompletionProposal proposal = createCompletionProposal(keyword.getValue(), getKeywordDisplayString(keyword), getImage(keyword), contentAssistContext);
			if (proposal == null) {
				return;
			}
			EObject current = contentAssistContext.getCurrentModel();
			if (current !=null && NodeModelUtils.getNode(current) !=null) {				
				ICompositeNode rootNode = NodeModelUtils.getNode(current).getRootNode();
				EObject root = NodeModelUtils.findActualSemanticObjectFor(rootNode);
				if (root !=null && root instanceof Viewpoint) {
					//Collect all the already defined aspects
					EList<Aspect> vpAspects = ((Viewpoint) root).getVP_Aspects();
					for (Aspect candidate: vpAspects){
						if (candidate instanceof UIDescription && proposal.getDisplayString().matches(access.getViewpointAccess().getTypeUIKeyword_14_0_0().getValue())){
							return;
						}
						if (candidate instanceof DiagramSet && proposal.getDisplayString().matches(access.getViewpointAccess().getTypeDiagramsKeyword_15_0_0().getValue())){
							return;
						}
						if (candidate instanceof ServiceSet && proposal.getDisplayString().matches(access.getViewpointAccess().getTypeServicesKeyword_17_0_0().getValue())){
							return;
						}
						if (candidate instanceof Configuration && proposal.getDisplayString().matches(access.getViewpointAccess().getTypeConfigurationKeyword_19_0_0().getValue())) {
							return;
						}
						if (candidate instanceof ViewpointActivityExplorer && proposal.getDisplayString().matches(access.getViewpointAccess().getTypeActivityExplorerKeyword_16_0_0().getValue())){
							return;
						}
					}
					//Check if Data is already defined
					Data vpData = ((Viewpoint) root).getVP_Data();
					if (vpData != null && proposal.getDisplayString().matches(access.getViewpointAccess().getDataKeyword_13_0().getValue())) {
						return;
					}
				}			
				//Don't propose UI, Rules, Services, and Configuration before Data
				if (proposal.getDisplayString().matches(access.getViewpointAccess().getTypeUIKeyword_14_0_0().getValue()) ||
					proposal.getDisplayString().matches(access.getViewpointAccess().getTypeConfigurationKeyword_19_0_0().getValue()) ||
					proposal.getDisplayString().matches(access.getViewpointAccess().getTypeBuildKeyword_18_0_0().getValue()) ||
					proposal.getDisplayString().matches(access.getViewpointAccess().getTypeDiagramsKeyword_15_0_0().getValue()) ||
					proposal.getDisplayString().matches(access.getViewpointAccess().getTypeServicesKeyword_17_0_0().getValue()) ||
					proposal.getDisplayString().matches(access.getViewpointAccess().getTypeActivityExplorerKeyword_16_0_0().getValue())) {					
					INode currentNode = contentAssistContext.getCurrentNode();
					INode nextSibling = currentNode.getNextSibling();
					if (nextSibling != null) {
						String text = nextSibling.getText();
						if (text.equals(access.getViewpointAccess().getDataKeyword_13_0().getValue())){
							return;
						}
					}
				}			
				//Don't propose Diagram before UI	
				if (proposal.getDisplayString().matches(access.getViewpointAccess().getTypeDiagramsKeyword_15_0_0().getValue())) {				
					INode currentNode = contentAssistContext.getCurrentNode();
					INode nextSibling = currentNode.getNextSibling();
					if (nextSibling != null) {
						String text = nextSibling.getText();
						if (text.equals(access.getViewpointAccess().getTypeUIKeyword_14_0_0().getValue())){
							return;
						}
					}					
				}
				//Don't propose Activity Explorer before
				if (proposal.getDisplayString().matches(access.getViewpointAccess().getTypeActivityExplorerKeyword_16_0_0().getValue())) {				
					INode currentNode = contentAssistContext.getCurrentNode();
					INode nextSibling = currentNode.getNextSibling();
					if (nextSibling != null) {
						String text = nextSibling.getText();
						if (text.equals(access.getViewpointAccess().getTypeServicesKeyword_17_0_0().getValue())){
							return;
						}
					}					
				}
			}
			getPriorityHelper().adjustKeywordPriority(proposal, contentAssistContext.getPrefix());
			acceptor.accept(proposal);
		}
	}
		
	@Override
	protected String getDisplayString(EObject element, String qualifiedNameAsString, String shortName) {
		if (qualifiedNameAsString == null) {
			qualifiedNameAsString = shortName;
		}
		if (qualifiedNameAsString == null) {
			if (element != null) {
				qualifiedNameAsString = labelProvider.getText(element);
			} else {
				return null;
			}
		}
		QualifiedName qualifiedName = qualifiedNameConverter.toQualifiedName(qualifiedNameAsString);		
		if(qualifiedName.getSegmentCount() >1) {
			if (element instanceof Aspect || element instanceof Services || element instanceof Data) {
				String projectName = EcoreUtil.getURI(element).segment(1);
				return qualifiedName.getLastSegment() + " - " + qualifiedNameAsString + " ["  + projectName + "]";
			}
			return qualifiedName.getLastSegment() + " - " + qualifiedNameAsString;
		}
		return qualifiedNameAsString;
	}
	
	@Override
	protected void lookupCrossReference(CrossReference crossReference, ContentAssistContext contentAssistContext, ICompletionProposalAcceptor acceptor) {
		EObject currentModel = contentAssistContext.getCurrentModel();
		if (currentModel instanceof Viewpoint) {
			INode lastCompleteNode = contentAssistContext.getLastCompleteNode();
			final String aspectType = lastCompleteNode.getText();
			lookupCrossReference(crossReference, contentAssistContext, acceptor, getFilter(aspectType));
		} else {	
			super.lookupCrossReference(crossReference, contentAssistContext, acceptor);
		}
	}
	
	Predicate<IEObjectDescription> getFilter(String aspectType) {
		final VpspecGrammarAccess access = (VpspecGrammarAccess) grammar;
		if (aspectType.equals(access.getViewpointAccess().getTypeBuildKeyword_18_0_0().getValue())) {
			return new Predicate<IEObjectDescription>() {
				@Override
				public boolean apply(IEObjectDescription d) {
					return (d.getEObjectOrProxy() instanceof Build);
				}
			};
		}
		if (aspectType.equals(access.getViewpointAccess().getTypeConfigurationKeyword_19_0_0().getValue())) {
			return new Predicate<IEObjectDescription>() {
				@Override
				public boolean apply(IEObjectDescription d) {
					return (d.getEObjectOrProxy() instanceof Configuration);
				}
			};
		}
		if (aspectType.equals(access.getViewpointAccess().getDataKeyword_13_0().getValue())) {
			return new Predicate<IEObjectDescription>() {
				@Override
				public boolean apply(IEObjectDescription d) {
					return (d.getEObjectOrProxy() instanceof Data);
				}
			};
		}
		if (aspectType.equals(access.getViewpointAccess().getTypeDiagramsKeyword_15_0_0().getValue())) {
			return new Predicate<IEObjectDescription>() {
				@Override
				public boolean apply(IEObjectDescription d) {
					return (d.getEObjectOrProxy() instanceof DiagramSet);
				}
			};
		}
		if (aspectType.equals(access.getViewpointAccess().getTypeServicesKeyword_17_0_0().getValue())) {
			return new Predicate<IEObjectDescription>() {
				@Override
				public boolean apply(IEObjectDescription d) {
					return (d.getEObjectOrProxy() instanceof ServiceSet);
				}
			};
		}
		if (aspectType.equals(access.getViewpointAccess().getTypeUIKeyword_14_0_0().getValue())) {
			return new Predicate<IEObjectDescription>() {
				@Override
				public boolean apply(IEObjectDescription d) {
					return (d.getEObjectOrProxy() instanceof UIDescription);
				}
			};
		}
		if (aspectType.equals(access.getViewpointAccess().getTypeActivityExplorerKeyword_16_0_0().getValue())) {
			return new Predicate<IEObjectDescription>() {
				@Override
				public boolean apply(IEObjectDescription d) {
					return (d.getEObjectOrProxy() instanceof ViewpointActivityExplorer);
				}
			};
		}
		return Predicates.<IEObjectDescription> alwaysTrue();
	}
	
	private boolean checkAlreadyImportedDiagramURI(EObject model, String uri)
	{
		if (!(model instanceof Viewpoint)){
			return false;
		}
		
		Viewpoint vp = (Viewpoint)model;
		
		List<String> dep = vp.getUseDiagramResource();
		
		if (!uri.startsWith("\"")) {
			uri = "\"" + uri;
		}
		if (!uri.endsWith("\"")) {
			uri = uri + "\"";
		}
		
		return dep.contains(uri);
	}
	
	private boolean checkAlreadyImportedWSURI(EObject model, String uri)
	{
		if (!(model instanceof Viewpoint)) {
			return false;
		}
		
		Viewpoint vp = (Viewpoint)model;
		
		List<String> dep = vp.getUseWorkspaceResource();
		
		if (!uri.startsWith("\"")) {
			uri = "\"" + uri;
		}
		if (!uri.endsWith("\"")) {
			uri = uri + "\"";
		}
		
		return dep.contains(uri);
	}
	
	private boolean checkAlreadyImportedEMFURI(EObject model, String uri)
	{
		if (!(model instanceof Viewpoint)) {
			return false;
		}
		
		Viewpoint vp = (Viewpoint)model;
		
		List<String> dep = vp.getUseAnyEMFResource();
		
		if (!uri.startsWith("\"")) {
			uri = "\"" + uri;
		}
		if (!uri.endsWith("\"")){
			uri = uri + "\"";
		}
		
		return dep.contains(uri);
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
	
	
	//XXX: Decomment to get Content assist
	@Override
	public void completeViewpoint_UseDiagramResource(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		

		final Bundle bundle = Platform.getBundle(SIRIUS_PLUGIN_ID);
		final URL url = FileLocator.find(bundle, new Path(IMG_PATH),
				Collections.EMPTY_MAP);

		Image image = ImageDescriptor.createFromURL(url).createImage();
		
		ViewpointRegistry siriusRegistry = ViewpointRegistry.getInstance();
		
		Set<org.eclipse.sirius.viewpoint.description.Viewpoint> odesigns = siriusRegistry.getViewpoints();
		
		for (org.eclipse.sirius.viewpoint.description.Viewpoint viewpoint : odesigns) {
			
			String platformURI = viewpoint.eResource().getURI().toString();
			
			if (!checkAlreadyImportedDiagramURI(model, platformURI))
			{
				acceptor.accept(createCompletionProposal(
						"\"" + platformURI + "\"", buidStyledStringFor(platformURI),
						image, context));
			}
			
		}
	}
	
	@Override
	public void completeViewpoint_UseWorkspaceResource(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		
		
		//decomment if want use all workspace resources
//		final String IMG_FILE_PATH ="icons/full/obj16/file_obj.gif";

		final Bundle bundle = Platform.getBundle(PLUGIN_ID);
		final URL fldrUrl = FileLocator.find(bundle, new Path(IMG_FOLDER_PATH),
				Collections.EMPTY_MAP);
		
		//decomment if want use all workspace resources
//		final URL file_url = FileLocator.find(bundle, new Path(IMG_FILE_PATH),
//				Collections.EMPTY_MAP);

		Image fldrImage = ImageDescriptor.createFromURL(fldrUrl).createImage();
		
		//decomment if want use all workspace resources
//		Image file_image = ImageDescriptor.createFromURL(file_url).createImage();
		
		List<IContainer> containers = WorkspaceResourceHelper.getAllWorkspaceContainers(ResourcesPlugin.getWorkspace());
		
		//decomment if want use all workspace resources
		//List<IFile> files = WorkspaceResourceHelper.getAllWorkspaceFiles(ResourcesPlugin.getWorkspace());

		for (IContainer c : containers) {
			String path = c.getFullPath().toString();
			
			if (!checkAlreadyImportedWSURI(model, path))
			{
				acceptor.accept(createCompletionProposal(
						"\"" + path + "\"", new StyledString(path),
						fldrImage, context));
			}
		}
	}
	
	
	@Override
	public void completeViewpoint_UseAnyEMFResource(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {

		final Bundle bundle = Platform.getBundle(EMF_PLUGIN_ID);
		final URL url = FileLocator.find(bundle, new Path(SCHEMAT_PATH),
				Collections.EMPTY_MAP);

		Image image = ImageDescriptor.createFromURL(url).createImage();
		
		Collection<String> platformNsUri = URIConverterHelper.getPlatformURIOfAllEPackages();
		
		for (String pUri : platformNsUri) {
			
			if (!checkAlreadyImportedEMFURI(model, pUri)){
				acceptor.accept(
						createCompletionProposal(
								"\"" + pUri + "\"", buidStyledStringFor(pUri), image, context));
			}
		}
	}
}

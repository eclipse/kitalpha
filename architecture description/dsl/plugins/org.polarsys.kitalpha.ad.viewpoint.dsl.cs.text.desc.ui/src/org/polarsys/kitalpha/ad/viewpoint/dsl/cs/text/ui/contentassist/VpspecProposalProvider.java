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

import java.awt.geom.GeneralPath;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.sirius.business.internal.migration.NsURIMigrationParticipant;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.registry.DataWorkspaceEPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.Services;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpspecGrammarAccess;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.AbstractVpspecProposalProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.inject.Inject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.ServiceSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpspecProposalProvider extends AbstractVpspecProposalProvider {
	
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
					EList<Aspect> vp_Aspects = ((Viewpoint) root).getVP_Aspects();
					for (Aspect candidate: vp_Aspects){
						if (candidate instanceof UIDescription && proposal.getDisplayString().matches(access.getViewpointAccess().getTypeUIKeyword_13_0_0().getValue())){
							return;
						}
						if (candidate instanceof DiagramSet && proposal.getDisplayString().matches(access.getViewpointAccess().getTypeDiagramsKeyword_14_0_0().getValue())){
							return;
						}
						if (candidate instanceof ServiceSet && proposal.getDisplayString().matches(access.getViewpointAccess().getTypeServicesKeyword_15_0_0().getValue())){
							return;
						}
						if (candidate instanceof Configuration && proposal.getDisplayString().matches(access.getViewpointAccess().getTypeConfigurationKeyword_17_0_0().getValue())) {
							return;
						}
					}
					//Check if Data is already defined
					Data vp_Data = ((Viewpoint) root).getVP_Data();
					if (vp_Data != null && proposal.getDisplayString().matches(access.getViewpointAccess().getDataKeyword_12_0().getValue())) {
						return;
					}
				}			
				//Don't propose UI, Rules, Services, and Configuration before Data	
				if (proposal.getDisplayString().matches(access.getViewpointAccess().getTypeUIKeyword_13_0_0().getValue()) ||
					proposal.getDisplayString().matches(access.getViewpointAccess().getTypeConfigurationKeyword_17_0_0().getValue()) ||
					proposal.getDisplayString().matches(access.getViewpointAccess().getTypeBuildKeyword_16_0_0().getValue()) ||
					proposal.getDisplayString().matches(access.getViewpointAccess().getTypeDiagramsKeyword_14_0_0().getValue()) ||
					proposal.getDisplayString().matches(access.getViewpointAccess().getTypeServicesKeyword_15_0_0().getValue())) {					
					INode currentNode = contentAssistContext.getCurrentNode();
					INode nextSibling = currentNode.getNextSibling();
					if (nextSibling != null) {
						String text = nextSibling.getText();
						if (text.equals(access.getViewpointAccess().getDataKeyword_12_0().getValue())){
							return;
						}
					}
				}			
				//Don't propose Diagram before UI	
				if (proposal.getDisplayString().matches(access.getViewpointAccess().getTypeDiagramsKeyword_14_0_0().getValue())) {				
					INode currentNode = contentAssistContext.getCurrentNode();
					INode nextSibling = currentNode.getNextSibling();
					if (nextSibling != null) {
						String text = nextSibling.getText();
						if (text.equals(access.getViewpointAccess().getTypeUIKeyword_13_0_0().getValue())){
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
		if (qualifiedNameAsString == null)
			qualifiedNameAsString = shortName;
		if (qualifiedNameAsString == null) {
			if (element != null)
				qualifiedNameAsString = labelProvider.getText(element);
			else
				return null;
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
		if (aspectType.equals(access.getViewpointAccess().getTypeBuildKeyword_16_0_0().getValue()))
			return new Predicate<IEObjectDescription>() {
				public boolean apply(IEObjectDescription d) {
					return (d.getEObjectOrProxy() instanceof Build);
				}
			};
		if (aspectType.equals(access.getViewpointAccess().getTypeConfigurationKeyword_17_0_0().getValue()))
			return new Predicate<IEObjectDescription>() {
				public boolean apply(IEObjectDescription d) {
					return (d.getEObjectOrProxy() instanceof Configuration);
				}
			};
		if (aspectType.equals(access.getViewpointAccess().getDataKeyword_12_0().getValue()))
			return new Predicate<IEObjectDescription>() {
				public boolean apply(IEObjectDescription d) {
					return (d.getEObjectOrProxy() instanceof Data);
				}
			};
		if (aspectType.equals(access.getViewpointAccess().getTypeDiagramsKeyword_14_0_0().getValue()))
			return new Predicate<IEObjectDescription>() {
				public boolean apply(IEObjectDescription d) {
					return (d.getEObjectOrProxy() instanceof DiagramSet);
				}
			};
		if (aspectType.equals(access.getViewpointAccess().getTypeServicesKeyword_15_0_0().getValue()))
			return new Predicate<IEObjectDescription>() {
				public boolean apply(IEObjectDescription d) {
					return (d.getEObjectOrProxy() instanceof ServiceSet);
				}
			};
		if (aspectType.equals(access.getViewpointAccess().getTypeUIKeyword_13_0_0().getValue()))
			return new Predicate<IEObjectDescription>() {
				public boolean apply(IEObjectDescription d) {
					return (d.getEObjectOrProxy() instanceof UIDescription);
				}
			};
		return Predicates.<IEObjectDescription> alwaysTrue();
	}
	
	@Override
	public void completeViewpoint_UseEcoreResource(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		final String EMF_PLUGIN_ID = "org.eclipse.emf.ecore.edit";
		final String SCHEMAT_PATH = "icons/full/obj16/EPackage.gif";

		final Bundle bundle = Platform.getBundle(EMF_PLUGIN_ID);
		final URL url = FileLocator.find(bundle, new Path(SCHEMAT_PATH),
				Collections.EMPTY_MAP);

		Image image = ImageDescriptor.createFromURL(url).createImage();
		
		Collection<String> platformNsUri = getPlatformURIOfAllEPackages();
		
		for (String pUri : platformNsUri) {
			StyledString styledUri = new StyledString();
			acceptor.accept(
					createCompletionProposal(
							pUri, styledUri, image, context));
		}
		
		
	}
	
	private Collection<String> getPlatformURIOfAllEPackages(){
		Collection<Object> packages = DataWorkspaceEPackage.INSTANCE.values();
		
		Collection<String> platformsNsURI = new HashSet<String>();
		 
		for (Object pkg : packages) {
			EPackage ePackage = null;
			
			if (pkg instanceof EPackage)
				ePackage = (EPackage)pkg;
			else {
				if (pkg instanceof EPackage.Descriptor){
					ePackage = ((EPackage.Descriptor)pkg).getEPackage();
				}
			}
			
			if (ePackage != null){
//				URI resource_uri = ePackage.eResource().getURI();
				URI resource_uri = getPlatformURI(URI.createURI(ePackage.getNsURI()));
				if (resource_uri.isPlatformPlugin()){
					String platform_uri = resource_uri.toString();
					platformsNsURI.add(platform_uri);
				}
				
				if (resource_uri.isPlatformResource()){
					String platform_uri = resource_uri.toString();
					platformsNsURI.add(platform_uri);
				}
			}
		}
		return platformsNsURI;
	}
	
	
	private URI getPlatformURI(URI uri){
		URI genmodelURI = EcorePlugin.getEPackageNsURIToGenModelLocationMap().get(uri.toString());
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.createResource(genmodelURI);
		
		try {
			r.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(GenPackage genPackage: ((GenModel)r.getContents().get(0)).getGenPackages()){
			URI platformURI = genPackage.getEcorePackage().eResource().getURI();
			return platformURI;
		}
		return null;
	}
	
}

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

import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.sirius.viewpoint.description.Group;
import org.eclipse.xtext.resource.IExternalContentSupport.IExternalContentProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.polarsys.kitalpha.ad.integration.sirius.model.SiriusRepresentation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.desc.CoreDomainViewpointHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helper.URIConverterHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RepresentationElement;


/**
 * @author Faycal Abka
 */
public class UseLinksContentassistHelper {
	public static final String MODEL_KEY = "model";	
	public static final String DIAGRAM_KEY = "diagram";	
	
	private static final DiagramUseLinks imports = new DiagramUseLinks();	
	
	
	
	public static DiagramUseLinks getViewpointRepresentation(EObject model, IExternalContentProvider externalProvider){	
		
		imports.clear();	
		
		String projectName = ResourceHelper.getProjectName(model);	
		
		Viewpoint vp = getRootViewpoint(model, projectName, externalProvider);	
		
		initImportsWithUsedViewpoints(vp);	
		initImportsWithModelsAndDiagrams(vp);	
		initImportWithWorkspaceAndFSResources(vp);
		
		return imports;	
		
	}	
	
	private static void initImportWithWorkspaceAndFSResources(Viewpoint vp) {	
		EList<String> wsResources = vp.getUseWorkspaceResource();
		EList<String> fsResources = vp.getUseFSResource();	
		
		for (String uri : wsResources) {	
			addImport(uri);	
		}	
		
		for (String uri : fsResources) {	
			addImport(uri);	
		}	
	}	
	
	private static void addImport(String uri) {	
		URI tmp = URI.createURI(uri);	
		
		if (tmp.isFile() ||	
				tmp.isHierarchical() ||	
				tmp.isPlatform() ||	
				tmp.isRelative()){	
			if (tmp.lastSegment().endsWith(".ecore")){	
				imports.put(MODEL_KEY, uri);	
			}	
			if (tmp.lastSegment().endsWith("odesign")){	
				imports.put(DIAGRAM_KEY, uri);	
			}	
		} else {	
			//TODO Log 	
		}	
	}	
	
	private static void initImportsWithModelsAndDiagrams(Viewpoint vp) {	
		EList<String> usedModels = vp.getUseAnyEMFResource();	
		EList<String> usedDiagrams = vp.getUseDiagramResource();	
		
		for (String uri : usedModels) {	
			imports.put(MODEL_KEY, uri);	
		}	
		
		for (String uri : usedDiagrams) {	
			imports.put(DIAGRAM_KEY, uri);	
		}	
		
	}	
	
	private static void initImportsWithUsedViewpoints(Viewpoint vp) {	
		EList<Viewpoint> viewpoints = vp.getUseViewpoint();	
		
		for (Viewpoint viewpoint : viewpoints) {	
			String vpProjectName = ResourceHelper.getProjectName(viewpoint);	

			//FIXME: get this id form configuation aspect 	
			String resource_id = vpProjectName.substring(0, vpProjectName.lastIndexOf("."));	

			org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint coreDomainViewpoint = CoreDomainViewpointHelper.getCoreDomainViewpoint(resource_id, null);	

			if (coreDomainViewpoint == null){	
				throw new RuntimeException("Could not find the viewpoint resource for the project: " + vpProjectName);	
			} else {                        	
				EList<EPackage> packages = coreDomainViewpoint.getMetamodel().getModels();	
				EList<RepresentationElement> representations = coreDomainViewpoint.getRepresentation().getRepresentations();	
				fillURI(packages, representations);	
			}	
		}	
	}	
	
	private static void fillURI(EList<EPackage> packages,	
			EList<RepresentationElement> representations) {	
		
		for (EPackage ePackage : packages) {
			String nsuri = ePackage.getNsURI();	
			URI uri = URI.createURI(nsuri);
			URI p_uri = URIConverterHelper.getPlatformURI(uri);
			
			if (p_uri != null && !p_uri.isEmpty())
				imports.put(MODEL_KEY, p_uri.toString());
			else {
				Resource ePackageResource = ePackage.eResource();
				if (ePackageResource != null){
					URI resource_uri = ePackageResource.getURI();
					
					if (resource_uri != null && !resource_uri.isEmpty())
						imports.put(MODEL_KEY, resource_uri.toString());
				} else {
					imports.put(MODEL_KEY, nsuri);
				}
			}
		}
	
		for (RepresentationElement representationElement : representations) {	
			if (representationElement instanceof SiriusRepresentation){	
				Group group = ((SiriusRepresentation)representationElement).getOdesign();	
				if (group.eResource().getURI().isPlatformResource()){	
					String ptf_uri = URI.createPlatformResourceURI(group.eResource().getURI().toPlatformString(true), true).toString();	
							imports.put(DIAGRAM_KEY, ptf_uri);	
				}	
				
				if (group.eResource().getURI().isPlatformPlugin()){	
					String plg_uri = URI.createPlatformPluginURI(group.eResource
							().getURI().toPlatformString(true), true).toString();	
							imports.put(DIAGRAM_KEY, plg_uri);	
				}	
			}	
		}	
	}        	
	
	
	private static Viewpoint getRootViewpoint(EObject model, String projectName, IExternalContentProvider externalProvider){	
		
		ResourceSet fakeResourceSet = new ResourceSetImpl();	
		XtextResource resource;	
		
		ResourceHelper.loadPrimaryResource(projectName, fakeResourceSet);	
		URI uri = ResourceHelper.getPrimaryResourceURI(projectName);	
		
		resource = (XtextResource) fakeResourceSet.getResource(uri, false);	
		String text = externalProvider.getActualContentProvider().getContent(uri);	
		
		if (text != null && !text.isEmpty() && resource != null)	
		try {	
			resource.reparse(text);	
		} catch (IOException e) {	
			e.printStackTrace();	
		}	
		//TODO log 	
		
		Viewpoint viewpoint = getCurrentViewpoint(resource);	
		
		return viewpoint;	
	}	

	
	private static Viewpoint getCurrentViewpoint(Resource resource) {	
		
		TreeIterator<EObject> it = resource.getAllContents();	
		
		while (it.hasNext()){	
			EObject v = it.next();	
			if (v instanceof Viewpoint)	
			return (Viewpoint)v;	
		}	
		return null;	
	}
}

/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.resource.IExternalContentSupport.IExternalContentProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.desc.CoreDomainViewpointHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helper.URIConverterHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.identifiers.EditorIDs;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;

/**
 * 
 * @author Faycal ABKA
 *
 */
public class NsUriFinder {

	public static Set<String> getViewpointEPackagesNSURI(EObject model, IExternalContentProvider externalProvider){
		String projectName = ResourceHelper.getProjectName(model);
		Viewpoint vp = getRootViewpoint(model, projectName, externalProvider);
		Set<String> uris = new HashSet<String>();

		uris = getUsedModel(vp);

		return uris;
	}


	private static Set<String> getUsedModel(Viewpoint vp) {
		Set<String> uris = new HashSet<String>();
		
		if (vp.getUseAnyEMFResource() != null && !vp.getUseAnyEMFResource().isEmpty()) {
			uris.addAll(vp.getUseAnyEMFResource());
		}
		
		if (vp.getUseAnyEMFResource() != null && !vp.getUseAnyEMFResource().isEmpty()) {
			uris.addAll(getWSAndFSResource(vp));
		}
		
		uris.addAll(getUsedViewpointEPackages(vp));
		
		return uris;
	}

	
	private static Collection<? extends String> getWSAndFSResource(Viewpoint vp) {
		Collection<String> uris = new HashSet<String>();
		
		for (String uri : vp.getUseFSResource()) {
			if (uri.endsWith(".ecore")) {
				uris.add(uri);
			}
		}
		
		 for (String uri : vp.getUseWorkspaceResource()) {
			 if (uri.endsWith(".ecore")) {
				uris.add(uri);
			}
		 }
		 return uris;
	}
	
	
	private static Collection<String> getUsedViewpointEPackages(Viewpoint vp){
		EList<Viewpoint> viewpoints = vp.getUseViewpoint();
		
		Collection<String> platformURIs = new HashSet<String>();
		
		for (Viewpoint viewpoint : viewpoints) {	
			String vpProjectName = ResourceHelper.getProjectName(viewpoint);	

			//FIXME: get this id form configuation aspect 	
			String resourceid = vpProjectName.substring(0, vpProjectName.lastIndexOf("."));	

			org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint coreDomainViewpoint = CoreDomainViewpointHelper.getCoreDomainViewpoint(resourceid, null);
			
			if (coreDomainViewpoint == null){	
				throw new RuntimeException("Could not find the viewpoint resource for the project: " + vpProjectName);
			} else {
				EList<EPackage> packages = coreDomainViewpoint.getMetamodel().getModels();	
				platformURIs.addAll(getPlatformURIsOfPackages(packages));
			}
		}
		return platformURIs;
	}
		
		
		private static Collection<String> getPlatformURIsOfPackages(EList<EPackage> packages) {	

			Collection<String> platformsUri = new HashSet<String>();
			for (EPackage ePackage : packages) {
				String nsuri = ePackage.getNsURI();
				
				URI uri = URI.createURI(nsuri);
				URI puri = URIConverterHelper.getPlatformURI(uri);
				
				if (puri != null && !puri.isEmpty()){
					platformsUri.add(puri.toString());
				} else {
					Resource ePackageResource = ePackage.eResource();
					if (ePackageResource != null){
						URI resourceuri = ePackageResource.getURI();
						
						if (resourceuri != null && !resourceuri.isEmpty()) {
							platformsUri.add(resourceuri.toString());
						}
					} else {
						platformsUri.add(nsuri);
					}
				}
					
			}
			
			return platformsUri;
	}
	
		
	//FIXME duplicate code in UseLinksContentAssistHelper
	private static Viewpoint getRootViewpoint(EObject model, String projectName, IExternalContentProvider externalProvider){
		
		ResourceSet fakeResourceSet = new ResourceSetImpl();	
		XtextResource resource;
		Viewpoint viewpoint = null; //result
		
		ResourceHelper.loadPrimaryResource(projectName, fakeResourceSet);	
		URI uri = ResourceHelper.getPrimaryResourceURI(projectName);
		
		resource = (XtextResource) fakeResourceSet.getResource(uri, false);	
		String text = null;
		
		IEditorReference vpspecEditor = getOpenedEditor(uri);
		
		try {
			if (vpspecEditor != null)
			{
				XtextEditor editor = (XtextEditor) vpspecEditor.getEditor(false);
				text = editor.getDirtyStateEditorSupport().getDirtyStateManager().getActualContentProvider().getContent(uri);

				if (text != null && !text.isEmpty() && resource != null)
				{
					resource.reparse(text);
				}
				else
				{
					if (resource != null) {
						resource.load(Collections.emptyMap());
					}
				}
			}
			else
			{
				if (resource != null)
				{
					resource.load(Collections.emptyMap());
				}
				
			}
			
			viewpoint = getCurrentViewpoint(resource); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return viewpoint;
	}
	
	
	//FIXME put these 2 methods in an abstract class in common plugin to be shared by Data 
	//NsUriFinder too (they are duplicated!)
	private static Viewpoint getCurrentViewpoint(Resource standaloneResource) {
		if (standaloneResource != null){
			TreeIterator<EObject> it = standaloneResource.getAllContents();
			while (it.hasNext()){
				EObject v = it.next();
				if (v instanceof Viewpoint) {
					return (Viewpoint)v;
				}
			}
		}
		return null;
	}

	private static IEditorReference getOpenedEditor(URI uri) {

		IEditorReference[] editors = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getEditorReferences();

		for (IEditorReference iEditorReference : editors) {
			String id = iEditorReference.getId();

			if (id.equals(EditorIDs.VPSPEC_EDITOR_ID))
			{
				try {
					IFile file = iEditorReference.getEditorInput().getAdapter(IFile.class);

					if (file != null)
					{
						String project = file.getProject().getName().toString();
						String segment = uri.segment(1);

						if (project.equalsIgnoreCase(segment)) {
							return iEditorReference;
						}
					}

				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}

		}

		return null;
	}
}

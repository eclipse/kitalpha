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
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.sirius.viewpoint.description.Group;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.polarsys.kitalpha.ad.integration.sirius.model.SiriusRepresentation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.desc.CoreDomainViewpointHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helper.URIConverterHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.identifiers.EditorIDs;
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
	
	
	
	public static DiagramUseLinks getViewpointRepresentation(EObject model){	
		
		imports.clear();	
		
		String projectName = ResourceHelper.getProjectName(model);	
		
		Viewpoint vp = getRootViewpoint(model, projectName);	
		
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
					String ptf_uri = ResourceHelper.URIFix.createPlatformResourceURI(group.eResource().getURI().toPlatformString(true), true).toString();	
							imports.put(DIAGRAM_KEY, ptf_uri);	
				}	
				
				if (group.eResource().getURI().isPlatformPlugin()){	
					String plg_uri = ResourceHelper.URIFix.createPlatformPluginURI(group.eResource
							().getURI().toPlatformString(true), true).toString();	
							imports.put(DIAGRAM_KEY, plg_uri);	
				}	
			}	
		}	
	}        	
	
	
	private static Viewpoint getRootViewpoint(EObject model, String projectName){
		
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
					if (resource != null)
						resource.load(Collections.emptyMap());
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

						if (project.equalsIgnoreCase(segment))
							return iEditorReference;
					}
				
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		return null;
	}

	private static Viewpoint getCurrentViewpoint(Resource resource) {	
		
		if (resource == null) return null;
		
		TreeIterator<EObject> it = resource.getAllContents();	
		
		while (it.hasNext()){	
			EObject v = it.next();	
			if (v instanceof Viewpoint)	
			return (Viewpoint)v;	
		}	
		return null;	
	}
}

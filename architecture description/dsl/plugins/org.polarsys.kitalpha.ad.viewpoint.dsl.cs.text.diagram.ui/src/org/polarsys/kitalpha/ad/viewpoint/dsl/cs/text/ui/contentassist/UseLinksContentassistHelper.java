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
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RepresentationElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.desc.CoreDomainViewpointHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helper.URIConverterHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.identifiers.EditorIDs;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;


/**
 * @author Faycal Abka
 */
public class UseLinksContentassistHelper {
	public static final String MODEL_KEY = "model";
	public static final String DIAGRAM_KEY = "diagram";

	private static final DiagramUseLinks imports = new DiagramUseLinks();



	public static DiagramUseLinks getViewpointRepresentation(final EObject model){

		imports.clear();

		final String projectName = ResourceHelper.getProjectName(model);

		final Viewpoint vp = getRootViewpoint(model, projectName);

		initImportsWithUsedViewpoints(vp);
		initImportsWithModelsAndDiagrams(vp);
		initImportWithWorkspaceAndFSResources(vp);

		return imports;

	}

	private static void initImportWithWorkspaceAndFSResources(final Viewpoint vp) {
		final EList<String> wsResources = vp.getUseWorkspaceResource();
		final EList<String> fsResources = vp.getUseFSResource();

		for (final String uri : wsResources) {
			addImport(uri);
		}

		for (final String uri : fsResources) {
			addImport(uri);
		}
	}

	private static void addImport(final String uri) {
		final URI tmp = URI.createURI(uri);

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

	private static void initImportsWithModelsAndDiagrams(final Viewpoint vp) {
		final EList<String> usedModels = vp.getUseAnyEMFResource();
		final EList<String> usedDiagrams = vp.getUseDiagramResource();

		for (final String uri : usedModels) {
			imports.put(MODEL_KEY, uri);
		}

		for (final String uri : usedDiagrams) {
			imports.put(DIAGRAM_KEY, uri);
		}

	}

	private static void initImportsWithUsedViewpoints(final Viewpoint vp) {
		final EList<Viewpoint> viewpoints = vp.getUseViewpoint();

		for (final Viewpoint viewpoint : viewpoints) {
			final String vpProjectName = ResourceHelper.getProjectName(viewpoint);

			//FIXME: get this id form configuation aspect
			final String resourceid = vpProjectName.substring(0, vpProjectName.lastIndexOf("."));

			final org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint coreDomainViewpoint = CoreDomainViewpointHelper.getCoreDomainViewpoint(resourceid, null);

			if (coreDomainViewpoint == null){
				throw new RuntimeException("Could not find the viewpoint resource for the project: " + vpProjectName);
			} else {
				final EList<EPackage> packages = coreDomainViewpoint.getMetamodel().getModels();
				final EList<RepresentationElement> representations = coreDomainViewpoint.getRepresentation().getRepresentations();
				fillURI(packages, representations);
			}
		}
	}

	private static void fillURI(final EList<EPackage> packages,
			final EList<RepresentationElement> representations) {

		for (final EPackage ePackage : packages) {
			final String nsuri = ePackage.getNsURI();
			final URI uri = URI.createURI(nsuri);
			final URI puri = URIConverterHelper.getPlatformURI(uri);

			if ((puri != null) && !puri.isEmpty()) {
				imports.put(MODEL_KEY, puri.toString());
			} else {
				final Resource ePackageResource = ePackage.eResource();
				if (ePackageResource != null){
					final URI resourceuri = ePackageResource.getURI();

					if ((resourceuri != null) && !resourceuri.isEmpty()) {
						imports.put(MODEL_KEY, resourceuri.toString());
					}
				} else {
					imports.put(MODEL_KEY, nsuri);
				}
			}
		}

		for (final RepresentationElement representationElement : representations) {
			if (representationElement instanceof SiriusRepresentation){
				final Group group = ((SiriusRepresentation)representationElement).getOdesign();
				if (group.eResource().getURI().isPlatformResource()){
					final String ptfuri = ResourceHelper.URIFix.createPlatformResourceURI(group.eResource().getURI().toPlatformString(true), true).toString();
					imports.put(DIAGRAM_KEY, ptfuri);
				}

				if (group.eResource().getURI().isPlatformPlugin()){
					final String plguri = ResourceHelper.URIFix.createPlatformPluginURI(group.eResource
							().getURI().toPlatformString(true), true).toString();
					imports.put(DIAGRAM_KEY, plguri);
				}
			}
		}
	}


	private static Viewpoint getRootViewpoint(final EObject model, final String projectName){

		final ResourceSet fakeResourceSet = new ResourceSetImpl();
		XtextResource resource;
		Viewpoint viewpoint = null; //result

		ResourceHelper.loadPrimaryResource(projectName, fakeResourceSet);
		final URI uri = ResourceHelper.getPrimaryResourceURI(projectName);

		resource = (XtextResource) fakeResourceSet.getResource(uri, false);
		String text = null;

		final IEditorReference vpspecEditor = getOpenedEditor(uri);

		try {
			if (vpspecEditor != null)
			{
				final XtextEditor editor = (XtextEditor) vpspecEditor.getEditor(false);
				text = editor.getDirtyStateEditorSupport().getDirtyStateManager().getActualContentProvider().getContent(uri);

				if ((text != null) && !text.isEmpty() && (resource != null))
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
		} catch (final IOException e) {
			e.printStackTrace();
		}

		return viewpoint;
	}


	private static IEditorReference getOpenedEditor(final URI uri) {

		final IEditorReference[] editors = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getEditorReferences();

		for (final IEditorReference iEditorReference : editors) {
			final String id = iEditorReference.getId();

			if (id.equals(EditorIDs.VPSPEC_EDITOR_ID))
			{
				try {
					final IFile file = iEditorReference.getEditorInput().getAdapter(IFile.class);

					if (file != null)
					{
						final String project = file.getProject().getName().toString();
						final String segment = uri.segment(1);

						if (project.equalsIgnoreCase(segment)) {
							return iEditorReference;
						}
					}

				} catch (final PartInitException e) {
					e.printStackTrace();
				}
			}

		}

		return null;
	}

	private static Viewpoint getCurrentViewpoint(final Resource resource) {

		if (resource == null) {
			return null;
		}

		final TreeIterator<EObject> it = resource.getAllContents();

		while (it.hasNext()){
			final EObject v = it.next();
			if (v instanceof Viewpoint) {
				return (Viewpoint)v;
			}
		}
		return null;
	}
}

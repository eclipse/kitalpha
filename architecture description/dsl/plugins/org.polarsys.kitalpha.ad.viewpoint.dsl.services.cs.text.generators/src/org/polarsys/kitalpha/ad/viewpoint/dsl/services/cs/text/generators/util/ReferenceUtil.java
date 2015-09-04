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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.util;
 
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EContentsEList.FeatureIterator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.identifiers.MetamodelIDs;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.Messages;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.EMFResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.FileSystemResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointResources;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescFactory;

/**
 * 
 * @author Amine Lajmi
 * 		   Faycal Abka
 *
 */
public class ReferenceUtil {
	
	private ReferenceUtil() {}

	public static void setTargetReferences(org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint source, org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint target, ResourceSet resourceSet) {
		target.getParents().clear();
		EList<org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint> parents = source.getParents();
		for (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint x : parents) {
			URI uri = EcoreUtil.getURI(x);
			URI alterEgo = uri.trimFileExtension().appendFileExtension(FileExtension.SPECIFICATION_EXTENSION).trimFragment();
			EObject eObject = ResourceHelper.loadPrimaryResource(alterEgo, resourceSet).get(0);
			target.getParents().add((org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint)eObject);
		}
		target.getDependencies().clear();
		EList<org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint> dependencies = source.getDependencies();
		for (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint x : dependencies) {
			URI uri = EcoreUtil.getURI(x);
			URI alterEgo = uri.trimFileExtension().appendFileExtension(FileExtension.SPECIFICATION_EXTENSION).trimFragment();
			EObject eObject = ResourceHelper.loadPrimaryResource(alterEgo, resourceSet).get(0);
			target.getDependencies().add((org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint)eObject);
		}
		
		target.getUseViewpoint().clear();
		EList<Viewpoint> usedViewpoints = source.getUseViewpoint();
		
		for (Viewpoint x : usedViewpoints) {
			URI uri = EcoreUtil.getURI(x);
			URI alterEgo = uri.trimFileExtension().appendFileExtension(FileExtension.SPECIFICATION_EXTENSION).trimFragment();
			EObject eObject = ResourceHelper.loadPrimaryResource(alterEgo, resourceSet).get(0);
			target.getUseViewpoint().add((org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint)eObject);
		}
		
		//use anyEMF resource
		target.getUseAnyEMFResource().clear();
		initModelTextEMFUsedResources(source.getViewpointResources(), target);
		
		//use diagram resource
		target.getUseDiagramResource().clear();
		initModelTextUsedDiagramResources(source.getViewpointResources(), target);
		
		//Use workspace
		target.getUseWorkspaceResource().clear();
		initUsedWorkspaceResource(source.getViewpointResources(), target);
		
		//Use filesystem resource
		target.getUseFSResource().clear();
		initUsedFSResources(source.getViewpointResources(), target);
	}

	
	
	private static void initUsedFSResources(
			ViewpointResources viewpointResources,
			org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint target) {

		if (viewpointResources != null){
			EList<AbstractResource> resources = viewpointResources.getUseResource();

			for (AbstractResource abstractResource : resources) {
				if (abstractResource instanceof FileSystemResource){
					FileSystemResource fsr = (FileSystemResource)abstractResource;
					if (!fsr.isWorkspace()){
						target.getUseFSResource().add("\"" + fsr.getPath().trim() + "\"");
					}
				}
			}
		}
	}

	private static void initUsedWorkspaceResource(
			ViewpointResources viewpointResources,
			org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint target) {

		if (viewpointResources != null){
			EList<AbstractResource> resources = viewpointResources.getUseResource();

			for (AbstractResource abstractResource : resources) {
				if (abstractResource instanceof FileSystemResource){
					FileSystemResource fsr = (FileSystemResource)abstractResource;
					if (fsr.isWorkspace()){
						target.getUseWorkspaceResource().add("\"" + fsr.getPath().trim() + "\"");
					}
				}
			}
		}

	}

	private static void initModelTextUsedDiagramResources(
			ViewpointResources viewpointResources,
			org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint target) {
		
		initModelTextEMFUsedResources(viewpointResources, target);
		
	}

	private static void initModelTextEMFUsedResources(
			ViewpointResources viewpointResources,
			org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint target) {
		
		
		VpdescUsedResourceSwitch resourceSwitch = new VpdescUsedResourceSwitch(target);
		if (viewpointResources != null){
			EList<AbstractResource> usedUMFResources = viewpointResources.getUseResource();
			
			for (AbstractResource abstractResource : usedUMFResources) {
				resourceSwitch.doSwitch(abstractResource);
			}
		}
	}

	public static void setTargetReferences(org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint viewpoint,	Viewpoint target, ResourceSet resourceSet) {
		//Parents (extends)
		target.getParents().clear();
		EList<org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint> parents = viewpoint.getParents();
		for (org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint x : parents) {
			//					URI uri = EcoreUtil.getURI(x);
			//					URI alterEgo = uri.trimFileExtension().trimFileExtension().appendFileExtension(FileExtension.VPDESC_EXTENSION);
			//					EObject eObject = resourceSet.getEObject(alterEgo, true);
			target.getParents().add(computeModelViewpoint(x, resourceSet));
		}

		//Dependencies (aggregates)
		target.getDependencies().clear();
		EList<org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint> dependencies = viewpoint.getDependencies();
		for (org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint x : dependencies) {
			target.getDependencies().add(computeModelViewpoint(x, resourceSet));
		}

		//Use link (use viewpoint)
		target.getUseViewpoint().clear();
		EList<org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint> useViewpoints = viewpoint.getUseViewpoint();

		target.getUseViewpoint().clear();
		for (org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint x : useViewpoints) {
			target.getUseViewpoint().add(computeModelViewpoint(x, resourceSet));
		}
		
		target.setViewpointResources(null);
		
//		//Use anyEMF
//		initModelEMFUsedResources(viewpoint.getUseAnyEMFResource(), target);
//		
//		//Use diagram
//		initModelUsedDiagram(viewpoint.getUseDiagramResource(), target);
//		
//		//Use workspace
//		initUsedWorkspaceResource(viewpoint.getUseWorkspaceResource(), target);
//		
//		//Use fileSystem
//		initUseFileSystemResource(viewpoint.getUseFSResource(), target);
		
		setViewpointUsedResource(viewpoint, target);
		
	}
	
	
	

	private static void setViewpointUsedResource(
			org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint viewpoint,
			Viewpoint target) {
		
		//Use anyEMF
		initModelEMFUsedResources(viewpoint.getUseAnyEMFResource(), target);

		//Use diagram
		initModelUsedDiagram(viewpoint.getUseDiagramResource(), target);

		//Use workspace
		initUsedWorkspaceResource(viewpoint.getUseWorkspaceResource(), target);

		//Use fileSystem
		initUseFileSystemResource(viewpoint.getUseFSResource(), target);
		
	}

	private static void initUseFileSystemResource(EList<String> useFSResource,
			Viewpoint target) {
		

		if (useFSResource == null || useFSResource.isEmpty()){
			return;
		}
		
		ViewpointResources vr = target.getViewpointResources();
		
		if (vr == null){
			vr = VpdescFactory.eINSTANCE.createViewpointResources();
			target.setViewpointResources(vr);
		}
		
		clearFSResources(vr);
		
		for (String fsPath : useFSResource) {
			if (fsPath != null && !fsPath.isEmpty()){
				FileSystemResource fsr = VpdescFactory.eINSTANCE.createFileSystemResource();
				fsr.setPath(fsPath.substring(1, fsPath.length() - 1));
				fsr.setWorkspace(false);
				target.getViewpointResources().getUseResource().add(fsr);
			}
		}

		
	}

	private static void initUsedWorkspaceResource(
			EList<String> useWorkspaceResource, Viewpoint target) {

		if (useWorkspaceResource == null || useWorkspaceResource.isEmpty()){
			return;
		}
		
		ViewpointResources vr = target.getViewpointResources();
		
		if (vr == null){
			vr = VpdescFactory.eINSTANCE.createViewpointResources();
			target.setViewpointResources(vr);
		}
		
		clearWorkspaceResources(vr);
		
		for (String path : useWorkspaceResource) {
			initPath(path, target);
		}
	}
	
	private static void clearWorkspaceResources(ViewpointResources viewpointResources){
		EList<AbstractResource> ar = viewpointResources.getUseResource();
		
		for (AbstractResource abstractResource : ar) {
			if (abstractResource instanceof FileSystemResource){
				FileSystemResource fsr = (FileSystemResource)abstractResource;
				
				if (fsr.isWorkspace()){
					ar.remove(fsr);
				}
			}
		}
	}
	
	private static void clearFSResources(ViewpointResources viewpointResources){
		EList<AbstractResource> ar = viewpointResources.getUseResource();
		
		for (AbstractResource abstractResource : ar) {
			if (abstractResource instanceof FileSystemResource){
				FileSystemResource fsr = (FileSystemResource)abstractResource;
				if (!fsr.isWorkspace())
					ar.remove(fsr);
			}
		}
	}

	private static void initPath(String path, Viewpoint target) {
		//FIXME path without quotation
		IPath iPath = new Path(path.substring(1, path.length() - 1));

		if (iPath != null){
			
				IResource wsResource = ResourcesPlugin.getWorkspace().getRoot().findMember(iPath);

				if (wsResource != null && wsResource.isAccessible()){
					FileSystemResource fsr = VpdescFactory.eINSTANCE.createFileSystemResource();
					fsr.setPath(path.trim().substring(1, path.length() - 1).trim());
					fsr.setWorkspace(true);
					target.getViewpointResources().getUseResource().add(fsr);
				}

		}
	}

	private static void initModelUsedDiagram(EList<String> useDiagramResource,
			Viewpoint target) {
		initModelEMFUsedResources(useDiagramResource, target);
	}

	private static void initModelEMFUsedResources(
			EList<String> useAnyEMFResource, Viewpoint target) {
		
		if (useAnyEMFResource == null){
			return;
		}

		if (useAnyEMFResource.isEmpty()){
			return;
		}

		ViewpointResources vr = target.getViewpointResources();

		if (vr  == null){
			vr = VpdescFactory.eINSTANCE.createViewpointResources();
			target.setViewpointResources(vr);
		}
		
		//clearEMFResources(vr);
		for (String uri : useAnyEMFResource) {
			if (uri != null && !uri.isEmpty())
				initModelEMFUsedResources(uri.trim(), target);
		}
		
	}
	
	private static void clearEMFResources(ViewpointResources viewpointResources){
		EList<AbstractResource> ar = viewpointResources.getUseResource();
		
		for (AbstractResource abstractResource : ar) {
			if (abstractResource instanceof EMFResource){
				EMFResource fsr = (EMFResource)abstractResource;
				ar.remove(fsr);
			}
		}
	}

	private static void initModelEMFUsedResources(String usedURI, Viewpoint target) {
		
		if (usedURI != null && !usedURI.isEmpty()){
			URI uri = URI.createURI(usedURI.trim().substring(1, usedURI.length() - 1).trim());
			
			if (uri.isPlatform()){
				EMFResource er = VpdescFactory.eINSTANCE.createEMFResource();
				er.setUri(uri.toString());
				target.getViewpointResources().getUseResource().add(er);
			}
		}
	}

	private static Viewpoint computeModelViewpoint(org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint viewpoint, ResourceSet resourceSet){
		EcoreUtil.resolveAll(viewpoint);
		URI uri = EcoreUtil.getURI(viewpoint);
		if (!uri.toString().contains("#xtextLink_")){ // $NON-NLS-1$
			URI alterEgo = uri.trimFileExtension().trimFileExtension().appendFileExtension(FileExtension.VPDESC_EXTENSION);
			return (Viewpoint)resourceSet.getEObject(alterEgo, true);
		}
		return null;
	}
			
	public static void recoverReferences(EObject inputObject, EcoreUtil.Copier copier) {
		TreeIterator<EObject> eAllContents = inputObject.eAllContents();
		while(eAllContents.hasNext()) {
			EObject current = eAllContents.next();
			@SuppressWarnings("rawtypes")
			FeatureIterator featureIterator = (FeatureIterator) current.eCrossReferences().iterator();
			while (featureIterator.hasNext()) {			
				EObject referenced = (EObject) featureIterator.next();
				EObject eObject = (EObject) referenced;				
				if (eObject.eIsProxy()) {
					URI proxyURI = ((org.eclipse.emf.ecore.InternalEObject) eObject).eProxyURI();
					throw new RuntimeException(Messages.ViewpointDSLActions_BackwardSynchronizer_UnresolvedProxy + proxyURI);
				} else {	
					EObject eObject_copy = copier.get(eObject);
					if (eObject_copy!=null) {
						URI uri_copy = EcoreUtil.getURI(eObject_copy);			
						if (uri_copy.isPlatform()==false) {
							URI correctURI = null;
							if (eObject.eClass().getEPackage().getNsURI().equals(MetamodelIDs.VPSERVICES)) {
								//services references rules
								correctURI = GeneratorsUtil.computeURI(inputObject, FileExtension.SERVICES_EXTENSION, uri_copy.toString().replaceFirst("//", "//@services.1"));
							} else {
								//the rest references data
								correctURI = GeneratorsUtil.computeURI(inputObject, FileExtension.DATA_EXTENSION, uri_copy.toString());
							}
							
							((org.eclipse.emf.ecore.InternalEObject) eObject_copy).eSetProxyURI(correctURI);
						}					
					}					
				}	
			}
		}
	}	
}

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
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.EMFResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.FileSystemResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointResources;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.registry.DataWorkspaceEPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.desc.CoreDomainViewpointHelper;

/**
 * 
 * @author Faycal ABKA
 *
 */
public class NsUriFinder {

	@Deprecated
	public static Set<String> getNsUriFromEPackageRegistry(){
		
		Registry registry = EPackageRegistryImpl.INSTANCE;
		return registry.keySet();
	}
	
	
	public static Set<String> getViewpointEPackagesNSURI(EObject model){
		Set<String> nsuris = new HashSet<String>();
		Collection<EPackage> usedEPackages = getUsedEPackages(model);
		Collection<String> usedEMFResources = getUsedEMFResources(model);
		for (EPackage ePacakge : usedEPackages) {
			nsuris.add(ePacakge.getNsURI());
		}
		
		nsuris.addAll(usedEMFResources);
		
		return nsuris;
		
	}
	
	private static Collection<String> getUsedEMFResources(EObject model) {
		Viewpoint viewpoint = getRootViewpoint(model);
		
		ViewpointResources vr = viewpoint.getViewpointResources();
		
		if (vr != null){
			EList<AbstractResource> usedResources = vr.getUseResource();
			
			if (!usedResources.isEmpty()){
				Collection<String> emfUsedUri = getEMFUsedURI(usedResources, model);
				return emfUsedUri;
			}
		}
		
		return Collections.emptyList();
	}


	private static Collection<String> getEMFUsedURI(
			EList<AbstractResource> usedResources, EObject model) {
		
		Collection<String> uris = new HashSet<String>();
		Collection<EPackage> epackages = null;
		
		for (AbstractResource abstractResource : usedResources) {
			if (abstractResource instanceof EMFResource){
				String uri = ((EMFResource)abstractResource).getUri();
				if (!uri.endsWith(".odesign"))
					uris.add(uri);
			}
			
			if (abstractResource instanceof FileSystemResource){
				FileSystemResource fsr = (FileSystemResource)abstractResource;
				String path = fsr.getPath();
				if (path.endsWith(".ecore")){
					IPath p = new Path(path);
					IFileStore fileStore = EFS.getLocalFileSystem().getStore(p);
					java.io.File externalFile = null;
					try {
						externalFile = fileStore.toLocalFile(EFS.NONE, null);
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					if (externalFile != null){
						epackages = DataWorkspaceEPackage.INSTANCE.registerEPackagesFrom(externalFile);
					}
					
					
//					IProject currentProject = ResourcesPlugin.getWorkspace().getRoot().getProject(model.eResource().getURI().segment(1));
//					IFolder folder = currentProject.getFolder("external");
//					if (!folder.exists()){
//						try {
//							folder.create(true, true, null);
//						} catch (CoreException e) {
//							e.printStackTrace();
//						}
//					}
//					IFile f = folder.getFile(p.lastSegment());
//					try {
//						f.createLink(p, IResource.NONE, null);
//					} catch (CoreException e) {
//						//e.printStackTrace();
//					}
					//epackages = DataWorkspaceEPackage.INSTANCE.registerEPackagesFrom(f);
				}
			}
		}

		if (epackages != null && !epackages.isEmpty()){
			for (EPackage ePackage : epackages) {
				uris.add(ePackage.getNsURI());
			}
		}

		return uris;
	}


	private static List<EPackage> getUsedEPackages(EObject model){
		
		Viewpoint viewpoint = getRootViewpoint(model);
		
		return CoreDomainViewpointHelper.getViewpointAccessibleEPackage(viewpoint);
	}


	//FIXME put these 2 methods in an abstract class in common plugin to be shared by Data
	//		NsUriFinder too (they are duplicated!)
	private static Viewpoint getCurrentViewpoint(Resource standaloneResource) {
		
		if (standaloneResource != null){
			TreeIterator<EObject> it = standaloneResource.getAllContents();

			while (it.hasNext()){
				EObject v = it.next();
				if (v instanceof Viewpoint)
					return (Viewpoint)v;
			}
		}
		return null;
	}
	
	private static Viewpoint getRootViewpoint(EObject model){
		
		String projectName = EcoreUtil.getURI(model).segment(1);
		Resource standaloneResource = ResourceHelper.loadStandaloneResource(projectName);
		Viewpoint viewpoint = getCurrentViewpoint(standaloneResource);
		
		return viewpoint;
	}
}

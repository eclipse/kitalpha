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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.registry;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.RegistryReader;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.osgi.service.resolver.ExportPackageDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.WorkspaceResourceHelper;

import com.google.common.collect.Sets;

/**
 * @author Faycal Abka
 */
public class DataWorkspaceEPackage extends HashMap<String, Object> implements
		EPackage.Registry {

	private static final long serialVersionUID = 8725943628088716000L;

	public static final DataWorkspaceEPackage INSTANCE = new DataWorkspaceEPackage();

	private static final EPackage.Registry delegate = EPackage.Registry.INSTANCE;
	
	private final WorkspaceEventHandler wsEventHandler = new WorkspaceEventHandler(this);

	private DataWorkspaceEPackage() {
		initializeDataWorkspaceRegistry(ResourcesPlugin.getWorkspace());
		ResourcesPlugin.getWorkspace().addResourceChangeListener(wsEventHandler);
	}

	public void initializeDataWorkspaceRegistry(IWorkspace workspace) {

		List<IFile> workspaceEcores = WorkspaceResourceHelper.collectWorkspaceResources(workspace, "ecore"); //$NON-NLS-1$

		for (IFile iFile : workspaceEcores) {
			registerEPackagesFrom(iFile);
		}
	}

	public Collection<EPackage> registerEPackagesFrom(IFile file) {
		
		Collection<EPackage> addEPackages = new HashSet<EPackage>();
		
		if (file.isAccessible()){
			String path = file.getFullPath().toOSString();
			URI uri = URI.createPlatformResourceURI(path, true);
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.getResource(uri, true);

			TreeIterator<EObject> it = resource.getAllContents();

			while (it.hasNext()) {
				EObject next = it.next();

				if (next instanceof EPackage) {
					EPackage ePackage = (EPackage) next;
					String ePackageUri = ePackage.getNsURI();
					
					addEPackages.add(ePackage);
					if (!containsKey(ePackageUri))
						put(ePackage.getNsURI(), ePackage);
				}
			}
		}
		return addEPackages;
	}
	
	
	
	public Collection<EPackage> registerEPackagesFrom(java.io.File file) {
		
		Collection<EPackage> addEPackages = new HashSet<EPackage>();

		if (file != null && file.isFile()){
			String path = file.getAbsolutePath();
			URI uri = URI.createFileURI(path);

			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.getResource(uri, true);

			TreeIterator<EObject> it = resource.getAllContents();

			while (it.hasNext()) {
				EObject next = it.next();

				if (next instanceof EPackage) {
					EPackage ePackage = (EPackage) next;
					String ePackageUri = ePackage.getNsURI();

					addEPackages.add(ePackage);
					if (!containsKey(ePackageUri))
						put(ePackage.getNsURI(), ePackage);
				}
			}
		}
		return addEPackages;
	}

//	//TODO redefine it with temporary Map which hold <Path, NSURI>
	
	public void removeEPackagesOf(IFile file) {
		
		if (file.isAccessible()){
			String path = file.getFullPath().toString();
			URI uri = URI.createPlatformResourceURI(path, true);
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.getResource(uri, true);

			TreeIterator<EObject> it = resource.getAllContents();

			while (it.hasNext()) {
				EObject next = it.next();

				if (next instanceof EPackage) {
					EPackage ePackage = (EPackage) next;

					if (containsKey(ePackage.getNsURI())) {
						remove(ePackage.getNsURI());
					}
				}
			}
		}
	}

	@Override
	public Object get(Object key) {
		final Object value = super.get(key);
		if (value == null)
			return delegate.get(key);
		return value;
	}

	@Override
	public EPackage getEPackage(String nsURI) {
		Object workspaceObject = get(nsURI);
		EPackage workspaceEPackage = null;
		
		if (workspaceObject instanceof EPackage.Descriptor){
			workspaceEPackage = ((EPackage.Descriptor) workspaceObject).getEPackage();
		} else {
			workspaceEPackage = (EPackage)workspaceObject;
		}
		

		if (workspaceEPackage == null){
			Object object = delegate.getEPackage(nsURI);
			
			if (object instanceof EPackage.Descriptor){
				return ((EPackage.Descriptor)object).getEPackage();
			}
			return (EPackage)object;
		}

		return workspaceEPackage;
	}

	@Override
	public EFactory getEFactory(String nsURI) {
		EPackage ePackage = getEPackage(nsURI);

		if (ePackage != null)
			return ePackage.getEFactoryInstance();
		return delegate.getEFactory(nsURI);
	}

	@Override
	public Collection<Object> values() {
		return Sets.union(Sets.newHashSet(super.values()),
				Sets.newHashSet(delegate.values()));
	}
	
	
	public void dispose(IWorkspace ws){
		clear();
		ws.removeResourceChangeListener(wsEventHandler);
	}

}

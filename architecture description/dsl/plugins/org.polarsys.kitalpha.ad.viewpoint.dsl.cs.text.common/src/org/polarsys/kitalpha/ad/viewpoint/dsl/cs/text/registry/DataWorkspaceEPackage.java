/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
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

	public void initializeDataWorkspaceRegistry(final IWorkspace workspace) {

		final List<IFile> workspaceEcores = WorkspaceResourceHelper.collectWorkspaceResources(workspace, "ecore"); //$NON-NLS-1$

		for (final IFile iFile : workspaceEcores) {
			registerEPackagesFrom(iFile);
		}
	}

	public Collection<EPackage> registerEPackagesFrom(final IFile file) {

		final Collection<EPackage> addEPackages = new HashSet<EPackage>();

		if (file.isAccessible()){
			final String path = file.getFullPath().toOSString();
			final URI uri = ResourceHelper.URIFix.createPlatformResourceURI(path, true);
			final ResourceSet resourceSet = new ResourceSetImpl();
			final Resource resource = resourceSet.getResource(uri, true);

			final TreeIterator<EObject> it = resource.getAllContents();

			while (it.hasNext()) {
				final EObject next = it.next();

				if (next instanceof EPackage) {
					final EPackage ePackage = (EPackage) next;
					final String ePackageUri = ePackage.getNsURI();

					addEPackages.add(ePackage);
					if (!containsKey(ePackageUri)) {
						put(ePackage.getNsURI(), ePackage);
					}
				}
			}
		}
		return addEPackages;
	}



	public Collection<EPackage> registerEPackagesFrom(final java.io.File file) {

		final Collection<EPackage> addEPackages = new HashSet<EPackage>();

		if ((file != null) && file.isFile()){
			final String path = file.getAbsolutePath();
			final URI uri = URI.createFileURI(path);

			final ResourceSet resourceSet = new ResourceSetImpl();
			final Resource resource = resourceSet.getResource(uri, true);

			final TreeIterator<EObject> it = resource.getAllContents();

			while (it.hasNext()) {
				final EObject next = it.next();

				if (next instanceof EPackage) {
					final EPackage ePackage = (EPackage) next;
					final String ePackageUri = ePackage.getNsURI();

					addEPackages.add(ePackage);
					if (!containsKey(ePackageUri)) {
						put(ePackage.getNsURI(), ePackage);
					}
				}
			}
		}
		return addEPackages;
	}

	//	//TODO redefine it with temporary Map which hold <Path, NSURI>

	public void removeEPackagesOf(final IFile file) {

		if (file.isAccessible()){
			final String path = file.getFullPath().toString();
			final URI uri = ResourceHelper.URIFix.createPlatformResourceURI(path, true);
			final ResourceSet resourceSet = new ResourceSetImpl();
			final Resource resource = resourceSet.getResource(uri, true);

			final TreeIterator<EObject> it = resource.getAllContents();

			while (it.hasNext()) {
				final EObject next = it.next();

				if (next instanceof EPackage) {
					final EPackage ePackage = (EPackage) next;

					if (containsKey(ePackage.getNsURI())) {
						remove(ePackage.getNsURI());
					}
				}
			}
		}
	}

	@Override
	public Object get(final Object key) {
		final Object value = super.get(key);
		if (value == null) {
			return delegate.get(key);
		}
		return value;
	}

	@Override
	public EPackage getEPackage(final String nsURI) {
		final Object workspaceObject = get(nsURI);
		EPackage workspaceEPackage = null;

		if (workspaceObject instanceof EPackage.Descriptor){
			workspaceEPackage = ((EPackage.Descriptor) workspaceObject).getEPackage();
		} else {
			workspaceEPackage = (EPackage)workspaceObject;
		}


		if (workspaceEPackage == null){
			final Object object = delegate.getEPackage(nsURI);

			if (object instanceof EPackage.Descriptor){
				return ((EPackage.Descriptor)object).getEPackage();
			}
			return (EPackage)object;
		}

		return workspaceEPackage;
	}

	@Override
	public EFactory getEFactory(final String nsURI) {
		final EPackage ePackage = getEPackage(nsURI);

		if (ePackage != null) {
			return ePackage.getEFactoryInstance();
		}
		return delegate.getEFactory(nsURI);
	}

	@Override
	public Collection<Object> values() {
		return Sets.union(Sets.newHashSet(super.values()),
				Sets.newHashSet(delegate.values()));
	}


	public void dispose(final IWorkspace ws){
		clear();
		ws.removeResourceChangeListener(wsEventHandler);
	}

}

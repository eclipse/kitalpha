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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.scoping;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.MultimapBasedScope;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.registry.DataWorkspaceEPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ExternalDataHelper;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class DataGlobalScopeProvider extends DefaultGlobalScopeProvider {
	
	@Inject
	IResourceDescription.Manager descriptionManager;
	
	@Override
	protected IScope getScope(IScope parent, final Resource context, boolean ignoreCase, EClass type, Predicate<IEObjectDescription> filter) {	
		Iterable<IEObjectDescription> exportedObjects = Collections.emptyList();
		IScope result = parent;
		List<IContainer> containers = getVisibleContainers(context);
		Iterator<IContainer> iter = containers.iterator();
		while (iter.hasNext()) {
			IContainer container = iter.next();
			if (container instanceof DataContainer) {
				result = createDataContainerScope(context, result, container, filter, type, ignoreCase);
			}
		}
		return MultimapBasedScope.createScope(result, exportedObjects, ignoreCase);	
	}

	protected IScope createDataContainerScope(Resource eResource, IScope parent, IContainer container, Predicate<IEObjectDescription> filter, EClass type, boolean ignoreCase) {
		Iterable<IEObjectDescription> exportedObjects = Collections.emptyList();		
		ResourceSet resourceSet = eResource.getResourceSet();
		exportedObjects = getExternalObjectDescriptions(resourceSet, exportedObjects);
		exportedObjects = getExternalImportObjectDescription(eResource, exportedObjects);
		return MultimapBasedScope.createScope(parent, exportedObjects, ignoreCase);	
	}
	
	private Iterable<IEObjectDescription> getExternalObjectDescriptions(ResourceSet resourceSet,Iterable<IEObjectDescription> exportedObjects) {
		Map<String, URI> fPackagesInScope = ExternalDataHelper.getPackagesInScopeURIs();
		
		//addImportedPackageToPackageInScope(eResource, fPackagesInScope);
		for (Map.Entry<String, URI> entry : fPackagesInScope.entrySet()) {
			QualifiedName packageNsURI = QualifiedName.create(entry.getKey());
			URI nsURI = URI.createURI(packageNsURI.toString());
			EPackage ecoreModel = resourceSet.getPackageRegistry().getEPackage(nsURI.toString());
			if (ecoreModel !=null){
				EPackage loadedEPackage = ExternalDataHelper.loadEPackage(nsURI.toString(), resourceSet);
				if (descriptionManager!=null && loadedEPackage!=null &&	loadedEPackage.eResource()!=null) {
					Resource packageResource = loadedEPackage.eResource();
					EcoreUtil2.resolveAll(packageResource);
					IResourceDescription resourceDescription =	descriptionManager.getResourceDescription(packageResource);
					exportedObjects = Iterables.concat(exportedObjects, resourceDescription.getExportedObjects());
				}
			}
		}
		return exportedObjects;
	}
	
	
	private Iterable<IEObjectDescription> getExternalImportObjectDescription(
			Resource eResource, Iterable<IEObjectDescription> exportedObjects) {
		TreeIterator<EObject> ResourceObjects = eResource.getAllContents();

		if (ResourceObjects.hasNext()) {
			EObject object = ResourceObjects.next();
			for (EObject content : object.eContents()) {
				if (content instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.ImportURIImpl) {
					String importNsURI = ((org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.ImportURIImpl) content).getImportURI();
					
					if (importNsURI != null && !importNsURI.equals("")) {
						QualifiedName nsURI = QualifiedName.create(importNsURI);
//						EPackage ecoreModel = eResource.getResourceSet().getPackageRegistry().getEPackage(nsURI.toString());
						EPackage ecoreModel = (EPackage) DataWorkspaceEPackage.INSTANCE.getEPackage(nsURI.toString());
						if (ecoreModel != null) {
							EPackage loadedEPackage = ExternalDataHelper.loadEPackage(nsURI.toString(),	eResource.getResourceSet());

							if (descriptionManager != null
									&& loadedEPackage != null
									&& loadedEPackage.eResource() != null) {
								EcoreUtil2.resolveAll(loadedEPackage);
								IResourceDescription resourceDescription = descriptionManager.getResourceDescription(loadedEPackage.eResource());
								exportedObjects = Iterables.concat(exportedObjects, resourceDescription.getExportedObjects());
							}
						}
					}
				}
			}
		}
		return exportedObjects;

	}
	
//	private void addImportedPackageToPackageInScope(Resource eResource, Map<String, URI> packagesInScope) {
//		TreeIterator<EObject> ResourceObjects = eResource.getAllContents();
//
//		if (ResourceObjects.hasNext()) {
//			EObject object = ResourceObjects.next();
//			for (EObject content : object.eContents()) {
//				if (content instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.ImportURIImpl) {
//					String nsUri = ((org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.ImportURIImpl) content)
//							.getImportURI();
//					if (eResource != null && nsUri != null && !nsUri.equals("")) {
//						EPackage epackage = ExternalDataHelper.loadEPackage(
//								nsUri, eResource.getResourceSet());
//						packagesInScope.put(nsUri, URI.createURI(nsUri));
//					}
//				}
//			}
//		}
//	}
}

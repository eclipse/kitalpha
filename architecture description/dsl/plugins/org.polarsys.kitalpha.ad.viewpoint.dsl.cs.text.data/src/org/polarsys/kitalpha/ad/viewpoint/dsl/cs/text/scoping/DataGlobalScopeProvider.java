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

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.MultimapBasedScope;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpconf.ConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ExternalDataHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.util.ProjectUtil;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import com.google.inject.Inject;

/**
 * 
 * @author Amine Lajmi
 * 		   Faycal Abka
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

	private static Iterable<IEObjectDescription> taObjects = null;
	
//	@Deprecated
//	private Iterable<IEObjectDescription> getTAObject(ResourceSet resourceSet,Iterable<IEObjectDescription> exportedObjects){
//		if (taObjects == null || 
//				(taObjects.iterator() != null) && !taObjects.iterator().hasNext())
//		{
//			taObjects = getExternalObjectDescriptions(resourceSet, exportedObjects);
//		}
//		
//		return taObjects;
//	}
	
	private Multimap<QualifiedName, IEObjectDescription> multiMapDesc = null;
	
	protected IScope createDataContainerScope(Resource eResource, IScope parent, IContainer container, Predicate<IEObjectDescription> filter, EClass type, boolean ignoreCase) {
		Iterable<IEObjectDescription> exportedObjects = Collections.emptyList();		
//		exportedObjects = getTAObject(resourceSet, exportedObjects);
		exportedObjects = getExternalObjectDescriptions(eResource, exportedObjects);
		exportedObjects = getExternalImportObjectDescription(eResource, exportedObjects);
		
//		calculateTAScope(parent, resourceSet, exportedObjects, ignoreCase);
//		return computeScope(parent, eResource, exportedObjects, ignoreCase);
		return MultimapBasedScope.createScope(parent, exportedObjects, ignoreCase);	
	}

	//To be reworked
//	@Deprecated
//	private void calculateTAScope(IScope parent, ResourceSet resourceSet,Iterable<IEObjectDescription> exportedObjects, boolean ignoreCase){
//		if (multiMapDesc == null || multiMapDesc.isEmpty()){
//			
//			for(IEObjectDescription description: getExternalObjectDescriptions(resourceSet, exportedObjects)) {
//				if (multiMapDesc == null)
//					multiMapDesc = LinkedHashMultimap.create(5,2);
//				if (ignoreCase)
//					multiMapDesc.put(description.getName().toLowerCase(), description);
//				else
//					multiMapDesc.put(description.getName(), description);
//			}
//		}
//	}
	
	private IScope computeScope(IScope parent, Resource r, Iterable<IEObjectDescription> exportedObjects, boolean ignoreCase){
		Multimap<QualifiedName, IEObjectDescription> map = LinkedHashMultimap.create(5,2);
		Iterable<IEObjectDescription> __exportedObjects = Collections.emptyList();
		for(IEObjectDescription description: getExternalImportObjectDescription(r, __exportedObjects)) {
			if (map == null)
				map = LinkedHashMultimap.create(5,2);
			if (ignoreCase)
				map.put(description.getName().toLowerCase(), description);
			else
				map.put(description.getName(), description);
		}
		
		if (multiMapDesc != null && !multiMapDesc.isEmpty()){
			map.putAll(multiMapDesc);
		}
		
		return new DataDSLMultiBasedScope(parent, map, ignoreCase);
	}
	
	public class DataDSLMultiBasedScope extends MultimapBasedScope {

		protected DataDSLMultiBasedScope(IScope parent, Multimap<QualifiedName, IEObjectDescription> elements,
				boolean ignoreCase) {
			super(parent, elements, ignoreCase);
		}
		
	}
	
	private Iterable<IEObjectDescription> getExternalObjectDescriptions_old(ResourceSet resourceSet,Iterable<IEObjectDescription> exportedObjects) {
		Map<String, URI> fPackagesInScope = ExternalDataHelper.getPackagesInScopeURIs();
		
		for(Map.Entry<String, URI> entry : fPackagesInScope.entrySet()){
			URI genModelURI = entry.getValue();
			Resource resource = resourceSet.getResource(genModelURI, true);
			
			EList<EObject> contents = resource.getContents();
			
			for (EObject eObject : contents) {
				if (eObject instanceof GenModel){
					GenModel genModel = (GenModel) eObject;
					EList<GenPackage> genPackages = genModel.getGenPackages();
					
					for (GenPackage genPackage : genPackages) {
						EPackage ecorePackage = genPackage.getEcorePackage();
						Resource eResource = ecorePackage.eResource();
						
						if (descriptionManager != null && resource != null) {
							IResourceDescription resourceDescription =	descriptionManager.getResourceDescription(eResource);
							exportedObjects = Iterables.concat(exportedObjects, resourceDescription.getExportedObjects());
						}
					}
				}
			}
		}
		return exportedObjects;
	}
	
	private Iterable<IEObjectDescription> getExternalObjectDescriptions(Resource resource,Iterable<IEObjectDescription> exportedObjects) {

		ResourceSet resourceSet = resource.getResourceSet();
		IProject projectName = ProjectUtil.getEclipseProjectOf(resource);
		if (projectName != null){
			List<URI> secondaryResources = ResourceHelper.getSecondaryResourceURIsByExtension(FileExtension.CONFIGURATION_EXTENSION, projectName.getName());
			
			if (!secondaryResources.isEmpty()){
				URI uri = secondaryResources.get(0); //There is one config resource per project
				Resource configurationResource = ResourceHelper.loadResource(uri, resourceSet);
				EObject root = configurationResource.getContents().get(0);
				if (root != null){
					String targetApplication = ConfigurationHelper.getTargetApplication(root);
					Map<String, URI> target = ExternalDataHelper.getPackagesInScopeURIs(targetApplication);
					for (Map.Entry<String, URI> entry : target.entrySet()) {
						QualifiedName packageNsURI = QualifiedName.create(entry.getKey());
						URI nsURI = URI.createURI(packageNsURI.toString());
						EPackage ePackage = resourceSet.getPackageRegistry().getEPackage(nsURI.toString());
						if (ePackage != null){
							EPackage loadedEPackage = ExternalDataHelper.loadEPackage(nsURI.toString(), resourceSet);
							if (descriptionManager!=null && loadedEPackage!=null &&	loadedEPackage.eResource()!=null) {
								Resource packageResource = loadedEPackage.eResource();
								IResourceDescription resourceDescription =	descriptionManager.getResourceDescription(packageResource);
								exportedObjects = Iterables.concat(exportedObjects, resourceDescription.getExportedObjects());
							}
						}
					}
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
						URI nsURI = URI.createURI(importNsURI);
							EPackage loadedEPackage = ExternalDataHelper.loadEPackage(nsURI.toString(),	eResource.getResourceSet());
							if (descriptionManager != null
									&& loadedEPackage != null
									&& loadedEPackage.eResource() != null) {
//								EcoreUtil2.resolveAll(loadedEPackage);
								IResourceDescription resourceDescription = descriptionManager.getResourceDescription(loadedEPackage.eResource());
								exportedObjects = Iterables.concat(exportedObjects, resourceDescription.getExportedObjects());
							}
						}
					}
			}
		}
		return exportedObjects;

	}
}

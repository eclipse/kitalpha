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

import java.util.ArrayList;
import java.util.Collection;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.MultimapBasedScope;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.ImportGroup;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpdiagram.DoremiDiagramElementHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ExternalDataHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpdiagramGlobalScopeProvider extends DefaultGlobalScopeProvider {

	@Inject
	IResourceServiceProvider.Registry registry;
	
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
			if (container instanceof VpdiagramContainer) {
				result = createVpdiagramContainerScope(context, result, container, filter, type, ignoreCase);
			}
		}
		return MultimapBasedScope.createScope(result, exportedObjects, ignoreCase);	
	}

	protected IScope createVpdiagramContainerScope(Resource eResource, IScope parent, IContainer container, Predicate<IEObjectDescription> filter, EClass type, boolean ignoreCase) {
		ResourceSet resourceSet = eResource.getResourceSet();
		Iterable<IEObjectDescription> exportedObjects = Collections.emptyList();
		exportedObjects = Iterables.concat(exportedObjects, getAspectObjectDescriptions(resourceSet, exportedObjects, FileExtension.DATA_EXTENSION));
		exportedObjects = Iterables.concat(exportedObjects,	getExternalObjectDescriptions(resourceSet, exportedObjects));
		exportedObjects = Iterables.concat(exportedObjects, getDoremiDiagramDescriptions(eResource, type));
		exportedObjects = Iterables.concat(exportedObjects,	getDoremiEdgeMappings(eResource, type));
		exportedObjects = Iterables.concat(exportedObjects,	getDoremiNodeMappings(eResource, type));
		exportedObjects = Iterables.concat(exportedObjects,	getDoremiContainerMappings(eResource, type));
		exportedObjects = Iterables.concat(exportedObjects, getExternalImportDiagramObjectDescription(eResource, exportedObjects, type));
		return MultimapBasedScope.createScope(parent, exportedObjects, ignoreCase);	
	}
	
	private Iterable<IEObjectDescription> getDoremiDiagramDescriptions(Resource eResource, EClass type) {
		Collection<IEObjectDescription> doremiExportedObjects = new ArrayList<IEObjectDescription>();
		if (type.getName().equals("DiagramDescription")) {
			List<DiagramDescription> availableDoremiDiagramFor = Collections.emptyList();
			ResourceSet resourceSet = eResource.getResourceSet();
			List<URI> secondaryResources = ResourceHelper.getSecondaryResourceURIsByExtension(FileExtension.CONFIGURATION_EXTENSION);
			for (URI uri: secondaryResources) {
				Resource configurationResource = ResourceHelper.loadResource(uri, resourceSet);
				if (configurationResource!=null) {
					EObject root = configurationResource.getContents().get(0);
					if (root!=null) {	
						availableDoremiDiagramFor = DoremiDiagramElementHelper.getAvailableDoremiDiagramFor(root);
						for (DiagramDescription description : availableDoremiDiagramFor) {
							EcoreUtil2.resolveAll(description);
							// trim white spaces
							IEObjectDescription desc = EObjectDescription.create(description.getName().replaceAll(" ", ""), description, null);
							doremiExportedObjects.add(desc);
						}
					}
				}
			}
		}
		return doremiExportedObjects;
	}

	private Iterable<IEObjectDescription> getDoremiEdgeMappings(Resource eResource, EClass type) {
		Collection<IEObjectDescription> doremiExportedObjects = new ArrayList<IEObjectDescription>();
		if (type.getName().equals("EdgeMapping")) {
			List<EdgeMapping> availableDoremiDiagramFor = Collections.emptyList();
			ResourceSet resourceSet = eResource.getResourceSet();
			List<URI> secondaryResources = ResourceHelper.getSecondaryResourceURIsByExtension(FileExtension.CONFIGURATION_EXTENSION);
			for (URI uri: secondaryResources) {
				Resource configurationResource = ResourceHelper.loadResource(uri, resourceSet);
				if (configurationResource!=null) {
					EObject root = configurationResource.getContents().get(0);
					if (root!=null) {
						availableDoremiDiagramFor = DoremiDiagramElementHelper.getAvailableEdgeMappingsFor(root);
						for (EdgeMapping description : availableDoremiDiagramFor) {
							EcoreUtil2.resolveAll(description);
							// trim white spaces
							IEObjectDescription desc = EObjectDescription.create(description.getName().replaceAll(" ", ""), description, null);
							doremiExportedObjects.add(desc);
						}
						
					}
				}
			}
		}
		return doremiExportedObjects;
	}

	private Iterable<IEObjectDescription> getDoremiNodeMappings(Resource eResource, EClass type) {
		Collection<IEObjectDescription> doremiExportedObjects = new ArrayList<IEObjectDescription>();
		if (type.getName().equals("NodeMapping")) {
			List<NodeMapping> availableDoremiDiagramFor = Collections.emptyList();
			ResourceSet resourceSet = eResource.getResourceSet();
			List<URI> secondaryResources = ResourceHelper.getSecondaryResourceURIsByExtension(FileExtension.CONFIGURATION_EXTENSION);
			for (URI uri: secondaryResources) {
				Resource configurationResource = ResourceHelper.loadResource(uri, resourceSet);
				if (configurationResource!=null) {
					EObject root = configurationResource.getContents().get(0);
					if (root!=null) {
						availableDoremiDiagramFor = DoremiDiagramElementHelper.getAvailableNodeMappingsFor(root);
						for (NodeMapping description : availableDoremiDiagramFor) {
							EcoreUtil2.resolveAll(description);
							// trim white spaces
							IEObjectDescription desc = EObjectDescription.create(description.getName().replaceAll(" ", ""), description, null);
							doremiExportedObjects.add(desc);
						}
					}
				}
			}
		}
		return doremiExportedObjects;
	}

	private Iterable<IEObjectDescription> getDoremiContainerMappings(Resource eResource, EClass type) {
		Collection<IEObjectDescription> doremiExportedObjects = new ArrayList<IEObjectDescription>();
		if (type.getName().equals("ContainerMapping")) {
			List<ContainerMapping> availableDoremiDiagramFor = Collections.emptyList();
			ResourceSet resourceSet = eResource.getResourceSet();
			List<URI> secondaryResources = ResourceHelper.getSecondaryResourceURIsByExtension(FileExtension.CONFIGURATION_EXTENSION);
			for (URI uri: secondaryResources) {
				Resource configurationResource = ResourceHelper.loadResource(uri, resourceSet);
				if (configurationResource!=null) {
					EObject root = configurationResource.getContents().get(0);
					if (root!=null) {
						availableDoremiDiagramFor = DoremiDiagramElementHelper.getAvailableContainerMappingsFor(root);
						for (ContainerMapping description : availableDoremiDiagramFor) {
							EcoreUtil2.resolveAll(description);
							// trim white spaces
							IEObjectDescription desc = EObjectDescription.create(description.getName().replaceAll(" ", ""), description, null);
							doremiExportedObjects.add(desc);
						}
					}
				}
			}
		}
		return doremiExportedObjects;
	}
	
	private Iterable<IEObjectDescription> getExternalObjectDescriptions(ResourceSet resourceSet,Iterable<IEObjectDescription> exportedObjects) {
		Map<String, URI> fPackagesInScope = ExternalDataHelper.getPackagesInScopeURIs();
		for (Map.Entry<String, URI> entry : fPackagesInScope.entrySet()) {
			QualifiedName packageNsURI = QualifiedName.create(entry.getKey());
			URI nsURI = URI.createURI(packageNsURI.toString());
			EPackage ecoreModel = resourceSet.getPackageRegistry().getEPackage(nsURI.toString());
			if (ecoreModel !=null){
				EPackage loadedEPackage = loadEPackage(nsURI.toString(), resourceSet);
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
	
	private EPackage loadEPackage(String resourceOrNsURI, ResourceSet resourceSet) {
		if (resourceSet.getPackageRegistry().containsKey(resourceOrNsURI))
			return resourceSet.getPackageRegistry().getEPackage(resourceOrNsURI);
		URI uri = URI.createURI(resourceOrNsURI);
		try {
			if ("http".equalsIgnoreCase(uri.scheme()))
				return null;
			if (uri.fragment() == null) {
				Resource resource = resourceSet.getResource(uri, true);
				if (resource.getContents().isEmpty())
					return null;
				EPackage result = (EPackage) resource.getContents().get(0);
				return result;
			}
			EPackage result = (EPackage) resourceSet.getEObject(uri, true);
			return result;
		} catch (RuntimeException ex) {
			if (uri.isPlatformResource()) {
				String platformString = uri.toPlatformString(true);
				URI platformPluginURI = URI.createPlatformPluginURI(platformString, true);
				return loadEPackage(platformPluginURI.toString(), resourceSet);
			}
			return null;
		}
	}
	
	private Iterable<IEObjectDescription> getAspectObjectDescriptions(ResourceSet resourceSet, Iterable<IEObjectDescription> exportedObjects, String extension) {	
		List<URI> secondaryResources = ResourceHelper.getSecondaryResourceURIsByExtension(extension);
		for (URI uri: secondaryResources) {
			Resource referencedResource = ResourceHelper.loadResource(uri, resourceSet);
			if (referencedResource!=null) {
				IResourceDescription.Manager manager = getResourceDescriptionManager(uri);
				IResourceDescription description = manager.getResourceDescription(referencedResource);
				exportedObjects = Iterables.concat(exportedObjects, description.getExportedObjects());
			}
		}
		return exportedObjects;
	}
	
	//Handle external imports
	private Iterable<IEObjectDescription> getExternalImportDiagramObjectDescription(Resource resource,
			Iterable<IEObjectDescription> exportedObjects, EClass type){

		Collection<IEObjectDescription> ExportImportedObjects = new ArrayList<IEObjectDescription>();
		TreeIterator<EObject> it = resource.getAllContents();


		while (it.hasNext()){
			EObject next = it.next();

			for(EObject content: next.eContents()){
				if (content instanceof ImportGroup){
					ImportGroup importedOdesign = (ImportGroup)content;
					String platformURI = importedOdesign.getImportedGroup();

					if (platformURI != null && !platformURI.isEmpty()){
						String tmpUri = platformURI.substring(1, platformURI.length() - 1);
						URI uri = URI.createURI(tmpUri);
						Resource odesignResources = resource.getResourceSet().getResource(uri, true);

						if (descriptionManager != null
								&& odesignResources != null) {
							EcoreUtil.resolveAll(odesignResources);

							TreeIterator<EObject> odesign_it = odesignResources.getAllContents();

							while (odesign_it.hasNext()){
								EObject odesign_next = odesign_it.next();
								if (odesign_next instanceof DiagramDescription){
									IEObjectDescription desc = EObjectDescription.create(((DiagramDescription) odesign_next).getName().replaceAll(" ", ""), odesign_next, null);
									ExportImportedObjects.add(desc);
									//									IResourceDescription resourceDescription = descriptionManager.getResourceDescription(odesignResources);
									//									exportedObjects = Iterables.concat(exportedObjects, resourceDescription.getExportedObjects());
								}
							}
						}
						
//						exportedObjects = Iterables.concat(exportedObjects, getDoremiDiagramDescriptions(odesignResources, type));
//						exportedObjects = Iterables.concat(exportedObjects,	getDoremiEdgeMappings(odesignResources, type));
//						exportedObjects = Iterables.concat(exportedObjects,	getDoremiNodeMappings(odesignResources, type));
//						exportedObjects = Iterables.concat(exportedObjects,	getDoremiContainerMappings(odesignResources, type));
					}
				}
			}
		}
		exportedObjects = Iterables.concat(exportedObjects, ExportImportedObjects);
		return exportedObjects;
	}
	
	private IResourceDescription.Manager getResourceDescriptionManager(URI uri) {
		//handle periodic file extensions
		if (ResourceHelper.hasPeriodicFileExtension(uri)) {
			Map<String, Object> extensionToFactoryMap = registry.getExtensionToFactoryMap();
			IResourceServiceProvider resourceServiceProvider = ResourceHelper.getServiceProvider(uri, extensionToFactoryMap, ResourceHelper.getFileExtension(uri));
			return resourceServiceProvider != null ? resourceServiceProvider.getResourceDescriptionManager() : null;
		}
		//otherwise return injected one
		return descriptionManager;
	}
}

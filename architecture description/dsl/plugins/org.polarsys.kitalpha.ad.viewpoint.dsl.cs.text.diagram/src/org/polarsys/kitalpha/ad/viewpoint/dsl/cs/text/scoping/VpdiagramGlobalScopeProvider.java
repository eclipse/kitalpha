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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.viewpoint.description.Group;
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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.AbstractImport;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.ImportGroup;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.DiagramsImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpdiagram.DoremiDiagramElementHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpdiagram.SiriusViewpointHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.registry.DataWorkspaceEPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ExternalDataHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

/**
 * 
 * @author Amine Lajmi
 * 		   Faycal Abka
 * 		   Boubekeur Zendagui	
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
	
	private static Map<EClass,Iterable<IEObjectDescription>> computedPlatformEObjectDescriptions = new HashMap<EClass, Iterable<IEObjectDescription>>();
			
	private Iterable<IEObjectDescription> getTaIEObjectDescription(Resource eResource,Iterable<IEObjectDescription> exportedObjects, EClass type){
		ResourceSet resourceSet = eResource.getResourceSet();
		if (computedPlatformEObjectDescriptions.containsKey(type))
		{
			return computedPlatformEObjectDescriptions.get(type);
		}
		else
		{
			Iterable<IEObjectDescription> externalObjectDescriptions = getExternalObjectDescriptions(resourceSet, exportedObjects);
			externalObjectDescriptions = Iterables.concat(externalObjectDescriptions, getDoremiDiagramDescriptions(eResource, type));
			externalObjectDescriptions = Iterables.concat(externalObjectDescriptions, getDoremiEdgeMappings(eResource, type));
			externalObjectDescriptions = Iterables.concat(externalObjectDescriptions, getDoremiNodeMappings(eResource, type));
			externalObjectDescriptions = Iterables.concat(externalObjectDescriptions, getDoremiContainerMappings(eResource, type));
			computedPlatformEObjectDescriptions.put(type, externalObjectDescriptions);
			return externalObjectDescriptions;
		}
	}
	

	protected IScope createVpdiagramContainerScope(Resource eResource, IScope parent, IContainer container, Predicate<IEObjectDescription> filter, EClass type, boolean ignoreCase) {
		ResourceSet resourceSet = eResource.getResourceSet();
		Iterable<IEObjectDescription> exportedObjects = Collections.emptyList();
		exportedObjects = Iterables.concat(exportedObjects, getAspectObjectDescriptions(resourceSet, exportedObjects, FileExtension.DATA_EXTENSION));
		
		exportedObjects = Iterables.concat(exportedObjects,	getTaIEObjectDescription(eResource, exportedObjects, type));
		
//		exportedObjects = Iterables.concat(exportedObjects, getExternalObjectDescriptions(eResource, type));
//		exportedObjects = Iterables.concat(exportedObjects, getDoremiDiagramDescriptions(eResource, type));
//		exportedObjects = Iterables.concat(exportedObjects,	getDoremiEdgeMappings(eResource, type));
//		exportedObjects = Iterables.concat(exportedObjects,	getDoremiNodeMappings(eResource, type));
//		exportedObjects = Iterables.concat(exportedObjects,	getDoremiContainerMappings(eResource, type));
		
		/**
		 * FIXME: 
		 * [BZE]- The next line never add element to exportedObjects because the method 
		 * DoremiDiagramElementHelper.getImportedDoremiDiagramFor(..) contains no code.
		 * 
		 * Check if it necessary to keep it, otherwise, to remove it.
		 */
		exportedObjects = Iterables.concat(exportedObjects, getImportedDiagrams(eResource));
		exportedObjects = Iterables.concat(exportedObjects, getExternalImportDiagramObjectDescription(eResource, exportedObjects, type));

		return MultimapBasedScope.createScope(parent, exportedObjects, ignoreCase);	
	}


	private Iterable<IEObjectDescription> getImportedDiagrams(Resource resource){
		Collection<IEObjectDescription> doremiExportedObjects = new ArrayList<IEObjectDescription>();
		List<DiagramDescription> importDiagrams = Collections.emptyList();
		
		List<URI> diagramResources = ResourceHelper.getSecondaryResourceURIsByExtension(FileExtension.DIAGRAM_EXTENSION, resource.getURI().segment(1));
		ResourceSet resourceSet = resource.getResourceSet();
		
		for (URI uri: diagramResources) {
			Resource diagramResource = ResourceHelper.loadResource(uri, resourceSet);
			if (diagramResources != null) {
				EObject root = diagramResource.getContents().get(0);
				if (root != null) {	
					importDiagrams = DoremiDiagramElementHelper.getImportedDoremiDiagramFor(root);
					for (DiagramDescription description : importDiagrams) {
						EcoreUtil2.resolveAll(description);
						// trim white spaces
						IEObjectDescription desc = EObjectDescription.create(description.getName().replaceAll(" ", ""), description, null);
						doremiExportedObjects.add(desc);
					}
				}
			}
		}
		return doremiExportedObjects;
	}
	
	private Iterable<IEObjectDescription> getDoremiDiagramDescriptions(Resource eResource, EClass type) {
		Collection<IEObjectDescription> doremiExportedObjects = new ArrayList<IEObjectDescription>();
		if (type.getName().equals("DiagramDescription")) {
			List<DiagramDescription> importDiagrams = Collections.emptyList();
			ResourceSet resourceSet = eResource.getResourceSet();
			
			List<URI> secondaryResources = ResourceHelper.getSecondaryResourceURIsByExtension(FileExtension.CONFIGURATION_EXTENSION);
			
			for (URI uri: secondaryResources) {
				Resource configurationResource = ResourceHelper.loadResource(uri, resourceSet);
				if (configurationResource!=null) {
					EObject root = configurationResource.getContents().get(0);
					if (root!=null) {	
						importDiagrams = DoremiDiagramElementHelper.getAvailableDoremiDiagramFor(root);
						for (DiagramDescription description : importDiagrams) {
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
	// [BZE] Browse resource by EReferences rather than eAllContent iterator.
	private Iterable<IEObjectDescription> getExternalImportDiagramObjectDescription(Resource resource,
			Iterable<IEObjectDescription> exportedObjects, EClass type){

		final EList<EObject> contents = resource.getContents();
		if (contents != null && ! contents.isEmpty())
		{
			final EObject eObject = contents.get(0);
			if (eObject instanceof DiagramsImpl)
			{
				final EList<AbstractImport> imports = ((DiagramsImpl) eObject).getImports();
				for (AbstractImport abstractImport : imports) 
				{
					if (abstractImport instanceof ImportGroup)
					{
						ImportGroup importedOdesign = (ImportGroup)abstractImport;
						String platformURI = importedOdesign.getImportedGroup();

						if (platformURI != null && !platformURI.isEmpty()){
							String tmpUri = platformURI.substring(1, platformURI.length() - 1).trim();

							boolean isEcore = isEcoreURI(tmpUri);

							if (isEcore){
								exportedObjects = Iterables.concat(exportedObjects, exportEcoreElements(tmpUri, resource, exportedObjects));
							} else {
								exportedObjects = Iterables.concat(exportedObjects, exportRepresentationElements(tmpUri, resource, exportedObjects));
							}
						}
					}
				}
			}
		}
		
		//Collection<IEObjectDescription> exportImportedObjects = new ArrayList<IEObjectDescription>();
//		TreeIterator<EObject> it = resource.getAllContents();
//
//		while (it.hasNext()){
//			EObject next = it.next();
//
//			for(EObject content: next.eContents()){
//				if (content instanceof ImportGroup){
//					ImportGroup importedOdesign = (ImportGroup)content;
//					String platformURI = importedOdesign.getImportedGroup();
//
//					if (platformURI != null && !platformURI.isEmpty()){
//						String tmpUri = platformURI.substring(1, platformURI.length() - 1).trim();
//						
//						boolean isEcore = isEcoreURI(tmpUri);
//						
//						if (isEcore){
//							exportedObjects = Iterables.concat(exportedObjects, exportEcoreElements(tmpUri, resource, exportedObjects));
//						} else {
//							exportedObjects = Iterables.concat(exportedObjects, exportRepresentationElements(tmpUri, resource, exportedObjects));
//						}
//					}
//				}
//			}
//		}
		return exportedObjects;
	}
	

	private Iterable<? extends IEObjectDescription> exportRepresentationElements(
			String tmpUri, Resource resource,	
			Iterable<IEObjectDescription> exportedObjects) {	

		Collection<IEObjectDescription> exportImportedObjects = new ArrayList<IEObjectDescription>();	

		URI p_uri = createURI(tmpUri);	

		Resource odesignResources = resource.getResourceSet().getResource(p_uri, true);	

		if (descriptionManager != null && odesignResources != null) {	
			// FIXME: [BZE] is this necessary
//			EcoreUtil.resolveAll(odesignResources);	

			Group group = SiriusViewpointHelper.getViewpointGroup(odesignResources);	

			if (group != null){	
				IEObjectDescription desc = EObjectDescription.create(group.getName().replaceAll(" ", ""), group, null);	
				exportImportedObjects.add(desc);	
			}	

			// [BZE] We need only DiagramDescription, so why add All RepresentationDescription (Table, CrossTable, etc.) in the scope.
			// These kind of representations are never used anywhere
			//List<RepresentationDescription> diagramDescriptions = SiriusViewpointHelper.getAllRepresentationDescription(odesignResources);	
			//if (diagramDescriptions != null && !diagramDescriptions.isEmpty()){	
			//	for (RepresentationDescription dd : diagramDescriptions) {	
			//		IEObjectDescription desc = EObjectDescription.create(dd.getName().replaceAll(" ", ""), dd, null);	
			//		exportImportedObjects.add(desc);	
			//	}	
			//}	
			
			List<DiagramDescription> diagramDescription = SiriusViewpointHelper.getAllDiagramDescription(odesignResources);	

			if (diagramDescription != null && !diagramDescription.isEmpty()){	
				for (DiagramDescription dd : diagramDescription) {	
					IEObjectDescription desc = EObjectDescription.create(dd.getName().replaceAll(" ", ""), dd, null);	
					exportImportedObjects.add(desc);	
				}	
			}	

			//[BZE]: use new implementation
			// original code. This avoid to compute DiagramDescription an other time
			// List<ContainerMapping> containers = SiriusViewpointHelper.getAllContainerMapping(odesignResources);	
			List<ContainerMapping> containers = SiriusViewpointHelper.getAllContainerMapping(diagramDescription);

			if (containers != null && !containers.isEmpty()){	
				for (ContainerMapping containerMapping : containers) {	
					IEObjectDescription desc = EObjectDescription.create(containerMapping.getName().replaceAll(" ", ""), containerMapping, null);	
					exportImportedObjects.add(desc);	
				}	
			}	

			//[BZE]: use new implementation
			// original code. This avoid to compute DiagramDescription an other time
			// List<NodeMapping> nodeMappings = SiriusViewpointHelper.getAllNodeMapping(odesignResources);
			List<NodeMapping> nodeMappings = SiriusViewpointHelper.getAllNodeMapping(diagramDescription);	

			if (nodeMappings != null && !nodeMappings.isEmpty()){	
				for (NodeMapping nm : nodeMappings) {	
					IEObjectDescription desc = EObjectDescription.create(nm.getName().replaceAll(" ", ""), nm, null);	
					exportImportedObjects.add(desc);	
				}	
			}	

			//[BZE]: use new implementation
			// original code. This avoid to compute DiagramDescription an other time
			// List<EdgeMapping> edgeMappings = SiriusViewpointHelper.getAllEdgeMapping(odesignResources);
			List<EdgeMapping> edgeMappings = SiriusViewpointHelper.getAllEdgeMapping(diagramDescription);	

			if (edgeMappings != null && !edgeMappings.isEmpty()){	
				for (EdgeMapping em : edgeMappings) {	
					IEObjectDescription desc = EObjectDescription.create(em.getName().replaceAll(" ", ""), em, null);	
					exportImportedObjects.add(desc);	
				}	
			}	
		}	
		return Iterables.concat(exportedObjects, exportImportedObjects);	
	}	


	private Iterable<IEObjectDescription> exportEcoreElements(String uri, Resource resource,	
			Iterable<IEObjectDescription> exportedObjects) {	

		if (descriptionManager == null)	
			return exportedObjects;	

		if (uri.startsWith("http://")){	
			EPackage ePackage = DataWorkspaceEPackage.INSTANCE.getEPackage(uri);	

			if (ePackage != null && ePackage.eResource()!=null) {	
				Resource packageResource = resource.getResourceSet().getResource(ePackage.eResource().getURI(), true);	
				if (packageResource == null)	
					return exportedObjects;	

				EcoreUtil2.resolveAll(packageResource);	
				IResourceDescription resourceDescription =        descriptionManager
						.getResourceDescription(packageResource);	
				exportedObjects = Iterables.concat(exportedObjects, resourceDescription.getExportedObjects());	
			}	
		} else {	
			URI p_uri = createURI(uri);	
			Resource modelResource = resource.getResourceSet().getResource(p_uri, true);	

			if (modelResource == null)	
				return exportedObjects;	

			IResourceDescription resourceDescription = descriptionManager.getResourceDescription(modelResource);	
			exportedObjects = Iterables.concat(exportedObjects, resourceDescription.getExportedObjects());	
		}	
		return exportedObjects;	
	}	

	private static URI createURI(String uri){	
		URI res = URI.createURI(uri);	

		if (!res.isPlatform()){	
			res = URI.createFileURI(uri);	
		}	

		return res;	
	}	


	/**	
	 * 	
	 * @param uri	
	 * @return true if the uri represente an uri otherwise false (i.e: is representation)	
	 */	
	private boolean isEcoreURI(String uri) {	
		return uri.startsWith("http://") || uri.endsWith(".ecore");	
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

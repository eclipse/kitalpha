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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.scoping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
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
import org.eclipse.sirius.diagram.description.style.ContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.HideLabelCapabilityStyleDescription;
import org.eclipse.sirius.viewpoint.description.ColorDescription;
import org.eclipse.sirius.viewpoint.description.ConditionalStyleDescription;
import org.eclipse.sirius.viewpoint.description.Group;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.eclipse.sirius.viewpoint.description.UserColor;
import org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription;
import org.eclipse.sirius.viewpoint.description.style.StyleDescription;
import org.eclipse.sirius.viewpoint.description.style.TooltipStyleDescription;
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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpconf.ConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpdiagram.DoremiDiagramElementHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpdiagram.SiriusViewpointHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.registry.DataWorkspaceEPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ExternalDataHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.util.ProjectUtil;

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
		Iterable<IEObjectDescription> externalObjectDescriptions = getExternalObjectDescriptions(eResource, exportedObjects);
		externalObjectDescriptions = Iterables.concat(externalObjectDescriptions, getDoremiDiagramDescriptions(eResource, type));
		externalObjectDescriptions = Iterables.concat(externalObjectDescriptions, getDoremiEdgeMappings(eResource, type));
		externalObjectDescriptions = Iterables.concat(externalObjectDescriptions, getDoremiNodeMappings(eResource, type));
		externalObjectDescriptions = Iterables.concat(externalObjectDescriptions, getDoremiContainerMappings(eResource, type));
		computedPlatformEObjectDescriptions.put(type, externalObjectDescriptions);
		return externalObjectDescriptions;
	}
	

	protected IScope createVpdiagramContainerScope(Resource eResource, IScope parent, IContainer container, Predicate<IEObjectDescription> filter, EClass type, boolean ignoreCase) {
		ResourceSet resourceSet = eResource.getResourceSet();
		Iterable<IEObjectDescription> exportedObjects = Collections.emptyList();
		exportedObjects = Iterables.concat(exportedObjects, getAspectObjectDescriptions(resourceSet, exportedObjects, FileExtension.DATA_EXTENSION));
		
		exportedObjects = Iterables.concat(exportedObjects,	getTaIEObjectDescription(eResource, exportedObjects, type));
		
		exportedObjects = Iterables.concat(exportedObjects, getExternalImportDiagramObjectDescription(eResource, exportedObjects, type));

		return MultimapBasedScope.createScope(parent, exportedObjects, ignoreCase);	
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
							String simpleName = VpdiagramNamingHelper.normalizeIdentifier(description.getName());
							IEObjectDescription desc = EObjectDescription.create(simpleName, description, null);
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
							String simpleName = VpdiagramNamingHelper.normalizeIdentifier(description.getName());
							IEObjectDescription desc = EObjectDescription.create(simpleName, description, null);
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
							String simpleName = VpdiagramNamingHelper.normalizeIdentifier(description.getName());
							IEObjectDescription desc = EObjectDescription.create(simpleName, description, null);
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
							
							String simpleName = VpdiagramNamingHelper.normalizeIdentifier(description.getName());
							IEObjectDescription desc = EObjectDescription.create(simpleName, description, null);
							doremiExportedObjects.add(desc);
						}
					}
				}
			}
		}
		return doremiExportedObjects;
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
				URI platformPluginURI = ResourceHelper.URIFix.createPlatformPluginURI(platformString, true);
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

							boolean isEcore = isEcoreURI(platformURI);

							if (isEcore){
								exportedObjects = Iterables.concat(exportedObjects, exportEcoreElements(platformURI, resource, exportedObjects));
							} else {
								exportedObjects = Iterables.concat(exportedObjects, exportRepresentationElements(platformURI, resource, exportedObjects));
							}
						}
					}
				}
			}
		}
		return exportedObjects;
	}
	

	private Iterable<? extends IEObjectDescription> exportRepresentationElements(
			String tmpUri, Resource resource,	
			Iterable<IEObjectDescription> exportedObjects) {	

		Collection<IEObjectDescription> exportImportedObjects = new ArrayList<IEObjectDescription>();	

		URI p_uri = createURI(tmpUri);	

		Resource odesignResources = resource.getResourceSet().getResource(p_uri, true);	

		if (descriptionManager != null && odesignResources != null) {	

			Group group = SiriusViewpointHelper.getViewpointGroup(odesignResources);	

			if (group != null){	
				String simpleName = VpdiagramNamingHelper.normalizeIdentifier(group.getName());
				IEObjectDescription desc = EObjectDescription.create(simpleName, group, null);	
				exportImportedObjects.add(desc);	
			}	
			
			List<DiagramDescription> diagramDescription = SiriusViewpointHelper.getAllDiagramDescription(odesignResources);	

			if (diagramDescription != null && !diagramDescription.isEmpty()){	
				for (DiagramDescription dd : diagramDescription) {
					String simpleName = VpdiagramNamingHelper.normalizeIdentifier(dd.getName());
					IEObjectDescription desc = EObjectDescription.create(simpleName, dd, null);	
					exportImportedObjects.add(desc);	
				}	
			}	
			
			List<ContainerMapping> containers = SiriusViewpointHelper.getAllContainerMapping(diagramDescription);

			if (containers != null && !containers.isEmpty()){	
				for (ContainerMapping containerMapping : containers) {	
					String simpleName = VpdiagramNamingHelper.normalizeIdentifier(containerMapping.getName());
					IEObjectDescription desc = EObjectDescription.create(simpleName, containerMapping, null);	
					exportImportedObjects.add(desc);	
				}	
			}	

			List<NodeMapping> nodeMappings = SiriusViewpointHelper.getAllNodeMapping(diagramDescription);	

			if (nodeMappings != null && !nodeMappings.isEmpty()){	
				for (NodeMapping nm : nodeMappings) {
					String simpleName = VpdiagramNamingHelper.normalizeIdentifier(nm.getName());
					IEObjectDescription desc = EObjectDescription.create(simpleName, nm, null);	
					exportImportedObjects.add(desc);	
				}	
			}	

			List<EdgeMapping> edgeMappings = SiriusViewpointHelper.getAllEdgeMapping(diagramDescription);	

			if (edgeMappings != null && !edgeMappings.isEmpty()){	
				for (EdgeMapping em : edgeMappings) {
					String simpleName = VpdiagramNamingHelper.normalizeIdentifier(em.getName());
					IEObjectDescription desc = EObjectDescription.create(simpleName, em, null);	
					exportImportedObjects.add(desc);	
				}	
			}
			
			List<ConditionalStyleDescription> allConditionalEdgeStyleDescription = SiriusViewpointHelper.getAllConditionalStyleDescriptionFromMappings(edgeMappings);
			
			for (ConditionalStyleDescription conditionaledgeStyleDescription : allConditionalEdgeStyleDescription) {
				String conditionalEdgeStyleName = VpdiagramNamingHelper.computeConditionalEdgeStyleDescriptionName(conditionaledgeStyleDescription);
				IEObjectDescription desc = EObjectDescription.create(conditionalEdgeStyleName, conditionaledgeStyleDescription, null);
				exportImportedObjects.add(desc);
			}
			
			List<StyleDescription> allStyleDesc = SiriusViewpointHelper.getAllStyleDescription(diagramDescription);
			
			for (StyleDescription styleDescription : allStyleDesc) {
				String name = VpdiagramNamingHelper.computeEdgeStyleDescriptionName(styleDescription);
				IEObjectDescription desc = EObjectDescription.create(name, styleDescription, null);	
				exportImportedObjects.add(desc);
			}
			
			List<BasicLabelStyleDescription> allBasicLabelDescription = SiriusViewpointHelper.getAllBasicLabelDescription(diagramDescription);
			
			for (BasicLabelStyleDescription basicLabelStyleDescription : allBasicLabelDescription) {
				String name = VpdiagramNamingHelper.computeName(basicLabelStyleDescription);
				IEObjectDescription desc = EObjectDescription.create(name, basicLabelStyleDescription, null);	
				exportImportedObjects.add(desc);
			}
			
			List<TooltipStyleDescription> allToolTipStyleDescription = SiriusViewpointHelper.getAllToolTipStyleDescription(diagramDescription);
			
			for (TooltipStyleDescription t : allToolTipStyleDescription) {
				String name = VpdiagramNamingHelper.computeName(t);
				IEObjectDescription desc = EObjectDescription.create(name, t, null);	
				exportImportedObjects.add(desc);
			}
			
			List<HideLabelCapabilityStyleDescription> allHideLabelCapabilityStyleDescription = SiriusViewpointHelper.getAllHideLabelCapabilityStyleDescription(diagramDescription);
			
			for (HideLabelCapabilityStyleDescription h : allHideLabelCapabilityStyleDescription) {
				String name = VpdiagramNamingHelper.computeName(h);
				IEObjectDescription desc = EObjectDescription.create(name, h, null);	
				exportImportedObjects.add(desc);
			}
			
			List<ColorDescription> colorDescriptions = SiriusViewpointHelper.getAllSystemColor(odesignResources);
			
			for (ColorDescription c : colorDescriptions) {
				IEObjectDescription desc = EObjectDescription.create(((SystemColor)c).getName(), c, null);	
				exportImportedObjects.add(desc);
			}
			
			List<UserColor> userColor = SiriusViewpointHelper.getAllUserColor(odesignResources);
			
			for (UserColor c : userColor) {
				IEObjectDescription desc = EObjectDescription.create(c.getName(), c, null);	
				exportImportedObjects.add(desc);
			}
			
			List<ContainerStyleDescription> containerStyles = SiriusViewpointHelper.getAllContainerStyleDescription(diagramDescription);
			
			for (ContainerStyleDescription c : containerStyles) {
				String name = VpdiagramNamingHelper.computeName(c);
				IEObjectDescription desc = EObjectDescription.create(name, c, null);	
				exportImportedObjects.add(desc);
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

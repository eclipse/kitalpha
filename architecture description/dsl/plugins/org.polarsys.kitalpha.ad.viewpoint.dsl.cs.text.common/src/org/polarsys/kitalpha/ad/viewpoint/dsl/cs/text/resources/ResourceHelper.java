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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.Resource.IOWrappedException;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpspec.CoreModelHelper;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;
import org.polarsys.kitalpha.resourcereuse.model.Location;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

import com.google.common.collect.Lists;
import com.google.inject.Provider;


/**
 * 
 * @author Amine Lajmi
 * 		   Faycal Abka
 *
 */
public class ResourceHelper {
	
	public static final String MODELS_FOLDER = "model";
	
	private ResourceHelper() {}
	
	/**
	 * Returns primary resources in current platform
	 * @return
	 */
	public static URI getPrimaryResourceURI() {
		List<URI> resourceURIs = new ArrayList<URI>();
		org.polarsys.kitalpha.resourcereuse.model.Resource[] resources = getViewpointResourcesByExtension(FileExtension.SPECIFICATION_EXTENSION);
		for (org.polarsys.kitalpha.resourcereuse.model.Resource r: resources) {
			URI uri = computeURI(r);
			if (hasPeriodicFileExtension(uri))
				resourceURIs.add(uri);
		}
		//assume there is one primary resource per project
		return resourceURIs.get(0);
	}
	
	/**
	 * Returns primary resource of projectName project
	 * @param projectName
	 * @return
	 */
	public static URI getPrimaryResourceURI(String projectName) {
		List<URI> resourceURIs = new ArrayList<URI>();
		org.polarsys.kitalpha.resourcereuse.model.Resource[] resources = getViewpointResourcesByExtension(FileExtension.SPECIFICATION_EXTENSION);
		for (org.polarsys.kitalpha.resourcereuse.model.Resource r: resources) {
			URI uri = computeURI(r);
			if (hasPeriodicFileExtension(uri) && r.getProviderSymbolicName().equals(projectName))
				resourceURIs.add(uri);
		}
		if (!resourceURIs.isEmpty())
			return resourceURIs.get(0);
		return null;
	}
	
	/**
	 * Returns secondary resources in current platform
	 * @return
	 */
	public static List<URI> getSecondaryResourceURIs() {
		List<URI> resourceURIs = new ArrayList<URI>();
		org.polarsys.kitalpha.resourcereuse.model.Resource[] resources = getViewpointResources();
		for (org.polarsys.kitalpha.resourcereuse.model.Resource r: resources) {
			URI uri = computeURI(r);
			if (hasPeriodicFileExtension(uri))
				resourceURIs.add(uri);
		}
		return resourceURIs;
	}
	
	/**
	 * Returns secondary resources of projectName project
	 * @param projectName
	 * @return
	 */
	public static List<URI> getSecondaryResourceURIs(String projectName) {
		List<URI> resourceURIs = new ArrayList<URI>();
		org.polarsys.kitalpha.resourcereuse.model.Resource[] resources = getViewpointResources();
		for (org.polarsys.kitalpha.resourcereuse.model.Resource r: resources) {
			URI uri = computeURI(r);
			if (hasPeriodicFileExtension(uri) && r.getProviderSymbolicName().equals(projectName))
				resourceURIs.add(uri);
		}
		return resourceURIs;
	}

	/**
	 * Returns secondary resource uris with the given extension
	 * 
	 * @param extension
	 * @return
	 */
	public static List<URI> getSecondaryResourceURIsByExtension(String extension) {
		List<URI> resourceURIs = new ArrayList<URI>();
		org.polarsys.kitalpha.resourcereuse.model.Resource[] resources = getViewpointResourcesByExtension(extension);
		for (org.polarsys.kitalpha.resourcereuse.model.Resource r: resources) {
			URI uri = computeURI(r);
			if (hasPeriodicFileExtension(uri))
				resourceURIs.add(uri);
		}
		return resourceURIs;
	}
	
	/**
	 * Returns secondary resource uris with the given extension contained in the given project
	 * 
	 * @param extension
	 * @param projectName
	 * @return
	 */
	public static List<URI> getSecondaryResourceURIsByExtension(String extension, String projectName) {
		List<URI> resourceURIs = new ArrayList<URI>();
		org.polarsys.kitalpha.resourcereuse.model.Resource[] resources = getViewpointResourcesByExtension(extension);
		for (org.polarsys.kitalpha.resourcereuse.model.Resource r: resources) {
			URI uri = computeURI(r);
			if (hasPeriodicFileExtension(uri) && r.getProviderSymbolicName().equals(projectName))
				resourceURIs.add(uri);
		}
		return resourceURIs;
	}
	
	/**
	 * Returns the standalone primary resource URI contained in the given project 
	 * 
	 * @param projectName
	 * @return
	 */
	public static URI getStandaloneResourceURI(String projectName) {
		List<URI> resourceURIs = new ArrayList<URI>();
		org.polarsys.kitalpha.resourcereuse.model.Resource[] resources = getStandaloneResources();
		for (org.polarsys.kitalpha.resourcereuse.model.Resource r: resources) {
			URI uri = computeURI(r);
			if (r.getProviderSymbolicName().equals(projectName))
				resourceURIs.add(uri);
		}
		//assume there is one semantic resource per project
		return resourceURIs.get(0);
	}

	/**
	 * Returns the list of standalone primary resources in the current platform
	 * 
	 * @return
	 */
	public static org.polarsys.kitalpha.resourcereuse.model.Resource[] getStandaloneResources() {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setDomain("vpdsl");
		searchCriteria.getTags().add("vpdesc");
		return ResourceReuse.createHelper().getResources(searchCriteria);
	}
	
	/**
	 * Returns the list of resources (primary and secondary) in the current platform
	 * 
	 * @return
	 */
	public static org.polarsys.kitalpha.resourcereuse.model.Resource[] getViewpointResources() {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setDomain("vpdsl");
		searchCriteria.getTags().add("Viewpoint");
		return ResourceReuse.createHelper().getResources(searchCriteria);
	}

	/**
	 * Returns the list of resources (primary and secondary) in the current platform having the given extension
	 * 
	 * @param extension
	 * @return
	 */
	public static org.polarsys.kitalpha.resourcereuse.model.Resource[] getViewpointResourcesByExtension(String extension) {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setDomain("vpdsl");
		searchCriteria.setName(extension.substring(0, extension.indexOf(".")));
		searchCriteria.getTags().add("Viewpoint");
		return ResourceReuse.createHelper().getResources(searchCriteria);
	}
	
	public static URI computeURI(String projectName, String shortName, String extension) {
		return computeURI(projectName, shortName, extension, null);
	}
	
	public static URI computeURI(String projectName, String shortName, String extension, String fragment) {
		String stringURI = projectName + "/" + MODELS_FOLDER + "/"+ shortName + "." + extension;
		if (fragment!=null)
			stringURI = stringURI + fragment;
		return URIFix.createPlatformResourceURI(stringURI, false);
	}

	public static URI computeURI(IFile file) {
		IPath emfResourcePath = file.getFullPath();
		return URIFix.createPlatformResourceURI(emfResourcePath.toString(), true);
	}
	
	public static URI computeURI(IFile file, String extension) {
		URI specResourceURI = URIFix.createPlatformResourceURI(file.getFullPath().toString(), true);
		if (getFileExtension(specResourceURI).equals(extension))
			return specResourceURI;
		List<URI> secondaryResourceURIsByExtension = getSecondaryResourceURIsByExtension(extension, file.getProject().getName());
		if (secondaryResourceURIsByExtension.isEmpty())
			return null;
		return secondaryResourceURIsByExtension.get(0);
	}

	public static URI computeURI(org.polarsys.kitalpha.resourcereuse.model.Resource r) {
		URI uri = null;
		if (r.getProviderLocation().equals(Location.WORSPACE)) {
			uri = URIFix.createPlatformResourceURI(r.getPath(), false);
		} else {
			uri = URIFix.createPlatformPluginURI(r.getPath(), false);
		}
		return uri;
	}

	public static boolean hasPeriodicFileExtension(URI uri) {
		return (FileExtension.getByName(getFileExtension(uri))!=null);
	}
	
	public static String getFileExtension(URI uri) {
		String[] segments = uri.segments();
		int len = segments.length;
		if (len == 0) return null;
		String lastSegment = segments[len - 1];
		int i = lastSegment.indexOf('.');
		return i < 0 ? null : lastSegment.substring(i + 1);
	}
	
	public static String getFileExtension(IFile file) {
		String name = file.getName();
		int index = name.indexOf('.');
		if (index == -1)
			return null;
		if (index == (name.length() - 1))
			return "";
		return name.substring(index + 1);
	}
	
	public static String getFileExtension(IResource resource) {
		String name = resource.getName();
		int index = name.indexOf('.');
		if (index == -1)
			return null;
		if (index == (name.length() - 1))
			return "";
		return name.substring(index + 1);
	}
	
	
	public static IFile getStandaloneFile(IFile file) {
		String projectName = file.getProject().getName();
		URI standaloneResourceURI = ResourceHelper.getStandaloneResourceURI(projectName);
		if (standaloneResourceURI!=null) {
			IPath trimmed = file.getFullPath().removeFileExtension().removeFileExtension();
			IPath standalonePath = trimmed.addFileExtension(FileExtension.VPDESC_EXTENSION);
			URI createPlatformResourceURI = URIFix.createPlatformResourceURI(standalonePath.toString(), false);
			if (createPlatformResourceURI.equals(standaloneResourceURI)) {
				IFile standaloneFile = ResourcesPlugin.getWorkspace().getRoot().getFile(standalonePath);
				if (standaloneFile.exists()) 
					return standaloneFile;
			}
		}
		return null;
	}
	
	/**
	 * Returns the resource factory of the resource with the given uri and the given extension from the extension to factory map
	 * 
	 * @param uri
	 * @param extensionToFactoryMap
	 * @param extension
	 * @return
	 */
	public static Object getFactory (URI uri, Map<String, Object> extensionToFactoryMap, String extension) {
		Object resourceFactory = null;
		boolean extensionToFactoryMapIsEmpty = extensionToFactoryMap.isEmpty();
		if (!extensionToFactoryMapIsEmpty) {
			resourceFactory = extensionToFactoryMap.get(extension);
		}
		if (resourceFactory == null) {
			throw new RuntimeException(Messages.ResourceHelper_UnresolvedProxiesError + uri.toString());
		}
		return resourceFactory;
	}

	public static Resource.Factory convert(Object resourceFactory) {
		if (resourceFactory instanceof Resource.Factory.Descriptor)
			return ((Resource.Factory.Descriptor)resourceFactory).createFactory();
		return (Resource.Factory)resourceFactory;
	}

	/**
	 * Returns the service provider of the resource with the given uri and the given extension from the extension to factory map
	 * 
	 * @param uri
	 * @param extensionToFactoryMap
	 * @param extension
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static IResourceServiceProvider getServiceProvider(URI uri, Map<String, Object> extensionToFactoryMap, String extension) {
		Object object = getFactory(uri, extensionToFactoryMap, extension);
		
		if (object instanceof IResourceServiceProvider.Provider){
			return ((IResourceServiceProvider.Provider) object).get(uri, null);
		}
		
		if (object instanceof Provider<?>) {
			return ((Provider<IResourceServiceProvider>) object).get();
		}
		
		return (IResourceServiceProvider) object;
	}
	
	/**
	 * Forces proxies resolution of the given type in the given resource set
	 * 
	 * @param type
	 * @param resourceSet
	 * @return
	 */
	public static EDataType resolveDataType(EDataType type, ResourceSet resourceSet) {
		if (type.eIsProxy()) {
			URI proxyURI = ((InternalEObject) type).eProxyURI();
			final URI uri = proxyURI.trimFragment();
			Resource resource = resourceSet.getResource(uri, true);
			final String fragment = proxyURI.fragment();
			if (((LazyLinkingResource)resource).getEncoder().isCrossLinkFragment(resource, fragment)) {
				EObject target = resource.getEObject(fragment);
				if (target != null) {
					type= (EDataType) target;
				} else {
					throw new RuntimeException(Messages.ResourceHelper_UnresolvedProxiesError + proxyURI.toString());
				}
			}
		}
		return type;
	}
	
	/**
	 * Forces proxies resolution of the given object and its direct and indirect content objects in the given resource set
	 * 
	 * @param root
	 * @param resourceSet
	 */
	public static void resolveProxies(EObject root, ResourceSet resourceSet) {
		TreeIterator<EObject> eAllContents = root.eAllContents();
		while (eAllContents.hasNext()) {
			EObject candidate = eAllContents.next();
			EList<EObject> references = candidate.eCrossReferences();
			for (EObject proxy : references) {
				if (proxy.eIsProxy()) {
					URI proxyURI = ((InternalEObject) proxy).eProxyURI();
					Resource resource = root.eResource();
					final String fragment = proxyURI.fragment();
					if (((LazyLinkingResource)resource).getEncoder().isCrossLinkFragment(resource, fragment)) {
						EObject target = resource.getEObject(fragment);
						if (target != null) {
							proxy= target;
						} else {
							//FIXME: clarify when this situation may happen
							throw new RuntimeException(Messages.ResourceHelper_UnresolvedProxiesError + proxyURI.toString());
						}
					}
				}
			}
		}
	}
	
	/**
	 * Workaround: resource factories management with periodic file extensions are not handled currently in EMF.
	 * 
	 * @param uri
	 * @param resourceSet
	 * @return loaded resource
	 */
	public static Resource createResource(URI uri, ResourceSet resourceSet) {
		Resource.Factory.Registry factoryRegistry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> extensionToFactoryMap = factoryRegistry.getExtensionToFactoryMap();		
		Resource.Factory factory = convert(getFactory(uri, extensionToFactoryMap, getFileExtension(uri)));
		if (factory != null){ 
			Resource resource= factory.createResource(uri);
			addResource(resource, resourceSet);
			return resource;
		}
		return null;
	}

	public static Resource addResource(Resource resource, ResourceSet resourceSet) {
		URI uri = resource.getURI();
		Resource r = resourceSet.getResource(uri, false);
		if (r == null) {
			resourceSet.getResources().add(resource);
			return resource;
		} else {
			return r;
		}
	}

	public static void removeResource(Resource resource, ResourceSet resourceSet) {
		if (resourceSet.getResources().contains(resource))
			resourceSet.getResources().remove(resource);
	}

	/**
	 * Loads a resource in the given resource set.
	 * 
	 * @param uri
	 * @param resourceSet
	 * @return
	 */
	public static Resource loadResource(URI uri, ResourceSet resourceSet) {
		Resource resource = resourceSet.getResource(uri, false);
		if (resource!=null)
			return resource;
		if (hasPeriodicFileExtension(uri)) {
			resource = createResource(uri, resourceSet);
			if (resource!=null) {
				try {
					resource.load(Collections.EMPTY_MAP);
					addResource(resource, resourceSet);
				} catch (IOException e) {
					if (e instanceof IOWrappedException) {
						//FIXME: resource does not exist, return null
						resource = resourceSet.getResource(uri, true);
						if (resource != null && resource.isLoaded()){
							addResource(resource, resourceSet);
							return resource;
						}
					} else {	
						e.printStackTrace();	
					}
				}
			}
			return resource;
		}
		if (uri.fragment() == null) {
			resource = resourceSet.getResource(uri, true);
			if (resource.getContents().isEmpty())
				return null;
			return resource;
		}
		EObject result = resourceSet.getEObject(uri, true);
		return result.eResource();
	}

	public static void unloadResource(Resource resource, ResourceSet resourceSet) {
		resource.unload();
		removeResource(resource, resourceSet);
	}

	/**
	 * Loads a model from the given file in the given resource set
	 * 
	 * @param file
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadResource(IFile file, ResourceSet resourceSet) {
		String fileExtension = getFileExtension(file);
		if (fileExtension.equals(FileExtension.SPECIFICATION_EXTENSION))
			return loadPrimaryResource(file, resourceSet);
		if (fileExtension.equals(FileExtension.BUILD_EXTENSION))
			return loadBuildResource(file, resourceSet);
		if (fileExtension.equals(FileExtension.CONFIGURATION_EXTENSION))
			return loadConfigurationResource(file, resourceSet);
		if (fileExtension.equals(FileExtension.DATA_EXTENSION))
			return loadDataResource(file, resourceSet);
		if (fileExtension.equals(FileExtension.UI_EXTENSION))
			return loadUIResource(file, resourceSet);
		if (fileExtension.equals(FileExtension.SERVICES_EXTENSION))
			return loadServicesResource(file, resourceSet);
		if (fileExtension.equals(FileExtension.DIAGRAM_EXTENSION))
			return loadDiagramResource(file, resourceSet);
		if (fileExtension.equals(FileExtension.ACTIVITYEXPLORER_EXTENSION))
			return loadActivityexplorerResource(file, resourceSet);
		return loadModel(file, resourceSet);		
	}
	
	/**
	 * Loads a model from the given file in the given resource set 
	 * 
	 * @param file
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadModel(IFile file, ResourceSet resourceSet) {
		URI uri = URIFix.createPlatformResourceURI(file.getFullPath().toString(), true);			
		Resource resource = loadResource(uri, resourceSet);
		EObject modelRoot = resource.getContents().get(0);
		if (modelRoot!=null) {
			EcoreUtil.resolveAll(modelRoot);
			return Lists.newArrayList(modelRoot);
		}
		return Collections.emptyList();
	}

	/**
	 * Loads the standalone primary resource of the given project in the given resource set
	 * 
	 * @param resourceSet
	 * @param projectName
	 * @return
	 */
	public static EObject loadStandaloneResource(ResourceSet resourceSet, String projectName) {
		URI emfURI = getStandaloneResourceURI(projectName);
		if (resourceSet.getURIConverter().exists(emfURI, null)) {
			Resource standaloneResource = resourceSet.getResource(emfURI, true);
			EObject targetRoot = standaloneResource.getContents().get(0);
			if (targetRoot!=null)
				return targetRoot;
		}
		//	throw new RuntimeException (Messages.ResourceHelper_TargetModelNotFound);
		return null;
	}
	
		
	/**
	 * Returns IResource of standalone resource of projectName project
	 * 
	 * XXX: use as parameter to get the standalone resource for better perf??
	 * 
	 * @param projectName
	 * @return
	 */
	public static IResource getStandaloneIResource(String projectName) {
		List<URI> resourceURIs = new ArrayList<URI>();
		org.polarsys.kitalpha.resourcereuse.model.Resource[] resources = getStandaloneResources();
		for (org.polarsys.kitalpha.resourcereuse.model.Resource r: resources) {
			URI uri = computeURI(r);
			if (r.getProviderSymbolicName().equals(projectName))
				resourceURIs.add(uri);
		}
		//assume there is one semantic resource per project
		String standaloneResourceURI = resourceURIs.get(0).toPlatformString(true);
		IResource iResource = ResourcesPlugin.getWorkspace().getRoot().findMember(standaloneResourceURI);
		return iResource;
	}

	/**
	 * Loads the standalone primary resource of the given project in a new resource set
	 * 
	 * @param projectName
	 * @return
	 */
	public static Resource loadStandaloneResource(String projectName) {
		URI standaloneResourceURI = getStandaloneResourceURI(projectName);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(standaloneResourceURI, true);
		return resource;
	}

	/**
	 * Loads the primary resource of the current project in the given resource set
	 * 
	 * @param projectName
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadPrimaryResource(String projectName, ResourceSet resourceSet) {
		URI specResourceURI = getPrimaryResourceURI(projectName);
		if (specResourceURI==null)
			throw new RuntimeException (Messages.ResourceHelper_SpecificationModelNotFound);
		return loadPrimaryResource(specResourceURI, resourceSet);
	}
	
	/**
	 * Loads the primary resource from the given file in the given resource set
	 * 
	 * @param file
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadPrimaryResource(IFile file, ResourceSet resourceSet) {
		URI specResourceURI = computeURI(file, FileExtension.SPECIFICATION_EXTENSION);
		if (specResourceURI==null)
			throw new RuntimeException (Messages.ResourceHelper_SpecificationModelNotFound);
		return loadPrimaryResource(specResourceURI, resourceSet);
	}

	/**
	 * Loads the primary resource with the given URI in the given resource set
	 * 
	 * @param specResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadPrimaryResource(URI specResourceURI, ResourceSet resourceSet) {
		Resource specResource = loadResource(specResourceURI, resourceSet);
		EObject primaryResourceRoot = null;
		if (!specResource.getContents().isEmpty())
			primaryResourceRoot = specResource.getContents().get(0);
		return Lists.newArrayList(primaryResourceRoot);
	}

	/**
	 * Loads the Build resource from the given file in the given resource set
	 * 
	 * @param file
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadBuildResource(IFile file, ResourceSet resourceSet) {
		URI buildResourceURI = computeURI(file, FileExtension.BUILD_EXTENSION);
		if (buildResourceURI==null)
			return Collections.emptyList();
		return loadBuildResource(buildResourceURI, resourceSet);
	}

	/**
	 * Loads the Build resource with the given URI in the given resource set
	 * 
	 * @param buildResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadBuildResource(URI buildResourceURI, ResourceSet resourceSet) {
		Resource buildResource = loadResource(buildResourceURI, resourceSet);
		if (!buildResource.getContents().isEmpty()) {
			EObject buildRoot = buildResource.getContents().get(0);
			return Lists.newArrayList(buildRoot);
		}
		return Collections.emptyList();
	}
	
	/**
	 * Loads the Build resource from the given file in the given resource set
	 * 
	 * @param file
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> validateAndloadBuildResource(IFile file, ResourceSet resourceSet) {
		URI buildResourceURI = computeURI(file, FileExtension.BUILD_EXTENSION);
		if (buildResourceURI==null)
			return Collections.emptyList();
		return validateAndLoadBuildResource(buildResourceURI, resourceSet);
	}
	
	/**
	 * Loads the Build resource with the given URI in the given resource set
	 * 
	 * @param buildResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> validateAndLoadBuildResource(URI buildResourceURI, ResourceSet resourceSet) {
		Resource buildResource = loadResource(buildResourceURI, resourceSet);
		if (!buildResource.getContents().isEmpty()) {
			EObject buildRoot = buildResource.getContents().get(0);
			if (isValid(buildRoot))
				return Lists.newArrayList(buildRoot);
		}
		return Collections.emptyList();
	}

	/**
	 * Loads the Data resource from the given file in the given resource set
	 * 
	 * @param file
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadDataResource(IFile file, ResourceSet resourceSet) {
		URI dataResourceURI = computeURI(file, FileExtension.DATA_EXTENSION);
		if (dataResourceURI==null)
			throw new RuntimeException (Messages.ResourceHelper_DataModelNotFound);
		return loadDataResource(dataResourceURI, resourceSet);
	}
	
	/**
	 * Loads the Data resource with the given URI in the given resource set
	 * 
	 * @param dataResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadDataResource(URI dataResourceURI, ResourceSet resourceSet) {
		Resource dataResource = loadResource(dataResourceURI, resourceSet);
		if (!dataResource.getContents().isEmpty()) {
			EObject dataRoot = dataResource.getContents().get(0);
			loadExternalLibrary(resourceSet);
			EcoreUtil2.resolveAll(dataRoot);
			return dataRoot.eContents();
		}
		return Collections.emptyList();
	}
	
	
	/**
	 * Loads the Data resource from the given file in the given resource set
	 * 
	 * @param file
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> validateAndLoadDataResource(IFile file, ResourceSet resourceSet) {
		URI dataResourceURI = computeURI(file, FileExtension.DATA_EXTENSION);
		if (dataResourceURI==null)
			throw new RuntimeException (Messages.ResourceHelper_DataModelNotFound);
		return validateAndLoadDataResource(dataResourceURI, resourceSet);
	}

	/**
	 * Loads the Data resource with the given URI in the given resource set
	 * if the resource contains error, return emptylist
	 * @param dataResourceURI
	 * @param resourceSet
	 * @return 
	 */
	public static List<EObject> validateAndLoadDataResource(URI dataResourceURI, ResourceSet resourceSet) {
		Resource dataResource = loadResource(dataResourceURI, resourceSet);
		
		if (!dataResource.getContents().isEmpty()) {
			EObject dataRoot = dataResource.getContents().get(0);
			loadExternalLibrary(resourceSet);
			EcoreUtil2.resolveAll(dataRoot);
			if (isValid(dataRoot))
				return dataRoot.eContents();
		}
		
		return Collections.emptyList();
	}
	
	
	
	private static boolean isValid(EObject eObject) {
		Resource eResource = eObject.eResource();
		EList<Diagnostic> errors = eResource.getErrors();
		
		boolean empty = errors.isEmpty();
		org.eclipse.emf.common.util.Diagnostic result = 
				Diagnostician.INSTANCE.validate(EcoreUtil.getRootContainer(eObject));
		
		return empty &= (result.getSeverity() != IStatus.ERROR);

	}

	
	/**
	 * Loads the Data resource with the given URI, imported uri in the given resource set
	 * 
	 * @param dataResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadDataResource(URI dataResourceURI, List<String> importUri, ResourceSet resourceSet){
		Resource dataResource = loadResource(dataResourceURI, resourceSet);
		if (!dataResource.getContents().isEmpty()) {
			EObject dataRoot = dataResource.getContents().get(0);
			loadExternalLibrary(resourceSet);
			loadExternalLibrary(importUri, resourceSet);
			EcoreUtil2.resolveAll(dataRoot);
			return dataRoot.eContents();
		}
		return Collections.emptyList();
	}
	
	
	/**
	 * Loads the external library specified in the external library loader extension points
	 * 
	 * @param resourceSet
	 */
	public static void loadExternalLibrary(ResourceSet resourceSet) {
		Map<String, URI> fPackagesInScope = ExternalDataHelper.getPackagesInScopeURIs();
		for (Map.Entry<String, URI> entry : fPackagesInScope.entrySet()) {
			QualifiedName packageNsURI = QualifiedName.create(entry.getKey());
			URI nsURI = URI.createURI(packageNsURI.toString());
			EPackage ecoreModel = resourceSet.getPackageRegistry().getEPackage(nsURI.toString());
			if (ecoreModel !=null){
				EPackage loadedEPackage = ExternalDataHelper.loadEPackage(nsURI.toString(), resourceSet);
				Resource packageResource = loadedEPackage != null? loadedEPackage.eResource(): null;
				// [BZE] : modification of the condition, this avoid an exception raise
				if (packageResource != null && ! resourceSet.getResources().contains(packageResource))
				{
					resourceSet.getResources().add(packageResource);
				}
			}
		}
	}
	
	
	/**
	 * Load the external library specified by import external
	 * 
	 * @param nsUris
	 * @param ressourceSet
	 */
	public static void loadExternalLibrary(List<String> nsUris, ResourceSet resourceSet){
		for (String uri : nsUris) {
			loadExternalLibrary(uri, resourceSet);
		}
	}
	
	/**
	 * Load an external Library with her nsUri.
	 * @param nsUri
	 * @param resourceSet
	 */
	public static void loadExternalLibrary(String nsUri, ResourceSet resourceSet){
		EPackage loadedPackage = ExternalDataHelper.loadEPackage(nsUri, resourceSet);
		Resource resource = loadedPackage != null? loadedPackage.eResource(): null;
		if (resource != null){
			resourceSet.getResources().add(resource);
		}
	}
	
	/**
	 * Loads the UI resource from the given file in the given resource set
	 * 
	 * @param file
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadUIResource(IFile file, ResourceSet resourceSet) {
		URI uiResourceURI = computeURI(file, FileExtension.UI_EXTENSION);
		if (uiResourceURI==null)
			return Collections.emptyList();
		return loadUIResource(uiResourceURI, resourceSet);
	}

	/**
	 * Loads the UI resource with the given URI in the given resource set
	 * 
	 * @param uiResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadUIResource(URI uiResourceURI, ResourceSet resourceSet) {
		Resource uiResource = loadResource(uiResourceURI, resourceSet);
		if (uiResource != null && !uiResource.getContents().isEmpty()) {
			EObject uiRoot = uiResource.getContents().get(0);
			return uiRoot.eContents();
		}
		return Collections.emptyList();
	}
	
	/**
	 * Loads the UI resource from the given file in the given resource set
	 * 
	 * @param file
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> validateAndLoadUIResource(IFile file, ResourceSet resourceSet) {
		URI uiResourceURI = computeURI(file, FileExtension.UI_EXTENSION);
		if (uiResourceURI==null)
			return Collections.emptyList();
		return validateAndLoadUIResource(uiResourceURI, resourceSet);
	}
	
	
	/**
	 * Loads the UI resource with the given URI in the given resource set
	 * 
	 * @param uiResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> validateAndLoadUIResource(URI uiResourceURI, ResourceSet resourceSet) {
		Resource uiResource = loadResource(uiResourceURI, resourceSet);
		if (uiResource != null && !uiResource.getContents().isEmpty()) {
			EObject uiRoot = uiResource.getContents().get(0);
			
			if (isValid(uiRoot))
				return uiRoot.eContents();
		}
		return Collections.emptyList();
	}

	/**
	 * Loads the Diagram resource from the given file in the given resource set
	 * 
	 * @param file
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadDiagramResource(IFile file, ResourceSet resourceSet) {
		URI diagramResourceURI = computeURI(file, FileExtension.DIAGRAM_EXTENSION);
		if (diagramResourceURI==null)
			return Collections.emptyList();
		return loadDiagramResource(diagramResourceURI, resourceSet);
	}

	/**
	 * Loads the Diagram resource with the given URI in the given resource set
	 * 
	 * @param diagramResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadDiagramResource(URI diagramResourceURI, ResourceSet resourceSet) {
		Resource diagramResource = loadResource(diagramResourceURI, resourceSet);
		if (diagramResource != null && !diagramResource.getContents().isEmpty()) {
			EObject diagramRoot = diagramResource.getContents().get(0);
			return diagramRoot.eContents();
		}
		return Collections.emptyList();
	}
	
	/**
	 * Loads the Diagram resource from the given file in the given resource set
	 * 
	 * @param file
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> validateAndLoadDiagramResource(IFile file, ResourceSet resourceSet) {
		URI diagramResourceURI = computeURI(file, FileExtension.DIAGRAM_EXTENSION);
		if (diagramResourceURI==null)
			return Collections.emptyList();
		return validateAndLoadDiagramResource(diagramResourceURI, resourceSet);
	}
	
	/**
	 * Loads the Diagram resource with the given URI in the given resource set
	 * 
	 * @param diagramResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> validateAndLoadDiagramResource(URI diagramResourceURI, ResourceSet resourceSet) {
		Resource diagramResource = loadResource(diagramResourceURI, resourceSet);
		if (diagramResource != null && !diagramResource.getContents().isEmpty()) {
			EObject diagramRoot = diagramResource.getContents().get(0);
			if (isValid(diagramRoot))
				return diagramRoot.eContents();
		}
		return Collections.emptyList();
	}

	/**
	 * Loads the Configuration resource from the given file in the given resource set
	 * 
	 * @param file
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadConfigurationResource(IFile file, ResourceSet resourceSet) {
		URI configurationResourceURI = computeURI(file, FileExtension.CONFIGURATION_EXTENSION);
		if (configurationResourceURI==null)
			return Collections.emptyList();
		return loadConfigurationResource(configurationResourceURI, resourceSet);
	}

	/**
	 * Loads the Configuration resource with the given URI in the given resource set
	 * 
	 * @param configurationResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadConfigurationResource(URI configurationResourceURI, ResourceSet resourceSet) {
		Resource configurationResource = loadResource(configurationResourceURI, resourceSet);
		if (configurationResource != null && !configurationResource.getContents().isEmpty()) {
			EObject configurationRoot = configurationResource.getContents().get(0);
			return Lists.newArrayList(configurationRoot);
		}
		return Collections.emptyList();
	}
	
	/**
	 * Loads the Configuration resource from the given file in the given resource set
	 * 
	 * @param file
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> validateAndLoadConfigurationResource(IFile file, ResourceSet resourceSet) {
		URI configurationResourceURI = computeURI(file, FileExtension.CONFIGURATION_EXTENSION);
		if (configurationResourceURI==null)
			return Collections.emptyList();
		return validateAndLoadConfigurationResource(configurationResourceURI, resourceSet);
	}
	
	/**
	 * Loads the Configuration resource with the given URI in the given resource set
	 * 
	 * @param configurationResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> validateAndLoadConfigurationResource(URI configurationResourceURI, ResourceSet resourceSet) {
		Resource configurationResource = loadResource(configurationResourceURI, resourceSet);
		if (configurationResource != null && !configurationResource.getContents().isEmpty()) {
			EObject configurationRoot = configurationResource.getContents().get(0);
			if (isValid(configurationRoot))
				return Lists.newArrayList(configurationRoot);
		}
		return Collections.emptyList();
	}

	/**
	 * Loads the Services resource from the given file in the given resource set
	 * 
	 * @param file
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadServicesResource(IFile file, ResourceSet resourceSet) {
		URI servicesResourceURI = computeURI(file, FileExtension.SERVICES_EXTENSION);
		if (servicesResourceURI==null)
			return Collections.emptyList();
		return loadServicesResource(servicesResourceURI, resourceSet);
	}

	/**
	 * Loads the S resource with the given URI in the given resource set
	 * 
	 * @param servicesResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadServicesResource(URI servicesResourceURI, ResourceSet resourceSet) {
		Resource servicesResource = loadResource(servicesResourceURI, resourceSet);
		if (servicesResource != null && !servicesResource.getContents().isEmpty()) {
			EObject servicesResourceRoot = servicesResource.getContents().get(0);
			List<EObject> contents = servicesResourceRoot.eContents();
			return contents;
		}
		return Collections.emptyList();
	}
	
	/**
	 * Loads the Services resource from the given file in the given resource set
	 * 
	 * @param file
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> validateAndLoadServicesResource(IFile file, ResourceSet resourceSet) {
		URI servicesResourceURI = computeURI(file, FileExtension.SERVICES_EXTENSION);
		if (servicesResourceURI==null)
			return Collections.emptyList();
		return validateAndLoadServicesResource(servicesResourceURI, resourceSet);
	}
	
	/**
	 * Loads the S resource with the given URI in the given resource set
	 * 
	 * @param servicesResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> validateAndLoadServicesResource(URI servicesResourceURI, ResourceSet resourceSet) {
		Resource servicesResource = loadResource(servicesResourceURI, resourceSet);
		if (servicesResource != null && !servicesResource.getContents().isEmpty()) {
			EObject servicesResourceRoot = servicesResource.getContents().get(0);
			List<EObject> contents = servicesResourceRoot.eContents();
			if (isValid(servicesResourceRoot))
				return contents;
		}
		return Collections.emptyList();
	}
	
	
	
	public static List<EObject> loadActivityexplorerResource(IFile file, ResourceSet resourceSet){
		
		URI activityExplorerURI = computeURI(file, FileExtension.ACTIVITYEXPLORER_EXTENSION);
		
		if (activityExplorerURI == null)
			return Collections.emptyList();
		
		return loadActivityexplorerResource(activityExplorerURI, resourceSet);
	}


	public static List<EObject> loadActivityexplorerResource(URI activityExplorerURI, ResourceSet resourceSet) {
		
		Resource activityExplorerResource = loadResource(activityExplorerURI, resourceSet);
		
		if (!activityExplorerResource.getContents().isEmpty()){
			EObject activityExplorerRoot = activityExplorerResource.getContents().get(0);
			return Lists.newArrayList(activityExplorerRoot);
		}
		return Collections.emptyList();
	}

	public static List<EObject> validateAndLoadActivityexplorerResource(IFile file, ResourceSet resourceSet){

		URI activityExplorerURI = computeURI(file, FileExtension.ACTIVITYEXPLORER_EXTENSION);

		if (activityExplorerURI == null)
			return Collections.emptyList();

		return validateAndLoadActivityexplorerResource(activityExplorerURI, resourceSet);
	}

	
	public static List<EObject> validateAndLoadActivityexplorerResource(URI activityExplorerURI, ResourceSet resourceSet) {

		Resource activityExplorerResource = loadResource(activityExplorerURI, resourceSet);

		if (!activityExplorerResource.getContents().isEmpty()){
			EObject activityExplorerRoot = activityExplorerResource.getContents().get(0);
			if (isValid(activityExplorerRoot))
				return Lists.newArrayList(activityExplorerRoot);
		}
		return Collections.emptyList();
	}

	public static String getProjectName(EObject object){	
		return CoreModelHelper.getProjectName(object); 	
	}
	
	
	/**
	 * Copied from {@link org.polarsys.kitalpha.ad.common.utils.URIFix}
	 */
	public static class URIFix {

		public static URI createPlatformPluginURI(String path, boolean encode) {
			return createURI("platform:/plugin/", path);
		}

		public static URI createPlatformResourceURI(String path, boolean encode) {
			return createURI("platform:/resource/", path);
		}

		private static URI createURI(String prefix, String path) {
			String uri = prefix;
			if (path.startsWith("/"))
				uri += path.substring(1);
			else
				uri += path;
			return URI.createURI(uri);
		}
	}
}

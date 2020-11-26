/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
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
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpconf.ConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpspec.CoreModelHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.util.ProjectUtil;
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
		final List<URI> resourceURIs = new ArrayList<URI>();
		final org.polarsys.kitalpha.resourcereuse.model.Resource[] resources = getViewpointResourcesByExtension(FileExtension.SPECIFICATION_EXTENSION);
		for (final org.polarsys.kitalpha.resourcereuse.model.Resource r: resources) {
			final URI uri = computeURI(r);
			if (hasPeriodicFileExtension(uri)) {
				resourceURIs.add(uri);
			}
		}
		//assume there is one primary resource per project
		return resourceURIs.get(0);
	}

	/**
	 * Returns primary resource of projectName project
	 * @param projectName
	 * @return
	 */
	public static URI getPrimaryResourceURI(final String projectName) {
		final List<URI> resourceURIs = new ArrayList<URI>();
		final org.polarsys.kitalpha.resourcereuse.model.Resource[] resources = getViewpointResourcesByExtension(FileExtension.SPECIFICATION_EXTENSION);
		for (final org.polarsys.kitalpha.resourcereuse.model.Resource r: resources) {
			final URI uri = computeURI(r);
			if (hasPeriodicFileExtension(uri) && r.getProviderSymbolicName().equals(projectName)) {
				resourceURIs.add(uri);
			}
		}
		if (!resourceURIs.isEmpty()) {
			return resourceURIs.get(0);
		}
		return null;
	}

	/**
	 * Returns secondary resources in current platform
	 * @return
	 */
	public static List<URI> getSecondaryResourceURIs() {
		final List<URI> resourceURIs = new ArrayList<URI>();
		final org.polarsys.kitalpha.resourcereuse.model.Resource[] resources = getViewpointResources();
		for (final org.polarsys.kitalpha.resourcereuse.model.Resource r: resources) {
			final URI uri = computeURI(r);
			if (hasPeriodicFileExtension(uri)) {
				resourceURIs.add(uri);
			}
		}
		return resourceURIs;
	}

	/**
	 * Returns secondary resources of projectName project
	 * @param projectName
	 * @return
	 */
	public static List<URI> getSecondaryResourceURIs(final String projectName) {
		final List<URI> resourceURIs = new ArrayList<URI>();
		final org.polarsys.kitalpha.resourcereuse.model.Resource[] resources = getViewpointResources();
		for (final org.polarsys.kitalpha.resourcereuse.model.Resource r: resources) {
			final URI uri = computeURI(r);
			if (hasPeriodicFileExtension(uri) && r.getProviderSymbolicName().equals(projectName)) {
				resourceURIs.add(uri);
			}
		}
		return resourceURIs;
	}

	/**
	 * Returns secondary resource uris with the given extension
	 *
	 * @param extension
	 * @return
	 */
	public static List<URI> getSecondaryResourceURIsByExtension(final String extension) {
		final List<URI> resourceURIs = new ArrayList<URI>();
		final org.polarsys.kitalpha.resourcereuse.model.Resource[] resources = getViewpointResourcesByExtension(extension);
		for (final org.polarsys.kitalpha.resourcereuse.model.Resource r: resources) {
			final URI uri = computeURI(r);
			if (hasPeriodicFileExtension(uri)) {
				resourceURIs.add(uri);
			}
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
	public static List<URI> getSecondaryResourceURIsByExtension(final String extension, final String projectName) {
		final List<URI> resourceURIs = new ArrayList<URI>();
		final org.polarsys.kitalpha.resourcereuse.model.Resource[] resources = getViewpointResourcesByExtension(extension);
		for (final org.polarsys.kitalpha.resourcereuse.model.Resource r: resources) {
			final URI uri = computeURI(r);
			if (hasPeriodicFileExtension(uri) && r.getProviderSymbolicName().equals(projectName)) {
				resourceURIs.add(uri);
			}
		}
		return resourceURIs;
	}

	/**
	 * Returns the standalone primary resource URI contained in the given project
	 *
	 * @param projectName
	 * @return
	 */
	public static URI getStandaloneResourceURI(final String projectName) {
		final List<URI> resourceURIs = new ArrayList<URI>();
		final org.polarsys.kitalpha.resourcereuse.model.Resource[] resources = getStandaloneResources();
		for (final org.polarsys.kitalpha.resourcereuse.model.Resource r: resources) {
			final URI uri = computeURI(r);
			if (r.getProviderSymbolicName().equals(projectName)) {
				resourceURIs.add(uri);
			}
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
		final SearchCriteria searchCriteria = new SearchCriteria();
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
		final SearchCriteria searchCriteria = new SearchCriteria();
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
	public static org.polarsys.kitalpha.resourcereuse.model.Resource[] getViewpointResourcesByExtension(final String extension) {
		final SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setDomain("vpdsl");
		searchCriteria.setName(extension.substring(0, extension.indexOf(".")));
		searchCriteria.getTags().add("Viewpoint");
		return ResourceReuse.createHelper().getResources(searchCriteria);
	}

	public static URI computeURI(final String projectName, final String shortName, final String extension) {
		return computeURI(projectName, shortName, extension, null);
	}

	public static URI computeURI(final String projectName, final String shortName, final String extension, final String fragment) {
		String stringURI = projectName + "/" + MODELS_FOLDER + "/"+ shortName + "." + extension;
		if (fragment!=null) {
			stringURI = stringURI + fragment;
		}
		return URIFix.createPlatformResourceURI(stringURI, false);
	}

	public static URI computeURI(final IFile file) {
		final IPath emfResourcePath = file.getFullPath();
		return URIFix.createPlatformResourceURI(emfResourcePath.toString(), true);
	}

	public static URI computeURI(final IFile file, final String extension) {
		final URI specResourceURI = URIFix.createPlatformResourceURI(file.getFullPath().toString(), true);
		if (getFileExtension(specResourceURI).equals(extension)) {
			return specResourceURI;
		}
		final List<URI> secondaryResourceURIsByExtension = getSecondaryResourceURIsByExtension(extension, file.getProject().getName());
		if (secondaryResourceURIsByExtension.isEmpty()) {
			return null;
		}
		return secondaryResourceURIsByExtension.get(0);
	}

	public static URI computeURI(final org.polarsys.kitalpha.resourcereuse.model.Resource r) {
		URI uri = null;
		if (r.getProviderLocation().equals(Location.WORSPACE)) {
			uri = URIFix.createPlatformResourceURI(r.getPath(), false);
		} else {
			uri = URIFix.createPlatformPluginURI(r.getPath(), false);
		}
		return uri;
	}

	public static boolean hasPeriodicFileExtension(final URI uri) {
		return (FileExtension.getByName(getFileExtension(uri))!=null);
	}

	public static String getFileExtension(final URI uri) {
		final String[] segments = uri.segments();
		final int len = segments.length;
		if (len == 0) {
			return null;
		}
		final String lastSegment = segments[len - 1];
		final int i = lastSegment.indexOf('.');
		return i < 0 ? null : lastSegment.substring(i + 1);
	}

	public static String getFileExtension(final IFile file) {
		final String name = file.getName();
		final int index = name.indexOf('.');
		if (index == -1) {
			return null;
		}
		if (index == (name.length() - 1)) {
			return "";
		}
		return name.substring(index + 1);
	}

	public static String getFileExtension(final IResource resource) {
		final String name = resource.getName();
		final int index = name.indexOf('.');
		if (index == -1) {
			return null;
		}
		if (index == (name.length() - 1)) {
			return "";
		}
		return name.substring(index + 1);
	}


	public static IFile getStandaloneFile(final IFile file) {
		final String projectName = file.getProject().getName();
		final URI standaloneResourceURI = ResourceHelper.getStandaloneResourceURI(projectName);
		if (standaloneResourceURI!=null) {
			final IPath trimmed = file.getFullPath().removeFileExtension().removeFileExtension();
			final IPath standalonePath = trimmed.addFileExtension(FileExtension.VPDESC_EXTENSION);
			final URI createPlatformResourceURI = URIFix.createPlatformResourceURI(standalonePath.toString(), false);
			if (createPlatformResourceURI.equals(standaloneResourceURI)) {
				final IFile standaloneFile = ResourcesPlugin.getWorkspace().getRoot().getFile(standalonePath);
				if (standaloneFile.exists()) {
					return standaloneFile;
				}
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
	public static Object getFactory (final URI uri, final Map<String, Object> extensionToFactoryMap, final String extension) {
		Object resourceFactory = null;
		final boolean extensionToFactoryMapIsEmpty = extensionToFactoryMap.isEmpty();
		if (!extensionToFactoryMapIsEmpty) {
			resourceFactory = extensionToFactoryMap.get(extension);
		}
		if (resourceFactory == null) {
			throw new RuntimeException(Messages.ResourceHelper_UnresolvedProxiesError + uri.toString());
		}
		return resourceFactory;
	}

	public static Resource.Factory convert(final Object resourceFactory) {
		if (resourceFactory instanceof Resource.Factory.Descriptor) {
			return ((Resource.Factory.Descriptor)resourceFactory).createFactory();
		}
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
	public static IResourceServiceProvider getServiceProvider(final URI uri, final Map<String, Object> extensionToFactoryMap, final String extension) {
		final Object object = getFactory(uri, extensionToFactoryMap, extension);

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
	public static EDataType resolveDataType(EDataType type, final ResourceSet resourceSet) {
		if (type.eIsProxy()) {
			final URI proxyURI = ((InternalEObject) type).eProxyURI();
			final URI uri = proxyURI.trimFragment();
			final Resource resource = resourceSet.getResource(uri, true);
			final String fragment = proxyURI.fragment();
			if (((LazyLinkingResource)resource).getEncoder().isCrossLinkFragment(resource, fragment)) {
				final EObject target = resource.getEObject(fragment);
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
	public static void resolveProxies(final EObject root, final ResourceSet resourceSet) {
		final TreeIterator<EObject> eAllContents = root.eAllContents();
		while (eAllContents.hasNext()) {
			final EObject candidate = eAllContents.next();
			final EList<EObject> references = candidate.eCrossReferences();
			for (EObject proxy : references) {
				if (proxy.eIsProxy()) {
					final URI proxyURI = ((InternalEObject) proxy).eProxyURI();
					final Resource resource = root.eResource();
					final String fragment = proxyURI.fragment();
					if (((LazyLinkingResource)resource).getEncoder().isCrossLinkFragment(resource, fragment)) {
						final EObject target = resource.getEObject(fragment);
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
	public static Resource createResource(final URI uri, final ResourceSet resourceSet) {
		final Resource.Factory.Registry factoryRegistry = Resource.Factory.Registry.INSTANCE;
		final Map<String, Object> extensionToFactoryMap = factoryRegistry.getExtensionToFactoryMap();
		final Resource.Factory factory = convert(getFactory(uri, extensionToFactoryMap, getFileExtension(uri)));
		if (factory != null){
			final Resource resource= factory.createResource(uri);
			addResource(resource, resourceSet);
			return resource;
		}
		return null;
	}

	public static Resource addResource(final Resource resource, final ResourceSet resourceSet) {
		final URI uri = resource.getURI();
		final Resource r = resourceSet.getResource(uri, false);
		if (r == null) {
			resourceSet.getResources().add(resource);
			return resource;
		} else {
			return r;
		}
	}

	public static void removeResource(final Resource resource, final ResourceSet resourceSet) {
		if (resourceSet.getResources().contains(resource)) {
			resourceSet.getResources().remove(resource);
		}
	}

	/**
	 * Loads a resource in the given resource set.
	 *
	 * @param uri
	 * @param resourceSet
	 * @return
	 */
	public static Resource loadResource(final URI uri, final ResourceSet resourceSet) {
		Resource resource = resourceSet.getResource(uri, false);
		if (resource!=null) {
			return resource;
		}
		if (hasPeriodicFileExtension(uri)) {
			resource = createResource(uri, resourceSet);
			if (resource!=null) {
				try {
					resource.load(Collections.EMPTY_MAP);
					addResource(resource, resourceSet);
				} catch (final IOException e) {
					if (e instanceof IOWrappedException) {
						//FIXME: resource does not exist, return null
						resource = resourceSet.getResource(uri, true);
						if ((resource != null) && resource.isLoaded()){
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
			if (resource.getContents().isEmpty()) {
				return null;
			}
			return resource;
		}
		final EObject result = resourceSet.getEObject(uri, true);
		return result.eResource();
	}

	public static void unloadResource(final Resource resource, final ResourceSet resourceSet) {
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
	public static List<EObject> loadResource(final IFile file, final ResourceSet resourceSet) {
		final String fileExtension = getFileExtension(file);
		if (fileExtension.equals(FileExtension.SPECIFICATION_EXTENSION)) {
			return loadPrimaryResource(file, resourceSet);
		}
		if (fileExtension.equals(FileExtension.BUILD_EXTENSION)) {
			return loadBuildResource(file, resourceSet);
		}
		if (fileExtension.equals(FileExtension.CONFIGURATION_EXTENSION)) {
			return loadConfigurationResource(file, resourceSet);
		}
		if (fileExtension.equals(FileExtension.DATA_EXTENSION)) {
			return loadDataResource(file, resourceSet);
		}
		if (fileExtension.equals(FileExtension.UI_EXTENSION)) {
			return loadUIResource(file, resourceSet);
		}
		if (fileExtension.equals(FileExtension.SERVICES_EXTENSION)) {
			return loadServicesResource(file, resourceSet);
		}
		if (fileExtension.equals(FileExtension.DIAGRAM_EXTENSION)) {
			return loadDiagramResource(file, resourceSet);
		}
		if (fileExtension.equals(FileExtension.ACTIVITYEXPLORER_EXTENSION)) {
			return loadActivityexplorerResource(file, resourceSet);
		}
		return loadModel(file, resourceSet);
	}

	/**
	 * Loads a model from the given file in the given resource set and validate
	 * a loaded model
	 *
	 * @param file
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> validateAndloadResource(final IFile file, final ResourceSet resourceSet) {
		final String fileExtension = getFileExtension(file);
		if (fileExtension.equals(FileExtension.SPECIFICATION_EXTENSION)) {
			return validateAndLoadPrimaryResource(file, resourceSet);
		}
		if (fileExtension.equals(FileExtension.BUILD_EXTENSION)) {
			return validateAndLoadBuildResource(file, resourceSet);
		}
		if (fileExtension.equals(FileExtension.CONFIGURATION_EXTENSION)) {
			return validateAndLoadConfigurationResource(file, resourceSet);
		}
		if (fileExtension.equals(FileExtension.DATA_EXTENSION)) {
			return validateAndLoadDataResource(file, resourceSet);
		}
		if (fileExtension.equals(FileExtension.UI_EXTENSION)) {
			return validateAndLoadUIResource(file, resourceSet);
		}
		if (fileExtension.equals(FileExtension.SERVICES_EXTENSION)) {
			return validateAndLoadServicesResource(file, resourceSet);
		}
		if (fileExtension.equals(FileExtension.DIAGRAM_EXTENSION)) {
			return validateAndLoadDiagramResource(file, resourceSet);
		}
		if (fileExtension.equals(FileExtension.ACTIVITYEXPLORER_EXTENSION)) {
			return validateAndLoadActivityexplorerResource(file, resourceSet);
		}
		return loadModel(file, resourceSet);
	}


	/**
	 * Loads a model from the given file in the given resource set
	 *
	 * @param file
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadModel(final IFile file, final ResourceSet resourceSet) {
		final URI uri = URIFix.createPlatformResourceURI(file.getFullPath().toString(), true);
		final Resource resource = loadResource(uri, resourceSet);
		final EObject modelRoot = resource.getContents().get(0);
		if (modelRoot!=null) {
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
	public static EObject loadStandaloneResource(final ResourceSet resourceSet, final String projectName) {
		final URI emfURI = getStandaloneResourceURI(projectName);
		if (resourceSet.getURIConverter().exists(emfURI, null)) {
			final Resource standaloneResource = resourceSet.getResource(emfURI, true);
			final EObject targetRoot = standaloneResource.getContents().get(0);
			if (targetRoot!=null) {
				return targetRoot;
			}
		}
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
	public static IResource getStandaloneIResource(final String projectName) {
		final List<URI> resourceURIs = new ArrayList<URI>();
		final org.polarsys.kitalpha.resourcereuse.model.Resource[] resources = getStandaloneResources();
		for (final org.polarsys.kitalpha.resourcereuse.model.Resource r: resources) {
			final URI uri = computeURI(r);
			if (r.getProviderSymbolicName().equals(projectName)) {
				resourceURIs.add(uri);
			}
		}
		//assume there is one semantic resource per project
		final String standaloneResourceURI = resourceURIs.get(0).toPlatformString(true);
		final IResource iResource = ResourcesPlugin.getWorkspace().getRoot().findMember(standaloneResourceURI);
		return iResource;
	}

	/**
	 * Loads the standalone primary resource of the given project in a new resource set
	 *
	 * @param projectName
	 * @return
	 */
	public static Resource loadStandaloneResource(final String projectName) {
		final URI standaloneResourceURI = getStandaloneResourceURI(projectName);
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Resource resource = resourceSet.getResource(standaloneResourceURI, true);
		return resource;
	}

	/**
	 * Loads the primary resource of the current project in the given resource set
	 *
	 * @param projectName
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadPrimaryResource(final String projectName, final ResourceSet resourceSet) {
		final URI specResourceURI = getPrimaryResourceURI(projectName);
		if (specResourceURI==null) {
			throw new RuntimeException (Messages.ResourceHelper_SpecificationModelNotFound);
		}
		return loadPrimaryResource(specResourceURI, resourceSet);
	}

	/**
	 * Loads the primary resource from the given file in the given resource set
	 *
	 * @param file
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadPrimaryResource(final IFile file, final ResourceSet resourceSet) {
		final URI specResourceURI = computeURI(file, FileExtension.SPECIFICATION_EXTENSION);
		if (specResourceURI==null) {
			throw new RuntimeException (Messages.ResourceHelper_SpecificationModelNotFound);
		}
		return loadPrimaryResource(specResourceURI, resourceSet);
	}

	/**
	 * Loads the primary resource with the given URI in the given resource set
	 *
	 * @param specResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadPrimaryResource(final URI specResourceURI, final ResourceSet resourceSet) {
		final Resource specResource = loadResource(specResourceURI, resourceSet);
		EObject primaryResourceRoot = null;
		if (!specResource.getContents().isEmpty()) {
			primaryResourceRoot = specResource.getContents().get(0);
		}
		return Lists.newArrayList(primaryResourceRoot);
	}


	/**
	 * Loads the primary resource from the given file in the given resource set
	 *
	 * @param file
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> validateAndLoadPrimaryResource(final IFile file, final ResourceSet resourceSet) {
		final URI specResourceURI = computeURI(file, FileExtension.SPECIFICATION_EXTENSION);
		if (specResourceURI==null) {
			throw new RuntimeException (Messages.ResourceHelper_SpecificationModelNotFound);
		}
		return validateAndLoadPrimaryResource(specResourceURI, resourceSet);
	}

	/**
	 * Loads the primary resource with the given URI in the given resource set
	 *
	 * @param specResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> validateAndLoadPrimaryResource(final URI specResourceURI, final ResourceSet resourceSet) {
		final Resource specResource = loadResource(specResourceURI, resourceSet);
		if (!specResource.getContents().isEmpty()){
			final EObject primaryResourceRoot = specResource.getContents().get(0);
			final IFile file = getFileFromURI(specResourceURI);
			if (isValid(primaryResourceRoot)){
				setProperty(ResourcesPropertysConstants.syncQualifiedName, file, "true");
				return Lists.newArrayList(primaryResourceRoot);
			}
			setProperty(ResourcesPropertysConstants.syncQualifiedName, file, "false");
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
	public static List<EObject> loadBuildResource(final IFile file, final ResourceSet resourceSet) {
		final URI buildResourceURI = computeURI(file, FileExtension.BUILD_EXTENSION);
		if (buildResourceURI==null) {
			return Collections.emptyList();
		}
		return loadBuildResource(buildResourceURI, resourceSet);
	}

	/**
	 * Loads the Build resource with the given URI in the given resource set
	 *
	 * @param buildResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadBuildResource(final URI buildResourceURI, final ResourceSet resourceSet) {
		final Resource buildResource = loadResource(buildResourceURI, resourceSet);
		if (!buildResource.getContents().isEmpty()) {
			final EObject buildRoot = buildResource.getContents().get(0);
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
	public static List<EObject> validateAndLoadBuildResource(final IFile file, final ResourceSet resourceSet) {
		final URI buildResourceURI = computeURI(file, FileExtension.BUILD_EXTENSION);
		if (buildResourceURI==null) {
			return Collections.emptyList();
		}
		return validateAndLoadBuildResource(buildResourceURI, resourceSet);
	}

	/**
	 * Loads the Build resource with the given URI in the given resource set
	 *
	 * @param buildResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> validateAndLoadBuildResource(final URI buildResourceURI, final ResourceSet resourceSet) {
		final Resource buildResource = loadResource(buildResourceURI, resourceSet);
		if (!buildResource.getContents().isEmpty()) {
			final EObject buildRoot = buildResource.getContents().get(0);
			final IFile file = getFileFromURI(buildResourceURI);
			if (isValid(buildRoot)){
				setProperty(ResourcesPropertysConstants.syncQualifiedName, file, "true");
				return Lists.newArrayList(buildRoot);
			}
			setProperty(ResourcesPropertysConstants.syncQualifiedName, file, "false");
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
	public static List<EObject> loadDataResource(final IFile file, final ResourceSet resourceSet) {
		final URI dataResourceURI = computeURI(file, FileExtension.DATA_EXTENSION);
		if (dataResourceURI==null) {
			throw new RuntimeException (Messages.ResourceHelper_DataModelNotFound);
		}
		return loadDataResource(dataResourceURI, resourceSet);
	}

	/**
	 * Loads the Data resource with the given URI in the given resource set
	 *
	 * @param dataResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadDataResource(final URI dataResourceURI, final ResourceSet resourceSet) {
		final Resource dataResource = loadResource(dataResourceURI, resourceSet);
		if (!dataResource.getContents().isEmpty()) {
			final EObject dataRoot = dataResource.getContents().get(0);
			ResourceHelper.loadExternalLibrary(dataResource);
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
	public static List<EObject> validateAndLoadDataResource(final IFile file, final ResourceSet resourceSet) {
		final URI dataResourceURI = computeURI(file, FileExtension.DATA_EXTENSION);
		if (dataResourceURI==null) {
			throw new RuntimeException (Messages.ResourceHelper_DataModelNotFound);
		}
		return validateAndLoadDataResource(dataResourceURI, resourceSet);
	}

	/**
	 * Loads the Data resource with the given URI in the given resource set
	 * if the resource contains error, return empty list
	 * @param dataResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> validateAndLoadDataResource(final URI dataResourceURI, final ResourceSet resourceSet) {
		final Resource dataResource = loadResource(dataResourceURI, resourceSet);

		if (!dataResource.getContents().isEmpty()) {
			final EObject dataRoot = dataResource.getContents().get(0);
			ResourceHelper.loadExternalLibrary(dataResource);
			final IFile file = getFileFromURI(dataResourceURI);
			if (isValid(dataRoot)){
				setProperty(ResourcesPropertysConstants.syncQualifiedName, file, "true");
				return dataRoot.eContents();
			}
			setProperty(ResourcesPropertysConstants.syncQualifiedName, file, "false");
		}

		return Collections.emptyList();
	}

	private static IFile getFileFromURI(final URI dataResourceURI) {
		final Path path = new Path(dataResourceURI.toPlatformString(true));
		final IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		return file;
	}

	private static boolean isValid(final EObject eObject) {
		//Trigger the emf validation first
		if (eObject != null){
			boolean empty = true;
			final EObject rootContainer = EcoreUtil.getRootContainer(eObject);

			if (rootContainer != null){
				final org.eclipse.emf.common.util.Diagnostic result =
						Diagnostician.INSTANCE.validate(rootContainer);
				empty &= (result.getSeverity() != IStatus.ERROR);
			}

			//Check if there diagnostics in the resource
			final Resource eResource = eObject.eResource();
			if (eResource != null){
				final EList<Diagnostic> errors = eResource.getErrors();
				empty &= errors.isEmpty();
			}

			return empty;
		}
		return true; //always true if there are nothing to validate

	}


	/**
	 * Loads the Data resource with the given URI, imported uri in the given resource set
	 *
	 * @param dataResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadDataResource(final URI dataResourceURI, final List<String> importUri, final ResourceSet resourceSet){
		final Resource dataResource = loadResource(dataResourceURI, resourceSet);
		if (!dataResource.getContents().isEmpty()) {
			final EObject dataRoot = dataResource.getContents().get(0);
			ResourceHelper.loadExternalLibrary(dataResource);
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
	 *
	 * Deprecated: Use LoadExternalLibrary(Resource)
	 */
	@Deprecated
	public static void loadExternalLibrary(final ResourceSet resourceSet) {
		final Map<String, URI> fPackagesInScope = ExternalDataHelper.getPackagesInScopeURIs();
		for (final Map.Entry<String, URI> entry : fPackagesInScope.entrySet()) {
			final QualifiedName packageNsURI = QualifiedName.create(entry.getKey());
			final URI nsURI = URI.createURI(packageNsURI.toString());
			final EPackage ecoreModel = resourceSet.getPackageRegistry().getEPackage(nsURI.toString());
			if (ecoreModel !=null){
				final EPackage loadedEPackage = ExternalDataHelper.loadEPackage(nsURI.toString(), resourceSet);
				final Resource packageResource = loadedEPackage != null? loadedEPackage.eResource(): null;
				// [BZE] : modification of the condition, this avoid an exception raise
				if ((packageResource != null) && ! resourceSet.getResources().contains(packageResource))
				{
					resourceSet.getResources().add(packageResource);
				}
			}
		}
	}


	public static void loadExternalLibrary(final Resource resource) {
		final ResourceSet resourceSet = resource.getResourceSet();
		final IProject projectName = ProjectUtil.getEclipseProjectOf(resource);

		if (projectName != null){
			final List<URI> secondaryResources = ResourceHelper.getSecondaryResourceURIsByExtension(FileExtension.CONFIGURATION_EXTENSION, projectName.getName());

			if (!secondaryResources.isEmpty()){
				final URI uri = secondaryResources.get(0); //There is one config resource per project
				final Resource configurationResource = ResourceHelper.loadResource(uri, resourceSet);
				final EObject root = configurationResource.getContents().get(0);
				if (root != null){
					final String targetApplication = ConfigurationHelper.getTargetApplication(root);
					final Map<String, URI> target = ExternalDataHelper.getPackagesInScopeURIs(targetApplication);
					for (final Map.Entry<String, URI> entry : target.entrySet()) {
						final QualifiedName packageNsURI = QualifiedName.create(entry.getKey());
						final URI nsURI = URI.createURI(packageNsURI.toString());
						final EPackage ePackage = resourceSet.getPackageRegistry().getEPackage(nsURI.toString());
						if (ePackage != null){
							final EPackage loadedEPackagee = ExternalDataHelper.loadEPackage(nsURI.toString(), resourceSet);
							final Resource eResource = loadedEPackagee.eResource();
							resourceSet.getResources().add(eResource);
						}
					}
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
	public static void loadExternalLibrary(final List<String> nsUris, final ResourceSet resourceSet){
		for (final String uri : nsUris) {
			loadExternalLibrary(uri, resourceSet);
		}
	}

	/**
	 * Load an external Library with her nsUri.
	 * @param nsUri
	 * @param resourceSet
	 */
	public static void loadExternalLibrary(final String nsUri, final ResourceSet resourceSet){
		final EPackage loadedPackage = ExternalDataHelper.loadEPackage(nsUri, resourceSet);
		final Resource resource = loadedPackage != null? loadedPackage.eResource(): null;
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
	public static List<EObject> loadUIResource(final IFile file, final ResourceSet resourceSet) {
		final URI uiResourceURI = computeURI(file, FileExtension.UI_EXTENSION);
		if (uiResourceURI==null) {
			return Collections.emptyList();
		}
		return loadUIResource(uiResourceURI, resourceSet);
	}

	/**
	 * Loads the UI resource with the given URI in the given resource set
	 *
	 * @param uiResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadUIResource(final URI uiResourceURI, final ResourceSet resourceSet) {
		final Resource uiResource = loadResource(uiResourceURI, resourceSet);
		if ((uiResource != null) && !uiResource.getContents().isEmpty()) {
			final EObject uiRoot = uiResource.getContents().get(0);
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
	public static List<EObject> validateAndLoadUIResource(final IFile file, final ResourceSet resourceSet) {
		final URI uiResourceURI = computeURI(file, FileExtension.UI_EXTENSION);
		if (uiResourceURI==null) {
			return Collections.emptyList();
		}
		return validateAndLoadUIResource(uiResourceURI, resourceSet);
	}


	/**
	 * Loads the UI resource with the given URI in the given resource set
	 *
	 * @param uiResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> validateAndLoadUIResource(final URI uiResourceURI, final ResourceSet resourceSet) {
		final Resource uiResource = loadResource(uiResourceURI, resourceSet);
		if ((uiResource != null) && !uiResource.getContents().isEmpty()) {
			final EObject uiRoot = uiResource.getContents().get(0);
			final IFile file = getFileFromURI(uiResourceURI);
			if (isValid(uiRoot)){
				setProperty(ResourcesPropertysConstants.syncQualifiedName, file, "true");
				return uiRoot.eContents();
			}
			setProperty(ResourcesPropertysConstants.syncQualifiedName, file, "false");
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
	public static List<EObject> loadDiagramResource(final IFile file, final ResourceSet resourceSet) {
		final URI diagramResourceURI = computeURI(file, FileExtension.DIAGRAM_EXTENSION);
		if (diagramResourceURI==null) {
			return Collections.emptyList();
		}
		return loadDiagramResource(diagramResourceURI, resourceSet);
	}

	/**
	 * Loads the Diagram resource with the given URI in the given resource set
	 *
	 * @param diagramResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadDiagramResource(final URI diagramResourceURI, final ResourceSet resourceSet) {
		final Resource diagramResource = loadResource(diagramResourceURI, resourceSet);
		if ((diagramResource != null) && !diagramResource.getContents().isEmpty()) {
			final EObject diagramRoot = diagramResource.getContents().get(0);
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
	public static List<EObject> validateAndLoadDiagramResource(final IFile file, final ResourceSet resourceSet) {
		final URI diagramResourceURI = computeURI(file, FileExtension.DIAGRAM_EXTENSION);
		if (diagramResourceURI==null) {
			return Collections.emptyList();
		}
		return validateAndLoadDiagramResource(diagramResourceURI, resourceSet);
	}

	/**
	 * Loads the Diagram resource with the given URI in the given resource set
	 *
	 * @param diagramResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> validateAndLoadDiagramResource(final URI diagramResourceURI, final ResourceSet resourceSet) {
		final Resource diagramResource = loadResource(diagramResourceURI, resourceSet);
		if ((diagramResource != null) && !diagramResource.getContents().isEmpty()) {
			final EObject diagramRoot = diagramResource.getContents().get(0);
			final IFile file = getFileFromURI(diagramResourceURI);
			if (isValid(diagramRoot)){
				setProperty(ResourcesPropertysConstants.syncQualifiedName, file, "true");
				return diagramRoot.eContents();
			}
			setProperty(ResourcesPropertysConstants.syncQualifiedName, file, "false");
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
	public static List<EObject> loadConfigurationResource(final IFile file, final ResourceSet resourceSet) {
		final URI configurationResourceURI = computeURI(file, FileExtension.CONFIGURATION_EXTENSION);
		if (configurationResourceURI==null) {
			return Collections.emptyList();
		}
		return loadConfigurationResource(configurationResourceURI, resourceSet);
	}

	/**
	 * Loads the Configuration resource with the given URI in the given resource set
	 *
	 * @param configurationResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadConfigurationResource(final URI configurationResourceURI, final ResourceSet resourceSet) {
		final Resource configurationResource = loadResource(configurationResourceURI, resourceSet);
		if ((configurationResource != null) && !configurationResource.getContents().isEmpty()) {
			final EObject configurationRoot = configurationResource.getContents().get(0);
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
	public static List<EObject> validateAndLoadConfigurationResource(final IFile file, final ResourceSet resourceSet) {
		final URI configurationResourceURI = computeURI(file, FileExtension.CONFIGURATION_EXTENSION);
		if (configurationResourceURI==null) {
			return Collections.emptyList();
		}
		return validateAndLoadConfigurationResource(configurationResourceURI, resourceSet);
	}

	/**
	 * Loads the Configuration resource with the given URI in the given resource set
	 *
	 * @param configurationResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> validateAndLoadConfigurationResource(final URI configurationResourceURI, final ResourceSet resourceSet) {
		final Resource configurationResource = loadResource(configurationResourceURI, resourceSet);
		if ((configurationResource != null) && !configurationResource.getContents().isEmpty()) {
			final EObject configurationRoot = configurationResource.getContents().get(0);
			final IFile file = getFileFromURI(configurationResourceURI);
			if (isValid(configurationRoot)){
				setProperty(ResourcesPropertysConstants.syncQualifiedName, file, "true");
				return Lists.newArrayList(configurationRoot);
			}
			setProperty(ResourcesPropertysConstants.syncQualifiedName, file, "false");
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
	public static List<EObject> loadServicesResource(final IFile file, final ResourceSet resourceSet) {
		final URI servicesResourceURI = computeURI(file, FileExtension.SERVICES_EXTENSION);
		if (servicesResourceURI==null) {
			return Collections.emptyList();
		}
		return loadServicesResource(servicesResourceURI, resourceSet);
	}

	/**
	 * Loads the S resource with the given URI in the given resource set
	 *
	 * @param servicesResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadServicesResource(final URI servicesResourceURI, final ResourceSet resourceSet) {
		final Resource servicesResource = loadResource(servicesResourceURI, resourceSet);
		if ((servicesResource != null) && !servicesResource.getContents().isEmpty()) {
			final EObject servicesResourceRoot = servicesResource.getContents().get(0);
			final List<EObject> contents = servicesResourceRoot.eContents();
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
	public static List<EObject> validateAndLoadServicesResource(final IFile file, final ResourceSet resourceSet) {
		final URI servicesResourceURI = computeURI(file, FileExtension.SERVICES_EXTENSION);
		if (servicesResourceURI==null) {
			return Collections.emptyList();
		}
		return validateAndLoadServicesResource(servicesResourceURI, resourceSet);
	}

	/**
	 * Loads the S resource with the given URI in the given resource set
	 *
	 * @param servicesResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> validateAndLoadServicesResource(final URI servicesResourceURI, final ResourceSet resourceSet) {
		final Resource servicesResource = loadResource(servicesResourceURI, resourceSet);
		if ((servicesResource != null) && !servicesResource.getContents().isEmpty()) {
			final EObject servicesResourceRoot = servicesResource.getContents().get(0);
			final List<EObject> contents = servicesResourceRoot.eContents();
			final IFile file = getFileFromURI(servicesResourceURI);
			if (isValid(servicesResourceRoot)){
				setProperty(ResourcesPropertysConstants.syncQualifiedName, file, "true");
				return contents;
			}
			setProperty(ResourcesPropertysConstants.syncQualifiedName, file, "false");
		}
		return Collections.emptyList();
	}



	public static List<EObject> loadActivityexplorerResource(final IFile file, final ResourceSet resourceSet){

		final URI activityExplorerURI = computeURI(file, FileExtension.ACTIVITYEXPLORER_EXTENSION);

		if (activityExplorerURI == null) {
			return Collections.emptyList();
		}

		return loadActivityexplorerResource(activityExplorerURI, resourceSet);
	}


	public static List<EObject> loadActivityexplorerResource(final URI activityExplorerURI, final ResourceSet resourceSet) {

		final Resource activityExplorerResource = loadResource(activityExplorerURI, resourceSet);

		if (!activityExplorerResource.getContents().isEmpty()){
			final EObject activityExplorerRoot = activityExplorerResource.getContents().get(0);
			return Lists.newArrayList(activityExplorerRoot);
		}
		return Collections.emptyList();
	}

	public static List<EObject> validateAndLoadActivityexplorerResource(final IFile file, final ResourceSet resourceSet){

		final URI activityExplorerURI = computeURI(file, FileExtension.ACTIVITYEXPLORER_EXTENSION);

		if (activityExplorerURI == null) {
			return Collections.emptyList();
		}

		return validateAndLoadActivityexplorerResource(activityExplorerURI, resourceSet);
	}


	public static List<EObject> validateAndLoadActivityexplorerResource(final URI activityExplorerURI, final ResourceSet resourceSet) {

		final Resource activityExplorerResource = loadResource(activityExplorerURI, resourceSet);

		if (!activityExplorerResource.getContents().isEmpty()){
			final EObject activityExplorerRoot = activityExplorerResource.getContents().get(0);
			final IFile file = getFileFromURI(activityExplorerURI);
			if (isValid(activityExplorerRoot)){
				setProperty(ResourcesPropertysConstants.syncQualifiedName, file, "true");
				return Lists.newArrayList(activityExplorerRoot);
			}
			setProperty(ResourcesPropertysConstants.syncQualifiedName, file, "false");
		}
		return Collections.emptyList();
	}

	/**
	 * Set the property propertyId of the resource to the boolean value
	 * @param propertyId must be not null
	 * @param resource must be not null
	 * @param value must be strings "true" or "false"
	 */
	public static void setProperty(final org.eclipse.core.runtime.QualifiedName propertyId, final IResource resource, final String value){
		if ((propertyId == null) ||
				(resource == null) || !resource.exists() ||
				(value == null) || value.isEmpty()){
			return;
		}

		try {
			resource.setPersistentProperty(propertyId, value);
			resource.refreshLocal(IResource.DEPTH_ZERO, new NullProgressMonitor());
		} catch (final CoreException e) {
			e.printStackTrace();
		}
	}

	public static boolean getProperty(final org.eclipse.core.runtime.QualifiedName propertyId, final IResource resource){
		try {
			final String prop = resource.getPersistentProperty(propertyId);
			if (prop != null) {
				return Boolean.valueOf(prop);
			}
		} catch (final CoreException e) {
			e.printStackTrace();
		}
		return true;
	}

	public static boolean getSyncProperty(final IResource resource){
		return getProperty(ResourcesPropertysConstants.syncQualifiedName, resource);
	}


	public static String getProjectName(final EObject object){
		return CoreModelHelper.getProjectName(object);
	}


	/**
	 * Get primary and secondary resources of the project which contains file
	 * @param file
	 * @return primary and secondary resources of project
	 */
	public static List<IResource> getAllResources(final IFile file){
		final List<IResource> resources = new ArrayList<IResource>();

		final List<IPath> secondaryResourcePaths = ResourceHelper.getAllResourcePaths(file);

		for (final IPath p : secondaryResourcePaths) {
			final IResource resource = ResourcesPlugin.getWorkspace().getRoot().getFile(p);
			if ((resource != null) && resource.exists()){
				resources.add(resource);
			}
		}

		return resources;
	}


	private static List<IPath> getAllResourcePaths(final IFile file) {

		final List<IPath> result = new ArrayList<IPath>();

		final IPath trimmed = file.getFullPath().removeFileExtension().removeFileExtension();
		//Primary
		IPath tmp = trimmed.addFileExtension(FileExtension.SPECIFICATION_EXTENSION);
		result.add(tmp);

		//Secondary resources
		tmp = trimmed.addFileExtension(FileExtension.DATA_EXTENSION);
		result.add(tmp);

		tmp = trimmed.addFileExtension(FileExtension.UI_EXTENSION);
		result.add(tmp);

		tmp = trimmed.addFileExtension(FileExtension.DIAGRAM_EXTENSION);
		result.add(tmp);

		tmp = trimmed.addFileExtension(FileExtension.ACTIVITYEXPLORER_EXTENSION);
		result.add(tmp);

		tmp = trimmed.addFileExtension(FileExtension.BUILD_EXTENSION);
		result.add(tmp);

		tmp = trimmed.addFileExtension(FileExtension.CONFIGURATION_EXTENSION);
		result.add(tmp);

		tmp = trimmed.addFileExtension(FileExtension.SERVICES_EXTENSION);
		result.add(tmp);

		tmp = trimmed.addFileExtension(FileExtension.RULES_EXTENSION);
		result.add(tmp);

		return result;
	}


	/**
	 * Copied from {@link org.polarsys.kitalpha.ad.common.utils.URIFix}
	 */
	public static class URIFix {

		public static URI createPlatformPluginURI(final String path, final boolean encode) {
			return createURI("platform:/plugin/", path);
		}

		public static URI createPlatformResourceURI(final String path, final boolean encode) {
			return createURI("platform:/resource/", path);
		}

		private static URI createURI(final String prefix, final String path) {
			String uri = prefix;
			if (path.startsWith("/")) {
				uri += path.substring(1);
			} else {
				uri += path;
			}
			return URI.createURI(uri);
		}
	}
}

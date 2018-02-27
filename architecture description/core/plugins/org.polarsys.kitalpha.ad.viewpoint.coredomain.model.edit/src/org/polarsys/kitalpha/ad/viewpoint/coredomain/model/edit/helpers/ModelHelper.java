/*******************************************************************************
 * Copyright (c) 2016, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.coredomain.model.edit.helpers;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.osgi.service.resolver.BundleSpecification;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.search.core.text.TextSearchEngine;
import org.eclipse.search.core.text.TextSearchRequestor;
import org.eclipse.search.core.text.TextSearchScope;
import org.eclipse.search.ui.text.FileTextSearchScope;
import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.ad.common.AD_Log;

/**
 * @author Thomas Guiu
 * 
 */
public class ModelHelper  {
	private String filePattern;

	public ModelHelper(EObject target, String filePattern) {
		this.filePattern = filePattern;
	}

	public static <S> Collection<S> getCandidates(EObject target, Class<S> candidate, String filePattern) {
		ResourceSet resourceSet = target.eResource().getResourceSet();
		List<S> result = new ArrayList<>();
		for (URI uri : getCandidateURIs(target, filePattern))
		{
			Resource resource = resourceSet.getResource(uri, true);
			for (EObject eobj : resource.getContents()) {
				if (candidate.isAssignableFrom(eobj.getClass()))
					result.add((S) eobj);
			}

		}
		return result;
	}
	public static Collection<URI> getCandidateURIs(EObject target, String filePattern) {
		ModelHelper helper = new ModelHelper(target, filePattern);
		String project = target.eResource().getURI().segment(1);
		IPluginModelBase model = PluginRegistry.findModel(project);
		if (model == null) {
			AD_Log.getDefault().logError("Cannot find plugin related to project "+project);
			return Collections.emptyList();
		}
		List<URI> ecoreUris = new ArrayList<>();
		final List<IProject> wsProjects = new ArrayList<>();
		final List<Bundle> pBundles = new ArrayList<>();

		helper.collectBundles(model, wsProjects, pBundles, new HashSet<String>(300));

		helper.collectFileInPlatform(pBundles, ecoreUris);
		helper.collectFileInWorkspace(wsProjects, ecoreUris);
		
		for (URI uri : ecoreUris.toArray(new URI[ecoreUris.size()]))
		{
			if (DiscardedModels.isFiltered(uri))
				ecoreUris.remove(uri);
		}

		return ecoreUris;
	}
	
	private void collectBundles(IPluginModelBase model, List<IProject> wsProjects, List<Bundle> pBundles, Set<String> visited) {
		String symbolicName = model.getBundleDescription().getSymbolicName();
		IResource underlyingResource = model.getUnderlyingResource();
		if (underlyingResource != null)
			wsProjects.add(underlyingResource.getProject());
		else {
			Bundle bundle = Platform.getBundle(symbolicName);
			pBundles.add(bundle);
		}

		visited.add(symbolicName);

		BundleDescription description = model.getBundleDescription();
		for (BundleSpecification req : description.getRequiredBundles()) {
			if (req.getSupplier() == null) {
				AD_Log.getDefault().logWarning("Cannot find plugin related to project "+req.getName());
				continue;
			}
			IPluginModelBase reqModel = PluginRegistry.findModel(req.getSupplier().getSupplier());
			symbolicName = reqModel.getBundleDescription().getSymbolicName();
			if (!visited.contains(symbolicName))
				collectBundles(reqModel, wsProjects, pBundles, visited);
		}

	}
	
	private void collectFileInPlatform(List<Bundle> pBundles, List<URI> fileUris) {
		for (Bundle bundle : pBundles) {
			Enumeration e = bundle.findEntries("/", filePattern, true);
			while (e != null && e.hasMoreElements()) {
				URL url = (URL) e.nextElement();
				String path = url.getPath();
				URI uri = URI.createPlatformPluginURI(bundle.getSymbolicName() + path, true);
				fileUris.add(uri);
			}
		}
	}

	private void collectFileInWorkspace(List<IProject> wsProjects, final List<URI> fileUris) {
		String[] fileNamePattern = new String[] { filePattern };
		TextSearchScope fScope = FileTextSearchScope.newSearchScope(wsProjects.toArray(new IResource[wsProjects.size()]), fileNamePattern, true);

		TextSearchRequestor requestor = new TextSearchRequestor() {
			@Override
			public boolean acceptFile(IFile file) throws CoreException {
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toPortableString(), true);
				fileUris.add(uri);
				return super.acceptFile(file);
			}
		};
		Pattern searchPattern = Pattern.compile("");
		TextSearchEngine.create().search(fScope, requestor, searchPattern, null);
	}


}

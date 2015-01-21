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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helper;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.registry.DataWorkspaceEPackage;

/**
 * 
 * @author Faycal Abka
 *
 */
public class URIConverterHelper {

	private final static ResourceSet rs = new ResourceSetImpl();
	private final static Map<String, URI> uriCache = new HashMap<String, URI>();

	/**
	 * PS: May be slow first time when it called.
	 * 
	 * @return Collection of platform URI of all EPackages
	 */
	public static Collection<String> getPlatformURIOfAllEPackages() {

		Collection<Object> packages = DataWorkspaceEPackage.INSTANCE.values();

		Collection<String> platformsNsURI = new HashSet<String>();

		for (Object pkg : packages) {
			EPackage ePackage = null;

			if (pkg instanceof EPackage) {
				ePackage = (EPackage) pkg;
			} else {
				if (pkg instanceof EPackage.Descriptor) {
					ePackage = ((EPackage.Descriptor) pkg).getEPackage();
				}
			}

			if (ePackage != null) {

				URI uri = EcoreUtil.getURI(ePackage);

				if (uri.isPlatformResource()) {
					platformsNsURI.add(uri.toString());
				} else {
					if (uriCache.containsKey(uri.toString())) {
						platformsNsURI.add(uriCache.get(uri.toString())
								.toString());
					} else {
						URI p = getPlatformURI(URI.createURI(ePackage
								.getNsURI()));
						if (p != null) {
							platformsNsURI.add(p.toString());
						}
					}
				}
			}
		}

		return platformsNsURI;
	}

	
	public static URI getPlatformURI(URI uri) {

		URI genmodelURI = EcorePlugin.getEPackageNsURIToGenModelLocationMap()
				.get(uri.toString());
		
		if (uriCache.containsKey(uri.toString()))
			return uriCache.get(uri.toString());
		
		boolean wasLoaded = false;

		if (genmodelURI != null) {

			Resource r = rs.createResource(genmodelURI);

			try {
				wasLoaded = r.isLoaded();
				if (!wasLoaded) {
					r.load(null);
					wasLoaded = true;
				}
			} catch (IOException e) {
			}

			EList<EObject> genContents = r.getContents();
			if (genContents != null && !genContents.isEmpty()) {
				EList<GenPackage> genmodels = ((GenModel) genContents.get(0))
						.getGenPackages();
				for (GenPackage genPackage : genmodels) {
					URI platformURI = genPackage.getEcorePackage().eResource()
							.getURI();
					uriCache.put(uri.toString(), platformURI);
					return platformURI;
				}
			}

			if (wasLoaded)
				r.unload();
		}
		return null;
	}
}

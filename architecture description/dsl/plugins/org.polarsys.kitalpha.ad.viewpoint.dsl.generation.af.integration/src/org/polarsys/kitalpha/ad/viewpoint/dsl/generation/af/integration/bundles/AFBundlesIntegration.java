/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.integration.bundles;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.integration.exception.AFIntegrationException;


/**
 * @author Boubekeur Zendagui
 */

public class AFBundlesIntegration {
	
	private static AFBundlesIntegration INSTANCE = null;
	
	/**
	 * This will be merged with the required-bundles of the manifest of the AF project.
	 */
	private List<String> bundles ;
	
	public AFBundlesIntegration() {
		bundles = new ArrayList<String>();
	}
	
	public static AFBundlesIntegration getInstance(){
		if (INSTANCE == null)
			INSTANCE = new AFBundlesIntegration();
		
		return INSTANCE;
	}
	
	
	public List<String> getRequiredBundles(){
		return this.bundles;
	}
	
	/**
	 * This methods allows to add a bundle id to the list of required bundle.
	 * @param bundleid
	 * @throws AFIntegrationException
	 */
	public void registerBundle(String bundleid) {
		if (! this.bundles.contains(bundleid))
			this.bundles.add(bundleid);
	}
	
	/**
	 * This methods allows to add a bundle id to the list of required bundle.
	 * This list will be merged with the required-bundles list of the af project manifest.
	 * @param eObject any object in a model
	 * @throws AFIntegrationException
	 */
	public void registerBundle(EObject eObject) throws AFIntegrationException{
		String bundleid = null;
		URI uri = null;
		// Get the resource of the eObject
		EObject rootContainer = EcoreUtil.getRootContainer(eObject, true);
		if (rootContainer != null)
			uri = rootContainer.eResource().getURI();
		else
			throw new AFIntegrationException(AFIntegrationException.Bundle);
		
		// get the bundle ID from the Resource URI
		if (uri != null)
			bundleid = uri.segment(1);
		else
			throw new AFIntegrationException(AFIntegrationException.Bundle);

		if (bundleid != null )
			registerBundle(bundleid);
		else
			throw new AFIntegrationException(AFIntegrationException.Bundle);
	}

}

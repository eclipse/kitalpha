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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.project;

import org.eclipse.emf.ecore.EPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.AbstractServicesElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.exception.ViewpointResourceException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resourceimpl.EcoreProviderImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resourceimpl.ViewpointResourceProviderRegistry;

/**
 * @author Boubekeur Zendagui
 */

public class AFModelUtils {

	/**
	 * Singleton variable
	 */
	private final static AFModelUtils instance_ = new AFModelUtils();

	/**
	 *
	 * Hiden default constructor
	 */
	private AFModelUtils() {
		// TODO: This is an auto generated constructor stub  
	}

	/**
	 *
	 *@return instance_
	 */
	public static AFModelUtils getInstance() {
		return instance_;
	}
	
	/**
	 * Allows to generate an ID for an {@link AbstractServicesElement}. The ID 
	 * format is [generated EPackage name].[AbstractServicesElement name]
	 * @param abstractServicesElement
	 * @return String id.
	 * @throws ViewpointResourceException 
	 */
	public String generateAFElementID(AbstractServicesElement abstractServicesElement) throws ViewpointResourceException{
		String result = "";
		EcoreProviderImpl ecoreProvider = ViewpointResourceProviderRegistry.getInstance().getEcoreProvider();
		if (ecoreProvider != null)
		{
			EPackage ePackage = ecoreProvider.getEPackage();
			if (ePackage != null) {
				result = ePackage.getName().trim();
			}
		}
		
		return result + "." + abstractServicesElement.getName();
	}
}

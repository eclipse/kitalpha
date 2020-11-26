/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resourceimpl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.exception.ViewpointResourceException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resource.AbstractCoreResourceProvider;

/**
 * @author Boubekeur Zendagui
 */

public class EcoreProviderImpl extends AbstractCoreResourceProvider{
	
	/**
	 * @return The generated EPackage
	 * @throws ViewpointResourceException
	 */
	public EPackage getEPackage() throws ViewpointResourceException{
		EPackage ePackage = null;

		EObject rootElement = getRootElement();
		if (rootElement != null)
			ePackage = (EPackage) rootElement;

		return ePackage;
	}
	
}

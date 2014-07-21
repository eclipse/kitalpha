/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
		EPackage ePackage_ = null;

		EObject rootElement = getRootElement();
		if (rootElement != null)
			ePackage_ = (EPackage) rootElement;

		return ePackage_;
	}
	
}

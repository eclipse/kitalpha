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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.utils;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.validation.model.IClientSelector;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * @author Boubekeur Zendagui
 */

public class ClientContextSelector implements IClientSelector {

	public static boolean isRunning = false;

	/**
	 * @see org.eclipse.emf.validation.model.IClientSelector#selects(java.lang.Object)
	 */
	@Override
	public boolean selects(Object arg0) {
		if (arg0 == null || !(arg0 instanceof EObject)) {
			return false;
		}
		
		EObject eObject = (EObject)arg0;
		Resource eResource = eObject.eResource();
		if (eResource != null)
		{// Check if the root element of the resource is a Viewpoint object
			EList<EObject> resourceContent = eResource.getContents();
			if (resourceContent != null && !resourceContent.isEmpty()) {
				return resourceContent.get(0) instanceof Viewpoint;
			}
			return false;
		}
		else
		{// Try to get the root container object.
		 // This case is not a default one because each viewpoint object is attached to a resource.
			EObject rootContainer = EcoreUtil.getRootContainer(eObject);
			return rootContainer != null && rootContainer instanceof Viewpoint;
		}
	}

}

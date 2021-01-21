/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/


package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.validation;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.validation.model.IClientSelector;


/**
 * 
 * @author Faycal Abka
 *
 */
public abstract class AbstractContextSelector implements IClientSelector {

	@Override
	public abstract boolean selects(Object arg0);
	
	
	protected EObject validateAndGetAspect(Object object){
		if (object != null && object instanceof EObject){
			EObject eObject = (EObject)object;
			Resource resource = eObject.eResource();
			if (resource != null){
				List<EObject> resourceContent = resource.getContents();
				if (resourceContent != null && resourceContent.size() > 0) {
					return resourceContent.get(0);
				}
			}
		}
		return null;
	}

}

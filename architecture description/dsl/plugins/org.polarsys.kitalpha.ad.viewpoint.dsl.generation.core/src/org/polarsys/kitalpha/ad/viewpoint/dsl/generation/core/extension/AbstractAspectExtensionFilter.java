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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.core.extension;

import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * @author Boubekeur Zendagui
 *
 */
public abstract class AbstractAspectExtensionFilter implements IExtensionFilter {

	/**
	 * Implementation of this method check if the current generation accept to 
	 * generate an {@link Aspect}.
	 *   
	 * @param aspect an {@link Aspect}
	 * @return True if the generator accept to generate an aspect. False else.
	 */
	public abstract boolean acceptAspect(Aspect aspect);
	
	/**
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.core.extension.IExtensionFilter#accept(java.lang.Object)
	 */
	@Override
	public boolean accept(Object model) {
		Viewpoint viewpoint = null;
		
		if (model instanceof Viewpoint)
			viewpoint = (Viewpoint) model;
		
		if (model instanceof EMFDomain)
		{
			EMFDomain domainModel = (EMFDomain) model;
			ResourceSet rSet = new ResourceSetImpl();
			Resource domainResource = rSet.getResource(domainModel.getUri(), true);
			if (! domainResource.getContents().isEmpty())
				viewpoint = (Viewpoint) domainResource.getContents().get(0);
		}
		
		if (viewpoint != null)
		{
			for (Aspect aspect : viewpoint.getVP_Aspects()) 
			{
				boolean accept = acceptAspect(aspect);
				if (accept)
					return true;
			}
		}
		
		return false;
	}

}

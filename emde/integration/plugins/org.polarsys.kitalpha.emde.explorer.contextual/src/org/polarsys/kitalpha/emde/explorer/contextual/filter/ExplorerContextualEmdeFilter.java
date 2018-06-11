/******************************************************************************
 * Copyright (c) 2015, 2018 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *****************************************************************************/
package org.polarsys.kitalpha.emde.explorer.contextual.filter;

import org.eclipse.amalgam.explorer.contextual.core.filter.ICandidateElementFilter;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;

/**
 * This class implements a filter that accept Emde Element if their ecore model is active.
 * @author Boubekeur Zendagui
 */
public class ExplorerContextualEmdeFilter implements ICandidateElementFilter {

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.amalgam.explorer.contextual.core.filter.ICandidateElementFilter#select(java.lang.Object)
	 */
	@Override
	public boolean select(Object object) {
		// TODO check if the model containing the object is extensible
		return true;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.amalgam.explorer.contextual.core.filter.ICandidateElementFilter#accept(java.lang.Object)
	 */
	@Override
	public boolean accept(Object object) {
		if (object instanceof EObject)
		{
			return ! ModelExtensionHelper.getInstance((EObject)object).isExtensionModelDisabled(object);
		}
		return false;
	}

}

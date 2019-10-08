/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.core.helper;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

/**
 * A EObject label provider helper, providing some utility methods.
 * 
 * @author Sandu Postaru
 *
 */
public class EObjectLabelProviderHelper {

	private EObjectLabelProviderHelper() {
		// Exists only to defeat instantiation.
	}

	/**
	 * Get the generated item provider for given object.
	 * 
	 * @param object
	 * @return<code>null</code> if one of parameters is <code>null</code> or if
	 *                          no provider is found.
	 */
	public static IItemLabelProvider getItemLabelProvider(EObject object) {
		// Precondition.
		if (null == object) {
			return null;
		}
		AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) AdapterFactoryEditingDomain
				.getEditingDomainFor(object);				
		
		// Precondition.
		if (null == editingDomain) {
			return null;
		}
		return (IItemLabelProvider) editingDomain.getAdapterFactory().adapt(object, IItemLabelProvider.class);
	}
}

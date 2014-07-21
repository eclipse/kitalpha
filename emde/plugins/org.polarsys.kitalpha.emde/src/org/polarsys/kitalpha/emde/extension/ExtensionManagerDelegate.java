/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.emde.extension;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

/**
 * @author Thomas Guiu
 *
 */
public abstract class ExtensionManagerDelegate {
	protected final Set<String> managedNsUris = new HashSet<String>();

	public Set<String> getManagedNsUris() {
		return managedNsUris;
	}

	public abstract Boolean isExtensionModelDisabled(EObject eObject);
}

/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.extension;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * @author Thomas Guiu
 * 
 */
public interface ModelExtensionManager {
	boolean isExtensionModelDisabled(String extensibleModel, String extendedModel);

	boolean canDisableExtensionModel(ExtendedModel extended);

	boolean isExtensionModelDisabled(ExtendedModel extended);

	boolean isExtensionModelDisabled(Object object);

	boolean isExtensionModelDisabled(EObject eObject);

	void setExtensionModelDisabled(ExtensibleModel extensibleModel, ExtendedModel extendedModel, boolean disabled);

	List<ExtensionManagerDelegate> getDelegates();

	void addListener(ModelExtensionListener l);

	void removeListener(ModelExtensionListener l);

}

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

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
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

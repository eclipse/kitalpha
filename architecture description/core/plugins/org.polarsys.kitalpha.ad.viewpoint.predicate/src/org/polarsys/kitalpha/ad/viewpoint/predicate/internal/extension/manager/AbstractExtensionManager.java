/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.predicate.internal.extension.manager;

import java.util.function.Function;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

/**
 * Abstract class for managing extension points
 * 
 * @author Faycal Abka
 *
 */
public abstract class AbstractExtensionManager {
	/**
	 * Returns a configuration element for extension point ID
	 */
	protected Function<String, IConfigurationElement[]> getExtensionFor = id -> Platform.getExtensionRegistry().getConfigurationElementsFor(id);
}

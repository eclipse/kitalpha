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

/**
 * @author Boubekeur Zendagui
 *
 */
public interface IExtensionFilter {

	/**
	 * @param model an {@link Object} that can be an Aspect, a Resource or an EMFDomain
	 * @return True if the core generation extension accept to be triggered.
	 */
	public boolean accept(Object model);
}

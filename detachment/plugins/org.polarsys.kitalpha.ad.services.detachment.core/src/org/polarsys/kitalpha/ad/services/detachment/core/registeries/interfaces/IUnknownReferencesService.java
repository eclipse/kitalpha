/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.services.detachment.core.registeries.interfaces;

/**
 * Unified interface for finding and cleaning unknown references
 * It used by contributors to perform the detachment of unknown references
 * 
 * @author Faycal Abka
 * @param <T> type to process
 */
public interface IUnknownReferencesService<T> extends ICleaner, IFinder<T> {
	public void dispose();
}

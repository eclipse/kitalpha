/*******************************************************************************
 * Copyright (c) 2015, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.activityexplorer.internal;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.Page;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.PredicateElement;


/**
 * @author Boubekeur Zendagui
 */
public class PredicateHelper {

	public static boolean generatePredicate(PredicateElement element) {
		if (element instanceof Page)
		{
			Page page = (Page) element;
			final String fileExtensions = page.getFileExtensions();
			return  element.isHasPredicate() || (fileExtensions != null && !fileExtensions.isEmpty());
		} else {
			return  element.isHasPredicate();
		}
	}
}

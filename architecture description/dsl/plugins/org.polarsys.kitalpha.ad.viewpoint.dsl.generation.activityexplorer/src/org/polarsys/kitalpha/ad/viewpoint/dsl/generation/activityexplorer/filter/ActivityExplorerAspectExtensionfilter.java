/*******************************************************************************
 * Copyright (c) 2014, 2017 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.activityexplorer.filter;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.core.extension.AbstractAspectExtensionFilter;

/**
 * @author Boubekeur Zendagui
 */
public class ActivityExplorerAspectExtensionfilter extends AbstractAspectExtensionFilter {

	public ActivityExplorerAspectExtensionfilter() {
	}

	@Override
	public boolean acceptAspect(Aspect aspect) {
		return aspect instanceof ViewpointActivityExplorer;
	}

}

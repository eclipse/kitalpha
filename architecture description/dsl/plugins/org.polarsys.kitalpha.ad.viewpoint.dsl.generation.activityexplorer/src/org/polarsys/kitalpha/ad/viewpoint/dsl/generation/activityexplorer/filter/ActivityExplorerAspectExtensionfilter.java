/*******************************************************************************
 * Copyright (c) 2014, 2017 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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

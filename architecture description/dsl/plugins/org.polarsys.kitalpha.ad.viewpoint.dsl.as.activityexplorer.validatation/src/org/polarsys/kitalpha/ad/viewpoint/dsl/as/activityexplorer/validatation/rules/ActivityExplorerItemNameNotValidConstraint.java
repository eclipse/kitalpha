/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.validatation.rules;

import java.util.List;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExplorerItem;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ICoreConstraintContribution;

/**
 * @author Boubekeur Zendagui
 */
public class ActivityExplorerItemNameNotValidConstraint implements ICoreConstraintContribution {

	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof ActivityExplorerItem;
	}

	@Override
	public List<String> brothersEStructuralFeatures() {
		return null;
	}

}

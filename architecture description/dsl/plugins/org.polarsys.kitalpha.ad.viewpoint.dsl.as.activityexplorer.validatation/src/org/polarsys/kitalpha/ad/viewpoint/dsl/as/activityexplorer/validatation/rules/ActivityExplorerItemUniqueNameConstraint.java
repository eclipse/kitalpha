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

import java.util.ArrayList;
import java.util.List;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Section;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ICoreConstraintContribution;

/**
 * <p>
 * This constraint check name uniqueness of Page and Section.
 * </p>
 * <p>
 * The Activity name uniqueness is implemented in an other constraint (see {@link ActivityUniqueNameConstraint})
 * </p>
 * 
 * @author Boubekeur Zendagui
 */
public class ActivityExplorerItemUniqueNameConstraint implements ICoreConstraintContribution {

	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof Page || object instanceof Section;
	}

	@Override
	public List<String> brothersEStructuralFeatures() {
		List<String> result = new ArrayList<String>();
		result.add("ownedPages");
		result.add("ownedSections");
		return result;
	}

}

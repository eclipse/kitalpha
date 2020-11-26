/*******************************************************************************
 * Copyright (c) 2015, 2017 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.validatation.rules;

import java.util.ArrayList;
import java.util.List;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.Page;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.Section;
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

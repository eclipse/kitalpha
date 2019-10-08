/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.validation.name;

import java.util.ArrayList;
import java.util.List;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ICoreConstraintContribution;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Create;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Delete;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Drop;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.OpenAction;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ReconnectEdge;

/**
 * @author Boubekeur Zendagui
 */

public class ToolsUniqueNameconstraint implements ICoreConstraintContribution {

	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof Create
				|| object instanceof Delete
				|| object instanceof Drop
				|| object instanceof ReconnectEdge
				|| object instanceof OpenAction;
	}

	@Override
	public List<String> brothersEStructuralFeatures() {
		List<String> result = new ArrayList<String>();
		result.add("actions");
		result.add("openActions");
		return result;
	}

}

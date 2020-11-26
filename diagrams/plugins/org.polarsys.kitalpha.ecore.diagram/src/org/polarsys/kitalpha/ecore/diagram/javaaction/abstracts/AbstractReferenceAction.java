/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ecore.diagram.javaaction.abstracts;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.sirius.diagram.DEdge;
import org.polarsys.kitalpha.ecore.diagram.javaaction.abstracts.AbstractDDiagramElementAction;

public abstract class AbstractReferenceAction extends AbstractDDiagramElementAction {

	@Override
	protected Collection<DEdge> filter(Collection<DEdge> collection) {
		Collection<DEdge> result = new ArrayList<DEdge>();
		for (DEdge d : collection) {
			if (d.getTarget() instanceof EReference) {
				result.add(d);
			}
		}
		return result;
	}

}

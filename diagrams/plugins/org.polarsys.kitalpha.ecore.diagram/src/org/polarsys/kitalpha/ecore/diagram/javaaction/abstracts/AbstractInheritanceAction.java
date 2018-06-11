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

package org.polarsys.kitalpha.ecore.diagram.javaaction.abstracts;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.sirius.diagram.DEdge;
import org.polarsys.kitalpha.ecore.diagram.javaaction.abstracts.AbstractDDiagramElementAction;

public abstract class AbstractInheritanceAction extends AbstractDDiagramElementAction {
	@Override
	protected Collection<DEdge> filter(Collection<DEdge> collection) {
		Collection<DEdge> result = new ArrayList<DEdge>();
		for (DEdge d : collection) 
		{
			if (d.getTarget() instanceof EClass) {
				result.add(d);
			}
		}
		return result;
	}
}

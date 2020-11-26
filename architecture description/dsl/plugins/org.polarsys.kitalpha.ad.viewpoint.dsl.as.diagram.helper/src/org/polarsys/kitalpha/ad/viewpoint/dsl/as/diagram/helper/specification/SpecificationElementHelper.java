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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.helper.specification;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Delete;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Drop;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Edge;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeImport;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.MappingSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ReconnectEdge;

/**
 * @author Boubekeur Zendagui
 */

public class SpecificationElementHelper {

	/**
	 * @param action : a new action added to ActionSet. an Action type can be one of the following types :
	 * 					1- Create
	 * 					2- Delete
	 * 					3- Drop
	 * 					4- ReconnectEdge
	 * 					5- OpenAction
	 * @param eObject
	 * @return True if the element can be created. False else
	 */
	public static boolean acceptElement(Object action, Object eObject) {
		if (action instanceof ReconnectEdge || action instanceof Delete) 
		{
			if (!(eObject instanceof Edge))
				return false;
		} 
		else 
		{
			if (action instanceof Drop) 
				if (eObject instanceof EObject && ((EObject) eObject).eContainer() instanceof MappingSet)
					return false;

			if (eObject instanceof Container && ((Container) eObject).getImports() != null)
				return false;

			if (eObject instanceof Node && ((Node) eObject).getImports() != null)
				return false;

			if (eObject instanceof EdgeImport)
				return false;
		}
		return true;
	}
}

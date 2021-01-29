/******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *****************************************************************************/

package org.polarsys.kitalpha.explorer.contextual.examples.ecore.queries;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.explorer.contextual.core.query.IQuery;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

/**
 * @author Boubekeur Zendagui
 */
public class EClassInheritedAttributesQuery implements IQuery {

	@Override
	public List<Object> compute(Object object_p) {
		List<Object> result = new ArrayList<Object>();
		if (object_p instanceof EClass)
		{
			EClass eClass = (EClass) object_p;
			EList<EAttribute> eReferences = eClass.getEAttributes();
			EList<EAttribute> eAllReferences = eClass.getEAllAttributes();
			result.addAll(eAllReferences);
			result.removeAll(eReferences);
		}
		return result;
	}

}

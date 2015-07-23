/******************************************************************************
 * Copyright (c) 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *****************************************************************************/
package org.polarsys.kitalpha.vp.componentsample.explorer.contextual.queries;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.explorer.contextual.core.query.IQuery;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.AbstractComponent;

/**
 * @author Boubekeur Zendagui
 */
public class UsingComponentQuery implements IQuery {

	@Override
	public List<Object> compute(Object object_p) {
		List<Object> result = new ArrayList<Object>();
		if (object_p instanceof AbstractComponent)
		{
			AbstractComponent ac = (AbstractComponent) object_p;
			EObject rootContainer = EcoreUtil.getRootContainer(ac);
			TreeIterator<EObject> eAllContents = rootContainer.eAllContents();
			while (eAllContents.hasNext()) {
				EObject eObject = (EObject) eAllContents.next();
				
				if (eObject instanceof AbstractComponent)
				{
					if (((AbstractComponent) eObject).getUse().contains(ac))
						result.add(eObject);
				}
			}
		}
		return result;
	}

}

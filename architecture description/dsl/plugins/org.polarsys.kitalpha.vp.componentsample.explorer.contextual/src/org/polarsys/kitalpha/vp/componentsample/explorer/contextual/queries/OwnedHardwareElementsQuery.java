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
import org.eclipse.emf.common.util.EList;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.AbstractComponent;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.HardwareComponent;

/**
 * @author Boubekeur Zendagui
 */
public class OwnedHardwareElementsQuery implements IQuery {

	@Override
	public List<Object> compute(Object object_p) {
		List<Object> result = new ArrayList<Object>();
		if (object_p instanceof HardwareComponent)
		{
			EList<AbstractComponent> abstractComponent = ((HardwareComponent) object_p).getAbstractComponent();
			for (AbstractComponent abstractComponent2 : abstractComponent) 
			{
				if (abstractComponent2 instanceof HardwareComponent)
				{
					result.add(abstractComponent2);
				}
			}
		}
		return result;
	}

}

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
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.HardwareComponent;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.SoftwareComponent;

/**
 * @author Boubekeur Zendagui
 */
public class EContentQuery implements IQuery{

	@Override
	public List<Object> compute(Object object_p) {
		List<Object> result = new ArrayList<Object>();
		
		if (object_p instanceof EObject)
		{
			for (Object object : ((EObject) object_p).eContents()) 
			{
				if (object instanceof HardwareComponent == false && object instanceof SoftwareComponent == false )
					result.add(object);
			}
		}
		
		return result;
	}

}

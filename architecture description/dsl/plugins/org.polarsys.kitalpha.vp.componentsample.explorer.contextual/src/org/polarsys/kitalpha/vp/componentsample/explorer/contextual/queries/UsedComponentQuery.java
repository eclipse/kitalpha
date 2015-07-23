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

import java.util.List;

import org.eclipse.amalgam.explorer.contextual.core.query.IQuery;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.AbstractComponent;

/**
 * @author Boubekeur Zendagui
 */
public class UsedComponentQuery implements IQuery {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Object> compute(Object object_p) {
		
		if (object_p instanceof AbstractComponent)
		{
			return (List)((AbstractComponent) object_p).getUse();
		}
		return null;
	}

}

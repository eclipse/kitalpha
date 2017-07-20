/*******************************************************************************
 * Copyright (c)  2017 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.vp.componentsample.ui.filters;
import org.eclipse.jface.viewers.IFilter;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ComponentSampleDescriptionFilter implements IFilter {

	@Override
	public boolean select(Object toTest) {
		return toTest instanceof ComponentElement;
	}

}

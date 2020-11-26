/*******************************************************************************
 * Copyright (c) , 2020 2017 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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

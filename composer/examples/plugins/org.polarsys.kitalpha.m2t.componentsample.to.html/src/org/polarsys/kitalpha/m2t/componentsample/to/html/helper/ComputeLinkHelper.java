/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.m2t.componentsample.to.html.helper;

import org.polarsys.kitalpha.vp.componentsample.ComponentSample.AbstractComponent;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ComputeLinkHelper {
	
	//Many files strategy
	public static String computeLink(AbstractComponent c) {
		return c.getName() + ".html";
	}

	//one file strategy
	public static String computeSingleLink(AbstractComponent c) {
		return "#" + c.getName().replaceAll(" ", "_");
	}
}

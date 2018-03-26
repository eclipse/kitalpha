/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.integration.rules;

import java.util.Arrays;

/**
 * @author Thomas Guiu
 * 
 */
public class ElementDescriptor {
	public final String name;
	public final String implementation;
	public final String provider;

	public ElementDescriptor(String name, String implementation, String provider) {
		super();
		this.name = name;
		this.implementation = implementation;
		this.provider = provider;
	}

	public static String getImplementation(ElementDescriptor[] descriptors, String name) {
		for (ElementDescriptor desc : descriptors) {
			if (desc.name.equals(name)){
				return desc.implementation;
			}
		}
		return null;
	}

	public static String getName(ElementDescriptor[] descriptors, String implementation) {
		for (ElementDescriptor desc : descriptors) {
			if (desc.implementation.equals(implementation)){
				return desc.name;
			}
		}
		return null;
	}

	public static String[] getNames(ElementDescriptor[] descriptors) {
		String[] names = new String[descriptors.length];
		for (int i = 0; i < descriptors.length; i++) {
			names[i] = descriptors[i].name;
		}
		Arrays.sort(names);
		return names;
	}
}

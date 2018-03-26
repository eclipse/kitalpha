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

package org.polarsys.kitalpha.ad.viewpoint.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IElementHandler;

/**
 * @author Thomas Guiu
 * 
 */
public class ElementHelper {
	public static String computeNewId(IElementHandler handler, String radix) {
		List<String> values = ElementHelper.getIds(handler);
		return computeUniqueValue(values, radix);
	}

	public static String computeNewName(IElementHandler handler, String radix) {
		List<String> names = ElementHelper.getNames(handler);
		return computeUniqueValue(names, radix);
	}

	private static String computeUniqueValue(List<String> names, String radix) {
		int nb = 1;
		String candidate = radix;
		while (names.contains(candidate)) {
			candidate = radix + nb;
			nb++;
		}
		return candidate;
	}

	public static List<String> getNamesFromParents(IElementHandler handler) {
		Set<String> set = new HashSet<String>();
		for (ViewpointElement elt : handler.getElementsFromParents()) {
			String name = elt.getName();
			if (name != null){
				set.add(name);
			}
		}
		return getAsSortedList(set);
	}

	private static List<String> getAsSortedList(Set<String> set) {
		ArrayList<String> result = new ArrayList<String>(set);
		Collections.sort(result);
		return result;
	}

	public static List<String> getNames(IElementHandler handler) {
		Set<String> set = new HashSet<String>();
		for (ViewpointElement elt : handler.getElements()) {
			String name = elt.getName();
			if (name != null){
				set.add(name);
			}
		}
		return getAsSortedList(set);
	}

	public static List<String> getIds(IElementHandler handler) {
		Set<String> set = new HashSet<String>();
		for (ViewpointElement elt : handler.getElements()) {
			String id = elt.getId();
			if (id != null){
				set.add(id);
			}
		}
		return getAsSortedList(set);
	}

	public static List<String> getIdsFromParents(IElementHandler handler) {
		Set<String> set = new HashSet<String>();
		for (ViewpointElement elt : handler.getElementsFromParents()) {
			String id = elt.getId();
			if (id != null){
				set.add(id);
			}
		}
		return getAsSortedList(set);
	}

	private ElementHelper() {
		super();
	}
	
}

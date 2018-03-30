/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.ecore.helpers;

import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.ConcurrentHashMap;

public class WorkingSetHelper {
	private static final String SPACE = " ";
	private static Map<String, String> workingSetMap = new ConcurrentHashMap<String, String>();

	public static String getWorkingSet(String ecoreFileName) {
		return workingSetMap.get(ecoreFileName);
	}

	public static void registryWorkingSet(String ecoreFileName,
			String workingSet) {
		synchronized (workingSetMap) {
			String currentWorkingSet = workingSetMap.get(ecoreFileName);
			if (currentWorkingSet == null || currentWorkingSet.length() == 0) {
				workingSetMap.put(ecoreFileName, workingSet);
			} else {
				StringTokenizer stringTokenizer = new StringTokenizer(
						workingSet);
				StringBuilder builder = new StringBuilder();
				builder.append(currentWorkingSet);
				builder.append(SPACE);
				while (stringTokenizer.hasMoreTokens()) {
					String ecorePath = stringTokenizer.nextToken();
					if (!currentWorkingSet.contains(ecorePath)) {
						builder.append(ecorePath);
						builder.append(SPACE);
					}
				}
				workingSetMap.put(ecoreFileName, builder.toString());
			}
		}
	}

	public static void clearWorkingSet(String ecoreFileName) {
		workingSetMap.remove(ecoreFileName);
	}
}

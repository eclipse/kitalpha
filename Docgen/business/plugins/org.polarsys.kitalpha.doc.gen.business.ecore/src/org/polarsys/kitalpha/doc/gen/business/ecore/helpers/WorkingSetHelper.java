/*******************************************************************************
 * Copyright (c) Thales Corporate Services S.A.S, 2009.
 *******************************************************************************/
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
					if (currentWorkingSet.contains(ecorePath) == false) {
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

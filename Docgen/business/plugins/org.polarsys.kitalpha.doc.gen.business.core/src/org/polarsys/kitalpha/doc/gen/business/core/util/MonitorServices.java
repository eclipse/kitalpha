/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.util;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * 
 * @author Florian Barbin
 * 
 */
public class MonitorServices {

	private static IProgressMonitor monitor;
	private static int initTotalWork = 0;
	private static int currentCount = 0;

	/**
	 * Hidden constructor
	 */
	private MonitorServices(){
	}
	
	public static void initMonitor(IProgressMonitor parent) {
		monitor = parent;
	}

	public static void init(int totalWork) {
		initTotalWork = totalWork;
		currentCount = 0;
	}

	public static void dispose() {
		monitor = null;
		initTotalWork = 0;
		currentCount = 0;
	}

	public static void workSubMonitor(String taskName) {
		currentCount++;
		StringBuilder buffer = new StringBuilder();
		buffer.append(taskName);
		buffer.append(" - ");
		buffer.append(currentCount);
		if (currentCount < initTotalWork) {
			buffer
					.append("/"
							+ initTotalWork
							+ " ("
							+ Math.round((Integer.valueOf(currentCount)
									.floatValue() / Integer.valueOf(
									initTotalWork).floatValue()) * 100) + "%)");

		}
		monitor.subTask(buffer.toString());
	}

	public static void addTotalCount(int i) {
		initTotalWork += i;

	}
	
	public static void resetCurrentCount() {
		currentCount = 0;
	}
}

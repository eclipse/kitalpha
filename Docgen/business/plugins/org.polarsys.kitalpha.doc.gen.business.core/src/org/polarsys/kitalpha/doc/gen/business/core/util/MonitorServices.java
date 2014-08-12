/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
		// if ((currentCount < initTotalWork) || initTotalWork == 0) {
		currentCount++;
		StringBuffer buffer = new StringBuffer();
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
		// }
	}

	public static void addTotalCount(int i) {
		initTotalWork += i;

	}
	
	public static void resetCurrentCount() {
		currentCount = 0;
	}
}

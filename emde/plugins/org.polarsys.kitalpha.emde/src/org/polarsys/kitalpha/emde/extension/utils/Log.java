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
 *******************************************************************************/
package org.polarsys.kitalpha.emde.extension.utils;

import org.polarsys.kitalpha.report.utils.ReportFactory;

/**
 * @author Thomas Guiu
 * 
 */
public class Log {

	public static final ReportFactory RUNTIME = new ReportFactory("eMDE runtime");
	public static final ReportFactory GENERATION = new ReportFactory("eMDE generation");
	public static final String[] IDS = new String[] { RUNTIME.getListId(), GENERATION.getListId() };

	public static ReportFactory getDefault() {
		return RUNTIME;
	}

}

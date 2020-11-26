/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.common;

import org.polarsys.kitalpha.report.utils.ReportFactory;

/**
 * @author Thomas Guiu
 * 
 */
public class AD_Log {

	public static final ReportFactory RUNTIME = new ReportFactory("AF runtime");
	protected static final String[] IDS = new String[] { RUNTIME.getListId() };

	public static ReportFactory getDefault() {
		return RUNTIME;
	}

	private AD_Log() {
		super();
		
	}

}

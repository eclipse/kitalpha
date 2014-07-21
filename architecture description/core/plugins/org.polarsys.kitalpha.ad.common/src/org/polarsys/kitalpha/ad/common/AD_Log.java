/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
	public static final String[] IDS = new String[] { RUNTIME.getListId() };

	public static ReportFactory getDefault() {
		return RUNTIME;
	}

}

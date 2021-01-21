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

package org.polarsys.kitalpha.report.utils;

import org.polarsys.kitalpha.report.model.Severity;

/**
 * @author Thomas Guiu
 * 
 */
public class SeverityFactory extends AbstractSeverityFactory {

	public static final SeverityFactory INSTANCE = new SeverityFactory();
	
	private SeverityFactory() {
		super();
		contributed.add(createDebug());
		contributed.add(createInfo());
		contributed.add(createWarning());
		contributed.add(createError());
	}

	public Severity createDebug() {
		return createSeverity(4000, "Debug");
	}

	public Severity createInfo() {
		return createSeverity(3000, "Info");
	}

	public Severity createWarning() {
		return createSeverity(2000, "Warning");
	}

	public Severity createError() {
		return createSeverity(1000, "Error");
	}

}

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

package org.polarsys.kitalpha.report.utils;

import org.polarsys.kitalpha.report.model.Severity;

/**
 * @author Thomas Guiu
 * 
 */
public class SeverityFactory extends AbstractSeverityFactory {

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

	public static final SeverityFactory INSTANCE = new SeverityFactory();
}

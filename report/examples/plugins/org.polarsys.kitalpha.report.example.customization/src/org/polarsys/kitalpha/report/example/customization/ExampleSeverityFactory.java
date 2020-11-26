/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.report.example.customization;

import org.polarsys.kitalpha.report.model.Severity;
import org.polarsys.kitalpha.report.utils.AbstractSeverityFactory;

/**
 * @author Thomas Guiu
 * 
 */
public class ExampleSeverityFactory extends AbstractSeverityFactory {

	public static final ExampleSeverityFactory INSTANCE = new ExampleSeverityFactory();
	
	private ExampleSeverityFactory() {
		super();
		contributed.add(createFatalError());
	}

	public Severity createFatalError() {
		return createSeverity(400, "Fatal Error");
	}


}

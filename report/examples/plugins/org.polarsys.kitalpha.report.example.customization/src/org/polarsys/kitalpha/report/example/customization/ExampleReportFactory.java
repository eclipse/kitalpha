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

package org.polarsys.kitalpha.report.example.customization;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.report.example.customization.model.CustomEntry;
import org.polarsys.kitalpha.report.example.customization.model.CustomizationFactory;
import org.polarsys.kitalpha.report.model.LogEntry;
import org.polarsys.kitalpha.report.utils.AbstractReportFactory;
import org.polarsys.kitalpha.report.utils.SeverityFactory;

/**
 * @author Thomas Guiu
 * 
 */
public class ExampleReportFactory extends AbstractReportFactory {

	public LogEntry logFatalError(String message, String comment, EObject reference) {
		CustomEntry entry = CustomizationFactory.eINSTANCE.createCustomEntry();
		entry.setComment(comment);
		return log(entry, ExampleSeverityFactory.INSTANCE.createFatalError(), message, reference);
	}

	public LogEntry logWarning(String message, EObject reference) {
		CustomEntry entry = CustomizationFactory.eINSTANCE.createCustomEntry();
		return log(entry, SeverityFactory.INSTANCE.createWarning(), message, reference);
	}

	public ExampleReportFactory(String listId) {
		super(listId);
	}

	public static final ExampleReportFactory INSTANCE = new ExampleReportFactory("custom.report.example.list");

}

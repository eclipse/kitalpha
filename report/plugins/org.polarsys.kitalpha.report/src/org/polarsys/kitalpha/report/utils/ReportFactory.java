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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.report.model.LogEntry;
import org.polarsys.kitalpha.report.model.Severity;

/**
 * @author Thomas Guiu
 * 
 */
public class ReportFactory extends AbstractReportFactory {

	public LogEntry log(IStatus status) {
		Severity sev = SeverityFactory.INSTANCE.createInfo();
		if (status.getSeverity() == IStatus.ERROR)
			sev = SeverityFactory.INSTANCE.createError();
		else if (status.getSeverity() == IStatus.WARNING)
			sev = SeverityFactory.INSTANCE.createWarning();
		return log(sev, toString(status.getMessage(), status.getException()), null);
	}

	public LogEntry logError(Throwable th) {
		return log(SeverityFactory.INSTANCE.createError(), toString(null, th), null);
	}

	public LogEntry logError(String message, Throwable th) {
		return log(SeverityFactory.INSTANCE.createError(), toString(message, th), null);
	}

	public LogEntry logError(String message) {
		return log(SeverityFactory.INSTANCE.createError(), message, null);
	}

	public LogEntry logError(String message, EObject reference) {
		return log(SeverityFactory.INSTANCE.createError(), message, reference);
	}

	public LogEntry logError(String message, Throwable th, EObject reference) {
		return log(SeverityFactory.INSTANCE.createError(), toString(message, th), reference);
	}

	public LogEntry logWarning(Throwable th) {
		return log(SeverityFactory.INSTANCE.createWarning(), toString(null, th), null);
	}

	public LogEntry logWarning(String message) {
		return log(SeverityFactory.INSTANCE.createWarning(), message, null);
	}

	public LogEntry logWarning(String message, Throwable th) {
		return log(SeverityFactory.INSTANCE.createWarning(), toString(message, th), null);
	}

	public LogEntry logWarning(String message, EObject reference) {
		return log(SeverityFactory.INSTANCE.createWarning(), message, reference);
	}

	public LogEntry logWarning(String message, Throwable th, EObject reference) {
		return log(SeverityFactory.INSTANCE.createWarning(), toString(message, th), reference);
	}

	public LogEntry logDebug(Throwable th) {
		return log(SeverityFactory.INSTANCE.createDebug(), toString(null, th), null);
	}

	public LogEntry logDebug(String message, Throwable th) {
		return log(SeverityFactory.INSTANCE.createDebug(), toString(message, th), null);
	}

	public LogEntry logDebug(String message, EObject reference) {
		return log(SeverityFactory.INSTANCE.createDebug(), message, reference);
	}

	public LogEntry logDebug(String message) {
		return log(SeverityFactory.INSTANCE.createDebug(), message, null);
	}

	public LogEntry logDebug(String message, Throwable th, EObject reference) {
		return log(SeverityFactory.INSTANCE.createDebug(), toString(message, th), reference);
	}

	public LogEntry logInfo(Throwable th) {
		return log(SeverityFactory.INSTANCE.createInfo(), toString(null, th), null);
	}

	public LogEntry logInfo(String message, Throwable th) {
		return log(SeverityFactory.INSTANCE.createInfo(), toString(message, th), null);
	}

	public LogEntry logInfo(String message) {
		return log(SeverityFactory.INSTANCE.createInfo(), message, null);
	}

	public LogEntry logInfo(String message, EObject reference) {
		return log(SeverityFactory.INSTANCE.createInfo(), message, reference);
	}

	public LogEntry logInfo(String message, Throwable th, EObject reference) {
		return log(SeverityFactory.INSTANCE.createInfo(), toString(message, th), reference);
	}

	public ReportFactory(String listId) {
		super(listId);
	}

	public static final String REPORT_LIST_ID = "default.report.list";

	public static final ReportFactory INSTANCE = new ReportFactory(REPORT_LIST_ID);

}

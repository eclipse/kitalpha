/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.report.utils;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.report.model.LogEntry;
import org.polarsys.kitalpha.report.model.ReportElementFactory;
import org.polarsys.kitalpha.report.model.ReportList;
import org.polarsys.kitalpha.report.model.Severity;
import org.polarsys.kitalpha.report.registry.ReportRegistry;

/**
 * @author Thomas Guiu
 * 
 */
public abstract class AbstractReportFactory {
	private final String listId;

	public AbstractReportFactory(String listId) {
		super();
		this.listId = listId;
	}

	protected LogEntry log(Severity severity, String message, EObject reference) {
		LogEntry entry = ReportElementFactory.eINSTANCE.createLogEntry();
		return log(entry, severity, message, reference);
	}

	protected LogEntry log(LogEntry entry, Severity severity, String message, EObject reference) {
		entry.setDate(new Date());
		entry.setMessage(message);
		entry.setSeverity(severity);
		entry.setReferencedObject(reference);
		ReportList list = ReportRegistry.INSTANCE.getList(listId);
		list.getReports().add(entry);
		return entry;
	}

	protected String toString(String msg, Throwable th) {
		StringWriter sw = new StringWriter();
		if (msg != null) {
			sw.append(msg).append("\n");
		}
		if (th != null)
		 {
			th.printStackTrace(new PrintWriter(sw)); // NOSONAR
		}
		return sw.toString();
	}

	public String getListId() {
		return listId;
	}


}

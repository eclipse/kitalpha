/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.cadence.examples.basic.ecore.workflow.activities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Map;

import javax.print.attribute.standard.Severity;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import org.polarsys.kitalpha.cadence.core.api.IActivity;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.DeclaredParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.ParameterError;
import org.polarsys.kitalpha.cadence.examples.basic.ecore.workflow.Activator;

public class DisplayTime implements IActivity {

	public DisplayTime() {
		// TODO Auto-generated constructor stub
	}

	public Collection<DeclaredParameter> getParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	public IStatus run(ActivityParameters activityParams_p) {
		IStatus status = new Status(Severity.REPORT.getValue(), Activator.PLUGIN_ID, "");
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat dt = new SimpleDateFormat("HH'h' mm'min' ss'sec' SS'ms'");
		
		System.out.println("System time : " + dt.format(calendar.getTime()));
		
		return status;
	}

	public Map<String, ParameterError<?>> validateParameters(
			ActivityParameters valuedParameters_p) {
		// TODO Auto-generated method stub
		return null;
	}

}

/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.cadence.core.api.parameter;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class WorkflowActivityParameter {

	private Map<String, ActivityParameters> _parameters = new LinkedHashMap<String, ActivityParameters>();

	public void addParameter(String idActivity, GenericParameter<?> parameter) {
		ActivityParameters ap = null;

		if (this._parameters.containsKey(idActivity)) {
			ap = this._parameters.get(idActivity);
		} else {
			ap = new ActivityParameters();
			this._parameters.put(idActivity, ap);
		}

		if (parameter != null && ap != null) {
			ap.addParameter(parameter);
		}
	}

	public void addParameter(String idActivity,
			Collection<? extends GenericParameter<?>> parameters) {
		ActivityParameters ap = null;

		if (this._parameters.containsKey(idActivity)) {
			ap = this._parameters.get(idActivity);
		} else {
			ap = new ActivityParameters();
			this._parameters.put(idActivity, ap);
		}

		if (parameters != null && !parameters.isEmpty() && ap != null) {
			for (GenericParameter<?> parameter : parameters) {
				ap.addParameter(parameter);
			}
		}

	}

	public void addParameter(String idActivity, ActivityParameters parameter) {
		ActivityParameters ap = null;

		if (this._parameters.containsKey(idActivity)) {
			ap = this._parameters.get(idActivity);
		} else {
			ap = new ActivityParameters();
			this._parameters.put(idActivity, ap);
		}

		if (parameter != null && ap != null) {
			for (GenericParameter<?> p : parameter.getParameters()) {
				ap.addParameter(p);
			}
		}

	}

	public void addActivity(String idActivity) {
		if (!this._parameters.containsKey(idActivity)) {
			this._parameters.put(idActivity, new ActivityParameters());
		}
	}

	public Set<String> getActivitiesID() {
		return this._parameters.keySet();
	}

	public ActivityParameters getActivityParameters(String activityID) {
		return this._parameters.get(activityID);
	}

	public void removeActivityParameters(String activityId) {
		this._parameters.remove(activityId);

	}

}

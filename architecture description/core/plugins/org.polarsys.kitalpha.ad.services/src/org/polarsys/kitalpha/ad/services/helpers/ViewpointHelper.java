/*******************************************************************************
 * Copyright (c) 2017, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.services.helpers;

import java.util.Map;
import java.util.Map.Entry;

import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.TransitionEngine;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ViewpointHelper {
	
	/**
	 * Build diagnostic messages attached to predicates
	 * @param e is transition engine
	 * @param predicateValue is the value (evaluated) of the predicate
	 * @param title is the first line of the diagnostic message
	 * @return the diagnostic message
	 */
	public static String buildDiagnosticMessage(TransitionEngine e, boolean predicateValue, String title){
		StringBuilder buf = new StringBuilder(title);
		buf.append("\n"); //$NON-NLS-1$
		Map<String, String> diagnosticMessages = e.getDiagnosticMessages(predicateValue);

		for(Entry<String, String> entry: diagnosticMessages.entrySet()){
			if (entry.getValue() != null && !entry.getValue().isEmpty()){
				buf.append(entry.getValue()).append("\n"); //$NON-NLS-1$
			}
		}

		return buf.toString();
	}

	private ViewpointHelper() {
		super();
	}

	
}

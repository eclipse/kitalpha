/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
		StringBuffer buf = new StringBuffer(title);
		buf.append("\n"); //$NON-NLS-1$
		Map<String, String> diagnosticMessages = e.getDiagnosticMessages(predicateValue);

		for(Entry<String, String> entry: diagnosticMessages.entrySet()){
			if (entry.getValue() != null && !entry.getValue().isEmpty()){
				buf.append(entry.getValue()).append("\n"); //$NON-NLS-1$
			}
		}

		return buf.toString();
	}

}

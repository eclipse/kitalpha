/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.cadence.ui.api.dialog;

import java.util.Map;


/**
 * @author Guillaume Gebhart
 *
 */
public interface IParameterManager {

	String getName(Object o);
	
	String getDescription(Object o);
	
	String validParameter(Object parameter_p, Object container_p, Map<String,String> parameters_p);
	
}

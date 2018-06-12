/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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

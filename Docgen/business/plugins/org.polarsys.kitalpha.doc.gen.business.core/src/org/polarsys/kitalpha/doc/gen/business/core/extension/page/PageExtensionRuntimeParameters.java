/*******************************************************************************
 * Copyright (c) 2014, 2019 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.extension.page;

import java.util.HashMap;
import java.util.Map;

public class PageExtensionRuntimeParameters {
	
	public static final String FILE_NAME_SERVICE_PARAMETER = "domainFileNameService";
	public static final String RUNTIME_PARAMETER_CONTRACT_NAME = "runtime.parameters";
	
	private static PageExtensionRuntimeParameters instance = new PageExtensionRuntimeParameters();
	
	private Map<String, Object> parameters = new HashMap<String, Object>();

	public static PageExtensionRuntimeParameters getInstance() {
		return instance;
	}
	
	public Map<String, Object> getParameters(){
		return parameters;
	}
	
	public void init(){
		parameters.clear();
	}
}

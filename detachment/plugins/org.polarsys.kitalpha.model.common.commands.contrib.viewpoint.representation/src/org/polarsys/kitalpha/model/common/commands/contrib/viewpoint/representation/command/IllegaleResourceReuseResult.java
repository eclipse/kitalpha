/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 *   This program and the accompanying materials are made available under the
 *   terms of the Eclipse Public License 2.0 which is available at
 *   http://www.eclipse.org/legal/epl-2.0
 *   
 *   SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.commands.contrib.viewpoint.representation.command;

/**
 * 
 * @author Faycal ABKA
 *
 */
public class IllegaleResourceReuseResult extends IllegalAccessException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public IllegaleResourceReuseResult(String string) {
		super(string);
	}

}

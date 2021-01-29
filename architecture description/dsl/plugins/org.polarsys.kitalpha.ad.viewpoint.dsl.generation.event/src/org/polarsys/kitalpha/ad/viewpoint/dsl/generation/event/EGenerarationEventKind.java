/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event;

/**
 * @author Boubekeur Zendagui
 */

public enum EGenerarationEventKind {
	BEGIN(1), END(-1);
	
	/**
	 * 
	 */
	private int _code;
	
	/**
	 * 
	 * @param code
	 */
	private EGenerarationEventKind(int code) {
		_code = code;
	}

	/**
	 * 
	 * @return
	 */
	public int getCode(){
		return _code;
	}
}

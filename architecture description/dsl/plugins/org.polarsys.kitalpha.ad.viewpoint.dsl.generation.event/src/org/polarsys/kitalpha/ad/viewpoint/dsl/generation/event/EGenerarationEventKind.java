/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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

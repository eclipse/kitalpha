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


package org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.expression.helper.sirius;

/**
 * Temporary exception. It is used until OCL expression will be supported
 * 
 * @author Boubekeur Zendagui
 */
public class OCLExpressionNotSupported extends RuntimeException {

	/**
	 * id
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Default constructor
	 */
	public OCLExpressionNotSupported() {
		super("OCL expression are not supported");
	}

}

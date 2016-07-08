/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.mappingimport;

/**
 * @author Boubekeur Zendagui
 */
public class AutoImportException extends Exception {

	/**
	 */
	private static final long serialVersionUID = 1L;

	public final static String MSG_DEFAULT = "Mapping import problem";
	public final static String MSG_CANT_FIND_MAPPING = "Import Agent doesn't find a MappingImport";
	
	public AutoImportException(String message) {
		super(message);
	}
	
	public AutoImportException() {
		super(MSG_DEFAULT);
	}
	
}

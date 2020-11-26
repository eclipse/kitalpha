/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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

/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
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

public enum MappingImportKind {
	SPECIFIED("Specified_Import"),
	AUTO("Auto_Import");
	
	private String import_s;
	
	private MappingImportKind(String imports) {
		import_s = imports;
	}
	
	@Override
	public String toString() {
		return import_s;
	}
	
}

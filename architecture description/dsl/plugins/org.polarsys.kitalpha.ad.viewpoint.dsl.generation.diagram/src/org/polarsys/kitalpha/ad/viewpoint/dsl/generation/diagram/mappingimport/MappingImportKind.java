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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.mappingimport;

/**
 * @author Boubekeur Zendagui
 */

public enum MappingImportKind {
	SPECIFIED("Specified_Import"),
	AUTO("Auto_Import");
//	BOTH("Both_Import");
	
	private String import_s;
	
	private MappingImportKind(String imports) {
		import_s = imports;
	}
	
	@Override
	public String toString() {
		return import_s;
	}
	
}

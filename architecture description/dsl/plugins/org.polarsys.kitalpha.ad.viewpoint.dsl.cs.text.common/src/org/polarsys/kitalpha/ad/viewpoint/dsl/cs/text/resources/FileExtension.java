/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class FileExtension  {

	public static final String VPDESC_EXTENSION = "vpdesc";
	
	public static final String PRIMARY_EXTENSION = "vptext";

	public static final String  SPECIFICATION_EXTENSION = "spec.vptext";

	public static final String  UI_EXTENSION = "ui.vptext";

	public static final String  CONFIGURATION_EXTENSION = "conf.vptext";

	public static final String  BUILD_EXTENSION = "build.vptext";

	public static final String  DIAGRAM_EXTENSION = "diagram.vptext";

	public static final String  SERVICES_EXTENSION = "services.vptext";

	public static final String  RULES_EXTENSION = "rules.vptext";

	public static final String  DATA_EXTENSION = "data.vptext";
	
	public static final String ACTIVITYEXPLORER_EXTENSION = "activityexplorer.vptext";


	private static final String[] PERIDIC_EXTENSIONS_ARRAY = new String [] {
		PRIMARY_EXTENSION, 
		SPECIFICATION_EXTENSION, 
		UI_EXTENSION, 
		CONFIGURATION_EXTENSION, 
		BUILD_EXTENSION, 
		DIAGRAM_EXTENSION, 
		SERVICES_EXTENSION, 
		RULES_EXTENSION,
		DATA_EXTENSION,
		ACTIVITYEXPLORER_EXTENSION
	};

	public static String getByName(String name) {
		for (int i = 0; i < PERIDIC_EXTENSIONS_ARRAY.length; ++i) {
			String result = PERIDIC_EXTENSIONS_ARRAY[i];
			if (result.equals(name)) {
				return result;
			}
		}
		return null;
	}
}

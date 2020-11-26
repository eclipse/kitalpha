/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.identifiers;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class EditorIDs {

	public static final String BUILD_EDITOR_ID = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpbuild";
	public static final String VPSPEC_EDITOR_ID = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpspec";
	public static final String DATA_EDITOR_ID = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data";
	public static final String CONFIG_EDITOR_ID = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpconf";
	public static final String DIAGRAM_EDITOR_ID = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram";
	public static final String SERVICES_EDITOR_ID = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpservices";
	public static final String UI_EDITOR_ID = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpui";
	public static final String ACTIVITY_EXPLORER_ID = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Activityexplorer";
	
	public static String getEditorID(String fileExtension) {
		if (fileExtension.equals(FileExtension.BUILD_EXTENSION)) {
			return BUILD_EDITOR_ID;
		}
		if (fileExtension.equals(FileExtension.SPECIFICATION_EXTENSION)) {
			return VPSPEC_EDITOR_ID;
		}
		if (fileExtension.equals(FileExtension.DATA_EXTENSION)) {
			return DATA_EDITOR_ID;
		}
		if (fileExtension.equals(FileExtension.CONFIGURATION_EXTENSION)) {
			return CONFIG_EDITOR_ID;
		}
		if (fileExtension.equals(FileExtension.DIAGRAM_EXTENSION)) {
			return DIAGRAM_EDITOR_ID;
		}
		if (fileExtension.equals(FileExtension.SERVICES_EXTENSION)) {
			return SERVICES_EDITOR_ID;
		}
		if (fileExtension.equals(FileExtension.UI_EXTENSION)) {
			return UI_EDITOR_ID;
		}
		if (fileExtension.equals(FileExtension.ACTIVITYEXPLORER_EXTENSION)) {
			return ACTIVITY_EXPLORER_ID;
		}
		
		return null;
	}
	
}

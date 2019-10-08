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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.message;

import org.eclipse.osgi.util.NLS;

/**
 * @author Boubekeur Zendagui
 */

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.message.messages"; //$NON-NLS-1$
	public static String ViewpointGenerationTaskName;
	
	public static String Wizard_ConcreteSyntax_Creation_SubTask;
	public static String Wizard_New;
	public static String Wizard_Page_First_Description;
	public static String Wizard_Page_First_Title;
	public static String Wizard_Page_Second_Description;
	public static String Wizard_Page_Second_Title;
	public static String Wizard_Page1_NoTargetApplication;
	public static String Wizard_Page1_DataCheck_AllowedCharacter;
	public static String Wizard_Page1_DataCheck_TargetApplication_NoSelection;
	public static String Wizard_Page1_DataCheck_VPShortName_Invalid;
	public static String Wizard_Page1_Label_ShortName;
	public static String Wizard_Page1_Label_TargetApplication;
	public static String Wizard_Page1_Title;
	public static String Wizard_Page2_DataCheck_AlowedCharacters;
	public static String Wizard_Page2_DataCheck_DescriptionProject_Invalid;
	public static String Wizard_Page2_DataCheck_ProjectExists;
	public static String Wizard_Page2_DataCheck_RootProjectName_Invalid;
	public static String Wizard_Page2_Label_DescriptionProject_Name;
	public static String Wizard_Page2_Label_Representation_Select;
	public static String Wizard_Page2_Label_RootProject_Name;
	public static String Wizard_Page2_Title;
	public static String Wizard_VpDslProject_Creation_Task_Name;
	public static String Wizard_VpSpecModel_CreationTask_Name;
	
	
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}

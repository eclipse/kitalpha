/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.services.detachment.core.registeries;

/**
 * A hole of detachment registries constants
 * @author Faycal Abka
 */
public class DetachmentRegistriesConst {
	
	//Constants for registry of the unknown references contributions
	public final static String EXTENSION_POINT = "org.polarsys.kitalpha.services.detachment.core.unknownReferences"; //$NON-NLS-1$ 
	public final static String CLASS_ATTRIBUTE = "class"; //$NON-NLS-1$
	
	//Constants for the registry of the extension of the detachment
	public final static String DETACHMENT_EXTENSION_POINT = "org.polarsys.kitalpha.services.detachment.core.detachment";
	public final static String DETACHMENT_EXTENSION_CONTRIBUTION_ID = "ID";
	public final static String DETACHMENT_EXTENSION_CONTRIBUTION = "contribution";
	public final static String DETACHMENT_EXTENSION_WIZARD = "Wizard";
	public final static String DETACHMENT_EXTENSION_INTERPRETER = "Interpreter";
	public static final String DETACHMENT_EXTENSION_WIZARDPAGENUMBER = "WizardPageNumber";

}

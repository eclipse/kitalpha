/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.wizards;

import org.polarsys.kitalpha.ad.viewpoint.dsl.services.preference.helper.ViewpointDslPreferenceConstant;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.preference.helper.ViewpointDslPreferencesHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.extensions.ConcreteSyntaxResourceCreationManager;

/**
 * @author Boubekeur Zendagui
 */

public class DefaultWizardSelection {
	
	public static final int TargetApplicationDefaultSelection 	= 0; //$NON-NLS-N$
	public static final int RepresentationDefaultSelection 		= 1; //$NON-NLS-N$
	
	public static boolean isDefault(String data, int source){
		switch (source) {
		case TargetApplicationDefaultSelection:
			return checkTargetApplication(data);

		case RepresentationDefaultSelection :
			return checkRepresentation(data);
		}
		
		return false;
	}
	/**
	 * This allows to identify default target application. 
	 * @param data the name of the target application
	 * @return
	 */
	protected static boolean checkTargetApplication(String data){
		if (data != null && data.trim().length() > 0)
			return data.equals(ViewpointDslPreferencesHelper.getCustomizedDefaultTAValue());
		
		return false;
	}
	
	protected static boolean checkRepresentation(String creatorID) {
		return ConcreteSyntaxResourceCreationManager.isDefault(creatorID);
	}
}

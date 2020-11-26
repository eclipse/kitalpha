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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.wizard.pages;

import java.util.Map;

import org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.wizards.NewDSLVpProjectSecondPage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.extension.ConcreteSyntaxResourceInitializeManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.wizard.DefaultReverseWizardSelection;

/**
 * @author Boubekeur Zendagui
 */

public class ReverseSecondPage extends NewDSLVpProjectSecondPage {

	@Override
	protected Map<String,String> getAvailableConcreteSyntaxesHandlers() throws org.eclipse.core.runtime.CoreException {
		return ConcreteSyntaxResourceInitializeManager.getAvailableConcreteSyntaxResourceInitializers();
	}
	
	@Override
	protected boolean isDefaultRepresentation(String represnetationManagerID) {
		return (DefaultReverseWizardSelection.isDefault(represnetationManagerID, 
				DefaultReverseWizardSelection.RepresentationDefaultSelection));
	}
}

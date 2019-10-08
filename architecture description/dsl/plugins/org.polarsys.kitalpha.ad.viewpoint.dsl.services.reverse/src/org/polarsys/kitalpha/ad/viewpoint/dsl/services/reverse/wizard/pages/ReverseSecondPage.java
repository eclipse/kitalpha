/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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

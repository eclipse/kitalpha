/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
// DSL Viewpoint Generator V0.1 22.09.2014 at 11:42:38 CEST

package org.polarsys.kitalpha.vp.componentsampleframework.af.businessrules;

import org.polarsys.kitalpha.ad.viewpoint.integration.rules.JavaRule;
import org.polarsys.kitalpha.ad.viewpoint.utils.ModelAccessor;

public class RuleTwo implements JavaRule {

	/* (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.integration.rules.JavaRule#run(org.polarsys.kitalpha.ad.viewpoint.utils.ModelAccessor, java.lang.Object[])
	 */
	public void run(ModelAccessor properties, Object[] selection) {
		// TODO Auto-generated method stub
		org.eclipse.jface.dialogs.MessageDialog.openInformation(
				org.eclipse.ui.PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), 
				"Java rule execution", 
				"DSL Viewpoint generated rule \n Message from RuleTwo rule");

	}

	/* (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.integration.rules.JavaRule#canRun(org.polarsys.kitalpha.ad.viewpoint.utils.ModelAccessor, java.lang.Object[])
	 */
	public boolean canRun(ModelAccessor properties, Object[] selection) {
		// TODO Auto-generated method stub
		return true;
	}

}
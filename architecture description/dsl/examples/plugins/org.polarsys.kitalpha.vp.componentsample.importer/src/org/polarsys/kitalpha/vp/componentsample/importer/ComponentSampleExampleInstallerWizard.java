/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.vp.componentsample.importer;

import org.eclipse.egf.common.ui.wizard.AllZipsBundleExampleWizard;

/**
 * @author THomas Guiu
 *
 */
public class ComponentSampleExampleInstallerWizard extends AllZipsBundleExampleWizard {

	@Override
	protected String getBundleId() {
		return "org.polarsys.kitalpha.vp.componentsample.importer"; //$NON-NLS-1$
	}

}

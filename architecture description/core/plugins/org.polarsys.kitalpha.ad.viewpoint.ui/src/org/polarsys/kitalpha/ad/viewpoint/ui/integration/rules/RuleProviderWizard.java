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
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.integration.rules;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.widgets.Shell;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IRuleHandler;


/**
 * @author Thomas Guiu
 * 
 */
public interface RuleProviderWizard {
	String getType();

	void openWizard(Shell shell, IRuleHandler handler, IProject project);
}

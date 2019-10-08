/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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

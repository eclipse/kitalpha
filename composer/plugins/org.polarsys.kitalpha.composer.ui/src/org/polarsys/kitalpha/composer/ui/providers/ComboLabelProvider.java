/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.ui.providers;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.jface.viewers.LabelProvider;

import org.polarsys.kitalpha.composer.extension.points.CodeManagerExtensions;

/**
 * Provides label for all combo viewers.
 * 
 
 */
public class ComboLabelProvider extends LabelProvider {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object element) {
		if (element instanceof IConfigurationElement) {
			IConfigurationElement elt = (IConfigurationElement) element;
			return elt.getAttribute(CodeManagerExtensions.ATT_NAME);
		}
		return null;
	}

}

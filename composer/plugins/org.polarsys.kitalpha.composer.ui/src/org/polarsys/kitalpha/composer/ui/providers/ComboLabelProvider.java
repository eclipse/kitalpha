/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation.
 *******************************************************************************/


package org.polarsys.kitalpha.composer.ui.providers;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.jface.viewers.LabelProvider;

import org.polarsys.kitalpha.composer.extension.points.CodeManagerExtensions;

/**
 * Provides label for all combo viewers.
 * 
 * @author THALESGROUP
 */
public class ComboLabelProvider extends LabelProvider {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
	 */
	public String getText(Object element) {
		if (element instanceof IConfigurationElement) {
			IConfigurationElement elt = (IConfigurationElement) element;
			return elt.getAttribute(CodeManagerExtensions.ATT_NAME);
		}
		return null;
	}

}

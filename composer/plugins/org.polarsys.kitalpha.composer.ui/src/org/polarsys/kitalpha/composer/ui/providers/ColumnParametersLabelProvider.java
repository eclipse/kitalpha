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

import org.eclipse.jface.viewers.ColumnLabelProvider;

import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.ui.Activator;

/**
 * Label provider for the name of a parameter.
 * 
 * @author THALESGROUP
 */
public class ColumnParametersLabelProvider extends ColumnLabelProvider {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getText(java.lang.Object)
	 */
	public String getText(Object element) {
		if (element instanceof Parameter) {
			Parameter entry = (Parameter) element;
			return entry.getName();
		} else {
			//
			// Invalid Argument.
			Activator.getDefault().warning(
					"Invalid argument in ColumnParametersLabelProvider.getText : "
							+ (element != null ? element.getClass().getName()
									: "null"));
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.CellLabelProvider#getToolTipText(java.lang.Object)
	 */
	public String getToolTipText(Object element) {
		if (element instanceof Parameter) {
			return ((Parameter) element).getDescription();
		} else {
			//
			// Invalid Argument.
			Activator.getDefault().warning(
					"Invalid argument in ColumnParametersLabelProvider.getToolTipText : "
							+ (element != null ? element.getClass().getName()
									: "null"));
		}
		return null;
	}

}

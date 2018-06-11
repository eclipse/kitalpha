/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.ui.providers;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.ui.Activator;

/**
 * Provides labels for the values of parameters.
 * 
 
 */
public class ColumnValuesLabelProvider extends ColumnLabelProvider {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object element) {

		if (element instanceof Parameter) {
			Parameter parameter = (Parameter) element;
			return parameter.getValue();
		} else {
			Activator.getDefault().warning(
					"Invalid argument in ColumnValuesLabelProvider.getText() "
							+ element);
			return null;
		}
	}

}

/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.example.extensions.filter;

import org.polarsys.kitalpha.massactions.core.column.IMAColumn;
import org.polarsys.kitalpha.massactions.core.extensions.columnfilter.AbstractMAColumnFilter;

/**
 * 
 * @author Sandu Postaru 
 *
 */
public class TutorialColumnFilter extends AbstractMAColumnFilter {

	public TutorialColumnFilter() {
		this.displayName = "Tutorial Filter";
	}
	
	@Override
	public boolean shouldHide(IMAColumn column) {

		String columnId = column.getId();
		
		// hide any column except 'name', 'Count' and 'Text' 
		return !("name".equals(columnId) || "Count".equals(columnId) || "Text".equals(columnId));
	}

}

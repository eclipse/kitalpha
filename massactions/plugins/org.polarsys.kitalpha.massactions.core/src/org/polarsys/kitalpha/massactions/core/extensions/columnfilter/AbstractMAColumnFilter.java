/*******************************************************************************
 * Copyright (c) 2018, 2020  Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.core.extensions.columnfilter;

import java.util.List;

import org.polarsys.kitalpha.massactions.core.column.IMAColumn;
import org.polarsys.kitalpha.massactions.core.extensionpoint.columnfilter.IMAColumnFilter;

/**
 * An abstract representation of a {@link IMAColumnFilter} that takes care of
 * some of the internal plumbing.
 * 
 * Developers can extend this class in order to define their own filters.
 *
 * @author Sandu Postaru
 * 
 */
public abstract class AbstractMAColumnFilter implements IMAColumnFilter {

	protected List<IMAColumn> baseColumns;
	protected String displayName;

	@Override
	public void setBaseColumns(List<IMAColumn> baseColumns) {
		this.baseColumns = baseColumns;
	}

	@Override
	public String getDisplayName() {
		return displayName;
	}

	@Override
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

}

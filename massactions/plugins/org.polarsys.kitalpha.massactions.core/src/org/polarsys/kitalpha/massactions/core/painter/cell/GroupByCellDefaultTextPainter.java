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
package org.polarsys.kitalpha.massactions.core.painter.cell;

import org.eclipse.nebula.widgets.nattable.extension.glazedlists.groupBy.GroupByCellTextPainter;
import org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell;
import org.eclipse.swt.graphics.GC;

/**
 * The default cell painter for a group by cell.
 * 
 * @author Sandu Postaru 
 *
 */
public class GroupByCellDefaultTextPainter extends GroupByCellTextPainter {

	protected String defaultText;

	public GroupByCellDefaultTextPainter(String defaultText) {
		this.defaultText = defaultText;
	}

	@Override
	protected String getTextToDisplay(ILayerCell cell, GC gc, int availableLength, String text) {
		String textToDisplay = super.getTextToDisplay(cell, gc, availableLength, text);

		// we only want to display the image in the first column
		// the one that contains the group by selector
		if (cell.getColumnPosition() == 1 && textToDisplay.isEmpty()) {
			return defaultText;
		}

		return textToDisplay;
	}

}

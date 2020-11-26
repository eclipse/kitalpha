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
package org.polarsys.kitalpha.massactions.visualize.config;

import org.eclipse.nebula.widgets.nattable.extension.glazedlists.groupBy.DefaultGroupByThemeExtension;
import org.eclipse.nebula.widgets.nattable.painter.cell.BackgroundPainter;
import org.eclipse.nebula.widgets.nattable.painter.cell.decorator.CellPainterDecorator;
import org.eclipse.nebula.widgets.nattable.painter.cell.decorator.PaddingDecorator;
import org.eclipse.nebula.widgets.nattable.ui.util.CellEdgeEnum;
import org.eclipse.nebula.widgets.nattable.util.GUIHelper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.polarsys.kitalpha.massactions.core.painter.cell.GroupByCellDefaultTextPainter;
import org.polarsys.kitalpha.massactions.core.painter.cell.GroupByObjectCellPainter;

/**
 * A theme extension for the GroupBy layer that adds support for object icons in
 * the group by category.
 * 
 * @author Sandu Postaru
 * 
 */
public class MVGroupByThemeExtension extends DefaultGroupByThemeExtension {

	public MVGroupByThemeExtension() {

		FontData groupByFontData = GUIHelper.DEFAULT_FONT.getFontData()[0];
		groupByFontData.setStyle(SWT.BOLD);

		this.groupByObjectFont = GUIHelper.getFont(groupByFontData);
		this.groupByObjectCellPainter = new PaddingDecorator(new CellPainterDecorator(
				new BackgroundPainter(new PaddingDecorator(new GroupByCellDefaultTextPainter(" "), 0, 5, 0, 5)),
				CellEdgeEnum.LEFT, new GroupByObjectCellPainter()), 0, 5, 0, 5);

		this.groupByObjectSelectionFont = GUIHelper.getFont(groupByFontData);

		this.groupByObjectSelectionCellPainter = new PaddingDecorator(new CellPainterDecorator(
				new BackgroundPainter(new PaddingDecorator(new GroupByCellDefaultTextPainter(" "), 0, 5, 0, 5)),
				CellEdgeEnum.LEFT, new GroupByObjectCellPainter()), 0, 5, 0, 5);

		this.groupByHint = "Drag columns here to group by column values";

		FontData groupByHintFontData = GUIHelper.DEFAULT_FONT.getFontData()[0];
		groupByHintFontData.setStyle(SWT.ITALIC);
		this.groupByHintFont = GUIHelper.getFont(groupByHintFontData);
	}

}
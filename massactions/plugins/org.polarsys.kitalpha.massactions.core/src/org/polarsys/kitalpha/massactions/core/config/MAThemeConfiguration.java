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
package org.polarsys.kitalpha.massactions.core.config;

import org.eclipse.nebula.widgets.nattable.style.theme.ModernNatTableThemeConfiguration;
import org.polarsys.kitalpha.massactions.core.data.provider.MAImageRowHeaderDataProvider;
import org.polarsys.kitalpha.massactions.core.painter.cell.RowHeaderImagePainter;

/**
 * An extension of the Modern Theme configuration, that adds support for icon based row headers. See
 * {@link MAImageRowHeaderDataProvider} for more information.
 *
 * @author Sandu Postaru
 *
 */
public class MAThemeConfiguration extends ModernNatTableThemeConfiguration {

  public MAThemeConfiguration() {
    super();
    this.rHeaderSelectionCellPainter = new RowHeaderImagePainter();
    this.rHeaderCellPainter = new RowHeaderImagePainter();
  }
}

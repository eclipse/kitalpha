/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.edit.config;

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
public class METhemeConfiguration extends ModernNatTableThemeConfiguration {

  public METhemeConfiguration() {
    super();
    this.rHeaderSelectionCellPainter = new RowHeaderImagePainter();
    this.rHeaderCellPainter = new RowHeaderImagePainter();
  }
}

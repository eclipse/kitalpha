/*******************************************************************************
 * Copyright (c) 2018  THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.core.table.layer.body;

import org.eclipse.nebula.widgets.nattable.copy.command.CopyDataCommandHandler;
import org.eclipse.nebula.widgets.nattable.copy.command.CopyDataToClipboardCommand;
import org.eclipse.nebula.widgets.nattable.layer.IUniqueIndexLayer;
import org.eclipse.nebula.widgets.nattable.selection.SelectionLayer;

/**
 * An extension of the selection layer that enables a formated text copy-paste mechanism.
 * 
 * @author Sandu Postaru 
 *
 */
public class MASelectionLayer extends SelectionLayer {

  public MASelectionLayer(IUniqueIndexLayer underlyingLayer) {
    super(underlyingLayer);
  }

  @Override
  protected void registerCommandHandlers() {
    super.registerCommandHandlers();

    // unregister the existing handler
    unregisterCommandHandler(CopyDataToClipboardCommand.class);

    // create a new handler that manages formated text
    CopyDataCommandHandler copyCommandHandler = new CopyDataCommandHandler(this);
    copyCommandHandler.setCopyFormattedText(true);

    // register the new handler
    registerCommandHandler(copyCommandHandler);
  }

}

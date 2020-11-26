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
package org.polarsys.kitalpha.massactions.edit.table.layer.body;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.edit.command.EditSelectionCommand;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.polarsys.kitalpha.massactions.core.table.factory.IMAFactory;
import org.polarsys.kitalpha.massactions.core.table.layer.body.MABodyLayer;
import org.polarsys.kitalpha.massactions.edit.command.MEEditSelectionCommandHandler;

/**
 * An extension of the default {@link MABodyLayer} that uses a custom selection command handler, optimized for batch
 * edition of elements.
 * 
 * @author Sandu Postaru
 * 
 */
public class MEBodyLayer extends MABodyLayer {

  public MEBodyLayer(Collection<EObject> data, IMAFactory factory) {
    super(data, factory);
  }

  @Override
  protected ILayer initializeLayer() {
    ILayer finalLayer = super.initializeLayer();

    // we add our custom selection command handler
    // that processes selection editing in a more efficient batch oriented
    // manner
    this.selectionLayer.unregisterCommandHandler(EditSelectionCommand.class);
    this.selectionLayer
        .registerCommandHandler(new MEEditSelectionCommandHandler(selectionLayer, columnPropertyAccessor));

    return finalLayer;
  }

}

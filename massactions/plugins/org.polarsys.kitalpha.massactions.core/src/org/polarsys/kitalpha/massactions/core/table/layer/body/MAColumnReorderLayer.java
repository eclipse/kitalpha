/*******************************************************************************
 * Copyright (c) 2018, 2021  Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.core.table.layer.body;

import java.util.Collection;
import org.eclipse.collections.api.list.primitive.MutableIntList;
import org.eclipse.collections.impl.factory.primitive.IntLists;
import org.eclipse.nebula.widgets.nattable.layer.IUniqueIndexLayer;
import org.eclipse.nebula.widgets.nattable.layer.event.ILayerEvent;
import org.eclipse.nebula.widgets.nattable.layer.event.IStructuralChangeEvent;
import org.eclipse.nebula.widgets.nattable.layer.event.StructuralDiff;
import org.eclipse.nebula.widgets.nattable.reorder.ColumnReorderLayer;

/**
 * An extension of the default {@link ColumnReorderLayer}, that tries to preserve as much as possible of the current
 * column configuration whenever structural changes occur.
 * 
 * @author Sandu Postaru
 *
 */
public class MAColumnReorderLayer extends ColumnReorderLayer {

    public MAColumnReorderLayer(IUniqueIndexLayer underlyingLayer) {
        super(underlyingLayer);
    }

    /**
     * By default the NatTable implementation resets the currently ordered columns whenever a structural change event
     * happens. We instead save the current configuration and restore it afterwards.
     */
    @Override
    public void handleLayerEvent(ILayerEvent event) {
        MutableIntList prevColumnIndexOrder = IntLists.mutable.empty();

        if (event instanceof IStructuralChangeEvent) {
            IStructuralChangeEvent structuralChangeEvent = (IStructuralChangeEvent) event;
            if (structuralChangeEvent.isHorizontalStructureChanged()) {
                Collection<StructuralDiff> structuralDiffs = structuralChangeEvent.getColumnDiffs();
                if (structuralDiffs == null) {
                    // save state
                    prevColumnIndexOrder.addAll(this.columnIndexOrder);
                }
            }
        }

        // process the event
        super.handleLayerEvent(event);

        if (!prevColumnIndexOrder.isEmpty()) {

            // restore the subset of the old indexes (and in the same order) that are still in the index.
            MutableIntList selected = prevColumnIndexOrder.select(columnIndexOrder::contains);
            this.columnIndexOrder.clear();
            this.columnIndexOrder.addAll(selected);

            // do a fake reorder to force the update of the internal cache
            reorderColumnPosition(0, 0);
        }

    }
}

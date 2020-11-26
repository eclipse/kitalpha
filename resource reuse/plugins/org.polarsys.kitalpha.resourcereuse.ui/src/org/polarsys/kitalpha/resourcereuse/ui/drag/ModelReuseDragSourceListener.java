/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
 package org.polarsys.kitalpha.resourcereuse.ui.drag;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.util.TransferDragSourceListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.dnd.DragSourceAdapter;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.Transfer;

public class ModelReuseDragSourceListener extends DragSourceAdapter implements TransferDragSourceListener {
    private TableViewer viewer;

    public ModelReuseDragSourceListener(TableViewer viewer) {
        this.viewer = viewer;
    }

    /**
     * {@inheritDoc}<br>
     * We can always drag our data since we selected one resource
     */
    @Override
    public void dragStart(DragSourceEvent event) {
        ISelection selection = viewer.getSelection();
        LocalSelectionTransfer.getTransfer().setSelection(selection);
        LocalSelectionTransfer.getTransfer().setSelectionSetTime(event.time & 0xFFFFFFFFL);
        event.doit = !selection.isEmpty();
    }

    @Override
    public Transfer getTransfer() {
        return LocalSelectionTransfer.getTransfer();
    }

    @Override
    public void dragSetData(DragSourceEvent event) {
    }

    @Override
    public void dragFinished(DragSourceEvent event) {
        LocalSelectionTransfer.getTransfer().setSelection(null);
        LocalSelectionTransfer.getTransfer().setSelectionSetTime(0);
    }
}

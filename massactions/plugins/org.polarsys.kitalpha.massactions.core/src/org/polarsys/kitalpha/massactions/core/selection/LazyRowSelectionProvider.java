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
package org.polarsys.kitalpha.massactions.core.selection;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.nebula.widgets.nattable.selection.RowSelectionProvider;
import org.polarsys.kitalpha.massactions.core.table.IMATable;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;

/**
 * A lazy row selection provider that delegates most of the work to the default
 * NatTable implementation.
 * 
 * The selection provider is configured when a view is created, the problem is
 * that at that point the NatTable instance does not yet exist. A NatTable
 * instance is created when the user adds its first elements.
 * 
 * So we memorize any selections changed listeners that are added when the view
 * is created, and as soon as the NatTable instance is created we set the
 * memorized listeners to its own selection provider. Any subsequent calls are
 * then delegated to the NatTable selection provider.
 *
 * @author Sandu Postaru
 *
 */
public class LazyRowSelectionProvider implements ISelectionProvider {

	private IMATable table;

	/**
	 * The list of selection changed listeners that will be added to the
	 * NatTable selection provider once it is created.
	 */
	private List<ISelectionChangedListener> lazySelectionChangedListeners;

	private RowSelectionProvider<EObject> rowSelectionProvider;

	public LazyRowSelectionProvider(IMATable table) {
		this.table = table;
		lazySelectionChangedListeners = new ArrayList<>();
	}

	public boolean enable() {

		boolean canEnable = table.getGridLayerStack() != null;

		if (canEnable) {
			IMABodyLayer bodyLayer = table.getGridLayerStack().getBodyLayer();

			rowSelectionProvider = new RowSelectionProvider<>(bodyLayer.getSelectionLayer(),
					bodyLayer.getBodyDataProvider(), false);

			lazySelectionChangedListeners
					.forEach(listener -> rowSelectionProvider.addSelectionChangedListener(listener));
		}

		return canEnable;
	}

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {

		if (rowSelectionProvider == null) {
			lazySelectionChangedListeners.add(listener);
		} else {
			rowSelectionProvider.addSelectionChangedListener(listener);
		}

	}

	@Override
	public ISelection getSelection() {

		if (rowSelectionProvider != null || enable()) {
			return rowSelectionProvider.getSelection();
		}

		return StructuredSelection.EMPTY;
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		if (rowSelectionProvider == null) {
			lazySelectionChangedListeners.remove(listener);
		} else {
			rowSelectionProvider.removeSelectionChangedListener(listener);
		}
	}

	@Override
	public void setSelection(ISelection selection) {
		// not used
	}

}

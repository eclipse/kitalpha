/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.integration.sirius.dialog;

import java.util.Map;

import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.sirius.business.api.query.IdentifiedElementQuery;
import org.eclipse.sirius.common.tools.api.util.EqualityHelper;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.widgets.Item;
import org.polarsys.kitalpha.ad.integration.sirius.SiriusViewpointManager;

/**
 * @author Thomas Guiu
 * 
 */
public class ViewpointsTableLazyCellModifier implements ICellModifier {

	protected final TableViewer tableViewer;
	protected final Map<Viewpoint, Boolean> viewpoints;

	/**
	 * Constructor.
	 * 
	 * @param viewpoints
	 *            All viewpoints and there selection state.
	 */
	public ViewpointsTableLazyCellModifier(final Map<Viewpoint, Boolean> viewpoints, TableViewer tableViewer) {
		this.viewpoints = viewpoints;
		this.tableViewer = tableViewer;

	}

	/**
	 * {@inheritDoc}
	 */
	public Object getValue(final Object element, final String property) {

		final Viewpoint viewpoint = (Viewpoint) element;
		Object result = null;

		if (property.equals(ViewpointSelectionDialog.COLUMNS[0])) {

			result = Boolean.FALSE;
			for (final Map.Entry<Viewpoint, Boolean> entry : viewpoints.entrySet()) {
				if (entry.getValue().booleanValue() && EqualityHelper.areEquals(viewpoint, entry.getKey())) {
					result = Boolean.TRUE;
					break;
				}
			}
		} else if (property.equals(ViewpointSelectionDialog.COLUMNS[1])) {
			// do nothing as there is only an image
		} else {
			/* third column */
			result = new IdentifiedElementQuery(viewpoint).getLabel();
		}
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	public void modify(final Object element, final String property, final Object value) {

		Object objElement;

		if (element instanceof Item) {
			objElement = ((Item) element).getData();
		} else {
			objElement = element;
		}

		if (property.equals(ViewpointSelectionDialog.COLUMNS[0])) {
			final Viewpoint vp = (Viewpoint) objElement;

			// Convert Object to Boolean without instanceof
			final Boolean result = Boolean.valueOf(Boolean.TRUE.equals(value));

			for (final Viewpoint viewpoint : viewpoints.keySet()) {
				if (EqualityHelper.areEquals(viewpoint, vp)) {
					viewpoints.put(viewpoint, result);
					break;
				}
			}

			/* update the label provider */
			this.tableViewer.update(vp, null);
		}
	}

	public boolean canModify(final Object element, final String property) {

		if (property.equals(ViewpointSelectionDialog.COLUMNS[0])) {
			/* first column */
			Viewpoint vp = (Viewpoint) element;
			return !SiriusViewpointManager.INSTANCE.isUnderControl(vp);
		}
		return false;
	}

}

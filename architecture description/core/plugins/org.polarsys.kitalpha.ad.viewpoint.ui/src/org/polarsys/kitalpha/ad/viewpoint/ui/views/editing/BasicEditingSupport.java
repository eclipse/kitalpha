/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.ui.views.editing;

import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ModelManager;

public abstract class BasicEditingSupport extends EditingSupport {

	private ModelManager modelManager;

	public BasicEditingSupport(ColumnViewer viewer) {
		super(viewer);
	}

	@Override
	protected boolean canEdit(Object element) {
		if (modelManager == null)
			return false;
		return !modelManager.getResourceManager().isReadOnly() && modelManager.isRemovable((ViewpointElement) element);
	}

	protected abstract void doSetValue(Object element, Object value);

	protected final void setValue(Object element, Object value) {
		Object oldValue = getValue(element);
		if (value == null && oldValue == null)
			return;
		if (value != null && value.equals(oldValue))
			return;
		if (oldValue != null && oldValue.equals(value))
			return;
		doSetValue(element, value);
		getModelManager().getResourceManager().saveModel();
	}

	public ModelManager getModelManager() {
		return modelManager;
	}

	public void setModelManager(ModelManager modelManager) {
		this.modelManager = modelManager;
	}

}
/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs;

import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ModelManager;
import org.polarsys.kitalpha.ad.viewpoint.ui.provider.AFSelectionProvider;


/**
 * @author Thomas Guiu
 * 
 */
public interface Tab {
	ISelectionProvider getSelectionProvider();

	void setModelManager(Viewpoint vp, ModelManager modelManager);

	void createTab(FormToolkit toolkit, CTabFolder folder);

	void init();

	void dispose();

	void setDesignOnly(boolean designOnly);

	boolean isDesignOnly();

	void setSelectionProvider(AFSelectionProvider selectionProvider);
}

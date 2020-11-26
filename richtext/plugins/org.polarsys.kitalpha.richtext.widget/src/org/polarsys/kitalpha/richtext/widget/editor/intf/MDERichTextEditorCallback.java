/*******************************************************************************
 * Copyright (c) 2017, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.editor.intf;

import org.polarsys.kitalpha.richtext.common.intf.MDERichTextWidget;

/**
 * @author Faycal Abka
 *
 */
public interface MDERichTextEditorCallback {

	void saveWorkspaceResource(MDERichTextWidget widget);

	boolean isWorkspaceResourceDirty(MDERichTextWidget widget);

	/**
	 * 
	 * Register the widget as a listener for the save of workspace resource.
	 */
	void registerWorkspaceResourceSaveListener(MDERichTextWidget widget);
}

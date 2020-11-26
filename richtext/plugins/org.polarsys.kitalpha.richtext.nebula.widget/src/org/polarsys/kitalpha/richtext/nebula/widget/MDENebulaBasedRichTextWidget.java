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
package org.polarsys.kitalpha.richtext.nebula.widget;

import java.net.URL;

import org.polarsys.kitalpha.richtext.common.intf.BrowserBasedMDERichTextWidget;
import org.polarsys.kitalpha.richtext.common.intf.MDERichTextWidget;
import org.polarsys.kitalpha.richtext.nebula.widget.toolbar.MDERichTextToolbarItemHandler;

/**
 * 
 * @author Faycal Abka
 *
 */
public interface MDENebulaBasedRichTextWidget extends BrowserBasedMDERichTextWidget, MDERichTextWidget {

	public void addToolbarItem(String name, String command, String label, String toolbar, URL iconPath,
			MDERichTextToolbarItemHandler handler);

	public void addToolbarItem(MDERichTextWidget richtext, String name, String command, String label, String toolbar,
			URL iconPath, MDERichTextToolbarItemHandler handler);

	public void addToolbarItem(MDERichTextWidget richtext, String name, String command, String label, String toolbar,
			URL iconPath);

	public void setDirtyStateUpdated(boolean dirtyStateUpdated);

	public boolean isDirtyStateUpdated();
	
	public boolean isEditorDisposed();

}

/*******************************************************************************
 * Copyright (c) 2017, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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
	
	void addToolbarItem(String name, String command, String label, String toolbar, URL iconPath, MDERichTextToolbarItemHandler handler);
	
	void addToolbarItem(MDERichTextWidget richtext, String name, String command, String label, String toolbar, URL iconPath, MDERichTextToolbarItemHandler handler);
	
	void addToolbarItem(MDERichTextWidget richtext, String name, String command, String label, String toolbar, URL iconPath);

}

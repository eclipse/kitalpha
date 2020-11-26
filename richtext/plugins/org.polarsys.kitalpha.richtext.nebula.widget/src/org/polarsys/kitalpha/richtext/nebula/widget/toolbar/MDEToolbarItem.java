/*******************************************************************************
 * Copyright (c) 2017, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.nebula.widget.toolbar;

import java.net.URL;

import org.eclipse.nebula.widgets.richtext.toolbar.ToolbarButton;
import org.polarsys.kitalpha.richtext.common.intf.MDERichTextWidget;

/**
 * 
 * @author Faycal Abka
 *
 */
public class MDEToolbarItem extends ToolbarButton {

	private final MDERichTextToolbarItemHandler handler;
	private final MDERichTextWidget richText;
	
	public MDEToolbarItem(MDERichTextWidget richtext, String name, String command, String label, String toolbar, URL iconPath, MDERichTextToolbarItemHandler handler) {
		super(name, command, label, toolbar, iconPath);
		this.richText = richtext;
		this.handler = handler;
	}
	

	@Override
	public final String getJavascriptToExecute() {
		return null;
	}
	
	@Override
	public final Object execute() {
		if (handler != null){
			handler.execute(richText);
		}
		return super.execute();
	}

}

/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.nebula.widget.toolbar;

import java.net.URL;

import org.eclipse.kitalpha.richtext.common.intf.MDERichTextWidget;
import org.eclipse.nebula.widgets.richtext.toolbar.ToolbarButton;

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

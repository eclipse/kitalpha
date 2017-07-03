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
package org.polarsys.kitalpha.richtext.mde.tools.links.handlers;

import org.eclipse.kitalpha.richtext.common.intf.MDERichTextWidget;
import org.eclipse.swt.widgets.Display;
import org.polarsys.kitalpha.richtext.mde.tools.dialogs.MDEAddLinkDialog;
import org.polarsys.kitalpha.richtext.mde.tools.managers.LinksManagerImpl;
import org.polarsys.kitalpha.richtext.nebula.widget.toolbar.MDERichTextToolbarItemHandler;

/**
 * 
 * @author Faycal Abka
 *
 */
public class AddLinkHandler implements MDERichTextToolbarItemHandler {

	@Override
	public void execute(MDERichTextWidget richText) {
		MDEAddLinkDialog dialog = new MDEAddLinkDialog(Display.getCurrent().getActiveShell(), richText, new LinksManagerImpl());
		dialog.open();
	}

}

/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.tools.handlers;

import org.eclipse.swt.widgets.Display;
import org.polarsys.kitalpha.richtext.common.intf.MDERichTextWidget;
import org.polarsys.kitalpha.richtext.nebula.widget.toolbar.MDERichTextToolbarItemHandler;
import org.polarsys.kitalpha.richtext.widget.tools.dialogs.MDEAddLinkDialog;
import org.polarsys.kitalpha.richtext.widget.tools.manager.LinkManagerImpl;

/**
 * 
 * @author Faycal Abka
 *
 */
public class AddLinkHandler implements MDERichTextToolbarItemHandler {

	@Override
	public void execute(MDERichTextWidget richText) {
		MDEAddLinkDialog dialog = new MDEAddLinkDialog(Display.getCurrent().getActiveShell(), richText, new LinkManagerImpl(richText));
		dialog.open();
	}

}

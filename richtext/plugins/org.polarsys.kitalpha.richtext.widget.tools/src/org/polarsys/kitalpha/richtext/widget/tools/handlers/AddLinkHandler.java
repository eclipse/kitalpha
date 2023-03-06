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
package org.polarsys.kitalpha.richtext.widget.tools.handlers;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Display;
import org.polarsys.kitalpha.richtext.common.intf.MDERichTextWidget;
import org.polarsys.kitalpha.richtext.nebula.widget.toolbar.MDERichTextToolbarItemHandler;
import org.polarsys.kitalpha.richtext.widget.tools.dialogs.MDELinkDialog;
import org.polarsys.kitalpha.richtext.widget.tools.manager.LinkManagerImpl;
import org.polarsys.kitalpha.richtext.widget.tools.messages.Messages;

/**
 * 
 * @author Faycal Abka
 *
 */
public class AddLinkHandler implements MDERichTextToolbarItemHandler {

	@Override
	public void execute(MDERichTextWidget richText) {
    MDELinkDialog linkDialog = new MDELinkDialog(Display.getCurrent().getActiveShell(), richText.getElement(),
        richText.getSelectedText(), Messages.RichTextWidget_Dialog_Add_Link, new LinkManagerImpl(richText));
    if (linkDialog.open() == Dialog.OK) {
      String encodedString = linkDialog.getEncodedURL();
      richText.insertRawText(encodedString);
      richText.forceFocus();
    }
	}
}

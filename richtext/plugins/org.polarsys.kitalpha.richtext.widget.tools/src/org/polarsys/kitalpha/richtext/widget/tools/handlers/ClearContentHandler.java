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

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.richtext.common.intf.MDERichTextWidget;
import org.polarsys.kitalpha.richtext.nebula.widget.toolbar.MDERichTextToolbarItemHandler;
import org.polarsys.kitalpha.richtext.widget.tools.messages.Messages;

/**
 * Clear the content of the editor item
 * 
 * @author Faycal Abka
 *
 */
public class ClearContentHandler implements MDERichTextToolbarItemHandler {

	@Override
	public void execute(MDERichTextWidget richText) {
		
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		MessageDialog message = new MessageDialog(shell, Messages.RichTextWidget_Dialgo_Title_Clear, null, 
				Messages.RichTextWidget_Dialgo_Title_Clear_Question,  MessageDialog.QUESTION, new String[]{
                IDialogConstants.YES_LABEL, 
                IDialogConstants.NO_LABEL
                },
            0);
		
		int answer = message.open();
		
		switch (answer) {
		case 0:
			richText.setText("");
			break;
		case 1:
			break;
		default:
			break;
		}
	}

}

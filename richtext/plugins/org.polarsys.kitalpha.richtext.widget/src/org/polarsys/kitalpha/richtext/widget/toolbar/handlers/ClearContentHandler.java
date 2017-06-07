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
package org.polarsys.kitalpha.richtext.widget.toolbar.handlers;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.richtext.widget.messages.Messages;
import org.polarsys.kitalpha.richtext.widget.spi.MDERichTextToolbarItemHandler;
import org.polarsys.kitalpha.richtext.widget.spi.MDERichTextWidget;

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

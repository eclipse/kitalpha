/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.core.data.error;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.nebula.widgets.nattable.edit.config.DialogErrorHandling;
import org.eclipse.nebula.widgets.nattable.selection.SelectionLayer.MoveDirectionEnum;
import org.eclipse.swt.widgets.Display;

/**
 * A class implementing a tandard warning Dialog with no "Discard" option.
 * 
 * @author Sandu Postaru
 *
 */
public class CustomDialogErrorHandling extends DialogErrorHandling {

  /**
   * Standard warning Dialog with no "Discard" option.
   */
  @Override
  protected void showWarningDialog(String dialogMessage, String dialogTitle) {
    if (!isWarningDialogActive() && dialogMessage != null) {
      // remove the discard button
      String[] buttonLabels = this.allowCommit ? new String[] { getChangeButtonLabel(), getCommitButtonLabel() }
          : new String[] { getChangeButtonLabel() };

      MessageDialog warningDialog = new MessageDialog(Display.getDefault().getActiveShell(), dialogTitle, null,
          dialogMessage, MessageDialog.WARNING, buttonLabels, 0);

      // if discard was selected close the editor
      int returnCode = warningDialog.open();
      if (returnCode == 1) {
        this.editor.close();
      }
      // if commit was selected, commit the value by skipping the
      // validation
      else if (returnCode == 2) {
        this.editor.commit(MoveDirectionEnum.NONE, true, true);
      }
    }
  }
}

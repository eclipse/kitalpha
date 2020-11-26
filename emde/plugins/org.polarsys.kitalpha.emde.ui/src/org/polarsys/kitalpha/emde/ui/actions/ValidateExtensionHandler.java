/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.ui.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.ui.dialogs.DiagnosticDialog;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.polarsys.kitalpha.emde.extension.utils.Log;
import org.polarsys.kitalpha.emde.model.ExtensionValidationHelper;

public class ValidateExtensionHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection ss = (IStructuredSelection)HandlerUtil.getCurrentSelection(event);
		try {
			BasicDiagnostic diagnostic = ExtensionValidationHelper.visit(ss.toList());
			displayResult(diagnostic);
			String fullMessage = toString(new StringBuilder(), diagnostic).toString();
			if (diagnostic.getSeverity() == Diagnostic.ERROR) {
				Log.getDefault().logError(fullMessage);
			} else if (diagnostic.getSeverity() == Diagnostic.WARNING) {
				Log.getDefault().logError(fullMessage);
			}
			Log.getDefault().logInfo(fullMessage);
		} catch (CoreException e) {
			Log.getDefault().logError(e);
		}
		return null;
	}

	StringBuilder toString(StringBuilder sb, Diagnostic diagnostic) {
		sb.append(diagnostic.getMessage());
		if (!diagnostic.getData().isEmpty()) {
			sb.append(" on element ");
			for (Object obj : diagnostic.getData()) {
				if (obj instanceof ENamedElement) {
					sb.append("'").append(((ENamedElement) obj).getName()).append("' ");
				}
			}
		}
		sb.append("\n");
		for (Diagnostic diag : diagnostic.getChildren()) {
			toString(sb, diag);
		}

		return sb;
	}

	private void displayResult(Diagnostic diagnostic) {
		String title = "Validation Result";
		if (diagnostic.getSeverity() == Diagnostic.ERROR) {
			DiagnosticDialog.openProblem(PlatformUI.getWorkbench().getDisplay().getActiveShell(), title, "The extension declaration contains some errors", diagnostic);
		} else {
			MessageDialog.openInformation(PlatformUI.getWorkbench().getDisplay().getActiveShell(), title, "The extension declaration contains no errors");
		}

	}

}

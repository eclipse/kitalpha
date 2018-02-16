/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.accuracy.ui.internal.handlers;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import org.polarsys.kitalpha.validation.configurer.ConfigurerException;
import org.polarsys.kitalpha.validation.configurer.IConstraintConfigurer;
import org.polarsys.kitalpha.accuracy.ui.AccuracyUIMessages;
import org.polarsys.kitalpha.accuracy.ui.AccuracyUIPlugin;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class ApplyConfigurationHandler extends AbstractHandler {

	/**
	 * The constructor.
	 */
	public ApplyConfigurationHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IFile selectedProperties = getSelectedFile(HandlerUtil
				.getCurrentSelection(event));
		Shell shell = HandlerUtil.getActiveShell(event);

		if (selectedProperties != null) {
			Properties properties = new Properties();
			try {
				InputStream in = selectedProperties.getContents();
				try {
					properties.load(in);
				} catch (IOException e) {
					popupProblem(e, shell);
					throw new ExecutionException(e.getMessage(), e);
				} finally {
					try {
						in.close();
					} catch (IOException e) {
						// silent catch
					}
				}

			} catch (CoreException e) {
				popupProblem(e, shell);
				throw new ExecutionException(e.getMessage(), e);
			}

			try {
				IConstraintConfigurer.INSTANCE.configure(properties);
			} catch (ConfigurerException e) {
				popupProblem(e, shell);
				throw new ExecutionException(e.getMessage(), e);
			}
			popupSuccess(shell);
		}
		return null;
	}

	private void popupProblem(Exception e, Shell shell) {
		MessageDialog
				.openError(
						shell,
						AccuracyUIMessages
								.getString(AccuracyUIMessages.ACCURACY_ERROR_APPLYINGCONFIGURATION),
						e.getMessage());
		IStatus status = new Status(
				IStatus.ERROR,
				AccuracyUIPlugin.PLUGIN_ID,
				AccuracyUIMessages
						.getString(AccuracyUIMessages.ACCURACY_ERROR_APPLYINGCONFIGURATION),
				e);
		AccuracyUIPlugin.getDefault().getLog().log(status);
	}

	private void popupSuccess(Shell shell) {
		MessageDialog
				.openInformation(
						shell,
						AccuracyUIMessages
								.getString(AccuracyUIMessages.ACCURACY_CONFIGURATIONAPPLIED_TITLE),
						AccuracyUIMessages
								.getString(AccuracyUIMessages.ACCURACY_CONFIGURATIONAPPLIED_MESSAGE));
	}

	private IFile getSelectedFile(ISelection currentSelection) {
		if (currentSelection instanceof StructuredSelection) {
			Object o = ((StructuredSelection) currentSelection)
					.getFirstElement();
			if (o instanceof IFile) {
				return (IFile) o;
			} else if (o instanceof IAdaptable) {
				IAdaptable adaptable = (IAdaptable) o;
				Object adapted = adaptable.getAdapter(IFile.class);
				if (adapted instanceof IFile) {
					return (IFile) adaptable;
				} else {
					adapted = Platform.getAdapterManager().getAdapter(o,
							IFile.class);
					if (adapted instanceof IFile) {
						return (IFile) adapted;
					}
				}
			}
		}
		return null;
	}
}

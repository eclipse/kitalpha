/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.report.ui.dialogs;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.report.model.LogEntry;
import org.polarsys.kitalpha.report.ui.views.ReportsView;
import org.polarsys.kitalpha.report.utils.ReportFactory;

/**
 * @author Thomas Guiu
 * 
 */
public class ReportDialog extends MessageDialog {

	private LogEntry entry;

	private ReportDialog(Shell parentShell, LogEntry entry, int dialogImageType, String[] dialogButtonLabels, int defaultIndex) {
		super(parentShell, JFaceResources.getString("Problem_Occurred"), null, ReportHelper.getSummary(entry), dialogImageType, dialogButtonLabels, defaultIndex);
		this.entry = entry;
	}

	public static void openError(Shell parent, LogEntry entry) {
		open(ERROR, parent, entry, SWT.NONE);
	}

	@Override
	protected Control createCustomArea(Composite parent) {
		Composite bar = new Composite(parent, SWT.NONE);
		bar.setLayoutData(new GridData(GridData.FILL_BOTH));
		bar.setLayout(new GridLayout(2, false));

		Link link = new Link(bar, SWT.None);
		link.setText("<a>Show details in report view</a>");
		link.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					ReportsView view = (ReportsView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("org.polarsys.kitalpha.report.ui.views.reportsview");
					view.selectAndReveal(entry);
				} catch (PartInitException e1) {
					ReportFactory.INSTANCE.logError(e1);
				}
				close();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		bar.setFocus();
		return bar;
	}

	/*
	 * Copied from super class
	 */
	public static boolean open(int kind, Shell parent, LogEntry entry, int style) {
		ReportDialog dialog = new ReportDialog(parent, entry, kind, getButtonLabels(kind), 0);
		style &= SWT.SHEET;
		dialog.setShellStyle(dialog.getShellStyle() | style);
		return dialog.open() == 0;
	}

	/*
	 * Copied from super class
	 */
	static String[] getButtonLabels(int kind) {
		String[] dialogButtonLabels;
		switch (kind) {
		case ERROR:
		case INFORMATION:
		case WARNING: {
			dialogButtonLabels = new String[] { IDialogConstants.OK_LABEL };
			break;
		}
		case CONFIRM: {
			dialogButtonLabels = new String[] { IDialogConstants.OK_LABEL, IDialogConstants.CANCEL_LABEL };
			break;
		}
		case QUESTION: {
			dialogButtonLabels = new String[] { IDialogConstants.YES_LABEL, IDialogConstants.NO_LABEL };
			break;
		}
		case QUESTION_WITH_CANCEL: {
			dialogButtonLabels = new String[] { IDialogConstants.YES_LABEL, IDialogConstants.NO_LABEL, IDialogConstants.CANCEL_LABEL };
			break;
		}
		default: {
			throw new IllegalArgumentException("Illegal value for kind in MessageDialog.open()"); //$NON-NLS-1$
		}
		}
		return dialogButtonLabels;
	}

}

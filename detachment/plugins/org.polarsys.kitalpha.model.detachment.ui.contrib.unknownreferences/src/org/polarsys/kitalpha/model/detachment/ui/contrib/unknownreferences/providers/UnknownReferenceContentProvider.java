/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.detachment.ui.contrib.unknownreferences.providers;

import java.util.ArrayList;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IFeedback;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IFeedback.IFeedbackMessage;

/**
 * @author Faycal Abka
 */
public class UnknownReferenceContentProvider extends LabelProvider implements ITableLabelProvider, IStructuredContentProvider {

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	@Override
	public Object[] getElements(Object inputElement) {
		ArrayList<IFeedbackMessage> elements = new ArrayList<IFeedbackMessage>();

		if (inputElement instanceof IFeedback) { 

			for (IFeedbackMessage iFeedbackMessage : ((IFeedback)inputElement).getFeedbackMessages()) {
				elements.add(iFeedbackMessage);
			}
		}
		return elements.toArray();
	}

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		if (element instanceof IFeedbackMessage) {
			IFeedbackMessage feedbackMessage = (IFeedbackMessage) element;
			switch (feedbackMessage.getLevel()) {
			case DEBUG:
				return Display.getDefault().getSystemImage(SWT.ICON_SEARCH);
			case ERROR:
				return JFaceResources.getImage(Dialog.DLG_IMG_MESSAGE_ERROR);
			case INFO:
				return JFaceResources.getImage(Dialog.DLG_IMG_MESSAGE_INFO);
			case WARNING:
				return JFaceResources.getImage(Dialog.DLG_IMG_MESSAGE_WARNING);
			}
		}
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		if (element instanceof IFeedbackMessage) {
			IFeedbackMessage feedbackMessage = (IFeedbackMessage) element;
			return feedbackMessage.getMessage();
		}
		return null;
	}

}

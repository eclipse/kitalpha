/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.services.detachment.ui.pages.providers;

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
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.IFeedback;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.IFeedback.IFeedbackMessage;

/**
 * @author Matthieu Helleboid
 */
public class FinderResultContentProvider extends LabelProvider implements ITableLabelProvider, IStructuredContentProvider {

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		
		//TODO: The implementation
		
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

}

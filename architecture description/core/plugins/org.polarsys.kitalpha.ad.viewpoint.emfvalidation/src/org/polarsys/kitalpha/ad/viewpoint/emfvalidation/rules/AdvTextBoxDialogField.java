/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.emfvalidation.rules;

import org.eclipse.jdt.internal.ui.wizards.dialogfields.TextBoxDialogField;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;


public class AdvTextBoxDialogField extends TextBoxDialogField {
	@Override
	protected Text createTextControl(Composite parent) {
		Text text = new Text(parent, SWT.MULTI | SWT.BORDER | SWT.WRAP);
		text.addTraverseListener(new TraverseListener() {
			@Override
			public void keyTraversed(TraverseEvent event) {
				switch (event.detail) {
				case SWT.TRAVERSE_ESCAPE:
				case SWT.TRAVERSE_PAGE_NEXT:
				case SWT.TRAVERSE_PAGE_PREVIOUS:
					event.doit = true;
					break;
				case SWT.TRAVERSE_RETURN:
				case SWT.TRAVERSE_TAB_NEXT:
				case SWT.TRAVERSE_TAB_PREVIOUS:
					if ((event.stateMask & SWT.MODIFIER_MASK) != 0) {
						event.doit = true;
					}
					break;
				default:
				}

			}
		});
		return text;
	}
}
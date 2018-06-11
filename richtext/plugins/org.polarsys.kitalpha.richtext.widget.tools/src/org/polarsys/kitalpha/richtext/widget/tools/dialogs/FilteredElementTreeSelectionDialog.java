/*******************************************************************************
 * Copyright (c) 2017, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.tools.dialogs;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.PatternFilter;
import org.polarsys.kitalpha.richtext.widget.tools.messages.Messages;

/**
 * Dialog to select from tree element with filtering option
 *
 */
public class FilteredElementTreeSelectionDialog extends ElementTreeSelectionDialog implements ModifyListener {

	  protected PatternFilter viewerFilter;
	  protected Text filterTextField;

	  /**
	   * @param parent
	   * @param labelProvider
	   * @param contentProvider
	   */
	  public FilteredElementTreeSelectionDialog(Shell parent, ILabelProvider labelProvider, ITreeContentProvider contentProvider) {
	    super(parent, labelProvider, contentProvider);

	    viewerFilter = new PatternFilter();
	    addFilter(viewerFilter);
	  }

	  /**
	   * @see org.eclipse.ui.dialogs.SelectionDialog#createMessageArea(org.eclipse.swt.widgets.Composite)
	   */
	  @Override
	  protected Label createMessageArea(Composite composite) {
	    Group filterGroup = new Group(composite, SWT.NONE);
	    filterGroup.setText(Messages.RichTextWidget_Dialog_Filter);
	    filterGroup.setLayout(new GridLayout());
	    filterGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

	    Label label = new Label(filterGroup, SWT.NONE);
	    label.setText(Messages.RichTextWidget_Dialog_Filter);

	    filterTextField = new Text(filterGroup, SWT.NONE);
	    filterTextField.addModifyListener(this);
	    filterTextField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

	    return super.createMessageArea(composite);
	  }

	  /**
	   * @see org.eclipse.swt.events.ModifyListener#modifyText(org.eclipse.swt.events.ModifyEvent)
	   */
	  @Override
	public void modifyText(ModifyEvent e) {
	    viewerFilter.setPattern(filterTextField.getText());
	    getTreeViewer().refresh();
	  }

}

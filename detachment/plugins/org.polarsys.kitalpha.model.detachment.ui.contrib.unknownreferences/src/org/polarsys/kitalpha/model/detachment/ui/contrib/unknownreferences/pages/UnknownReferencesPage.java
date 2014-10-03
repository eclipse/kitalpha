/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.detachment.ui.contrib.unknownreferences.pages;



import java.util.Collection;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.feedback.Feedback;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IFeedback;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IScrutinize;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IFeedback.IFeedbackMessage;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry.RegistryElement;
import org.polarsys.kitalpha.model.detachment.ui.contrib.unknownreferences.Messages;
import org.polarsys.kitalpha.model.detachment.ui.contrib.unknownreferences.providers.UnknownReferenceContentProvider;
import org.polarsys.kitalpha.model.detachment.ui.page.AbstractDetachmentFormPage;

/**
 * @author Faycal Abka
 */
public class UnknownReferencesPage extends AbstractDetachmentFormPage {

	private TableViewer tableViewer;
	private Table table;
	private UnknownReferenceContentProvider contentProvider;
	
	
	public UnknownReferencesPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
	}
	
	@Override
	protected void createFormContent(IManagedForm managedForm) {
//		final FormToolkit tk = managedForm.getToolkit();
		final ScrolledForm scrolledForm = managedForm.getForm();
		
		scrolledForm.setText(Messages.UNKNOWN_REFERENCES);
		
		Composite composite = scrolledForm.getBody();
		
		
		
		composite.setLayout(new GridLayout(1, false));
		tableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.heightHint = 140;
		table.setLayoutData(gridData);
		
		new Label(composite, SWT.None);
		new Label(composite, SWT.None);
		
		
		
		contentProvider = new UnknownReferenceContentProvider();
		tableViewer.setContentProvider(contentProvider);
		tableViewer.setLabelProvider(contentProvider);
		
		RegistryElement regElt = ModelScrutinyRegistry.INSTANCE.getRegistryElement(getFinderID());
		IFeedback unknownReferences = collectUnknownReferences(regElt);
		
		
		tableViewer.setInput(unknownReferences);
		
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private IFeedback collectUnknownReferences(RegistryElement regElt) {
		Collection<IScrutinize> unknownRefFinders = regElt.getFinders();
		IFeedback feedback = new Feedback();
		for (IScrutinize iFinder : unknownRefFinders) {
			Object feedBackResult = iFinder.getFeedbackAnalysisMessages();
			if (feedBackResult instanceof Collection){
				Collection<IFeedbackMessage> messages = (Collection<IFeedbackMessage>) feedBackResult;
				for (IFeedbackMessage fm : messages) {
					feedback.addFeedbackMessage(fm);
				}
			}
		}
		
		return feedback;
	}
}

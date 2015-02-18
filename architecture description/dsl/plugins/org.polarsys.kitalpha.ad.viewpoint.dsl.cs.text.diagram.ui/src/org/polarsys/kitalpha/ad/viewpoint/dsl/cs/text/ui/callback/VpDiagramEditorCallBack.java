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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.callback;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.jface.text.contentassist.ContentAssistEvent;
import org.eclipse.jface.text.contentassist.ICompletionListener;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.template.TemplateInterceptor;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.template.VpdiagramTemplateProposalProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.diagram.template.TemplateWizardAction;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.diagram.template.observer.IObserver;


/**
 * 
 * @author Faycal Abka
 *
 */
public class VpDiagramEditorCallBack extends CommonEditorCallback {

	private ICompletionListener autoCompletionListener = null;

	private Listener autoCompletionSelectionListener = null;

	private String selectedProposal = null;

	private boolean contentAssistOn = false;
	
	//TODO move to messages.prop
	private static String VpdiagramEditorCallBack_NewAccelerationDiagram = "New Diagram - Generate Diagrams for all classes";


	
	@Override
	public void afterCreatePartControl(XtextEditor editor) {
		super.afterCreatePartControl(editor);
		installCompletionListener();
	}
	
	private void installCompletionListener() {
		if (currentEditor != null) {
			
			
			final XtextSourceViewer viewer = (XtextSourceViewer) currentEditor.getInternalSourceViewer();
			
			autoCompletionListener = new ICompletionListener() {
				public void selectionChanged(ICompletionProposal proposal, boolean smartToggle) {
					selectedProposal = proposal.getDisplayString();
				}
				public void assistSessionStarted(ContentAssistEvent event) {
					contentAssistOn = true;
				}
				public void assistSessionEnded(ContentAssistEvent event) {
					if (selectedProposal != null) {
						applySelectedProposal();
						selectedProposal = null;
					}
					contentAssistOn = false;
				}
			};			
			viewer.getContentAssistantFacade().addCompletionListener(autoCompletionListener);				
			/*
			 * ICompletionProposal.selectionChanged(...) is not called when a proposal is selected using the mouse 
			 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=316745 (non-Javadoc)
			 * @see org.eclipse.jface.text.contentassist.ICompletionListener#selectionChanged(org.eclipse.jface.text.contentassist.ICompletionProposal, boolean)
			 */
			autoCompletionSelectionListener = new Listener() {
				@Override
				public void handleEvent(Event event) {
					if (contentAssistOn) {
						Widget item = event.item;
						if (item instanceof TableItem) {
							selectedProposal = ((TableItem)item).getText();
						}
					}
				}
			};
			viewer.getControl().getDisplay().addFilter(SWT.Selection, autoCompletionSelectionListener);
		}
	}
	
	
	private void applySelectedProposal() {
		if (selectedProposal.equals(VpdiagramEditorCallBack_NewAccelerationDiagram)){
			TemplateInterceptor interceptor = VpdiagramTemplateProposalProvider.getInterceptor();
			interceptor.getTemplate().setPattern("");
			Wizard wizard = TemplateWizardAction.createWizardDialog();
			TemplateWizardAction.registerObserver(wizard, interceptor);
			TemplateWizardAction.openAndInitWizard(wizard, interceptor.getClasses());
			
		}
	}
		
}

/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.callback;

import org.eclipse.jface.text.contentassist.ContentAssistEvent;
import org.eclipse.jface.text.contentassist.ICompletionListener;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
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
	public void afterCreatePartControl(final XtextEditor editor) {
		super.afterCreatePartControl(editor);
		installCompletionListener();
	}

	private void installCompletionListener() {
		if (getCurrentEditor() != null) {
			final XtextSourceViewer viewer = (XtextSourceViewer) getCurrentEditor().getInternalSourceViewer();

			autoCompletionListener = new ICompletionListener() {
				@Override
				public void selectionChanged(final ICompletionProposal proposal, final boolean smartToggle) {
					selectedProposal = proposal.getDisplayString();
				}
				@Override
				public void assistSessionStarted(final ContentAssistEvent event) {
					contentAssistOn = true;
				}
				@Override
				public void assistSessionEnded(final ContentAssistEvent event) {
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
				public void handleEvent(final Event event) {
					if (contentAssistOn) {
						final Widget item = event.item;
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
			final TemplateInterceptor interceptor = VpdiagramTemplateProposalProvider.getInterceptor();
			interceptor.getTemplate().setPattern("");
			final Wizard wizard = TemplateWizardAction.createWizardDialog();
			TemplateWizardAction.registerObserver(wizard, interceptor);
			TemplateWizardAction.openAndInitWizard(wizard, interceptor.getClasses());

		}
	}

}

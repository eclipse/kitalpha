/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.vp.componentsample.activity.explorer.page;


import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.CommonActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.polarsys.kitalpha.richtext.common.intf.MDERichTextWidget;
import org.polarsys.kitalpha.richtext.common.intf.SaveStrategy;
import org.polarsys.kitalpha.richtext.widget.factory.MDERichTextFactory;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage;

public class DocumentationPagePage extends CommonActivityExplorerPage {

	private MDERichTextWidget richtextWidget;

	protected String getViewpointID() {
		return "org.polarsys.kitalpha.vp.componentsample"; //$NON-NLS-1$
	}

	@Override
	protected void createFormContent(final IManagedForm managedForm_p) {
		super.createFormContent(managedForm_p);
		Composite parent = managedForm_p.getForm().getForm().getBody();
		parent.setLayout(new GridLayout(1, true));
		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		MDERichTextFactory factory = new MDERichTextFactory();
		richtextWidget = factory.setToolbarColor("#EEEEFF").createDefaultRichTextWidget(parent);

		bindWidget(richtextWidget);

		richtextWidget.setSaveStrategy(new SaveStrategy() {

			@Override
			public void save(String editorText, EObject owner, EStructuralFeature feature) {
				TransactionalEditingDomain ted = TransactionUtil.getEditingDomain(owner);
				Command set = SetCommand.create(ted, owner, feature, editorText);
				ted.getCommandStack().execute(set);
			}
		});

		richtextWidget.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				richtextWidget.saveContent();
			}
		});
		
		/**
		 * TODO synchronization between editors!
		 */
//		richtextWidget.addFocusListener(new FocusAdapter() {
//			@Override
//			public void focusGained(FocusEvent e) {
//				Object text = richtextWidget.getElement().eGet(richtextWidget.getFeature());
//				String oldValue = richtextWidget.getText();
//
//				String value = (String)((text instanceof String)? text: ""); //$NON-NLS-1$
//				if (value != null && !value.equals(oldValue) && !getEditor().isDirty()){ 
//					richtextWidget.loadContent();
//				}
//			}
//		});
	}

	private void bindWidget(MDERichTextWidget richtextWidget) {
		EObject owner = ActivityExplorerManager.INSTANCE.getRootSemanticModel();
		richtextWidget.bind(owner, ComponentSamplePackage.Literals.COMPONENT_ELEMENT__DESCRIPTION);
	}
}

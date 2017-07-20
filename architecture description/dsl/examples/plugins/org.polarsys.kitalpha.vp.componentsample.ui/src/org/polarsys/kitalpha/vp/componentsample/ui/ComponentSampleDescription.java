/*******************************************************************************
 * Copyright (c)  2017 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.vp.componentsample.ui;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.kitalpha.richtext.common.intf.MDERichTextWidget;
import org.eclipse.kitalpha.richtext.common.intf.SaveStrategy;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.polarsys.kitalpha.richtext.widget.factory.MDERichTextFactory;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ComponentSampleDescription extends AbstractPropertySection {

	private MDERichTextWidget richtextWidget;
	
	private final ISelectionListener selectionListener = new ISelectionListener() {

		@Override
		public void selectionChanged(IWorkbenchPart part, ISelection selection) {
			richtextWidget.saveContent();
		}
	};

	public ComponentSampleDescription() {
	}

	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		parent.setLayout(new GridLayout(1, true));
		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		richtextWidget = (new MDERichTextFactory()).createMinimalRichTextWidget(parent);

		richtextWidget.setSaveStrategy(new SaveStrategy() {
			@Override
			public void save(String editorText, EObject owner, EStructuralFeature feature) {
				TransactionalEditingDomain ted = TransactionUtil.getEditingDomain(owner);
				Command set = SetCommand.create(ted, owner, feature, editorText);
				CommandStack stack = ted.getCommandStack();
				stack.execute(set);
			}
		});

		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService()
				.addSelectionListener(selectionListener);
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		bind(selection);
	}

	private void bind(ISelection selection) {
		EObject owner = null;
		if (selection instanceof TreeSelection) {
			owner = (EObject) ((TreeSelection) selection).getFirstElement();
		}
		if (selection instanceof StructuredSelection) {
			Object selectedElement = ((StructuredSelection) selection).getFirstElement();
			if (selectedElement instanceof GraphicalEditPart) {

				EObject semanticElement = ((GraphicalEditPart) selectedElement).resolveSemanticElement();
				if (semanticElement instanceof DSemanticDiagram) {
					owner = ((DSemanticDiagram) semanticElement).getTarget();
				}
				if (semanticElement instanceof DRepresentationElement) {
					owner = ((DRepresentationElement) semanticElement).getTarget();
				}
			}
		}
		richtextWidget.bind(owner, ComponentSamplePackage.Literals.COMPONENT_ELEMENT__DESCRIPTION);
	}
	
	@Override
	public void dispose() {
		super.dispose();
		PlatformUI.getWorkbench().getActiveWorkbenchWindow()
			.getSelectionService().removeSelectionListener(selectionListener);
	}
}

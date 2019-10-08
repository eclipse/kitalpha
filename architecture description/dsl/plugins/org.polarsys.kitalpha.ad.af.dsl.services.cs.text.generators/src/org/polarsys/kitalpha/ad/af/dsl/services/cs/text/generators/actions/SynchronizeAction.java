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

package org.polarsys.kitalpha.ad.af.dsl.services.cs.text.generators.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.BaseSelectionListenerAction;
import org.polarsys.kitalpha.ad.af.dsl.services.cs.text.generators.Synchronizer;
import org.polarsys.kitalpha.ad.af.dsl.services.cs.text.generators.messages.Messages;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class SynchronizeAction extends BaseSelectionListenerAction implements IObjectActionDelegate{
	
	private ISelection selection;
	
	private Synchronizer delegate;
	
	public SynchronizeAction() {
		super(Messages.AFDSLActions_BackwardSynchronizer_GeneratorMessage);
	}
	
	protected SynchronizeAction(String text) {
		super(text);
	}
	
	@Override
	public void run(IAction action) {
		IStructuredSelection structuredSelection = (IStructuredSelection)selection;
		Object obj = structuredSelection.getFirstElement();
		IFile file = (IFile) Platform.getAdapterManager().getAdapter(obj, IFile.class);
		delegate = new Synchronizer();
		if (file != null)
		{
			delegate.doSynchronize(file);
		}
		else
		{
			MessageBox message = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
			message.setText("Error");
			message.setMessage("The command cannot retrieve the resouce from the selection");
			message.open();
		}
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		selection = targetPart.getSite().getWorkbenchWindow().getSelectionService().getSelection();
	}
}

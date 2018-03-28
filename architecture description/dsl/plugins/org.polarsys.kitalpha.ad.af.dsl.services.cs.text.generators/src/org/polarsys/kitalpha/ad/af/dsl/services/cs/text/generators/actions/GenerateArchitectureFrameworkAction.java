/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.af.dsl.services.cs.text.generators.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.BaseSelectionListenerAction;
import org.polarsys.kitalpha.ad.af.dsl.as.servicies.action.popup.GenerateArchitectureFramework;
import org.polarsys.kitalpha.ad.af.dsl.services.cs.text.generators.messages.Messages;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class GenerateArchitectureFrameworkAction extends BaseSelectionListenerAction implements IObjectActionDelegate {

	public static final String AFDESC_EXTENSION = "afdesc";
	
	private ISelection fakeSelection;
	IObjectActionDelegate delegate;
	
	
	public GenerateArchitectureFrameworkAction() {
		super(Messages.AFDSLActions_GenerateAFAction_DefaultTitle);
		delegate = new GenerateArchitectureFramework();
	}
	
	protected GenerateArchitectureFrameworkAction(String text) {
		super(text);
	}
	
	@Override
	public void run(IAction action) {
		IFile file = null;
		Iterator<?> iterator = ((StructuredSelection)fakeSelection).iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			if (object instanceof IFile) {
				file = (IFile) object;
				break;
			}
		}
		
		if (file != null)
		{
			IPath trimmed = file.getFullPath().removeFileExtension().removeFileExtension();
			IPath xmiPath = trimmed.addFileExtension(AFDESC_EXTENSION);
			IFile xmiFile = ResourcesPlugin.getWorkspace().getRoot().getFile(xmiPath);
			if (xmiFile.exists()) {
				fakeSelection = new StructuredSelection(xmiFile);
				delegate.selectionChanged(action, fakeSelection);
				delegate.run(action);
			}
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
		fakeSelection = targetPart.getSite().getWorkbenchWindow().getSelectionService().getSelection();	
	}
}

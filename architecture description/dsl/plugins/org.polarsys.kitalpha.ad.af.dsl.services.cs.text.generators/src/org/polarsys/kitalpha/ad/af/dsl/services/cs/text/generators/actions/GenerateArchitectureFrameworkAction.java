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

	private static final String GENERATE_AND_PACKAGE_CS_TEXT_AF_ACTION = 
			"org.polarsys.kitalpha.ad.af.dsl.generateAndPackageAF";  //$NON-NLS-1$
	
	/*
	 * Copied from: org.polarsys.kitalpha.ad.af.dsl.as.servicies.action.popup.GenerateArchitectureFramework
	 */
	private static final String GENERATE_AND_PACKAGE_AF_ACTION = 
			"org.polarsys.kitalpha.ad.af.dsl.servicies.action.generateAndPackageAF"; //$NON-NLS-1$
	
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
				/*
				 * Set real ID of action (used for packaging)
				 * see: https://bugs.polarsys.org/show_bug.cgi?id=2228
				 */
				String originalID = action.getId();
				if (GENERATE_AND_PACKAGE_CS_TEXT_AF_ACTION.equals(originalID)) {
					action.setId(GENERATE_AND_PACKAGE_AF_ACTION);
				}
				delegate.selectionChanged(action, fakeSelection);
				delegate.run(action);
				
				/*
				 * restore the ID
				 */
				action.setId(originalID);
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

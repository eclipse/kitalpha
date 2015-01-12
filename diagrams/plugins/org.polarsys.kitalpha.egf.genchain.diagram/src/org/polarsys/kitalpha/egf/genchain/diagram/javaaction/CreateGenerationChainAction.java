/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.egf.genchain.diagram.javaaction;

import java.util.Collection;
import java.util.Map;

import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChain;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChainFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.egf.genchain.diagram.message.Messages;

/**
 * @author Thomas Guiu, Boubekeur Zendagui
 * 
 */
public class CreateGenerationChainAction  extends AbstractExternalJavaAction  {
	private final static String CONTAINER = "container";//$NON-NLS-1$
//	private static final String TITLE = "New Generation Chain Model";//$NON-NLS-1$
//	private static final String MESSAGE = "Enter a name";//$NON-NLS-1$

	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		final Object o = parameters.get(CONTAINER);
		if (o instanceof GenerationChain) 
		{
			final GenerationChain gc = (GenerationChain) o;
//			TransactionalEditingDomain editingDomain = EditingDomainService.getInstance().getEditingDomainProvider().getEditingDomain();
			String title = Messages.CreateGenerationChainAction_input_title;
			String message = Messages.CreateGenerationChainAction_input_message;
			InputDialog dialog = new InputDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), title, message, "New Chain", null);
			if (dialog.open() == Window.OK) 
			{
				final String name = dialog.getValue();
				final GenerationChain child = GenerationChainFactory.eINSTANCE.createGenerationChain();
				RecordingCommand command = new RecordingCommand(editingDomain) {
					@Override
					protected void doExecute() {
						child.setName(name);
						gc.getElements().add(child);
					}
				};
				editingDomain.getCommandStack().execute(command);
			}
		}
	}

}

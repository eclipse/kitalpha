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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.egf.genchain.diagram.ui.wizard.NewElementWizard;



/**
 * @author Thomas Guiu, Boubekeur Zendagui
 * 
 */
public class AddElementAction extends AbstractExternalJavaAction{
	private final static String CONTAINER = "container";//$NON-NLS-1$

	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		final Object o = parameters.get(CONTAINER);
		if (o instanceof GenerationChain) 
		{
			final GenerationChain gc = (GenerationChain) o;
			NewElementWizard wizard = new NewElementWizard(gc);
			WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
			dialog.open();
		}
	}

}

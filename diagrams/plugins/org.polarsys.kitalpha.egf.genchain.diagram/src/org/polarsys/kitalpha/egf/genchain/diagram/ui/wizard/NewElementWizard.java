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
package org.polarsys.kitalpha.egf.genchain.diagram.ui.wizard;

import java.util.Set;

import org.eclipse.egf.portfolio.genchain.extension.ExtensionProperties;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChain;
import org.eclipse.egf.portfolio.genchain.tools.ui.wizards.EcoreModelPage;
import org.eclipse.egf.portfolio.genchain.tools.ui.wizards.GenerationChainFactory;
import org.eclipse.egf.portfolio.genchain.tools.ui.wizards.Node;
import org.eclipse.egf.portfolio.genchain.tools.ui.wizards.NodeTypes;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;

import org.polarsys.kitalpha.egf.genchain.diagram.message.Messages;

/**
 * @author Thomas Guiu, Boubekeur Zendagui
 */
public class NewElementWizard extends Wizard implements ExtensionProperties {

	private EcoreModelPage ecorePage;
	private final Node model = new Node(NodeTypes.ROOT);
	private final GenerationChain generationChain;

	public NewElementWizard(GenerationChain chain) {
		super();
		this.generationChain = chain;
	}

	public void addPages() {

		ecorePage = new KitalphaEcoreModelPage("ecore", generationChain, model);//$NON-NLS-1$
		ecorePage.setTitle(Messages.Element_wizard_title);
		ecorePage.setDescription(Messages.Element_wizard_content_description);
		addPage(ecorePage);
	}

	@Override
	public boolean performFinish() {
		final Session session = SessionManager.INSTANCE.getSession(this.generationChain);
		if (session != null)
		{
			TransactionalEditingDomain editingDomain = session.getTransactionalEditingDomain();
			RecordingCommand command = new RecordingCommand(editingDomain) {
				@Override
				protected void doExecute() {
					addNewChilds();
				}
			};
			editingDomain.getCommandStack().execute(command);
			return true;
		}
		else
		{
			throw new RuntimeException("Can't update generation chain");
		}
	}

	protected void addNewChilds() {
		Set<Node> checkedElements = ecorePage.getCheckedElements();
		for (Node container : model.getChildren())
			GenerationChainFactory.INSTANCE.createExtension(generationChain, container, checkedElements);
	}

	static String getModelName(String modelPath) {
		return modelPath.substring(modelPath.lastIndexOf('/') + 1, modelPath.lastIndexOf('.'));

	}
}

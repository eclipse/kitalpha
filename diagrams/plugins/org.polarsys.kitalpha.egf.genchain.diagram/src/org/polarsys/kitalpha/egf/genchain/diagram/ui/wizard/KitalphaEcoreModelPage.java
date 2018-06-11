/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.egf.genchain.diagram.ui.wizard;

import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChain;
import org.eclipse.egf.portfolio.genchain.tools.ui.wizards.EcoreModelPage;
import org.eclipse.egf.portfolio.genchain.tools.ui.wizards.Node;

/**
 * @author Thomas Guiu
 * 
 */
public class KitalphaEcoreModelPage extends EcoreModelPage {

	private String currentProject;

	public KitalphaEcoreModelPage(String pageName, GenerationChain chain, Node model) {
		super(pageName, model);
		currentProject = chain.eResource().getURI().segment(1);
	}

	@Override
	protected Node addEcore(String modelPath) {
		return addEcore(modelPath, currentProject);
	}

	@Override
	protected void newNodeAdded(Node newNode) {
		super.newNodeAdded(newNode);
		for (Node child : newNode.getChildren()) 
		{
			String id = child.getProperties().get(ID);
			if (id != null && id.contains("thales"))
			{
				viewer.setChecked(child, true);
			}
		}
	}
}

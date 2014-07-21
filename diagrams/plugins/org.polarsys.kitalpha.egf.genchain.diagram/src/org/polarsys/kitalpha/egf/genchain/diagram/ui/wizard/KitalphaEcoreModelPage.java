/**
 * 
 */
package org.polarsys.kitalpha.egf.genchain.diagram.ui.wizard;

import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChain;
import org.eclipse.egf.portfolio.genchain.tools.ui.wizards.EcoreModelPage;
import org.eclipse.egf.portfolio.genchain.tools.ui.wizards.Node;

/**
 * @author Thomas Guiu
 * 
 */
public class KitalphaEcoreModelPage extends EcoreModelPage {

//	private final GenerationChain chain;
	private String currentProject;

	public KitalphaEcoreModelPage(String pageName, GenerationChain chain, Node model) {
		super(pageName, model);
//		this.chain = chain;
		currentProject = chain.eResource().getURI().segment(1);
	}

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

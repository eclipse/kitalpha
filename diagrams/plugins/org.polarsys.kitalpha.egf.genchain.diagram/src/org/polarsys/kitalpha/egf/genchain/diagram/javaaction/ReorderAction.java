/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.egf.genchain.diagram.javaaction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChain;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChainPackage;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationElement;
import org.eclipse.egf.portfolio.genchain.tools.ui.wizards.Node;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.egf.genchain.diagram.ui.dialog.ReorderDialog;

/**
 * @author Thomas Guiu, Boubekeur Zendagui
 */

public class ReorderAction extends AbstractExternalJavaAction  {
	private final static String ID = "id";//$NON-NLS-1$

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		Object o = selections.iterator().next();
		if (o instanceof DSemanticDecorator)
		{
			o = ((DSemanticDecorator) o).getTarget();
		}
		
		if (o instanceof GenerationChain) 
		{
			final GenerationChain gc = (GenerationChain) o;
			Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			List<Node> nodes = new ArrayList<Node>(50);
			Map<String, GenerationElement> elements = new HashMap<String, GenerationElement>();
			for (GenerationElement elem : gc.getElements()) 
			{
				String id = "" + elem.hashCode();
				Node node = new Node(0);
				nodes.add(node);
				node.setName(elem.getName());
				node.getProperties().put(ID, id);
				elements.put(id, elem);
			}
			
			ReorderDialog dialog = new ReorderDialog(shell, nodes);
			if (dialog.open() == Window.OK) 
			{
				List<EObject> newList = new ArrayList<EObject> ();
				for (Node node : dialog.getModels()) 
				{
					String id = node.getProperties().get(ID);
					newList.add(elements.get(id));
				}
				ReorderingCommand reorderingCommand = new ReorderingCommand(editingDomain, gc, newList);
				editingDomain.getCommandStack().execute(reorderingCommand);

			}
		}
	}

	/**
	 * @author Thomas Guiu
	 */
	private static class ReorderingCommand extends RecordingCommand {
		private GenerationElement generationElement;
		private List<EObject> newList;

		public ReorderingCommand(TransactionalEditingDomain domain, GenerationElement generationElement, List<EObject> newList) {
			super(domain);
			this.generationElement = generationElement;
			this.newList = newList;
		}

		@Override
		protected void doExecute() {
			generationElement.eSet(GenerationChainPackage.Literals.GENERATION_CHAIN__ELEMENTS, newList);
		}

	}

}

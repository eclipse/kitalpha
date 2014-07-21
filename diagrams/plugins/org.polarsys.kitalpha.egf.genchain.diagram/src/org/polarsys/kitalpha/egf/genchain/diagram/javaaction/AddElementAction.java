/**
 * 
 */
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

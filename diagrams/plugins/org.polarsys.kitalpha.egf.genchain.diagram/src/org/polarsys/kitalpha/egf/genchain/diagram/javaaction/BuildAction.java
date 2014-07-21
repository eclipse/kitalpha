/**
 * 
 */
package org.polarsys.kitalpha.egf.genchain.diagram.javaaction;

import java.util.Collection;
import java.util.Map;

import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChain;
import org.eclipse.egf.portfolio.genchain.tools.ui.actions.BuildApplicationHelper;
import org.eclipse.emf.ecore.EObject;

/**
 * @author Thomas Guiu, Boubekeur Zendagui
 * 
 */
public class BuildAction extends AbstractExternalJavaAction {

	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		final Object o = selections.iterator().next();
		if (o instanceof GenerationChain) 
		{
			final GenerationChain gc = (GenerationChain) o;
			BuildApplicationHelper.INSTANCE.build(gc.eResource().getURI());
		}
	}

}

package org.polarsys.kitalpha.emde.diagram.javaaction;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.tools.api.editing.EditingDomainFactoryService;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * @author Boubekeur Zendagui
 */

public abstract class AbstractEmdeExternalJavaAction implements IExternalJavaAction {

	protected static final TransactionalEditingDomain editingDomain = EditingDomainFactoryService.INSTANCE.getEditingDomainFactory().createEditingDomain();
	
	@Override
	public abstract void execute(Collection<? extends EObject> selections, Map<String, Object> parameters);

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}

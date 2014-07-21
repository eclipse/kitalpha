package org.polarsys.kitalpha.ecore.diagram.service;

import java.util.Collection;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DSemanticDiagram;

/**
 * @author Boubekeur Zendagui
 */
public class EcoreActionsServices {
	public EcoreActionsServices() {
		super();
	}

	/**
	 * 
	 * @param newObjectList
	 * @param receiver
	 */
	public boolean updateSessionSemantiqueResources(DSemanticDiagram diagram, Collection<EObject> newObjectList, EObject receiver) {
		if (newObjectList != null && newObjectList.size() > 0) 
		{
			Session session = SessionManager.INSTANCE.getSession(receiver);
			for (EObject eObject : newObjectList) 
			{
				final Resource eResource = eObject.eResource();
				if (! session.getSemanticResources().contains(eResource))
					session.addSemanticResource(eResource.getURI(), new NullProgressMonitor());
			}
			return true;
		}
		return false;
	}
}

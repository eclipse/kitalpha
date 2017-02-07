package org.polarsys.kitalpha.model.detachment.ui.action;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;

public class DetachmentActionPropertyTester extends PropertyTester {
	
	private static String CHECK_CLOSE_SESSION = "checkClosedSession";

	public DetachmentActionPropertyTester() {
	}

	public boolean test(Object receiver, String property, Object[] args, Object expectedValue){
		if (property.equals(CHECK_CLOSE_SESSION)){
			IResource resource = (IResource)receiver;

			if (resource != null){
				URI uri = URI.createPlatformResourceURI(resource.getFullPath().toPortableString(), true);

				Session session = SessionManager.INSTANCE.getExistingSession(uri);

				if (session != null)
					return !session.isOpen();
				return true;
			}
		}
		
		return false;
	}

}

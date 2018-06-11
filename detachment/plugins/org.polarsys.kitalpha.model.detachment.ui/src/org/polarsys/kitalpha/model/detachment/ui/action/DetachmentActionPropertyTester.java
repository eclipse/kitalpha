/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
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

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue){
		if (property.equals(CHECK_CLOSE_SESSION)){
			IResource resource = (IResource)receiver;

			if (resource != null){
				URI uri = URI.createPlatformResourceURI(resource.getFullPath().toPortableString(), true);

				Session session = SessionManager.INSTANCE.getExistingSession(uri);

				if (session != null) {
					return !session.isOpen();
				}
				return true;
			}
		}
		
		return false;
	}

}

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
package org.polarsys.kitalpha.doc.gen.business.core.sirius.util.session;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;

import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;

/**
 * This class manage the unique sirius session used during documentation
 * generation.
 */
public class DiagramSessionHelper {

	/**
	 * aird file URI
	 */
	private static URI airdUri;

	private static Session session;

	public static Session initSession() {
		if ((session == null || !session.isOpen()) && airdUri != null) {
			session = findCorrespondingActiveSession(airdUri);
		}
		return session;

	}

	public static Session initSessionFromAirdURI(URI airdURI) {
		if (session == null)
			session = findCorrespondingActiveSession(airdURI);
		return session;
	}

	/**
	 * 
	 * @param uri
	 * @return
	 */
	public static Session findCorrespondingActiveSession(URI uri) {
		return SessionManager.INSTANCE.getSession(uri, new NullProgressMonitor());
	}

	public static Session getCurrentSession() {
		return session;
	}

	public static void setAirdUri(URI airdUri) {
		DiagramSessionHelper.airdUri = airdUri;
	}

	public static URI getAirdUri() {
		return airdUri;
	}

	public static Collection<DRepresentation> getSessionDRepresentation() {
		if (session != null)
			return DialectManager.INSTANCE.getAllRepresentations(session);
		return Collections.emptyList();
	}

	public static void cleanSession() {
		session = null;

	}

}

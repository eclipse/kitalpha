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
package org.polarsys.kitalpha.doc.gen.business.core.sirius.util.session;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;

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
	
	/**
	 * Hidden constrcutor
	 */
	private DiagramSessionHelper() {
	}

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
		if (session != null) {
			return DialectManager.INSTANCE.getAllRepresentations(session);
		}
		return Collections.emptyList();
	}
	
	/**
	 * Returns diagram from descriptor in the session
	 * @param descriptor
	 * @return a diagram, otherwise null
	 */
	public static DDiagram getDDiagram(DRepresentationDescriptor descriptor) {
		
		if (session != null) {
			Collection<DRepresentation> representations = getSessionDRepresentation();
			return findCorrespondingDiagram(descriptor, representations);
		}
		return null;
	}

	public static DDiagram findCorrespondingDiagram(DRepresentationDescriptor descriptor,
			Collection<DRepresentation> representations) {
		for (DRepresentation dRepresentation : representations) {
			if (dRepresentation instanceof DDiagram ) {
				DDiagram diagram = (DDiagram) dRepresentation;
				if (diagram.getUid() != null && diagram.getUid().equals(descriptor.getRepPath().getResourceURI().fragment())) {
					return diagram;
				}
			}
		}
		return null;
	}
	
	/**
	 * @param eObject
	 * @return return XMI ID of eObject, otherwise fragment within resource. if it cannot
	 * find any ID, it returns empty string
	 */
	public static String getID(EObject eObject) {
		String id = ""; //$NON-NLS-1$
		
		if (session != null) {
			Resource sessionResource = session.getSessionResource();
			if (sessionResource instanceof XMLResource) {
				id = ((XMLResource) sessionResource).getID(eObject);
				if (id == null && EcoreUtil.getURI(eObject) != null) {
					id = EcoreUtil.getURI(eObject).fragment();
				}
			}
		}
		
		return id != null? id : ""; //$NON-NLS-1$
	}

	public static void cleanSession() {
		session = null;
	}

}

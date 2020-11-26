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

package org.polarsys.kitalpha.doc.gen.business.ecore.services;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.SavingPolicyImpl;
import org.eclipse.sirius.business.api.session.Session;

/**
 * A custom save policy that forbid to session to save semantic resources and some sirius Fragment.
 * 
 * this Policy allows save of a Sirius Fragment (under generation) and the session resource.
 * 
 * @author Boubekeur Zendagui
 */
public class DocgenEcoreSessionSavePolicy extends SavingPolicyImpl {

	/**
	 * Session to control save action.
	 */
	private Session _session;
	
	/**
	 * The Sirius fragment under generation. 
	 */
	private URI _fragmentUri;
	
	/**
	 * Default constructor.
	 * 
	 * @param session
	 */
	public DocgenEcoreSessionSavePolicy(Session session) {
		super(session.getTransactionalEditingDomain());
		_session = session;
	}
	
	/**
	 * Sirius Fragment under generation. Session can save this fragment.
	 *  
	 * @param fragmentUri the {@link URI} of the fragment
	 */
	public void setFragmentURI(URI fragmentUri){
		if (fragmentUri != null) {
			_fragmentUri = fragmentUri;
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.sirius.business.api.session.SavingPolicyImpl#hasChangesToSave(org.eclipse.emf.ecore.resource.Resource)
	 */
	@Override
	protected boolean hasChangesToSave(Resource resource) {
		if (resource.getURI().equals(_fragmentUri) || 
				resource.getURI().equals(_session.getSessionResource().getURI()))
		{
			return super.hasChangesToSave(resource);
		}
		else
		{
			resource.setModified(false);
			return false;
		}
	}

}

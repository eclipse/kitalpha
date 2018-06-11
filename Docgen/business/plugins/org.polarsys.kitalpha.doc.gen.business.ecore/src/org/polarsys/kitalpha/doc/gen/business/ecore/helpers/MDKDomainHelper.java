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
package org.polarsys.kitalpha.doc.gen.business.ecore.helpers;

import org.eclipse.egf.core.domain.TargetPlatformResourceSet;
import org.eclipse.egf.domain.Activator;
import org.eclipse.egf.domain.DomainException;
import org.eclipse.egf.domain.Messages;
import org.eclipse.egf.domain.emf.EMFDomainHelper;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.egf.model.domain.LoadableDomain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.polarsys.kitalpha.doc.gen.business.core.sirius.util.session.DiagramSessionHelper;


import org.eclipse.sirius.business.api.session.Session;

public class MDKDomainHelper extends EMFDomainHelper {

	private ResourceSet resourceSet;

	private TransactionalEditingDomain getEditingDomain() {
		Session session = DiagramSessionHelper.getCurrentSession();
		if (session != null) {
			return session.getTransactionalEditingDomain();
		}
		return null;
	}

	@Override
	protected boolean doLoadDomain(LoadableDomain domain)
			throws DomainException {
		if (domain instanceof EMFDomain) {
			EMFDomain myDomain = (EMFDomain) domain;
			myDomain.setLoaded(true);
			TransactionalEditingDomain editingDomain = getEditingDomain();
			if (editingDomain != null) {
				resourceSet = editingDomain.getResourceSet();
			} else {
				resourceSet = new TargetPlatformResourceSet();
			}
			final URI uri = myDomain.getUri();
			if (uri == null || "".equals(uri.toString())) { //$NON-NLS-1$
				Activator.getDefault().logWarning(
						Messages.bind(Messages.Load_EMFDomain_error1, domain
								.getName()));
				return true;
			}
			Resource domainResource = null;
			try {
				domainResource = resourceSet.getResource(uri, true);
			} catch (Exception e) {
				throw new DomainException(Messages.bind(
						Messages.Load_EMFDomain_error2, uri.toString()), e);
			}

			if (!myDomain.getContent().isEmpty()) {
				throw new DomainException(Messages.bind(
						Messages.Load_Domain_error1, domain.eClass().getName(),
						domain.getName()));
			}
			myDomain.getContent().addAll(domainResource.getContents());
			return true;
		}
		return false;
	}

}

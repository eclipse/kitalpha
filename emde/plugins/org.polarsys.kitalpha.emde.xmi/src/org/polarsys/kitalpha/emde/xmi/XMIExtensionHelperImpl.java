/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.xmi;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.DanglingHREFException;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIHelperImpl;

/**
 * @author Xavier Maysonnave
 * 
 */
public class XMIExtensionHelperImpl extends XMIHelperImpl {

	private SAXExtensionXMIHandler handler;

	public XMIExtensionHelperImpl() {
		super();
	}

	public XMIExtensionHelperImpl(XMLResource resource) {
		super(resource);
	}

	public void setXMIHandler(SAXExtensionXMIHandler handler) {
		this.handler = handler;
	}

	@Override
	protected URI handleDanglingHREF(EObject object) {
		if (!XMLResource.OPTION_PROCESS_DANGLING_HREF_DISCARD.equals(processDanglingHREF)) {
			DanglingHREFException exception = new DanglingHREFException("The object '" + object + "' is not contained in a resource.", //$NON-NLS-1$ //$NON-NLS-2$ 
					resource == null || resource.getURI() == null ? "unknown" : resource.getURI().toString(), //$NON-NLS-1$
					handler != null && handler.getLineNumber() != -1 ? handler.getLineNumber() : 0, handler != null && handler.getColumnNumber() != -1 ? handler.getColumnNumber() : 0);
			if (danglingHREFException == null) {
				danglingHREFException = exception;
			}
			if (resource != null) {
				resource.getErrors().add(exception);
			}
		}
		return null;
	}

}

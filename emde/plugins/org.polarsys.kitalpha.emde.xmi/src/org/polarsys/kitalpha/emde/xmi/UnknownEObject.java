/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.xmi;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.osgi.util.NLS;
import org.polarsys.kitalpha.emde.xmi.i18n.Messages;

/**
 * @author Xavier Maysonnave
 * 
 */
public class UnknownEObject implements Resource.Diagnostic {

	private static final long serialVersionUID = 1L;

	protected final AnyType anyType;

	protected final SAXLocator locator;

	protected final String message;

	protected final XMLResource resource;

	public UnknownEObject(XMLResource resource, AnyType anyType, SAXLocator locator) {
		Assert.isNotNull(resource);
		Assert.isNotNull(anyType);
		this.message = NLS.bind(Messages.XMI_unknown_eClass, new Object[] { anyType.eClass().getName(), resource.getID(anyType) != null ? resource.getID(anyType) : "", //$NON-NLS-1$
				anyType.eClass().getEPackage().getNsURI() });
		this.resource = resource;
		this.anyType = anyType;
		this.locator = locator == null ? new SAXLocator(0, 0) : locator;
	}

	public UnknownEObject(XMLResource resource, AnyType anyType, String location) {
		this(resource, anyType, new SAXLocator(0, 0));
	}

	@Override
	public int getColumn() {
		return locator.getColumnNumber();
	}

	@Override
	public int getLine() {
		return locator.getLineNumber();
	}

	@Override
	public String getLocation() {
		return getResource().getURI().toString();
	}

	public SAXLocator getLocator() {
		return locator;
	}

	@Override
	public String getMessage() {
		String result = message;
		if (locator.getLineNumber() != 0) {
			result += " (" + locator.getLineNumber() + ", " + locator.getColumnNumber() + ")"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}
		return result;
	}

	public XMLResource getResource() {
		return resource;
	}

}

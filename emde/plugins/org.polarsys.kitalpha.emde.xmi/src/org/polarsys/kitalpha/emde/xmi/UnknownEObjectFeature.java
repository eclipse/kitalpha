/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
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

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.osgi.util.NLS;
import org.polarsys.kitalpha.emde.xmi.i18n.Messages;

/**
 * @author Xavier Maysonnave
 * 
 */
public class UnknownEObjectFeature implements Resource.Diagnostic {

	private static final long serialVersionUID = 1L;

	protected AnyType anyType;

	protected EObject eObject;

	protected EStructuralFeature feature;

	protected SAXLocator locator;

	protected String message;

	protected XMLResource resource;

	public UnknownEObjectFeature(XMLResource resource, EObject eObject, EStructuralFeature feature, AnyType anyType, SAXLocator locator) {
		Assert.isNotNull(resource);
		Assert.isNotNull(eObject);
		Assert.isNotNull(feature);
		Assert.isNotNull(anyType);
		if (feature.isMany()) {
			this.message = NLS.bind(Messages.XMI_unknown_eObject_many_feature, new Object[] { eObject.toString(), feature.getName(), anyType.eClass().getName(), resource.getID(anyType) != null ? resource.getID(anyType) : "", //$NON-NLS-1$
					anyType.eClass().getEPackage().getNsURI() });
		} else {
			this.message = NLS.bind(Messages.XMI_unknown_eObject_feature, new Object[] { eObject.toString(), feature.getName(), anyType.eClass().getName(), resource.getID(anyType) != null ? resource.getID(anyType) : "", //$NON-NLS-1$
					anyType.eClass().getEPackage().getNsURI() });
		}
		this.resource = resource;
		this.eObject = eObject;
		this.feature = feature;
		this.anyType = anyType;
		this.locator = locator == null ? new SAXLocator(0, 0) : locator;
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

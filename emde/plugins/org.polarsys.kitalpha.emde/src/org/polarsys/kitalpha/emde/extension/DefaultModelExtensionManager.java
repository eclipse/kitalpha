/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.emde.extension;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * @author Thomas Guiu
 * 
 */

public abstract class DefaultModelExtensionManager implements ModelExtensionManager {

	private EObject target;

	private List<ExtensionManagerDelegate> delegates = new ArrayList<ExtensionManagerDelegate>();

	public boolean isExtensionModelDisabled(String extensibleModel, String extendedModel) {
		ExtendedModel extendedModel2 = ModelExtensionDescriptor.INSTANCE.getExtendedModel(extendedModel);
		if (extendedModel2 == null)
			return true;
		return isExtensionModelDisabled(extendedModel2);
	}

	public boolean canDisableExtensionModel(ExtendedModel extended) {
		return true;
	}

	public boolean isExtensionModelDisabled(Object object) {
		return object instanceof EObject && isExtensionModelDisabled((EObject) object);
	}

	public boolean isExtensionModelDisabled(EObject eObject) {
		if (eObject.eResource() == null) {
			return false;
		}
		String nsURI = eObject.eClass().getEPackage().getNsURI();
		for (ExtensionManagerDelegate delegate : delegates) {
			if (delegate.getManagedNsUris().contains(nsURI)) {
				Boolean extensionModelDisabled = delegate.isExtensionModelDisabled(eObject);
				if (extensionModelDisabled != null)
					return extensionModelDisabled.booleanValue();
			}
		}
		ExtendedModel extended = ModelExtensionDescriptor.INSTANCE.getExtendedModel(eObject.eClass().getEPackage().getNsURI().toString());
		return ((extended != null) && isExtensionModelDisabled(extended));
	}

	/**
	 * Loads the extensible model.
	 */

	protected static void fireExtensionEvent(String nsURI, boolean enable) {
		ModelExtensionHelper.fireExtensionEvent(nsURI, enable);
	}

	public List<ExtensionManagerDelegate> getDelegates() {
		return delegates;
	}

	public EObject getTarget() {
		return target;
	}

	public void setTarget(EObject target) {
		this.target = target;
	}

}

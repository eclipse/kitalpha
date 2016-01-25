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
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.polarsys.kitalpha.emde.extension.i18n.Messages;
import org.polarsys.kitalpha.emde.extension.utils.Log;

/**
 * @author Thomas Guiu
 * 
 */

public abstract class DefaultModelExtensionManager implements ModelExtensionManager {

	private ResourceSet target;

	private List<ExtensionManagerDelegate> delegates = new ArrayList<ExtensionManagerDelegate>();

	private final List<ModelExtensionListener> listeners = new ArrayList<ModelExtensionListener>();
	private static final List<ModelExtensionOverallListener> overallListeners = new ArrayList<ModelExtensionOverallListener>();

	public void addListener(ModelExtensionListener l) {
		if (!listeners.contains(l))
			listeners.add(l);
	}

	public void removeListener(ModelExtensionListener l) {
		listeners.remove(l);
	}

	static void addOverallListener(ModelExtensionOverallListener l) {
		if (!overallListeners.contains(l))
			overallListeners.add(l);
	}

	static void removeOverallListener(ModelExtensionOverallListener l) {
		overallListeners.remove(l);
	}

	protected void fireExtensionEvent(String nsURI, boolean enable) {
		for (ModelExtensionListener l : listeners) {
			try {
				if (enable)
					l.modelEnabled(nsURI);
				else
					l.modelDisabled(nsURI);
			} catch (Exception e) {
				Log.RUNTIME.logError(Messages.Listener_Error, e);
			}
		}
		for (ModelExtensionOverallListener l : overallListeners) {
			try {
				if (enable)
					l.modelEnabled(target, nsURI);
				else
					l.modelDisabled(target, nsURI);
			} catch (Exception e) {
				Log.RUNTIME.logError(Messages.Listener_Error, e);
			}
		}
	}

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

	public List<ExtensionManagerDelegate> getDelegates() {
		return delegates;
	}

	public ResourceSet getTarget() {
		return target;
	}

	public void setTarget(ResourceSet target) {
		this.target = target;
	}

}
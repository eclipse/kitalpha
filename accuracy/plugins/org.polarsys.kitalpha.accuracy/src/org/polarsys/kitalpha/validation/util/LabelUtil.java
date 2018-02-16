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
package org.polarsys.kitalpha.validation.util;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

/**
 * @author Guillaume Gebhart
 */
public class LabelUtil {

	private static final String[] LABEL_FEATURE_CANDIDATES = { "name",
			"identifier" };
	
	private LabelUtil() {
		//prevent instantiation
	}

	/**
	 * Returns a label for the given object.
	 * 
	 * @param eObject
	 *            the object.
	 * @return a label for the given object.
	 */
	public static String getEObjectLabel(EObject eObject) {
		//
		// Gets the text.
		EditingDomain editingDomain = AdapterFactoryEditingDomain
				.getEditingDomainFor(eObject);
		AdapterFactory adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		if (editingDomain instanceof AdapterFactoryEditingDomain) {
			adapterFactory = ((AdapterFactoryEditingDomain) editingDomain)
					.getAdapterFactory();
		}

		IItemLabelProvider itemLabelProvider = (IItemLabelProvider) adapterFactory
				.adapt(eObject, IItemLabelProvider.class);
		String text = getGenericLabel(eObject);
		if (itemLabelProvider != null) {
			text = itemLabelProvider.getText(eObject);
		}
		return text;
	}

	private static String getGenericLabel(EObject object) {
		String result = null;
		for (String labelFeatureCandidate : LABEL_FEATURE_CANDIDATES) {
			if (object.eClass().getEStructuralFeature(labelFeatureCandidate) != null) {
				EStructuralFeature feature = object.eClass()
						.getEStructuralFeature(labelFeatureCandidate);
				if (feature.getEType().getInstanceClass() == String.class) {
					result = (String) object.eGet(feature);
					break;
				}
			}
		}
		return "[" + object.eClass() + "] " + result;
	}

}

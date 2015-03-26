/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.extension;

import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.polarsys.kitalpha.emde.extension.utils.EMFHelper;

/**
 * Obscure work with AnyType
 * 
 * @author Xavier Maysonnave
 */
public class ExtensionModelManager {

	private ExtensionModelManager() {
		super();
	}

	public static AnyType getAnyType(XMLResource resource_p, EObject eObject_p, EReference reference_p) {
		if ((resource_p == null) || (eObject_p == null) || (reference_p == null)) {
			return null;
		}
		Map<EObject, AnyType> anyTypes = resource_p.getEObjectToExtensionMap();
		if ((anyTypes == null) || anyTypes.isEmpty()) {
			return null;
		}
		if (reference_p.getEType() instanceof EClass == false) {
			return null;
		}
		EClass eClass = (EClass) EMFHelper.solveAgainstStaticPackage(reference_p.getEType());
		if (eClass == null) {
			eClass = (EClass) reference_p.getEType();
		}
		for (Map.Entry<EObject, AnyType> entry : anyTypes.entrySet()) {
			AnyType result = getAnyType(entry.getKey(), entry.getValue(), resource_p.getID(eObject_p), eClass);
			if (result != null) {
				return result;
			}
		}
		return null;
	}

	public static AnyType getAnyType(EObject eObject_p, EReference reference_p) {
		if ((eObject_p == null) || (eObject_p.eResource() == null) || (eObject_p.eResource() instanceof XMLResource == false) || (reference_p == null)) {
			return null;
		}
		XMLResource resource = (XMLResource) eObject_p.eResource();
		Map<EObject, AnyType> anyTypes = resource.getEObjectToExtensionMap();
		if ((anyTypes == null) || anyTypes.isEmpty()) {
			return null;
		}
		if (reference_p.getEType() instanceof EClass == false) {
			return null;
		}
		EClass eClass = (EClass) EMFHelper.solveAgainstStaticPackage(reference_p.getEType());
		if (eClass == null) {
			eClass = (EClass) reference_p.getEType();
		}
		for (Map.Entry<EObject, AnyType> entry : anyTypes.entrySet()) {
			AnyType result = getAnyType(entry.getKey(), entry.getValue(), resource.getID(eObject_p), eClass);
			if (result != null) {
				return result;
			}
		}
		return null;
	}

	public static AnyType getAnyType(EObject key_p, AnyType value_p, String id_p, EClass eClass_p) {
		if ((key_p == null) || (value_p == null) || (eClass_p == null)) {
			return null;
		}
		// Mixed analysis
		//
		if ((value_p.getMixed() != null) && (value_p.getMixed().isEmpty() == false)) {
			for (FeatureMap.Entry mixedEntry : value_p.getMixed()) {
				// Do we need to analyse attributes at the next step ?
				//
				if (mixedEntry.getEStructuralFeature() instanceof EReference && ((EReference) mixedEntry.getEStructuralFeature()).getEType() instanceof EClass) {
					EClass eClass = null;
					for (EReference reference : key_p.eClass().getEAllReferences()) {
						if (mixedEntry.getEStructuralFeature().getName().equals(reference.getName())) {
							eClass = (EClass) EMFHelper.solveAgainstStaticPackage(reference.getEType());
							if (eClass == null) {
								eClass = (EClass) reference.getEType();
							}
							break;
						}
					}
					if ((eClass != null) && mixedEntry.getValue() instanceof AnyType && (eClass.equals(eClass_p) || eClass_p.getEAllSuperTypes().contains(eClass))) {
						// Attribute analysis
						//
						AnyType result = (AnyType) mixedEntry.getValue();
						for (FeatureMap.Entry attributeEntry : result.getAnyAttribute()) {
							// ID lookup, {@link
							// org.eclipse.emf.ecore.xmi.impl.XMLHandler#setValueFromId(EObject,EReference)}
							//
							StringTokenizer st = new StringTokenizer(attributeEntry.getValue().toString());
							while (st.hasMoreTokens()) {
								String id = st.nextToken();
								int index = id.indexOf('#', 0);
								if (index != -1) {
									if (index == 0) {
										id = id.substring(1);
									} else {
										continue;
									}
								} else if (id.indexOf(':', 0) != -1) {
									continue;
								}
								if (id.equals(id_p)) {
									return result;
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

}
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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * @author Xavier Maysonnave
 * 
 */
public class SAXHelper {

	public static void analyseExtensionMap(ExtendedMetaData extendedMetaData, XMLResource resource, Map<String, SAXLocator> locator) {
		if (resource == null) {
			return;
		}
		List<String> processed = new ArrayList<String>();
		Map<EObject, AnyType> anyTypes = resource.getEObjectToExtensionMap();
		if (anyTypes != null && !anyTypes.isEmpty()) {
			for (EObject key : anyTypes.keySet()) {
				AnyType type = anyTypes.get(key);
				@SuppressWarnings("unchecked")
				List<? extends FeatureMap.Entry> mixedEntries = (List<? extends FeatureMap.Entry>) type.eGet(XMLTypePackage.eINSTANCE.getAnyType_Mixed());
				for (FeatureMap.Entry mixedEntry : mixedEntries) {
					if (mixedEntry.getValue() instanceof AnyType) {
						AnyType innerType = (AnyType) mixedEntry.getValue();
						EStructuralFeature feature = mixedEntry.getEStructuralFeature();
						// eObject feature, we only process non is proxy object
						// to report non existing object. Such object doesn't
						// belong
						// to the current resource.
						// we mimic the default validate behavior
						//
						if (innerType.eIsProxy() == false && !processed.contains(resource.getID(innerType))) {
							processed.add(resource.getID(innerType));
							resource.getWarnings().add(new UnknownEObject(resource, innerType, locator.get(resource.getID(innerType))));
						}
						// Lookup for the real EReference if applicable
						//
						EReference reference = null;
						if (feature instanceof EReference) {
							EReference anyTypeEReference = (EReference) mixedEntry.getEStructuralFeature();
							for (EReference referenceKey : key.eClass().getEAllReferences()) {
								if (referenceKey.getName() != null && referenceKey.getName().equals(anyTypeEReference.getName())) {
									reference = referenceKey;
									break;
								}
							}
							if (reference == null) {
								continue;
							}
							if (!reference.eIsProxy() && reference.getEOpposite() == null) {
								resource.getWarnings().add(new UnknownEObjectFeature(resource, key, reference, innerType, locator.get(resource.getID(key))));
							}
						} else {
							resource.getWarnings().add(new UnknownEObjectFeature(resource, key, feature, innerType, locator.get(resource.getID(key))));
						}
						// ID usage in current document analysis for EReference
						//
						if (reference != null) {
							@SuppressWarnings("unchecked")
							List<? extends FeatureMap.Entry> attributes = (List<? extends FeatureMap.Entry>) innerType.eGet(XMLTypePackage.eINSTANCE.getAnyType_AnyAttribute());
							for (FeatureMap.Entry attributeEntry : attributes) {
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
											// Proxy ID analysis
											//
											String proxyId = id.substring(index + 1);
											EObject value = ((XMLResourceImpl) resource).getIDToEObjectMap().get(proxyId);
											if (value != null && !(value instanceof AnyType)) {
												for (EReference referenceValue : value.eClass().getEAllReferences()) {
													if (EcoreUtil.equals(reference.getEType(), referenceValue.getEType()) && !processed.contains(proxyId)) {
														processed.add(proxyId);
														resource.getWarnings().add(new UnknownEObjectFeature(resource, value, referenceValue, innerType, locator.get(resource.getID(value))));
													}
												}
											}
											continue;
										}
									} else if (id.indexOf(':', 0) != -1) {
										continue;
									}
									// Non Proxy ID analysis
									//
									EObject value = ((XMLResourceImpl) resource).getIDToEObjectMap().get(id);
									if (value != null && !(value instanceof AnyType)) {
										for (EReference referenceValue : value.eClass().getEAllReferences()) {
											if (EcoreUtil.equals(reference.getEType(), referenceValue.getEType()) && !processed.contains(id)) {
												processed.add(id);
												resource.getWarnings().add(new UnknownEObjectFeature(resource, value, referenceValue, innerType, locator.get(resource.getID(value))));
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}

	public static EObject getEObject(Map<EObject, AnyType> eObjectToExtensionMap, AnyType anyType) {
		if (eObjectToExtensionMap == null || anyType == null) {
			return null;
		}
		for (EObject eObject : eObjectToExtensionMap.keySet()) {
			AnyType anyType1 = eObjectToExtensionMap.get(eObject);
			if (EcoreUtil.equals(anyType1, anyType)) {
				return eObject;
			}
		}
		return null;
	}

	public static EReference getEReference(EObject eObject, EReference eReference) {
		if (eObject == null || eReference == null) {
			return null;
		}
		// Lookup for the real EReference
		//
		EReference reference = null;
		for (EReference referenceKey : eObject.eClass().getEAllReferences()) {
			if (referenceKey.getName() != null && referenceKey.getName().equals(eReference.getName())) {
				reference = referenceKey;
				break;
			}
		}
		return reference;
	}

	public static EReference getEReference(EObject eObject, FeatureMap.Entry entry) {
		if (eObject == null || entry == null) {
			return null;
		}
		// Lookup for the real EReference
		//
		EReference reference = null;
		if (entry.getEStructuralFeature() instanceof EReference) {
			EReference anyTypeEReference = (EReference) entry.getEStructuralFeature();
			for (EReference referenceKey : eObject.eClass().getEAllReferences()) {
				if (referenceKey.getName() != null && referenceKey.getName().equals(anyTypeEReference.getName())) {
					reference = referenceKey;
					break;
				}
			}
		}
		return reference;
	}

	private SAXHelper() {
		// Prevent Instantiation
	}

}

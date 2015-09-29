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
package org.polarsys.kitalpha.emde.extension.edit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;
import org.polarsys.kitalpha.emde.extension.ModelExtensionManager;

public class ExtensionItemPropertyDescriptor extends ItemPropertyDescriptor {

	public ExtensionItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description, EStructuralFeature feature, boolean isSettable, boolean multiLine, boolean sortChoices, Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description, feature, isSettable, multiLine, sortChoices, staticImage, category, filterFlags);
	}

	/**
	 * This does the delegated job of getting the property value from the given
	 * object; and it sets object, which is necessary if
	 * {@link #getComboBoxObjects getComboBoxObjects} is called. It is
	 * implemented in a generic way using the structural feature or parent
	 * references.
	 */
	@Override
	public Object getPropertyValue(Object object) {
		EObject eObject = (EObject) object;
		if (feature instanceof EAttribute) {
			EAttribute attribute = (EAttribute) feature;
			Object result = getValue(eObject, attribute);
			// We used to use getDefaultValue() when null, but that behaviour
			// isn't correct: the value is aready set to
			// its default initially, and we should always show the actual state
			// of the object (bug 102557).
			//
			if (result == null) {
				// return getDefaultValue(attribute.getEType());
				return null;
			}
			return createPropertyValueWrapper(object, result);
		} else if (parentReferences != null) {
			for (int i = 0; i < parentReferences.length; ++i) {
				Object result = filterDisabledValues(parentReferences[i], eObject);
				if (result != null) {
					return createPropertyValueWrapper(eObject, result);
				}
			}
			return ""; //$NON-NLS-1$
		} else {
			return createPropertyValueWrapper(eObject, filterDisabledValues(feature, eObject));
		}
	}

	private Object filterDisabledValues(EStructuralFeature feature, EObject eObject) {
		Object result = getValue(eObject, feature);
		if (result != null && feature instanceof EReference && isMany(feature)) {
			if (result instanceof List<?>) {
				List<EObject> eObjects = new BasicEList<EObject>();
				for (Iterator<?> i = ((List<?>) result).iterator(); i.hasNext();) {
					Object object = i.next();
					if (object instanceof EObject) {
						EObject value = (EObject) object;
						if (!ModelExtensionHelper.getInstance(value).isExtensionModelDisabled(value)) {
							eObjects.add(value);
						}
					}
				}
				result = eObjects;
			}
		}
		return result;
	}

	/**
	 * This determines whether this descriptor's property for the object
	 * supports set (and reset).
	 */
	@Override
	public boolean canSetProperty(Object object) {
		if (object instanceof EObject && !ModelExtensionHelper.getInstance((EObject) object).isExtensionModelDisabled((EObject) object)) {
			return super.canSetProperty(object);
		}
		return false;
	}

	/**
	 * This will be called to populate a list of choices. The label provider
	 * will be used to determine the labels for the objects this returns. This
	 * default implementation uses {@link #getReachableObjectsOfType
	 * getReachableObjectsOfType}.
	 */
	@Override
	protected Collection<?> getComboBoxObjects(Object object) {
		if (object instanceof EObject) {
			if (parentReferences != null) {
				Collection<Object> result = new UniqueEList<Object>();
				for (int i = 0; i < parentReferences.length; ++i) {
					result.addAll(getReachableObjectsOfType((EObject) object, parentReferences[i].getEType()));
				}
				return result;
			} else if (feature != null) {
				if (feature instanceof EReference) {
					Collection<EObject> result = getReachableObjectsOfType((EObject) object, feature.getEType());
					if (!feature.isMany() && !result.contains(null)) {
						result.add(null);
					}
					return result;
				} else if (feature.getEType() instanceof EEnum) {
					EEnum eEnum = (EEnum) feature.getEType();
					List<Enumerator> enumerators = new ArrayList<Enumerator>();
					for (EEnumLiteral eEnumLiteral : eEnum.getELiterals()) {
						enumerators.add(eEnumLiteral.getInstance());
					}
					return enumerators;
				} else {
					EDataType eDataType = (EDataType) feature.getEType();
					List<String> enumeration = ExtendedMetaData.INSTANCE.getEnumerationFacet(eDataType);
					if (!enumeration.isEmpty()) {
						List<Object> enumerators = new ArrayList<Object>();
						for (String enumerator : enumeration) {
							enumerators.add(EcoreUtil.createFromString(eDataType, enumerator));
						}
						return enumerators;
					}
				}
			}
		}
		return null;
	}

	/**
	 * This yields all reachable references from object with a meta object which
	 * indicates that it is a subtype of type.
	 */
	static public Collection<EObject> getReachableObjectsOfType(EObject object, EClassifier type) {

		LinkedList<EObject> itemQueue = new LinkedList<EObject>();
		Collection<EObject> visited = new HashSet<EObject>();
		Collection<EObject> result = new ArrayList<EObject>();
		Resource resource = object.eResource();
		String extensibleModelURI = null;
		if (resource != null) {
			extensibleModelURI = resource.getContents().get(0).eClass().getEPackage().getNsURI();
			ResourceSet resourceSet = resource.getResourceSet();
			if (resourceSet != null) {
				for (TreeIterator<?> i = resourceSet.getAllContents(); i.hasNext();) {
					Object child = i.next();
					if (child instanceof EObject) {
						collectReachableObjectsOfType(visited, itemQueue, result, (EObject) child, type, extensibleModelURI);
						i.prune();
					}
				}
			} else {
				for (EObject eObject : resource.getContents()) {
					collectReachableObjectsOfType(visited, itemQueue, result, eObject, type, extensibleModelURI);
				}
			}
		} else {
			extensibleModelURI = EcoreUtil.getRootContainer(object).eClass().getEPackage().getNsURI();
			collectReachableObjectsOfType(visited, itemQueue, result, EcoreUtil.getRootContainer(object), type, extensibleModelURI);
		}

		while (!itemQueue.isEmpty()) {
			EObject nextItem = itemQueue.removeFirst();
			collectReachableObjectsOfType(visited, itemQueue, result, nextItem, type, extensibleModelURI);
		}

		return result;

	}

	/**
	 * This will visit all reachable references from object except those in
	 * visited and add them to the queue. The queue is processed outside this
	 * recursive traversal to avoid stack overflows. It updates visited and adds
	 * to result any object with a meta object that indicates that it is a
	 * subtype of type.
	 */
	static private void collectReachableObjectsOfType(Collection<EObject> visited, LinkedList<EObject> itemQueue, Collection<EObject> result, EObject object, EClassifier type, String extensibleModelURI) {
		if (visited.add(object)) {
			if (type.isInstance(object)) {
				if (!ModelExtensionHelper.getInstance(object).isExtensionModelDisabled(object)) {
					result.add(object);
				}
			}
			EClass eClass = object.eClass();
			for (EStructuralFeature eStructuralFeature : eClass.getEAllStructuralFeatures()) {
				if (!eStructuralFeature.isDerived()) {
					if (eStructuralFeature instanceof EReference) {
						EReference eReference = (EReference) eStructuralFeature;
						if (eReference.isMany()) {
							@SuppressWarnings("unchecked")
							List<EObject> list = ((List<EObject>) object.eGet(eReference));
							itemQueue.addAll(list);
						} else {
							EObject eObject = (EObject) object.eGet(eReference);
							if (eObject != null) {
								itemQueue.addLast(eObject);
							}
						}
					} else if (FeatureMapUtil.isFeatureMap(eStructuralFeature)) {
						for (FeatureMap.Entry entry : (FeatureMap) object.eGet(eStructuralFeature)) {
							if (entry.getEStructuralFeature() instanceof EReference && entry.getValue() != null) {
								itemQueue.addLast((EObject) entry.getValue());
							}
						}
					}
				}
			}
		}
	}

}

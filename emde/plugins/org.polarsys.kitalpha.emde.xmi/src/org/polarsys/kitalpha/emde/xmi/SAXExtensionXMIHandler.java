/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
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

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.IllegalValueException;
import org.eclipse.emf.ecore.xmi.PackageNotFoundException;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMIHandler;
import org.eclipse.emf.ecore.xml.type.AnyType;

public class SAXExtensionXMIHandler extends SAXXMIHandler {

	private final Map<String, SAXLocator> locator = new HashMap<String, SAXLocator>();

	/**
	 * Constructor.
	 */
	public SAXExtensionXMIHandler(XMLResource xmiResource, XMLHelper helper, Map<?, ?> options) {
		super(xmiResource, helper, options);
		if (helper instanceof XMIExtensionHelperImpl) {
			((XMIExtensionHelperImpl) helper).setXMIHandler(this);
		}
	}

	protected EObject validateCreateObjectFromFactory(EObject peekObject, EFactory factory, String typeName, EObject newObject, EStructuralFeature feature) {
		if (newObject != null) {
			if (extendedMetaData != null) {
				Collection<EPackage> demandedPackages = extendedMetaData.demandedPackages();
				if (!demandedPackages.isEmpty() && demandedPackages.contains(newObject.eClass().getEPackage())) {
					if (recordUnknownFeature) {
						if (!(peekObject instanceof AnyType)) {
							AnyType innerAnyType = getExtension(peekObject);
							EStructuralFeature entryFeature = extendedMetaData.demandFeature(extendedMetaData.getNamespace(feature), extendedMetaData.getName(feature), true);
							innerAnyType.getAny().add(entryFeature, newObject);
							contextFeature = entryFeature;
						}
						return newObject;
					}
					String namespace = extendedMetaData.getNamespace(feature);
					String name = extendedMetaData.getName(feature);
					EStructuralFeature wildcardFeature = extendedMetaData.getElementWildcardAffiliation((objects.peekEObject()).eClass(), namespace, name);
					if (wildcardFeature != null) {
						switch (extendedMetaData.getProcessingKind(wildcardFeature)) {
						case ExtendedMetaData.LAX_PROCESSING:
						case ExtendedMetaData.SKIP_PROCESSING: {
							return newObject;
						}
						}
					}
					newObject = null;
				}
			}
		} else if (feature != null && factory != null && extendedMetaData != null) {
			// processing unknown feature with xsi:type (xmi:type)
			if (recordUnknownFeature || processAnyXML) {

				EObject result = null;
				String namespace = extendedMetaData.getNamespace(factory.getEPackage());
				if (namespace == null) {
					usedNullNamespacePackage = true;
				}
				if (useNewMethods) {
					EClassifier type = extendedMetaData.demandType(namespace, typeName);
					result = createObject(type.getEPackage().getEFactoryInstance(), type, false);
				} else {
					factory = extendedMetaData.demandType(namespace, typeName).getEPackage().getEFactoryInstance();
					result = createObjectFromFactory(factory, typeName);
				}
				if (!(peekObject instanceof AnyType)) {
					AnyType innerAnyType = getExtension(peekObject);
					EStructuralFeature entryFeature = extendedMetaData.demandFeature(extendedMetaData.getNamespace(feature), extendedMetaData.getName(feature), true);
					innerAnyType.getAny().add(entryFeature, result);
					contextFeature = entryFeature;
				}
				return result;
			}
			String namespace = extendedMetaData.getNamespace(feature);
			String name = extendedMetaData.getName(feature);
			EStructuralFeature wildcardFeature = extendedMetaData.getElementWildcardAffiliation((objects.peekEObject()).eClass(), namespace, name);
			if (wildcardFeature != null) {
				int processingKind = laxWildcardProcessing ? ExtendedMetaData.LAX_PROCESSING : extendedMetaData.getProcessingKind(wildcardFeature);
				switch (processingKind) {
				case ExtendedMetaData.LAX_PROCESSING:
				case ExtendedMetaData.SKIP_PROCESSING: {
					// EATM Demand create metadata; needs to depend on
					// processing mode...
					String factoryNamespace = extendedMetaData.getNamespace(factory.getEPackage());
					if (factoryNamespace == null) {
						usedNullNamespacePackage = true;
					}
					if (useNewMethods) {
						EClassifier type = extendedMetaData.demandType(factoryNamespace, typeName);
						return createObject(type.getEPackage().getEFactoryInstance(), type, false);
					}
					factory = extendedMetaData.demandType(factoryNamespace, typeName).getEPackage().getEFactoryInstance();
					return createObjectFromFactory(factory, typeName);
				}
				}
			}
		}
		validateCreateObjectFromFactory(factory, typeName, newObject);
		return newObject;
	}

	/**
	 * Create an object from the given qualified type name.
	 */
	@Override
	protected EObject createObjectFromTypeName(EObject peekObject, String typeQName, EStructuralFeature feature) {
		String typeName = null;
		String prefix = ""; //$NON-NLS-1$
		int index = typeQName.indexOf(':', 0);
		if (index > 0) {
			prefix = typeQName.substring(0, index);
			typeName = typeQName.substring(index + 1);
		} else {
			typeName = typeQName;
		}

		contextFeature = feature;
		EFactory eFactory = getFactoryForPrefix(prefix);
		contextFeature = null;

		if (eFactory == null && prefix.equals("") && helper.getURI(prefix) == null) { //$NON-NLS-1$
			contextFeature = feature;
			EPackage ePackage = handleMissingPackage(null);
			contextFeature = null;
			if (ePackage == null) {
				error(new PackageNotFoundException(null, getLocation(), getLineNumber(), getColumnNumber()));
			} else {
				eFactory = ePackage.getEFactoryInstance();
			}
		}
		EObject obj = null;
		if (useNewMethods) {
			obj = createObject(eFactory, helper.getType(eFactory, typeName), false);
		} else {
			obj = createObjectFromFactory(eFactory, typeName);

		}

		obj = validateCreateObjectFromFactory(peekObject, eFactory, typeName, obj, feature);

		if (obj != null) {
			if (contextFeature == null) {
				setFeatureValue(peekObject, feature, obj);
			} else {
				contextFeature = null;
			}
		}

		processObject(obj);
		validateNewEObject(obj);
		return obj;

	}

	/**
	 * Create an object based on the type of the given feature.
	 */
	@Override
	protected EObject createObjectFromFeatureType(EObject peekObject, EStructuralFeature feature) {

		String typeName = null;
		EFactory factory = null;
		EClassifier eType = null;
		EObject obj = null;

		if (feature != null && (eType = feature.getEType()) != null) {
			if (useNewMethods) {
				if (extendedMetaData != null && eType == EcorePackage.Literals.EOBJECT && extendedMetaData.getFeatureKind(feature) != ExtendedMetaData.UNSPECIFIED_FEATURE) {
					eType = anyType;
					typeName = extendedMetaData.getName(anyType);
					factory = anyType.getEPackage().getEFactoryInstance();
				} else {
					factory = eType.getEPackage().getEFactoryInstance();
					typeName = extendedMetaData == null ? eType.getName() : extendedMetaData.getName(eType);
				}
				obj = createObject(factory, eType, false);
			} else {

				if (extendedMetaData != null && eType == EcorePackage.Literals.EOBJECT && extendedMetaData.getFeatureKind(feature) != ExtendedMetaData.UNSPECIFIED_FEATURE) {
					typeName = extendedMetaData.getName(anyType);
					factory = anyType.getEPackage().getEFactoryInstance();
				} else {
					EClass eClass = (EClass) eType;
					typeName = extendedMetaData == null ? eClass.getName() : extendedMetaData.getName(eClass);
					factory = eClass.getEPackage().getEFactoryInstance();
				}
				obj = createObjectFromFactory(factory, typeName);
			}
		}

		obj = validateCreateObjectFromFactory(peekObject, factory, typeName, obj, feature);

		if (obj != null) {
			setFeatureValue(peekObject, feature, obj);
		}

		processObject(obj);
		validateNewEObject(obj);
		return obj;
	}

	@Override
	public int getColumnNumber() {
		return super.getColumnNumber();
	}

	@Override
	public int getLineNumber() {
		return super.getLineNumber();
	}

	@Override
	protected EObject createObjectByType(String prefix, String name, boolean top) {
		EObject eObject = super.createObjectByType(prefix, name, top);
		validateNewEObject(eObject);
		return eObject;
	}

	protected void validateNewEObject(EObject eObject) {
		if (eObject == null) {
			return;
		}
		String key = xmlResource.getID(eObject);
		if (key != null && !locator.containsKey(key)) {
			locator.put(key, new SAXLocator(getLineNumber() != -1 ? getLineNumber() : 0, getColumnNumber() != -1 ? getColumnNumber() : 0));
		}
		return;
	}

	/**
	 * Set the given feature of the given object to the given value.
	 */
	@Override
	protected void setFeatureValue(EObject object, EStructuralFeature feature, Object value, int position) {
		try {
			if (!(object instanceof AnyType) && (value instanceof AnyType)) {
				AnyType type = getExtension(object);
				EStructuralFeature entryFeature = extendedMetaData.demandFeature(extendedMetaData.getNamespace(feature), extendedMetaData.getName(feature), true);
				// value should exist once in the feature map
				// to workaround we copy the value but we assign the id of the
				// original value
				// thus it works as expected ;-)
				//
				AnyType copy = (AnyType) EcoreUtil.copy((AnyType) value);
				xmlResource.setID(copy, xmlResource.getID((AnyType) value));
				type.getAny().add(entryFeature, copy);
			} else {
				helper.setValue(object, feature, value, position);
			}
		} catch (RuntimeException e) {
			error(new IllegalValueException(object, feature, value, e, getLocation(), getLineNumber(), getColumnNumber()));
		}
	}

	@Override
	public void endDocument() {
		super.endDocument();
		SAXHelper.analyseExtensionMap(extendedMetaData, xmlResource, locator);
	}

}

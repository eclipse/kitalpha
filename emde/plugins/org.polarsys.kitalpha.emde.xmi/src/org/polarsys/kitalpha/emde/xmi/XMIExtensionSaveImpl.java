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
package org.polarsys.kitalpha.emde.xmi;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMISaveImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;

public class XMIExtensionSaveImpl extends XMISaveImpl {

	private final StringBuffer buffer = new StringBuffer();

	private final Set<EObject> processed = new HashSet<EObject>();

	public XMIExtensionSaveImpl(XMLHelper helper) {
		super(helper);
	}

	public XMIExtensionSaveImpl(Map<?, ?> options, XMLHelper helper, String encoding, String xmlVersion) {
		super(options, helper, encoding, xmlVersion);
	}

	@Override
	protected void init(XMLResource resource, Map<?, ?> options) {
		super.init(resource, options);
		processed.clear();
	}

	@Override
	protected boolean shouldSaveFeature(EObject o, EStructuralFeature f) {
		return isReferenced(o, f) || o.eIsSet(f) || keepDefaults && f.getDefaultValueLiteral() != null;
	}

	protected boolean isReferenced(EObject o, EStructuralFeature f) {
		return getReferencedValue(o, f) != null ? true : false;
	}

	protected EObject getReferencedValue(EObject o, EStructuralFeature f) {
		if (eObjectToExtensionMap != null) {
			AnyType type = eObjectToExtensionMap.get(o);
			if (type != null) {
				@SuppressWarnings("unchecked")
				List<? extends FeatureMap.Entry> values = (List<? extends FeatureMap.Entry>) helper.getValue(type, XMLTypePackage.eINSTANCE.getAnyType_Mixed());
				int size = values.size();
				for (int i = 0; i < size; i++) {
					FeatureMap.Entry entry = values.get(i);
					EReference reference = SAXHelper.getEReference(o, entry);
					if (reference != null && f.equals(reference)) {
						return (EObject) entry.getValue();
					}
				}
			}
		}
		return null;
	}

	protected EList<EObject> getReferencedValues(EObject o, EStructuralFeature f) {
		EList<EObject> eObjects = new BasicInternalEList<EObject>(EObject.class);
		if (eObjectToExtensionMap != null) {
			AnyType type = eObjectToExtensionMap.get(o);
			if (type != null) {
				@SuppressWarnings("unchecked")
				List<? extends FeatureMap.Entry> values = (List<? extends FeatureMap.Entry>) helper.getValue(type, XMLTypePackage.eINSTANCE.getAnyType_Mixed());
				int size = values.size();
				for (int i = 0; i < size; i++) {
					FeatureMap.Entry entry = values.get(i);
					EReference reference = SAXHelper.getEReference(o, entry);
					if (reference != null && f.equals(reference)) {
						eObjects.add((EObject) entry.getValue());
					}
				}
			}
		}
		return eObjects;
	}

	protected EObject getValue(EObject o, EStructuralFeature f) {
		EObject value = getReferencedValue(o, f);
		if (value == null) {
			return (EObject) helper.getValue(o, f);
		}
		if (!processed.contains(value)) {
			processed.add(value);
		}
		return value;
	}

	protected Object getValues(EObject o, EStructuralFeature f) {
		EList<EObject> values = getReferencedValues(o, f);
		if (values != null) {
			// Store as processed
			for (Iterator<? extends EObject> i = values.iterator(); i.hasNext();) {
				EObject value = i.next();
				if (!processed.contains(value)) {
					processed.add(value);
				}
			}
		}
		return values;
	}

	@Override
	protected void saveEObjectSingle(EObject o, EStructuralFeature f) {
		EObject value = getValue(o, f);
		if (value != null) {
			String id = helper.getHREF(value);
			if (id != null) {
				id = convertURI(id);
				buffer.setLength(0);
				if (!id.startsWith("#")) //$NON-NLS-1$
				{
					EClass eClass = value.eClass();
					EClass expectedType = (EClass) f.getEType();
					if (saveTypeInfo ? xmlTypeInfo.shouldSaveType(eClass, expectedType, f) : eClass != expectedType && (expectedType.isAbstract() || f.getEGenericType().getETypeParameter() != null)) {
						buffer.append(helper.getQName(eClass));
						buffer.append(' ');
					}
				}
				buffer.append(id);
				if (!toDOM) {
					String name = helper.getQName(f);
					doc.startAttribute(name);
					doc.addAttributeContent(buffer.toString());
					doc.endAttribute();
				} else {
					helper.populateNameInfo(nameInfo, f);
					Attr attr = document.createAttributeNS(nameInfo.getNamespaceURI(), nameInfo.getQualifiedName());
					attr.setNodeValue(buffer.toString());
					((Element) currentNode).setAttributeNodeNS(attr);
					handler.recordValues(attr, o, f, value);
				}
			}
		}
	}

	@Override
	protected void saveIDRefSingle(EObject o, EStructuralFeature f) {
		EObject value = getValue(o, f);
		if (value != null) {
			String id = helper.getIDREF(value);
			if (id != null) {
				if (!toDOM) {
					String name = helper.getQName(f);
					doc.addAttribute(name, id);
				} else {
					helper.populateNameInfo(nameInfo, f);
					Attr attr = document.createAttributeNS(nameInfo.getNamespaceURI(), nameInfo.getQualifiedName());
					attr.setNodeValue(id);
					((Element) currentNode).setAttributeNodeNS(attr);
					handler.recordValues(attr, o, f, value);
				}
			}
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	protected void saveEObjectMany(EObject o, EStructuralFeature f) {
		Object values = getValues(o, f);
		if (values != null) {
			processSaveEObjectMany((InternalEList<? extends EObject>) values, o, f);
		}
		processSaveEObjectMany((InternalEList<? extends EObject>) helper.getValue(o, f), o, f);
	}

	protected void processSaveEObjectMany(InternalEList<? extends EObject> values, EObject o, EStructuralFeature f) {
		if (!values.isEmpty()) {
			buffer.setLength(0);
			boolean failure = false;
			for (Iterator<? extends EObject> i = values.basicIterator();;) {
				EObject value = i.next();
				String id = helper.getHREF(value);
				if (id == null) {
					failure = true;
					if (!i.hasNext()) {
						break;
					}
				} else {
					id = convertURI(id);
					if (!id.startsWith("#")) { //$NON-NLS-1$
						EClass eClass = value.eClass();
						EClass expectedType = (EClass) f.getEType();
						if (saveTypeInfo ? xmlTypeInfo.shouldSaveType(eClass, expectedType, f) : eClass != expectedType && (expectedType.isAbstract() || f.getEGenericType().getETypeParameter() != null)) {
							buffer.append(helper.getQName(eClass));
							buffer.append(' ');
						}
					}
					buffer.append(id);
					if (i.hasNext()) {
						buffer.append(' ');
					} else {
						break;
					}
				}
			}

			String string = buffer.toString();
			if (!failure || (string = string.trim()).length() != 0) {
				if (!toDOM) {
					String name = helper.getQName(f);
					doc.startAttribute(name);
					doc.addAttributeContent(string);
					doc.endAttribute();
				} else {
					helper.populateNameInfo(nameInfo, f);
					Attr attr = document.createAttributeNS(nameInfo.getNamespaceURI(), nameInfo.getQualifiedName());
					attr.setNodeValue(string);
					((Element) currentNode).setAttributeNodeNS(attr);
					handler.recordValues(attr, o, f, values);
				}
			}
		}
	}

	@Override
	protected void saveElement(InternalEObject o, EStructuralFeature f) {
		if (!processed.contains(o)) {
			processed.add(o);
			if ((o.eDirectResource() != null || o.eIsProxy())) {
				saveHref(o, f);
			} else {
				saveElement((EObject) o, f);
			}
		}
	}

}

/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AnnotatableElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Annotation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Detail;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.EMFResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Enumeration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalClassAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.FileSystemResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalClassAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Operation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Parameter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ShortNamedElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Value;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointClassifier;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointResources;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage
 * @generated
 */
public class VpdescSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VpdescPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpdescSwitch() {
		if (modelPackage == null) {
			modelPackage = VpdescPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case VpdescPackage.VIEWPOINT: {
				Viewpoint viewpoint = (Viewpoint)theEObject;
				T result = caseViewpoint(viewpoint);
				if (result == null) result = caseShortNamedElement(viewpoint);
				if (result == null) result = caseNamedElement(viewpoint);
				if (result == null) result = caseViewpointElement(viewpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = caseAnnotatableElement(data);
				if (result == null) result = caseNamedElement(data);
				if (result == null) result = caseViewpointElement(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.ASPECT: {
				Aspect aspect = (Aspect)theEObject;
				T result = caseAspect(aspect);
				if (result == null) result = caseNamedElement(aspect);
				if (result == null) result = caseViewpointElement(aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.CLASS: {
				org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class class_ = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseViewpointClassifier(class_);
				if (result == null) result = caseAnnotatableElement(class_);
				if (result == null) result = caseNamedElement(class_);
				if (result == null) result = caseViewpointElement(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.ABSTRACT_ASSOCIATION: {
				AbstractAssociation abstractAssociation = (AbstractAssociation)theEObject;
				T result = caseAbstractAssociation(abstractAssociation);
				if (result == null) result = caseAbstractFeature(abstractAssociation);
				if (result == null) result = caseAnnotatableElement(abstractAssociation);
				if (result == null) result = caseNamedElement(abstractAssociation);
				if (result == null) result = caseViewpointElement(abstractAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseAbstractFeature(attribute);
				if (result == null) result = caseAnnotatableElement(attribute);
				if (result == null) result = caseNamedElement(attribute);
				if (result == null) result = caseViewpointElement(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseViewpointElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.SHORT_NAMED_ELEMENT: {
				ShortNamedElement shortNamedElement = (ShortNamedElement)theEObject;
				T result = caseShortNamedElement(shortNamedElement);
				if (result == null) result = caseNamedElement(shortNamedElement);
				if (result == null) result = caseViewpointElement(shortNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.LOCAL_CLASS_ASSOCIATION: {
				LocalClassAssociation localClassAssociation = (LocalClassAssociation)theEObject;
				T result = caseLocalClassAssociation(localClassAssociation);
				if (result == null) result = caseAbstractAssociation(localClassAssociation);
				if (result == null) result = caseAbstractFeature(localClassAssociation);
				if (result == null) result = caseAnnotatableElement(localClassAssociation);
				if (result == null) result = caseNamedElement(localClassAssociation);
				if (result == null) result = caseViewpointElement(localClassAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.EXTERNAL_CLASS_ASSOCIATION: {
				ExternalClassAssociation externalClassAssociation = (ExternalClassAssociation)theEObject;
				T result = caseExternalClassAssociation(externalClassAssociation);
				if (result == null) result = caseAbstractAssociation(externalClassAssociation);
				if (result == null) result = caseAbstractFeature(externalClassAssociation);
				if (result == null) result = caseAnnotatableElement(externalClassAssociation);
				if (result == null) result = caseNamedElement(externalClassAssociation);
				if (result == null) result = caseViewpointElement(externalClassAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.VIEWPOINT_ELEMENT: {
				ViewpointElement viewpointElement = (ViewpointElement)theEObject;
				T result = caseViewpointElement(viewpointElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.ABSTRACT_FEATURE: {
				AbstractFeature abstractFeature = (AbstractFeature)theEObject;
				T result = caseAbstractFeature(abstractFeature);
				if (result == null) result = caseAnnotatableElement(abstractFeature);
				if (result == null) result = caseNamedElement(abstractFeature);
				if (result == null) result = caseViewpointElement(abstractFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = caseAnnotatableElement(value);
				if (result == null) result = caseNamedElement(value);
				if (result == null) result = caseViewpointElement(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.ABSTRACT_SUPER_CLASS: {
				AbstractSuperClass abstractSuperClass = (AbstractSuperClass)theEObject;
				T result = caseAbstractSuperClass(abstractSuperClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.LOCAL_SUPER_CLASS: {
				LocalSuperClass localSuperClass = (LocalSuperClass)theEObject;
				T result = caseLocalSuperClass(localSuperClass);
				if (result == null) result = caseAbstractSuperClass(localSuperClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.EXTERNAL_SUPER_CLASS: {
				ExternalSuperClass externalSuperClass = (ExternalSuperClass)theEObject;
				T result = caseExternalSuperClass(externalSuperClass);
				if (result == null) result = caseAbstractSuperClass(externalSuperClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseAnnotatableElement(operation);
				if (result == null) result = caseNamedElement(operation);
				if (result == null) result = caseViewpointElement(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseAnnotatableElement(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = caseViewpointElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.ABSTRACT_TYPE: {
				AbstractType abstractType = (AbstractType)theEObject;
				T result = caseAbstractType(abstractType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.EXTERNAL_TYPE: {
				ExternalType externalType = (ExternalType)theEObject;
				T result = caseExternalType(externalType);
				if (result == null) result = caseAbstractType(externalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.LOCAL_TYPE: {
				LocalType localType = (LocalType)theEObject;
				T result = caseLocalType(localType);
				if (result == null) result = caseAbstractType(localType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.DETAIL: {
				Detail detail = (Detail)theEObject;
				T result = caseDetail(detail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.ANNOTATABLE_ELEMENT: {
				AnnotatableElement annotatableElement = (AnnotatableElement)theEObject;
				T result = caseAnnotatableElement(annotatableElement);
				if (result == null) result = caseNamedElement(annotatableElement);
				if (result == null) result = caseViewpointElement(annotatableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.VIEWPOINT_CLASSIFIER: {
				ViewpointClassifier viewpointClassifier = (ViewpointClassifier)theEObject;
				T result = caseViewpointClassifier(viewpointClassifier);
				if (result == null) result = caseAnnotatableElement(viewpointClassifier);
				if (result == null) result = caseNamedElement(viewpointClassifier);
				if (result == null) result = caseViewpointElement(viewpointClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = caseViewpointClassifier(enumeration);
				if (result == null) result = caseAnnotatableElement(enumeration);
				if (result == null) result = caseNamedElement(enumeration);
				if (result == null) result = caseViewpointElement(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.ABSTRACT_ATTRIBUTE_TYPE: {
				AbstractAttributeType abstractAttributeType = (AbstractAttributeType)theEObject;
				T result = caseAbstractAttributeType(abstractAttributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.LOCAL_ATTRIBUTE_TYPE: {
				LocalAttributeType localAttributeType = (LocalAttributeType)theEObject;
				T result = caseLocalAttributeType(localAttributeType);
				if (result == null) result = caseAbstractAttributeType(localAttributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.EXTERNAL_ATTRIBUTE_TYPE: {
				ExternalAttributeType externalAttributeType = (ExternalAttributeType)theEObject;
				T result = caseExternalAttributeType(externalAttributeType);
				if (result == null) result = caseAbstractAttributeType(externalAttributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.VIEWPOINT_RESOURCES: {
				ViewpointResources viewpointResources = (ViewpointResources)theEObject;
				T result = caseViewpointResources(viewpointResources);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.ABSTRACT_RESOURCE: {
				AbstractResource abstractResource = (AbstractResource)theEObject;
				T result = caseAbstractResource(abstractResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.EMF_RESOURCE: {
				EMFResource emfResource = (EMFResource)theEObject;
				T result = caseEMFResource(emfResource);
				if (result == null) result = caseAbstractResource(emfResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdescPackage.FILE_SYSTEM_RESOURCE: {
				FileSystemResource fileSystemResource = (FileSystemResource)theEObject;
				T result = caseFileSystemResource(fileSystemResource);
				if (result == null) result = caseAbstractResource(fileSystemResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Viewpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Viewpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewpoint(Viewpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAspect(Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAssociation(AbstractAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Short Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShortNamedElement(ShortNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Class Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Class Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalClassAssociation(LocalClassAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Class Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Class Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalClassAssociation(ExternalClassAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Viewpoint Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Viewpoint Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewpointElement(ViewpointElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFeature(AbstractFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Super Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Super Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSuperClass(AbstractSuperClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Super Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Super Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalSuperClass(LocalSuperClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Super Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Super Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalSuperClass(ExternalSuperClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractType(AbstractType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalType(ExternalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalType(LocalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetail(Detail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotatable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotatable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotatableElement(AnnotatableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Viewpoint Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Viewpoint Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewpointClassifier(ViewpointClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAttributeType(AbstractAttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalAttributeType(LocalAttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalAttributeType(ExternalAttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Viewpoint Resources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Viewpoint Resources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewpointResources(ViewpointResources object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractResource(AbstractResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFResource(EMFResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File System Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File System Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSystemResource(FileSystemResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VpdescSwitch

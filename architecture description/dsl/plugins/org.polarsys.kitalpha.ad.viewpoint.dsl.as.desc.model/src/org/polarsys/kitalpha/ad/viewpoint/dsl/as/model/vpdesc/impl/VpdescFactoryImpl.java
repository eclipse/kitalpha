/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Annotation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Association_Types;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Cardinalities;
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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Operation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Parameter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Value;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointResources;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VpdescFactoryImpl extends EFactoryImpl implements VpdescFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VpdescFactory init() {
		try {
			VpdescFactory theVpdescFactory = (VpdescFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/vpdesc/1.0.0"); 
			if (theVpdescFactory != null) {
				return theVpdescFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VpdescFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpdescFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VpdescPackage.VIEWPOINT: return createViewpoint();
			case VpdescPackage.DATA: return createData();
			case VpdescPackage.CLASS: return createClass();
			case VpdescPackage.ATTRIBUTE: return createAttribute();
			case VpdescPackage.LOCAL_CLASS_ASSOCIATION: return createLocalClassAssociation();
			case VpdescPackage.EXTERNAL_CLASS_ASSOCIATION: return createExternalClassAssociation();
			case VpdescPackage.VALUE: return createValue();
			case VpdescPackage.LOCAL_SUPER_CLASS: return createLocalSuperClass();
			case VpdescPackage.EXTERNAL_SUPER_CLASS: return createExternalSuperClass();
			case VpdescPackage.OPERATION: return createOperation();
			case VpdescPackage.PARAMETER: return createParameter();
			case VpdescPackage.EXTERNAL_TYPE: return createExternalType();
			case VpdescPackage.LOCAL_TYPE: return createLocalType();
			case VpdescPackage.ANNOTATION: return createAnnotation();
			case VpdescPackage.DETAIL: return createDetail();
			case VpdescPackage.ENUMERATION: return createEnumeration();
			case VpdescPackage.LOCAL_ATTRIBUTE_TYPE: return createLocalAttributeType();
			case VpdescPackage.EXTERNAL_ATTRIBUTE_TYPE: return createExternalAttributeType();
			case VpdescPackage.VIEWPOINT_RESOURCES: return createViewpointResources();
			case VpdescPackage.EMF_RESOURCE: return createEMFResource();
			case VpdescPackage.FILE_SYSTEM_RESOURCE: return createFileSystemResource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case VpdescPackage.ASSOCIATION_TYPES:
				return createAssociation_TypesFromString(eDataType, initialValue);
			case VpdescPackage.CARDINALITIES:
				return createCardinalitiesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case VpdescPackage.ASSOCIATION_TYPES:
				return convertAssociation_TypesToString(eDataType, instanceValue);
			case VpdescPackage.CARDINALITIES:
				return convertCardinalitiesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Viewpoint createViewpoint() {
		ViewpointImpl viewpoint = new ViewpointImpl();
		return viewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalClassAssociation createLocalClassAssociation() {
		LocalClassAssociationImpl localClassAssociation = new LocalClassAssociationImpl();
		return localClassAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalClassAssociation createExternalClassAssociation() {
		ExternalClassAssociationImpl externalClassAssociation = new ExternalClassAssociationImpl();
		return externalClassAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalSuperClass createLocalSuperClass() {
		LocalSuperClassImpl localSuperClass = new LocalSuperClassImpl();
		return localSuperClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalSuperClass createExternalSuperClass() {
		ExternalSuperClassImpl externalSuperClass = new ExternalSuperClassImpl();
		return externalSuperClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalType createExternalType() {
		ExternalTypeImpl externalType = new ExternalTypeImpl();
		return externalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalType createLocalType() {
		LocalTypeImpl localType = new LocalTypeImpl();
		return localType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Detail createDetail() {
		DetailImpl detail = new DetailImpl();
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAttributeType createLocalAttributeType() {
		LocalAttributeTypeImpl localAttributeType = new LocalAttributeTypeImpl();
		return localAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalAttributeType createExternalAttributeType() {
		ExternalAttributeTypeImpl externalAttributeType = new ExternalAttributeTypeImpl();
		return externalAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewpointResources createViewpointResources() {
		ViewpointResourcesImpl viewpointResources = new ViewpointResourcesImpl();
		return viewpointResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFResource createEMFResource() {
		EMFResourceImpl emfResource = new EMFResourceImpl();
		return emfResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSystemResource createFileSystemResource() {
		FileSystemResourceImpl fileSystemResource = new FileSystemResourceImpl();
		return fileSystemResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association_Types createAssociation_TypesFromString(
			EDataType eDataType, String initialValue) {
		Association_Types result = Association_Types.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssociation_TypesToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinalities createCardinalitiesFromString(EDataType eDataType,
			String initialValue) {
		Cardinalities result = Cardinalities.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardinalitiesToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpdescPackage getVpdescPackage() {
		return (VpdescPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VpdescPackage getPackage() {
		return VpdescPackage.eINSTANCE;
	}

} //VpdescFactoryImpl

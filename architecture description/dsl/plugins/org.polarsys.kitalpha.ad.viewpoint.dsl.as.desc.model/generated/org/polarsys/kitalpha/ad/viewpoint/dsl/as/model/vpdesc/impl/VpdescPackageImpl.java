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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AnnotatableElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Annotation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Operation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Parameter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ShortNamedElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Value;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointClassifier;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointResources;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VpdescPackageImpl extends EPackageImpl implements VpdescPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localClassAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalClassAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewpointElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSuperClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localSuperClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalSuperClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotatableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewpointClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractAttributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localAttributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalAttributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewpointResourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileSystemResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum association_TypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardinalitiesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VpdescPackageImpl() {
		super(eNS_URI, VpdescFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VpdescPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VpdescPackage init() {
		if (isInited) return (VpdescPackage)EPackage.Registry.INSTANCE.getEPackage(VpdescPackage.eNS_URI);

		// Obtain or create and register package
		VpdescPackageImpl theVpdescPackage = (VpdescPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VpdescPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VpdescPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theVpdescPackage.createPackageContents();

		// Initialize created meta-data
		theVpdescPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVpdescPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VpdescPackage.eNS_URI, theVpdescPackage);
		return theVpdescPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewpoint() {
		return viewpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewpoint_VP_Data() {
		return (EReference)viewpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewpoint_VP_Aspects() {
		return (EReference)viewpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewpoint_Dependencies() {
		return (EReference)viewpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewpoint_Parents() {
		return (EReference)viewpointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewpoint_UseViewpoint() {
		return (EReference)viewpointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewpoint_ViewpointResources() {
		return (EReference)viewpointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_VP_Classes() {
		return (EReference)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_AdditionalExternalData() {
		return (EReference)dataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_VP_Enumerations() {
		return (EReference)dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAspect() {
		return aspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_VP_Classes_Associations() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_VP_Class_Attributes() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Extends() {
		return (EReference)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Icon() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Inheritences() {
		return (EReference)classEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Abstract() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_VP_Class_Operations() {
		return (EReference)classEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractAssociation() {
		return abstractAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractAssociation_Type() {
		return (EAttribute)abstractAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsId() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Owned_values() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Owned_type() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Description() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShortNamedElement() {
		return shortNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortNamedElement_ShortName() {
		return (EAttribute)shortNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalClassAssociation() {
		return localClassAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalClassAssociation_LocalTarget() {
		return (EReference)localClassAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalClassAssociation_Opposite() {
		return (EReference)localClassAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalClassAssociation() {
		return externalClassAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalClassAssociation_ExternalTarget() {
		return (EReference)externalClassAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewpointElement() {
		return viewpointElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewpointElement_Id() {
		return (EAttribute)viewpointElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFeature() {
		return abstractFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractFeature_Cardinality() {
		return (EAttribute)abstractFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractFeature_Changeable() {
		return (EAttribute)abstractFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractFeature_Derived() {
		return (EAttribute)abstractFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractFeature_Ordered() {
		return (EAttribute)abstractFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractFeature_Transient() {
		return (EAttribute)abstractFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractFeature_Unique() {
		return (EAttribute)abstractFeatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractFeature_Unsettable() {
		return (EAttribute)abstractFeatureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractFeature_Volatile() {
		return (EAttribute)abstractFeatureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValue_Literal() {
		return (EAttribute)valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSuperClass() {
		return abstractSuperClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalSuperClass() {
		return localSuperClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalSuperClass_SuperClass() {
		return (EReference)localSuperClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalSuperClass() {
		return externalSuperClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalSuperClass_SuperClass() {
		return (EReference)externalSuperClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Parameters() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Operation_type() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Parameter_type() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractType() {
		return abstractTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractType_Cardinality() {
		return (EAttribute)abstractTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalType() {
		return externalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalType_Type() {
		return (EReference)externalTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalType() {
		return localTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalType_Type() {
		return (EReference)localTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Source() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_Owned_details() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetail() {
		return detailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetail_Key() {
		return (EAttribute)detailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetail_Value() {
		return (EAttribute)detailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotatableElement() {
		return annotatableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotatableElement_Owned_annotations() {
		return (EReference)annotatableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewpointClassifier() {
		return viewpointClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_OwnedValues() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractAttributeType() {
		return abstractAttributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalAttributeType() {
		return localAttributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAttributeType_Type() {
		return (EReference)localAttributeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalAttributeType() {
		return externalAttributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalAttributeType_Type() {
		return (EReference)externalAttributeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewpointResources() {
		return viewpointResourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewpointResources_UseResource() {
		return (EReference)viewpointResourcesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractResource() {
		return abstractResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFResource() {
		return emfResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMFResource_Uri() {
		return (EAttribute)emfResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileSystemResource() {
		return fileSystemResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileSystemResource_Path() {
		return (EAttribute)fileSystemResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileSystemResource_Workspace() {
		return (EAttribute)fileSystemResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssociation_Types() {
		return association_TypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCardinalities() {
		return cardinalitiesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpdescFactory getVpdescFactory() {
		return (VpdescFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		viewpointEClass = createEClass(VIEWPOINT);
		createEReference(viewpointEClass, VIEWPOINT__VP_DATA);
		createEReference(viewpointEClass, VIEWPOINT__VP_ASPECTS);
		createEReference(viewpointEClass, VIEWPOINT__DEPENDENCIES);
		createEReference(viewpointEClass, VIEWPOINT__PARENTS);
		createEReference(viewpointEClass, VIEWPOINT__USE_VIEWPOINT);
		createEReference(viewpointEClass, VIEWPOINT__VIEWPOINT_RESOURCES);

		dataEClass = createEClass(DATA);
		createEReference(dataEClass, DATA__VP_CLASSES);
		createEReference(dataEClass, DATA__VP_ENUMERATIONS);
		createEReference(dataEClass, DATA__ADDITIONAL_EXTERNAL_DATA);

		aspectEClass = createEClass(ASPECT);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__VP_CLASSES_ASSOCIATIONS);
		createEReference(classEClass, CLASS__VP_CLASS_ATTRIBUTES);
		createEReference(classEClass, CLASS__EXTENDS);
		createEAttribute(classEClass, CLASS__ICON);
		createEReference(classEClass, CLASS__INHERITENCES);
		createEAttribute(classEClass, CLASS__ABSTRACT);
		createEReference(classEClass, CLASS__VP_CLASS_OPERATIONS);

		abstractAssociationEClass = createEClass(ABSTRACT_ASSOCIATION);
		createEAttribute(abstractAssociationEClass, ABSTRACT_ASSOCIATION__TYPE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_ID);
		createEReference(attributeEClass, ATTRIBUTE__OWNED_VALUES);
		createEReference(attributeEClass, ATTRIBUTE__OWNED_TYPE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__DESCRIPTION);

		shortNamedElementEClass = createEClass(SHORT_NAMED_ELEMENT);
		createEAttribute(shortNamedElementEClass, SHORT_NAMED_ELEMENT__SHORT_NAME);

		localClassAssociationEClass = createEClass(LOCAL_CLASS_ASSOCIATION);
		createEReference(localClassAssociationEClass, LOCAL_CLASS_ASSOCIATION__LOCAL_TARGET);
		createEReference(localClassAssociationEClass, LOCAL_CLASS_ASSOCIATION__OPPOSITE);

		externalClassAssociationEClass = createEClass(EXTERNAL_CLASS_ASSOCIATION);
		createEReference(externalClassAssociationEClass, EXTERNAL_CLASS_ASSOCIATION__EXTERNAL_TARGET);

		viewpointElementEClass = createEClass(VIEWPOINT_ELEMENT);
		createEAttribute(viewpointElementEClass, VIEWPOINT_ELEMENT__ID);

		abstractFeatureEClass = createEClass(ABSTRACT_FEATURE);
		createEAttribute(abstractFeatureEClass, ABSTRACT_FEATURE__CARDINALITY);
		createEAttribute(abstractFeatureEClass, ABSTRACT_FEATURE__CHANGEABLE);
		createEAttribute(abstractFeatureEClass, ABSTRACT_FEATURE__DERIVED);
		createEAttribute(abstractFeatureEClass, ABSTRACT_FEATURE__ORDERED);
		createEAttribute(abstractFeatureEClass, ABSTRACT_FEATURE__TRANSIENT);
		createEAttribute(abstractFeatureEClass, ABSTRACT_FEATURE__UNIQUE);
		createEAttribute(abstractFeatureEClass, ABSTRACT_FEATURE__UNSETTABLE);
		createEAttribute(abstractFeatureEClass, ABSTRACT_FEATURE__VOLATILE);

		valueEClass = createEClass(VALUE);
		createEAttribute(valueEClass, VALUE__LITERAL);

		abstractSuperClassEClass = createEClass(ABSTRACT_SUPER_CLASS);

		localSuperClassEClass = createEClass(LOCAL_SUPER_CLASS);
		createEReference(localSuperClassEClass, LOCAL_SUPER_CLASS__SUPER_CLASS);

		externalSuperClassEClass = createEClass(EXTERNAL_SUPER_CLASS);
		createEReference(externalSuperClassEClass, EXTERNAL_SUPER_CLASS__SUPER_CLASS);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__PARAMETERS);
		createEReference(operationEClass, OPERATION__OPERATION_TYPE);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__PARAMETER_TYPE);

		abstractTypeEClass = createEClass(ABSTRACT_TYPE);
		createEAttribute(abstractTypeEClass, ABSTRACT_TYPE__CARDINALITY);

		externalTypeEClass = createEClass(EXTERNAL_TYPE);
		createEReference(externalTypeEClass, EXTERNAL_TYPE__TYPE);

		localTypeEClass = createEClass(LOCAL_TYPE);
		createEReference(localTypeEClass, LOCAL_TYPE__TYPE);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__SOURCE);
		createEReference(annotationEClass, ANNOTATION__OWNED_DETAILS);

		detailEClass = createEClass(DETAIL);
		createEAttribute(detailEClass, DETAIL__KEY);
		createEAttribute(detailEClass, DETAIL__VALUE);

		annotatableElementEClass = createEClass(ANNOTATABLE_ELEMENT);
		createEReference(annotatableElementEClass, ANNOTATABLE_ELEMENT__OWNED_ANNOTATIONS);

		viewpointClassifierEClass = createEClass(VIEWPOINT_CLASSIFIER);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__OWNED_VALUES);

		abstractAttributeTypeEClass = createEClass(ABSTRACT_ATTRIBUTE_TYPE);

		localAttributeTypeEClass = createEClass(LOCAL_ATTRIBUTE_TYPE);
		createEReference(localAttributeTypeEClass, LOCAL_ATTRIBUTE_TYPE__TYPE);

		externalAttributeTypeEClass = createEClass(EXTERNAL_ATTRIBUTE_TYPE);
		createEReference(externalAttributeTypeEClass, EXTERNAL_ATTRIBUTE_TYPE__TYPE);

		viewpointResourcesEClass = createEClass(VIEWPOINT_RESOURCES);
		createEReference(viewpointResourcesEClass, VIEWPOINT_RESOURCES__USE_RESOURCE);

		abstractResourceEClass = createEClass(ABSTRACT_RESOURCE);

		emfResourceEClass = createEClass(EMF_RESOURCE);
		createEAttribute(emfResourceEClass, EMF_RESOURCE__URI);

		fileSystemResourceEClass = createEClass(FILE_SYSTEM_RESOURCE);
		createEAttribute(fileSystemResourceEClass, FILE_SYSTEM_RESOURCE__PATH);
		createEAttribute(fileSystemResourceEClass, FILE_SYSTEM_RESOURCE__WORKSPACE);

		// Create enums
		association_TypesEEnum = createEEnum(ASSOCIATION_TYPES);
		cardinalitiesEEnum = createEEnum(CARDINALITIES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		viewpointEClass.getESuperTypes().add(this.getShortNamedElement());
		dataEClass.getESuperTypes().add(this.getAnnotatableElement());
		aspectEClass.getESuperTypes().add(this.getNamedElement());
		classEClass.getESuperTypes().add(this.getViewpointClassifier());
		abstractAssociationEClass.getESuperTypes().add(this.getAbstractFeature());
		attributeEClass.getESuperTypes().add(this.getAbstractFeature());
		namedElementEClass.getESuperTypes().add(this.getViewpointElement());
		shortNamedElementEClass.getESuperTypes().add(this.getNamedElement());
		localClassAssociationEClass.getESuperTypes().add(this.getAbstractAssociation());
		externalClassAssociationEClass.getESuperTypes().add(this.getAbstractAssociation());
		abstractFeatureEClass.getESuperTypes().add(this.getAnnotatableElement());
		valueEClass.getESuperTypes().add(this.getAnnotatableElement());
		localSuperClassEClass.getESuperTypes().add(this.getAbstractSuperClass());
		externalSuperClassEClass.getESuperTypes().add(this.getAbstractSuperClass());
		operationEClass.getESuperTypes().add(this.getAnnotatableElement());
		parameterEClass.getESuperTypes().add(this.getAnnotatableElement());
		externalTypeEClass.getESuperTypes().add(this.getAbstractType());
		localTypeEClass.getESuperTypes().add(this.getAbstractType());
		annotatableElementEClass.getESuperTypes().add(this.getNamedElement());
		viewpointClassifierEClass.getESuperTypes().add(this.getAnnotatableElement());
		enumerationEClass.getESuperTypes().add(this.getViewpointClassifier());
		localAttributeTypeEClass.getESuperTypes().add(this.getAbstractAttributeType());
		externalAttributeTypeEClass.getESuperTypes().add(this.getAbstractAttributeType());
		emfResourceEClass.getESuperTypes().add(this.getAbstractResource());
		fileSystemResourceEClass.getESuperTypes().add(this.getAbstractResource());

		// Initialize classes and features; add operations and parameters
		initEClass(viewpointEClass, Viewpoint.class, "Viewpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewpoint_VP_Data(), this.getData(), null, "VP_Data", null, 1, 1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewpoint_VP_Aspects(), this.getAspect(), null, "VP_Aspects", null, 0, -1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewpoint_Dependencies(), this.getViewpoint(), null, "dependencies", null, 0, -1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewpoint_Parents(), this.getViewpoint(), null, "parents", null, 0, -1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewpoint_UseViewpoint(), this.getViewpoint(), null, "useViewpoint", null, 0, -1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewpoint_ViewpointResources(), this.getViewpointResources(), null, "viewpointResources", null, 0, 1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getData_VP_Classes(), this.getClass_(), null, "VP_Classes", null, 0, -1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_VP_Enumerations(), this.getEnumeration(), null, "VP_Enumerations", null, 0, -1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_AdditionalExternalData(), theEcorePackage.getEPackage(), null, "additionalExternalData", null, 0, -1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aspectEClass, Aspect.class, "Aspect", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classEClass, org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_VP_Classes_Associations(), this.getAbstractAssociation(), null, "VP_Classes_Associations", null, 0, -1, org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_VP_Class_Attributes(), this.getAttribute(), null, "VP_Class_Attributes", null, 0, -1, org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Extends(), theEcorePackage.getEClass(), null, "extends", null, 0, -1, org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Inheritences(), this.getAbstractSuperClass(), null, "Inheritences", null, 0, -1, org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_VP_Class_Operations(), this.getOperation(), null, "VP_Class_Operations", null, 0, -1, org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractAssociationEClass, AbstractAssociation.class, "AbstractAssociation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractAssociation_Type(), this.getAssociation_Types(), "type", null, 0, 1, AbstractAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_IsId(), ecorePackage.getEBoolean(), "isId", "false", 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Owned_values(), this.getValue(), null, "owned_values", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Owned_type(), this.getAbstractAttributeType(), null, "owned_type", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shortNamedElementEClass, ShortNamedElement.class, "ShortNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShortNamedElement_ShortName(), ecorePackage.getEString(), "shortName", null, 0, 1, ShortNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localClassAssociationEClass, LocalClassAssociation.class, "LocalClassAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalClassAssociation_LocalTarget(), this.getClass_(), null, "LocalTarget", null, 1, 1, LocalClassAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalClassAssociation_Opposite(), this.getLocalClassAssociation(), null, "opposite", null, 0, 1, LocalClassAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalClassAssociationEClass, ExternalClassAssociation.class, "ExternalClassAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalClassAssociation_ExternalTarget(), theEcorePackage.getEClass(), null, "ExternalTarget", null, 1, 1, ExternalClassAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewpointElementEClass, ViewpointElement.class, "ViewpointElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewpointElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, ViewpointElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractFeatureEClass, AbstractFeature.class, "AbstractFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractFeature_Cardinality(), this.getCardinalities(), "cardinality", "0..1", 0, 1, AbstractFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractFeature_Changeable(), ecorePackage.getEBoolean(), "changeable", "true", 0, 1, AbstractFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractFeature_Derived(), ecorePackage.getEBoolean(), "derived", null, 0, 1, AbstractFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractFeature_Ordered(), ecorePackage.getEBoolean(), "ordered", "true", 0, 1, AbstractFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractFeature_Transient(), ecorePackage.getEBoolean(), "transient", null, 0, 1, AbstractFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractFeature_Unique(), ecorePackage.getEBoolean(), "unique", "true", 0, 1, AbstractFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractFeature_Unsettable(), ecorePackage.getEBoolean(), "unsettable", null, 0, 1, AbstractFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractFeature_Volatile(), ecorePackage.getEBoolean(), "volatile", null, 0, 1, AbstractFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValue_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractSuperClassEClass, AbstractSuperClass.class, "AbstractSuperClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(localSuperClassEClass, LocalSuperClass.class, "LocalSuperClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalSuperClass_SuperClass(), this.getClass_(), null, "superClass", null, 1, 1, LocalSuperClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalSuperClassEClass, ExternalSuperClass.class, "ExternalSuperClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalSuperClass_SuperClass(), theEcorePackage.getEClass(), null, "superClass", null, 1, 1, ExternalSuperClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Operation_type(), this.getAbstractType(), null, "operation_type", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Parameter_type(), this.getAbstractType(), null, "parameter_type", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractTypeEClass, AbstractType.class, "AbstractType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractType_Cardinality(), this.getCardinalities(), "cardinality", null, 0, 1, AbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(abstractTypeEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(abstractTypeEClass, theEcorePackage.getEObject(), "getConcretType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(externalTypeEClass, ExternalType.class, "ExternalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalType_Type(), theEcorePackage.getEClassifier(), null, "type", null, 1, 1, ExternalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localTypeEClass, LocalType.class, "LocalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalType_Type(), this.getViewpointClassifier(), null, "type", null, 1, 1, LocalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Source(), ecorePackage.getEString(), "source", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotation_Owned_details(), this.getDetail(), null, "owned_details", null, 0, -1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(detailEClass, Detail.class, "Detail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDetail_Key(), ecorePackage.getEString(), "key", null, 0, 1, Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetail_Value(), ecorePackage.getEString(), "value", null, 0, 1, Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatableElementEClass, AnnotatableElement.class, "AnnotatableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatableElement_Owned_annotations(), this.getAnnotation(), null, "owned_annotations", null, 0, -1, AnnotatableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewpointClassifierEClass, ViewpointClassifier.class, "ViewpointClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_OwnedValues(), this.getValue(), null, "ownedValues", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractAttributeTypeEClass, AbstractAttributeType.class, "AbstractAttributeType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(abstractAttributeTypeEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(localAttributeTypeEClass, LocalAttributeType.class, "LocalAttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalAttributeType_Type(), this.getEnumeration(), null, "type", null, 1, 1, LocalAttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalAttributeTypeEClass, ExternalAttributeType.class, "ExternalAttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalAttributeType_Type(), theEcorePackage.getEDataType(), null, "type", null, 1, 1, ExternalAttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewpointResourcesEClass, ViewpointResources.class, "ViewpointResources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewpointResources_UseResource(), this.getAbstractResource(), null, "useResource", null, 0, -1, ViewpointResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractResourceEClass, AbstractResource.class, "AbstractResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emfResourceEClass, EMFResource.class, "EMFResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMFResource_Uri(), theEcorePackage.getEString(), "uri", null, 0, 1, EMFResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileSystemResourceEClass, FileSystemResource.class, "FileSystemResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileSystemResource_Path(), theEcorePackage.getEString(), "path", null, 0, 1, FileSystemResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileSystemResource_Workspace(), theEcorePackage.getEBoolean(), "workspace", null, 0, 1, FileSystemResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(association_TypesEEnum, Association_Types.class, "Association_Types");
		addEEnumLiteral(association_TypesEEnum, Association_Types.CONTAINMENT);
		addEEnumLiteral(association_TypesEEnum, Association_Types.REFERENCE);

		initEEnum(cardinalitiesEEnum, Cardinalities.class, "Cardinalities");
		addEEnumLiteral(cardinalitiesEEnum, Cardinalities.NOTHING_OR_ONE);
		addEEnumLiteral(cardinalitiesEEnum, Cardinalities.ONLY_ONE);
		addEEnumLiteral(cardinalitiesEEnum, Cardinalities.NOTHING_OR_MANY);
		addEEnumLiteral(cardinalitiesEEnum, Cardinalities.ONE_OR_MANY);

		// Create resource
		createResource(eNS_URI);
	}

} //VpdescPackageImpl

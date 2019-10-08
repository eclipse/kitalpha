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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.CommondataFactory
 * @model kind="package"
 * @generated
 */
public interface CommondataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "commondata"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/commondata/1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "commondata"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommondataPackage eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.CommondataPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.AbstractClassImpl <em>Abstract Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.AbstractClassImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.CommondataPackageImpl#getAbstractClass()
	 * @generated
	 */
	int ABSTRACT_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Abstract Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.ExternalClassImpl <em>External Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.ExternalClassImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.CommondataPackageImpl#getExternalClass()
	 * @generated
	 */
	int EXTERNAL_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CLASS__CLASS = ABSTRACT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CLASS_FEATURE_COUNT = ABSTRACT_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.LocalClassImpl <em>Local Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.LocalClassImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.CommondataPackageImpl#getLocalClass()
	 * @generated
	 */
	int LOCAL_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLASS__CLASS = ABSTRACT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLASS_FEATURE_COUNT = ABSTRACT_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.AbstractAssociationImpl <em>Abstract Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.AbstractAssociationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.CommondataPackageImpl#getAbstractAssociation()
	 * @generated
	 */
	int ABSTRACT_ASSOCIATION = 3;

	/**
	 * The number of structural features of the '<em>Abstract Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSOCIATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.ExternalAssociationImpl <em>External Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.ExternalAssociationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.CommondataPackageImpl#getExternalAssociation()
	 * @generated
	 */
	int EXTERNAL_ASSOCIATION = 4;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ASSOCIATION__REFERENCE = ABSTRACT_ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ASSOCIATION_FEATURE_COUNT = ABSTRACT_ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.LocalAssociationImpl <em>Local Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.LocalAssociationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.CommondataPackageImpl#getLocalAssociation()
	 * @generated
	 */
	int LOCAL_ASSOCIATION = 5;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ASSOCIATION__REFERENCE = ABSTRACT_ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ASSOCIATION_FEATURE_COUNT = ABSTRACT_ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.AbstractAttributeImpl <em>Abstract Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.AbstractAttributeImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.CommondataPackageImpl#getAbstractAttribute()
	 * @generated
	 */
	int ABSTRACT_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Abstract Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ATTRIBUTE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.LocalAttributeImpl <em>Local Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.LocalAttributeImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.CommondataPackageImpl#getLocalAttribute()
	 * @generated
	 */
	int LOCAL_ATTRIBUTE = 7;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ATTRIBUTE__ATTRIBUTE = ABSTRACT_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ATTRIBUTE_FEATURE_COUNT = ABSTRACT_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.ExternalAttributeImpl <em>External Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.ExternalAttributeImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.CommondataPackageImpl#getExternalAttribute()
	 * @generated
	 */
	int EXTERNAL_ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ATTRIBUTE__ATTRIBUTE = ABSTRACT_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ATTRIBUTE_FEATURE_COUNT = ABSTRACT_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractClass <em>Abstract Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Class</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractClass
	 * @generated
	 */
	EClass getAbstractClass();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalClass <em>External Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Class</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalClass
	 * @generated
	 */
	EClass getExternalClass();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalClass#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalClass#getClass_()
	 * @see #getExternalClass()
	 * @generated
	 */
	EReference getExternalClass_Class();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalClass <em>Local Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Class</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalClass
	 * @generated
	 */
	EClass getLocalClass();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalClass#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalClass#getClass_()
	 * @see #getLocalClass()
	 * @generated
	 */
	EReference getLocalClass_Class();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractAssociation <em>Abstract Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Association</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractAssociation
	 * @generated
	 */
	EClass getAbstractAssociation();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalAssociation <em>External Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Association</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalAssociation
	 * @generated
	 */
	EClass getExternalAssociation();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalAssociation#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalAssociation#getReference()
	 * @see #getExternalAssociation()
	 * @generated
	 */
	EReference getExternalAssociation_Reference();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAssociation <em>Local Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Association</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAssociation
	 * @generated
	 */
	EClass getLocalAssociation();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAssociation#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAssociation#getReference()
	 * @see #getLocalAssociation()
	 * @generated
	 */
	EReference getLocalAssociation_Reference();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractAttribute <em>Abstract Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Attribute</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractAttribute
	 * @generated
	 */
	EClass getAbstractAttribute();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAttribute <em>Local Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Attribute</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAttribute
	 * @generated
	 */
	EClass getLocalAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAttribute#getAttribute()
	 * @see #getLocalAttribute()
	 * @generated
	 */
	EReference getLocalAttribute_Attribute();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalAttribute <em>External Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Attribute</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalAttribute
	 * @generated
	 */
	EClass getExternalAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalAttribute#getAttribute()
	 * @see #getExternalAttribute()
	 * @generated
	 */
	EReference getExternalAttribute_Attribute();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommondataFactory getCommondataFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.AbstractClassImpl <em>Abstract Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.AbstractClassImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.CommondataPackageImpl#getAbstractClass()
		 * @generated
		 */
		EClass ABSTRACT_CLASS = eINSTANCE.getAbstractClass();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.ExternalClassImpl <em>External Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.ExternalClassImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.CommondataPackageImpl#getExternalClass()
		 * @generated
		 */
		EClass EXTERNAL_CLASS = eINSTANCE.getExternalClass();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_CLASS__CLASS = eINSTANCE.getExternalClass_Class();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.LocalClassImpl <em>Local Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.LocalClassImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.CommondataPackageImpl#getLocalClass()
		 * @generated
		 */
		EClass LOCAL_CLASS = eINSTANCE.getLocalClass();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_CLASS__CLASS = eINSTANCE.getLocalClass_Class();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.AbstractAssociationImpl <em>Abstract Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.AbstractAssociationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.CommondataPackageImpl#getAbstractAssociation()
		 * @generated
		 */
		EClass ABSTRACT_ASSOCIATION = eINSTANCE.getAbstractAssociation();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.ExternalAssociationImpl <em>External Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.ExternalAssociationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.CommondataPackageImpl#getExternalAssociation()
		 * @generated
		 */
		EClass EXTERNAL_ASSOCIATION = eINSTANCE.getExternalAssociation();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_ASSOCIATION__REFERENCE = eINSTANCE.getExternalAssociation_Reference();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.LocalAssociationImpl <em>Local Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.LocalAssociationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.CommondataPackageImpl#getLocalAssociation()
		 * @generated
		 */
		EClass LOCAL_ASSOCIATION = eINSTANCE.getLocalAssociation();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_ASSOCIATION__REFERENCE = eINSTANCE.getLocalAssociation_Reference();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.AbstractAttributeImpl <em>Abstract Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.AbstractAttributeImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.CommondataPackageImpl#getAbstractAttribute()
		 * @generated
		 */
		EClass ABSTRACT_ATTRIBUTE = eINSTANCE.getAbstractAttribute();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.LocalAttributeImpl <em>Local Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.LocalAttributeImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.CommondataPackageImpl#getLocalAttribute()
		 * @generated
		 */
		EClass LOCAL_ATTRIBUTE = eINSTANCE.getLocalAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getLocalAttribute_Attribute();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.ExternalAttributeImpl <em>External Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.ExternalAttributeImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl.CommondataPackageImpl#getExternalAttribute()
		 * @generated
		 */
		EClass EXTERNAL_ATTRIBUTE = eINSTANCE.getExternalAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getExternalAttribute_Attribute();

	}

} //CommondataPackage


package org.polarsys.capella.example.capellatags.CapellaTags;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.polarsys.kitalpha.example.tags.tags.TagsPackage;

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
 * @see org.polarsys.capella.example.capellatags.CapellaTags.CapellaTagsFactory
 * @model kind="package"
 * @generated
 */
public interface CapellaTagsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CapellaTags"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/capella/example/CapellaTags/1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CapellaTags"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CapellaTagsPackage eINSTANCE = org.polarsys.capella.example.capellatags.CapellaTags.impl.CapellaTagsPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.polarsys.capella.example.capellatags.CapellaTags.impl.CapellaTagImpl <em>Capella Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.example.capellatags.CapellaTags.impl.CapellaTagImpl
	 * @see org.polarsys.capella.example.capellatags.CapellaTags.impl.CapellaTagsPackageImpl#getCapellaTag()
	 * @generated
	 */
	int CAPELLA_TAG = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPELLA_TAG__ID = TagsPackage.TAG__ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPELLA_TAG__STATUS = TagsPackage.TAG__STATUS;

	/**
	 * The feature id for the '<em><b>Status History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPELLA_TAG__STATUS_HISTORY = TagsPackage.TAG__STATUS_HISTORY;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPELLA_TAG__OWNED_EXTENSIONS = TagsPackage.TAG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPELLA_TAG__MODEL_ELEMENT = TagsPackage.TAG_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Capella Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPELLA_TAG_FEATURE_COUNT = TagsPackage.TAG_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.example.capellatags.CapellaTags.CapellaTag <em>Capella Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capella Tag</em>'.
	 * @see org.polarsys.capella.example.capellatags.CapellaTags.CapellaTag
	 * @generated
	 */
	EClass getCapellaTag();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.example.capellatags.CapellaTags.CapellaTag#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Element</em>'.
	 * @see org.polarsys.capella.example.capellatags.CapellaTags.CapellaTag#getModelElement()
	 * @see #getCapellaTag()
	 * @generated
	 */
	EReference getCapellaTag_ModelElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CapellaTagsFactory getCapellaTagsFactory();

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
		 * The meta object literal for the '{@link org.polarsys.capella.example.capellatags.CapellaTags.impl.CapellaTagImpl <em>Capella Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.example.capellatags.CapellaTags.impl.CapellaTagImpl
		 * @see org.polarsys.capella.example.capellatags.CapellaTags.impl.CapellaTagsPackageImpl#getCapellaTag()
		 * @generated
		 */
		EClass CAPELLA_TAG = eINSTANCE.getCapellaTag();
		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPELLA_TAG__MODEL_ELEMENT = eINSTANCE.getCapellaTag_ModelElement();

	}

} //CapellaTagsPackage

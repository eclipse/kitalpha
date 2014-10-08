/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecorebasicalloc;

import org.polarsys.kitalpha.composer.metamodel.allocation.base.BasePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see ecorebasicalloc.EcorebasicallocFactory
 * @model kind="package"
 * @generated
 */
public interface EcorebasicallocPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecorebasicalloc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.polarsys.kitalpha/composer/example/basicusecase/ecorebasicalloc/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecorebasicalloc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcorebasicallocPackage eINSTANCE = ecorebasicalloc.impl.EcorebasicallocPackageImpl.init();

	/**
	 * The meta object id for the '{@link ecorebasicalloc.impl.EcoreClassImpl <em>Ecore Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecorebasicalloc.impl.EcoreClassImpl
	 * @see ecorebasicalloc.impl.EcorebasicallocPackageImpl#getEcoreClass()
	 * @generated
	 */
	int ECORE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CLASS__REFERENCED_ELEMENT = BasePackage.TYPE__REFERENCED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Ecore Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CLASS_FEATURE_COUNT = BasePackage.TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecorebasicalloc.impl.EcoreFileImpl <em>Ecore File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecorebasicalloc.impl.EcoreFileImpl
	 * @see ecorebasicalloc.impl.EcorebasicallocPackageImpl#getEcoreFile()
	 * @generated
	 */
	int ECORE_FILE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_FILE__NAME = BasePackage.FILE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_FILE__PATH = BasePackage.FILE__PATH;

	/**
	 * The feature id for the '<em><b>Owned Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_FILE__OWNED_TYPES = BasePackage.FILE__OWNED_TYPES;

	/**
	 * The number of structural features of the '<em>Ecore File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_FILE_FEATURE_COUNT = BasePackage.FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecorebasicalloc.impl.EcoreRootImpl <em>Ecore Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecorebasicalloc.impl.EcoreRootImpl
	 * @see ecorebasicalloc.impl.EcorebasicallocPackageImpl#getEcoreRoot()
	 * @generated
	 */
	int ECORE_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Owned Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_ROOT__OWNED_FILES = BasePackage.ROOT__OWNED_FILES;

	/**
	 * The number of structural features of the '<em>Ecore Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_ROOT_FEATURE_COUNT = BasePackage.ROOT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ecorebasicalloc.EcoreClass <em>Ecore Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore Class</em>'.
	 * @see ecorebasicalloc.EcoreClass
	 * @generated
	 */
	EClass getEcoreClass();

	/**
	 * Returns the meta object for class '{@link ecorebasicalloc.EcoreFile <em>Ecore File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore File</em>'.
	 * @see ecorebasicalloc.EcoreFile
	 * @generated
	 */
	EClass getEcoreFile();

	/**
	 * Returns the meta object for class '{@link ecorebasicalloc.EcoreRoot <em>Ecore Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore Root</em>'.
	 * @see ecorebasicalloc.EcoreRoot
	 * @generated
	 */
	EClass getEcoreRoot();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcorebasicallocFactory getEcorebasicallocFactory();

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
		 * The meta object literal for the '{@link ecorebasicalloc.impl.EcoreClassImpl <em>Ecore Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecorebasicalloc.impl.EcoreClassImpl
		 * @see ecorebasicalloc.impl.EcorebasicallocPackageImpl#getEcoreClass()
		 * @generated
		 */
		EClass ECORE_CLASS = eINSTANCE.getEcoreClass();

		/**
		 * The meta object literal for the '{@link ecorebasicalloc.impl.EcoreFileImpl <em>Ecore File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecorebasicalloc.impl.EcoreFileImpl
		 * @see ecorebasicalloc.impl.EcorebasicallocPackageImpl#getEcoreFile()
		 * @generated
		 */
		EClass ECORE_FILE = eINSTANCE.getEcoreFile();

		/**
		 * The meta object literal for the '{@link ecorebasicalloc.impl.EcoreRootImpl <em>Ecore Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecorebasicalloc.impl.EcoreRootImpl
		 * @see ecorebasicalloc.impl.EcorebasicallocPackageImpl#getEcoreRoot()
		 * @generated
		 */
		EClass ECORE_ROOT = eINSTANCE.getEcoreRoot();

	}

} //EcorebasicallocPackage

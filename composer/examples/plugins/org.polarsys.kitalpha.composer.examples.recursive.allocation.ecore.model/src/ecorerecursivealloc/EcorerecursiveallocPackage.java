/**
 */
package ecorerecursivealloc;

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
 * @see ecorerecursivealloc.EcorerecursiveallocFactory
 * @model kind="package"
 * @generated
 */
public interface EcorerecursiveallocPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecorerecursivealloc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.polarsys.kitalpha/composer/example/recursiveusecase/ecorerecursivealloc/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecorerecursivealloc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcorerecursiveallocPackage eINSTANCE = ecorerecursivealloc.impl.EcorerecursiveallocPackageImpl.init();

	/**
	 * The meta object id for the '{@link ecorerecursivealloc.impl.EcoreAllocRootImpl <em>Ecore Alloc Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecorerecursivealloc.impl.EcoreAllocRootImpl
	 * @see ecorerecursivealloc.impl.EcorerecursiveallocPackageImpl#getEcoreAllocRoot()
	 * @generated
	 */
	int ECORE_ALLOC_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Owned Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_ALLOC_ROOT__OWNED_FILES = BasePackage.ROOT__OWNED_FILES;

	/**
	 * The number of structural features of the '<em>Ecore Alloc Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_ALLOC_ROOT_FEATURE_COUNT = BasePackage.ROOT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecorerecursivealloc.impl.EcoreAllocFileImpl <em>Ecore Alloc File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecorerecursivealloc.impl.EcoreAllocFileImpl
	 * @see ecorerecursivealloc.impl.EcorerecursiveallocPackageImpl#getEcoreAllocFile()
	 * @generated
	 */
	int ECORE_ALLOC_FILE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_ALLOC_FILE__NAME = BasePackage.FILE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_ALLOC_FILE__PATH = BasePackage.FILE__PATH;

	/**
	 * The feature id for the '<em><b>Owned Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_ALLOC_FILE__OWNED_TYPES = BasePackage.FILE__OWNED_TYPES;

	/**
	 * The number of structural features of the '<em>Ecore Alloc File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_ALLOC_FILE_FEATURE_COUNT = BasePackage.FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecorerecursivealloc.impl.EcoreAllocTypeImpl <em>Ecore Alloc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecorerecursivealloc.impl.EcoreAllocTypeImpl
	 * @see ecorerecursivealloc.impl.EcorerecursiveallocPackageImpl#getEcoreAllocType()
	 * @generated
	 */
	int ECORE_ALLOC_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_ALLOC_TYPE__REFERENCED_ELEMENT = BasePackage.TYPE__REFERENCED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Ecore Alloc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_ALLOC_TYPE_FEATURE_COUNT = BasePackage.TYPE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ecorerecursivealloc.EcoreAllocRoot <em>Ecore Alloc Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore Alloc Root</em>'.
	 * @see ecorerecursivealloc.EcoreAllocRoot
	 * @generated
	 */
	EClass getEcoreAllocRoot();

	/**
	 * Returns the meta object for class '{@link ecorerecursivealloc.EcoreAllocFile <em>Ecore Alloc File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore Alloc File</em>'.
	 * @see ecorerecursivealloc.EcoreAllocFile
	 * @generated
	 */
	EClass getEcoreAllocFile();

	/**
	 * Returns the meta object for class '{@link ecorerecursivealloc.EcoreAllocType <em>Ecore Alloc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore Alloc Type</em>'.
	 * @see ecorerecursivealloc.EcoreAllocType
	 * @generated
	 */
	EClass getEcoreAllocType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcorerecursiveallocFactory getEcorerecursiveallocFactory();

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
		 * The meta object literal for the '{@link ecorerecursivealloc.impl.EcoreAllocRootImpl <em>Ecore Alloc Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecorerecursivealloc.impl.EcoreAllocRootImpl
		 * @see ecorerecursivealloc.impl.EcorerecursiveallocPackageImpl#getEcoreAllocRoot()
		 * @generated
		 */
		EClass ECORE_ALLOC_ROOT = eINSTANCE.getEcoreAllocRoot();

		/**
		 * The meta object literal for the '{@link ecorerecursivealloc.impl.EcoreAllocFileImpl <em>Ecore Alloc File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecorerecursivealloc.impl.EcoreAllocFileImpl
		 * @see ecorerecursivealloc.impl.EcorerecursiveallocPackageImpl#getEcoreAllocFile()
		 * @generated
		 */
		EClass ECORE_ALLOC_FILE = eINSTANCE.getEcoreAllocFile();

		/**
		 * The meta object literal for the '{@link ecorerecursivealloc.impl.EcoreAllocTypeImpl <em>Ecore Alloc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecorerecursivealloc.impl.EcoreAllocTypeImpl
		 * @see ecorerecursivealloc.impl.EcorerecursiveallocPackageImpl#getEcoreAllocType()
		 * @generated
		 */
		EClass ECORE_ALLOC_TYPE = eINSTANCE.getEcoreAllocType();

	}

} //EcorerecursiveallocPackage

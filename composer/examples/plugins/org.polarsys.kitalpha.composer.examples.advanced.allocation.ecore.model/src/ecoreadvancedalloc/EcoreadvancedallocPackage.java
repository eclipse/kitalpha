/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecoreadvancedalloc;

import org.polarsys.kitalpha.composer.metamodel.allocation.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see ecoreadvancedalloc.EcoreadvancedallocFactory
 * @model kind="package"
 * @generated
 */
public interface EcoreadvancedallocPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecoreadvancedalloc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.polarsys.kitalpha/composer/example/advancedusecase/ecoreadvancedalloc/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecoreadvancedalloc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcoreadvancedallocPackage eINSTANCE = ecoreadvancedalloc.impl.EcoreadvancedallocPackageImpl.init();

	/**
	 * The meta object id for the '{@link ecoreadvancedalloc.impl.GeneratedElementImpl <em>Generated Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreadvancedalloc.impl.GeneratedElementImpl
	 * @see ecoreadvancedalloc.impl.EcoreadvancedallocPackageImpl#getGeneratedElement()
	 * @generated
	 */
	int GENERATED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_ELEMENT__REFERENCED_ELEMENT = BasePackage.TYPE__REFERENCED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Generated Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_ELEMENT_FEATURE_COUNT = BasePackage.TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreadvancedalloc.impl.EcoreFileImpl <em>Ecore File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreadvancedalloc.impl.EcoreFileImpl
	 * @see ecoreadvancedalloc.impl.EcoreadvancedallocPackageImpl#getEcoreFile()
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
	 * The meta object id for the '{@link ecoreadvancedalloc.impl.EcoreRootImpl <em>Ecore Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreadvancedalloc.impl.EcoreRootImpl
	 * @see ecoreadvancedalloc.impl.EcoreadvancedallocPackageImpl#getEcoreRoot()
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
	 * The meta object id for the '{@link ecoreadvancedalloc.impl.ForwardDeclarationImpl <em>Forward Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreadvancedalloc.impl.ForwardDeclarationImpl
	 * @see ecoreadvancedalloc.impl.EcoreadvancedallocPackageImpl#getForwardDeclaration()
	 * @generated
	 */
	int FORWARD_DECLARATION = 3;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_DECLARATION__REFERENCED_ELEMENT = GENERATED_ELEMENT__REFERENCED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Forward Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_DECLARATION_FEATURE_COUNT = GENERATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreadvancedalloc.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreadvancedalloc.impl.DeclarationImpl
	 * @see ecoreadvancedalloc.impl.EcoreadvancedallocPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 4;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__REFERENCED_ELEMENT = GENERATED_ELEMENT__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__REFERENCES = GENERATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = GENERATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ecoreadvancedalloc.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreadvancedalloc.impl.ReferenceImpl
	 * @see ecoreadvancedalloc.impl.EcoreadvancedallocPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Hyperlink Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__HYPERLINK_REF = 1;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link ecoreadvancedalloc.GeneratedElement <em>Generated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generated Element</em>'.
	 * @see ecoreadvancedalloc.GeneratedElement
	 * @generated
	 */
	EClass getGeneratedElement();

	/**
	 * Returns the meta object for class '{@link ecoreadvancedalloc.EcoreFile <em>Ecore File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore File</em>'.
	 * @see ecoreadvancedalloc.EcoreFile
	 * @generated
	 */
	EClass getEcoreFile();

	/**
	 * Returns the meta object for class '{@link ecoreadvancedalloc.EcoreRoot <em>Ecore Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore Root</em>'.
	 * @see ecoreadvancedalloc.EcoreRoot
	 * @generated
	 */
	EClass getEcoreRoot();

	/**
	 * Returns the meta object for class '{@link ecoreadvancedalloc.ForwardDeclaration <em>Forward Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forward Declaration</em>'.
	 * @see ecoreadvancedalloc.ForwardDeclaration
	 * @generated
	 */
	EClass getForwardDeclaration();

	/**
	 * Returns the meta object for class '{@link ecoreadvancedalloc.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see ecoreadvancedalloc.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreadvancedalloc.Declaration#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see ecoreadvancedalloc.Declaration#getReferences()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_References();

	/**
	 * Returns the meta object for class '{@link ecoreadvancedalloc.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see ecoreadvancedalloc.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link ecoreadvancedalloc.Reference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecoreadvancedalloc.Reference#getName()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Name();

	/**
	 * Returns the meta object for the attribute '{@link ecoreadvancedalloc.Reference#getHyperlinkRef <em>Hyperlink Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hyperlink Ref</em>'.
	 * @see ecoreadvancedalloc.Reference#getHyperlinkRef()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_HyperlinkRef();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcoreadvancedallocFactory getEcoreadvancedallocFactory();

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
		 * The meta object literal for the '{@link ecoreadvancedalloc.impl.GeneratedElementImpl <em>Generated Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreadvancedalloc.impl.GeneratedElementImpl
		 * @see ecoreadvancedalloc.impl.EcoreadvancedallocPackageImpl#getGeneratedElement()
		 * @generated
		 */
		EClass GENERATED_ELEMENT = eINSTANCE.getGeneratedElement();

		/**
		 * The meta object literal for the '{@link ecoreadvancedalloc.impl.EcoreFileImpl <em>Ecore File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreadvancedalloc.impl.EcoreFileImpl
		 * @see ecoreadvancedalloc.impl.EcoreadvancedallocPackageImpl#getEcoreFile()
		 * @generated
		 */
		EClass ECORE_FILE = eINSTANCE.getEcoreFile();

		/**
		 * The meta object literal for the '{@link ecoreadvancedalloc.impl.EcoreRootImpl <em>Ecore Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreadvancedalloc.impl.EcoreRootImpl
		 * @see ecoreadvancedalloc.impl.EcoreadvancedallocPackageImpl#getEcoreRoot()
		 * @generated
		 */
		EClass ECORE_ROOT = eINSTANCE.getEcoreRoot();

		/**
		 * The meta object literal for the '{@link ecoreadvancedalloc.impl.ForwardDeclarationImpl <em>Forward Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreadvancedalloc.impl.ForwardDeclarationImpl
		 * @see ecoreadvancedalloc.impl.EcoreadvancedallocPackageImpl#getForwardDeclaration()
		 * @generated
		 */
		EClass FORWARD_DECLARATION = eINSTANCE.getForwardDeclaration();

		/**
		 * The meta object literal for the '{@link ecoreadvancedalloc.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreadvancedalloc.impl.DeclarationImpl
		 * @see ecoreadvancedalloc.impl.EcoreadvancedallocPackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__REFERENCES = eINSTANCE.getDeclaration_References();

		/**
		 * The meta object literal for the '{@link ecoreadvancedalloc.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreadvancedalloc.impl.ReferenceImpl
		 * @see ecoreadvancedalloc.impl.EcoreadvancedallocPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__NAME = eINSTANCE.getReference_Name();

		/**
		 * The meta object literal for the '<em><b>Hyperlink Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__HYPERLINK_REF = eINSTANCE.getReference_HyperlinkRef();

	}

} //EcoreadvancedallocPackage

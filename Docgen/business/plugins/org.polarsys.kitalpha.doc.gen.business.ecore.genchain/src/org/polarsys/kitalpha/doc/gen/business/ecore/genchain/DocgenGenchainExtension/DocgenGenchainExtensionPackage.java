/**
 */
package org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension;

import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChainPackage;

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
 * @see org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.DocgenGenchainExtensionFactory
 * @model kind="package"
 * @generated
 */
public interface DocgenGenchainExtensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DocgenGenchainExtension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/docgen/ecore/genchain/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DocgenGenchainExtension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DocgenGenchainExtensionPackage eINSTANCE = org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.impl.DocgenGenchainExtensionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.impl.KitalphaDocumentationGenerationImpl <em>Kitalpha Documentation Generation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.impl.KitalphaDocumentationGenerationImpl
	 * @see org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.impl.DocgenGenchainExtensionPackageImpl#getKitalphaDocumentationGeneration()
	 * @generated
	 */
	int KITALPHA_DOCUMENTATION_GENERATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITALPHA_DOCUMENTATION_GENERATION__NAME = GenerationChainPackage.DOCUMENTATION_GENERATION__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITALPHA_DOCUMENTATION_GENERATION__CONTAINER = GenerationChainPackage.DOCUMENTATION_GENERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Model Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITALPHA_DOCUMENTATION_GENERATION__MODEL_PATH = GenerationChainPackage.DOCUMENTATION_GENERATION__MODEL_PATH;

	/**
	 * The feature id for the '<em><b>Plugin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITALPHA_DOCUMENTATION_GENERATION__PLUGIN_NAME = GenerationChainPackage.DOCUMENTATION_GENERATION__PLUGIN_NAME;

	/**
	 * The feature id for the '<em><b>Output Directory Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITALPHA_DOCUMENTATION_GENERATION__OUTPUT_DIRECTORY_PATH = GenerationChainPackage.DOCUMENTATION_GENERATION__OUTPUT_DIRECTORY_PATH;

	/**
	 * The feature id for the '<em><b>Branding Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITALPHA_DOCUMENTATION_GENERATION__BRANDING_DATA = GenerationChainPackage.DOCUMENTATION_GENERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kitalpha Documentation Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITALPHA_DOCUMENTATION_GENERATION_FEATURE_COUNT = GenerationChainPackage.DOCUMENTATION_GENERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.impl.KitalphaDocumentationGenerationBrandingImpl <em>Kitalpha Documentation Generation Branding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.impl.KitalphaDocumentationGenerationBrandingImpl
	 * @see org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.impl.DocgenGenchainExtensionPackageImpl#getKitalphaDocumentationGenerationBranding()
	 * @generated
	 */
	int KITALPHA_DOCUMENTATION_GENERATION_BRANDING = 1;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITALPHA_DOCUMENTATION_GENERATION_BRANDING__COPYRIGHT = 0;

	/**
	 * The feature id for the '<em><b>Logo Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITALPHA_DOCUMENTATION_GENERATION_BRANDING__LOGO_PATH = 1;

	/**
	 * The feature id for the '<em><b>Logo Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITALPHA_DOCUMENTATION_GENERATION_BRANDING__LOGO_ALT = 2;

	/**
	 * The number of structural features of the '<em>Kitalpha Documentation Generation Branding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITALPHA_DOCUMENTATION_GENERATION_BRANDING_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGeneration <em>Kitalpha Documentation Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kitalpha Documentation Generation</em>'.
	 * @see org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGeneration
	 * @generated
	 */
	EClass getKitalphaDocumentationGeneration();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGeneration#getBrandingData <em>Branding Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Branding Data</em>'.
	 * @see org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGeneration#getBrandingData()
	 * @see #getKitalphaDocumentationGeneration()
	 * @generated
	 */
	EReference getKitalphaDocumentationGeneration_BrandingData();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGenerationBranding <em>Kitalpha Documentation Generation Branding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kitalpha Documentation Generation Branding</em>'.
	 * @see org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGenerationBranding
	 * @generated
	 */
	EClass getKitalphaDocumentationGenerationBranding();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGenerationBranding#getCopyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copyright</em>'.
	 * @see org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGenerationBranding#getCopyright()
	 * @see #getKitalphaDocumentationGenerationBranding()
	 * @generated
	 */
	EAttribute getKitalphaDocumentationGenerationBranding_Copyright();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGenerationBranding#getLogoPath <em>Logo Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logo Path</em>'.
	 * @see org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGenerationBranding#getLogoPath()
	 * @see #getKitalphaDocumentationGenerationBranding()
	 * @generated
	 */
	EAttribute getKitalphaDocumentationGenerationBranding_LogoPath();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGenerationBranding#getLogoAlt <em>Logo Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logo Alt</em>'.
	 * @see org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGenerationBranding#getLogoAlt()
	 * @see #getKitalphaDocumentationGenerationBranding()
	 * @generated
	 */
	EAttribute getKitalphaDocumentationGenerationBranding_LogoAlt();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DocgenGenchainExtensionFactory getDocgenGenchainExtensionFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.impl.KitalphaDocumentationGenerationImpl <em>Kitalpha Documentation Generation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.impl.KitalphaDocumentationGenerationImpl
		 * @see org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.impl.DocgenGenchainExtensionPackageImpl#getKitalphaDocumentationGeneration()
		 * @generated
		 */
		EClass KITALPHA_DOCUMENTATION_GENERATION = eINSTANCE.getKitalphaDocumentationGeneration();

		/**
		 * The meta object literal for the '<em><b>Branding Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KITALPHA_DOCUMENTATION_GENERATION__BRANDING_DATA = eINSTANCE.getKitalphaDocumentationGeneration_BrandingData();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.impl.KitalphaDocumentationGenerationBrandingImpl <em>Kitalpha Documentation Generation Branding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.impl.KitalphaDocumentationGenerationBrandingImpl
		 * @see org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.impl.DocgenGenchainExtensionPackageImpl#getKitalphaDocumentationGenerationBranding()
		 * @generated
		 */
		EClass KITALPHA_DOCUMENTATION_GENERATION_BRANDING = eINSTANCE.getKitalphaDocumentationGenerationBranding();

		/**
		 * The meta object literal for the '<em><b>Copyright</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KITALPHA_DOCUMENTATION_GENERATION_BRANDING__COPYRIGHT = eINSTANCE.getKitalphaDocumentationGenerationBranding_Copyright();

		/**
		 * The meta object literal for the '<em><b>Logo Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KITALPHA_DOCUMENTATION_GENERATION_BRANDING__LOGO_PATH = eINSTANCE.getKitalphaDocumentationGenerationBranding_LogoPath();

		/**
		 * The meta object literal for the '<em><b>Logo Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KITALPHA_DOCUMENTATION_GENERATION_BRANDING__LOGO_ALT = eINSTANCE.getKitalphaDocumentationGenerationBranding_LogoAlt();

	}

} //DocgenGenchainExtensionPackage

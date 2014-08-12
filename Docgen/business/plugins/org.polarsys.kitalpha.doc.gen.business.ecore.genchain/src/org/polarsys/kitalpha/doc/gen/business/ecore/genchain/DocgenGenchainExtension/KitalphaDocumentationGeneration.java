/**
 */
package org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension;

import org.eclipse.egf.portfolio.genchain.generationChain.DocumentationGeneration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kitalpha Documentation Generation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGeneration#getBrandingData <em>Branding Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.DocgenGenchainExtensionPackage#getKitalphaDocumentationGeneration()
 * @model
 * @generated
 */
public interface KitalphaDocumentationGeneration extends DocumentationGeneration {
	/**
	 * Returns the value of the '<em><b>Branding Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branding Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branding Data</em>' containment reference.
	 * @see #setBrandingData(KitalphaDocumentationGenerationBranding)
	 * @see org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.DocgenGenchainExtensionPackage#getKitalphaDocumentationGeneration_BrandingData()
	 * @model containment="true"
	 * @generated
	 */
	KitalphaDocumentationGenerationBranding getBrandingData();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGeneration#getBrandingData <em>Branding Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branding Data</em>' containment reference.
	 * @see #getBrandingData()
	 * @generated
	 */
	void setBrandingData(KitalphaDocumentationGenerationBranding value);

} // KitalphaDocumentationGeneration

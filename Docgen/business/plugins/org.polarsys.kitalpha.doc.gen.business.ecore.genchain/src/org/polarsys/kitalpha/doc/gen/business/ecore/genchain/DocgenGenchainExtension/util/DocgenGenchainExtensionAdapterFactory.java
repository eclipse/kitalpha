/**
 */
package org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.util;

import org.eclipse.egf.portfolio.genchain.generationChain.DocumentationGeneration;
import org.eclipse.egf.portfolio.genchain.generationChain.EcoreElement;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationElement;
import org.eclipse.egf.portfolio.genchain.generationChain.PluginProvider;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.DocgenGenchainExtensionPackage
 * @generated
 */
public class DocgenGenchainExtensionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DocgenGenchainExtensionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocgenGenchainExtensionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DocgenGenchainExtensionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocgenGenchainExtensionSwitch<Adapter> modelSwitch =
		new DocgenGenchainExtensionSwitch<Adapter>() {
			@Override
			public Adapter caseKitalphaDocumentationGeneration(KitalphaDocumentationGeneration object) {
				return createKitalphaDocumentationGenerationAdapter();
			}
			@Override
			public Adapter caseKitalphaDocumentationGenerationBranding(KitalphaDocumentationGenerationBranding object) {
				return createKitalphaDocumentationGenerationBrandingAdapter();
			}
			@Override
			public Adapter caseGenerationElement(GenerationElement object) {
				return createGenerationElementAdapter();
			}
			@Override
			public Adapter caseEcoreElement(EcoreElement object) {
				return createEcoreElementAdapter();
			}
			@Override
			public Adapter casePluginProvider(PluginProvider object) {
				return createPluginProviderAdapter();
			}
			@Override
			public Adapter caseDocumentationGeneration(DocumentationGeneration object) {
				return createDocumentationGenerationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGeneration <em>Kitalpha Documentation Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGeneration
	 * @generated
	 */
	public Adapter createKitalphaDocumentationGenerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGenerationBranding <em>Kitalpha Documentation Generation Branding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGenerationBranding
	 * @generated
	 */
	public Adapter createKitalphaDocumentationGenerationBrandingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.egf.portfolio.genchain.generationChain.GenerationElement <em>Generation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.egf.portfolio.genchain.generationChain.GenerationElement
	 * @generated
	 */
	public Adapter createGenerationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.egf.portfolio.genchain.generationChain.EcoreElement <em>Ecore Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.egf.portfolio.genchain.generationChain.EcoreElement
	 * @generated
	 */
	public Adapter createEcoreElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.egf.portfolio.genchain.generationChain.PluginProvider <em>Plugin Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.egf.portfolio.genchain.generationChain.PluginProvider
	 * @generated
	 */
	public Adapter createPluginProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.egf.portfolio.genchain.generationChain.DocumentationGeneration <em>Documentation Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.egf.portfolio.genchain.generationChain.DocumentationGeneration
	 * @generated
	 */
	public Adapter createDocumentationGenerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DocgenGenchainExtensionAdapterFactory

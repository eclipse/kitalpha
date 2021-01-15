/**
 */
package PatternDependencyAnalysis.util;

import PatternDependencyAnalysis.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see PatternDependencyAnalysis.PatternDependencyAnalysisPackage
 * @generated
 */
public class PatternDependencyAnalysisAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2020 THALES GLOBAL SERVICES.\nThis program and the accompanying materials are made available under the\nterms of the Eclipse Public License 2.0 which is available at\nhttp://www.eclipse.org/legal/epl-2.0\n\nSPDX-License-Identifier: EPL-2.0\n \nContributors:\n  Thales - initial API and implementation";
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PatternDependencyAnalysisPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternDependencyAnalysisAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PatternDependencyAnalysisPackage.eINSTANCE;
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
	protected PatternDependencyAnalysisSwitch<Adapter> modelSwitch =
		new PatternDependencyAnalysisSwitch<Adapter>() {
			@Override
			public Adapter caseRoot(Root object) {
				return createRootAdapter();
			}
			@Override
			public Adapter casePatternAnalysis(PatternAnalysis object) {
				return createPatternAnalysisAdapter();
			}
			@Override
			public Adapter casePatternMethodAnalysis(PatternMethodAnalysis object) {
				return createPatternMethodAnalysisAdapter();
			}
			@Override
			public Adapter casePatternParameterAnalysis(PatternParameterAnalysis object) {
				return createPatternParameterAnalysisAdapter();
			}
			@Override
			public Adapter caseSectionAnalysis(SectionAnalysis object) {
				return createSectionAnalysisAdapter();
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
	 * Creates a new adapter for an object of class '{@link PatternDependencyAnalysis.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PatternDependencyAnalysis.Root
	 * @generated
	 */
	public Adapter createRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PatternDependencyAnalysis.PatternAnalysis <em>Pattern Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PatternDependencyAnalysis.PatternAnalysis
	 * @generated
	 */
	public Adapter createPatternAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PatternDependencyAnalysis.PatternMethodAnalysis <em>Pattern Method Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PatternDependencyAnalysis.PatternMethodAnalysis
	 * @generated
	 */
	public Adapter createPatternMethodAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PatternDependencyAnalysis.PatternParameterAnalysis <em>Pattern Parameter Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PatternDependencyAnalysis.PatternParameterAnalysis
	 * @generated
	 */
	public Adapter createPatternParameterAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PatternDependencyAnalysis.SectionAnalysis <em>Section Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PatternDependencyAnalysis.SectionAnalysis
	 * @generated
	 */
	public Adapter createSectionAnalysisAdapter() {
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

} //PatternDependencyAnalysisAdapterFactory

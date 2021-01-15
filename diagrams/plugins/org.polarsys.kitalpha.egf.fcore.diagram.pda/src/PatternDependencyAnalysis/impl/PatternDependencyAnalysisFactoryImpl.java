/**
 */
package PatternDependencyAnalysis.impl;

import PatternDependencyAnalysis.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternDependencyAnalysisFactoryImpl extends EFactoryImpl implements PatternDependencyAnalysisFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2020 THALES GLOBAL SERVICES.\nThis program and the accompanying materials are made available under the\nterms of the Eclipse Public License 2.0 which is available at\nhttp://www.eclipse.org/legal/epl-2.0\n\nSPDX-License-Identifier: EPL-2.0\n \nContributors:\n  Thales - initial API and implementation";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PatternDependencyAnalysisFactory init() {
		try {
			PatternDependencyAnalysisFactory thePatternDependencyAnalysisFactory = (PatternDependencyAnalysisFactory)EPackage.Registry.INSTANCE.getEFactory(PatternDependencyAnalysisPackage.eNS_URI);
			if (thePatternDependencyAnalysisFactory != null) {
				return thePatternDependencyAnalysisFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PatternDependencyAnalysisFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternDependencyAnalysisFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PatternDependencyAnalysisPackage.ROOT: return createRoot();
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS: return createPatternAnalysis();
			case PatternDependencyAnalysisPackage.PATTERN_METHOD_ANALYSIS: return createPatternMethodAnalysis();
			case PatternDependencyAnalysisPackage.PATTERN_PARAMETER_ANALYSIS: return createPatternParameterAnalysis();
			case PatternDependencyAnalysisPackage.SECTION_ANALYSIS: return createSectionAnalysis();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternAnalysis createPatternAnalysis() {
		PatternAnalysisImpl patternAnalysis = new PatternAnalysisImpl();
		return patternAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternMethodAnalysis createPatternMethodAnalysis() {
		PatternMethodAnalysisImpl patternMethodAnalysis = new PatternMethodAnalysisImpl();
		return patternMethodAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternParameterAnalysis createPatternParameterAnalysis() {
		PatternParameterAnalysisImpl patternParameterAnalysis = new PatternParameterAnalysisImpl();
		return patternParameterAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionAnalysis createSectionAnalysis() {
		SectionAnalysisImpl sectionAnalysis = new SectionAnalysisImpl();
		return sectionAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternDependencyAnalysisPackage getPatternDependencyAnalysisPackage() {
		return (PatternDependencyAnalysisPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PatternDependencyAnalysisPackage getPackage() {
		return PatternDependencyAnalysisPackage.eINSTANCE;
	}

} //PatternDependencyAnalysisFactoryImpl

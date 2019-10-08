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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression;

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
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ExpressionFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expression"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/vpdiagram/expression/1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "expression"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionPackage eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Expression Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXPRESSION_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionElementImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionPackageImpl#getExpressionElement()
	 * @generated
	 */
	int EXPRESSION_ELEMENT = 4;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ForeignExpressionElementImpl <em>Foreign Expression Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ForeignExpressionElementImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionPackageImpl#getForeignExpressionElement()
	 * @generated
	 */
	int FOREIGN_EXPRESSION_ELEMENT = 5;

	/**
	 * The number of structural features of the '<em>Foreign Expression Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_EXPRESSION_ELEMENT_FEATURE_COUNT = EXPRESSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.JavaElementImpl <em>Java Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.JavaElementImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionPackageImpl#getJavaElement()
	 * @generated
	 */
	int JAVA_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ELEMENT__METHOD = FOREIGN_EXPRESSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ELEMENT_FEATURE_COUNT = FOREIGN_EXPRESSION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.DomainElementImpl <em>Domain Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.DomainElementImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionPackageImpl#getDomainElement()
	 * @generated
	 */
	int DOMAIN_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__ATTRIBUTE = FOREIGN_EXPRESSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT_FEATURE_COUNT = FOREIGN_EXPRESSION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.StringElementImpl <em>String Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.StringElementImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionPackageImpl#getStringElement()
	 * @generated
	 */
	int STRING_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ELEMENT__VALUE = EXPRESSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ELEMENT_FEATURE_COUNT = EXPRESSION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.AbstractComputableElementImpl <em>Abstract Computable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.AbstractComputableElementImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionPackageImpl#getAbstractComputableElement()
	 * @generated
	 */
	int ABSTRACT_COMPUTABLE_ELEMENT = 6;

	/**
	 * The number of structural features of the '<em>Abstract Computable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPUTABLE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.Expression#getExpressionElements <em>Expression Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression Elements</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.Expression#getExpressionElements()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_ExpressionElements();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.Expression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.Expression#getValue()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.JavaElement <em>Java Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Element</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.JavaElement
	 * @generated
	 */
	EClass getJavaElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.JavaElement#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.JavaElement#getMethod()
	 * @see #getJavaElement()
	 * @generated
	 */
	EAttribute getJavaElement_Method();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.DomainElement <em>Domain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Element</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.DomainElement
	 * @generated
	 */
	EClass getDomainElement();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.DomainElement#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.DomainElement#getAttribute()
	 * @see #getDomainElement()
	 * @generated
	 */
	EReference getDomainElement_Attribute();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.StringElement <em>String Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Element</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.StringElement
	 * @generated
	 */
	EClass getStringElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.StringElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.StringElement#getValue()
	 * @see #getStringElement()
	 * @generated
	 */
	EAttribute getStringElement_Value();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ExpressionElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ExpressionElement
	 * @generated
	 */
	EClass getExpressionElement();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ForeignExpressionElement <em>Foreign Expression Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Expression Element</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ForeignExpressionElement
	 * @generated
	 */
	EClass getForeignExpressionElement();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.AbstractComputableElement <em>Abstract Computable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Computable Element</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.AbstractComputableElement
	 * @generated
	 */
	EClass getAbstractComputableElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionFactory getExpressionFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Expression Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__EXPRESSION_ELEMENTS = eINSTANCE.getExpression_ExpressionElements();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__VALUE = eINSTANCE.getExpression_Value();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.JavaElementImpl <em>Java Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.JavaElementImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionPackageImpl#getJavaElement()
		 * @generated
		 */
		EClass JAVA_ELEMENT = eINSTANCE.getJavaElement();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_ELEMENT__METHOD = eINSTANCE.getJavaElement_Method();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.DomainElementImpl <em>Domain Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.DomainElementImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionPackageImpl#getDomainElement()
		 * @generated
		 */
		EClass DOMAIN_ELEMENT = eINSTANCE.getDomainElement();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ELEMENT__ATTRIBUTE = eINSTANCE.getDomainElement_Attribute();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.StringElementImpl <em>String Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.StringElementImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionPackageImpl#getStringElement()
		 * @generated
		 */
		EClass STRING_ELEMENT = eINSTANCE.getStringElement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ELEMENT__VALUE = eINSTANCE.getStringElement_Value();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionElementImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionPackageImpl#getExpressionElement()
		 * @generated
		 */
		EClass EXPRESSION_ELEMENT = eINSTANCE.getExpressionElement();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ForeignExpressionElementImpl <em>Foreign Expression Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ForeignExpressionElementImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionPackageImpl#getForeignExpressionElement()
		 * @generated
		 */
		EClass FOREIGN_EXPRESSION_ELEMENT = eINSTANCE.getForeignExpressionElement();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.AbstractComputableElementImpl <em>Abstract Computable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.AbstractComputableElementImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionPackageImpl#getAbstractComputableElement()
		 * @generated
		 */
		EClass ABSTRACT_COMPUTABLE_ELEMENT = eINSTANCE.getAbstractComputableElement();

	}

} //ExpressionPackage

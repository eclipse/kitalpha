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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.expression.helper.sirius.ExpressionInterpreter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.expression.helper.sirius.ExpressionKind;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.expression.helper.sirius.SiriusExpressionHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.DomainElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.Expression;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ExpressionElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ExpressionPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.JavaElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.StringElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionImpl#getExpressionElements <em>Expression Elements</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl.ExpressionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends EObjectImpl implements Expression {

	/**
	 * The cached value of the '{@link #getExpressionElements() <em>Expression Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionElement> expressionElements;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = "Empty"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * This property is added to add the adapter to the current instance only one time.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	boolean isAdapterAlreadyAdded = false;

	/**
	 * <!-- begin-user-doc -->
	 * The added code allows to define an Adapter that listen to the expressionElements list changes.
	 * For any change in this list, the Adapter adapt the value of the expression 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	public EList<ExpressionElement> getExpressionElements() {

		if (expressionElements == null) {
			expressionElements = new EObjectContainmentEList<ExpressionElement>(
					ExpressionElement.class, this,
					ExpressionPackage.EXPRESSION__EXPRESSION_ELEMENTS);
		}

		// Begin added code 
		if (!isAdapterAlreadyAdded) {
			Adapter adapter = new AdapterImpl() {
				public void notifyChanged(Notification notification) {

					switch (notification.getFeatureID(Expression.class)) {
					case ExpressionPackage.EXPRESSION__EXPRESSION_ELEMENTS:
						adaptValue();
						return;
					}
				}
			};
			this.eAdapters().add(adapter);
			isAdapterAlreadyAdded = true;
		}
		// End added code 

		return expressionElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getValue() {

		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setValue(String newValue) {

		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.EXPRESSION__VALUE, oldValue, value));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionPackage.EXPRESSION__EXPRESSION_ELEMENTS:
				return ((InternalEList<?>)getExpressionElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionPackage.EXPRESSION__EXPRESSION_ELEMENTS:
				return getExpressionElements();
			case ExpressionPackage.EXPRESSION__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExpressionPackage.EXPRESSION__EXPRESSION_ELEMENTS:
				getExpressionElements().clear();
				getExpressionElements().addAll((Collection<? extends ExpressionElement>)newValue);
				return;
			case ExpressionPackage.EXPRESSION__VALUE:
				setValue((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExpressionPackage.EXPRESSION__EXPRESSION_ELEMENTS:
				getExpressionElements().clear();
				return;
			case ExpressionPackage.EXPRESSION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExpressionPackage.EXPRESSION__EXPRESSION_ELEMENTS:
				return expressionElements != null && !expressionElements.isEmpty();
			case ExpressionPackage.EXPRESSION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * This allows to create the adapter that listen to the changes the ExpressionElements changes.
	 * If an ExpressionElement changes, the adapter call the adaptValue() method to calculate the expression. 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Adapter getExpressionElementAdapter() {
		return new AdapterImpl() {
			public void notifyChanged(Notification notification) {
				if (notification.getFeatureID(StringElement.class) != Notification.NO_FEATURE_ID
						|| notification.getFeatureID(DomainElement.class) != Notification.NO_FEATURE_ID
						|| notification.getFeatureID(JavaElement.class) != Notification.NO_FEATURE_ID) {
					adaptValue();
				}
			}
		};
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void adaptValue() {
		adaptValue(null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void adaptValue(String javaMethodParams, boolean addParams) {
		if (expressionElements == null) 
			return;

		if (expressionElements.isEmpty()) 
		{
			value = VALUE_EDEFAULT;
			return;
		}

		value = "";
		boolean multiple = expressionElements.size() > 1;
		for (ExpressionElement expressionElement : expressionElements) 
		{
			switch (expressionElement.eClass().getClassifierID()) 
			{
			case ExpressionPackage.STRING_ELEMENT:
				StringElement sElement = (StringElement) expressionElement;
				if (sElement.getValue() != null && sElement.getValue().trim().length() > 0)
					value += SiriusExpressionHelper.formatString(sElement.getValue());
				
				break;
				
			case ExpressionPackage.DOMAIN_ELEMENT:
				DomainElement dElement = (DomainElement) expressionElement;
				if (dElement.getAttribute() != null
						&& dElement.getAttribute().getName() != null
						&& dElement.getAttribute().getName().trim().length() > 0) 
				{
					String attributeName = ((DomainElement) expressionElement).getAttribute().getName();
					
					if (multiple)
						attributeName = SiriusExpressionHelper.getInnerFeature(attributeName);
					value += multiple ? attributeName : SiriusExpressionHelper.getExpressoin(attributeName, ExpressionInterpreter.Feature);
				}
				break;

			case ExpressionPackage.JAVA_ELEMENT:
				JavaElement jElement = (JavaElement) expressionElement;
				if (jElement.getMethod() != null && jElement.getMethod().trim().length() > 0) 
				{
					String methodName = jElement.getMethod();
					String twoLastChars = methodName.subSequence(methodName.length() - 2, methodName.length()).toString();
					if (twoLastChars.equals("()")) 
						methodName = methodName.substring(0, methodName.length() - 2);

					if (addParams && javaMethodParams != null && javaMethodParams.trim().length() > 0) 
						methodName += "(" + javaMethodParams + ")";
					else 
						methodName += "()";
					
					if (multiple)
						methodName = SiriusExpressionHelper.getInnerJavaService(methodName);
					
					value += multiple ? methodName : SiriusExpressionHelper.getExpressoin(methodName, ExpressionInterpreter.Service);
				}
				break;
			}
			
			if (expressionElements.indexOf(expressionElement) != expressionElements.size() - 1)
			{// This means that the current element is not the last one, So add " + " between expression
				value += SiriusExpressionHelper.getConcatenationCharacter();
//				value += " + ";
			}
			else
			{
				value = multiple ? SiriusExpressionHelper.getExpressoin(value) : value;
			}
		}
		setValue(value);
	}

} //ExpressionImpl

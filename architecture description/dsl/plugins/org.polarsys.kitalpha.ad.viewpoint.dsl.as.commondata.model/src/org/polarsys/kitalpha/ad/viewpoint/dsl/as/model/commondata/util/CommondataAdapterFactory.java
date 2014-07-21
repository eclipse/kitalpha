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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.CommondataPackage
 * @generated
 */
public class CommondataAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommondataPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommondataAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CommondataPackage.eINSTANCE;
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
	protected CommondataSwitch<Adapter> modelSwitch = new CommondataSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractClass(AbstractClass object) {
				return createAbstractClassAdapter();
			}
			@Override
			public Adapter caseExternalClass(ExternalClass object) {
				return createExternalClassAdapter();
			}
			@Override
			public Adapter caseLocalClass(LocalClass object) {
				return createLocalClassAdapter();
			}
			@Override
			public Adapter caseAbstractAssociation(AbstractAssociation object) {
				return createAbstractAssociationAdapter();
			}
			@Override
			public Adapter caseExternalAssociation(ExternalAssociation object) {
				return createExternalAssociationAdapter();
			}
			@Override
			public Adapter caseLocalAssociation(LocalAssociation object) {
				return createLocalAssociationAdapter();
			}
			@Override
			public Adapter caseAbstractAttribute(AbstractAttribute object) {
				return createAbstractAttributeAdapter();
			}
			@Override
			public Adapter caseLocalAttribute(LocalAttribute object) {
				return createLocalAttributeAdapter();
			}
			@Override
			public Adapter caseExternalAttribute(ExternalAttribute object) {
				return createExternalAttributeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractClass <em>Abstract Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractClass
	 * @generated
	 */
	public Adapter createAbstractClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalClass <em>External Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalClass
	 * @generated
	 */
	public Adapter createExternalClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalClass <em>Local Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalClass
	 * @generated
	 */
	public Adapter createLocalClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractAssociation <em>Abstract Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractAssociation
	 * @generated
	 */
	public Adapter createAbstractAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalAssociation <em>External Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalAssociation
	 * @generated
	 */
	public Adapter createExternalAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAssociation <em>Local Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAssociation
	 * @generated
	 */
	public Adapter createLocalAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractAttribute <em>Abstract Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractAttribute
	 * @generated
	 */
	public Adapter createAbstractAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAttribute <em>Local Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAttribute
	 * @generated
	 */
	public Adapter createLocalAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalAttribute <em>External Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalAttribute
	 * @generated
	 */
	public Adapter createExternalAttributeAdapter() {
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

} //CommondataAdapterFactory

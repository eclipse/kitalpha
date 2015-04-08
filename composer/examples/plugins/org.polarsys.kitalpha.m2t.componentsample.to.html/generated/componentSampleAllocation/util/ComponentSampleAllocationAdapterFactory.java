/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package componentSampleAllocation.util;

import componentSampleAllocation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.kitalpha.composer.metamodel.allocation.base.File;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.Root;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.Type;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see componentSampleAllocation.ComponentSampleAllocationPackage
 * @generated
 */
public class ComponentSampleAllocationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentSampleAllocationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSampleAllocationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ComponentSampleAllocationPackage.eINSTANCE;
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
	protected ComponentSampleAllocationSwitch<Adapter> modelSwitch =
		new ComponentSampleAllocationSwitch<Adapter>() {
			@Override
			public Adapter caseComponentSampleRoot(ComponentSampleRoot object) {
				return createComponentSampleRootAdapter();
			}
			@Override
			public Adapter caseComponentSampleFile(ComponentSampleFile object) {
				return createComponentSampleFileAdapter();
			}
			@Override
			public Adapter caseComponentType(ComponentType object) {
				return createComponentTypeAdapter();
			}
			@Override
			public Adapter caseComponentModelType(ComponentModelType object) {
				return createComponentModelTypeAdapter();
			}
			@Override
			public Adapter caseUses(Uses object) {
				return createUsesAdapter();
			}
			@Override
			public Adapter caseUsedBy(UsedBy object) {
				return createUsedByAdapter();
			}
			@Override
			public Adapter caseContains(Contains object) {
				return createContainsAdapter();
			}
			@Override
			public Adapter caseContainedBy(ContainedBy object) {
				return createContainedByAdapter();
			}
			@Override
			public Adapter caseComponentSampleHardware(ComponentSampleHardware object) {
				return createComponentSampleHardwareAdapter();
			}
			@Override
			public Adapter caseComponentSampleSoftware(ComponentSampleSoftware object) {
				return createComponentSampleSoftwareAdapter();
			}
			@Override
			public Adapter caseComponentsAttributes(ComponentsAttributes object) {
				return createComponentsAttributesAdapter();
			}
			@Override
			public Adapter caseRoot(Root object) {
				return createRootAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link componentSampleAllocation.ComponentSampleRoot <em>Component Sample Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componentSampleAllocation.ComponentSampleRoot
	 * @generated
	 */
	public Adapter createComponentSampleRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link componentSampleAllocation.ComponentSampleFile <em>Component Sample File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componentSampleAllocation.ComponentSampleFile
	 * @generated
	 */
	public Adapter createComponentSampleFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link componentSampleAllocation.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componentSampleAllocation.ComponentType
	 * @generated
	 */
	public Adapter createComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link componentSampleAllocation.ComponentModelType <em>Component Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componentSampleAllocation.ComponentModelType
	 * @generated
	 */
	public Adapter createComponentModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link componentSampleAllocation.Uses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componentSampleAllocation.Uses
	 * @generated
	 */
	public Adapter createUsesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link componentSampleAllocation.UsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componentSampleAllocation.UsedBy
	 * @generated
	 */
	public Adapter createUsedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link componentSampleAllocation.Contains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componentSampleAllocation.Contains
	 * @generated
	 */
	public Adapter createContainsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link componentSampleAllocation.ContainedBy <em>Contained By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componentSampleAllocation.ContainedBy
	 * @generated
	 */
	public Adapter createContainedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link componentSampleAllocation.ComponentSampleHardware <em>Component Sample Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componentSampleAllocation.ComponentSampleHardware
	 * @generated
	 */
	public Adapter createComponentSampleHardwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link componentSampleAllocation.ComponentSampleSoftware <em>Component Sample Software</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componentSampleAllocation.ComponentSampleSoftware
	 * @generated
	 */
	public Adapter createComponentSampleSoftwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link componentSampleAllocation.ComponentsAttributes <em>Components Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componentSampleAllocation.ComponentsAttributes
	 * @generated
	 */
	public Adapter createComponentsAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.composer.metamodel.allocation.base.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.composer.metamodel.allocation.base.Root
	 * @generated
	 */
	public Adapter createRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.composer.metamodel.allocation.base.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.composer.metamodel.allocation.base.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.composer.metamodel.allocation.base.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.composer.metamodel.allocation.base.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
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

} //ComponentSampleAllocationAdapterFactory

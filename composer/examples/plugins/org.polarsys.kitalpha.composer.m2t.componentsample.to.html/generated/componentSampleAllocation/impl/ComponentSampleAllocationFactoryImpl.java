/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package componentSampleAllocation.impl;

import componentSampleAllocation.*;

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
public class ComponentSampleAllocationFactoryImpl extends EFactoryImpl implements ComponentSampleAllocationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentSampleAllocationFactory init() {
		try {
			ComponentSampleAllocationFactory theComponentSampleAllocationFactory = (ComponentSampleAllocationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.polarsys.org/kitalpha/componentsampleallocation/1.0.0"); 
			if (theComponentSampleAllocationFactory != null) {
				return theComponentSampleAllocationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentSampleAllocationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSampleAllocationFactoryImpl() {
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
			case ComponentSampleAllocationPackage.COMPONENT_SAMPLE_ROOT: return createComponentSampleRoot();
			case ComponentSampleAllocationPackage.COMPONENT_SAMPLE_FILE: return createComponentSampleFile();
			case ComponentSampleAllocationPackage.COMPONENT_MODEL_TYPE: return createComponentModelType();
			case ComponentSampleAllocationPackage.USES: return createUses();
			case ComponentSampleAllocationPackage.USED_BY: return createUsedBy();
			case ComponentSampleAllocationPackage.CONTAINS: return createContains();
			case ComponentSampleAllocationPackage.CONTAINED_BY: return createContainedBy();
			case ComponentSampleAllocationPackage.COMPONENT_SAMPLE_HARDWARE: return createComponentSampleHardware();
			case ComponentSampleAllocationPackage.COMPONENT_SAMPLE_SOFTWARE: return createComponentSampleSoftware();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSampleRoot createComponentSampleRoot() {
		ComponentSampleRootImpl componentSampleRoot = new ComponentSampleRootImpl();
		return componentSampleRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSampleFile createComponentSampleFile() {
		ComponentSampleFileImpl componentSampleFile = new ComponentSampleFileImpl();
		return componentSampleFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentModelType createComponentModelType() {
		ComponentModelTypeImpl componentModelType = new ComponentModelTypeImpl();
		return componentModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uses createUses() {
		UsesImpl uses = new UsesImpl();
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsedBy createUsedBy() {
		UsedByImpl usedBy = new UsedByImpl();
		return usedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contains createContains() {
		ContainsImpl contains = new ContainsImpl();
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainedBy createContainedBy() {
		ContainedByImpl containedBy = new ContainedByImpl();
		return containedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSampleHardware createComponentSampleHardware() {
		ComponentSampleHardwareImpl componentSampleHardware = new ComponentSampleHardwareImpl();
		return componentSampleHardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSampleSoftware createComponentSampleSoftware() {
		ComponentSampleSoftwareImpl componentSampleSoftware = new ComponentSampleSoftwareImpl();
		return componentSampleSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSampleAllocationPackage getComponentSampleAllocationPackage() {
		return (ComponentSampleAllocationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentSampleAllocationPackage getPackage() {
		return ComponentSampleAllocationPackage.eINSTANCE;
	}

} //ComponentSampleAllocationFactoryImpl

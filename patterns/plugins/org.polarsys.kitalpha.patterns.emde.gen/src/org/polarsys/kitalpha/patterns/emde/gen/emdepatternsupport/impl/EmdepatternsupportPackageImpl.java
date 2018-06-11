/*******************************************************************************
 * Copyright (c) 2006, 2018 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.impl;

import org.eclipse.emf.diffmerge.patterns.support.gen.commonpatternsupport.CommonpatternsupportPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.polarsys.kitalpha.emde.model.EmdePackage;
import org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.EmdePatternInstanceSet;
import org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.EmdepatternsupportFactory;
import org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.EmdepatternsupportPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmdepatternsupportPackageImpl extends EPackageImpl implements EmdepatternsupportPackage {
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass emdePatternInstanceSetEClass = null;

  /**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.EmdepatternsupportPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private EmdepatternsupportPackageImpl() {
		super(eNS_URI, EmdepatternsupportFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EmdepatternsupportPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static EmdepatternsupportPackage init() {
		if (isInited) {
			return (EmdepatternsupportPackage)EPackage.Registry.INSTANCE.getEPackage(EmdepatternsupportPackage.eNS_URI);
		}

		// Obtain or create and register package
		EmdepatternsupportPackageImpl theEmdepatternsupportPackage = (EmdepatternsupportPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EmdepatternsupportPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EmdepatternsupportPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CommonpatternsupportPackage.eINSTANCE.eClass();
		EmdePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEmdepatternsupportPackage.createPackageContents();

		// Initialize created meta-data
		theEmdepatternsupportPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEmdepatternsupportPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EmdepatternsupportPackage.eNS_URI, theEmdepatternsupportPackage);
		return theEmdepatternsupportPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
public EClass getEmdePatternInstanceSet() {
		return emdePatternInstanceSetEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
public EmdepatternsupportFactory getEmdepatternsupportFactory() {
		return (EmdepatternsupportFactory)getEFactoryInstance();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isCreated = false;

  /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void createPackageContents() {
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		emdePatternInstanceSetEClass = createEClass(EMDE_PATTERN_INSTANCE_SET);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isInitialized = false;

  /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initializePackageContents() {
		if (isInitialized) {
			return;
		}
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EmdePackage theEmdePackage = (EmdePackage)EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI);
		CommonpatternsupportPackage theCommonpatternsupportPackage = (CommonpatternsupportPackage)EPackage.Registry.INSTANCE.getEPackage(CommonpatternsupportPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		emdePatternInstanceSetEClass.getESuperTypes().add(theEmdePackage.getElementExtension());
		emdePatternInstanceSetEClass.getESuperTypes().add(theCommonpatternsupportPackage.getCommonPatternInstanceSet());

		// Initialize classes and features; add operations and parameters
		initEClass(emdePatternInstanceSetEClass, EmdePatternInstanceSet.class, "EmdePatternInstanceSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EmdepatternsupportPackageImpl

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.EmdePatternInstanceSet;
import org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.EmdepatternsupportFactory;
import org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.EmdepatternsupportPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmdepatternsupportFactoryImpl extends EFactoryImpl implements EmdepatternsupportFactory {
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static EmdepatternsupportFactory init() {
		try {
			EmdepatternsupportFactory theEmdepatternsupportFactory = (EmdepatternsupportFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.polarsys.org/kitalpha/patterns/emde/1.0.0"); 
			if (theEmdepatternsupportFactory != null) {
				return theEmdepatternsupportFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EmdepatternsupportFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EmdepatternsupportFactoryImpl() {
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
			case EmdepatternsupportPackage.EMDE_PATTERN_INSTANCE_SET: return createEmdePatternInstanceSet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
public EmdePatternInstanceSet createEmdePatternInstanceSet() {
		EmdePatternInstanceSetImpl emdePatternInstanceSet = new EmdePatternInstanceSetImpl();
		return emdePatternInstanceSet;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
public EmdepatternsupportPackage getEmdepatternsupportPackage() {
		return (EmdepatternsupportPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static EmdepatternsupportPackage getPackage() {
		return EmdepatternsupportPackage.eINSTANCE;
	}

} //EmdepatternsupportFactoryImpl

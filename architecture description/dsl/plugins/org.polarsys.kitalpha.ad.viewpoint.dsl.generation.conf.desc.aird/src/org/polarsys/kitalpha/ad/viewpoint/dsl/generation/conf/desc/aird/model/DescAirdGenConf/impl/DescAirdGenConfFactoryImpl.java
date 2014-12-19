/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.DescAirdGenConf.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.DescAirdGenConf.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DescAirdGenConfFactoryImpl extends EFactoryImpl implements DescAirdGenConfFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DescAirdGenConfFactory init() {
		try {
			DescAirdGenConfFactory theDescAirdGenConfFactory = (DescAirdGenConfFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/DescAirdGenConf/1.0.0"); 
			if (theDescAirdGenConfFactory != null) {
				return theDescAirdGenConfFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DescAirdGenConfFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescAirdGenConfFactoryImpl() {
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
			case DescAirdGenConfPackage.AIRD_GENERATION_CONFIGURATION: return createAirdGenerationConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirdGenerationConfiguration createAirdGenerationConfiguration() {
		AirdGenerationConfigurationImpl airdGenerationConfiguration = new AirdGenerationConfigurationImpl();
		return airdGenerationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescAirdGenConfPackage getDescAirdGenConfPackage() {
		return (DescAirdGenConfPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DescAirdGenConfPackage getPackage() {
		return DescAirdGenConfPackage.eINSTANCE;
	}

} //DescAirdGenConfFactoryImpl

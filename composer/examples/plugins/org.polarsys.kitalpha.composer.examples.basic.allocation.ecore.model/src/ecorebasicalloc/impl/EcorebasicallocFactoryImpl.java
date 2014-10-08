/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecorebasicalloc.impl;

import ecorebasicalloc.*;

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
public class EcorebasicallocFactoryImpl extends EFactoryImpl implements EcorebasicallocFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcorebasicallocFactory init() {
		try {
			EcorebasicallocFactory theEcorebasicallocFactory = (EcorebasicallocFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.polarsys.kitalpha/composer/example/basicusecase/ecorebasicalloc/1.0.0"); 
			if (theEcorebasicallocFactory != null) {
				return theEcorebasicallocFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcorebasicallocFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcorebasicallocFactoryImpl() {
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
			case EcorebasicallocPackage.ECORE_CLASS: return createEcoreClass();
			case EcorebasicallocPackage.ECORE_FILE: return createEcoreFile();
			case EcorebasicallocPackage.ECORE_ROOT: return createEcoreRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreClass createEcoreClass() {
		EcoreClassImpl ecoreClass = new EcoreClassImpl();
		return ecoreClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreFile createEcoreFile() {
		EcoreFileImpl ecoreFile = new EcoreFileImpl();
		return ecoreFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreRoot createEcoreRoot() {
		EcoreRootImpl ecoreRoot = new EcoreRootImpl();
		return ecoreRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcorebasicallocPackage getEcorebasicallocPackage() {
		return (EcorebasicallocPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcorebasicallocPackage getPackage() {
		return EcorebasicallocPackage.eINSTANCE;
	}

} //EcorebasicallocFactoryImpl

/**
 */
package ecorerecursivealloc.impl;

import ecorerecursivealloc.*;

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
public class EcorerecursiveallocFactoryImpl extends EFactoryImpl implements EcorerecursiveallocFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcorerecursiveallocFactory init() {
		try {
			EcorerecursiveallocFactory theEcorerecursiveallocFactory = (EcorerecursiveallocFactory)EPackage.Registry.INSTANCE.getEFactory(EcorerecursiveallocPackage.eNS_URI);
			if (theEcorerecursiveallocFactory != null) {
				return theEcorerecursiveallocFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcorerecursiveallocFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcorerecursiveallocFactoryImpl() {
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
			case EcorerecursiveallocPackage.ECORE_ALLOC_ROOT: return createEcoreAllocRoot();
			case EcorerecursiveallocPackage.ECORE_ALLOC_FILE: return createEcoreAllocFile();
			case EcorerecursiveallocPackage.ECORE_ALLOC_TYPE: return createEcoreAllocType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreAllocRoot createEcoreAllocRoot() {
		EcoreAllocRootImpl ecoreAllocRoot = new EcoreAllocRootImpl();
		return ecoreAllocRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreAllocFile createEcoreAllocFile() {
		EcoreAllocFileImpl ecoreAllocFile = new EcoreAllocFileImpl();
		return ecoreAllocFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreAllocType createEcoreAllocType() {
		EcoreAllocTypeImpl ecoreAllocType = new EcoreAllocTypeImpl();
		return ecoreAllocType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcorerecursiveallocPackage getEcorerecursiveallocPackage() {
		return (EcorerecursiveallocPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcorerecursiveallocPackage getPackage() {
		return EcorerecursiveallocPackage.eINSTANCE;
	}

} //EcorerecursiveallocFactoryImpl

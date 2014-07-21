/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecoreX.impl;

import ecoreX.*;

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
public class EcoreXFactoryImpl extends EFactoryImpl implements EcoreXFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcoreXFactory init() {
		try {
			EcoreXFactory theEcoreXFactory = (EcoreXFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.polarsys.kitalpha/emf/ecoreX"); 
			if (theEcoreXFactory != null) {
				return theEcoreXFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcoreXFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreXFactoryImpl() {
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
			case EcoreXPackage.EXTENTED_ECLASS: return createExtentedEClass();
			case EcoreXPackage.EXTENDED_EPACKAGE: return createExtendedEPackage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtentedEClass createExtentedEClass() {
		ExtentedEClassImpl extentedEClass = new ExtentedEClassImpl();
		return extentedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedEPackage createExtendedEPackage() {
		ExtendedEPackageImpl extendedEPackage = new ExtendedEPackageImpl();
		return extendedEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreXPackage getEcoreXPackage() {
		return (EcoreXPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcoreXPackage getPackage() {
		return EcoreXPackage.eINSTANCE;
	}

} //EcoreXFactoryImpl

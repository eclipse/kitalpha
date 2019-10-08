
package org.polarsys.capella.example.capellatags.CapellaTags.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.polarsys.capella.example.capellatags.CapellaTags.CapellaTag;
import org.polarsys.capella.example.capellatags.CapellaTags.CapellaTagsFactory;
import org.polarsys.capella.example.capellatags.CapellaTags.CapellaTagsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CapellaTagsFactoryImpl extends EFactoryImpl implements CapellaTagsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CapellaTagsFactory init() {
		try {
			CapellaTagsFactory theCapellaTagsFactory = (CapellaTagsFactory) EPackage.Registry.INSTANCE
					.getEFactory(CapellaTagsPackage.eNS_URI);
			if (theCapellaTagsFactory != null) {
				return theCapellaTagsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CapellaTagsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapellaTagsFactoryImpl() {
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
		case CapellaTagsPackage.CAPELLA_TAG:
			return createCapellaTag();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapellaTag createCapellaTag() {
		CapellaTagImpl capellaTag = new CapellaTagImpl();
		return capellaTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapellaTagsPackage getCapellaTagsPackage() {
		return (CapellaTagsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CapellaTagsPackage getPackage() {
		return CapellaTagsPackage.eINSTANCE;
	}

} //CapellaTagsFactoryImpl

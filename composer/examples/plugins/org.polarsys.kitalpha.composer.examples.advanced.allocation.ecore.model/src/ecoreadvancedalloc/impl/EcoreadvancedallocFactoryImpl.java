/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecoreadvancedalloc.impl;

import ecoreadvancedalloc.*;

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
public class EcoreadvancedallocFactoryImpl extends EFactoryImpl implements EcoreadvancedallocFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcoreadvancedallocFactory init() {
		try {
			EcoreadvancedallocFactory theEcoreadvancedallocFactory = (EcoreadvancedallocFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.polarsys.kitalpha/composer/example/advancedusecase/ecoreadvancedalloc/1.0.0"); 
			if (theEcoreadvancedallocFactory != null) {
				return theEcoreadvancedallocFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcoreadvancedallocFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreadvancedallocFactoryImpl() {
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
			case EcoreadvancedallocPackage.ECORE_FILE: return createEcoreFile();
			case EcoreadvancedallocPackage.ECORE_ROOT: return createEcoreRoot();
			case EcoreadvancedallocPackage.FORWARD_DECLARATION: return createForwardDeclaration();
			case EcoreadvancedallocPackage.DECLARATION: return createDeclaration();
			case EcoreadvancedallocPackage.REFERENCE: return createReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public ForwardDeclaration createForwardDeclaration() {
		ForwardDeclarationImpl forwardDeclaration = new ForwardDeclarationImpl();
		return forwardDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declaration createDeclaration() {
		DeclarationImpl declaration = new DeclarationImpl();
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreadvancedallocPackage getEcoreadvancedallocPackage() {
		return (EcoreadvancedallocPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcoreadvancedallocPackage getPackage() {
		return EcoreadvancedallocPackage.eINSTANCE;
	}

} //EcoreadvancedallocFactoryImpl

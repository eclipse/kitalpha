/**
 */
package ecorerecursivealloc.impl;

import ecorerecursivealloc.EcoreAllocType;
import ecorerecursivealloc.EcorerecursiveallocPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecore Alloc Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecorerecursivealloc.impl.EcoreAllocTypeImpl#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EcoreAllocTypeImpl extends EObjectImpl implements EcoreAllocType {
	/**
	 * The cached value of the '{@link #getReferencedElement() <em>Referenced Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedElement()
	 * @generated
	 * @ordered
	 */
	protected EObject referencedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcoreAllocTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorerecursiveallocPackage.Literals.ECORE_ALLOC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getReferencedElement() {
		if (referencedElement != null && referencedElement.eIsProxy()) {
			InternalEObject oldReferencedElement = (InternalEObject)referencedElement;
			referencedElement = eResolveProxy(oldReferencedElement);
			if (referencedElement != oldReferencedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcorerecursiveallocPackage.ECORE_ALLOC_TYPE__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
			}
		}
		return referencedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetReferencedElement() {
		return referencedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedElement(EObject newReferencedElement) {
		EObject oldReferencedElement = referencedElement;
		referencedElement = newReferencedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorerecursiveallocPackage.ECORE_ALLOC_TYPE__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorerecursiveallocPackage.ECORE_ALLOC_TYPE__REFERENCED_ELEMENT:
				if (resolve) return getReferencedElement();
				return basicGetReferencedElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorerecursiveallocPackage.ECORE_ALLOC_TYPE__REFERENCED_ELEMENT:
				setReferencedElement((EObject)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EcorerecursiveallocPackage.ECORE_ALLOC_TYPE__REFERENCED_ELEMENT:
				setReferencedElement((EObject)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EcorerecursiveallocPackage.ECORE_ALLOC_TYPE__REFERENCED_ELEMENT:
				return referencedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //EcoreAllocTypeImpl

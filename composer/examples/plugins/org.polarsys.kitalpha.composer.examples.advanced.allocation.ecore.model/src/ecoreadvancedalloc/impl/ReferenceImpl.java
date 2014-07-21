/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecoreadvancedalloc.impl;

import ecoreadvancedalloc.EcoreadvancedallocPackage;
import ecoreadvancedalloc.Reference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecoreadvancedalloc.impl.ReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link ecoreadvancedalloc.impl.ReferenceImpl#getHyperlinkRef <em>Hyperlink Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceImpl extends EObjectImpl implements Reference {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHyperlinkRef() <em>Hyperlink Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperlinkRef()
	 * @generated
	 * @ordered
	 */
	protected static final String HYPERLINK_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHyperlinkRef() <em>Hyperlink Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperlinkRef()
	 * @generated
	 * @ordered
	 */
	protected String hyperlinkRef = HYPERLINK_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreadvancedallocPackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreadvancedallocPackage.REFERENCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHyperlinkRef() {
		return hyperlinkRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHyperlinkRef(String newHyperlinkRef) {
		String oldHyperlinkRef = hyperlinkRef;
		hyperlinkRef = newHyperlinkRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreadvancedallocPackage.REFERENCE__HYPERLINK_REF, oldHyperlinkRef, hyperlinkRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcoreadvancedallocPackage.REFERENCE__NAME:
				return getName();
			case EcoreadvancedallocPackage.REFERENCE__HYPERLINK_REF:
				return getHyperlinkRef();
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
			case EcoreadvancedallocPackage.REFERENCE__NAME:
				setName((String)newValue);
				return;
			case EcoreadvancedallocPackage.REFERENCE__HYPERLINK_REF:
				setHyperlinkRef((String)newValue);
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
			case EcoreadvancedallocPackage.REFERENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EcoreadvancedallocPackage.REFERENCE__HYPERLINK_REF:
				setHyperlinkRef(HYPERLINK_REF_EDEFAULT);
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
			case EcoreadvancedallocPackage.REFERENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EcoreadvancedallocPackage.REFERENCE__HYPERLINK_REF:
				return HYPERLINK_REF_EDEFAULT == null ? hyperlinkRef != null : !HYPERLINK_REF_EDEFAULT.equals(hyperlinkRef);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", hyperlinkRef: ");
		result.append(hyperlinkRef);
		result.append(')');
		return result.toString();
	}

} //ReferenceImpl


package org.polarsys.kitalpha.example.tags.tags.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.kitalpha.example.tags.tags.Color;
import org.polarsys.kitalpha.example.tags.tags.Kind;
import org.polarsys.kitalpha.example.tags.tags.Status;
import org.polarsys.kitalpha.example.tags.tags.TagsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.StatusImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.StatusImpl#getIcone <em>Icone</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.StatusImpl#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatusImpl extends AbstractNamedEntityImpl implements Status {

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected Kind kind;

	/**
	 * The default value of the '{@link #getIcone() <em>Icone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcone()
	 * @generated
	 * @ordered
	 */
	protected static final String ICONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcone() <em>Icone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcone()
	 * @generated
	 * @ordered
	 */
	protected String icone = ICONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_EDEFAULT = Color.WHITE;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color = COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatusImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TagsPackage.Literals.STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Kind getKind() {

		if (kind != null && kind.eIsProxy()) {
			InternalEObject oldKind = (InternalEObject) kind;
			kind = (Kind) eResolveProxy(oldKind);
			if (kind != oldKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TagsPackage.STATUS__KIND, oldKind, kind));
			}
		}
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Kind basicGetKind() {

		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setKind(Kind newKind) {

		Kind oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TagsPackage.STATUS__KIND, oldKind, kind));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getIcone() {

		return icone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setIcone(String newIcone) {

		String oldIcone = icone;
		icone = newIcone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TagsPackage.STATUS__ICONE, oldIcone, icone));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Color getColor() {

		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setColor(Color newColor) {

		Color oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TagsPackage.STATUS__COLOR, oldColor, color));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TagsPackage.STATUS__KIND:
			if (resolve)
				return getKind();
			return basicGetKind();
		case TagsPackage.STATUS__ICONE:
			return getIcone();
		case TagsPackage.STATUS__COLOR:
			return getColor();
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
		case TagsPackage.STATUS__KIND:
			setKind((Kind) newValue);
			return;
		case TagsPackage.STATUS__ICONE:
			setIcone((String) newValue);
			return;
		case TagsPackage.STATUS__COLOR:
			setColor((Color) newValue);
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
		case TagsPackage.STATUS__KIND:
			setKind((Kind) null);
			return;
		case TagsPackage.STATUS__ICONE:
			setIcone(ICONE_EDEFAULT);
			return;
		case TagsPackage.STATUS__COLOR:
			setColor(COLOR_EDEFAULT);
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
		case TagsPackage.STATUS__KIND:
			return kind != null;
		case TagsPackage.STATUS__ICONE:
			return ICONE_EDEFAULT == null ? icone != null : !ICONE_EDEFAULT.equals(icone);
		case TagsPackage.STATUS__COLOR:
			return color != COLOR_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (icone: "); //$NON-NLS-1$
		result.append(icone);
		result.append(", color: "); //$NON-NLS-1$
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //StatusImpl
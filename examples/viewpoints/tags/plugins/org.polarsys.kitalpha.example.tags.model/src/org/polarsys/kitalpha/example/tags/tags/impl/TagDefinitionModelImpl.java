
package org.polarsys.kitalpha.example.tags.tags.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.example.tags.tags.Kind;
import org.polarsys.kitalpha.example.tags.tags.Status;
import org.polarsys.kitalpha.example.tags.tags.TagDefinitionModel;
import org.polarsys.kitalpha.example.tags.tags.TagsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag Definition Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.TagDefinitionModelImpl#getOwnedStatuses <em>Owned Statuses</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.TagDefinitionModelImpl#getOwnedKinds <em>Owned Kinds</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.TagDefinitionModelImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TagDefinitionModelImpl extends AbstractNamedEntityImpl implements TagDefinitionModel {

	/**
	 * The cached value of the '{@link #getOwnedStatuses() <em>Owned Statuses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStatuses()
	 * @generated
	 * @ordered
	 */
	protected EList<Status> ownedStatuses;

	/**
	 * The cached value of the '{@link #getOwnedKinds() <em>Owned Kinds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedKinds()
	 * @generated
	 * @ordered
	 */
	protected EList<Kind> ownedKinds;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagDefinitionModelImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TagsPackage.Literals.TAG_DEFINITION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Status> getOwnedStatuses() {

		if (ownedStatuses == null) {
			ownedStatuses = new EObjectContainmentEList<Status>(Status.class, this,
					TagsPackage.TAG_DEFINITION_MODEL__OWNED_STATUSES);
		}
		return ownedStatuses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Kind> getOwnedKinds() {

		if (ownedKinds == null) {
			ownedKinds = new EObjectContainmentEList<Kind>(Kind.class, this,
					TagsPackage.TAG_DEFINITION_MODEL__OWNED_KINDS);
		}
		return ownedKinds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getDescription() {

		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setDescription(String newDescription) {

		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TagsPackage.TAG_DEFINITION_MODEL__DESCRIPTION,
					oldDescription, description));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TagsPackage.TAG_DEFINITION_MODEL__OWNED_STATUSES:
			return ((InternalEList<?>) getOwnedStatuses()).basicRemove(otherEnd, msgs);
		case TagsPackage.TAG_DEFINITION_MODEL__OWNED_KINDS:
			return ((InternalEList<?>) getOwnedKinds()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TagsPackage.TAG_DEFINITION_MODEL__OWNED_STATUSES:
			return getOwnedStatuses();
		case TagsPackage.TAG_DEFINITION_MODEL__OWNED_KINDS:
			return getOwnedKinds();
		case TagsPackage.TAG_DEFINITION_MODEL__DESCRIPTION:
			return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TagsPackage.TAG_DEFINITION_MODEL__OWNED_STATUSES:
			getOwnedStatuses().clear();
			getOwnedStatuses().addAll((Collection<? extends Status>) newValue);
			return;
		case TagsPackage.TAG_DEFINITION_MODEL__OWNED_KINDS:
			getOwnedKinds().clear();
			getOwnedKinds().addAll((Collection<? extends Kind>) newValue);
			return;
		case TagsPackage.TAG_DEFINITION_MODEL__DESCRIPTION:
			setDescription((String) newValue);
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
		case TagsPackage.TAG_DEFINITION_MODEL__OWNED_STATUSES:
			getOwnedStatuses().clear();
			return;
		case TagsPackage.TAG_DEFINITION_MODEL__OWNED_KINDS:
			getOwnedKinds().clear();
			return;
		case TagsPackage.TAG_DEFINITION_MODEL__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case TagsPackage.TAG_DEFINITION_MODEL__OWNED_STATUSES:
			return ownedStatuses != null && !ownedStatuses.isEmpty();
		case TagsPackage.TAG_DEFINITION_MODEL__OWNED_KINDS:
			return ownedKinds != null && !ownedKinds.isEmpty();
		case TagsPackage.TAG_DEFINITION_MODEL__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (description: "); //$NON-NLS-1$
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TagDefinitionModelImpl
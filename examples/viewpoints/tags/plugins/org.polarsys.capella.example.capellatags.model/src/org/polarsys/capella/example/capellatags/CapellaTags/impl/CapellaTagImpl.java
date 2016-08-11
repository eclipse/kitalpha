
package org.polarsys.capella.example.capellatags.CapellaTags.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.example.capellatags.CapellaTags.CapellaTag;
import org.polarsys.capella.example.capellatags.CapellaTags.CapellaTagsPackage;
import org.polarsys.kitalpha.emde.model.Element;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.emde.model.EmdePackage;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;
import org.polarsys.kitalpha.example.tags.tags.impl.TagImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capella Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.example.capellatags.CapellaTags.impl.CapellaTagImpl#getOwnedExtensions <em>Owned Extensions</em>}</li>
 *   <li>{@link org.polarsys.capella.example.capellatags.CapellaTags.impl.CapellaTagImpl#getModelElement <em>Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapellaTagImpl extends TagImpl implements CapellaTag {

	/**
	 * The cached value of the '{@link #getOwnedExtensions() <em>Owned Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementExtension> ownedExtensions;

	/**
	 * The cached value of the '{@link #getModelElement() <em>Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElement()
	 * @generated
	 * @ordered
	 */
	protected NamedElement modelElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapellaTagImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellaTagsPackage.Literals.CAPELLA_TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<ElementExtension> getOwnedExtensions() {

		if (ownedExtensions == null) {
			ownedExtensions = new EObjectContainmentEList<ElementExtension>(ElementExtension.class, this,
					CapellaTagsPackage.CAPELLA_TAG__OWNED_EXTENSIONS);
		}
		return ownedExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NamedElement getModelElement() {

		if (modelElement != null && modelElement.eIsProxy()) {
			InternalEObject oldModelElement = (InternalEObject) modelElement;
			modelElement = (NamedElement) eResolveProxy(oldModelElement);
			if (modelElement != oldModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CapellaTagsPackage.CAPELLA_TAG__MODEL_ELEMENT, oldModelElement, modelElement));
			}
		}
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NamedElement basicGetModelElement() {

		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setModelElement(NamedElement newModelElement) {

		NamedElement oldModelElement = modelElement;
		modelElement = newModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapellaTagsPackage.CAPELLA_TAG__MODEL_ELEMENT,
					oldModelElement, modelElement));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CapellaTagsPackage.CAPELLA_TAG__OWNED_EXTENSIONS:
			return ((InternalEList<?>) getOwnedExtensions()).basicRemove(otherEnd, msgs);
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
		case CapellaTagsPackage.CAPELLA_TAG__OWNED_EXTENSIONS:
			return getOwnedExtensions();
		case CapellaTagsPackage.CAPELLA_TAG__MODEL_ELEMENT:
			if (resolve)
				return getModelElement();
			return basicGetModelElement();
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
		case CapellaTagsPackage.CAPELLA_TAG__OWNED_EXTENSIONS:
			getOwnedExtensions().clear();
			getOwnedExtensions().addAll((Collection<? extends ElementExtension>) newValue);
			return;
		case CapellaTagsPackage.CAPELLA_TAG__MODEL_ELEMENT:
			setModelElement((NamedElement) newValue);
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
		case CapellaTagsPackage.CAPELLA_TAG__OWNED_EXTENSIONS:
			getOwnedExtensions().clear();
			return;
		case CapellaTagsPackage.CAPELLA_TAG__MODEL_ELEMENT:
			setModelElement((NamedElement) null);
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
		case CapellaTagsPackage.CAPELLA_TAG__OWNED_EXTENSIONS:
			return ownedExtensions != null && !ownedExtensions.isEmpty();
		case CapellaTagsPackage.CAPELLA_TAG__MODEL_ELEMENT:
			return modelElement != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Element.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ExtensibleElement.class) {
			switch (derivedFeatureID) {
			case CapellaTagsPackage.CAPELLA_TAG__OWNED_EXTENSIONS:
				return EmdePackage.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS;
			default:
				return -1;
			}
		}
		if (baseClass == ElementExtension.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Element.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ExtensibleElement.class) {
			switch (baseFeatureID) {
			case EmdePackage.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS:
				return CapellaTagsPackage.CAPELLA_TAG__OWNED_EXTENSIONS;
			default:
				return -1;
			}
		}
		if (baseClass == ElementExtension.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CapellaTagImpl
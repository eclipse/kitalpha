/**
 */
package ecorerecursivealloc.impl;

import org.polarsys.kitalpha.composer.metamodel.allocation.base.File;

import ecorerecursivealloc.EcoreAllocRoot;
import ecorerecursivealloc.EcorerecursiveallocPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecore Alloc Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecorerecursivealloc.impl.EcoreAllocRootImpl#getOwnedFiles <em>Owned Files</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EcoreAllocRootImpl extends EObjectImpl implements EcoreAllocRoot {
	/**
	 * The cached value of the '{@link #getOwnedFiles() <em>Owned Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<File> ownedFiles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcoreAllocRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorerecursiveallocPackage.Literals.ECORE_ALLOC_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getOwnedFiles() {
		if (ownedFiles == null) {
			ownedFiles = new EObjectContainmentEList<File>(File.class, this, EcorerecursiveallocPackage.ECORE_ALLOC_ROOT__OWNED_FILES);
		}
		return ownedFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorerecursiveallocPackage.ECORE_ALLOC_ROOT__OWNED_FILES:
				return ((InternalEList<?>)getOwnedFiles()).basicRemove(otherEnd, msgs);
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
			case EcorerecursiveallocPackage.ECORE_ALLOC_ROOT__OWNED_FILES:
				return getOwnedFiles();
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
			case EcorerecursiveallocPackage.ECORE_ALLOC_ROOT__OWNED_FILES:
				getOwnedFiles().clear();
				getOwnedFiles().addAll((Collection<? extends File>)newValue);
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
			case EcorerecursiveallocPackage.ECORE_ALLOC_ROOT__OWNED_FILES:
				getOwnedFiles().clear();
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
			case EcorerecursiveallocPackage.ECORE_ALLOC_ROOT__OWNED_FILES:
				return ownedFiles != null && !ownedFiles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EcoreAllocRootImpl

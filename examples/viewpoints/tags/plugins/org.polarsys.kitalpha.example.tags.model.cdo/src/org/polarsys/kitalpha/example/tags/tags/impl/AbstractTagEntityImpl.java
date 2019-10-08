
package org.polarsys.kitalpha.example.tags.tags.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.polarsys.kitalpha.example.tags.tags.AbstractTagEntity;
import org.polarsys.kitalpha.example.tags.tags.TagsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Tag Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.AbstractTagEntityImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractTagEntityImpl extends CDOObjectImpl implements AbstractTagEntity {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTagEntityImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TagsPackage.Literals.ABSTRACT_TAG_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getId() {

		return (String) eGet(TagsPackage.Literals.ABSTRACT_TAG_ENTITY__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setId(String newId) {

		eSet(TagsPackage.Literals.ABSTRACT_TAG_ENTITY__ID, newId);
	}

} //AbstractTagEntityImpl
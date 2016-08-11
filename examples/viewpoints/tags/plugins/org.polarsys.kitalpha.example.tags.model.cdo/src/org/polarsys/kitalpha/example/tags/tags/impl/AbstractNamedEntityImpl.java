
package org.polarsys.kitalpha.example.tags.tags.impl;

import org.eclipse.emf.ecore.EClass;
import org.polarsys.kitalpha.example.tags.tags.AbstractNamedEntity;
import org.polarsys.kitalpha.example.tags.tags.TagsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Named Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.AbstractNamedEntityImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractNamedEntityImpl extends AbstractTagEntityImpl implements AbstractNamedEntity {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractNamedEntityImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TagsPackage.Literals.ABSTRACT_NAMED_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getName() {

		return (String) eGet(TagsPackage.Literals.ABSTRACT_NAMED_ENTITY__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setName(String newName) {

		eSet(TagsPackage.Literals.ABSTRACT_NAMED_ENTITY__NAME, newName);
	}

} //AbstractNamedEntityImpl

package org.polarsys.kitalpha.example.tags.tags.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.TagDefinitionModelImpl#getOwnedStatuses <em>Owned Statuses</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.TagDefinitionModelImpl#getOwnedKinds <em>Owned Kinds</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.TagDefinitionModelImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagDefinitionModelImpl extends AbstractNamedEntityImpl implements TagDefinitionModel {

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

	@SuppressWarnings("unchecked")
	public EList<Status> getOwnedStatuses() {

		return (EList<Status>) eGet(TagsPackage.Literals.TAG_DEFINITION_MODEL__OWNED_STATUSES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public EList<Kind> getOwnedKinds() {

		return (EList<Kind>) eGet(TagsPackage.Literals.TAG_DEFINITION_MODEL__OWNED_KINDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getDescription() {

		return (String) eGet(TagsPackage.Literals.TAG_DEFINITION_MODEL__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setDescription(String newDescription) {

		eSet(TagsPackage.Literals.TAG_DEFINITION_MODEL__DESCRIPTION, newDescription);
	}

} //TagDefinitionModelImpl
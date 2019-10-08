
package org.polarsys.kitalpha.example.tags.tags.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.polarsys.kitalpha.example.tags.tags.History;
import org.polarsys.kitalpha.example.tags.tags.Status;
import org.polarsys.kitalpha.example.tags.tags.Tag;
import org.polarsys.kitalpha.example.tags.tags.TagsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.TagImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.TagImpl#getStatusHistory <em>Status History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagImpl extends AbstractTagEntityImpl implements Tag {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TagsPackage.Literals.TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Status getStatus() {

		return (Status) eGet(TagsPackage.Literals.TAG__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setStatus(Status newStatus) {

		eSet(TagsPackage.Literals.TAG__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public EList<History> getStatusHistory() {

		return (EList<History>) eGet(TagsPackage.Literals.TAG__STATUS_HISTORY, true);
	}

} //TagImpl
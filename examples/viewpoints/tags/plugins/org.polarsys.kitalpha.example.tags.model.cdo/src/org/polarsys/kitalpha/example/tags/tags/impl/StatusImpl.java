
package org.polarsys.kitalpha.example.tags.tags.impl;

import org.eclipse.emf.ecore.EClass;
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
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.StatusImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.StatusImpl#getIcone <em>Icone</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.StatusImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatusImpl extends AbstractNamedEntityImpl implements Status {

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

		return (Kind) eGet(TagsPackage.Literals.STATUS__KIND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setKind(Kind newKind) {

		eSet(TagsPackage.Literals.STATUS__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getIcone() {

		return (String) eGet(TagsPackage.Literals.STATUS__ICONE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setIcone(String newIcone) {

		eSet(TagsPackage.Literals.STATUS__ICONE, newIcone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Color getColor() {

		return (Color) eGet(TagsPackage.Literals.STATUS__COLOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setColor(Color newColor) {

		eSet(TagsPackage.Literals.STATUS__COLOR, newColor);
	}

} //StatusImpl
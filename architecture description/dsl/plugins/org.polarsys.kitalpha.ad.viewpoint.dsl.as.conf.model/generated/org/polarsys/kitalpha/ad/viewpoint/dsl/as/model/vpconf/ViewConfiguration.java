/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ViewConfiguration#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ViewConfiguration#isActivable <em>Activable</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage#getViewConfiguration()
 * @model
 * @generated
 */
public interface ViewConfiguration extends ConfigurationElement {
	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage#getViewConfiguration_Visible()
	 * @model default="true"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ViewConfiguration#isVisible <em>Visible</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Activable</b></em>' attribute.
	 * The default value is <code>"false"</code>.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activable</em>' attribute.
	 * @see #setActivable(boolean)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage#getViewConfiguration_Activable()
	 * @model default="false"
	 * @generated
	 */
	boolean isActivable();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ViewConfiguration#isActivable <em>Activable</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activable</em>' attribute.
	 * @see #isActivable()
	 * @generated
	 */
	void setActivable(boolean value);

} // ViewConfiguration

/**
 *
 * Copyright (c) Polarsys, 2014. All rights reserved.
 *
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Trigger#getPlanning <em>Planning</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage#getTrigger()
 * @model
 * @generated
 */

public interface Trigger extends EObject {

	/**
	 * Returns the value of the '<em><b>Planning</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planning</em>' attribute.
	 * @see #setPlanning(String)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage#getTrigger_Planning()
	 * @model
	 * @generated
	 */

	String getPlanning();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Trigger#getPlanning <em>Planning</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planning</em>' attribute.
	 * @see #getPlanning()
	 * @generated
	 */

	void setPlanning(String value);

} // Trigger


package org.polarsys.capella.example.capellatags.CapellaTags;

import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.example.tags.tags.Tag;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capella Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.example.capellatags.CapellaTags.CapellaTag#getModelElement <em>Model Element</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.example.capellatags.CapellaTags.CapellaTagsPackage#getCapellaTag()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.polarsys.org/capella/core/core/1.0.0#//CapellaElement'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/plugin/org.polarsys.capella.core.data.gen/model/CapellaCore.ecore#//CapellaElement'"
 * @generated
 */

public interface CapellaTag extends Tag, ElementExtension {

	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' reference.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' reference.
	 * @see #setModelElement(NamedElement)
	 * @see org.polarsys.capella.example.capellatags.CapellaTags.CapellaTagsPackage#getCapellaTag_ModelElement()
	 * @model required="true" derived="true"
	 * @generated
	 */

	NamedElement getModelElement();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.example.capellatags.CapellaTags.CapellaTag#getModelElement <em>Model Element</em>}' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element</em>' reference.
	 * @see #getModelElement()
	 * @generated
	 */

	void setModelElement(NamedElement value);

} // CapellaTag

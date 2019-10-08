/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.sirius.diagram.description.DiagramElementMapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Based Decorator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.MappingBasedDecorator#getExternalMappings <em>External Mappings</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.MappingBasedDecorator#getInternalMappings <em>Internal Mappings</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getMappingBasedDecorator()
 * @model
 * @generated
 */

public interface MappingBasedDecorator extends AbstractDecorator {





	/**
	 * Returns the value of the '<em><b>External Mappings</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.diagram.description.DiagramElementMapping}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Mappings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Mappings</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getMappingBasedDecorator_ExternalMappings()
	 * @model
	 * @generated
	 */

	EList<DiagramElementMapping> getExternalMappings();

	/**
	 * Returns the value of the '<em><b>Internal Mappings</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramElement}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Mappings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Mappings</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getMappingBasedDecorator_InternalMappings()
	 * @model
	 * @generated
	 */

	EList<DiagramElement> getInternalMappings();





} // MappingBasedDecorator

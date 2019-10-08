/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization;

import org.eclipse.emf.common.util.EList;

import org.eclipse.sirius.diagram.EdgeArrows;
import org.eclipse.sirius.diagram.EdgeRouting;
import org.eclipse.sirius.diagram.LineStyle;

import org.eclipse.sirius.diagram.description.CenteringStyle;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.FoldingStyle;

import org.eclipse.sirius.diagram.description.style.BeginLabelStyleDescription;
import org.eclipse.sirius.diagram.description.style.CenterLabelStyleDescription;
import org.eclipse.sirius.diagram.description.style.EdgeStyleDescription;
import org.eclipse.sirius.diagram.description.style.EndLabelStyleDescription;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Style Customization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getAppliedOn <em>Applied On</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getCenteredSourceMappings <em>Centered Source Mappings</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getCenteredTargetMappings <em>Centered Target Mappings</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getBeginLabelStyleDescription <em>Begin Label Style Description</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getCenterLabelStyleDescription <em>Center Label Style Description</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getEndLabelStyleDescription <em>End Label Style Description</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getSourceArrow <em>Source Arrow</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getTargetArrow <em>Target Arrow</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getSizeComputationExpression <em>Size Computation Expression</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getRoutingStyle <em>Routing Style</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getFoldingStyle <em>Folding Style</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getEndCentering <em>End Centering</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getEdgeStyleCustomization()
 * @model
 * @generated
 */

public interface EdgeStyleCustomization extends AbstractCustomization {





	/**
	 * Returns the value of the '<em><b>Applied On</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.diagram.description.style.EdgeStyleDescription}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied On</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getEdgeStyleCustomization_AppliedOn()
	 * @model
	 * @generated
	 */

	EList<EdgeStyleDescription> getAppliedOn();







	/**
	 * Returns the value of the '<em><b>Centered Source Mappings</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.diagram.description.DiagramElementMapping}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centered Source Mappings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centered Source Mappings</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getEdgeStyleCustomization_CenteredSourceMappings()
	 * @model
	 * @generated
	 */

	EList<DiagramElementMapping> getCenteredSourceMappings();







	/**
	 * Returns the value of the '<em><b>Centered Target Mappings</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.diagram.description.DiagramElementMapping}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centered Target Mappings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centered Target Mappings</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getEdgeStyleCustomization_CenteredTargetMappings()
	 * @model
	 * @generated
	 */

	EList<DiagramElementMapping> getCenteredTargetMappings();







	/**
	 * Returns the value of the '<em><b>Begin Label Style Description</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin Label Style Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin Label Style Description</em>' reference.
	 * @see #setBeginLabelStyleDescription(BeginLabelStyleDescription)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getEdgeStyleCustomization_BeginLabelStyleDescription()
	 * @model
	 * @generated
	 */

	BeginLabelStyleDescription getBeginLabelStyleDescription();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getBeginLabelStyleDescription <em>Begin Label Style Description</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin Label Style Description</em>' reference.
	 * @see #getBeginLabelStyleDescription()
	 * @generated
	 */

	void setBeginLabelStyleDescription(BeginLabelStyleDescription value);







	/**
	 * Returns the value of the '<em><b>Center Label Style Description</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Center Label Style Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center Label Style Description</em>' reference.
	 * @see #setCenterLabelStyleDescription(CenterLabelStyleDescription)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getEdgeStyleCustomization_CenterLabelStyleDescription()
	 * @model
	 * @generated
	 */

	CenterLabelStyleDescription getCenterLabelStyleDescription();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getCenterLabelStyleDescription <em>Center Label Style Description</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center Label Style Description</em>' reference.
	 * @see #getCenterLabelStyleDescription()
	 * @generated
	 */

	void setCenterLabelStyleDescription(CenterLabelStyleDescription value);







	/**
	 * Returns the value of the '<em><b>End Label Style Description</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Label Style Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Label Style Description</em>' reference.
	 * @see #setEndLabelStyleDescription(EndLabelStyleDescription)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getEdgeStyleCustomization_EndLabelStyleDescription()
	 * @model
	 * @generated
	 */

	EndLabelStyleDescription getEndLabelStyleDescription();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getEndLabelStyleDescription <em>End Label Style Description</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Label Style Description</em>' reference.
	 * @see #getEndLabelStyleDescription()
	 * @generated
	 */

	void setEndLabelStyleDescription(EndLabelStyleDescription value);







	/**
	 * Returns the value of the '<em><b>Line Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.diagram.LineStyle}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style</em>' attribute.
	 * @see org.eclipse.sirius.diagram.LineStyle
	 * @see #setLineStyle(LineStyle)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getEdgeStyleCustomization_LineStyle()
	 * @model
	 * @generated
	 */

	LineStyle getLineStyle();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getLineStyle <em>Line Style</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Style</em>' attribute.
	 * @see org.eclipse.sirius.diagram.LineStyle
	 * @see #getLineStyle()
	 * @generated
	 */

	void setLineStyle(LineStyle value);







	/**
	 * Returns the value of the '<em><b>Source Arrow</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.diagram.EdgeArrows}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Arrow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Arrow</em>' attribute.
	 * @see org.eclipse.sirius.diagram.EdgeArrows
	 * @see #setSourceArrow(EdgeArrows)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getEdgeStyleCustomization_SourceArrow()
	 * @model
	 * @generated
	 */

	EdgeArrows getSourceArrow();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getSourceArrow <em>Source Arrow</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Arrow</em>' attribute.
	 * @see org.eclipse.sirius.diagram.EdgeArrows
	 * @see #getSourceArrow()
	 * @generated
	 */

	void setSourceArrow(EdgeArrows value);







	/**
	 * Returns the value of the '<em><b>Target Arrow</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.diagram.EdgeArrows}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Arrow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Arrow</em>' attribute.
	 * @see org.eclipse.sirius.diagram.EdgeArrows
	 * @see #setTargetArrow(EdgeArrows)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getEdgeStyleCustomization_TargetArrow()
	 * @model
	 * @generated
	 */

	EdgeArrows getTargetArrow();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getTargetArrow <em>Target Arrow</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Arrow</em>' attribute.
	 * @see org.eclipse.sirius.diagram.EdgeArrows
	 * @see #getTargetArrow()
	 * @generated
	 */

	void setTargetArrow(EdgeArrows value);







	/**
	 * Returns the value of the '<em><b>Size Computation Expression</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Computation Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Computation Expression</em>' containment reference.
	 * @see #setSizeComputationExpression(CustomizationExpression)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getEdgeStyleCustomization_SizeComputationExpression()
	 * @model containment="true"
	 * @generated
	 */

	CustomizationExpression getSizeComputationExpression();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getSizeComputationExpression <em>Size Computation Expression</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Computation Expression</em>' containment reference.
	 * @see #getSizeComputationExpression()
	 * @generated
	 */

	void setSizeComputationExpression(CustomizationExpression value);







	/**
	 * Returns the value of the '<em><b>Routing Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.diagram.EdgeRouting}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Style</em>' attribute.
	 * @see org.eclipse.sirius.diagram.EdgeRouting
	 * @see #setRoutingStyle(EdgeRouting)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getEdgeStyleCustomization_RoutingStyle()
	 * @model
	 * @generated
	 */

	EdgeRouting getRoutingStyle();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getRoutingStyle <em>Routing Style</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing Style</em>' attribute.
	 * @see org.eclipse.sirius.diagram.EdgeRouting
	 * @see #getRoutingStyle()
	 * @generated
	 */

	void setRoutingStyle(EdgeRouting value);







	/**
	 * Returns the value of the '<em><b>Folding Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.diagram.description.FoldingStyle}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folding Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folding Style</em>' attribute.
	 * @see org.eclipse.sirius.diagram.description.FoldingStyle
	 * @see #setFoldingStyle(FoldingStyle)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getEdgeStyleCustomization_FoldingStyle()
	 * @model
	 * @generated
	 */

	FoldingStyle getFoldingStyle();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getFoldingStyle <em>Folding Style</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folding Style</em>' attribute.
	 * @see org.eclipse.sirius.diagram.description.FoldingStyle
	 * @see #getFoldingStyle()
	 * @generated
	 */

	void setFoldingStyle(FoldingStyle value);







	/**
	 * Returns the value of the '<em><b>End Centering</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.diagram.description.CenteringStyle}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Centering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Centering</em>' attribute.
	 * @see org.eclipse.sirius.diagram.description.CenteringStyle
	 * @see #setEndCentering(CenteringStyle)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getEdgeStyleCustomization_EndCentering()
	 * @model
	 * @generated
	 */

	CenteringStyle getEndCentering();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getEndCentering <em>End Centering</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Centering</em>' attribute.
	 * @see org.eclipse.sirius.diagram.description.CenteringStyle
	 * @see #getEndCentering()
	 * @generated
	 */

	void setEndCentering(CenteringStyle value);





} // EdgeStyleCustomization

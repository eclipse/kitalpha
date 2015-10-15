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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.CustomizationExpression;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Style Customization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.EdgeStyleCustomizationImpl#getAppliedOn <em>Applied On</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.EdgeStyleCustomizationImpl#getCenteredSourceMappings <em>Centered Source Mappings</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.EdgeStyleCustomizationImpl#getCenteredTargetMappings <em>Centered Target Mappings</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.EdgeStyleCustomizationImpl#getBeginLabelStyleDescription <em>Begin Label Style Description</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.EdgeStyleCustomizationImpl#getCenterLabelStyleDescription <em>Center Label Style Description</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.EdgeStyleCustomizationImpl#getEndLabelStyleDescription <em>End Label Style Description</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.EdgeStyleCustomizationImpl#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.EdgeStyleCustomizationImpl#getSourceArrow <em>Source Arrow</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.EdgeStyleCustomizationImpl#getTargetArrow <em>Target Arrow</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.EdgeStyleCustomizationImpl#getSizeComputationExpression <em>Size Computation Expression</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.EdgeStyleCustomizationImpl#getRoutingStyle <em>Routing Style</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.EdgeStyleCustomizationImpl#getFoldingStyle <em>Folding Style</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.EdgeStyleCustomizationImpl#getEndCentering <em>End Centering</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeStyleCustomizationImpl extends AbstractCustomizationImpl implements EdgeStyleCustomization {

	/**
	 * The cached value of the '{@link #getAppliedOn() <em>Applied On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<EdgeStyleDescription> appliedOn;




	/**
	 * The cached value of the '{@link #getCenteredSourceMappings() <em>Centered Source Mappings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenteredSourceMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagramElementMapping> centeredSourceMappings;




	/**
	 * The cached value of the '{@link #getCenteredTargetMappings() <em>Centered Target Mappings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenteredTargetMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagramElementMapping> centeredTargetMappings;




	/**
	 * The cached value of the '{@link #getBeginLabelStyleDescription() <em>Begin Label Style Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginLabelStyleDescription()
	 * @generated
	 * @ordered
	 */
	protected BeginLabelStyleDescription beginLabelStyleDescription;




	/**
	 * The cached value of the '{@link #getCenterLabelStyleDescription() <em>Center Label Style Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterLabelStyleDescription()
	 * @generated
	 * @ordered
	 */
	protected CenterLabelStyleDescription centerLabelStyleDescription;




	/**
	 * The cached value of the '{@link #getEndLabelStyleDescription() <em>End Label Style Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndLabelStyleDescription()
	 * @generated
	 * @ordered
	 */
	protected EndLabelStyleDescription endLabelStyleDescription;




	/**
	 * The default value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated NOT
	 * @ordered
	 */
	protected static final LineStyle LINE_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected LineStyle lineStyle = LINE_STYLE_EDEFAULT;




	/**
	 * The default value of the '{@link #getSourceArrow() <em>Source Arrow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceArrow()
	 * @generated NOT
	 * @ordered
	 */
	protected static final EdgeArrows SOURCE_ARROW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceArrow() <em>Source Arrow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceArrow()
	 * @generated
	 * @ordered
	 */
	protected EdgeArrows sourceArrow = SOURCE_ARROW_EDEFAULT;




	/**
	 * The default value of the '{@link #getTargetArrow() <em>Target Arrow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetArrow()
	 * @generated NOT
	 * @ordered
	 */
	protected static final EdgeArrows TARGET_ARROW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetArrow() <em>Target Arrow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetArrow()
	 * @generated
	 * @ordered
	 */
	protected EdgeArrows targetArrow = TARGET_ARROW_EDEFAULT;




	/**
	 * The cached value of the '{@link #getSizeComputationExpression() <em>Size Computation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeComputationExpression()
	 * @generated
	 * @ordered
	 */
	protected CustomizationExpression sizeComputationExpression;




	/**
	 * The default value of the '{@link #getRoutingStyle() <em>Routing Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingStyle()
	 * @generated NOT
	 * @ordered
	 */
	protected static final EdgeRouting ROUTING_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoutingStyle() <em>Routing Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingStyle()
	 * @generated
	 * @ordered
	 */
	protected EdgeRouting routingStyle = ROUTING_STYLE_EDEFAULT;




	/**
	 * The default value of the '{@link #getFoldingStyle() <em>Folding Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoldingStyle()
	 * @generated NOT
	 * @ordered
	 */
	protected static final FoldingStyle FOLDING_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFoldingStyle() <em>Folding Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoldingStyle()
	 * @generated
	 * @ordered
	 */
	protected FoldingStyle foldingStyle = FOLDING_STYLE_EDEFAULT;




	/**
	 * The default value of the '{@link #getEndCentering() <em>End Centering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndCentering()
	 * @generated NOT
	 * @ordered
	 */
	protected static final CenteringStyle END_CENTERING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndCentering() <em>End Centering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndCentering()
	 * @generated
	 * @ordered
	 */
	protected CenteringStyle endCentering = END_CENTERING_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeStyleCustomizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpstylecustomizationPackage.Literals.EDGE_STYLE_CUSTOMIZATION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<EdgeStyleDescription> getAppliedOn() {

		if (appliedOn == null) {
			appliedOn = new EObjectResolvingEList<EdgeStyleDescription>(EdgeStyleDescription.class, this, VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__APPLIED_ON);
		}
		return appliedOn;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<DiagramElementMapping> getCenteredSourceMappings() {

		if (centeredSourceMappings == null) {
			centeredSourceMappings = new EObjectResolvingEList<DiagramElementMapping>(DiagramElementMapping.class, this, VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__CENTERED_SOURCE_MAPPINGS);
		}
		return centeredSourceMappings;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<DiagramElementMapping> getCenteredTargetMappings() {

		if (centeredTargetMappings == null) {
			centeredTargetMappings = new EObjectResolvingEList<DiagramElementMapping>(DiagramElementMapping.class, this, VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__CENTERED_TARGET_MAPPINGS);
		}
		return centeredTargetMappings;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public BeginLabelStyleDescription getBeginLabelStyleDescription() {

		if (beginLabelStyleDescription != null && beginLabelStyleDescription.eIsProxy()) {
			InternalEObject oldBeginLabelStyleDescription = (InternalEObject)beginLabelStyleDescription;
			beginLabelStyleDescription = (BeginLabelStyleDescription)eResolveProxy(oldBeginLabelStyleDescription);
			if (beginLabelStyleDescription != oldBeginLabelStyleDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__BEGIN_LABEL_STYLE_DESCRIPTION, oldBeginLabelStyleDescription, beginLabelStyleDescription));
			}
		}
		return beginLabelStyleDescription;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public BeginLabelStyleDescription basicGetBeginLabelStyleDescription() {

		return beginLabelStyleDescription;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setBeginLabelStyleDescription(BeginLabelStyleDescription newBeginLabelStyleDescription) {

		BeginLabelStyleDescription oldBeginLabelStyleDescription = beginLabelStyleDescription;
		beginLabelStyleDescription = newBeginLabelStyleDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__BEGIN_LABEL_STYLE_DESCRIPTION, oldBeginLabelStyleDescription, beginLabelStyleDescription));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public CenterLabelStyleDescription getCenterLabelStyleDescription() {

		if (centerLabelStyleDescription != null && centerLabelStyleDescription.eIsProxy()) {
			InternalEObject oldCenterLabelStyleDescription = (InternalEObject)centerLabelStyleDescription;
			centerLabelStyleDescription = (CenterLabelStyleDescription)eResolveProxy(oldCenterLabelStyleDescription);
			if (centerLabelStyleDescription != oldCenterLabelStyleDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__CENTER_LABEL_STYLE_DESCRIPTION, oldCenterLabelStyleDescription, centerLabelStyleDescription));
			}
		}
		return centerLabelStyleDescription;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public CenterLabelStyleDescription basicGetCenterLabelStyleDescription() {

		return centerLabelStyleDescription;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setCenterLabelStyleDescription(CenterLabelStyleDescription newCenterLabelStyleDescription) {

		CenterLabelStyleDescription oldCenterLabelStyleDescription = centerLabelStyleDescription;
		centerLabelStyleDescription = newCenterLabelStyleDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__CENTER_LABEL_STYLE_DESCRIPTION, oldCenterLabelStyleDescription, centerLabelStyleDescription));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EndLabelStyleDescription getEndLabelStyleDescription() {

		if (endLabelStyleDescription != null && endLabelStyleDescription.eIsProxy()) {
			InternalEObject oldEndLabelStyleDescription = (InternalEObject)endLabelStyleDescription;
			endLabelStyleDescription = (EndLabelStyleDescription)eResolveProxy(oldEndLabelStyleDescription);
			if (endLabelStyleDescription != oldEndLabelStyleDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__END_LABEL_STYLE_DESCRIPTION, oldEndLabelStyleDescription, endLabelStyleDescription));
			}
		}
		return endLabelStyleDescription;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EndLabelStyleDescription basicGetEndLabelStyleDescription() {

		return endLabelStyleDescription;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setEndLabelStyleDescription(EndLabelStyleDescription newEndLabelStyleDescription) {

		EndLabelStyleDescription oldEndLabelStyleDescription = endLabelStyleDescription;
		endLabelStyleDescription = newEndLabelStyleDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__END_LABEL_STYLE_DESCRIPTION, oldEndLabelStyleDescription, endLabelStyleDescription));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public LineStyle getLineStyle() {

		return lineStyle;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setLineStyle(LineStyle newLineStyle) {

		LineStyle oldLineStyle = lineStyle;
		lineStyle = newLineStyle == null ? LINE_STYLE_EDEFAULT : newLineStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__LINE_STYLE, oldLineStyle, lineStyle));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EdgeArrows getSourceArrow() {

		return sourceArrow;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setSourceArrow(EdgeArrows newSourceArrow) {

		EdgeArrows oldSourceArrow = sourceArrow;
		sourceArrow = newSourceArrow == null ? SOURCE_ARROW_EDEFAULT : newSourceArrow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__SOURCE_ARROW, oldSourceArrow, sourceArrow));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EdgeArrows getTargetArrow() {

		return targetArrow;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setTargetArrow(EdgeArrows newTargetArrow) {

		EdgeArrows oldTargetArrow = targetArrow;
		targetArrow = newTargetArrow == null ? TARGET_ARROW_EDEFAULT : newTargetArrow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__TARGET_ARROW, oldTargetArrow, targetArrow));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public CustomizationExpression getSizeComputationExpression() {

		return sizeComputationExpression;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetSizeComputationExpression(CustomizationExpression newSizeComputationExpression, NotificationChain msgs) {

		CustomizationExpression oldSizeComputationExpression = sizeComputationExpression;
		sizeComputationExpression = newSizeComputationExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION, oldSizeComputationExpression, newSizeComputationExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setSizeComputationExpression(CustomizationExpression newSizeComputationExpression) {

		if (newSizeComputationExpression != sizeComputationExpression) {
			NotificationChain msgs = null;
			if (sizeComputationExpression != null)
				msgs = ((InternalEObject)sizeComputationExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION, null, msgs);
			if (newSizeComputationExpression != null)
				msgs = ((InternalEObject)newSizeComputationExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION, null, msgs);
			msgs = basicSetSizeComputationExpression(newSizeComputationExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION, newSizeComputationExpression, newSizeComputationExpression));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EdgeRouting getRoutingStyle() {

		return routingStyle;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setRoutingStyle(EdgeRouting newRoutingStyle) {

		EdgeRouting oldRoutingStyle = routingStyle;
		routingStyle = newRoutingStyle == null ? ROUTING_STYLE_EDEFAULT : newRoutingStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__ROUTING_STYLE, oldRoutingStyle, routingStyle));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public FoldingStyle getFoldingStyle() {

		return foldingStyle;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setFoldingStyle(FoldingStyle newFoldingStyle) {

		FoldingStyle oldFoldingStyle = foldingStyle;
		foldingStyle = newFoldingStyle == null ? FOLDING_STYLE_EDEFAULT : newFoldingStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__FOLDING_STYLE, oldFoldingStyle, foldingStyle));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public CenteringStyle getEndCentering() {

		return endCentering;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setEndCentering(CenteringStyle newEndCentering) {

		CenteringStyle oldEndCentering = endCentering;
		endCentering = newEndCentering == null ? END_CENTERING_EDEFAULT : newEndCentering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__END_CENTERING, oldEndCentering, endCentering));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION:
				return basicSetSizeComputationExpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__APPLIED_ON:
				return getAppliedOn();
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__CENTERED_SOURCE_MAPPINGS:
				return getCenteredSourceMappings();
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__CENTERED_TARGET_MAPPINGS:
				return getCenteredTargetMappings();
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__BEGIN_LABEL_STYLE_DESCRIPTION:
				if (resolve) return getBeginLabelStyleDescription();
				return basicGetBeginLabelStyleDescription();
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__CENTER_LABEL_STYLE_DESCRIPTION:
				if (resolve) return getCenterLabelStyleDescription();
				return basicGetCenterLabelStyleDescription();
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__END_LABEL_STYLE_DESCRIPTION:
				if (resolve) return getEndLabelStyleDescription();
				return basicGetEndLabelStyleDescription();
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__LINE_STYLE:
				return getLineStyle();
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__SOURCE_ARROW:
				return getSourceArrow();
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__TARGET_ARROW:
				return getTargetArrow();
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION:
				return getSizeComputationExpression();
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__ROUTING_STYLE:
				return getRoutingStyle();
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__FOLDING_STYLE:
				return getFoldingStyle();
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__END_CENTERING:
				return getEndCentering();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__APPLIED_ON:
				getAppliedOn().clear();
				getAppliedOn().addAll((Collection<? extends EdgeStyleDescription>)newValue);
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__CENTERED_SOURCE_MAPPINGS:
				getCenteredSourceMappings().clear();
				getCenteredSourceMappings().addAll((Collection<? extends DiagramElementMapping>)newValue);
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__CENTERED_TARGET_MAPPINGS:
				getCenteredTargetMappings().clear();
				getCenteredTargetMappings().addAll((Collection<? extends DiagramElementMapping>)newValue);
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__BEGIN_LABEL_STYLE_DESCRIPTION:
				setBeginLabelStyleDescription((BeginLabelStyleDescription)newValue);
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__CENTER_LABEL_STYLE_DESCRIPTION:
				setCenterLabelStyleDescription((CenterLabelStyleDescription)newValue);
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__END_LABEL_STYLE_DESCRIPTION:
				setEndLabelStyleDescription((EndLabelStyleDescription)newValue);
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__LINE_STYLE:
				setLineStyle((LineStyle)newValue);
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__SOURCE_ARROW:
				setSourceArrow((EdgeArrows)newValue);
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__TARGET_ARROW:
				setTargetArrow((EdgeArrows)newValue);
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION:
				setSizeComputationExpression((CustomizationExpression)newValue);
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__ROUTING_STYLE:
				setRoutingStyle((EdgeRouting)newValue);
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__FOLDING_STYLE:
				setFoldingStyle((FoldingStyle)newValue);
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__END_CENTERING:
				setEndCentering((CenteringStyle)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__APPLIED_ON:
				getAppliedOn().clear();
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__CENTERED_SOURCE_MAPPINGS:
				getCenteredSourceMappings().clear();
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__CENTERED_TARGET_MAPPINGS:
				getCenteredTargetMappings().clear();
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__BEGIN_LABEL_STYLE_DESCRIPTION:
				setBeginLabelStyleDescription((BeginLabelStyleDescription)null);
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__CENTER_LABEL_STYLE_DESCRIPTION:
				setCenterLabelStyleDescription((CenterLabelStyleDescription)null);
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__END_LABEL_STYLE_DESCRIPTION:
				setEndLabelStyleDescription((EndLabelStyleDescription)null);
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__LINE_STYLE:
				setLineStyle(LINE_STYLE_EDEFAULT);
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__SOURCE_ARROW:
				setSourceArrow(SOURCE_ARROW_EDEFAULT);
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__TARGET_ARROW:
				setTargetArrow(TARGET_ARROW_EDEFAULT);
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION:
				setSizeComputationExpression((CustomizationExpression)null);
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__ROUTING_STYLE:
				setRoutingStyle(ROUTING_STYLE_EDEFAULT);
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__FOLDING_STYLE:
				setFoldingStyle(FOLDING_STYLE_EDEFAULT);
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__END_CENTERING:
				setEndCentering(END_CENTERING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__APPLIED_ON:
				return appliedOn != null && !appliedOn.isEmpty();
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__CENTERED_SOURCE_MAPPINGS:
				return centeredSourceMappings != null && !centeredSourceMappings.isEmpty();
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__CENTERED_TARGET_MAPPINGS:
				return centeredTargetMappings != null && !centeredTargetMappings.isEmpty();
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__BEGIN_LABEL_STYLE_DESCRIPTION:
				return beginLabelStyleDescription != null;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__CENTER_LABEL_STYLE_DESCRIPTION:
				return centerLabelStyleDescription != null;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__END_LABEL_STYLE_DESCRIPTION:
				return endLabelStyleDescription != null;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__LINE_STYLE:
				return lineStyle != LINE_STYLE_EDEFAULT;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__SOURCE_ARROW:
				return sourceArrow != SOURCE_ARROW_EDEFAULT;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__TARGET_ARROW:
				return targetArrow != TARGET_ARROW_EDEFAULT;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION:
				return sizeComputationExpression != null;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__ROUTING_STYLE:
				return routingStyle != ROUTING_STYLE_EDEFAULT;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__FOLDING_STYLE:
				return foldingStyle != FOLDING_STYLE_EDEFAULT;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__END_CENTERING:
				return endCentering != END_CENTERING_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lineStyle: ");
		result.append(lineStyle);
		result.append(", sourceArrow: ");
		result.append(sourceArrow);
		result.append(", targetArrow: ");
		result.append(targetArrow);
		result.append(", routingStyle: ");
		result.append(routingStyle);
		result.append(", foldingStyle: ");
		result.append(foldingStyle);
		result.append(", endCentering: ");
		result.append(endCentering);
		result.append(')');
		return result.toString();
	}


} //EdgeStyleCustomizationImpl

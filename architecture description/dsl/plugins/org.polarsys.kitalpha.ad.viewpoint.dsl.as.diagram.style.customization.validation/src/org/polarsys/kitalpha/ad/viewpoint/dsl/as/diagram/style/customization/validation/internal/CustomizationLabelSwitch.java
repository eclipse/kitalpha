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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.style.customization.validation.internal;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.BundledImageCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerWorkspaceImageCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.DotCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EllipseCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.FlatContainerStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.GaugeCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelAlignmentCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LozengeCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeWorkspaceImageCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ShapeContainerStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SquareCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.util.VpstylecustomizationSwitch;

/**
 * @author Boubekeur Zendagui
 */
public class CustomizationLabelSwitch extends VpstylecustomizationSwitch<String> {
	
	@Override
	public String caseEdgeStyleCustomization(EdgeStyleCustomization object) {
		return "Edge style customization";
	}
	
	@Override
	public String caseColorCustomization(ColorCustomization object) {
		return "Color customization";
	}
	
	@Override
	public String caseLabelCustomization(LabelCustomization object) {
		return "Label customization";
	}
	
	@Override
	public String caseContainerStyleCustomization(ContainerStyleCustomization object) {
		return "Container style customization";
	}
	
	@Override
	public String caseNodeStyleCustomization(NodeStyleCustomization object) {
		return "Node style customization";
	}
	
	@Override
	public String caseBundledImageCustomization(BundledImageCustomization object) {
		return "Bundled image customization";
	}
	
	@Override
	public String caseLozengeCustomization(LozengeCustomization object) {
		return "Lozenge customization";
	}
	
	@Override
	public String caseGaugeCustomization(GaugeCustomization object) {
		return "Gauge customization";
	}
	
	@Override
	public String caseEllipseCustomization(EllipseCustomization object) {
		return "Ellipse customization";
	}
	
	@Override
	public String caseSquareCustomization(SquareCustomization object) {
		return "Square customization";
	}
	
	@Override
	public String caseDotCustomization(DotCustomization object) {
		return "Dot customization";
	}
	
	@Override
	public String caseNodeWorkspaceImageCustomization(NodeWorkspaceImageCustomization object) {
		return "Workspace image customization";
	}
	
	@Override
	public String caseContainerWorkspaceImageCustomization(ContainerWorkspaceImageCustomization object) {
		return "Workspace image customization";
	}
	
	@Override
	public String caseFlatContainerStyleCustomization(FlatContainerStyleCustomization object) {
		return "Flat container customization";
	}
	
	@Override
	public String caseShapeContainerStyleCustomization(ShapeContainerStyleCustomization object) {
		return "Shape container customization";
	}
	
	@Override
	public String caseLabelAlignmentCustomization(LabelAlignmentCustomization object) {
		return "Label alignment customization";
	}
}

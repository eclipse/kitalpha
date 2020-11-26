/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.helper;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.sirius.diagram.description.style.ContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.NodeStyleDescription;
import org.eclipse.sirius.diagram.description.style.StylePackage;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.BundledImageCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerWorkspaceImageCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.DotCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EllipseCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.FlatContainerStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.GaugeCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LozengeCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeWorkspaceImageCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ShapeContainerStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SpecificContainerStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SpecificNodeStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SquareCustomization;

/**
 * @author Boubekeur Zendagui
 */
public class StylesSelectionHelper {

	public static EList<NodeStyleDescription> filterCustomizedNodeStyles(SpecificNodeStyleCustomization styleCustomizattion){
		EList<NodeStyleDescription> result = new BasicEList<NodeStyleDescription>();
		final NodeStyleCustomization customization = (NodeStyleCustomization) styleCustomizattion.eContainer();
		if (styleCustomizattion instanceof DotCustomization)
			result = getNodeStyleOfType(customization.getAppliedOn(), StylePackage.eINSTANCE.getDotDescription());
		
		if (styleCustomizattion instanceof EllipseCustomization)
			result = getNodeStyleOfType(customization.getAppliedOn(), StylePackage.eINSTANCE.getEllipseNodeDescription());
		
		if (styleCustomizattion instanceof LozengeCustomization)
			result = getNodeStyleOfType(customization.getAppliedOn(), StylePackage.eINSTANCE.getLozengeNodeDescription());
		
		if (styleCustomizattion instanceof SquareCustomization)
			result = getNodeStyleOfType(customization.getAppliedOn(), StylePackage.eINSTANCE.getSquareDescription());
		
		if (styleCustomizattion instanceof BundledImageCustomization)
			result = getNodeStyleOfType(customization.getAppliedOn(), StylePackage.eINSTANCE.getBundledImageDescription());
		
		if (styleCustomizattion instanceof GaugeCustomization)
			result = getNodeStyleOfType(customization.getAppliedOn(), StylePackage.eINSTANCE.getGaugeCompositeStyleDescription());
		
		if (styleCustomizattion instanceof NodeWorkspaceImageCustomization)
			result = getNodeStyleOfType(customization.getAppliedOn(), StylePackage.eINSTANCE.getWorkspaceImageDescription());

		return result;
	}
	
	private static EList<NodeStyleDescription> getNodeStyleOfType(EList<NodeStyleDescription> list, EClass clazz) {
		EList<NodeStyleDescription> result = new BasicEList<NodeStyleDescription>();
		for (NodeStyleDescription nodeStyleDescription : list) 
		{
			if (nodeStyleDescription.eClass().equals(clazz)	|| 
				nodeStyleDescription.eClass().getEAllSuperTypes().contains(clazz))
				result.add(nodeStyleDescription);
		}

		return result;
	}
	
	public static EList<ContainerStyleDescription> filterCustomizedContainerStyles(SpecificContainerStyleCustomization styleCustomizattion) {
		EList<ContainerStyleDescription> result = new BasicEList<ContainerStyleDescription>();
		final ContainerStyleCustomization customization = (ContainerStyleCustomization) styleCustomizattion.eContainer();
		if (styleCustomizattion instanceof ShapeContainerStyleCustomization)
			result = getContainerStyleOfType(customization.getAppliedOn(), StylePackage.eINSTANCE.getShapeContainerStyleDescription());
		
		if (styleCustomizattion instanceof FlatContainerStyleCustomization)
			result = getContainerStyleOfType(customization.getAppliedOn(), StylePackage.eINSTANCE.getFlatContainerStyleDescription());
		
		if (styleCustomizattion instanceof ContainerWorkspaceImageCustomization)
			result = getContainerStyleOfType(customization.getAppliedOn(), StylePackage.eINSTANCE.getWorkspaceImageDescription());
		
		return result;
	}
	
	private static EList<ContainerStyleDescription> getContainerStyleOfType(EList<ContainerStyleDescription> list, EClass clazz) {
		EList<ContainerStyleDescription> result = new BasicEList<ContainerStyleDescription>();
		for (ContainerStyleDescription nodeStyleDescription : list) 
		{
			if (nodeStyleDescription.eClass().equals(clazz)	|| 
				nodeStyleDescription.eClass().getEAllSuperTypes().contains(clazz))
				result.add(nodeStyleDescription);
		}

		return result;
	}
}

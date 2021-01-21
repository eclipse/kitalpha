/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.mappingimport.merge;

import org.eclipse.sirius.diagram.description.style.BundledImageDescription;
import org.eclipse.sirius.diagram.description.style.DotDescription;
import org.eclipse.sirius.diagram.description.style.EllipseNodeDescription;
import org.eclipse.sirius.diagram.description.style.GaugeCompositeStyleDescription;
import org.eclipse.sirius.diagram.description.style.LozengeNodeDescription;
import org.eclipse.sirius.diagram.description.style.NodeStyleDescription;
import org.eclipse.sirius.diagram.description.style.SquareDescription;
import org.eclipse.sirius.diagram.description.style.StylePackage;
import org.eclipse.sirius.diagram.description.style.WorkspaceImageDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNodeStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BasicStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ImageStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;


/**
 * @author Boubekeur Zendagui
 */
public class NodeStyleImportMerger extends LabelStyleImportMerger{

	public static NodeStyleDescription mergeStyles(NodeStyleDescription originalStyle, 
												   NodeStyleDescription generatedStyle,
												   NodeDescription viewpointNodeDescription){
		/* Imported container has either no style or contains only ConditionalStyles */
		if (originalStyle == null && generatedStyle != null) {
			return generatedStyle;
		}

		/* No style defined for the imported container */
		if (generatedStyle == null) {
			return null;
		}

		NodeStyleDescription result = generatedStyle;

		/* Merge Label style data*/
		result = (NodeStyleDescription) mergeLabelStyle(originalStyle, result, viewpointNodeDescription);

		/* Merge generated style data */
		result = mergeGeneratedStyleData(originalStyle, result, viewpointNodeDescription);

		/* Import all NO generated data */ 
		result = mergeNoGeneratedStyleData(originalStyle, result);

		return result;
	}
	
	/**
	 * 
	 * @param originalStyle
	 * @param generatedStyle
	 * @param viewpointNodeDescription
	 * @return
	 */
	private static NodeStyleDescription mergeGeneratedStyleData(NodeStyleDescription originalStyle, 
																NodeStyleDescription generatedStyle, 
																NodeDescription viewpointNodeDescription) {
		NodeStyleDescription result = generatedStyle;
		final AbstractNodeStyle viewpointStyle = viewpointNodeDescription.getStyle();
		
		if (! viewpointStyle.eIsSet(VpdiagramPackage.eINSTANCE.getAbstractNodeStyle_BorderColor()))
			result.setBorderColor(originalStyle.getBorderColor());
		
		if (viewpointStyle instanceof ImageStyle)
		{
			final ImageStyle imageStyle = (ImageStyle) viewpointStyle;
			if (! imageStyle.eIsSet(VpdiagramPackage.eINSTANCE.getImageStyle_ImagePath()))
				((WorkspaceImageDescription)result).setWorkspacePath(((WorkspaceImageDescription)originalStyle).getWorkspacePath());
		}
		
		if (viewpointStyle instanceof BasicStyle)
		{
			final BasicStyle basicStyle = (BasicStyle) viewpointStyle;
			if (! basicStyle.eIsSet(VpdiagramPackage.eINSTANCE.getBasicStyle_BackgroundColor()))
			{
				if (generatedStyle instanceof BundledImageDescription)
					((BundledImageDescription) generatedStyle).setColor(((BundledImageDescription) originalStyle).getColor());
			}
		}
		
		
		return result;
	}
	
	/**
	 * 
	 * @param originalStyle
	 * @param generatedStyle
	 * @return
	 */
	private static NodeStyleDescription mergeNoGeneratedStyleData(NodeStyleDescription originalStyle, NodeStyleDescription generatedStyle) {
		NodeStyleDescription result = generatedStyle;
		generatedStyle.setSizeComputationExpression(originalStyle.getSizeComputationExpression());
		result.setHideLabelByDefault(originalStyle.isHideLabelByDefault());
		result.setResizeKind(originalStyle.getResizeKind());
		result.setBorderSizeComputationExpression(originalStyle.getBorderSizeComputationExpression());
		result.setTooltipExpression(originalStyle.getTooltipExpression());
		
		int classifierID = originalStyle.eClass().getClassifierID();
		switch (classifierID) {
			case StylePackage.GAUGE_COMPOSITE_STYLE_DESCRIPTION :
				final GaugeCompositeStyleDescription gaugeOriginalStyle = (GaugeCompositeStyleDescription)originalStyle;
				((GaugeCompositeStyleDescription) result).setAlignment(gaugeOriginalStyle.getAlignment());
				
			case StylePackage.ELLIPSE_NODE_DESCRIPTION :
				final EllipseNodeDescription ellipseOriginalStyle = (EllipseNodeDescription)originalStyle;
				((EllipseNodeDescription)result).setHorizontalDiameterComputationExpression(ellipseOriginalStyle.getHorizontalDiameterComputationExpression());
				((EllipseNodeDescription)result).setVerticalDiameterComputationExpression(ellipseOriginalStyle.getVerticalDiameterComputationExpression());
			
			case StylePackage.SQUARE_DESCRIPTION :
				final SquareDescription squareOriginalStyle = (SquareDescription)originalStyle;
				((SquareDescription)result).setWidth(squareOriginalStyle.getWidth());
				((SquareDescription)result).setHeight(squareOriginalStyle.getHeight());
			
			case StylePackage.LOZENGE_NODE_DESCRIPTION :
				final LozengeNodeDescription lozengeOriginalStyle = (LozengeNodeDescription)originalStyle;
				((LozengeNodeDescription)result).setWidthComputationExpression(lozengeOriginalStyle.getWidthComputationExpression());
				((LozengeNodeDescription)result).setHeightComputationExpression(lozengeOriginalStyle.getHeightComputationExpression());
				
			case StylePackage.DOT_DESCRIPTION :
				final DotDescription dotOriginalStyle = (DotDescription)originalStyle;
				((DotDescription) result).setStrokeSizeComputationExpression(dotOriginalStyle.getStrokeSizeComputationExpression());
				
			case StylePackage.BUNDLED_IMAGE_DESCRIPTION :
				// Nothing to do for this kind of style
			;
				
		}
		return result;
	}
}
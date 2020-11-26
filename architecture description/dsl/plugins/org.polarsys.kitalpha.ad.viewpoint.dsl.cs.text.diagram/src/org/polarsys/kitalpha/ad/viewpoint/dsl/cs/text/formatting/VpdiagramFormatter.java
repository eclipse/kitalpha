/*******************************************************************************
 * Copyright (c) 2014-2016 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.formatting;

import java.util.List;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpdiagramGrammarAccess;

/**
 * 
 * @author Amine Lajmi
 * 		   Faycal Abka
 *
 */
public class VpdiagramFormatter extends AbstractDeclarativeFormatter {

	@Override
	protected void configureFormatting(FormattingConfig c) {
		VpdiagramGrammarAccess f = (VpdiagramGrammarAccess) getGrammarAccess();
		c.setAutoLinewrap(160);

		// Line wrap before import
		c.setLinewrap(1).before(f.getImportGroupAccess().getImportKeyword_0());
		c.setLinewrap(1).before(f.getImportNameSpaceAccess().getImportKeyword_0());

		// Line wrap before Diagrams
		c.setLinewrap(1).before(f.getDiagramSetAccess().getDiagramsKeyword_1());
		// Line wrap before Mapping keyword
		c.setLinewrap(1).before(f.getMappingSetAccess().getMappingKeyword_1());

		// Line wrap before Node children "Contains"
		c.setLinewrap(1).before(f.getNodeChildrenAccess().getContainsKeyword_1());

		// Line wrap before Node Description "Representation"
		c.setLinewrap(1).before(f.getNodeDescriptionAccess().getRepresentationKeyword_1());

		// Line wrap before Container Description "Representation"
		c.setLinewrap(1).before(f.getContainerDescriptionAccess().getRepresentationKeyword_1());

		// Line wrap before Histogram Section "value"
		c.setLinewrap(1).before(f.getHistogramSectionAccess().getValueKeyword_6_0());

		// Line wrap before Histogram Section "maxValue"
		c.setLinewrap(1).before(f.getHistogramSectionAccess().getMaxValueKeyword_7_0());

		// Line wrap before Histogram Section "minValue"
		c.setLinewrap(1).before(f.getHistogramSectionAccess().getMinValueKeyword_5_0());

		// Line wrap before Container Description "Label"
		c.setLinewrap(1).before(f.getContainerDescriptionAccess().getLabelKeyword_4_0());

		// Line wrap after Diagram description value
		c.setLinewrap(1).after(f.getDiagramAccess().getDescriptionAssignment_4_1());

		// Line wrap after Diagram description value
		c.setLinewrap(1).before(f.getLabelAccess().getPoliceKeyword_2_0());

		// Line wrap after Node Description
		c.setLinewrap(1).before(f.getNodeDescriptionAccess().getPositionKeyword_4_3_0());

		// Line wrap after Histogram Style boder-color value
		c.setLinewrap(1).after(f.getHistogramStyleAccess().getBorderColorAssignment_3_1());

		// Line wrap after Local Class domain-context value
		c.setLinewrap(1).after(f.getLocalClass2Access().getClassAssignment_1());

		// Line wrap after ImageStyle boder color value
		c.setLinewrap(1).after(f.getImageStyleAccess().getBorderColorAssignment_3_1());

		// Line wrap before Label keyword
		c.setLinewrap(1).before(f.getNodeDescriptionAccess().getLabelKeyword_4_0());

		// Line wrap before alignment keyword
		c.setLinewrap(1).before(f.getNodeDescriptionAccess().getAlignmentKeyword_4_4_0());

		// Line wrap before Edge Style begin-decorator keyword
		c.setLinewrap(1).before(f.getEdgeStyleAccess().getBeginDecoratorKeyword_4_0());

		// Line wrap before Edge Style end-decorator keyword
		c.setLinewrap(1).before(f.getEdgeStyleAccess().getEndDecoratorKeyword_5_0());

		// Line wrap before Edge Style color keyword
		c.setLinewrap(1).before(f.getEdgeStyleAccess().getColorKeyword_6_0());

		// Line wrap before Edge Description center label keyword
		c.setLinewrap(1).before(f.getEdgeDescriptionAccess().getCenterLabelKeyword_5_0());

		// Line wrap before Edge Description end label keyword
		c.setLinewrap(1).before(f.getEdgeDescriptionAccess().getEndLabelKeyword_6_0());

		c.setNoSpace().before(f.getContainerChildrenAccess().getCommaKeyword_3_2_0());
		
		c.setLinewrap(1).before(f.getContainerAccess().getSynchronizationModeAssignment_7());
		c.setLinewrap(1).before(f.getEdgeAccess().getSynchronizationModeAssignment_5());
		c.setLinewrap(1).before(f.getEdgeImportAccess().getSynchronizationModeAssignment_5());
		c.setLinewrap(1).before(f.getNodeAccess().getSynchronizationModeAssignment_6());

		for (Keyword comma : f.findKeywords(",")) {
			c.setNoSpace().before(comma);
		}

		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("{", "}")) {
			c.setIndentation(pair.getFirst(), pair.getSecond());
			c.setLinewrap(1).after(pair.getFirst());
			c.setLinewrap(1).before(pair.getSecond());
			c.setLinewrap(1).after(pair.getSecond());
		}

		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("[", "]")) {
			c.setIndentation(pair.getFirst(), pair.getSecond());
			c.setLinewrap(1).after(pair.getFirst());
			c.setLinewrap(1).before(pair.getSecond());
			c.setLinewrap(1).after(pair.getSecond());
		}

		List<Keyword> customizations = f.findKeywords("customization"); // $NON-NLS-1
		for (Keyword customization : customizations) {
			c.setLinewrap().before(customization);
		}

		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getEdgeKeyword_1());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getOverAllEdgesKeyword_4_0());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getSourceKeyword_5_0());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getTargetKeyword_6_0());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getRoutingKeyword_7_0());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getFoldingKeyword_8_0());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getBeginLabelStyleDescriptionKeyword_11_0());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getCenterSourceMappingsKeyword_9_0());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getCenterTargetMappingsKeyword_10_0());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getCenterLabelStyleDescriptionKeyword_12_0());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getEndLabelStyleDescriptionKeyword_13_0());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getLineStyleKeyword_14_0());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getEndLabelStyleDescriptionAssignment_13_2());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getSizeKeyword_15_0());
		
		
		c.setLinewrap().before(f.getColorCustomizationAccess().getPaintKeyword_1());
		
		c.setLinewrap().before(f.getLabelCustomizationAccess().getOverAllLabelsKeyword_4_0());
		c.setLinewrap().before(f.getLabelAlignementCustomizationAccess().getAlignmentKeyword_1());
		c.setLinewrap().before(f.getLabelCustomizationAccess().getSizeKeyword_6_0());
		c.setLinewrap().before(f.getLabelCustomizationAccess().getFormatKeyword_7_0());
		c.setLinewrap().before(f.getLabelCustomizationAccess().getColorKeyword_8_0());
		c.setLinewrap().before(f.getLabelCustomizationAccess().getIconKeyword_9_0());
		c.setLinewrap().before(f.getLabelCustomizationAccess().getPathKeyword_9_5());
		
		c.setLinewrap().before(f.getContainerStyleCustomizationAccess().getOverAllContainersKeyword_4_0());
		c.setLinewrap().before(f.getContainerStyleCustomizationAccess().getWidthKeyword_5_0());
		c.setLinewrap().before(f.getContainerStyleCustomizationAccess().getHeightKeyword_6_0());
		c.setLinewrap().before(f.getContainerStyleCustomizationAccess().getRoundCornerKeyword_7_0());
		c.setLinewrap().before(f.getContainerStyleCustomizationAccess().getTooltipExpressionKeyword_8_0());
		c.setLinewrap().before(f.getContainerStyleCustomizationAccess().getBorderDimensionKeyword_9_0());
		c.setLinewrap().before(f.getContainerWorkspaceImageCustomizationAccess().getWorkspaceKeyword_1());
		c.setLinewrap().before(f.getFlatContainerStyleCustomizationAccess().getBackgroundKeyword_1());
		c.setLinewrap().before(f.getShapeContainerStyleCustomizationAccess().getShapeKeyword_1());

		
		c.setLinewrap().before(f.getNodeStyleCustomizationAccess().getOverAllNodesKeyword_4_0());
		c.setLinewrap().before(f.getNodeStyleCustomizationAccess().getLabelPositionKeyword_5_0());
		c.setLinewrap().before(f.getNodeStyleCustomizationAccess().getHideLabelKeyword_6_0());
		c.setLinewrap().before(f.getNodeStyleCustomizationAccess().getResizeKindKeyword_7_0());
		c.setLinewrap().before(f.getNodeStyleCustomizationAccess().getTooltipExpressionKeyword_8_0());
		c.setLinewrap().before(f.getNodeStyleCustomizationAccess().getBorderDimensionKeyword_9_0());
		c.setLinewrap().before(f.getNodeStyleCustomizationAccess().getSizeDimensionKeyword_10_0());
		c.setLinewrap().before(f.getBundledImageCustomizationAccess().getShapeKeyword_1());
		c.setLinewrap().before(f.getLozengeCustomizationAccess().getLozengeDimensionKeyword_1());
		c.setLinewrap().before(f.getLozengeCustomizationAccess().getWidthKeyword_4());
		c.setLinewrap().before(f.getLozengeCustomizationAccess().getHeightKeyword_7());
		c.setLinewrap().before(f.getGaugeCustomizationAccess().getGaugeAlignmentKeyword_1());
		c.setLinewrap().before(f.getEllipseCustomizationAccess().getEllipseDimensionKeyword_1());
		c.setLinewrap().before(f.getEllipseCustomizationAccess().getHorizontalKeyword_4());
		c.setLinewrap().before(f.getEllipseCustomizationAccess().getVerticalKeyword_7());
		c.setLinewrap().before(f.getNodeWorkspaceImageCustomizationAccess().getWorkspaceKeyword_1());
		c.setLinewrap().before(f.getSquareCustomizationAccess().getSquareDimensionKeyword_1());
		c.setLinewrap().before(f.getSquareCustomizationAccess().getWidthKeyword_4());
		c.setLinewrap().before(f.getSquareCustomizationAccess().getHeightKeyword_7());
		c.setLinewrap().before(f.getDotCustomizationAccess().getStrokeDimensionKeyword_1());
		
		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(1, 1, 1).after(f.getML_COMMENTRule());
	}
}

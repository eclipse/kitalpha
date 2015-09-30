/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getOverKeyword_6_0());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getSourceKeyword_7_0());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getTargetKeyword_8_0());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getRoutingKeyword_9_0());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getFoldingKeyword_10_0());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getBeginKeyword_13_0());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getCenterKeyword_11_0());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getCenterKeyword_12_0());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getCenterKeyword_14_0());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getEndKeyword_15_0());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getLineKeyword_16_0());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getEndKeyword_18_0());
		c.setLinewrap().before(f.getEdgeStyleCustomizationAccess().getSizeKeyword_17_0());
		
		
		c.setLinewrap().before(f.getColorCustomizationAccess().getOverKeyword_6_0());
		c.setLinewrap().before(f.getColorCustomizationAccess().getColorKeyword_7_0());
		c.setLinewrap().before(f.getColorCustomizationAccess().getColorKeyword_8_0());
		
		c.setLinewrap().before(f.getLabelCustomizationAccess().getOverKeyword_6_0());
		c.setLinewrap().before(f.getLabelAlignementCustomizationAccess().getAlignmentKeyword_1());
		c.setLinewrap().before(f.getLabelCustomizationAccess().getSizeKeyword_8_0());
		c.setLinewrap().before(f.getLabelCustomizationAccess().getFormatKeyword_9_0());
		c.setLinewrap().before(f.getLabelCustomizationAccess().getColorKeyword_10_0());
		c.setLinewrap().before(f.getLabelCustomizationAccess().getIconKeyword_11_0());
		c.setLinewrap().before(f.getLabelCustomizationAccess().getPathKeyword_11_5());
		
		c.setLinewrap().before(f.getContainerStyleCustomizationAccess().getOverKeyword_6_0());
		c.setLinewrap().before(f.getContainerStyleCustomizationAccess().getWidthKeyword_7_0());
		c.setLinewrap().before(f.getContainerStyleCustomizationAccess().getHeightKeyword_8_0());
		c.setLinewrap().before(f.getContainerStyleCustomizationAccess().getRoundKeyword_9_0());
		c.setLinewrap().before(f.getContainerStyleCustomizationAccess().getTooltipKeyword_10_0());
		c.setLinewrap().before(f.getContainerStyleCustomizationAccess().getBorderKeyword_11_0());
		c.setLinewrap().before(f.getContainerWorkspaceImageCustomizationAccess().getWorkspaceKeyword_1());
		c.setLinewrap().before(f.getFlatContainerStyleCustomizationAccess().getBackgroundKeyword_1());
		c.setLinewrap().before(f.getShapeContainerStyleCustomizationAccess().getShapeKeyword_1());

		
		c.setLinewrap().before(f.getNodeStyleCustomizationAccess().getOverKeyword_6_0());
		c.setLinewrap().before(f.getNodeStyleCustomizationAccess().getLabelKeyword_7_0());
		c.setLinewrap().before(f.getNodeStyleCustomizationAccess().getHideKeyword_8_0());
		c.setLinewrap().before(f.getNodeStyleCustomizationAccess().getResizeKeyword_9_0());
		c.setLinewrap().before(f.getNodeStyleCustomizationAccess().getTooltipKeyword_10_0());
		c.setLinewrap().before(f.getNodeStyleCustomizationAccess().getBorderKeyword_11_0());
		c.setLinewrap().before(f.getNodeStyleCustomizationAccess().getSizeKeyword_12_0());
		c.setLinewrap().before(f.getBundledImageCustomizationAccess().getShapeKeyword_1());
		c.setLinewrap().before(f.getLozengeCustomizationAccess().getLozengeKeyword_1());
		c.setLinewrap().before(f.getLozengeCustomizationAccess().getWidthKeyword_5());
		c.setLinewrap().before(f.getLozengeCustomizationAccess().getHeighKeyword_8());
		c.setLinewrap().before(f.getGaugeCustomizationAccess().getGaugeKeyword_1());
		c.setLinewrap().before(f.getEllipseCustomizationAccess().getEllipseKeyword_1());
		c.setLinewrap().before(f.getEllipseCustomizationAccess().getHorizontalKeyword_5());
		c.setLinewrap().before(f.getEllipseCustomizationAccess().getVerticalKeyword_8());
		c.setLinewrap().before(f.getNodeWorkspaceImageCustomizationAccess().getWorkspaceKeyword_1());
		c.setLinewrap().before(f.getSquareCustomizationAccess().getSquareKeyword_1());
		c.setLinewrap().before(f.getSquareCustomizationAccess().getWidthKeyword_5());
		c.setLinewrap().before(f.getSquareCustomizationAccess().getHeightKeyword_8());
		c.setLinewrap().before(f.getDotCustomizationAccess().getStrokeKeyword_1());
		// List<Keyword> overs = f.findKeywords("over");
		// for (Keyword over : overs) {
		// c.setLinewrap().before(over);
		// }
		//
		// List<Keyword> sources = f.findKeywords("source");
		// for (Keyword source : sources) {
		// c.setLinewrap().before(source);
		// }
		//
		// List<Keyword> targets = f.findKeywords("target");
		// for (Keyword target : targets) {
		// c.setLinewrap().before(target);
		// }
		//
		// List<Keyword> routings = f.findKeywords("routing");
		// for (Keyword routing : routings) {
		// c.setLinewrap().before(routing);
		// }
		//
		// List<Keyword> centers = f.findKeywords("center");
		// for (Keyword center : centers) {
		// c.setLinewrap().before(center);
		// }
		//
		// List<Keyword> commas = f.findKeywords(",");
		// for (Keyword comma : commas) {
		// c.setLinewrap().after(comma);
		// }
		//
		// List<Keyword> begins = f.findKeywords("begin");
		// for (Keyword begin : begins) {
		// c.setLinewrap().before(begin);
		// }
		//
		// List<Keyword> ends = f.findKeywords("end");
		// for (Keyword end : ends) {
		// c.setLinewrap().before(end);
		// }
		//
		// List<Keyword> lines = f.findKeywords("line");
		// for (Keyword line : lines) {
		// c.setLinewrap().before(line);
		// }
		//
		// List<Keyword> sizes = f.findKeywords("size");
		// for (Keyword size : sizes) {
		// c.setLinewrap().before(size);
		// }
		//
		// List<Keyword> colors = f.findKeywords("color");
		// for (Keyword color : colors) {
		// c.setLinewrap().before(color);
		// }
		//
		// List<Keyword> formats = f.findKeywords("format");
		// for (Keyword format : formats) {
		// c.setLinewrap().before(format);
		// }
		//
		// List<Keyword> icons = f.findKeywords("icon");
		// for (Keyword icon : icons) {
		// c.setLinewrap().before(icon);
		// }
		//
		// List<Keyword> shows = f.findKeywords("show");
		// for (Keyword show : shows) {
		// c.setLinewrap().before(show);
		// c.setIndentationIncrement();
		// }
		//
		// List<Keyword> paths = f.findKeywords("path");
		// for (Keyword path : paths) {
		// c.setLinewrap().before(path);
		// c.setIndentationIncrement();
		// }
		//
		// List<Keyword> expressions = f.findKeywords("expression");
		// for (Keyword expr : expressions) {
		// c.setLinewrap().before(expr);
		// }
		//
		// List<Keyword> alignements = f.findKeywords("alignement");
		// for (Keyword a : alignements) {
		// c.setLinewrap().before(a);
		// }
		//
		// List<Keyword> widths = f.findKeywords("width");
		// for (Keyword w : widths) {
		// c.setLinewrap().before(w);
		// }
		//
		// List<Keyword> heights = f.findKeywords("height");
		// for (Keyword h : heights) {
		// c.setLinewrap().before(h);
		// }
		//
		// List<Keyword> borders = f.findKeywords("border");
		// for (Keyword b : borders) {
		// c.setLinewrap().before(b);
		// }
		//
		// List<Keyword> workspaces = f.findKeywords("workspace");
		// for (Keyword w : workspaces) {
		// c.setLinewrap().before(w);
		// }
		//
		// List<Keyword> backgrounds = f.findKeywords("background");
		// for (Keyword b : backgrounds) {
		// c.setLinewrap().before(b);
		// }
		//
		// List<Keyword> shapes = f.findKeywords("shape");
		// for (Keyword s : shapes) {
		// c.setLinewrap().before(s);
		// }
		//
		// List<Keyword> labels = f.findKeywords("label");
		// for (Keyword l : labels) {
		// c.setLinewrap().before(l);
		// }
		//
		// List<Keyword> hides = f.findKeywords("hide");
		// for (Keyword h : hides) {
		// c.setLinewrap().before(h);
		// }
		//
		// List<Keyword> resizes = f.findKeywords("resize");
		// for (Keyword r : resizes) {
		// c.setLinewrap().before(r);
		// }
		//
		// List<Keyword> tooltips = f.findKeywords("tooltip");
		// for (Keyword t : tooltips) {
		// c.setLinewrap().before(t);
		// }
		//
		// List<Keyword> lozenges = f.findKeywords("lozenge");
		// for (Keyword l : lozenges) {
		// c.setLinewrap().before(l);
		// }
		//
		// List<Keyword> ellipses = f.findKeywords("ellipse");
		// for (Keyword e : ellipses) {
		// c.setLinewrap().before(e);
		// }
		//
		// List<Keyword> horizontals = f.findKeywords("horizontal");
		// for (Keyword h : horizontals) {
		// c.setLinewrap().before(h);
		// }
		//
		// List<Keyword> verticals = f.findKeywords("vertical");
		// for (Keyword v : verticals) {
		// c.setLinewrap().before(v);
		// }
		//
		// List<Keyword> strokes = f.findKeywords("stroke");
		// for (Keyword s : strokes) {
		// c.setLinewrap().before(s);
		// }
		//
		// List<Keyword> reuses = f.findKeywords("reuse");
		// for (Keyword r : reuses) {
		// c.setLinewrap().before(r);
		// }

		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(1, 1, 1).after(f.getML_COMMENTRule());
	}
}

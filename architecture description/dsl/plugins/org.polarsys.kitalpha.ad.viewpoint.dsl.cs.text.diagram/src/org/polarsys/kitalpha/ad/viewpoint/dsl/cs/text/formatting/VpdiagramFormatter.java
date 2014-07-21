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

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpdiagramGrammarAccess;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpdiagramFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		VpdiagramGrammarAccess f = (VpdiagramGrammarAccess) getGrammarAccess();
		c.setAutoLinewrap(160);
		
		//Line wrap before import
		c.setLinewrap(1).before(f.getImportAccess().getImportKeyword_0());
		
		
		//Line wrap before Diagrams
		c.setLinewrap(1).before(f.getDiagramSetAccess().getDiagramsKeyword_1());
		//Line wrap before Mapping keyword
		c.setLinewrap(1).before(f.getMappingSetAccess().getMappingKeyword_1());
		
		//Line wrap before Node children "Contains"
		c.setLinewrap(1).before(f.getNodeChildrenAccess().getContainsKeyword_1());
		
		//Line wrap before Node Description "Representation"
		c.setLinewrap(1).before(f.getNodeDescriptionAccess().getRepresentationKeyword_1());
		
		//Line wrap before Container Description "Representation"
		c.setLinewrap(1).before(f.getContainerDescriptionAccess().getRepresentationKeyword_1());
		
		//Line wrap before Histogram Section "value"
		c.setLinewrap(1).before(f.getHistogramSectionAccess().getValueKeyword_6_0());
		
		//Line wrap before Histogram Section "maxValue"
		c.setLinewrap(1).before(f.getHistogramSectionAccess().getMaxValueKeyword_7_0());
		
		//Line wrap before Histogram Section "minValue"
		c.setLinewrap(1).before(f.getHistogramSectionAccess().getMinValueKeyword_5_0());
		
		//Line wrap before Container Description "Label"
		c.setLinewrap(1).before(f.getContainerDescriptionAccess().getLabelKeyword_4_0());
		
		//Line wrap after Diagram description value
		c.setLinewrap(1).after(f.getDiagramAccess().getDescriptionAssignment_4_1());
		
		//Line wrap after Diagram description value
		c.setLinewrap(1).before(f.getLabelAccess().getPoliceKeyword_2_0());
		
		//Line wrap after Node Description
		c.setLinewrap(1).before(f.getNodeDescriptionAccess().getPositionKeyword_4_3_0());
		
		//Line wrap after Histogram Style boder-color value
		c.setLinewrap(1).after(f.getHistogramStyleAccess().getBorderColorAssignment_3_1());
		
		//Line wrap after Local Class domain-context value
		c.setLinewrap(1).after(f.getLocalClass2Access().getClassAssignment_1());
		
		//Line wrap after ImageStyle boder color value
		c.setLinewrap(1).after(f.getImageStyleAccess().getBorderColorAssignment_3_1());
		
		//Line wrap before Label keyword
		c.setLinewrap(1).before(f.getNodeDescriptionAccess().getLabelKeyword_4_0());
		
		//Line wrap before alignment keyword
		c.setLinewrap(1).before(f.getNodeDescriptionAccess().getAlignmentKeyword_4_4_0());
		
		//Line wrap before Edge Style begin-decorator keyword
		c.setLinewrap(1).before(f.getEdgeStyleAccess().getBeginDecoratorKeyword_4_0());
		
		//Line wrap before Edge Style end-decorator keyword
		c.setLinewrap(1).before(f.getEdgeStyleAccess().getEndDecoratorKeyword_5_0());
		
		//Line wrap before Edge Style color keyword
		c.setLinewrap(1).before(f.getEdgeStyleAccess().getColorKeyword_6_0());
		
		//Line wrap before Edge Description center label keyword
		c.setLinewrap(1).before(f.getEdgeDescriptionAccess().getCenterLabelKeyword_5_0());
		
		//Line wrap before Edge Description end label keyword
		c.setLinewrap(1).before(f.getEdgeDescriptionAccess().getEndLabelKeyword_6_0());
		
		c.setNoSpace().before(f.getContainerChildrenAccess().getCommaKeyword_3_2_0());
		
	
		for(Keyword comma: f.findKeywords(",")){
			c.setNoSpace().before(comma);
		}
		
		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("{", "}")) {
			c.setIndentation(pair.getFirst(), pair.getSecond());
			c.setLinewrap(1).after(pair.getFirst());
			c.setLinewrap(1).before(pair.getSecond());
			c.setLinewrap(1).after(pair.getSecond());
		}
		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(1, 1, 1).after(f.getML_COMMENTRule());
	}
}

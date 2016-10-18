/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpconfGrammarAccess;


/**
 * 
 * @author Amine Lajmi
 * 	   	   Faycal ABKA
 *
 */
public class VpconfFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		VpconfGrammarAccess f = (VpconfGrammarAccess) getGrammarAccess();
		c.setAutoLinewrap(160);
		
		
		//Line wrap before configuration
		c.setLinewrap(1).before(f.getConfigurationAccess().getConfigurationKeyword_1());
		//Line wrap before project
		c.setLinewrap(1).before(f.getGenerationConfigurationAccess().getProjectKeyword_1());
		//line wrap before nsuri
		c.setLinewrap(1).before(f.getGenerationConfigurationAccess().getNsuriKeyword_3_0());
		
		c.setLinewrap(1).before(f.getViewConfigurationAccess().getViewKeyword_1());
		c.setLinewrap(1).after(f.getViewConfigurationAccess().getVisibleEBooleanParserRuleCall_3_2_0());
		c.setLinewrap(1).after(f.getViewConfigurationAccess().getActivableEBooleanParserRuleCall_4_2_0());
		
		//release section
		c.setLinewrap(1).before(f.getReleaseAccess().getReleaseKeyword_1());
		c.setLinewrap(1).before(f.getReleaseAccess().getDescriptionKeyword_4_0());
		c.setLinewrap(1).before(f.getReleaseAccess().getExecutionKeyword_5_0());
		
		//generation section
		c.setLinewrap(1).before(f.getGenerationAccess().getGenerationKeyword_1());
		c.setLinewrap(1).after(f.getGenerationAccess().getRightCurlyBracketKeyword_5());
		c.setLinewrap(1).after(f.getGDataAccess().getModelAssignment_3_0_2());
		c.setLinewrap(1).after(f.getGDataAccess().getEditAssignment_3_1_2());
		c.setLinewrap(1).after(f.getGDataAccess().getEditorAssignment_3_2_2());
		c.setLinewrap(1).after(f.getGDataAccess().getTestAssignment_3_3_2());
		c.setLinewrap(1).after(f.getGDataAccess().getJavaDocAssignment_3_4_2());
		c.setLinewrap(1).after(f.getGDataAccess().getOverwriteEcoreAssignment_3_5_2());
		
		
		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("(", ")")) {
			c.setIndentation(pair.getFirst(), pair.getSecond());
			c.setLinewrap(1).after(pair.getFirst());
			c.setLinewrap(1).before(pair.getSecond());
			c.setLinewrap(1).after(pair.getSecond());
		}

		
		//Line wrap before Configuration target keyword
		c.setLinewrap(1).before(f.getTargetApplicationAccess().getTargetKeyword_1());
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

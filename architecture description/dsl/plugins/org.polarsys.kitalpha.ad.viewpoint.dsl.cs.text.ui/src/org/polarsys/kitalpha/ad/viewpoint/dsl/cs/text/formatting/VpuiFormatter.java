/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
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

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpuiGrammarAccess;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpuiFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		VpuiGrammarAccess f = (VpuiGrammarAccess) getGrammarAccess();	
		c.setAutoLinewrap(160);
		
		//Line wrap before import
		c.setLinewrap(1).before(f.getImportAccess().getImportKeyword_0());
		
		
		//Line wrap after UIs description:
		c.setLinewrap(1).before(f.getUIDescriptionAccess().getUIDescriptionKeyword_1());
		//Line wrap after UI label:
		c.setLinewrap(1).after(f.getUIAccess().getLabelAssignment_5_1());
		//Line wrap after Container title:
		c.setLinewrap(1).after(f.getUIContainerAccess().getLabelAssignment_4_1());
		//Line wrap after Container description:
		c.setLinewrap(1).after(f.getUIContainerAccess().getDescriptionAssignment_5_1());
		//Line wrap after field.mapped-to
		c.setLinewrap(1).after(f.getFieldMappingAccess().getUI_Field_Mapped_ToAssignment_2());	
		
		for(Pair<Keyword, Keyword> pair: f.findKeywordPairs("{", "}")) {
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

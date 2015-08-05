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

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class ActivityexplorerFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ActivityexplorerGrammarAccess f = (org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ActivityexplorerGrammarAccess) getGrammarAccess();
		
c.setLinewrap().before(f.getOverviewAccess().getOverviewKeyword_1());
        
        
        List<Keyword> ids = f.findKeywords("id");
        for (Keyword i : ids) {
            c.setLinewrap().before(i);
        }
        
        List<Keyword> indexes = f.findKeywords("index");
        for (Keyword k : indexes) {
            c.setLinewrap().before(k);
        }
        
        List<Keyword> predicates = f.findKeywords("predicated");
        for (Keyword p : predicates) {
            c.setLinewrap().before(p);
        }

        List<Keyword> extended = f.findKeywords("extended");
        for (Keyword e : extended) {
            c.setLinewrap().before(e);
        }
        
        
        List<Pair<Keyword, Keyword>> pairs = f.findKeywordPairs("image", "off");
        for (Pair<Keyword, Keyword> pair : pairs) {
            c.setLinewrap().before(pair.getFirst());
        }
        
        c.setLinewrap().after(f.getOverviewAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
        
        c.setLinewrap().before(f.getPageAccess().getHeaderKeyword_10_0());
        c.setLinewrap().before(f.getPageAccess().getTabKeyword_11_0());
        c.setLinewrap().before(f.getPageAccess().getShowKeyword_13_0());
        
//        c.setLinewrap().before(f.getSectionExtensionAccess().getFilteringKeyword_10_0());
//        c.setLinewrap().before(f.getSectionExtensionAccess().getExpandedKeyword_11_0());
        
//        c.setLinewrap().before(f.getActivityExtensionAccess().getIconKeyword_11_0());
        
        
        for(Pair<Keyword, Keyword> pair: f.findKeywordPairs("{", "}")) {
            c.setIndentation(pair.getFirst(), pair.getSecond());
            c.setLinewrap(1).after(pair.getFirst());
            c.setLinewrap(1).before(pair.getSecond());
            c.setLinewrap(1).after(pair.getSecond());
        }
        
        c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
        c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
        c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());

	}
}

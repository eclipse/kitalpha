/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
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
            c.setNoLinewrap().after(i);
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
        
        List<Keyword> filterings = f.findKeywords("filtering");
        for (Keyword _f : filterings) {
            c.setLinewrap().before(_f);
        }
        
        List<Keyword> expanded = f.findKeywords("expanded");
        for (Keyword e : expanded) {
            c.setLinewrap().before(e);
        }
        
        List<Keyword> activities = f.findKeywords("activities");
        for (Keyword a : activities) {
            c.setLinewrap().before(a);
        }
        
        activities = f.findKeywords("activity");
        for (Keyword a : activities) {
            c.setLinewrap().before(a);
        }
        
        List<Keyword> icons = f.findKeywords("icon");
        for (Keyword i : icons) {
            c.setLinewrap().before(i);
        }
        
        List<Keyword> descriptions = f.findKeywords("description");
        for (Keyword d : descriptions) {
            c.setNoLinewrap().after(d);
        }
        
        List<Keyword> labels = f.findKeywords("label");
        for (Keyword l : labels) {
            c.setLinewrap().before(l);
        }
        
        List<Pair<Keyword, Keyword>> pairsOff = f.findKeywordPairs("image", "off");
        for (Pair<Keyword, Keyword> pair : pairsOff) {
            c.setLinewrap().before(pair.getFirst());
        }
        
        List<Pair<Keyword, Keyword>> pairsOn = f.findKeywordPairs("image", "on");
        for (Pair<Keyword, Keyword> pair : pairsOn) {
            c.setLinewrap().before(pair.getFirst());
        }
        
        
        c.setLinewrap().before(f.getPageAccess().getHeaderKeyword_11_0());
        c.setLinewrap().before(f.getPageAccess().getTabNameKeyword_12_0());
        c.setLinewrap().before(f.getPageAccess().getShowViewerKeyword_14_0());
        
        c.setLinewrap().before(f.getPageAccess().getSectionsKeyword_15_0());
        
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

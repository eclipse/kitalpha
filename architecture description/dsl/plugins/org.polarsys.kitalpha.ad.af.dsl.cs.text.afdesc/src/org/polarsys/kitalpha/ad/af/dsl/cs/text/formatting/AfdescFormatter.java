/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.af.dsl.cs.text.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.polarsys.kitalpha.ad.af.dsl.cs.text.services.AfdescGrammarAccess;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class AfdescFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		AfdescGrammarAccess f = (AfdescGrammarAccess) getGrammarAccess();
		c.setAutoLinewrap(160);	
		c.setLinewrap(1).before(f.getArchitectureFrameworkAccess().getDescriptionKeyword_4_0());
		c.setLinewrap(1).before(f.getArchitectureFrameworkAccess().getShortNameKeyword_5_0());
		c.setLinewrap(1).before(f.getViewpointsAccess().getViewpointsKeyword_1());
		c.setLinewrap(1).before(f.getConfigurationAccess().getConfigurationKeyword_1());
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

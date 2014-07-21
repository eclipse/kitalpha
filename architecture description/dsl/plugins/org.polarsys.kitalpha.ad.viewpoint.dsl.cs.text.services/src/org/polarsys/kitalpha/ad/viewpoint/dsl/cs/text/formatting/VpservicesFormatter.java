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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpservicesGrammarAccess;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpservicesFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		VpservicesGrammarAccess f = (VpservicesGrammarAccess) getGrammarAccess();		
		//Automatic line wrap
		c.setAutoLinewrap(160);
		
		
		//Line wrap before Services
		c.setLinewrap(1).before(f.getServiceSetAccess().getServicesKeyword_1());
		//Line wrap before Service
		c.setLinewrap(1).before(f.getServiceAccess().getServiceKeyword_1());
		//Line wrap before Rules
		c.setLinewrap(1).before(f.getRuleSetAccess().getRulesKeyword_1());
		//Line wrap before Rule
		c.setLinewrap(1).before(f.getRuleAccess().getRuleKeyword_1());	
		//Line wrap before Properties
		c.setLinewrap(1).before(f.getPropertySetAccess().getPropertiesKeyword_1());
		//Line wrap before Property
		c.setLinewrap(1).before(f.getPropertyAccess().getPropertyKeyword_1());
		
		//Line wrap before services
		c.setLinewrap(1).before(f.getServiceSetAccess().getServicesKeyword_1());
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

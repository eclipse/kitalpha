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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpspecGrammarAccess;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpspecFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		VpspecGrammarAccess f = (VpspecGrammarAccess) getGrammarAccess();
		
		//Automatic line wrap
		c.setAutoLinewrap(160);
		
		c.setLinewrap(1).before(f.getViewpointAccess().getViewpointKeyword_1());
		c.setLinewrap(1).before(f.getViewpointAccess().getNameKeyword_4_0());
		c.setLinewrap(1).before(f.getViewpointAccess().getDescriptionKeyword_5_0());
		c.setLinewrap(1).before(f.getViewpointAccess().getExtendsKeyword_6_0());
		c.setLinewrap(1).before(f.getViewpointAccess().getAggregatesKeyword_7_0());
		
		c.setLinewrap(1).before(f.getViewpointAccess().getTypeBuildKeyword_12_0_0());
		c.setLinewrap(1).before(f.getViewpointAccess().getTypeConfigurationKeyword_13_0_0());
		c.setLinewrap(1).before(f.getViewpointAccess().getDataKeyword_8_0());
		c.setLinewrap(1).before(f.getViewpointAccess().getTypeDiagramsKeyword_10_0_0());
		c.setLinewrap(1).before(f.getViewpointAccess().getTypeServicesKeyword_11_0_0());
		c.setLinewrap(1).before(f.getViewpointAccess().getTypeUIKeyword_9_0_0());

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

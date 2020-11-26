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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpspecGrammarAccess;


/**
 * 
 * @author Amine Lajmi
 * 		   Faycal Abka
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
		
		c.setLinewrap(1).before(f.getViewpointAccess().getUsesViewpointKeyword_8_0());
		c.setLinewrap(1).before(f.getViewpointAccess().getUsesModelKeyword_9_0());
		c.setLinewrap(1).before(f.getViewpointAccess().getUsesDiagramKeyword_10_0());
		c.setLinewrap(1).before(f.getViewpointAccess().getUsesWorkspaceKeyword_11_0());
		c.setLinewrap(1).before(f.getViewpointAccess().getUsesFilesystemKeyword_12_0());

		c.setLinewrap(1).before(f.getViewpointAccess().getTypeBuildKeyword_18_0_0());
		c.setLinewrap(1).before(f.getViewpointAccess().getTypeConfigurationKeyword_19_0_0());
		c.setLinewrap(1).before(f.getViewpointAccess().getDataKeyword_13_0());
		c.setLinewrap(1).before(f.getViewpointAccess().getTypeDiagramsKeyword_15_0_0());
		c.setLinewrap(1).before(f.getViewpointAccess().getTypeServicesKeyword_17_0_0());
		c.setLinewrap(1).before(f.getViewpointAccess().getTypeUIKeyword_14_0_0());
		
		c.setLinewrap(1).before(f.getViewpointAccess().getUsesViewpointKeyword_8_0());
		c.setLinewrap(1).before(f.getViewpointAccess().getUsesModelKeyword_9_0());
		c.setLinewrap(1).before(f.getViewpointAccess().getUsesDiagramKeyword_10_0());
		
		for(Keyword keyword: f.findKeywords(",")) {
			c.setNoSpace().before(keyword);
		}

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

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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpbuildGrammarAccess;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpbuildFormatter extends AbstractDeclarativeFormatter {

	@Override
	protected void configureFormatting(FormattingConfig c) {
		VpbuildGrammarAccess f = (VpbuildGrammarAccess) getGrammarAccess();
		c.setAutoLinewrap(160);
		
		c.setLinewrap(1).before(f.getBuildAccess().getTargetPlatformKeyword_4());
		c.setLinewrap(1).before(f.getRepositoryAccess().getRepositoryKeyword_1());

		c.setLinewrap(1).before(f.getRepositoryAccess().getFeaturesKeyword_5_0());
		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("{", "}")) {
			c.setIndentation(pair.getFirst(), pair.getSecond());
			c.setLinewrap(1).after(pair.getFirst());
			c.setLinewrap(1).before(pair.getSecond());
			c.setLinewrap(1).after(pair.getSecond());
			c.setLinewrap(1).after(f.getSourceFoulderAccess().getRule());
			c.setLinewrap(1).after(f.getUserAccess().getRule());
		}
		
		c.setLinewrap(1).after(f.getFeatureAccess().getRule());
		
		c.setLinewrap(1).after(f.getHudsonDeploymentAccess().getHudsonDeploymentKeyword_1());
		c.setLinewrap(1).after(f.getHudsonDeploymentAccess().getUsersKeyword_10_0());
		c.setLinewrap(1).after(f.getHudsonDeploymentAccess().getAntNameSTRINGTerminalRuleCall_3_1_0());
		c.setLinewrap(1).after(f.getHudsonDeploymentAccess().getAssignedNodeSTRINGTerminalRuleCall_4_1_0());
		c.setLinewrap(1).after(f.getHudsonDeploymentAccess().getBuild_idSTRINGTerminalRuleCall_5_1_0());
		c.setLinewrap(1).after(f.getHudsonDeploymentAccess().getEnabledEBooleanParserRuleCall_6_1_0());
		c.setLinewrap(1).after(f.getHudsonDeploymentAccess().getJdkNameSTRINGTerminalRuleCall_7_1_0());
		c.setLinewrap(1).after(f.getHudsonDeploymentAccess().getUserDeployJobNameSTRINGTerminalRuleCall_8_1_0());
		c.setLinewrap(1).after(f.getHudsonDeploymentAccess().getUserDeployServerUrlSTRINGTerminalRuleCall_9_1_0());
		c.setLinewrap(1).after(f.getHudsonDeploymentAccess().getRule());
		
		
		c.setLinewrap(1).after(f.getTriggerAccess().getCronParserRuleCall_1());
		c.setLinewrap(1).after(f.getTriggerAccess().getSCMParserRuleCall_0());
		c.setLinewrap(1).after(f.getTriggerAccess().getRule());
		
		
		
		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(1, 1, 1).after(f.getML_COMMENTRule());
	}
}
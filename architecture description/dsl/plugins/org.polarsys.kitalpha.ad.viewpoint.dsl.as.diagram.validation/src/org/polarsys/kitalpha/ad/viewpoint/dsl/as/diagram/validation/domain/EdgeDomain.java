/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.validation.domain;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.validation.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Edge;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainElement;

/**
 * @author Boubekeur Zendagui
 */

public class EdgeDomain implements IAdditionalConstraint {
	
	private static final int Flag_NullDomain = 10;
	private static final int Flag_NullDomainClass = 20;
	private static final int Flag_NeitherQueryAndSourceLocator = 30;
	private static final int Flag_NeitherQueryAndTargetLocator = 31;
	private static final int Flag_BothQueryAndSourceLocator = 40;
	private static final int Flag_BothQueryAndTargetLocator = 41;

	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof Edge;
	}

	@Override
	public ValidationStatus validationRules(Object data) {
		Edge edge = (Edge) data;
		EdgeDomainAssociation domain = edge.getThe_domain();
		
		if (domain == null) {
			return ValidationStatus.getErrorStatusWithRuleFlag(Flag_NullDomain);
		}
		
		if (domain.getTarget_Locator() == null && 
				(domain.getTarget_query() == null || (
						domain.getTarget_query() != null && 
						domain.getTarget_query().trim().length() == 0))) {
			return ValidationStatus.getErrorStatusWithRuleFlag(Flag_NeitherQueryAndTargetLocator);
		}

		if (domain.getTarget_Locator() != null && 
				(domain.getTarget_query() != null && domain.getTarget_query().trim().length() > 0)) {
			return ValidationStatus.getErrorStatusWithRuleFlag(Flag_BothQueryAndTargetLocator);
		}

		if (domain instanceof EdgeDomainElement)
		{
			EdgeDomainElement eDomain = (EdgeDomainElement) domain;
			
			if (eDomain.getThe_Domain() == null) {
				return ValidationStatus.getErrorStatusWithRuleFlag(Flag_NullDomainClass);
			}
			
			if (eDomain.getSource_Locator() == null && 
					(eDomain.getSource_query() == null || (
							eDomain.getSource_query() != null && 
							eDomain.getSource_query().trim().length() == 0))) {
				return ValidationStatus.getErrorStatusWithRuleFlag(Flag_NeitherQueryAndSourceLocator);
			}

			if (eDomain.getSource_Locator() != null && 
					(eDomain.getSource_query() != null && eDomain.getSource_query().trim().length() > 0)) {
				return ValidationStatus.getErrorStatusWithRuleFlag(Flag_BothQueryAndSourceLocator);
			}
		}
		
		return ValidationStatus.Ok;
	}

	@Override
	public String getMessage(ValidationStatus status, Object object) {
		String edgeName = ((DiagramElement) object).getName();

		if (edgeName == null || edgeName.trim().length() == 0) {
			edgeName = "Edge ";
		}
		
		int flag = Integer.parseInt(status.getRuleFlag().toString());
		
		switch (flag) {
			case Flag_NullDomain:
				return Messages.bind(Messages.Validation_Domain_NullDomain , edgeName);
			case Flag_NullDomainClass:
				return Messages.bind(Messages.Validation_Domain_NullDomainClass , edgeName);				
			case Flag_BothQueryAndSourceLocator:
				return Messages.bind(Messages.Validation_Domain_Edge_BothQueryAndSourceLocator, edgeName);
			case Flag_BothQueryAndTargetLocator:
				return Messages.bind(Messages.Validation_Domain_Edge_BothQueryAndTargetLocator, edgeName);
			case Flag_NeitherQueryAndSourceLocator:
				return Messages.bind(Messages.Validation_Domain_Edge_NeitherQueryOrSourceLocator, edgeName);
			case Flag_NeitherQueryAndTargetLocator:
				return Messages.bind(Messages.Validation_Domain_Edge_NeitherQueryOrTargetLocator, edgeName);
			default:	
				return Messages.Validation_NoMessage;
		}
	}

}

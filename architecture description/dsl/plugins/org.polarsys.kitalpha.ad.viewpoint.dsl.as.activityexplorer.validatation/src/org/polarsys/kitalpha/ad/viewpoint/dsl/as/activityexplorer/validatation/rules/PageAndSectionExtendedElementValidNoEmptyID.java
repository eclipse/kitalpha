/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.validatation.rules;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.PageExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.SectionExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.validatation.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;

/**
 * @author Boubekeur Zendagui
 */
public class PageAndSectionExtendedElementValidNoEmptyID implements IAdditionalConstraint {

	public PageAndSectionExtendedElementValidNoEmptyID() {
	}

	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof PageExtension ||  object instanceof SectionExtension;
	}

	@Override
	public ValidationStatus validationRules(Object data) {
		String extendedID = null;
		if (data instanceof PageExtension)
		{
			final PageExtension pageExtension = (PageExtension) data;
			extendedID = pageExtension.getExtendedPageID();
		}
		
		if (data instanceof SectionExtension)
		{
			final SectionExtension sectionExtension = (SectionExtension) data;
			extendedID = sectionExtension.getExtendedSectionID();
		}
		
		if (null != extendedID)
		{
			if (extendedID.trim().isEmpty())
				return ValidationStatus.Error;
		}
		else
		{
			return ValidationStatus.Error;
		}
		
		return ValidationStatus.Ok;
	}

	@Override
	public String getMessage(ValidationStatus status, Object object) {
		String elementName = (object instanceof PageExtension ? "Page": "Section");
		return Messages.bind(Messages.Validation_ActivityExplorerExtension_NoProvided_ID, elementName);
	}

}

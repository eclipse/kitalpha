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

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.helper.exception.SelfContainedAspectException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.helper.extensions.*;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.PageExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.SectionExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.validatation.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;

/**
 * @author Boubekeur Zendagui
 */
public class PageAndSectionExtendedElementIDExists implements IAdditionalConstraint {

	@Override
	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint#isObjectInScope(java.lang.Object)
	 */
	public boolean isObjectInScope(Object object) {
		return object instanceof PageExtension || object instanceof SectionExtension;
	}

	@Override
	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint#validationRules(java.lang.Object)
	 */
	public ValidationStatus validationRules(Object data) {
		if (data instanceof PageExtension)
		{
			List<String> usedViewpointPagesIDs;
			try {
				usedViewpointPagesIDs = ActivityExplorerAspectHelper.getUsedViewpointPagesIDs((EObject) data);
			} catch (SelfContainedAspectException e) {
				return ValidationStatus.None;
			}
			
			final String extendedPageID = ((PageExtension) data).getExtendedPageID();
			List<String> plateformePagesIDs = ActivityExplorerExtensionPointHelper.getPlateformePagesIDs();
			List<String> viewpointPagesIDs = ActivityExplorerAspectHelper.getViewpointPagesIDs((EObject) data);
			boolean idFound = plateformePagesIDs.contains(extendedPageID) || usedViewpointPagesIDs.contains(extendedPageID) || viewpointPagesIDs.contains(extendedPageID);
			return idFound ? ValidationStatus.Ok : ValidationStatus.Error;
		}
		
		if (data instanceof SectionExtension)
		{
			List<String> usedViewpointSectionsIDs;
			try {
				usedViewpointSectionsIDs = ActivityExplorerAspectHelper.getUsedViewpointSectionsIDs((EObject) data);
			} catch (SelfContainedAspectException e) {
				return ValidationStatus.None;
			}
			
			final String extendedSectionID = ((SectionExtension) data).getExtendedSectionID();
			List<String> plateformeSectionsIDs = ActivityExplorerExtensionPointHelper.getPlateformeSectionsIDs();
			List<String> viewpointSectionsIDs = ActivityExplorerAspectHelper.getViewpointSectionsIDs((EObject) data);
			boolean idFound = plateformeSectionsIDs.contains(extendedSectionID) || usedViewpointSectionsIDs.contains(extendedSectionID) || viewpointSectionsIDs.contains(extendedSectionID);
			return  idFound ? ValidationStatus.Ok : ValidationStatus.Error;
		}
		return ValidationStatus.Ok;
	}

	@Override
	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint#getMessage(org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus, java.lang.Object)
	 */
	public String getMessage(ValidationStatus status, Object object) {
		String elementType = null;
		String extendedID = null;
		
		if (object instanceof PageExtension)
		{
			elementType = "Page";
			extendedID = ((PageExtension) object).getExtendedPageID();
		}
		if (object instanceof SectionExtension)
		{
			elementType = "Section";
			extendedID = ((SectionExtension) object).getExtendedSectionID();
		}
		
		return Messages.bind(Messages.Validation_ActivityExplorerExtension_NotExists_ID, elementType, extendedID);
	}

}

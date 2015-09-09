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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.labeling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.resource.IExternalContentSupport.IExternalContentProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.AbstractPage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.PageExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Section;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.SectionExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.helpers.ActivityExplorerAspectHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.util.ProjectUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class ActivityexplorerLabelProvider extends DefaultEObjectLabelProvider {
	
	@Inject
	IExternalContentProvider contentProvider;

	@Inject
	public ActivityexplorerLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}
	
	public String text(PageExtension element){
		String extendedPageId = element.getExtendedPageID();
		Viewpoint viewpoint = getRootContainer(element);
		
		String pageName = ActivityExplorerAspectHelper.getPageName(viewpoint, extendedPageId);
		
		if (pageName == null || pageName.isEmpty()) {
			//Try to get via extension point
			pageName = ActivityExplorerAspectHelper.getPageName(extendedPageId);
			
			if (pageName == null || pageName.isEmpty()) //Try to find in the current activity explorer
				pageName = findPageNameInCurrent(element, extendedPageId);
			
		}
		
		return "[Page Extension] " + pageName;  //$NON-NLS-1$
	}
	
	private String findPageNameInCurrent(PageExtension element, String extendedPageId){
		EObject container = EcoreUtil.getRootContainer(element);
		if (container instanceof ViewpointActivityExplorer){
			ViewpointActivityExplorer _vae = (ViewpointActivityExplorer)container;
			EList<AbstractPage> ownedPages = _vae.getOwnedPages();
			
			for (AbstractPage _p : ownedPages) {
				if ((_p instanceof Page) && ((Page)_p).getActivityExplorerItemID().equals(extendedPageId)){
					String name = ((Page)_p).getName();
					if (name == null || name.isEmpty())
						name = extendedPageId;
					return name;
				}
			}
		}
		return null;
	}

	public String text(SectionExtension element){
		String extendedSectionId = element.getExtendedSectionID();
		Viewpoint viewpoint = getRootContainer(element);
		
		String sectionName = ActivityExplorerAspectHelper.getSectionName(viewpoint, extendedSectionId);
		
		if (sectionName == null || sectionName.isEmpty()){
			sectionName = ActivityExplorerAspectHelper.getSectionName(extendedSectionId);
			
			if (sectionName == null || sectionName.isEmpty()){
				sectionName = findSectionNameInCurrent(element, extendedSectionId);
				
				if (sectionName == null || sectionName.isEmpty())
					sectionName = extendedSectionId;
			}
		}
		
		return "[Section Extension] " + sectionName; //$NON-NLS-1$
	}
	
	
	private String findSectionNameInCurrent(SectionExtension element, String extendedSectionId) {
		EObject container = EcoreUtil.getRootContainer(element);
		if (container instanceof ViewpointActivityExplorer){
			ViewpointActivityExplorer _vae = (ViewpointActivityExplorer)container;
			EList<AbstractPage> ownedPages = _vae.getOwnedPages();
			
			for (AbstractPage _p : ownedPages) {
				EList<Section> ownedSections = _p.getOwnedSections();
				for (Section section : ownedSections) {
					if (section.getActivityExplorerItemID().equals(extendedSectionId)){
						String name = section.getName();
						if (name == null || name.isEmpty())
							name = extendedSectionId;
						return name;
					}
				}
			}
		}
		return null;
	}

	private Viewpoint getRootContainer(EObject eObject){
		EObject root = ProjectUtil.getRootViewpoint(eObject, contentProvider);
		
		if (root instanceof Viewpoint)
			return (Viewpoint)root;
		
		return null;
	}
}

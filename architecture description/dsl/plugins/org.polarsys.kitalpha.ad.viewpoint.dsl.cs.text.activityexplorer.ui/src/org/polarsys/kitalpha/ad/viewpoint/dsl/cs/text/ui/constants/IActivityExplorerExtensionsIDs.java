/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.constants;

/**
 * 
 * @author Faycal Abka
 *
 */
public interface IActivityExplorerExtensionsIDs {
	
	String PAGE_PROVIDER 		= "org.eclipse.amalgam.explorer.activity.ui.pagesProvider";
	String SECTION_PROVIDER 	= "org.eclipse.amalgam.explorer.activity.ui.sectionsProvider";
	String ACTIVITY_PROVIDER 	= "org.eclipse.amalgam.explorer.activity.ui.activitiesProvider";
	
	
	int PAGE 		= 1<<1;
	int SECTION 	= 1<<2;
	int ACTIVITY 	= 1<<3;
	
}

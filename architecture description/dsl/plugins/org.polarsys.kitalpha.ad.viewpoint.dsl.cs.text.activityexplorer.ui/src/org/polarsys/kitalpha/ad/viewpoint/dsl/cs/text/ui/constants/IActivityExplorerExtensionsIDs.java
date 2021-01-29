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

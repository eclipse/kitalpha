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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.constants;

/**
 * 
 * @author Faycal Abka
 *
 */
public interface IActivityExplorerExtensionsIDs {
	
	public static final String PAGE_PROVIDER 		= "org.eclipse.amalgam.explorer.activity.ui.pagesProvider";
	public static final String SECTION_PROVIDER 	= "org.eclipse.amalgam.explorer.activity.ui.sectionsProvider";
	public static final String ACTIVITY_PROVIDER 	= "org.eclipse.amalgam.explorer.activity.ui.activitiesProvider";
	
	
	public static final int PAGE 		= 1<<1;
	public static final int SECTION 	= 1<<2;
	public static final int ACTIVITY 	= 1<<3;
	
}

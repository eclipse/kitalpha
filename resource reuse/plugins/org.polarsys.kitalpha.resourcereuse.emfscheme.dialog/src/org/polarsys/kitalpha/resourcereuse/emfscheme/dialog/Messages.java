/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.emfscheme.dialog;

import org.eclipse.osgi.util.NLS;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.resourcereuse.emfscheme.dialog.messages"; //$NON-NLS-1$
	
	public static String domainFilterLabel;
	public static String filtersPartLabel;
	public static String firstPageTittle;
	public static String firstPageDescription;
	public static String idFilterLabel;

	public static String nameFilterLabel;
	public static String resultsLabel;
	public static String tagsFilterLabel;
	public static String versionFilterLabel;
	public static String loadingOptionsButtonLabel;
	public static String loadingOptionsGroupLabel;
	
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}

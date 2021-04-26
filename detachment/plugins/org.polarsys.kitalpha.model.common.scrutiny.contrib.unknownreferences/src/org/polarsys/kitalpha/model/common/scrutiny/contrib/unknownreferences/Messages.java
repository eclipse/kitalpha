/*******************************************************************************
 * Copyright (c) 2014, 2021 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences;

import org.eclipse.osgi.util.NLS;

/**
 * @author Faycal Abka
 */
public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.messages"; //$NON-NLS-1$
	
	public static String INVALID_SIRIUS_ELT_MAPPING;

	public static String MISSING_SIRIUS_VIEWPOINT;

	public static String INVALID_SIRIUS_FILTER_DESCRIPTION;

	public static String INVALID_SIRIUS_LAYER;
	
	public static String INVALID_SIRIUS_DIAGRAM;

	public static String MISSING_ECORE_PACKAGE;

	public static String INVALID_DTABLE_DESC;

	
	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
	
	private Messages() {
	}
}

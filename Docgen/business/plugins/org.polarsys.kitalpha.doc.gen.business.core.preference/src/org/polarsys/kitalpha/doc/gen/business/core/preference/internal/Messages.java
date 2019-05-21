/*******************************************************************************
 * Copyright (c) 2014-2019 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.doc.gen.business.core.preference.internal;

import org.eclipse.osgi.util.NLS;
import org.polarsys.kitalpha.doc.gen.business.core.preference.Activator;

/**
 * @author Boubekeur Zendagui
 */

public class Messages {

	public static String DOCGEN_BRANDING_COPYRIGHT_FIELD_LABEL;
	
	public static String DOCGEN_BRANDING_LOGO_GROUP_TEXT;
	public static String DOCGEN_BRANDING_LOGO_USE_DEFAULT_FIELD_LABEL;
	public static String DOCGEN_BRANDING_LOGO_FIELD_LABEL;
	public static String DOCGEN_BRANDING_LOGO_ALT_FIELD_LABEL;
	
	public static String DOCGEN_DIAGRAM_EXPORT_FIELD_LABEL;
	public static String DOCGEN_DIAGRAMS_IMAGE_FORMAT_FIELD_LABEL;
	
	
	private static final String BUNDLE_PACKAGE = Activator.PLUGIN_ID + ".internal"; //$NON-NLS-1$
	private static final String BUNDLE_FILENAME = "Messages"; //$NON-NLS-1$
	private static final String BUNDLE_NAME = BUNDLE_PACKAGE + "." + BUNDLE_FILENAME; //$NON-NLS-1$

	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
}

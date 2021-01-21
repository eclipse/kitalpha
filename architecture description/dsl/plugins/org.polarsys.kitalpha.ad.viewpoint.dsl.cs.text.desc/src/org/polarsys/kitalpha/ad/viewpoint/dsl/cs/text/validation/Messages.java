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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.validation;

import org.eclipse.osgi.util.NLS;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.validation.messages"; //$NON-NLS-1$
	public static String VpspecJavaValidator_TypeMismatch;
	public static String VpspecJavaValidator_ForbiddenSelfDependency;
	public static String VpspecJavaValidator_ForbiddenSelfInheritance;
	public static String VpspecJavaValidator_NotExistingModel;
	public static String VpspecJavaValidator_NotExistingDiagramModel;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}

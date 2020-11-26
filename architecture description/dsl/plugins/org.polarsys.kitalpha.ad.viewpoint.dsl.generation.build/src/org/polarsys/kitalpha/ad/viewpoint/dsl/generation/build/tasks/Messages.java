/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.tasks;

import org.eclipse.osgi.util.NLS;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.tasks.messages"; //$NON-NLS-1$
	public static String GeneratorError_BuildModelNotFound;
	public static String GeneratorError_ExecutionEnvironmentNotFound;
	public static String GeneratorError_ProjectNameNotFound;
	public static String GeneratorError_RelengPluginNotFound;
	public static String GeneratorError_RepositoryLocationNotFound;
	public static String GeneratorError_RepositoryProtocolNotFound;
	public static String GeneratorError_TargetPlatformNotFound;
	public static String GeneratorError_UnboundGenerator;
	public static String GeneratorError_ViewpointShortNameNotFound;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}

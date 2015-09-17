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

package org.polarsys.kitalpha.ad.af.dsl.services.cs.text.generators.messages;

import org.eclipse.osgi.util.NLS;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.ad.af.dsl.services.cs.text.generators.messages.messages"; //$NON-NLS-1$
	public static String AFDSLActions_BackwardSynchronizer_GeneratorMessage;
	public static String AFDSLActions_BackwardSynchronizer_UnresolvedProxy;
	public static String AFDSLActions_BackwardSynchronizer_SerializationException;
	public static String AFDSLActions_BackwardSynchronizer_Success;
	public static String AFDSLActions_BackwardSynchronizer_MessageDialogTitle;
	public static String AFDSLActions_GenerateAFAction_DefaultTitle;
	public static String AFDSLActions_DetectCycles;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}

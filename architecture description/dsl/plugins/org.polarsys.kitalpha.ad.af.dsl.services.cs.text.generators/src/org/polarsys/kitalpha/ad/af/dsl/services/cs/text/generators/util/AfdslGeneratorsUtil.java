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

package org.polarsys.kitalpha.ad.af.dsl.services.cs.text.generators.util;

import java.text.DateFormat;

import org.eclipse.emf.common.util.URI;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class AfdslGeneratorsUtil {

	
	public static final String COPYRIGHT_KITALPHA = "PolarSys";
	
	
	private AfdslGeneratorsUtil() {}
	
	public static String getCurrentUserName() {
		return System.getProperty("user.name");
	}

	public static String getCurrentDate() {
		return DateFormat.getDateInstance().format(new java.util.Date());
	}
	
	/**
	 * Copied from {@link org.polarsys.kitalpha.ad.common.utils.URIFix}
	 */
	public static class URIFix {

		public static URI createPlatformPluginURI(String path, boolean encode) {
			return createURI("platform:/plugin/", path);
		}

		public static URI createPlatformResourceURI(String path, boolean encode) {
			return createURI("platform:/resource/", path);
		}

		private static URI createURI(String prefix, String path) {
			String uri = prefix;
			if (path.startsWith("/")) {
				uri += path.substring(1);
			}
			else {
				uri += path;
			}
			return URI.createURI(uri);
		}
	}
}

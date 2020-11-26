/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
/**
 * 
 */
package org.polarsys.kitalpha.emde.genchain.utils;

import org.eclipse.emf.codegen.ecore.genmodel.GenRuntimeVersion;
import org.osgi.framework.Version;

/**
 * @author Thomas Guiu
 * 
 */
public class GenRuntimeVersionHelper {
	public static GenRuntimeVersion getVersion(Version version) {
		String versionStr =version.getMajor()+"."+version.getMinor(); 
		GenRuntimeVersion genmodelVersion = GenRuntimeVersion.get(versionStr);
		if (genmodelVersion == null) {
			throw new IllegalStateException("unexpected version for org.eclipse.emf.codegen bundle: " + version);
		}
		return genmodelVersion;
	}
}

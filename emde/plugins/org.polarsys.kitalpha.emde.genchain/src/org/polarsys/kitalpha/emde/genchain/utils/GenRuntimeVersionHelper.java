/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
		if (genmodelVersion == null)
			throw new IllegalStateException("unexpected version for org.eclipse.emf.codegen bundle: " + version);
		return genmodelVersion;
	}
}

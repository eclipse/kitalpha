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
		GenRuntimeVersion genmodelVersion = null;

		if (version.getQualifier().startsWith("2_3"))
			genmodelVersion = GenRuntimeVersion.get("2.3");
		if (version.getQualifier().startsWith("2_5"))
			genmodelVersion = GenRuntimeVersion.get("2.5");
		if (version.getQualifier().startsWith("2_6"))
			genmodelVersion = GenRuntimeVersion.get("2.6");
		if (version.getQualifier().startsWith("2_7"))
			genmodelVersion = GenRuntimeVersion.get("2.7");
		if (version.getQualifier().startsWith("2_8"))
			genmodelVersion = GenRuntimeVersion.get("2.8");
		if (version.getQualifier().startsWith("2_9"))
			genmodelVersion = GenRuntimeVersion.get("2.9");
		if (version.getQualifier().startsWith("2_10"))
			genmodelVersion = GenRuntimeVersion.get("2.10");
		if (version.getQualifier().startsWith("2_11"))
			genmodelVersion = GenRuntimeVersion.get("2.11");
		if (version.getQualifier().startsWith("2_12"))
			genmodelVersion = GenRuntimeVersion.get("2.12");
		if (version.getQualifier().startsWith("2_13"))
			genmodelVersion = GenRuntimeVersion.get("2.13");
		if (genmodelVersion == null)
			throw new IllegalStateException("unexpected version for org.eclipse.egf.emf.pattern bundle: " + version);

		return genmodelVersion;
	}
}

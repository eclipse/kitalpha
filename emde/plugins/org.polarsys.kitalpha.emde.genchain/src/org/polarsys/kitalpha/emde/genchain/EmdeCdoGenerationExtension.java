/*******************************************************************************
 * Copyright (c) 2018, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.genchain;

import java.util.Arrays;
import java.util.List;

import org.eclipse.egf.portfolio.genchain.cdo.CdoGenerationExtension;
import org.eclipse.egf.portfolio.genchain.cdo.cdoExtension.CdoGeneration;
import org.eclipse.emf.common.util.URI;
import org.polarsys.kitalpha.emde.genchain.extension.model.ExtensionFactory;

/**
 * @author Thomas Guiu
 * 
 */
public class EmdeCdoGenerationExtension extends CdoGenerationExtension {
	private static final URI PATTERN_CDO = URI.createURI("platform:/plugin/org.polarsys.kitalpha.emde.genchain/egf/EmdeExtension.fcore#_FOy4sD8DEei6SZWv3x0qPg", false);
	private static final List<String> CONFLICT_LIST = Arrays.asList(new String[] { "cdo.generation" });

	public List<String> getConflictingExtensions() {
		return CONFLICT_LIST;
	}


	@Override
	public String getLabel() {
		return "Kitalpha CDO Emf Generation";
	}


	@Override
	protected CdoGeneration doCreateEcoreElement() {
		return ExtensionFactory.eINSTANCE.createEmdeCdoGeneration();
	}


	@Override
	protected URI getCdoPattern() {
		return PATTERN_CDO;
	}

}

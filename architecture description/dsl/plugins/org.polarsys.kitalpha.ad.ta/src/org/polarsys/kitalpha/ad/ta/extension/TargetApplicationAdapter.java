/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.ta.extension;

import java.util.List;

import org.eclipse.egf.portfolio.genchain.extension.ExtensionHelper;
import org.eclipse.emf.ecore.EClass;

/**
 * @author Boubekeur Zendagui
 */

public class TargetApplicationAdapter implements ITargetApplication {

	@Override
	public ITargetApplication getInstance() {
		return null;
	}

	@Override
	public List<EClass> getBasicSemanticElement() {
		return null;
	}

	@Override
	public List<ExtensionHelper> getGenerationExtensionHelpers() {
		return null;
	}

}

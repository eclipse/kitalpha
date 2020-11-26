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
 ******************************************************************************/
package org.polarsys.kitalpha.egf.genchain.diagram.javaaction;

import java.util.Collection;
import java.util.Map;

import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChain;
import org.eclipse.egf.portfolio.genchain.tools.ui.actions.BuildApplicationHelper;
import org.eclipse.emf.ecore.EObject;

/**
 * @author Thomas Guiu, Boubekeur Zendagui
 * 
 */
public class BuildAction extends AbstractExternalJavaAction {

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		final Object o = selections.iterator().next();
		if (o instanceof GenerationChain) 
		{
			final GenerationChain gc = (GenerationChain) o;
			BuildApplicationHelper.INSTANCE.build(gc.eResource().getURI());
		}
	}

}

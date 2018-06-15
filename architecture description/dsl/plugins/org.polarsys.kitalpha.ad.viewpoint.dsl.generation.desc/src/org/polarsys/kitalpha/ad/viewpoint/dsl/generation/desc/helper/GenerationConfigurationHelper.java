/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.helper;

import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.helper.AirdGenerationConfigurationHelper;

/**
 * Boubekeur Zendagui
 */
public class GenerationConfigurationHelper {

	public static boolean canGegenrate(EMFDomain domain){
		final EList<Object> content = domain.getContent();
		if (content != null && ! content.isEmpty())
		{
			EObject rootEObject = (EObject) domain.getContent().get(0);
			return AirdGenerationConfigurationHelper.generate(rootEObject);
		}
		return false;
	}
}

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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.module;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.BackwardSynchronizer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.IViewpointBackwardSynchronizer;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class GeneratorsModule extends AbstractGenericResourceRuntimeModule {
	
	@Override
	protected String getLanguageName() {
		return "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpspec";
	}

	@Override
	protected String getFileExtensions() {
		return "vptext";
	}
	
	public Class<? extends IViewpointBackwardSynchronizer> bindIGenerator() {
		return BackwardSynchronizer.class;
	}
}

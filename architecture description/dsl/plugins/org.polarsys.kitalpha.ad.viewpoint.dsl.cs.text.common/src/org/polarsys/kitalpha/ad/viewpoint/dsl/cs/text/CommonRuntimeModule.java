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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.CommonGenerator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.IViewpointSynchronizer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.CommonValueConverter;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class CommonRuntimeModule extends org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.AbstractCommonRuntimeModule {

	public Class<? extends IViewpointSynchronizer> bindIViewpointSynchronizer() {
		return CommonGenerator.class;
	}
	
	@Override
	public Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
		return CommonValueConverter.class;
	}
}

/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.module;

import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.templates.GenBuildDocumentation;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class BuildDocGeneratorModule extends AbstractGenericResourceRuntimeModule {
	
	public static final String ORG_POLARSYS_KITALPHA_AD_VIEWPOINT_DSL_XTEXT_VPDSL = "org.polarsys.kitalpha.ad.viewpoint.dsl.xtext.Vpdsl";
	public static final String ORG_POLARSYS_KITALPHA_AD_VIEWPOINT_DSL_XTEXT_VPDSL_EXTENSION = "vptext";

	@Override
	protected String getLanguageName() {
		return ORG_POLARSYS_KITALPHA_AD_VIEWPOINT_DSL_XTEXT_VPDSL;
	}

	@Override
	protected String getFileExtensions() {
		return ORG_POLARSYS_KITALPHA_AD_VIEWPOINT_DSL_XTEXT_VPDSL_EXTENSION;
	}
	
	public Class<? extends IGenerator> bindIGenerator() {
		return GenBuildDocumentation.class;
	}
}

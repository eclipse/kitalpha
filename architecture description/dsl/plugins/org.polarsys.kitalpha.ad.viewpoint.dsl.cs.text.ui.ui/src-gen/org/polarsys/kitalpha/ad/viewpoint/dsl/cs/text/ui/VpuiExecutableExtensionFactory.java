/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.internal.VpuiActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class VpuiExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return VpuiActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return VpuiActivator.getInstance().getInjector(VpuiActivator.ORG_POLARSYS_KITALPHA_AD_VIEWPOINT_DSL_CS_TEXT_VPUI);
	}
	
}

/*******************************************************************************
 * Copyright (c) 2015, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.af.dsl.cs.text.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.polarsys.kitalpha.ad.af.dsl.cs.text.ui.internal.AfdescActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AfdescExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return AfdescActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return AfdescActivator.getInstance().getInjector(AfdescActivator.ORG_POLARSYS_KITALPHA_AD_AF_DSL_CS_TEXT_AFDESC);
	}
	
}

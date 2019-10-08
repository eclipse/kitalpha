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
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.provider.customizations;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.provider.HudsonDeploymentItemProvider;

/**
 * 
 * @author Faycal Abka
 *
 */
public class HudsonDeploymentItemProviderCustom extends
		HudsonDeploymentItemProvider {

	public HudsonDeploymentItemProviderCustom(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	public String getText(Object object) {
		return getString("_UI_HudsonDeployment_type"); //$NON-NLS-1$
	}

}

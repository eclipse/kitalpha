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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.provider.customizations;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Feature;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.provider.FeatureItemProvider;

/**
 * 
 * @author Faycal Abka
 *
 */
public class FeatureItemProviderCustom extends FeatureItemProvider{

	public FeatureItemProviderCustom(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	public String getText(Object object) {

		String label = ((Feature) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Feature_type") : //$NON-NLS-1$
				getString("_UI_Feature_type") + ": " + label; //$NON-NLS-1$ //$NON-NLS-2$

	}
	
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/feature.png")); //$NON-NLS-1$
	}
	
}

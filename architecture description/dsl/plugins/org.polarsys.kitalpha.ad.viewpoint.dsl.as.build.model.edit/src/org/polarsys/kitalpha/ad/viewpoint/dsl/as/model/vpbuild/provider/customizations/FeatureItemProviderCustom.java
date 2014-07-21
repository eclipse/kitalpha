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
	
}

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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.SourceFolder;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.provider.SourceFolderItemProvider;

/**
 * 
 * @author Faycal Abka
 *
 */
public class SourceFolderItemProviderCustom extends SourceFolderItemProvider {

	public SourceFolderItemProviderCustom(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	public String getText(Object object) {
		String label = ((SourceFolder) object).getName();
		return "Folder: " + label;
	}
}

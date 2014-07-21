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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.ProtocolType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Repository;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.provider.RepositoryItemProvider;

/**
 * 
 * @author Faycal Abka
 *
 */
public class RepositoryItemProviderCustom extends RepositoryItemProvider {

	public RepositoryItemProviderCustom(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	public String getText(Object object) {
		StringBuffer buf = new StringBuffer();
		
		
		ProtocolType labelValue = ((Repository) object).getProtocol();
		String label = labelValue == null ? null : labelValue.toString();

		String url = ((Repository)object).getLocation();
		
		buf.append("Repository: ");
		if (label == null)
			buf.append("Unknown Protocol");
		if (label.equals("svnssh"))
			buf.append("svn+ssh://");
		if (label.equals("svn"))
			buf.append("svn://");
		
		if (url == null)
			buf.append("Unknown repository");
		
		buf.append(url);
		return buf.toString();
	}

}

/*******************************************************************************
 * Copyright (c) 2014-2016 Thales Global Services S.A.S.
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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.ProtocolType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Repository;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.provider.RepositoryItemProvider;

/**
 * 
 * @author Faycal Abka, Boubekeur Zendagui
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
		{
			buf.append("[Unknown Protocol] ");
		}
		else
		{
			if (label.equals("svnssh"))
				buf.append("[svn+ssh] ");
			if (label.equals("svn"))
				buf.append("[svn] ");
		}
		
		
		if (url == null)
			buf.append("Unknown repository");
		else
			buf.append(url);
		
		return buf.toString();
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/repo.png")); //$NON-NLS-1$
	}
}

/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.handlers.workspace;

import java.util.List;

import org.osgi.framework.Version;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IMiscHandler;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ResourceManager;

/**
 * @author Thomas Guiu
 * 
 */
public class MiscHandler extends WorkspaceManager.ElementHandler implements IMiscHandler {

	public MiscHandler(Viewpoint viewpoint, ResourceManager wsManager) {
		super(viewpoint, wsManager);
	}

	@Override
	public List<ViewpointElement> getElements() {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<ViewpointElement> getElementsFromParents() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeParents(List<Viewpoint> vps) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addParents(List<Viewpoint> vps) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isAbstract() {
		return getViewpoint().isAbstract();
	}

	@Override
	public void setAbstract(boolean value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getDescription() {
		return getViewpoint().getDescription();
	}

	@Override
	public void setDescription(String txt) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getName() {
		return getViewpoint().getName();
	}

	@Override
	public void setName(String txt) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getVersion() {
		Version version = getViewpoint().getVersion();
		return version == null ? null : version.toString();
	}

	@Override
	public void setVersion(String txt) {
		throw new UnsupportedOperationException();
	}

}

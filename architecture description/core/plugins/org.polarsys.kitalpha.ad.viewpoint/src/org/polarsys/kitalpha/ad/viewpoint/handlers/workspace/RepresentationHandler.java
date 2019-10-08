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

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Representation;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RepresentationElement;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IRepresentationHandler;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ResourceManager;

/**
 * @author Thomas Guiu
 * 
 */
public class RepresentationHandler extends WorkspaceManager.ElementHandler implements IRepresentationHandler {

	public RepresentationHandler(Viewpoint viewpoint, ResourceManager wsManager) {
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
	public void removeRepresentations(List<RepresentationElement> elts) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addRepresentations(List<RepresentationElement> elts) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Representation getRepresentation() {
		return getViewpoint().getRepresentation();
	}

}

/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.handlers.runtime;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Representation;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RepresentationElement;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IRepresentationHandler;

/**
 * 
 * @author Thomas Guiu
 * 
 */
public class ViewpointRepresentationMetamodelHandler extends ViewpointManager.ElementHandler implements IRepresentationHandler {

	public ViewpointRepresentationMetamodelHandler(Viewpoint viewpoint, ViewpointManager mgr) {
		super(viewpoint, mgr);
	}

	@Override
	public void removeRepresentations(List<RepresentationElement> elts) {
		if (getResourceManager().isReadOnly()){
			throw new IllegalStateException();
		}

		EList<RepresentationElement> models = getViewpoint().getRepresentation().getRepresentations();
		models.removeAll(elts);
		saveModel();
	}

	@Override
	public void addRepresentations(List<RepresentationElement> elts) {
		if (getResourceManager().isReadOnly()){
			throw new IllegalStateException();
		}

		getViewpoint().getRepresentation().getRepresentations().addAll(elts);
		saveModel();
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
	public Representation getRepresentation() {
		return getViewpoint().getRepresentation();
	}

}

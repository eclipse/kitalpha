/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
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

import org.eclipse.emf.ecore.EPackage;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Metamodel;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IMetamodelHandler;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ResourceManager;

/**
 * @author Thomas Guiu
 * 
 */
public class MetamodelHandler extends WorkspaceManager.ElementHandler implements IMetamodelHandler {

	public MetamodelHandler(Viewpoint viewpoint, ResourceManager wsManager) {
		super(viewpoint, wsManager);
	}

	public List<ViewpointElement> getElements() {
		throw new UnsupportedOperationException();
	}

	public List<ViewpointElement> getElementsFromParents() {
		throw new UnsupportedOperationException();
	}

	public void removeMetamodels(List<EPackage> packages) {
		throw new UnsupportedOperationException();

	}

	public void addMetamodels(List<EPackage> packages) {
		throw new UnsupportedOperationException();

	}

	public Metamodel getMetamodel() {
		return getViewpoint().getMetamodel();
	}

}

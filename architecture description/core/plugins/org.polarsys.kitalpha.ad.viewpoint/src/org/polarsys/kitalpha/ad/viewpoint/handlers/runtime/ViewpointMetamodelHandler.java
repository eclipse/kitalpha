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

package org.polarsys.kitalpha.ad.viewpoint.handlers.runtime;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Metamodel;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IMetamodelHandler;

/**
 * 
 * @author Thomas Guiu
 * 
 */
public class ViewpointMetamodelHandler extends ViewpointManager.ElementHandler implements IMetamodelHandler {

	public ViewpointMetamodelHandler(Viewpoint viewpoint, ViewpointManager mgr) {
		super(viewpoint, mgr);
	}

	public void removeMetamodels(List<EPackage> packages) {
		if (getResourceManager().isReadOnly()) {
			throw new IllegalStateException();
		}

		Metamodel metamodel = getMetamodel();
		if (metamodel == null) {
			return;
		}
		EList<EPackage> models = metamodel.getModels();
		models.removeAll(packages);
		saveModel();
	}

	public void addMetamodels(List<EPackage> packages) {
		if (getResourceManager().isReadOnly()){
			throw new IllegalStateException();
		}

		Metamodel metamodel = getMetamodel();
		if (metamodel == null) {
			return;
		}
		metamodel.getModels().addAll(packages);
		saveModel();
	}

	public List<ViewpointElement> getElements() {
		throw new UnsupportedOperationException();
	}

	public List<ViewpointElement> getElementsFromParents() {
		throw new UnsupportedOperationException();
	}

	public Metamodel getMetamodel() {
		return getViewpoint().getMetamodel();
	}

}

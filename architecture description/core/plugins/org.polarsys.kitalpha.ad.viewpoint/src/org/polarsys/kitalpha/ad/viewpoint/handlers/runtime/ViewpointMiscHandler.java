/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
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
import org.eclipse.emf.ecore.EPackage;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IMiscHandler;

/**
 * 
 * @author Thomas Guiu
 * 
 */
public class ViewpointMiscHandler extends ViewpointManager.ElementHandler implements IMiscHandler {

	public ViewpointMiscHandler(Viewpoint viewpoint, ViewpointManager mgr) {
		super(viewpoint, mgr);
	}

	public void removeMetamodels(List<EPackage> packages) {
		if (getResourceManager().isReadOnly()){
			throw new IllegalStateException();
		}

		EList<EPackage> models = getViewpoint().getMetamodel().getModels();
		models.removeAll(packages);
		saveModel();
	}

	public void addMetamodels(List<EPackage> packages) {
		if (getResourceManager().isReadOnly()){
			throw new IllegalStateException();
		}

		getViewpoint().getMetamodel().getModels().addAll(packages);
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
	public void removeParents(List<Viewpoint> vps) {
		if (getResourceManager().isReadOnly()){
			throw new IllegalStateException();
		}
		if (getViewpoint().getParents().removeAll(vps)){
			saveModel();
		}
	}

	@Override
	public void addParents(List<Viewpoint> vps) {
		if (getResourceManager().isReadOnly()){
			throw new IllegalStateException();
		}
		if (getViewpoint().getParents().addAll(vps)){
			saveModel();
		}
	}

	@Override
	public boolean isAbstract() {
		return getViewpoint().isAbstract();
	}

	@Override
	public void setAbstract(boolean value) {
		if (getResourceManager().isReadOnly()){
			throw new IllegalStateException();
		}

		if (value == isAbstract()){
			return;
		}

		getViewpoint().setAbstract(value);
		saveModel();
	}

	@Override
	public String getName() {
		return getViewpoint().getName();
	}

	@Override
	public void setName(String txt) {
		if (getResourceManager().isReadOnly()){
			throw new IllegalStateException();
		}

		if ("".equals(txt) && getName() == null){
			return;
		}
		if (txt.equals(getName())){
			return;
		}
		getViewpoint().setName(txt);
		saveModel();
	}

	@Override
	public String getDescription() {
		return getViewpoint().getDescription();
	}

	@Override
	public void setDescription(String txt) {
		if (getResourceManager().isReadOnly()){
			throw new IllegalStateException();
		}
		if ("".equals(txt) && getDescription() == null){
			return;
		}
		if (txt.equals(getDescription())){
			return;
		}
		getViewpoint().setDescription(txt);
		saveModel();
	}

	@Override
	public String getVersion() {
		Version version = getViewpoint().getVersion();
		if (version == null){
			return null;
		}
		return version.toString();
	}

	@Override
	public void setVersion(String txt) {
		if (getResourceManager().isReadOnly()){
			throw new IllegalStateException();
		}

		String versionStr = getVersion();
		if ("".equals(txt) && versionStr == null){
			return;
		}
		if (txt.equals(versionStr)){
			return;
		}
		getViewpoint().setVersion(new Version(txt));
		saveModel();
	}
}

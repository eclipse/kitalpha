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
package org.polarsys.kitalpha.ad.viewpoint.ui.wizard;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Metamodel;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Representation;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointFactory;

/**
 * 
 * @author Thomas Guiu
 * 
 */
public class NewViewpointProjectWizard extends AbstractViewpointProjectWizard {
	protected NewViewpointProjectPage page;

	public NewViewpointProjectWizard() {
		this(new AFProjectHelper());
	}

	protected NewViewpointProjectWizard(AFProjectHelper projectHelper) {
		super(projectHelper);
		setNeedsProgressMonitor(true);
	}

	@Override
	public void addPages() {
		page = new NewViewpointProjectPage(selection);
		addPage(page);

	}

	@Override
	protected String getViewpointId() {
		return page.getViewpointId();
	}

	@Override
	protected String getViewpointShortName() {
		return page.getViewpointShortName();
	}

	@Override
	protected String getViewpointName() {
		return page.getViewpointName();
	}

	@Override
	protected String getProjectName() {
		return page.getProjectName();
	}

	@Override
	protected Viewpoint createModel(String vpName, String viewpointShortName) throws CoreException {

		Viewpoint vp = ViewpointFactory.eINSTANCE.createViewpoint();
		vp.setId(viewpointShortName);
		vp.setName(vpName);
		vp.setVpid(EcoreUtil.generateUUID());
		Metamodel mm = ViewpointFactory.eINSTANCE.createMetamodel();
		vp.setMetamodel(mm);
		Representation representation = ViewpointFactory.eINSTANCE.createRepresentation();
		vp.setRepresentation(representation);
		return vp;
	}
}
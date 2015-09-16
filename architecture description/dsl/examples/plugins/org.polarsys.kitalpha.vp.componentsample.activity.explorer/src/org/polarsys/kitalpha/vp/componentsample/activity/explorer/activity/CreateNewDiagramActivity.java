/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.vp.componentsample.activity.explorer.activity;

import org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter.AbstractNewDiagramHyperlinkAdapter;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;

/**
 * 
 * @author Faycal Abka
 *
 */
public class CreateNewDiagramActivity extends
		AbstractNewDiagramHyperlinkAdapter {

	public CreateNewDiagramActivity() {
		super(ActivityExplorerManager.INSTANCE.getRootSemanticModel());
	}


	@Override
	public String getRepresentationName() {
		return "ComponentSampleDiagram";
	}
}

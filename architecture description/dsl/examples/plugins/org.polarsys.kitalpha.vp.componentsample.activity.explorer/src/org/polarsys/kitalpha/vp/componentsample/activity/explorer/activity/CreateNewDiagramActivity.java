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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.forms.events.HyperlinkEvent;

/**
 * 
 * @author Faycal Abka
 *
 */
public class CreateNewDiagramActivity extends AbstractNewDiagramHyperlinkAdapter {

	public CreateNewDiagramActivity() {
		super(ActivityExplorerManager.INSTANCE.getRootSemanticModel());
	}

	/**
	* Constructor with parameters
	* @param root the root model element ({@link EObject})
	* @param session the associated {@link Session} with the activity explorer
	*/
	public CreateNewDiagramActivity(EObject root, Session session) {
		super(root);
	}

	/**
	* Constructor with parameters
	* @param root the root model element ({@link EObject})
	* @param session the associated {@link Session} with the activity explorer
	*/
	public CreateNewDiagramActivity(EObject root) {
		super(root);
	}

	@Override
	protected void linkPressed(HyperlinkEvent event, EObject project_p, Session session) {
		super.linkPressed(event, project_p, session);
	}

	@Override
	public String getRepresentationName() {
		return "ComponentSampleDiagram";
	}
}

/*******************************************************************************
 * Copyright (c) 2018, 2020 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.editor.ext.session.manager;

import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.polarsys.kitalpha.richtext.widget.helper.MDERichtextWidgetHelper;

/**
 * 
 * @author Faycal Abka
 *
 */
public class CloseEditionSessionManagerListener extends SessionManagerListener.Stub {

	public CloseEditionSessionManagerListener() {
		// Do nothing
	}

	@Override
	public void notify(Session session, int event) {
		if (event == SessionListener.CLOSED) {
			MDERichtextWidgetHelper.closeEditors(session.getTransactionalEditingDomain());
		}
	}

}

/*******************************************************************************
 * Copyright (c) 2018, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
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

/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.shared.session;

import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.massactions.shared.view.MAView;

/**
 * A listener that detects when a session is closed, and clears the content for all mass action views linked to that
 * closing session.
 * 
 * @author Sandu Postaru
 *
 */
public class ClearViewOnClosedSessionListener extends SessionManagerListener.Stub {

  @Override
  public void notify(Session session, int notification) {

    if (notification == SessionListener.CLOSED) {

      IWorkbenchWindow[] workbenchWindows = PlatformUI.getWorkbench().getWorkbenchWindows();

      for (IWorkbenchWindow workbenchWindow : workbenchWindows) {
        IViewReference[] viewReferences = workbenchWindow.getActivePage().getViewReferences();

        for (IViewReference viewRef : viewReferences) {
          IViewPart view = viewRef.getView(false);

          if (view instanceof MAView) {
            MAView maView = (MAView) view;

            if (maView.belongsToSession(session)) {
              maView.clearView();
            }
          }
        }
      }
    }
  }
}
